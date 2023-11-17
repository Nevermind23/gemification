package p341ge.bog.mobilebank.paymentconfiguration.data.source.remote.network.model;

import androidx.annotation.Keep;
import kotlin.jvm.internal.C41536l;
import p277ua.C8664c;

@Keep
/* renamed from: ge.bog.mobilebank.paymentconfiguration.data.source.remote.network.model.PaymentConfigApiResponse */
public final class PaymentConfigApiResponse {
    @C8664c("hashCode")
    private final String hashCode;
    @C8664c("list")
    private final PaymentConfigListApiResponse list;

    public PaymentConfigApiResponse(String str, PaymentConfigListApiResponse paymentConfigListApiResponse) {
        C41536l.m120489i(str, "hashCode");
        this.hashCode = str;
        this.list = paymentConfigListApiResponse;
    }

    public static /* synthetic */ PaymentConfigApiResponse copy$default(PaymentConfigApiResponse paymentConfigApiResponse, String str, PaymentConfigListApiResponse paymentConfigListApiResponse, int i, Object obj) {
        if ((i & 1) != 0) {
            str = paymentConfigApiResponse.hashCode;
        }
        if ((i & 2) != 0) {
            paymentConfigListApiResponse = paymentConfigApiResponse.list;
        }
        return paymentConfigApiResponse.copy(str, paymentConfigListApiResponse);
    }

    public final String component1() {
        return this.hashCode;
    }

    public final PaymentConfigListApiResponse component2() {
        return this.list;
    }

    public final PaymentConfigApiResponse copy(String str, PaymentConfigListApiResponse paymentConfigListApiResponse) {
        C41536l.m120489i(str, "hashCode");
        return new PaymentConfigApiResponse(str, paymentConfigListApiResponse);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PaymentConfigApiResponse)) {
            return false;
        }
        PaymentConfigApiResponse paymentConfigApiResponse = (PaymentConfigApiResponse) obj;
        return C41536l.m120484d(this.hashCode, paymentConfigApiResponse.hashCode) && C41536l.m120484d(this.list, paymentConfigApiResponse.list);
    }

    public final String getHashCode() {
        return this.hashCode;
    }

    public final PaymentConfigListApiResponse getList() {
        return this.list;
    }

    public int hashCode() {
        int hashCode2 = this.hashCode.hashCode() * 31;
        PaymentConfigListApiResponse paymentConfigListApiResponse = this.list;
        return hashCode2 + (paymentConfigListApiResponse == null ? 0 : paymentConfigListApiResponse.hashCode());
    }

    public String toString() {
        String str = this.hashCode;
        PaymentConfigListApiResponse paymentConfigListApiResponse = this.list;
        return "PaymentConfigApiResponse(hashCode=" + str + ", list=" + paymentConfigListApiResponse + ")";
    }
}
