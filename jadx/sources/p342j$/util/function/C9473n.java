package p342j$.util.function;

import java.util.function.DoubleConsumer;

/* renamed from: j$.util.function.n */
public final /* synthetic */ class C9473n implements DoubleConsumer {

    /* renamed from: a */
    public final /* synthetic */ C9475o f26120a;

    private /* synthetic */ C9473n(C9475o oVar) {
        this.f26120a = oVar;
    }

    /* renamed from: a */
    public static /* synthetic */ DoubleConsumer m34831a(C9475o oVar) {
        if (oVar == null) {
            return null;
        }
        return oVar instanceof C9471m ? ((C9471m) oVar).f26118a : new C9473n(oVar);
    }

    public final /* synthetic */ void accept(double d) {
        this.f26120a.accept(d);
    }

    public final /* synthetic */ DoubleConsumer andThen(DoubleConsumer doubleConsumer) {
        return m34831a(this.f26120a.mo25296l(C9471m.m34828a(doubleConsumer)));
    }

    public final /* synthetic */ boolean equals(Object obj) {
        C9475o oVar = this.f26120a;
        if (obj instanceof C9473n) {
            obj = ((C9473n) obj).f26120a;
        }
        return oVar.equals(obj);
    }

    public final /* synthetic */ int hashCode() {
        return this.f26120a.hashCode();
    }
}
