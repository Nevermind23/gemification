package p341ge.bog.mobilebank.p975ui.activities;

import a81.C30528a9;
import a81.C30542b9;
import a81.C30556c9;
import a81.C30570d9;
import a81.C30584e9;
import a81.C30598f9;
import a81.C30612g9;
import a81.C30626h9;
import a81.C30640i9;
import a81.C30654j9;
import a81.C30667k9;
import a81.C30680l9;
import a81.C30693m9;
import a81.C30706n9;
import a81.C30719o9;
import a81.C30732p9;
import a81.C30745q9;
import a81.C30758r9;
import a81.C30771s9;
import android.app.Activity;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.res.Configuration;
import android.os.Bundle;
import android.view.View;
import androidx.activity.result.C0173b;
import androidx.fragment.app.C1489c0;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.viewpager.widget.ViewPager;
import de1.C40640a;
import g91.C32290b1;
import g91.C32297d;
import g91.C32303f;
import g91.C32307h;
import g91.C32319m;
import g91.C32330r0;
import g91.C32343x;
import g91.C32355x0;
import g91.C32359z0;
import gd1.C40992a;
import hc1.C41185v;
import hd0.C24978b;
import hd1.C41205b;
import iu0.C36546y;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import jg1.C41438c;
import jg1.C41452l;
import l50.C25832l;
import l50.C25836p;
import l50.C25838r;
import m50.C26144b;
import m50.C26145c;
import m50.C26146d;
import n41.C37353c;
import n50.C26371b;
import n50.C26372c;
import p093g8.C6256b;
import p341ge.bog.mobilebank.cleanarch.domain.products.model.CardBlockStatus;
import p341ge.bog.mobilebank.cleanarch.installment.presentation.C21092b;
import p341ge.bog.mobilebank.cleanarch.loyaltyprograms.presentation.model.BonusCasServiceUiModel;
import p341ge.bog.mobilebank.cleanarch.loyaltyprograms.presentation.model.BonusCashBackUiModel;
import p341ge.bog.mobilebank.cleanarch.loyaltyprograms.presentation.model.BonusScoolUiModel;
import p341ge.bog.mobilebank.cleanarch.loyaltyprograms.presentation.model.BonusWrapperUiModel;
import p341ge.bog.mobilebank.cleanarch.loyaltyprograms.presentation.model.plo.BonusPrloUiModel;
import p341ge.bog.mobilebank.cleanarch.presentation.common.C21503d;
import p341ge.bog.mobilebank.cleanarch.presentation.savinggoal.model.SavingGoalDepositModel;
import p341ge.bog.mobilebank.cleanarch.presentation.savinggoal.p765ui.SavingGoalEditActivity;
import p341ge.bog.mobilebank.eventbus.events.BondsEvent;
import p341ge.bog.mobilebank.eventbus.events.CreditCardsEvent;
import p341ge.bog.mobilebank.eventbus.events.DepositBondsEvent;
import p341ge.bog.mobilebank.eventbus.events.LoanHistoryEvent;
import p341ge.bog.mobilebank.eventbus.events.LoanScheduleEvent;
import p341ge.bog.mobilebank.eventbus.events.LoansEvent;
import p341ge.bog.mobilebank.eventbus.events.PensionsEvent;
import p341ge.bog.mobilebank.eventbus.events.SwipeItemClickEvent;
import p341ge.bog.mobilebank.model.Bond;
import p341ge.bog.mobilebank.model.Client;
import p341ge.bog.mobilebank.model.PensionAccessResult;
import p341ge.bog.mobilebank.model.bonus.BonusType;
import p341ge.bog.mobilebank.model.credit.CreditCardAccount;
import p341ge.bog.mobilebank.model.deposits.Deposit;
import p341ge.bog.mobilebank.model.deposits.SavingGoal;
import p341ge.bog.mobilebank.model.loans.AcctRefEntity;
import p341ge.bog.mobilebank.model.loans.Loan;
import p341ge.bog.mobilebank.model.loans.history.LoanHistoryItem;
import p341ge.bog.mobilebank.p975ui.activities.bonuses.plus.invitation.PlusProgramInvitationActivity;
import p341ge.bog.mobilebank.p975ui.fragments.C35572a;
import p341ge.bog.mobilebank.p975ui.fragments.C35578b;
import p341ge.bog.mobilebank.p975ui.fragments.C35587c;
import p341ge.bog.mobilebank.p975ui.fragments.C35589c0;
import p341ge.bog.mobilebank.p975ui.fragments.C35591d;
import p341ge.bog.mobilebank.p975ui.fragments.C35599f1;
import p341ge.bog.mobilebank.p975ui.fragments.C35604g1;
import p341ge.bog.mobilebank.p975ui.fragments.C35606h0;
import p341ge.bog.mobilebank.p975ui.fragments.C35638l;
import p341ge.bog.mobilebank.p975ui.fragments.C35651n1;
import p341ge.bog.mobilebank.p975ui.fragments.C35662r0;
import p341ge.bog.mobilebank.p975ui.fragments.C35668s0;
import p341ge.bog.mobilebank.p975ui.fragments.C35669t;
import p341ge.bog.mobilebank.rest.BankApi;
import p341ge.bog.mobilebank.rest.manager.PreferencesApiManager;
import p341ge.bog.mobilebank.rest.model.RestCallback;
import p341ge.bog.mobilebank.rest.model.RetrofitClient;
import p341ge.bog.mobilebank.rest.model.otpparameter.BlockCardParams;
import p341ge.bog.mobilebank.shared2.network.BankApiResponse;
import p341ge.bog.mobilebank.transfers.model.TransferForm;
import p342j$.util.Collection$EL;
import p342j$.util.stream.Collectors;
import p366bk.C10319h;
import p366bk.C10328q;
import p366bk.C10329r;
import p729cv.C19804f;
import p745er.C20288a;
import p843nw.C26618a;
import p843nw.C26622e;
import p843nw.C26628j;
import p843nw.C26629k;
import p843nw.C26631m;
import p843nw.C26633o;
import p863pw.C27633k;
import p863pw.C27637o;
import p895sy.C28290a;
import p90.C27390p1;
import p906ty.C28530h;
import p961yy.C30123a;
import pc0.C27494a;
import q31.C38125h;
import q81.C38165c;
import r81.C38308c;
import r81.C38311f;
import r81.C38315j;
import r81.C38316k;
import r81.C38317l;
import r90.C27950a;

/* renamed from: ge.bog.mobilebank.ui.activities.ProductDetailedActivity */
public class ProductDetailedActivity extends C35385f0 implements ViewPager.C1902j, C41185v.C41186a {

    /* renamed from: L0 */
    public static String f85312L0 = "text.result.code.RBC_PLC_INT.UNBLOCK_CARD.3";

    /* renamed from: M0 */
    public static String f85313M0 = "FILTER_CATEGORY";

    /* renamed from: A0 */
    C26631m f85314A0;

    /* renamed from: B0 */
    C26618a f85315B0;

    /* renamed from: C0 */
    ViewPager.C1902j f85316C0 = new C35296a();
    /* access modifiers changed from: private */

    /* renamed from: D0 */
    public int f85317D0;

    /* renamed from: E0 */
    private ArrayList f85318E0 = new ArrayList();

    /* renamed from: F0 */
    private List f85319F0;
    /* access modifiers changed from: private */

    /* renamed from: G */
    public C27390p1 f85320G;
    /* access modifiers changed from: private */

    /* renamed from: G0 */
    public C25836p f85321G0;

    /* renamed from: H */
    protected C30123a f85322H;

    /* renamed from: H0 */
    SwipeItemClickEvent f85323H0;

    /* renamed from: I */
    protected C28290a f85324I;

    /* renamed from: I0 */
    private C25838r f85325I0;

    /* renamed from: J */
    protected BankApi f85326J;

    /* renamed from: J0 */
    private long f85327J0 = -1;

    /* renamed from: K */
    protected Client f85328K;

    /* renamed from: K0 */
    private String f85329K0;

    /* renamed from: L */
    protected C41438c f85330L;

    /* renamed from: M */
    protected C27494a f85331M;

    /* renamed from: N */
    protected C26144b f85332N;

    /* renamed from: O */
    private C35662r0 f85333O;

    /* renamed from: P */
    private C35668s0 f85334P;

    /* renamed from: Q */
    private C35668s0 f85335Q;

    /* renamed from: R */
    private C35606h0 f85336R;

    /* renamed from: S */
    private C35589c0 f85337S;
    /* access modifiers changed from: private */

    /* renamed from: T */
    public C35572a f85338T;

    /* renamed from: U */
    private C35587c f85339U;

    /* renamed from: V */
    private C35578b f85340V;

    /* renamed from: W */
    private C35669t f85341W;

    /* renamed from: X */
    private C35591d f85342X;

    /* renamed from: Y */
    private C35638l f85343Y;

    /* renamed from: Z */
    private C35599f1 f85344Z;

    /* renamed from: a0 */
    private C38308c f85345a0;

    /* renamed from: b0 */
    private C38316k f85346b0;

    /* renamed from: c0 */
    private C38315j f85347c0;

    /* renamed from: d0 */
    private C35651n1 f85348d0;

    /* renamed from: e0 */
    private C38316k f85349e0;

    /* renamed from: f0 */
    private C35604g1 f85350f0;

    /* renamed from: g0 */
    private C38311f f85351g0;

    /* renamed from: h0 */
    private int f85352h0;

    /* renamed from: i0 */
    private long f85353i0;

    /* renamed from: j0 */
    private CreditCardsEvent f85354j0;

    /* renamed from: k0 */
    private BondsEvent f85355k0;

    /* renamed from: l0 */
    private LoansEvent f85356l0;

    /* renamed from: m0 */
    private DepositBondsEvent f85357m0;

    /* renamed from: n0 */
    private PensionsEvent f85358n0;
    /* access modifiers changed from: private */

    /* renamed from: o0 */
    public C35304i f85359o0;
    /* access modifiers changed from: private */

    /* renamed from: p0 */
    public String f85360p0;

    /* renamed from: q0 */
    private boolean f85361q0;

    /* renamed from: r0 */
    private String f85362r0;

    /* renamed from: s0 */
    private BonusWrapperUiModel f85363s0;

    /* renamed from: t0 */
    protected C26146d f85364t0;

    /* renamed from: u0 */
    protected C26145c f85365u0;

    /* renamed from: v0 */
    protected C19804f f85366v0;

    /* renamed from: w0 */
    C26629k f85367w0;

    /* renamed from: x0 */
    C26628j f85368x0;

    /* renamed from: y0 */
    C26622e f85369y0;

    /* renamed from: z0 */
    C26633o f85370z0;

    /* renamed from: ge.bog.mobilebank.ui.activities.ProductDetailedActivity$a */
    class C35296a implements ViewPager.C1902j {
        C35296a() {
        }

        /* renamed from: L */
        public void mo6548L(int i, float f, int i2) {
        }

        /* renamed from: Q */
        public void mo6549Q(int i) {
            String str;
            ProductDetailedActivity.this.f85317D0 = i;
            if (i > 0) {
                ProductDetailedActivity.this.mo86333W3();
            }
            if (ProductDetailedActivity.this.f85359o0 == null || (str = ProductDetailedActivity.this.f85359o0.mo86352w(i)) == null) {
                str = "";
            }
            C36546y.m108282F().mo27152s(ProductDetailedActivity.this.f85360p0, str, "select_sub_tab");
        }

