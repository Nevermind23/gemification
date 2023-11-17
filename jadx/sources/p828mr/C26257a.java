package p828mr;

import java.math.BigDecimal;
import java.util.List;
import kotlin.jvm.internal.C41536l;
import p341ge.bog.mobilebank.cleanarch.consumerloandetails.presentation.model.InsuranceProviderUiModel;
import p341ge.bog.mobilebank.model.offers.LoanOfferCard;

/* renamed from: mr.a */
public final class C26257a {

    /* renamed from: a */
    private final LoanOfferCard f66536a;

    /* renamed from: b */
    private final String f66537b;

    /* renamed from: c */
    private final String f66538c;

    /* renamed from: d */
    private final String f66539d;

    /* renamed from: e */
    private final BigDecimal f66540e;

    /* renamed from: f */
    private final boolean f66541f;

    /* renamed from: g */
    private final List f66542g;

    /* renamed from: h */
    private final boolean f66543h;

    /* renamed from: i */
    private final InsuranceProviderUiModel f66544i;

    public C26257a(LoanOfferCard loanOfferCard, String str, String str2, String str3, BigDecimal bigDecimal, boolean z, List list, boolean z2, InsuranceProviderUiModel insuranceProviderUiModel) {
        C41536l.m120489i(loanOfferCard, "card");
        C41536l.m120489i(str, "selectedDate");
        C41536l.m120489i(str2, "insuranceFlag");
        C41536l.m120489i(str3, "loanTerm");
        C41536l.m120489i(bigDecimal, "amount");
        C41536l.m120489i(list, "selectedLiabilities");
        this.f66536a = loanOfferCard;
        this.f66537b = str;
        this.f66538c = str2;
        this.f66539d = str3;
        this.f66540e = bigDecimal;
        this.f66541f = z;
        this.f66542g = list;
        this.f66543h = z2;
        this.f66544i = insuranceProviderUiModel;
    }

    /* renamed from: a */
    public final BigDecimal mo65353a() {
        return this.f66540e;
    }

    /* renamed from: b */
    public final LoanOfferCard mo65354b() {
        return this.f66536a;
    }

    /* renamed from: c */
    public final String mo65355c() {
        return this.f66538c;
    }

    /* renamed from: d */
    public final InsuranceProviderUiModel mo65356d() {
        return this.f66544i;
    }

    /* renamed from: e */
    public final String mo65357e() {
        return this.f66539d;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C26257a)) {
            return false;
        }
        C26257a aVar = (C26257a) obj;
        return C41536l.m120484d(this.f66536a, aVar.f66536a) && C41536l.m120484d(this.f66537b, aVar.f66537b) && C41536l.m120484d(this.f66538c, aVar.f66538c) && C41536l.m120484d(this.f66539d, aVar.f66539d) && C41536l.m120484d(this.f66540e, aVar.f66540e) && this.f66541f == aVar.f66541f && C41536l.m120484d(this.f66542g, aVar.f66542g) && this.f66543h == aVar.f66543h && C41536l.m120484d(this.f66544i, aVar.f66544i);
    }

    /* renamed from: f */
    public final boolean mo65359f() {
        return this.f66543h;
    }

    /* renamed from: g */
    public final boolean mo65360g() {
        return this.f66541f;
    }

    /* renamed from: h */
    public final String mo65361h() {
        return this.f66537b;
    }

    public int hashCode() {
        int hashCode = ((((((((this.f66536a.hashCode() * 31) + this.f66537b.hashCode()) * 31) + this.f66538c.hashCode()) * 31) + this.f66539d.hashCode()) * 31) + this.f66540e.hashCode()) * 31;
        boolean z = this.f66541f;
        boolean z2 = true;
        if (z) {
            z = true;
        }
        int hashCode2 = (((hashCode + (z ? 1 : 0)) * 31) + this.f66542g.hashCode()) * 31;
        boolean z3 = this.f66543h;
        if (!z3) {
            z2 = z3;
        }
        int i = (hashCode2 + (z2 ? 1 : 0)) * 31;
        InsuranceProviderUiModel insuranceProviderUiModel = this.f66544i;
        return i + (insuranceProviderUiModel == null ? 0 : insuranceProviderUiModel.hashCode());
    }

    /* renamed from: i */
    public final List mo65363i() {
        return this.f66542g;
    }

    public String toString() {
        LoanOfferCard loanOfferCard = this.f66536a;
        String str = this.f66537b;
        String str2 = this.f66538c;
        String str3 = this.f66539d;
        BigDecimal bigDecimal = this.f66540e;
        boolean z = this.f66541f;
        List list = this.f66542g;
        boolean z2 = this.f66543h;
        InsuranceProviderUiModel insuranceProviderUiModel = this.f66544i;
        return "ConsumerLoanOptions(card=" + loanOfferCard + ", selectedDate=" + str + ", insuranceFlag=" + str2 + ", loanTerm=" + str3 + ", amount=" + bigDecimal + ", nextButtonClicked=" + z + ", selectedLiabilities=" + list + ", needsRecalculation=" + z2 + ", insuranceProviderUiModel=" + insuranceProviderUiModel + ")";
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public /* synthetic */ C26257a(p341ge.bog.mobilebank.model.offers.LoanOfferCard r13, java.lang.String r14, java.lang.String r15, java.lang.String r16, java.math.BigDecimal r17, boolean r18, java.util.List r19, boolean r20, p341ge.bog.mobilebank.cleanarch.consumerloandetails.presentation.model.InsuranceProviderUiModel r21, int r22, kotlin.jvm.internal.DefaultConstructorMarker r23) {
        /*
            r12 = this;
            r0 = r22
            r1 = r0 & 64
            if (r1 == 0) goto L_0x000c
            java.util.List r1 = ie1.C41341q.m119907j()
            r9 = r1
            goto L_0x000e
        L_0x000c:
            r9 = r19
        L_0x000e:
            r1 = r0 & 128(0x80, float:1.794E-43)
            if (r1 == 0) goto L_0x0015
            r1 = 0
            r10 = r1
            goto L_0x0017
        L_0x0015:
            r10 = r20
        L_0x0017:
            r0 = r0 & 256(0x100, float:3.59E-43)
            if (r0 == 0) goto L_0x001e
            r0 = 0
            r11 = r0
            goto L_0x0020
        L_0x001e:
            r11 = r21
        L_0x0020:
            r2 = r12
            r3 = r13
            r4 = r14
            r5 = r15
            r6 = r16
            r7 = r17
            r8 = r18
            r2.<init>(r3, r4, r5, r6, r7, r8, r9, r10, r11)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p828mr.C26257a.<init>(ge.bog.mobilebank.model.offers.LoanOfferCard, java.lang.String, java.lang.String, java.lang.String, java.math.BigDecimal, boolean, java.util.List, boolean, ge.bog.mobilebank.cleanarch.consumerloandetails.presentation.model.InsuranceProviderUiModel, int, kotlin.jvm.internal.DefaultConstructorMarker):void");
    }
}
