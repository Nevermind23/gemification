package p341ge.bog.mobilebank.p975ui.activities;

import a81.C30630i;
import a81.C30644j;
import a81.C30657k;
import a81.C30670l;
import a81.C30683m;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.LinearLayout;
import androidx.core.content.C0767a;
import androidx.fragment.app.FragmentManager;
import ba1.C10146d0;
import cf1.C40407d;
import e41.C31658b;
import e91.C31696a;
import g91.C32297d;
import g91.C32303f;
import g91.C32307h;
import g91.C32319m;
import g91.C32343x;
import g91.C32359z0;
import hc1.C41143c;
import hc1.C41185v;
import hd1.C41205b;
import he1.C41217g;
import he1.C41238w;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import jg1.C41438c;
import jg1.C41452l;
import k70.C25682f;
import kotlin.jvm.internal.C41536l;
import kotlin.jvm.internal.C41537m;
import kotlin.jvm.internal.DefaultConstructorMarker;
import o00.C26656a;
import p00.C27113k;
import p341ge.bog.mobilebank.cleanarch.domain.products.model.CardExternalFile;
import p341ge.bog.mobilebank.cleanarch.precontract.data.entity.PreContractEntity;
import p341ge.bog.mobilebank.eventbus.events.DepLoanAgreementsEvent;
import p341ge.bog.mobilebank.model.Client;
import p341ge.bog.mobilebank.model.DepLoanAgreement;
import p341ge.bog.mobilebank.model.DepLoanCalculation;
import p341ge.bog.mobilebank.model.offers.LoanOfferCard;
import p341ge.bog.mobilebank.model.offers.Summary;
import p341ge.bog.mobilebank.p975ui.activities.CashCoverLoanSuccessActivity;
import p341ge.bog.mobilebank.p975ui.views.widgets.BogInputLayout;
import p341ge.bog.mobilebank.p975ui.views.widgets.BogTextView;
import p341ge.bog.mobilebank.p975ui.views.widgets.TextTypeView;
import p341ge.bog.mobilebank.p975ui.wizard.activities.AdvancedWizardActivity;
import p341ge.bog.mobilebank.p975ui.wizard.controllers.CashCoverLoanWizardPlugin;
import p341ge.bog.mobilebank.p975ui.wizard.model.C35893a;
import p341ge.bog.mobilebank.p975ui.wizard.model.WizardObject;
import p341ge.bog.mobilebank.rest.BankApi;
import p341ge.bog.mobilebank.rest.model.RestCallback;
import p341ge.bog.mobilebank.rest.model.otpparameter.CreateDepLoanParams;
import p341ge.bog.mobilebank.shared.tmx_profiling.TMXFlags;
import p341ge.bog.mobilebank.shared2.network.BankApiResponse;
import p366bk.C10318g;
import p366bk.C10322k;
import p366bk.C10324m;
import p366bk.C10328q;
import p729cv.C19803e;
import p729cv.C19804f;
import p90.C27415s;
import pc0.C27494a;
import r90.C27950a;
import ue1.C43064a;
import ue1.C43075l;

/* renamed from: ge.bog.mobilebank.ui.activities.CashCoverLoanActivity */
public final class CashCoverLoanActivity extends C35451o implements C26656a, C41185v.C41186a {

    /* renamed from: Y */
    public static final C35168b f84776Y = new C35168b((DefaultConstructorMarker) null);
    /* access modifiers changed from: private */

    /* renamed from: G */
    public DepLoanCalculation f84777G;
    /* access modifiers changed from: private */

    /* renamed from: H */
    public ArrayList f84778H = new ArrayList();
    /* access modifiers changed from: private */

    /* renamed from: I */
    public ArrayList f84779I = new ArrayList();

    /* renamed from: J */
    private final String f84780J = "GEL";
    /* access modifiers changed from: private */

    /* renamed from: K */
    public long f84781K = -1;
    /* access modifiers changed from: private */

    /* renamed from: L */
    public int f84782L = -1;
    /* access modifiers changed from: private */

    /* renamed from: M */
    public String f84783M = "";
    /* access modifiers changed from: private */

    /* renamed from: N */
    public int f84784N = -1;
    /* access modifiers changed from: private */

    /* renamed from: O */
    public String f84785O;

    /* renamed from: P */
    public C19804f f84786P;

    /* renamed from: Q */
    public C19803e f84787Q;

    /* renamed from: R */
    public C25682f f84788R;

    /* renamed from: S */
    public BankApi f84789S;

    /* renamed from: T */
    public Client f84790T;

    /* renamed from: U */
    public C41438c f84791U;

    /* renamed from: V */
    public C27494a f84792V;

    /* renamed from: W */
    public C31658b f84793W;

    /* renamed from: X */
    private final C41217g f84794X = C41219i.m119470b(new C35169c(this));

    /* renamed from: ge.bog.mobilebank.ui.activities.CashCoverLoanActivity$b */
    public static final class C35168b {
        private C35168b() {
        }

        public /* synthetic */ C35168b(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* renamed from: a */
        public final void mo86097a(Context context, long j) {
            C41536l.m120489i(context, "context");
            Intent intent = new Intent(context, CashCoverLoanActivity.class);
            intent.putExtra("AGREE_KEY", j);
            context.startActivity(intent);
        }
    }

    /* renamed from: ge.bog.mobilebank.ui.activities.CashCoverLoanActivity$c */
    static final class C35169c extends C41537m implements C43064a {

        /* renamed from: d */
        final /* synthetic */ CashCoverLoanActivity f84799d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C35169c(CashCoverLoanActivity cashCoverLoanActivity) {
            super(0);
            this.f84799d = cashCoverLoanActivity;
        }

        /* renamed from: b */
        public final C27415s invoke() {
            C27415s a = C27415s.m84966a(this.f84799d.findViewById(C10322k.activity_cash_cover_loan_root));
            C41536l.m120488h(a, "bind(findViewById(R.id.a…ty_cash_cover_loan_root))");
            return a;
        }
    }

    /* renamed from: ge.bog.mobilebank.ui.activities.CashCoverLoanActivity$d */
    public static final class C35170d extends RestCallback {

