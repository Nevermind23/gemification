package p893sw;

import com.salesforce.marketingcloud.C11398b;
import java.math.BigDecimal;
import kotlin.jvm.internal.C41536l;

/* renamed from: sw.b */
public final class C28279b {

    /* renamed from: a */
    private final Boolean f71773a;

    /* renamed from: b */
    private final Boolean f71774b;

    /* renamed from: c */
    private final BigDecimal f71775c;

    /* renamed from: d */
    private final String f71776d;

    /* renamed from: e */
    private final String f71777e;

    /* renamed from: f */
    private final Integer f71778f;

    /* renamed from: g */
    private final String f71779g;

    /* renamed from: h */
    private final BigDecimal f71780h;

    /* renamed from: i */
    private final String f71781i;

    /* renamed from: j */
    private final BigDecimal f71782j;

    /* renamed from: k */
    private final String f71783k;

    /* renamed from: l */
    private final String f71784l;

    /* renamed from: m */
    private final String f71785m;

    /* renamed from: n */
    private final String f71786n;

    public C28279b(Boolean bool, Boolean bool2, BigDecimal bigDecimal, String str, String str2, Integer num, String str3, BigDecimal bigDecimal2, String str4, BigDecimal bigDecimal3, String str5, String str6, String str7, String str8) {
        this.f71773a = bool;
        this.f71774b = bool2;
        this.f71775c = bigDecimal;
        this.f71776d = str;
        this.f71777e = str2;
        this.f71778f = num;
        this.f71779g = str3;
        this.f71780h = bigDecimal2;
        this.f71781i = str4;
        this.f71782j = bigDecimal3;
        this.f71783k = str5;
        this.f71784l = str6;
        this.f71785m = str7;
        this.f71786n = str8;
    }

    /* renamed from: b */
    public static /* synthetic */ C28279b m86910b(C28279b bVar, Boolean bool, Boolean bool2, BigDecimal bigDecimal, String str, String str2, Integer num, String str3, BigDecimal bigDecimal2, String str4, BigDecimal bigDecimal3, String str5, String str6, String str7, String str8, int i, Object obj) {
        C28279b bVar2 = bVar;
        int i2 = i;
        return bVar.mo67901a((i2 & 1) != 0 ? bVar2.f71773a : bool, (i2 & 2) != 0 ? bVar2.f71774b : bool2, (i2 & 4) != 0 ? bVar2.f71775c : bigDecimal, (i2 & 8) != 0 ? bVar2.f71776d : str, (i2 & 16) != 0 ? bVar2.f71777e : str2, (i2 & 32) != 0 ? bVar2.f71778f : num, (i2 & 64) != 0 ? bVar2.f71779g : str3, (i2 & 128) != 0 ? bVar2.f71780h : bigDecimal2, (i2 & C11398b.f33139r) != 0 ? bVar2.f71781i : str4, (i2 & C11398b.f33140s) != 0 ? bVar2.f71782j : bigDecimal3, (i2 & C11398b.f33141t) != 0 ? bVar2.f71783k : str5, (i2 & C11398b.f33142u) != 0 ? bVar2.f71784l : str6, (i2 & C11398b.f33143v) != 0 ? bVar2.f71785m : str7, (i2 & 8192) != 0 ? bVar2.f71786n : str8);
    }

    /* renamed from: a */
    public final C28279b mo67901a(Boolean bool, Boolean bool2, BigDecimal bigDecimal, String str, String str2, Integer num, String str3, BigDecimal bigDecimal2, String str4, BigDecimal bigDecimal3, String str5, String str6, String str7, String str8) {
        return new C28279b(bool, bool2, bigDecimal, str, str2, num, str3, bigDecimal2, str4, bigDecimal3, str5, str6, str7, str8);
    }

    /* renamed from: c */
    public final BigDecimal mo67902c() {
        return this.f71780h;
    }

    /* renamed from: d */
    public final BigDecimal mo67903d() {
        return this.f71775c;
    }

