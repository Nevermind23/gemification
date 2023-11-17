package p341ge.bog.mobilebank.p975ui.activities.qrpay;

import a91.C30896j;
import android.app.Activity;
import android.content.Intent;
import android.location.Location;
import android.os.Bundle;
import android.view.View;
import androidx.recyclerview.widget.LinearLayoutManager;
import e81.C31687d;
import e81.C31688e;
import g91.C32297d;
import g91.C32343x;
import g91.C32359z0;
import hd1.C41205b;
import jg1.C41438c;
import jg1.C41452l;
import l81.C37104a;
import org.parceler.C42035e;
import p341ge.bog.mobilebank.eventbus.events.PaymentCardsEvent;
import p341ge.bog.mobilebank.model.Client;
import p341ge.bog.mobilebank.model.qrpay.QrPaymentResult;
import p341ge.bog.mobilebank.p975ui.model.qrpay.QrId;
import p341ge.bog.mobilebank.p975ui.model.qrpay.QrPayData;
import p341ge.bog.mobilebank.rest.BankApi;
import p341ge.bog.mobilebank.rest.manager.PreferencesApiManager;
import p341ge.bog.mobilebank.rest.model.RestCallback;
import p341ge.bog.mobilebank.shared2.network.BankApiResponse;
import p90.C27417s1;

/* renamed from: ge.bog.mobilebank.ui.activities.qrpay.QrPayCardSelectActivity */
public class QrPayCardSelectActivity extends C35489b implements C37104a {

    /* renamed from: T */
    public static int f85776T = 527;

    /* renamed from: G */
    protected BankApi f85777G;

    /* renamed from: H */
    protected Client f85778H;

    /* renamed from: I */
    protected C41438c f85779I;

    /* renamed from: J */
    protected PreferencesApiManager f85780J;

    /* renamed from: K */
    private C27417s1 f85781K;
    /* access modifiers changed from: private */

    /* renamed from: L */
    public int f85782L = 0;
    /* access modifiers changed from: private */

    /* renamed from: M */
    public String f85783M;

    /* renamed from: N */
    private QrId f85784N;
    /* access modifiers changed from: private */

    /* renamed from: O */
    public String f85785O;

    /* renamed from: P */
    private String f85786P;

    /* renamed from: Q */
    private String f85787Q;

    /* renamed from: R */
    private PaymentCardsEvent f85788R;

    /* renamed from: S */
    private C30896j f85789S;

    /* renamed from: ge.bog.mobilebank.ui.activities.qrpay.QrPayCardSelectActivity$a */
    class C35481a implements Runnable {
        C35481a() {
        }

        public void run() {
            QrPayCardSelectActivity.this.m105370N2(false);
        }
    }

    /* renamed from: ge.bog.mobilebank.ui.activities.qrpay.QrPayCardSelectActivity$b */
    class C35482b extends RestCallback {
        C35482b() {
        }

        public void onEnqueue(C41205b bVar) {
            QrPayCardSelectActivity.this.mo86438k1(bVar);
        }

        public void onFailure(Throwable th) {
            QrPayCardSelectActivity.this.m105367K2();
            C32297d.m95153a(QrPayCardSelectActivity.this);
        }

        public void onResponse(BankApiResponse bankApiResponse) {
            QrPayCardSelectActivity.this.m105367K2();
            QrPayResultActivity.m105385M2(QrPayCardSelectActivity.this, bankApiResponse.isSuccess(), QrPayCardSelectActivity.this.f85785O, QrPayCardSelectActivity.this.f85783M, (QrPaymentResult) bankApiResponse.getResult());
            QrPayCardSelectActivity.this.f85782L = -1;
            QrPayCardSelectActivity.this.finish();
        }
    }

    /* renamed from: J2 */
    private void m105366J2() {
        finish();
    }

    /* access modifiers changed from: private */
    /* renamed from: K2 */
    public void m105367K2() {
        this.f85781K.f69739j.setVisibility(8);
    }

    /* access modifiers changed from: private */
    /* renamed from: L2 */
    public /* synthetic */ void m105368L2(View view) {
        m105371O2();
    }

    /* access modifiers changed from: private */
    /* renamed from: M2 */
    public /* synthetic */ void m105369M2(View view) {
        m105366J2();
    }

