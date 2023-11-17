package androidx.exifinterface.media;

import android.content.res.AssetManager;
import android.media.MediaDataSource;
import android.system.OsConstants;
import android.util.Log;
import androidx.exifinterface.media.C1422b;
import com.salesforce.marketingcloud.C11398b;
import java.io.BufferedInputStream;
import java.io.ByteArrayInputStream;
import java.io.DataInput;
import java.io.DataInputStream;
import java.io.EOFException;
import java.io.FileDescriptor;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.charset.Charset;
import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import java.util.regex.Pattern;
import java.util.zip.CRC32;
import p341ge.bog.mobilebank.p975ui.views.widgets.BogInputLayout;
import p341ge.bog.mobilebank.p975ui.views.widgets.cropview.subscaleview.SubsamplingScaleImageView;
import p342j$.util.DesugarTimeZone;

/* renamed from: androidx.exifinterface.media.a */
public class C1415a {

    /* renamed from: A */
    static final byte[] f4019A = {-1, -40, -1};

    /* renamed from: B */
    private static final byte[] f4020B = {102, 116, 121, 112};

    /* renamed from: C */
    private static final byte[] f4021C = {109, 105, 102, 49};

    /* renamed from: D */
    private static final byte[] f4022D = {104, 101, 105, 99};

    /* renamed from: E */
    private static final byte[] f4023E = {79, 76, 89, 77, 80, 0};

    /* renamed from: F */
    private static final byte[] f4024F = {79, 76, 89, 77, 80, 85, 83, 0, 73, 73};

    /* renamed from: G */
    private static final byte[] f4025G = {-119, 80, 78, 71, 13, 10, 26, 10};

    /* renamed from: H */
    private static final byte[] f4026H = {101, 88, 73, 102};

    /* renamed from: I */
    private static final byte[] f4027I = {73, 72, 68, 82};

    /* renamed from: J */
    private static final byte[] f4028J = {73, 69, 78, 68};

    /* renamed from: K */
    private static final byte[] f4029K = {82, 73, 70, 70};

    /* renamed from: L */
    private static final byte[] f4030L = {87, 69, 66, 80};

    /* renamed from: M */
    private static final byte[] f4031M = {69, 88, 73, 70};

    /* renamed from: N */
    private static final byte[] f4032N = {-99, 1, 42};

    /* renamed from: O */
    private static final byte[] f4033O = "VP8X".getBytes(Charset.defaultCharset());

    /* renamed from: P */
    private static final byte[] f4034P = "VP8L".getBytes(Charset.defaultCharset());

    /* renamed from: Q */
    private static final byte[] f4035Q = "VP8 ".getBytes(Charset.defaultCharset());

    /* renamed from: R */
    private static final byte[] f4036R = "ANIM".getBytes(Charset.defaultCharset());

    /* renamed from: S */
    private static final byte[] f4037S = "ANMF".getBytes(Charset.defaultCharset());

    /* renamed from: T */
    private static SimpleDateFormat f4038T;

    /* renamed from: U */
    private static SimpleDateFormat f4039U;

    /* renamed from: V */
    static final String[] f4040V = {"", "BYTE", "STRING", "USHORT", "ULONG", "URATIONAL", "SBYTE", "UNDEFINED", "SSHORT", "SLONG", "SRATIONAL", "SINGLE", "DOUBLE", "IFD"};

    /* renamed from: W */
    static final int[] f4041W = {0, 1, 1, 2, 4, 8, 1, 1, 2, 4, 8, 4, 8, 1};

    /* renamed from: X */
    static final byte[] f4042X = {65, 83, 67, 73, 73, 0, 0, 0};

    /* renamed from: Y */
    private static final C1419d[] f4043Y;

    /* renamed from: Z */
    private static final C1419d[] f4044Z;

    /* renamed from: a0 */
    private static final C1419d[] f4045a0;

    /* renamed from: b0 */
    private static final C1419d[] f4046b0;

    /* renamed from: c0 */
    private static final C1419d[] f4047c0;

    /* renamed from: d0 */
    private static final C1419d f4048d0 = new C1419d("StripOffsets", 273, 3);

    /* renamed from: e0 */
    private static final C1419d[] f4049e0;

    /* renamed from: f0 */
    private static final C1419d[] f4050f0;

    /* renamed from: g0 */
    private static final C1419d[] f4051g0;

    /* renamed from: h0 */
    private static final C1419d[] f4052h0;

    /* renamed from: i0 */
    static final C1419d[][] f4053i0;

    /* renamed from: j0 */
    private static final C1419d[] f4054j0 = {new C1419d("SubIFDPointer", 330, 4), new C1419d("ExifIFDPointer", 34665, 4), new C1419d("GPSInfoIFDPointer", 34853, 4), new C1419d("InteroperabilityIFDPointer", 40965, 4), new C1419d("CameraSettingsIFDPointer", 8224, 1), new C1419d("ImageProcessingIFDPointer", 8256, 1)};

    /* renamed from: k0 */
    private static final HashMap[] f4055k0;

    /* renamed from: l0 */
    private static final HashMap[] f4056l0;

    /* renamed from: m0 */
    private static final HashSet f4057m0 = new HashSet(Arrays.asList(new String[]{"FNumber", "DigitalZoomRatio", "ExposureTime", "SubjectDistance", "GPSTimeStamp"}));

    /* renamed from: n0 */
    private static final HashMap f4058n0 = new HashMap();

    /* renamed from: o0 */
    static final Charset f4059o0;

    /* renamed from: p0 */
    static final byte[] f4060p0;

    /* renamed from: q0 */
    private static final byte[] f4061q0;

    /* renamed from: r0 */
    private static final Pattern f4062r0 = Pattern.compile(".*[1-9].*");

    /* renamed from: s0 */
    private static final Pattern f4063s0 = Pattern.compile("^(\\d{2}):(\\d{2}):(\\d{2})$");

    /* renamed from: t0 */
    private static final Pattern f4064t0 = Pattern.compile("^(\\d{4}):(\\d{2}):(\\d{2})\\s(\\d{2}):(\\d{2}):(\\d{2})$");

    /* renamed from: u */
    private static final boolean f4065u = Log.isLoggable("ExifInterface", 3);

    /* renamed from: u0 */
    private static final Pattern f4066u0 = Pattern.compile("^(\\d{4})-(\\d{2})-(\\d{2})\\s(\\d{2}):(\\d{2}):(\\d{2})$");

    /* renamed from: v */
    private static final List f4067v = Arrays.asList(new Integer[]{1, 6, 3, 8});

    /* renamed from: w */
    private static final List f4068w = Arrays.asList(new Integer[]{2, 7, 4, 5});

    /* renamed from: x */
    public static final int[] f4069x = {8, 8, 8};

    /* renamed from: y */
    public static final int[] f4070y = {4};

    /* renamed from: z */
    public static final int[] f4071z = {8};

    /* renamed from: a */
    private String f4072a;

    /* renamed from: b */
    private FileDescriptor f4073b;

    /* renamed from: c */
    private AssetManager.AssetInputStream f4074c;

    /* renamed from: d */
    private int f4075d;

    /* renamed from: e */
    private boolean f4076e;

    /* renamed from: f */
    private final HashMap[] f4077f;

    /* renamed from: g */
    private Set f4078g;

    /* renamed from: h */
    private ByteOrder f4079h;

    /* renamed from: i */
    private boolean f4080i;

    /* renamed from: j */
    private boolean f4081j;

    /* renamed from: k */
    private boolean f4082k;

    /* renamed from: l */
    private int f4083l;

    /* renamed from: m */
    private int f4084m;

    /* renamed from: n */
    private byte[] f4085n;

    /* renamed from: o */
    private int f4086o;

    /* renamed from: p */
    private int f4087p;

    /* renamed from: q */
    private int f4088q;

    /* renamed from: r */
    private int f4089r;

    /* renamed from: s */
    private int f4090s;

    /* renamed from: t */
    private boolean f4091t;

    /* renamed from: androidx.exifinterface.media.a$a */
    class C1416a extends MediaDataSource {

        /* renamed from: d */
        long f4092d;

        /* renamed from: e */
        final /* synthetic */ C1421f f4093e;

        C1416a(C1421f fVar) {
            this.f4093e = fVar;
        }

        public void close() {
        }

        public long getSize() {
            return -1;
        }

        public int readAt(long j, byte[] bArr, int i, int i2) {
            if (i2 == 0) {
                return 0;
            }
            if (j < 0) {
                return -1;
            }
            try {
                long j2 = this.f4092d;
                if (j2 != j) {
                    if (j2 >= 0 && j >= j2 + ((long) this.f4093e.available())) {
                        return -1;
                    }
                    this.f4093e.mo4132o(j);
                    this.f4092d = j;
                }
                if (i2 > this.f4093e.available()) {
                    i2 = this.f4093e.available();
                }
                int read = this.f4093e.read(bArr, i, i2);
                if (read >= 0) {
                    this.f4092d += (long) read;
                    return read;
                }
            } catch (IOException unused) {
            }
            this.f4092d = -1;
            return -1;
        }
    }

    /* renamed from: androidx.exifinterface.media.a$b */
    private static class C1417b extends InputStream implements DataInput {

        /* renamed from: h */
        private static final ByteOrder f4095h = ByteOrder.LITTLE_ENDIAN;

        /* renamed from: i */
        private static final ByteOrder f4096i = ByteOrder.BIG_ENDIAN;

        /* renamed from: d */
        final DataInputStream f4097d;

        /* renamed from: e */
        private ByteOrder f4098e;

        /* renamed from: f */
        int f4099f;

        /* renamed from: g */
        private byte[] f4100g;

        C1417b(byte[] bArr) {
            this(new ByteArrayInputStream(bArr), ByteOrder.BIG_ENDIAN);
        }

        /* renamed from: a */
        public int mo4100a() {
            return this.f4099f;
        }

        public int available() {
            return this.f4097d.available();
        }

        /* renamed from: k */
        public long mo4102k() {
            return ((long) readInt()) & 4294967295L;
        }

        /* renamed from: m */
        public void mo4103m(ByteOrder byteOrder) {
            this.f4098e = byteOrder;
        }

        public void mark(int i) {
            throw new UnsupportedOperationException("Mark is currently unsupported");
        }

        /* renamed from: n */
        public void mo4105n(int i) {
            int i2 = 0;
            while (i2 < i) {
                int i3 = i - i2;
                int skip = (int) this.f4097d.skip((long) i3);
                if (skip <= 0) {
                    if (this.f4100g == null) {
                        this.f4100g = new byte[8192];
                    }
                    skip = this.f4097d.read(this.f4100g, 0, Math.min(8192, i3));
                    if (skip == -1) {
                        throw new EOFException("Reached EOF while skipping " + i + " bytes.");
                    }
                }
                i2 += skip;
            }
            this.f4099f += i2;
        }

        public int read() {
            this.f4099f++;
            return this.f4097d.read();
        }

        public boolean readBoolean() {
            this.f4099f++;
            return this.f4097d.readBoolean();
        }

        public byte readByte() {
            this.f4099f++;
            int read = this.f4097d.read();
            if (read >= 0) {
                return (byte) read;
            }
            throw new EOFException();
        }

        public char readChar() {
            this.f4099f += 2;
            return this.f4097d.readChar();
        }

        public double readDouble() {
            return Double.longBitsToDouble(readLong());
        }

        public float readFloat() {
            return Float.intBitsToFloat(readInt());
        }

        public void readFully(byte[] bArr, int i, int i2) {
            this.f4099f += i2;
            this.f4097d.readFully(bArr, i, i2);
        }

        public int readInt() {
            this.f4099f += 4;
            int read = this.f4097d.read();
            int read2 = this.f4097d.read();
            int read3 = this.f4097d.read();
            int read4 = this.f4097d.read();
            if ((read | read2 | read3 | read4) >= 0) {
                ByteOrder byteOrder = this.f4098e;
                if (byteOrder == f4095h) {
                    return (read4 << 24) + (read3 << 16) + (read2 << 8) + read;
                }
                if (byteOrder == f4096i) {
                    return (read << 24) + (read2 << 16) + (read3 << 8) + read4;
                }
                throw new IOException("Invalid byte order: " + this.f4098e);
            }
            throw new EOFException();
        }

        public String readLine() {
            Log.d("ExifInterface", "Currently unsupported");
            return null;
        }

        public long readLong() {
            this.f4099f += 8;
            int read = this.f4097d.read();
            int read2 = this.f4097d.read();
            int read3 = this.f4097d.read();
            int read4 = this.f4097d.read();
            int read5 = this.f4097d.read();
            int read6 = this.f4097d.read();
            int read7 = this.f4097d.read();
            int read8 = this.f4097d.read();
            if ((read | read2 | read3 | read4 | read5 | read6 | read7 | read8) >= 0) {
                ByteOrder byteOrder = this.f4098e;
                if (byteOrder == f4095h) {
                    return (((long) read8) << 56) + (((long) read7) << 48) + (((long) read6) << 40) + (((long) read5) << 32) + (((long) read4) << 24) + (((long) read3) << 16) + (((long) read2) << 8) + ((long) read);
                }
                int i = read2;
                if (byteOrder == f4096i) {
                    return (((long) read) << 56) + (((long) i) << 48) + (((long) read3) << 40) + (((long) read4) << 32) + (((long) read5) << 24) + (((long) read6) << 16) + (((long) read7) << 8) + ((long) read8);
                }
                throw new IOException("Invalid byte order: " + this.f4098e);
            }
            throw new EOFException();
        }

        public short readShort() {
            this.f4099f += 2;
            int read = this.f4097d.read();
            int read2 = this.f4097d.read();
            if ((read | read2) >= 0) {
                ByteOrder byteOrder = this.f4098e;
                if (byteOrder == f4095h) {
                    return (short) ((read2 << 8) + read);
                }
                if (byteOrder == f4096i) {
                    return (short) ((read << 8) + read2);
                }
                throw new IOException("Invalid byte order: " + this.f4098e);
            }
            throw new EOFException();
        }

        public String readUTF() {
            this.f4099f += 2;
            return this.f4097d.readUTF();
        }

        public int readUnsignedByte() {
            this.f4099f++;
            return this.f4097d.readUnsignedByte();
        }

        public int readUnsignedShort() {
            this.f4099f += 2;
            int read = this.f4097d.read();
            int read2 = this.f4097d.read();
            if ((read | read2) >= 0) {
                ByteOrder byteOrder = this.f4098e;
                if (byteOrder == f4095h) {
                    return (read2 << 8) + read;
                }
                if (byteOrder == f4096i) {
                    return (read << 8) + read2;
                }
                throw new IOException("Invalid byte order: " + this.f4098e);
            }
            throw new EOFException();
        }

        public void reset() {
            throw new UnsupportedOperationException("Reset is currently unsupported");
        }

        public int skipBytes(int i) {
            throw new UnsupportedOperationException("skipBytes is currently unsupported");
        }

        C1417b(InputStream inputStream) {
            this(inputStream, ByteOrder.BIG_ENDIAN);
        }

        C1417b(InputStream inputStream, ByteOrder byteOrder) {
            this.f4098e = ByteOrder.BIG_ENDIAN;
            DataInputStream dataInputStream = new DataInputStream(inputStream);
            this.f4097d = dataInputStream;
            dataInputStream.mark(0);
            this.f4099f = 0;
            this.f4098e = byteOrder;
        }

        public int read(byte[] bArr, int i, int i2) {
            int read = this.f4097d.read(bArr, i, i2);
            this.f4099f += read;
            return read;
        }

        public void readFully(byte[] bArr) {
            this.f4099f += bArr.length;
            this.f4097d.readFully(bArr);
        }
    }

    /* renamed from: androidx.exifinterface.media.a$c */
    private static class C1418c {

        /* renamed from: a */
        public final int f4101a;

        /* renamed from: b */
        public final int f4102b;

        /* renamed from: c */
        public final long f4103c;

        /* renamed from: d */
        public final byte[] f4104d;

        C1418c(int i, int i2, byte[] bArr) {
            this(i, i2, -1, bArr);
        }

        /* renamed from: a */
        public static C1418c m4898a(String str) {
            byte[] bytes = (str + 0).getBytes(C1415a.f4059o0);
            return new C1418c(2, bytes.length, bytes);
        }

        /* renamed from: b */
        public static C1418c m4899b(long j, ByteOrder byteOrder) {
            return m4900c(new long[]{j}, byteOrder);
        }

        /* renamed from: c */
        public static C1418c m4900c(long[] jArr, ByteOrder byteOrder) {
            ByteBuffer wrap = ByteBuffer.wrap(new byte[(C1415a.f4041W[4] * jArr.length)]);
            wrap.order(byteOrder);
            for (long j : jArr) {
                wrap.putInt((int) j);
            }
            return new C1418c(4, jArr.length, wrap.array());
        }

