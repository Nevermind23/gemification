package p342j$.util.stream;

import p342j$.util.function.C9428G;
import p342j$.util.function.C9431J;
import p342j$.util.function.C9432K;
import p342j$.util.function.C9433L;
import p342j$.util.function.C9436O;
import p342j$.util.function.C9437P;

/* renamed from: j$.util.stream.Y */
final class C9616Y extends C9627a2 {

    /* renamed from: b */
    public final /* synthetic */ int f26333b;

    /* renamed from: c */
    final /* synthetic */ C9634c f26334c;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C9616Y(C9634c cVar, C9657g2 g2Var, int i) {
        super(g2Var);
        this.f26333b = i;
        this.f26334c = cVar;
    }

    public final void accept(int i) {
        int i2 = this.f26333b;
        C9634c cVar = this.f26334c;
        C9657g2 g2Var = this.f26342a;
        switch (i2) {
            case 0:
                g2Var.accept((long) i);
                return;
            case 1:
                ((C9428G) ((C9739x) cVar).f26521u).accept(i);
                g2Var.accept(i);
                return;
            case 2:
                g2Var.accept((double) i);
                return;
            case 3:
                g2Var.accept(((C9437P) ((C9739x) cVar).f26521u).f26083a.applyAsInt(i));
                return;
            case 4:
                g2Var.accept(((C9431J) ((C9734w) cVar).f26506u).apply(i));
                return;
            case 5:
                g2Var.accept(((C9436O) ((C9744y) cVar).f26527u).applyAsLong(i));
                return;
            case 6:
                g2Var.accept(((C9433L) ((C9729v) cVar).f26499u).f26080a.applyAsDouble(i));
                return;
            case 7:
                IntStream intStream = (IntStream) ((C9431J) ((C9739x) cVar).f26521u).apply(i);
                if (intStream != null) {
                    try {
                        intStream.sequential().mo25810P(new C9608W(1, this));
                    } catch (Throwable th) {
                        th.addSuppressed(th);
                        break;
                    }
                }
                if (intStream != null) {
                    intStream.close();
                    return;
                }
                return;
            default:
                if (((C9432K) ((C9739x) cVar).f26521u).f26079a.test(i)) {
                    g2Var.accept(i);
                    return;
                }
                return;
        }
        throw th;
    }

    /* renamed from: p */
    public final void mo25695p(long j) {
        int i = this.f26333b;
        C9657g2 g2Var = this.f26342a;
        switch (i) {
            case 7:
                g2Var.mo25695p(-1);
                return;
            case 8:
                g2Var.mo25695p(-1);
                return;
            default:
                g2Var.mo25695p(j);
                return;
        }
    }
}