    /* access modifiers changed from: private */
    /* renamed from: N2 */
    public void m105370N2(boolean z) {
        if (z) {
            m105372P2();
        }
        this.f85778H.requestPaymentCards((String) null, true);
    }

    /* renamed from: O2 */
    private void m105371O2() {
        Double d;
        Double d2;
        Double d3;
        if (this.f85789S.mo71103n() != null) {
            m105372P2();
            String valueOf = String.valueOf(this.f85789S.mo71103n().getCardId());
            Location lastKnowLocation = this.f85780J.getLastKnowLocation();
            if (lastKnowLocation != null) {
                Double valueOf2 = Double.valueOf(lastKnowLocation.getLatitude());
                Double valueOf3 = Double.valueOf(lastKnowLocation.getLongitude());
                d = Double.valueOf(lastKnowLocation.getAltitude());
                d3 = valueOf2;
                d2 = valueOf3;
            } else {
                d3 = null;
                d2 = null;
                d = null;
            }
            this.f85777G.qrPay(this.f85784N.getId(), this.f85784N.getVersion(), this.f85784N.getType(), this.f85787Q, valueOf, this.f85783M, "GEL", d3, d2, d, new C35482b());
        }
    }

    /* renamed from: P2 */
    private void m105372P2() {
        this.f85781K.f69739j.setVisibility(0);
    }

    /* renamed from: Q2 */
    public static void m105373Q2(Activity activity, QrPayData qrPayData) {
        Intent intent = new Intent(activity, QrPayCardSelectActivity.class);
        intent.putExtra("ge.bog.mobilebank.ui.activities.QR_PAYMENT_DATA", C42035e.m122121c(qrPayData));
        activity.startActivityForResult(intent, f85776T);
    }

    /* renamed from: R2 */
    private void m105374R2() {
        if (this.f85788R.getState() != 10) {
            m105367K2();
            if (this.f85788R.getState() == 20) {
                this.f85781K.f69737h.hideLayout();
            }
        }
        if (this.f85788R.isErrorOrNetworkFailure()) {
            this.f85781K.f69737h.stopAnimating();
            this.f85781K.f69737h.showLayout();
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: O1 */
    public void mo37451O1(Bundle bundle) {
        C27417s1 d = C27417s1.m84973d(getLayoutInflater());
        this.f85781K = d;
        setContentView((View) d.mo3946b());
        C32343x.m95423W0(this.f85779I, this);
        this.f85781K.f69738i.setOnClickListener(new C31687d(this));
        this.f85781K.f69740k.mo3946b().setOnClickListener(new C31688e(this));
        QrPayData qrPayData = (QrPayData) C42035e.m122119a(getIntent().getParcelableExtra("ge.bog.mobilebank.ui.activities.QR_PAYMENT_DATA"));
        this.f85785O = qrPayData.getMerchantName();
        this.f85784N = qrPayData.getQrId();
        this.f85787Q = qrPayData.getQrStandard();
        this.f85783M = qrPayData.getAmount();
        this.f85786P = qrPayData.getMerchantTerminalId();
        this.f85781K.f69734e.setText(C32359z0.m95594v(this.f85783M));
        this.f85789S = new C30896j();
        this.f85781K.f69736g.setLayoutManager(new LinearLayoutManager(this));
        this.f85781K.f69736g.setAdapter(this.f85789S);
        this.f85781K.f69737h.setExecutorRunnable(new C35481a());
        m105370N2(true);
        C32343x.m95489t1(this.f85779I, this);
    }

    /* renamed from: Z0 */
    public void mo48298Z0(int i) {
    }

    public void finish() {
        setResult(this.f85782L);
        super.finish();
    }

    @C41452l
    public void onPaymentCardsEvent(PaymentCardsEvent paymentCardsEvent) {
        if (paymentCardsEvent != this.f85788R) {
            this.f85788R = paymentCardsEvent;
            m105374R2();
            if (paymentCardsEvent.getState() == 20) {
                this.f85789S.mo71107r(paymentCardsEvent.getPaymentCards());
                this.f85789S.mo71105p(this);
                this.f85789S.notifyDataSetChanged();
            }
        }
    }
}
