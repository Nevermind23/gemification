package p568pp;

import java.util.List;
import kotlin.jvm.internal.C41536l;
import p568pp.C17472b;

/* renamed from: pp.d */
public final class C17480d {

    /* renamed from: a */
    private final List f48913a;

    /* renamed from: b */
    private final C17472b.C17473a f48914b;

    /* renamed from: c */
    private final List f48915c;

    public C17480d(List list, C17472b.C17473a aVar, List list2) {
        C41536l.m120489i(aVar, "becomeSolo");
        C41536l.m120489i(list2, "packageBenefitList");
        this.f48913a = list;
        this.f48914b = aVar;
        this.f48915c = list2;
    }

    /* renamed from: a */
    public final C17472b.C17473a mo45002a() {
        return this.f48914b;
    }

    /* renamed from: b */
    public final List mo45003b() {
        return this.f48915c;
    }

    /* renamed from: c */
    public final List mo45004c() {
        return this.f48913a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C17480d)) {
            return false;
        }
        C17480d dVar = (C17480d) obj;
        return C41536l.m120484d(this.f48913a, dVar.f48913a) && C41536l.m120484d(this.f48914b, dVar.f48914b) && C41536l.m120484d(this.f48915c, dVar.f48915c);
    }

    public int hashCode() {
        List list = this.f48913a;
        return ((((list == null ? 0 : list.hashCode()) * 31) + this.f48914b.hashCode()) * 31) + this.f48915c.hashCode();
    }

    public String toString() {
        List list = this.f48913a;
        C17472b.C17473a aVar = this.f48914b;
        List list2 = this.f48915c;
        return "PackagePageData(packageInfoList=" + list + ", becomeSolo=" + aVar + ", packageBenefitList=" + list2 + ")";
    }
}
