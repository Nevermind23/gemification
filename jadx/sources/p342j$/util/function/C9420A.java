package p342j$.util.function;

import java.util.function.IntBinaryOperator;

/* renamed from: j$.util.function.A */
public final /* synthetic */ class C9420A implements C9424C {

    /* renamed from: a */
    public final /* synthetic */ IntBinaryOperator f26066a;

    private /* synthetic */ C9420A(IntBinaryOperator intBinaryOperator) {
        this.f26066a = intBinaryOperator;
    }

    /* renamed from: a */
    public static /* synthetic */ C9424C m34767a(IntBinaryOperator intBinaryOperator) {
        if (intBinaryOperator == null) {
            return null;
        }
        return intBinaryOperator instanceof C9422B ? ((C9422B) intBinaryOperator).f26068a : new C9420A(intBinaryOperator);
    }

    public final /* synthetic */ int applyAsInt(int i, int i2) {
        return this.f26066a.applyAsInt(i, i2);
    }

    public final /* synthetic */ boolean equals(Object obj) {
        if (obj instanceof C9420A) {
            obj = ((C9420A) obj).f26066a;
        }
        return this.f26066a.equals(obj);
    }

    public final /* synthetic */ int hashCode() {
        return this.f26066a.hashCode();
    }
}
