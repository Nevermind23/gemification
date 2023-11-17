package p341ge.bog.mobilebank.p975ui.activities.qrpay;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import e81.C31684a;
import e81.C31685b;
import g91.C32303f;
import g91.C32359z0;
import iu0.C36546y;
import java.math.BigDecimal;
import java.util.ArrayList;
import org.parceler.C42035e;
import p341ge.bog.mobilebank.model.Client;
import p341ge.bog.mobilebank.p975ui.model.qrpay.QrPayData;
import p341ge.bog.mobilebank.p975ui.views.widgets.BogInputLayout;
import p341ge.bog.mobilebank.p975ui.wizard.activities.AdvancedWizardActivity;
import p341ge.bog.mobilebank.p975ui.wizard.controllers.BaseWizardPlugin;
import p341ge.bog.mobilebank.p975ui.wizard.model.C35893a;
import p341ge.bog.mobilebank.p975ui.wizard.model.WizardObject;
import p366bk.C10328q;
import p90.C27408r1;

/* renamed from: ge.bog.mobilebank.ui.activities.qrpay.QrPayActivity */
public class QrPayActivity extends C35487a {

    /* renamed from: G */
    protected Client f85772G;

    /* renamed from: H */
    private C27408r1 f85773H;

    /* renamed from: I */
    private String f85774I;

    /* renamed from: J */
    private QrPayData f85775J;

    /* access modifiers changed from: private */
    /* renamed from: C2 */
    public /* synthetic */ void m105351C2(View view) {
        m105355H2();
    }

    /* access modifiers changed from: private */
    /* renamed from: G2 */
    public void m105354G2(View view) {
        WizardObject wizardObject = new WizardObject();
        wizardObject.setInputTitle(getString(C10328q.common_text_amount));
        wizardObject.setInputStyle(1);
        wizardObject.setInputType(BogInputLayout.INPUT_TYPE_NUM_REAL);
        wizardObject.setNonSelectableString(" ₾");
        wizardObject.setAmountObject(true);
        wizardObject.setValue(this.f85774I);
        wizardObject.addInfoLisKeyValues(getString(C10328q.merchant), this.f85773H.f69647f.getText().toString());
        C35893a.m106783a(this).mo88137d(AdvancedWizardActivity.class).mo88134a(wizardObject).mo88136c(view).mo88141h(0).mo88139f(new BaseWizardPlugin()).mo88142i();
    }

    /* renamed from: H2 */
    private void m105355H2() {
        C36546y.m108282F().mo27152s("qr_pay", "", "pay_from_details_page");
        if (!this.f85773H.f69648g.isOrange()) {
            return;
        }
        if (this.f85772G.isAuthorized()) {
            this.f85775J.setAmount(this.f85774I);
            QrPayCardSelectActivity.m105373Q2(this, this.f85775J);
            return;
        }
        C32303f.m95188H(this);
    }

    /* renamed from: I2 */
    public static void m105356I2(Activity activity, QrPayData qrPayData) {
        Intent intent = new Intent(activity, QrPayActivity.class);
        intent.putExtra("QR_PAYMENT_DATA", C42035e.m122121c(qrPayData));
        activity.startActivity(intent);
    }

    /* access modifiers changed from: protected */
    /* renamed from: O1 */
    public void mo37451O1(Bundle bundle) {
        C27408r1 d = C27408r1.m84935d(getLayoutInflater());
        this.f85773H = d;
        super.mo70996D2(bundle, d);
        this.f85773H.f69646e.setOnClickListener(new C31684a(this));
        this.f85773H.f69648g.setOnClickListener(new C31685b(this));
        QrPayData qrPayData = (QrPayData) C42035e.m122119a(getIntent().getParcelableExtra("QR_PAYMENT_DATA"));
        this.f85775J = qrPayData;
        this.f85773H.f69647f.setText(qrPayData.getMerchantName());
        m105354G2(this.f85773H.f69646e);
    }

    /* access modifiers changed from: protected */
    public void onActivityResult(int i, int i2, Intent intent) {
        BigDecimal k0;
        super.onActivityResult(i, i2, intent);
        if (i2 != -1) {
            return;
        }
        if (i == QrPayCardSelectActivity.f85776T) {
            finish();
        } else if (i == 10001) {
            ArrayList<String> stringArrayListExtra = intent.getStringArrayListExtra(BaseWizardPlugin.WIZARD_DATA);
            if (stringArrayListExtra.size() > 0 && (k0 = C32359z0.m95577k0(stringArrayListExtra.get(0))) != null) {
                String bigDecimal = k0.toString();
                this.f85774I = bigDecimal;
                String v = C32359z0.m95594v(bigDecimal);
                this.f85773H.f69646e.setValueText(v);
                if (k0.compareTo(BigDecimal.ZERO) > 0) {
                    this.f85773H.f69648g.setText(String.format("%s (%s)", new Object[]{getString(C10328q.pay), v}));
                    this.f85773H.f69648g.setOrange(true);
                    return;
                }
                this.f85773H.f69648g.setOrange(false);
                this.f85773H.f69648g.setText(C10328q.pay);
            }
        }
    }
}
