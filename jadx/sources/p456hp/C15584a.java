package p456hp;

import java.math.BigDecimal;
import kotlin.jvm.internal.C41536l;

/* renamed from: hp.a */
public final class C15584a {

    /* renamed from: a */
    private final String f44260a;

    /* renamed from: b */
    private final BigDecimal f44261b;

    /* renamed from: c */
    private final String f44262c;

    /* renamed from: d */
    private final Object f44263d;

    /* renamed from: e */
    private final Long f44264e;

    /* renamed from: f */
    private final String f44265f;

    /* renamed from: g */
    private final String f44266g;

    /* renamed from: h */
    private final Long f44267h;

    /* renamed from: i */
    private final String f44268i;

    /* renamed from: j */
    private final String f44269j;

    /* renamed from: k */
    private final String f44270k;

    /* renamed from: l */
    private final String f44271l;

    public C15584a(String str, BigDecimal bigDecimal, String str2, Object obj, Long l, String str3, String str4, Long l2, String str5, String str6, String str7, String str8) {
        this.f44260a = str;
        this.f44261b = bigDecimal;
        this.f44262c = str2;
        this.f44263d = obj;
        this.f44264e = l;
        this.f44265f = str3;
        this.f44266g = str4;
        this.f44267h = l2;
        this.f44268i = str5;
        this.f44269j = str6;
        this.f44270k = str7;
        this.f44271l = str8;
    }

    /* renamed from: a */
    public final BigDecimal mo42834a() {
        return this.f44261b;
    }

    /* renamed from: b */
    public final String mo42835b() {
        return this.f44262c;
    }

    /* renamed from: c */
    public final String mo42836c() {
        return this.f44270k;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C15584a)) {
            return false;
        }
        C15584a aVar = (C15584a) obj;
        return C41536l.m120484d(this.f44260a, aVar.f44260a) && C41536l.m120484d(this.f44261b, aVar.f44261b) && C41536l.m120484d(this.f44262c, aVar.f44262c) && C41536l.m120484d(this.f44263d, aVar.f44263d) && C41536l.m120484d(this.f44264e, aVar.f44264e) && C41536l.m120484d(this.f44265f, aVar.f44265f) && C41536l.m120484d(this.f44266g, aVar.f44266g) && C41536l.m120484d(this.f44267h, aVar.f44267h) && C41536l.m120484d(this.f44268i, aVar.f44268i) && C41536l.m120484d(this.f44269j, aVar.f44269j) && C41536l.m120484d(this.f44270k, aVar.f44270k) && C41536l.m120484d(this.f44271l, aVar.f44271l);
    }

    public int hashCode() {
        String str = this.f44260a;
        int i = 0;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        BigDecimal bigDecimal = this.f44261b;
        int hashCode2 = (hashCode + (bigDecimal == null ? 0 : bigDecimal.hashCode())) * 31;
        String str2 = this.f44262c;
        int hashCode3 = (hashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        Object obj = this.f44263d;
        int hashCode4 = (hashCode3 + (obj == null ? 0 : obj.hashCode())) * 31;
        Long l = this.f44264e;
        int hashCode5 = (hashCode4 + (l == null ? 0 : l.hashCode())) * 31;
        String str3 = this.f44265f;
        int hashCode6 = (hashCode5 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.f44266g;
        int hashCode7 = (hashCode6 + (str4 == null ? 0 : str4.hashCode())) * 31;
        Long l2 = this.f44267h;
        int hashCode8 = (hashCode7 + (l2 == null ? 0 : l2.hashCode())) * 31;
        String str5 = this.f44268i;
        int hashCode9 = (hashCode8 + (str5 == null ? 0 : str5.hashCode())) * 31;
        String str6 = this.f44269j;
        int hashCode10 = (hashCode9 + (str6 == null ? 0 : str6.hashCode())) * 31;
        String str7 = this.f44270k;
        int hashCode11 = (hashCode10 + (str7 == null ? 0 : str7.hashCode())) * 31;
        String str8 = this.f44271l;
        if (str8 != null) {
            i = str8.hashCode();
        }
        return hashCode11 + i;
    }

    public String toString() {
        String str = this.f44260a;
        BigDecimal bigDecimal = this.f44261b;
        String str2 = this.f44262c;
        Object obj = this.f44263d;
        Long l = this.f44264e;
        String str3 = this.f44265f;
        String str4 = this.f44266g;
        Long l2 = this.f44267h;
        String str5 = this.f44268i;
        String str6 = this.f44269j;
        String str7 = this.f44270k;
        String str8 = this.f44271l;
        return "TransactionUiModel(acctNo=" + str + ", amount=" + bigDecimal + ", ccy=" + str2 + ", docKey=" + obj + ", inpSysdate=" + l + ", lastFour=" + str3 + ", nomination=" + str4 + ", packageId=" + l2 + ", postDate=" + str5 + ", prodGroup=" + str6 + ", prodGroupDesc=" + str7 + ", tranStatus=" + str8 + ")";
    }
}
