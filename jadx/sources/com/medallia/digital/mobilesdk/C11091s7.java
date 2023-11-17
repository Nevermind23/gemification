package com.medallia.digital.mobilesdk;

/* renamed from: com.medallia.digital.mobilesdk.s7 */
final class C11091s7 {

    /* renamed from: com.medallia.digital.mobilesdk.s7$a */
    static /* synthetic */ class C11092a {

        /* renamed from: a */
        static final /* synthetic */ int[] f31920a;

        /* JADX WARNING: Can't wrap try/catch for region: R(14:0|1|2|3|4|5|6|7|8|9|10|11|12|14) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:11:0x003e */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0012 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x001d */
        /* JADX WARNING: Missing exception handler attribute for start block: B:7:0x0028 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:9:0x0033 */
        static {
            /*
                com.medallia.digital.mobilesdk.r7[] r0 = com.medallia.digital.mobilesdk.C11080r7.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                f31920a = r0
                com.medallia.digital.mobilesdk.r7 r1 = com.medallia.digital.mobilesdk.C11080r7.Fade     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = f31920a     // Catch:{ NoSuchFieldError -> 0x001d }
                com.medallia.digital.mobilesdk.r7 r1 = com.medallia.digital.mobilesdk.C11080r7.SlideDown     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                int[] r0 = f31920a     // Catch:{ NoSuchFieldError -> 0x0028 }
                com.medallia.digital.mobilesdk.r7 r1 = com.medallia.digital.mobilesdk.C11080r7.SlideUp     // Catch:{ NoSuchFieldError -> 0x0028 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0028 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0028 }
            L_0x0028:
                int[] r0 = f31920a     // Catch:{ NoSuchFieldError -> 0x0033 }
                com.medallia.digital.mobilesdk.r7 r1 = com.medallia.digital.mobilesdk.C11080r7.SlideLeft     // Catch:{ NoSuchFieldError -> 0x0033 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0033 }
                r2 = 4
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0033 }
            L_0x0033:
                int[] r0 = f31920a     // Catch:{ NoSuchFieldError -> 0x003e }
                com.medallia.digital.mobilesdk.r7 r1 = com.medallia.digital.mobilesdk.C11080r7.SlideRight     // Catch:{ NoSuchFieldError -> 0x003e }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x003e }
                r2 = 5
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x003e }
            L_0x003e:
                int[] r0 = f31920a     // Catch:{ NoSuchFieldError -> 0x0049 }
                com.medallia.digital.mobilesdk.r7 r1 = com.medallia.digital.mobilesdk.C11080r7.None     // Catch:{ NoSuchFieldError -> 0x0049 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0049 }
                r2 = 6
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0049 }
            L_0x0049:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.medallia.digital.mobilesdk.C11091s7.C11092a.<clinit>():void");
        }
    }

    C11091s7() {
    }

    /* renamed from: a */
    protected static C11097t2 m40685a(C11080r7 r7Var) {
        if (r7Var == null) {
            return new C11097t2(C10706R.anim.medallia_from_fade_in, C10706R.anim.medallia_to_fade_out);
        }
        switch (C11092a.f31920a[r7Var.ordinal()]) {
            case 1:
                return new C11097t2(C10706R.anim.medallia_from_fade_in, C10706R.anim.medallia_to_fade_out);
            case 2:
                return new C11097t2(C10706R.anim.medallia_slide_from_up, C10706R.anim.medallia_background_alpha);
            case 3:
                return new C11097t2(C10706R.anim.medallia_slide_from_down, C10706R.anim.medallia_background_alpha);
            case 4:
                return new C11097t2(C10706R.anim.medallia_slide_from_right, C10706R.anim.medallia_slide_to_left);
            case 5:
                return new C11097t2(C10706R.anim.medallia_slide_from_left, C10706R.anim.medallia_slide_to_right);
            case 6:
                return new C11097t2(0, 0);
            default:
                return new C11097t2(C10706R.anim.medallia_from_fade_in, C10706R.anim.medallia_to_fade_out);
        }
    }

    /* renamed from: b */
    protected static C11097t2 m40686b(C11080r7 r7Var) {
        if (r7Var == null) {
            return new C11097t2(C10706R.anim.medallia_from_fade_out, C10706R.anim.medallia_to_fade_in);
        }
        switch (C11092a.f31920a[r7Var.ordinal()]) {
            case 1:
                return new C11097t2(C10706R.anim.medallia_from_fade_out, C10706R.anim.medallia_to_fade_in);
            case 2:
                return new C11097t2(C10706R.anim.medallia_background_alpha, C10706R.anim.medallia_slide_to_down);
            case 3:
                return new C11097t2(C10706R.anim.medallia_background_alpha, C10706R.anim.medallia_slide_up_down);
            case 4:
                return new C11097t2(C10706R.anim.medallia_slide_from_left, C10706R.anim.medallia_slide_to_right);
            case 5:
                return new C11097t2(C10706R.anim.medallia_slide_from_right, C10706R.anim.medallia_slide_to_left);
            case 6:
                return new C11097t2(0, 0);
            default:
                return new C11097t2(C10706R.anim.medallia_from_fade_out, C10706R.anim.medallia_to_fade_in);
        }
    }
}
