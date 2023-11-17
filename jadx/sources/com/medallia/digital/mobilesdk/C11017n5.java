package com.medallia.digital.mobilesdk;

/* renamed from: com.medallia.digital.mobilesdk.n5 */
class C11017n5 {

    /* renamed from: a */
    private C11018a f31672a;

    /* renamed from: b */
    private long f31673b;

    /* renamed from: com.medallia.digital.mobilesdk.n5$a */
    enum C11018a {
        ONCE,
        FREQUENCY
    }

    C11017n5() {
        this.f31672a = C11018a.ONCE;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public long mo28833a() {
        return this.f31673b;
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public C11018a mo28835b() {
        if (this.f31672a == null) {
            this.f31672a = C11018a.ONCE;
        }
        return this.f31672a;
    }

    C11017n5(long j) {
        this.f31673b = j;
        this.f31672a = j == 0 ? C11018a.ONCE : C11018a.FREQUENCY;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo28834a(long j) {
        this.f31673b = j;
    }
}
