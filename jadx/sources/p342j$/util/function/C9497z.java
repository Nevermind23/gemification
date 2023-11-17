package p342j$.util.function;

import java.util.function.Function;
import p342j$.util.function.Function;

/* renamed from: j$.util.function.z */
public final /* synthetic */ class C9497z implements Function {

    /* renamed from: a */
    public final /* synthetic */ Function f26142a;

    private /* synthetic */ C9497z(Function function) {
        this.f26142a = function;
    }

    /* renamed from: a */
    public static /* synthetic */ Function m34853a(Function function) {
        if (function == null) {
            return null;
        }
        return function instanceof Function.VivifiedWrapper ? ((Function.VivifiedWrapper) function).f26076a : function instanceof C9423B0 ? ((C9423B0) function).f26069a : new C9497z(function);
    }

    public final /* synthetic */ java.util.function.Function andThen(java.util.function.Function function) {
        return m34853a(this.f26142a.mo25463a(Function.VivifiedWrapper.convert(function)));
    }

    public final /* synthetic */ Object apply(Object obj) {
        return this.f26142a.apply(obj);
    }

    public final /* synthetic */ java.util.function.Function compose(java.util.function.Function function) {
        return m34853a(this.f26142a.mo25465b(Function.VivifiedWrapper.convert(function)));
    }

    public final /* synthetic */ boolean equals(Object obj) {
        Function function = this.f26142a;
        if (obj instanceof C9497z) {
            obj = ((C9497z) obj).f26142a;
        }
        return function.equals(obj);
    }

    public final /* synthetic */ int hashCode() {
        return this.f26142a.hashCode();
    }
}
