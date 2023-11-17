package p739dv;

import java.util.List;
import kotlin.jvm.internal.C41536l;

/* renamed from: dv.a */
public final class C20102a {

    /* renamed from: a */
    private final List f54725a;

    /* renamed from: b */
    private final List f54726b;

    /* renamed from: c */
    private final List f54727c;

    /* renamed from: d */
    private final List f54728d;

    public C20102a(List list, List list2, List list3, List list4) {
        C41536l.m120489i(list, "points");
        C41536l.m120489i(list2, "assets");
        C41536l.m120489i(list3, "liabilities");
        C41536l.m120489i(list4, "availableAmounts");
        this.f54725a = list;
        this.f54726b = list2;
        this.f54727c = list3;
        this.f54728d = list4;
    }

    /* renamed from: a */
    public final List mo48501a() {
        return this.f54726b;
    }

    /* renamed from: b */
    public final List mo48502b() {
        return this.f54728d;
    }

    /* renamed from: c */
    public final List mo48503c() {
        return this.f54727c;
    }

    /* renamed from: d */
    public final List mo48504d() {
        return this.f54725a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C20102a)) {
            return false;
        }
        C20102a aVar = (C20102a) obj;
        return C41536l.m120484d(this.f54725a, aVar.f54725a) && C41536l.m120484d(this.f54726b, aVar.f54726b) && C41536l.m120484d(this.f54727c, aVar.f54727c) && C41536l.m120484d(this.f54728d, aVar.f54728d);
    }

    public int hashCode() {
        return (((((this.f54725a.hashCode() * 31) + this.f54726b.hashCode()) * 31) + this.f54727c.hashCode()) * 31) + this.f54728d.hashCode();
    }

    public String toString() {
        List list = this.f54725a;
        List list2 = this.f54726b;
        List list3 = this.f54727c;
        List list4 = this.f54728d;
        return "AssetLiability(points=" + list + ", assets=" + list2 + ", liabilities=" + list3 + ", availableAmounts=" + list4 + ")";
    }
}
