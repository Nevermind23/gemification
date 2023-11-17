package p565pm;

import kotlin.jvm.internal.C41536l;
import p537nm.C17107x;

/* renamed from: pm.f */
public final class C17391f {

    /* renamed from: a */
    private final C17107x f48797a;

    /* renamed from: b */
    private final String f48798b;

    /* renamed from: c */
    private final String f48799c;

    /* renamed from: d */
    private final String f48800d;

    public C17391f(C17107x xVar, String str, String str2, String str3) {
        C41536l.m120489i(xVar, "pinDeliveryType");
        C41536l.m120489i(str, "cardType");
        C41536l.m120489i(str2, "cardClass");
        C41536l.m120489i(str3, "product");
        this.f48797a = xVar;
        this.f48798b = str;
        this.f48799c = str2;
        this.f48800d = str3;
    }

    /* renamed from: a */
    public final String mo44915a() {
        return this.f48799c;
    }

    /* renamed from: b */
    public final String mo44916b() {
        return this.f48798b;
    }

    /* renamed from: c */
    public final C17107x mo44917c() {
        return this.f48797a;
    }

    /* renamed from: d */
    public final String mo44918d() {
        return this.f48800d;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C17391f)) {
            return false;
        }
        C17391f fVar = (C17391f) obj;
        return C41536l.m120484d(this.f48797a, fVar.f48797a) && C41536l.m120484d(this.f48798b, fVar.f48798b) && C41536l.m120484d(this.f48799c, fVar.f48799c) && C41536l.m120484d(this.f48800d, fVar.f48800d);
    }

    public int hashCode() {
        return (((((this.f48797a.hashCode() * 31) + this.f48798b.hashCode()) * 31) + this.f48799c.hashCode()) * 31) + this.f48800d.hashCode();
    }

    public String toString() {
        C17107x xVar = this.f48797a;
        String str = this.f48798b;
        String str2 = this.f48799c;
        String str3 = this.f48800d;
        return "ValidatedInstantCard(pinDeliveryType=" + xVar + ", cardType=" + str + ", cardClass=" + str2 + ", product=" + str3 + ")";
    }
}