        /* renamed from: a */
        final /* synthetic */ CashCoverLoanActivity f84800a;

        /* renamed from: b */
        final /* synthetic */ C43064a f84801b;

        C35170d(CashCoverLoanActivity cashCoverLoanActivity, C43064a aVar) {
            this.f84800a = cashCoverLoanActivity;
            this.f84801b = aVar;
        }

        public void onEnqueue(C41205b bVar) {
            C41536l.m120489i(bVar, "disposable");
            this.f84800a.mo86438k1(bVar);
        }

        public void onFailure(Throwable th) {
            super.onFailure(th);
            this.f84800a.mo86425J1();
            C32297d.m95153a(this.f84800a);
        }

        public void onResponse(BankApiResponse bankApiResponse) {
            C41536l.m120489i(bankApiResponse, "response");
            super.onResponse(bankApiResponse);
            this.f84800a.mo86425J1();
            if (bankApiResponse.isSuccess()) {
                this.f84800a.f84777G = (DepLoanCalculation) bankApiResponse.getResult();
                this.f84801b.invoke();
                return;
            }
            C32297d.m95154b(this.f84800a, C27950a.m86287d(bankApiResponse.getKey(), false, 2, (Object) null));
        }
    }

    /* renamed from: ge.bog.mobilebank.ui.activities.CashCoverLoanActivity$e */
    public static final class C35171e extends RestCallback {

        /* renamed from: a */
        final /* synthetic */ CashCoverLoanActivity f84802a;

        /* renamed from: b */
        final /* synthetic */ DepLoanCalculation f84803b;

        C35171e(CashCoverLoanActivity cashCoverLoanActivity, DepLoanCalculation depLoanCalculation) {
            this.f84802a = cashCoverLoanActivity;
            this.f84803b = depLoanCalculation;
        }

        public void onEnqueue(C41205b bVar) {
            C41536l.m120489i(bVar, "disposable");
            this.f84802a.mo86438k1(bVar);
        }

        public void onFailure(Throwable th) {
            super.onFailure(th);
            C41185v P2 = this.f84802a.m103371v3();
            if (P2 != null) {
                P2.mo4577k1();
            }
            C27113k O2 = this.f84802a.m103370r3();
            if (O2 != null) {
                O2.mo4577k1();
            }
            C32297d.m95153a(this.f84802a);
        }

        public void onResponse(BankApiResponse bankApiResponse) {
            C41536l.m120489i(bankApiResponse, "response");
            super.onResponse(bankApiResponse);
            if (bankApiResponse.isSuccess()) {
                C41185v P2 = this.f84802a.m103371v3();
                if (P2 != null) {
                    P2.mo4577k1();
                }
                C27113k O2 = this.f84802a.m103370r3();
                if (O2 != null) {
                    O2.mo4577k1();
                }
                this.f84802a.mo86084u3().mo48092a();
                this.f84802a.mo86082s3().mo48091a();
                this.f84802a.mo86083t3().invoke();
                CashCoverLoanSuccessActivity.C35179a aVar = CashCoverLoanSuccessActivity.f84811G;
                CashCoverLoanActivity cashCoverLoanActivity = this.f84802a;
                String Q2 = cashCoverLoanActivity.f84783M;
                String ccy = this.f84803b.getCcy();
                String d = C27950a.m86287d(this.f84803b.getProductDictionaryKey(), false, 2, (Object) null);
                long maturityDate = this.f84803b.getMaturityDate();
                String acctName = ((LoanOfferCard) this.f84802a.f84779I.get(this.f84802a.f84784N)).getAcctName();
                if (acctName == null) {
                    acctName = ((LoanOfferCard) this.f84802a.f84779I.get(this.f84802a.f84784N)).getAcctNo();
                }
                String str = acctName;
                C41536l.m120488h(str, "availableCards[selectedC…s[selectedCardPos].acctNo");
                aVar.mo86107a(cashCoverLoanActivity, Q2, ccy, d, maturityDate, str);
                this.f84802a.finish();
            } else if (bankApiResponse.isScaError()) {
                C41185v P22 = this.f84802a.m103371v3();
                if (P22 != null) {
                    P22.mo95634K2(C32343x.m95388F(bankApiResponse.getKey(), new Object[0]));
                }
            } else {
                C41185v P23 = this.f84802a.m103371v3();
                if (P23 != null) {
                    P23.mo4577k1();
                }
                C27113k O22 = this.f84802a.m103370r3();
                if (O22 != null) {
                    O22.mo4577k1();
                }
                C32297d.m95154b(this.f84802a, C32343x.m95388F(bankApiResponse.getKey(), new Object[0]));
            }
        }
    }

    /* renamed from: ge.bog.mobilebank.ui.activities.CashCoverLoanActivity$f */
    public static final class C35172f extends RestCallback {

        /* renamed from: a */
        final /* synthetic */ CashCoverLoanActivity f84804a;

        C35172f(CashCoverLoanActivity cashCoverLoanActivity) {
            this.f84804a = cashCoverLoanActivity;
        }

        public void onEnqueue(C41205b bVar) {
            C41536l.m120489i(bVar, "disposable");
            this.f84804a.mo86438k1(bVar);
        }

        public void onFailure(Throwable th) {
            super.onFailure(th);
            CashCoverLoanActivity.m103342O3(this.f84804a, (String) null, 1, (Object) null);
        }

        public void onResponse(BankApiResponse bankApiResponse) {
            C41536l.m120489i(bankApiResponse, "response");
            super.onResponse(bankApiResponse);
            this.f84804a.mo86425J1();
            if (bankApiResponse.isSuccess()) {
                CashCoverLoanActivity cashCoverLoanActivity = this.f84804a;
                Object result = bankApiResponse.getResult();
                C41536l.m120487g(result, "null cannot be cast to non-null type java.util.ArrayList<ge.bog.mobilebank.model.offers.LoanOfferCard>{ kotlin.collections.TypeAliasesKt.ArrayList<ge.bog.mobilebank.model.offers.LoanOfferCard> }");
                cashCoverLoanActivity.f84779I = (ArrayList) result;
                if (this.f84804a.f84781K != -1) {
                    this.f84804a.m103332J3();
                    return;
                }
                return;
            }
            this.f84804a.m103340N3(C27950a.m86287d(bankApiResponse.getKey(), false, 2, (Object) null));
        }
    }

