package p579qm;

import java.util.List;
import kotlin.jvm.internal.C41536l;
import p537nm.C17082f;

/* renamed from: qm.b */
public final class C17538b {

    /* renamed from: a */
    private final List f49071a;

    /* renamed from: b */
    private final C17082f f49072b;

    public C17538b(List list, C17082f fVar) {
        C41536l.m120489i(list, "orderTypes");
        C41536l.m120489i(fVar, "clientCountryInfo");
        this.f49071a = list;
        this.f49072b = fVar;
    }

    /* renamed from: a */
    public final C17082f mo45060a() {
        return this.f49072b;
    }

    /* renamed from: b */
    public final List mo45061b() {
        return this.f49071a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C17538b)) {
            return false;
        }
        C17538b bVar = (C17538b) obj;
        return C41536l.m120484d(this.f49071a, bVar.f49071a) && C41536l.m120484d(this.f49072b, bVar.f49072b);
    }

    public int hashCode() {
        return (this.f49071a.hashCode() * 31) + this.f49072b.hashCode();
    }

    public String toString() {
        List list = this.f49071a;
        C17082f fVar = this.f49072b;
        return "CardOrderPurposeData(orderTypes=" + list + ", clientCountryInfo=" + fVar + ")";
    }
}
