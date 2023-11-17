package p906ty;

import kotlin.jvm.internal.C41536l;

/* renamed from: ty.g */
public final class C28529g {

    /* renamed from: a */
    private final Long f72407a;

    /* renamed from: b */
    private final Long f72408b;

    /* renamed from: c */
    private final Long f72409c;

    /* renamed from: d */
    private final Integer f72410d;

    /* renamed from: e */
    private final String f72411e;

    /* renamed from: f */
    private final String f72412f;

    /* renamed from: g */
    private final String f72413g;

    /* renamed from: h */
    private final String f72414h;

    /* renamed from: i */
    private final Long f72415i;

    /* renamed from: j */
    private final String f72416j;

    /* renamed from: k */
    private final String f72417k;

    /* renamed from: l */
    private final String f72418l;

    public C28529g(Long l, Long l2, Long l3, Integer num, String str, String str2, String str3, String str4, Long l4, String str5, String str6, String str7) {
        this.f72407a = l;
        this.f72408b = l2;
        this.f72409c = l3;
        this.f72410d = num;
        this.f72411e = str;
        this.f72412f = str2;
        this.f72413g = str3;
        this.f72414h = str4;
        this.f72415i = l4;
        this.f72416j = str5;
        this.f72417k = str6;
        this.f72418l = str7;
    }

    /* renamed from: a */
    public final Long mo68220a() {
        return this.f72408b;
    }

    /* renamed from: b */
    public final String mo68221b() {
        return this.f72414h;
    }

    /* renamed from: c */
    public final Long mo68222c() {
        return this.f72407a;
    }

    /* renamed from: d */
    public final String mo68223d() {
        return this.f72411e;
    }

    /* renamed from: e */
    public final Long mo68224e() {
        return this.f72409c;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C28529g)) {
            return false;
        }
        C28529g gVar = (C28529g) obj;
        return C41536l.m120484d(this.f72407a, gVar.f72407a) && C41536l.m120484d(this.f72408b, gVar.f72408b) && C41536l.m120484d(this.f72409c, gVar.f72409c) && C41536l.m120484d(this.f72410d, gVar.f72410d) && C41536l.m120484d(this.f72411e, gVar.f72411e) && C41536l.m120484d(this.f72412f, gVar.f72412f) && C41536l.m120484d(this.f72413g, gVar.f72413g) && C41536l.m120484d(this.f72414h, gVar.f72414h) && C41536l.m120484d(this.f72415i, gVar.f72415i) && C41536l.m120484d(this.f72416j, gVar.f72416j) && C41536l.m120484d(this.f72417k, gVar.f72417k) && C41536l.m120484d(this.f72418l, gVar.f72418l);
    }

    /* renamed from: f */
    public final String mo68226f() {
        return this.f72418l;
    }

    /* renamed from: g */
    public final Long mo68227g() {
        return this.f72415i;
    }

    /* renamed from: h */
    public final String mo68228h() {
        return this.f72416j;
    }

    public int hashCode() {
        Long l = this.f72407a;
        int i = 0;
        int hashCode = (l == null ? 0 : l.hashCode()) * 31;
        Long l2 = this.f72408b;
        int hashCode2 = (hashCode + (l2 == null ? 0 : l2.hashCode())) * 31;
        Long l3 = this.f72409c;
        int hashCode3 = (hashCode2 + (l3 == null ? 0 : l3.hashCode())) * 31;
        Integer num = this.f72410d;
        int hashCode4 = (hashCode3 + (num == null ? 0 : num.hashCode())) * 31;
        String str = this.f72411e;
        int hashCode5 = (hashCode4 + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.f72412f;
        int hashCode6 = (hashCode5 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.f72413g;
        int hashCode7 = (hashCode6 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.f72414h;
        int hashCode8 = (hashCode7 + (str4 == null ? 0 : str4.hashCode())) * 31;
        Long l4 = this.f72415i;
        int hashCode9 = (hashCode8 + (l4 == null ? 0 : l4.hashCode())) * 31;
        String str5 = this.f72416j;
        int hashCode10 = (hashCode9 + (str5 == null ? 0 : str5.hashCode())) * 31;
        String str6 = this.f72417k;
        int hashCode11 = (hashCode10 + (str6 == null ? 0 : str6.hashCode())) * 31;
        String str7 = this.f72418l;
        if (str7 != null) {
            i = str7.hashCode();
        }
        return hashCode11 + i;
    }

    /* renamed from: i */
    public final String mo68230i() {
        return this.f72417k;
    }

    /* renamed from: j */
    public final String mo68231j() {
        return this.f72412f;
    }

    /* renamed from: k */
    public final Integer mo68232k() {
        return this.f72410d;
    }

    /* renamed from: l */
    public final String mo68233l() {
        return this.f72413g;
    }

    public String toString() {
        Long l = this.f72407a;
        Long l2 = this.f72408b;
        Long l3 = this.f72409c;
        Integer num = this.f72410d;
        String str = this.f72411e;
        String str2 = this.f72412f;
        String str3 = this.f72413g;
        String str4 = this.f72414h;
        Long l4 = this.f72415i;
        String str5 = this.f72416j;
        String str6 = this.f72417k;
        String str7 = this.f72418l;
        return "BonusScool(cardId=" + l + ", acctKey=" + l2 + ", childClientKey=" + l3 + ", sclPoints=" + num + ", cardName=" + str + ", productCode=" + str2 + ", subProductCode=" + str3 + ", cardHolder=" + str4 + ", expDate=" + l4 + ", lastFour=" + str5 + ", mainCcy=" + str6 + ", dictionaryKey=" + str7 + ")";
    }
}