    /* renamed from: ge.bog.mobilebank.ui.activities.CashCoverLoanActivity$g */
    public static final class C35173g extends RestCallback {

        /* renamed from: a */
        final /* synthetic */ CashCoverLoanActivity f84805a;

        C35173g(CashCoverLoanActivity cashCoverLoanActivity) {
            this.f84805a = cashCoverLoanActivity;
        }

        public void onEnqueue(C41205b bVar) {
            C41536l.m120489i(bVar, "disposable");
            this.f84805a.mo86438k1(bVar);
        }

        public void onFailure(Throwable th) {
            super.onFailure(th);
            this.f84805a.mo86425J1();
            C32297d.m95153a(this.f84805a);
            this.f84805a.m103336L3();
        }

        public void onResponse(BankApiResponse bankApiResponse) {
            C41536l.m120489i(bankApiResponse, "response");
            super.onResponse(bankApiResponse);
            this.f84805a.mo86425J1();
            if (bankApiResponse.isSuccess()) {
                Object result = bankApiResponse.getResult();
                if (result != null) {
                    DepLoanCalculation depLoanCalculation = (DepLoanCalculation) result;
                    CashCoverLoanActivity cashCoverLoanActivity = this.f84805a;
                    String bigDecimal = depLoanCalculation.getMaxAmount().toString();
                    C41536l.m120488h(bigDecimal, "result.maxAmount.toString()");
                    cashCoverLoanActivity.f84783M = bigDecimal;
                    CashCoverLoanActivity.m103330I3(this.f84805a, depLoanCalculation, false, 2, (Object) null);
                    this.f84805a.m103348R3();
                    return;
                }
                throw new IllegalArgumentException("BankApiResponse<DepLoanCalculation>.result shouldn't be null".toString());
            }
            C32297d.m95154b(this.f84805a, C27950a.m86287d(bankApiResponse.getKey(), false, 2, (Object) null));
            this.f84805a.m103336L3();
        }
    }

    /* renamed from: ge.bog.mobilebank.ui.activities.CashCoverLoanActivity$h */
    static final class C35174h extends C41537m implements C43064a {

        /* renamed from: d */
        final /* synthetic */ CashCoverLoanActivity f84806d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C35174h(CashCoverLoanActivity cashCoverLoanActivity) {
            super(0);
            this.f84806d = cashCoverLoanActivity;
        }

        public final void invoke() {
            this.f84806d.m103334K3();
        }
    }

    /* renamed from: ge.bog.mobilebank.ui.activities.CashCoverLoanActivity$i */
    static final class C35175i extends C41537m implements C43075l {

        /* renamed from: d */
        final /* synthetic */ CashCoverLoanActivity f84807d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C35175i(CashCoverLoanActivity cashCoverLoanActivity) {
            super(1);
            this.f84807d = cashCoverLoanActivity;
        }

        /* renamed from: a */
        public final void mo86103a(String str) {
            C41536l.m120489i(str, "it");
            if (Integer.parseInt(str) != -1) {
                this.f84807d.f84782L = Integer.parseInt(str);
                this.f84807d.m103366j3().f69706i.setValueText(((DepLoanAgreement) this.f84807d.f84778H.get(this.f84807d.f84782L)).getName());
                CashCoverLoanActivity cashCoverLoanActivity = this.f84807d;
                cashCoverLoanActivity.f84781K = ((DepLoanAgreement) cashCoverLoanActivity.f84778H.get(this.f84807d.f84782L)).getAgreeKey();
            }
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            mo86103a((String) obj);
            return C41238w.f97225a;
        }
    }

    /* renamed from: ge.bog.mobilebank.ui.activities.CashCoverLoanActivity$j */
    static final class C35176j extends C41537m implements C43075l {

        /* renamed from: d */
        final /* synthetic */ CashCoverLoanActivity f84808d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C35176j(CashCoverLoanActivity cashCoverLoanActivity) {
            super(1);
            this.f84808d = cashCoverLoanActivity;
        }

        /* renamed from: a */
        public final void mo86104a(String str) {
            boolean z;
            C41536l.m120489i(str, "it");
            if (this.f84808d.f84782L != -1) {
                if (str.length() > 0) {
                    z = true;
                } else {
                    z = false;
                }
                if (z) {
                    this.f84808d.f84783M = str;
                    this.f84808d.m103338M3(new BigDecimal(str));
                }
            }
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            mo86104a((String) obj);
            return C41238w.f97225a;
        }
    }

    /* renamed from: ge.bog.mobilebank.ui.activities.CashCoverLoanActivity$k */
    static final class C35177k extends C41537m implements C43075l {

        /* renamed from: d */
        final /* synthetic */ CashCoverLoanActivity f84809d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C35177k(CashCoverLoanActivity cashCoverLoanActivity) {
            super(1);
            this.f84809d = cashCoverLoanActivity;
        }

        /* renamed from: a */
        public final void mo86105a(String str) {
            C41238w wVar;
            String fileUrl;
            C41536l.m120489i(str, "it");
            if (Integer.parseInt(str) != -1) {
                this.f84809d.f84784N = Integer.parseInt(str);
                Object obj = this.f84809d.f84779I.get(this.f84809d.f84784N);
                C41536l.m120488h(obj, "availableCards[selectedCardPos]");
                LoanOfferCard loanOfferCard = (LoanOfferCard) obj;
                TextTypeView textTypeView = this.f84809d.m103366j3().f69704g;
                CashCoverLoanActivity cashCoverLoanActivity = this.f84809d;
                String lastFour = loanOfferCard.getLastFour();
                C41536l.m120488h(lastFour, "card.lastFour");
                textTypeView.setValueText(cashCoverLoanActivity.m103369p3(lastFour));
                CardExternalFile cardExternalFile = loanOfferCard.getCardExternalFile();
                if (cardExternalFile == null || (fileUrl = cardExternalFile.getFileUrl()) == null) {
                    wVar = null;
                } else {
                    this.f84809d.m103366j3().f69704g.fetchLeftImageWithGlide(fileUrl);
                    wVar = C41238w.f97225a;
                }
                if (wVar == null) {
                    this.f84809d.m103366j3().f69704g.setLeftDrawable(C32307h.m95224a(loanOfferCard.getSubProductCode()));
                }
            }
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            mo86105a((String) obj);
            return C41238w.f97225a;
        }
    }

