package com.bumptech.glide.load.resource.bitmap;

import android.util.Log;
import com.bumptech.glide.load.ImageHeaderParser;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.charset.Charset;
import p089g4.C6223k;
import p205p3.C7674b;

public final class DefaultImageHeaderParser implements ImageHeaderParser {

    /* renamed from: a */
    static final byte[] f7899a = "Exif\u0000\u0000".getBytes(Charset.forName("UTF-8"));

    /* renamed from: b */
    private static final int[] f7900b = {0, 1, 1, 2, 4, 8, 1, 1, 2, 4, 8, 4, 8};

    private interface Reader {

        public static final class EndOfFileException extends IOException {
            private static final long serialVersionUID = 1;

            EndOfFileException() {
                super("Unexpectedly reached end of a file");
            }
        }

        /* renamed from: a */
        int mo7963a();

        /* renamed from: b */
        int mo7964b(byte[] bArr, int i);

        /* renamed from: c */
        short mo7965c();

        long skip(long j);
    }

    /* renamed from: com.bumptech.glide.load.resource.bitmap.DefaultImageHeaderParser$a */
    private static final class C2485a implements Reader {

        /* renamed from: a */
        private final ByteBuffer f7901a;

        C2485a(ByteBuffer byteBuffer) {
            this.f7901a = byteBuffer;
            byteBuffer.order(ByteOrder.BIG_ENDIAN);
        }

        /* renamed from: a */
        public int mo7963a() {
            return (mo7965c() << 8) | mo7965c();
        }

        /* renamed from: b */
        public int mo7964b(byte[] bArr, int i) {
            int min = Math.min(i, this.f7901a.remaining());
            if (min == 0) {
                return -1;
            }
            this.f7901a.get(bArr, 0, min);
            return min;
        }

        /* renamed from: c */
        public short mo7965c() {
            if (this.f7901a.remaining() >= 1) {
                return (short) (this.f7901a.get() & 255);
            }
            throw new Reader.EndOfFileException();
        }

        public long skip(long j) {
            int min = (int) Math.min((long) this.f7901a.remaining(), j);
            ByteBuffer byteBuffer = this.f7901a;
            byteBuffer.position(byteBuffer.position() + min);
            return (long) min;
        }
    }

    /* renamed from: com.bumptech.glide.load.resource.bitmap.DefaultImageHeaderParser$b */
    private static final class C2486b {

        /* renamed from: a */
        private final ByteBuffer f7902a;

        C2486b(byte[] bArr, int i) {
            this.f7902a = (ByteBuffer) ByteBuffer.wrap(bArr).order(ByteOrder.BIG_ENDIAN).limit(i);
        }

