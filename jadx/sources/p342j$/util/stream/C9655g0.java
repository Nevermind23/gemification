package p342j$.util.stream;

import p342j$.util.function.C9444X;
import p342j$.util.function.C9448a0;
import p342j$.util.function.C9450b0;
import p342j$.util.function.C9452c0;
import p342j$.util.function.C9454d0;
import p342j$.util.function.C9462h0;

/* renamed from: j$.util.stream.g0 */
final class C9655g0 extends C9632b2 {

    /* renamed from: b */
    public final /* synthetic */ int f26386b;

    /* renamed from: c */
    final /* synthetic */ C9634c f26387c;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C9655g0(C9634c cVar, C9657g2 g2Var, int i) {
        super(g2Var);
        this.f26386b = i;
        this.f26387c = cVar;
    }

    public final void accept(long j) {
        int i = this.f26386b;
        C9634c cVar = this.f26387c;
        C9657g2 g2Var = this.f26347a;
        switch (i) {
            case 0:
                g2Var.accept((double) j);
                return;
            case 1:
                g2Var.accept(((C9462h0) ((C9744y) cVar).f26527u).applyAsLong(j));
                return;
            case 2:
                g2Var.accept(((C9448a0) ((C9734w) cVar).f26506u).apply(j));
                return;
            case 3:
                g2Var.accept(((C9454d0) ((C9739x) cVar).f26521u).f26102a.applyAsInt(j));
                return;
            case 4:
                g2Var.accept(((C9452c0) ((C9729v) cVar).f26499u).f26100a.applyAsDouble(j));
                return;
            case 5:
                C9690n0 n0Var = (C9690n0) ((C9448a0) ((C9744y) cVar).f26527u).apply(j);
                if (n0Var != null) {
                    try {
                        n0Var.sequential().mo26066e(new C9650f0(1, this));
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
            case 6:
                if (((C9450b0) ((C9744y) cVar).f26527u).f26097a.test(j)) {
                    g2Var.accept(j);
                    return;
                }
                return;
            default:
                ((C9444X) ((C9744y) cVar).f26527u).accept(j);
                g2Var.accept(j);
                return;
        }
        throw th;
    }

    /* renamed from: p */
    public final void mo25695p(long j) {
        int i = this.f26386b;
        C9657g2 g2Var = this.f26347a;
        switch (i) {
            case 5:
                g2Var.mo25695p(-1);
                return;
            case 6:
                g2Var.mo25695p(-1);
                return;
            default:
                g2Var.mo25695p(j);
                return;
        }
    }
}
