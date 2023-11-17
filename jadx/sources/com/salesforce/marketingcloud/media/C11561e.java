package com.salesforce.marketingcloud.media;

/* renamed from: com.salesforce.marketingcloud.media.e */
class C11561e implements Runnable {

    /* renamed from: a */
    final C11580o f33553a;

    /* renamed from: b */
    final C11560d f33554b;

    /* renamed from: c */
    final C11564h f33555c;

    /* renamed from: d */
    private Exception f33556d;

    C11561e(C11564h hVar, C11560d dVar) {
        this.f33553a = dVar.mo30181c();
        this.f33555c = hVar;
        this.f33554b = dVar;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public Exception mo30183a() {
        return this.f33556d;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public boolean mo30184b() {
        return this.f33556d != null;
    }

    public void run() {
        try {
            Thread.currentThread().setName("CacheCleaner - Cleaning");
            C11586r a = this.f33554b.mo30179a();
            for (String b : this.f33554b.mo30182d()) {
                a.mo30244b(b);
            }
            a.mo30242a();
        } catch (Exception e) {
            this.f33556d = e;
        } catch (Throwable th) {
            Thread.currentThread().setName("CacheCleaner - Idle");
            throw th;
        }
        Thread.currentThread().setName("CacheCleaner - Idle");
        this.f33555c.mo30192a(this);
    }
}
