package p342j$.util.stream;

import java.util.List;
import java.util.Set;
import p342j$.util.concurrent.C9407t;
import p342j$.util.function.BiFunction;
import p342j$.util.function.C9457f;
import p342j$.util.function.Function;

/* renamed from: j$.util.stream.m */
public final /* synthetic */ class C9684m implements C9457f {

    /* renamed from: a */
    public final /* synthetic */ int f26420a;

    public /* synthetic */ C9684m(int i) {
        this.f26420a = i;
    }

    /* renamed from: a */
    public final BiFunction mo25417a(Function function) {
        switch (this.f26420a) {
            case 0:
                function.getClass();
                return new C9407t(this, function);
            case 1:
                function.getClass();
                return new C9407t(this, function);
            case 2:
                function.getClass();
                return new C9407t(this, function);
            case 3:
                function.getClass();
                return new C9407t(this, function);
            default:
                function.getClass();
                return new C9407t(this, function);
        }
    }

    public final Object apply(Object obj, Object obj2) {
        switch (this.f26420a) {
            case 0:
                List list = (List) obj;
                Set set = Collectors.f26178a;
                list.addAll((List) obj2);
                return list;
            case 1:
                return new C9574N0((C9519B0) obj, (C9519B0) obj2);
            case 2:
                return new C9578O0((C9524C0) obj, (C9524C0) obj2);
            case 3:
                return new C9582P0((C9529D0) obj, (C9529D0) obj2);
            default:
                return new C9589R0((C9539F0) obj, (C9539F0) obj2);
        }
    }
}
