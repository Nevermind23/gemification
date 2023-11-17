package ul0;

import java.util.List;
import kotlin.jvm.internal.C41536l;

/* renamed from: ul0.g */
public final class C28880g {

    /* renamed from: a */
    private final List f73721a;

    /* renamed from: b */
    private final Integer f73722b;

    /* renamed from: c */
    private final String f73723c;

    /* renamed from: d */
    private final double f73724d;

    /* renamed from: e */
    private final String f73725e;

    /* renamed from: f */
    private final String f73726f;

    /* renamed from: g */
    private final String f73727g;

    /* renamed from: h */
    private final String f73728h;

    /* renamed from: i */
    private final String f73729i;

    /* renamed from: j */
    private final String f73730j;

    /* renamed from: k */
    private final Double f73731k;

    /* renamed from: l */
    private final Double f73732l;

    public C28880g(List list, Integer num, String str, double d, String str2, String str3, String str4, String str5, String str6, String str7, Double d2, Double d3) {
        this.f73721a = list;
        this.f73722b = num;
        this.f73723c = str;
        this.f73724d = d;
        this.f73725e = str2;
        this.f73726f = str3;
        this.f73727g = str4;
        this.f73728h = str5;
        this.f73729i = str6;
        this.f73730j = str7;
        this.f73731k = d2;
        this.f73732l = d3;
    }

    /* renamed from: a */
    public final List mo68634a() {
        return this.f73721a;
    }

    /* renamed from: b */
    public final String mo68635b() {
        return this.f73723c;
    }

    /* renamed from: c */
    public final Double mo68636c() {
        return this.f73731k;
    }

    /* renamed from: d */
    public final Double mo68637d() {
        return this.f73732l;
    }

    /* renamed from: e */
    public final double mo68638e() {
        return this.f73724d;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C28880g)) {
            return false;
        }
        C28880g gVar = (C28880g) obj;
        return C41536l.m120484d(this.f73721a, gVar.f73721a) && C41536l.m120484d(this.f73722b, gVar.f73722b) && C41536l.m120484d(this.f73723c, gVar.f73723c) && Double.compare(this.f73724d, gVar.f73724d) == 0 && C41536l.m120484d(this.f73725e, gVar.f73725e) && C41536l.m120484d(this.f73726f, gVar.f73726f) && C41536l.m120484d(this.f73727g, gVar.f73727g) && C41536l.m120484d(this.f73728h, gVar.f73728h) && C41536l.m120484d(this.f73729i, gVar.f73729i) && C41536l.m120484d(this.f73730j, gVar.f73730j) && C41536l.m120484d(this.f73731k, gVar.f73731k) && C41536l.m120484d(this.f73732l, gVar.f73732l);
    }

    /* renamed from: f */
    public final String mo68640f() {
        return this.f73725e;
    }

    /* renamed from: g */
    public final String mo68641g() {
        return this.f73726f;
    }

    /* renamed from: h */
    public final String mo68642h() {
        return this.f73730j;
    }

    public int hashCode() {
        List list = this.f73721a;
        int i = 0;
        int hashCode = (list == null ? 0 : list.hashCode()) * 31;
        Integer num = this.f73722b;
        int hashCode2 = (hashCode + (num == null ? 0 : num.hashCode())) * 31;
        String str = this.f73723c;
        int hashCode3 = (((hashCode2 + (str == null ? 0 : str.hashCode())) * 31) + Double.doubleToLongBits(this.f73724d)) * 31;
        String str2 = this.f73725e;
        int hashCode4 = (hashCode3 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.f73726f;
        int hashCode5 = (hashCode4 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.f73727g;
        int hashCode6 = (hashCode5 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.f73728h;
        int hashCode7 = (hashCode6 + (str5 == null ? 0 : str5.hashCode())) * 31;
        String str6 = this.f73729i;
        int hashCode8 = (hashCode7 + (str6 == null ? 0 : str6.hashCode())) * 31;
        String str7 = this.f73730j;
        int hashCode9 = (hashCode8 + (str7 == null ? 0 : str7.hashCode())) * 31;
        Double d = this.f73731k;
        int hashCode10 = (hashCode9 + (d == null ? 0 : d.hashCode())) * 31;
        Double d2 = this.f73732l;
        if (d2 != null) {
            i = d2.hashCode();
        }
        return hashCode10 + i;
    }

    /* renamed from: i */
    public final String mo68644i() {
        return this.f73727g;
    }

    /* renamed from: j */
    public final String mo68645j() {
        return this.f73728h;
    }

    /* renamed from: k */
    public final String mo68646k() {
        return this.f73729i;
    }

    public String toString() {
        List list = this.f73721a;
        Integer num = this.f73722b;
        String str = this.f73723c;
        double d = this.f73724d;
        String str2 = this.f73725e;
        String str3 = this.f73726f;
        String str4 = this.f73727g;
        String str5 = this.f73728h;
        String str6 = this.f73729i;
        String str7 = this.f73730j;
        Double d2 = this.f73731k;
        Double d3 = this.f73732l;
        return "TravelInsuranceResult(additionalCoverage=" + list + ", errorCode=" + num + ", hashKey=" + str + ", premium=" + d + ", premiumCcy=" + str2 + ", productId=" + str3 + ", providerLogoURL=" + str4 + ", providerName=" + str5 + ", sessionId=" + str6 + ", providerId=" + str7 + ", insurancePremium=" + d2 + ", luggagePremium=" + d3 + ")";
    }
}
