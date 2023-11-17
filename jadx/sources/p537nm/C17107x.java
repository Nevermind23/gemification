package p537nm;

import kotlin.jvm.internal.C41536l;

/* renamed from: nm.x */
public final class C17107x {

    /* renamed from: a */
    private final String f47904a;

    /* renamed from: b */
    private final String f47905b;

    /* renamed from: c */
    private final C17081e0 f47906c;

    /* renamed from: d */
    private final String f47907d;

    public C17107x(String str, String str2, C17081e0 e0Var, String str3) {
        C41536l.m120489i(str, "plcClass");
        C41536l.m120489i(str2, "plcType");
        C41536l.m120489i(e0Var, "deliveryType");
        C41536l.m120489i(str3, "dictionaryKey");
        this.f47904a = str;
        this.f47905b = str2;
        this.f47906c = e0Var;
        this.f47907d = str3;
    }

    /* renamed from: a */
    public final C17081e0 mo44509a() {
        return this.f47906c;
    }

    /* renamed from: b */
    public final String mo44510b() {
        return this.f47907d;
    }

    /* renamed from: c */
    public final String mo44511c() {
        return this.f47904a;
    }

    /* renamed from: d */
    public final String mo44512d() {
        return this.f47905b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C17107x)) {
            return false;
        }
        C17107x xVar = (C17107x) obj;
        return C41536l.m120484d(this.f47904a, xVar.f47904a) && C41536l.m120484d(this.f47905b, xVar.f47905b) && this.f47906c == xVar.f47906c && C41536l.m120484d(this.f47907d, xVar.f47907d);
    }

    public int hashCode() {
        return (((((this.f47904a.hashCode() * 31) + this.f47905b.hashCode()) * 31) + this.f47906c.hashCode()) * 31) + this.f47907d.hashCode();
    }

    public String toString() {
        String str = this.f47904a;
        String str2 = this.f47905b;
        C17081e0 e0Var = this.f47906c;
        String str3 = this.f47907d;
        return "DebitCardPinDeliveryType(plcClass=" + str + ", plcType=" + str2 + ", deliveryType=" + e0Var + ", dictionaryKey=" + str3 + ")";
    }
}