    /* renamed from: ge.bog.mobilebank.ui.activities.CashCoverLoanActivity$l */
    public static final class C35178l extends RestCallback {

        /* renamed from: a */
        final /* synthetic */ CashCoverLoanActivity f84810a;

        C35178l(CashCoverLoanActivity cashCoverLoanActivity) {
            this.f84810a = cashCoverLoanActivity;
        }

        public void onEnqueue(C41205b bVar) {
            C41536l.m120489i(bVar, "disposable");
            this.f84810a.mo86438k1(bVar);
        }

        public void onFailure(Throwable th) {
            super.onFailure(th);
            this.f84810a.mo86425J1();
            C32297d.m95153a(this.f84810a);
        }

        public void onResponse(BankApiResponse bankApiResponse) {
            C41536l.m120489i(bankApiResponse, "response");
            super.onResponse(bankApiResponse);
            this.f84810a.mo86425J1();
            if (bankApiResponse.isSuccess()) {
                Object result = bankApiResponse.getResult();
                if (result != null) {
                    PreContractEntity preContractEntity = (PreContractEntity) result;
                    this.f84810a.m103344P3(preContractEntity.getContractTemplate());
                    this.f84810a.f84785O = preContractEntity.getContractTemplate();
                    return;
                }
                throw new IllegalArgumentException("BankApiResponse<PreContractEntity>.result shouldn't be null".toString());
            }
            C32297d.m95154b(this.f84810a, C27950a.m86287d(bankApiResponse.getKey(), false, 2, (Object) null));
        }
    }

    /* renamed from: A3 */
    private final void m103317A3() {
        TextTypeView textTypeView = m103366j3().f69705h;
        int i = C10318g.bog_default_text_color;
        textTypeView.setValueColor(C0767a.m2893c(this, i));
        m103366j3().f69713p.setValueColor(C0767a.m2893c(this, i));
        LinearLayout linearLayout = m103366j3().f69707j;
        C41536l.m120488h(linearLayout, "binding.detailsContainer");
        int childCount = linearLayout.getChildCount();
        for (int i2 = 0; i2 < childCount; i2++) {
            View childAt = linearLayout.getChildAt(i2);
            C41536l.m120488h(childAt, "getChildAt(index)");
            if (childAt instanceof TextTypeView) {
                ((TextTypeView) childAt).setUnderLineColor(C32343x.m95418U(C10318g.mr_details_divider_color, this));
            }
        }
        ((BogTextView) m103366j3().f69708k.findViewById(C10322k.smallDescriptionTV)).setText(C27950a.m86287d("text.applications.deploan.extraterms.header", false, 2, (Object) null));
        ((BogTextView) m103366j3().f69708k.findViewById(C10322k.descriptionTV)).setText(C32343x.m95416T(C40439w.m117103B(C27950a.m86287d("text.applications.deploan.extraterms.details", false, 2, (Object) null), "\\n", "<br />", false, 4, (Object) null)));
        m103366j3().f69706i.setOnClickListener(new C30630i(this));
        m103366j3().f69712o.setOnClickListener(new C30644j(this));
        m103366j3().f69704g.setOnClickListener(new C30657k(this));
        m103366j3().f69716s.mo3946b().setOnClickListener(new C30670l(this));
        m103366j3().f69715r.setOnClickListener(new C30683m(this));
    }

    /* access modifiers changed from: private */
    /* renamed from: B3 */
    public static final void m103318B3(CashCoverLoanActivity cashCoverLoanActivity, View view) {
        C41536l.m120489i(cashCoverLoanActivity, "this$0");
        C41536l.m120488h(view, "it");
        cashCoverLoanActivity.m103346Q3(0, view);
    }

    /* access modifiers changed from: private */
    /* renamed from: C3 */
    public static final void m103319C3(CashCoverLoanActivity cashCoverLoanActivity, View view) {
        C41536l.m120489i(cashCoverLoanActivity, "this$0");
        C41536l.m120488h(view, "it");
        cashCoverLoanActivity.m103346Q3(1, view);
    }

    /* access modifiers changed from: private */
    /* renamed from: D3 */
    public static final void m103320D3(CashCoverLoanActivity cashCoverLoanActivity, View view) {
        C41536l.m120489i(cashCoverLoanActivity, "this$0");
        C41536l.m120488h(view, "it");
        cashCoverLoanActivity.m103346Q3(2, view);
    }

    /* access modifiers changed from: private */
    /* renamed from: E3 */
    public static final void m103322E3(CashCoverLoanActivity cashCoverLoanActivity, View view) {
        C41536l.m120489i(cashCoverLoanActivity, "this$0");
        cashCoverLoanActivity.m103366j3().f69717t.setVisibility(4);
        cashCoverLoanActivity.mo86076l3().requestDepLoanAgreements(true);
    }

    /* access modifiers changed from: private */
    /* renamed from: F3 */
    public static final void m103324F3(CashCoverLoanActivity cashCoverLoanActivity, View view) {
        C41536l.m120489i(cashCoverLoanActivity, "this$0");
        if (cashCoverLoanActivity.m103326G3()) {
            cashCoverLoanActivity.m103364h3(new C35174h(cashCoverLoanActivity));
        }
    }

    /* renamed from: G3 */
    private final boolean m103326G3() {
        return (this.f84782L == -1 || new BigDecimal(this.f84783M).compareTo(BigDecimal.ZERO) <= 0 || this.f84784N == -1) ? false : true;
    }

