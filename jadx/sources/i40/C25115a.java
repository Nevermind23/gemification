package i40;

import com.salesforce.marketingcloud.C11398b;
import com.salesforce.marketingcloud.storage.p385db.C11755a;
import java.math.BigDecimal;
import java.util.List;
import kotlin.jvm.internal.C41536l;
import p190o1.C7397t;

/* renamed from: i40.a */
public final class C25115a {

    /* renamed from: a */
    private List f64540a;

    /* renamed from: b */
    private final Long f64541b;

    /* renamed from: c */
    private final long f64542c;

    /* renamed from: d */
    private final Long f64543d;

    /* renamed from: e */
    private final String f64544e;

    /* renamed from: f */
    private final Boolean f64545f;

    /* renamed from: g */
    private final String f64546g;

    /* renamed from: h */
    private final String f64547h;

    /* renamed from: i */
    private BigDecimal f64548i;

    /* renamed from: j */
    private final BigDecimal f64549j;

    /* renamed from: k */
    private final Integer f64550k;

    public C25115a(List list, Long l, long j, Long l2, String str, Boolean bool, String str2, String str3, BigDecimal bigDecimal, BigDecimal bigDecimal2, Integer num) {
        C41536l.m120489i(list, "childCategory");
        C41536l.m120489i(str, "color");
        C41536l.m120489i(str2, "nameKey");
        C41536l.m120489i(bigDecimal, "spent");
        C41536l.m120489i(bigDecimal2, C11755a.C11756a.f34100b);
        this.f64540a = list;
        this.f64541b = l;
        this.f64542c = j;
        this.f64543d = l2;
        this.f64544e = str;
        this.f64545f = bool;
        this.f64546g = str2;
        this.f64547h = str3;
        this.f64548i = bigDecimal;
        this.f64549j = bigDecimal2;
        this.f64550k = num;
    }

    /* renamed from: b */
    public static /* synthetic */ C25115a m80144b(C25115a aVar, List list, Long l, long j, Long l2, String str, Boolean bool, String str2, String str3, BigDecimal bigDecimal, BigDecimal bigDecimal2, Integer num, int i, Object obj) {
        C25115a aVar2 = aVar;
        int i2 = i;
        return aVar.mo63628a((i2 & 1) != 0 ? aVar2.f64540a : list, (i2 & 2) != 0 ? aVar2.f64541b : l, (i2 & 4) != 0 ? aVar2.f64542c : j, (i2 & 8) != 0 ? aVar2.f64543d : l2, (i2 & 16) != 0 ? aVar2.f64544e : str, (i2 & 32) != 0 ? aVar2.f64545f : bool, (i2 & 64) != 0 ? aVar2.f64546g : str2, (i2 & 128) != 0 ? aVar2.f64547h : str3, (i2 & C11398b.f33139r) != 0 ? aVar2.f64548i : bigDecimal, (i2 & C11398b.f33140s) != 0 ? aVar2.f64549j : bigDecimal2, (i2 & C11398b.f33141t) != 0 ? aVar2.f64550k : num);
    }

    /* renamed from: a */
    public final C25115a mo63628a(List list, Long l, long j, Long l2, String str, Boolean bool, String str2, String str3, BigDecimal bigDecimal, BigDecimal bigDecimal2, Integer num) {
        C41536l.m120489i(list, "childCategory");
        String str4 = str;
        C41536l.m120489i(str4, "color");
        String str5 = str2;
        C41536l.m120489i(str5, "nameKey");
        BigDecimal bigDecimal3 = bigDecimal;
        C41536l.m120489i(bigDecimal3, "spent");
        BigDecimal bigDecimal4 = bigDecimal2;
        C41536l.m120489i(bigDecimal4, C11755a.C11756a.f34100b);
        return new C25115a(list, l, j, l2, str4, bool, str5, str3, bigDecimal3, bigDecimal4, num);
    }

    /* renamed from: c */
    public final long mo63629c() {
        return this.f64542c;
    }

