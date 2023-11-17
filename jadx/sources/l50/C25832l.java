package l50;

import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.C41536l;
import p190o1.C7397t;
import p341ge.bog.mobilebank.cleanarch.domain.products.model.CardExternalFile;

/* renamed from: l50.l */
public final class C25832l {

    /* renamed from: a */
    private final long f65704a;

    /* renamed from: b */
    private final long f65705b;

    /* renamed from: c */
    private final List f65706c;

    /* renamed from: d */
    private final String f65707d;

    /* renamed from: e */
    private final String f65708e;

    /* renamed from: f */
    private final String f65709f;

    /* renamed from: g */
    private final String f65710g;

    /* renamed from: h */
    private final String f65711h;

    /* renamed from: i */
    private final String f65712i;

    /* renamed from: j */
    private final double f65713j;

    /* renamed from: k */
    private final boolean f65714k;

    /* renamed from: l */
    private final boolean f65715l;

    /* renamed from: m */
    private final String f65716m;

    /* renamed from: n */
    private final String f65717n;

    /* renamed from: o */
    private final String f65718o;

    /* renamed from: p */
    private final List f65719p;

    /* renamed from: q */
    private final String f65720q;

    /* renamed from: r */
    private final boolean f65721r;

    /* renamed from: s */
    private final long f65722s;

    /* renamed from: t */
    private final boolean f65723t;

    /* renamed from: u */
    private final boolean f65724u;

    /* renamed from: v */
    private final C25828h f65725v;

    /* renamed from: w */
    private final CardExternalFile f65726w;

    /* renamed from: x */
    private final CardExternalFile f65727x;

    public C25832l(long j, long j2, List list, String str, String str2, String str3, String str4, String str5, String str6, double d, boolean z, boolean z2, String str7, String str8, String str9, List list2, String str10, boolean z3, long j3, boolean z4, boolean z5, C25828h hVar) {
        CardExternalFile cardExternalFile;
        Object obj;
        CardExternalFile cardExternalFile2;
        Object obj2;
        Object obj3;
        CardExternalFile f;
        Object obj4;
        boolean z6;
        Object obj5;
        Object obj6;
        boolean z7;
        List list3 = list;
        String str11 = str2;
        String str12 = str3;
        String str13 = str4;
        String str14 = str5;
        String str15 = str6;
        String str16 = str8;
        String str17 = str9;
        List list4 = list2;
        C41536l.m120489i(list3, "accountDebitCards");
        C41536l.m120489i(str11, "accountTitle");
        C41536l.m120489i(str12, "accountDisplayName");
        C41536l.m120489i(str13, "accountPrintNo");
        C41536l.m120489i(str14, "ccy");
        C41536l.m120489i(str15, "ccyType");
        C41536l.m120489i(str16, "productCode");
        C41536l.m120489i(str17, "productGroup");
        C41536l.m120489i(list4, "productFunctions");
        this.f65704a = j;
        this.f65705b = j2;
        this.f65706c = list3;
        this.f65707d = str;
        this.f65708e = str11;
        this.f65709f = str12;
        this.f65710g = str13;
        this.f65711h = str14;
        this.f65712i = str15;
        this.f65713j = d;
        this.f65714k = z;
        this.f65715l = z2;
        this.f65716m = str7;
        this.f65717n = str16;
        this.f65718o = str17;
        this.f65719p = list4;
        this.f65720q = str10;
        this.f65721r = z3;
        this.f65722s = j3;
        this.f65723t = z4;
        this.f65724u = z5;
        this.f65725v = hVar;
        Iterator it = list.iterator();
        while (true) {
            cardExternalFile = null;
            if (!it.hasNext()) {
                obj = null;
                break;
            }
            obj = it.next();
            if (((C25838r) obj).mo64600x().mo63390c()) {
                break;
            }
        }
        C25838r rVar = (C25838r) obj;
        if (rVar == null || (cardExternalFile2 = rVar.mo64589n()) == null) {
            Iterator it2 = this.f65706c.iterator();
            while (true) {
                if (!it2.hasNext()) {
                    obj5 = null;
                    break;
                }
                obj5 = it2.next();
                if (((C25838r) obj5).mo64602z()) {
                    break;
                }
            }
            C25838r rVar2 = (C25838r) obj5;
            cardExternalFile2 = rVar2 != null ? rVar2.mo64589n() : null;
            if (cardExternalFile2 == null) {
                Iterator it3 = this.f65706c.iterator();
                while (true) {
                    if (!it3.hasNext()) {
                        obj6 = null;
                        break;
                    }
                    obj6 = it3.next();
                    if (((C25838r) obj6).mo64589n() != null) {
                        z7 = true;
                        continue;
                    } else {
                        z7 = false;
                        continue;
                    }
                    if (z7) {
                        break;
                    }
                }
                C25838r rVar3 = (C25838r) obj6;
                cardExternalFile2 = rVar3 != null ? rVar3.mo64589n() : null;
            }
        }
        this.f65726w = cardExternalFile2;
        Iterator it4 = this.f65706c.iterator();
        while (true) {
            if (!it4.hasNext()) {
                obj2 = null;
                break;
            }
            obj2 = it4.next();
            if (((C25838r) obj2).mo64600x().mo63390c()) {
                break;
            }
        }
        C25838r rVar4 = (C25838r) obj2;
        if (rVar4 == null || (f = rVar4.mo64580f()) == null) {
            Iterator it5 = this.f65706c.iterator();
            while (true) {
                if (!it5.hasNext()) {
                    obj3 = null;
                    break;
                }
                obj3 = it5.next();
                if (((C25838r) obj3).mo64602z()) {
                    break;
                }
            }
            C25838r rVar5 = (C25838r) obj3;
            f = rVar5 != null ? rVar5.mo64580f() : null;
            if (f == null) {
                Iterator it6 = this.f65706c.iterator();
                while (true) {
                    if (!it6.hasNext()) {
                        obj4 = null;
                        break;
                    }
                    obj4 = it6.next();
                    if (((C25838r) obj4).mo64580f() != null) {
                        z6 = true;
                        continue;
                    } else {
                        z6 = false;
                        continue;
                    }
                    if (z6) {
                        break;
                    }
                }
                C25838r rVar6 = (C25838r) obj4;
                if (rVar6 != null) {
                    cardExternalFile = rVar6.mo64580f();
                }
                this.f65727x = cardExternalFile;
            }
        }
        cardExternalFile = f;
        this.f65727x = cardExternalFile;
    }

