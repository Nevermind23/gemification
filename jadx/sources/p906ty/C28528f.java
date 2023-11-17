package p906ty;

import kotlin.jvm.internal.C41536l;

/* renamed from: ty.f */
public final class C28528f {

    /* renamed from: a */
    private final Long f72395a;

    /* renamed from: b */
    private final Double f72396b;

    /* renamed from: c */
    private final Double f72397c;

    /* renamed from: d */
    private final Double f72398d;

    /* renamed from: e */
    private final Integer f72399e;

    /* renamed from: f */
    private final String f72400f;

    /* renamed from: g */
    private final String f72401g;

    /* renamed from: h */
    private final String f72402h;

    /* renamed from: i */
    private final Long f72403i;

    /* renamed from: j */
    private final Double f72404j;

    /* renamed from: k */
    private final Long f72405k;

    /* renamed from: l */
    private final Double f72406l;

    public C28528f(Long l, Double d, Double d2, Double d3, Integer num, String str, String str2, String str3, Long l2, Double d4, Long l3, Double d5) {
        this.f72395a = l;
        this.f72396b = d;
        this.f72397c = d2;
        this.f72398d = d3;
        this.f72399e = num;
        this.f72400f = str;
        this.f72401g = str2;
        this.f72402h = str3;
        this.f72403i = l2;
        this.f72404j = d4;
        this.f72405k = l3;
        this.f72406l = d5;
    }

    /* renamed from: a */
    public final Double mo68205a() {
        return this.f72406l;
    }

    /* renamed from: b */
    public final Double mo68206b() {
        return this.f72398d;
    }

    /* renamed from: c */
    public final Double mo68207c() {
        return this.f72396b;
    }

    /* renamed from: d */
    public final Long mo68208d() {
        return this.f72405k;
    }

    /* renamed from: e */
    public final Double mo68209e() {
        return this.f72404j;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C28528f)) {
            return false;
        }
        C28528f fVar = (C28528f) obj;
        return C41536l.m120484d(this.f72395a, fVar.f72395a) && C41536l.m120484d(this.f72396b, fVar.f72396b) && C41536l.m120484d(this.f72397c, fVar.f72397c) && C41536l.m120484d(this.f72398d, fVar.f72398d) && C41536l.m120484d(this.f72399e, fVar.f72399e) && C41536l.m120484d(this.f72400f, fVar.f72400f) && C41536l.m120484d(this.f72401g, fVar.f72401g) && C41536l.m120484d(this.f72402h, fVar.f72402h) && C41536l.m120484d(this.f72403i, fVar.f72403i) && C41536l.m120484d(this.f72404j, fVar.f72404j) && C41536l.m120484d(this.f72405k, fVar.f72405k) && C41536l.m120484d(this.f72406l, fVar.f72406l);
    }

    /* renamed from: f */
    public final String mo68211f() {
        return this.f72400f;
    }

    /* renamed from: g */
    public final String mo68212g() {
        return this.f72401g;
    }

    /* renamed from: h */
    public final Long mo68213h() {
        return this.f72403i;
    }

    public int hashCode() {
        Long l = this.f72395a;
        int i = 0;
        int hashCode = (l == null ? 0 : l.hashCode()) * 31;
        Double d = this.f72396b;
        int hashCode2 = (hashCode + (d == null ? 0 : d.hashCode())) * 31;
        Double d2 = this.f72397c;
        int hashCode3 = (hashCode2 + (d2 == null ? 0 : d2.hashCode())) * 31;
        Double d3 = this.f72398d;
        int hashCode4 = (hashCode3 + (d3 == null ? 0 : d3.hashCode())) * 31;
        Integer num = this.f72399e;
        int hashCode5 = (hashCode4 + (num == null ? 0 : num.hashCode())) * 31;
        String str = this.f72400f;
        int hashCode6 = (hashCode5 + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.f72401g;
        int hashCode7 = (hashCode6 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.f72402h;
        int hashCode8 = (hashCode7 + (str3 == null ? 0 : str3.hashCode())) * 31;
        Long l2 = this.f72403i;
        int hashCode9 = (hashCode8 + (l2 == null ? 0 : l2.hashCode())) * 31;
        Double d4 = this.f72404j;
        int hashCode10 = (hashCode9 + (d4 == null ? 0 : d4.hashCode())) * 31;
        Long l3 = this.f72405k;
        int hashCode11 = (hashCode10 + (l3 == null ? 0 : l3.hashCode())) * 31;
        Double d5 = this.f72406l;
        if (d5 != null) {
            i = d5.hashCode();
        }
        return hashCode11 + i;
    }

    /* renamed from: i */
    public final String mo68215i() {
        return this.f72402h;
    }

    /* renamed from: j */
    public final Integer mo68216j() {
        return this.f72399e;
    }

    /* renamed from: k */
    public final Long mo68217k() {
        return this.f72395a;
    }

    /* renamed from: l */
    public final Double mo68218l() {
        return this.f72397c;
    }

    public String toString() {
        Long l = this.f72395a;
        Double d = this.f72396b;
        Double d2 = this.f72397c;
        Double d3 = this.f72398d;
        Integer num = this.f72399e;
        String str = this.f72400f;
        String str2 = this.f72401g;
        String str3 = this.f72402h;
        Long l2 = this.f72403i;
        Double d4 = this.f72404j;
        Long l3 = this.f72405k;
        Double d5 = this.f72406l;
        return "BonusPlus(regDate=" + l + ", collected=" + d + ", spent=" + d2 + ", available=" + d3 + ", prizeCount=" + num + ", plusCategory=" + str + ", plusCategoryLabel=" + str2 + ", plusStatus=" + str3 + ", plusExpDateMillis=" + l2 + ", expiredBonus=" + d4 + ", expirationDate=" + l3 + ", amountInGel=" + d5 + ")";
    }
}
