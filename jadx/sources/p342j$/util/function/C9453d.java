package p342j$.util.function;

import java.util.function.BinaryOperator;
import p342j$.util.function.BiFunction;

/* renamed from: j$.util.function.d */
public final /* synthetic */ class C9453d implements C9457f {

    /* renamed from: a */
    public final /* synthetic */ BinaryOperator f26101a;

    private /* synthetic */ C9453d(BinaryOperator binaryOperator) {
        this.f26101a = binaryOperator;
    }

    /* renamed from: b */
    public static /* synthetic */ C9457f m34808b(BinaryOperator binaryOperator) {
        if (binaryOperator == null) {
            return null;
        }
        return binaryOperator instanceof C9455e ? ((C9455e) binaryOperator).f26103a : new C9453d(binaryOperator);
    }

    /* renamed from: a */
    public final /* synthetic */ BiFunction mo25417a(Function function) {
        return BiFunction.VivifiedWrapper.convert(this.f26101a.andThen(C9497z.m34853a(function)));
    }

    public final /* synthetic */ Object apply(Object obj, Object obj2) {
        return this.f26101a.apply(obj, obj2);
    }

    public final /* synthetic */ boolean equals(Object obj) {
        if (obj instanceof C9453d) {
            obj = ((C9453d) obj).f26101a;
        }
        return this.f26101a.equals(obj);
    }

    public final /* synthetic */ int hashCode() {
        return this.f26101a.hashCode();
    }
}
