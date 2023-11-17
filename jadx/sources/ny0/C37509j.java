package ny0;

import kotlin.jvm.internal.C41536l;
import p190o1.C7397t;

/* renamed from: ny0.j */
public final class C37509j {

    /* renamed from: a */
    private final String f90219a;

    /* renamed from: b */
    private final Double f90220b;

    /* renamed from: c */
    private final String f90221c;

    /* renamed from: d */
    private final String f90222d;

    /* renamed from: e */
    private final Long f90223e;

    /* renamed from: f */
    private final Long f90224f;

    /* renamed from: g */
    private final long f90225g;

    /* renamed from: h */
    private final Double f90226h;

    /* renamed from: i */
    private final Long f90227i;

    public C37509j(String str, Double d, String str2, String str3, Long l, Long l2, long j, Double d2, Long l3) {
        this.f90219a = str;
        this.f90220b = d;
        this.f90221c = str2;
        this.f90222d = str3;
        this.f90223e = l;
        this.f90224f = l2;
        this.f90225g = j;
        this.f90226h = d2;
        this.f90227i = l3;
    }

    /* renamed from: a */
    public final Long mo90729a() {
        return this.f90224f;
    }

    /* renamed from: b */
    public final long mo90730b() {
        return this.f90225g;
    }

    /* renamed from: c */
    public final Double mo90731c() {
        return this.f90220b;
    }

    /* renamed from: d */
    public final String mo90732d() {
        return this.f90222d;
    }

    /* renamed from: e */
    public final Long mo90733e() {
        return this.f90227i;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C37509j)) {
            return false;
        }
        C37509j jVar = (C37509j) obj;
        return C41536l.m120484d(this.f90219a, jVar.f90219a) && C41536l.m120484d(this.f90220b, jVar.f90220b) && C41536l.m120484d(this.f90221c, jVar.f90221c) && C41536l.m120484d(this.f90222d, jVar.f90222d) && C41536l.m120484d(this.f90223e, jVar.f90223e) && C41536l.m120484d(this.f90224f, jVar.f90224f) && this.f90225g == jVar.f90225g && C41536l.m120484d(this.f90226h, jVar.f90226h) && C41536l.m120484d(this.f90227i, jVar.f90227i);
    }

    /* renamed from: f */
    public final String mo90735f() {
        return this.f90219a;
    }

    /* renamed from: g */
    public final Long mo90736g() {
        return this.f90223e;
    }

    /* renamed from: h */
    public final String mo90737h() {
        return this.f90221c;
    }

    public int hashCode() {
        String str = this.f90219a;
        int i = 0;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        Double d = this.f90220b;
        int hashCode2 = (hashCode + (d == null ? 0 : d.hashCode())) * 31;
        String str2 = this.f90221c;
        int hashCode3 = (hashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.f90222d;
        int hashCode4 = (hashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31;
        Long l = this.f90223e;
        int hashCode5 = (hashCode4 + (l == null ? 0 : l.hashCode())) * 31;
        Long l2 = this.f90224f;
        int hashCode6 = (((hashCode5 + (l2 == null ? 0 : l2.hashCode())) * 31) + C7397t.m28148a(this.f90225g)) * 31;
        Double d2 = this.f90226h;
        int hashCode7 = (hashCode6 + (d2 == null ? 0 : d2.hashCode())) * 31;
        Long l3 = this.f90227i;
        if (l3 != null) {
            i = l3.hashCode();
        }
        return hashCode7 + i;
    }

    /* renamed from: i */
    public final Double mo90739i() {
        return this.f90226h;
    }

    public String toString() {
        String str = this.f90219a;
        Double d = this.f90220b;
        String str2 = this.f90221c;
        String str3 = this.f90222d;
        Long l = this.f90223e;
        Long l2 = this.f90224f;
        long j = this.f90225g;
        Double d2 = this.f90226h;
        Long l3 = this.f90227i;
        return "SaveSavingGoalParams(name=" + str + ", amount=" + d + ", startDate=" + str2 + ", endDate=" + str3 + ", sgcId=" + l + ", accountId=" + l2 + ", agreeKey=" + j + ", startingAmount=" + d2 + ", id=" + l3 + ")";
    }
}
