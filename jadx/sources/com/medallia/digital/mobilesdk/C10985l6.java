package com.medallia.digital.mobilesdk;

import android.content.Context;

/* renamed from: com.medallia.digital.mobilesdk.l6 */
class C10985l6 {

    /* renamed from: a */
    private static final int f31549a = 24;

    C10985l6() {
    }

    /* renamed from: a */
    protected static int m40215a() {
        return (C10884i4.m39721c().mo28483b().getResources().getDisplayMetrics().densityDpi * 24) / 160;
    }

    /* renamed from: b */
    protected static int m40217b() {
        return C10884i4.m39721c().mo28483b().getResources().getIdentifier("status_bar_height", "dimen", "android");
    }

    /* renamed from: c */
    protected static boolean m40218c() {
        return (m40217b() > 0 ? C10884i4.m39721c().mo28483b().getResources().getDimensionPixelSize(C10884i4.m39721c().mo28483b().getResources().getIdentifier("status_bar_height", "dimen", "android")) : 0) > m40215a();
    }

    /* renamed from: a */
    protected static int m40216a(Context context, int i) {
        return context == null ? i : (i * context.getResources().getDisplayMetrics().densityDpi) / 160;
    }
}
