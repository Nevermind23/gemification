package p341ge.bog.mobilebank.payment.activities;

import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import androidx.core.content.C0767a;
import androidx.recyclerview.widget.LinearLayoutManager;
import com.medallia.digital.mobilesdk.MedalliaDigital;
import de1.C40640a;
import g81.C32205k0;
import g91.C32289b0;
import g91.C32297d;
import g91.C32313j0;
import g91.C32359z0;
import gd1.C40992a;
import hc1.C41185v;
import hd1.C41205b;
import iu0.C36546y;
import java.util.List;
import mw0.C37281n;
import mw0.C37282o;
import mw0.C37283p;
import mw0.C37284q;
import ow0.C37821b;
import ow0.C37822c;
import p341ge.bog.mobilebank.p975ui.views.widgets.ProviderDetailTypeView;
import p341ge.bog.mobilebank.p975ui.views.widgets.TextTypeView;
import p341ge.bog.mobilebank.payment.model.PaymentCustomParameter;
import p341ge.bog.mobilebank.rest.BankApi;
import p341ge.bog.mobilebank.rest.model.RestCallback;
import p341ge.bog.mobilebank.shared2.network.BankApiResponse;
import p366bk.C10318g;
import p366bk.C10319h;
import p366bk.C10328q;
import p729cv.C19797a;
import p739dv.C20102a;
import p90.C27315h1;
import pc0.C27494a;

/* renamed from: ge.bog.mobilebank.payment.activities.PaymentFormActivity */
public class PaymentFormActivity extends C33612e implements C41185v.C41186a {

    /* renamed from: G */
    protected C27315h1 f81917G;

    /* renamed from: H */
    protected boolean f81918H = true;

    /* renamed from: I */
    C19797a f81919I;

    /* renamed from: J */
    protected BankApi f81920J;

    /* renamed from: K */
    protected C27494a f81921K;

    /* renamed from: L */
    C37821b f81922L;

    /* renamed from: M */
    private String f81923M;

    /* renamed from: N */
    private boolean f81924N;

    /* renamed from: O */
    private String f81925O;

    /* renamed from: P */
    private String f81926P;

    /* renamed from: Q */
    private String f81927Q;

    /* renamed from: R */
    private String f81928R;

    /* renamed from: S */
    Long f81929S;

    /* renamed from: ge.bog.mobilebank.payment.activities.PaymentFormActivity$a */
    class C33601a extends RestCallback {
        C33601a() {
        }

        public void onEnqueue(C41205b bVar) {
            PaymentFormActivity.this.mo86438k1(bVar);
        }

        public void onFailure(Throwable th) {
            PaymentFormActivity.this.f81917G.f68861k.mo3946b().setVisibility(8);
            PaymentFormActivity.this.f81917G.f68856f.setVisibility(0);
        }

        public void onResponse(BankApiResponse bankApiResponse) {
            if (bankApiResponse.isSuccess()) {
                PaymentFormActivity.this.f81929S = (Long) bankApiResponse.getResult();
                PaymentFormActivity.this.mo79617V2();
                return;
            }
            PaymentFormActivity.this.f81917G.f68861k.mo3946b().setVisibility(8);
            PaymentFormActivity.this.f81917G.f68856f.setVisibility(0);
        }
    }

    /* renamed from: ge.bog.mobilebank.payment.activities.PaymentFormActivity$b */
    class C33602b implements View.OnClickListener {
        C33602b() {
        }

        public void onClick(View view) {
            PaymentFormActivity.this.mo79614K2().mo91082A();
        }
    }

    /* renamed from: ge.bog.mobilebank.payment.activities.PaymentFormActivity$c */
    class C33603c implements View.OnClickListener {

        /* renamed from: d */
        final /* synthetic */ int f81932d;

        /* renamed from: e */
        final /* synthetic */ TextTypeView f81933e;

        C33603c(int i, TextTypeView textTypeView) {
            this.f81932d = i;
            this.f81933e = textTypeView;
        }

        public void onClick(View view) {
            PaymentFormActivity.this.mo79614K2().mo91095x(this.f81932d, this.f81933e);
        }
    }