        /* renamed from: c */
        private boolean m9622c(int i, int i2) {
            return this.f7902a.remaining() - i >= i2;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public short mo7967a(int i) {
            if (m9622c(i, 2)) {
                return this.f7902a.getShort(i);
            }
            return -1;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: b */
        public int mo7968b(int i) {
            if (m9622c(i, 4)) {
                return this.f7902a.getInt(i);
            }
            return -1;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: d */
        public int mo7969d() {
            return this.f7902a.remaining();
        }

        /* access modifiers changed from: package-private */
        /* renamed from: e */
        public void mo7970e(ByteOrder byteOrder) {
            this.f7902a.order(byteOrder);
        }
    }

    /* renamed from: com.bumptech.glide.load.resource.bitmap.DefaultImageHeaderParser$c */
    private static final class C2487c implements Reader {

        /* renamed from: a */
        private final InputStream f7903a;

        C2487c(InputStream inputStream) {
            this.f7903a = inputStream;
        }

        /* renamed from: a */
        public int mo7963a() {
            return (mo7965c() << 8) | mo7965c();
        }

        /* renamed from: b */
        public int mo7964b(byte[] bArr, int i) {
            int i2 = 0;
            int i3 = 0;
            while (i2 < i && (i3 = this.f7903a.read(bArr, i2, i - i2)) != -1) {
                i2 += i3;
            }
            if (i2 != 0 || i3 != -1) {
                return i2;
            }
            throw new Reader.EndOfFileException();
        }

        /* renamed from: c */
        public short mo7965c() {
            int read = this.f7903a.read();
            if (read != -1) {
                return (short) read;
            }
            throw new Reader.EndOfFileException();
        }

        public long skip(long j) {
            if (j < 0) {
                return 0;
            }
            long j2 = j;
            while (j2 > 0) {
                long skip = this.f7903a.skip(j2);
                if (skip <= 0) {
                    if (this.f7903a.read() == -1) {
                        break;
                    }
                    skip = 1;
                }
                j2 -= skip;
            }
            return j - j2;
        }
    }

    /* renamed from: e */
    private static int m9603e(int i, int i2) {
        return i + 2 + (i2 * 12);
    }

    /* renamed from: f */
    private int m9604f(Reader reader, C7674b bVar) {
        byte[] bArr;
        try {
            int a = reader.mo7963a();
            if (!m9606h(a)) {
                if (Log.isLoggable("DfltImageHeaderParser", 3)) {
                    Log.d("DfltImageHeaderParser", "Parser doesn't handle magic number: " + a);
                }
                return -1;
            }
            int j = m9608j(reader);
            if (j == -1) {
                if (Log.isLoggable("DfltImageHeaderParser", 3)) {
                    Log.d("DfltImageHeaderParser", "Failed to parse exif segment length, or exif segment not found");
                }
                return -1;
            }
            bArr = (byte[]) bVar.mo22387c(j, byte[].class);
            int l = m9610l(reader, bArr, j);
            bVar.mo22389e(bArr);
            return l;
        } catch (Reader.EndOfFileException unused) {
            return -1;
        } catch (Throwable th) {
            bVar.mo22389e(bArr);
            throw th;
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:19:0x003b, code lost:
        return com.bumptech.glide.load.ImageHeaderParser.ImageType.PNG;
     */
    /* JADX WARNING: Exception block dominator not found, dom blocks: [] */
    /* JADX WARNING: Missing exception handler attribute for start block: B:17:0x0039 */
    /* renamed from: g */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private com.bumptech.glide.load.ImageHeaderParser.ImageType m9605g(com.bumptech.glide.load.resource.bitmap.DefaultImageHeaderParser.Reader r6) {
        /*
            r5 = this;
            int r0 = r6.mo7963a()     // Catch:{ EndOfFileException -> 0x00a9 }
            r1 = 65496(0xffd8, float:9.178E-41)
            if (r0 != r1) goto L_0x000c
            com.bumptech.glide.load.ImageHeaderParser$ImageType r6 = com.bumptech.glide.load.ImageHeaderParser.ImageType.JPEG     // Catch:{ EndOfFileException -> 0x00a9 }
            return r6
        L_0x000c:
            int r0 = r0 << 8
            short r1 = r6.mo7965c()     // Catch:{ EndOfFileException -> 0x00a9 }
            r0 = r0 | r1
            r1 = 4671814(0x474946, float:6.546606E-39)
            if (r0 != r1) goto L_0x001b
            com.bumptech.glide.load.ImageHeaderParser$ImageType r6 = com.bumptech.glide.load.ImageHeaderParser.ImageType.GIF     // Catch:{ EndOfFileException -> 0x00a9 }
            return r6
        L_0x001b:
            int r0 = r0 << 8
            short r1 = r6.mo7965c()     // Catch:{ EndOfFileException -> 0x00a9 }
            r0 = r0 | r1
            r1 = -1991225785(0xffffffff89504e47, float:-2.5073895E-33)
            if (r0 != r1) goto L_0x003c
            r0 = 21
            r6.skip(r0)     // Catch:{ EndOfFileException -> 0x00a9 }
            short r6 = r6.mo7965c()     // Catch:{ EndOfFileException -> 0x0039 }
            r0 = 3
            if (r6 < r0) goto L_0x0036
            com.bumptech.glide.load.ImageHeaderParser$ImageType r6 = com.bumptech.glide.load.ImageHeaderParser.ImageType.PNG_A     // Catch:{ EndOfFileException -> 0x0039 }
            goto L_0x0038
        L_0x0036:
            com.bumptech.glide.load.ImageHeaderParser$ImageType r6 = com.bumptech.glide.load.ImageHeaderParser.ImageType.PNG     // Catch:{ EndOfFileException -> 0x0039 }
        L_0x0038:
            return r6
        L_0x0039:
            com.bumptech.glide.load.ImageHeaderParser$ImageType r6 = com.bumptech.glide.load.ImageHeaderParser.ImageType.PNG     // Catch:{ EndOfFileException -> 0x00a9 }
            return r6
        L_0x003c:
            r1 = 1380533830(0x52494646, float:2.16116855E11)
            if (r0 == r1) goto L_0x0046
            com.bumptech.glide.load.ImageHeaderParser$ImageType r6 = r5.m9611m(r6, r0)     // Catch:{ EndOfFileException -> 0x00a9 }
            return r6
        L_0x0046:
            r0 = 4
            r6.skip(r0)     // Catch:{ EndOfFileException -> 0x00a9 }
            int r2 = r6.mo7963a()     // Catch:{ EndOfFileException -> 0x00a9 }
            int r2 = r2 << 16
            int r3 = r6.mo7963a()     // Catch:{ EndOfFileException -> 0x00a9 }
            r2 = r2 | r3
            r3 = 1464156752(0x57454250, float:2.16888601E14)
            if (r2 == r3) goto L_0x005e
            com.bumptech.glide.load.ImageHeaderParser$ImageType r6 = com.bumptech.glide.load.ImageHeaderParser.ImageType.UNKNOWN     // Catch:{ EndOfFileException -> 0x00a9 }
            return r6
        L_0x005e:
            int r2 = r6.mo7963a()     // Catch:{ EndOfFileException -> 0x00a9 }
            int r2 = r2 << 16
            int r3 = r6.mo7963a()     // Catch:{ EndOfFileException -> 0x00a9 }
            r2 = r2 | r3
            r3 = r2 & -256(0xffffffffffffff00, float:NaN)
            r4 = 1448097792(0x56503800, float:5.7234734E13)
            if (r3 == r4) goto L_0x0073
            com.bumptech.glide.load.ImageHeaderParser$ImageType r6 = com.bumptech.glide.load.ImageHeaderParser.ImageType.UNKNOWN     // Catch:{ EndOfFileException -> 0x00a9 }
            return r6
        L_0x0073:
            r2 = r2 & 255(0xff, float:3.57E-43)
            r3 = 88
            if (r2 != r3) goto L_0x0091
            r6.skip(r0)     // Catch:{ EndOfFileException -> 0x00a9 }
            short r6 = r6.mo7965c()     // Catch:{ EndOfFileException -> 0x00a9 }
            r0 = r6 & 2
            if (r0 == 0) goto L_0x0087
            com.bumptech.glide.load.ImageHeaderParser$ImageType r6 = com.bumptech.glide.load.ImageHeaderParser.ImageType.ANIMATED_WEBP     // Catch:{ EndOfFileException -> 0x00a9 }
            return r6
        L_0x0087:
            r6 = r6 & 16
            if (r6 == 0) goto L_0x008e
            com.bumptech.glide.load.ImageHeaderParser$ImageType r6 = com.bumptech.glide.load.ImageHeaderParser.ImageType.WEBP_A     // Catch:{ EndOfFileException -> 0x00a9 }
            return r6
        L_0x008e:
            com.bumptech.glide.load.ImageHeaderParser$ImageType r6 = com.bumptech.glide.load.ImageHeaderParser.ImageType.WEBP     // Catch:{ EndOfFileException -> 0x00a9 }
            return r6
        L_0x0091:
            r3 = 76
            if (r2 != r3) goto L_0x00a6
            r6.skip(r0)     // Catch:{ EndOfFileException -> 0x00a9 }
            short r6 = r6.mo7965c()     // Catch:{ EndOfFileException -> 0x00a9 }
            r6 = r6 & 8
            if (r6 == 0) goto L_0x00a3
            com.bumptech.glide.load.ImageHeaderParser$ImageType r6 = com.bumptech.glide.load.ImageHeaderParser.ImageType.WEBP_A     // Catch:{ EndOfFileException -> 0x00a9 }
            goto L_0x00a5
        L_0x00a3:
            com.bumptech.glide.load.ImageHeaderParser$ImageType r6 = com.bumptech.glide.load.ImageHeaderParser.ImageType.WEBP     // Catch:{ EndOfFileException -> 0x00a9 }
        L_0x00a5:
            return r6
        L_0x00a6:
            com.bumptech.glide.load.ImageHeaderParser$ImageType r6 = com.bumptech.glide.load.ImageHeaderParser.ImageType.WEBP     // Catch:{ EndOfFileException -> 0x00a9 }
            return r6
        L_0x00a9:
            com.bumptech.glide.load.ImageHeaderParser$ImageType r6 = com.bumptech.glide.load.ImageHeaderParser.ImageType.UNKNOWN
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bumptech.glide.load.resource.bitmap.DefaultImageHeaderParser.m9605g(com.bumptech.glide.load.resource.bitmap.DefaultImageHeaderParser$Reader):com.bumptech.glide.load.ImageHeaderParser$ImageType");
    }

    /* renamed from: h */
    private static boolean m9606h(int i) {
        return (i & 65496) == 65496 || i == 19789 || i == 18761;
    }

    /* renamed from: i */
    private boolean m9607i(byte[] bArr, int i) {
        boolean z;
        if (bArr == null || i <= f7899a.length) {
            z = false;
        } else {
            z = true;
        }
        if (z) {
            int i2 = 0;
            while (true) {
                byte[] bArr2 = f7899a;
                if (i2 >= bArr2.length) {
                    break;
                } else if (bArr[i2] != bArr2[i2]) {
                    return false;
                } else {
                    i2++;
                }
            }
        }
        return z;
    }

    /* renamed from: j */
    private int m9608j(Reader reader) {
        short c;
        int a;
        long j;
        long skip;
        do {
            short c2 = reader.mo7965c();
            if (c2 != 255) {
                if (Log.isLoggable("DfltImageHeaderParser", 3)) {
                    Log.d("DfltImageHeaderParser", "Unknown segmentId=" + c2);
                }
                return -1;
            }
            c = reader.mo7965c();
            if (c == 218) {
                return -1;
            }
            if (c == 217) {
                if (Log.isLoggable("DfltImageHeaderParser", 3)) {
                    Log.d("DfltImageHeaderParser", "Found MARKER_EOI in exif segment");
                }
                return -1;
            }
            a = reader.mo7963a() - 2;
            if (c == 225) {
                return a;
            }
            j = (long) a;
            skip = reader.skip(j);
        } while (skip == j);
        if (Log.isLoggable("DfltImageHeaderParser", 3)) {
            Log.d("DfltImageHeaderParser", "Unable to skip enough data, type: " + c + ", wanted to skip: " + a + ", but actually skipped: " + skip);
        }
        return -1;
    }

    /* renamed from: k */
    private static int m9609k(C2486b bVar) {
        ByteOrder byteOrder;
        short a = bVar.mo7967a(6);
        if (a == 18761) {
            byteOrder = ByteOrder.LITTLE_ENDIAN;
        } else if (a != 19789) {
            if (Log.isLoggable("DfltImageHeaderParser", 3)) {
                Log.d("DfltImageHeaderParser", "Unknown endianness = " + a);
            }
            byteOrder = ByteOrder.BIG_ENDIAN;
        } else {
            byteOrder = ByteOrder.BIG_ENDIAN;
        }
        bVar.mo7970e(byteOrder);
        int b = bVar.mo7968b(10) + 6;
        short a2 = bVar.mo7967a(b);
        for (int i = 0; i < a2; i++) {
            int e = m9603e(b, i);
            short a3 = bVar.mo7967a(e);
            if (a3 == 274) {
                short a4 = bVar.mo7967a(e + 2);
                if (a4 >= 1 && a4 <= 12) {
                    int b2 = bVar.mo7968b(e + 4);
                    if (b2 >= 0) {
                        if (Log.isLoggable("DfltImageHeaderParser", 3)) {
                            Log.d("DfltImageHeaderParser", "Got tagIndex=" + i + " tagType=" + a3 + " formatCode=" + a4 + " componentCount=" + b2);
                        }
                        int i2 = b2 + f7900b[a4];
                        if (i2 <= 4) {
                            int i3 = e + 8;
                            if (i3 < 0 || i3 > bVar.mo7969d()) {
                                if (Log.isLoggable("DfltImageHeaderParser", 3)) {
                                    Log.d("DfltImageHeaderParser", "Illegal tagValueOffset=" + i3 + " tagType=" + a3);
                                }
                            } else if (i2 >= 0 && i2 + i3 <= bVar.mo7969d()) {
                                return bVar.mo7967a(i3);
                            } else {
                                if (Log.isLoggable("DfltImageHeaderParser", 3)) {
                                    Log.d("DfltImageHeaderParser", "Illegal number of bytes for TI tag data tagType=" + a3);
                                }
                            }
                        } else if (Log.isLoggable("DfltImageHeaderParser", 3)) {
                            Log.d("DfltImageHeaderParser", "Got byte count > 4, not orientation, continuing, formatCode=" + a4);
                        }
                    } else if (Log.isLoggable("DfltImageHeaderParser", 3)) {
                        Log.d("DfltImageHeaderParser", "Negative tiff component count");
                    }
                } else if (Log.isLoggable("DfltImageHeaderParser", 3)) {
                    Log.d("DfltImageHeaderParser", "Got invalid format code = " + a4);
                }
            }
        }
        return -1;
    }

    /* renamed from: l */
    private int m9610l(Reader reader, byte[] bArr, int i) {
        int b = reader.mo7964b(bArr, i);
        if (b != i) {
            if (Log.isLoggable("DfltImageHeaderParser", 3)) {
                Log.d("DfltImageHeaderParser", "Unable to read exif segment data, length: " + i + ", actually read: " + b);
            }
            return -1;
        } else if (m9607i(bArr, i)) {
            return m9609k(new C2486b(bArr, i));
        } else {
            if (Log.isLoggable("DfltImageHeaderParser", 3)) {
                Log.d("DfltImageHeaderParser", "Missing jpeg exif preamble");
            }
            return -1;
        }
    }

    /* renamed from: m */
    private ImageHeaderParser.ImageType m9611m(Reader reader, int i) {
        boolean z;
        if (((reader.mo7963a() << 16) | reader.mo7963a()) != 1718909296) {
            return ImageHeaderParser.ImageType.UNKNOWN;
        }
        int a = (reader.mo7963a() << 16) | reader.mo7963a();
        if (a == 1635150195) {
            return ImageHeaderParser.ImageType.ANIMATED_AVIF;
        }
        int i2 = 0;
        if (a == 1635150182) {
            z = true;
        } else {
            z = false;
        }
        reader.skip(4);
        int i3 = i - 16;
        if (i3 % 4 == 0) {
            while (i2 < 5 && i3 > 0) {
                int a2 = (reader.mo7963a() << 16) | reader.mo7963a();
                if (a2 == 1635150195) {
                    return ImageHeaderParser.ImageType.ANIMATED_AVIF;
                }
                if (a2 == 1635150182) {
                    z = true;
                }
                i2++;
                i3 -= 4;
            }
        }
        if (z) {
            return ImageHeaderParser.ImageType.AVIF;
        }
        return ImageHeaderParser.ImageType.UNKNOWN;
    }

    /* renamed from: a */
    public ImageHeaderParser.ImageType mo7766a(ByteBuffer byteBuffer) {
        return m9605g(new C2485a((ByteBuffer) C6223k.m24730d(byteBuffer)));
    }

    /* renamed from: b */
    public int mo7767b(InputStream inputStream, C7674b bVar) {
        return m9604f(new C2487c((InputStream) C6223k.m24730d(inputStream)), (C7674b) C6223k.m24730d(bVar));
    }

    /* renamed from: c */
    public ImageHeaderParser.ImageType mo7768c(InputStream inputStream) {
        return m9605g(new C2487c((InputStream) C6223k.m24730d(inputStream)));
    }

    /* renamed from: d */
    public int mo7769d(ByteBuffer byteBuffer, C7674b bVar) {
        return m9604f(new C2485a((ByteBuffer) C6223k.m24730d(byteBuffer)), (C7674b) C6223k.m24730d(bVar));
    }
}
