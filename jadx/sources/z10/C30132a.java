package z10;

import java.math.BigDecimal;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.C41536l;
import kotlin.jvm.internal.DefaultConstructorMarker;
import p341ge.bog.mobilebank.cleanarch.domain.offer.model.OfferProductCode;
import p341ge.bog.mobilebank.cleanarch.presentation.creditapplication.model.CreditCardOfferDetailsUiModel;
import p341ge.bog.mobilebank.cleanarch.presentation.creditapplication.model.CreditOfferDecisionUiModel;
import p341ge.bog.mobilebank.cleanarch.presentation.servicecenter.model.ServiceCenterUiModel;
import p366bk.C10328q;
import p913uu.C28942h;

/* renamed from: z10.a */
public final class C30132a {

    /* renamed from: a */
    private final String f75975a;

    /* renamed from: b */
    private final C28942h f75976b;

    /* renamed from: c */
    private final OfferProductCode f75977c;

    /* renamed from: d */
    private CreditOfferDecisionUiModel f75978d;

    /* renamed from: e */
    private ServiceCenterUiModel f75979e;

    /* renamed from: f */
    private List f75980f;

    /* renamed from: z10.a$a */
    public enum C30133a {
        UNDECLARED,
        FULL,
        CALCULATION,
        READ_ONLY
    }

