package p342j$.util.function;

import java.util.function.DoubleConsumer;

/* renamed from: j$.util.function.m */
public final /* synthetic */ class C9471m implements C9475o {

    /* renamed from: a */
    public final /* synthetic */ DoubleConsumer f26118a;

    private /* synthetic */ C9471m(DoubleConsumer doubleConsumer) {
        this.f26118a = doubleConsumer;
    }

    /* renamed from: a */
    public static /* synthetic */ C9475o m34828a(DoubleConsumer doubleConsumer) {
        if (doubleConsumer == null) {
            return null;
        }
        return doubleConsumer instanceof C9473n ? ((C9473n) doubleConsumer).f26120a : new C9471m(doubleConsumer);
    }

    public final /* synthetic */ void accept(double d) {
        this.f26118a.accept(d);
    }

    public final /* synthetic */ boolean equals(Object obj) {
        if (obj instanceof C9471m) {
            obj = ((C9471m) obj).f26118a;
        }
        return this.f26118a.equals(obj);
    }

    public final /* synthetic */ int hashCode() {
        return this.f26118a.hashCode();
    }

    /* renamed from: l */
    public final /* synthetic */ C9475o mo25296l(C9475o oVar) {
        return m34828a(this.f26118a.andThen(C9473n.m34831a(oVar)));
    }
}
