package p341ge.bog.mobilebank.p975ui.activities.qrpay;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextUtils;
import android.text.TextWatcher;
import android.view.View;
import e81.C31693j;
import e81.C31694k;
import g91.C32290b1;
import g91.C32297d;
import g91.C32359z0;
import hd1.C41205b;
import i10.C25100c;
import p341ge.bog.mobilebank.model.qrpay.ReversalOtpResult;
import p341ge.bog.mobilebank.rest.BankApi;
import p341ge.bog.mobilebank.rest.model.RestCallback;
import p341ge.bog.mobilebank.shared2.network.BankApiResponse;
import p366bk.C10313b;
import p366bk.C10328q;
import p90.C27426t1;
import r90.C27950a;
import v81.C39259a;

/* renamed from: ge.bog.mobilebank.ui.activities.qrpay.QrPayReversalActivity */
public class QrPayReversalActivity extends C35493d implements TextWatcher {

    /* renamed from: G */
    protected BankApi f85800G;
    /* access modifiers changed from: private */

    /* renamed from: H */
    public C27426t1 f85801H;

    /* renamed from: I */
    private String f85802I;
    /* access modifiers changed from: private */

    /* renamed from: J */
    public String f85803J;
    /* access modifiers changed from: private */

    /* renamed from: K */
    public String f85804K;
    /* access modifiers changed from: private */

    /* renamed from: L */
    public String f85805L;
    /* access modifiers changed from: private */

    /* renamed from: M */
    public int f85806M = 0;

    /* renamed from: ge.bog.mobilebank.ui.activities.qrpay.QrPayReversalActivity$a */
    class C35483a implements Runnable {
        C35483a() {
        }

        public void run() {
            C32290b1.m95115e(QrPayReversalActivity.this.f85801H.f69826e.f69986g.getEditText());
        }
    }

    /* renamed from: ge.bog.mobilebank.ui.activities.qrpay.QrPayReversalActivity$b */
    class C35484b implements C39259a {
        C35484b() {
        }

        /* renamed from: a */
        public void mo86490a() {
            QrPayReversalActivity.this.m105405Q2();
        }

        /* renamed from: b */
        public void mo86491b() {
        }
    }

    /* renamed from: ge.bog.mobilebank.ui.activities.qrpay.QrPayReversalActivity$c */
    class C35485c extends RestCallback {
        C35485c() {
        }

        public void onEnqueue(C41205b bVar) {
            QrPayReversalActivity.this.mo86438k1(bVar);
        }

        public void onFailure(Throwable th) {
            QrPayReversalActivity.this.f85801H.f69826e.f69984e.f70108j.onOtpRequestFailure();
            C32297d.m95153a(QrPayReversalActivity.this);
        }

        public void onResponse(BankApiResponse bankApiResponse) {
            if (!bankApiResponse.isSuccess() || bankApiResponse.getResult() == null) {
                QrPayReversalActivity.this.f85801H.f69826e.f69984e.f70108j.onOtpRequestFailure();
                C32297d.m95154b(QrPayReversalActivity.this, C27950a.m86284a(bankApiResponse.getKey()));
                return;
            }
            QrPayReversalActivity.this.f85803J = ((ReversalOtpResult) bankApiResponse.getResult()).getConfirmRequestId();
            QrPayReversalActivity.this.f85801H.f69826e.f69984e.f70108j.onOtpRequestOk();
            QrPayReversalActivity qrPayReversalActivity = QrPayReversalActivity.this;
            C32297d.m95160h(qrPayReversalActivity, qrPayReversalActivity.getString(C10328q.code_is_sent_to_merchant));
        }
    }

    /* renamed from: ge.bog.mobilebank.ui.activities.qrpay.QrPayReversalActivity$d */
    class C35486d extends RestCallback {
        C35486d() {
        }

        public void onEnqueue(C41205b bVar) {
            QrPayReversalActivity.this.mo86438k1(bVar);
        }

        public void onFailure(Throwable th) {
            QrPayReversalActivity.this.f85801H.f69828g.setVisibility(8);
            C32297d.m95153a(QrPayReversalActivity.this);
        }

