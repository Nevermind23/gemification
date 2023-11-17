package p342j$.util.function;

import java.util.Comparator;
import p342j$.util.concurrent.C9407t;

/* renamed from: j$.util.function.c */
public final /* synthetic */ class C9451c implements C9457f {

    /* renamed from: a */
    public final /* synthetic */ int f26098a;

    /* renamed from: b */
    public final /* synthetic */ Comparator f26099b;

    public /* synthetic */ C9451c(Comparator comparator, int i) {
        this.f26098a = i;
        this.f26099b = comparator;
    }

    /* renamed from: a */
    public final BiFunction mo25417a(Function function) {
        switch (this.f26098a) {
            case 0:
                function.getClass();
                return new C9407t(this, function);
            default:
                function.getClass();
                return new C9407t(this, function);
        }
    }

    public final Object apply(Object obj, Object obj2) {
        int i = this.f26098a;
        Comparator comparator = this.f26099b;
        switch (i) {
            case 0:
                return comparator.compare(obj, obj2) >= 0 ? obj : obj2;
            default:
                return comparator.compare(obj, obj2) <= 0 ? obj : obj2;
        }
    }
}
