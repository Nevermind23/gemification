package p777gz;

import java.util.List;
import kotlin.jvm.internal.C41536l;

/* renamed from: gz.d */
public final class C24841d {

    /* renamed from: a */
    private final String f63774a;

    /* renamed from: b */
    private final Boolean f63775b;

    /* renamed from: c */
    private final String f63776c;

    /* renamed from: d */
    private final Integer f63777d;

    /* renamed from: e */
    private final Long f63778e;

    /* renamed from: f */
    private final Boolean f63779f;

    /* renamed from: g */
    private final Long f63780g;

    /* renamed from: h */
    private final Boolean f63781h;

    /* renamed from: i */
    private final Integer f63782i;

    /* renamed from: j */
    private final String f63783j;

    /* renamed from: k */
    private final String f63784k;

    /* renamed from: l */
    private final Boolean f63785l;

    /* renamed from: m */
    private final Boolean f63786m;

    /* renamed from: n */
    private final Integer f63787n;

    /* renamed from: o */
    private final Boolean f63788o;

    /* renamed from: p */
    private final Boolean f63789p;

    /* renamed from: q */
    private final Object f63790q;

    /* renamed from: r */
    private final String f63791r;

    /* renamed from: s */
    private final String f63792s;

    /* renamed from: t */
    private final String f63793t;

    /* renamed from: u */
    private final List f63794u;

    /* renamed from: v */
    private final boolean f63795v;

    /* renamed from: w */
    private final boolean f63796w;

    public C24841d(String str, Boolean bool, String str2, Integer num, Long l, Boolean bool2, Long l2, Boolean bool3, Integer num2, String str3, String str4, Boolean bool4, Boolean bool5, Integer num3, Boolean bool6, Boolean bool7, Object obj, String str5, String str6, String str7, List list, boolean z, boolean z2) {
        C41536l.m120489i(str, "mtSystem");
        C41536l.m120489i(str2, "mtSystemDictionaryKey");
        this.f63774a = str;
        this.f63775b = bool;
        this.f63776c = str2;
        this.f63777d = num;
        this.f63778e = l;
        this.f63779f = bool2;
        this.f63780g = l2;
        this.f63781h = bool3;
        this.f63782i = num2;
        this.f63783j = str3;
        this.f63784k = str4;
        this.f63785l = bool4;
        this.f63786m = bool5;
        this.f63787n = num3;
        this.f63788o = bool6;
        this.f63789p = bool7;
        this.f63790q = obj;
        this.f63791r = str5;
        this.f63792s = str6;
        this.f63793t = str7;
        this.f63794u = list;
        this.f63795v = z;
        this.f63796w = z2;
    }

    /* renamed from: a */
    public final List mo63268a() {
        return this.f63794u;
    }

    /* renamed from: b */
    public final boolean mo63269b() {
        return this.f63796w;
    }

    /* renamed from: c */
    public final String mo63270c() {
        return this.f63793t;
    }

    /* renamed from: d */
    public final String mo63271d() {
        return this.f63774a;
    }

