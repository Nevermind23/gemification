package p202p0;

import kotlin.jvm.internal.C41536l;
import p202p0.C7602w;
import ue1.C43075l;

/* renamed from: p0.x */
public final class C7604x {

    /* renamed from: a */
    private final C7602w.C7603a f22188a = new C7602w.C7603a();

    /* renamed from: b */
    private boolean f22189b;

    /* renamed from: c */
    private boolean f22190c;

    /* renamed from: d */
    private int f22191d = -1;

    /* renamed from: e */
    private String f22192e;

    /* renamed from: f */
    private boolean f22193f;

    /* renamed from: g */
    private boolean f22194g;

    /* renamed from: f */
    private final void m28923f(String str) {
        if (str == null) {
            return;
        }
        if (!C40439w.m117118v(str)) {
            this.f22192e = str;
            this.f22193f = false;
            return;
        }
        throw new IllegalArgumentException("Cannot pop up to an empty route".toString());
    }

    /* renamed from: a */
    public final void mo22265a(C43075l lVar) {
        C41536l.m120489i(lVar, "animBuilder");
        C7529c cVar = new C7529c();
        lVar.invoke(cVar);
        this.f22188a.mo22257b(cVar.mo22042a()).mo22258c(cVar.mo22043b()).mo22260e(cVar.mo22044c()).mo22261f(cVar.mo22045d());
    }

    /* renamed from: b */
    public final C7602w mo22266b() {
        C7602w.C7603a aVar = this.f22188a;
        aVar.mo22259d(this.f22189b);
        aVar.mo22264j(this.f22190c);
        String str = this.f22192e;
        if (str != null) {
            aVar.mo22263h(str, this.f22193f, this.f22194g);
        } else {
            aVar.mo22262g(this.f22191d, this.f22193f, this.f22194g);
        }
        return aVar.mo22256a();
    }

    /* renamed from: c */
    public final void mo22267c(int i, C43075l lVar) {
        C41536l.m120489i(lVar, "popUpToBuilder");
        mo22269e(i);
        m28923f((String) null);
        C7541f0 f0Var = new C7541f0();
        lVar.invoke(f0Var);
        this.f22193f = f0Var.mo22079a();
        this.f22194g = f0Var.mo22080b();
    }

    /* renamed from: d */
    public final void mo22268d(boolean z) {
        this.f22189b = z;
    }

    /* renamed from: e */
    public final void mo22269e(int i) {
        this.f22191d = i;
        this.f22193f = false;
    }
}
