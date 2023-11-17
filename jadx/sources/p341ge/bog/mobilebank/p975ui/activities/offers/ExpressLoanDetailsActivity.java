package p341ge.bog.mobilebank.p975ui.activities.offers;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.LinearLayout;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.content.res.C0808h;
import androidx.fragment.app.FragmentManager;
import ba1.C10146d0;
import c81.C31288a;
import c81.C31289b;
import c81.C31290c;
import c81.C31291d;
import c81.C31292e;
import cf1.C40407d;
import e41.C31658b;
import e91.C31696a;
import g91.C32297d;
import g91.C32300e0;
import g91.C32303f;
import g91.C32306g0;
import g91.C32307h;
import g91.C32314k;
import g91.C32343x;
import g91.C32359z0;
import hc1.C41143c;
import hc1.C41185v;
import hd1.C41205b;
import he1.C41217g;
import he1.C41238w;
import iu0.C36546y;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import kotlin.jvm.internal.C41536l;
import kotlin.jvm.internal.C41537m;
import kotlin.jvm.internal.DefaultConstructorMarker;
import o00.C26656a;
import p00.C27113k;
import p341ge.bog.mobilebank.cleanarch.consumerloandetails.data.entity.LimitLoanDecisionEntity;
import p341ge.bog.mobilebank.cleanarch.consumerloandetails.presentation.ConsumerLoanActivationResultActivity;
import p341ge.bog.mobilebank.cleanarch.domain.offer.model.OfferProductCode;
import p341ge.bog.mobilebank.cleanarch.domain.products.model.CardExternalFile;
import p341ge.bog.mobilebank.cleanarch.precontract.data.entity.PreContractEntity;
import p341ge.bog.mobilebank.model.offers.LimitLoanDecisionDetails;
import p341ge.bog.mobilebank.model.offers.LimitLoanRefinanceInfo;
import p341ge.bog.mobilebank.model.offers.LoanOfferCard;
import p341ge.bog.mobilebank.model.offers.Summary;
import p341ge.bog.mobilebank.p975ui.model.offer.ConsumerLoanActivationResult;
import p341ge.bog.mobilebank.p975ui.views.widgets.BigDividerView;
import p341ge.bog.mobilebank.p975ui.views.widgets.BogButton;
import p341ge.bog.mobilebank.p975ui.views.widgets.BogTextView;
import p341ge.bog.mobilebank.p975ui.views.widgets.TextTypeView;
import p341ge.bog.mobilebank.p975ui.wizard.activities.AdvancedWizardActivity;
import p341ge.bog.mobilebank.p975ui.wizard.controllers.offers.OffersWizardPlugin;
import p341ge.bog.mobilebank.p975ui.wizard.model.C35893a;
import p341ge.bog.mobilebank.p975ui.wizard.model.WizardObject;
import p341ge.bog.mobilebank.rest.BankApi;
import p341ge.bog.mobilebank.rest.model.RestCallback;
import p341ge.bog.mobilebank.rest.model.otpparameter.ProcessLoanRegistrationParams;
import p341ge.bog.mobilebank.shared.tmx_profiling.TMXFlags;
import p341ge.bog.mobilebank.shared2.network.BankApiResponse;
import p366bk.C10318g;
import p366bk.C10319h;
import p366bk.C10321j;
import p366bk.C10328q;
import p380ck.C10463g;
import p380ck.C10464h;
import p420fh.C12902d;
import p420fh.C12910e;
import p90.C27294f0;
import pc0.C27494a;
import r90.C27950a;
import ue1.C43064a;

/* renamed from: ge.bog.mobilebank.ui.activities.offers.ExpressLoanDetailsActivity */
public final class ExpressLoanDetailsActivity extends C35464a implements C26656a, C41185v.C41186a {

    /* renamed from: W */
    public static final C35457a f85735W = new C35457a((DefaultConstructorMarker) null);

    /* renamed from: G */
    public C31658b f85736G;

    /* renamed from: H */
    public BankApi f85737H;

    /* renamed from: I */
    public C27494a f85738I;

    /* renamed from: J */
    private final C41217g f85739J = C41219i.m119470b(new C35458b(this));
    /* access modifiers changed from: private */

    /* renamed from: K */
    public LimitLoanDecisionEntity f85740K;
    /* access modifiers changed from: private */

    /* renamed from: L */
    public List f85741L;

    /* renamed from: M */
    private ArrayList f85742M;

    /* renamed from: N */
    private String f85743N;
    /* access modifiers changed from: private */

    /* renamed from: O */
    public String f85744O;
    /* access modifiers changed from: private */

    /* renamed from: P */
    public String f85745P;

    /* renamed from: Q */
    private int f85746Q;
    /* access modifiers changed from: private */

    /* renamed from: R */
    public int f85747R = -1;

    /* renamed from: S */
    private boolean f85748S;
    /* access modifiers changed from: private */

    /* renamed from: T */
    public boolean f85749T;
    /* access modifiers changed from: private */

    /* renamed from: U */
    public boolean f85750U;
    /* access modifiers changed from: private */

    /* renamed from: V */
    public String f85751V;

    /* renamed from: ge.bog.mobilebank.ui.activities.offers.ExpressLoanDetailsActivity$a */
    public static final class C35457a {
        private C35457a() {
        }

        public /* synthetic */ C35457a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* renamed from: a */
        public final void mo86474a(Context context, String str, String str2, String str3, String str4) {
            C41536l.m120489i(context, "context");
            C41536l.m120489i(str, "offerNo");
            C41536l.m120489i(str2, "operationType");
            C41536l.m120489i(str3, "productCode");
            Intent intent = new Intent(context, ExpressLoanDetailsActivity.class);
            intent.putExtra("OFFER_NO", str);
            intent.putExtra("OPERATION_TYPE", str2);
            intent.putExtra("PRODUCT_CODE", str3);
            intent.putExtra("HEADER_TEXT", str4);
            context.startActivity(intent);
        }
    }

    /* renamed from: ge.bog.mobilebank.ui.activities.offers.ExpressLoanDetailsActivity$b */
    static final class C35458b extends C41537m implements C43064a {

        /* renamed from: d */
        final /* synthetic */ ExpressLoanDetailsActivity f85752d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C35458b(ExpressLoanDetailsActivity expressLoanDetailsActivity) {
            super(0);
            this.f85752d = expressLoanDetailsActivity;
        }

        /* renamed from: b */
        public final C27294f0 invoke() {
            return C27294f0.m84477d(this.f85752d.getLayoutInflater());
        }
    }

