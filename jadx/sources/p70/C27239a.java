package p70;

import java.util.List;
import kotlin.jvm.internal.C41536l;

/* renamed from: p70.a */
public final class C27239a {

    /* renamed from: a */
    private final List f68249a;

    /* renamed from: b */
    private final List f68250b;

    public C27239a(List list, List list2) {
        this.f68249a = list;
        this.f68250b = list2;
    }

    /* renamed from: a */
    public final List mo66515a() {
        return this.f68249a;
    }

    /* renamed from: b */
    public final List mo66516b() {
        return this.f68250b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C27239a)) {
            return false;
        }
        C27239a aVar = (C27239a) obj;
        return C41536l.m120484d(this.f68249a, aVar.f68249a) && C41536l.m120484d(this.f68250b, aVar.f68250b);
    }

    public int hashCode() {
        List list = this.f68249a;
        int i = 0;
        int hashCode = (list == null ? 0 : list.hashCode()) * 31;
        List list2 = this.f68250b;
        if (list2 != null) {
            i = list2.hashCode();
        }
        return hashCode + i;
    }

    public String toString() {
        List list = this.f68249a;
        List list2 = this.f68250b;
        return "LiabilityOverdueInfo(clientManagerInfo=" + list + ", overdueProductsInfo=" + list2 + ")";
    }
}
