package p341ge.bog.mobilebank.payments.domain.model;

import androidx.annotation.Keep;
import java.util.List;
import kotlin.jvm.internal.C41536l;

@Keep
/* renamed from: ge.bog.mobilebank.payments.domain.model.PaymentConfigVersionList */
public final class PaymentConfigVersionList {
    private final List<PaymentConfigVersion> providers;

    public PaymentConfigVersionList(List<PaymentConfigVersion> list) {
        C41536l.m120489i(list, "providers");
        this.providers = list;
    }

    public static /* synthetic */ PaymentConfigVersionList copy$default(PaymentConfigVersionList paymentConfigVersionList, List<PaymentConfigVersion> list, int i, Object obj) {
        if ((i & 1) != 0) {
            list = paymentConfigVersionList.providers;
        }
        return paymentConfigVersionList.copy(list);
    }

    public final List<PaymentConfigVersion> component1() {
        return this.providers;
    }

    public final PaymentConfigVersionList copy(List<PaymentConfigVersion> list) {
        C41536l.m120489i(list, "providers");
        return new PaymentConfigVersionList(list);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof PaymentConfigVersionList) && C41536l.m120484d(this.providers, ((PaymentConfigVersionList) obj).providers);
    }

    public final List<PaymentConfigVersion> getProviders() {
        return this.providers;
    }

    public int hashCode() {
        return this.providers.hashCode();
    }

    public String toString() {
        List<PaymentConfigVersion> list = this.providers;
        return "PaymentConfigVersionList(providers=" + list + ")";
    }
}
