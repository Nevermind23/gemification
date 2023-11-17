package p341ge.bog.mobilebank.payments.data.model;

import androidx.annotation.Keep;
import java.util.List;
import kotlin.jvm.internal.C41536l;
import p341ge.bog.mobilebank.shared.payments.data.model.PaymentConfigDetailsApiModel;

@Keep
/* renamed from: ge.bog.mobilebank.payments.data.model.PaymentDebtApiModel */
public final class PaymentDebtApiModel {
    private final List<KeyValueApiModel> parameter;
    private final PaymentConfigDetailsApiModel providerConfig;

    public PaymentDebtApiModel(List<KeyValueApiModel> list, PaymentConfigDetailsApiModel paymentConfigDetailsApiModel) {
        C41536l.m120489i(list, "parameter");
        this.parameter = list;
        this.providerConfig = paymentConfigDetailsApiModel;
    }

    public static /* synthetic */ PaymentDebtApiModel copy$default(PaymentDebtApiModel paymentDebtApiModel, List<KeyValueApiModel> list, PaymentConfigDetailsApiModel paymentConfigDetailsApiModel, int i, Object obj) {
        if ((i & 1) != 0) {
            list = paymentDebtApiModel.parameter;
        }
        if ((i & 2) != 0) {
            paymentConfigDetailsApiModel = paymentDebtApiModel.providerConfig;
        }
        return paymentDebtApiModel.copy(list, paymentConfigDetailsApiModel);
    }

    public final List<KeyValueApiModel> component1() {
        return this.parameter;
    }

    public final PaymentConfigDetailsApiModel component2() {
        return this.providerConfig;
    }

    public final PaymentDebtApiModel copy(List<KeyValueApiModel> list, PaymentConfigDetailsApiModel paymentConfigDetailsApiModel) {
        C41536l.m120489i(list, "parameter");
        return new PaymentDebtApiModel(list, paymentConfigDetailsApiModel);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PaymentDebtApiModel)) {
            return false;
        }
        PaymentDebtApiModel paymentDebtApiModel = (PaymentDebtApiModel) obj;
        return C41536l.m120484d(this.parameter, paymentDebtApiModel.parameter) && C41536l.m120484d(this.providerConfig, paymentDebtApiModel.providerConfig);
    }

    public final List<KeyValueApiModel> getParameter() {
        return this.parameter;
    }

    public final PaymentConfigDetailsApiModel getProviderConfig() {
        return this.providerConfig;
    }

    public int hashCode() {
        int hashCode = this.parameter.hashCode() * 31;
        PaymentConfigDetailsApiModel paymentConfigDetailsApiModel = this.providerConfig;
        return hashCode + (paymentConfigDetailsApiModel == null ? 0 : paymentConfigDetailsApiModel.hashCode());
    }

    public String toString() {
        List<KeyValueApiModel> list = this.parameter;
        PaymentConfigDetailsApiModel paymentConfigDetailsApiModel = this.providerConfig;
        return "PaymentDebtApiModel(parameter=" + list + ", providerConfig=" + paymentConfigDetailsApiModel + ")";
    }
}
