package p165m2;

import com.androidnetworking.error.ANError;
import of1.C41880d0;
import p113i2.C6511a;
import p113i2.C6521b;
import p113i2.C6524e;
import p113i2.C6525f;
import p126j2.C6684b;
import p191o2.C7420b;
import p191o2.C7421c;

/* renamed from: m2.d */
public class C7071d implements Runnable {

    /* renamed from: d */
    private final C6524e f21010d;

    /* renamed from: e */
    public final int f21011e;

    /* renamed from: f */
    public final C6511a f21012f;

    /* renamed from: m2.d$a */
    class C7072a implements Runnable {

        /* renamed from: d */
        final /* synthetic */ C6511a f21013d;

        /* renamed from: e */
        final /* synthetic */ ANError f21014e;

        C7072a(C6511a aVar, ANError aNError) {
            this.f21013d = aVar;
            this.f21014e = aNError;
        }

        public void run() {
            this.f21013d.mo20460g(this.f21014e);
            this.f21013d.mo20466o();
        }
    }

    public C7071d(C6511a aVar) {
        this.f21012f = aVar;
        this.f21011e = aVar.mo20447E();
        this.f21010d = aVar.mo20443A();
    }

    /* renamed from: a */
    private void m27335a(C6511a aVar, ANError aNError) {
        C6684b.m26121b().mo20675a().mo20676a().execute(new C7072a(aVar, aNError));
    }

    /* renamed from: b */
    private void m27336b() {
        try {
            C41880d0 d = C7068c.m27330d(this.f21012f);
            if (d == null) {
                m27335a(this.f21012f, C7421c.m28233d(new ANError()));
            } else if (d.mo96747q() >= 400) {
                m27335a(this.f21012f, C7421c.m28235f(new ANError(d), this.f21012f, d.mo96747q()));
            } else {
                this.f21012f.mo20459Q();
            }
        } catch (Exception e) {
            m27335a(this.f21012f, C7421c.m28233d(new ANError((Throwable) e)));
        }
    }

    /* renamed from: c */
    private void m27337c() {
        C41880d0 d0Var = null;
        try {
            d0Var = C7068c.m27331e(this.f21012f);
            if (d0Var == null) {
                m27335a(this.f21012f, C7421c.m28233d(new ANError()));
            } else if (this.f21012f.mo20446D() == C6525f.OK_HTTP_RESPONSE) {
                this.f21012f.mo20461i(d0Var);
            } else if (d0Var.mo96747q() >= 400) {
                m27335a(this.f21012f, C7421c.m28235f(new ANError(d0Var), this.f21012f, d0Var.mo96747q()));
            } else {
                C6521b J = this.f21012f.mo20452J(d0Var);
                if (!J.mo20499d()) {
                    m27335a(this.f21012f, J.mo20497b());
                } else {
                    J.mo20500e(d0Var);
                    this.f21012f.mo20462j(J);
                    C7420b.m28229a(d0Var, this.f21012f);
                    return;
                }
            }
            C7420b.m28229a(d0Var, this.f21012f);
        } catch (Exception e) {
            m27335a(this.f21012f, C7421c.m28233d(new ANError((Throwable) e)));
        } catch (Throwable th) {
            C7420b.m28229a(d0Var, this.f21012f);
            throw th;
        }
    }

    /* renamed from: d */
    private void m27338d() {
        C41880d0 d0Var = null;
        try {
            d0Var = C7068c.m27332f(this.f21012f);
            if (d0Var == null) {
                m27335a(this.f21012f, C7421c.m28233d(new ANError()));
            } else if (this.f21012f.mo20446D() == C6525f.OK_HTTP_RESPONSE) {
                this.f21012f.mo20461i(d0Var);
            } else if (d0Var.mo96747q() >= 400) {
                m27335a(this.f21012f, C7421c.m28235f(new ANError(d0Var), this.f21012f, d0Var.mo96747q()));
            } else {
                C6521b J = this.f21012f.mo20452J(d0Var);
                if (!J.mo20499d()) {
                    m27335a(this.f21012f, J.mo20497b());
                } else {
                    J.mo20500e(d0Var);
                    this.f21012f.mo20462j(J);
                    C7420b.m28229a(d0Var, this.f21012f);
                    return;
                }
            }
            C7420b.m28229a(d0Var, this.f21012f);
        } catch (Exception e) {
            m27335a(this.f21012f, C7421c.m28233d(new ANError((Throwable) e)));
        } catch (Throwable th) {
            C7420b.m28229a(d0Var, this.f21012f);
            throw th;
        }
    }

    /* renamed from: e */
    public C6524e mo21295e() {
        return this.f21010d;
    }

    public void run() {
        this.f21012f.mo20455M(true);
        int C = this.f21012f.mo20445C();
        if (C == 0) {
            m27337c();
        } else if (C == 1) {
            m27336b();
        } else if (C == 2) {
            m27338d();
        }
        this.f21012f.mo20455M(false);
    }
}