    /* renamed from: H3 */
    private final void m103328H3(DepLoanCalculation depLoanCalculation, boolean z) {
        this.f84777G = depLoanCalculation;
        m103366j3().f69705h.setValueText(C32303f.m95203n(((DepLoanAgreement) this.f84778H.get(this.f84782L)).getAgreeBalance(), ((DepLoanAgreement) this.f84778H.get(this.f84782L)).getCcy()));
        m103366j3().f69713p.setValueText(C32319m.m95298e(depLoanCalculation.getMaturityDate(), true, this));
        if (!z) {
            m103338M3(depLoanCalculation.getMaxAmount());
        }
    }

    /* renamed from: I3 */
    static /* synthetic */ void m103330I3(CashCoverLoanActivity cashCoverLoanActivity, DepLoanCalculation depLoanCalculation, boolean z, int i, Object obj) {
        if ((i & 2) != 0) {
            z = false;
        }
        cashCoverLoanActivity.m103328H3(depLoanCalculation, z);
    }

    /* access modifiers changed from: private */
    /* renamed from: J3 */
    public final void m103332J3() {
        boolean z;
        Iterator it = this.f84778H.iterator();
        int i = 0;
        while (true) {
            if (!it.hasNext()) {
                i = -1;
                break;
            }
            if (((DepLoanAgreement) it.next()).getAgreeKey() == this.f84781K) {
                z = true;
            } else {
                z = false;
            }
            if (z) {
                break;
            }
            i++;
        }
        this.f84782L = i;
        m103366j3().f69706i.setValueText(((DepLoanAgreement) this.f84778H.get(this.f84782L)).getName());
        m103368n3();
    }

    /* access modifiers changed from: private */
    /* JADX WARNING: Code restructure failed: missing block: B:3:0x0057, code lost:
        if (r11 == null) goto L_0x0059;
     */
    /* renamed from: K3 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void m103334K3() {
        /*
            r25 = this;
            r0 = r25
            r25.mo86441o2()
            ge.bog.mobilebank.model.DepLoanCalculation r1 = r0.f84777G
            kotlin.jvm.internal.C41536l.m120486f(r1)
            ge.bog.mobilebank.rest.BankApi r2 = r25.mo86078o3()
            double r3 = r1.getSpreadRate()
            java.lang.Double r3 = java.lang.Double.valueOf(r3)
            java.lang.Double r4 = r1.getIrr()
            java.math.BigDecimal r5 = r1.getComisAmount()
            java.math.BigDecimal r6 = r1.getWithAmount()
            java.math.BigDecimal r7 = new java.math.BigDecimal
            java.lang.String r8 = r0.f84783M
            r7.<init>(r8)
            long r8 = r1.getMaturityDate()
            java.lang.Long r8 = java.lang.Long.valueOf(r8)
            long r9 = r1.getPayDate()
            java.lang.Long r9 = java.lang.Long.valueOf(r9)
            int r10 = r1.getPayCount()
            java.math.BigDecimal r11 = r1.getComisAmount()
            if (r11 == 0) goto L_0x0059
            java.math.BigDecimal r11 = new java.math.BigDecimal
            java.lang.String r12 = r0.f84783M
            r11.<init>(r12)
            java.math.BigDecimal r12 = r1.getComisAmount()
            java.math.BigDecimal r11 = r11.subtract(r12)
            java.lang.String r12 = "this.subtract(other)"
            kotlin.jvm.internal.C41536l.m120488h(r11, r12)
            if (r11 != 0) goto L_0x0060
        L_0x0059:
            java.math.BigDecimal r11 = new java.math.BigDecimal
            java.lang.String r12 = r0.f84783M
            r11.<init>(r12)
        L_0x0060:
            double r12 = r1.getPriOver()
            java.lang.Double r12 = java.lang.Double.valueOf(r12)
            double r13 = r1.getPrePenalty()
            java.lang.Double r13 = java.lang.Double.valueOf(r13)
            java.lang.String r14 = r1.getAgreeAcctNo()
            java.math.BigDecimal r15 = r1.getSecAmount()
            java.lang.String r16 = r1.getCcy()
            r21 = r12
            java.util.ArrayList r12 = r0.f84778H
            r22 = r13
            int r13 = r0.f84782L
            java.lang.Object r12 = r12.get(r13)
            ge.bog.mobilebank.model.DepLoanAgreement r12 = (p341ge.bog.mobilebank.model.DepLoanAgreement) r12
            java.lang.String r12 = r12.getDictionaryKey()
            r13 = 2
            r23 = r14
            r14 = 0
            r24 = r15
            r15 = 0
            java.lang.String r17 = r90.C27950a.m86287d(r12, r15, r13, r14)
            long r12 = r1.getDepMaturityDate()
            java.lang.Long r18 = java.lang.Long.valueOf(r12)
            java.lang.String r19 = "CDS_CASH_COVER_LOAN"
            ge.bog.mobilebank.ui.activities.CashCoverLoanActivity$l r1 = new ge.bog.mobilebank.ui.activities.CashCoverLoanActivity$l
            r20 = r1
            r1.<init>(r0)
            r12 = r21
            r13 = r22
            r14 = r23
            r15 = r24
            r2.getCashCoverLoanPreContract(r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p341ge.bog.mobilebank.p975ui.activities.CashCoverLoanActivity.m103334K3():void");
    }

    /* access modifiers changed from: private */
    /* renamed from: L3 */
    public final void m103336L3() {
        this.f84782L = -1;
        this.f84783M = "";
        TextTypeView textTypeView = m103366j3().f69706i;
        C41536l.m120488h(textTypeView, "binding.depositField");
        C32343x.m95425X0(textTypeView);
        TextTypeView textTypeView2 = m103366j3().f69705h;
        C41536l.m120488h(textTypeView2, "binding.depositAmountField");
        C32343x.m95425X0(textTypeView2);
        TextTypeView textTypeView3 = m103366j3().f69712o;
        C41536l.m120488h(textTypeView3, "binding.loanAmountField");
        C32343x.m95425X0(textTypeView3);
        TextTypeView textTypeView4 = m103366j3().f69713p;
        C41536l.m120488h(textTypeView4, "binding.loanRepaymentDateField");
        C32343x.m95425X0(textTypeView4);
        m103348R3();
    }

    /* access modifiers changed from: private */
    /* renamed from: M3 */
    public final void m103338M3(BigDecimal bigDecimal) {
        m103366j3().f69712o.setValueText(C32303f.m95203n(bigDecimal, this.f84780J));
    }

