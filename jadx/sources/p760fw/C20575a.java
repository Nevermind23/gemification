package p760fw;

import java.util.List;
import kotlin.jvm.internal.C41536l;
import p190o1.C7397t;

/* renamed from: fw.a */
public final class C20575a {

    /* renamed from: a */
    private final boolean f55611a;

    /* renamed from: b */
    private final String f55612b;

    /* renamed from: c */
    private final long f55613c;

    /* renamed from: d */
    private final boolean f55614d;

    /* renamed from: e */
    private final boolean f55615e;

    /* renamed from: f */
    private final boolean f55616f;

    /* renamed from: g */
    private final String f55617g;

    /* renamed from: h */
    private final int f55618h;

    /* renamed from: i */
    private final String f55619i;

    /* renamed from: j */
    private final Integer f55620j;

    /* renamed from: k */
    private final Long f55621k;

    /* renamed from: l */
    private List f55622l;

    /* renamed from: m */
    private final String f55623m;

    public C20575a(boolean z, String str, long j, boolean z2, boolean z3, boolean z4, String str2, int i, String str3, Integer num, Long l, List list, String str4) {
        C41536l.m120489i(str, "catHexrgbcolor");
        C41536l.m120489i(str2, "catKey");
        C41536l.m120489i(str3, "catName");
        this.f55611a = z;
        this.f55612b = str;
        this.f55613c = j;
        this.f55614d = z2;
        this.f55615e = z3;
        this.f55616f = z4;
        this.f55617g = str2;
        this.f55618h = i;
        this.f55619i = str3;
        this.f55620j = num;
        this.f55621k = l;
        this.f55622l = list;
        this.f55623m = str4;
    }

    /* renamed from: a */
    public final String mo49101a() {
        return this.f55612b;
    }

    /* renamed from: b */
    public final long mo49102b() {
        return this.f55613c;
    }

    /* renamed from: c */
    public final boolean mo49103c() {
        return this.f55614d;
    }

    /* renamed from: d */
    public final boolean mo49104d() {
        return this.f55615e;
    }

    /* renamed from: e */
    public final boolean mo49105e() {
        return this.f55616f;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C20575a)) {
            return false;
        }
        C20575a aVar = (C20575a) obj;
        return this.f55611a == aVar.f55611a && C41536l.m120484d(this.f55612b, aVar.f55612b) && this.f55613c == aVar.f55613c && this.f55614d == aVar.f55614d && this.f55615e == aVar.f55615e && this.f55616f == aVar.f55616f && C41536l.m120484d(this.f55617g, aVar.f55617g) && this.f55618h == aVar.f55618h && C41536l.m120484d(this.f55619i, aVar.f55619i) && C41536l.m120484d(this.f55620j, aVar.f55620j) && C41536l.m120484d(this.f55621k, aVar.f55621k) && C41536l.m120484d(this.f55622l, aVar.f55622l) && C41536l.m120484d(this.f55623m, aVar.f55623m);
    }

    /* renamed from: f */
    public final String mo49107f() {
        return this.f55617g;
    }

    /* renamed from: g */
    public final String mo49108g() {
        return this.f55619i;
    }

    /* renamed from: h */
    public final Integer mo49109h() {
        return this.f55620j;
    }

    public int hashCode() {
        boolean z = this.f55611a;
        boolean z2 = true;
        if (z) {
            z = true;
        }
        int hashCode = (((((z ? 1 : 0) * true) + this.f55612b.hashCode()) * 31) + C7397t.m28148a(this.f55613c)) * 31;
        boolean z3 = this.f55614d;
        if (z3) {
            z3 = true;
        }
        int i = (hashCode + (z3 ? 1 : 0)) * 31;
        boolean z4 = this.f55615e;
        if (z4) {
            z4 = true;
        }
        int i2 = (i + (z4 ? 1 : 0)) * 31;
        boolean z5 = this.f55616f;
        if (!z5) {
            z2 = z5;
        }
        int hashCode2 = (((((((i2 + (z2 ? 1 : 0)) * 31) + this.f55617g.hashCode()) * 31) + this.f55618h) * 31) + this.f55619i.hashCode()) * 31;
        Integer num = this.f55620j;
        int i3 = 0;
        int hashCode3 = (hashCode2 + (num == null ? 0 : num.hashCode())) * 31;
        Long l = this.f55621k;
        int hashCode4 = (hashCode3 + (l == null ? 0 : l.hashCode())) * 31;
        List list = this.f55622l;
        int hashCode5 = (hashCode4 + (list == null ? 0 : list.hashCode())) * 31;
        String str = this.f55623m;
        if (str != null) {
            i3 = str.hashCode();
        }
        return hashCode5 + i3;
    }

    /* renamed from: i */
    public final List mo49111i() {
        return this.f55622l;
    }

    /* renamed from: j */
    public final String mo49112j() {
        return this.f55623m;
    }

    /* renamed from: k */
    public final Long mo49113k() {
        return this.f55621k;
    }

    public String toString() {
        boolean z = this.f55611a;
        String str = this.f55612b;
        long j = this.f55613c;
        boolean z2 = this.f55614d;
        boolean z3 = this.f55615e;
        boolean z4 = this.f55616f;
        String str2 = this.f55617g;
        int i = this.f55618h;
        String str3 = this.f55619i;
        Integer num = this.f55620j;
        Long l = this.f55621k;
        List list = this.f55622l;
        String str4 = this.f55623m;
        return "TransactionCategory(catComputable=" + z + ", catHexrgbcolor=" + str + ", catId=" + j + ", catIsCustom=" + z2 + ", catIsIncome=" + z3 + ", catIsbudgetizable=" + z4 + ", catKey=" + str2 + ", catLevel=" + i + ", catName=" + str3 + ", catOrder=" + num + ", parentCatId=" + l + ", categories=" + list + ", displayName=" + str4 + ")";
    }
}
