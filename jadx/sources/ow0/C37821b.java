package ow0;

import android.content.Intent;
import android.text.TextUtils;
import android.view.View;
import androidx.collection.ArrayMap;
import g91.C32289b0;
import g91.C32297d;
import g91.C32315k0;
import g91.C32359z0;
import iu0.C36546y;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;
import nw0.C37488c;
import org.parceler.C42035e;
import p341ge.bog.mobilebank.eventbus.events.OperationHistoryEvent;
import p341ge.bog.mobilebank.eventbus.events.PaymentDebtEvent;
import p341ge.bog.mobilebank.eventbus.events.PointValueExchangeEvent;
import p341ge.bog.mobilebank.eventbus.events.ProviderConfigurationEvent;
import p341ge.bog.mobilebank.model.KeyValue;
import p341ge.bog.mobilebank.model.PaymentDataObject;
import p341ge.bog.mobilebank.model.payment.PaymentProviderConfiguration;
import p341ge.bog.mobilebank.model.payment.PaymentServiceConfig;
import p341ge.bog.mobilebank.model.payment.PaymentsServiceConfigInputOption;
import p341ge.bog.mobilebank.model.template.TemplateBasketItem;
import p341ge.bog.mobilebank.p975ui.wizard.activities.AdvancedWizardActivity;
import p341ge.bog.mobilebank.p975ui.wizard.activities.PaymentOptionWizardActivity;
import p341ge.bog.mobilebank.p975ui.wizard.controllers.BaseWizardPlugin;
import p341ge.bog.mobilebank.p975ui.wizard.model.C35893a;
import p341ge.bog.mobilebank.payment.activities.PaymentFormActivity;
import p341ge.bog.mobilebank.payment.controllers.wizard.PaymentWizardPlugin;
import p341ge.bog.mobilebank.payment.model.ConfigParamStyle;
import p341ge.bog.mobilebank.payment.model.ParameterType;
import p341ge.bog.mobilebank.payment.model.PaymentCustomConfiguration;
import p341ge.bog.mobilebank.payment.model.PaymentCustomParameter;
import p341ge.bog.mobilebank.shared2.network.BankApiResponse;
import p366bk.C10328q;
import pw0.C38025a;
import qw0.C38256d;
import r90.C27950a;
import r90.C27954d;
import rw0.C38375b;
import rw0.C38380g;

/* renamed from: ow0.b */
public class C37821b implements C37488c {

    /* renamed from: a */
    protected final String f90771a;

    /* renamed from: b */
    private String f90772b;

    /* renamed from: c */
    protected BigDecimal f90773c;

    /* renamed from: d */
    protected BigDecimal f90774d;

    /* renamed from: e */
    protected PaymentCustomConfiguration f90775e;

    /* renamed from: f */
    protected C38256d f90776f;

    /* renamed from: g */
    protected PaymentFormActivity f90777g;

    /* renamed from: h */
    protected boolean f90778h;

    /* renamed from: i */
    protected C38025a f90779i;

    /* renamed from: j */
    protected ArrayMap f90780j;

    /* renamed from: k */
    private String f90781k;

    /* renamed from: l */
    private String f90782l;

    /* renamed from: m */
    private String f90783m;

    public C37821b(PaymentFormActivity paymentFormActivity, String str, boolean z, String str2, String str3, String str4, String str5, String str6) {
        BigInteger bigInteger = BigInteger.ZERO;
        this.f90773c = new BigDecimal(bigInteger).setScale(2, 1);
        this.f90774d = new BigDecimal(bigInteger).setScale(2, 1);
        PaymentCustomConfiguration paymentCustomConfiguration = new PaymentCustomConfiguration();
        this.f90775e = paymentCustomConfiguration;
        paymentCustomConfiguration.setIsCompany(z);
        this.f90775e.setServiceId(str);
        this.f90781k = str3;
        this.f90782l = str4;
        this.f90783m = str5;
        this.f90775e.setDefaultCarNumber(str3);
        this.f90775e.setDefaultPersonalNumber(str4);
        this.f90775e.setDefaultTicketNumber(str5);
        this.f90777g = paymentFormActivity;
        this.f90771a = str2;
        this.f90772b = str6;
        C38256d dVar = new C38256d(this);
        this.f90776f = dVar;
        dVar.f91747h = str2;
        dVar.mo91795c();
    }

