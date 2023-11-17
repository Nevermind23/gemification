package com.bumptech.glide.load.resource.bitmap;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.ColorSpace;
import android.os.Build;
import android.os.ParcelFileDescriptor;
import android.util.DisplayMetrics;
import android.util.Log;
import com.bumptech.glide.load.ImageHeaderParser;
import com.bumptech.glide.load.data.ParcelFileDescriptorRewinder;
import com.bumptech.glide.load.resource.bitmap.C2491b0;
import com.bumptech.glide.load.resource.bitmap.C2535o;
import com.github.mikephil.charting.utils.Utils;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.Arrays;
import java.util.Collections;
import java.util.EnumSet;
import java.util.HashSet;
import java.util.List;
import java.util.Queue;
import java.util.Set;
import p089g4.C6218g;
import p089g4.C6223k;
import p089g4.C6224l;
import p166m3.C7080b;
import p166m3.C7085g;
import p166m3.C7088h;
import p166m3.C7089i;
import p192o3.C7430c;
import p205p3.C7674b;
import p205p3.C7676d;

/* renamed from: com.bumptech.glide.load.resource.bitmap.u */
public final class C2548u {

    /* renamed from: f */
    public static final C7085g f7991f = C7085g.m27365f("com.bumptech.glide.load.resource.bitmap.Downsampler.DecodeFormat", C7080b.f21036f);

    /* renamed from: g */
    public static final C7085g f7992g = C7085g.m27364e("com.bumptech.glide.load.resource.bitmap.Downsampler.PreferredColorSpace");

    /* renamed from: h */
    public static final C7085g f7993h = C2535o.f7986h;

    /* renamed from: i */
    public static final C7085g f7994i;

    /* renamed from: j */
    public static final C7085g f7995j;

    /* renamed from: k */
    private static final Set f7996k = Collections.unmodifiableSet(new HashSet(Arrays.asList(new String[]{"image/vnd.wap.wbmp", "image/x-ico"})));

    /* renamed from: l */
    private static final C2550b f7997l = new C2549a();

    /* renamed from: m */
    private static final Set f7998m = Collections.unmodifiableSet(EnumSet.of(ImageHeaderParser.ImageType.JPEG, ImageHeaderParser.ImageType.PNG_A, ImageHeaderParser.ImageType.PNG));

    /* renamed from: n */
    private static final Queue f7999n = C6224l.m24737f(0);

    /* renamed from: a */
    private final C7676d f8000a;

    /* renamed from: b */
    private final DisplayMetrics f8001b;

    /* renamed from: c */
    private final C7674b f8002c;

    /* renamed from: d */
    private final List f8003d;

    /* renamed from: e */
    private final C2489a0 f8004e = C2489a0.m9633b();

    /* renamed from: com.bumptech.glide.load.resource.bitmap.u$a */
    class C2549a implements C2550b {
        C2549a() {
        }

        /* renamed from: a */
        public void mo8010a(C7676d dVar, Bitmap bitmap) {
        }

        /* renamed from: b */
        public void mo8011b() {
        }
    }

    /* renamed from: com.bumptech.glide.load.resource.bitmap.u$b */
    public interface C2550b {
        /* renamed from: a */
        void mo8010a(C7676d dVar, Bitmap bitmap);

        /* renamed from: b */
        void mo8011b();
    }

    static {
        Boolean bool = Boolean.FALSE;
        f7994i = C7085g.m27365f("com.bumptech.glide.load.resource.bitmap.Downsampler.FixBitmapSize", bool);
        f7995j = C7085g.m27365f("com.bumptech.glide.load.resource.bitmap.Downsampler.AllowHardwareDecode", bool);
    }

    public C2548u(List list, DisplayMetrics displayMetrics, C7676d dVar, C7674b bVar) {
        this.f8003d = list;
        this.f8001b = (DisplayMetrics) C6223k.m24730d(displayMetrics);
        this.f8000a = (C7676d) C6223k.m24730d(dVar);
        this.f8002c = (C7674b) C6223k.m24730d(bVar);
    }

    /* renamed from: a */
    private static int m9805a(double d) {
        int l = m9813l(d);
        int x = m9822x(((double) l) * d);
        return m9822x((d / ((double) (((float) x) / ((float) l)))) * ((double) x));
    }