    /* renamed from: e */
    public final String mo67904e() {
        return this.f71781i;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C28279b)) {
            return false;
        }
        C28279b bVar = (C28279b) obj;
        return C41536l.m120484d(this.f71773a, bVar.f71773a) && C41536l.m120484d(this.f71774b, bVar.f71774b) && C41536l.m120484d(this.f71775c, bVar.f71775c) && C41536l.m120484d(this.f71776d, bVar.f71776d) && C41536l.m120484d(this.f71777e, bVar.f71777e) && C41536l.m120484d(this.f71778f, bVar.f71778f) && C41536l.m120484d(this.f71779g, bVar.f71779g) && C41536l.m120484d(this.f71780h, bVar.f71780h) && C41536l.m120484d(this.f71781i, bVar.f71781i) && C41536l.m120484d(this.f71782j, bVar.f71782j) && C41536l.m120484d(this.f71783k, bVar.f71783k) && C41536l.m120484d(this.f71784l, bVar.f71784l) && C41536l.m120484d(this.f71785m, bVar.f71785m) && C41536l.m120484d(this.f71786n, bVar.f71786n);
    }

    /* renamed from: f */
    public final String mo67906f() {
        return this.f71776d;
    }

    /* renamed from: g */
    public final BigDecimal mo67907g() {
        return this.f71782j;
    }

    /* renamed from: h */
    public final String mo67908h() {
        return this.f71777e;
    }

    public int hashCode() {
        Boolean bool = this.f71773a;
        int i = 0;
        int hashCode = (bool == null ? 0 : bool.hashCode()) * 31;
        Boolean bool2 = this.f71774b;
        int hashCode2 = (hashCode + (bool2 == null ? 0 : bool2.hashCode())) * 31;
        BigDecimal bigDecimal = this.f71775c;
        int hashCode3 = (hashCode2 + (bigDecimal == null ? 0 : bigDecimal.hashCode())) * 31;
        String str = this.f71776d;
        int hashCode4 = (hashCode3 + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.f71777e;
        int hashCode5 = (hashCode4 + (str2 == null ? 0 : str2.hashCode())) * 31;
        Integer num = this.f71778f;
        int hashCode6 = (hashCode5 + (num == null ? 0 : num.hashCode())) * 31;
        String str3 = this.f71779g;
        int hashCode7 = (hashCode6 + (str3 == null ? 0 : str3.hashCode())) * 31;
        BigDecimal bigDecimal2 = this.f71780h;
        int hashCode8 = (hashCode7 + (bigDecimal2 == null ? 0 : bigDecimal2.hashCode())) * 31;
        String str4 = this.f71781i;
        int hashCode9 = (hashCode8 + (str4 == null ? 0 : str4.hashCode())) * 31;
        BigDecimal bigDecimal3 = this.f71782j;
        int hashCode10 = (hashCode9 + (bigDecimal3 == null ? 0 : bigDecimal3.hashCode())) * 31;
        String str5 = this.f71783k;
        int hashCode11 = (hashCode10 + (str5 == null ? 0 : str5.hashCode())) * 31;
        String str6 = this.f71784l;
        int hashCode12 = (hashCode11 + (str6 == null ? 0 : str6.hashCode())) * 31;
        String str7 = this.f71785m;
        int hashCode13 = (hashCode12 + (str7 == null ? 0 : str7.hashCode())) * 31;
        String str8 = this.f71786n;
        if (str8 != null) {
            i = str8.hashCode();
        }
        return hashCode13 + i;
    }

    /* renamed from: i */
    public final String mo67910i() {
        return this.f71779g;
    }

    /* renamed from: j */
    public final String mo67911j() {
        return this.f71783k;
    }

    /* renamed from: k */
    public final Integer mo67912k() {
        return this.f71778f;
    }

    /* renamed from: l */
    public final String mo67913l() {
        return this.f71784l;
    }

    /* renamed from: m */
    public final String mo67914m() {
        return this.f71786n;
    }

    /* renamed from: n */
    public final String mo67915n() {
        return this.f71785m;
    }

    /* renamed from: o */
    public final Boolean mo67916o() {
        return this.f71774b;
    }

    public String toString() {
        Boolean bool = this.f71773a;
        Boolean bool2 = this.f71774b;
        BigDecimal bigDecimal = this.f71775c;
        String str = this.f71776d;
        String str2 = this.f71777e;
        Integer num = this.f71778f;
        String str3 = this.f71779g;
        BigDecimal bigDecimal2 = this.f71780h;
        String str4 = this.f71781i;
        BigDecimal bigDecimal3 = this.f71782j;
        String str5 = this.f71783k;
        String str6 = this.f71784l;
        String str7 = this.f71785m;
        String str8 = this.f71786n;
        return "ReferalUserInfo(isReferralProgramActive=" + bool + ", isActiveClient=" + bool2 + ", bonusAmountForReferring=" + bigDecimal + ", bonusCCYForReferring=" + str + ", earnedPrizeCCYForReferring=" + str2 + ", numberOfReferredClientsActivated=" + num + ", myActivatedPromoCode=" + str3 + ", bonusAmountForActivation=" + bigDecimal2 + ", bonusCCYForActivation=" + str4 + ", earnedPrizeAmountForReferring=" + bigDecimal3 + ", myPromoCodeToRefer=" + str5 + ", promoPageTextForActivation=" + str6 + ", promoPageTextForReferring=" + str7 + ", promoPageTextForActivationAfterFillingCode=" + str8 + ")";
    }
}
