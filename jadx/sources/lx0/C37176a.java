package lx0;

import java.math.BigDecimal;
import java.util.List;
import kotlin.jvm.internal.C41536l;
import p341ge.bog.mobilebank.payments.data.model.CodeStatus;

/* renamed from: lx0.a */
public final class C37176a {

    /* renamed from: a */
    private final String f89513a;

    /* renamed from: b */
    private final String f89514b;

    /* renamed from: c */
    private final String f89515c;

    /* renamed from: d */
    private final String f89516d;

    /* renamed from: e */
    private final List f89517e;

    /* renamed from: f */
    private final BigDecimal f89518f;

    /* renamed from: g */
    private final C37182g f89519g;

    /* renamed from: h */
    private final BigDecimal f89520h;

    /* renamed from: i */
    private final String f89521i;

    /* renamed from: j */
    private final String f89522j;

    /* renamed from: k */
    private final Integer f89523k;

    /* renamed from: l */
    private final String f89524l;

    /* renamed from: m */
    private final BigDecimal f89525m;

    /* renamed from: n */
    private final Integer f89526n;

    /* renamed from: o */
    private final CodeStatus f89527o;

    /* renamed from: p */
    private final Long f89528p;

    public C37176a(String str, String str2, String str3, String str4, List list, BigDecimal bigDecimal, C37182g gVar, BigDecimal bigDecimal2, String str5, String str6, Integer num, String str7, BigDecimal bigDecimal3, Integer num2, CodeStatus codeStatus, Long l) {
        this.f89513a = str;
        this.f89514b = str2;
        this.f89515c = str3;
        this.f89516d = str4;
        this.f89517e = list;
        this.f89518f = bigDecimal;
        this.f89519g = gVar;
        this.f89520h = bigDecimal2;
        this.f89521i = str5;
        this.f89522j = str6;
        this.f89523k = num;
        this.f89524l = str7;
        this.f89525m = bigDecimal3;
        this.f89526n = num2;
        this.f89527o = codeStatus;
        this.f89528p = l;
    }

    /* renamed from: a */
    public final CodeStatus mo90167a() {
        return this.f89527o;
    }

    /* renamed from: b */
    public final String mo90168b() {
        return this.f89514b;
    }

    /* renamed from: c */
    public final List mo90169c() {
        return this.f89517e;
    }

    /* renamed from: d */
    public final Long mo90170d() {
        return this.f89528p;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C37176a)) {
            return false;
        }
        C37176a aVar = (C37176a) obj;
        return C41536l.m120484d(this.f89513a, aVar.f89513a) && C41536l.m120484d(this.f89514b, aVar.f89514b) && C41536l.m120484d(this.f89515c, aVar.f89515c) && C41536l.m120484d(this.f89516d, aVar.f89516d) && C41536l.m120484d(this.f89517e, aVar.f89517e) && C41536l.m120484d(this.f89518f, aVar.f89518f) && C41536l.m120484d(this.f89519g, aVar.f89519g) && C41536l.m120484d(this.f89520h, aVar.f89520h) && C41536l.m120484d(this.f89521i, aVar.f89521i) && C41536l.m120484d(this.f89522j, aVar.f89522j) && C41536l.m120484d(this.f89523k, aVar.f89523k) && C41536l.m120484d(this.f89524l, aVar.f89524l) && C41536l.m120484d(this.f89525m, aVar.f89525m) && C41536l.m120484d(this.f89526n, aVar.f89526n) && this.f89527o == aVar.f89527o && C41536l.m120484d(this.f89528p, aVar.f89528p);
    }

    public int hashCode() {
        String str = this.f89513a;
        int i = 0;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.f89514b;
        int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.f89515c;
        int hashCode3 = (hashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.f89516d;
        int hashCode4 = (hashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31;
        List list = this.f89517e;
        int hashCode5 = (hashCode4 + (list == null ? 0 : list.hashCode())) * 31;
        BigDecimal bigDecimal = this.f89518f;
        int hashCode6 = (hashCode5 + (bigDecimal == null ? 0 : bigDecimal.hashCode())) * 31;
        C37182g gVar = this.f89519g;
        int hashCode7 = (hashCode6 + (gVar == null ? 0 : gVar.hashCode())) * 31;
        BigDecimal bigDecimal2 = this.f89520h;
        int hashCode8 = (hashCode7 + (bigDecimal2 == null ? 0 : bigDecimal2.hashCode())) * 31;
        String str5 = this.f89521i;
        int hashCode9 = (hashCode8 + (str5 == null ? 0 : str5.hashCode())) * 31;
        String str6 = this.f89522j;
        int hashCode10 = (hashCode9 + (str6 == null ? 0 : str6.hashCode())) * 31;
        Integer num = this.f89523k;
        int hashCode11 = (hashCode10 + (num == null ? 0 : num.hashCode())) * 31;
        String str7 = this.f89524l;
        int hashCode12 = (hashCode11 + (str7 == null ? 0 : str7.hashCode())) * 31;
        BigDecimal bigDecimal3 = this.f89525m;
        int hashCode13 = (hashCode12 + (bigDecimal3 == null ? 0 : bigDecimal3.hashCode())) * 31;
        Integer num2 = this.f89526n;
        int hashCode14 = (hashCode13 + (num2 == null ? 0 : num2.hashCode())) * 31;
        CodeStatus codeStatus = this.f89527o;
        int hashCode15 = (hashCode14 + (codeStatus == null ? 0 : codeStatus.hashCode())) * 31;
        Long l = this.f89528p;
        if (l != null) {
            i = l.hashCode();
        }
        return hashCode15 + i;
    }

    public String toString() {
        String str = this.f89513a;
        String str2 = this.f89514b;
        String str3 = this.f89515c;
        String str4 = this.f89516d;
        List list = this.f89517e;
        BigDecimal bigDecimal = this.f89518f;
        C37182g gVar = this.f89519g;
        BigDecimal bigDecimal2 = this.f89520h;
        String str5 = this.f89521i;
        String str6 = this.f89522j;
        Integer num = this.f89523k;
        String str7 = this.f89524l;
        BigDecimal bigDecimal3 = this.f89525m;
        Integer num2 = this.f89526n;
        CodeStatus codeStatus = this.f89527o;
        Long l = this.f89528p;
        return "ExecuteResult(error=" + str + ", errorDictionaryKey=" + str2 + ", errorDictionaryValue=" + str3 + ", essServiceId=" + str4 + ", essParameters=" + list + ", offloadingPrize=" + bigDecimal + ", campaignPrize=" + gVar + ", addBonusAmount=" + bigDecimal2 + ", offloadingPrizeCcy=" + str5 + ", offloadingContractType=" + str6 + ", bonusSchemeId=" + num + ", offloadingKey=" + str7 + ", paymentCommission=" + bigDecimal3 + ", code=" + num2 + ", codeStatus=" + codeStatus + ", paymentDate=" + l + ")";
    }
}
