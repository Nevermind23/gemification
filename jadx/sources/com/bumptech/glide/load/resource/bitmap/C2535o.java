package com.bumptech.glide.load.resource.bitmap;

import p166m3.C7085g;

/* renamed from: com.bumptech.glide.load.resource.bitmap.o */
public abstract class C2535o {

    /* renamed from: a */
    public static final C2535o f7979a = new C2536a();

    /* renamed from: b */
    public static final C2535o f7980b = new C2537b();

    /* renamed from: c */
    public static final C2535o f7981c = new C2540e();

    /* renamed from: d */
    public static final C2535o f7982d = new C2538c();

    /* renamed from: e */
    public static final C2535o f7983e;

    /* renamed from: f */
    public static final C2535o f7984f = new C2541f();

    /* renamed from: g */
    public static final C2535o f7985g;

    /* renamed from: h */
    public static final C7085g f7986h;

    /* renamed from: i */
    static final boolean f7987i = true;

    /* renamed from: com.bumptech.glide.load.resource.bitmap.o$a */
    private static class C2536a extends C2535o {
        C2536a() {
        }

        /* renamed from: a */
        public C2542g mo8039a(int i, int i2, int i3, int i4) {
            return C2542g.QUALITY;
        }

        /* renamed from: b */
        public float mo8040b(int i, int i2, int i3, int i4) {
            int min = Math.min(i2 / i4, i / i3);
            if (min == 0) {
                return 1.0f;
            }
            return 1.0f / ((float) Integer.highestOneBit(min));
        }
    }

    /* renamed from: com.bumptech.glide.load.resource.bitmap.o$b */
    private static class C2537b extends C2535o {
        C2537b() {
        }

        /* renamed from: a */
        public C2542g mo8039a(int i, int i2, int i3, int i4) {
            return C2542g.MEMORY;
        }

        /* renamed from: b */
        public float mo8040b(int i, int i2, int i3, int i4) {
            int ceil = (int) Math.ceil((double) Math.max(((float) i2) / ((float) i4), ((float) i) / ((float) i3)));
            int i5 = 1;
            int max = Math.max(1, Integer.highestOneBit(ceil));
            if (max >= ceil) {
                i5 = 0;
            }
            return 1.0f / ((float) (max << i5));
        }
    }

    /* renamed from: com.bumptech.glide.load.resource.bitmap.o$c */
    private static class C2538c extends C2535o {
        C2538c() {
        }

        /* renamed from: a */
        public C2542g mo8039a(int i, int i2, int i3, int i4) {
            if (mo8040b(i, i2, i3, i4) == 1.0f) {
                return C2542g.QUALITY;
            }
            return C2535o.f7981c.mo8039a(i, i2, i3, i4);
        }

        /* renamed from: b */
        public float mo8040b(int i, int i2, int i3, int i4) {
            return Math.min(1.0f, C2535o.f7981c.mo8040b(i, i2, i3, i4));
        }
    }

    /* renamed from: com.bumptech.glide.load.resource.bitmap.o$d */
    private static class C2539d extends C2535o {
        C2539d() {
        }

        /* renamed from: a */
        public C2542g mo8039a(int i, int i2, int i3, int i4) {
            return C2542g.QUALITY;
        }

        /* renamed from: b */
        public float mo8040b(int i, int i2, int i3, int i4) {
            return Math.max(((float) i3) / ((float) i), ((float) i4) / ((float) i2));
        }
    }

    /* renamed from: com.bumptech.glide.load.resource.bitmap.o$e */
    private static class C2540e extends C2535o {
        C2540e() {
        }

        /* renamed from: a */
        public C2542g mo8039a(int i, int i2, int i3, int i4) {
            if (C2535o.f7987i) {
                return C2542g.QUALITY;
            }
            return C2542g.MEMORY;
        }

        /* renamed from: b */
        public float mo8040b(int i, int i2, int i3, int i4) {
            if (C2535o.f7987i) {
                return Math.min(((float) i3) / ((float) i), ((float) i4) / ((float) i2));
            }
            int max = Math.max(i2 / i4, i / i3);
            if (max == 0) {
                return 1.0f;
            }
            return 1.0f / ((float) Integer.highestOneBit(max));
        }
    }

    /* renamed from: com.bumptech.glide.load.resource.bitmap.o$f */
    private static class C2541f extends C2535o {
        C2541f() {
        }

        /* renamed from: a */
        public C2542g mo8039a(int i, int i2, int i3, int i4) {
            return C2542g.QUALITY;
        }

        /* renamed from: b */
        public float mo8040b(int i, int i2, int i3, int i4) {
            return 1.0f;
        }
    }

    /* renamed from: com.bumptech.glide.load.resource.bitmap.o$g */
    public enum C2542g {
        MEMORY,
        QUALITY
    }

    static {
        C2539d dVar = new C2539d();
        f7983e = dVar;
        f7985g = dVar;
        f7986h = C7085g.m27365f("com.bumptech.glide.load.resource.bitmap.Downsampler.DownsampleStrategy", dVar);
    }

    /* renamed from: a */
    public abstract C2542g mo8039a(int i, int i2, int i3, int i4);

    /* renamed from: b */
    public abstract float mo8040b(int i, int i2, int i3, int i4);
}
