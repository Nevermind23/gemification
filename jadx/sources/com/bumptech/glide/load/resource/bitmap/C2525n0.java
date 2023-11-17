package com.bumptech.glide.load.resource.bitmap;

import android.content.res.AssetFileDescriptor;
import android.graphics.Bitmap;
import android.graphics.Matrix;
import android.media.MediaDataSource;
import android.media.MediaExtractor;
import android.media.MediaMetadataRetriever;
import android.os.Build;
import android.os.ParcelFileDescriptor;
import android.util.Log;
import java.nio.ByteBuffer;
import java.security.MessageDigest;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import p166m3.C7085g;
import p166m3.C7088h;
import p166m3.C7090j;
import p192o3.C7430c;
import p205p3.C7676d;

/* renamed from: com.bumptech.glide.load.resource.bitmap.n0 */
public class C2525n0 implements C7090j {

    /* renamed from: d */
    public static final C7085g f7968d = C7085g.m27361a("com.bumptech.glide.load.resource.bitmap.VideoBitmapDecode.TargetFrame", -1L, new C2526a());

    /* renamed from: e */
    public static final C7085g f7969e = C7085g.m27361a("com.bumptech.glide.load.resource.bitmap.VideoBitmapDecode.FrameOption", 2, new C2527b());

    /* renamed from: f */
    private static final C2532f f7970f = new C2532f();

    /* renamed from: g */
    private static final List f7971g = Collections.unmodifiableList(Arrays.asList(new String[]{"TP1A", "TD1A.220804.031"}));

    /* renamed from: a */
    private final C2531e f7972a;

    /* renamed from: b */
    private final C7676d f7973b;

    /* renamed from: c */
    private final C2532f f7974c;

    /* renamed from: com.bumptech.glide.load.resource.bitmap.n0$a */
    class C2526a implements C7085g.C7087b {

        /* renamed from: a */
        private final ByteBuffer f7975a = ByteBuffer.allocate(8);

        C2526a() {
        }

        /* renamed from: b */
        public void mo8024a(byte[] bArr, Long l, MessageDigest messageDigest) {
            messageDigest.update(bArr);
            synchronized (this.f7975a) {
                this.f7975a.position(0);
                messageDigest.update(this.f7975a.putLong(l.longValue()).array());
            }
        }
    }

    /* renamed from: com.bumptech.glide.load.resource.bitmap.n0$b */
    class C2527b implements C7085g.C7087b {

        /* renamed from: a */
        private final ByteBuffer f7976a = ByteBuffer.allocate(4);

        C2527b() {
        }

        /* renamed from: b */
        public void mo8024a(byte[] bArr, Integer num, MessageDigest messageDigest) {
            if (num != null) {
                messageDigest.update(bArr);
                synchronized (this.f7976a) {
                    this.f7976a.position(0);
                    messageDigest.update(this.f7976a.putInt(num.intValue()).array());
                }
            }
        }
    }

    /* renamed from: com.bumptech.glide.load.resource.bitmap.n0$c */
    private static final class C2528c implements C2531e {
        private C2528c() {
        }

        /* synthetic */ C2528c(C2526a aVar) {
            this();
        }

        /* renamed from: c */
        public void mo8027a(MediaExtractor mediaExtractor, AssetFileDescriptor assetFileDescriptor) {
            mediaExtractor.setDataSource(assetFileDescriptor.getFileDescriptor(), assetFileDescriptor.getStartOffset(), assetFileDescriptor.getLength());
        }

        /* renamed from: d */
        public void mo8028b(MediaMetadataRetriever mediaMetadataRetriever, AssetFileDescriptor assetFileDescriptor) {
            mediaMetadataRetriever.setDataSource(assetFileDescriptor.getFileDescriptor(), assetFileDescriptor.getStartOffset(), assetFileDescriptor.getLength());
        }
    }

    /* renamed from: com.bumptech.glide.load.resource.bitmap.n0$d */
    static final class C2529d implements C2531e {

        /* renamed from: com.bumptech.glide.load.resource.bitmap.n0$d$a */
        class C2530a extends MediaDataSource {

            /* renamed from: d */
            final /* synthetic */ ByteBuffer f7977d;

            C2530a(ByteBuffer byteBuffer) {
                this.f7977d = byteBuffer;
            }

