package p341ge.bog.mobilebank.payment.controllers.wizard;

import iu0.C36546y;
import java.util.ArrayList;
import org.parceler.Parcel;
import p341ge.bog.mobilebank.eventbus.events.AgreementTemplateEventKt;
import p341ge.bog.mobilebank.eventbus.events.ProviderConfigurationEvent;
import p341ge.bog.mobilebank.payment.controllers.wizard.PaymentWizardPlugin;
import p380ck.C10469j;
import rw0.C38374a;
import rw0.C38380g;

@Parcel
/* renamed from: ge.bog.mobilebank.payment.controllers.wizard.DDPaymentWizardPlugin */
public class DDPaymentWizardPlugin extends PaymentWizardPlugin {
    public static DDPaymentWizardPlugin instance;
    public boolean isTopup;

    public DDPaymentWizardPlugin() {
        instance = this;
    }

    /* access modifiers changed from: protected */
    public boolean isMobilePayments() {
        return false;
    }

    public void onInputVerificationRequired(int i) {
        String str;
        if ("DD_TYPES_SELECTOR_ID".equals(getWizardFragments().get(i).mo71707D1().getId())) {
            String value = getWizardFragments().get(i).mo71707D1().getValue();
            if ("1".equals(value)) {
                str = "V";
            } else if (AgreementTemplateEventKt.CONTRACT_TYPE_CREFIT_INFO_CHECK_PERMISSION_OFFERS_ID.equals(value)) {
                str = "M";
            } else {
                str = "F";
            }
            this.manager.customConfiguration.getCustomParamByKey("DD_TYPES_SELECTOR_ID").setValue(str);
            C38374a.m112683e(this.manager.customConfiguration);
            ArrayList j = C38380g.m112743j(this.manager.customConfiguration, this);
            for (int i2 = 0; i2 <= i; i2++) {
                j.remove(0);
            }
            getWizardCallback().mo87839c0(i + 1, j);
            return;
        }
        super.onInputVerificationRequired(i);
    }

    public void onNextClick(int i) {
        super.onNextClick(i);
        try {
            String inputTitle = getWizardFragments().get(i).mo71707D1().getInputTitle();
            if (inputTitle == null) {
                inputTitle = "";
            }
            new C10469j.C10477h(inputTitle).mo27161b(C36546y.m108282F());
        } catch (IndexOutOfBoundsException unused) {
        }
    }

    /* access modifiers changed from: protected */
    public void updateConfiguration(ProviderConfigurationEvent providerConfigurationEvent) {
        PaymentWizardPlugin.PaymentWizardManager paymentWizardManager = this.manager;
        paymentWizardManager.customConfiguration = C38374a.m112686h(paymentWizardManager.paymentEventManager.mo91794b(), providerConfigurationEvent.getConfiguration(), this.manager.customConfiguration, instance.isTopup);
    }
}