        /* renamed from: l0 */
        public void mo6550l0(int i) {
        }
    }

    /* renamed from: ge.bog.mobilebank.ui.activities.ProductDetailedActivity$b */
    class C35297b implements Runnable {

        /* renamed from: d */
        final /* synthetic */ CreditCardAccount f85372d;

        C35297b(CreditCardAccount creditCardAccount) {
            this.f85372d = creditCardAccount;
        }

        public void run() {
            TransferForm.startWith((Activity) ProductDetailedActivity.this, "TRANSFER", TransferForm.OPERATION_VIEW).setTransferForm(TransferForm.TRANSFER_FORM_OWN).setDestinationAcctKey(this.f85372d.getAcctKey()).setAmount(String.valueOf(this.f85372d.getBillInfo().getMinimumPayment())).start();
        }
    }

    /* renamed from: ge.bog.mobilebank.ui.activities.ProductDetailedActivity$c */
    class C35298c implements Runnable {

        /* renamed from: d */
        final /* synthetic */ CreditCardAccount f85374d;

        C35298c(CreditCardAccount creditCardAccount) {
            this.f85374d = creditCardAccount;
        }

        public void run() {
            TransferForm.startWith((Activity) ProductDetailedActivity.this, "TRANSFER", TransferForm.OPERATION_VIEW).setTransferForm(TransferForm.TRANSFER_FORM_OWN).setDestinationAcctKey(this.f85374d.getAcctKey()).setAmount(String.valueOf(this.f85374d.getBillInfo().getClosingBalance())).start();
        }
    }

    /* renamed from: ge.bog.mobilebank.ui.activities.ProductDetailedActivity$d */
    class C35299d implements View.OnClickListener {

        /* renamed from: d */
        final /* synthetic */ C25838r f85376d;

        C35299d(C25838r rVar) {
            this.f85376d = rVar;
        }

        public void onClick(View view) {
            ProductDetailedActivity.this.m104641g3(this.f85376d);
        }
    }

    /* renamed from: ge.bog.mobilebank.ui.activities.ProductDetailedActivity$e */
    class C35300e implements View.OnClickListener {
        C35300e() {
        }

        public void onClick(View view) {
        }
    }

    /* renamed from: ge.bog.mobilebank.ui.activities.ProductDetailedActivity$f */
    class C35301f extends RestCallback {
        C35301f() {
        }

        public void onFailure(Throwable th) {
            super.onFailure(th);
            ProductDetailedActivity.this.mo86425J1();
        }

        public void onResponse(BankApiResponse bankApiResponse) {
            super.onResponse(bankApiResponse);
            ProductDetailedActivity.this.mo86425J1();
            if (bankApiResponse.getResult() == null || !((PensionAccessResult) bankApiResponse.getResult()).getResult()) {
                C32297d.m95154b(ProductDetailedActivity.this, C27950a.m86284a(bankApiResponse.getKey()));
                return;
            }
            ProductDetailedActivity.this.f85366v0.mo48092a();
            ProductDetailedActivity.this.setResult(-1);
            ProductDetailedActivity.this.finish();
        }
    }

    /* renamed from: ge.bog.mobilebank.ui.activities.ProductDetailedActivity$g */
    class C35302g implements View.OnClickListener {
        C35302g() {
        }

        public void onClick(View view) {
            HashMap hashMap = new HashMap();
            hashMap.put("loanKey", String.valueOf(ProductDetailedActivity.this.f85320G.f69518h.getCurrentLoan().getLoanKey()));
            hashMap.put("from", BankApiResponse.SUCCESSFUL_RESPONSE_CODE);
            hashMap.put("count", "1000000");
            hashMap.put("extras", "1");
            String urlWithExtras = RetrofitClient.getUrlWithExtras(BankApi.LOANS_GET_LND_SCHEDULE_PDF, hashMap);
            C36546y.m108282F().mo27152s("loans", "schedule", "switch_currency");
            ProductDetailedActivity productDetailedActivity = ProductDetailedActivity.this;
            C32303f.m95195f(urlWithExtras, productDetailedActivity, ProductDetailedActivity.this.getString(C10328q.common_downloaded_file_name_schedule) + ".pdf", "application/pdf");
        }
    }

    /* renamed from: ge.bog.mobilebank.ui.activities.ProductDetailedActivity$h */
    class C35303h implements View.OnClickListener {

        /* renamed from: d */
        final /* synthetic */ LoanHistoryEvent f85381d;

        C35303h(LoanHistoryEvent loanHistoryEvent) {
            this.f85381d = loanHistoryEvent;
        }

        public void onClick(View view) {
            String str;
            HashMap hashMap = new HashMap();
            hashMap.put("loanKey", String.valueOf(ProductDetailedActivity.this.f85320G.f69518h.getCurrentLoan().getLoanKey()));
            hashMap.put("from", BankApiResponse.SUCCESSFUL_RESPONSE_CODE);
            hashMap.put("count", "1000000");
            hashMap.put("extras", "1");
            if (this.f85381d.isPln()) {
                str = BankApi.LOANS_GET_PLN_REPAYMENTS_PDF;
            } else {
                str = BankApi.LOANS_GET_LND_REPAYMENTS_PDF;
            }
            String urlWithExtras = RetrofitClient.getUrlWithExtras(str, hashMap);
            C36546y.m108282F().mo27152s("loans", "history", "switch_currency");
            ProductDetailedActivity productDetailedActivity = ProductDetailedActivity.this;
            C32303f.m95195f(urlWithExtras, productDetailedActivity, ProductDetailedActivity.this.getString(C10328q.common_downloaded_file_name_history) + ".pdf", "application/pdf");
        }
    }

    /* renamed from: ge.bog.mobilebank.ui.activities.ProductDetailedActivity$i */
    class C35304i extends C1489c0 {
        /* access modifiers changed from: private */

        /* renamed from: j */
        public final List f85383j = new ArrayList();

        /* renamed from: k */
        private final List f85384k = new ArrayList();

        public C35304i(FragmentManager fragmentManager) {
            super(fragmentManager);
        }

        /* renamed from: d */
        public int mo6557d() {
            return this.f85383j.size();
        }

        /* JADX WARNING: Can't wrap try/catch for region: R(3:23|24|26) */
        /* JADX WARNING: Code restructure failed: missing block: B:27:?, code lost:
            return "";
         */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:23:0x010d */
        /* JADX WARNING: Removed duplicated region for block: B:23:0x010d A[SYNTHETIC, Splitter:B:23:0x010d] */
        /* renamed from: f */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public java.lang.CharSequence mo6559f(int r9) {
            /*
                r8 = this;
                java.util.List r0 = r8.f85384k
                int r0 = r0.size()
                java.lang.String r1 = ""
                if (r9 < r0) goto L_0x000b
                return r1
            L_0x000b:
                ge.bog.mobilebank.ui.activities.ProductDetailedActivity r0 = p341ge.bog.mobilebank.p975ui.activities.ProductDetailedActivity.this
                l50.p r0 = r0.f85321G0
                r2 = 0
                r3 = 1
                if (r0 == 0) goto L_0x0047
                ge.bog.mobilebank.ui.activities.ProductDetailedActivity r0 = p341ge.bog.mobilebank.p975ui.activities.ProductDetailedActivity.this
                l50.p r0 = r0.f85321G0
                l50.o r0 = r0.mo64561a()
                java.util.List r0 = r0.mo64555a()
                ge.bog.mobilebank.ui.activities.ProductDetailedActivity r4 = p341ge.bog.mobilebank.p975ui.activities.ProductDetailedActivity.this
                l50.p r4 = r4.f85321G0
                ge.bog.mobilebank.ui.activities.ProductDetailedActivity r5 = p341ge.bog.mobilebank.p975ui.activities.ProductDetailedActivity.this
                p90.p1 r5 = r5.f85320G
                ge.bog.mobilebank.ui.views.widgets.cardview.CardView r5 = r5.f69518h
                int r5 = r5.getCurrentItem()
                int r4 = n50.C26371b.m82434d(r4, r5)
                java.lang.Object r0 = r0.get(r4)
                l50.l r0 = (l50.C25832l) r0
                boolean r0 = r0.mo64546v()
                if (r0 == 0) goto L_0x0047
                r0 = r3
                goto L_0x0048
            L_0x0047:
                r0 = r2
            L_0x0048:
                if (r0 == 0) goto L_0x010d
                ge.bog.mobilebank.ui.activities.ProductDetailedActivity r0 = p341ge.bog.mobilebank.p975ui.activities.ProductDetailedActivity.this
                ge.bog.mobilebank.ui.fragments.a r0 = r0.f85338T
                if (r0 == 0) goto L_0x010d
                if (r9 != r3) goto L_0x010d
                ge.bog.mobilebank.ui.activities.ProductDetailedActivity r0 = p341ge.bog.mobilebank.p975ui.activities.ProductDetailedActivity.this     // Catch:{ Exception -> 0x010d }
                l50.p r0 = r0.f85321G0     // Catch:{ Exception -> 0x010d }
                l50.o r0 = r0.mo64561a()     // Catch:{ Exception -> 0x010d }
                java.util.List r0 = r0.mo64555a()     // Catch:{ Exception -> 0x010d }
                ge.bog.mobilebank.ui.activities.ProductDetailedActivity r4 = p341ge.bog.mobilebank.p975ui.activities.ProductDetailedActivity.this     // Catch:{ Exception -> 0x010d }
                l50.p r4 = r4.f85321G0     // Catch:{ Exception -> 0x010d }
                ge.bog.mobilebank.ui.activities.ProductDetailedActivity r5 = p341ge.bog.mobilebank.p975ui.activities.ProductDetailedActivity.this     // Catch:{ Exception -> 0x010d }
                p90.p1 r5 = r5.f85320G     // Catch:{ Exception -> 0x010d }
                ge.bog.mobilebank.ui.views.widgets.cardview.CardView r5 = r5.f69518h     // Catch:{ Exception -> 0x010d }
                int r5 = r5.getCurrentItem()     // Catch:{ Exception -> 0x010d }
                int r4 = n50.C26371b.m82434d(r4, r5)     // Catch:{ Exception -> 0x010d }
                java.lang.Object r0 = r0.get(r4)     // Catch:{ Exception -> 0x010d }
                l50.l r0 = (l50.C25832l) r0     // Catch:{ Exception -> 0x010d }
                boolean r0 = r0.mo64542s()     // Catch:{ Exception -> 0x010d }
                android.text.SpannableStringBuilder r4 = new android.text.SpannableStringBuilder     // Catch:{ Exception -> 0x010d }
                r4.<init>()     // Catch:{ Exception -> 0x010d }
                ge.bog.mobilebank.ui.activities.ProductDetailedActivity r5 = p341ge.bog.mobilebank.p975ui.activities.ProductDetailedActivity.this     // Catch:{ Exception -> 0x010d }
                java.util.List r6 = r8.f85384k     // Catch:{ Exception -> 0x010d }
                java.lang.Object r6 = r6.get(r9)     // Catch:{ Exception -> 0x010d }
                java.lang.Integer r6 = (java.lang.Integer) r6     // Catch:{ Exception -> 0x010d }
                int r6 = r6.intValue()     // Catch:{ Exception -> 0x010d }
                java.lang.String r5 = r5.getString(r6)     // Catch:{ Exception -> 0x010d }
                r4.append(r5)     // Catch:{ Exception -> 0x010d }
                if (r0 != 0) goto L_0x00d8
                ge.bog.mobilebank.ui.activities.ProductDetailedActivity r0 = p341ge.bog.mobilebank.p975ui.activities.ProductDetailedActivity.this     // Catch:{ Exception -> 0x010d }
                ge.bog.mobilebank.ui.fragments.a r0 = r0.f85338T     // Catch:{ Exception -> 0x010d }
                java.util.List r0 = r0.mo86629k1()     // Catch:{ Exception -> 0x010d }
                int r0 = r0.size()     // Catch:{ Exception -> 0x010d }
                if (r0 <= 0) goto L_0x00d3
                java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x010d }
                r0.<init>()     // Catch:{ Exception -> 0x010d }
                java.lang.String r2 = " ("
                r0.append(r2)     // Catch:{ Exception -> 0x010d }
                ge.bog.mobilebank.ui.activities.ProductDetailedActivity r2 = p341ge.bog.mobilebank.p975ui.activities.ProductDetailedActivity.this     // Catch:{ Exception -> 0x010d }
                ge.bog.mobilebank.ui.fragments.a r2 = r2.f85338T     // Catch:{ Exception -> 0x010d }
                java.util.List r2 = r2.mo86629k1()     // Catch:{ Exception -> 0x010d }
                int r2 = r2.size()     // Catch:{ Exception -> 0x010d }
                r0.append(r2)     // Catch:{ Exception -> 0x010d }
                java.lang.String r2 = ")"
                r0.append(r2)     // Catch:{ Exception -> 0x010d }
                java.lang.String r0 = r0.toString()     // Catch:{ Exception -> 0x010d }
                goto L_0x00d4
            L_0x00d3:
                r0 = r1
            L_0x00d4:
                r4.append(r0)     // Catch:{ Exception -> 0x010d }
                goto L_0x010c
            L_0x00d8:
                java.lang.String r0 = " "
                r4.append(r0)     // Catch:{ Exception -> 0x010d }
                ge.bog.mobilebank.ui.activities.ProductDetailedActivity r0 = p341ge.bog.mobilebank.p975ui.activities.ProductDetailedActivity.this     // Catch:{ Exception -> 0x010d }
                android.content.res.Resources r0 = r0.getResources()     // Catch:{ Exception -> 0x010d }
                int r5 = p366bk.C10320i.ic_card_renewal     // Catch:{ Exception -> 0x010d }
                android.graphics.drawable.Drawable r0 = r0.getDrawable(r5)     // Catch:{ Exception -> 0x010d }
                int r5 = r0.getIntrinsicWidth()     // Catch:{ Exception -> 0x010d }
                int r5 = r5 + -5
                int r6 = r0.getIntrinsicHeight()     // Catch:{ Exception -> 0x010d }
                int r6 = r6 + -5
                r7 = 2
                r0.setBounds(r7, r7, r5, r6)     // Catch:{ Exception -> 0x010d }
                android.text.style.ImageSpan r5 = new android.text.style.ImageSpan     // Catch:{ Exception -> 0x010d }
                r5.<init>(r0, r2)     // Catch:{ Exception -> 0x010d }
                int r0 = r4.length()     // Catch:{ Exception -> 0x010d }
                int r0 = r0 - r3
                int r2 = r4.length()     // Catch:{ Exception -> 0x010d }
                r3 = 33
                r4.setSpan(r5, r0, r2, r3)     // Catch:{ Exception -> 0x010d }
            L_0x010c:
                return r4
            L_0x010d:
                ge.bog.mobilebank.ui.activities.ProductDetailedActivity r0 = p341ge.bog.mobilebank.p975ui.activities.ProductDetailedActivity.this     // Catch:{ Exception -> 0x011f }
                java.util.List r2 = r8.f85384k     // Catch:{ Exception -> 0x011f }
                java.lang.Object r9 = r2.get(r9)     // Catch:{ Exception -> 0x011f }
                java.lang.Integer r9 = (java.lang.Integer) r9     // Catch:{ Exception -> 0x011f }
                int r9 = r9.intValue()     // Catch:{ Exception -> 0x011f }
                java.lang.String r1 = r0.getString(r9)     // Catch:{ Exception -> 0x011f }
            L_0x011f:
                return r1
            */
            throw new UnsupportedOperationException("Method not decompiled: p341ge.bog.mobilebank.p975ui.activities.ProductDetailedActivity.C35304i.mo6559f(int):java.lang.CharSequence");
        }