        public void onResponse(BankApiResponse bankApiResponse) {
            QrPayReversalActivity.this.f85801H.f69828g.setVisibility(8);
            QrPayReversalActivity qrPayReversalActivity = QrPayReversalActivity.this;
            QrPayResultActivity.m105386N2(qrPayReversalActivity, bankApiResponse, qrPayReversalActivity.f85804K, QrPayReversalActivity.this.f85805L);
            QrPayReversalActivity.this.f85806M = -1;
            QrPayReversalActivity.this.finish();
        }
    }

    /* renamed from: L2 */
    private void m105400L2() {
        finish();
    }

    /* access modifiers changed from: private */
    /* renamed from: M2 */
    public /* synthetic */ void m105401M2(View view) {
        m105400L2();
    }

    /* access modifiers changed from: private */
    /* renamed from: N2 */
    public /* synthetic */ void m105402N2(View view) {
        m105404P2();
    }

    /* renamed from: O2 */
    private void m105403O2() {
        this.f85801H.f69828g.setVisibility(0);
        this.f85800G.qrPayReverseTransaction(this.f85802I, this.f85803J, this.f85801H.f69826e.f69986g.getText(), new C35486d());
    }

    /* renamed from: P2 */
    private void m105404P2() {
        if (this.f85801H.f69826e.f69984e.f70109k.isOrange()) {
            m105403O2();
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: Q2 */
    public void m105405Q2() {
        this.f85800G.qrPaySendOtpForReversal(this.f85802I, new C35485c());
    }

    /* renamed from: R2 */
    private void m105406R2() {
        this.f85801H.f69827f.setOnClickListener(new C31693j(this));
        this.f85801H.f69826e.f69984e.f70109k.setOnClickListener(new C31694k(this));
    }

    /* renamed from: S2 */
    public static void m105407S2(Context context, String str, String str2, String str3) {
        Intent intent = new Intent(context, QrPayReversalActivity.class);
        intent.putExtra("DOC_KEY", str);
        intent.putExtra("MERCHANT_NAME", str2);
        intent.putExtra("AMOUNT_TO_RETURN", str3);
        Activity b = C25100c.m80063b(context);
        if (b != null) {
            b.startActivityForResult(intent, 2018);
        } else {
            context.startActivity(intent);
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: O1 */
    public void mo37451O1(Bundle bundle) {
        C27426t1 d = C27426t1.m85013d(getLayoutInflater());
        this.f85801H = d;
        setContentView((View) d.mo3946b());
        this.f85802I = getIntent().getStringExtra("DOC_KEY");
        this.f85804K = getIntent().getStringExtra("MERCHANT_NAME");
        this.f85805L = getIntent().getStringExtra("AMOUNT_TO_RETURN");
        this.f85801H.f69826e.f69985f.setVisibility(8);
        m105406R2();
        C32359z0.m95573i0(this.f85801H.f69826e.f69986g.getEditText(), 6);
        this.f85801H.f69826e.f69984e.f70109k.setOrange(false, false);
        this.f85801H.f69826e.f69986g.getEditText().addTextChangedListener(this);
        this.f85801H.f69826e.f69986g.getEditText().postDelayed(new C35483a(), 500);
        this.f85801H.f69826e.f69984e.f70108j.setOtpButtonClickListener(new C35484b());
        m105405Q2();
    }

    public void afterTextChanged(Editable editable) {
    }

    public void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
    }

    public void finish() {
        setResult(this.f85806M);
        super.finish();
    }

    /* access modifiers changed from: protected */
    public void onPause() {
        super.onPause();
        overridePendingTransition(0, C10313b.slide_out_up);
    }

    public void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        if (TextUtils.isEmpty(this.f85803J) || charSequence.length() < 4) {
            this.f85801H.f69826e.f69984e.f70109k.setOrange(false, false);
        } else {
            this.f85801H.f69826e.f69984e.f70109k.setOrange(true, true);
        }
    }
}
