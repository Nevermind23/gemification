package m01;

import kotlin.jvm.internal.C41536l;

/* renamed from: m01.f */
public final class C37192f {

    /* renamed from: a */
    private final Long f89576a;

    /* renamed from: b */
    private final String f89577b;

    /* renamed from: c */
    private final String f89578c;

    /* renamed from: d */
    private final Double f89579d;

    /* renamed from: e */
    private final String f89580e;

    public C37192f(Long l, String str, String str2, Double d, String str3) {
        C41536l.m120489i(str2, "acctNo");
        C41536l.m120489i(str3, "ccy");
        this.f89576a = l;
        this.f89577b = str;
        this.f89578c = str2;
        this.f89579d = d;
        this.f89580e = str3;
    }

    /* renamed from: a */
    public final Long mo90227a() {
        return this.f89576a;
    }

    /* renamed from: b */
    public final String mo90228b() {
        return this.f89578c;
    }

    /* renamed from: c */
    public final Double mo90229c() {
        return this.f89579d;
    }

    /* renamed from: d */
    public final String mo90230d() {
        return this.f89580e;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C37192f)) {
            return false;
        }
        C37192f fVar = (C37192f) obj;
        return C41536l.m120484d(this.f89576a, fVar.f89576a) && C41536l.m120484d(this.f89577b, fVar.f89577b) && C41536l.m120484d(this.f89578c, fVar.f89578c) && C41536l.m120484d(this.f89579d, fVar.f89579d) && C41536l.m120484d(this.f89580e, fVar.f89580e);
    }

    public int hashCode() {
        Long l = this.f89576a;
        int i = 0;
        int hashCode = (l == null ? 0 : l.hashCode()) * 31;
        String str = this.f89577b;
        int hashCode2 = (((hashCode + (str == null ? 0 : str.hashCode())) * 31) + this.f89578c.hashCode()) * 31;
        Double d = this.f89579d;
        if (d != null) {
            i = d.hashCode();
        }
        return ((hashCode2 + i) * 31) + this.f89580e.hashCode();
    }

    public String toString() {
        Long l = this.f89576a;
        String str = this.f89577b;
        String str2 = this.f89578c;
        Double d = this.f89579d;
        String str3 = this.f89580e;
        return "CreditCardSummeryData(acctKey=" + l + ", acctName=" + str + ", acctNo=" + str2 + ", availableAmount=" + d + ", ccy=" + str3 + ")";
    }
}