    /* renamed from: d */
    public final List mo63630d() {
        return this.f64540a;
    }

    /* renamed from: e */
    public final String mo63631e() {
        String B = C40439w.m117103B(this.f64544e, "#", "", false, 4, (Object) null);
        return "#" + B;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C25115a)) {
            return false;
        }
        C25115a aVar = (C25115a) obj;
        return C41536l.m120484d(this.f64540a, aVar.f64540a) && C41536l.m120484d(this.f64541b, aVar.f64541b) && this.f64542c == aVar.f64542c && C41536l.m120484d(this.f64543d, aVar.f64543d) && C41536l.m120484d(this.f64544e, aVar.f64544e) && C41536l.m120484d(this.f64545f, aVar.f64545f) && C41536l.m120484d(this.f64546g, aVar.f64546g) && C41536l.m120484d(this.f64547h, aVar.f64547h) && C41536l.m120484d(this.f64548i, aVar.f64548i) && C41536l.m120484d(this.f64549j, aVar.f64549j) && C41536l.m120484d(this.f64550k, aVar.f64550k);
    }

    /* renamed from: f */
    public final Long mo63633f() {
        return this.f64541b;
    }

    /* renamed from: g */
    public final String mo63634g() {
        return C40439w.m117103B(this.f64546g, "#", "", false, 4, (Object) null);
    }

    /* renamed from: h */
    public final Integer mo63635h() {
        return this.f64550k;
    }

    public int hashCode() {
        int hashCode = this.f64540a.hashCode() * 31;
        Long l = this.f64541b;
        int i = 0;
        int hashCode2 = (((hashCode + (l == null ? 0 : l.hashCode())) * 31) + C7397t.m28148a(this.f64542c)) * 31;
        Long l2 = this.f64543d;
        int hashCode3 = (((hashCode2 + (l2 == null ? 0 : l2.hashCode())) * 31) + this.f64544e.hashCode()) * 31;
        Boolean bool = this.f64545f;
        int hashCode4 = (((hashCode3 + (bool == null ? 0 : bool.hashCode())) * 31) + this.f64546g.hashCode()) * 31;
        String str = this.f64547h;
        int hashCode5 = (((((hashCode4 + (str == null ? 0 : str.hashCode())) * 31) + this.f64548i.hashCode()) * 31) + this.f64549j.hashCode()) * 31;
        Integer num = this.f64550k;
        if (num != null) {
            i = num.hashCode();
        }
        return hashCode5 + i;
    }

    /* renamed from: i */
    public final Long mo63637i() {
        return this.f64543d;
    }

    /* renamed from: j */
    public final BigDecimal mo63638j() {
        return this.f64548i;
    }

    /* renamed from: k */
    public final BigDecimal mo63639k() {
        return this.f64549j;
    }

    /* renamed from: l */
    public final void mo63640l(List list) {
        C41536l.m120489i(list, "<set-?>");
        this.f64540a = list;
    }

    /* renamed from: m */
    public final void mo63641m(BigDecimal bigDecimal) {
        C41536l.m120489i(bigDecimal, "<set-?>");
        this.f64548i = bigDecimal;
    }

    public String toString() {
        List list = this.f64540a;
        Long l = this.f64541b;
        long j = this.f64542c;
        Long l2 = this.f64543d;
        String str = this.f64544e;
        Boolean bool = this.f64545f;
        String str2 = this.f64546g;
        String str3 = this.f64547h;
        BigDecimal bigDecimal = this.f64548i;
        BigDecimal bigDecimal2 = this.f64549j;
        Integer num = this.f64550k;
        return "BudgetModel(childCategory=" + list + ", id=" + l + ", catId=" + j + ", parentCatId=" + l2 + ", color=" + str + ", isCatIncome=" + bool + ", nameKey=" + str2 + ", parentCatNameKey=" + str3 + ", spent=" + bigDecimal + ", value=" + bigDecimal2 + ", orderNo=" + num + ")";
    }
}
