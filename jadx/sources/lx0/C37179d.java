package lx0;

import java.util.List;
import kotlin.jvm.internal.C41536l;
import s31.C38421a;

/* renamed from: lx0.d */
public final class C37179d {

    /* renamed from: a */
    private final List f89535a;

    /* renamed from: b */
    private final C38421a f89536b;

    public C37179d(List list, C38421a aVar) {
        C41536l.m120489i(list, "parameter");
        this.f89535a = list;
        this.f89536b = aVar;
    }

    /* renamed from: a */
    public final List mo90180a() {
        return this.f89535a;
    }

    /* renamed from: b */
    public final C38421a mo90181b() {
        return this.f89536b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C37179d)) {
            return false;
        }
        C37179d dVar = (C37179d) obj;
        return C41536l.m120484d(this.f89535a, dVar.f89535a) && C41536l.m120484d(this.f89536b, dVar.f89536b);
    }

    public int hashCode() {
        int hashCode = this.f89535a.hashCode() * 31;
        C38421a aVar = this.f89536b;
        return hashCode + (aVar == null ? 0 : aVar.hashCode());
    }

    public String toString() {
        List list = this.f89535a;
        C38421a aVar = this.f89536b;
        return "PaymentDebt(parameter=" + list + ", providerConfig=" + aVar + ")";
    }
}
