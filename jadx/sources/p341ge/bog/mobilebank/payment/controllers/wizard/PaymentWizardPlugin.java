package p341ge.bog.mobilebank.payment.controllers.wizard;

import android.app.Activity;
import android.content.Intent;
import android.text.TextUtils;
import androidx.collection.ArraySet;
import c91.C31307h;
import c91.C31315m;
import c91.C31319o;
import c91.C31355y;
import g91.C32297d;
import g91.C32315k0;
import g91.C32359z0;
import java.util.ArrayList;
import java.util.Iterator;
import nw0.C37487b;
import org.parceler.C42035e;
import org.parceler.Parcel;
import p341ge.bog.mobilebank.eventbus.events.PaymentDebtEvent;
import p341ge.bog.mobilebank.eventbus.events.PointValueExchangeEvent;
import p341ge.bog.mobilebank.eventbus.events.ProviderConfigurationEvent;
import p341ge.bog.mobilebank.model.KeyValue;
import p341ge.bog.mobilebank.model.payment.PaymentServiceConfig;
import p341ge.bog.mobilebank.model.payment.PaymentsServiceConfigInputOption;
import p341ge.bog.mobilebank.model.template.TemplateBasketItem;
import p341ge.bog.mobilebank.model.template.TemplateBasketItemsWithPaymentConfig;
import p341ge.bog.mobilebank.p975ui.wizard.controllers.BaseWizardPlugin;
import p341ge.bog.mobilebank.p975ui.wizard.controllers.C35886a;
import p341ge.bog.mobilebank.p975ui.wizard.model.WizardObject;
import p341ge.bog.mobilebank.payment.model.ParameterType;
import p341ge.bog.mobilebank.payment.model.PaymentCustomConfiguration;
import p341ge.bog.mobilebank.payment.model.PaymentCustomParameter;
import qw0.C38254c;
import r90.C27950a;
import rw0.C38375b;
import rw0.C38379f;
import rw0.C38380g;

@Parcel
/* renamed from: ge.bog.mobilebank.payment.controllers.wizard.PaymentWizardPlugin */
public class PaymentWizardPlugin extends BaseWizardPlugin {
    /* access modifiers changed from: private */
    public static PaymentWizardPlugin instance;
    PaymentWizardManager manager;
    /* access modifiers changed from: private */
    public boolean nextPageRequestedWhenLoading;
    /* access modifiers changed from: private */
    public boolean waitingForConfiguration;
    /* access modifiers changed from: private */
    public boolean waitingForResponse;

    @Parcel
    /* renamed from: ge.bog.mobilebank.payment.controllers.wizard.PaymentWizardPlugin$PaymentWizardManager */
    public static class PaymentWizardManager implements C37487b {
        PaymentCustomConfiguration customConfiguration;
        /* access modifiers changed from: private */
        public boolean debtVerified;
        protected C38254c paymentEventManager;

        public PaymentWizardManager(PaymentCustomConfiguration paymentCustomConfiguration) {
            this();
            this.customConfiguration = paymentCustomConfiguration;
        }

        /* access modifiers changed from: private */
        public boolean debtVerifiableField(int i) {
            return (isMobilePayments() && C38380g.m112736c(this.customConfiguration, PaymentWizardPlugin.instance) == i) || (i >= 0 && this.customConfiguration.requiresDebtVerify(i));
        }

        private ArrayList<KeyValue> getCleanDebtResponse(boolean z) {
            ArrayList<KeyValue> arrayList = new ArrayList<>();
            for (KeyValue keyValue : this.paymentEventManager.f91740a.getPaymentDebt().getParameter()) {
                if (!TextUtils.isEmpty(keyValue.getKey()) && !TextUtils.isEmpty(keyValue.getValue()) && this.customConfiguration.getCustomParamCountByKey(keyValue.getKey()) == 1) {
                    KeyValue copy = keyValue.copy();
                    PaymentCustomParameter customParamByKey = this.customConfiguration.getCustomParamByKey(keyValue.getKey());
                    if (z) {
                        copy.setKey(customParamByKey.getName());
                        if (customParamByKey.getStyle().getParameterType() == ParameterType.SELECT) {
                            PaymentsServiceConfigInputOption[] inputOptions = customParamByKey.getInputOptions();
                            int length = inputOptions.length;
                            int i = 0;
                            while (true) {
                                if (i >= length) {
                                    break;
                                }
                                PaymentsServiceConfigInputOption paymentsServiceConfigInputOption = inputOptions[i];
                                if (paymentsServiceConfigInputOption.getId().equals(copy.getValue())) {
                                    copy.setValue(C27950a.m86286c(paymentsServiceConfigInputOption.getValue(), true));
                                    break;
                                }
                                i++;
                            }
                        }
                    }
                    arrayList.add(copy);
                }
            }
            return arrayList;
        }

