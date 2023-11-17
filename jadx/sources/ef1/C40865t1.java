package ef1;

import java.util.concurrent.CancellationException;
import me1.C41752f;

/* renamed from: ef1.t1 */
abstract /* synthetic */ class C40865t1 {
    /* renamed from: a */
    public static final C40875w m118459a(C40845o1 o1Var) {
        return new C40856q1(o1Var);
    }

    /* renamed from: b */
    public static /* synthetic */ C40875w m118460b(C40845o1 o1Var, int i, Object obj) {
        if ((i & 1) != 0) {
            o1Var = null;
        }
        return C40859r1.m118438a(o1Var);
    }

    /* renamed from: c */
    public static final void m118461c(C41752f fVar, CancellationException cancellationException) {
        C40845o1 o1Var = (C40845o1) fVar.mo23736c(C40845o1.f96561d3);
        if (o1Var != null) {
            o1Var.mo95211a(cancellationException);
        }
    }

    /* renamed from: d */
    public static /* synthetic */ void m118462d(C41752f fVar, CancellationException cancellationException, int i, Object obj) {
        if ((i & 1) != 0) {
            cancellationException = null;
        }
        C40859r1.m118440c(fVar, cancellationException);
    }

    /* renamed from: e */
    public static final void m118463e(C40845o1 o1Var) {
        if (!o1Var.mo95131k()) {
            throw o1Var.mo95212n();
        }
    }

    /* renamed from: f */
    public static final void m118464f(C41752f fVar) {
        C40845o1 o1Var = (C40845o1) fVar.mo23736c(C40845o1.f96561d3);
        if (o1Var != null) {
            C40859r1.m118443f(o1Var);
        }
    }
}
