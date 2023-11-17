package p089g4;

import android.graphics.Bitmap;
import android.os.Handler;
import android.os.Looper;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Queue;

/* renamed from: g4.l */
public abstract class C6224l {

    /* renamed from: a */
    private static final char[] f19244a = "0123456789abcdef".toCharArray();

    /* renamed from: b */
    private static final char[] f19245b = new char[64];

    /* renamed from: c */
    private static volatile Handler f19246c;

    /* renamed from: g4.l$a */
    static /* synthetic */ class C6225a {

        /* renamed from: a */
        static final /* synthetic */ int[] f19247a;

        /* JADX WARNING: Can't wrap try/catch for region: R(12:0|1|2|3|4|5|6|7|8|9|10|12) */
        /* JADX WARNING: Code restructure failed: missing block: B:13:?, code lost:
            return;
         */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0012 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x001d */
        /* JADX WARNING: Missing exception handler attribute for start block: B:7:0x0028 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:9:0x0035 */
        static {
            /*
                android.graphics.Bitmap$Config[] r0 = android.graphics.Bitmap.Config.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                f19247a = r0
                android.graphics.Bitmap$Config r1 = android.graphics.Bitmap.Config.ALPHA_8     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = f19247a     // Catch:{ NoSuchFieldError -> 0x001d }
                android.graphics.Bitmap$Config r1 = android.graphics.Bitmap.Config.RGB_565     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                int[] r0 = f19247a     // Catch:{ NoSuchFieldError -> 0x0028 }
                android.graphics.Bitmap$Config r1 = android.graphics.Bitmap.Config.ARGB_4444     // Catch:{ NoSuchFieldError -> 0x0028 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0028 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0028 }
            L_0x0028:
                int[] r0 = f19247a     // Catch:{ NoSuchFieldError -> 0x0035 }
                android.graphics.Bitmap$Config r1 = android.graphics.Bitmap.Config.RGBA_F16     // Catch:{ NoSuchFieldError -> 0x0035 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0035 }
                r2 = 4
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0035 }
            L_0x0035:
                int[] r0 = f19247a     // Catch:{ NoSuchFieldError -> 0x0040 }
                android.graphics.Bitmap$Config r1 = android.graphics.Bitmap.Config.ARGB_8888     // Catch:{ NoSuchFieldError -> 0x0040 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0040 }
                r2 = 5
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0040 }
            L_0x0040:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: p089g4.C6224l.C6225a.<clinit>():void");
        }
    }

    /* renamed from: a */
    public static void m24732a() {
        if (!m24749r()) {
            throw new IllegalArgumentException("You must call this method on a background thread");
        }
    }

    /* renamed from: b */
    public static void m24733b() {
        if (!m24750s()) {
            throw new IllegalArgumentException("You must call this method on the main thread");
        }
    }

    /* renamed from: c */
    public static boolean m24734c(Object obj, Object obj2) {
        return obj == null ? obj2 == null : obj.equals(obj2);
    }

    /* renamed from: d */
    public static boolean m24735d(Object obj, Object obj2) {
        return obj == null ? obj2 == null : obj.equals(obj2);
    }

    /* renamed from: e */
    private static String m24736e(byte[] bArr, char[] cArr) {
        for (int i = 0; i < bArr.length; i++) {
            byte b = bArr[i] & 255;
            int i2 = i * 2;
            char[] cArr2 = f19244a;
            cArr[i2] = cArr2[b >>> 4];
            cArr[i2 + 1] = cArr2[b & 15];
        }
        return new String(cArr);
    }

    /* renamed from: f */
    public static Queue m24737f(int i) {
        return new ArrayDeque(i);
    }

    /* renamed from: g */
    public static int m24738g(int i, int i2, Bitmap.Config config) {
        return i * i2 * m24740i(config);
    }

    /* renamed from: h */
    public static int m24739h(Bitmap bitmap) {
        if (!bitmap.isRecycled()) {
            try {
                return bitmap.getAllocationByteCount();
            } catch (NullPointerException unused) {
                return bitmap.getHeight() * bitmap.getRowBytes();
            }
        } else {
            throw new IllegalStateException("Cannot obtain size for recycled Bitmap: " + bitmap + "[" + bitmap.getWidth() + "x" + bitmap.getHeight() + "] " + bitmap.getConfig());
        }
    }

    /* renamed from: i */
    public static int m24740i(Bitmap.Config config) {
        if (config == null) {
            config = Bitmap.Config.ARGB_8888;
        }
        int i = C6225a.f19247a[config.ordinal()];
        if (i == 1) {
            return 1;
        }
        if (i == 2 || i == 3) {
            return 2;
        }
        if (i != 4) {
            return 4;
        }
        return 8;
    }

    /* renamed from: j */
    public static List m24741j(Collection collection) {
        ArrayList arrayList = new ArrayList(collection.size());
        for (Object next : collection) {
            if (next != null) {
                arrayList.add(next);
            }
        }
        return arrayList;
    }

    /* renamed from: k */
    private static Handler m24742k() {
        if (f19246c == null) {
            synchronized (C6224l.class) {
                if (f19246c == null) {
                    f19246c = new Handler(Looper.getMainLooper());
                }
            }
        }
        return f19246c;
    }

    /* renamed from: l */
    public static int m24743l(float f) {
        return m24744m(f, 17);
    }

    /* renamed from: m */
    public static int m24744m(float f, int i) {
        return m24746o(Float.floatToIntBits(f), i);
    }

    /* renamed from: n */
    public static int m24745n(int i) {
        return m24746o(i, 17);
    }

    /* renamed from: o */
    public static int m24746o(int i, int i2) {
        return (i2 * 31) + i;
    }

    /* renamed from: p */
    public static int m24747p(Object obj, int i) {
        return m24746o(obj == null ? 0 : obj.hashCode(), i);
    }

    /* renamed from: q */
    public static int m24748q(boolean z, int i) {
        return m24746o(z ? 1 : 0, i);
    }

    /* renamed from: r */
    public static boolean m24749r() {
        return !m24750s();
    }

    /* renamed from: s */
    public static boolean m24750s() {
        return Looper.myLooper() == Looper.getMainLooper();
    }

    /* renamed from: t */
    public static boolean m24751t(int i) {
        return i > 0 || i == Integer.MIN_VALUE;
    }

    /* renamed from: u */
    public static boolean m24752u(int i, int i2) {
        return m24751t(i) && m24751t(i2);
    }

    /* renamed from: v */
    public static void m24753v(Runnable runnable) {
        m24742k().post(runnable);
    }

    /* renamed from: w */
    public static void m24754w(Runnable runnable) {
        m24742k().removeCallbacks(runnable);
    }

    /* renamed from: x */
    public static String m24755x(byte[] bArr) {
        String e;
        char[] cArr = f19245b;
        synchronized (cArr) {
            e = m24736e(bArr, cArr);
        }
        return e;
    }
}