        private String getNameForKey(String str) {
            for (PaymentCustomParameter next : this.customConfiguration.getParameters()) {
                if (next.getId().equals(str)) {
                    return next.getName();
                }
            }
            return str;
        }

        private ArrayList<KeyValue> getPaymentParams() {
            return TemplateBasketItemsWithPaymentConfig.getPaymentParams(this.customConfiguration, PaymentWizardPlugin.instance, (TemplateBasketItem) null);
        }

        private C35886a getWizardCallback() {
            return PaymentWizardPlugin.instance.wizardCallback;
        }

        /* access modifiers changed from: private */
        public boolean isMobilePayments() {
            return PaymentWizardPlugin.instance.isMobilePayments();
        }

        private void onError(String str) {
            getWizardCallback().mo87831D();
            PaymentWizardPlugin.instance.waitingForConfiguration = false;
            PaymentWizardPlugin.instance.waitingForResponse = false;
            C32297d.m95154b((Activity) getWizardCallback(), str);
        }

        private boolean presentInConfig(KeyValue keyValue) {
            for (int i = 0; i < this.customConfiguration.getParameters().size(); i++) {
                PaymentCustomParameter paymentCustomParameter = this.customConfiguration.getParameters().get(i);
                if (paymentCustomParameter.getId() != null && paymentCustomParameter.getId().equals(keyValue.getKey()) && !TextUtils.isEmpty(keyValue.getValue())) {
                    return true;
                }
            }
            return false;
        }

        /* access modifiers changed from: private */
        public boolean requiresDebtCheck(int i) {
            return debtVerifiableField(i) && !this.debtVerified;
        }

        public void getMobileDebt() {
            getPaymentDebt("mep-bog-mobpayments-customer-info");
            PaymentWizardPlugin.instance.waitingForResponse = true;
        }

        public void getPaymentDebt(String str) {
            C38375b.m112716l(getPaymentParams(), this.paymentEventManager.mo91794b(), str, this);
        }

        public void insertDebt(WizardObject wizardObject, ArrayList<KeyValue> arrayList, ArrayList<KeyValue> arrayList2) {
            int j = C32315k0.m95261j(this.customConfiguration, this.paymentEventManager.f91740a.getPaymentDebt());
            ArraySet arraySet = new ArraySet();
            if (j > 0) {
                wizardObject.setValue(C32359z0.m95555Z((double) j));
                if (PaymentWizardPlugin.instance instanceof PointPaymentWizardPlugin) {
                    PaymentWizardPlugin.instance.manager.paymentEventManager.mo91793a().getPointValueExchange(String.valueOf(j), C38375b.m112712h(String.valueOf(j), this.customConfiguration.getBaseConfiguration().getServiceId()), this.customConfiguration.getBaseConfiguration().getServiceId());
                }
            }
            for (int i = 0; i < this.customConfiguration.getParameters().size(); i++) {
                PaymentCustomParameter paymentCustomParameter = this.customConfiguration.getParameters().get(i);
                if (paymentCustomParameter.getStyle().getParameterType() == ParameterType.AMOUNT) {
                    for (int i2 = 0; i2 < arrayList2.size(); i2++) {
                        if (arrayList2.get(i2).getKey().equals(paymentCustomParameter.getId())) {
                            arraySet.add(Integer.valueOf(i2));
                        }
                    }
                }
            }
            for (int i3 = 0; i3 < arrayList.size(); i3++) {
                if (arraySet.contains(Integer.valueOf(i3))) {
                    arrayList.get(i3).setValue(C32359z0.m95555Z((double) Float.parseFloat(arrayList.get(i3).getValue())) + " ₾");
                }
            }
            wizardObject.setInfoKeyValues(arrayList);
        }

        public void onDataError(String str) {
            onError(str);
        }

