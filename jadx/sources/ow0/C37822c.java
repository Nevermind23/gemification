package ow0;

import android.content.Intent;
import android.text.TextUtils;
import com.google.gson.Gson;
import com.medallia.digital.mobilesdk.MedalliaDigital;
import g91.C32297d;
import g91.C32303f;
import g91.C32315k0;
import hc1.C41185v;
import iu0.C36546y;
import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.ArrayList;
import nw0.C37489d;
import org.parceler.C42035e;
import p341ge.bog.mobilebank.eventbus.events.PaymentDebtEvent;
import p341ge.bog.mobilebank.eventbus.events.PointValueExchangeEvent;
import p341ge.bog.mobilebank.model.KeyValue;
import p341ge.bog.mobilebank.model.PaymentExecuteEssObject;
import p341ge.bog.mobilebank.model.payment.PaymentProviderConfiguration;
import p341ge.bog.mobilebank.model.payment.PaymentResult;
import p341ge.bog.mobilebank.p975ui.activities.PaymentResultActivity;
import p341ge.bog.mobilebank.p975ui.wizard.controllers.BaseWizardPlugin;
import p341ge.bog.mobilebank.payment.activities.PaymentFormActivity;
import p341ge.bog.mobilebank.payment.controllers.wizard.PointPaymentWizardPlugin;
import p341ge.bog.mobilebank.payment.model.PaymentCustomConfiguration;
import p341ge.bog.mobilebank.payment.model.PaymentCustomParameter;
import p341ge.bog.mobilebank.rest.manager.RootBankApiManager;
import p341ge.bog.mobilebank.rest.model.otpparameter.PaymentsBatchExecuteParams;
import p341ge.bog.mobilebank.shared2.network.BankApiResponse;
import p366bk.C10328q;
import p745er.C20288a;
import pc0.C27494a;
import qw0.C38257e;
import rw0.C38375b;

/* renamed from: ow0.c */
public class C37822c extends C37821b implements C37489d {

    /* renamed from: n */
    private Long f90784n;

    /* renamed from: o */
    private String f90785o;

    /* renamed from: p */
    private String f90786p;

    /* renamed from: q */
    private String f90787q;

    /* renamed from: r */
    private C27494a f90788r;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C37822c(PaymentFormActivity paymentFormActivity, String str, boolean z, String str2, String str3, Long l, C27494a aVar) {
        super(paymentFormActivity, str, z, (String) null, (String) null, (String) null, (String) null, (String) null);
        this.f90784n = l;
        this.f90785o = str2;
        this.f90786p = str3;
        this.f90788r = aVar;
        this.f90775e.setBonusType(str2);
        this.f90776f.mo91796d();
        C38257e eVar = new C38257e(this);
        this.f90776f = eVar;
        eVar.mo91795c();
        mo91076r().mo79604a3(mo91096L());
    }

    /* renamed from: M */
    private PaymentsBatchExecuteParams m111158M(Long l, String str, String str2, String str3) {
        return new PaymentsBatchExecuteParams(l, new Gson().mo18181w(m111159N()), (String) null, "PAYMENTS_BATCH_EXECUTE_NEW", str, str2, str3);
    }

    /* renamed from: N */
    private ArrayList m111159N() {
        ArrayList f = C32315k0.m95257f(this.f90775e);
        f.add(new KeyValue("amount", new BigDecimal(this.f90775e.getCustomParamByKey("amount_to_pay_with_point").getValue()).multiply(new BigDecimal(100)).setScale(0, RoundingMode.DOWN).toString()));
        f.add(new KeyValue("commission", BankApiResponse.SUCCESSFUL_RESPONSE_CODE));
        f.add(new KeyValue("paymentMethod", "plusPoints"));
        f.add(new KeyValue("productType", "PLUS"));
        f.add(new KeyValue("channel", "MOBILE"));
        f.add(new KeyValue("extChannelServiceId", this.f90775e.getServiceId()));
        PaymentExecuteEssObject paymentExecuteEssObject = new PaymentExecuteEssObject();
        paymentExecuteEssObject.setEssParameters(f);
        if (this.f90775e.getSelectedPackageConfig() != null) {
            paymentExecuteEssObject.setEssServiceId(this.f90775e.getSelectedPackageConfig().getService());
        } else {
            paymentExecuteEssObject.setEssServiceId(this.f90775e.getBaseConfiguration().getPaymentServiceId());
        }
        ArrayList arrayList = new ArrayList();
        arrayList.add(paymentExecuteEssObject);
        return arrayList;
    }

    /* renamed from: F */
    public void mo91085F() {
        this.f90776f.mo91793a().getPaymentsProviderConfigurationForPoints(this.f90775e.getServiceId(), this);
    }

    /* access modifiers changed from: protected */
    /* renamed from: G */
    public void mo91086G() {
        super.mo91086G();
        this.f90775e.setBonusType(this.f90785o);
    }

    /* access modifiers changed from: protected */
    /* renamed from: H */
    public void mo91067H() {
        mo91076r().mo79603Y2(this.f90775e.getParameters());
        mo91076r().mo79619Z2(this.f90775e.getName(), this.f90775e.getLogoUrl());
        mo91076r().mo79604a3(mo91096L());
        mo91076r().mo79613J2(mo91074n());
        mo91076r().mo86425J1();
    }

