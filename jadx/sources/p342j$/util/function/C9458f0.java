package p342j$.util.function;

import java.util.function.LongUnaryOperator;

/* renamed from: j$.util.function.f0 */
public final /* synthetic */ class C9458f0 implements C9462h0 {

    /* renamed from: a */
    public final /* synthetic */ LongUnaryOperator f26107a;

    private /* synthetic */ C9458f0(LongUnaryOperator longUnaryOperator) {
        this.f26107a = longUnaryOperator;
    }

    /* renamed from: a */
    public static /* synthetic */ C9462h0 m34814a(LongUnaryOperator longUnaryOperator) {
        if (longUnaryOperator == null) {
            return null;
        }
        return longUnaryOperator instanceof C9460g0 ? ((C9460g0) longUnaryOperator).f26109a : new C9458f0(longUnaryOperator);
    }

    public final /* synthetic */ long applyAsLong(long j) {
        return this.f26107a.applyAsLong(j);
    }

    /* renamed from: d */
    public final /* synthetic */ C9462h0 mo25550d(C9462h0 h0Var) {
        return m34814a(this.f26107a.andThen(C9460g0.m34818a(h0Var)));
    }

    /* renamed from: e */
    public final /* synthetic */ C9462h0 mo25551e(C9462h0 h0Var) {
        return m34814a(this.f26107a.compose(C9460g0.m34818a(h0Var)));
    }

    public final /* synthetic */ boolean equals(Object obj) {
        if (obj instanceof C9458f0) {
            obj = ((C9458f0) obj).f26107a;
        }
        return this.f26107a.equals(obj);
    }

    public final /* synthetic */ int hashCode() {
        return this.f26107a.hashCode();
    }
}
