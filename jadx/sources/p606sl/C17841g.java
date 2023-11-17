package p606sl;

import java.util.List;
import kotlin.jvm.internal.C41536l;

/* renamed from: sl.g */
public final class C17841g {

    /* renamed from: a */
    private final Long f50788a;

    /* renamed from: b */
    private final Double f50789b;

    /* renamed from: c */
    private final List f50790c;

    public C17841g(Long l, Double d, List list) {
        this.f50788a = l;
        this.f50789b = d;
        this.f50790c = list;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C17841g)) {
            return false;
        }
        C17841g gVar = (C17841g) obj;
        return C41536l.m120484d(this.f50788a, gVar.f50788a) && C41536l.m120484d(this.f50789b, gVar.f50789b) && C41536l.m120484d(this.f50790c, gVar.f50790c);
    }

    public int hashCode() {
        Long l = this.f50788a;
        int i = 0;
        int hashCode = (l == null ? 0 : l.hashCode()) * 31;
        Double d = this.f50789b;
        int hashCode2 = (hashCode + (d == null ? 0 : d.hashCode())) * 31;
        List list = this.f50790c;
        if (list != null) {
            i = list.hashCode();
        }
        return hashCode2 + i;
    }

    public String toString() {
        Long l = this.f50788a;
        Double d = this.f50789b;
        List list = this.f50790c;
        return "BnplInvoice(paymentDate=" + l + ", amount=" + d + ", list=" + list + ")";
    }
}
