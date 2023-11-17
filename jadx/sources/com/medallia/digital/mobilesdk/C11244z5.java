package com.medallia.digital.mobilesdk;

/* renamed from: com.medallia.digital.mobilesdk.z5 */
class C11244z5 {

    /* renamed from: a */
    private final int f32604a;

    /* renamed from: b */
    private final C11245a f32605b;

    /* renamed from: com.medallia.digital.mobilesdk.z5$a */
    enum C11245a {
        NO_CONNECTION,
        TIMEOUT,
        OTHER;

        /* renamed from: a */
        public static C11245a m41211a(int i) {
            return (i == 408 || i == 504 || i == -46) ? TIMEOUT : i == -45 ? NO_CONNECTION : OTHER;
        }
    }

    protected C11244z5(int i) {
        this.f32604a = i;
        this.f32605b = C11245a.m41211a(i);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public C11245a mo29258a() {
        return this.f32605b;
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public int mo29259b() {
        return this.f32604a;
    }
}
