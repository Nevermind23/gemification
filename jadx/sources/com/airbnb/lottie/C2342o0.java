package com.airbnb.lottie;

/* renamed from: com.airbnb.lottie.o0 */
public enum C2342o0 {
    AUTOMATIC,
    HARDWARE,
    SOFTWARE;

    /* renamed from: com.airbnb.lottie.o0$a */
    static /* synthetic */ class C2343a {

        /* renamed from: a */
        static final /* synthetic */ int[] f7407a = null;

        /* JADX WARNING: Can't wrap try/catch for region: R(6:0|1|2|3|4|(3:5|6|8)) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0012 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x001d */
        static {
            /*
                com.airbnb.lottie.o0[] r0 = com.airbnb.lottie.C2342o0.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                f7407a = r0
                com.airbnb.lottie.o0 r1 = com.airbnb.lottie.C2342o0.HARDWARE     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = f7407a     // Catch:{ NoSuchFieldError -> 0x001d }
                com.airbnb.lottie.o0 r1 = com.airbnb.lottie.C2342o0.SOFTWARE     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                int[] r0 = f7407a     // Catch:{ NoSuchFieldError -> 0x0028 }
                com.airbnb.lottie.o0 r1 = com.airbnb.lottie.C2342o0.AUTOMATIC     // Catch:{ NoSuchFieldError -> 0x0028 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0028 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0028 }
            L_0x0028:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.airbnb.lottie.C2342o0.C2343a.<clinit>():void");
        }
    }

    /* renamed from: b */
    public boolean mo7584b(int i, boolean z, int i2) {
        int i3 = C2343a.f7407a[ordinal()];
        if (i3 == 1) {
            return false;
        }
        if (i3 == 2) {
            return true;
        }
        if ((!z || i >= 28) && i2 <= 4) {
            return i <= 25;
        }
        return true;
    }
}
