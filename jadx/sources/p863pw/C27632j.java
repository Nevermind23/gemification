package p863pw;

import java.util.List;
import kotlin.jvm.internal.C41536l;

/* renamed from: pw.j */
public final class C27632j {

    /* renamed from: a */
    private final C27625c f70643a;

    /* renamed from: b */
    private final List f70644b;

    /* renamed from: c */
    private final List f70645c;

    public C27632j(C27625c cVar, List list, List list2) {
        C41536l.m120489i(cVar, "summary");
        C41536l.m120489i(list, "accounts");
        C41536l.m120489i(list2, "subAccountRealAmountSums");
        this.f70643a = cVar;
        this.f70644b = list;
        this.f70645c = list2;
    }

    /* renamed from: a */
    public final List mo67081a() {
        return this.f70644b;
    }

    /* renamed from: b */
    public final List mo67082b() {
        return this.f70645c;
    }

    /* renamed from: c */
    public final C27625c mo67083c() {
        return this.f70643a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C27632j)) {
            return false;
        }
        C27632j jVar = (C27632j) obj;
        return C41536l.m120484d(this.f70643a, jVar.f70643a) && C41536l.m120484d(this.f70644b, jVar.f70644b) && C41536l.m120484d(this.f70645c, jVar.f70645c);
    }

    public int hashCode() {
        return (((this.f70643a.hashCode() * 31) + this.f70644b.hashCode()) * 31) + this.f70645c.hashCode();
    }

    public String toString() {
        C27625c cVar = this.f70643a;
        List list = this.f70644b;
        List list2 = this.f70645c;
        return "AccountsAccounts(summary=" + cVar + ", accounts=" + list + ", subAccountRealAmountSums=" + list2 + ")";
    }
}