    /* renamed from: z10.a$b */
    public /* synthetic */ class C30134b {

        /* renamed from: a */
        public static final /* synthetic */ int[] f75986a;

        /* JADX WARNING: Can't wrap try/catch for region: R(15:0|1|2|3|4|5|6|7|8|9|10|11|12|13|15) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:11:0x0034 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0010 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x0019 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:7:0x0022 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:9:0x002b */
        static {
            /*
                uu.h[] r0 = p913uu.C28942h.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                uu.h r1 = p913uu.C28942h.NEW_CREDIT_CARD     // Catch:{ NoSuchFieldError -> 0x0010 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0010 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0010 }
            L_0x0010:
                uu.h r1 = p913uu.C28942h.NEW_CREDIT_CARD_WITH_REFINANCE     // Catch:{ NoSuchFieldError -> 0x0019 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0019 }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0019 }
            L_0x0019:
                uu.h r1 = p913uu.C28942h.REPLACE_CREDIT_CARD     // Catch:{ NoSuchFieldError -> 0x0022 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0022 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0022 }
            L_0x0022:
                uu.h r1 = p913uu.C28942h.REPLACE_CREDIT_CARD_WITH_REFINANCE     // Catch:{ NoSuchFieldError -> 0x002b }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x002b }
                r2 = 4
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x002b }
            L_0x002b:
                uu.h r1 = p913uu.C28942h.INCREASE_CREDIT_CARD_LIMIT     // Catch:{ NoSuchFieldError -> 0x0034 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0034 }
                r2 = 5
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0034 }
            L_0x0034:
                uu.h r1 = p913uu.C28942h.INCREASE_CREDIT_CARD_LIMIT_WITH_REFINANCE     // Catch:{ NoSuchFieldError -> 0x003d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x003d }
                r2 = 6
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x003d }
            L_0x003d:
                f75986a = r0
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: z10.C30132a.C30134b.<clinit>():void");
        }
    }

    public C30132a(String str, C28942h hVar, OfferProductCode offerProductCode, CreditOfferDecisionUiModel creditOfferDecisionUiModel, ServiceCenterUiModel serviceCenterUiModel, List list) {
        C41536l.m120489i(str, "offerNo");
        C41536l.m120489i(hVar, "operationType");
        C41536l.m120489i(offerProductCode, "limitCategory");
        C41536l.m120489i(list, "creditCardBenefits");
        this.f75975a = str;
        this.f75976b = hVar;
        this.f75977c = offerProductCode;
        this.f75978d = creditOfferDecisionUiModel;
        this.f75979e = serviceCenterUiModel;
        this.f75980f = list;
    }

    /* renamed from: b */
    public static /* synthetic */ C30132a m91133b(C30132a aVar, String str, C28942h hVar, OfferProductCode offerProductCode, CreditOfferDecisionUiModel creditOfferDecisionUiModel, ServiceCenterUiModel serviceCenterUiModel, List list, int i, Object obj) {
        if ((i & 1) != 0) {
            str = aVar.f75975a;
        }
        if ((i & 2) != 0) {
            hVar = aVar.f75976b;
        }
        C28942h hVar2 = hVar;
        if ((i & 4) != 0) {
            offerProductCode = aVar.f75977c;
        }
        OfferProductCode offerProductCode2 = offerProductCode;
        if ((i & 8) != 0) {
            creditOfferDecisionUiModel = aVar.f75978d;
        }
        CreditOfferDecisionUiModel creditOfferDecisionUiModel2 = creditOfferDecisionUiModel;
        if ((i & 16) != 0) {
            serviceCenterUiModel = aVar.f75979e;
        }
        ServiceCenterUiModel serviceCenterUiModel2 = serviceCenterUiModel;
        if ((i & 32) != 0) {
            list = aVar.f75980f;
        }
        return aVar.mo70435a(str, hVar2, offerProductCode2, creditOfferDecisionUiModel2, serviceCenterUiModel2, list);
    }

    /* renamed from: a */
    public final C30132a mo70435a(String str, C28942h hVar, OfferProductCode offerProductCode, CreditOfferDecisionUiModel creditOfferDecisionUiModel, ServiceCenterUiModel serviceCenterUiModel, List list) {
        C41536l.m120489i(str, "offerNo");
        C41536l.m120489i(hVar, "operationType");
        C41536l.m120489i(offerProductCode, "limitCategory");
        C41536l.m120489i(list, "creditCardBenefits");
        return new C30132a(str, hVar, offerProductCode, creditOfferDecisionUiModel, serviceCenterUiModel, list);
    }

    /* renamed from: c */
    public final C30133a mo70436c() {
        String str;
        String str2;
        CreditCardOfferDetailsUiModel e;
        CreditCardOfferDetailsUiModel e2;
        CreditCardOfferDetailsUiModel e3;
        CreditOfferDecisionUiModel creditOfferDecisionUiModel = this.f75978d;
        String str3 = null;
        if (creditOfferDecisionUiModel == null || (e3 = creditOfferDecisionUiModel.mo54064e()) == null) {
            str = null;
        } else {
            str = e3.mo54041d();
        }
        if (C41536l.m120484d(str, "R")) {
            return C30133a.FULL;
        }
        CreditOfferDecisionUiModel creditOfferDecisionUiModel2 = this.f75978d;
        if (creditOfferDecisionUiModel2 == null || (e2 = creditOfferDecisionUiModel2.mo54064e()) == null) {
            str2 = null;
        } else {
            str2 = e2.mo54041d();
        }
        if (C41536l.m120484d(str2, "C")) {
            return C30133a.CALCULATION;
        }
        CreditOfferDecisionUiModel creditOfferDecisionUiModel3 = this.f75978d;
        if (!(creditOfferDecisionUiModel3 == null || (e = creditOfferDecisionUiModel3.mo54064e()) == null)) {
            str3 = e.mo54041d();
        }
        if (C41536l.m120484d(str3, "V")) {
            return C30133a.READ_ONLY;
        }
        return C30133a.UNDECLARED;
    }

    /* renamed from: d */
    public final List mo70437d() {
        return this.f75980f;
    }

    /* renamed from: e */
    public final OfferProductCode mo70438e() {
        return this.f75977c;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C30132a)) {
            return false;
        }
        C30132a aVar = (C30132a) obj;
        return C41536l.m120484d(this.f75975a, aVar.f75975a) && this.f75976b == aVar.f75976b && C41536l.m120484d(this.f75977c, aVar.f75977c) && C41536l.m120484d(this.f75978d, aVar.f75978d) && C41536l.m120484d(this.f75979e, aVar.f75979e) && C41536l.m120484d(this.f75980f, aVar.f75980f);
    }

    /* renamed from: f */
    public final CreditOfferDecisionUiModel mo70440f() {
        return this.f75978d;
    }

    /* renamed from: g */
    public final String mo70441g() {
        return this.f75975a;
    }

