package at0;

import java.util.List;
import kotlin.jvm.internal.C41536l;
import ys0.C40059c;

/* renamed from: at0.b */
public final class C31065b {

    /* renamed from: a */
    private final C40059c f77257a;

    /* renamed from: b */
    private final List f77258b;

    /* renamed from: c */
    private final List f77259c;

    public C31065b(C40059c cVar, List list, List list2) {
        C41536l.m120489i(cVar, "piggyBankResources");
        C41536l.m120489i(list, "pausePeriods");
        C41536l.m120489i(list2, "clientServices");
        this.f77257a = cVar;
        this.f77258b = list;
        this.f77259c = list2;
    }

    /* renamed from: a */
    public final List mo71264a() {
        return this.f77259c;
    }

    /* renamed from: b */
    public final List mo71265b() {
        return this.f77258b;
    }

    /* renamed from: c */
    public final C40059c mo71266c() {
        return this.f77257a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C31065b)) {
            return false;
        }
        C31065b bVar = (C31065b) obj;
        return C41536l.m120484d(this.f77257a, bVar.f77257a) && C41536l.m120484d(this.f77258b, bVar.f77258b) && C41536l.m120484d(this.f77259c, bVar.f77259c);
    }

    public int hashCode() {
        return (((this.f77257a.hashCode() * 31) + this.f77258b.hashCode()) * 31) + this.f77259c.hashCode();
    }

    public String toString() {
        C40059c cVar = this.f77257a;
        List list = this.f77258b;
        List list2 = this.f77259c;
        return "PiggyBankDetailsResources(piggyBankResources=" + cVar + ", pausePeriods=" + list + ", clientServices=" + list2 + ")";
    }
}
