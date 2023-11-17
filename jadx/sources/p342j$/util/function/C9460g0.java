package p342j$.util.function;

import java.util.function.LongUnaryOperator;

/* renamed from: j$.util.function.g0 */
public final /* synthetic */ class C9460g0 implements LongUnaryOperator {

    /* renamed from: a */
    public final /* synthetic */ C9462h0 f26109a;

    private /* synthetic */ C9460g0(C9462h0 h0Var) {
        this.f26109a = h0Var;
    }

    /* renamed from: a */
    public static /* synthetic */ LongUnaryOperator m34818a(C9462h0 h0Var) {
        if (h0Var == null) {
            return null;
        }
        return h0Var instanceof C9458f0 ? ((C9458f0) h0Var).f26107a : new C9460g0(h0Var);
    }

    public final /* synthetic */ LongUnaryOperator andThen(LongUnaryOperator longUnaryOperator) {
        return m34818a(this.f26109a.mo25550d(C9458f0.m34814a(longUnaryOperator)));
    }

    public final /* synthetic */ long applyAsLong(long j) {
        return this.f26109a.applyAsLong(j);
    }

    public final /* synthetic */ LongUnaryOperator compose(LongUnaryOperator longUnaryOperator) {
        return m34818a(this.f26109a.mo25551e(C9458f0.m34814a(longUnaryOperator)));
    }

    public final /* synthetic */ boolean equals(Object obj) {
        C9462h0 h0Var = this.f26109a;
        if (obj instanceof C9460g0) {
            obj = ((C9460g0) obj).f26109a;
        }
        return h0Var.equals(obj);
    }

    public final /* synthetic */ int hashCode() {
        return this.f26109a.hashCode();
    }
}
