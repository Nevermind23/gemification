package p341ge.bog.mobilebank.p975ui.activities;

import a81.C30705n8;
import a81.C30718o8;
import a81.C30731p8;
import a81.C30744q8;
import a81.C30757r8;
import a81.C30770s8;
import a81.C30783t8;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.text.TextUtils;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import androidx.activity.result.C0173b;
import androidx.core.content.C0767a;
import com.google.gson.Gson;
import com.medallia.digital.mobilesdk.MedalliaDigital;
import de1.C40640a;
import g91.C32289b0;
import g91.C32290b1;
import g91.C32297d;
import g91.C32298d0;
import g91.C32303f;
import g91.C32315k0;
import g91.C32335t0;
import g91.C32343x;
import g91.C32359z0;
import gd1.C40992a;
import hd1.C41205b;
import id0.C25179a;
import id0.C25180b;
import iu0.C36546y;
import java.io.UnsupportedEncodingException;
import java.math.BigDecimal;
import java.net.URLEncoder;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import jd0.C25383a;
import jg1.C41438c;
import jg1.C41452l;
import org.parceler.C42035e;
import p189o0.C7357a;
import p341ge.bog.mobilebank.cleanarch.moremenu.presentation.PackageType;
import p341ge.bog.mobilebank.eventbus.events.FeatureFeedBackEvent;
import p341ge.bog.mobilebank.model.Client;
import p341ge.bog.mobilebank.model.ExternalPaymentDetails;
import p341ge.bog.mobilebank.model.KeyValue;
import p341ge.bog.mobilebank.model.PaymentExecuteEssObject;
import p341ge.bog.mobilebank.model.payment.PaymentDebtResponse;
import p341ge.bog.mobilebank.model.payment.PaymentProviderConfiguration;
import p341ge.bog.mobilebank.model.payment.PaymentServiceConfig;
import p341ge.bog.mobilebank.p975ui.views.widgets.SpecialAlignedTitleValueView;
import p341ge.bog.mobilebank.payment.activities.DDTransparentLoaderActivity;
import p341ge.bog.mobilebank.payment.activities.TemplateFormActivity;
import p341ge.bog.mobilebank.payment.model.C33624a;
import p341ge.bog.mobilebank.rest.BankApi;
import p341ge.bog.mobilebank.rest.model.RestCallback;
import p341ge.bog.mobilebank.rest.model.RetrofitClient;
import p341ge.bog.mobilebank.shared2.network.BankApiResponse;
import p366bk.C10320i;
import p366bk.C10327p;
import p366bk.C10328q;
import p380ck.C10464h;
import p90.C27335j1;
import q31.C38125h;
import q81.C38194r;
import r90.C27950a;
import r90.C27954d;

/* renamed from: ge.bog.mobilebank.ui.activities.PaymentResultActivity */
public class PaymentResultActivity extends C35370c0 {

    /* renamed from: G */
    private C27335j1 f85248G;

    /* renamed from: H */
    private Runnable f85249H = new C35288a();

    /* renamed from: I */
    private PaymentProviderConfiguration f85250I;

    /* renamed from: J */
    private boolean f85251J;

    /* renamed from: K */
    private String f85252K;
    /* access modifiers changed from: private */

    /* renamed from: L */
    public Handler f85253L = new Handler();
    /* access modifiers changed from: private */

    /* renamed from: M */
    public Runnable f85254M;
    /* access modifiers changed from: private */

    /* renamed from: N */
    public Gson f85255N = new Gson();
    /* access modifiers changed from: private */

    /* renamed from: O */
    public PaymentExecuteEssObject f85256O;

    /* renamed from: P */
    private PaymentServiceConfig f85257P;

    /* renamed from: Q */
    private String f85258Q;

    /* renamed from: R */
    private boolean f85259R;

    /* renamed from: S */
    private boolean f85260S;

    /* renamed from: T */
    private boolean f85261T;