        /* renamed from: t */
        public Fragment mo4602t(int i) {
            return (Fragment) this.f85383j.get(i);
        }

        /* renamed from: v */
        public void mo86351v(C35651n1 n1Var, int i) {
            this.f85383j.add(n1Var);
            this.f85384k.add(Integer.valueOf(i));
        }

        /* renamed from: w */
        public String mo86352w(int i) {
            try {
                Configuration configuration = new Configuration(ProductDetailedActivity.this.getResources().getConfiguration());
                configuration.setLocale(new Locale(C37353c.EN.mo90434c()));
                return ProductDetailedActivity.this.createConfigurationContext(configuration).getResources().getString(((Integer) this.f85384k.get(i)).intValue());
            } catch (Exception unused) {
                return "";
            }
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: A3 */
    public /* synthetic */ void m104591A3(ArrayList arrayList, Long l) {
        int i;
        arrayList.remove(l);
        if (arrayList.isEmpty()) {
            mo86425J1();
            List i3 = m104643i3(this.f85319F0);
            this.f85320G.f69518h.setDefIndex(m104646m3(i3));
            this.f85320G.f69518h.setAccountCards(i3, this.f85318E0);
            m104622R3(this.f85320G.f69518h.getCurrentItem());
            C27390p1 p1Var = this.f85320G;
            if (p1Var != null && p1Var.f69521k.getAdapter() != null && this.f85320G.f69521k.getAdapter().mo6557d() > (i = this.f85317D0)) {
                this.f85320G.f69521k.setCurrentItem(i);
            }
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: B3 */
    public /* synthetic */ void m104592B3(CardBlockStatus cardBlockStatus) {
        this.f85318E0.add(cardBlockStatus);
    }

    /* access modifiers changed from: private */
    /* renamed from: C3 */
    public static /* synthetic */ void m104593C3(Throwable th) {
    }

    /* access modifiers changed from: private */
    /* renamed from: D3 */
    public /* synthetic */ void m104594D3(DialogInterface dialogInterface, int i) {
        m104648o3();
    }

    /* access modifiers changed from: private */
    /* renamed from: E3 */
    public static /* synthetic */ void m104596E3(DialogInterface dialogInterface, int i) {
    }

    /* access modifiers changed from: private */
    /* renamed from: F3 */
    public /* synthetic */ void m104598F3(C41205b bVar) {
        if (m104645k3() != null) {
            m104645k3().mo95635L2(true);
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: G3 */
    public /* synthetic */ void m104600G3(C27637o oVar) {
        if (m104645k3() != null) {
            m104645k3().mo4577k1();
        }
        C25832l a = C26371b.m82431a(this.f85321G0, this.f85353i0);
        if (a != null) {
            this.f85319F0 = a.mo64522a();
        }
        m104630V3();
    }

    /* access modifiers changed from: private */
    /* renamed from: H3 */
    public /* synthetic */ void m104602H3(Throwable th) {
        if (m104645k3() != null) {
            m104645k3().mo95635L2(false);
        }
        C21503d.C21504a aVar = new C21503d.C21504a(th, (Object) null);
        if (aVar.mo53708h() && m104645k3() != null) {
            m104645k3().mo95634K2(C27950a.m86284a(aVar.mo53705e()));
        } else if (aVar.mo53707g()) {
            if (m104645k3() != null) {
                m104645k3().mo4577k1();
            }
            if (aVar.mo53705e().equals(f85312L0)) {
                C32297d.m95160h(this, C27950a.m86284a(aVar.mo53705e()));
                m104630V3();
                return;
            }
            C32297d.m95154b(this, C27950a.m86284a(aVar.mo53705e()));
        } else {
            if (m104645k3() != null) {
                m104645k3().mo4577k1();
            }
            C32297d.m95154b(this, C27950a.m86284a(aVar.mo53705e()));
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: I3 */
    public void m104604I3(C28530h hVar) {
        int i;
        mo86425J1();
        BonusWrapperUiModel h = this.f85322H.mo70417h(hVar);
        this.f85363s0 = h;
        h.mo52800k((BonusPrloUiModel) null);
        this.f85320G.f69518h.setBonusWrapper(this.f85352h0, h, this.f85328K);
        C27390p1 p1Var = this.f85320G;
        p1Var.f69519i.setViewPager(p1Var.f69518h);
        m104622R3(this.f85320G.f69518h.getCurrentItem());
        C27390p1 p1Var2 = this.f85320G;
        if (p1Var2 != null && p1Var2.f69521k.getAdapter() != null && this.f85320G.f69521k.getAdapter().mo6557d() > (i = this.f85317D0)) {
            this.f85320G.f69521k.setCurrentItem(i);
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: J3 */
    public void m104606J3(Throwable th) {
        mo86425J1();
    }

    /* access modifiers changed from: private */
    /* renamed from: K3 */
    public void m104608K3(C41205b bVar) {
        mo86441o2();
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v6, resolved type: java.lang.String[]} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v2, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v1, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v2, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v3, resolved type: android.text.SpannableStringBuilder} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v8, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v3, resolved type: java.lang.String} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* renamed from: L3 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void m104610L3() {
        /*
            r9 = this;
            ge.bog.mobilebank.eventbus.events.LoansEvent r0 = r9.f85356l0
            ge.bog.mobilebank.model.loans.LoansWrapper r0 = r0.getLoansWrapper()
            java.util.ArrayList r0 = r0.getLoans()
            ge.bog.mobilebank.eventbus.events.SwipeItemClickEvent r1 = r9.f85323H0
            int r1 = r1.getPosition()
            java.lang.Object r0 = r0.get(r1)
            ge.bog.mobilebank.model.loans.Loan r0 = (p341ge.bog.mobilebank.model.loans.Loan) r0
            ge.bog.mobilebank.model.loans.LoanDetailsWrapper r1 = r0.getDetails()
            ge.bog.mobilebank.model.loans.LoanDetails r1 = r1.getDetails()
            java.lang.String r1 = r1.getReversalStatusDictionaryKey()
            ge.bog.mobilebank.model.loans.LoanDetailsWrapper r2 = r0.getDetails()     // Catch:{ Exception -> 0x002f }
            ge.bog.mobilebank.model.loans.schedule.LoanSchedule r2 = r2.getSchedule()     // Catch:{ Exception -> 0x002f }
            java.lang.String r2 = r2.getLoanNo()     // Catch:{ Exception -> 0x002f }
            goto L_0x0031
        L_0x002f:
            java.lang.String r2 = ""
        L_0x0031:
            r3 = 1
            java.lang.Object[] r4 = new java.lang.Object[r3]
            r5 = 0
            r4[r5] = r2
            java.lang.String r1 = r90.C27950a.m86291h(r1, r4)
            java.lang.String r4 = "<2>"
            java.lang.String[] r1 = r1.split(r4)
            r4 = r1[r5]
            r5 = r1[r3]
            ge.bog.mobilebank.model.loans.LoanDetailsWrapper r6 = r0.getDetails()
            ge.bog.mobilebank.model.loans.MerchantDetails r6 = r6.mmsDetails
            r7 = 0
            if (r6 == 0) goto L_0x0057
            ge.bog.mobilebank.model.loans.LoanDetailsWrapper r0 = r0.getDetails()
            ge.bog.mobilebank.model.loans.MerchantDetails r0 = r0.mmsDetails
            java.lang.String r0 = r0.merchantPhoneNumber
            goto L_0x0058
        L_0x0057:
            r0 = r7
        L_0x0058:
            boolean r6 = android.text.TextUtils.isEmpty(r2)
            if (r6 != 0) goto L_0x0083
            android.text.SpannableStringBuilder r6 = new android.text.SpannableStringBuilder     // Catch:{ Exception -> 0x0083 }
            r1 = r1[r3]     // Catch:{ Exception -> 0x0083 }
            r6.<init>(r1)     // Catch:{ Exception -> 0x0083 }
            java.lang.String r1 = r5.toString()     // Catch:{ Exception -> 0x0083 }
            int r1 = r1.indexOf(r2)     // Catch:{ Exception -> 0x0083 }
            ge.bog.mobilebank.ui.views.widgets.util.CustomTypefaceSpan r3 = new ge.bog.mobilebank.ui.views.widgets.util.CustomTypefaceSpan     // Catch:{ Exception -> 0x0083 }
            int r8 = p366bk.C10321j.f28705a     // Catch:{ Exception -> 0x0083 }
            android.graphics.Typeface r8 = androidx.core.content.res.C0808h.m3033h(r9, r8)     // Catch:{ Exception -> 0x0083 }
            r3.<init>(r8)     // Catch:{ Exception -> 0x0083 }
            int r2 = r2.length()     // Catch:{ Exception -> 0x0083 }
            int r2 = r2 + r1
            r8 = 33
            r6.setSpan(r3, r1, r2, r8)     // Catch:{ Exception -> 0x0083 }
            r5 = r6
        L_0x0083:
            wx.e r0 = p938wx.C29588e.m89821l2(r4, r5, r0)
            androidx.fragment.app.FragmentManager r1 = r9.getSupportFragmentManager()
            r0.mo4576A1(r1, r7)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p341ge.bog.mobilebank.p975ui.activities.ProductDetailedActivity.m104610L3():void");
    }

    /* renamed from: M3 */
    private void m104612M3(List list) {
        if (list != null) {
            this.f85318E0 = new ArrayList();
            ArrayList arrayList = new ArrayList();
            Iterator it = list.iterator();
            while (it.hasNext()) {
                arrayList.add(Long.valueOf(((C25838r) it.next()).mo64582h()));
            }
            if (arrayList.size() > 0) {
                mo86441o2();
                Iterator it2 = arrayList.iterator();
                while (it2.hasNext()) {
                    Long l = (Long) it2.next();
                    mo86438k1(this.f85367w0.mo65883a(l.longValue()).mo95063B(C40992a.m118827a()).mo95080i(new C30680l9(this, arrayList, l)).mo95070I(new C30693m9(this), new C30706n9()));
                }
            }
        }
    }

    /* renamed from: N3 */
    private void m104614N3() {
        int i;
        C27390p1 p1Var = this.f85320G;
        if (p1Var != null && p1Var.f69521k.getAdapter() != null && this.f85320G.f69521k.getAdapter().mo6557d() > (i = this.f85317D0)) {
            this.f85320G.f69521k.setCurrentItem(i);
        }
    }

    /* renamed from: O3 */
    private void m104616O3(boolean z) {
        C35572a aVar = this.f85338T;
        if (aVar != null) {
            aVar.mo86631m1(z);
        }
    }

    /* renamed from: P3 */
    private void m104618P3(boolean z) {
        boolean z2;
        boolean v = ((C25832l) this.f85321G0.mo64561a().mo64555a().get(C26371b.m82434d(this.f85321G0, this.f85320G.f69518h.getCurrentItem()))).mo64546v();
        C35304i iVar = this.f85359o0;
        if (iVar == null || iVar.f85383j.size() != 3) {
            z2 = false;
        } else {
            z2 = true;
        }
        if (z || z2 != v) {
            this.f85320G.f69521k.removeAllViews();
            this.f85359o0 = new C35304i(getSupportFragmentManager());
            if (this.f85339U == null) {
                this.f85339U = new C35587c();
            }
            if (this.f85340V == null) {
                this.f85340V = new C35578b();
            }
            if (this.f85338T == null) {
                this.f85338T = new C35572a();
            }
            this.f85359o0.mo86351v(this.f85339U, C10328q.product_details_tab_title_operations);
            if (v) {
                this.f85359o0.mo86351v(this.f85338T, C10328q.product_details_tab_title_cards);
            }
            this.f85359o0.mo86351v(this.f85340V, C10328q.f28969z1);
            this.f85320G.f69521k.setAdapter(this.f85359o0);
        }
    }

    /* renamed from: Q3 */
    private void m104620Q3(boolean z) {
        boolean z2;
        boolean z3;
        boolean z4;
        if (mo86335l3(this.f85320G.f69518h.getCurrentItem()) instanceof Deposit) {
            if (!((Deposit) mo86335l3(this.f85320G.f69518h.getCurrentItem())).hasOperations() || ((Deposit) mo86335l3(this.f85320G.f69518h.getCurrentItem())).isMaxima()) {
                z2 = false;
            } else {
                z2 = true;
            }
            boolean isMaxima = ((Deposit) mo86335l3(this.f85320G.f69518h.getCurrentItem())).isMaxima();
            C35304i iVar = this.f85359o0;
            if (iVar == null || iVar.f85383j.size() != 2) {
                z3 = false;
            } else {
                z3 = true;
            }
            C35304i iVar2 = this.f85359o0;
            if (iVar2 == null || iVar2.f85383j.size() != 3) {
                z4 = false;
            } else {
                z4 = true;
            }
            if (z || z4 != isMaxima || z2 != z3) {
                this.f85320G.f69521k.removeAllViews();
                this.f85359o0 = new C35304i(getSupportFragmentManager());
                if (this.f85336R == null) {
                    this.f85336R = new C35606h0();
                }
                if (this.f85339U == null) {
                    this.f85339U = new C35587c();
                }
                if (this.f85338T == null) {
                    this.f85338T = new C35572a();
                }
                if (isMaxima) {
                    this.f85359o0.mo86351v(this.f85339U, C10328q.product_details_tab_title_operations);
                    this.f85359o0.mo86351v(this.f85338T, C10328q.product_details_tab_title_cards);
                    this.f85320G.f69521k.setFingerSwipable(true);
                    this.f85320G.f69520j.setVisibility(0);
                } else if (z2) {
                    this.f85359o0.mo86351v(this.f85339U, C10328q.product_details_tab_title_operations);
                    this.f85320G.f69521k.setFingerSwipable(true);
                    this.f85320G.f69520j.setVisibility(0);
                } else {
                    this.f85320G.f69521k.setFingerSwipable(false);
                    this.f85320G.f69520j.setVisibility(8);
                }
                this.f85359o0.mo86351v(this.f85336R, C10328q.product_details_tab_title_details);
                this.f85320G.f69521k.setAdapter(this.f85359o0);
            }
        } else if (z || !(this.f85359o0.f85383j.get(0) instanceof C35589c0)) {
            this.f85320G.f69521k.removeAllViews();
            this.f85359o0 = new C35304i(getSupportFragmentManager());
            if (this.f85337S == null) {
                this.f85337S = new C35589c0();
            }
            this.f85359o0.mo86351v(this.f85337S, C10328q.product_details_tab_title_details);
            this.f85320G.f69521k.setAdapter(this.f85359o0);
        }
    }

    /* renamed from: R3 */
    private void m104622R3(int i) {
        String str;
        int i2 = this.f85352h0;
        if (i2 == 3) {
            Loan loan = this.f85320G.f69518h.getLoans().getLoans().get(i);
            this.f85333O.mo86753l1(loan, this.f85320G.f69518h.getLoans().getLoans().get(i).getDetails());
            if (m104651r3(loan)) {
                str = C27950a.m86284a("products.loans.cosigner.header");
            } else {
                str = getString(C10328q.f28957f5);
            }
            mo86429X1(str);
        } else if (i2 == 1) {
            C25832l lVar = (C25832l) this.f85320G.f69518h.getAccounts().mo64561a().mo64555a().get(C26371b.m82434d(this.f85320G.f69518h.getAccounts(), i));
            this.f85338T.mo86628j1(lVar.mo64522a(), lVar.mo64529g(), "accounts");
            this.f85340V.mo86646n1(lVar);
            this.f85339U.mo86659n1(lVar);
            this.f85320G.f69521k.getAdapter().mo6561j();
        } else if (i2 == 2) {
            CreditCardAccount creditCardAccount = this.f85320G.f69518h.getCredits().getCardsContainer().getAccounts().get(this.f85320G.f69518h.getCredits().getRealPositionByVisiblePosition(i));
            this.f85338T.mo86628j1(creditCardAccount.getAccountCreditCards(), creditCardAccount.getAcctKey(), "credit_cards");
            this.f85341W.mo86766s1(creditCardAccount);
            this.f85339U.mo86658m1(creditCardAccount);
            this.f85320G.f69521k.getAdapter().mo6561j();
        } else if (i2 != 6) {
            if (i2 == 5) {
                Bond bond = this.f85320G.f69518h.getBondsWrapper().getBonds().get(i);
                if (bond.getCashAgreements() == null) {
                    this.f85342X.mo86666i1(bond);
                    this.f85320G.f69521k.setCurrentItem(1);
                } else {
                    this.f85320G.f69521k.setCurrentItem(0);
                    this.f85343Y.mo86723i1(bond);
                }
                this.f85320G.f69521k.setFingerSwipable(false);
                this.f85320G.f69520j.setVisibility(8);
            } else if (i2 == 8) {
                this.f85320G.f69520j.setVisibility(0);
                this.f85346b0.mo91862k1(BigDecimal.valueOf(this.f85363s0.mo52790a().mo52702g().doubleValue()));
                this.f85347c0.mo91861i1(this.f85363s0.mo52790a());
                C35304i iVar = new C35304i(getSupportFragmentManager());
                this.f85359o0 = iVar;
                iVar.mo86351v(this.f85345a0, C10328q.product_details_tab_title_mr_catalog);
                this.f85359o0.mo86351v(this.f85346b0, C10328q.product_details_tab_title_history);
                this.f85359o0.mo86351v(this.f85347c0, C10328q.product_details_tab_title_details);
                this.f85320G.f69521k.setAdapter(this.f85359o0);
            } else if (i2 == 16) {
                this.f85320G.f69520j.setVisibility(0);
                this.f85349e0.mo91862k1(BigDecimal.valueOf(this.f85363s0.mo52796g().mo52770j().doubleValue()));
                this.f85350f0.mo86678i1(this.f85363s0.mo52796g());
                C35304i iVar2 = new C35304i(getSupportFragmentManager());
                this.f85359o0 = iVar2;
                iVar2.mo86351v(this.f85348d0, C10328q.product_details_tab_title_catalog);
                this.f85359o0.mo86351v(this.f85349e0, C10328q.product_details_tab_title_history);
                this.f85359o0.mo86351v(this.f85350f0, C10328q.product_details_tab_title_details);
                this.f85320G.f69521k.setAdapter(this.f85359o0);
            } else if (i2 == 10) {
                this.f85351g0.mo91860k1((BonusCashBackUiModel) this.f85363s0.mo52795f().get(0));
                C35304i iVar3 = new C35304i(getSupportFragmentManager());
                this.f85359o0 = iVar3;
                iVar3.mo86351v(this.f85351g0, C10328q.common_text_empty);
                this.f85320G.f69521k.setAdapter(this.f85359o0);
                this.f85320G.f69520j.setVisibility(8);
            } else if (i2 == 15) {
                C35304i iVar4 = new C35304i(getSupportFragmentManager());
                this.f85359o0 = iVar4;
                iVar4.mo86351v(C38317l.m112603j1(((BonusScoolUiModel) this.f85320G.f69518h.getBonusesHelper().mo72827a(i)).mo52778b().longValue()), C10328q.common_text_empty);
                this.f85320G.f69521k.setAdapter(this.f85359o0);
                this.f85320G.f69520j.setVisibility(8);
            } else if (m104649p3()) {
                C35304i iVar5 = new C35304i(getSupportFragmentManager());
                this.f85359o0 = iVar5;
                this.f85320G.f69521k.setAdapter(iVar5);
            } else if (this.f85352h0 == 18) {
                this.f85320G.f69521k.setCurrentItem(0);
                this.f85320G.f69521k.getAdapter().mo6561j();
            }
        }
        if (this.f85320G.f69521k.getAdapter() != null) {
            this.f85320G.f69521k.getAdapter().mo6561j();
        }
        this.f85320G.f69520j.resetFonts();
    }

    /* renamed from: S3 */
    private void m104624S3(boolean z) {
        boolean z2;
        boolean z3 = !this.f85356l0.getLoansWrapper().getLoans().get(this.f85320G.f69518h.getCurrentItem()).isPln();
        C35304i iVar = this.f85359o0;
        if (iVar == null || iVar.f85383j.size() != 3) {
            z2 = false;
        } else {
            z2 = true;
        }
        if (z || z2 != z3) {
            this.f85320G.f69521k.removeAllViews();
            this.f85359o0 = new C35304i(getSupportFragmentManager());
            if (this.f85333O == null) {
                this.f85333O = new C35662r0();
            }
            if (this.f85334P == null) {
                this.f85334P = new C35668s0();
            }
            if (this.f85335Q == null) {
                this.f85335Q = new C35668s0();
            }
            this.f85359o0.mo86351v(this.f85333O, C10328q.product_details_tab_title_details);
            if (z3) {
                this.f85359o0.mo86351v(this.f85334P, C10328q.product_details_tab_title_schedule);
            }
            this.f85359o0.mo86351v(this.f85335Q, C10328q.product_details_tab_title_history);
            this.f85320G.f69521k.setAdapter(this.f85359o0);
            if (this.f85361q0) {
                try {
                    getIntent().removeExtra("SHOW_HISTORY_TAB");
                    this.f85320G.f69520j.getTabAt(this.f85359o0.mo6557d() - 1).mo16964m();
                    this.f85335Q.onClick((View) null);
                } catch (Exception unused) {
                }
            }
        }
    }

    /* renamed from: T3 */
    private void m104626T3() {
        new C6256b(this, C10329r.MaterialDialogStyle).setTitle(C27950a.m86284a("text.georgian.pension.funds.title")).setMessage(C27950a.m86284a("text.georgian.pension.funds.disable.question")).setPositiveButton(getString(C10328q.f28966r2), new C30598f9(this)).setNegativeButton(C10328q.f28951b2, new C30612g9()).setCancelable(true).show();
    }

    /* renamed from: U3 */
    private void m104628U3(String str, String str2, String str3) {
        if (m104640f3()) {
            mo86438k1(this.f85315B0.mo65872a(this.f85331M.mo66809a(m104647n3(str, str2, str3))).mo94897f(this.f85370z0.mo65885b()).mo95027o0(C40992a.m118827a()).mo94980F(new C30758r9(this)).mo94983G0(new C30771s9(this), new C30542b9(this)));
        }
    }

    /* renamed from: V3 */
    private void m104630V3() {
        List list = this.f85319F0;
        if (list != null) {
            m104612M3(list);
        }
    }

    /* renamed from: e3 */
    private void m104639e3() {
    }

    /* renamed from: f3 */
    private boolean m104640f3() {
        ArrayList arrayList;
        if (this.f85325I0 == null || (arrayList = this.f85318E0) == null) {
            return false;
        }
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            if (this.f85325I0.mo64582h() == ((CardBlockStatus) it.next()).mo52082a()) {
                return true;
            }
        }
        return false;
    }

    /* access modifiers changed from: private */
    /* renamed from: g3 */
    public void m104641g3(C25838r rVar) {
        C26622e eVar = this.f85369y0;
        String s = rVar.mo64594s();
        String valueOf = String.valueOf(rVar.mo64582h());
        C24978b x = rVar.mo64600x();
        C24978b bVar = C24978b.YES;
        if (x == bVar) {
            bVar = C24978b.NO;
        }
        mo86438k1(eVar.mo65876a(s, valueOf, bVar).mo94906z(C40992a.m118827a()).mo94888G(new C30626h9(this), new C30640i9()));
    }

    /* renamed from: h3 */
    private void m104642h3(long j, String str) {
        if (C32303f.m95213x(this)) {
            String d = C32303f.m95193d(j, str);
            C32303f.m95195f(d, this, getString(C10328q.f28922Da) + ".pdf", "application/pdf");
            return;
        }
        this.f85327J0 = j;
        this.f85329K0 = str;
        new C32330r0((Activity) this).mo72838y(10016);
    }

    /* renamed from: i3 */
    private List m104643i3(List list) {
        return (List) Collection$EL.stream(list).filter(new C30654j9()).collect(Collectors.toList());
    }

    /* renamed from: j3 */
    private void m104644j3() {
        if (this.f85328K.isAuthorized()) {
            mo86438k1(this.f85368x0.mo65881b().mo95027o0(C40992a.m118827a()).mo94980F(new C30556c9(this)).mo94983G0(new C30570d9(this), new C30584e9(this)));
        }
    }

    /* renamed from: k3 */
    private C41185v m104645k3() {
        return C20288a.m66330e(getSupportFragmentManager(), "SCA_CARD_BLOCK_TAG");
    }

    /* renamed from: m3 */
    private int m104646m3(List list) {
        C25838r rVar = (C25838r) this.f85319F0.get(getIntent().getIntExtra("PRODUCT_INDEX", 0));
        for (int i = 0; i < list.size(); i++) {
            if (((C25838r) list.get(i)).mo64582h() == rVar.mo64582h()) {
                return i;
            }
        }
        return -1;
    }

    /* renamed from: n3 */
    private BlockCardParams m104647n3(String str, String str2, String str3) {
        String str4;
        String valueOf = String.valueOf(this.f85325I0.mo64582h());
        if (m104650q3()) {
            str4 = BankApi.SERVICE_UNBLOCK_CARD;
        } else {
            str4 = BankApi.SERVICE_BLOCK_CARD;
        }
        return new BlockCardParams(valueOf, str4, str, str2, str3);
    }

    /* renamed from: o3 */
    private void m104648o3() {
        mo86441o2();
        this.f85326J.removePensionAccess(new C35301f());
    }

    /* renamed from: p3 */
    private boolean m104649p3() {
        int i = this.f85352h0;
        if (i == 15 || i == 16) {
            return true;
        }
        switch (i) {
            case 8:
            case 9:
            case 10:
                return true;
            default:
                return false;
        }
    }

    /* renamed from: q3 */
    private boolean m104650q3() {
        ArrayList arrayList;
        if (this.f85325I0 == null || (arrayList = this.f85318E0) == null) {
            return false;
        }
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            CardBlockStatus cardBlockStatus = (CardBlockStatus) it.next();
            if (this.f85325I0.mo64582h() == cardBlockStatus.mo52082a() && cardBlockStatus.mo52083b() == C24978b.YES) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: r3 */
    private boolean m104651r3(Loan loan) {
        return loan != null && loan.acctRef == AcctRefEntity.COSIGNER;
    }

    /* access modifiers changed from: private */
    /* renamed from: s3 */
    public /* synthetic */ void m104652s3() {
        C35572a aVar = this.f85338T;
        if (aVar != null) {
            aVar.mo86630l1();
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: t3 */
    public static /* synthetic */ void m104653t3(Throwable th) {
    }

    /* access modifiers changed from: private */
    /* renamed from: u3 */
    public static /* synthetic */ boolean m104654u3(C25838r rVar) {
        return !rVar.mo64599w().mo63390c();
    }

    /* access modifiers changed from: private */
    /* renamed from: v3 */
    public /* synthetic */ void m104655v3(C41205b bVar) {
        mo86441o2();
    }

    /* access modifiers changed from: private */
    /* renamed from: w3 */
    public /* synthetic */ void m104656w3(C27633k kVar) {
        C25832l a;
        int i;
        mo86425J1();
        C25836p i2 = this.f85332N.mo65068i(kVar);
        this.f85321G0 = i2;
        int i3 = this.f85352h0;
        if (i3 == 1) {
            m104618P3(true);
            this.f85320G.f69518h.setAccount(this.f85321G0);
            C27390p1 p1Var = this.f85320G;
            p1Var.f69519i.setViewPager(p1Var.f69518h);
            m104622R3(this.f85320G.f69518h.getCurrentItem());
            C27390p1 p1Var2 = this.f85320G;
            if (p1Var2 != null && p1Var2.f69521k.getAdapter() != null && this.f85320G.f69521k.getAdapter().mo6557d() > (i = this.f85317D0)) {
                this.f85320G.f69521k.setCurrentItem(i);
            }
        } else if (i3 == 6 && (a = C26371b.m82431a(i2, this.f85353i0)) != null) {
            List a2 = a.mo64522a();
            this.f85319F0 = a2;
            m104612M3(a2);
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: x3 */
    public /* synthetic */ void m104657x3(Throwable th) {
        mo86425J1();
    }

    /* access modifiers changed from: private */
    /* renamed from: y3 */
    public static /* synthetic */ void m104658y3(Throwable th) {
    }

    /* access modifiers changed from: private */
    /* renamed from: z3 */
    public /* synthetic */ void m104659z3(boolean z, C25838r rVar, C27637o oVar) {
        C25838r rVar2;
        Iterator it = C26372c.m82438a(this.f85364t0.mo65075c(oVar)).iterator();
        while (true) {
            if (!it.hasNext()) {
                rVar2 = null;
                break;
            }
            rVar2 = (C25838r) it.next();
            if (rVar2.mo64600x().mo63390c()) {
                break;
            }
        }
        if (z || rVar2 == null) {
            m104641g3(rVar);
            return;
        }
        String str = getString(C10328q.product_details_dialog_favorite_card_text) + " " + rVar2.mo64587l() + " " + C32307h.m95232i(rVar2.mo64593r()) + "\n" + getString(C10328q.product_details_dialog_favorite_card_question);
        mo86437j2(getString(C10328q.product_details_dialog_favorite_card_title), str, getString(C10328q.f28931K0), getString(C10328q.button_text_close), new C35299d(rVar), new C35300e(), false);
    }

    /* renamed from: L */
    public void mo6548L(int i, float f, int i2) {
    }

    /* renamed from: O */
    public void mo37615O(String str, String str2, String str3, String str4) {
        if (this.f85325I0 != null && "SCA_CARD_BLOCK_TAG".equals(str4)) {
            m104628U3(str, str2, str3);
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: O1 */
    public void mo37451O1(Bundle bundle) {
        C27390p1 d = C27390p1.m84864d(getLayoutInflater());
        this.f85320G = d;
        super.mo70996D2(bundle, d);
        this.f85362r0 = getIntent().getStringExtra(f85313M0);
        this.f85352h0 = getIntent().getIntExtra("PRODUCT_TYPE_KEY", -1);
        this.f85353i0 = getIntent().getLongExtra("PRODUCT_KEY", -1);
        this.f85320G.f69518h.setDefIndex(getIntent().getIntExtra("PRODUCT_INDEX", 0));
        this.f85361q0 = getIntent().getBooleanExtra("SHOW_HISTORY_TAB", false);
        this.f85320G.f69518h.addOnPageChangeListener(this);
        this.f85320G.f69518h.setEventBus(this.f85330L);
        this.f85359o0 = new C35304i(getSupportFragmentManager());
        int i = this.f85352h0;
        if (i == 3) {
            this.f85333O = new C35662r0();
            this.f85334P = new C35668s0();
            this.f85335Q = new C35668s0();
            this.f85359o0.mo86351v(this.f85333O, C10328q.product_details_tab_title_details);
            this.f85359o0.mo86351v(this.f85334P, C10328q.product_details_tab_title_schedule);
            this.f85359o0.mo86351v(this.f85335Q, C10328q.product_details_tab_title_history);
        } else if (i == 2) {
            this.f85339U = new C35587c();
            this.f85338T = new C35572a();
            this.f85341W = new C35669t();
            this.f85359o0.mo86351v(this.f85339U, C10328q.product_details_tab_title_operations);
            this.f85359o0.mo86351v(this.f85338T, C10328q.product_details_tab_title_cards);
            this.f85359o0.mo86351v(this.f85341W, C10328q.f28969z1);
        } else if (i != 6) {
            if (i == 5) {
                C32290b1.m95124n(this.f85320G.f69518h, C32355x0.m95516g(C10319h.card_view_loans_height));
                this.f85342X = new C35591d();
                C35638l lVar = new C35638l();
                this.f85343Y = lVar;
                C35304i iVar = this.f85359o0;
                int i2 = C10328q.common_text_empty;
                iVar.mo86351v(lVar, i2);
                this.f85359o0.mo86351v(this.f85342X, i2);
                this.f85320G.f69520j.setVisibility(8);
            } else if (i == 18) {
                C35599f1 f1Var = new C35599f1();
                this.f85344Z = f1Var;
                this.f85359o0.mo86351v(f1Var, C10328q.product_details_tab_title_details);
                this.f85320G.f69520j.setVisibility(8);
            } else if (m104649p3()) {
                BonusType bonusType = BonusType.AMEX;
                this.f85345a0 = C38308c.m112581m1(bonusType);
                this.f85346b0 = C38316k.m112598j1(bonusType);
                this.f85347c0 = new C38315j();
                this.f85351g0 = new C38311f();
                BonusType bonusType2 = BonusType.PLUS;
                this.f85348d0 = C38308c.m112581m1(bonusType2);
                this.f85349e0 = C38316k.m112598j1(bonusType2);
                this.f85350f0 = new C35604g1();
            }
        }
        this.f85320G.f69521k.setOffscreenPageLimit(this.f85359o0.mo6557d());
        this.f85320G.f69521k.setAdapter(this.f85359o0);
        this.f85320G.f69521k.addOnPageChangeListener(this.f85316C0);
        C27390p1 p1Var = this.f85320G;
        p1Var.f69520j.setupWithViewPager(p1Var.f69521k);
        this.f85320G.f69520j.resetFonts();
        m104639e3();
    }

    /* renamed from: Q */
    public void mo6549Q(int i) {
        if (m104649p3()) {
            this.f85352h0 = this.f85320G.f69518h.getBonusesHelper().mo72830d(i);
        }
        int i2 = this.f85352h0;
        if (i2 == 1) {
            m104618P3(false);
        } else if (i2 == 4) {
            m104620Q3(false);
        } else if (i2 == 3) {
            m104624S3(false);
        }
        m104622R3(i);
        this.f85320G.f69518h.setDefIndex(i);
        if (this.f85320G.f69521k.getCurrentItem() > 0) {
            mo86333W3();
        }
    }

    /* renamed from: R */
    public void mo37616R(String str, String str2) {
        C32297d.m95154b(this, str);
    }

    /* renamed from: S */
    public void mo37617S(boolean z) {
        if (z) {
            mo86441o2();
        } else {
            mo86425J1();
        }
    }

    /* renamed from: W3 */
    public void mo86333W3() {
        mo86334X3(false);
    }

    /* renamed from: X3 */
    public void mo86334X3(boolean z) {
        if (this.f85352h0 == 3 && this.f85320G.f69518h.getCurrentLoan() != null) {
            if (this.f85320G.f69521k.getCurrentItem() == 1 && this.f85359o0.mo6557d() != 2) {
                this.f85328K.requestLoanSchedules(z, this.f85320G.f69518h.getCurrentLoan().getLoanKey());
            } else if (this.f85320G.f69521k.getCurrentItem() == 2 || this.f85359o0.mo6557d() == 2) {
                this.f85328K.requestLoanHistory(z, this.f85320G.f69518h.getCurrentLoan().getLoanKey(), this.f85320G.f69518h.getCurrentLoan().getDetails().getDetails().isPln());
            }
        }
    }

    /* renamed from: l0 */
    public void mo6550l0(int i) {
    }

    /* renamed from: l3 */
    public Object mo86335l3(int i) {
        if (i < this.f85357m0.getDepositBonds().getDeposits().getDeposits().size()) {
            return this.f85357m0.getDepositBonds().getDeposits().getDeposits().get(i);
        }
        return this.f85357m0.getDepositBonds().getBonds().getBonds().getBonds().get(i - this.f85357m0.getDepositBonds().getDeposits().getDeposits().size());
    }

    public void onActivityResult(int i, int i2, Intent intent) {
        super.onActivityResult(i, i2, intent);
        if (i == 73 && i2 == -1 && this.f85338T != null && intent != null) {
            intent.getStringExtra("ACCOUNT_NAME");
            if (intent.getIntExtra("RENAME_TYPE", -1) == 6) {
                this.f85328K.refreshDepositsEvent();
                this.f85328K.refreshCreditCardsEvent();
                if (this.f85328K.hasProduct("DEPOSIT")) {
                    this.f85328K.requestDepositBonds(false);
                }
                if (this.f85328K.hasProduct("CREDITCARDACCOUNT")) {
                    this.f85328K.requestCreditCards(false);
                }
            }
        }
    }

    public void onBackPressed() {
        C32343x.m95489t1(this.f85330L, this);
        super.onBackPressed();
    }

    @C41452l
    public void onBondsEvent(BondsEvent bondsEvent) {
        int i;
        if (this.f85352h0 == 5 && this.f85355k0 != bondsEvent) {
            this.f85355k0 = bondsEvent;
            if (bondsEvent.getState() == 20) {
                this.f85320G.f69518h.setBondsWrapper(bondsEvent.getBondsWrapper());
                C27390p1 p1Var = this.f85320G;
                p1Var.f69519i.setViewPager(p1Var.f69518h);
                m104622R3(this.f85320G.f69518h.getCurrentItem());
                C27390p1 p1Var2 = this.f85320G;
                if (p1Var2 != null && p1Var2.f69521k.getAdapter() != null && this.f85320G.f69521k.getAdapter().mo6557d() > (i = this.f85317D0)) {
                    this.f85320G.f69521k.setCurrentItem(i);
                }
            }
        }
    }

    @C41452l
    public void onCreditCardsEvent(CreditCardsEvent creditCardsEvent) {
        CreditCardAccount creditAccountByKey;
        int i;
        int i2 = this.f85352h0;
        if (i2 == 2 && this.f85354j0 != creditCardsEvent) {
            this.f85354j0 = creditCardsEvent;
            if (creditCardsEvent.getState() == 20) {
                if (this.f85353i0 != -1) {
                    int accountPositionByAcctKey = creditCardsEvent.getCreditCardsWrapper().getAccountPositionByAcctKey(this.f85353i0);
                    this.f85320G.f69518h.setCurrPage(accountPositionByAcctKey);
                    this.f85320G.f69518h.setDefIndex(accountPositionByAcctKey);
                }
                this.f85320G.f69518h.setCreditAccount(creditCardsEvent.getCreditCardsWrapper());
                C27390p1 p1Var = this.f85320G;
                p1Var.f69519i.setViewPager(p1Var.f69518h);
                m104622R3(this.f85320G.f69518h.getCurrentItem());
                C27390p1 p1Var2 = this.f85320G;
                if (p1Var2 != null && p1Var2.f69521k.getAdapter() != null && this.f85320G.f69521k.getAdapter().mo6557d() > (i = this.f85317D0)) {
                    this.f85320G.f69521k.setCurrentItem(i);
                }
            }
        } else if (i2 == 6 && creditCardsEvent.getState() == 20 && (creditAccountByKey = creditCardsEvent.getCreditCardsWrapper().getCreditAccountByKey(Long.valueOf(this.f85353i0))) != null) {
            ArrayList<C25838r> accountCreditCards = creditAccountByKey.getAccountCreditCards();
            this.f85319F0 = accountCreditCards;
            m104612M3(accountCreditCards);
        }
    }

    @C41452l
    public void onDepositBondsEvent(DepositBondsEvent depositBondsEvent) {
        Deposit depositByAcctKey;
        int i;
        int i2 = this.f85352h0;
        if (i2 == 4 && this.f85357m0 != depositBondsEvent) {
            this.f85357m0 = depositBondsEvent;
            if (depositBondsEvent.getState() == 20) {
                m104620Q3(true);
                this.f85320G.f69518h.setDepositBondsContainer(depositBondsEvent.getDepositBonds());
                C27390p1 p1Var = this.f85320G;
                p1Var.f69519i.setViewPager(p1Var.f69518h);
                m104622R3(this.f85320G.f69518h.getCurrentItem());
                C27390p1 p1Var2 = this.f85320G;
                if (p1Var2 != null && p1Var2.f69521k.getAdapter() != null && this.f85320G.f69521k.getAdapter().mo6557d() > (i = this.f85317D0)) {
                    this.f85320G.f69521k.setCurrentItem(i);
                }
            }
        } else if (i2 == 6 && depositBondsEvent.getState() == 20 && (depositByAcctKey = depositBondsEvent.getDepositBonds().getDeposits().getDepositByAcctKey(Long.valueOf(this.f85353i0))) != null) {
            ArrayList<C25838r> depositCards = depositByAcctKey.getDepositCards();
            this.f85319F0 = depositCards;
            m104612M3(depositCards);
        }
    }

    @C41452l
    public void onLoanHistoryResponse(LoanHistoryEvent loanHistoryEvent) {
        int state = loanHistoryEvent.getState();
        if (state == 10) {
            this.f85335Q.mo86761l1();
        } else if (state == 20) {
            Iterator<LoanHistoryItem> it = loanHistoryEvent.getLoanHistoryWrapper().getSchedule().iterator();
            while (it.hasNext()) {
                it.next().setPln(loanHistoryEvent.isPln());
            }
            this.f85335Q.mo86760k1(loanHistoryEvent.getLoanHistoryWrapper().getSchedule(), loanHistoryEvent.getLoanHistoryWrapper().getSummary(), new C35303h(loanHistoryEvent));
            m104614N3();
        } else if (state == 30) {
            this.f85335Q.mo86759j1();
        } else if (state == 40) {
            this.f85335Q.mo86759j1();
        }
    }

    @C41452l
    public void onLoanScheduleResponse(LoanScheduleEvent loanScheduleEvent) {
        int i;
        int state = loanScheduleEvent.getState();
        if (state == 10) {
            this.f85334P.mo86761l1();
        } else if (state == 20) {
            this.f85334P.mo86762m1(loanScheduleEvent.getLoanScheduleWrapper().getSchedule(), loanScheduleEvent.getLoanScheduleWrapper().getSummary(), new C35302g());
            C27390p1 p1Var = this.f85320G;
            if (p1Var != null && p1Var.f69521k.getAdapter() != null && this.f85320G.f69521k.getAdapter().mo6557d() > (i = this.f85317D0)) {
                this.f85320G.f69521k.setCurrentItem(i);
            }
        } else if (state == 30) {
            this.f85334P.mo86759j1();
        } else if (state == 40) {
            this.f85334P.mo86759j1();
        }
    }

    @C41452l
    public void onLoansResponse(LoansEvent loansEvent) {
        int i;
        if (this.f85352h0 == 3 && this.f85356l0 != loansEvent) {
            this.f85356l0 = loansEvent;
            if (loansEvent.getState() == 20) {
                if (this.f85353i0 != -1) {
                    int loanPositionByLoanKey = loansEvent.getLoansWrapper().getLoanPositionByLoanKey(this.f85353i0);
                    this.f85320G.f69518h.setDefIndex(loanPositionByLoanKey);
                    this.f85320G.f69518h.setCurrPage(loanPositionByLoanKey);
                }
                m104624S3(true);
                this.f85320G.f69518h.setLoans(loansEvent.getLoansWrapper());
                C27390p1 p1Var = this.f85320G;
                p1Var.f69519i.setViewPager(p1Var.f69518h);
                m104622R3(this.f85320G.f69518h.getCurrentItem());
                C27390p1 p1Var2 = this.f85320G;
                if (p1Var2 != null && p1Var2.f69521k.getAdapter() != null && this.f85320G.f69521k.getAdapter().mo6557d() > (i = this.f85317D0)) {
                    this.f85320G.f69521k.setCurrentItem(i);
                }
            }
        }
    }

    @C41452l
    public void onPensionsEvent(PensionsEvent pensionsEvent) {
        int i;
        if (this.f85352h0 == 18 && this.f85358n0 != pensionsEvent) {
            this.f85358n0 = pensionsEvent;
            if (pensionsEvent.getState() == 20) {
                this.f85320G.f69518h.setPension(pensionsEvent.pensionResult);
                m104622R3(this.f85320G.f69518h.getCurrentItem());
                C27390p1 p1Var = this.f85320G;
                if (p1Var != null && p1Var.f69521k.getAdapter() != null && this.f85320G.f69521k.getAdapter().mo6557d() > (i = this.f85317D0)) {
                    this.f85320G.f69521k.setCurrentItem(i);
                }
            }
        }
    }

    public void onRequestPermissionsResult(int i, String[] strArr, int[] iArr) {
        super.onRequestPermissionsResult(i, strArr, iArr);
        if (i == 10016 && C32303f.m95190a(iArr)) {
            long j = this.f85327J0;
            if (j != -1) {
                m104642h3(j, this.f85329K0);
                this.f85327J0 = -1;
            }
            C35668s0 s0Var = this.f85335Q;
            if (s0Var != null) {
                s0Var.mo86758i1();
                return;
            }
            C35668s0 s0Var2 = this.f85334P;
            if (s0Var2 != null) {
                s0Var2.mo86758i1();
            }
        }
    }

    /* access modifiers changed from: protected */
    public void onStart() {
        super.onStart();
        C32343x.m95423W0(this.f85330L, this);
        int i = this.f85352h0;
        if (i == 3) {
            this.f85360p0 = "loans";
            this.f85328K.requestLoans(false);
        } else if (i == 1) {
            this.f85360p0 = "accounts";
            m104644j3();
        } else if (i == 2) {
            this.f85360p0 = "credit_cards";
            this.f85328K.requestCreditCards(false);
        } else if (i == 6) {
            this.f85360p0 = "cards";
            if (this.f85328K.hasProduct("ACCOUNT")) {
                m104644j3();
            }
            if (this.f85328K.hasProduct("CREDITCARDACCOUNT")) {
                this.f85328K.requestCreditCards(false);
            }
        } else if (i == 5) {
            this.f85360p0 = "bonds_and_shares";
            this.f85328K.requestBonds(false);
        } else if (m104649p3()) {
            int i2 = this.f85352h0;
            if (i2 == 15) {
                this.f85360p0 = "scool";
            } else if (i2 != 16) {
                switch (i2) {
                    case 8:
                        this.f85360p0 = "mr";
                        break;
                    case 9:
                        this.f85360p0 = "cas";
                        break;
                    case 10:
                        this.f85360p0 = "cashback";
                        break;
                }
            } else {
                this.f85360p0 = "plus";
            }
            mo86438k1(this.f85324I.mo67918a(false).mo94987J0(C40640a.m117458b()).mo95027o0(C40992a.m118827a()).mo94980F(new C30719o9(this)).mo94983G0(new C30732p9(this), new C30745q9(this)));
        } else if (this.f85352h0 == 18) {
            this.f85360p0 = "pension";
            this.f85328K.requestPensions(false);
        }
        mo86333W3();
    }

    /* access modifiers changed from: protected */
    public void onStop() {
        super.onStop();
        C32343x.m95489t1(this.f85330L, this);
    }

    @C41452l
    public void onSwipeItemClick(SwipeItemClickEvent swipeItemClickEvent) {
        String str;
        String str2;
        boolean z;
        long j;
        long j2;
        long j3;
        String str3;
        C25838r rVar;
        C25838r rVar2;
        this.f85323H0 = swipeItemClickEvent;
        int type = swipeItemClickEvent.getType();
        String str4 = BankApi.SERVICE_UNBLOCK_CARD;
        if (type == 25 && swipeItemClickEvent.getAdditionalData() == 6) {
            C35572a aVar = this.f85338T;
            if (aVar != null) {
                rVar2 = (C25838r) aVar.mo86629k1().get(swipeItemClickEvent.getPosition());
            } else {
                rVar2 = this.f85320G.f69518h.getAccountCards().get(swipeItemClickEvent.getPosition());
            }
            if (rVar2 != null) {
                this.f85325I0 = rVar2;
                C41185v.m119403r2(str4, this.f85331M.mo66809a(m104647n3((String) null, (String) null, (String) null))).mo4576A1(getSupportFragmentManager(), "SCA_CARD_BLOCK_TAG");
            }
        }
        if (swipeItemClickEvent.getType() == 12 && swipeItemClickEvent.getAdditionalData() == 6) {
            C35572a aVar2 = this.f85338T;
            if (aVar2 != null) {
                rVar = (C25838r) aVar2.mo86629k1().get(swipeItemClickEvent.getPosition());
            } else {
                rVar = this.f85320G.f69518h.getAccountCards().get(swipeItemClickEvent.getPosition());
            }
            if (rVar != null) {
                this.f85325I0 = rVar;
                if (!m104650q3()) {
                    str4 = BankApi.SERVICE_BLOCK_CARD;
                }
                C41185v.m119403r2(str4, this.f85331M.mo66809a(m104647n3((String) null, (String) null, (String) null))).mo4576A1(getSupportFragmentManager(), "SCA_CARD_BLOCK_TAG");
            }
        }
        if (swipeItemClickEvent.getType() == 24 && swipeItemClickEvent.getAdditionalData() == 6) {
            C38125h.m112238c(this).mo91597c0(this);
        }
        if (swipeItemClickEvent.getType() == 1) {
            if (swipeItemClickEvent.getAdditionalData() == 6) {
                C25838r rVar3 = (C25838r) this.f85338T.mo86629k1().get(swipeItemClickEvent.getPosition());
                RenameAccountActivity.m104744J2(this, rVar3.mo64584i(), "", 6, rVar3.mo64582h(), C10328q.common_text_card_name);
            }
            if (swipeItemClickEvent.getAdditionalData() == 9) {
                C38125h.m112238c(this).mo91609i0(this, ((BonusCasServiceUiModel) this.f85320G.f69518h.getBonusesHelper().mo72827a(swipeItemClickEvent.getPosition())).mo52714e().longValue());
            }
        }
        if (swipeItemClickEvent.getType() == 15 && swipeItemClickEvent.getAdditionalData() == 2) {
            CreditCardAccount creditCardAccount = this.f85354j0.getCreditCardsWrapper().getCardsContainer().getAccounts().get(swipeItemClickEvent.getPosition());
            C38165c cVar = new C38165c(this, creditCardAccount);
            cVar.mo91694d(new C35297b(creditCardAccount));
            cVar.mo91695e(new C35298c(creditCardAccount));
            cVar.show();
        }
        if (swipeItemClickEvent.getType() == 2) {
            if (swipeItemClickEvent.getAdditionalData() == 1) {
                str3 = ((C25832l) this.f85321G0.mo64561a().mo64555a().get(swipeItemClickEvent.getPosition())).mo64526e();
            } else if (swipeItemClickEvent.getAdditionalData() == 2) {
                str3 = this.f85354j0.getCreditCardsWrapper().getCardsContainer().getAccounts().get(swipeItemClickEvent.getPosition()).getPrintAcctNo();
            } else if (swipeItemClickEvent.getAdditionalData() == 4) {
                str3 = this.f85357m0.getDepositBonds().getDeposits().getDeposits().get(swipeItemClickEvent.getPosition()).getDepositDetails().getAgreeNo();
            } else {
                str3 = "";
            }
            C32359z0.m95583n0(this, str3, getString(C10328q.f28961m2));
        }
        if (swipeItemClickEvent.getType() == 30) {
            if (swipeItemClickEvent.getAdditionalData() == 1) {
                j3 = ((C25832l) this.f85321G0.mo64561a().mo64555a().get(swipeItemClickEvent.getPosition())).mo64529g();
            } else if (swipeItemClickEvent.getAdditionalData() == 2) {
                j3 = this.f85354j0.getCreditCardsWrapper().getCardsContainer().getAccounts().get(swipeItemClickEvent.getPosition()).getAcctKey();
            } else {
                j3 = 0;
            }
            m104642h3(j3, PreferencesApiManager.getInstance().getLanguage().mo90433b());
        }
        if (swipeItemClickEvent.getType() == 11 && swipeItemClickEvent.getAdditionalData() == 6) {
            C25838r rVar4 = (C25838r) this.f85338T.mo86629k1().get(swipeItemClickEvent.getPosition());
            mo86438k1(this.f85370z0.mo65885b().mo95027o0(C40992a.m118827a()).mo94983G0(new C30528a9(this, rVar4.mo64600x().mo63390c(), rVar4), new C30667k9()));
        }
        if (swipeItemClickEvent.getType() == 31) {
            C38125h.m112238c(this).mo91568P(this, this.f85363s0.mo52790a().mo52696b().toString(), this.f85363s0.mo52790a().mo52695a().toString(), (C0173b) null);
        }
        if (swipeItemClickEvent.getType() == 6) {
            Intent intent = new Intent(this, StatementActivity.class);
            intent.putExtra("PRODUCT_TYPE_KEY", swipeItemClickEvent.getAdditionalData());
            intent.putExtra("PRODUCT_INDEX", swipeItemClickEvent.getPosition());
            if (swipeItemClickEvent.getAdditionalData() == 9) {
                intent.putExtra("CAS_SERVICE_ID", ((BonusCasServiceUiModel) this.f85320G.f69518h.getBonusesHelper().mo72827a(swipeItemClickEvent.getPosition())).mo52714e());
            } else if (swipeItemClickEvent.getAdditionalData() == 15) {
                intent.putExtra("SCOOL_CHILD_CLIENT_KEY", ((BonusScoolUiModel) this.f85320G.f69518h.getBonusesHelper().mo72827a(swipeItemClickEvent.getPosition())).mo52778b());
            }
            startActivity(intent);
        }
        if (swipeItemClickEvent.getType() == 4) {
            if (swipeItemClickEvent.getAdditionalData() == 1) {
                j2 = ((C25832l) this.f85321G0.mo64561a().mo64555a().get(swipeItemClickEvent.getPosition())).mo64529g();
            } else if (swipeItemClickEvent.getAdditionalData() == 2) {
                j2 = this.f85354j0.getCreditCardsWrapper().getCardsContainer().getAccounts().get(swipeItemClickEvent.getPosition()).getAcctKey();
            } else {
                j2 = -1;
            }
            NewPaymentsActivity.m104352E2(this, j2);
        }
        if (swipeItemClickEvent.getType() == 5) {
            if (swipeItemClickEvent.getAdditionalData() == 1) {
                j = ((C25832l) this.f85321G0.mo64561a().mo64555a().get(swipeItemClickEvent.getPosition())).mo64529g();
                z = false;
            } else {
                if (swipeItemClickEvent.getAdditionalData() == 2) {
                    j = this.f85354j0.getCreditCardsWrapper().getCardsContainer().getAccounts().get(swipeItemClickEvent.getPosition()).getAcctKey();
                } else if (swipeItemClickEvent.getAdditionalData() == 4) {
                    j = this.f85357m0.getDepositBonds().getDeposits().getDeposits().get(swipeItemClickEvent.getPosition()).getAccountKey();
                } else {
                    z = false;
                    j = -1;
                }
                z = true;
            }
            if (z) {
                TransferForm.startWith((Activity) this, "TRANSFER", TransferForm.OPERATION_VIEW).setTransferForm(TransferForm.TRANSFER_FORM_OWN).setSrcAcctKey(j).start();
            } else {
                NewPaymentsActivity.m104352E2(this, j);
            }
        }
        if (swipeItemClickEvent.getType() == 7 && swipeItemClickEvent.getAdditionalData() == 4) {
            TransferForm.startWith((Activity) this, "TRANSFER", TransferForm.OPERATION_VIEW).setTransferForm(TransferForm.TRANSFER_FORM_OWN).setDestinationAcctKey(this.f85357m0.getDepositBonds().getDeposits().getDeposits().get(swipeItemClickEvent.getPosition()).getAccountKey()).start();
        }
        if (swipeItemClickEvent.getType() == 24 && swipeItemClickEvent.getAdditionalData() == 4) {
            Deposit deposit = this.f85357m0.getDepositBonds().getDeposits().getDeposits().get(swipeItemClickEvent.getPosition());
            String prodType = deposit.getProdType();
            String ccy = deposit.getCcy();
            String depositNameOrType = deposit.getDepositNameOrType();
            BigDecimal bigDecimal = deposit.getDepositDetails().pfmAcctBalance;
            if (deposit.getDepositDetails().getMaturityDate() == null) {
                str2 = null;
            } else {
                str2 = C32319m.m95308o(deposit.getDepositDetails().getMaturityDate().longValue());
            }
            SavingGoalEditActivity.m72552u3(new SavingGoalDepositModel(prodType, ccy, depositNameOrType, bigDecimal, str2, deposit.pfmAcctId.longValue(), deposit.getDepositDetails().agrPurposeId, deposit.getAgreeKey(), (SavingGoal) null), this);
        }
        if (swipeItemClickEvent.getType() == 25 && swipeItemClickEvent.getAdditionalData() == 4) {
            Deposit deposit2 = this.f85357m0.getDepositBonds().getDeposits().getDeposits().get(swipeItemClickEvent.getPosition());
            String prodType2 = deposit2.getProdType();
            String ccy2 = deposit2.getCcy();
            String depositNameOrType2 = deposit2.getDepositNameOrType();
            BigDecimal bigDecimal2 = deposit2.getDepositDetails().pfmAcctBalance;
            if (deposit2.getDepositDetails().getMaturityDate() == null) {
                str = null;
            } else {
                str = C32319m.m95308o(deposit2.getDepositDetails().getMaturityDate().longValue());
            }
            SavingGoalEditActivity.m72552u3(new SavingGoalDepositModel(prodType2, ccy2, depositNameOrType2, bigDecimal2, str, deposit2.pfmAcctId.longValue(), deposit2.getDepositDetails().agrPurposeId, deposit2.getAgreeKey(), deposit2.getSavingGoal()), this);
        }
        if (swipeItemClickEvent.getType() == 8 && swipeItemClickEvent.getAdditionalData() == 1) {
            TransferForm.startWith((Activity) this, "TRANSFER", TransferForm.OPERATION_VIEW).setTransferForm(TransferForm.TRANSFER_FORM_OTHER).setWithinBank(true).setDestinationAcctNo(((C25832l) this.f85321G0.mo64561a().mo64555a().get(swipeItemClickEvent.getPosition())).mo64526e()).start();
        }
        if (swipeItemClickEvent.getType() == 9 && swipeItemClickEvent.getAdditionalData() == 4) {
            C38125h.m112238c(this).mo91574S(this, this.f85357m0.getDepositBonds().getDeposits().getDeposits().get(swipeItemClickEvent.getPosition()).getAgreeKey());
        }
        if (swipeItemClickEvent.getType() == 13) {
            ThreeDSecurityActivity.m104877T2(this, ((C25838r) this.f85338T.mo86629k1().get(swipeItemClickEvent.getPosition())).mo64592q());
        }
        if (swipeItemClickEvent.getType() == 14) {
            C38125h.m112238c(this).mo91624q(((C25838r) this.f85338T.mo86629k1().get(swipeItemClickEvent.getPosition())).mo64582h(), this);
        }
        if (swipeItemClickEvent.getType() == 18) {
            Intent intent2 = new Intent(this, ProviderListActivity.class);
            intent2.putExtra("PROVIDER_LIST_IS_SHOW_ALL_LIST", false);
            intent2.putExtra("PROVIDER_LIST_SHOW_SELECTED", false);
            intent2.putExtra("BONUS_PRODUCT_TYPE", "PLS1");
            intent2.putExtra("BONUS_TYPE", "PLUS");
            intent2.putExtra("PROVIDER_LIST_SHOW_BONUSES", true);
            startActivity(intent2);
        }
        if (swipeItemClickEvent.getType() == 19) {
            C38125h.m112238c(this).mo91583W0(this);
        }
        if (swipeItemClickEvent.getType() == 20) {
            startActivity(new Intent(this, PlusProgramInvitationActivity.class));
        }
        if (swipeItemClickEvent.getType() == 32) {
            Loan loan = this.f85356l0.getLoansWrapper().getLoans().get(swipeItemClickEvent.getPosition());
            C38125h.m112238c(this).mo91595b1(this, loan.getDetails().getPlnDetails().getInitialPrincipal(), loan.getDetails().getPlnDetails().getIntAmount(), loan.getDetails().getPlnDetails().getPenalty(), loan.getDetails().getPlnDetails().getAcctNo(), loan.getDetails().getPlnDetails().getAvailableAmount(), loan.getCcy(), loan.getDetails().getLoanKey(), loan.getDetails().getPlnDetails().getAmount(), loan.getDetails().getPlnDetails().getProductDictionaryKey());
        }
        if (swipeItemClickEvent.getType() == 21 || swipeItemClickEvent.getType() == 22) {
            Loan loan2 = this.f85356l0.getLoansWrapper().getLoans().get(swipeItemClickEvent.getPosition());
            String loanName = loan2.getLoanName();
            if (loanName == null) {
                loanName = C27950a.m86284a(loan2.getProductDictionaryKey());
            }
            C38125h.m112238c(this).mo91556J(this, loanName, loan2.getLoanKey(), loan2.getCcy(), loan2.getProdType(), this.f85356l0.getLoansWrapper().getDetails().get(swipeItemClickEvent.getPosition()).getDetails().getRepaymentFlag(), this.f85356l0.getLoansWrapper().getDetails().get(swipeItemClickEvent.getPosition()).getRepaymentAccounts(), false);
        } else if (swipeItemClickEvent.getType() == 28) {
            Loan loan3 = this.f85356l0.getLoansWrapper().getLoans().get(swipeItemClickEvent.getPosition());
            C21092b.m68262n2(loan3.getProdType(), loan3.getLoanKey()).mo4576A1(getSupportFragmentManager(), (String) null);
        } else if (swipeItemClickEvent.getType() == 29) {
            m104610L3();
        }
        if (swipeItemClickEvent.getType() == 26) {
            m104626T3();
        }
        m104616O3(true);
    }

    /* renamed from: z1 */
    public String mo38120z1() {
        int intExtra = getIntent().getIntExtra("PRODUCT_TYPE_KEY", -1);
        if (intExtra == 9) {
            return getString(C10328q.header_text_loyalty);
        }
        if (intExtra == 16) {
            return getString(C10328q.header_text_loyalty);
        }
        if (intExtra == 18) {
            return getString(C10328q.f28964p5);
        }
        switch (intExtra) {
            case 1:
                return getString(C10328q.f28938S4);
            case 2:
            case 6:
                return getString(C10328q.header_text_cards);
            case 3:
                return getString(C10328q.f28957f5);
            case 4:
                return getString(C10328q.f28954c5);
            case 5:
                return getString(C10328q.f28945V4);
            default:
                return null;
        }
    }
}
