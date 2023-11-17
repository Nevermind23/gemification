package p913uu;

import kotlin.jvm.internal.C41536l;

/* renamed from: uu.e */
public final class C28939e {

    /* renamed from: a */
    private final String f73839a;

    /* renamed from: b */
    private final String f73840b;

    /* renamed from: c */
    private final String f73841c;

    /* renamed from: d */
    private final String f73842d;

    /* renamed from: e */
    private final String f73843e;

    /* renamed from: f */
    private final String f73844f;

    /* renamed from: g */
    private final String f73845g;

    /* renamed from: h */
    private final String f73846h;

    /* renamed from: i */
    private final String f73847i;

    /* renamed from: j */
    private final String f73848j;

    /* renamed from: k */
    private final String f73849k;

    /* renamed from: l */
    private final String f73850l;

    /* renamed from: m */
    private final String f73851m;

    /* renamed from: n */
    private final String f73852n;

    /* renamed from: o */
    private final String f73853o;

    public C28939e(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, String str12, String str13, String str14, String str15) {
        String str16 = str3;
        String str17 = str6;
        String str18 = str7;
        String str19 = str8;
        String str20 = str9;
        String str21 = str10;
        String str22 = str12;
        String str23 = str13;
        String str24 = str14;
        C41536l.m120489i(str, "cardName");
        C41536l.m120489i(str2, "cardType");
        C41536l.m120489i(str16, "cardCcy");
        C41536l.m120489i(str17, "periodUnit");
        C41536l.m120489i(str18, "comisAmount");
        C41536l.m120489i(str19, "templCode");
        C41536l.m120489i(str20, "periodLength");
        C41536l.m120489i(str21, "cardClass");
        C41536l.m120489i(str22, "limitMin");
        C41536l.m120489i(str23, "limitMax");
        C41536l.m120489i(str24, "cardLimit");
        this.f73839a = str;
        this.f73840b = str2;
        this.f73841c = str16;
        this.f73842d = str4;
        this.f73843e = str5;
        this.f73844f = str17;
        this.f73845g = str18;
        this.f73846h = str19;
        this.f73847i = str20;
        this.f73848j = str21;
        this.f73849k = str11;
        this.f73850l = str22;
        this.f73851m = str23;
        this.f73852n = str24;
        this.f73853o = str15;
    }

    /* renamed from: a */
    public final String mo68749a() {
        return this.f73841c;
    }

    /* renamed from: b */
    public final String mo68750b() {
        return this.f73848j;
    }

    /* renamed from: c */
    public final String mo68751c() {
        return this.f73849k;
    }

    /* renamed from: d */
    public final String mo68752d() {
        return this.f73852n;
    }

    /* renamed from: e */
    public final String mo68753e() {
        return this.f73839a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C28939e)) {
            return false;
        }
        C28939e eVar = (C28939e) obj;
        return C41536l.m120484d(this.f73839a, eVar.f73839a) && C41536l.m120484d(this.f73840b, eVar.f73840b) && C41536l.m120484d(this.f73841c, eVar.f73841c) && C41536l.m120484d(this.f73842d, eVar.f73842d) && C41536l.m120484d(this.f73843e, eVar.f73843e) && C41536l.m120484d(this.f73844f, eVar.f73844f) && C41536l.m120484d(this.f73845g, eVar.f73845g) && C41536l.m120484d(this.f73846h, eVar.f73846h) && C41536l.m120484d(this.f73847i, eVar.f73847i) && C41536l.m120484d(this.f73848j, eVar.f73848j) && C41536l.m120484d(this.f73849k, eVar.f73849k) && C41536l.m120484d(this.f73850l, eVar.f73850l) && C41536l.m120484d(this.f73851m, eVar.f73851m) && C41536l.m120484d(this.f73852n, eVar.f73852n) && C41536l.m120484d(this.f73853o, eVar.f73853o);
    }

    /* renamed from: f */
    public final String mo68755f() {
        return this.f73840b;
    }

    /* renamed from: g */
    public final String mo68756g() {
        return this.f73845g;
    }

    /* renamed from: h */
    public final String mo68757h() {
        return this.f73842d;
    }

    public int hashCode() {
        int hashCode = ((((this.f73839a.hashCode() * 31) + this.f73840b.hashCode()) * 31) + this.f73841c.hashCode()) * 31;
        String str = this.f73842d;
        int i = 0;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.f73843e;
        int hashCode3 = (((((((((((hashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31) + this.f73844f.hashCode()) * 31) + this.f73845g.hashCode()) * 31) + this.f73846h.hashCode()) * 31) + this.f73847i.hashCode()) * 31) + this.f73848j.hashCode()) * 31;
        String str3 = this.f73849k;
        int hashCode4 = (((((((hashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31) + this.f73850l.hashCode()) * 31) + this.f73851m.hashCode()) * 31) + this.f73852n.hashCode()) * 31;
        String str4 = this.f73853o;
        if (str4 != null) {
            i = str4.hashCode();
        }
        return hashCode4 + i;
    }

    /* renamed from: i */
    public final String mo68759i() {
        return this.f73853o;
    }

    /* renamed from: j */
    public final String mo68760j() {
        return this.f73851m;
    }

    /* renamed from: k */
    public final String mo68761k() {
        return this.f73850l;
    }

    /* renamed from: l */
    public final String mo68762l() {
        return this.f73847i;
    }

    /* renamed from: m */
    public final String mo68763m() {
        return this.f73844f;
    }

    /* renamed from: n */
    public final String mo68764n() {
        return this.f73843e;
    }

    /* renamed from: o */
    public final String mo68765o() {
        return this.f73846h;
    }

    public String toString() {
        String str = this.f73839a;
        String str2 = this.f73840b;
        String str3 = this.f73841c;
        String str4 = this.f73842d;
        String str5 = this.f73843e;
        String str6 = this.f73844f;
        String str7 = this.f73845g;
        String str8 = this.f73846h;
        String str9 = this.f73847i;
        String str10 = this.f73848j;
        String str11 = this.f73849k;
        String str12 = this.f73850l;
        String str13 = this.f73851m;
        String str14 = this.f73852n;
        String str15 = this.f73853o;
        return "CreditOffer(cardName=" + str + ", cardType=" + str2 + ", cardCcy=" + str3 + ", comisCcy=" + str4 + ", productKey=" + str5 + ", periodUnit=" + str6 + ", comisAmount=" + str7 + ", templCode=" + str8 + ", periodLength=" + str9 + ", cardClass=" + str10 + ", cardGroup=" + str11 + ", limitMin=" + str12 + ", limitMax=" + str13 + ", cardLimit=" + str14 + ", creditLimit=" + str15 + ")";
    }
}
