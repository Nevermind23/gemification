package p342j$.util.function;

import java.util.function.BiFunction;
import java.util.function.BinaryOperator;
import java.util.function.Function;
import p342j$.util.function.Function;

/* renamed from: j$.util.function.e */
public final /* synthetic */ class C9455e implements BinaryOperator {

    /* renamed from: a */
    public final /* synthetic */ C9457f f26103a;

    private /* synthetic */ C9455e(C9457f fVar) {
        this.f26103a = fVar;
    }

    /* renamed from: a */
    public static /* synthetic */ BinaryOperator m34811a(C9457f fVar) {
        if (fVar == null) {
            return null;
        }
        return fVar instanceof C9453d ? ((C9453d) fVar).f26101a : new C9455e(fVar);
    }

    public final /* synthetic */ BiFunction andThen(Function function) {
        return C9449b.m34804a(this.f26103a.mo25417a(Function.VivifiedWrapper.convert(function)));
    }

    public final /* synthetic */ Object apply(Object obj, Object obj2) {
        return this.f26103a.apply(obj, obj2);
    }

    public final /* synthetic */ boolean equals(Object obj) {
        C9457f fVar = this.f26103a;
        if (obj instanceof C9455e) {
            obj = ((C9455e) obj).f26103a;
        }
        return fVar.equals(obj);
    }

    public final /* synthetic */ int hashCode() {
        return this.f26103a.hashCode();
    }
}
