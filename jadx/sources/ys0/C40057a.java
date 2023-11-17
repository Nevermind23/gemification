package ys0;

import java.util.List;
import kotlin.jvm.internal.C41536l;
import kotlin.jvm.internal.DefaultConstructorMarker;
import p906ty.C28530h;

/* renamed from: ys0.a */
public final class C40057a {

    /* renamed from: a */
    private final C28530h f95186a;

    /* renamed from: b */
    private final List f95187b;

    /* renamed from: c */
    private final List f95188c;

    /* renamed from: d */
    private final List f95189d;

    public C40057a(C28530h hVar, List list, List list2, List list3) {
        C41536l.m120489i(hVar, "bonuses");
        C41536l.m120489i(list, "deposits");
        C41536l.m120489i(list2, "accounts");
        C41536l.m120489i(list3, "tariffs");
        this.f95186a = hVar;
        this.f95187b = list;
        this.f95188c = list2;
        this.f95189d = list3;
    }

    /* renamed from: b */
    public static /* synthetic */ C40057a m116040b(C40057a aVar, C28530h hVar, List list, List list2, List list3, int i, Object obj) {
        if ((i & 1) != 0) {
            hVar = aVar.f95186a;
        }
        if ((i & 2) != 0) {
            list = aVar.f95187b;
        }
        if ((i & 4) != 0) {
            list2 = aVar.f95188c;
        }
        if ((i & 8) != 0) {
            list3 = aVar.f95189d;
        }
        return aVar.mo93925a(hVar, list, list2, list3);
    }

    /* renamed from: a */
    public final C40057a mo93925a(C28530h hVar, List list, List list2, List list3) {
        C41536l.m120489i(hVar, "bonuses");
        C41536l.m120489i(list, "deposits");
        C41536l.m120489i(list2, "accounts");
        C41536l.m120489i(list3, "tariffs");
        return new C40057a(hVar, list, list2, list3);
    }

    /* renamed from: c */
    public final List mo93926c() {
        return this.f95188c;
    }

    /* renamed from: d */
    public final C28530h mo93927d() {
        return this.f95186a;
    }

    /* renamed from: e */
    public final List mo93928e() {
        return this.f95187b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C40057a)) {
            return false;
        }
        C40057a aVar = (C40057a) obj;
        return C41536l.m120484d(this.f95186a, aVar.f95186a) && C41536l.m120484d(this.f95187b, aVar.f95187b) && C41536l.m120484d(this.f95188c, aVar.f95188c) && C41536l.m120484d(this.f95189d, aVar.f95189d);
    }

    /* renamed from: f */
    public final List mo93930f() {
        return this.f95189d;
    }

    public int hashCode() {
        return (((((this.f95186a.hashCode() * 31) + this.f95187b.hashCode()) * 31) + this.f95188c.hashCode()) * 31) + this.f95189d.hashCode();
    }

    public String toString() {
        C28530h hVar = this.f95186a;
        List list = this.f95187b;
        List list2 = this.f95188c;
        List list3 = this.f95189d;
        return "MoneyBoxData(bonuses=" + hVar + ", deposits=" + list + ", accounts=" + list2 + ", tariffs=" + list3 + ")";
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C40057a(C28530h hVar, List list, List list2, List list3, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(hVar, list, list2, (i & 8) != 0 ? C41341q.m119907j() : list3);
    }
}
