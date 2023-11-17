package p341ge.bog.mobilebank.model.payment;

import java.util.List;
import p277ua.C8664c;

/* renamed from: ge.bog.mobilebank.model.payment.PaymentProviderConfigurations */
public class PaymentProviderConfigurations {
    @C8664c("MOBILE")
    private List<PaymentProviderConfiguration> mobileConfigs;

    public List<PaymentProviderConfiguration> getMobileConfigs() {
        return this.mobileConfigs;
    }

    public void setMobileConfigs(List<PaymentProviderConfiguration> list) {
        this.mobileConfigs = list;
    }
}