            public void close() {
            }

            public long getSize() {
                return (long) this.f7977d.limit();
            }

            public int readAt(long j, byte[] bArr, int i, int i2) {
                if (j >= ((long) this.f7977d.limit())) {
                    return -1;
                }
                this.f7977d.position((int) j);
                int min = Math.min(i2, this.f7977d.remaining());
                this.f7977d.get(bArr, i, min);
                return min;
            }
        }

        C2529d() {
        }

        /* renamed from: c */
        private MediaDataSource m9774c(ByteBuffer byteBuffer) {
            return new C2530a(byteBuffer);
        }

        /* renamed from: d */
        public void mo8027a(MediaExtractor mediaExtractor, ByteBuffer byteBuffer) {
            mediaExtractor.setDataSource(m9774c(byteBuffer));
        }

        /* renamed from: e */
        public void mo8028b(MediaMetadataRetriever mediaMetadataRetriever, ByteBuffer byteBuffer) {
            mediaMetadataRetriever.setDataSource(m9774c(byteBuffer));
        }
    }

    /* renamed from: com.bumptech.glide.load.resource.bitmap.n0$e */
    interface C2531e {
        /* renamed from: a */
        void mo8027a(MediaExtractor mediaExtractor, Object obj);

        /* renamed from: b */
        void mo8028b(MediaMetadataRetriever mediaMetadataRetriever, Object obj);
    }

    /* renamed from: com.bumptech.glide.load.resource.bitmap.n0$f */
    static class C2532f {
        C2532f() {
        }

        /* renamed from: a */
        public MediaMetadataRetriever mo8036a() {
            return new MediaMetadataRetriever();
        }
    }

    /* renamed from: com.bumptech.glide.load.resource.bitmap.n0$g */
    static final class C2533g implements C2531e {
        C2533g() {
        }

        /* renamed from: c */
        public void mo8027a(MediaExtractor mediaExtractor, ParcelFileDescriptor parcelFileDescriptor) {
            mediaExtractor.setDataSource(parcelFileDescriptor.getFileDescriptor());
        }

        /* renamed from: d */
        public void mo8028b(MediaMetadataRetriever mediaMetadataRetriever, ParcelFileDescriptor parcelFileDescriptor) {
            mediaMetadataRetriever.setDataSource(parcelFileDescriptor.getFileDescriptor());
        }
    }

    /* renamed from: com.bumptech.glide.load.resource.bitmap.n0$h */
    private static final class C2534h extends RuntimeException {
        private static final long serialVersionUID = -2556382523004027815L;

        C2534h() {
            super("MediaMetadataRetriever failed to retrieve a frame without throwing, check the adb logs for .*MetadataRetriever.* prior to this exception for details");
        }
    }

    C2525n0(C7676d dVar, C2531e eVar) {
        this(dVar, eVar, f7970f);
    }

    /* renamed from: c */
    public static C7090j m9753c(C7676d dVar) {
        return new C2525n0(dVar, new C2528c((C2526a) null));
    }

    /* renamed from: d */
    public static C7090j m9754d(C7676d dVar) {
        return new C2525n0(dVar, new C2529d());
    }

    /* renamed from: e */
    private static Bitmap m9755e(MediaMetadataRetriever mediaMetadataRetriever, Bitmap bitmap) {
        if (!m9760j()) {
            return bitmap;
        }
        boolean z = false;
        try {
            if (m9759i(mediaMetadataRetriever) && Math.abs(Integer.parseInt(mediaMetadataRetriever.extractMetadata(24))) == 180) {
                z = true;
            }
        } catch (NumberFormatException unused) {
            if (Log.isLoggable("VideoDecoder", 3)) {
                Log.d("VideoDecoder", "Exception trying to extract HDR transfer function or rotation");
            }
        }
        if (!z) {
            return bitmap;
        }
        if (Log.isLoggable("VideoDecoder", 3)) {
            Log.d("VideoDecoder", "Applying HDR 180 deg thumbnail correction");
        }
        Matrix matrix = new Matrix();
        matrix.postRotate(180.0f, ((float) bitmap.getWidth()) / 2.0f, ((float) bitmap.getHeight()) / 2.0f);
        return Bitmap.createBitmap(bitmap, 0, 0, bitmap.getWidth(), bitmap.getHeight(), matrix, true);
    }

