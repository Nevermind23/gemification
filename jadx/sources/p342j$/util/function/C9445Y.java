package p342j$.util.function;

import java.util.function.LongFunction;

/* renamed from: j$.util.function.Y */
public final /* synthetic */ class C9445Y implements C9448a0 {

    /* renamed from: a */
    public final /* synthetic */ LongFunction f26093a;

    private /* synthetic */ C9445Y(LongFunction longFunction) {
        this.f26093a = longFunction;
    }

    /* renamed from: a */
    public static /* synthetic */ C9448a0 m34801a(LongFunction longFunction) {
        if (longFunction == null) {
            return null;
        }
        return longFunction instanceof C9446Z ? ((C9446Z) longFunction).f26094a : new C9445Y(longFunction);
    }

    public final /* synthetic */ Object apply(long j) {
        return this.f26093a.apply(j);
    }

    public final /* synthetic */ boolean equals(Object obj) {
        if (obj instanceof C9445Y) {
            obj = ((C9445Y) obj).f26093a;
        }
        return this.f26093a.equals(obj);
    }

    public final /* synthetic */ int hashCode() {
        return this.f26093a.hashCode();
    }
}
