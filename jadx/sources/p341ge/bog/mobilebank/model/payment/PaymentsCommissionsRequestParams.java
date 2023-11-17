package p341ge.bog.mobilebank.model.payment;

import androidx.annotation.Keep;
import java.util.List;
import kotlin.jvm.internal.C41536l;
import p277ua.C8664c;
import p341ge.bog.mobilebank.model.KeyValue;

@Keep
/* renamed from: ge.bog.mobilebank.model.payment.PaymentsCommissionsRequestParams */
public final class PaymentsCommissionsRequestParams {
    @C8664c("essParameters")
    private final List<KeyValue> essParameters;
    @C8664c("essServiceId")
    private final String essServiceId;

    public PaymentsCommissionsRequestParams(String str, List<? extends KeyValue> list) {
        C41536l.m120489i(str, "essServiceId");
        C41536l.m120489i(list, "essParameters");
        this.essServiceId = str;
        this.essParameters = list;
    }

    public static /* synthetic */ PaymentsCommissionsRequestParams copy$default(PaymentsCommissionsRequestParams paymentsCommissionsRequestParams, String str, List<KeyValue> list, int i, Object obj) {
        if ((i & 1) != 0) {
            str = paymentsCommissionsRequestParams.essServiceId;
        }
        if ((i & 2) != 0) {
            list = paymentsCommissionsRequestParams.essParameters;
        }
        return paymentsCommissionsRequestParams.copy(str, list);
    }

    public final String component1() {
        return this.essServiceId;
    }

    public final List<KeyValue> component2() {
        return this.essParameters;
    }

    public final PaymentsCommissionsRequestParams copy(String str, List<? extends KeyValue> list) {
        C41536l.m120489i(str, "essServiceId");
        C41536l.m120489i(list, "essParameters");
        return new PaymentsCommissionsRequestParams(str, list);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PaymentsCommissionsRequestParams)) {
            return false;
        }
        PaymentsCommissionsRequestParams paymentsCommissionsRequestParams = (PaymentsCommissionsRequestParams) obj;
        return C41536l.m120484d(this.essServiceId, paymentsCommissionsRequestParams.essServiceId) && C41536l.m120484d(this.essParameters, paymentsCommissionsRequestParams.essParameters);
    }

    public final List<KeyValue> getEssParameters() {
        return this.essParameters;
    }

    public final String getEssServiceId() {
        return this.essServiceId;
    }

    public int hashCode() {
        return (this.essServiceId.hashCode() * 31) + this.essParameters.hashCode();
    }

    public String toString() {
        String str = this.essServiceId;
        List<KeyValue> list = this.essParameters;
        return "PaymentsCommissionsRequestParams(essServiceId=" + str + ", essParameters=" + list + ")";
    }
}