    /* access modifiers changed from: private */
    /* renamed from: N3 */
    public final void m103340N3(String str) {
        C41238w wVar;
        mo86425J1();
        m103366j3().f69717t.setVisibility(0);
        if (str != null) {
            C32297d.m95154b(this, str);
            wVar = C41238w.f97225a;
        } else {
            wVar = null;
        }
        if (wVar == null) {
            C32297d.m95153a(this);
        }
    }

    /* renamed from: O3 */
    static /* synthetic */ void m103342O3(CashCoverLoanActivity cashCoverLoanActivity, String str, int i, Object obj) {
        if ((i & 1) != 0) {
            str = null;
        }
        cashCoverLoanActivity.m103340N3(str);
    }

    /* access modifiers changed from: private */
    /* renamed from: P3 */
    public final void m103344P3(String str) {
        C27113k c = C27113k.C27114a.m84066c(C27113k.f68083P, str, true, C32343x.m95452h0(C10328q.precontract_activation, new Object[0]), (ArrayList) null, (Summary) null, (String) null, 56, (Object) null);
        FragmentManager supportFragmentManager = getSupportFragmentManager();
        C41536l.m120488h(supportFragmentManager, "supportFragmentManager");
        c.mo4576A1(supportFragmentManager, (String) null);
    }

    /* renamed from: Q3 */
    private final void m103346Q3(int i, View view) {
        C35893a.m106783a(this).mo88140g(m103374z3()).mo88137d(AdvancedWizardActivity.class).mo88139f(new CashCoverLoanWizardPlugin(this.f84778H)).mo88141h(i).mo88136c(view).mo88142i();
    }

    /* access modifiers changed from: private */
    /* renamed from: R3 */
    public final void m103348R3() {
        if (m103326G3()) {
            m103366j3().f69715r.setOrange(true, true);
        } else {
            m103366j3().f69715r.setOrange(false, false);
        }
    }

    /* renamed from: h3 */
    private final void m103364h3(C43064a aVar) {
        mo86441o2();
        mo86078o3().checkDepLoanCalculation(Long.valueOf(this.f84781K), this.f84783M, this.f84780J, ((LoanOfferCard) this.f84779I.get(this.f84784N)).getPan2(), new C35170d(this, aVar));
    }

    /* renamed from: i3 */
    private final void m103365i3(String str, String str2, String str3) {
        C41185v v3 = m103371v3();
        if (v3 != null) {
            v3.mo95635L2(true);
        }
        DepLoanCalculation depLoanCalculation = this.f84777G;
        C41536l.m120486f(depLoanCalculation);
        mo86078o3().useOtpForAction(mo86081q3().mo66809a(m103372w3(str, str2, str3)), new C35171e(this, depLoanCalculation));
    }

    /* access modifiers changed from: private */
    /* renamed from: j3 */
    public final C27415s m103366j3() {
        return (C27415s) this.f84794X.getValue();
    }

    /* renamed from: k3 */
    private final void m103367k3(String str) {
        mo86078o3().getCardsForLoanOffer(str, new C35172f(this));
    }

    /* renamed from: n3 */
    private final void m103368n3() {
        mo86441o2();
        mo86078o3().getDepLoanCalculation(Long.valueOf(this.f84781K), this.f84780J, new C35173g(this));
    }

    /* access modifiers changed from: private */
    /* renamed from: p3 */
    public final String m103369p3(String str) {
        return "**** " + str;
    }

    /* access modifiers changed from: private */
    /* renamed from: r3 */
    public final C27113k m103370r3() {
        FragmentManager supportFragmentManager = getSupportFragmentManager();
        C41536l.m120488h(supportFragmentManager, "supportFragmentManager");
        return C32343x.m95443e0(supportFragmentManager, (String) null, 1, (Object) null);
    }

    /* access modifiers changed from: private */
    /* renamed from: v3 */
    public final C41185v m103371v3() {
        FragmentManager supportFragmentManager = getSupportFragmentManager();
        C41536l.m120488h(supportFragmentManager, "supportFragmentManager");
        return C32343x.m95449g0(supportFragmentManager, (String) null, 1, (Object) null);
    }

    /* renamed from: w3 */
    private final CreateDepLoanParams m103372w3(String str, String str2, String str3) {
        Long l;
        String str4;
        DepLoanCalculation depLoanCalculation = this.f84777G;
        byte[] bArr = null;
        if (depLoanCalculation != null) {
            l = Long.valueOf(depLoanCalculation.getContractId());
        } else {
            l = null;
        }
        DepLoanCalculation depLoanCalculation2 = this.f84777G;
        if (depLoanCalculation2 != null) {
            str4 = depLoanCalculation2.getCcy();
        } else {
            str4 = null;
        }
        String str5 = this.f84783M;
        String pan2 = ((LoanOfferCard) this.f84779I.get(this.f84784N)).getPan2();
        C41536l.m120488h(pan2, "availableCards[selectedCardPos].pan2");
        String str6 = this.f84785O;
        if (str6 != null) {
            bArr = str6.getBytes(C40407d.f95989b);
            C41536l.m120488h(bArr, "this as java.lang.String).getBytes(charset)");
        }
        return new CreateDepLoanParams(l, str4, str5, pan2, C32359z0.m95597y(bArr), C10146d0.C10177h.m37232a(), BankApi.LOANS_DEP_CREATE_NEW, str, str2, str3);
    }

    /* renamed from: x3 */
    static /* synthetic */ CreateDepLoanParams m103373x3(CashCoverLoanActivity cashCoverLoanActivity, String str, String str2, String str3, int i, Object obj) {
        if ((i & 1) != 0) {
            str = null;
        }
        if ((i & 2) != 0) {
            str2 = null;
        }
        if ((i & 4) != 0) {
            str3 = null;
        }
        return cashCoverLoanActivity.m103372w3(str, str2, str3);
    }

