package p342j$.util;

import java.io.Serializable;
import java.util.Comparator;
import p342j$.util.function.Function;

/* renamed from: j$.util.d */
public final /* synthetic */ class C9414d implements Comparator, Serializable {

    /* renamed from: a */
    public final /* synthetic */ int f26049a;

    /* renamed from: b */
    public final /* synthetic */ Comparator f26050b;

    /* renamed from: c */
    public final /* synthetic */ Object f26051c;

    public /* synthetic */ C9414d(Comparator comparator, Object obj, int i) {
        this.f26049a = i;
        this.f26050b = comparator;
        this.f26051c = obj;
    }

    public final int compare(Object obj, Object obj2) {
        switch (this.f26049a) {
            case 0:
                Comparator comparator = this.f26050b;
                Comparator comparator2 = (Comparator) this.f26051c;
                int compare = comparator.compare(obj, obj2);
                return compare != 0 ? compare : comparator2.compare(obj, obj2);
            default:
                Comparator comparator3 = this.f26050b;
                Function function = (Function) this.f26051c;
                return comparator3.compare(function.apply(obj), function.apply(obj2));
        }
    }
}