        /* renamed from: d */
        public static C1418c m4901d(C1420e eVar, ByteOrder byteOrder) {
            return m4902e(new C1420e[]{eVar}, byteOrder);
        }

        /* renamed from: e */
        public static C1418c m4902e(C1420e[] eVarArr, ByteOrder byteOrder) {
            ByteBuffer wrap = ByteBuffer.wrap(new byte[(C1415a.f4041W[5] * eVarArr.length)]);
            wrap.order(byteOrder);
            for (C1420e eVar : eVarArr) {
                wrap.putInt((int) eVar.f4109a);
                wrap.putInt((int) eVar.f4110b);
            }
            return new C1418c(5, eVarArr.length, wrap.array());
        }

        /* renamed from: f */
        public static C1418c m4903f(int i, ByteOrder byteOrder) {
            return m4904g(new int[]{i}, byteOrder);
        }

        /* renamed from: g */
        public static C1418c m4904g(int[] iArr, ByteOrder byteOrder) {
            ByteBuffer wrap = ByteBuffer.wrap(new byte[(C1415a.f4041W[3] * iArr.length)]);
            wrap.order(byteOrder);
            for (int i : iArr) {
                wrap.putShort((short) i);
            }
            return new C1418c(3, iArr.length, wrap.array());
        }

        /* renamed from: h */
        public double mo4124h(ByteOrder byteOrder) {
            Object k = mo4127k(byteOrder);
            if (k == null) {
                throw new NumberFormatException("NULL can't be converted to a double value");
            } else if (k instanceof String) {
                return Double.parseDouble((String) k);
            } else {
                if (k instanceof long[]) {
                    long[] jArr = (long[]) k;
                    if (jArr.length == 1) {
                        return (double) jArr[0];
                    }
                    throw new NumberFormatException("There are more than one component");
                } else if (k instanceof int[]) {
                    int[] iArr = (int[]) k;
                    if (iArr.length == 1) {
                        return (double) iArr[0];
                    }
                    throw new NumberFormatException("There are more than one component");
                } else if (k instanceof double[]) {
                    double[] dArr = (double[]) k;
                    if (dArr.length == 1) {
                        return dArr[0];
                    }
                    throw new NumberFormatException("There are more than one component");
                } else if (k instanceof C1420e[]) {
                    C1420e[] eVarArr = (C1420e[]) k;
                    if (eVarArr.length == 1) {
                        return eVarArr[0].mo4130a();
                    }
                    throw new NumberFormatException("There are more than one component");
                } else {
                    throw new NumberFormatException("Couldn't find a double value");
                }
            }
        }

        /* renamed from: i */
        public int mo4125i(ByteOrder byteOrder) {
            Object k = mo4127k(byteOrder);
            if (k == null) {
                throw new NumberFormatException("NULL can't be converted to a integer value");
            } else if (k instanceof String) {
                return Integer.parseInt((String) k);
            } else {
                if (k instanceof long[]) {
                    long[] jArr = (long[]) k;
                    if (jArr.length == 1) {
                        return (int) jArr[0];
                    }
                    throw new NumberFormatException("There are more than one component");
                } else if (k instanceof int[]) {
                    int[] iArr = (int[]) k;
                    if (iArr.length == 1) {
                        return iArr[0];
                    }
                    throw new NumberFormatException("There are more than one component");
                } else {
                    throw new NumberFormatException("Couldn't find a integer value");
                }
            }
        }

        /* renamed from: j */
        public String mo4126j(ByteOrder byteOrder) {
            Object k = mo4127k(byteOrder);
            if (k == null) {
                return null;
            }
            if (k instanceof String) {
                return (String) k;
            }
            StringBuilder sb = new StringBuilder();
            int i = 0;
            if (k instanceof long[]) {
                long[] jArr = (long[]) k;
                while (i < jArr.length) {
                    sb.append(jArr[i]);
                    i++;
                    if (i != jArr.length) {
                        sb.append(",");
                    }
                }
                return sb.toString();
            } else if (k instanceof int[]) {
                int[] iArr = (int[]) k;
                while (i < iArr.length) {
                    sb.append(iArr[i]);
                    i++;
                    if (i != iArr.length) {
                        sb.append(",");
                    }
                }
                return sb.toString();
            } else if (k instanceof double[]) {
                double[] dArr = (double[]) k;
                while (i < dArr.length) {
                    sb.append(dArr[i]);
                    i++;
                    if (i != dArr.length) {
                        sb.append(",");
                    }
                }
                return sb.toString();
            } else if (!(k instanceof C1420e[])) {
                return null;
            } else {
                C1420e[] eVarArr = (C1420e[]) k;
                while (i < eVarArr.length) {
                    sb.append(eVarArr[i].f4109a);
                    sb.append('/');
                    sb.append(eVarArr[i].f4110b);
                    i++;
                    if (i != eVarArr.length) {
                        sb.append(",");
                    }
                }
                return sb.toString();
            }
        }

