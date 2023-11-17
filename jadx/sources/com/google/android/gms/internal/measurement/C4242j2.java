package com.google.android.gms.internal.measurement;

/* renamed from: com.google.android.gms.internal.measurement.j2 */
abstract class C4242j2 implements Runnable {

    /* renamed from: d */
    final long f13361d;

    /* renamed from: e */
    final long f13362e;

    /* renamed from: f */
    final boolean f13363f;

    /* renamed from: g */
    final /* synthetic */ C4429u2 f13364g;

    C4242j2(C4429u2 u2Var, boolean z) {
        this.f13364g = u2Var;
        this.f13361d = u2Var.f13719b.mo23594a();
        this.f13362e = u2Var.f13719b.mo23596c();
        this.f13363f = z;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public abstract void mo12836a();

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public void mo12837b() {
    }

    public final void run() {
        if (this.f13364g.f13724g) {
            mo12837b();
            return;
        }
        try {
            mo12836a();
        } catch (Exception e) {
            this.f13364g.m16792j(e, false, this.f13363f);
            mo12837b();
        }
    }
}
