package p341ge.bog.mobilebank.p975ui.activities;

import android.content.res.Resources;
import android.os.Bundle;
import android.os.Handler;
import android.widget.LinearLayout;
import androidx.core.content.C0767a;
import androidx.recyclerview.widget.LinearLayoutManager;
import com.google.gson.Gson;
import com.medallia.digital.mobilesdk.MedalliaDigital;
import g81.C32127b0;
import g91.C32297d;
import g91.C32303f;
import g91.C32315k0;
import g91.C32335t0;
import g91.C32343x;
import hd1.C41205b;
import iu0.C36546y;
import java.util.ArrayList;
import java.util.Iterator;
import jg1.C41438c;
import jg1.C41452l;
import org.parceler.C42035e;
import p341ge.bog.mobilebank.eventbus.events.FeatureFeedBackEvent;
import p341ge.bog.mobilebank.model.Client;
import p341ge.bog.mobilebank.model.ExternalPaymentDetails;
import p341ge.bog.mobilebank.model.KeyValue;
import p341ge.bog.mobilebank.model.PaymentDataObject;
import p341ge.bog.mobilebank.model.PaymentExecuteEssObject;
import p341ge.bog.mobilebank.model.payment.PaymentDebtResponse;
import p341ge.bog.mobilebank.model.payment.PaymentServiceConfig;
import p341ge.bog.mobilebank.rest.BankApi;
import p341ge.bog.mobilebank.rest.model.RestCallback;
import p341ge.bog.mobilebank.shared2.network.BankApiResponse;
import p366bk.C10318g;
import p366bk.C10319h;
import p366bk.C10320i;
import p366bk.C10328q;
import p380ck.C10464h;
import p90.C27325i1;
import q81.C38194r;
import r90.C27950a;

/* renamed from: ge.bog.mobilebank.ui.activities.PaymentResultListActivity */
public class PaymentResultListActivity extends C35375d0 {

    /* renamed from: G */
    private C27325i1 f85275G;

    /* renamed from: H */
    private C32127b0 f85276H;

    /* renamed from: I */
    private String f85277I;
    /* access modifiers changed from: private */

    /* renamed from: J */
    public Handler f85278J = new Handler();
    /* access modifiers changed from: private */

    /* renamed from: K */
    public Runnable f85279K;
    /* access modifiers changed from: private */

    /* renamed from: L */
    public Gson f85280L = new Gson();

    /* renamed from: M */
    private PaymentServiceConfig f85281M;

    /* renamed from: N */
    private boolean f85282N;

    /* renamed from: O */
    protected BankApi f85283O;

    /* renamed from: P */
    protected Client f85284P;

    /* renamed from: Q */
    protected C41438c f85285Q;

    /* renamed from: R */
    private Runnable f85286R = new C35291a();

    /* renamed from: ge.bog.mobilebank.ui.activities.PaymentResultListActivity$a */
    class C35291a implements Runnable {
        C35291a() {
        }

        public void run() {
            PaymentResultListActivity.this.f85284P.requestFeatureFeedback(false);
        }
    }

    /* renamed from: ge.bog.mobilebank.ui.activities.PaymentResultListActivity$b */
    class C35292b extends RestCallback {

        /* renamed from: a */
        final /* synthetic */ String f85288a;

        C35292b(String str) {
            this.f85288a = str;
        }

        public void onEnqueue(C41205b bVar) {
            PaymentResultListActivity.this.mo86438k1(bVar);
        }

        public void onFailure(Throwable th) {
            super.onFailure(th);
        }

        public void onResponse(BankApiResponse bankApiResponse) {
            super.onResponse(bankApiResponse);
            if (bankApiResponse.isSuccess()) {
                for (KeyValue keyValue : ((PaymentDebtResponse) bankApiResponse.getResult()).getParameter()) {
                    if (keyValue.getKey().equals("paymentData")) {
                        ArrayList arrayList = new ArrayList();
                        Iterator<PaymentDataObject> it = ((ExternalPaymentDetails) PaymentResultListActivity.this.f85280L.mo18170l(keyValue.getValue(), ExternalPaymentDetails.class)).getPaymentDetails().iterator();
                        boolean z = true;
                        while (it.hasNext()) {
                            PaymentDataObject next = it.next();
                            if (next.getProcessStatus().equals("N") && z) {
                                z = false;
                            }
                            arrayList.add(next.getInternalExecutor());
                        }
                        PaymentResultListActivity.this.m104561L2(arrayList);
                        if (!z) {
                            if (PaymentResultListActivity.this.f85279K == null) {
                                PaymentResultListActivity paymentResultListActivity = PaymentResultListActivity.this;
                                paymentResultListActivity.f85279K = new C35293c(this.f85288a);
                            }
                            PaymentResultListActivity.this.f85278J.postDelayed(PaymentResultListActivity.this.f85279K, 3000);
                        }
                    }
                }
                return;
            }
            C32297d.m95157e(PaymentResultListActivity.this, C27950a.m86284a(bankApiResponse.getKey()));
        }
    }

    /* renamed from: ge.bog.mobilebank.ui.activities.PaymentResultListActivity$c */
    private class C35293c implements Runnable {

        /* renamed from: d */
        private String f85290d;

        public C35293c(String str) {
            this.f85290d = str;
        }

        public void run() {
            PaymentResultListActivity.this.m104560K2(this.f85290d);
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: K2 */
    public void m104560K2(String str) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(new KeyValue("extTransactionId", str));
        this.f85283O.paymentsExecute("", "mep-bog-payment3des-get-data", this.f85280L.mo18181w(arrayList), (RestCallback<BankApiResponse<PaymentDebtResponse>>) new C35292b(str));
    }