    /* renamed from: L2 */
    private ProviderDetailTypeView m98628L2(PaymentCustomParameter paymentCustomParameter) {
        ProviderDetailTypeView providerDetailTypeView = new ProviderDetailTypeView(this);
        providerDetailTypeView.setTitleText(paymentCustomParameter.getName());
        if (paymentCustomParameter.getStyle().needsDebtFormatting()) {
            providerDetailTypeView.setType(ProviderDetailTypeView.TYPE_DEBT);
        }
        providerDetailTypeView.setValueText(paymentCustomParameter.getValue(), paymentCustomParameter.getValueToDisplay());
        return providerDetailTypeView;
    }

    /* access modifiers changed from: private */
    /* renamed from: P2 */
    public /* synthetic */ void m98629P2(View view) {
        m98633T2();
    }

    /* access modifiers changed from: private */
    /* renamed from: Q2 */
    public /* synthetic */ void m98630Q2(View view) {
        mo79601U2();
    }

    /* access modifiers changed from: private */
    /* renamed from: R2 */
    public /* synthetic */ void m98631R2(C20102a aVar) {
        mo79618W2(aVar);
        this.f81917G.f68861k.mo3946b().setVisibility(8);
    }

    /* access modifiers changed from: private */
    /* renamed from: S2 */
    public /* synthetic */ void m98632S2(Throwable th) {
        mo79618W2((C20102a) null);
        this.f81917G.f68861k.mo3946b().setVisibility(8);
    }

    /* renamed from: T2 */
    private void m98633T2() {
        mo79599D0();
    }

    /* access modifiers changed from: protected */
    /* renamed from: D0 */
    public void mo79599D0() {
        this.f81917G.f68871u.setVisibility(8);
        this.f81917G.f68858h.setVisibility(8);
        this.f81917G.f68872v.setVisibility(8);
        if (!TextUtils.isEmpty(getIntent().getStringExtra("BONUS_TYPE"))) {
            this.f81917G.f68861k.mo3946b().setVisibility(0);
            this.f81917G.f68856f.setVisibility(8);
            this.f81920J.getPaymentRequestId("PAYMENTS_BATCH_EXECUTE_NEW", new C33601a());
        } else {
            this.f81917G.f68861k.mo3946b().setVisibility(0);
            this.f81917G.f68856f.setVisibility(8);
            mo79617V2();
        }
        this.f81917G.f68855e.mo3946b().setOnClickListener(new C37281n(this));
        this.f81917G.f68868r.f70288l.setOnClickListener(new C37282o(this));
    }

    /* renamed from: J2 */
    public void mo79613J2(boolean z) {
        this.f81917G.f68868r.f70288l.setOrange(z, z);
    }

    /* renamed from: K2 */
    public C37821b mo79614K2() {
        return this.f81922L;
    }

    /* access modifiers changed from: protected */
    /* renamed from: M2 */
    public View mo79600M2(PaymentCustomParameter paymentCustomParameter, int i) {
        int i2;
        TextTypeView textTypeView = new TextTypeView(this);
        textTypeView.setTitleColor(C0767a.m2893c(this, C10318g.payment_details_titles_text_color));
        textTypeView.setSeparator(TextTypeView.SEPARATOR_FULL);
        textTypeView.getBogInputLayout().setEditable(false);
        if (paymentCustomParameter.getStyle().isEditable()) {
            i2 = C10318g.payment_details_input_divider_color;
        } else {
            i2 = C10318g.f28649t2;
        }
        textTypeView.setUnderLineColor(C0767a.m2893c(this, i2));
        textTypeView.setTitleText(paymentCustomParameter.getName());
        textTypeView.setValueText(paymentCustomParameter.getValueToDisplayInForm());
        textTypeView.setClickEnabled(paymentCustomParameter.getStyle().isEditable());
        textTypeView.setOnClickListener(new C33603c(i, textTypeView));
        return textTypeView;
    }

    /* renamed from: N2 */
    public void mo79615N2() {
        this.f81917G.f68870t.mo3946b().setVisibility(8);
        this.f81917G.f68869s.setVisibility(8);
    }