    /* renamed from: ge.bog.mobilebank.ui.activities.offers.ExpressLoanDetailsActivity$c */
    public static final class C35459c extends RestCallback {

        /* renamed from: a */
        final /* synthetic */ ExpressLoanDetailsActivity f85753a;

        C35459c(ExpressLoanDetailsActivity expressLoanDetailsActivity) {
            this.f85753a = expressLoanDetailsActivity;
        }

        public void onEnqueue(C41205b bVar) {
            C41536l.m120489i(bVar, "disposable");
            this.f85753a.mo86438k1(bVar);
        }

        public void onFailure(Throwable th) {
            super.onFailure(th);
            this.f85753a.f85749T = true;
            C32297d.m95153a(this.f85753a);
            this.f85753a.m105248E3();
        }

        public void onResponse(BankApiResponse bankApiResponse) {
            C41536l.m120489i(bankApiResponse, "response");
            super.onResponse(bankApiResponse);
            this.f85753a.mo86425J1();
            LimitLoanDecisionEntity limitLoanDecisionEntity = null;
            if (bankApiResponse.isSuccess()) {
                Object result = bankApiResponse.getResult();
                if (result != null) {
                    LimitLoanDecisionDetails details = ((LimitLoanDecisionEntity) result).getDetails();
                    ExpressLoanDetailsActivity expressLoanDetailsActivity = this.f85753a;
                    expressLoanDetailsActivity.m105262L3(details);
                    expressLoanDetailsActivity.m105282f3().f68683p.setValueText(C32303f.m95203n(details.comisAmount, details.loanCcy));
                    LimitLoanDecisionEntity M2 = expressLoanDetailsActivity.f85740K;
                    if (M2 == null) {
                        C41536l.m120506z("limitLoanDecision");
                    } else {
                        limitLoanDecisionEntity = M2;
                    }
                    if (limitLoanDecisionEntity.getRefinanceInfo() != null) {
                        expressLoanDetailsActivity.m105282f3().f68672e.setVisibility(0);
                        expressLoanDetailsActivity.m105282f3().f68673f.setVisibility(8);
                        expressLoanDetailsActivity.m105282f3().f68672e.setValueText(C32303f.m95203n(details.keepAmount, details.loanCcy));
                    } else {
                        expressLoanDetailsActivity.m105282f3().f68672e.setVisibility(8);
                        expressLoanDetailsActivity.m105282f3().f68673f.setVisibility(0);
                        expressLoanDetailsActivity.m105282f3().f68673f.setValueText(C32303f.m95203n(details.keepAmount, details.loanCcy));
                    }
                    TextTypeView textTypeView = expressLoanDetailsActivity.m105282f3().f68684q;
                    int i = details.loanTerm;
                    String string = expressLoanDetailsActivity.getString(C10328q.f28967t7);
                    textTypeView.setValueText(i + " " + string);
                    this.f85753a.f85749T = false;
                    this.f85753a.m105260K3();
                    return;
                }
                throw new IllegalArgumentException("BankApiResponse<LimitLoanDecisionEntity>.result shouldn't be null".toString());
            }
            this.f85753a.f85749T = true;
            C32297d.m95154b(this.f85753a, C27950a.m86287d(bankApiResponse.getKey(), false, 2, (Object) null));
            this.f85753a.m105248E3();
        }
    }

    /* renamed from: ge.bog.mobilebank.ui.activities.offers.ExpressLoanDetailsActivity$d */
    public static final class C35460d extends RestCallback {

        /* renamed from: a */
        final /* synthetic */ ExpressLoanDetailsActivity f85754a;

        C35460d(ExpressLoanDetailsActivity expressLoanDetailsActivity) {
            this.f85754a = expressLoanDetailsActivity;
        }

        public void onEnqueue(C41205b bVar) {
            C41536l.m120489i(bVar, "disposable");
            this.f85754a.mo86438k1(bVar);
        }

        public void onFailure(Throwable th) {
            super.onFailure(th);
            ExpressLoanDetailsActivity.m105254H3(this.f85754a, (String) null, 1, (Object) null);
        }

        public void onResponse(BankApiResponse bankApiResponse) {
            C41536l.m120489i(bankApiResponse, "response");
            super.onResponse(bankApiResponse);
            this.f85754a.mo86425J1();
            if (bankApiResponse.isSuccess()) {
                Object result = bankApiResponse.getResult();
                if (result != null) {
                    this.f85754a.f85741L = (List) result;
                    this.f85754a.m105296w3();
                    return;
                }
                throw new IllegalArgumentException("BankApiResponse<List<LoanOfferCard>>.result shouldn't be null".toString());
            }
            this.f85754a.m105252G3(C27950a.m86287d(bankApiResponse.getKey(), false, 2, (Object) null));
        }
    }

    /* renamed from: ge.bog.mobilebank.ui.activities.offers.ExpressLoanDetailsActivity$e */
    public static final class C35461e extends RestCallback {

        /* renamed from: a */
        final /* synthetic */ ExpressLoanDetailsActivity f85755a;

        C35461e(ExpressLoanDetailsActivity expressLoanDetailsActivity) {
            this.f85755a = expressLoanDetailsActivity;
        }

        public void onEnqueue(C41205b bVar) {
            C41536l.m120489i(bVar, "disposable");
            this.f85755a.mo86438k1(bVar);
        }

        public void onFailure(Throwable th) {
            super.onFailure(th);
            ExpressLoanDetailsActivity.m105254H3(this.f85755a, (String) null, 1, (Object) null);
        }

        public void onResponse(BankApiResponse bankApiResponse) {
            C41536l.m120489i(bankApiResponse, "response");
            super.onResponse(bankApiResponse);
            LimitLoanDecisionEntity limitLoanDecisionEntity = null;
            if (bankApiResponse.isSuccess()) {
                Object result = bankApiResponse.getResult();
                if (result != null) {
                    this.f85755a.f85740K = (LimitLoanDecisionEntity) result;
                    ExpressLoanDetailsActivity expressLoanDetailsActivity = this.f85755a;
                    LimitLoanDecisionEntity M2 = expressLoanDetailsActivity.f85740K;
                    if (M2 == null) {
                        C41536l.m120506z("limitLoanDecision");
                        M2 = null;
                    }
                    expressLoanDetailsActivity.f85750U = M2.isCrifLoan();
                    ExpressLoanDetailsActivity expressLoanDetailsActivity2 = this.f85755a;
                    LimitLoanDecisionEntity M22 = expressLoanDetailsActivity2.f85740K;
                    if (M22 == null) {
                        C41536l.m120506z("limitLoanDecision");
                    } else {
                        limitLoanDecisionEntity = M22;
                    }
                    String str = limitLoanDecisionEntity.getDetails().loanCcy;
                    C41536l.m120488h(str, "limitLoanDecision.details.loanCcy");
                    expressLoanDetailsActivity2.m105283g3(str);
                    return;
                }
                throw new IllegalArgumentException("BankApiResponse<LimitLoanDecisionEntity>.result shouldn't be null".toString());
            }
            this.f85755a.m105252G3(C27950a.m86287d(bankApiResponse.getKey(), false, 2, (Object) null));
        }
    }

