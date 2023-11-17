package p342j$.util.function;

import java.util.function.LongBinaryOperator;

/* renamed from: j$.util.function.Q */
public final /* synthetic */ class C9438Q implements C9440T {

    /* renamed from: a */
    public final /* synthetic */ LongBinaryOperator f26084a;

    private /* synthetic */ C9438Q(LongBinaryOperator longBinaryOperator) {
        this.f26084a = longBinaryOperator;
    }

    /* renamed from: a */
    public static /* synthetic */ C9440T m34794a(LongBinaryOperator longBinaryOperator) {
        if (longBinaryOperator == null) {
            return null;
        }
        return longBinaryOperator instanceof C9439S ? ((C9439S) longBinaryOperator).f26085a : new C9438Q(longBinaryOperator);
    }

    public final /* synthetic */ long applyAsLong(long j, long j2) {
        return this.f26084a.applyAsLong(j, j2);
    }

    public final /* synthetic */ boolean equals(Object obj) {
        if (obj instanceof C9438Q) {
            obj = ((C9438Q) obj).f26084a;
        }
        return this.f26084a.equals(obj);
    }

    public final /* synthetic */ int hashCode() {
        return this.f26084a.hashCode();
    }
}