    /* renamed from: f */
    private Bitmap m9756f(Object obj, MediaMetadataRetriever mediaMetadataRetriever, long j, int i, int i2, int i3, C2535o oVar) {
        Bitmap bitmap;
        if (!m9762l(obj, mediaMetadataRetriever)) {
            if (Build.VERSION.SDK_INT < 27 || i2 == Integer.MIN_VALUE || i3 == Integer.MIN_VALUE || oVar == C2535o.f7984f) {
                bitmap = null;
            } else {
                bitmap = m9758h(mediaMetadataRetriever, j, i, i2, i3, oVar);
            }
            if (bitmap == null) {
                bitmap = m9757g(mediaMetadataRetriever, j, i);
            }
            Bitmap e = m9755e(mediaMetadataRetriever, bitmap);
            if (e != null) {
                return e;
            }
            throw new C2534h();
        }
        throw new IllegalStateException("Cannot decode VP8 video on CrOS.");
    }

    /* renamed from: g */
    private static Bitmap m9757g(MediaMetadataRetriever mediaMetadataRetriever, long j, int i) {
        return mediaMetadataRetriever.getFrameAtTime(j, i);
    }

    /* renamed from: h */
    private static Bitmap m9758h(MediaMetadataRetriever mediaMetadataRetriever, long j, int i, int i2, int i3, C2535o oVar) {
        try {
            int parseInt = Integer.parseInt(mediaMetadataRetriever.extractMetadata(18));
            int parseInt2 = Integer.parseInt(mediaMetadataRetriever.extractMetadata(19));
            int parseInt3 = Integer.parseInt(mediaMetadataRetriever.extractMetadata(24));
            if (parseInt3 == 90 || parseInt3 == 270) {
                int i4 = parseInt2;
                parseInt2 = parseInt;
                parseInt = i4;
            }
            float b = oVar.mo8040b(parseInt, parseInt2, i2, i3);
            return mediaMetadataRetriever.getScaledFrameAtTime(j, i, Math.round(((float) parseInt) * b), Math.round(b * ((float) parseInt2)));
        } catch (Throwable th) {
            if (!Log.isLoggable("VideoDecoder", 3)) {
                return null;
            }
            Log.d("VideoDecoder", "Exception trying to decode a scaled frame on oreo+, falling back to a fullsize frame", th);
            return null;
        }
    }

    /* renamed from: i */
    private static boolean m9759i(MediaMetadataRetriever mediaMetadataRetriever) {
        String extractMetadata = mediaMetadataRetriever.extractMetadata(36);
        String extractMetadata2 = mediaMetadataRetriever.extractMetadata(35);
        int parseInt = Integer.parseInt(extractMetadata);
        int parseInt2 = Integer.parseInt(extractMetadata2);
        if ((parseInt == 7 || parseInt == 6) && parseInt2 == 6) {
            return true;
        }
        return false;
    }

    /* renamed from: j */
    static boolean m9760j() {
        if (Build.MODEL.startsWith("Pixel") && Build.VERSION.SDK_INT == 33) {
            return m9761k();
        }
        int i = Build.VERSION.SDK_INT;
        if (i < 30 || i >= 33) {
            return false;
        }
        return true;
    }

    /* renamed from: k */
    private static boolean m9761k() {
        for (String startsWith : f7971g) {
            if (Build.ID.startsWith(startsWith)) {
                return true;
            }
        }
        return false;
    }

