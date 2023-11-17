package l50;

import java.util.List;
import kotlin.jvm.internal.C41536l;
import p190o1.C7397t;

/* renamed from: l50.e */
public final class C25825e {

    /* renamed from: a */
    private final long f65666a;

    /* renamed from: b */
    private final String f65667b;

    /* renamed from: c */
    private final String f65668c;

    /* renamed from: d */
    private final String f65669d;

    /* renamed from: e */
    private final double f65670e;

    /* renamed from: f */
    private final boolean f65671f;

    /* renamed from: g */
    private final String f65672g;

    /* renamed from: h */
    private final String f65673h;

    /* renamed from: i */
    private final boolean f65674i;

    /* renamed from: j */
    private final String f65675j;

    /* renamed from: k */
    private final String f65676k;

    /* renamed from: l */
    private final String f65677l;

    /* renamed from: m */
    private final Long f65678m;

    /* renamed from: n */
    private final boolean f65679n;

    /* renamed from: o */
    private final List f65680o;

    /* renamed from: p */
    private final C25822b f65681p;

    public C25825e(long j, String str, String str2, String str3, double d, boolean z, String str4, String str5, boolean z2, String str6, String str7, String str8, Long l, boolean z3, List list, C25822b bVar) {
        String str9 = str3;
        String str10 = str5;
        String str11 = str6;
        String str12 = str7;
        String str13 = str8;
        List list2 = list;
        C41536l.m120489i(str, "accountDisplayName");
        C41536l.m120489i(str2, "nameOrAcctNo");
        C41536l.m120489i(str9, "ccy");
        C41536l.m120489i(str10, "productCode");
        C41536l.m120489i(str11, "acctName");
        C41536l.m120489i(str12, "printAcctNo");
        C41536l.m120489i(str13, "productGroup");
        C41536l.m120489i(list2, "productFunctions");
        this.f65666a = j;
        this.f65667b = str;
        this.f65668c = str2;
        this.f65669d = str9;
        this.f65670e = d;
        this.f65671f = z;
        this.f65672g = str4;
        this.f65673h = str10;
        this.f65674i = z2;
        this.f65675j = str11;
        this.f65676k = str12;
        this.f65677l = str13;
        this.f65678m = l;
        this.f65679n = z3;
        this.f65680o = list2;
        this.f65681p = bVar;
    }

    /* renamed from: a */
    public final C25822b mo64471a() {
        return this.f65681p;
    }

    /* renamed from: b */
    public final String mo64472b() {
        return this.f65667b;
    }

    /* renamed from: c */
    public final long mo64473c() {
        return this.f65666a;
    }

    /* renamed from: d */
    public final double mo64474d() {
        return this.f65670e;
    }

    /* renamed from: e */
    public final String mo64475e() {
        return this.f65669d;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C25825e)) {
            return false;
        }
        C25825e eVar = (C25825e) obj;
        return this.f65666a == eVar.f65666a && C41536l.m120484d(this.f65667b, eVar.f65667b) && C41536l.m120484d(this.f65668c, eVar.f65668c) && C41536l.m120484d(this.f65669d, eVar.f65669d) && Double.compare(this.f65670e, eVar.f65670e) == 0 && this.f65671f == eVar.f65671f && C41536l.m120484d(this.f65672g, eVar.f65672g) && C41536l.m120484d(this.f65673h, eVar.f65673h) && this.f65674i == eVar.f65674i && C41536l.m120484d(this.f65675j, eVar.f65675j) && C41536l.m120484d(this.f65676k, eVar.f65676k) && C41536l.m120484d(this.f65677l, eVar.f65677l) && C41536l.m120484d(this.f65678m, eVar.f65678m) && this.f65679n == eVar.f65679n && C41536l.m120484d(this.f65680o, eVar.f65680o) && C41536l.m120484d(this.f65681p, eVar.f65681p);
    }

    /* renamed from: f */
    public final Long mo64477f() {
        return this.f65678m;
    }

    /* renamed from: g */
    public final String mo64478g() {
        return this.f65676k;
    }

    /* renamed from: h */
    public final boolean mo64479h() {
        return this.f65679n;
    }

    public int hashCode() {
        int a = ((((((((C7397t.m28148a(this.f65666a) * 31) + this.f65667b.hashCode()) * 31) + this.f65668c.hashCode()) * 31) + this.f65669d.hashCode()) * 31) + Double.doubleToLongBits(this.f65670e)) * 31;
        boolean z = this.f65671f;
        boolean z2 = true;
        if (z) {
            z = true;
        }
        int i = (a + (z ? 1 : 0)) * 31;
        String str = this.f65672g;
        int i2 = 0;
        int hashCode = (((i + (str == null ? 0 : str.hashCode())) * 31) + this.f65673h.hashCode()) * 31;
        boolean z3 = this.f65674i;
        if (z3) {
            z3 = true;
        }
        int hashCode2 = (((((((hashCode + (z3 ? 1 : 0)) * 31) + this.f65675j.hashCode()) * 31) + this.f65676k.hashCode()) * 31) + this.f65677l.hashCode()) * 31;
        Long l = this.f65678m;
        int hashCode3 = (hashCode2 + (l == null ? 0 : l.hashCode())) * 31;
        boolean z4 = this.f65679n;
        if (!z4) {
            z2 = z4;
        }
        int hashCode4 = (((hashCode3 + (z2 ? 1 : 0)) * 31) + this.f65680o.hashCode()) * 31;
        C25822b bVar = this.f65681p;
        if (bVar != null) {
            i2 = bVar.hashCode();
        }
        return hashCode4 + i2;
    }

    public String toString() {
        long j = this.f65666a;
        String str = this.f65667b;
        String str2 = this.f65668c;
        String str3 = this.f65669d;
        double d = this.f65670e;
        boolean z = this.f65671f;
        String str4 = this.f65672g;
        String str5 = this.f65673h;
        boolean z2 = this.f65674i;
        String str6 = this.f65675j;
        String str7 = this.f65676k;
        String str8 = this.f65677l;
        Long l = this.f65678m;
        boolean z3 = this.f65679n;
        List list = this.f65680o;
        C25822b bVar = this.f65681p;
        return "AccountUIModel(acctKey=" + j + ", accountDisplayName=" + str + ", nameOrAcctNo=" + str2 + ", ccy=" + str3 + ", availableAmount=" + d + ", isHidden=" + z + ", attachmentUrl=" + str4 + ", productCode=" + str5 + ", isDefault=" + z2 + ", acctName=" + str6 + ", printAcctNo=" + str7 + ", productGroup=" + str8 + ", pfmAcctId=" + l + ", isCardExpiring=" + z3 + ", productFunctions=" + list + ", accountDetails=" + bVar + ")";
    }
}
