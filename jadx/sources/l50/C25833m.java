package l50;

import java.util.List;
import kotlin.jvm.internal.C41536l;

/* renamed from: l50.m */
public final class C25833m {

    /* renamed from: a */
    private final C25821a f65728a;

    /* renamed from: b */
    private final List f65729b;

    /* renamed from: c */
    private final List f65730c;

    public C25833m(C25821a aVar, List list, List list2) {
        C41536l.m120489i(aVar, "summary");
        C41536l.m120489i(list, "subAccountRealAmountSums");
        C41536l.m120489i(list2, "accounts");
        this.f65728a = aVar;
        this.f65729b = list;
        this.f65730c = list2;
    }

    /* renamed from: a */
    public final List mo64547a() {
        return this.f65730c;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C25833m)) {
            return false;
        }
        C25833m mVar = (C25833m) obj;
        return C41536l.m120484d(this.f65728a, mVar.f65728a) && C41536l.m120484d(this.f65729b, mVar.f65729b) && C41536l.m120484d(this.f65730c, mVar.f65730c);
    }

    public int hashCode() {
        return (((this.f65728a.hashCode() * 31) + this.f65729b.hashCode()) * 31) + this.f65730c.hashCode();
    }

    public String toString() {
        C25821a aVar = this.f65728a;
        List list = this.f65729b;
        List list2 = this.f65730c;
        return "AccountsAccountsUIModel(summary=" + aVar + ", subAccountRealAmountSums=" + list + ", accounts=" + list2 + ")";
    }
}