    /* renamed from: z3 */
    private final ArrayList m103374z3() {
        String str;
        BigDecimal bigDecimal;
        BigDecimal bigDecimal2;
        BigDecimal bigDecimal3;
        ArrayList arrayList = new ArrayList();
        arrayList.add(new WizardObject().setInputStyle(6).setInputTitle(getString(C10328q.choose_deposit)).setId("DEPOSITS_WIZARD_FIELD_ID").setValue(String.valueOf(this.f84782L)));
        WizardObject inputType = new WizardObject().setInputStyle(1).setInputType(BogInputLayout.INPUT_TYPE_NUM_REAL);
        DepLoanCalculation depLoanCalculation = this.f84777G;
        BigDecimal bigDecimal4 = null;
        if (depLoanCalculation == null) {
            str = getString(C10328q.loan_amount);
        } else {
            int i = C10328q.loan_amount_from;
            Object[] objArr = new Object[2];
            if (depLoanCalculation != null) {
                bigDecimal2 = depLoanCalculation.getMinAmount();
            } else {
                bigDecimal2 = null;
            }
            objArr[0] = bigDecimal2;
            DepLoanCalculation depLoanCalculation2 = this.f84777G;
            if (depLoanCalculation2 != null) {
                bigDecimal3 = depLoanCalculation2.getMaxAmount();
            } else {
                bigDecimal3 = null;
            }
            objArr[1] = bigDecimal3;
            str = getString(i, objArr);
        }
        WizardObject amountObject = inputType.setInputTitle(str).setAmountObject(true);
        DepLoanCalculation depLoanCalculation3 = this.f84777G;
        if (depLoanCalculation3 != null) {
            bigDecimal = depLoanCalculation3.getMinAmount();
        } else {
            bigDecimal = null;
        }
        WizardObject minAmount = amountObject.setMinAmount(bigDecimal);
        DepLoanCalculation depLoanCalculation4 = this.f84777G;
        if (depLoanCalculation4 != null) {
            bigDecimal4 = depLoanCalculation4.getMaxAmount();
        }
        arrayList.add(minAmount.setMaxAmount(bigDecimal4).setId("AMOUNT_WIZARD_FIELD_ID").setNonSelectableString(C32303f.m95198i(this.f84780J, true)).setValue(this.f84783M));
        WizardObject value = new WizardObject().setInputStyle(4).setInputTitle(getString(C10328q.card_for_loan_activation)).setId("CARDS_WIZARD_FIELD_ID").setValue(String.valueOf(this.f84784N));
        ArrayList<LoanOfferCard> arrayList2 = this.f84779I;
        ArrayList arrayList3 = new ArrayList(C41343r.m119925u(arrayList2, 10));
        for (LoanOfferCard a : arrayList2) {
            arrayList3.add(C31696a.m93838a(a));
        }
        value.setCustomSelectorValues(new ArrayList(arrayList3));
        arrayList.add(value);
        return arrayList;
    }

    /* access modifiers changed from: protected */
    /* renamed from: M1 */
    public int mo49479M1() {
        return C10324m.activity_cash_cover_loan;
    }

    /* renamed from: O */
    public void mo37615O(String str, String str2, String str3, String str4) {
        C41536l.m120489i(str, "operationId");
        C41536l.m120489i(str2, "operationReference");
        C41536l.m120489i(str3, "scaAuthCode");
        m103365i3(str, str2, str3);
    }

    /* access modifiers changed from: protected */
    /* renamed from: O1 */
    public void mo37451O1(Bundle bundle) {
        super.mo37451O1(bundle);
        mo86085y3().mo72084b(TMXFlags.DEP_LOAN);
        C32343x.m95423W0(mo86077m3(), this);
        this.f84781K = getIntent().getLongExtra("AGREE_KEY", -1);
        m103317A3();
        mo86076l3().requestDepLoanAgreements(true);
    }

    /* renamed from: R */
    public void mo37616R(String str, String str2) {
        C41536l.m120489i(str, "message");
        C27113k r3 = m103370r3();
        if (r3 != null) {
            r3.mo66413u2(str);
        }
    }

    /* renamed from: S */
    public void mo37617S(boolean z) {
        C27113k r3 = m103370r3();
        if (r3 != null) {
            r3.mo66414v2(z);
        }
    }

    /* renamed from: l3 */
    public final Client mo86076l3() {
        Client client = this.f84790T;
        if (client != null) {
            return client;
        }
        C41536l.m120506z("client");
        return null;
    }

    /* renamed from: m */
    public void mo39137m() {
        C41185v e = C41185v.C41187b.m119423e(C41185v.f97155C, BankApi.LOANS_DEP_CREATE_NEW, mo86081q3().mo66809a(m103373x3(this, (String) null, (String) null, (String) null, 7, (Object) null)), (C41143c) null, 4, (Object) null);
        FragmentManager supportFragmentManager = getSupportFragmentManager();
        C41536l.m120488h(supportFragmentManager, "supportFragmentManager");
        e.mo4576A1(supportFragmentManager, (String) null);
    }

    /* renamed from: m3 */
    public final C41438c mo86077m3() {
        C41438c cVar = this.f84791U;
        if (cVar != null) {
            return cVar;
        }
        C41536l.m120506z("eventBus");
        return null;
    }

    /* renamed from: o3 */
    public final BankApi mo86078o3() {
        BankApi bankApi = this.f84789S;
        if (bankApi != null) {
            return bankApi;
        }
        C41536l.m120506z("mBankApi");
        return null;
    }

    /* access modifiers changed from: protected */
    public void onActivityResult(int i, int i2, Intent intent) {
        super.onActivityResult(i, i2, intent);
        if (i2 == -1 && i == 10001 && intent != null) {
            C32343x.m95461k0(intent, "DEPOSITS_WIZARD_FIELD_ID", new C35175i(this));
            C32343x.m95461k0(intent, "AMOUNT_WIZARD_FIELD_ID", new C35176j(this));
            C32343x.m95461k0(intent, "CARDS_WIZARD_FIELD_ID", new C35177k(this));
        }
    }