    /* JADX WARNING: Removed duplicated region for block: B:30:0x005f A[Catch:{ all -> 0x006a }] */
    /* JADX WARNING: Removed duplicated region for block: B:32:0x0066 A[DONT_GENERATE] */
    /* renamed from: l */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private boolean m9762l(java.lang.Object r7, android.media.MediaMetadataRetriever r8) {
        /*
            r6 = this;
            java.lang.String r0 = "VideoDecoder"
            java.lang.String r1 = android.os.Build.DEVICE
            r2 = 1
            r3 = 0
            if (r1 == 0) goto L_0x0012
            java.lang.String r4 = ".+_cheets|cheets_.+"
            boolean r1 = r1.matches(r4)
            if (r1 == 0) goto L_0x0012
            r1 = r2
            goto L_0x0013
        L_0x0012:
            r1 = r3
        L_0x0013:
            if (r1 != 0) goto L_0x0016
            return r3
        L_0x0016:
            r1 = 12
            r4 = 0
            java.lang.String r8 = r8.extractMetadata(r1)     // Catch:{ all -> 0x0057 }
            java.lang.String r1 = "video/webm"
            boolean r8 = r1.equals(r8)     // Catch:{ all -> 0x0057 }
            if (r8 != 0) goto L_0x0026
            return r3
        L_0x0026:
            android.media.MediaExtractor r8 = new android.media.MediaExtractor     // Catch:{ all -> 0x0057 }
            r8.<init>()     // Catch:{ all -> 0x0057 }
            com.bumptech.glide.load.resource.bitmap.n0$e r1 = r6.f7972a     // Catch:{ all -> 0x0054 }
            r1.mo8027a(r8, r7)     // Catch:{ all -> 0x0054 }
            int r7 = r8.getTrackCount()     // Catch:{ all -> 0x0054 }
            r1 = r3
        L_0x0035:
            if (r1 >= r7) goto L_0x0050
            android.media.MediaFormat r4 = r8.getTrackFormat(r1)     // Catch:{ all -> 0x0054 }
            java.lang.String r5 = "mime"
            java.lang.String r4 = r4.getString(r5)     // Catch:{ all -> 0x0054 }
            java.lang.String r5 = "video/x-vnd.on2.vp8"
            boolean r4 = r5.equals(r4)     // Catch:{ all -> 0x0054 }
            if (r4 == 0) goto L_0x004d
            r8.release()
            return r2
        L_0x004d:
            int r1 = r1 + 1
            goto L_0x0035
        L_0x0050:
            r8.release()
            goto L_0x0069
        L_0x0054:
            r7 = move-exception
            r4 = r8
            goto L_0x0058
        L_0x0057:
            r7 = move-exception
        L_0x0058:
            r8 = 3
            boolean r8 = android.util.Log.isLoggable(r0, r8)     // Catch:{ all -> 0x006a }
            if (r8 == 0) goto L_0x0064
            java.lang.String r8 = "Exception trying to extract track info for a webm video on CrOS."
            android.util.Log.d(r0, r8, r7)     // Catch:{ all -> 0x006a }
        L_0x0064:
            if (r4 == 0) goto L_0x0069
            r4.release()
        L_0x0069:
            return r3
        L_0x006a:
            r7 = move-exception
            if (r4 == 0) goto L_0x0070
            r4.release()
        L_0x0070:
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bumptech.glide.load.resource.bitmap.C2525n0.m9762l(java.lang.Object, android.media.MediaMetadataRetriever):boolean");
    }

    /* renamed from: m */
    public static C7090j m9763m(C7676d dVar) {
        return new C2525n0(dVar, new C2533g());
    }

    /* renamed from: a */
    public boolean mo7971a(Object obj, C7088h hVar) {
        return true;
    }

    /* renamed from: b */
    public C7430c mo7972b(Object obj, int i, int i2, C7088h hVar) {
        int i3;
        long longValue = ((Long) hVar.mo21312c(f7968d)).longValue();
        if (longValue >= 0 || longValue == -1) {
            Integer num = (Integer) hVar.mo21312c(f7969e);
            if (num == null) {
                num = 2;
            }
            C2535o oVar = (C2535o) hVar.mo21312c(C2535o.f7986h);
            if (oVar == null) {
                oVar = C2535o.f7985g;
            }
            C2535o oVar2 = oVar;
            MediaMetadataRetriever a = this.f7974c.mo8036a();
            try {
                this.f7972a.mo8028b(a, obj);
                Bitmap f = m9756f(obj, a, longValue, num.intValue(), i, i2, oVar2);
                if (i3 < 29) {
                    a.release();
                }
                return C2504g.m9689e(f, this.f7973b);
            } finally {
                if (Build.VERSION.SDK_INT >= 29) {
                    a.close();
                } else {
                    a.release();
                }
            }
        } else {
            throw new IllegalArgumentException("Requested frame must be non-negative, or DEFAULT_FRAME, given: " + longValue);
        }
    }

    C2525n0(C7676d dVar, C2531e eVar, C2532f fVar) {
        this.f7973b = dVar;
        this.f7972a = eVar;
        this.f7974c = fVar;
    }
}