        public void onDebtEventSuccess(PaymentDebtEvent paymentDebtEvent) {
            String str;
            if (!isMobilePayments()) {
                getWizardCallback().mo87831D();
                WizardObject D1 = ((C31355y) getWizardCallback().mo87842f0().get(PaymentWizardPlugin.instance.getAmountPosition())).mo71707D1();
                insertDebt(D1, getCleanDebtResponse(true), getCleanDebtResponse(false));
                getWizardCallback().mo87840d(PaymentWizardPlugin.instance.getAmountPosition(), D1);
                this.debtVerified = true;
                PaymentWizardPlugin.instance.waitingForResponse = false;
                if (PaymentWizardPlugin.instance.hasDebtList()) {
                    getWizardCallback().mo87830B(true);
                } else {
                    getWizardCallback().mo87846o0();
                }
            } else {
                KeyValue[] parameter = paymentDebtEvent.getPaymentDebt().getParameter();
                int length = parameter.length;
                int i = 0;
                while (true) {
                    if (i >= length) {
                        str = null;
                        break;
                    }
                    KeyValue keyValue = parameter[i];
                    if (keyValue.getKey().equals("paymentServiceId")) {
                        str = keyValue.getValue();
                        break;
                    }
                    i++;
                }
                this.debtVerified = true;
                PaymentWizardPlugin.instance.waitingForResponse = false;
                requestConfiguration(str);
            }
        }

        public void onLoading(boolean z) {
            if (!z) {
                getWizardCallback().mo87847q();
            }
        }

        public void onNetworkError() {
            onError((String) null);
        }

        public void onPointExchangeEvent(PointValueExchangeEvent pointValueExchangeEvent) {
            if (PaymentWizardPlugin.instance != null && (PaymentWizardPlugin.instance instanceof PointPaymentWizardPlugin)) {
                PointPaymentWizardPlugin pointPaymentWizardPlugin = (PointPaymentWizardPlugin) PaymentWizardPlugin.instance;
                if (pointPaymentWizardPlugin.getAmountToExchange().equals(pointValueExchangeEvent.amount) && pointPaymentWizardPlugin.manager.customConfiguration.getBaseConfiguration().getServiceId().equals(pointValueExchangeEvent.serviceProviderId)) {
                    pointPaymentWizardPlugin.setPlusPointValue("", true);
                    int state = pointValueExchangeEvent.getState();
                    if (state == 10) {
                        onLoading(false);
                    } else if (state == 20) {
                        getWizardCallback().mo87831D();
                        pointPaymentWizardPlugin.setPlusPointValue(pointValueExchangeEvent.getPointValue(), false);
                    } else if (state == 30) {
                        onNetworkError();
                    } else if (state == 40) {
                        onDataError(C27950a.m86286c(pointValueExchangeEvent.getErrorKey(), false));
                    }
                }
            }
        }

        public void onProviderConfigurationEventSuccess(ProviderConfigurationEvent providerConfigurationEvent) {
            PaymentWizardPlugin.instance.waitingForConfiguration = false;
            getWizardCallback().mo87831D();
            PaymentWizardPlugin.instance.updateConfiguration(providerConfigurationEvent);
            if (!isMobilePayments()) {
                ArrayList j = C38380g.m112743j(this.customConfiguration, PaymentWizardPlugin.instance);
                for (int i = 0; i <= PaymentWizardPlugin.instance.getInitialIndex(); i++) {
                    j.remove(0);
                }
                getWizardCallback().mo87839c0(PaymentWizardPlugin.instance.getInitialIndex() + 1, j);
            } else {
                ArrayList j2 = C38380g.m112743j(this.customConfiguration, PaymentWizardPlugin.instance);
                ((C31355y) getWizardCallback().mo87842f0().get(PaymentWizardPlugin.instance.getInitialIndex())).mo71707D1().setIconUrl(((WizardObject) j2.get(PaymentWizardPlugin.instance.getInitialIndex())).getIconUrl());
                for (int i2 = 0; i2 <= PaymentWizardPlugin.instance.getInitialIndex(); i2++) {
                    j2.remove(0);
                }
                getWizardCallback().mo87837Z(PaymentWizardPlugin.instance.getInitialIndex());
                getWizardCallback().mo87839c0(PaymentWizardPlugin.instance.getInitialIndex() + 1, j2);
            }
            if (PaymentWizardPlugin.instance.nextPageRequestedWhenLoading) {
                getWizardCallback().mo87846o0();
                PaymentWizardPlugin.instance.nextPageRequestedWhenLoading = false;
            }
        }

        public void onStart() {
            this.paymentEventManager.mo91795c();
        }

        public void onStop() {
            this.paymentEventManager.mo91796d();
        }

        public void requestConfiguration() {
            PaymentWizardPlugin.instance.waitingForConfiguration = true;
            this.paymentEventManager.mo91794b().requestPaymentsProviderConfig(true, "", this.customConfiguration.getServiceId(), this);
        }

        public void getPaymentDebt() {
            if (isMobilePayments()) {
                getMobileDebt();
            } else {
                getPaymentDebt(this.customConfiguration.getDebtServiceId());
            }
        }

        public PaymentWizardManager() {
            this.paymentEventManager = new C38254c(this);
        }

