package p342j$.util.function;

import java.util.function.IntToLongFunction;

/* renamed from: j$.util.function.N */
public final /* synthetic */ class C9435N implements IntToLongFunction {

    /* renamed from: a */
    public final /* synthetic */ C9436O f26082a;

    private /* synthetic */ C9435N(C9436O o) {
        this.f26082a = o;
    }

    /* renamed from: a */
    public static /* synthetic */ IntToLongFunction m34791a(C9436O o) {
        if (o == null) {
            return null;
        }
        return o instanceof C9434M ? ((C9434M) o).f26081a : new C9435N(o);
    }

    public final /* synthetic */ long applyAsLong(int i) {
        return this.f26082a.applyAsLong(i);
    }

    public final /* synthetic */ boolean equals(Object obj) {
        C9436O o = this.f26082a;
        if (obj instanceof C9435N) {
            obj = ((C9435N) obj).f26082a;
        }
        return o.equals(obj);
    }

    public final /* synthetic */ int hashCode() {
        return this.f26082a.hashCode();
    }
}
