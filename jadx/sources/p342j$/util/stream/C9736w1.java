package p342j$.util.stream;

import p342j$.util.function.BiConsumer;
import p342j$.util.function.BiFunction;
import p342j$.util.function.C9457f;
import p342j$.util.function.C9468k0;
import p342j$.util.function.C9474n0;
import p342j$.util.function.C9480q0;
import p342j$.util.function.C9494x0;

/* renamed from: j$.util.stream.w1 */
final class C9736w1 extends C9735w0 {

    /* renamed from: h */
    public final /* synthetic */ int f26514h;

    /* renamed from: i */
    final /* synthetic */ Object f26515i;

    /* renamed from: j */
    final /* synthetic */ Object f26516j;

    /* renamed from: k */
    final /* synthetic */ Object f26517k;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C9736w1(C9611W2 w2, Object obj, Object obj2, Object obj3, int i) {
        super(w2);
        this.f26514h = i;
        this.f26515i = obj;
        this.f26517k = obj2;
        this.f26516j = obj3;
    }

    /* renamed from: u1 */
    public final C9583P1 mo25683u1() {
        int i = this.f26514h;
        Object obj = this.f26515i;
        Object obj2 = this.f26517k;
        Object obj3 = this.f26516j;
        switch (i) {
            case 0:
                return new C9741x1((C9494x0) obj3, (C9480q0) obj2, (C9457f) obj);
            case 1:
                return new C9525C1((C9494x0) obj3, (C9468k0) obj2, (C9457f) obj);
            case 2:
                return new C9530D1(obj3, (BiFunction) obj2, (C9457f) obj);
            case 3:
                return new C9550H1((C9494x0) obj3, (BiConsumer) obj2, (BiConsumer) obj);
            default:
                return new C9567L1((C9494x0) obj3, (C9474n0) obj2, (C9457f) obj);
        }
    }
}