        public void requestConfiguration(String str) {
            PaymentWizardPlugin.instance.waitingForConfiguration = true;
            if (PaymentWizardPlugin.instance instanceof PointPaymentWizardPlugin) {
                this.paymentEventManager.mo91793a().getPaymentsProviderConfigurationForPoints(str, this);
            } else {
                this.paymentEventManager.mo91794b().requestPaymentsProviderConfig(true, "", str, this);
            }
        }
    }

    public PaymentWizardPlugin() {
        instance = this;
    }

    private void adjustDateBoundaries(int i) {
        WizardObject D1 = getWizardFragments().get(i).mo71707D1();
        if (D1.getId().equalsIgnoreCase("DD_START_DATE_ID")) {
            Iterator<C31355y> it = getWizardFragments().iterator();
            while (it.hasNext()) {
                C31355y next = it.next();
                if (next.mo71707D1().getId().equalsIgnoreCase("DD_END_DATE_ID") && D1.getValue() != null) {
                    if (next.mo71707D1().getValue() != null && Long.parseLong(next.mo71707D1().getValue()) <= Long.parseLong(D1.getValue())) {
                        next.mo71717U1("");
                        next.mo71707D1().setValue((String) null);
                        next.mo71707D1().setVisibleInput((String) null);
                    }
                    next.mo71707D1().setMinDate(Long.parseLong(D1.getValue()));
                }
            }
        }
    }

    /* access modifiers changed from: private */
    public int getAmountPosition() {
        Iterator<C31355y> it = getWizardFragments().iterator();
        while (it.hasNext()) {
            C31355y next = it.next();
            if (next.mo71707D1().getInputType() == 302) {
                return next.mo71734s1();
            }
        }
        return 0;
    }

    /* access modifiers changed from: private */
    public boolean hasDebtList() {
        PaymentDebtEvent paymentDebtEvent = this.manager.paymentEventManager.f91740a;
        if (!(paymentDebtEvent == null || paymentDebtEvent.getPaymentDebt() == null)) {
            for (KeyValue keyValue : this.manager.paymentEventManager.f91740a.getPaymentDebt().getParameter()) {
                if (keyValue.getKey().equals(PaymentServiceConfig.TYPE_DEBT_LIST) && !TextUtils.isEmpty(keyValue.getValue())) {
                    return true;
                }
            }
        }
        return false;
    }

    private void reconfigureInputOptions() {
        Iterator<C31355y> it = getWizardFragments().iterator();
        while (it.hasNext()) {
            C31355y next = it.next();
            if (next instanceof C31319o) {
                for (PaymentCustomParameter next2 : this.manager.customConfiguration.getParameters()) {
                    if (next2.getId().equals(next.mo71707D1().getId())) {
                        ArrayList arrayList = new ArrayList();
                        for (String next3 : next.mo71707D1().getSelectorOptionValues()) {
                            PaymentsServiceConfigInputOption[] inputOptions = next2.getInputOptions();
                            int length = inputOptions.length;
                            int i = 0;
                            while (true) {
                                if (i >= length) {
                                    break;
                                }
                                PaymentsServiceConfigInputOption paymentsServiceConfigInputOption = inputOptions[i];
                                if (next3.equals(paymentsServiceConfigInputOption.getId())) {
                                    arrayList.add(paymentsServiceConfigInputOption);
                                    break;
                                }
                                i++;
                            }
                        }
                        next2.setInputOptions((PaymentsServiceConfigInputOption[]) arrayList.toArray(new PaymentsServiceConfigInputOption[arrayList.size()]));
                        next2.setValue(next.mo71707D1().getValue());
                        next2.setValueToDisplay(next.mo71707D1().getVisibleInput());
                        return;
                    }
                }
                return;
            }
        }
    }

