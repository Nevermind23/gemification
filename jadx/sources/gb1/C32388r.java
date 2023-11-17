package gb1;

import kotlin.jvm.internal.C41536l;

/* renamed from: gb1.r */
public abstract class C32388r {

    /* renamed from: a */
    private final C32389s f79838a;

    /* renamed from: b */
    private C32388r f79839b;

    /* renamed from: c */
    private C32388r f79840c;

    public C32388r(C32389s sVar) {
        C41536l.m120489i(sVar, "context");
        this.f79838a = sVar;
    }

    /* renamed from: f */
    public static /* synthetic */ void m95638f(C32388r rVar, boolean z, int i, Object obj) {
        if (obj == null) {
            if ((i & 1) != 0) {
                z = false;
            }
            rVar.mo72878e(z);
            return;
        }
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: prev");
    }

    /* renamed from: g */
    private final void m95639g(C32388r rVar) {
        this.f79839b = rVar;
    }

    /* renamed from: j */
    public static /* synthetic */ void m95640j(C32388r rVar, boolean z, int i, Object obj) {
        if (obj == null) {
            if ((i & 1) != 0) {
                z = true;
            }
            rVar.mo72880i(z);
            return;
        }
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: start");
    }

    /* renamed from: a */
    public abstract void mo72874a();

    /* renamed from: b */
    public abstract void mo72875b();

    /* renamed from: c */
    public final C32388r mo72876c(C32388r rVar) {
        if (rVar == null) {
            return this;
        }
        this.f79840c = rVar;
        rVar.m95639g(this);
        return rVar;
    }

    /* renamed from: d */
    public final void mo72877d() {
        C32388r rVar = this.f79840c;
        if (rVar != null) {
            m95640j(rVar, false, 1, (Object) null);
        }
    }

    /* renamed from: e */
    public final void mo72878e(boolean z) {
        C32388r rVar = this.f79839b;
        if (rVar != null) {
            rVar.mo72880i(z);
        }
    }

    /* renamed from: h */
    public final void mo72879h() {
        C32388r rVar;
        C32388r rVar2 = this.f79840c;
        if (rVar2 != null && (rVar = rVar2.f79840c) != null) {
            m95640j(rVar, false, 1, (Object) null);
        }
    }

    /* renamed from: i */
    public final void mo72880i(boolean z) {
        this.f79838a.mo72881a(this);
        mo72874a();
        if (z) {
            mo72875b();
        }
    }
}