    /* renamed from: m */
    private int m111130m(int i) {
        if (i >= this.f90775e.getParameters().size()) {
            return 0;
        }
        int i2 = i;
        for (int i3 = 0; i3 < i; i3++) {
            if (!this.f90775e.getParameters().get(i3).isVisibleInWizard()) {
                i2--;
            }
        }
        return i2;
    }

    /* renamed from: p */
    private ArrayList m111131p() {
        String str;
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < this.f90775e.getParameters().size(); i++) {
            PaymentCustomParameter paymentCustomParameter = this.f90775e.getParameters().get(i);
            if (!paymentCustomParameter.isNotNeededForDebtVerify()) {
                KeyValue keyValue = new KeyValue();
                keyValue.setKey(paymentCustomParameter.getId());
                if (paymentCustomParameter.getValue() != null) {
                    str = paymentCustomParameter.getValue();
                } else {
                    str = "";
                }
                keyValue.setValue(str);
                if (keyValue.getKey() != null) {
                    arrayList.add(keyValue);
                }
            }
        }
        return arrayList;
    }

    /* renamed from: A */
    public void mo91082A() {
        this.f90777g.mo79621c3(false);
        this.f90777g.mo86441o2();
        mo91085F();
    }

    /* renamed from: B */
    public void mo91083B() {
        this.f90776f.mo91796d();
    }

    /* access modifiers changed from: protected */
    /* renamed from: C */
    public void mo91084C() {
        PaymentProviderConfiguration paymentProviderConfiguration;
        Intent intent = new Intent(mo91076r(), PaymentOptionWizardActivity.class);
        PaymentServiceConfig serviceConfigJson = this.f90775e.getBaseConfiguration().getServiceConfigJson();
        if (serviceConfigJson != null) {
            intent.putExtra("PAYMENT_SERVICE_CONFIG_JSON", C42035e.m122121c(serviceConfigJson));
            ArrayList arrayList = new ArrayList();
            String valueOf = String.valueOf(this.f90774d.multiply(new BigDecimal(100)).intValue());
            String valueOf2 = String.valueOf(this.f90773c.multiply(new BigDecimal(100)).intValue());
            C38025a aVar = this.f90779i;
            if (aVar != null) {
                arrayList = aVar.mo91397c();
                intent.putExtra("IS_LIST_WITH_SHARED_CONFIGURATION", true);
                valueOf = String.valueOf(this.f90779i.mo91396b());
            } else {
                ArrayList f = C32315k0.m95257f(this.f90775e);
                f.add(new KeyValue("amount", valueOf));
                f.add(new KeyValue("commission", valueOf2));
                try {
                    paymentProviderConfiguration = C27954d.m86302h(serviceConfigJson.getId());
                } catch (Exception unused) {
                    paymentProviderConfiguration = null;
                }
                if (paymentProviderConfiguration != null) {
                    PaymentDataObject paymentDataObject = new PaymentDataObject();
                    if (this.f90775e.getSelectedPackageConfig() != null) {
                        paymentDataObject.setServiceId(this.f90775e.getSelectedPackageConfig().getService());
                    } else {
                        paymentDataObject.setServiceId(paymentProviderConfiguration.getPaymentServiceId());
                    }
                    paymentDataObject.setParameters(f);
                    arrayList.add(paymentDataObject);
                }
            }
            intent.putExtra("PAYMENT_EXECUTE_DATA_OBJECT", C42035e.m122121c(arrayList));
            intent.putExtra("WIZARD_AMOUNT", valueOf);
            PaymentOptionWizardActivity.m106602Y3(mo91076r(), intent, 10004);
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: D */
    public PaymentWizardPlugin mo91065D() {
        PaymentWizardPlugin paymentWizardPlugin = new PaymentWizardPlugin();
        paymentWizardPlugin.setPaymentCustomConfigurations(this.f90775e);
        return paymentWizardPlugin;
    }

    /* access modifiers changed from: protected */
    /* renamed from: E */
    public ArrayList mo91066E(BaseWizardPlugin baseWizardPlugin) {
        return C38380g.m112743j(this.f90775e, baseWizardPlugin);
    }

    /* renamed from: F */
    public void mo91085F() {
        if (!this.f90775e.isCompany()) {
            if (!TextUtils.isEmpty(this.f90771a)) {
                this.f90776f.mo91794b().requestLastOperations(false, (Long) null, this.f90771a);
            }
            this.f90776f.mo91794b().requestPaymentsProviderConfig(true, "", this.f90775e.getServiceId(), this);
            return;
        }
        mo91086G();
        mo91067H();
    }

    /* access modifiers changed from: protected */
    /* renamed from: G */
    public void mo91086G() {
        List<PaymentProviderConfiguration> children;
        PaymentProviderConfiguration h = C27954d.m86302h(this.f90775e.getServiceId());
        if (h != null && (children = h.getChildren()) != null) {
            ConfigParamStyle configParamStyle = new ConfigParamStyle();
            configParamStyle.setEditable(true);
            configParamStyle.setParameterType(ParameterType.SELECT);
            ArrayList arrayList = new ArrayList();
            PaymentCustomParameter paymentCustomParameter = new PaymentCustomParameter("PROVIDER_LIST_ID", C36546y.m108285N().getString(C10328q.payments_provider), configParamStyle, true, true, 0, false);
            int size = children.size();
            PaymentsServiceConfigInputOption[] paymentsServiceConfigInputOptionArr = new PaymentsServiceConfigInputOption[size];
            for (int i = 0; i < size; i++) {
                paymentsServiceConfigInputOptionArr[i] = new PaymentsServiceConfigInputOption(children.get(i).getServiceName(), children.get(i).getServiceId());
            }
            PaymentCustomConfiguration paymentCustomConfiguration = new PaymentCustomConfiguration();
            this.f90775e = paymentCustomConfiguration;
            paymentCustomConfiguration.setIsCompany(true);
            this.f90775e.setName(C27950a.m86286c(h.getServiceName(), true));
            this.f90775e.setLogoUrl(C32289b0.m95093e(h.getLogo()));
            this.f90775e.setDefaultCarNumber(this.f90781k);
            this.f90775e.setDefaultPersonalNumber(this.f90782l);
            this.f90775e.setDefaultTicketNumber(this.f90783m);
            paymentCustomParameter.setVisibleInForm(true);
            paymentCustomParameter.setInputOptions(paymentsServiceConfigInputOptionArr);
            paymentCustomParameter.setVisibleInWizard(true);
            arrayList.add(paymentCustomParameter);
            this.f90775e.setParameters(arrayList);
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: H */
    public void mo91067H() {
        mo91076r().mo79603Y2(this.f90775e.getParameters());
        mo91076r().mo79619Z2(this.f90775e.getName(), this.f90775e.getLogoUrl());
        mo91076r().mo79602X2(mo91093u(), mo91092t(), mo91074n());
        if (this.f90775e.getResultListItems() == null || this.f90775e.getResultListItems().size() <= 0) {
            mo91076r().mo79615N2();
            this.f90779i = null;
        } else {
            this.f90779i = new C38025a(mo91076r(), this.f90776f.mo91794b(), this.f90775e.getResultListItems(), this.f90775e.getBaseConfiguration());
        }
        mo91076r().mo86425J1();
    }

    /* access modifiers changed from: protected */
    /* renamed from: I */
    public void mo91087I() {
        BigDecimal k0;
        PaymentCustomParameter customParamByKey = this.f90775e.getCustomParamByKey("amount");
        if (customParamByKey != null && !TextUtils.isEmpty(customParamByKey.getValue()) && (k0 = C32359z0.m95577k0(customParamByKey.getValue())) != null) {
            this.f90774d = k0.setScale(2, 1);
            customParamByKey.setValueToDisplayInForm(mo91091s());
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: J */
    public void mo91068J() {
        boolean z;
        for (PaymentCustomParameter next : this.f90775e.getParameters()) {
            if (!next.isMandatory()) {
                if (this.f90775e.getResultListItems() == null) {
                    z = true;
                } else {
                    z = false;
                }
                next.setVisibleInForm(z);
            }
        }
        PaymentCustomParameter customParamByKey = this.f90775e.getCustomParamByKey("amount");
        if (customParamByKey != null) {
            customParamByKey.setVisibleInForm(mo91090o());
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: K */
    public void mo91088K() {
        mo91087I();
        mo91076r().mo79603Y2(this.f90775e.getParameters());
        mo91076r().mo79602X2(mo91093u(), mo91092t(), mo91074n());
        if (this.f90775e.getResultListItems() == null || this.f90775e.getResultListItems().size() <= 0) {
            mo91076r().mo79615N2();
            this.f90779i = null;
        } else {
            this.f90779i = new C38025a(mo91076r(), this.f90776f.mo91794b(), this.f90775e.getResultListItems(), this.f90775e.getBaseConfiguration());
        }
        mo91076r().mo86425J1();
    }

    /* renamed from: d */
    public void mo90628d(String str) {
        mo91088K();
        C32297d.m95154b(mo91076r(), str);
    }

    /* renamed from: g */
    public void mo90629g(OperationHistoryEvent operationHistoryEvent) {
        onProviderConfigurationEventSuccess(this.f90776f.f91741b);
    }

    /* access modifiers changed from: protected */
    /* renamed from: l */
    public boolean mo91089l() {
        PaymentCustomConfiguration paymentCustomConfiguration = this.f90775e;
        if (paymentCustomConfiguration == null || paymentCustomConfiguration.getParameters() == null || this.f90775e.getParameters().size() <= 0) {
            return false;
        }
        for (PaymentCustomParameter next : this.f90775e.getParameters()) {
            if (next.isMandatory() && next.isVisibleInForm() && TextUtils.isEmpty(next.getValue())) {
                return false;
            }
            if (next.getStyle().getParameterType() == ParameterType.SELECT_MULTIPLE && BankApiResponse.SUCCESSFUL_RESPONSE_CODE.equals(next.getValue())) {
                return false;
            }
        }
        return true;
    }

    /* access modifiers changed from: protected */
    /* renamed from: n */
    public boolean mo91074n() {
        C38025a aVar = this.f90779i;
        if (aVar == null) {
            if (this.f90774d.compareTo(BigDecimal.ZERO) != 1 || !mo91089l()) {
                return false;
            }
        } else if (aVar.mo91396b() == null || this.f90779i.mo91396b().compareTo(BigDecimal.ZERO) != 1) {
            return false;
        }
        return true;
    }

    /* access modifiers changed from: protected */
    /* renamed from: o */
    public boolean mo91090o() {
        return this.f90775e.getResultListItems() == null;
    }

    public void onDataError(String str) {
        this.f90777g.mo79621c3(true);
        this.f90777g.mo86425J1();
        C32297d.m95154b(mo91076r(), str);
    }

    public void onDebtEventSuccess(PaymentDebtEvent paymentDebtEvent) {
        if (this.f90772b != null) {
            KeyValue[] parameter = paymentDebtEvent.getPaymentDebt().getParameter();
            int length = parameter.length;
            int i = 0;
            while (true) {
                if (i >= length) {
                    break;
                }
                KeyValue keyValue = parameter[i];
                if (keyValue.getKey().equals("paymentServiceId")) {
                    this.f90775e.setServiceId(keyValue.getValue());
                    this.f90772b = null;
                    mo91085F();
                    break;
                }
                i++;
            }
        }
        C38375b.m112706b(this.f90775e, paymentDebtEvent.getPaymentDebt(), true);
        mo91088K();
    }

    public void onLoading(boolean z) {
        mo91076r().mo86441o2();
    }

    public void onNetworkError() {
        this.f90777g.mo79621c3(true);
        this.f90777g.mo86425J1();
    }

    public void onPointExchangeEvent(PointValueExchangeEvent pointValueExchangeEvent) {
    }

    public void onProviderConfigurationEventSuccess(ProviderConfigurationEvent providerConfigurationEvent) {
        PaymentProviderConfiguration paymentProviderConfiguration;
        OperationHistoryEvent operationHistoryEvent = this.f90776f.f91746g;
        if (!TextUtils.isEmpty(this.f90771a) && (operationHistoryEvent == null || operationHistoryEvent.getOperationHistory() == null || operationHistoryEvent.getOperationHistory().getParameters() == null || operationHistoryEvent.getOperationHistory().getParameters().size() <= 0)) {
            return;
        }
        if (this.f90775e.getBaseConfiguration() != null || (providerConfigurationEvent != null && providerConfigurationEvent.getConfiguration() != null && providerConfigurationEvent.getConfiguration().getServiceConfigJson() != null)) {
            if (this.f90775e.getBaseConfiguration() == null || (!TextUtils.isEmpty(this.f90775e.getBaseConfiguration().getServiceId()) && this.f90775e.getBaseConfiguration().getServiceId().equals("bog-comp-mobilepayments"))) {
                paymentProviderConfiguration = providerConfigurationEvent.getConfiguration();
            } else {
                paymentProviderConfiguration = this.f90775e.getBaseConfiguration();
            }
            mo91079z(paymentProviderConfiguration);
            mo91076r().mo86425J1();
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: q */
    public void mo91075q() {
        mo91076r().mo79619Z2(this.f90775e.getName(), this.f90775e.getLogoUrl());
        if (this.f90778h) {
            C38375b.m112716l(this.f90776f.f91746g.getOperationHistory().getParameters(), this.f90776f.mo91794b(), this.f90775e.getDebtServiceId(), this);
        } else if (this.f90772b != null) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(new KeyValue("phone", this.f90772b));
            C38375b.m112716l(arrayList, this.f90776f.mo91794b(), "mep-bog-mobpayments-customer-info", this);
        } else {
            mo91087I();
            mo91076r().mo79603Y2(this.f90775e.getParameters());
            mo91076r().mo79602X2(mo91093u(), mo91092t(), mo91074n());
            mo91076r().mo86425J1();
        }
        String str = this.f90781k;
        if (str != null && this.f90783m != null && !str.isEmpty() && !this.f90783m.isEmpty()) {
            C38375b.m112716l(m111131p(), this.f90776f.mo91794b(), this.f90775e.getDebtServiceId(), this);
        }
    }

    /* renamed from: r */
    public PaymentFormActivity mo91076r() {
        return this.f90777g;
    }

    /* access modifiers changed from: protected */
    /* renamed from: s */
    public String mo91091s() {
        return C32359z0.m95540K(String.valueOf(this.f90774d), true);
    }

    /* access modifiers changed from: protected */
    /* renamed from: t */
    public String mo91092t() {
        return C32359z0.m95540K(String.valueOf(this.f90773c), true);
    }

    /* access modifiers changed from: protected */
    /* renamed from: u */
    public String mo91093u() {
        return C32359z0.m95540K(String.valueOf(this.f90774d.add(this.f90773c)), true);
    }

    /* access modifiers changed from: protected */
    /* renamed from: v */
    public void mo91094v(PaymentProviderConfiguration paymentProviderConfiguration) {
        boolean z = false;
        this.f90778h = false;
        if (!TextUtils.isEmpty(this.f90771a) && paymentProviderConfiguration != null) {
            if (paymentProviderConfiguration.getDebtServiceId() != null) {
                z = true;
            }
            this.f90778h = z;
            this.f90780j = C32315k0.m95273v(this.f90776f.f91746g.getOperationHistory().getParameters(), paymentProviderConfiguration.getServiceConfigJson(), this.f90778h);
        } else if (!TextUtils.isEmpty(this.f90772b)) {
            ArrayMap arrayMap = new ArrayMap();
            arrayMap.put("phone", new String[]{this.f90772b});
            this.f90780j = arrayMap;
        }
    }

    /* renamed from: w */
    public void mo91077w(int i, int i2, Intent intent) {
        if (i == 10004) {
            mo91076r();
            if (i2 == -1) {
                PaymentFormActivity r = mo91076r();
                mo91076r();
                r.setResult(-1);
                mo91076r().finish();
            }
        }
        if (i == 10001 && i2 == -1) {
            this.f90776f.mo91795c();
            PaymentCustomConfiguration paymentCustomConfiguration = (PaymentCustomConfiguration) C42035e.m122119a(intent.getParcelableExtra(BaseWizardPlugin.WIZARD_DATA));
            this.f90775e = paymentCustomConfiguration;
            PaymentCustomParameter customParamByKey = paymentCustomConfiguration.getCustomParamByKey("amount");
            if (customParamByKey != null && !TextUtils.isEmpty(customParamByKey.getValue()) && C32359z0.m95577k0(customParamByKey.getValue()) == null) {
                customParamByKey.setValue((String) null);
                customParamByKey.setValueToDisplay((String) null);
            }
            mo91068J();
            mo91087I();
            mo91067H();
        }
    }

    /* renamed from: x */
    public void mo91095x(int i, View view) {
        this.f90776f.mo91796d();
        PaymentCustomConfiguration paymentCustomConfiguration = this.f90775e;
        if (paymentCustomConfiguration != null && paymentCustomConfiguration.getParameters() != null && this.f90775e.getParameters().size() > i) {
            this.f90775e.getParameters().get(i);
            PaymentWizardPlugin D = mo91065D();
            C35893a.m106783a(this.f90777g).mo88141h(m111130m(i)).mo88137d(AdvancedWizardActivity.class).mo88139f(D).mo88140g(mo91066E(D)).mo88136c(view).mo88142i();
        }
    }

    /* renamed from: y */
    public void mo91078y() {
        if (mo91074n()) {
            mo91084C();
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: z */
    public void mo91079z(PaymentProviderConfiguration paymentProviderConfiguration) {
        mo91094v(paymentProviderConfiguration);
        this.f90775e = C38375b.m112708d(this.f90776f.f91743d, paymentProviderConfiguration, this.f90775e, this.f90780j, (TemplateBasketItem) null);
        mo91075q();
    }
}