    /* renamed from: h */
    public final C28942h mo70442h() {
        return this.f75976b;
    }

    public int hashCode() {
        int hashCode = ((((this.f75975a.hashCode() * 31) + this.f75976b.hashCode()) * 31) + this.f75977c.hashCode()) * 31;
        CreditOfferDecisionUiModel creditOfferDecisionUiModel = this.f75978d;
        int i = 0;
        int hashCode2 = (hashCode + (creditOfferDecisionUiModel == null ? 0 : creditOfferDecisionUiModel.hashCode())) * 31;
        ServiceCenterUiModel serviceCenterUiModel = this.f75979e;
        if (serviceCenterUiModel != null) {
            i = serviceCenterUiModel.hashCode();
        }
        return ((hashCode2 + i) * 31) + this.f75980f.hashCode();
    }

    /* renamed from: i */
    public final int mo70444i() {
        switch (C30134b.f75986a[this.f75976b.ordinal()]) {
            case 1:
            case 2:
            case 3:
            case 4:
                return C10328q.precontract_order;
            case 5:
            case 6:
                return C10328q.precontract_increase_limit;
            default:
                throw new NoWhenBranchMatchedException();
        }
    }

    /* renamed from: j */
    public final ServiceCenterUiModel mo70445j() {
        return this.f75979e;
    }

    /* renamed from: k */
    public final boolean mo70446k() {
        if (C41536l.m120484d(this.f75977c, OfferProductCode.C21010EC.f56472f) || C41536l.m120484d(this.f75977c, OfferProductCode.C21017LC.f56476f)) {
            return false;
        }
        if (C41341q.m119910m(C28942h.NEW_CREDIT_CARD, C28942h.NEW_CREDIT_CARD_WITH_REFINANCE, C28942h.REPLACE_CREDIT_CARD, C28942h.REPLACE_CREDIT_CARD_WITH_REFINANCE).contains(this.f75976b)) {
            return true;
        }
        return false;
    }

    /* renamed from: l */
    public final boolean mo70447l() {
        return C41341q.m119910m(C28942h.NEW_CREDIT_CARD_WITH_REFINANCE, C28942h.REPLACE_CREDIT_CARD_WITH_REFINANCE, C28942h.INCREASE_CREDIT_CARD_LIMIT_WITH_REFINANCE).contains(this.f75976b);
    }

    /* renamed from: m */
    public final boolean mo70448m(BigDecimal bigDecimal) {
        CreditOfferDecisionUiModel creditOfferDecisionUiModel = this.f75978d;
        if (creditOfferDecisionUiModel == null || bigDecimal == null) {
            return false;
        }
        C41536l.m120486f(creditOfferDecisionUiModel);
        BigDecimal d = creditOfferDecisionUiModel.mo54062d().mo54107d();
        CreditOfferDecisionUiModel creditOfferDecisionUiModel2 = this.f75978d;
        C41536l.m120486f(creditOfferDecisionUiModel2);
        return C43428j.m124583b(d, creditOfferDecisionUiModel2.mo54062d().mo54106b()).mo102099c(bigDecimal);
    }

    public String toString() {
        String str = this.f75975a;
        C28942h hVar = this.f75976b;
        OfferProductCode offerProductCode = this.f75977c;
        CreditOfferDecisionUiModel creditOfferDecisionUiModel = this.f75978d;
        ServiceCenterUiModel serviceCenterUiModel = this.f75979e;
        List list = this.f75980f;
        return "CreditApplication(offerNo=" + str + ", operationType=" + hVar + ", limitCategory=" + offerProductCode + ", offerDecision=" + creditOfferDecisionUiModel + ", serviceCenter=" + serviceCenterUiModel + ", creditCardBenefits=" + list + ")";
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C30132a(String str, C28942h hVar, OfferProductCode offerProductCode, CreditOfferDecisionUiModel creditOfferDecisionUiModel, ServiceCenterUiModel serviceCenterUiModel, List list, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, hVar, offerProductCode, (i & 8) != 0 ? null : creditOfferDecisionUiModel, (i & 16) != 0 ? null : serviceCenterUiModel, (i & 32) != 0 ? C41341q.m119907j() : list);
    }
}
