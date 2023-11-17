package p906ty;

import kotlin.jvm.internal.C41536l;

/* renamed from: ty.e */
public final class C28527e {

    /* renamed from: a */
    private final String f72383a;

    /* renamed from: b */
    private final String f72384b;

    /* renamed from: c */
    private final Long f72385c;

    /* renamed from: d */
    private final String f72386d;

    /* renamed from: e */
    private final Long f72387e;

    /* renamed from: f */
    private final String f72388f;

    /* renamed from: g */
    private final String f72389g;

    /* renamed from: h */
    private final String f72390h;

    /* renamed from: i */
    private final String f72391i;

    /* renamed from: j */
    private final Double f72392j;

    /* renamed from: k */
    private final String f72393k;

    /* renamed from: l */
    private final String f72394l;

    public C28527e(String str, String str2, Long l, String str3, Long l2, String str4, String str5, String str6, String str7, Double d, String str8, String str9) {
        this.f72383a = str;
        this.f72384b = str2;
        this.f72385c = l;
        this.f72386d = str3;
        this.f72387e = l2;
        this.f72388f = str4;
        this.f72389g = str5;
        this.f72390h = str6;
        this.f72391i = str7;
        this.f72392j = d;
        this.f72393k = str8;
        this.f72394l = str9;
    }

    /* renamed from: a */
    public final String mo68190a() {
        return this.f72390h;
    }

    /* renamed from: b */
    public final Long mo68191b() {
        return this.f72387e;
    }

    /* renamed from: c */
    public final String mo68192c() {
        return this.f72389g;
    }

    /* renamed from: d */
    public final Double mo68193d() {
        return this.f72392j;
    }

    /* renamed from: e */
    public final String mo68194e() {
        return this.f72386d;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C28527e)) {
            return false;
        }
        C28527e eVar = (C28527e) obj;
        return C41536l.m120484d(this.f72383a, eVar.f72383a) && C41536l.m120484d(this.f72384b, eVar.f72384b) && C41536l.m120484d(this.f72385c, eVar.f72385c) && C41536l.m120484d(this.f72386d, eVar.f72386d) && C41536l.m120484d(this.f72387e, eVar.f72387e) && C41536l.m120484d(this.f72388f, eVar.f72388f) && C41536l.m120484d(this.f72389g, eVar.f72389g) && C41536l.m120484d(this.f72390h, eVar.f72390h) && C41536l.m120484d(this.f72391i, eVar.f72391i) && C41536l.m120484d(this.f72392j, eVar.f72392j) && C41536l.m120484d(this.f72393k, eVar.f72393k) && C41536l.m120484d(this.f72394l, eVar.f72394l);
    }

    /* renamed from: f */
    public final Long mo68196f() {
        return this.f72385c;
    }

    /* renamed from: g */
    public final String mo68197g() {
        return this.f72394l;
    }

    /* renamed from: h */
    public final String mo68198h() {
        return this.f72384b;
    }

    public int hashCode() {
        String str = this.f72383a;
        int i = 0;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.f72384b;
        int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        Long l = this.f72385c;
        int hashCode3 = (hashCode2 + (l == null ? 0 : l.hashCode())) * 31;
        String str3 = this.f72386d;
        int hashCode4 = (hashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31;
        Long l2 = this.f72387e;
        int hashCode5 = (hashCode4 + (l2 == null ? 0 : l2.hashCode())) * 31;
        String str4 = this.f72388f;
        int hashCode6 = (hashCode5 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.f72389g;
        int hashCode7 = (hashCode6 + (str5 == null ? 0 : str5.hashCode())) * 31;
        String str6 = this.f72390h;
        int hashCode8 = (hashCode7 + (str6 == null ? 0 : str6.hashCode())) * 31;
        String str7 = this.f72391i;
        int hashCode9 = (hashCode8 + (str7 == null ? 0 : str7.hashCode())) * 31;
        Double d = this.f72392j;
        int hashCode10 = (hashCode9 + (d == null ? 0 : d.hashCode())) * 31;
        String str8 = this.f72393k;
        int hashCode11 = (hashCode10 + (str8 == null ? 0 : str8.hashCode())) * 31;
        String str9 = this.f72394l;
        if (str9 != null) {
            i = str9.hashCode();
        }
        return hashCode11 + i;
    }

    /* renamed from: i */
    public final String mo68200i() {
        return this.f72383a;
    }

    /* renamed from: j */
    public final String mo68201j() {
        return this.f72391i;
    }

    /* renamed from: k */
    public final String mo68202k() {
        return this.f72393k;
    }

    /* renamed from: l */
    public final String mo68203l() {
        return this.f72388f;
    }

    public String toString() {
        String str = this.f72383a;
        String str2 = this.f72384b;
        Long l = this.f72385c;
        String str3 = this.f72386d;
        Long l2 = this.f72387e;
        String str4 = this.f72388f;
        String str5 = this.f72389g;
        String str6 = this.f72390h;
        String str7 = this.f72391i;
        Double d = this.f72392j;
        String str8 = this.f72393k;
        String str9 = this.f72394l;
        return "BonusDepositAccount(clientKey=" + str + ", agreeType=" + str2 + ", agreeKey=" + l + ", agreeCcy=" + str3 + ", acctKey=" + l2 + ", name=" + str4 + ", acctNo=" + str5 + ", acctDesc=" + str6 + ", depositAgreeType=" + str7 + ", agreeBalance=" + d + ", depositTypeDictionaryKey=" + str8 + ", agreeNo=" + str9 + ")";
    }
}
