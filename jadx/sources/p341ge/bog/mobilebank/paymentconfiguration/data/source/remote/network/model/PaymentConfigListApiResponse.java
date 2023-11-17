package p341ge.bog.mobilebank.paymentconfiguration.data.source.remote.network.model;

import androidx.annotation.Keep;
import java.util.List;
import kotlin.jvm.internal.C41536l;
import kotlin.jvm.internal.DefaultConstructorMarker;
import p277ua.C8664c;
import p341ge.bog.mobilebank.model.payment.PaymentServiceConfig;

@Keep
/* renamed from: ge.bog.mobilebank.paymentconfiguration.data.source.remote.network.model.PaymentConfigListApiResponse */
public final class PaymentConfigListApiResponse {
    @C8664c("MOBILE")
    private final List<PaymentConfigApiModel> mobile;

    public PaymentConfigListApiResponse() {
        this((List) null, 1, (DefaultConstructorMarker) null);
    }

    public static /* synthetic */ PaymentConfigListApiResponse copy$default(PaymentConfigListApiResponse paymentConfigListApiResponse, List<PaymentConfigApiModel> list, int i, Object obj) {
        if ((i & 1) != 0) {
            list = paymentConfigListApiResponse.mobile;
        }
        return paymentConfigListApiResponse.copy(list);
    }

    public final List<PaymentConfigApiModel> component1() {
        return this.mobile;
    }

    public final PaymentConfigListApiResponse copy(List<PaymentConfigApiModel> list) {
        C41536l.m120489i(list, PaymentServiceConfig.TYPE_MOBILE);
        return new PaymentConfigListApiResponse(list);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof PaymentConfigListApiResponse) && C41536l.m120484d(this.mobile, ((PaymentConfigListApiResponse) obj).mobile);
    }

    public final List<PaymentConfigApiModel> getMobile() {
        return this.mobile;
    }

    public int hashCode() {
        return this.mobile.hashCode();
    }

    public String toString() {
        List<PaymentConfigApiModel> list = this.mobile;
        return "PaymentConfigListApiResponse(mobile=" + list + ")";
    }

    public PaymentConfigListApiResponse(List<PaymentConfigApiModel> list) {
        C41536l.m120489i(list, PaymentServiceConfig.TYPE_MOBILE);
        this.mobile = list;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ PaymentConfigListApiResponse(List list, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? C41341q.m119907j() : list);
    }
}