    /* renamed from: a */
    public final List mo64522a() {
        return this.f65706c;
    }

    /* renamed from: b */
    public final C25828h mo64523b() {
        return this.f65725v;
    }

    /* renamed from: c */
    public final String mo64524c() {
        return this.f65709f;
    }

    /* renamed from: d */
    public final String mo64525d() {
        return this.f65707d;
    }

    /* renamed from: e */
    public final String mo64526e() {
        return this.f65710g;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C25832l)) {
            return false;
        }
        C25832l lVar = (C25832l) obj;
        return this.f65704a == lVar.f65704a && this.f65705b == lVar.f65705b && C41536l.m120484d(this.f65706c, lVar.f65706c) && C41536l.m120484d(this.f65707d, lVar.f65707d) && C41536l.m120484d(this.f65708e, lVar.f65708e) && C41536l.m120484d(this.f65709f, lVar.f65709f) && C41536l.m120484d(this.f65710g, lVar.f65710g) && C41536l.m120484d(this.f65711h, lVar.f65711h) && C41536l.m120484d(this.f65712i, lVar.f65712i) && Double.compare(this.f65713j, lVar.f65713j) == 0 && this.f65714k == lVar.f65714k && this.f65715l == lVar.f65715l && C41536l.m120484d(this.f65716m, lVar.f65716m) && C41536l.m120484d(this.f65717n, lVar.f65717n) && C41536l.m120484d(this.f65718o, lVar.f65718o) && C41536l.m120484d(this.f65719p, lVar.f65719p) && C41536l.m120484d(this.f65720q, lVar.f65720q) && this.f65721r == lVar.f65721r && this.f65722s == lVar.f65722s && this.f65723t == lVar.f65723t && this.f65724u == lVar.f65724u && C41536l.m120484d(this.f65725v, lVar.f65725v);
    }

    /* renamed from: f */
    public final String mo64528f() {
        return this.f65708e;
    }

    /* renamed from: g */
    public final long mo64529g() {
        return this.f65704a;
    }

    /* renamed from: h */
    public final String mo64530h() {
        return this.f65716m;
    }

    public int hashCode() {
        int a = ((((C7397t.m28148a(this.f65704a) * 31) + C7397t.m28148a(this.f65705b)) * 31) + this.f65706c.hashCode()) * 31;
        String str = this.f65707d;
        int i = 0;
        int hashCode = (((((((((((((a + (str == null ? 0 : str.hashCode())) * 31) + this.f65708e.hashCode()) * 31) + this.f65709f.hashCode()) * 31) + this.f65710g.hashCode()) * 31) + this.f65711h.hashCode()) * 31) + this.f65712i.hashCode()) * 31) + Double.doubleToLongBits(this.f65713j)) * 31;
        boolean z = this.f65714k;
        boolean z2 = true;
        if (z) {
            z = true;
        }
        int i2 = (hashCode + (z ? 1 : 0)) * 31;
        boolean z3 = this.f65715l;
        if (z3) {
            z3 = true;
        }
        int i3 = (i2 + (z3 ? 1 : 0)) * 31;
        String str2 = this.f65716m;
        int hashCode2 = (((((((i3 + (str2 == null ? 0 : str2.hashCode())) * 31) + this.f65717n.hashCode()) * 31) + this.f65718o.hashCode()) * 31) + this.f65719p.hashCode()) * 31;
        String str3 = this.f65720q;
        int hashCode3 = (hashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        boolean z4 = this.f65721r;
        if (z4) {
            z4 = true;
        }
        int a2 = (((hashCode3 + (z4 ? 1 : 0)) * 31) + C7397t.m28148a(this.f65722s)) * 31;
        boolean z5 = this.f65723t;
        if (z5) {
            z5 = true;
        }
        int i4 = (a2 + (z5 ? 1 : 0)) * 31;
        boolean z6 = this.f65724u;
        if (!z6) {
            z2 = z6;
        }
        int i5 = (i4 + (z2 ? 1 : 0)) * 31;
        C25828h hVar = this.f65725v;
        if (hVar != null) {
            i = hVar.hashCode();
        }
        return i5 + i;
    }

    /* renamed from: i */
    public final double mo64532i() {
        return this.f65713j;
    }

    /* renamed from: j */
    public final String mo64533j() {
        return this.f65711h;
    }

    /* renamed from: k */
    public final String mo64534k() {
        return this.f65712i;
    }

    /* renamed from: l */
    public final CardExternalFile mo64535l() {
        return this.f65726w;
    }

    /* renamed from: m */
    public final boolean mo64536m() {
        return this.f65723t;
    }

    /* renamed from: n */
    public final long mo64537n() {
        return this.f65705b;
    }

    /* renamed from: o */
    public final String mo64538o() {
        return this.f65717n;
    }

    /* renamed from: p */
    public final String mo64539p() {
        return this.f65720q;
    }

    /* renamed from: q */
    public final List mo64540q() {
        return this.f65719p;
    }

    /* renamed from: r */
    public final String mo64541r() {
        return this.f65718o;
    }

    /* renamed from: s */
    public final boolean mo64542s() {
        return this.f65721r;
    }

    /* renamed from: t */
    public final boolean mo64543t() {
        return this.f65714k;
    }

    public String toString() {
        long j = this.f65704a;
        long j2 = this.f65705b;
        List list = this.f65706c;
        String str = this.f65707d;
        String str2 = this.f65708e;
        String str3 = this.f65709f;
        String str4 = this.f65710g;
        String str5 = this.f65711h;
        String str6 = this.f65712i;
        double d = this.f65713j;
        boolean z = this.f65714k;
        boolean z2 = this.f65715l;
        String str7 = this.f65716m;
        String str8 = this.f65717n;
        String str9 = this.f65718o;
        List list2 = this.f65719p;
        String str10 = this.f65720q;
        boolean z3 = z;
        boolean z4 = this.f65721r;
        long j3 = this.f65722s;
        boolean z5 = this.f65723t;
        boolean z6 = this.f65724u;
        C25828h hVar = this.f65725v;
        return "AccountWithCardsUIModelList(acctKey=" + j + ", mainAcctKey=" + j2 + ", accountDebitCards=" + list + ", accountName=" + str + ", accountTitle=" + str2 + ", accountDisplayName=" + str3 + ", accountPrintNo=" + str4 + ", ccy=" + str5 + ", ccyType=" + str6 + ", availableAmount=" + d + ", isDefault=" + z3 + ", isHidden=" + z2 + ", attachmentUrl=" + str7 + ", productCode=" + str8 + ", productGroup=" + str9 + ", productFunctions=" + list2 + ", productDictionaryKey=" + str10 + ", isCardExpiring=" + z4 + ", productId=" + j3 + ", hasDigitalCard=" + z5 + ", isUniversal=" + z6 + ", accountDetails=" + hVar + ")";
    }

    /* renamed from: u */
    public final boolean mo64545u() {
        return this.f65715l;
    }

    /* renamed from: v */
    public final boolean mo64546v() {
        return this.f65724u;
    }
}