    /* renamed from: ge.bog.mobilebank.ui.activities.offers.ExpressLoanDetailsActivity$f */
    public static final class C35462f extends RestCallback {

        /* renamed from: a */
        final /* synthetic */ ExpressLoanDetailsActivity f85756a;

        /* renamed from: b */
        final /* synthetic */ LimitLoanDecisionDetails f85757b;

        C35462f(ExpressLoanDetailsActivity expressLoanDetailsActivity, LimitLoanDecisionDetails limitLoanDecisionDetails) {
            this.f85756a = expressLoanDetailsActivity;
            this.f85757b = limitLoanDecisionDetails;
        }

        public void onEnqueue(C41205b bVar) {
            C41536l.m120489i(bVar, "disposable");
            this.f85756a.mo86438k1(bVar);
        }

        public void onFailure(Throwable th) {
            super.onFailure(th);
            this.f85756a.mo86425J1();
            C32297d.m95153a(this.f85756a);
        }

        public void onResponse(BankApiResponse bankApiResponse) {
            this.f85756a.mo86425J1();
            C41536l.m120486f(bankApiResponse);
            if (bankApiResponse.isSuccess()) {
                Object result = bankApiResponse.getResult();
                if (result != null) {
                    PreContractEntity preContractEntity = (PreContractEntity) result;
                    this.f85756a.f85751V = preContractEntity.getContractTemplate();
                    C10463g F = C36546y.m108282F();
                    String Q2 = this.f85756a.f85745P;
                    if (Q2 == null) {
                        C41536l.m120506z("productCode");
                        Q2 = null;
                    }
                    F.mo27152s("offers", Q2 + "_" + this.f85757b.operationType, "open_offer_precontract");
                    C27113k.C27114a aVar = C27113k.f68083P;
                    String contractTemplate = preContractEntity.getContractTemplate();
                    int i = C10328q.precontract_activate_loan;
                    String h0 = C32343x.m95452h0(i, new Object[0]);
                    String string = this.f85756a.getString(i);
                    C41536l.m120488h(string, "getString(R.string.precontract_activate_loan)");
                    C27113k c = C27113k.C27114a.m84066c(aVar, contractTemplate, true, h0, (ArrayList) null, (Summary) null, string, 24, (Object) null);
                    FragmentManager supportFragmentManager = this.f85756a.getSupportFragmentManager();
                    C41536l.m120488h(supportFragmentManager, "supportFragmentManager");
                    c.mo4576A1(supportFragmentManager, (String) null);
                    return;
                }
                throw new IllegalArgumentException("BankApiResponse<PreContractEntity>.result shouldn't be null".toString());
            }
            C32297d.m95154b(this.f85756a, C27950a.m86287d(bankApiResponse.getKey(), false, 2, (Object) null));
        }
    }

    /* renamed from: ge.bog.mobilebank.ui.activities.offers.ExpressLoanDetailsActivity$g */
    public static final class C35463g extends RestCallback {

        /* renamed from: a */
        final /* synthetic */ ExpressLoanDetailsActivity f85758a;

        C35463g(ExpressLoanDetailsActivity expressLoanDetailsActivity) {
            this.f85758a = expressLoanDetailsActivity;
        }

        public void onEnqueue(C41205b bVar) {
            C41536l.m120489i(bVar, "disposable");
            this.f85758a.mo86438k1(bVar);
        }

        public void onFailure(Throwable th) {
            super.onFailure(th);
            this.f85758a.mo86425J1();
            C41185v R2 = this.f85758a.m105290p3();
            if (R2 != null) {
                R2.mo4577k1();
            }
            C27113k P2 = this.f85758a.m105288n3();
            if (P2 != null) {
                P2.mo4577k1();
            }
            C12910e.m48790h(this.f85758a, C32343x.m95452h0(C10328q.f28940T1, new Object[0]), (C12902d.C12905b) null, false, 6, (Object) null);
        }

        public void onResponse(BankApiResponse bankApiResponse) {
            super.onResponse(bankApiResponse);
            this.f85758a.mo86425J1();
            C41185v R2 = this.f85758a.m105290p3();
            if (R2 != null) {
                R2.mo95635L2(false);
            }
            C41536l.m120486f(bankApiResponse);
            if (bankApiResponse.isSuccess()) {
                String Q2 = this.f85758a.f85745P;
                List list = null;
                if (Q2 == null) {
                    C41536l.m120506z("productCode");
                    Q2 = null;
                }
                C32306g0.m95221b("express_loan_activated", Q2);
                C36546y.m108282F().mo27137H("activate_express_loan_offer", "", "", (Bundle) null, C10464h.C10465a.FACEBOOKANDFIREBASE);
                C10463g F = C36546y.m108282F();
                String Q22 = this.f85758a.f85745P;
                if (Q22 == null) {
                    C41536l.m120506z("productCode");
                    Q22 = null;
                }
                String O2 = this.f85758a.f85744O;
                if (O2 == null) {
                    C41536l.m120506z("operationType");
                    O2 = null;
                }
                F.mo27152s("offers", Q22 + "_" + O2, "activate_offer");
                String O22 = this.f85758a.f85744O;
                if (O22 == null) {
                    C41536l.m120506z("operationType");
                    O22 = null;
                }
                if (C41536l.m120484d(O22, "P")) {
                    LimitLoanDecisionEntity M2 = this.f85758a.f85740K;
                    if (M2 == null) {
                        C41536l.m120506z("limitLoanDecision");
                        M2 = null;
                    }
                    M2.getDetails().rfncAmount = null;
                    LimitLoanDecisionEntity M22 = this.f85758a.f85740K;
                    if (M22 == null) {
                        C41536l.m120506z("limitLoanDecision");
                        M22 = null;
                    }
                    M22.getDetails().keepAmount = null;
                }
                this.f85758a.finish();
                ConsumerLoanActivationResult.C35694a aVar = ConsumerLoanActivationResult.f86289r;
                LimitLoanDecisionEntity M23 = this.f85758a.f85740K;
                if (M23 == null) {
                    C41536l.m120506z("limitLoanDecision");
                    M23 = null;
                }
                LimitLoanDecisionDetails details = M23.getDetails();
                List N2 = this.f85758a.f85741L;
                if (N2 == null) {
                    C41536l.m120506z("loanOfferCards");
                } else {
                    list = N2;
                }
                ConsumerLoanActivationResultActivity.f56181I.mo49764a(this.f85758a, ConsumerLoanActivationResult.C35694a.m106002b(aVar, details, (LoanOfferCard) list.get(this.f85758a.f85747R), (OfferProductCode) null, (Boolean) null, (Boolean) null, (String) null, 60, (Object) null), true);
            } else if (bankApiResponse.isScaError()) {
                C41185v R22 = this.f85758a.m105290p3();
                if (R22 != null) {
                    R22.mo95634K2(C32343x.m95388F(bankApiResponse.getKey(), new Object[0]));
                }
            } else {
                C41185v R23 = this.f85758a.m105290p3();
                if (R23 != null) {
                    R23.mo4577k1();
                }
                C27113k P2 = this.f85758a.m105288n3();
                if (P2 != null) {
                    P2.mo4577k1();
                }
                C12910e.m48790h(this.f85758a, C32343x.m95388F(bankApiResponse.getKey(), new Object[0]), (C12902d.C12905b) null, false, 6, (Object) null);
            }
        }
    }