    /* renamed from: e */
    public final String mo63272e() {
        return this.f63776c;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C24841d)) {
            return false;
        }
        C24841d dVar = (C24841d) obj;
        return C41536l.m120484d(this.f63774a, dVar.f63774a) && C41536l.m120484d(this.f63775b, dVar.f63775b) && C41536l.m120484d(this.f63776c, dVar.f63776c) && C41536l.m120484d(this.f63777d, dVar.f63777d) && C41536l.m120484d(this.f63778e, dVar.f63778e) && C41536l.m120484d(this.f63779f, dVar.f63779f) && C41536l.m120484d(this.f63780g, dVar.f63780g) && C41536l.m120484d(this.f63781h, dVar.f63781h) && C41536l.m120484d(this.f63782i, dVar.f63782i) && C41536l.m120484d(this.f63783j, dVar.f63783j) && C41536l.m120484d(this.f63784k, dVar.f63784k) && C41536l.m120484d(this.f63785l, dVar.f63785l) && C41536l.m120484d(this.f63786m, dVar.f63786m) && C41536l.m120484d(this.f63787n, dVar.f63787n) && C41536l.m120484d(this.f63788o, dVar.f63788o) && C41536l.m120484d(this.f63789p, dVar.f63789p) && C41536l.m120484d(this.f63790q, dVar.f63790q) && C41536l.m120484d(this.f63791r, dVar.f63791r) && C41536l.m120484d(this.f63792s, dVar.f63792s) && C41536l.m120484d(this.f63793t, dVar.f63793t) && C41536l.m120484d(this.f63794u, dVar.f63794u) && this.f63795v == dVar.f63795v && this.f63796w == dVar.f63796w;
    }

    /* renamed from: f */
    public final boolean mo63274f() {
        return this.f63795v;
    }

    public int hashCode() {
        int hashCode = this.f63774a.hashCode() * 31;
        Boolean bool = this.f63775b;
        int i = 0;
        int hashCode2 = (((hashCode + (bool == null ? 0 : bool.hashCode())) * 31) + this.f63776c.hashCode()) * 31;
        Integer num = this.f63777d;
        int hashCode3 = (hashCode2 + (num == null ? 0 : num.hashCode())) * 31;
        Long l = this.f63778e;
        int hashCode4 = (hashCode3 + (l == null ? 0 : l.hashCode())) * 31;
        Boolean bool2 = this.f63779f;
        int hashCode5 = (hashCode4 + (bool2 == null ? 0 : bool2.hashCode())) * 31;
        Long l2 = this.f63780g;
        int hashCode6 = (hashCode5 + (l2 == null ? 0 : l2.hashCode())) * 31;
        Boolean bool3 = this.f63781h;
        int hashCode7 = (hashCode6 + (bool3 == null ? 0 : bool3.hashCode())) * 31;
        Integer num2 = this.f63782i;
        int hashCode8 = (hashCode7 + (num2 == null ? 0 : num2.hashCode())) * 31;
        String str = this.f63783j;
        int hashCode9 = (hashCode8 + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.f63784k;
        int hashCode10 = (hashCode9 + (str2 == null ? 0 : str2.hashCode())) * 31;
        Boolean bool4 = this.f63785l;
        int hashCode11 = (hashCode10 + (bool4 == null ? 0 : bool4.hashCode())) * 31;
        Boolean bool5 = this.f63786m;
        int hashCode12 = (hashCode11 + (bool5 == null ? 0 : bool5.hashCode())) * 31;
        Integer num3 = this.f63787n;
        int hashCode13 = (hashCode12 + (num3 == null ? 0 : num3.hashCode())) * 31;
        Boolean bool6 = this.f63788o;
        int hashCode14 = (hashCode13 + (bool6 == null ? 0 : bool6.hashCode())) * 31;
        Boolean bool7 = this.f63789p;
        int hashCode15 = (hashCode14 + (bool7 == null ? 0 : bool7.hashCode())) * 31;
        Object obj = this.f63790q;
        int hashCode16 = (hashCode15 + (obj == null ? 0 : obj.hashCode())) * 31;
        String str3 = this.f63791r;
        int hashCode17 = (hashCode16 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.f63792s;
        int hashCode18 = (hashCode17 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.f63793t;
        int hashCode19 = (hashCode18 + (str5 == null ? 0 : str5.hashCode())) * 31;
        List list = this.f63794u;
        if (list != null) {
            i = list.hashCode();
        }
        int i2 = (hashCode19 + i) * 31;
        boolean z = this.f63795v;
        boolean z2 = true;
        if (z) {
            z = true;
        }
        int i3 = (i2 + (z ? 1 : 0)) * 31;
        boolean z3 = this.f63796w;
        if (!z3) {
            z2 = z3;
        }
        return i3 + (z2 ? 1 : 0);
    }

    public String toString() {
        String str = this.f63774a;
        Boolean bool = this.f63775b;
        String str2 = this.f63776c;
        Integer num = this.f63777d;
        Long l = this.f63778e;
        Boolean bool2 = this.f63779f;
        Long l2 = this.f63780g;
        Boolean bool3 = this.f63781h;
        Integer num2 = this.f63782i;
        String str3 = this.f63783j;
        String str4 = this.f63784k;
        Boolean bool4 = this.f63785l;
        Boolean bool5 = this.f63786m;
        Integer num3 = this.f63787n;
        Boolean bool6 = this.f63788o;
        Boolean bool7 = this.f63789p;
        Object obj = this.f63790q;
        String str5 = this.f63791r;
        String str6 = this.f63792s;
        String str7 = this.f63793t;
        List list = this.f63794u;
        boolean z = this.f63795v;
        boolean z2 = this.f63796w;
        return "MoneyTransferType(mtSystem=" + str + ", skipSendCountrySelection=" + bool + ", mtSystemDictionaryKey=" + str2 + ", reviseId=" + num + ", acceptTime=" + l + ", transferNumberAllowsCharacters=" + bool2 + ", editTime=" + l2 + ", payoutAmountRequired=" + bool3 + ", transferNumberMinLength=" + num2 + ", editUsername=" + str3 + ", acceptUsername=" + str4 + ", sendInCountry=" + bool4 + ", receiveAvailable=" + bool5 + ", transferNumberMaxLength=" + num3 + ", payoutCurrencyAvailable=" + bool6 + ", sendAvailable=" + bool7 + ", previousRevision=" + obj + ", info=" + str5 + ", status=" + str6 + ", logoUrl=" + str7 + ", currencies=" + list + ", requiresSenderCountry=" + z + ", hasUniversalFind=" + z2 + ")";
    }
}