    /* renamed from: b */
    private void m9806b(C2491b0 b0Var, C7080b bVar, boolean z, boolean z2, BitmapFactory.Options options, int i, int i2) {
        boolean z3;
        Bitmap.Config config;
        if (!this.f8004e.mo7974i(i, i2, options, z, z2)) {
            if (bVar != C7080b.PREFER_ARGB_8888) {
                try {
                    z3 = b0Var.mo7981d().hasAlpha();
                } catch (IOException e) {
                    if (Log.isLoggable("Downsampler", 3)) {
                        Log.d("Downsampler", "Cannot determine whether the image has alpha or not from header, format " + bVar, e);
                    }
                    z3 = false;
                }
                if (z3) {
                    config = Bitmap.Config.ARGB_8888;
                } else {
                    config = Bitmap.Config.RGB_565;
                }
                options.inPreferredConfig = config;
                if (config == Bitmap.Config.RGB_565) {
                    options.inDither = true;
                    return;
                }
                return;
            }
            options.inPreferredConfig = Bitmap.Config.ARGB_8888;
        }
    }

    /* renamed from: c */
    private static void m9807c(ImageHeaderParser.ImageType imageType, C2491b0 b0Var, C2550b bVar, C7676d dVar, C2535o oVar, int i, int i2, int i3, int i4, int i5, BitmapFactory.Options options) {
        int i6;
        int i7;
        int i8;
        int i9;
        int i12;
        int i13;
        double d;
        ImageHeaderParser.ImageType imageType2 = imageType;
        C2535o oVar2 = oVar;
        int i14 = i2;
        int i15 = i3;
        int i16 = i4;
        int i17 = i5;
        BitmapFactory.Options options2 = options;
        if (i14 <= 0 || i15 <= 0) {
            String str = "Downsampler";
            String str2 = "x";
            if (Log.isLoggable(str, 3)) {
                Log.d(str, "Unable to determine dimensions for: " + imageType2 + " with target [" + i16 + str2 + i17 + "]");
                return;
            }
            return;
        }
        if (m9816r(i)) {
            i6 = i14;
            i7 = i15;
        } else {
            i7 = i14;
            i6 = i15;
        }
        float b = oVar2.mo8040b(i7, i6, i16, i17);
        if (b > Utils.FLOAT_EPSILON) {
            C2535o.C2542g a = oVar2.mo8039a(i7, i6, i16, i17);
            if (a != null) {
                float f = (float) i7;
                float f2 = (float) i6;
                int x = i7 / m9822x((double) (b * f));
                int x2 = i6 / m9822x((double) (b * f2));
                C2535o.C2542g gVar = C2535o.C2542g.MEMORY;
                if (a == gVar) {
                    i8 = Math.max(x, x2);
                } else {
                    i8 = Math.min(x, x2);
                }
                int i18 = Build.VERSION.SDK_INT;
                String str3 = "x";
                String str4 = "Downsampler";
                if (i18 > 23 || !f7996k.contains(options2.outMimeType)) {
                    int max = Math.max(1, Integer.highestOneBit(i8));
                    if (a == gVar && ((float) max) < 1.0f / b) {
                        max <<= 1;
                    }
                    i9 = max;
                } else {
                    i9 = 1;
                }
                options2.inSampleSize = i9;
                if (imageType2 == ImageHeaderParser.ImageType.JPEG) {
                    float min = (float) Math.min(i9, 8);
                    i12 = (int) Math.ceil((double) (f / min));
                    i13 = (int) Math.ceil((double) (f2 / min));
                    int i19 = i9 / 8;
                    if (i19 > 0) {
                        i12 /= i19;
                        i13 /= i19;
                    }
                } else {
                    if (imageType2 == ImageHeaderParser.ImageType.PNG || imageType2 == ImageHeaderParser.ImageType.PNG_A) {
                        float f3 = (float) i9;
                        i12 = (int) Math.floor((double) (f / f3));
                        d = Math.floor((double) (f2 / f3));
                    } else if (imageType.isWebp()) {
                        if (i18 >= 24) {
                            float f4 = (float) i9;
                            i12 = Math.round(f / f4);
                            i13 = Math.round(f2 / f4);
                        } else {
                            float f5 = (float) i9;
                            i12 = (int) Math.floor((double) (f / f5));
                            d = Math.floor((double) (f2 / f5));
                        }
                    } else if (i7 % i9 == 0 && i6 % i9 == 0) {
                        i12 = i7 / i9;
                        i13 = i6 / i9;
                    } else {
                        int[] m = m9814m(b0Var, options2, bVar, dVar);
                        i12 = m[0];
                        i13 = m[1];
                    }
                    i13 = (int) d;
                }
                double b2 = (double) oVar2.mo8040b(i12, i13, i16, i17);
                options2.inTargetDensity = m9805a(b2);
                options2.inDensity = m9813l(b2);
                if (m9817s(options)) {
                    options2.inScaled = true;
                } else {
                    options2.inTargetDensity = 0;
                    options2.inDensity = 0;
                }
                String str5 = str4;
                if (Log.isLoggable(str5, 2)) {
                    StringBuilder sb = new StringBuilder();
                    sb.append("Calculate scaling, source: [");
                    sb.append(i2);
                    String str6 = str3;
                    sb.append(str6);
                    sb.append(i3);
                    sb.append("], degreesToRotate: ");
                    sb.append(i);
                    sb.append(", target: [");
                    sb.append(i16);
                    sb.append(str6);
                    sb.append(i17);
                    sb.append("], power of two scaled: [");
                    sb.append(i12);
                    sb.append(str6);
                    sb.append(i13);
                    sb.append("], exact scale factor: ");
                    sb.append(b);
                    sb.append(", power of 2 sample size: ");
                    sb.append(i9);
                    sb.append(", adjusted scale factor: ");
                    sb.append(b2);
                    sb.append(", target density: ");
                    sb.append(options2.inTargetDensity);
                    sb.append(", density: ");
                    sb.append(options2.inDensity);
                    Log.v(str5, sb.toString());
                    return;
                }
                return;
            }
            throw new IllegalArgumentException("Cannot round with null rounding");
        }
        int i22 = i14;
        String str7 = "x";
        throw new IllegalArgumentException("Cannot scale with factor: " + b + " from: " + oVar2 + ", source: [" + i22 + str7 + i15 + "], target: [" + i16 + str7 + i17 + "]");
    }

