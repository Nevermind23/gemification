package l50;

import java.math.BigDecimal;
import java.util.List;
import kotlin.jvm.internal.C41536l;

/* renamed from: l50.h */
public final class C25828h {

    /* renamed from: a */
    private int f65686a;

    /* renamed from: b */
    private final BigDecimal f65687b;

    /* renamed from: c */
    private final List f65688c;

    /* renamed from: d */
    private final List f65689d;

    /* renamed from: e */
    private final List f65690e;

    public C25828h(int i, BigDecimal bigDecimal, List list, List list2, List list3) {
        C41536l.m120489i(list, "subAccounts");
        C41536l.m120489i(list2, "availableAmounts");
        C41536l.m120489i(list3, "getStudDepInfos");
        this.f65686a = i;
        this.f65687b = bigDecimal;
        this.f65688c = list;
        this.f65689d = list2;
        this.f65690e = list3;
    }

    /* renamed from: a */
    public final List mo64492a() {
        return this.f65689d;
    }

    /* renamed from: b */
    public final int mo64493b() {
        return this.f65686a;
    }

    /* renamed from: c */
    public final List mo64494c() {
        return this.f65690e;
    }

    /* renamed from: d */
    public final BigDecimal mo64495d() {
        return this.f65687b;
    }

    /* renamed from: e */
    public final List mo64496e() {
        return this.f65688c;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C25828h)) {
            return false;
        }
        C25828h hVar = (C25828h) obj;
        return this.f65686a == hVar.f65686a && C41536l.m120484d(this.f65687b, hVar.f65687b) && C41536l.m120484d(this.f65688c, hVar.f65688c) && C41536l.m120484d(this.f65689d, hVar.f65689d) && C41536l.m120484d(this.f65690e, hVar.f65690e);
    }

    /* renamed from: f */
    public final void mo64498f(int i) {
        this.f65686a = i;
    }

    public int hashCode() {
        int i = this.f65686a * 31;
        BigDecimal bigDecimal = this.f65687b;
        return ((((((i + (bigDecimal == null ? 0 : bigDecimal.hashCode())) * 31) + this.f65688c.hashCode()) * 31) + this.f65689d.hashCode()) * 31) + this.f65690e.hashCode();
    }

    public String toString() {
        int i = this.f65686a;
        BigDecimal bigDecimal = this.f65687b;
        List list = this.f65688c;
        List list2 = this.f65689d;
        List list3 = this.f65690e;
        return "AccountWithCardsDetailsUIModel(ccyIndex=" + i + ", realAmount=" + bigDecimal + ", subAccounts=" + list + ", availableAmounts=" + list2 + ", getStudDepInfos=" + list3 + ")";
    }
}
