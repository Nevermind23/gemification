package p342j$.util.stream;

import p342j$.util.function.BiConsumer;
import p342j$.util.function.C9457f;
import p342j$.util.function.C9494x0;

/* renamed from: j$.util.stream.F1 */
final class C9540F1 extends C9735w0 {

    /* renamed from: h */
    final /* synthetic */ C9457f f26194h;

    /* renamed from: i */
    final /* synthetic */ BiConsumer f26195i;

    /* renamed from: j */
    final /* synthetic */ C9494x0 f26196j;

    /* renamed from: k */
    final /* synthetic */ Collector f26197k;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    C9540F1(C9611W2 w2, C9457f fVar, BiConsumer biConsumer, C9494x0 x0Var, Collector collector) {
        super(w2);
        this.f26194h = fVar;
        this.f26195i = biConsumer;
        this.f26196j = x0Var;
        this.f26197k = collector;
    }

    /* renamed from: u */
    public final int mo25754u() {
        if (this.f26197k.characteristics().contains(C9669j.UNORDERED)) {
            return C9607V2.f26310r;
        }
        return 0;
    }

    /* renamed from: u1 */
    public final C9583P1 mo25683u1() {
        return new C9545G1(this.f26196j, this.f26195i, this.f26194h);
    }
}