    /* access modifiers changed from: private */
    /* renamed from: L2 */
    public void m104561L2(ArrayList arrayList) {
        this.f85276H.mo72613k(arrayList);
        Iterator it = arrayList.iterator();
        int i = 0;
        int i2 = 0;
        int i3 = 0;
        while (it.hasNext()) {
            PaymentExecuteEssObject paymentExecuteEssObject = (PaymentExecuteEssObject) it.next();
            if (C32315k0.m95270s(paymentExecuteEssObject).equals("P")) {
                i2++;
            } else if (C32315k0.m95270s(paymentExecuteEssObject).equals("R")) {
                i++;
            } else if (C32315k0.m95270s(paymentExecuteEssObject).equals(BankApiResponse.CODE_STATUS_WARNING)) {
                i3++;
            }
        }
        if (i == 0 && arrayList.size() == i2) {
            if (C32303f.m95187G()) {
                this.f85275G.f68942f.setImageResource(C10320i.ic_success_football);
                LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) this.f85275G.f68942f.getLayoutParams();
                Resources resources = getResources();
                int i4 = C10319h.transfer_payment_success_icon_size;
                layoutParams.height = resources.getDimensionPixelSize(i4);
                layoutParams.width = getResources().getDimensionPixelSize(i4);
                this.f85275G.f68942f.setLayoutParams(layoutParams);
            } else if (C32303f.m95186F()) {
                this.f85275G.f68942f.setImageResource(C10320i.ic_basketball_success);
                LinearLayout.LayoutParams layoutParams2 = (LinearLayout.LayoutParams) this.f85275G.f68942f.getLayoutParams();
                Resources resources2 = getResources();
                int i5 = C10319h.transfer_payment_success_icon_size;
                layoutParams2.height = resources2.getDimensionPixelSize(i5);
                layoutParams2.width = getResources().getDimensionPixelSize(i5);
                this.f85275G.f68942f.setLayoutParams(layoutParams2);
            } else {
                this.f85275G.f68942f.setImageResource(C10320i.ic_result_success);
            }
            this.f85275G.f68943g.setTextColor(C0767a.m2893c(this, C10318g.bog_dialog_green_color));
            this.f85275G.f68943g.setText(C10328q.payments_result_all_payments_were_paid_successfully);
            m104562M2();
        } else if (i2 == 0 && arrayList.size() == i + i3) {
            this.f85275G.f68942f.setImageResource(C10320i.ic_result_denied);
            this.f85275G.f68943g.setTextColor(C0767a.m2893c(this, C10318g.bog_error_red));
            this.f85275G.f68943g.setText(C10328q.payments_result_could_not_pay_payments);
        } else {
            this.f85275G.f68942f.setImageResource(C10320i.ic_result_process);
            this.f85275G.f68943g.setTextColor(C32335t0.m95358c(this));
            String string = getString(C10328q.payments_result_all_payments_are_in_processing);
            if (i2 != 0) {
                string = getString(C10328q.payments_result_were_paid_successfully, new Object[]{Integer.valueOf(arrayList.size()), Integer.valueOf(i2)});
            }
            this.f85275G.f68943g.setText(string);
        }
    }

    /* renamed from: M2 */
    private void m104562M2() {
        this.f85278J.postDelayed(this.f85286R, 1000);
    }

    /* access modifiers changed from: protected */
    /* renamed from: O1 */
    public void mo37451O1(Bundle bundle) {
        C27325i1 d = C27325i1.m84607d(getLayoutInflater());
        this.f85275G = d;
        super.mo70996D2(bundle, d);
        mo86441o2();
        C32343x.m95423W0(this.f85285Q, this);
        this.f85282N = getIntent().getBooleanExtra("PAYMENT_OTHER_CARD", false);
        if (getIntent().getBooleanExtra("IS_LIST_WITH_SHARED_CONFIGURATION", false)) {
            this.f85281M = (PaymentServiceConfig) C42035e.m122119a(getIntent().getParcelableExtra("PAYMENT_SERVICE_CONFIG_JSON"));
        }
        this.f85277I = getIntent().getExtras().getString("TRANSACTION_ID", (String) null);
        this.f85276H = new C32127b0(this, this.f85281M, this.f85282N, this.f85284P);
        this.f85275G.f68944h.setLayoutManager(new LinearLayoutManager(this, 1, false));
        this.f85275G.f68944h.setAdapter(this.f85276H);
        m104561L2((ArrayList) C42035e.m122119a(getIntent().getParcelableExtra("PAYMENT_EXECUTED_DATA_OBJECT")));
        String str = this.f85277I;
        if (str != null) {
            m104560K2(str);
        }
        mo86425J1();
        this.f85284P.requestTemplateDebts(true);
        this.f85284P.requestCarDebts(true);
        this.f85284P.forceUpdateData();
        C36546y.m108282F().mo27137H("payment_completed", "", "", (Bundle) null, C10464h.C10465a.FACEBOOKANDFIREBASE);
        MedalliaDigital.setCustomParameter("event", "payment_complete");
        MedalliaDigital.setCustomParameter("context1", "basket");
    }

    /* access modifiers changed from: protected */
    public void onDestroy() {
        super.onDestroy();
        this.f85278J.removeCallbacks(this.f85286R);
        C32343x.m95489t1(this.f85285Q, this);
    }

    @C41452l
    public void onFeatureFeedbackResponse(FeatureFeedBackEvent featureFeedBackEvent) {
        if (featureFeedBackEvent.getState() == 20) {
            C38194r.m112360A(this, featureFeedBackEvent, FeatureFeedBackEvent.Location.PAYMENTS);
        }
    }

    /* access modifiers changed from: protected */
    public void onResume() {
        super.onResume();
        MedalliaDigital.enableIntercept();
    }
}