        /* access modifiers changed from: package-private */
        /* JADX WARNING: Removed duplicated region for block: B:163:0x019b A[SYNTHETIC, Splitter:B:163:0x019b] */
        /* renamed from: k */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public java.lang.Object mo4127k(java.nio.ByteOrder r11) {
            /*
                r10 = this;
                java.lang.String r0 = "IOException occurred while closing InputStream"
                java.lang.String r1 = "ExifInterface"
                r2 = 0
                androidx.exifinterface.media.a$b r3 = new androidx.exifinterface.media.a$b     // Catch:{ IOException -> 0x0185, all -> 0x0183 }
                byte[] r4 = r10.f4104d     // Catch:{ IOException -> 0x0185, all -> 0x0183 }
                r3.<init>((byte[]) r4)     // Catch:{ IOException -> 0x0185, all -> 0x0183 }
                r3.mo4103m(r11)     // Catch:{ IOException -> 0x0181 }
                int r11 = r10.f4101a     // Catch:{ IOException -> 0x0181 }
                r4 = 0
                r5 = 1
                switch(r11) {
                    case 1: goto L_0x0148;
                    case 2: goto L_0x00fd;
                    case 3: goto L_0x00e3;
                    case 4: goto L_0x00c9;
                    case 5: goto L_0x00a6;
                    case 6: goto L_0x0148;
                    case 7: goto L_0x00fd;
                    case 8: goto L_0x008c;
                    case 9: goto L_0x0072;
                    case 10: goto L_0x004d;
                    case 11: goto L_0x0032;
                    case 12: goto L_0x0018;
                    default: goto L_0x0016;
                }     // Catch:{ IOException -> 0x0181 }
            L_0x0016:
                goto L_0x0178
            L_0x0018:
                int r11 = r10.f4102b     // Catch:{ IOException -> 0x0181 }
                double[] r11 = new double[r11]     // Catch:{ IOException -> 0x0181 }
            L_0x001c:
                int r5 = r10.f4102b     // Catch:{ IOException -> 0x0181 }
                if (r4 >= r5) goto L_0x0029
                double r5 = r3.readDouble()     // Catch:{ IOException -> 0x0181 }
                r11[r4] = r5     // Catch:{ IOException -> 0x0181 }
                int r4 = r4 + 1
                goto L_0x001c
            L_0x0029:
                r3.close()     // Catch:{ IOException -> 0x002d }
                goto L_0x0031
            L_0x002d:
                r2 = move-exception
                android.util.Log.e(r1, r0, r2)
            L_0x0031:
                return r11
            L_0x0032:
                int r11 = r10.f4102b     // Catch:{ IOException -> 0x0181 }
                double[] r11 = new double[r11]     // Catch:{ IOException -> 0x0181 }
            L_0x0036:
                int r5 = r10.f4102b     // Catch:{ IOException -> 0x0181 }
                if (r4 >= r5) goto L_0x0044
                float r5 = r3.readFloat()     // Catch:{ IOException -> 0x0181 }
                double r5 = (double) r5     // Catch:{ IOException -> 0x0181 }
                r11[r4] = r5     // Catch:{ IOException -> 0x0181 }
                int r4 = r4 + 1
                goto L_0x0036
            L_0x0044:
                r3.close()     // Catch:{ IOException -> 0x0048 }
                goto L_0x004c
            L_0x0048:
                r2 = move-exception
                android.util.Log.e(r1, r0, r2)
            L_0x004c:
                return r11
            L_0x004d:
                int r11 = r10.f4102b     // Catch:{ IOException -> 0x0181 }
                androidx.exifinterface.media.a$e[] r11 = new androidx.exifinterface.media.C1415a.C1420e[r11]     // Catch:{ IOException -> 0x0181 }
            L_0x0051:
                int r5 = r10.f4102b     // Catch:{ IOException -> 0x0181 }
                if (r4 >= r5) goto L_0x0069
                int r5 = r3.readInt()     // Catch:{ IOException -> 0x0181 }
                long r5 = (long) r5     // Catch:{ IOException -> 0x0181 }
                int r7 = r3.readInt()     // Catch:{ IOException -> 0x0181 }
                long r7 = (long) r7     // Catch:{ IOException -> 0x0181 }
                androidx.exifinterface.media.a$e r9 = new androidx.exifinterface.media.a$e     // Catch:{ IOException -> 0x0181 }
                r9.<init>(r5, r7)     // Catch:{ IOException -> 0x0181 }
                r11[r4] = r9     // Catch:{ IOException -> 0x0181 }
                int r4 = r4 + 1
                goto L_0x0051
            L_0x0069:
                r3.close()     // Catch:{ IOException -> 0x006d }
                goto L_0x0071
            L_0x006d:
                r2 = move-exception
                android.util.Log.e(r1, r0, r2)
            L_0x0071:
                return r11
            L_0x0072:
                int r11 = r10.f4102b     // Catch:{ IOException -> 0x0181 }
                int[] r11 = new int[r11]     // Catch:{ IOException -> 0x0181 }
            L_0x0076:
                int r5 = r10.f4102b     // Catch:{ IOException -> 0x0181 }
                if (r4 >= r5) goto L_0x0083
                int r5 = r3.readInt()     // Catch:{ IOException -> 0x0181 }
                r11[r4] = r5     // Catch:{ IOException -> 0x0181 }
                int r4 = r4 + 1
                goto L_0x0076
            L_0x0083:
                r3.close()     // Catch:{ IOException -> 0x0087 }
                goto L_0x008b
            L_0x0087:
                r2 = move-exception
                android.util.Log.e(r1, r0, r2)
            L_0x008b:
                return r11
            L_0x008c:
                int r11 = r10.f4102b     // Catch:{ IOException -> 0x0181 }
                int[] r11 = new int[r11]     // Catch:{ IOException -> 0x0181 }
            L_0x0090:
                int r5 = r10.f4102b     // Catch:{ IOException -> 0x0181 }
                if (r4 >= r5) goto L_0x009d
                short r5 = r3.readShort()     // Catch:{ IOException -> 0x0181 }
                r11[r4] = r5     // Catch:{ IOException -> 0x0181 }
                int r4 = r4 + 1
                goto L_0x0090
            L_0x009d:
                r3.close()     // Catch:{ IOException -> 0x00a1 }
                goto L_0x00a5
            L_0x00a1:
                r2 = move-exception
                android.util.Log.e(r1, r0, r2)
            L_0x00a5:
                return r11
            L_0x00a6:
                int r11 = r10.f4102b     // Catch:{ IOException -> 0x0181 }
                androidx.exifinterface.media.a$e[] r11 = new androidx.exifinterface.media.C1415a.C1420e[r11]     // Catch:{ IOException -> 0x0181 }
            L_0x00aa:
                int r5 = r10.f4102b     // Catch:{ IOException -> 0x0181 }
                if (r4 >= r5) goto L_0x00c0
                long r5 = r3.mo4102k()     // Catch:{ IOException -> 0x0181 }
                long r7 = r3.mo4102k()     // Catch:{ IOException -> 0x0181 }
                androidx.exifinterface.media.a$e r9 = new androidx.exifinterface.media.a$e     // Catch:{ IOException -> 0x0181 }
                r9.<init>(r5, r7)     // Catch:{ IOException -> 0x0181 }
                r11[r4] = r9     // Catch:{ IOException -> 0x0181 }
                int r4 = r4 + 1
                goto L_0x00aa
            L_0x00c0:
                r3.close()     // Catch:{ IOException -> 0x00c4 }
                goto L_0x00c8
            L_0x00c4:
                r2 = move-exception
                android.util.Log.e(r1, r0, r2)
            L_0x00c8:
                return r11
            L_0x00c9:
                int r11 = r10.f4102b     // Catch:{ IOException -> 0x0181 }
                long[] r11 = new long[r11]     // Catch:{ IOException -> 0x0181 }
            L_0x00cd:
                int r5 = r10.f4102b     // Catch:{ IOException -> 0x0181 }
                if (r4 >= r5) goto L_0x00da
                long r5 = r3.mo4102k()     // Catch:{ IOException -> 0x0181 }
                r11[r4] = r5     // Catch:{ IOException -> 0x0181 }
                int r4 = r4 + 1
                goto L_0x00cd
            L_0x00da:
                r3.close()     // Catch:{ IOException -> 0x00de }
                goto L_0x00e2
            L_0x00de:
                r2 = move-exception
                android.util.Log.e(r1, r0, r2)
            L_0x00e2:
                return r11
            L_0x00e3:
                int r11 = r10.f4102b     // Catch:{ IOException -> 0x0181 }
                int[] r11 = new int[r11]     // Catch:{ IOException -> 0x0181 }
            L_0x00e7:
                int r5 = r10.f4102b     // Catch:{ IOException -> 0x0181 }
                if (r4 >= r5) goto L_0x00f4
                int r5 = r3.readUnsignedShort()     // Catch:{ IOException -> 0x0181 }
                r11[r4] = r5     // Catch:{ IOException -> 0x0181 }
                int r4 = r4 + 1
                goto L_0x00e7
            L_0x00f4:
                r3.close()     // Catch:{ IOException -> 0x00f8 }
                goto L_0x00fc
            L_0x00f8:
                r2 = move-exception
                android.util.Log.e(r1, r0, r2)
            L_0x00fc:
                return r11
            L_0x00fd:
                int r11 = r10.f4102b     // Catch:{ IOException -> 0x0181 }
                byte[] r6 = androidx.exifinterface.media.C1415a.f4042X     // Catch:{ IOException -> 0x0181 }
                int r6 = r6.length     // Catch:{ IOException -> 0x0181 }
                if (r11 < r6) goto L_0x011a
                r11 = r4
            L_0x0105:
                byte[] r6 = androidx.exifinterface.media.C1415a.f4042X     // Catch:{ IOException -> 0x0181 }
                int r7 = r6.length     // Catch:{ IOException -> 0x0181 }
                if (r11 >= r7) goto L_0x0117
                byte[] r7 = r10.f4104d     // Catch:{ IOException -> 0x0181 }
                byte r7 = r7[r11]     // Catch:{ IOException -> 0x0181 }
                byte r8 = r6[r11]     // Catch:{ IOException -> 0x0181 }
                if (r7 == r8) goto L_0x0114
                r5 = r4
                goto L_0x0117
            L_0x0114:
                int r11 = r11 + 1
                goto L_0x0105
            L_0x0117:
                if (r5 == 0) goto L_0x011a
                int r4 = r6.length     // Catch:{ IOException -> 0x0181 }
            L_0x011a:
                java.lang.StringBuilder r11 = new java.lang.StringBuilder     // Catch:{ IOException -> 0x0181 }
                r11.<init>()     // Catch:{ IOException -> 0x0181 }
            L_0x011f:
                int r5 = r10.f4102b     // Catch:{ IOException -> 0x0181 }
                if (r4 >= r5) goto L_0x013b
                byte[] r5 = r10.f4104d     // Catch:{ IOException -> 0x0181 }
                byte r5 = r5[r4]     // Catch:{ IOException -> 0x0181 }
                if (r5 != 0) goto L_0x012a
                goto L_0x013b
            L_0x012a:
                r6 = 32
                if (r5 < r6) goto L_0x0133
                char r5 = (char) r5     // Catch:{ IOException -> 0x0181 }
                r11.append(r5)     // Catch:{ IOException -> 0x0181 }
                goto L_0x0138
            L_0x0133:
                r5 = 63
                r11.append(r5)     // Catch:{ IOException -> 0x0181 }
            L_0x0138:
                int r4 = r4 + 1
                goto L_0x011f
            L_0x013b:
                java.lang.String r11 = r11.toString()     // Catch:{ IOException -> 0x0181 }
                r3.close()     // Catch:{ IOException -> 0x0143 }
                goto L_0x0147
            L_0x0143:
                r2 = move-exception
                android.util.Log.e(r1, r0, r2)
            L_0x0147:
                return r11
            L_0x0148:
                byte[] r11 = r10.f4104d     // Catch:{ IOException -> 0x0181 }
                int r6 = r11.length     // Catch:{ IOException -> 0x0181 }
                if (r6 != r5) goto L_0x0168
                byte r6 = r11[r4]     // Catch:{ IOException -> 0x0181 }
                if (r6 < 0) goto L_0x0168
                if (r6 > r5) goto L_0x0168
                java.lang.String r11 = new java.lang.String     // Catch:{ IOException -> 0x0181 }
                char[] r5 = new char[r5]     // Catch:{ IOException -> 0x0181 }
                int r6 = r6 + 48
                char r6 = (char) r6     // Catch:{ IOException -> 0x0181 }
                r5[r4] = r6     // Catch:{ IOException -> 0x0181 }
                r11.<init>(r5)     // Catch:{ IOException -> 0x0181 }
                r3.close()     // Catch:{ IOException -> 0x0163 }
                goto L_0x0167
            L_0x0163:
                r2 = move-exception
                android.util.Log.e(r1, r0, r2)
            L_0x0167:
                return r11
            L_0x0168:
                java.lang.String r4 = new java.lang.String     // Catch:{ IOException -> 0x0181 }
                java.nio.charset.Charset r5 = androidx.exifinterface.media.C1415a.f4059o0     // Catch:{ IOException -> 0x0181 }
                r4.<init>(r11, r5)     // Catch:{ IOException -> 0x0181 }
                r3.close()     // Catch:{ IOException -> 0x0173 }
                goto L_0x0177
            L_0x0173:
                r11 = move-exception
                android.util.Log.e(r1, r0, r11)
            L_0x0177:
                return r4
            L_0x0178:
                r3.close()     // Catch:{ IOException -> 0x017c }
                goto L_0x0180
            L_0x017c:
                r11 = move-exception
                android.util.Log.e(r1, r0, r11)
            L_0x0180:
                return r2
            L_0x0181:
                r11 = move-exception
                goto L_0x0187
            L_0x0183:
                r11 = move-exception
                goto L_0x0199
            L_0x0185:
                r11 = move-exception
                r3 = r2
            L_0x0187:
                java.lang.String r4 = "IOException occurred during reading a value"
                android.util.Log.w(r1, r4, r11)     // Catch:{ all -> 0x0197 }
                if (r3 == 0) goto L_0x0196
                r3.close()     // Catch:{ IOException -> 0x0192 }
                goto L_0x0196
            L_0x0192:
                r11 = move-exception
                android.util.Log.e(r1, r0, r11)
            L_0x0196:
                return r2
            L_0x0197:
                r11 = move-exception
                r2 = r3
            L_0x0199:
                if (r2 == 0) goto L_0x01a3
                r2.close()     // Catch:{ IOException -> 0x019f }
                goto L_0x01a3
            L_0x019f:
                r2 = move-exception
                android.util.Log.e(r1, r0, r2)
            L_0x01a3:
                throw r11
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.exifinterface.media.C1415a.C1418c.mo4127k(java.nio.ByteOrder):java.lang.Object");
        }

        public String toString() {
            return "(" + C1415a.f4040V[this.f4101a] + ", data length:" + this.f4104d.length + ")";
        }

        C1418c(int i, int i2, long j, byte[] bArr) {
            this.f4101a = i;
            this.f4102b = i2;
            this.f4103c = j;
            this.f4104d = bArr;
        }
    }

    /* renamed from: androidx.exifinterface.media.a$e */
    private static class C1420e {

        /* renamed from: a */
        public final long f4109a;

        /* renamed from: b */
        public final long f4110b;

        C1420e(long j, long j2) {
            if (j2 == 0) {
                this.f4109a = 0;
                this.f4110b = 1;
                return;
            }
            this.f4109a = j;
            this.f4110b = j2;
        }

        /* renamed from: a */
        public double mo4130a() {
            return ((double) this.f4109a) / ((double) this.f4110b);
        }

        public String toString() {
            return this.f4109a + C11110u2.f31950c + this.f4110b;
        }
    }

    static {
        C1419d[] dVarArr = {new C1419d("NewSubfileType", 254, 4), new C1419d("SubfileType", C11051p3.f31759c, 4), new C1419d("ImageWidth", C11398b.f33139r, 3, 4), new C1419d("ImageLength", 257, 3, 4), new C1419d("BitsPerSample", 258, 3), new C1419d("Compression", 259, 3), new C1419d("PhotometricInterpretation", 262, 3), new C1419d("ImageDescription", SubsamplingScaleImageView.ORIENTATION_270, 2), new C1419d("Make", 271, 2), new C1419d("Model", 272, 2), new C1419d("StripOffsets", 273, 3, 4), new C1419d("Orientation", 274, 3), new C1419d("SamplesPerPixel", 277, 3), new C1419d("RowsPerStrip", 278, 3, 4), new C1419d("StripByteCounts", 279, 3, 4), new C1419d("XResolution", 282, 5), new C1419d("YResolution", 283, 5), new C1419d("PlanarConfiguration", 284, 3), new C1419d("ResolutionUnit", 296, 3), new C1419d("TransferFunction", BogInputLayout.INPUT_TYPE_NUM_PASSWORD, 3), new C1419d("Software", BogInputLayout.INPUT_TYPE_NUM_PHONE, 2), new C1419d("DateTime", BogInputLayout.INPUT_TYPE_NUMBER_SIGNED, 2), new C1419d("Artist", 315, 2), new C1419d("WhitePoint", 318, 5), new C1419d("PrimaryChromaticities", 319, 5), new C1419d("SubIFDPointer", 330, 4), new C1419d("JPEGInterchangeFormat", 513, 4), new C1419d("JPEGInterchangeFormatLength", 514, 4), new C1419d("YCbCrCoefficients", 529, 5), new C1419d("YCbCrSubSampling", 530, 3), new C1419d("YCbCrPositioning", 531, 3), new C1419d("ReferenceBlackWhite", 532, 5), new C1419d("Copyright", 33432, 2), new C1419d("ExifIFDPointer", 34665, 4), new C1419d("GPSInfoIFDPointer", 34853, 4), new C1419d("SensorTopBorder", 4, 4), new C1419d("SensorLeftBorder", 5, 4), new C1419d("SensorBottomBorder", 6, 4), new C1419d("SensorRightBorder", 7, 4), new C1419d("ISO", 23, 3), new C1419d("JpgFromRaw", 46, 7), new C1419d("Xmp", 700, 1)};
        f4043Y = dVarArr;
        C1419d[] dVarArr2 = {new C1419d("ExposureTime", 33434, 5), new C1419d("FNumber", 33437, 5), new C1419d("ExposureProgram", 34850, 3), new C1419d("SpectralSensitivity", 34852, 2), new C1419d("PhotographicSensitivity", 34855, 3), new C1419d("OECF", 34856, 7), new C1419d("SensitivityType", 34864, 3), new C1419d("StandardOutputSensitivity", 34865, 4), new C1419d("RecommendedExposureIndex", 34866, 4), new C1419d("ISOSpeed", 34867, 4), new C1419d("ISOSpeedLatitudeyyy", 34868, 4), new C1419d("ISOSpeedLatitudezzz", 34869, 4), new C1419d("ExifVersion", 36864, 2), new C1419d("DateTimeOriginal", 36867, 2), new C1419d("DateTimeDigitized", 36868, 2), new C1419d("OffsetTime", 36880, 2), new C1419d("OffsetTimeOriginal", 36881, 2), new C1419d("OffsetTimeDigitized", 36882, 2), new C1419d("ComponentsConfiguration", 37121, 7), new C1419d("CompressedBitsPerPixel", 37122, 5), new C1419d("ShutterSpeedValue", 37377, 10), new C1419d("ApertureValue", 37378, 5), new C1419d("BrightnessValue", 37379, 10), new C1419d("ExposureBiasValue", 37380, 10), new C1419d("MaxApertureValue", 37381, 5), new C1419d("SubjectDistance", 37382, 5), new C1419d("MeteringMode", 37383, 3), new C1419d("LightSource", 37384, 3), new C1419d("Flash", 37385, 3), new C1419d("FocalLength", 37386, 5), new C1419d("SubjectArea", 37396, 3), new C1419d("MakerNote", 37500, 7), new C1419d("UserComment", 37510, 7), new C1419d("SubSecTime", 37520, 2), new C1419d("SubSecTimeOriginal", 37521, 2), new C1419d("SubSecTimeDigitized", 37522, 2), new C1419d("FlashpixVersion", 40960, 7), new C1419d("ColorSpace", 40961, 3), new C1419d("PixelXDimension", 40962, 3, 4), new C1419d("PixelYDimension", 40963, 3, 4), new C1419d("RelatedSoundFile", 40964, 2), new C1419d("InteroperabilityIFDPointer", 40965, 4), new C1419d("FlashEnergy", 41483, 5), new C1419d("SpatialFrequencyResponse", 41484, 7), new C1419d("FocalPlaneXResolution", 41486, 5), new C1419d("FocalPlaneYResolution", 41487, 5), new C1419d("FocalPlaneResolutionUnit", 41488, 3), new C1419d("SubjectLocation", 41492, 3), new C1419d("ExposureIndex", 41493, 5), new C1419d("SensingMethod", 41495, 3), new C1419d("FileSource", 41728, 7), new C1419d("SceneType", 41729, 7), new C1419d("CFAPattern", 41730, 7), new C1419d("CustomRendered", 41985, 3), new C1419d("ExposureMode", 41986, 3), new C1419d("WhiteBalance", 41987, 3), new C1419d("DigitalZoomRatio", 41988, 5), new C1419d("FocalLengthIn35mmFilm", 41989, 3), new C1419d("SceneCaptureType", 41990, 3), new C1419d("GainControl", 41991, 3), new C1419d("Contrast", 41992, 3), new C1419d("Saturation", 41993, 3), new C1419d("Sharpness", 41994, 3), new C1419d("DeviceSettingDescription", 41995, 7), new C1419d("SubjectDistanceRange", 41996, 3), new C1419d("ImageUniqueID", 42016, 2), new C1419d("CameraOwnerName", 42032, 2), new C1419d("BodySerialNumber", 42033, 2), new C1419d("LensSpecification", 42034, 5), new C1419d("LensMake", 42035, 2), new C1419d("LensModel", 42036, 2), new C1419d("Gamma", 42240, 5), new C1419d("DNGVersion", 50706, 1), new C1419d("DefaultCropSize", 50720, 3, 4)};
        f4044Z = dVarArr2;
        C1419d[] dVarArr3 = {new C1419d("GPSVersionID", 0, 1), new C1419d("GPSLatitudeRef", 1, 2), new C1419d("GPSLatitude", 2, 5, 10), new C1419d("GPSLongitudeRef", 3, 2), new C1419d("GPSLongitude", 4, 5, 10), new C1419d("GPSAltitudeRef", 5, 1), new C1419d("GPSAltitude", 6, 5), new C1419d("GPSTimeStamp", 7, 5), new C1419d("GPSSatellites", 8, 2), new C1419d("GPSStatus", 9, 2), new C1419d("GPSMeasureMode", 10, 2), new C1419d("GPSDOP", 11, 5), new C1419d("GPSSpeedRef", 12, 2), new C1419d("GPSSpeed", 13, 5), new C1419d("GPSTrackRef", 14, 2), new C1419d("GPSTrack", 15, 5), new C1419d("GPSImgDirectionRef", 16, 2), new C1419d("GPSImgDirection", 17, 5), new C1419d("GPSMapDatum", 18, 2), new C1419d("GPSDestLatitudeRef", 19, 2), new C1419d("GPSDestLatitude", 20, 5), new C1419d("GPSDestLongitudeRef", 21, 2), new C1419d("GPSDestLongitude", 22, 5), new C1419d("GPSDestBearingRef", 23, 2), new C1419d("GPSDestBearing", 24, 5), new C1419d("GPSDestDistanceRef", 25, 2), new C1419d("GPSDestDistance", 26, 5), new C1419d("GPSProcessingMethod", 27, 7), new C1419d("GPSAreaInformation", 28, 7), new C1419d("GPSDateStamp", 29, 2), new C1419d("GPSDifferential", 30, 3), new C1419d("GPSHPositioningError", 31, 5)};
        f4045a0 = dVarArr3;
        C1419d[] dVarArr4 = {new C1419d("InteroperabilityIndex", 1, 2)};
        f4046b0 = dVarArr4;
        C1419d[] dVarArr5 = {new C1419d("NewSubfileType", 254, 4), new C1419d("SubfileType", C11051p3.f31759c, 4), new C1419d("ThumbnailImageWidth", C11398b.f33139r, 3, 4), new C1419d("ThumbnailImageLength", 257, 3, 4), new C1419d("BitsPerSample", 258, 3), new C1419d("Compression", 259, 3), new C1419d("PhotometricInterpretation", 262, 3), new C1419d("ImageDescription", SubsamplingScaleImageView.ORIENTATION_270, 2), new C1419d("Make", 271, 2), new C1419d("Model", 272, 2), new C1419d("StripOffsets", 273, 3, 4), new C1419d("ThumbnailOrientation", 274, 3), new C1419d("SamplesPerPixel", 277, 3), new C1419d("RowsPerStrip", 278, 3, 4), new C1419d("StripByteCounts", 279, 3, 4), new C1419d("XResolution", 282, 5), new C1419d("YResolution", 283, 5), new C1419d("PlanarConfiguration", 284, 3), new C1419d("ResolutionUnit", 296, 3), new C1419d("TransferFunction", BogInputLayout.INPUT_TYPE_NUM_PASSWORD, 3), new C1419d("Software", BogInputLayout.INPUT_TYPE_NUM_PHONE, 2), new C1419d("DateTime", BogInputLayout.INPUT_TYPE_NUMBER_SIGNED, 2), new C1419d("Artist", 315, 2), new C1419d("WhitePoint", 318, 5), new C1419d("PrimaryChromaticities", 319, 5), new C1419d("SubIFDPointer", 330, 4), new C1419d("JPEGInterchangeFormat", 513, 4), new C1419d("JPEGInterchangeFormatLength", 514, 4), new C1419d("YCbCrCoefficients", 529, 5), new C1419d("YCbCrSubSampling", 530, 3), new C1419d("YCbCrPositioning", 531, 3), new C1419d("ReferenceBlackWhite", 532, 5), new C1419d("Xmp", 700, 1), new C1419d("Copyright", 33432, 2), new C1419d("ExifIFDPointer", 34665, 4), new C1419d("GPSInfoIFDPointer", 34853, 4), new C1419d("DNGVersion", 50706, 1), new C1419d("DefaultCropSize", 50720, 3, 4)};
        f4047c0 = dVarArr5;
        C1419d[] dVarArr6 = {new C1419d("ThumbnailImage", C11398b.f33139r, 7), new C1419d("CameraSettingsIFDPointer", 8224, 4), new C1419d("ImageProcessingIFDPointer", 8256, 4)};
        f4049e0 = dVarArr6;
        C1419d[] dVarArr7 = {new C1419d("PreviewImageStart", 257, 4), new C1419d("PreviewImageLength", 258, 4)};
        f4050f0 = dVarArr7;
        C1419d[] dVarArr8 = {new C1419d("AspectFrame", 4371, 3)};
        f4051g0 = dVarArr8;
        C1419d[] dVarArr9 = {new C1419d("ColorSpace", 55, 3)};
        f4052h0 = dVarArr9;
        C1419d[][] dVarArr10 = {dVarArr, dVarArr2, dVarArr3, dVarArr4, dVarArr5, dVarArr, dVarArr6, dVarArr7, dVarArr8, dVarArr9};
        f4053i0 = dVarArr10;
        f4055k0 = new HashMap[dVarArr10.length];
        f4056l0 = new HashMap[dVarArr10.length];
        Charset forName = Charset.forName("US-ASCII");
        f4059o0 = forName;
        f4060p0 = "Exif\u0000\u0000".getBytes(forName);
        f4061q0 = "http://ns.adobe.com/xap/1.0/\u0000".getBytes(forName);
        Locale locale = Locale.US;
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy:MM:dd HH:mm:ss", locale);
        f4038T = simpleDateFormat;
        simpleDateFormat.setTimeZone(DesugarTimeZone.getTimeZone("UTC"));
        SimpleDateFormat simpleDateFormat2 = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss", locale);
        f4039U = simpleDateFormat2;
        simpleDateFormat2.setTimeZone(DesugarTimeZone.getTimeZone("UTC"));
        int i = 0;
        while (true) {
            C1419d[][] dVarArr11 = f4053i0;
            if (i < dVarArr11.length) {
                f4055k0[i] = new HashMap();
                f4056l0[i] = new HashMap();
                for (C1419d dVar : dVarArr11[i]) {
                    f4055k0[i].put(Integer.valueOf(dVar.f4105a), dVar);
                    f4056l0[i].put(dVar.f4106b, dVar);
                }
                i++;
            } else {
                HashMap hashMap = f4058n0;
                C1419d[] dVarArr12 = f4054j0;
                hashMap.put(Integer.valueOf(dVarArr12[0].f4105a), 5);
                hashMap.put(Integer.valueOf(dVarArr12[1].f4105a), 1);
                hashMap.put(Integer.valueOf(dVarArr12[2].f4105a), 2);
                hashMap.put(Integer.valueOf(dVarArr12[3].f4105a), 3);
                hashMap.put(Integer.valueOf(dVarArr12[4].f4105a), 7);
                hashMap.put(Integer.valueOf(dVarArr12[5].f4105a), 8);
                return;
            }
        }
    }

    public C1415a(InputStream inputStream) {
        this(inputStream, 0);
    }

    /* renamed from: A */
    private boolean m4854A(byte[] bArr) {
        int i = 0;
        while (true) {
            byte[] bArr2 = f4029K;
            if (i >= bArr2.length) {
                int i2 = 0;
                while (true) {
                    byte[] bArr3 = f4030L;
                    if (i2 >= bArr3.length) {
                        return true;
                    }
                    if (bArr[f4029K.length + i2 + 4] != bArr3[i2]) {
                        return false;
                    }
                    i2++;
                }
            } else if (bArr[i] != bArr2[i]) {
                return false;
            } else {
                i++;
            }
        }
    }

    /* renamed from: B */
    private void m4855B(InputStream inputStream) {
        if (inputStream != null) {
            int i = 0;
            while (i < f4053i0.length) {
                try {
                    this.f4077f[i] = new HashMap();
                    i++;
                } catch (IOException | UnsupportedOperationException e) {
                    boolean z = f4065u;
                    if (z) {
                        Log.w("ExifInterface", "Invalid image: ExifInterface got an unsupported image format file(ExifInterface supports JPEG and some RAW image formats only) or a corrupted JPEG file to ExifInterface.", e);
                    }
                    m4868a();
                    if (!z) {
                        return;
                    }
                } catch (Throwable th) {
                    m4868a();
                    if (f4065u) {
                        m4857D();
                    }
                    throw th;
                }
            }
            if (!this.f4076e) {
                BufferedInputStream bufferedInputStream = new BufferedInputStream(inputStream, 5000);
                this.f4075d = m4872g(bufferedInputStream);
                inputStream = bufferedInputStream;
            }
            if (m4864K(this.f4075d)) {
                C1421f fVar = new C1421f(inputStream);
                if (this.f4076e) {
                    m4878m(fVar);
                } else {
                    int i2 = this.f4075d;
                    if (i2 == 12) {
                        m4870e(fVar);
                    } else if (i2 == 7) {
                        m4873h(fVar);
                    } else if (i2 == 10) {
                        m4877l(fVar);
                    } else {
                        m4876k(fVar);
                    }
                }
                fVar.mo4132o((long) this.f4087p);
                m4863J(fVar);
            } else {
                C1417b bVar = new C1417b(inputStream);
                int i3 = this.f4075d;
                if (i3 == 4) {
                    m4871f(bVar, 0, 0);
                } else if (i3 == 13) {
                    m4874i(bVar);
                } else if (i3 == 9) {
                    m4875j(bVar);
                } else if (i3 == 14) {
                    m4879n(bVar);
                }
            }
            m4868a();
            if (!f4065u) {
                return;
            }
            m4857D();
            return;
        }
        throw new NullPointerException("inputstream shouldn't be null");
    }

    /* renamed from: C */
    private void m4856C(C1417b bVar) {
        ByteOrder E = m4858E(bVar);
        this.f4079h = E;
        bVar.mo4103m(E);
        int readUnsignedShort = bVar.readUnsignedShort();
        int i = this.f4075d;
        if (i == 7 || i == 10 || readUnsignedShort == 42) {
            int readInt = bVar.readInt();
            if (readInt >= 8) {
                int i2 = readInt - 8;
                if (i2 > 0) {
                    bVar.mo4105n(i2);
                    return;
                }
                return;
            }
            throw new IOException("Invalid first Ifd offset: " + readInt);
        }
        throw new IOException("Invalid start code: " + Integer.toHexString(readUnsignedShort));
    }

    /* renamed from: D */
    private void m4857D() {
        for (int i = 0; i < this.f4077f.length; i++) {
            Log.d("ExifInterface", "The size of tag group[" + i + "]: " + this.f4077f[i].size());
            for (Map.Entry entry : this.f4077f[i].entrySet()) {
                C1418c cVar = (C1418c) entry.getValue();
                Log.d("ExifInterface", "tagName: " + ((String) entry.getKey()) + ", tagType: " + cVar.toString() + ", tagValue: '" + cVar.mo4126j(this.f4079h) + "'");
            }
        }
    }

    /* renamed from: E */
    private ByteOrder m4858E(C1417b bVar) {
        short readShort = bVar.readShort();
        if (readShort == 18761) {
            if (f4065u) {
                Log.d("ExifInterface", "readExifSegment: Byte Align II");
            }
            return ByteOrder.LITTLE_ENDIAN;
        } else if (readShort == 19789) {
            if (f4065u) {
                Log.d("ExifInterface", "readExifSegment: Byte Align MM");
            }
            return ByteOrder.BIG_ENDIAN;
        } else {
            throw new IOException("Invalid byte order: " + Integer.toHexString(readShort));
        }
    }

    /* renamed from: F */
    private void m4859F(byte[] bArr, int i) {
        C1421f fVar = new C1421f(bArr);
        m4856C(fVar);
        m4860G(fVar, i);
    }

    /* JADX WARNING: Removed duplicated region for block: B:42:0x0132  */
    /* JADX WARNING: Removed duplicated region for block: B:43:0x013a  */
    /* JADX WARNING: Removed duplicated region for block: B:84:0x0228  */
    /* JADX WARNING: Removed duplicated region for block: B:87:0x0246  */
    /* JADX WARNING: Removed duplicated region for block: B:92:0x0282  */
    /* renamed from: G */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void m4860G(androidx.exifinterface.media.C1415a.C1421f r30, int r31) {
        /*
            r29 = this;
            r0 = r29
            r1 = r30
            r2 = r31
            java.util.Set r3 = r0.f4078g
            int r4 = r1.f4099f
            java.lang.Integer r4 = java.lang.Integer.valueOf(r4)
            r3.add(r4)
            short r3 = r30.readShort()
            boolean r4 = f4065u
            java.lang.String r5 = "ExifInterface"
            if (r4 == 0) goto L_0x002f
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            java.lang.String r6 = "numberOfDirectoryEntry: "
            r4.append(r6)
            r4.append(r3)
            java.lang.String r4 = r4.toString()
            android.util.Log.d(r5, r4)
        L_0x002f:
            if (r3 > 0) goto L_0x0032
            return
        L_0x0032:
            r4 = 0
            r6 = r4
        L_0x0034:
            r7 = 5
            if (r6 >= r3) goto L_0x0322
            int r12 = r30.readUnsignedShort()
            int r13 = r30.readUnsignedShort()
            int r15 = r30.readInt()
            int r14 = r30.mo4100a()
            long r8 = (long) r14
            r18 = 4
            long r8 = r8 + r18
            java.util.HashMap[] r14 = f4055k0
            r14 = r14[r2]
            java.lang.Integer r11 = java.lang.Integer.valueOf(r12)
            java.lang.Object r11 = r14.get(r11)
            androidx.exifinterface.media.a$d r11 = (androidx.exifinterface.media.C1415a.C1419d) r11
            boolean r14 = f4065u
            r10 = 3
            if (r14 == 0) goto L_0x0090
            java.lang.Object[] r7 = new java.lang.Object[r7]
            java.lang.Integer r23 = java.lang.Integer.valueOf(r31)
            r7[r4] = r23
            java.lang.Integer r23 = java.lang.Integer.valueOf(r12)
            r21 = 1
            r7[r21] = r23
            if (r11 == 0) goto L_0x0074
            java.lang.String r4 = r11.f4106b
            goto L_0x0075
        L_0x0074:
            r4 = 0
        L_0x0075:
            r22 = 2
            r7[r22] = r4
            java.lang.Integer r4 = java.lang.Integer.valueOf(r13)
            r7[r10] = r4
            java.lang.Integer r4 = java.lang.Integer.valueOf(r15)
            r20 = 4
            r7[r20] = r4
            java.lang.String r4 = "ifdType: %d, tagNumber: %d, tagName: %s, dataFormat: %d, numberOfComponents: %d"
            java.lang.String r4 = java.lang.String.format(r4, r7)
            android.util.Log.d(r5, r4)
        L_0x0090:
            r4 = 7
            if (r11 != 0) goto L_0x00ae
            if (r14 == 0) goto L_0x00a9
            java.lang.StringBuilder r7 = new java.lang.StringBuilder
            r7.<init>()
            java.lang.String r10 = "Skip the tag entry since tag number is not defined: "
            r7.append(r10)
            r7.append(r12)
            java.lang.String r7 = r7.toString()
            android.util.Log.d(r5, r7)
        L_0x00a9:
            r10 = r5
            r25 = r6
            goto L_0x012d
        L_0x00ae:
            if (r13 <= 0) goto L_0x0114
            int[] r7 = f4041W
            int r10 = r7.length
            if (r13 < r10) goto L_0x00b6
            goto L_0x0114
        L_0x00b6:
            boolean r10 = r11.mo4129a(r13)
            if (r10 != 0) goto L_0x00e1
            if (r14 == 0) goto L_0x00a9
            java.lang.StringBuilder r7 = new java.lang.StringBuilder
            r7.<init>()
            java.lang.String r10 = "Skip the tag entry since data format ("
            r7.append(r10)
            java.lang.String[] r10 = f4040V
            r10 = r10[r13]
            r7.append(r10)
            java.lang.String r10 = ") is unexpected for tag: "
            r7.append(r10)
            java.lang.String r10 = r11.f4106b
            r7.append(r10)
            java.lang.String r7 = r7.toString()
            android.util.Log.d(r5, r7)
            goto L_0x00a9
        L_0x00e1:
            if (r13 != r4) goto L_0x00e5
            int r13 = r11.f4107c
        L_0x00e5:
            r10 = r5
            long r4 = (long) r15
            r7 = r7[r13]
            r25 = r6
            long r6 = (long) r7
            long r4 = r4 * r6
            r6 = 0
            int r26 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r26 < 0) goto L_0x00fd
            r6 = 2147483647(0x7fffffff, double:1.060997895E-314)
            int r6 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r6 <= 0) goto L_0x00fb
            goto L_0x00fd
        L_0x00fb:
            r6 = 1
            goto L_0x0130
        L_0x00fd:
            if (r14 == 0) goto L_0x012f
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            r6.<init>()
            java.lang.String r7 = "Skip the tag entry since the number of components is invalid: "
            r6.append(r7)
            r6.append(r15)
            java.lang.String r6 = r6.toString()
            android.util.Log.d(r10, r6)
            goto L_0x012f
        L_0x0114:
            r10 = r5
            r25 = r6
            if (r14 == 0) goto L_0x012d
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            java.lang.String r5 = "Skip the tag entry since data format is invalid: "
            r4.append(r5)
            r4.append(r13)
            java.lang.String r4 = r4.toString()
            android.util.Log.d(r10, r4)
        L_0x012d:
            r4 = 0
        L_0x012f:
            r6 = 0
        L_0x0130:
            if (r6 != 0) goto L_0x013a
            r1.mo4132o(r8)
            r26 = r3
            r8 = r10
            goto L_0x0319
        L_0x013a:
            int r6 = (r4 > r18 ? 1 : (r4 == r18 ? 0 : -1))
            java.lang.String r7 = "Compression"
            if (r6 <= 0) goto L_0x01c4
            int r6 = r30.readInt()
            r26 = r3
            if (r14 == 0) goto L_0x015f
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            r27 = r8
            java.lang.String r8 = "seek to data offset: "
            r3.append(r8)
            r3.append(r6)
            java.lang.String r3 = r3.toString()
            android.util.Log.d(r10, r3)
            goto L_0x0161
        L_0x015f:
            r27 = r8
        L_0x0161:
            int r3 = r0.f4075d
            r8 = 7
            if (r3 != r8) goto L_0x01bb
            java.lang.String r3 = r11.f4106b
            java.lang.String r8 = "MakerNote"
            boolean r3 = r8.equals(r3)
            if (r3 == 0) goto L_0x0173
            r0.f4088q = r6
            goto L_0x01bb
        L_0x0173:
            r3 = 6
            if (r2 != r3) goto L_0x01bb
            java.lang.String r8 = "ThumbnailImage"
            java.lang.String r9 = r11.f4106b
            boolean r8 = r8.equals(r9)
            if (r8 == 0) goto L_0x01bb
            r0.f4089r = r6
            r0.f4090s = r15
            java.nio.ByteOrder r8 = r0.f4079h
            androidx.exifinterface.media.a$c r3 = androidx.exifinterface.media.C1415a.C1418c.m4903f(r3, r8)
            int r8 = r0.f4089r
            long r8 = (long) r8
            r18 = r15
            java.nio.ByteOrder r15 = r0.f4079h
            androidx.exifinterface.media.a$c r8 = androidx.exifinterface.media.C1415a.C1418c.m4899b(r8, r15)
            int r9 = r0.f4090s
            r24 = r10
            long r9 = (long) r9
            java.nio.ByteOrder r15 = r0.f4079h
            androidx.exifinterface.media.a$c r9 = androidx.exifinterface.media.C1415a.C1418c.m4899b(r9, r15)
            java.util.HashMap[] r10 = r0.f4077f
            r15 = 4
            r10 = r10[r15]
            r10.put(r7, r3)
            java.util.HashMap[] r3 = r0.f4077f
            r3 = r3[r15]
            java.lang.String r10 = "JPEGInterchangeFormat"
            r3.put(r10, r8)
            java.util.HashMap[] r3 = r0.f4077f
            r3 = r3[r15]
            java.lang.String r8 = "JPEGInterchangeFormatLength"
            r3.put(r8, r9)
            goto L_0x01bf
        L_0x01bb:
            r24 = r10
            r18 = r15
        L_0x01bf:
            long r8 = (long) r6
            r1.mo4132o(r8)
            goto L_0x01cc
        L_0x01c4:
            r26 = r3
            r27 = r8
            r24 = r10
            r18 = r15
        L_0x01cc:
            java.util.HashMap r3 = f4058n0
            java.lang.Integer r6 = java.lang.Integer.valueOf(r12)
            java.lang.Object r3 = r3.get(r6)
            java.lang.Integer r3 = (java.lang.Integer) r3
            if (r14 == 0) goto L_0x01f9
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            r6.<init>()
            java.lang.String r8 = "nextIfdType: "
            r6.append(r8)
            r6.append(r3)
            java.lang.String r8 = " byteCount: "
            r6.append(r8)
            r6.append(r4)
            java.lang.String r6 = r6.toString()
            r8 = r24
            android.util.Log.d(r8, r6)
            goto L_0x01fb
        L_0x01f9:
            r8 = r24
        L_0x01fb:
            r6 = 8
            if (r3 == 0) goto L_0x029f
            r4 = 3
            if (r13 == r4) goto L_0x0221
            r4 = 4
            if (r13 == r4) goto L_0x021c
            if (r13 == r6) goto L_0x0217
            r4 = 9
            if (r13 == r4) goto L_0x0212
            r4 = 13
            if (r13 == r4) goto L_0x0212
            r4 = -1
            goto L_0x0226
        L_0x0212:
            int r4 = r30.readInt()
            goto L_0x0225
        L_0x0217:
            short r4 = r30.readShort()
            goto L_0x0225
        L_0x021c:
            long r4 = r30.mo4102k()
            goto L_0x0226
        L_0x0221:
            int r4 = r30.readUnsignedShort()
        L_0x0225:
            long r4 = (long) r4
        L_0x0226:
            if (r14 == 0) goto L_0x0240
            r6 = 2
            java.lang.Object[] r6 = new java.lang.Object[r6]
            java.lang.Long r7 = java.lang.Long.valueOf(r4)
            r9 = 0
            r6[r9] = r7
            java.lang.String r7 = r11.f4106b
            r9 = 1
            r6[r9] = r7
            java.lang.String r7 = "Offset: %d, tagName: %s"
            java.lang.String r6 = java.lang.String.format(r7, r6)
            android.util.Log.d(r8, r6)
        L_0x0240:
            r6 = 0
            int r6 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r6 <= 0) goto L_0x0282
            java.util.Set r6 = r0.f4078g
            int r7 = (int) r4
            java.lang.Integer r7 = java.lang.Integer.valueOf(r7)
            boolean r6 = r6.contains(r7)
            if (r6 != 0) goto L_0x025e
            r1.mo4132o(r4)
            int r3 = r3.intValue()
            r0.m4860G(r1, r3)
            goto L_0x0298
        L_0x025e:
            if (r14 == 0) goto L_0x0298
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            r6.<init>()
            java.lang.String r7 = "Skip jump into the IFD since it has already been read: IfdType "
            r6.append(r7)
            r6.append(r3)
            java.lang.String r3 = " (at "
            r6.append(r3)
            r6.append(r4)
            java.lang.String r3 = ")"
            r6.append(r3)
            java.lang.String r3 = r6.toString()
            android.util.Log.d(r8, r3)
            goto L_0x0298
        L_0x0282:
            if (r14 == 0) goto L_0x0298
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            java.lang.String r6 = "Skip jump into the IFD since its offset is invalid: "
            r3.append(r6)
            r3.append(r4)
            java.lang.String r3 = r3.toString()
            android.util.Log.d(r8, r3)
        L_0x0298:
            r9 = r27
            r1.mo4132o(r9)
            goto L_0x0319
        L_0x029f:
            r9 = r27
            int r3 = r30.mo4100a()
            int r12 = r0.f4087p
            int r3 = r3 + r12
            int r4 = (int) r4
            byte[] r4 = new byte[r4]
            r1.readFully(r4)
            androidx.exifinterface.media.a$c r5 = new androidx.exifinterface.media.a$c
            long r14 = (long) r3
            r19 = r14
            r14 = r5
            r3 = r18
            r15 = r13
            r16 = r3
            r17 = r19
            r19 = r4
            r14.<init>(r15, r16, r17, r19)
            java.util.HashMap[] r3 = r0.f4077f
            r3 = r3[r2]
            java.lang.String r4 = r11.f4106b
            r3.put(r4, r5)
            java.lang.String r3 = "DNGVersion"
            java.lang.String r4 = r11.f4106b
            boolean r3 = r3.equals(r4)
            if (r3 == 0) goto L_0x02d6
            r3 = 3
            r0.f4075d = r3
        L_0x02d6:
            java.lang.String r3 = "Make"
            java.lang.String r4 = r11.f4106b
            boolean r3 = r3.equals(r4)
            if (r3 != 0) goto L_0x02ea
            java.lang.String r3 = "Model"
            java.lang.String r4 = r11.f4106b
            boolean r3 = r3.equals(r4)
            if (r3 == 0) goto L_0x02f8
        L_0x02ea:
            java.nio.ByteOrder r3 = r0.f4079h
            java.lang.String r3 = r5.mo4126j(r3)
            java.lang.String r4 = "PENTAX"
            boolean r3 = r3.contains(r4)
            if (r3 != 0) goto L_0x030b
        L_0x02f8:
            java.lang.String r3 = r11.f4106b
            boolean r3 = r7.equals(r3)
            if (r3 == 0) goto L_0x030d
            java.nio.ByteOrder r3 = r0.f4079h
            int r3 = r5.mo4125i(r3)
            r4 = 65535(0xffff, float:9.1834E-41)
            if (r3 != r4) goto L_0x030d
        L_0x030b:
            r0.f4075d = r6
        L_0x030d:
            int r3 = r30.mo4100a()
            long r3 = (long) r3
            int r3 = (r3 > r9 ? 1 : (r3 == r9 ? 0 : -1))
            if (r3 == 0) goto L_0x0319
            r1.mo4132o(r9)
        L_0x0319:
            int r6 = r25 + 1
            short r6 = (short) r6
            r5 = r8
            r3 = r26
            r4 = 0
            goto L_0x0034
        L_0x0322:
            r8 = r5
            int r2 = r30.readInt()
            boolean r3 = f4065u
            if (r3 == 0) goto L_0x033e
            r4 = 1
            java.lang.Object[] r4 = new java.lang.Object[r4]
            java.lang.Integer r5 = java.lang.Integer.valueOf(r2)
            r6 = 0
            r4[r6] = r5
            java.lang.String r5 = "nextIfdOffset: %d"
            java.lang.String r4 = java.lang.String.format(r5, r4)
            android.util.Log.d(r8, r4)
        L_0x033e:
            long r4 = (long) r2
            r9 = 0
            int r6 = (r4 > r9 ? 1 : (r4 == r9 ? 0 : -1))
            if (r6 <= 0) goto L_0x0388
            java.util.Set r6 = r0.f4078g
            java.lang.Integer r9 = java.lang.Integer.valueOf(r2)
            boolean r6 = r6.contains(r9)
            if (r6 != 0) goto L_0x0371
            r1.mo4132o(r4)
            java.util.HashMap[] r2 = r0.f4077f
            r3 = 4
            r2 = r2[r3]
            boolean r2 = r2.isEmpty()
            if (r2 == 0) goto L_0x0363
            r0.m4860G(r1, r3)
            goto L_0x039e
        L_0x0363:
            java.util.HashMap[] r2 = r0.f4077f
            r2 = r2[r7]
            boolean r2 = r2.isEmpty()
            if (r2 == 0) goto L_0x039e
            r0.m4860G(r1, r7)
            goto L_0x039e
        L_0x0371:
            if (r3 == 0) goto L_0x039e
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r3 = "Stop reading file since re-reading an IFD may cause an infinite loop: "
            r1.append(r3)
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            android.util.Log.d(r8, r1)
            goto L_0x039e
        L_0x0388:
            if (r3 == 0) goto L_0x039e
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r3 = "Stop reading file since a wrong offset may cause an infinite loop: "
            r1.append(r3)
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            android.util.Log.d(r8, r1)
        L_0x039e:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.exifinterface.media.C1415a.m4860G(androidx.exifinterface.media.a$f, int):void");
    }

    /* renamed from: H */
    private void m4861H(int i, String str, String str2) {
        if (!this.f4077f[i].isEmpty() && this.f4077f[i].get(str) != null) {
            HashMap hashMap = this.f4077f[i];
            hashMap.put(str2, hashMap.get(str));
            this.f4077f[i].remove(str);
        }
    }

    /* renamed from: I */
    private void m4862I(C1421f fVar, int i) {
        C1418c cVar = (C1418c) this.f4077f[i].get("ImageLength");
        C1418c cVar2 = (C1418c) this.f4077f[i].get("ImageWidth");
        if (cVar == null || cVar2 == null) {
            C1418c cVar3 = (C1418c) this.f4077f[i].get("JPEGInterchangeFormat");
            C1418c cVar4 = (C1418c) this.f4077f[i].get("JPEGInterchangeFormatLength");
            if (cVar3 != null && cVar4 != null) {
                int i2 = cVar3.mo4125i(this.f4079h);
                int i3 = cVar3.mo4125i(this.f4079h);
                fVar.mo4132o((long) i2);
                byte[] bArr = new byte[i3];
                fVar.read(bArr);
                m4871f(new C1417b(bArr), i2, i);
            }
        }
    }

    /* renamed from: J */
    private void m4863J(C1417b bVar) {
        HashMap hashMap = this.f4077f[4];
        C1418c cVar = (C1418c) hashMap.get("Compression");
        if (cVar != null) {
            int i = cVar.mo4125i(this.f4079h);
            this.f4086o = i;
            if (i != 1) {
                if (i == 6) {
                    m4880o(bVar, hashMap);
                    return;
                } else if (i != 7) {
                    return;
                }
            }
            if (m4890y(hashMap)) {
                m4881p(bVar, hashMap);
                return;
            }
            return;
        }
        this.f4086o = 6;
        m4880o(bVar, hashMap);
    }

    /* renamed from: K */
    private static boolean m4864K(int i) {
        return (i == 4 || i == 9 || i == 13 || i == 14) ? false : true;
    }

    /* renamed from: L */
    private void m4865L(int i, int i2) {
        if (!this.f4077f[i].isEmpty() && !this.f4077f[i2].isEmpty()) {
            C1418c cVar = (C1418c) this.f4077f[i].get("ImageLength");
            C1418c cVar2 = (C1418c) this.f4077f[i].get("ImageWidth");
            C1418c cVar3 = (C1418c) this.f4077f[i2].get("ImageLength");
            C1418c cVar4 = (C1418c) this.f4077f[i2].get("ImageWidth");
            if (cVar == null || cVar2 == null) {
                if (f4065u) {
                    Log.d("ExifInterface", "First image does not contain valid size information");
                }
            } else if (cVar3 != null && cVar4 != null) {
                int i3 = cVar.mo4125i(this.f4079h);
                int i4 = cVar2.mo4125i(this.f4079h);
                int i5 = cVar3.mo4125i(this.f4079h);
                int i6 = cVar4.mo4125i(this.f4079h);
                if (i3 < i5 && i4 < i6) {
                    HashMap[] hashMapArr = this.f4077f;
                    HashMap hashMap = hashMapArr[i];
                    hashMapArr[i] = hashMapArr[i2];
                    hashMapArr[i2] = hashMap;
                }
            } else if (f4065u) {
                Log.d("ExifInterface", "Second image does not contain valid size information");
            }
        } else if (f4065u) {
            Log.d("ExifInterface", "Cannot perform swap since only one image data exists");
        }
    }

    /* renamed from: M */
    private void m4866M(C1421f fVar, int i) {
        C1418c cVar;
        C1418c cVar2;
        C1418c cVar3 = (C1418c) this.f4077f[i].get("DefaultCropSize");
        C1418c cVar4 = (C1418c) this.f4077f[i].get("SensorTopBorder");
        C1418c cVar5 = (C1418c) this.f4077f[i].get("SensorLeftBorder");
        C1418c cVar6 = (C1418c) this.f4077f[i].get("SensorBottomBorder");
        C1418c cVar7 = (C1418c) this.f4077f[i].get("SensorRightBorder");
        if (cVar3 != null) {
            if (cVar3.f4101a == 5) {
                C1420e[] eVarArr = (C1420e[]) cVar3.mo4127k(this.f4079h);
                if (eVarArr == null || eVarArr.length != 2) {
                    Log.w("ExifInterface", "Invalid crop size values. cropSize=" + Arrays.toString(eVarArr));
                    return;
                }
                cVar2 = C1418c.m4901d(eVarArr[0], this.f4079h);
                cVar = C1418c.m4901d(eVarArr[1], this.f4079h);
            } else {
                int[] iArr = (int[]) cVar3.mo4127k(this.f4079h);
                if (iArr == null || iArr.length != 2) {
                    Log.w("ExifInterface", "Invalid crop size values. cropSize=" + Arrays.toString(iArr));
                    return;
                }
                cVar2 = C1418c.m4903f(iArr[0], this.f4079h);
                cVar = C1418c.m4903f(iArr[1], this.f4079h);
            }
            this.f4077f[i].put("ImageWidth", cVar2);
            this.f4077f[i].put("ImageLength", cVar);
        } else if (cVar4 == null || cVar5 == null || cVar6 == null || cVar7 == null) {
            m4862I(fVar, i);
        } else {
            int i2 = cVar4.mo4125i(this.f4079h);
            int i3 = cVar6.mo4125i(this.f4079h);
            int i4 = cVar7.mo4125i(this.f4079h);
            int i5 = cVar5.mo4125i(this.f4079h);
            if (i3 > i2 && i4 > i5) {
                C1418c f = C1418c.m4903f(i3 - i2, this.f4079h);
                C1418c f2 = C1418c.m4903f(i4 - i5, this.f4079h);
                this.f4077f[i].put("ImageLength", f);
                this.f4077f[i].put("ImageWidth", f2);
            }
        }
    }

    /* renamed from: N */
    private void m4867N() {
        m4865L(0, 5);
        m4865L(0, 4);
        m4865L(5, 4);
        C1418c cVar = (C1418c) this.f4077f[1].get("PixelXDimension");
        C1418c cVar2 = (C1418c) this.f4077f[1].get("PixelYDimension");
        if (!(cVar == null || cVar2 == null)) {
            this.f4077f[0].put("ImageWidth", cVar);
            this.f4077f[0].put("ImageLength", cVar2);
        }
        if (this.f4077f[4].isEmpty() && m4891z(this.f4077f[5])) {
            HashMap[] hashMapArr = this.f4077f;
            hashMapArr[4] = hashMapArr[5];
            hashMapArr[5] = new HashMap();
        }
        if (!m4891z(this.f4077f[4])) {
            Log.d("ExifInterface", "No image meets the size requirements of a thumbnail image.");
        }
        m4861H(0, "ThumbnailOrientation", "Orientation");
        m4861H(0, "ThumbnailImageLength", "ImageLength");
        m4861H(0, "ThumbnailImageWidth", "ImageWidth");
        m4861H(5, "ThumbnailOrientation", "Orientation");
        m4861H(5, "ThumbnailImageLength", "ImageLength");
        m4861H(5, "ThumbnailImageWidth", "ImageWidth");
        m4861H(4, "Orientation", "ThumbnailOrientation");
        m4861H(4, "ImageLength", "ThumbnailImageLength");
        m4861H(4, "ImageWidth", "ThumbnailImageWidth");
    }

    /* renamed from: a */
    private void m4868a() {
        String b = mo4095b("DateTimeOriginal");
        if (b != null && mo4095b("DateTime") == null) {
            this.f4077f[0].put("DateTime", C1418c.m4898a(b));
        }
        if (mo4095b("ImageWidth") == null) {
            this.f4077f[0].put("ImageWidth", C1418c.m4899b(0, this.f4079h));
        }
        if (mo4095b("ImageLength") == null) {
            this.f4077f[0].put("ImageLength", C1418c.m4899b(0, this.f4079h));
        }
        if (mo4095b("Orientation") == null) {
            this.f4077f[0].put("Orientation", C1418c.m4899b(0, this.f4079h));
        }
        if (mo4095b("LightSource") == null) {
            this.f4077f[1].put("LightSource", C1418c.m4899b(0, this.f4079h));
        }
    }

    /* renamed from: d */
    private C1418c m4869d(String str) {
        if (str != null) {
            if ("ISOSpeedRatings".equals(str)) {
                if (f4065u) {
                    Log.d("ExifInterface", "getExifAttribute: Replacing TAG_ISO_SPEED_RATINGS with TAG_PHOTOGRAPHIC_SENSITIVITY.");
                }
                str = "PhotographicSensitivity";
            }
            for (int i = 0; i < f4053i0.length; i++) {
                C1418c cVar = (C1418c) this.f4077f[i].get(str);
                if (cVar != null) {
                    return cVar;
                }
            }
            return null;
        }
        throw new NullPointerException("tag shouldn't be null");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:53:0x0138, code lost:
        r13 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:56:0x0141, code lost:
        throw new java.lang.UnsupportedOperationException("Failed to read EXIF from HEIF file. Given stream is either malformed or unsupported.");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:57:0x0142, code lost:
        r1.release();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:58:0x0145, code lost:
        throw r13;
     */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Missing exception handler attribute for start block: B:54:0x013a */
    /* renamed from: e */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void m4870e(androidx.exifinterface.media.C1415a.C1421f r13) {
        /*
            r12 = this;
            java.lang.String r0 = "yes"
            int r1 = android.os.Build.VERSION.SDK_INT
            r2 = 28
            if (r1 < r2) goto L_0x0146
            android.media.MediaMetadataRetriever r1 = new android.media.MediaMetadataRetriever
            r1.<init>()
            androidx.exifinterface.media.a$a r2 = new androidx.exifinterface.media.a$a     // Catch:{ RuntimeException -> 0x013a }
            r2.<init>(r13)     // Catch:{ RuntimeException -> 0x013a }
            androidx.exifinterface.media.C1422b.C1424b.m4918a(r1, r2)     // Catch:{ RuntimeException -> 0x013a }
            r2 = 33
            java.lang.String r2 = r1.extractMetadata(r2)     // Catch:{ RuntimeException -> 0x013a }
            r3 = 34
            java.lang.String r3 = r1.extractMetadata(r3)     // Catch:{ RuntimeException -> 0x013a }
            r4 = 26
            java.lang.String r4 = r1.extractMetadata(r4)     // Catch:{ RuntimeException -> 0x013a }
            r5 = 17
            java.lang.String r5 = r1.extractMetadata(r5)     // Catch:{ RuntimeException -> 0x013a }
            boolean r4 = r0.equals(r4)     // Catch:{ RuntimeException -> 0x013a }
            if (r4 == 0) goto L_0x0046
            r0 = 29
            java.lang.String r0 = r1.extractMetadata(r0)     // Catch:{ RuntimeException -> 0x013a }
            r4 = 30
            java.lang.String r4 = r1.extractMetadata(r4)     // Catch:{ RuntimeException -> 0x013a }
            r5 = 31
            java.lang.String r5 = r1.extractMetadata(r5)     // Catch:{ RuntimeException -> 0x013a }
            goto L_0x0062
        L_0x0046:
            boolean r0 = r0.equals(r5)     // Catch:{ RuntimeException -> 0x013a }
            if (r0 == 0) goto L_0x005f
            r0 = 18
            java.lang.String r0 = r1.extractMetadata(r0)     // Catch:{ RuntimeException -> 0x013a }
            r4 = 19
            java.lang.String r4 = r1.extractMetadata(r4)     // Catch:{ RuntimeException -> 0x013a }
            r5 = 24
            java.lang.String r5 = r1.extractMetadata(r5)     // Catch:{ RuntimeException -> 0x013a }
            goto L_0x0062
        L_0x005f:
            r0 = 0
            r4 = r0
            r5 = r4
        L_0x0062:
            r6 = 0
            if (r0 == 0) goto L_0x0078
            java.util.HashMap[] r7 = r12.f4077f     // Catch:{ RuntimeException -> 0x013a }
            r7 = r7[r6]     // Catch:{ RuntimeException -> 0x013a }
            java.lang.String r8 = "ImageWidth"
            int r9 = java.lang.Integer.parseInt(r0)     // Catch:{ RuntimeException -> 0x013a }
            java.nio.ByteOrder r10 = r12.f4079h     // Catch:{ RuntimeException -> 0x013a }
            androidx.exifinterface.media.a$c r9 = androidx.exifinterface.media.C1415a.C1418c.m4903f(r9, r10)     // Catch:{ RuntimeException -> 0x013a }
            r7.put(r8, r9)     // Catch:{ RuntimeException -> 0x013a }
        L_0x0078:
            if (r4 == 0) goto L_0x008d
            java.util.HashMap[] r7 = r12.f4077f     // Catch:{ RuntimeException -> 0x013a }
            r7 = r7[r6]     // Catch:{ RuntimeException -> 0x013a }
            java.lang.String r8 = "ImageLength"
            int r9 = java.lang.Integer.parseInt(r4)     // Catch:{ RuntimeException -> 0x013a }
            java.nio.ByteOrder r10 = r12.f4079h     // Catch:{ RuntimeException -> 0x013a }
            androidx.exifinterface.media.a$c r9 = androidx.exifinterface.media.C1415a.C1418c.m4903f(r9, r10)     // Catch:{ RuntimeException -> 0x013a }
            r7.put(r8, r9)     // Catch:{ RuntimeException -> 0x013a }
        L_0x008d:
            r7 = 6
            if (r5 == 0) goto L_0x00b7
            int r8 = java.lang.Integer.parseInt(r5)     // Catch:{ RuntimeException -> 0x013a }
            r9 = 90
            if (r8 == r9) goto L_0x00a7
            r9 = 180(0xb4, float:2.52E-43)
            if (r8 == r9) goto L_0x00a5
            r9 = 270(0x10e, float:3.78E-43)
            if (r8 == r9) goto L_0x00a2
            r8 = 1
            goto L_0x00a8
        L_0x00a2:
            r8 = 8
            goto L_0x00a8
        L_0x00a5:
            r8 = 3
            goto L_0x00a8
        L_0x00a7:
            r8 = r7
        L_0x00a8:
            java.util.HashMap[] r9 = r12.f4077f     // Catch:{ RuntimeException -> 0x013a }
            r9 = r9[r6]     // Catch:{ RuntimeException -> 0x013a }
            java.lang.String r10 = "Orientation"
            java.nio.ByteOrder r11 = r12.f4079h     // Catch:{ RuntimeException -> 0x013a }
            androidx.exifinterface.media.a$c r8 = androidx.exifinterface.media.C1415a.C1418c.m4903f(r8, r11)     // Catch:{ RuntimeException -> 0x013a }
            r9.put(r10, r8)     // Catch:{ RuntimeException -> 0x013a }
        L_0x00b7:
            if (r2 == 0) goto L_0x010a
            if (r3 == 0) goto L_0x010a
            int r2 = java.lang.Integer.parseInt(r2)     // Catch:{ RuntimeException -> 0x013a }
            int r3 = java.lang.Integer.parseInt(r3)     // Catch:{ RuntimeException -> 0x013a }
            if (r3 <= r7) goto L_0x0102
            long r8 = (long) r2     // Catch:{ RuntimeException -> 0x013a }
            r13.mo4132o(r8)     // Catch:{ RuntimeException -> 0x013a }
            byte[] r8 = new byte[r7]     // Catch:{ RuntimeException -> 0x013a }
            int r9 = r13.read(r8)     // Catch:{ RuntimeException -> 0x013a }
            if (r9 != r7) goto L_0x00fa
            int r2 = r2 + r7
            int r3 = r3 + -6
            byte[] r7 = f4060p0     // Catch:{ RuntimeException -> 0x013a }
            boolean r7 = java.util.Arrays.equals(r8, r7)     // Catch:{ RuntimeException -> 0x013a }
            if (r7 == 0) goto L_0x00f2
            byte[] r7 = new byte[r3]     // Catch:{ RuntimeException -> 0x013a }
            int r13 = r13.read(r7)     // Catch:{ RuntimeException -> 0x013a }
            if (r13 != r3) goto L_0x00ea
            r12.f4087p = r2     // Catch:{ RuntimeException -> 0x013a }
            r12.m4859F(r7, r6)     // Catch:{ RuntimeException -> 0x013a }
            goto L_0x010a
        L_0x00ea:
            java.io.IOException r13 = new java.io.IOException     // Catch:{ RuntimeException -> 0x013a }
            java.lang.String r0 = "Can't read exif"
            r13.<init>(r0)     // Catch:{ RuntimeException -> 0x013a }
            throw r13     // Catch:{ RuntimeException -> 0x013a }
        L_0x00f2:
            java.io.IOException r13 = new java.io.IOException     // Catch:{ RuntimeException -> 0x013a }
            java.lang.String r0 = "Invalid identifier"
            r13.<init>(r0)     // Catch:{ RuntimeException -> 0x013a }
            throw r13     // Catch:{ RuntimeException -> 0x013a }
        L_0x00fa:
            java.io.IOException r13 = new java.io.IOException     // Catch:{ RuntimeException -> 0x013a }
            java.lang.String r0 = "Can't read identifier"
            r13.<init>(r0)     // Catch:{ RuntimeException -> 0x013a }
            throw r13     // Catch:{ RuntimeException -> 0x013a }
        L_0x0102:
            java.io.IOException r13 = new java.io.IOException     // Catch:{ RuntimeException -> 0x013a }
            java.lang.String r0 = "Invalid exif length"
            r13.<init>(r0)     // Catch:{ RuntimeException -> 0x013a }
            throw r13     // Catch:{ RuntimeException -> 0x013a }
        L_0x010a:
            boolean r13 = f4065u     // Catch:{ RuntimeException -> 0x013a }
            if (r13 == 0) goto L_0x0134
            java.lang.String r13 = "ExifInterface"
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch:{ RuntimeException -> 0x013a }
            r2.<init>()     // Catch:{ RuntimeException -> 0x013a }
            java.lang.String r3 = "Heif meta: "
            r2.append(r3)     // Catch:{ RuntimeException -> 0x013a }
            r2.append(r0)     // Catch:{ RuntimeException -> 0x013a }
            java.lang.String r0 = "x"
            r2.append(r0)     // Catch:{ RuntimeException -> 0x013a }
            r2.append(r4)     // Catch:{ RuntimeException -> 0x013a }
            java.lang.String r0 = ", rotation "
            r2.append(r0)     // Catch:{ RuntimeException -> 0x013a }
            r2.append(r5)     // Catch:{ RuntimeException -> 0x013a }
            java.lang.String r0 = r2.toString()     // Catch:{ RuntimeException -> 0x013a }
            android.util.Log.d(r13, r0)     // Catch:{ RuntimeException -> 0x013a }
        L_0x0134:
            r1.release()
            return
        L_0x0138:
            r13 = move-exception
            goto L_0x0142
        L_0x013a:
            java.lang.UnsupportedOperationException r13 = new java.lang.UnsupportedOperationException     // Catch:{ all -> 0x0138 }
            java.lang.String r0 = "Failed to read EXIF from HEIF file. Given stream is either malformed or unsupported."
            r13.<init>(r0)     // Catch:{ all -> 0x0138 }
            throw r13     // Catch:{ all -> 0x0138 }
        L_0x0142:
            r1.release()
            throw r13
        L_0x0146:
            java.lang.UnsupportedOperationException r13 = new java.lang.UnsupportedOperationException
            java.lang.String r0 = "Reading EXIF from HEIF files is supported from SDK 28 and above"
            r13.<init>(r0)
            throw r13
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.exifinterface.media.C1415a.m4870e(androidx.exifinterface.media.a$f):void");
    }

    /* JADX WARNING: Removed duplicated region for block: B:33:0x00c4  */
    /* JADX WARNING: Removed duplicated region for block: B:34:0x00c7  */
    /* JADX WARNING: Removed duplicated region for block: B:37:0x00dd  */
    /* JADX WARNING: Removed duplicated region for block: B:38:0x00e0  */
    /* JADX WARNING: Removed duplicated region for block: B:60:0x0184 A[LOOP:0: B:8:0x0038->B:60:0x0184, LOOP_END] */
    /* JADX WARNING: Removed duplicated region for block: B:73:0x018e A[SYNTHETIC] */
    /* renamed from: f */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void m4871f(androidx.exifinterface.media.C1415a.C1417b r22, int r23, int r24) {
        /*
            r21 = this;
            r0 = r21
            r1 = r22
            r2 = r24
            boolean r3 = f4065u
            java.lang.String r4 = "ExifInterface"
            if (r3 == 0) goto L_0x0020
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            java.lang.String r5 = "getJpegAttributes starting with: "
            r3.append(r5)
            r3.append(r1)
            java.lang.String r3 = r3.toString()
            android.util.Log.d(r4, r3)
        L_0x0020:
            java.nio.ByteOrder r3 = java.nio.ByteOrder.BIG_ENDIAN
            r1.mo4103m(r3)
            byte r3 = r22.readByte()
            java.lang.String r5 = "Invalid marker: "
            r6 = -1
            if (r3 != r6) goto L_0x01d8
            byte r7 = r22.readByte()
            r8 = -40
            if (r7 != r8) goto L_0x01bd
            r3 = 2
            r5 = r3
        L_0x0038:
            byte r7 = r22.readByte()
            if (r7 != r6) goto L_0x01a0
            r7 = 1
            int r5 = r5 + r7
            byte r8 = r22.readByte()
            boolean r9 = f4065u
            if (r9 == 0) goto L_0x0062
            java.lang.StringBuilder r10 = new java.lang.StringBuilder
            r10.<init>()
            java.lang.String r11 = "Found JPEG segment indicator: "
            r10.append(r11)
            r11 = r8 & 255(0xff, float:3.57E-43)
            java.lang.String r11 = java.lang.Integer.toHexString(r11)
            r10.append(r11)
            java.lang.String r10 = r10.toString()
            android.util.Log.d(r4, r10)
        L_0x0062:
            int r5 = r5 + r7
            r10 = -39
            if (r8 == r10) goto L_0x019a
            r10 = -38
            if (r8 != r10) goto L_0x006d
            goto L_0x019a
        L_0x006d:
            int r10 = r22.readUnsignedShort()
            int r10 = r10 - r3
            int r5 = r5 + r3
            if (r9 == 0) goto L_0x009e
            java.lang.StringBuilder r9 = new java.lang.StringBuilder
            r9.<init>()
            java.lang.String r11 = "JPEG segment: "
            r9.append(r11)
            r11 = r8 & 255(0xff, float:3.57E-43)
            java.lang.String r11 = java.lang.Integer.toHexString(r11)
            r9.append(r11)
            java.lang.String r11 = " (length: "
            r9.append(r11)
            int r11 = r10 + 2
            r9.append(r11)
            java.lang.String r11 = ")"
            r9.append(r11)
            java.lang.String r9 = r9.toString()
            android.util.Log.d(r4, r9)
        L_0x009e:
            java.lang.String r9 = "Invalid length"
            if (r10 < 0) goto L_0x0194
            r11 = -31
            r12 = 0
            if (r8 == r11) goto L_0x0121
            r11 = -2
            if (r8 == r11) goto L_0x00f3
            switch(r8) {
                case -64: goto L_0x00ba;
                case -63: goto L_0x00ba;
                case -62: goto L_0x00ba;
                case -61: goto L_0x00ba;
                default: goto L_0x00ad;
            }
        L_0x00ad:
            switch(r8) {
                case -59: goto L_0x00ba;
                case -58: goto L_0x00ba;
                case -57: goto L_0x00ba;
                default: goto L_0x00b0;
            }
        L_0x00b0:
            switch(r8) {
                case -55: goto L_0x00ba;
                case -54: goto L_0x00ba;
                case -53: goto L_0x00ba;
                default: goto L_0x00b3;
            }
        L_0x00b3:
            switch(r8) {
                case -51: goto L_0x00ba;
                case -50: goto L_0x00ba;
                case -49: goto L_0x00ba;
                default: goto L_0x00b6;
            }
        L_0x00b6:
            r20 = r4
            goto L_0x0182
        L_0x00ba:
            r1.mo4105n(r7)
            java.util.HashMap[] r7 = r0.f4077f
            r7 = r7[r2]
            r8 = 4
            if (r2 == r8) goto L_0x00c7
            java.lang.String r11 = "ImageLength"
            goto L_0x00c9
        L_0x00c7:
            java.lang.String r11 = "ThumbnailImageLength"
        L_0x00c9:
            int r12 = r22.readUnsignedShort()
            long r12 = (long) r12
            java.nio.ByteOrder r14 = r0.f4079h
            androidx.exifinterface.media.a$c r12 = androidx.exifinterface.media.C1415a.C1418c.m4899b(r12, r14)
            r7.put(r11, r12)
            java.util.HashMap[] r7 = r0.f4077f
            r7 = r7[r2]
            if (r2 == r8) goto L_0x00e0
            java.lang.String r8 = "ImageWidth"
            goto L_0x00e2
        L_0x00e0:
            java.lang.String r8 = "ThumbnailImageWidth"
        L_0x00e2:
            int r11 = r22.readUnsignedShort()
            long r11 = (long) r11
            java.nio.ByteOrder r13 = r0.f4079h
            androidx.exifinterface.media.a$c r11 = androidx.exifinterface.media.C1415a.C1418c.m4899b(r11, r13)
            r7.put(r8, r11)
            int r10 = r10 + -5
            goto L_0x00b6
        L_0x00f3:
            byte[] r8 = new byte[r10]
            int r11 = r1.read(r8)
            if (r11 != r10) goto L_0x0119
            java.lang.String r10 = "UserComment"
            java.lang.String r11 = r0.mo4095b(r10)
            if (r11 != 0) goto L_0x0115
            java.util.HashMap[] r11 = r0.f4077f
            r7 = r11[r7]
            java.lang.String r11 = new java.lang.String
            java.nio.charset.Charset r13 = f4059o0
            r11.<init>(r8, r13)
            androidx.exifinterface.media.a$c r8 = androidx.exifinterface.media.C1415a.C1418c.m4898a(r11)
            r7.put(r10, r8)
        L_0x0115:
            r20 = r4
            goto L_0x0181
        L_0x0119:
            java.io.IOException r1 = new java.io.IOException
            java.lang.String r2 = "Invalid exif"
            r1.<init>(r2)
            throw r1
        L_0x0121:
            byte[] r8 = new byte[r10]
            r1.readFully(r8)
            int r11 = r5 + r10
            byte[] r13 = f4060p0
            boolean r14 = androidx.exifinterface.media.C1422b.m4914c(r8, r13)
            if (r14 == 0) goto L_0x0147
            int r7 = r13.length
            byte[] r7 = java.util.Arrays.copyOfRange(r8, r7, r10)
            int r5 = r23 + r5
            int r8 = r13.length
            int r5 = r5 + r8
            r0.f4087p = r5
            r0.m4859F(r7, r2)
            androidx.exifinterface.media.a$b r5 = new androidx.exifinterface.media.a$b
            r5.<init>((byte[]) r7)
            r0.m4863J(r5)
            goto L_0x017e
        L_0x0147:
            byte[] r13 = f4061q0
            boolean r14 = androidx.exifinterface.media.C1422b.m4914c(r8, r13)
            if (r14 == 0) goto L_0x017e
            int r14 = r13.length
            int r5 = r5 + r14
            int r13 = r13.length
            byte[] r8 = java.util.Arrays.copyOfRange(r8, r13, r10)
            java.lang.String r10 = "Xmp"
            java.lang.String r13 = r0.mo4095b(r10)
            if (r13 != 0) goto L_0x017e
            java.util.HashMap[] r13 = r0.f4077f
            r13 = r13[r12]
            androidx.exifinterface.media.a$c r15 = new androidx.exifinterface.media.a$c
            r16 = 1
            int r14 = r8.length
            r20 = r4
            long r3 = (long) r5
            r5 = r14
            r14 = r15
            r6 = r15
            r15 = r16
            r16 = r5
            r17 = r3
            r19 = r8
            r14.<init>(r15, r16, r17, r19)
            r13.put(r10, r6)
            r0.f4091t = r7
            goto L_0x0180
        L_0x017e:
            r20 = r4
        L_0x0180:
            r5 = r11
        L_0x0181:
            r10 = r12
        L_0x0182:
            if (r10 < 0) goto L_0x018e
            r1.mo4105n(r10)
            int r5 = r5 + r10
            r4 = r20
            r3 = 2
            r6 = -1
            goto L_0x0038
        L_0x018e:
            java.io.IOException r1 = new java.io.IOException
            r1.<init>(r9)
            throw r1
        L_0x0194:
            java.io.IOException r1 = new java.io.IOException
            r1.<init>(r9)
            throw r1
        L_0x019a:
            java.nio.ByteOrder r2 = r0.f4079h
            r1.mo4103m(r2)
            return
        L_0x01a0:
            java.io.IOException r1 = new java.io.IOException
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r3 = "Invalid marker:"
            r2.append(r3)
            r3 = r7 & 255(0xff, float:3.57E-43)
            java.lang.String r3 = java.lang.Integer.toHexString(r3)
            r2.append(r3)
            java.lang.String r2 = r2.toString()
            r1.<init>(r2)
            throw r1
        L_0x01bd:
            java.io.IOException r1 = new java.io.IOException
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            r2.append(r5)
            r3 = r3 & 255(0xff, float:3.57E-43)
            java.lang.String r3 = java.lang.Integer.toHexString(r3)
            r2.append(r3)
            java.lang.String r2 = r2.toString()
            r1.<init>(r2)
            throw r1
        L_0x01d8:
            java.io.IOException r1 = new java.io.IOException
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            r2.append(r5)
            r3 = r3 & 255(0xff, float:3.57E-43)
            java.lang.String r3 = java.lang.Integer.toHexString(r3)
            r2.append(r3)
            java.lang.String r2 = r2.toString()
            r1.<init>(r2)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.exifinterface.media.C1415a.m4871f(androidx.exifinterface.media.a$b, int, int):void");
    }

    /* renamed from: g */
    private int m4872g(BufferedInputStream bufferedInputStream) {
        bufferedInputStream.mark(5000);
        byte[] bArr = new byte[5000];
        bufferedInputStream.read(bArr);
        bufferedInputStream.reset();
        if (m4884s(bArr)) {
            return 4;
        }
        if (m4887v(bArr)) {
            return 9;
        }
        if (m4883r(bArr)) {
            return 12;
        }
        if (m4885t(bArr)) {
            return 7;
        }
        if (m4888w(bArr)) {
            return 10;
        }
        if (m4886u(bArr)) {
            return 13;
        }
        if (m4854A(bArr)) {
            return 14;
        }
        return 0;
    }

    /* renamed from: h */
    private void m4873h(C1421f fVar) {
        int i;
        int i2;
        m4876k(fVar);
        C1418c cVar = (C1418c) this.f4077f[1].get("MakerNote");
        if (cVar != null) {
            C1421f fVar2 = new C1421f(cVar.f4104d);
            fVar2.mo4103m(this.f4079h);
            byte[] bArr = f4023E;
            byte[] bArr2 = new byte[bArr.length];
            fVar2.readFully(bArr2);
            fVar2.mo4132o(0);
            byte[] bArr3 = f4024F;
            byte[] bArr4 = new byte[bArr3.length];
            fVar2.readFully(bArr4);
            if (Arrays.equals(bArr2, bArr)) {
                fVar2.mo4132o(8);
            } else if (Arrays.equals(bArr4, bArr3)) {
                fVar2.mo4132o(12);
            }
            m4860G(fVar2, 6);
            C1418c cVar2 = (C1418c) this.f4077f[7].get("PreviewImageStart");
            C1418c cVar3 = (C1418c) this.f4077f[7].get("PreviewImageLength");
            if (!(cVar2 == null || cVar3 == null)) {
                this.f4077f[5].put("JPEGInterchangeFormat", cVar2);
                this.f4077f[5].put("JPEGInterchangeFormatLength", cVar3);
            }
            C1418c cVar4 = (C1418c) this.f4077f[8].get("AspectFrame");
            if (cVar4 != null) {
                int[] iArr = (int[]) cVar4.mo4127k(this.f4079h);
                if (iArr == null || iArr.length != 4) {
                    Log.w("ExifInterface", "Invalid aspect frame values. frame=" + Arrays.toString(iArr));
                    return;
                }
                int i3 = iArr[2];
                int i4 = iArr[0];
                if (i3 > i4 && (i = iArr[3]) > (i2 = iArr[1])) {
                    int i5 = (i3 - i4) + 1;
                    int i6 = (i - i2) + 1;
                    if (i5 < i6) {
                        int i7 = i5 + i6;
                        i6 = i7 - i6;
                        i5 = i7 - i6;
                    }
                    C1418c f = C1418c.m4903f(i5, this.f4079h);
                    C1418c f2 = C1418c.m4903f(i6, this.f4079h);
                    this.f4077f[0].put("ImageWidth", f);
                    this.f4077f[0].put("ImageLength", f2);
                }
            }
        }
    }

    /* renamed from: i */
    private void m4874i(C1417b bVar) {
        if (f4065u) {
            Log.d("ExifInterface", "getPngAttributes starting with: " + bVar);
        }
        bVar.mo4103m(ByteOrder.BIG_ENDIAN);
        byte[] bArr = f4025G;
        bVar.mo4105n(bArr.length);
        int length = bArr.length + 0;
        while (true) {
            try {
                int readInt = bVar.readInt();
                int i = length + 4;
                byte[] bArr2 = new byte[4];
                if (bVar.read(bArr2) == 4) {
                    int i2 = i + 4;
                    if (i2 == 16) {
                        if (!Arrays.equals(bArr2, f4027I)) {
                            throw new IOException("Encountered invalid PNG file--IHDR chunk should appearas the first chunk");
                        }
                    }
                    if (!Arrays.equals(bArr2, f4028J)) {
                        if (Arrays.equals(bArr2, f4026H)) {
                            byte[] bArr3 = new byte[readInt];
                            if (bVar.read(bArr3) == readInt) {
                                int readInt2 = bVar.readInt();
                                CRC32 crc32 = new CRC32();
                                crc32.update(bArr2);
                                crc32.update(bArr3);
                                if (((int) crc32.getValue()) == readInt2) {
                                    this.f4087p = i2;
                                    m4859F(bArr3, 0);
                                    m4867N();
                                    m4863J(new C1417b(bArr3));
                                    return;
                                }
                                throw new IOException("Encountered invalid CRC value for PNG-EXIF chunk.\n recorded CRC value: " + readInt2 + ", calculated CRC value: " + crc32.getValue());
                            }
                            throw new IOException("Failed to read given length for given PNG chunk type: " + C1422b.m4912a(bArr2));
                        }
                        int i3 = readInt + 4;
                        bVar.mo4105n(i3);
                        length = i2 + i3;
                    } else {
                        return;
                    }
                } else {
                    throw new IOException("Encountered invalid length while parsing PNG chunktype");
                }
            } catch (EOFException unused) {
                throw new IOException("Encountered corrupt PNG file.");
            }
        }
    }

    /* renamed from: j */
    private void m4875j(C1417b bVar) {
        boolean z = f4065u;
        if (z) {
            Log.d("ExifInterface", "getRafAttributes starting with: " + bVar);
        }
        bVar.mo4105n(84);
        byte[] bArr = new byte[4];
        byte[] bArr2 = new byte[4];
        byte[] bArr3 = new byte[4];
        bVar.read(bArr);
        bVar.read(bArr2);
        bVar.read(bArr3);
        int i = ByteBuffer.wrap(bArr).getInt();
        int i2 = ByteBuffer.wrap(bArr2).getInt();
        int i3 = ByteBuffer.wrap(bArr3).getInt();
        byte[] bArr4 = new byte[i2];
        bVar.mo4105n(i - bVar.mo4100a());
        bVar.read(bArr4);
        m4871f(new C1417b(bArr4), i, 5);
        bVar.mo4105n(i3 - bVar.mo4100a());
        bVar.mo4103m(ByteOrder.BIG_ENDIAN);
        int readInt = bVar.readInt();
        if (z) {
            Log.d("ExifInterface", "numberOfDirectoryEntry: " + readInt);
        }
        for (int i4 = 0; i4 < readInt; i4++) {
            int readUnsignedShort = bVar.readUnsignedShort();
            int readUnsignedShort2 = bVar.readUnsignedShort();
            if (readUnsignedShort == f4048d0.f4105a) {
                short readShort = bVar.readShort();
                short readShort2 = bVar.readShort();
                C1418c f = C1418c.m4903f(readShort, this.f4079h);
                C1418c f2 = C1418c.m4903f(readShort2, this.f4079h);
                this.f4077f[0].put("ImageLength", f);
                this.f4077f[0].put("ImageWidth", f2);
                if (f4065u) {
                    Log.d("ExifInterface", "Updated to length: " + readShort + ", width: " + readShort2);
                    return;
                }
                return;
            }
            bVar.mo4105n(readUnsignedShort2);
        }
    }

    /* renamed from: k */
    private void m4876k(C1421f fVar) {
        C1418c cVar;
        m4856C(fVar);
        m4860G(fVar, 0);
        m4866M(fVar, 0);
        m4866M(fVar, 5);
        m4866M(fVar, 4);
        m4867N();
        if (this.f4075d == 8 && (cVar = (C1418c) this.f4077f[1].get("MakerNote")) != null) {
            C1421f fVar2 = new C1421f(cVar.f4104d);
            fVar2.mo4103m(this.f4079h);
            fVar2.mo4105n(6);
            m4860G(fVar2, 9);
            C1418c cVar2 = (C1418c) this.f4077f[9].get("ColorSpace");
            if (cVar2 != null) {
                this.f4077f[1].put("ColorSpace", cVar2);
            }
        }
    }

    /* renamed from: l */
    private void m4877l(C1421f fVar) {
        if (f4065u) {
            Log.d("ExifInterface", "getRw2Attributes starting with: " + fVar);
        }
        m4876k(fVar);
        C1418c cVar = (C1418c) this.f4077f[0].get("JpgFromRaw");
        if (cVar != null) {
            m4871f(new C1417b(cVar.f4104d), (int) cVar.f4103c, 5);
        }
        C1418c cVar2 = (C1418c) this.f4077f[0].get("ISO");
        C1418c cVar3 = (C1418c) this.f4077f[1].get("PhotographicSensitivity");
        if (cVar2 != null && cVar3 == null) {
            this.f4077f[1].put("PhotographicSensitivity", cVar2);
        }
    }

    /* renamed from: m */
    private void m4878m(C1421f fVar) {
        byte[] bArr = f4060p0;
        fVar.mo4105n(bArr.length);
        byte[] bArr2 = new byte[fVar.available()];
        fVar.readFully(bArr2);
        this.f4087p = bArr.length;
        m4859F(bArr2, 0);
    }

    /* renamed from: n */
    private void m4879n(C1417b bVar) {
        if (f4065u) {
            Log.d("ExifInterface", "getWebpAttributes starting with: " + bVar);
        }
        bVar.mo4103m(ByteOrder.LITTLE_ENDIAN);
        bVar.mo4105n(f4029K.length);
        int readInt = bVar.readInt() + 8;
        byte[] bArr = f4030L;
        bVar.mo4105n(bArr.length);
        int length = bArr.length + 8;
        while (true) {
            try {
                byte[] bArr2 = new byte[4];
                if (bVar.read(bArr2) == 4) {
                    int readInt2 = bVar.readInt();
                    int i = length + 4 + 4;
                    if (Arrays.equals(f4031M, bArr2)) {
                        byte[] bArr3 = new byte[readInt2];
                        if (bVar.read(bArr3) == readInt2) {
                            this.f4087p = i;
                            m4859F(bArr3, 0);
                            m4863J(new C1417b(bArr3));
                            return;
                        }
                        throw new IOException("Failed to read given length for given PNG chunk type: " + C1422b.m4912a(bArr2));
                    }
                    if (readInt2 % 2 == 1) {
                        readInt2++;
                    }
                    length = i + readInt2;
                    if (length != readInt) {
                        if (length <= readInt) {
                            bVar.mo4105n(readInt2);
                        } else {
                            throw new IOException("Encountered WebP file with invalid chunk size");
                        }
                    } else {
                        return;
                    }
                } else {
                    throw new IOException("Encountered invalid length while parsing WebP chunktype");
                }
            } catch (EOFException unused) {
                throw new IOException("Encountered corrupt WebP file.");
            }
        }
    }

    /* renamed from: o */
    private void m4880o(C1417b bVar, HashMap hashMap) {
        C1418c cVar = (C1418c) hashMap.get("JPEGInterchangeFormat");
        C1418c cVar2 = (C1418c) hashMap.get("JPEGInterchangeFormatLength");
        if (cVar != null && cVar2 != null) {
            int i = cVar.mo4125i(this.f4079h);
            int i2 = cVar2.mo4125i(this.f4079h);
            if (this.f4075d == 7) {
                i += this.f4088q;
            }
            if (i > 0 && i2 > 0) {
                this.f4080i = true;
                if (this.f4072a == null && this.f4074c == null && this.f4073b == null) {
                    byte[] bArr = new byte[i2];
                    bVar.skip((long) i);
                    bVar.read(bArr);
                    this.f4085n = bArr;
                }
                this.f4083l = i;
                this.f4084m = i2;
            }
            if (f4065u) {
                Log.d("ExifInterface", "Setting thumbnail attributes with offset: " + i + ", length: " + i2);
            }
        }
    }

    /* renamed from: p */
    private void m4881p(C1417b bVar, HashMap hashMap) {
        C1417b bVar2 = bVar;
        HashMap hashMap2 = hashMap;
        C1418c cVar = (C1418c) hashMap2.get("StripOffsets");
        C1418c cVar2 = (C1418c) hashMap2.get("StripByteCounts");
        if (cVar != null && cVar2 != null) {
            long[] b = C1422b.m4913b(cVar.mo4127k(this.f4079h));
            long[] b2 = C1422b.m4913b(cVar2.mo4127k(this.f4079h));
            if (b == null || b.length == 0) {
                Log.w("ExifInterface", "stripOffsets should not be null or have zero length.");
            } else if (b2 == null || b2.length == 0) {
                Log.w("ExifInterface", "stripByteCounts should not be null or have zero length.");
            } else if (b.length != b2.length) {
                Log.w("ExifInterface", "stripOffsets and stripByteCounts should have same length.");
            } else {
                long j = 0;
                for (long j2 : b2) {
                    j += j2;
                }
                int i = (int) j;
                byte[] bArr = new byte[i];
                this.f4082k = true;
                this.f4081j = true;
                this.f4080i = true;
                int i2 = 0;
                int i3 = 0;
                for (int i4 = 0; i4 < b.length; i4++) {
                    int i5 = (int) b[i4];
                    int i6 = (int) b2[i4];
                    if (i4 < b.length - 1 && ((long) (i5 + i6)) != b[i4 + 1]) {
                        this.f4082k = false;
                    }
                    int i7 = i5 - i2;
                    if (i7 < 0) {
                        Log.d("ExifInterface", "Invalid strip offset value");
                        return;
                    }
                    long j3 = (long) i7;
                    if (bVar2.skip(j3) != j3) {
                        Log.d("ExifInterface", "Failed to skip " + i7 + " bytes.");
                        return;
                    }
                    int i8 = i2 + i7;
                    byte[] bArr2 = new byte[i6];
                    if (bVar2.read(bArr2) != i6) {
                        Log.d("ExifInterface", "Failed to read " + i6 + " bytes.");
                        return;
                    }
                    i2 = i8 + i6;
                    System.arraycopy(bArr2, 0, bArr, i3, i6);
                    i3 += i6;
                }
                this.f4085n = bArr;
                if (this.f4082k) {
                    this.f4083l = (int) b[0];
                    this.f4084m = i;
                }
            }
        }
    }

    /* renamed from: q */
    private static boolean m4882q(BufferedInputStream bufferedInputStream) {
        byte[] bArr = f4060p0;
        bufferedInputStream.mark(bArr.length);
        byte[] bArr2 = new byte[bArr.length];
        bufferedInputStream.read(bArr2);
        bufferedInputStream.reset();
        int i = 0;
        while (true) {
            byte[] bArr3 = f4060p0;
            if (i >= bArr3.length) {
                return true;
            }
            if (bArr2[i] != bArr3[i]) {
                return false;
            }
            i++;
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:58:0x0092 A[Catch:{ all -> 0x008b }] */
    /* JADX WARNING: Removed duplicated region for block: B:60:0x009b  */
    /* JADX WARNING: Removed duplicated region for block: B:63:0x00a1  */
    /* renamed from: r */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private boolean m4883r(byte[] r15) {
        /*
            r14 = this;
            r0 = 0
            r1 = 0
            androidx.exifinterface.media.a$b r2 = new androidx.exifinterface.media.a$b     // Catch:{ Exception -> 0x008d }
            r2.<init>((byte[]) r15)     // Catch:{ Exception -> 0x008d }
            int r1 = r2.readInt()     // Catch:{ Exception -> 0x0088, all -> 0x0085 }
            long r3 = (long) r1     // Catch:{ Exception -> 0x0088, all -> 0x0085 }
            r1 = 4
            byte[] r5 = new byte[r1]     // Catch:{ Exception -> 0x0088, all -> 0x0085 }
            r2.read(r5)     // Catch:{ Exception -> 0x0088, all -> 0x0085 }
            byte[] r6 = f4020B     // Catch:{ Exception -> 0x0088, all -> 0x0085 }
            boolean r5 = java.util.Arrays.equals(r5, r6)     // Catch:{ Exception -> 0x0088, all -> 0x0085 }
            if (r5 != 0) goto L_0x001e
            r2.close()
            return r0
        L_0x001e:
            r5 = 1
            int r7 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            r8 = 8
            if (r7 != 0) goto L_0x0034
            long r3 = r2.readLong()     // Catch:{ Exception -> 0x0088, all -> 0x0085 }
            r10 = 16
            int r7 = (r3 > r10 ? 1 : (r3 == r10 ? 0 : -1))
            if (r7 >= 0) goto L_0x0035
            r2.close()
            return r0
        L_0x0034:
            r10 = r8
        L_0x0035:
            int r7 = r15.length     // Catch:{ Exception -> 0x0088, all -> 0x0085 }
            long r12 = (long) r7     // Catch:{ Exception -> 0x0088, all -> 0x0085 }
            int r7 = (r3 > r12 ? 1 : (r3 == r12 ? 0 : -1))
            if (r7 <= 0) goto L_0x003d
            int r15 = r15.length     // Catch:{ Exception -> 0x0088, all -> 0x0085 }
            long r3 = (long) r15
        L_0x003d:
            long r3 = r3 - r10
            int r15 = (r3 > r8 ? 1 : (r3 == r8 ? 0 : -1))
            if (r15 >= 0) goto L_0x0046
            r2.close()
            return r0
        L_0x0046:
            byte[] r15 = new byte[r1]     // Catch:{ Exception -> 0x0088, all -> 0x0085 }
            r7 = 0
            r9 = r0
            r10 = r9
        L_0x004c:
            r11 = 4
            long r11 = r3 / r11
            int r11 = (r7 > r11 ? 1 : (r7 == r11 ? 0 : -1))
            if (r11 >= 0) goto L_0x0081
            int r11 = r2.read(r15)     // Catch:{ Exception -> 0x0088, all -> 0x0085 }
            if (r11 == r1) goto L_0x005e
            r2.close()
            return r0
        L_0x005e:
            int r11 = (r7 > r5 ? 1 : (r7 == r5 ? 0 : -1))
            if (r11 != 0) goto L_0x0063
            goto L_0x007f
        L_0x0063:
            byte[] r11 = f4021C     // Catch:{ Exception -> 0x0088, all -> 0x0085 }
            boolean r11 = java.util.Arrays.equals(r15, r11)     // Catch:{ Exception -> 0x0088, all -> 0x0085 }
            r12 = 1
            if (r11 == 0) goto L_0x006e
            r9 = r12
            goto L_0x0077
        L_0x006e:
            byte[] r11 = f4022D     // Catch:{ Exception -> 0x0088, all -> 0x0085 }
            boolean r11 = java.util.Arrays.equals(r15, r11)     // Catch:{ Exception -> 0x0088, all -> 0x0085 }
            if (r11 == 0) goto L_0x0077
            r10 = r12
        L_0x0077:
            if (r9 == 0) goto L_0x007f
            if (r10 == 0) goto L_0x007f
            r2.close()
            return r12
        L_0x007f:
            long r7 = r7 + r5
            goto L_0x004c
        L_0x0081:
            r2.close()
            goto L_0x009e
        L_0x0085:
            r15 = move-exception
            r1 = r2
            goto L_0x009f
        L_0x0088:
            r15 = move-exception
            r1 = r2
            goto L_0x008e
        L_0x008b:
            r15 = move-exception
            goto L_0x009f
        L_0x008d:
            r15 = move-exception
        L_0x008e:
            boolean r2 = f4065u     // Catch:{ all -> 0x008b }
            if (r2 == 0) goto L_0x0099
            java.lang.String r2 = "ExifInterface"
            java.lang.String r3 = "Exception parsing HEIF file type box."
            android.util.Log.d(r2, r3, r15)     // Catch:{ all -> 0x008b }
        L_0x0099:
            if (r1 == 0) goto L_0x009e
            r1.close()
        L_0x009e:
            return r0
        L_0x009f:
            if (r1 == 0) goto L_0x00a4
            r1.close()
        L_0x00a4:
            throw r15
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.exifinterface.media.C1415a.m4883r(byte[]):boolean");
    }

    /* renamed from: s */
    private static boolean m4884s(byte[] bArr) {
        int i = 0;
        while (true) {
            byte[] bArr2 = f4019A;
            if (i >= bArr2.length) {
                return true;
            }
            if (bArr[i] != bArr2[i]) {
                return false;
            }
            i++;
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:18:0x0029  */
    /* JADX WARNING: Removed duplicated region for block: B:22:0x002f  */
    /* renamed from: t */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private boolean m4885t(byte[] r4) {
        /*
            r3 = this;
            r0 = 0
            r1 = 0
            androidx.exifinterface.media.a$b r2 = new androidx.exifinterface.media.a$b     // Catch:{ Exception -> 0x002d, all -> 0x0026 }
            r2.<init>((byte[]) r4)     // Catch:{ Exception -> 0x002d, all -> 0x0026 }
            java.nio.ByteOrder r4 = r3.m4858E(r2)     // Catch:{ Exception -> 0x0024, all -> 0x0021 }
            r3.f4079h = r4     // Catch:{ Exception -> 0x0024, all -> 0x0021 }
            r2.mo4103m(r4)     // Catch:{ Exception -> 0x0024, all -> 0x0021 }
            short r4 = r2.readShort()     // Catch:{ Exception -> 0x0024, all -> 0x0021 }
            r1 = 20306(0x4f52, float:2.8455E-41)
            if (r4 == r1) goto L_0x001c
            r1 = 21330(0x5352, float:2.989E-41)
            if (r4 != r1) goto L_0x001d
        L_0x001c:
            r0 = 1
        L_0x001d:
            r2.close()
            return r0
        L_0x0021:
            r4 = move-exception
            r1 = r2
            goto L_0x0027
        L_0x0024:
            r1 = r2
            goto L_0x002d
        L_0x0026:
            r4 = move-exception
        L_0x0027:
            if (r1 == 0) goto L_0x002c
            r1.close()
        L_0x002c:
            throw r4
        L_0x002d:
            if (r1 == 0) goto L_0x0032
            r1.close()
        L_0x0032:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.exifinterface.media.C1415a.m4885t(byte[]):boolean");
    }

    /* renamed from: u */
    private boolean m4886u(byte[] bArr) {
        int i = 0;
        while (true) {
            byte[] bArr2 = f4025G;
            if (i >= bArr2.length) {
                return true;
            }
            if (bArr[i] != bArr2[i]) {
                return false;
            }
            i++;
        }
    }

    /* renamed from: v */
    private boolean m4887v(byte[] bArr) {
        byte[] bytes = "FUJIFILMCCD-RAW".getBytes(Charset.defaultCharset());
        for (int i = 0; i < bytes.length; i++) {
            if (bArr[i] != bytes[i]) {
                return false;
            }
        }
        return true;
    }

    /* JADX WARNING: Removed duplicated region for block: B:16:0x0025  */
    /* JADX WARNING: Removed duplicated region for block: B:20:0x002b  */
    /* renamed from: w */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private boolean m4888w(byte[] r4) {
        /*
            r3 = this;
            r0 = 0
            r1 = 0
            androidx.exifinterface.media.a$b r2 = new androidx.exifinterface.media.a$b     // Catch:{ Exception -> 0x0029, all -> 0x0022 }
            r2.<init>((byte[]) r4)     // Catch:{ Exception -> 0x0029, all -> 0x0022 }
            java.nio.ByteOrder r4 = r3.m4858E(r2)     // Catch:{ Exception -> 0x0020, all -> 0x001d }
            r3.f4079h = r4     // Catch:{ Exception -> 0x0020, all -> 0x001d }
            r2.mo4103m(r4)     // Catch:{ Exception -> 0x0020, all -> 0x001d }
            short r4 = r2.readShort()     // Catch:{ Exception -> 0x0020, all -> 0x001d }
            r1 = 85
            if (r4 != r1) goto L_0x0019
            r0 = 1
        L_0x0019:
            r2.close()
            return r0
        L_0x001d:
            r4 = move-exception
            r1 = r2
            goto L_0x0023
        L_0x0020:
            r1 = r2
            goto L_0x0029
        L_0x0022:
            r4 = move-exception
        L_0x0023:
            if (r1 == 0) goto L_0x0028
            r1.close()
        L_0x0028:
            throw r4
        L_0x0029:
            if (r1 == 0) goto L_0x002e
            r1.close()
        L_0x002e:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.exifinterface.media.C1415a.m4888w(byte[]):boolean");
    }

    /* renamed from: x */
    private static boolean m4889x(FileDescriptor fileDescriptor) {
        try {
            C1422b.C1423a.m4917c(fileDescriptor, 0, OsConstants.SEEK_CUR);
            return true;
        } catch (Exception unused) {
            if (!f4065u) {
                return false;
            }
            Log.d("ExifInterface", "The file descriptor for the given input is not seekable");
            return false;
        }
    }

    /* renamed from: y */
    private boolean m4890y(HashMap hashMap) {
        C1418c cVar;
        int i;
        C1418c cVar2 = (C1418c) hashMap.get("BitsPerSample");
        if (cVar2 != null) {
            int[] iArr = (int[]) cVar2.mo4127k(this.f4079h);
            int[] iArr2 = f4069x;
            if (Arrays.equals(iArr2, iArr)) {
                return true;
            }
            if (this.f4075d == 3 && (cVar = (C1418c) hashMap.get("PhotometricInterpretation")) != null && (((i = cVar.mo4125i(this.f4079h)) == 1 && Arrays.equals(iArr, f4071z)) || (i == 6 && Arrays.equals(iArr, iArr2)))) {
                return true;
            }
        }
        if (!f4065u) {
            return false;
        }
        Log.d("ExifInterface", "Unsupported data type value");
        return false;
    }

    /* renamed from: z */
    private boolean m4891z(HashMap hashMap) {
        C1418c cVar = (C1418c) hashMap.get("ImageLength");
        C1418c cVar2 = (C1418c) hashMap.get("ImageWidth");
        if (cVar == null || cVar2 == null) {
            return false;
        }
        int i = cVar.mo4125i(this.f4079h);
        int i2 = cVar2.mo4125i(this.f4079h);
        if (i > 512 || i2 > 512) {
            return false;
        }
        return true;
    }

    /* renamed from: b */
    public String mo4095b(String str) {
        if (str != null) {
            C1418c d = m4869d(str);
            if (d != null) {
                if (!f4057m0.contains(str)) {
                    return d.mo4126j(this.f4079h);
                }
                if (str.equals("GPSTimeStamp")) {
                    int i = d.f4101a;
                    if (i == 5 || i == 10) {
                        C1420e[] eVarArr = (C1420e[]) d.mo4127k(this.f4079h);
                        if (eVarArr == null || eVarArr.length != 3) {
                            Log.w("ExifInterface", "Invalid GPS Timestamp array. array=" + Arrays.toString(eVarArr));
                            return null;
                        }
                        C1420e eVar = eVarArr[0];
                        C1420e eVar2 = eVarArr[1];
                        C1420e eVar3 = eVarArr[2];
                        return String.format("%02d:%02d:%02d", new Object[]{Integer.valueOf((int) (((float) eVar.f4109a) / ((float) eVar.f4110b))), Integer.valueOf((int) (((float) eVar2.f4109a) / ((float) eVar2.f4110b))), Integer.valueOf((int) (((float) eVar3.f4109a) / ((float) eVar3.f4110b)))});
                    }
                    Log.w("ExifInterface", "GPS Timestamp format is not rational. format=" + d.f4101a);
                    return null;
                }
                try {
                    return Double.toString(d.mo4124h(this.f4079h));
                } catch (NumberFormatException unused) {
                }
            }
            return null;
        }
        throw new NullPointerException("tag shouldn't be null");
    }

    /* renamed from: c */
    public int mo4096c(String str, int i) {
        if (str != null) {
            C1418c d = m4869d(str);
            if (d == null) {
                return i;
            }
            try {
                return d.mo4125i(this.f4079h);
            } catch (NumberFormatException unused) {
                return i;
            }
        } else {
            throw new NullPointerException("tag shouldn't be null");
        }
    }

    /* renamed from: androidx.exifinterface.media.a$f */
    private static class C1421f extends C1417b {
        C1421f(byte[] bArr) {
            super(bArr);
            this.f4097d.mark(Integer.MAX_VALUE);
        }

        /* renamed from: o */
        public void mo4132o(long j) {
            int i = this.f4099f;
            if (((long) i) > j) {
                this.f4099f = 0;
                this.f4097d.reset();
            } else {
                j -= (long) i;
            }
            mo4105n((int) j);
        }

        C1421f(InputStream inputStream) {
            super(inputStream);
            if (inputStream.markSupported()) {
                this.f4097d.mark(Integer.MAX_VALUE);
                return;
            }
            throw new IllegalArgumentException("Cannot create SeekableByteOrderedDataInputStream with stream that does not support mark/reset");
        }
    }

    public C1415a(InputStream inputStream, int i) {
        C1419d[][] dVarArr = f4053i0;
        this.f4077f = new HashMap[dVarArr.length];
        this.f4078g = new HashSet(dVarArr.length);
        this.f4079h = ByteOrder.BIG_ENDIAN;
        if (inputStream != null) {
            this.f4072a = null;
            if (i == 1) {
                BufferedInputStream bufferedInputStream = new BufferedInputStream(inputStream, f4060p0.length);
                if (!m4882q(bufferedInputStream)) {
                    Log.w("ExifInterface", "Given data does not follow the structure of an Exif-only data.");
                    return;
                }
                this.f4076e = true;
                this.f4074c = null;
                this.f4073b = null;
                inputStream = bufferedInputStream;
            } else if (inputStream instanceof AssetManager.AssetInputStream) {
                this.f4074c = (AssetManager.AssetInputStream) inputStream;
                this.f4073b = null;
            } else {
                if (inputStream instanceof FileInputStream) {
                    FileInputStream fileInputStream = (FileInputStream) inputStream;
                    if (m4889x(fileInputStream.getFD())) {
                        this.f4074c = null;
                        this.f4073b = fileInputStream.getFD();
                    }
                }
                this.f4074c = null;
                this.f4073b = null;
            }
            m4855B(inputStream);
            return;
        }
        throw new NullPointerException("inputStream cannot be null");
    }

    /* renamed from: androidx.exifinterface.media.a$d */
    static class C1419d {

        /* renamed from: a */
        public final int f4105a;

        /* renamed from: b */
        public final String f4106b;

        /* renamed from: c */
        public final int f4107c;

        /* renamed from: d */
        public final int f4108d;

        C1419d(String str, int i, int i2) {
            this.f4106b = str;
            this.f4105a = i;
            this.f4107c = i2;
            this.f4108d = -1;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public boolean mo4129a(int i) {
            int i2;
            int i3 = this.f4107c;
            if (i3 == 7 || i == 7 || i3 == i || (i2 = this.f4108d) == i) {
                return true;
            }
            if ((i3 == 4 || i2 == 4) && i == 3) {
                return true;
            }
            if ((i3 == 9 || i2 == 9) && i == 8) {
                return true;
            }
            if ((i3 == 12 || i2 == 12) && i == 11) {
                return true;
            }
            return false;
        }

        C1419d(String str, int i, int i2, int i3) {
            this.f4106b = str;
            this.f4105a = i;
            this.f4107c = i2;
            this.f4108d = i3;
        }
    }
}