    /* renamed from: O */
    public void mo37615O(String str, String str2, String str3, String str4) {
        C37821b bVar = this.f81922L;
        if (bVar instanceof C37822c) {
            C41185v O = ((C37822c) bVar).mo91097O();
            if (O != null) {
                O.mo4577k1();
            }
            ((C37822c) this.f81922L).mo91098P(str, str2, str3);
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: O1 */
    public void mo37451O1(Bundle bundle) {
        C27315h1 d = C27315h1.m84568d(getLayoutInflater());
        this.f81917G = d;
        super.mo70996D2(bundle, d);
        mo79599D0();
    }

    /* renamed from: O2 */
    public void mo79616O2(String str, C32205k0 k0Var) {
        this.f81917G.f68870t.f69830e.f68407f.setVisibility(8);
        this.f81917G.f68870t.f69830e.f68411j.setVisibility(8);
        this.f81917G.f68870t.f69830e.f68410i.setText(str);
        this.f81917G.f68869s.setLayoutManager(new LinearLayoutManager(this));
        this.f81917G.f68869s.setAdapter(k0Var);
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

    /* access modifiers changed from: protected */
    /* renamed from: U2 */
    public void mo79601U2() {
        if (this.f81917G.f68868r.f70288l.isEnabled()) {
            mo79614K2().mo91078y();
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: V2 */
    public void mo79617V2() {
        C19797a aVar = this.f81919I;
        if (aVar == null) {
            mo79618W2((C20102a) null);
        } else {
            mo86438k1(aVar.mo48085a().mo94987J0(C40640a.m117458b()).mo95027o0(C40992a.m118827a()).mo94983G0(new C37283p(this), new C37284q(this)));
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: W2 */
    public void mo79618W2(C20102a aVar) {
        C36546y.m108282F().mo27138I("payment_details");
        mo86441o2();
        this.f81923M = getIntent().getStringExtra("PAYMENT_SERVICE_ID");
        this.f81924N = getIntent().getBooleanExtra("PAYMENT_IS_COMPANY", false);
        this.f81925O = getIntent().getExtras().getString("PAYMENT_ESS_ID", "");
        this.f81926P = getIntent().getExtras().getString("TB_PARK_CAR_NUMBER", "");
        this.f81927Q = getIntent().getExtras().getString("TB_PARK_PERSONAL_NUMBER", "");
        this.f81928R = getIntent().getExtras().getString("TB_PARK_TICKET_NUMBER", "");
        String string = getIntent().getExtras().getString(C32313j0.f79741a);
        String stringExtra = getIntent().getStringExtra("BONUS_TYPE");
        String E = C32359z0.m95534E(stringExtra, aVar);
        if (!TextUtils.isEmpty(stringExtra)) {
            this.f81922L = new C37822c(this, this.f81923M, this.f81924N, stringExtra, E, this.f81929S, this.f81921K);
        } else {
            this.f81922L = new C37821b(this, this.f81923M, this.f81924N, this.f81925O, this.f81926P, this.f81927Q, this.f81928R, string);
        }
        mo79614K2().mo91085F();
        this.f81917G.f68862l.f68328f.mo3946b().setOnClickListener(new C33602b());
        if ("ge.bog.mobilebank.appshortcuts.MOBILE_TOPUP".equals(getIntent().getAction())) {
            C36546y.m108282F().mo27152s("quick_actions_menu", "mobile_topup", "force_touch");
        }
        if ("ACTION_OPEN_FROM_WIDGET".equals(getIntent().getAction())) {
            C36546y.m108282F().mo27152s("quick_links_widget", "mobile_topup", "open_page");
        }
    }

    /* renamed from: X2 */
    public void mo79602X2(String str, String str2, boolean z) {
        this.f81917G.f68868r.f70288l.setText(C10328q.f28937S0);
        this.f81917G.f68868r.f70288l.setOrange(z, z);
        this.f81917G.f68868r.f70287k.setText(String.format("%s %s", new Object[]{getResources().getText(C10328q.common_text_commission), str2}));
        this.f81917G.f68868r.f70287k.setVisibility(8);
    }

    /* renamed from: Y2 */
    public void mo79603Y2(List list) {
        this.f81917G.f68867q.removeAllViews();
        int i = 0;
        while (i < list.size()) {
            PaymentCustomParameter paymentCustomParameter = (PaymentCustomParameter) list.get(i);
            if (paymentCustomParameter.isVisibleInForm()) {
                if (paymentCustomParameter.isMandatory()) {
                    View M2 = mo79600M2(paymentCustomParameter, i);
                    int i2 = i + 1;
                    if (i2 < list.size() && paymentCustomParameter.getRowNum() == ((PaymentCustomParameter) list.get(i2)).getRowNum()) {
                        LinearLayout linearLayout = new LinearLayout(this);
                        linearLayout.setLayoutParams(new LinearLayout.LayoutParams(-1, -2));
                        linearLayout.setOrientation(0);
                        linearLayout.addView(M2);
                        M2.setLayoutParams(new LinearLayout.LayoutParams(0, -2, paymentCustomParameter.getStyle().getWeight()));
                        while (true) {
                            int i3 = i + 1;
                            if (i3 >= list.size() || ((PaymentCustomParameter) list.get(i)).getRowNum() != ((PaymentCustomParameter) list.get(i3)).getRowNum()) {
                                M2 = linearLayout;
                            } else {
                                View M22 = mo79600M2((PaymentCustomParameter) list.get(i3), i3);
                                linearLayout.addView(M22);
                                M22.setLayoutParams(new LinearLayout.LayoutParams(0, -2, ((PaymentCustomParameter) list.get(i3)).getStyle().getWeight()));
                                i = i3;
                            }
                        }
                        M2 = linearLayout;
                    }
                    this.f81917G.f68867q.addView(M2);
                    LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) M2.getLayoutParams();
                    layoutParams.topMargin = getResources().getDimensionPixelSize(C10319h.text_type_view_margin);
                    M2.setLayoutParams(layoutParams);
                } else {
                    this.f81917G.f68867q.addView(m98628L2(paymentCustomParameter));
                }
            }
            i++;
        }
    }

    /* renamed from: Z2 */
    public void mo79619Z2(String str, String str2) {
        C32289b0.m95097i(this.f81917G.f68865o.f70239e, str2);
        this.f81917G.f68865o.f70240f.setText(str);
    }

    /* renamed from: a3 */
    public void mo79604a3(String str) {
        this.f81917G.f68868r.f70288l.setText(str);
    }

    /* renamed from: b3 */
    public void mo79620b3() {
        this.f81917G.f68870t.mo3946b().setVisibility(0);
        this.f81917G.f68869s.setVisibility(0);
    }

    /* renamed from: c3 */
    public void mo79621c3(boolean z) {
        int i;
        LinearLayout linearLayout = this.f81917G.f68860j;
        int i2 = 0;
        if (z) {
            i = 0;
        } else {
            i = 8;
        }
        linearLayout.setVisibility(i);
        RelativeLayout relativeLayout = this.f81917G.f68866p;
        if (z) {
            i2 = 8;
        }
        relativeLayout.setVisibility(i2);
    }

    /* access modifiers changed from: protected */
    public void onActivityResult(int i, int i2, Intent intent) {
        super.onActivityResult(i, i2, intent);
        if (mo79614K2() != null) {
            mo79614K2().mo91077w(i, i2, intent);
        }
    }

    /* access modifiers changed from: protected */
    public void onDestroy() {
        super.onDestroy();
        C37821b bVar = this.f81922L;
        if (bVar != null) {
            bVar.mo91083B();
        }
    }

    /* access modifiers changed from: protected */
    public void onPause() {
        super.onPause();
        MedalliaDigital.enableIntercept();
    }

    /* access modifiers changed from: protected */
    public void onResume() {
        super.onResume();
        MedalliaDigital.disableIntercept();
    }

    /* renamed from: z1 */
    public String mo38120z1() {
        return getString(C10328q.header_text_payments);
    }
}
