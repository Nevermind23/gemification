package p906ty;

import kotlin.jvm.internal.C41536l;
import p190o1.C7397t;

/* renamed from: ty.d */
public final class C28526d {

    /* renamed from: a */
    private final long f72372a;

    /* renamed from: b */
    private final long f72373b;

    /* renamed from: c */
    private final long f72374c;

    /* renamed from: d */
    private final Double f72375d;

    /* renamed from: e */
    private final Long f72376e;

    /* renamed from: f */
    private final Long f72377f;

    /* renamed from: g */
    private final Double f72378g;

    /* renamed from: h */
    private final Long f72379h;

    /* renamed from: i */
    private final Long f72380i;

    /* renamed from: j */
    private final String f72381j;

    /* renamed from: k */
    private final String f72382k;

    public C28526d(long j, long j2, long j3, Double d, Long l, Long l2, Double d2, Long l3, Long l4, String str, String str2) {
        this.f72372a = j;
        this.f72373b = j2;
        this.f72374c = j3;
        this.f72375d = d;
        this.f72376e = l;
        this.f72377f = l2;
        this.f72378g = d2;
        this.f72379h = l3;
        this.f72380i = l4;
        this.f72381j = str;
        this.f72382k = str2;
    }

    /* renamed from: a */
    public final Long mo68176a() {
        return this.f72380i;
    }

    /* renamed from: b */
    public final String mo68177b() {
        return this.f72381j;
    }

    /* renamed from: c */
    public final Double mo68178c() {
        return this.f72378g;
    }

    /* renamed from: d */
    public final Long mo68179d() {
        return this.f72377f;
    }

    /* renamed from: e */
    public final Double mo68180e() {
        return this.f72375d;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C28526d)) {
            return false;
        }
        C28526d dVar = (C28526d) obj;
        return this.f72372a == dVar.f72372a && this.f72373b == dVar.f72373b && this.f72374c == dVar.f72374c && C41536l.m120484d(this.f72375d, dVar.f72375d) && C41536l.m120484d(this.f72376e, dVar.f72376e) && C41536l.m120484d(this.f72377f, dVar.f72377f) && C41536l.m120484d(this.f72378g, dVar.f72378g) && C41536l.m120484d(this.f72379h, dVar.f72379h) && C41536l.m120484d(this.f72380i, dVar.f72380i) && C41536l.m120484d(this.f72381j, dVar.f72381j) && C41536l.m120484d(this.f72382k, dVar.f72382k);
    }

    /* renamed from: f */
    public final Long mo68182f() {
        return this.f72376e;
    }

    /* renamed from: g */
    public final String mo68183g() {
        return this.f72382k;
    }

    /* renamed from: h */
    public final long mo68184h() {
        return this.f72373b;
    }

    public int hashCode() {
        int a = ((((C7397t.m28148a(this.f72372a) * 31) + C7397t.m28148a(this.f72373b)) * 31) + C7397t.m28148a(this.f72374c)) * 31;
        Double d = this.f72375d;
        int i = 0;
        int hashCode = (a + (d == null ? 0 : d.hashCode())) * 31;
        Long l = this.f72376e;
        int hashCode2 = (hashCode + (l == null ? 0 : l.hashCode())) * 31;
        Long l2 = this.f72377f;
        int hashCode3 = (hashCode2 + (l2 == null ? 0 : l2.hashCode())) * 31;
        Double d2 = this.f72378g;
        int hashCode4 = (hashCode3 + (d2 == null ? 0 : d2.hashCode())) * 31;
        Long l3 = this.f72379h;
        int hashCode5 = (hashCode4 + (l3 == null ? 0 : l3.hashCode())) * 31;
        Long l4 = this.f72380i;
        int hashCode6 = (hashCode5 + (l4 == null ? 0 : l4.hashCode())) * 31;
        String str = this.f72381j;
        int hashCode7 = (hashCode6 + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.f72382k;
        if (str2 != null) {
            i = str2.hashCode();
        }
        return hashCode7 + i;
    }

    /* renamed from: i */
    public final long mo68186i() {
        return this.f72372a;
    }

    /* renamed from: j */
    public final Long mo68187j() {
        return this.f72379h;
    }

    /* renamed from: k */
    public final long mo68188k() {
        return this.f72374c;
    }

    public String toString() {
        long j = this.f72372a;
        long j2 = this.f72373b;
        long j3 = this.f72374c;
        Double d = this.f72375d;
        Long l = this.f72376e;
        Long l2 = this.f72377f;
        Double d2 = this.f72378g;
        Long l3 = this.f72379h;
        Long l4 = this.f72380i;
        String str = this.f72381j;
        String str2 = this.f72382k;
        return "BonusCashBack(id=" + j + ", clientKey=" + j2 + ", productKey=" + j3 + ", cashbackCalcAmount=" + d + ", cashbackStartDate=" + l + ", cashbackAccrualDate=" + l2 + ", cashbackAccrualAmount=" + d2 + ", lastTransferDate=" + l3 + ", acctKey=" + l4 + ", acctNo=" + str + ", ccy=" + str2 + ")";
    }
}