    /* renamed from: A3 */
    private final boolean m105243A3() {
        if (this.f85750U) {
            if (this.f85747R != -1) {
                return true;
            }
        } else if (!(this.f85746Q == -1 || this.f85747R == -1)) {
            return true;
        }
        return false;
    }

    /* access modifiers changed from: private */
    /* renamed from: B3 */
    public static final void m105244B3(ExpressLoanDetailsActivity expressLoanDetailsActivity, View view) {
        C41536l.m120489i(expressLoanDetailsActivity, "this$0");
        if (expressLoanDetailsActivity.m105243A3() && !expressLoanDetailsActivity.f85749T) {
            expressLoanDetailsActivity.m105289o3();
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: C3 */
    public static final void m105245C3(ExpressLoanDetailsActivity expressLoanDetailsActivity, View view) {
        C41536l.m120489i(expressLoanDetailsActivity, "this$0");
        expressLoanDetailsActivity.m105282f3().f68688u.setVisibility(8);
        expressLoanDetailsActivity.m105256I3();
    }

    /* renamed from: D3 */
    private final void m105246D3(String str, String str2, String str3) {
        mo86441o2();
        C41185v p3 = m105290p3();
        if (p3 != null) {
            p3.mo95635L2(true);
        }
        mo86471k3().processLoanRegistrion(mo86472m3().mo66809a(m105291q3(str, str2, str3)), new C35463g(this));
    }

    /* access modifiers changed from: private */
    /* renamed from: E3 */
    public final void m105248E3() {
        TextTypeView textTypeView = m105282f3().f68683p;
        C41536l.m120488h(textTypeView, "binding.loanDisbursementFeeField");
        C32343x.m95425X0(textTypeView);
        TextTypeView textTypeView2 = m105282f3().f68672e;
        C41536l.m120488h(textTypeView2, "binding.amountAfterCommissionAndRepaymentField");
        C32343x.m95425X0(textTypeView2);
        TextTypeView textTypeView3 = m105282f3().f68673f;
        C41536l.m120488h(textTypeView3, "binding.amountAfterCommissionField");
        C32343x.m95425X0(textTypeView3);
        TextTypeView textTypeView4 = m105282f3().f68684q;
        C41536l.m120488h(textTypeView4, "binding.loanTermField");
        C32343x.m95425X0(textTypeView4);
        m105260K3();
    }

    /* renamed from: F3 */
    private final void m105250F3(List list) {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Object next : list) {
            String productSource = ((LimitLoanRefinanceInfo) next).getProductSource();
            Object obj = linkedHashMap.get(productSource);
            if (obj == null) {
                obj = new ArrayList();
                linkedHashMap.put(productSource, obj);
            }
            ((List) obj).add(next);
        }
        List list2 = (List) linkedHashMap.get("BOG");
        if (list2 != null) {
            String string = getString(C10328q.liabilities_in_bog);
            C41536l.m120488h(string, "getString(R.string.liabilities_in_bog)");
            m105281e3(string, list2);
        }
        List list3 = (List) linkedHashMap.get("CRI");
        if (list3 != null) {
            String string2 = getString(C10328q.liabilities_in_other_banks);
            C41536l.m120488h(string2, "getString(R.string.liabilities_in_other_banks)");
            m105281e3(string2, list3);
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: G3 */
    public final void m105252G3(String str) {
        mo86425J1();
        m105282f3().f68688u.setVisibility(0);
        if (str != null) {
            C32297d.m95154b(this, str);
        } else {
            C32297d.m95153a(this);
        }
    }

    /* renamed from: H3 */
    static /* synthetic */ void m105254H3(ExpressLoanDetailsActivity expressLoanDetailsActivity, String str, int i, Object obj) {
        if ((i & 1) != 0) {
            str = null;
        }
        expressLoanDetailsActivity.m105252G3(str);
    }

    /* renamed from: I3 */
    private final void m105256I3() {
        mo86441o2();
        mo86438k1(mo86473s3().mo72084b(TMXFlags.TMX_FLAG_LOAN_ACTIVATE_KEY));
        m105286j3();
    }

    /* renamed from: J3 */
    private final void m105258J3(View view, int i) {
        C35893a.m106783a(this).mo88140g(m105295v3()).mo88137d(AdvancedWizardActivity.class).mo88139f(new OffersWizardPlugin()).mo88141h(i).mo88136c(view).mo88142i();
    }

    /* access modifiers changed from: private */
    /* renamed from: K3 */
    public final void m105260K3() {
        if (!m105243A3() || this.f85749T) {
            m105282f3().f68685r.setOrange(false, false);
        } else {
            m105282f3().f68685r.setOrange(true, true);
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: L3 */
    public final void m105262L3(LimitLoanDecisionDetails limitLoanDecisionDetails) {
        LimitLoanDecisionEntity limitLoanDecisionEntity = this.f85740K;
        LimitLoanDecisionEntity limitLoanDecisionEntity2 = null;
        if (limitLoanDecisionEntity == null) {
            C41536l.m120506z("limitLoanDecision");
            limitLoanDecisionEntity = null;
        }
        limitLoanDecisionEntity.getDetails().keepAmount = limitLoanDecisionDetails.keepAmount;
        LimitLoanDecisionEntity limitLoanDecisionEntity3 = this.f85740K;
        if (limitLoanDecisionEntity3 == null) {
            C41536l.m120506z("limitLoanDecision");
            limitLoanDecisionEntity3 = null;
        }
        limitLoanDecisionEntity3.getDetails().comisAmount = limitLoanDecisionDetails.comisAmount;
        LimitLoanDecisionEntity limitLoanDecisionEntity4 = this.f85740K;
        if (limitLoanDecisionEntity4 == null) {
            C41536l.m120506z("limitLoanDecision");
            limitLoanDecisionEntity4 = null;
        }
        limitLoanDecisionEntity4.getDetails().loanTerm = limitLoanDecisionDetails.loanTerm;
        LimitLoanDecisionEntity limitLoanDecisionEntity5 = this.f85740K;
        if (limitLoanDecisionEntity5 == null) {
            C41536l.m120506z("limitLoanDecision");
            limitLoanDecisionEntity5 = null;
        }
        limitLoanDecisionEntity5.getDetails().loanAmount = limitLoanDecisionDetails.loanAmount;
        LimitLoanDecisionEntity limitLoanDecisionEntity6 = this.f85740K;
        if (limitLoanDecisionEntity6 == null) {
            C41536l.m120506z("limitLoanDecision");
        } else {
            limitLoanDecisionEntity2 = limitLoanDecisionEntity6;
        }
        limitLoanDecisionEntity2.getDetails().payDay = limitLoanDecisionDetails.payDay;
    }

    /* renamed from: d3 */
    private final void m105280d3() {
        BigDecimal bigDecimal;
        mo86441o2();
        LimitLoanDecisionEntity limitLoanDecisionEntity = this.f85740K;
        ArrayList arrayList = null;
        if (limitLoanDecisionEntity == null) {
            C41536l.m120506z("limitLoanDecision");
            limitLoanDecisionEntity = null;
        }
        LimitLoanDecisionDetails details = limitLoanDecisionEntity.getDetails();
        BankApi k3 = mo86471k3();
        long j = details.decisionNo;
        String str = details.decisionScheme;
        List list = this.f85741L;
        if (list == null) {
            C41536l.m120506z("loanOfferCards");
            list = null;
        }
        String pan2 = ((LoanOfferCard) list.get(this.f85747R)).getPan2();
        String str2 = details.operationType;
        String str3 = details.loanCcy;
        String valueOf = String.valueOf(details.loanTerm);
        String valueOf2 = String.valueOf(details.payDay);
        String str4 = details.insIncFlag;
        LimitLoanDecisionEntity limitLoanDecisionEntity2 = this.f85740K;
        if (limitLoanDecisionEntity2 == null) {
            C41536l.m120506z("limitLoanDecision");
            limitLoanDecisionEntity2 = null;
        }
        List<LimitLoanRefinanceInfo> refinanceInfo = limitLoanDecisionEntity2.getRefinanceInfo();
        if (this.f85750U) {
            bigDecimal = details.loanAmount;
        } else {
            ArrayList arrayList2 = this.f85742M;
            if (arrayList2 == null) {
                C41536l.m120506z("loanAmountsPreviews");
            } else {
                arrayList = arrayList2;
            }
            bigDecimal = (BigDecimal) arrayList.get(this.f85746Q);
        }
        k3.checkLimitLoanDecision(j, str, pan2, str2, str3, valueOf, valueOf2, str4, refinanceInfo, bigDecimal, (BigDecimal) null, "123", new C35459c(this));
    }

    /* renamed from: e3 */
    private final void m105281e3(String str, List list) {
        BogTextView t3 = m105293t3(C10318g.dark_text_color, true);
        t3.setText(str);
        m105282f3().f68680m.addView(t3);
        Iterator it = list.iterator();
        while (it.hasNext()) {
            LimitLoanRefinanceInfo limitLoanRefinanceInfo = (LimitLoanRefinanceInfo) it.next();
            BogTextView u3 = m105294u3(this, C10318g.bog_default_text_color, false, 2, (Object) null);
            String productName = limitLoanRefinanceInfo.getProductName();
            String n = C32303f.m95203n(new BigDecimal(String.valueOf(limitLoanRefinanceInfo.getProductAmount())), limitLoanRefinanceInfo.getProductCcy());
            u3.setText(productName + ": " + n);
            m105282f3().f68680m.addView(u3);
        }
        m105282f3().f68680m.addView(m105285i3());
    }

    /* access modifiers changed from: private */
    /* renamed from: f3 */
    public final C27294f0 m105282f3() {
        return (C27294f0) this.f85739J.getValue();
    }

    /* access modifiers changed from: private */
    /* renamed from: g3 */
    public final void m105283g3(String str) {
        mo86471k3().getCardsForLoanOffer(str, new C35460d(this));
    }

    /* renamed from: h3 */
    private final String m105284h3() {
        LimitLoanDecisionEntity limitLoanDecisionEntity = this.f85740K;
        if (limitLoanDecisionEntity == null) {
            C41536l.m120506z("limitLoanDecision");
            limitLoanDecisionEntity = null;
        }
        return C32314k.m95245a(limitLoanDecisionEntity.getDetails().loanCcy);
    }

    /* renamed from: i3 */
    private final View m105285i3() {
        BigDividerView bigDividerView = new BigDividerView(this);
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-2, C32343x.m95392H(1.5f));
        layoutParams.setMargins(0, C32343x.m95394I(16), 0, 0);
        bigDividerView.setLayoutParams(layoutParams);
        return bigDividerView;
    }

    /* renamed from: j3 */
    private final void m105286j3() {
        BankApi k3 = mo86471k3();
        String str = this.f85743N;
        String str2 = null;
        if (str == null) {
            C41536l.m120506z("offerNo");
            str = null;
        }
        String str3 = this.f85744O;
        if (str3 == null) {
            C41536l.m120506z("operationType");
        } else {
            str2 = str3;
        }
        k3.getLimitLoanDecision(str, str2, "123", new C35461e(this));
    }

    /* renamed from: l3 */
    private final String m105287l3(String str) {
        return "**** " + str;
    }

    /* access modifiers changed from: private */
    /* renamed from: n3 */
    public final C27113k m105288n3() {
        FragmentManager supportFragmentManager = getSupportFragmentManager();
        C41536l.m120488h(supportFragmentManager, "supportFragmentManager");
        return C32343x.m95443e0(supportFragmentManager, (String) null, 1, (Object) null);
    }

    /* renamed from: o3 */
    private final void m105289o3() {
        String str;
        mo86441o2();
        LimitLoanDecisionEntity limitLoanDecisionEntity = this.f85740K;
        if (limitLoanDecisionEntity == null) {
            C41536l.m120506z("limitLoanDecision");
            limitLoanDecisionEntity = null;
        }
        LimitLoanDecisionDetails details = limitLoanDecisionEntity.getDetails();
        BankApi k3 = mo86471k3();
        String valueOf = String.valueOf(details.decisionNo);
        String str2 = details.decisionScheme;
        List list = this.f85741L;
        if (list == null) {
            C41536l.m120506z("loanOfferCards");
            list = null;
        }
        String pan2 = ((LoanOfferCard) list.get(this.f85747R)).getPan2();
        String str3 = details.operationType;
        String str4 = details.loanCcy;
        String valueOf2 = String.valueOf(details.loanTerm);
        String valueOf3 = String.valueOf(details.payDay);
        String str5 = details.insIncFlag;
        LimitLoanDecisionEntity limitLoanDecisionEntity2 = this.f85740K;
        if (limitLoanDecisionEntity2 == null) {
            C41536l.m120506z("limitLoanDecision");
            limitLoanDecisionEntity2 = null;
        }
        List<LimitLoanRefinanceInfo> refinanceInfo = limitLoanDecisionEntity2.getRefinanceInfo();
        BigDecimal bigDecimal = details.loanAmount;
        String str6 = this.f85745P;
        if (str6 == null) {
            C41536l.m120506z("productCode");
            str = null;
        } else {
            str = str6;
        }
        k3.getLndOfferPreContractTemplate("123123", valueOf, str2, pan2, str3, str4, valueOf2, valueOf3, str5, refinanceInfo, bigDecimal, "LND_OFFER_CONSUMER", str, new C35462f(this, details));
    }

    /* access modifiers changed from: private */
    /* renamed from: p3 */
    public final C41185v m105290p3() {
        FragmentManager supportFragmentManager = getSupportFragmentManager();
        C41536l.m120488h(supportFragmentManager, "supportFragmentManager");
        return C32343x.m95449g0(supportFragmentManager, (String) null, 1, (Object) null);
    }

    /* renamed from: q3 */
    private final ProcessLoanRegistrationParams m105291q3(String str, String str2, String str3) {
        String str4;
        String str5 = this.f85743N;
        byte[] bArr = null;
        if (str5 == null) {
            C41536l.m120506z("offerNo");
            str4 = null;
        } else {
            str4 = str5;
        }
        LimitLoanDecisionEntity limitLoanDecisionEntity = this.f85740K;
        if (limitLoanDecisionEntity == null) {
            C41536l.m120506z("limitLoanDecision");
            limitLoanDecisionEntity = null;
        }
        String valueOf = String.valueOf(limitLoanDecisionEntity.getDetails().decisionNo);
        LimitLoanDecisionEntity limitLoanDecisionEntity2 = this.f85740K;
        if (limitLoanDecisionEntity2 == null) {
            C41536l.m120506z("limitLoanDecision");
            limitLoanDecisionEntity2 = null;
        }
        String str6 = limitLoanDecisionEntity2.getDetails().decisionScheme;
        C41536l.m120488h(str6, "limitLoanDecision.details.decisionScheme");
        List list = this.f85741L;
        if (list == null) {
            C41536l.m120506z("loanOfferCards");
            list = null;
        }
        String pan2 = ((LoanOfferCard) list.get(this.f85747R)).getPan2();
        String a = C10146d0.C10177h.m37232a();
        String str7 = this.f85751V;
        if (str7 != null) {
            bArr = str7.getBytes(C40407d.f95989b);
            C41536l.m120488h(bArr, "this as java.lang.String).getBytes(charset)");
        }
        return new ProcessLoanRegistrationParams(str4, valueOf, str6, "", pan2, "123123", (String) null, a, C32359z0.m95597y(bArr), BankApi.OFFERS_PROCESS_LOAN_REGISTRATION, str, str2, str3);
    }

    /* renamed from: r3 */
    static /* synthetic */ ProcessLoanRegistrationParams m105292r3(ExpressLoanDetailsActivity expressLoanDetailsActivity, String str, String str2, String str3, int i, Object obj) {
        if ((i & 1) != 0) {
            str = null;
        }
        if ((i & 2) != 0) {
            str2 = null;
        }
        if ((i & 4) != 0) {
            str3 = null;
        }
        return expressLoanDetailsActivity.m105291q3(str, str2, str3);
    }

    /* renamed from: t3 */
    private final BogTextView m105293t3(int i, boolean z) {
        BogTextView bogTextView = new BogTextView(this);
        bogTextView.setTextColor(C32343x.m95418U(i, this));
        bogTextView.setTextSize(2, 9.0f);
        bogTextView.setTypeface(C0808h.m3033h(this, C10321j.f28707e));
        if (z) {
            LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-2, -2);
            layoutParams.setMargins(0, C32343x.m95394I(11), 0, 0);
            bogTextView.setLayoutParams(layoutParams);
        }
        return bogTextView;
    }

    /* renamed from: u3 */
    static /* synthetic */ BogTextView m105294u3(ExpressLoanDetailsActivity expressLoanDetailsActivity, int i, boolean z, int i2, Object obj) {
        if ((i2 & 2) != 0) {
            z = false;
        }
        return expressLoanDetailsActivity.m105293t3(i, z);
    }

    /* renamed from: v3 */
    private final ArrayList m105295v3() {
        ArrayList arrayList = new ArrayList();
        List<LoanOfferCard> list = null;
        if (!this.f85750U) {
            WizardObject inputTitle = new WizardObject().setInputStyle(0).setInputTitle(getString(C10328q.loan_amount));
            ArrayList<BigDecimal> arrayList2 = this.f85742M;
            if (arrayList2 == null) {
                C41536l.m120506z("loanAmountsPreviews");
                arrayList2 = null;
            }
            ArrayList arrayList3 = new ArrayList(C41343r.m119925u(arrayList2, 10));
            for (BigDecimal n : arrayList2) {
                arrayList3.add(C32303f.m95203n(n, m105284h3()));
            }
            arrayList.add(inputTitle.setSelectorOptionPreviews(arrayList3).setId("LOAN_AMOUNT_WIZARD_FIELD_ID").setValue(String.valueOf(this.f85746Q)));
        }
        WizardObject value = new WizardObject().setInputStyle(4).setInputTitle(getString(C10328q.choose_card_to_activate_loan)).setId("LOAN_CARD_WIZARD_FIELD_ID").setValue(String.valueOf(this.f85747R));
        List list2 = this.f85741L;
        if (list2 == null) {
            C41536l.m120506z("loanOfferCards");
        } else {
            list = list2;
        }
        ArrayList arrayList4 = new ArrayList(C41343r.m119925u(list, 10));
        for (LoanOfferCard a : list) {
            arrayList4.add(C31696a.m93838a(a));
        }
        value.setCustomSelectorValues(new ArrayList(arrayList4));
        arrayList.add(value);
        return arrayList;
    }

    /* access modifiers changed from: private */
    /* renamed from: w3 */
    public final void m105296w3() {
        LimitLoanDecisionEntity limitLoanDecisionEntity = this.f85740K;
        LimitLoanDecisionEntity limitLoanDecisionEntity2 = null;
        if (limitLoanDecisionEntity == null) {
            C41536l.m120506z("limitLoanDecision");
            limitLoanDecisionEntity = null;
        }
        String str = limitLoanDecisionEntity.getDetails().accessType;
        C41536l.m120488h(str, "limitLoanDecision.details.accessType");
        ConstraintLayout constraintLayout = m105282f3().f68689v;
        C41536l.m120488h(constraintLayout, "binding.root");
        BogButton bogButton = m105282f3().f68685r;
        C41536l.m120488h(bogButton, "binding.orderBtn");
        C32300e0.m95171i(this, str, constraintLayout, bogButton);
        LimitLoanDecisionEntity limitLoanDecisionEntity3 = this.f85740K;
        if (limitLoanDecisionEntity3 == null) {
            C41536l.m120506z("limitLoanDecision");
            limitLoanDecisionEntity3 = null;
        }
        LimitLoanDecisionDetails details = limitLoanDecisionEntity3.getDetails();
        if (this.f85750U) {
            m105282f3().f68682o.setValueText(C32303f.m95203n(details.loanAmount, details.loanCcy));
        } else {
            LimitLoanDecisionEntity limitLoanDecisionEntity4 = this.f85740K;
            if (limitLoanDecisionEntity4 == null) {
                C41536l.m120506z("limitLoanDecision");
                limitLoanDecisionEntity4 = null;
            }
            List<BigDecimal> loanAmounts = limitLoanDecisionEntity4.getLoanAmounts();
            C41536l.m120487g(loanAmounts, "null cannot be cast to non-null type java.util.ArrayList<java.math.BigDecimal>");
            ArrayList arrayList = (ArrayList) loanAmounts;
            this.f85742M = arrayList;
            if (arrayList == null) {
                C41536l.m120506z("loanAmountsPreviews");
                arrayList = null;
            }
            C41358y.m120028r0(arrayList);
            TextTypeView textTypeView = m105282f3().f68682o;
            ArrayList arrayList2 = this.f85742M;
            if (arrayList2 == null) {
                C41536l.m120506z("loanAmountsPreviews");
                arrayList2 = null;
            }
            textTypeView.setValueText(C32303f.m95203n((BigDecimal) arrayList2.get(0), details.loanCcy));
        }
        m105282f3().f68683p.setValueText(C32303f.m95203n(details.comisAmount, details.loanCcy));
        if (C41536l.m120484d(details.operationType, "R")) {
            m105282f3().f68681n.setVisibility(0);
            m105282f3().f68681n.setValueText(C32303f.m95203n(details.rfncAmount, details.loanCcy));
        }
        LimitLoanDecisionEntity limitLoanDecisionEntity5 = this.f85740K;
        if (limitLoanDecisionEntity5 == null) {
            C41536l.m120506z("limitLoanDecision");
        } else {
            limitLoanDecisionEntity2 = limitLoanDecisionEntity5;
        }
        List<LimitLoanRefinanceInfo> refinanceInfo = limitLoanDecisionEntity2.getRefinanceInfo();
        if (refinanceInfo != null) {
            m105282f3().f68672e.setVisibility(0);
            m105282f3().f68673f.setVisibility(8);
            m105282f3().f68672e.setValueText(C32303f.m95203n(details.keepAmount, details.loanCcy));
            m105250F3(refinanceInfo);
        } else {
            m105282f3().f68672e.setVisibility(8);
            m105282f3().f68673f.setVisibility(0);
            m105282f3().f68673f.setValueText(C32303f.m95203n(details.keepAmount, details.loanCcy));
        }
        m105282f3().f68684q.setValueText(details.loanTerm + " " + getString(C10328q.f28967t7));
        m105282f3().f68676i.getBogInputLayout().setLeftImageViewMargin(C10319h.loan_offer_card_view_right_margin);
        if (!this.f85750U) {
            m105282f3().f68682o.setOnClickListener(new C31290c(this));
            m105282f3().f68676i.setOnClickListener(new C31291d(this));
            return;
        }
        m105282f3().f68676i.setOnClickListener(new C31292e(this));
    }

    /* access modifiers changed from: private */
    /* renamed from: x3 */
    public static final void m105297x3(ExpressLoanDetailsActivity expressLoanDetailsActivity, View view) {
        C41536l.m120489i(expressLoanDetailsActivity, "this$0");
        C41536l.m120488h(view, "it");
        expressLoanDetailsActivity.m105258J3(view, 0);
    }

    /* access modifiers changed from: private */
    /* renamed from: y3 */
    public static final void m105298y3(ExpressLoanDetailsActivity expressLoanDetailsActivity, View view) {
        C41536l.m120489i(expressLoanDetailsActivity, "this$0");
        C41536l.m120488h(view, "it");
        expressLoanDetailsActivity.m105258J3(view, 1);
    }

    /* access modifiers changed from: private */
    /* renamed from: z3 */
    public static final void m105299z3(ExpressLoanDetailsActivity expressLoanDetailsActivity, View view) {
        C41536l.m120489i(expressLoanDetailsActivity, "this$0");
        C41536l.m120488h(view, "it");
        expressLoanDetailsActivity.m105258J3(view, 0);
    }

    /* renamed from: O */
    public void mo37615O(String str, String str2, String str3, String str4) {
        C41536l.m120489i(str, "operationId");
        C41536l.m120489i(str2, "operationReference");
        C41536l.m120489i(str3, "scaAuthCode");
        m105246D3(str, str2, str3);
    }

    /* access modifiers changed from: protected */
    /* renamed from: O1 */
    public void mo37451O1(Bundle bundle) {
        setContentView((View) m105282f3().f68689v);
        super.mo37451O1(bundle);
        String stringExtra = getIntent().getStringExtra("OFFER_NO");
        C41536l.m120486f(stringExtra);
        this.f85743N = stringExtra;
        String stringExtra2 = getIntent().getStringExtra("OPERATION_TYPE");
        C41536l.m120486f(stringExtra2);
        this.f85744O = stringExtra2;
        String stringExtra3 = getIntent().getStringExtra("PRODUCT_CODE");
        C41536l.m120486f(stringExtra3);
        this.f85745P = stringExtra3;
        m105282f3().f68690w.setText(getIntent().getStringExtra("HEADER_TEXT"));
        m105282f3().f68685r.setOnClickListener(new C31288a(this));
        m105282f3().f68687t.mo3946b().setOnClickListener(new C31289b(this));
        ConstraintLayout constraintLayout = m105282f3().f68689v;
        C41536l.m120488h(constraintLayout, "binding.root");
        int childCount = constraintLayout.getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = constraintLayout.getChildAt(i);
            C41536l.m120488h(childAt, "getChildAt(index)");
            if (childAt instanceof TextTypeView) {
                ((TextTypeView) childAt).setUnderLineColor(C32343x.m95418U(C10318g.mr_details_divider_color, this));
            }
        }
        m105256I3();
        C36546y.m108282F().mo27137H("open_express_loan_offer", "", "", (Bundle) null, C10464h.C10465a.FACEBOOKANDFIREBASE);
    }

    /* renamed from: R */
    public void mo37616R(String str, String str2) {
        C41536l.m120489i(str, "message");
        C27113k n3 = m105288n3();
        if (n3 != null) {
            n3.mo66413u2(str);
        }
    }

    /* renamed from: S */
    public void mo37617S(boolean z) {
        C27113k n3 = m105288n3();
        if (n3 != null) {
            n3.mo66414v2(z);
        }
    }

    /* renamed from: k3 */
    public final BankApi mo86471k3() {
        BankApi bankApi = this.f85737H;
        if (bankApi != null) {
            return bankApi;
        }
        C41536l.m120506z("mBankApi");
        return null;
    }

    /* renamed from: m */
    public void mo39137m() {
        C41185v e = C41185v.C41187b.m119423e(C41185v.f97155C, BankApi.OFFERS_PROCESS_LOAN_REGISTRATION, mo86472m3().mo66809a(m105292r3(this, (String) null, (String) null, (String) null, 7, (Object) null)), (C41143c) null, 4, (Object) null);
        FragmentManager supportFragmentManager = getSupportFragmentManager();
        C41536l.m120488h(supportFragmentManager, "supportFragmentManager");
        e.mo4576A1(supportFragmentManager, (String) null);
    }

    /* renamed from: m3 */
    public final C27494a mo86472m3() {
        C27494a aVar = this.f85738I;
        if (aVar != null) {
            return aVar;
        }
        C41536l.m120506z("otpParamsMapBuilder");
        return null;
    }

    /* access modifiers changed from: protected */
    public void onActivityResult(int i, int i2, Intent intent) {
        int i3;
        int i4;
        String fileUrl;
        super.onActivityResult(i, i2, intent);
        if (i2 == -1 && i == 10001 && intent != null) {
            if (intent.hasExtra("LOAN_AMOUNT_WIZARD_FIELD_ID")) {
                String stringExtra = intent.getStringExtra("LOAN_AMOUNT_WIZARD_FIELD_ID");
                C41536l.m120486f(stringExtra);
                i3 = Integer.parseInt(stringExtra);
            } else {
                i3 = -1;
            }
            if (intent.hasExtra("LOAN_CARD_WIZARD_FIELD_ID")) {
                String stringExtra2 = intent.getStringExtra("LOAN_CARD_WIZARD_FIELD_ID");
                C41536l.m120486f(stringExtra2);
                i4 = Integer.parseInt(stringExtra2);
            } else {
                i4 = -1;
            }
            boolean z = this.f85750U;
            boolean z2 = true;
            if (!z ? i3 == this.f85746Q && i4 == this.f85747R : i4 == this.f85747R) {
                z2 = false;
            }
            this.f85748S = z2;
            if (i3 != -1 && !z) {
                this.f85746Q = i3;
                TextTypeView textTypeView = m105282f3().f68682o;
                ArrayList arrayList = this.f85742M;
                C41238w wVar = null;
                if (arrayList == null) {
                    C41536l.m120506z("loanAmountsPreviews");
                    arrayList = null;
                }
                textTypeView.setValueText(C32303f.m95203n((BigDecimal) arrayList.get(this.f85746Q), m105284h3()));
                if (i4 != -1) {
                    this.f85747R = i4;
                    List list = this.f85741L;
                    if (list == null) {
                        C41536l.m120506z("loanOfferCards");
                        list = null;
                    }
                    LoanOfferCard loanOfferCard = (LoanOfferCard) list.get(this.f85747R);
                    CardExternalFile cardExternalFile = loanOfferCard.getCardExternalFile();
                    if (!(cardExternalFile == null || (fileUrl = cardExternalFile.getFileUrl()) == null)) {
                        m105282f3().f68676i.fetchLeftImageWithGlide(fileUrl);
                        wVar = C41238w.f97225a;
                    }
                    if (wVar == null) {
                        m105282f3().f68676i.setLeftDrawable(C32307h.m95224a(loanOfferCard.getSubProductCode()));
                    }
                    TextTypeView textTypeView2 = m105282f3().f68676i;
                    String lastFour = loanOfferCard.getLastFour();
                    C41536l.m120488h(lastFour, "card.lastFour");
                    textTypeView2.setValueText(m105287l3(lastFour));
                }
                if ((this.f85748S && m105243A3()) || (this.f85749T && m105243A3())) {
                    m105280d3();
                    this.f85748S = false;
                }
            }
        }
    }

    /* renamed from: s3 */
    public final C31658b mo86473s3() {
        C31658b bVar = this.f85736G;
        if (bVar != null) {
            return bVar;
        }
        C41536l.m120506z("startTMXProfilingUseCase");
        return null;
    }
}
