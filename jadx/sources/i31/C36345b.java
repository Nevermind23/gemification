package i31;

import java.util.List;
import kotlin.jvm.internal.C41536l;

/* renamed from: i31.b */
public final class C36345b {

    /* renamed from: a */
    private final List f87713a;

    /* renamed from: b */
    private final List f87714b;

    /* renamed from: c */
    private final int f87715c;

    public C36345b(List list, List list2, int i) {
        C41536l.m120489i(list, "insuranceFee");
        C41536l.m120489i(list2, "insuranceTypes");
        this.f87713a = list;
        this.f87714b = list2;
        this.f87715c = i;
    }

    /* renamed from: a */
    public final List mo89064a() {
        return this.f87713a;
    }

    /* renamed from: b */
    public final List mo89065b() {
        return this.f87714b;
    }

    /* renamed from: c */
    public final int mo89066c() {
        return this.f87715c;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C36345b)) {
            return false;
        }
        C36345b bVar = (C36345b) obj;
        return C41536l.m120484d(this.f87713a, bVar.f87713a) && C41536l.m120484d(this.f87714b, bVar.f87714b) && this.f87715c == bVar.f87715c;
    }

    public int hashCode() {
        return (((this.f87713a.hashCode() * 31) + this.f87714b.hashCode()) * 31) + this.f87715c;
    }

    public String toString() {
        List list = this.f87713a;
        List list2 = this.f87714b;
        int i = this.f87715c;
        return "CardInsuranceInfo(insuranceFee=" + list + ", insuranceTypes=" + list2 + ", numberOfRecords=" + i + ")";
    }
}