    @C41452l
    public final void onCalculationsAndCardsEvent(C35167a aVar) {
        C41536l.m120489i(aVar, "event");
        if (aVar.mo86088c() && aVar.mo86087b()) {
            m103336L3();
        } else if (aVar.mo86088c() && !aVar.mo86087b()) {
            DepLoanCalculation a = aVar.mo86086a();
            if (a != null) {
                m103328H3(a, true);
            }
            m103348R3();
        } else if (!aVar.mo86088c() && aVar.mo86089d()) {
            m103368n3();
        } else if (!aVar.mo86088c() && !aVar.mo86089d()) {
            m103348R3();
        }
    }

    @C41452l
    public final void onDepLoanAgreementsEvent(DepLoanAgreementsEvent depLoanAgreementsEvent) {
        C41536l.m120489i(depLoanAgreementsEvent, "event");
        mo86441o2();
        int state = depLoanAgreementsEvent.getState();
        if (state == 20) {
            List<DepLoanAgreement> agreements = depLoanAgreementsEvent.getAgreements();
            C41536l.m120487g(agreements, "null cannot be cast to non-null type java.util.ArrayList<ge.bog.mobilebank.model.DepLoanAgreement>{ kotlin.collections.TypeAliasesKt.ArrayList<ge.bog.mobilebank.model.DepLoanAgreement> }");
            this.f84778H = (ArrayList) agreements;
            m103367k3(this.f84780J);
        } else if (state == 30) {
            m103342O3(this, (String) null, 1, (Object) null);
        } else if (state == 40) {
            m103340N3(depLoanAgreementsEvent.getErrorKey());
        }
    }

    /* access modifiers changed from: protected */
    public void onDestroy() {
        super.onDestroy();
        C32343x.m95489t1(mo86077m3(), this);
    }

    /* renamed from: q3 */
    public final C27494a mo86081q3() {
        C27494a aVar = this.f84792V;
        if (aVar != null) {
            return aVar;
        }
        C41536l.m120506z("otpParamsMapBuilder");
        return null;
    }

    /* renamed from: s3 */
    public final C19803e mo86082s3() {
        C19803e eVar = this.f84787Q;
        if (eVar != null) {
            return eVar;
        }
        C41536l.m120506z("refreshAssetLiability");
        return null;
    }

    /* renamed from: t3 */
    public final C25682f mo86083t3() {
        C25682f fVar = this.f84788R;
        if (fVar != null) {
            return fVar;
        }
        C41536l.m120506z("refreshDepositsAndBonds");
        return null;
    }

    /* renamed from: u3 */
    public final C19804f mo86084u3() {
        C19804f fVar = this.f84786P;
        if (fVar != null) {
            return fVar;
        }
        C41536l.m120506z("refreshProductTypeList");
        return null;
    }

    /* renamed from: y3 */
    public final C31658b mo86085y3() {
        C31658b bVar = this.f84793W;
        if (bVar != null) {
            return bVar;
        }
        C41536l.m120506z("startTMXProfilingUseCase");
        return null;
    }

    /* renamed from: z1 */
    public String mo38120z1() {
        String string = getString(C10328q.f28957f5);
        C41536l.m120488h(string, "getString(R.string.header_text_loans)");
        return string;
    }

    /* renamed from: ge.bog.mobilebank.ui.activities.CashCoverLoanActivity$a */
    public static final class C35167a {

        /* renamed from: a */
        private DepLoanCalculation f84795a;

        /* renamed from: b */
        private boolean f84796b;

        /* renamed from: c */
        private boolean f84797c;

        /* renamed from: d */
        private boolean f84798d;

        public C35167a(DepLoanCalculation depLoanCalculation, boolean z, boolean z2, boolean z3) {
            this.f84795a = depLoanCalculation;
            this.f84796b = z;
            this.f84797c = z2;
            this.f84798d = z3;
        }

        /* renamed from: a */
        public final DepLoanCalculation mo86086a() {
            return this.f84795a;
        }

        /* renamed from: b */
        public final boolean mo86087b() {
            return this.f84796b;
        }

        /* renamed from: c */
        public final boolean mo86088c() {
            return this.f84797c;
        }

        /* renamed from: d */
        public final boolean mo86089d() {
            return this.f84798d;
        }

        /* renamed from: e */
        public final void mo86090e(DepLoanCalculation depLoanCalculation) {
            this.f84795a = depLoanCalculation;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C35167a)) {
                return false;
            }
            C35167a aVar = (C35167a) obj;
            return C41536l.m120484d(this.f84795a, aVar.f84795a) && this.f84796b == aVar.f84796b && this.f84797c == aVar.f84797c && this.f84798d == aVar.f84798d;
        }

        /* renamed from: f */
        public final void mo86092f(boolean z) {
            this.f84796b = z;
        }

        /* renamed from: g */
        public final void mo86093g(boolean z) {
            this.f84797c = z;
        }

        /* renamed from: h */
        public final void mo86094h(boolean z) {
            this.f84798d = z;
        }

        public int hashCode() {
            DepLoanCalculation depLoanCalculation = this.f84795a;
            int hashCode = (depLoanCalculation == null ? 0 : depLoanCalculation.hashCode()) * 31;
            boolean z = this.f84796b;
            boolean z2 = true;
            if (z) {
                z = true;
            }
            int i = (hashCode + (z ? 1 : 0)) * 31;
            boolean z3 = this.f84797c;
            if (z3) {
                z3 = true;
            }
            int i2 = (i + (z3 ? 1 : 0)) * 31;
            boolean z4 = this.f84798d;
            if (!z4) {
                z2 = z4;
            }
            return i2 + (z2 ? 1 : 0);
        }

        public String toString() {
            DepLoanCalculation depLoanCalculation = this.f84795a;
            boolean z = this.f84796b;
            boolean z2 = this.f84797c;
            boolean z3 = this.f84798d;
            return "CalculationEvent(calculation=" + depLoanCalculation + ", failed=" + z + ", sentRequest=" + z2 + ", shouldRefresh=" + z3 + ")";
        }

        /* JADX INFO: this call moved to the top of the method (can break code semantics) */
        public /* synthetic */ C35167a(DepLoanCalculation depLoanCalculation, boolean z, boolean z2, boolean z3, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this(depLoanCalculation, (i & 2) != 0 ? false : z, (i & 4) != 0 ? false : z2, (i & 8) != 0 ? false : z3);
        }
    }
}
