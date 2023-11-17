package p342j$.util.function;

import java.util.function.UnaryOperator;
import p342j$.util.function.Function;

/* renamed from: j$.util.function.B0 */
public final /* synthetic */ class C9423B0 implements Function {

    /* renamed from: a */
    public final /* synthetic */ UnaryOperator f26069a;

    private /* synthetic */ C9423B0(UnaryOperator unaryOperator) {
        this.f26069a = unaryOperator;
    }

    /* renamed from: c */
    public static /* synthetic */ C9423B0 m34770c(UnaryOperator unaryOperator) {
        if (unaryOperator == null) {
            return null;
        }
        return new C9423B0(unaryOperator);
    }

    /* renamed from: a */
    public final /* synthetic */ Function mo25463a(Function function) {
        return Function.VivifiedWrapper.convert(this.f26069a.andThen(C9497z.m34853a(function)));
    }

    public final /* synthetic */ Object apply(Object obj) {
        return this.f26069a.apply(obj);
    }

    /* renamed from: b */
    public final /* synthetic */ Function mo25465b(Function function) {
        return Function.VivifiedWrapper.convert(this.f26069a.compose(C9497z.m34853a(function)));
    }

    public final /* synthetic */ boolean equals(Object obj) {
        if (obj instanceof C9423B0) {
            obj = ((C9423B0) obj).f26069a;
        }
        return this.f26069a.equals(obj);
    }

    public final /* synthetic */ int hashCode() {
        return this.f26069a.hashCode();
    }
}
