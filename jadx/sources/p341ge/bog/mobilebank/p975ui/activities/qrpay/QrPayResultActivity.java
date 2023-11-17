package p341ge.bog.mobilebank.p975ui.activities.qrpay;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import e81.C31690g;
import e81.C31691h;
import g91.C32303f;
import g91.C32359z0;
import org.parceler.C42035e;
import p341ge.bog.mobilebank.model.Client;
import p341ge.bog.mobilebank.model.qrpay.QrPaymentResult;
import p341ge.bog.mobilebank.p975ui.views.widgets.SuccessScreenView;
import p341ge.bog.mobilebank.shared2.network.BankApiResponse;
import p366bk.C10318g;
import p366bk.C10320i;
import p366bk.C10322k;
import p366bk.C10324m;
import p366bk.C10328q;
import r90.C27950a;

/* renamed from: ge.bog.mobilebank.ui.activities.qrpay.QrPayResultActivity */
public class QrPayResultActivity extends C35491c {

    /* renamed from: G */
    protected Client f85792G;

    /* renamed from: H */
    private SuccessScreenView f85793H;

    /* renamed from: I */
    private View f85794I;

    /* renamed from: J */
    private QrPaymentResult f85795J;

    /* renamed from: K */
    private boolean f85796K;

    /* renamed from: L */
    private String f85797L;

    /* renamed from: M */
    private String f85798M;

    /* renamed from: N */
    private boolean f85799N;

    /* renamed from: G2 */
    private void m105379G2() {
        QrPayReversalActivity.m105407S2(this, this.f85795J.getDocKey(), this.f85797L, this.f85798M);
        finish();
    }

    /* renamed from: H2 */
    private String m105380H2(int i, int i2) {
        return this.f85796K ? getString(i) : getString(i2);
    }

    /* access modifiers changed from: private */
    /* renamed from: I2 */
    public /* synthetic */ void m105381I2(View view) {
        m105379G2();
    }

    /* access modifiers changed from: private */
    /* renamed from: J2 */
    public /* synthetic */ void m105382J2(View view) {
        m105384L2();
    }

    /* renamed from: K2 */
    private void m105383K2() {
        findViewById(C10322k.cancel_transaction).setOnClickListener(new C31690g(this));
        findViewById(C10322k.share_payment_result).setOnClickListener(new C31691h(this));
    }

    /* renamed from: L2 */
    private void m105384L2() {
        this.f85799N = true;
        String b = C32303f.m95191b(Long.valueOf(this.f85795J.getDocKey()).longValue(), (String) null, this.f85795J.getPrintFormType());
        C32303f.m95195f(b, this, getString(C10328q.f28968x1) + ".pdf", "application/pdf");
    }

    /* renamed from: M2 */
    public static void m105385M2(Activity activity, boolean z, String str, String str2, QrPaymentResult qrPaymentResult) {
        m105387O2(activity, z, (String) null, str, str2, qrPaymentResult, false);
    }

    /* renamed from: N2 */
    public static void m105386N2(Activity activity, BankApiResponse bankApiResponse, String str, String str2) {
        m105387O2(activity, bankApiResponse.isSuccess(), bankApiResponse.getKey(), str, str2, (QrPaymentResult) null, true);
    }

    /* renamed from: O2 */
    private static void m105387O2(Activity activity, boolean z, String str, String str2, String str3, QrPaymentResult qrPaymentResult, boolean z2) {
        Intent intent = new Intent(activity, QrPayResultActivity.class);
        intent.putExtra("MERCHANT_NAME", str2);
        intent.putExtra("AMOUNT_PAID", str3);
        intent.putExtra("PAYMENT_RESULT", C42035e.m122121c(qrPaymentResult));
        intent.putExtra("PAYMENT_SUCCEEDED", z);
        intent.putExtra("IS_PAYMENT_REVERSAL", z2);
        intent.putExtra("ERROR_DICTIONARY_KEY", str);
        activity.startActivity(intent);
    }

    /* access modifiers changed from: protected */
    /* renamed from: M1 */
    public int mo49479M1() {
        return C10324m.activity_qr_pay_result;
    }

    /* access modifiers changed from: protected */
    /* renamed from: O1 */
    public void mo37451O1(Bundle bundle) {
        int i;
        int i2;
        String str;
        String str2;
        super.mo37451O1(bundle);
        this.f85793H = (SuccessScreenView) findViewById(C10322k.successScreen);
        this.f85794I = findViewById(C10322k.f28821b5);
        m105383K2();
        this.f85796K = getIntent().getBooleanExtra("PAYMENT_SUCCEEDED", false);
        this.f85797L = getIntent().getStringExtra("MERCHANT_NAME");
        this.f85798M = getIntent().getStringExtra("AMOUNT_PAID");
        this.f85795J = (QrPaymentResult) C42035e.m122119a(getIntent().getParcelableExtra("PAYMENT_RESULT"));
        boolean booleanExtra = getIntent().getBooleanExtra("IS_PAYMENT_REVERSAL", false);
        boolean z = this.f85796K;
        if (z) {
            i = C10318g.success_screen_positive_title_color;
        } else {
            i = C10318g.success_screen_negative_title_color;
        }
        if (z) {
            i2 = C10320i.ic_result_success;
        } else {
            i2 = C10320i.ic_result_denied;
        }
        if (booleanExtra) {
            this.f85794I.setVisibility(8);
            str = m105380H2(C10328q.transaction_canceled_success, C10328q.transaction_reversal_error);
            if (!this.f85796K && getIntent().getStringExtra("ERROR_DICTIONARY_KEY") != null) {
                str = C27950a.m86284a(getIntent().getStringExtra("ERROR_DICTIONARY_KEY"));
            }
            str2 = m105380H2(C10328q.returned_amount, C10328q.common_text_amount);
        } else {
            str = m105380H2(C10328q.payments_result_transaction_completed, C10328q.payments_result_could_not_exec_payment);
            String H2 = m105380H2(C10328q.paid_amount, C10328q.common_text_amount);
            if (!this.f85796K) {
                this.f85794I.setVisibility(8);
            } else {
                this.f85793H.hideBottomDivider();
            }
            str2 = H2;
        }
        this.f85793H.setTitle(str, i);
        this.f85793H.setIcon(i2);
        this.f85793H.addHeader(getString(C10328q.f28936Q1));
        this.f85793H.addDetailsItem(getString(C10328q.merchant), this.f85797L);
        String J = C32359z0.m95539J(this.f85798M);
        SuccessScreenView successScreenView = this.f85793H;
        if (J == null) {
            J = "";
        }
        successScreenView.addDetailsItem(str2, J);
        if (this.f85796K) {
            this.f85792G.forceUpdateData();
        }
    }

    public void onRequestPermissionsResult(int i, String[] strArr, int[] iArr) {
        super.onRequestPermissionsResult(i, strArr, iArr);
        if (i == 10016 && iArr.length > 0 && iArr[0] == 0 && this.f85799N) {
            m105384L2();
            this.f85799N = false;
        }
    }
}
