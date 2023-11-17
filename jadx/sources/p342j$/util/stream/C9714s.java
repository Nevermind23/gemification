package p342j$.util.stream;

import p342j$.util.concurrent.C9407t;
import p342j$.util.function.BiConsumer;
import p342j$.util.function.BiFunction;
import p342j$.util.function.C9457f;
import p342j$.util.function.Function;

/* renamed from: j$.util.stream.s */
public final /* synthetic */ class C9714s implements C9457f {

    /* renamed from: a */
    public final /* synthetic */ int f26473a;

    /* renamed from: b */
    public final /* synthetic */ BiConsumer f26474b;

    public /* synthetic */ C9714s(BiConsumer biConsumer, int i) {
        this.f26473a = i;
        this.f26474b = biConsumer;
    }

    /* renamed from: a */
    public final BiFunction mo25417a(Function function) {
        switch (this.f26473a) {
            case 0:
                function.getClass();
                return new C9407t(this, function);
            case 1:
                function.getClass();
                return new C9407t(this, function);
            default:
                function.getClass();
                return new C9407t(this, function);
        }
    }

    public final Object apply(Object obj, Object obj2) {
        int i = this.f26473a;
        BiConsumer biConsumer = this.f26474b;
        switch (i) {
            case 0:
                biConsumer.accept(obj, obj2);
                return obj;
            case 1:
                int i2 = C9645e0.f26369s;
                biConsumer.accept(obj, obj2);
                return obj;
            default:
                int i3 = C9675k0.f26408s;
                biConsumer.accept(obj, obj2);
                return obj;
        }
    }
}
