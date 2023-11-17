package p342j$.util.stream;

import p342j$.util.function.Consumer;
import p342j$.util.function.Predicate;
import p342j$.util.function.ToDoubleFunction;
import p342j$.util.function.ToIntFunction;
import p342j$.util.function.ToLongFunction;

/* renamed from: j$.util.stream.S1 */
final class C9594S1 extends C9637c2 {

    /* renamed from: b */
    public final /* synthetic */ int f26277b;

    /* renamed from: c */
    final /* synthetic */ C9634c f26278c;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C9594S1(C9634c cVar, C9657g2 g2Var, int i) {
        super(g2Var);
        this.f26277b = i;
        this.f26278c = cVar;
    }

    public final void accept(Object obj) {
        int i = this.f26277b;
        C9657g2 g2Var = this.f26360a;
        C9634c cVar = this.f26278c;
        switch (i) {
            case 0:
                ((Consumer) ((C9734w) cVar).f26506u).accept(obj);
                g2Var.accept(obj);
                return;
            case 1:
                if (((Predicate) ((C9734w) cVar).f26506u).test(obj)) {
                    g2Var.accept(obj);
                    return;
                }
                return;
            case 2:
                g2Var.accept(((C9602U1) cVar).f26291u.apply(obj));
                return;
            case 3:
                g2Var.accept(((ToIntFunction) ((C9739x) cVar).f26521u).applyAsInt(obj));
                return;
            case 4:
                g2Var.accept(((ToLongFunction) ((C9744y) cVar).f26527u).applyAsLong(obj));
                return;
            case 5:
                g2Var.accept(((ToDoubleFunction) ((C9729v) cVar).f26499u).applyAsDouble(obj));
                return;
            default:
                Stream stream = (Stream) ((C9602U1) cVar).f26291u.apply(obj);
                if (stream != null) {
                    try {
                        ((Stream) stream.sequential()).mo25932a(g2Var);
                    } catch (Throwable th) {
                        th.addSuppressed(th);
                        break;
                    }
                }
                if (stream != null) {
                    stream.close();
                    return;
                }
                return;
        }
        throw th;
    }

    /* renamed from: p */
    public final void mo25695p(long j) {
        int i = this.f26277b;
        C9657g2 g2Var = this.f26360a;
        switch (i) {
            case 1:
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