    /* renamed from: U */
    private BigDecimal f85262U;

    /* renamed from: V */
    private ArrayList f85263V;

    /* renamed from: W */
    private boolean f85264W;

    /* renamed from: X */
    C25180b f85265X;

    /* renamed from: Y */
    C25179a f85266Y;

    /* renamed from: Z */
    protected Client f85267Z;

    /* renamed from: a0 */
    protected BankApi f85268a0;

    /* renamed from: b0 */
    protected C41438c f85269b0;

    /* renamed from: ge.bog.mobilebank.ui.activities.PaymentResultActivity$a */
    class C35288a implements Runnable {
        C35288a() {
        }

        public void run() {
            PaymentResultActivity.this.f85267Z.requestFeatureFeedback(false);
        }
    }

    /* renamed from: ge.bog.mobilebank.ui.activities.PaymentResultActivity$b */
    class C35289b extends RestCallback {

        /* renamed from: a */
        final /* synthetic */ String f85271a;

        C35289b(String str) {
            this.f85271a = str;
        }

        public void onEnqueue(C41205b bVar) {
            PaymentResultActivity.this.mo86438k1(bVar);
        }

        public void onFailure(Throwable th) {
            super.onFailure(th);
            PaymentResultActivity.this.m104537X2();
        }

        public void onResponse(BankApiResponse bankApiResponse) {
            super.onResponse(bankApiResponse);
            if (bankApiResponse.isSuccess()) {
                for (KeyValue keyValue : ((PaymentDebtResponse) bankApiResponse.getResult()).getParameter()) {
                    if (keyValue.getKey().equals("paymentData")) {
                        ExternalPaymentDetails externalPaymentDetails = (ExternalPaymentDetails) PaymentResultActivity.this.f85255N.mo18170l(keyValue.getValue(), ExternalPaymentDetails.class);
                        if (externalPaymentDetails.getPaymentDetails().size() > 0) {
                            if (!externalPaymentDetails.getPaymentDetails().get(0).getProcessStatus().equals("N")) {
                                PaymentExecuteEssObject internalExecutor = externalPaymentDetails.getPaymentDetails().get(0).getInternalExecutor();
                                PaymentResultActivity.this.f85256O = internalExecutor;
                                PaymentResultActivity.this.m104547h3(internalExecutor);
                                PaymentResultActivity.this.m104537X2();
                            } else {
                                if (PaymentResultActivity.this.f85254M == null) {
                                    PaymentResultActivity paymentResultActivity = PaymentResultActivity.this;
                                    paymentResultActivity.f85254M = new C35290c(this.f85271a);
                                }
                                PaymentResultActivity.this.f85253L.postDelayed(PaymentResultActivity.this.f85254M, 3000);
                            }
                        }
                    }
                }
                return;
            }
            C32297d.m95157e(PaymentResultActivity.this, C27950a.m86284a(bankApiResponse.getKey()));
            PaymentResultActivity.this.m104537X2();
        }
    }

    /* renamed from: ge.bog.mobilebank.ui.activities.PaymentResultActivity$c */
    private class C35290c implements Runnable {

        /* renamed from: d */
        private String f85273d;

        public C35290c(String str) {
            this.f85273d = str;
        }

        public void run() {
            PaymentResultActivity.this.m104534U2(this.f85273d);
        }
    }

    /* renamed from: S2 */
    private void m104532S2() {
        if (this.f85250I.isDDAllowed() && this.f85248G.f69029p.getVisibility() != 0) {
            if (this.f85267Z.isAuthorized()) {
                C33624a.m98713a(this).mo79806f(DDTransparentLoaderActivity.class).mo79819s(this.f85250I.getServiceId()).mo79813m(this.f85256O.getEssParameters()).mo79825y();
            } else {
                C32303f.m95188H(this);
            }
        }
    }

