package p342j$.util.function;

import java.util.function.IntBinaryOperator;

/* renamed from: j$.util.function.B */
public final /* synthetic */ class C9422B implements IntBinaryOperator {

    /* renamed from: a */
    public final /* synthetic */ C9424C f26068a;

    private /* synthetic */ C9422B(C9424C c) {
        this.f26068a = c;
    }

    /* renamed from: a */
    public static /* synthetic */ IntBinaryOperator m34769a(C9424C c) {
        if (c == null) {
            return null;
        }
        return c instanceof C9420A ? ((C9420A) c).f26066a : new C9422B(c);
    }

    public final /* synthetic */ int applyAsInt(int i, int i2) {
        return this.f26068a.applyAsInt(i, i2);
    }

    public final /* synthetic */ boolean equals(Object obj) {
        C9424C c = this.f26068a;
        if (obj instanceof C9422B) {
            obj = ((C9422B) obj).f26068a;
        }
        return c.equals(obj);
    }

    public final /* synthetic */ int hashCode() {
        return this.f26068a.hashCode();
    }
}
