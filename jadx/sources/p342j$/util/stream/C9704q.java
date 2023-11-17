package p342j$.util.stream;

import java.util.HashSet;
import java.util.Set;
import p342j$.util.function.C9428G;
import p342j$.util.function.C9444X;
import p342j$.util.function.C9475o;
import p342j$.util.function.Function;

/* renamed from: j$.util.stream.q */
final class C9704q extends C9637c2 {

    /* renamed from: b */
    public final /* synthetic */ int f26451b = 0;

    /* renamed from: c */
    Object f26452c;

    /* renamed from: d */
    final /* synthetic */ C9634c f26453d;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C9704q(C9709r rVar, C9657g2 g2Var) {
        super(g2Var);
        this.f26453d = rVar;
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C9704q(C9729v vVar, C9657g2 g2Var) {
        super(g2Var);
        this.f26453d = vVar;
        this.f26452c = new C9719t(0, g2Var);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C9704q(C9739x xVar, C9657g2 g2Var) {
        super(g2Var);
        this.f26453d = xVar;
        this.f26452c = new C9608W(0, g2Var);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C9704q(C9744y yVar, C9657g2 g2Var) {
        super(g2Var);
        this.f26453d = yVar;
        this.f26452c = new C9650f0(0, g2Var);
    }

    public final void accept(Object obj) {
        int i = this.f26451b;
        C9634c cVar = this.f26453d;
        switch (i) {
            case 0:
                if (!((Set) this.f26452c).contains(obj)) {
                    ((Set) this.f26452c).add(obj);
                    this.f26360a.accept(obj);
                    return;
                }
                return;
            case 1:
                C9690n0 n0Var = (C9690n0) ((Function) ((C9744y) cVar).f26527u).apply(obj);
                if (n0Var != null) {
                    try {
                        n0Var.sequential().mo26066e((C9444X) this.f26452c);
                    } catch (Throwable th) {
                        th.addSuppressed(th);
                        break;
                    }
                }
                if (n0Var != null) {
                    n0Var.close();
                    return;
                }
                return;
            case 2:
                IntStream intStream = (IntStream) ((Function) ((C9739x) cVar).f26521u).apply(obj);
                if (intStream != null) {
                    try {
                        intStream.sequential().mo25810P((C9428G) this.f26452c);
                    } catch (Throwable th2) {
                        th.addSuppressed(th2);
                        break;
                    }
                }
                if (intStream != null) {
                    intStream.close();
                    return;
                }
                return;
            default:
                C9543G g = (C9543G) ((Function) ((C9729v) cVar).f26499u).apply(obj);
                if (g != null) {
                    try {
                        g.sequential().mo25678k((C9475o) this.f26452c);
                    } catch (Throwable th3) {
                        th.addSuppressed(th3);
                        break;
                    }
                }
                if (g != null) {
                    g.close();
                    return;
                }
                return;
        }
        throw th;
        throw th;
        throw th;
    }

    /* renamed from: o */
    public final void mo25694o() {
        switch (this.f26451b) {
            case 0:
                this.f26452c = null;
                this.f26360a.mo25694o();
                return;
            default:
                super.mo25694o();
                return;
        }
    }

    /* renamed from: p */
    public final void mo25695p(long j) {
        int i = this.f26451b;
        C9657g2 g2Var = this.f26360a;
        switch (i) {
            case 0:
                this.f26452c = new HashSet();
                g2Var.mo25695p(-1);
                return;
            case 1:
                g2Var.mo25695p(-1);
                return;
            case 2:
                g2Var.mo25695p(-1);
                return;
            default:
                g2Var.mo25695p(-1);
                return;
        }
    }
}