    /* renamed from: e */
    private C7430c m9808e(C2491b0 b0Var, int i, int i2, C7088h hVar, C2550b bVar) {
        boolean z;
        C7088h hVar2 = hVar;
        byte[] bArr = (byte[]) this.f8002c.mo22387c(65536, byte[].class);
        BitmapFactory.Options k = m9812k();
        k.inTempStorage = bArr;
        C7080b bVar2 = (C7080b) hVar2.mo21312c(f7991f);
        C7089i iVar = (C7089i) hVar2.mo21312c(f7992g);
        C2535o oVar = (C2535o) hVar2.mo21312c(C2535o.f7986h);
        boolean booleanValue = ((Boolean) hVar2.mo21312c(f7994i)).booleanValue();
        C7085g gVar = f7995j;
        if (hVar2.mo21312c(gVar) == null || !((Boolean) hVar2.mo21312c(gVar)).booleanValue()) {
            z = false;
        } else {
            z = true;
        }
        try {
            return C2504g.m9689e(m9809h(b0Var, k, oVar, bVar2, iVar, z, i, i2, booleanValue, bVar), this.f8000a);
        } finally {
            m9820v(k);
            this.f8002c.mo22389e(bArr);
        }
    }

    /* renamed from: h */
    private Bitmap m9809h(C2491b0 b0Var, BitmapFactory.Options options, C2535o oVar, C7080b bVar, C7089i iVar, boolean z, int i, int i2, boolean z2, C2550b bVar2) {
        boolean z3;
        int i3;
        int i4;
        int i5;
        String str;
        ColorSpace.Named named;
        int i6;
        int i7;
        float f;
        BitmapFactory.Options options2 = options;
        C7089i iVar2 = iVar;
        C2550b bVar3 = bVar2;
        long b = C6218g.m24714b();
        int[] m = m9814m(b0Var, options2, bVar3, this.f8000a);
        boolean z4 = false;
        int i8 = m[0];
        int i9 = m[1];
        String str2 = options2.outMimeType;
        if (i8 == -1 || i9 == -1) {
            z3 = false;
        } else {
            z3 = z;
        }
        int c = b0Var.mo7980c();
        int j = C2512j0.m9722j(c);
        boolean m2 = C2512j0.m9725m(c);
        int i12 = i;
        if (i12 == Integer.MIN_VALUE) {
            i4 = i2;
            if (m9816r(j)) {
                i3 = i9;
            } else {
                i3 = i8;
            }
        } else {
            i4 = i2;
            i3 = i12;
        }
        if (i4 != Integer.MIN_VALUE) {
            i5 = i4;
        } else if (m9816r(j)) {
            i5 = i8;
        } else {
            i5 = i9;
        }
        ImageHeaderParser.ImageType d = b0Var.mo7981d();
        ImageHeaderParser.ImageType imageType = d;
        int i13 = c;
        m9807c(d, b0Var, bVar2, this.f8000a, oVar, j, i8, i9, i3, i5, options);
        String str3 = str2;
        int i14 = i9;
        int i15 = i8;
        C2550b bVar4 = bVar3;
        C7089i iVar3 = iVar2;
        BitmapFactory.Options options3 = options2;
        m9806b(b0Var, bVar, z3, m2, options, i3, i5);
        int i16 = Build.VERSION.SDK_INT;
        int i17 = options3.inSampleSize;
        if (m9824z(imageType)) {
            if (i15 < 0 || i14 < 0 || !z2) {
                if (m9817s(options)) {
                    f = ((float) options3.inTargetDensity) / ((float) options3.inDensity);
                } else {
                    f = 1.0f;
                }
                int i18 = options3.inSampleSize;
                float f2 = (float) i18;
                i7 = Math.round(((float) ((int) Math.ceil((double) (((float) i15) / f2)))) * f);
                i6 = Math.round(((float) ((int) Math.ceil((double) (((float) i14) / f2)))) * f);
                str = "Downsampler";
                if (Log.isLoggable(str, 2)) {
                    Log.v(str, "Calculated target [" + i7 + "x" + i6 + "] for source [" + i15 + "x" + i14 + "], sampleSize: " + i18 + ", targetDensity: " + options3.inTargetDensity + ", density: " + options3.inDensity + ", density multiplier: " + f);
                }
            } else {
                str = "Downsampler";
                i7 = i3;
                i6 = i5;
            }
            if (i7 > 0 && i6 > 0) {
                m9823y(options3, this.f8000a, i7, i6);
            }
        } else {
            str = "Downsampler";
        }
        if (iVar3 != null) {
            if (i16 >= 28) {
                if (iVar3 == C7089i.DISPLAY_P3 && options.outColorSpace != null && options.outColorSpace.isWideGamut()) {
                    z4 = true;
                }
                if (z4) {
                    named = ColorSpace.Named.DISPLAY_P3;
                } else {
                    named = ColorSpace.Named.SRGB;
                }
                options3.inPreferredColorSpace = ColorSpace.get(named);
            } else if (i16 >= 26) {
                options3.inPreferredColorSpace = ColorSpace.get(ColorSpace.Named.SRGB);
            }
        }
        Bitmap i19 = m9810i(b0Var, options3, bVar4, this.f8000a);
        bVar4.mo8010a(this.f8000a, i19);
        if (Log.isLoggable(str, 2)) {
            m9818t(i15, i14, str3, options, i19, i, i2, b);
        }
        if (i19 == null) {
            return null;
        }
        i19.setDensity(this.f8001b.densityDpi);
        Bitmap n = C2512j0.m9726n(this.f8000a, i19, i13);
        if (i19.equals(n)) {
            return n;
        }
        this.f8000a.mo8047c(i19);
        return n;
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(2:20|21) */
    /* JADX WARNING: Code restructure failed: missing block: B:21:?, code lost:
        throw r1;
     */
    /* JADX WARNING: Missing exception handler attribute for start block: B:20:0x004e */
    /* renamed from: i */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static android.graphics.Bitmap m9810i(com.bumptech.glide.load.resource.bitmap.C2491b0 r5, android.graphics.BitmapFactory.Options r6, com.bumptech.glide.load.resource.bitmap.C2548u.C2550b r7, p205p3.C7676d r8) {
        /*
            java.lang.String r0 = "Downsampler"
            boolean r1 = r6.inJustDecodeBounds
            if (r1 != 0) goto L_0x000c
            r7.mo8011b()
            r5.mo7979b()
        L_0x000c:
            int r1 = r6.outWidth
            int r2 = r6.outHeight
            java.lang.String r3 = r6.outMimeType
            java.util.concurrent.locks.Lock r4 = com.bumptech.glide.load.resource.bitmap.C2512j0.m9721i()
            r4.lock()
            android.graphics.Bitmap r5 = r5.mo7978a(r6)     // Catch:{ IllegalArgumentException -> 0x0027 }
            java.util.concurrent.locks.Lock r6 = com.bumptech.glide.load.resource.bitmap.C2512j0.m9721i()
            r6.unlock()
            return r5
        L_0x0025:
            r5 = move-exception
            goto L_0x0050
        L_0x0027:
            r4 = move-exception
            java.io.IOException r1 = m9819u(r4, r1, r2, r3, r6)     // Catch:{ all -> 0x0025 }
            r2 = 3
            boolean r2 = android.util.Log.isLoggable(r0, r2)     // Catch:{ all -> 0x0025 }
            if (r2 == 0) goto L_0x0038
            java.lang.String r2 = "Failed to decode with inBitmap, trying again without Bitmap re-use"
            android.util.Log.d(r0, r2, r1)     // Catch:{ all -> 0x0025 }
        L_0x0038:
            android.graphics.Bitmap r0 = r6.inBitmap     // Catch:{ all -> 0x0025 }
            if (r0 == 0) goto L_0x004f
            r8.mo8047c(r0)     // Catch:{ IOException -> 0x004e }
            r0 = 0
            r6.inBitmap = r0     // Catch:{ IOException -> 0x004e }
            android.graphics.Bitmap r5 = m9810i(r5, r6, r7, r8)     // Catch:{ IOException -> 0x004e }
            java.util.concurrent.locks.Lock r6 = com.bumptech.glide.load.resource.bitmap.C2512j0.m9721i()
            r6.unlock()
            return r5
        L_0x004e:
            throw r1     // Catch:{ all -> 0x0025 }
        L_0x004f:
            throw r1     // Catch:{ all -> 0x0025 }
        L_0x0050:
            java.util.concurrent.locks.Lock r6 = com.bumptech.glide.load.resource.bitmap.C2512j0.m9721i()
            r6.unlock()
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bumptech.glide.load.resource.bitmap.C2548u.m9810i(com.bumptech.glide.load.resource.bitmap.b0, android.graphics.BitmapFactory$Options, com.bumptech.glide.load.resource.bitmap.u$b, p3.d):android.graphics.Bitmap");
    }

    /* renamed from: j */
    private static String m9811j(Bitmap bitmap) {
        if (bitmap == null) {
            return null;
        }
        return "[" + bitmap.getWidth() + "x" + bitmap.getHeight() + "] " + bitmap.getConfig() + (" (" + bitmap.getAllocationByteCount() + ")");
    }

    /* renamed from: k */
    private static synchronized BitmapFactory.Options m9812k() {
        BitmapFactory.Options options;
        synchronized (C2548u.class) {
            Queue queue = f7999n;
            synchronized (queue) {
                options = (BitmapFactory.Options) queue.poll();
            }
            if (options == null) {
                options = new BitmapFactory.Options();
                m9821w(options);
            }
        }
        return options;
    }

    /* renamed from: l */
    private static int m9813l(double d) {
        if (d > 1.0d) {
            d = 1.0d / d;
        }
        return (int) Math.round(d * 2.147483647E9d);
    }

    /* renamed from: m */
    private static int[] m9814m(C2491b0 b0Var, BitmapFactory.Options options, C2550b bVar, C7676d dVar) {
        options.inJustDecodeBounds = true;
        m9810i(b0Var, options, bVar, dVar);
        options.inJustDecodeBounds = false;
        return new int[]{options.outWidth, options.outHeight};
    }

    /* renamed from: n */
    private static String m9815n(BitmapFactory.Options options) {
        return m9811j(options.inBitmap);
    }

    /* renamed from: r */
    private static boolean m9816r(int i) {
        return i == 90 || i == 270;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:2:0x0004, code lost:
        r1 = r1.inDensity;
     */
    /* renamed from: s */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static boolean m9817s(android.graphics.BitmapFactory.Options r1) {
        /*
            int r0 = r1.inTargetDensity
            if (r0 <= 0) goto L_0x000c
            int r1 = r1.inDensity
            if (r1 <= 0) goto L_0x000c
            if (r0 == r1) goto L_0x000c
            r1 = 1
            goto L_0x000d
        L_0x000c:
            r1 = 0
        L_0x000d:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bumptech.glide.load.resource.bitmap.C2548u.m9817s(android.graphics.BitmapFactory$Options):boolean");
    }

    /* renamed from: t */
    private static void m9818t(int i, int i2, String str, BitmapFactory.Options options, Bitmap bitmap, int i3, int i4, long j) {
        Log.v("Downsampler", "Decoded " + m9811j(bitmap) + " from [" + i + "x" + i2 + "] " + str + " with inBitmap " + m9815n(options) + " for [" + i3 + "x" + i4 + "], sample size: " + options.inSampleSize + ", density: " + options.inDensity + ", target density: " + options.inTargetDensity + ", thread: " + Thread.currentThread().getName() + ", duration: " + C6218g.m24713a(j));
    }

    /* renamed from: u */
    private static IOException m9819u(IllegalArgumentException illegalArgumentException, int i, int i2, String str, BitmapFactory.Options options) {
        return new IOException("Exception decoding bitmap, outWidth: " + i + ", outHeight: " + i2 + ", outMimeType: " + str + ", inBitmap: " + m9815n(options), illegalArgumentException);
    }

    /* renamed from: v */
    private static void m9820v(BitmapFactory.Options options) {
        m9821w(options);
        Queue queue = f7999n;
        synchronized (queue) {
            queue.offer(options);
        }
    }

    /* renamed from: w */
    private static void m9821w(BitmapFactory.Options options) {
        options.inTempStorage = null;
        options.inDither = false;
        options.inScaled = false;
        options.inSampleSize = 1;
        options.inPreferredConfig = null;
        options.inJustDecodeBounds = false;
        options.inDensity = 0;
        options.inTargetDensity = 0;
        if (Build.VERSION.SDK_INT >= 26) {
            options.inPreferredColorSpace = null;
            options.outColorSpace = null;
            options.outConfig = null;
        }
        options.outWidth = 0;
        options.outHeight = 0;
        options.outMimeType = null;
        options.inBitmap = null;
        options.inMutable = true;
    }

    /* renamed from: x */
    private static int m9822x(double d) {
        return (int) (d + 0.5d);
    }

    /* renamed from: y */
    private static void m9823y(BitmapFactory.Options options, C7676d dVar, int i, int i2) {
        Bitmap.Config config;
        if (Build.VERSION.SDK_INT < 26) {
            config = null;
        } else if (options.inPreferredConfig != Bitmap.Config.HARDWARE) {
            config = options.outConfig;
        } else {
            return;
        }
        if (config == null) {
            config = options.inPreferredConfig;
        }
        options.inBitmap = dVar.mo22396e(i, i2, config);
    }

    /* renamed from: z */
    private boolean m9824z(ImageHeaderParser.ImageType imageType) {
        return true;
    }

    /* renamed from: d */
    public C7430c mo8041d(ParcelFileDescriptor parcelFileDescriptor, int i, int i2, C7088h hVar) {
        return m9808e(new C2491b0.C2494c(parcelFileDescriptor, this.f8003d, this.f8002c), i, i2, hVar, f7997l);
    }

    /* renamed from: f */
    public C7430c mo8042f(InputStream inputStream, int i, int i2, C7088h hVar, C2550b bVar) {
        return m9808e(new C2491b0.C2493b(inputStream, this.f8003d, this.f8002c), i, i2, hVar, bVar);
    }

    /* renamed from: g */
    public C7430c mo8043g(ByteBuffer byteBuffer, int i, int i2, C7088h hVar) {
        return m9808e(new C2491b0.C2492a(byteBuffer, this.f8003d, this.f8002c), i, i2, hVar, f7997l);
    }

    /* renamed from: o */
    public boolean mo8044o(ParcelFileDescriptor parcelFileDescriptor) {
        return ParcelFileDescriptorRewinder.m9332c();
    }

    /* renamed from: p */
    public boolean mo8045p(InputStream inputStream) {
        return true;
    }

    /* renamed from: q */
    public boolean mo8046q(ByteBuffer byteBuffer) {
        return true;
    }
}