    /* renamed from: T2 */
    private void m104533T2() {
        PaymentProviderConfiguration paymentProviderConfiguration = this.f85250I;
        if (paymentProviderConfiguration != null && paymentProviderConfiguration.isTemplateAccessAllowed) {
            C33624a.m98713a(this).mo79806f(TemplateFormActivity.class).mo79819s(this.f85250I.getServiceId()).mo79813m(this.f85256O.getEssParameters()).mo79816p(getIntent().getIntExtra("PAYMENT_PACK_INDEX", -1)).mo79803c(true).mo79825y();
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: U2 */
    public void m104534U2(String str) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(new KeyValue("extTransactionId", str));
        this.f85268a0.paymentsExecute("", "mep-bog-payment3des-get-data", this.f85255N.mo18181w(arrayList), (RestCallback<BankApiResponse<PaymentDebtResponse>>) new C35289b(str));
    }

    /* renamed from: V2 */
    private void m104535V2() {
        this.f85248G.f69024k.setVisibility(8);
        this.f85266Y.mo63717a();
    }

    /* renamed from: W2 */
    private void m104536W2() {
        if (this.f85265X != null && this.f85266Y != null) {
            this.f85248G.f69024k.setCloseButtonClickListener(new C30744q8(this));
            this.f85248G.f69024k.setOnClickListener(new C30757r8(this));
            mo86438k1(this.f85265X.mo63718a().mo95072K(C40640a.m117458b()).mo95063B(C40992a.m118827a()).mo95070I(new C30770s8(this), new C30783t8(this)));
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: X2 */
    public void m104537X2() {
        this.f85248G.f69029p.setVisibility(4);
    }

    /* renamed from: Y2 */
    private void m104538Y2(ArrayList arrayList) {
        if (arrayList != null && arrayList.size() > 0) {
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                KeyValue keyValue = (KeyValue) it.next();
                SpecialAlignedTitleValueView specialAlignedTitleValueView = new SpecialAlignedTitleValueView(this);
                specialAlignedTitleValueView.setTitleText(keyValue.getKey());
                specialAlignedTitleValueView.setValueText(keyValue.getValue());
                this.f85248G.f69027n.addView(specialAlignedTitleValueView);
            }
        }
        if (this.f85251J) {
            SpecialAlignedTitleValueView specialAlignedTitleValueView2 = new SpecialAlignedTitleValueView(this);
            specialAlignedTitleValueView2.setTitleText(getString(C10328q.payments_result_paid_amount));
            specialAlignedTitleValueView2.setValueText(C32315k0.m95246A(this.f85256O.getEssParameters(), false));
            this.f85248G.f69027n.addView(specialAlignedTitleValueView2);
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: Z2 */
    public /* synthetic */ void m104539Z2(View view) {
        m104535V2();
    }

    /* access modifiers changed from: private */
    /* renamed from: a3 */
    public /* synthetic */ void m104540a3(View view) {
        m104545f3();
    }

    /* access modifiers changed from: private */
    /* renamed from: b3 */
    public /* synthetic */ void m104541b3(C25383a aVar) {
        if (aVar.mo63973d()) {
            this.f85248G.f69024k.setInfoText(C27950a.m86284a(aVar.mo63971b()));
            this.f85248G.f69024k.setShowMoreText(C27950a.m86284a(aVar.mo63970a()));
            this.f85248G.f69024k.setBannerImage(C32298d0.m95162a(aVar.mo63972c()));
            this.f85248G.f69024k.setVisibility(0);
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: c3 */
    public /* synthetic */ void m104542c3(View view) {
        m104549j3();
    }

    /* access modifiers changed from: private */
    /* renamed from: d3 */
    public /* synthetic */ void m104543d3(View view) {
        m104532S2();
    }

    /* access modifiers changed from: private */
    /* renamed from: e3 */
    public /* synthetic */ void m104544e3(View view) {
        m104533T2();
    }

    /* renamed from: f3 */
    private void m104545f3() {
        C38125h.m112238c(this).mo91616m((PackageType) null, false, (String) null, this, (C0173b) null);
    }

    /* renamed from: g3 */
    private void m104546g3() {
        this.f85267Z.requestTemplateDebts(true);
        this.f85267Z.requestCarDebts(true);
        this.f85267Z.forceUpdateData();
        C7357a.m28044b(this).mo21731d(new Intent("ge.bog.mobilebank.products.presentation.products.refresh_products"));
    }

    /* access modifiers changed from: private */
    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* JADX WARNING: Code restructure failed: missing block: B:16:0x005c, code lost:
        if (r7.equals("N") == false) goto L_0x0040;
     */
    /* renamed from: h3 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void m104547h3(p341ge.bog.mobilebank.model.PaymentExecuteEssObject r7) {
        /*
            r6 = this;
            java.util.ArrayList r0 = r6.f85263V
            int r0 = r0.size()
            r1 = 0
            r2 = 1
            if (r0 != r2) goto L_0x0029
            java.util.ArrayList r0 = r6.f85263V
            java.lang.Object r0 = r0.get(r1)
            ge.bog.mobilebank.model.PaymentExecuteEssObject r0 = (p341ge.bog.mobilebank.model.PaymentExecuteEssObject) r0
            java.lang.String r0 = r0.getErrorDictionaryKey()
            if (r0 == 0) goto L_0x0029
            java.util.ArrayList r0 = r6.f85263V
            java.lang.Object r0 = r0.get(r1)
            ge.bog.mobilebank.model.PaymentExecuteEssObject r0 = (p341ge.bog.mobilebank.model.PaymentExecuteEssObject) r0
            java.lang.String r0 = r0.getErrorDictionaryKey()
            java.lang.String r0 = r90.C27950a.m86284a(r0)
            goto L_0x002f
        L_0x0029:
            int r0 = p366bk.C10328q.payments_result_could_not_exec_payment
            java.lang.String r0 = r6.getString(r0)
        L_0x002f:
            java.lang.String r7 = g91.C32315k0.m95270s(r7)
            r7.hashCode()
            int r3 = r7.hashCode()
            java.lang.String r4 = "P"
            r5 = -1
            switch(r3) {
                case 78: goto L_0x0056;
                case 79: goto L_0x0040;
                case 80: goto L_0x004d;
                case 81: goto L_0x0040;
                case 82: goto L_0x0042;
                default: goto L_0x0040;
            }
        L_0x0040:
            r1 = r5
            goto L_0x005f
        L_0x0042:
            java.lang.String r1 = "R"
            boolean r7 = r7.equals(r1)
            if (r7 != 0) goto L_0x004b
            goto L_0x0040
        L_0x004b:
            r1 = 2
            goto L_0x005f
        L_0x004d:
            boolean r7 = r7.equals(r4)
            if (r7 != 0) goto L_0x0054
            goto L_0x0040
        L_0x0054:
            r1 = r2
            goto L_0x005f
        L_0x0056:
            java.lang.String r3 = "N"
            boolean r7 = r7.equals(r3)
            if (r7 != 0) goto L_0x005f
            goto L_0x0040
        L_0x005f:
            switch(r1) {
                case 0: goto L_0x0103;
                case 1: goto L_0x0083;
                case 2: goto L_0x0064;
                default: goto L_0x0062;
            }
        L_0x0062:
            goto L_0x012a
        L_0x0064:
            p90.j1 r7 = r6.f85248G
            com.airbnb.lottie.LottieAnimationView r7 = r7.f69028o
            int r1 = p366bk.C10327p.anim_state_error
            r7.setAnimation((int) r1)
            p90.j1 r7 = r6.f85248G
            ge.bog.mobilebank.ui.views.widgets.BogTextView r7 = r7.f69033t
            int r1 = p366bk.C10318g.f28633U0
            int r1 = androidx.core.content.C0767a.m2893c(r6, r1)
            r7.setTextColor(r1)
            p90.j1 r7 = r6.f85248G
            ge.bog.mobilebank.ui.views.widgets.BogTextView r7 = r7.f69033t
            r7.setText(r0)
            goto L_0x012a
        L_0x0083:
            boolean r7 = g91.C32303f.m95187G()
            if (r7 == 0) goto L_0x00b0
            p90.j1 r7 = r6.f85248G
            com.airbnb.lottie.LottieAnimationView r7 = r7.f69028o
            int r0 = p366bk.C10320i.ic_success_football
            r7.setImageResource(r0)
            p90.j1 r7 = r6.f85248G
            com.airbnb.lottie.LottieAnimationView r7 = r7.f69028o
            android.view.ViewGroup$LayoutParams r7 = r7.getLayoutParams()
            android.widget.LinearLayout$LayoutParams r7 = (android.widget.LinearLayout.LayoutParams) r7
            android.content.res.Resources r0 = r6.getResources()
            int r1 = p366bk.C10319h.transfer_payment_success_icon_size
            int r0 = r0.getDimensionPixelSize(r1)
            r7.height = r0
            p90.j1 r0 = r6.f85248G
            com.airbnb.lottie.LottieAnimationView r0 = r0.f69028o
            r0.setLayoutParams(r7)
            goto L_0x00e6
        L_0x00b0:
            boolean r7 = g91.C32303f.m95186F()
            if (r7 == 0) goto L_0x00dd
            p90.j1 r7 = r6.f85248G
            com.airbnb.lottie.LottieAnimationView r7 = r7.f69028o
            int r0 = p366bk.C10320i.ic_basketball_success
            r7.setImageResource(r0)
            p90.j1 r7 = r6.f85248G
            com.airbnb.lottie.LottieAnimationView r7 = r7.f69028o
            android.view.ViewGroup$LayoutParams r7 = r7.getLayoutParams()
            android.widget.LinearLayout$LayoutParams r7 = (android.widget.LinearLayout.LayoutParams) r7
            android.content.res.Resources r0 = r6.getResources()
            int r1 = p366bk.C10319h.transfer_payment_success_icon_size
            int r0 = r0.getDimensionPixelSize(r1)
            r7.height = r0
            p90.j1 r0 = r6.f85248G
            com.airbnb.lottie.LottieAnimationView r0 = r0.f69028o
            r0.setLayoutParams(r7)
            goto L_0x00e6
        L_0x00dd:
            p90.j1 r7 = r6.f85248G
            com.airbnb.lottie.LottieAnimationView r7 = r7.f69028o
            int r0 = p366bk.C10327p.anim_state_success
            r7.setAnimation((int) r0)
        L_0x00e6:
            r6.m104536W2()
            p90.j1 r7 = r6.f85248G
            ge.bog.mobilebank.ui.views.widgets.BogTextView r7 = r7.f69033t
            int r0 = p366bk.C10318g.f28640b1
            int r0 = androidx.core.content.C0767a.m2893c(r6, r0)
            r7.setTextColor(r0)
            p90.j1 r7 = r6.f85248G
            ge.bog.mobilebank.ui.views.widgets.BogTextView r7 = r7.f69033t
            int r0 = p366bk.C10328q.payments_result_transaction_completed
            r7.setText(r0)
            r6.m104550k3()
            goto L_0x012a
        L_0x0103:
            p90.j1 r7 = r6.f85248G
            com.airbnb.lottie.LottieAnimationView r7 = r7.f69028o
            int r0 = p366bk.C10327p.anim_state_warning
            r7.setAnimation((int) r0)
            p90.j1 r7 = r6.f85248G
            ge.bog.mobilebank.ui.views.widgets.BogTextView r7 = r7.f69033t
            int r0 = g91.C32335t0.m95358c(r6)
            r7.setTextColor(r0)
            p90.j1 r7 = r6.f85248G
            ge.bog.mobilebank.ui.views.widgets.BogTextView r7 = r7.f69033t
            int r0 = p366bk.C10328q.payments_result_payment_is_in_progress
            r7.setText(r0)
            java.lang.String r7 = r6.f85252K
            if (r7 == 0) goto L_0x012a
            r6.m104534U2(r7)
            r6.m104551l3()
        L_0x012a:
            p90.j1 r7 = r6.f85248G
            android.widget.ImageView r7 = r7.f69035v
            ge.bog.mobilebank.model.PaymentExecuteEssObject r0 = r6.f85256O
            java.lang.String r0 = g91.C32315k0.m95270s(r0)
            boolean r0 = r0.equals(r4)
            if (r0 == 0) goto L_0x0149
            int r0 = p366bk.C10320i.ic_download_active
            android.graphics.drawable.Drawable r0 = androidx.core.content.C0767a.m2895e(r6, r0)
            int r1 = g91.C32335t0.m95359d(r6, r2)
            android.graphics.drawable.Drawable r0 = g91.C32290b1.m95122l(r6, r0, r1)
            goto L_0x014f
        L_0x0149:
            int r0 = p366bk.C10320i.ic_download_disabled
            android.graphics.drawable.Drawable r0 = androidx.core.content.C0767a.m2895e(r6, r0)
        L_0x014f:
            r7.setImageDrawable(r0)
            p90.j1 r7 = r6.f85248G
            android.widget.LinearLayout r7 = r7.f69036w
            ge.bog.mobilebank.model.PaymentExecuteEssObject r0 = r6.f85256O
            java.lang.String r0 = g91.C32315k0.m95270s(r0)
            boolean r0 = r0.equals(r4)
            if (r0 == 0) goto L_0x0165
            r0 = 1065353216(0x3f800000, float:1.0)
            goto L_0x0167
        L_0x0165:
            r0 = 1056964608(0x3f000000, float:0.5)
        L_0x0167:
            r7.setAlpha(r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p341ge.bog.mobilebank.p975ui.activities.PaymentResultActivity.m104547h3(ge.bog.mobilebank.model.PaymentExecuteEssObject):void");
    }

    /* renamed from: i3 */
    private void m104548i3() {
        this.f85248G.f69036w.setOnClickListener(new C30705n8(this));
        this.f85248G.f69021h.setOnClickListener(new C30718o8(this));
        this.f85248G.f69018e.setOnClickListener(new C30731p8(this));
    }

    /* renamed from: j3 */
    private void m104549j3() {
        if (C32315k0.m95270s(this.f85256O).equals("P")) {
            String w = new Gson().mo18181w(this.f85256O.getPaymentDataObject());
            String essServiceId = this.f85256O.getEssServiceId();
            try {
                w = URLEncoder.encode(w, "utf-8");
            } catch (UnsupportedEncodingException e) {
                e.printStackTrace();
            }
            HashMap hashMap = new HashMap();
            hashMap.put("essParameters", w);
            hashMap.put("lastFour", this.f85258Q);
            hashMap.put("essServiceId", essServiceId);
            hashMap.put("requestId", C32359z0.m95563d0());
            String urlWithExtras = RetrofitClient.getUrlWithExtras(BankApi.PAYMENTS_GET_PAYMENT_HISTORY_PDF, hashMap);
            C32303f.m95195f(urlWithExtras, this, getString(C10328q.f28968x1) + ".pdf", "application/pdf");
        }
    }

    /* renamed from: k3 */
    private void m104550k3() {
        this.f85253L.postDelayed(this.f85249H, 1000);
    }

    /* renamed from: l3 */
    private void m104551l3() {
        this.f85248G.f69029p.setVisibility(0);
    }

    /* access modifiers changed from: protected */
    /* renamed from: O1 */
    public void mo37451O1(Bundle bundle) {
        int i;
        int i2;
        int i3;
        float f;
        String y;
        PaymentProviderConfiguration templateConfigViaTemplateId;
        C27335j1 d = C27335j1.m84649d(getLayoutInflater());
        this.f85248G = d;
        super.mo70996D2(bundle, d);
        m104548i3();
        C32343x.m95423W0(this.f85269b0, this);
        this.f85260S = getIntent().getBooleanExtra("PAYMENT_TIMED_OUT", false);
        this.f85264W = getIntent().getBooleanExtra("PAYMENT_SINGLE", true);
        LinearLayout linearLayout = this.f85248G.f69026m;
        int i4 = 8;
        if (this.f85260S) {
            i = 8;
        } else {
            i = 0;
        }
        linearLayout.setVisibility(i);
        LinearLayout linearLayout2 = this.f85248G.f69019f;
        if (this.f85260S) {
            i2 = 8;
        } else {
            i2 = 0;
        }
        linearLayout2.setVisibility(i2);
        LinearLayout linearLayout3 = this.f85248G.f69022i;
        if (this.f85260S) {
            i3 = 8;
        } else {
            i3 = 0;
        }
        linearLayout3.setVisibility(i3);
        View view = this.f85248G.f69023j;
        if (!this.f85260S) {
            i4 = 0;
        }
        view.setVisibility(i4);
        this.f85262U = (BigDecimal) getIntent().getSerializableExtra("add_bonus_amount");
        if (this.f85260S) {
            String stringExtra = getIntent().getStringExtra("PAYMENT_WARNING_KEY");
            this.f85261T = getIntent().getBooleanExtra("IS_TRANSFER", false);
            this.f85248G.f69028o.setAnimation(C10327p.anim_state_warning);
            this.f85248G.f69033t.setTextColor(C32335t0.m95358c(this));
            if (TextUtils.isEmpty(stringExtra)) {
                if (this.f85261T) {
                    stringExtra = "text.transfer.timeout.warning";
                } else if (this.f85264W) {
                    stringExtra = "text.payment.timeout.warning";
                } else {
                    stringExtra = "text.payments.timeout.warning";
                }
            }
            this.f85248G.f69033t.setText(C27950a.m86284a(stringExtra));
        } else {
            this.f85259R = getIntent().getBooleanExtra("PAYMENT_OTHER_CARD", false);
            ArrayList arrayList = (ArrayList) C42035e.m122119a(getIntent().getParcelableExtra("PAYMENT_EXECUTED_DATA_OBJECT"));
            this.f85263V = arrayList;
            if (arrayList.size() > 0) {
                this.f85256O = (PaymentExecuteEssObject) this.f85263V.get(0);
                this.f85252K = getIntent().getExtras().getString("TRANSACTION_ID", (String) null);
                try {
                    this.f85257P = (PaymentServiceConfig) C42035e.m122119a(getIntent().getParcelableExtra("PAYMENT_SERVICE_CONFIG_JSON"));
                    this.f85251J = getIntent().getBooleanExtra("PAY_WITH_POINTS", false);
                } catch (Exception unused) {
                }
                this.f85258Q = getIntent().getStringExtra("PAYMENT_EXECUTED_LAST_FOUR");
                if (this.f85257P == null && (y = C32315k0.m95276y(this.f85256O.getEssParameters())) != null && !y.equals("") && (templateConfigViaTemplateId = this.f85267Z.getTemplateConfigViaTemplateId(y)) != null) {
                    this.f85257P = templateConfigViaTemplateId.getServiceConfigJson();
                }
                PaymentServiceConfig paymentServiceConfig = this.f85257P;
                if (paymentServiceConfig != null) {
                    m104538Y2(C32315k0.m95269r(this, paymentServiceConfig, this.f85256O.getEssParameters(), this.f85251J, this.f85259R));
                    if (this.f85251J) {
                        this.f85248G.f69016A.setText(getString(C10328q.bonus_exchange_paid_points));
                        this.f85248G.f69039z.setText(C32315k0.m95271t(this.f85256O.getEssParameters()) + " " + getString(C10328q.payments_plus_points));
                    } else {
                        this.f85248G.f69039z.setText(C32315k0.m95246A(this.f85256O.getEssParameters(), this.f85259R));
                    }
                }
                m104547h3(this.f85256O);
                PaymentServiceConfig paymentServiceConfig2 = this.f85257P;
                if (paymentServiceConfig2 != null) {
                    this.f85250I = C27954d.m86302h(paymentServiceConfig2.getId());
                } else if (this.f85256O.getEssServiceId() != null) {
                    this.f85250I = C27954d.m86301g(this.f85256O.getEssServiceId().replace("mep-", ""));
                }
                PaymentProviderConfiguration paymentProviderConfiguration = this.f85250I;
                if (paymentProviderConfiguration != null) {
                    this.f85248G.f69031r.setText(C27950a.m86286c(paymentProviderConfiguration.getServiceName(), true));
                    String c = C32289b0.m95091c(this.f85250I.getLogo());
                    ImageView imageView = this.f85248G.f69030q;
                    int i5 = C10320i.f28688dc;
                    C32289b0.m95107s(imageView, c, Integer.valueOf(i5), Integer.valueOf(i5), true, false);
                    LinearLayout linearLayout4 = this.f85248G.f69021h;
                    float f2 = 1.0f;
                    if (this.f85250I.isDDAllowed()) {
                        f = 1.0f;
                    } else {
                        f = 0.5f;
                    }
                    linearLayout4.setAlpha(f);
                    this.f85248G.f69020g.setImageDrawable(C32290b1.m95122l(this, C0767a.m2895e(this, C10320i.ic_automatic_with_padding), C32335t0.m95359d(this, true)));
                    LinearLayout linearLayout5 = this.f85248G.f69018e;
                    if (!this.f85250I.isTemplateAccessAllowed) {
                        f2 = 0.5f;
                    }
                    linearLayout5.setAlpha(f2);
                }
                C36546y.m108282F().mo27137H("payment_completed", "", "", (Bundle) null, C10464h.C10465a.FACEBOOKANDFIREBASE);
                String z = C32315k0.m95277z(this.f85256O.getEssParameters());
                if (z != null && !z.equals("")) {
                    this.f85248G.f69037x.setVisibility(0);
                    this.f85248G.f69034u.setText(z);
                }
                if (!this.f85251J) {
                    MedalliaDigital.setCustomParameter("event", "payment_complete");
                    if (this.f85256O.getEssServiceId() != null) {
                        MedalliaDigital.setCustomParameter("context1", this.f85256O.getEssServiceId());
                    }
                }
            } else {
                m104546g3();
                return;
            }
        }
        m104546g3();
    }

    /* access modifiers changed from: protected */
    public void onDestroy() {
        super.onDestroy();
        this.f85253L.removeCallbacks(this.f85249H);
        C32343x.m95489t1(this.f85269b0, this);
    }

    @C41452l
    public void onFeatureFeedbackResponse(FeatureFeedBackEvent featureFeedBackEvent) {
        if (featureFeedBackEvent.getState() == 20) {
            C38194r.m112360A(this, featureFeedBackEvent, FeatureFeedBackEvent.Location.PAYMENTS);
        }
    }

    public void onRequestPermissionsResult(int i, String[] strArr, int[] iArr) {
        super.onRequestPermissionsResult(i, strArr, iArr);
        if (i == 10016 && C32303f.m95190a(iArr)) {
            m104549j3();
        }
    }

    /* access modifiers changed from: protected */
    public void onResume() {
        super.onResume();
        MedalliaDigital.enableIntercept();
    }

    /* renamed from: z1 */
    public String mo38120z1() {
        return getString(C10328q.header_text_payment);
    }
}
