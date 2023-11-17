package dp0;

import j31.C36725a;
import kotlin.jvm.internal.C41536l;
import p190o1.C7397t;

/* renamed from: dp0.a */
public final class C12419a {

    /* renamed from: a */
    private final Long f37071a;

    /* renamed from: b */
    private final long f37072b;

    /* renamed from: c */
    private final String f37073c;

    /* renamed from: d */
    private final String f37074d;

    /* renamed from: e */
    private final String f37075e;

    /* renamed from: f */
    private final boolean f37076f;

    /* renamed from: g */
    private final double f37077g;

    /* renamed from: h */
    private final String f37078h;

    /* renamed from: i */
    private final Long f37079i;

    /* renamed from: j */
    private final String f37080j;

    /* renamed from: k */
    private final String f37081k;

    /* renamed from: l */
    private final String f37082l;

    /* renamed from: m */
    private final C36725a f37083m;

    /* renamed from: n */
    private final C36725a f37084n;

    public C12419a(Long l, long j, String str, String str2, String str3, boolean z, double d, String str4, Long l2, String str5, String str6, String str7, C36725a aVar, C36725a aVar2) {
        String str8 = str4;
        C36725a aVar3 = aVar;
        C36725a aVar4 = aVar2;
        C41536l.m120489i(str, "acctNo");
        C41536l.m120489i(str8, "ccy");
        C41536l.m120489i(aVar3, "cardImage");
        C41536l.m120489i(aVar4, "cardSmallImage");
        this.f37071a = l;
        this.f37072b = j;
        this.f37073c = str;
        this.f37074d = str2;
        this.f37075e = str3;
        this.f37076f = z;
        this.f37077g = d;
        this.f37078h = str8;
        this.f37079i = l2;
        this.f37080j = str5;
        this.f37081k = str6;
        this.f37082l = str7;
        this.f37083m = aVar3;
        this.f37084n = aVar4;
    }

    /* renamed from: a */
    public final String mo33017a() {
        return this.f37074d;
    }

    /* renamed from: b */
    public final long mo33018b() {
        return this.f37072b;
    }

    /* renamed from: c */
    public final String mo33019c() {
        return this.f37073c;
    }

    /* renamed from: d */
    public final double mo33020d() {
        return this.f37077g;
    }

    /* renamed from: e */
    public final C36725a mo33021e() {
        return this.f37083m;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C12419a)) {
            return false;
        }
        C12419a aVar = (C12419a) obj;
        return C41536l.m120484d(this.f37071a, aVar.f37071a) && this.f37072b == aVar.f37072b && C41536l.m120484d(this.f37073c, aVar.f37073c) && C41536l.m120484d(this.f37074d, aVar.f37074d) && C41536l.m120484d(this.f37075e, aVar.f37075e) && this.f37076f == aVar.f37076f && Double.compare(this.f37077g, aVar.f37077g) == 0 && C41536l.m120484d(this.f37078h, aVar.f37078h) && C41536l.m120484d(this.f37079i, aVar.f37079i) && C41536l.m120484d(this.f37080j, aVar.f37080j) && C41536l.m120484d(this.f37081k, aVar.f37081k) && C41536l.m120484d(this.f37082l, aVar.f37082l) && C41536l.m120484d(this.f37083m, aVar.f37083m) && C41536l.m120484d(this.f37084n, aVar.f37084n);
    }

    /* renamed from: f */
    public final C36725a mo33023f() {
        return this.f37084n;
    }

    /* renamed from: g */
    public final String mo33024g() {
        return this.f37078h;
    }

    /* renamed from: h */
    public final boolean mo33025h() {
        return this.f37076f;
    }

    public int hashCode() {
        Long l = this.f37071a;
        int i = 0;
        int hashCode = (((((l == null ? 0 : l.hashCode()) * 31) + C7397t.m28148a(this.f37072b)) * 31) + this.f37073c.hashCode()) * 31;
        String str = this.f37074d;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.f37075e;
        int hashCode3 = (hashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        boolean z = this.f37076f;
        if (z) {
            z = true;
        }
        int a = (((((hashCode3 + (z ? 1 : 0)) * 31) + Double.doubleToLongBits(this.f37077g)) * 31) + this.f37078h.hashCode()) * 31;
        Long l2 = this.f37079i;
        int hashCode4 = (a + (l2 == null ? 0 : l2.hashCode())) * 31;
        String str3 = this.f37080j;
        int hashCode5 = (hashCode4 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.f37081k;
        int hashCode6 = (hashCode5 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.f37082l;
        if (str5 != null) {
            i = str5.hashCode();
        }
        return ((((hashCode6 + i) * 31) + this.f37083m.hashCode()) * 31) + this.f37084n.hashCode();
    }

    public String toString() {
        Long l = this.f37071a;
        long j = this.f37072b;
        String str = this.f37073c;
        String str2 = this.f37074d;
        String str3 = this.f37075e;
        boolean z = this.f37076f;
        double d = this.f37077g;
        String str4 = this.f37078h;
        Long l2 = this.f37079i;
        String str5 = this.f37080j;
        String str6 = this.f37081k;
        String str7 = this.f37082l;
        C36725a aVar = this.f37083m;
        C36725a aVar2 = this.f37084n;
        return "P2PAccount(clientKey=" + l + ", acctKey=" + j + ", acctNo=" + str + ", acctDesc=" + str2 + ", productCode=" + str3 + ", defaultAcc=" + z + ", availableAmount=" + d + ", ccy=" + str4 + ", cardId=" + l2 + ", cardClass=" + str5 + ", cardType=" + str6 + ", subProductCode=" + str7 + ", cardImage=" + aVar + ", cardSmallImage=" + aVar2 + ")";
    }
}