    /* access modifiers changed from: protected */
    /* renamed from: L */
    public String mo91096L() {
        String str;
        Object[] objArr = new Object[3];
        objArr[0] = C36546y.m108285N().getString(C10328q.button_text_exchange_points);
        if (!TextUtils.isEmpty(this.f90787q)) {
            str = C32303f.m95207r(this.f90787q);
        } else {
            str = BankApiResponse.SUCCESSFUL_RESPONSE_CODE;
        }
        objArr[1] = str;
        objArr[2] = C36546y.m108285N().getString(C10328q.common_text_points);
        return String.format("%s (%s %s)", objArr);
    }

    /* renamed from: O */
    public C41185v mo91097O() {
        return C20288a.m66329d(mo91076r().getSupportFragmentManager());
    }

    /* renamed from: P */
    public void mo91098P(String str, String str2, String str3) {
        try {
            if (Integer.parseInt(this.f90787q) > 0) {
                mo91076r().mo86441o2();
                m111159N();
                PaymentsBatchExecuteParams M = m111158M(this.f90784n, str, str2, str3);
                RootBankApiManager a = this.f90776f.mo91793a();
                String executeParameters = M.getExecuteParameters();
                a.paymentsBatchExecute(executeParameters, this.f90784n + "", this.f90788r.mo66809a(M));
            }
        } catch (Exception unused) {
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: Q */
    public PointPaymentWizardPlugin mo91065D() {
        PointPaymentWizardPlugin pointPaymentWizardPlugin = new PointPaymentWizardPlugin();
        pointPaymentWizardPlugin.setPaymentCustomConfigurations(this.f90775e);
        pointPaymentWizardPlugin.setAvailablePoints(String.valueOf(this.f90786p));
        return pointPaymentWizardPlugin;
    }

    /* renamed from: d */
    public void mo90628d(String str) {
        super.mo90628d(str);
        mo91076r().mo79604a3(mo91096L());
    }

    /* renamed from: i */
    public void mo90630i(PaymentResult paymentResult) {
        ArrayList<PaymentExecuteEssObject> arrayList;
        String str;
        Intent intent = new Intent(mo91076r(), PaymentResultActivity.class);
        intent.putExtra("PAYMENT_SERVICE_CONFIG_JSON", C42035e.m122121c(this.f90775e.getBaseConfiguration().getServiceConfigJson()));
        MedalliaDigital.setCustomParameter("event", "bonus_point_payment_complete");
        if (paymentResult != null) {
            arrayList = paymentResult.getExecuteResult();
            if (!(arrayList == null || arrayList.size() <= 0 || arrayList.get(0) == null || arrayList.get(0).getEssParameters() == null)) {
                PaymentCustomParameter customParamByKey = this.f90775e.getCustomParamByKey("point_value_param_id");
                if (customParamByKey != null) {
                    str = customParamByKey.getValueToDisplay();
                } else {
                    str = "";
                }
                arrayList.get(0).getEssParameters().add(new KeyValue("point_value_param_id", str));
                MedalliaDigital.setCustomParameter("context1", arrayList.get(0).getEssServiceId());
            }
        } else {
            arrayList = null;
        }
        intent.putExtra("PAYMENT_EXECUTED_DATA_OBJECT", C42035e.m122121c(arrayList));
        intent.putExtra("PAY_WITH_POINTS", true);
        mo91076r().startActivity(intent);
        mo91076r().finish();
    }

    /* access modifiers changed from: protected */
    /* renamed from: l */
    public boolean mo91089l() {
        try {
            C38375b.m112705a(this.f90787q, this.f90786p, mo91076r());
            if (!super.mo91089l() || Integer.parseInt(this.f90787q) < 0 || Integer.parseInt(this.f90787q) > Integer.parseInt(this.f90786p)) {
                return false;
            }
            return true;
        } catch (Exception unused) {
            return false;
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: n */
    public boolean mo91074n() {
        return mo91089l();
    }

    public void onDataError(String str) {
        mo91076r().mo86425J1();
        C32297d.m95154b(mo91076r(), str);
    }

    public void onDebtEventSuccess(PaymentDebtEvent paymentDebtEvent) {
        super.onDebtEventSuccess(paymentDebtEvent);
        mo91076r().mo79604a3(mo91096L());
    }

    public void onNetworkError() {
        Intent intent = new Intent(mo91076r(), PaymentResultActivity.class);
        intent.putExtra("PAYMENT_TIMED_OUT", true);
        mo91076r().startActivity(intent);
        mo91076r().finish();
    }

    public void onPointExchangeEvent(PointValueExchangeEvent pointValueExchangeEvent) {
    }

    /* renamed from: w */
    public void mo91077w(int i, int i2, Intent intent) {
        if (i == 10001 && i2 == -1) {
            this.f90776f.mo91795c();
            PaymentCustomConfiguration paymentCustomConfiguration = (PaymentCustomConfiguration) C42035e.m122119a(intent.getParcelableExtra(BaseWizardPlugin.WIZARD_DATA));
            this.f90775e = paymentCustomConfiguration;
            this.f90787q = "";
            if (paymentCustomConfiguration.getCustomParamByKey("point_value_param_id") != null) {
                this.f90787q = this.f90775e.getCustomParamByKey("point_value_param_id").getValue();
            }
            mo91068J();
            mo91067H();
        }
    }

    /* renamed from: y */
    public void mo91078y() {
        if (mo91074n()) {
            C41185v.m119403r2("PAYMENTS_BATCH_EXECUTE_NEW", this.f90788r.mo66809a(m111158M(this.f90784n, (String) null, (String) null, (String) null))).mo4576A1(mo91076r().getSupportFragmentManager(), (String) null);
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: z */
    public void mo91079z(PaymentProviderConfiguration paymentProviderConfiguration) {
        super.mo91079z(paymentProviderConfiguration);
        mo91076r().mo79604a3(mo91096L());
    }
}
