package p341ge.bog.sso_client.models;

import java.math.BigDecimal;
import kotlin.jvm.internal.C41536l;

/* renamed from: ge.bog.sso_client.models.d */
public final class C35936d {

    /* renamed from: a */
    private final String f86926a;

    /* renamed from: b */
    private final String f86927b;

    /* renamed from: c */
    private final Boolean f86928c;

    /* renamed from: d */
    private final String f86929d;

    /* renamed from: e */
    private final String f86930e;

    /* renamed from: f */
    private final String f86931f;

    /* renamed from: g */
    private final BigDecimal f86932g;

    /* renamed from: h */
    private final String f86933h;

    /* renamed from: i */
    private final String f86934i;

    /* renamed from: j */
    private final BigDecimal f86935j;

    /* renamed from: k */
    private final String f86936k;

    /* renamed from: l */
    private final String f86937l;

    /* renamed from: m */
    private final BigDecimal f86938m;

    /* renamed from: n */
    private final BigDecimal f86939n;

    public C35936d(String str, String str2, Boolean bool, String str3, String str4, String str5, BigDecimal bigDecimal, String str6, String str7, BigDecimal bigDecimal2, String str8, String str9, BigDecimal bigDecimal3, BigDecimal bigDecimal4) {
        this.f86926a = str;
        this.f86927b = str2;
        this.f86928c = bool;
        this.f86929d = str3;
        this.f86930e = str4;
        this.f86931f = str5;
        this.f86932g = bigDecimal;
        this.f86933h = str6;
        this.f86934i = str7;
        this.f86935j = bigDecimal2;
        this.f86936k = str8;
        this.f86937l = str9;
        this.f86938m = bigDecimal3;
        this.f86939n = bigDecimal4;
    }

    /* renamed from: a */
    public final Boolean mo88476a() {
        return this.f86928c;
    }

    /* renamed from: b */
    public final String mo88477b() {
        return this.f86929d;
    }

    /* renamed from: c */
    public final String mo88478c() {
        return this.f86931f;
    }

    /* renamed from: d */
    public final BigDecimal mo88479d() {
        return this.f86932g;
    }

    /* renamed from: e */
    public final BigDecimal mo88480e() {
        return this.f86935j;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C35936d)) {
            return false;
        }
        C35936d dVar = (C35936d) obj;
        return C41536l.m120484d(this.f86926a, dVar.f86926a) && C41536l.m120484d(this.f86927b, dVar.f86927b) && C41536l.m120484d(this.f86928c, dVar.f86928c) && C41536l.m120484d(this.f86929d, dVar.f86929d) && C41536l.m120484d(this.f86930e, dVar.f86930e) && C41536l.m120484d(this.f86931f, dVar.f86931f) && C41536l.m120484d(this.f86932g, dVar.f86932g) && C41536l.m120484d(this.f86933h, dVar.f86933h) && C41536l.m120484d(this.f86934i, dVar.f86934i) && C41536l.m120484d(this.f86935j, dVar.f86935j) && C41536l.m120484d(this.f86936k, dVar.f86936k) && C41536l.m120484d(this.f86937l, dVar.f86937l) && C41536l.m120484d(this.f86938m, dVar.f86938m) && C41536l.m120484d(this.f86939n, dVar.f86939n);
    }

    /* renamed from: f */
    public final String mo88482f() {
        return this.f86933h;
    }

    public int hashCode() {
        String str = this.f86926a;
        int i = 0;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.f86927b;
        int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        Boolean bool = this.f86928c;
        int hashCode3 = (hashCode2 + (bool == null ? 0 : bool.hashCode())) * 31;
        String str3 = this.f86929d;
        int hashCode4 = (hashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.f86930e;
        int hashCode5 = (hashCode4 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.f86931f;
        int hashCode6 = (hashCode5 + (str5 == null ? 0 : str5.hashCode())) * 31;
        BigDecimal bigDecimal = this.f86932g;
        int hashCode7 = (hashCode6 + (bigDecimal == null ? 0 : bigDecimal.hashCode())) * 31;
        String str6 = this.f86933h;
        int hashCode8 = (hashCode7 + (str6 == null ? 0 : str6.hashCode())) * 31;
        String str7 = this.f86934i;
        int hashCode9 = (hashCode8 + (str7 == null ? 0 : str7.hashCode())) * 31;
        BigDecimal bigDecimal2 = this.f86935j;
        int hashCode10 = (hashCode9 + (bigDecimal2 == null ? 0 : bigDecimal2.hashCode())) * 31;
        String str8 = this.f86936k;
        int hashCode11 = (hashCode10 + (str8 == null ? 0 : str8.hashCode())) * 31;
        String str9 = this.f86937l;
        int hashCode12 = (hashCode11 + (str9 == null ? 0 : str9.hashCode())) * 31;
        BigDecimal bigDecimal3 = this.f86938m;
        int hashCode13 = (hashCode12 + (bigDecimal3 == null ? 0 : bigDecimal3.hashCode())) * 31;
        BigDecimal bigDecimal4 = this.f86939n;
        if (bigDecimal4 != null) {
            i = bigDecimal4.hashCode();
        }
        return hashCode13 + i;
    }

    public String toString() {
        return "CustomerDevice(appVersion=" + this.f86926a + ", channelId=" + this.f86927b + ", currentDevice=" + this.f86928c + ", deviceInfo=" + this.f86929d + ", deviceModel=" + this.f86930e + ", deviceType=" + this.f86931f + ", id=" + this.f86932g + ", isTrusted=" + this.f86933h + ", languageCode=" + this.f86934i + ", lastLoginDate=" + this.f86935j + ", registrationDate=" + this.f86936k + ", status=" + this.f86937l + ", trustDate=" + this.f86938m + ", unTrustDate=" + this.f86939n + ')';
    }
}