    public Intent getData() {
        boolean z;
        PaymentCustomParameter customParamByKey;
        reconfigureInputOptions();
        C38379f fVar = new C38379f(this);
        C38379f fVar2 = new C38379f(this);
        for (PaymentCustomParameter next : this.manager.customConfiguration.getParameters()) {
            if (next.isVisibleInWizard() && !next.getStyle().getParameterType().equals(ParameterType.SELECT_MULTIPLE)) {
                next.setValue(fVar.mo91903b(next.getId()));
                next.setValueToDisplay(fVar2.mo91905d(next.getId()));
            }
        }
        int a = new C38379f(this).mo91902a();
        if (a >= 0) {
            PaymentCustomConfiguration paymentCustomConfiguration = this.manager.customConfiguration;
            paymentCustomConfiguration.setSelectedPackageIndex(paymentCustomConfiguration.getBaseConfiguration().getServiceConfigJson(), a);
        }
        Intent intent = new Intent();
        intent.putExtra(BaseWizardPlugin.WIZARD_DATA, C42035e.m122121c(this.manager.customConfiguration));
        if (this.manager.paymentEventManager.f91740a != null && hasDebtList()) {
            PaymentWizardManager paymentWizardManager = this.manager;
            paymentWizardManager.customConfiguration.setResultListItems(C32315k0.m95252a(paymentWizardManager.paymentEventManager.f91740a.getPaymentDebt(), this.manager.customConfiguration.getBaseConfiguration()));
        }
        PaymentDebtEvent paymentDebtEvent = this.manager.paymentEventManager.f91740a;
        if (!(paymentDebtEvent == null || paymentDebtEvent.getPaymentDebt() == null)) {
            PaymentCustomConfiguration paymentCustomConfiguration2 = this.manager.customConfiguration;
            if (paymentCustomConfiguration2 == null || (customParamByKey = paymentCustomConfiguration2.getCustomParamByKey("amount")) == null || customParamByKey.isVisibleInWizard()) {
                z = false;
            } else {
                z = true;
            }
            PaymentWizardManager paymentWizardManager2 = this.manager;
            C38375b.m112706b(paymentWizardManager2.customConfiguration, paymentWizardManager2.paymentEventManager.f91740a.getPaymentDebt(), z);
        }
        return intent;
    }

    /* access modifiers changed from: protected */
    public int getInitialIndex() {
        return C38380g.m112736c(this.manager.customConfiguration, this);
    }

    /* access modifiers changed from: protected */
    public String getValueForId(String str, WizardObject wizardObject) {
        wizardObject.getInputStyle();
        return super.getValueForId(str, wizardObject);
    }

    /* access modifiers changed from: protected */
    public boolean isMobilePayments() {
        return this.manager.customConfiguration.isMobile();
    }

    public void onFragmentsSet() {
        super.onFragmentsSet();
    }

    public void onInputChanged(int i) {
        super.onInputChanged(i);
        if (this.manager.debtVerifiableField(i)) {
            this.manager.debtVerified = false;
        }
    }

    public void onInputVerificationRequired(int i) {
        super.onInputVerificationRequired(i);
        if ((getWizardCallback().mo87838a0() instanceof C31307h) && (getWizardFragments().get(i + 1) instanceof C31307h)) {
            C31307h hVar = (C31307h) getWizardFragments().get(i);
        }
        if (!this.manager.isMobilePayments()) {
            String id = getWizardFragments().get(i).mo71707D1().getId();
            if (this.manager.customConfiguration.isCompany() && id.equals("PROVIDER_LIST_ID")) {
                this.manager.debtVerified = false;
                this.manager.requestConfiguration(new C38379f(this).mo91903b(id));
            }
        } else if ((getWizardCallback().mo87838a0() instanceof C31315m) && this.manager.isMobilePayments()) {
            this.manager.debtVerified = false;
            this.manager.getMobileDebt();
        }
    }

    public void onNextClick(int i) {
        if (this.waitingForResponse || this.waitingForConfiguration) {
            if (this.waitingForConfiguration) {
                this.nextPageRequestedWhenLoading = true;
            }
            getWizardCallback().mo87847q();
        } else if (!this.manager.requiresDebtCheck(i)) {
            adjustDateBoundaries(i);
            getWizardCallback().mo87846o0();
        } else if (!this.manager.isMobilePayments() || this.manager.requiresDebtCheck(i)) {
            this.nextPageRequestedWhenLoading = true;
            this.waitingForResponse = true;
            this.manager.getPaymentDebt();
        } else {
            getWizardCallback().mo87846o0();
        }
    }

    public void onStart() {
        PaymentWizardManager paymentWizardManager = this.manager;
        if (paymentWizardManager != null && paymentWizardManager.paymentEventManager != null) {
            paymentWizardManager.onStart();
        }
    }

    public void onStop() {
        this.manager.onStop();
    }

    public void setPaymentCustomConfigurations(PaymentCustomConfiguration paymentCustomConfiguration) {
        PaymentWizardManager paymentWizardManager = new PaymentWizardManager(paymentCustomConfiguration);
        this.manager = paymentWizardManager;
        paymentWizardManager.onStart();
    }

    /* access modifiers changed from: protected */
    public void updateConfiguration(ProviderConfigurationEvent providerConfigurationEvent) {
        PaymentWizardManager paymentWizardManager = this.manager;
        paymentWizardManager.customConfiguration = C38375b.m112707c(paymentWizardManager.paymentEventManager.f91743d, providerConfigurationEvent.getConfiguration(), this.manager.customConfiguration);
    }
}
