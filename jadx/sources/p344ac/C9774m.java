package p344ac;

/* renamed from: ac.m */
final class C9774m {

    /* renamed from: a */
    private int f26554a = 0;

    /* renamed from: b */
    private C9775a f26555b = C9775a.NUMERIC;

    /* renamed from: ac.m$a */
    private enum C9775a {
        NUMERIC,
        ALPHA,
        ISO_IEC_646
    }

    C9774m() {
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public int mo26226a() {
        return this.f26554a;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public void mo26227b(int i) {
        this.f26554a += i;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public boolean mo26228c() {
        return this.f26555b == C9775a.ALPHA;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: d */
    public boolean mo26229d() {
        return this.f26555b == C9775a.ISO_IEC_646;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: e */
    public void mo26230e() {
        this.f26555b = C9775a.ALPHA;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: f */
    public void mo26231f() {
        this.f26555b = C9775a.ISO_IEC_646;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: g */
    public void mo26232g() {
        this.f26555b = C9775a.NUMERIC;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: h */
    public void mo26233h(int i) {
        this.f26554a = i;
    }
}
