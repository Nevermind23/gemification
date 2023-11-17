package p342j$.util.stream;

import p342j$.util.function.C9475o;
import p342j$.util.function.C9481r;
import p342j$.util.function.C9483s;
import p342j$.util.function.C9485t;
import p342j$.util.function.C9491w;
import p342j$.util.function.C9493x;

/* renamed from: j$.util.stream.u */
final class C9724u extends C9622Z1 {

    /* renamed from: b */
    public final /* synthetic */ int f26489b;

    /* renamed from: c */
    final /* synthetic */ C9634c f26490c;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C9724u(C9634c cVar, C9657g2 g2Var, int i) {
        super(g2Var);
        this.f26489b = i;
        this.f26490c = cVar;
    }

    public final void accept(double d) {
        int i = this.f26489b;
        C9657g2 g2Var = this.f26338a;
        C9634c cVar = this.f26490c;
        switch (i) {
            case 0:
                g2Var.accept(((C9493x) ((C9729v) cVar).f26499u).f26137a.applyAsDouble(d));
                return;
            case 1:
                g2Var.accept(((C9481r) ((C9734w) cVar).f26506u).apply(d));
                return;
            case 2:
                g2Var.accept(((C9485t) ((C9739x) cVar).f26521u).f26130a.applyAsInt(d));
                return;
            case 3:
                g2Var.accept(((C9491w) ((C9744y) cVar).f26527u).applyAsLong(d));
                return;
            case 4:
                C9543G g = (C9543G) ((C9481r) ((C9729v) cVar).f26499u).apply(d);
                if (g != null) {
                    try {
                        g.sequential().mo25678k(new C9719t(1, this));
                    } catch (Throwable th) {
                        th.addSuppressed(th);
                        break;
                    }
                }
                if (g != null) {
                    g.close();
                    return;
                }
                return;
            case 5:
                if (((C9483s) ((C9729v) cVar).f26499u).f26128a.test(d)) {
                    g2Var.accept(d);
                    return;
                }
                return;
            default:
                ((C9475o) ((C9729v) cVar).f26499u).accept(d);
                g2Var.accept(d);
                return;
        }
        throw th;
    }

    /* renamed from: p */
    public final void mo25695p(long j) {
        int i = this.f26489b;
        C9657g2 g2Var = this.f26338a;
        switch (i) {
            case 4:
                g2Var.mo25695p(-1);
                return;
            case 5:
                g2Var.mo25695p(-1);
                return;
            default:
                g2Var.mo25695p(j);
                return;
        }
    }
}
