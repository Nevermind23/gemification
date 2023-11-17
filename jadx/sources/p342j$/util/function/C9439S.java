package p342j$.util.function;

import java.util.function.LongBinaryOperator;

/* renamed from: j$.util.function.S */
public final /* synthetic */ class C9439S implements LongBinaryOperator {

    /* renamed from: a */
    public final /* synthetic */ C9440T f26085a;

    private /* synthetic */ C9439S(C9440T t) {
        this.f26085a = t;
    }

    /* renamed from: a */
    public static /* synthetic */ LongBinaryOperator m34795a(C9440T t) {
        if (t == null) {
            return null;
        }
        return t instanceof C9438Q ? ((C9438Q) t).f26084a : new C9439S(t);
    }

    public final /* synthetic */ long applyAsLong(long j, long j2) {
        return this.f26085a.applyAsLong(j, j2);
    }

    public final /* synthetic */ boolean equals(Object obj) {
        C9440T t = this.f26085a;
        if (obj instanceof C9439S) {
            obj = ((C9439S) obj).f26085a;
        }
        return t.equals(obj);
    }

    public final /* synthetic */ int hashCode() {
        return this.f26085a.hashCode();
    }
}
