package p341ge.bog.mobilebank.payments.domain.model;

import androidx.annotation.Keep;
import kotlin.jvm.internal.C41536l;

@Keep
/* renamed from: ge.bog.mobilebank.payments.domain.model.PaymentConfigVersion */
public final class PaymentConfigVersion {
    private final Integer androidMinVersion;
    private final String iosMinVersion;
    private final String providerServiceId;

    public PaymentConfigVersion(String str, Integer num, String str2) {
        this.providerServiceId = str;
        this.androidMinVersion = num;
        this.iosMinVersion = str2;
    }

    public static /* synthetic */ PaymentConfigVersion copy$default(PaymentConfigVersion paymentConfigVersion, String str, Integer num, String str2, int i, Object obj) {
        if ((i & 1) != 0) {
            str = paymentConfigVersion.providerServiceId;
        }
        if ((i & 2) != 0) {
            num = paymentConfigVersion.androidMinVersion;
        }
        if ((i & 4) != 0) {
            str2 = paymentConfigVersion.iosMinVersion;
        }
        return paymentConfigVersion.copy(str, num, str2);
    }

    public final String component1() {
        return this.providerServiceId;
    }

    public final Integer component2() {
        return this.androidMinVersion;
    }

    public final String component3() {
        return this.iosMinVersion;
    }

    public final PaymentConfigVersion copy(String str, Integer num, String str2) {
        return new PaymentConfigVersion(str, num, str2);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PaymentConfigVersion)) {
            return false;
        }
        PaymentConfigVersion paymentConfigVersion = (PaymentConfigVersion) obj;
        return C41536l.m120484d(this.providerServiceId, paymentConfigVersion.providerServiceId) && C41536l.m120484d(this.androidMinVersion, paymentConfigVersion.androidMinVersion) && C41536l.m120484d(this.iosMinVersion, paymentConfigVersion.iosMinVersion);
    }

    public final Integer getAndroidMinVersion() {
        return this.androidMinVersion;
    }

    public final String getIosMinVersion() {
        return this.iosMinVersion;
    }

    public final String getProviderServiceId() {
        return this.providerServiceId;
    }

    public int hashCode() {
        String str = this.providerServiceId;
        int i = 0;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        Integer num = this.androidMinVersion;
        int hashCode2 = (hashCode + (num == null ? 0 : num.hashCode())) * 31;
        String str2 = this.iosMinVersion;
        if (str2 != null) {
            i = str2.hashCode();
        }
        return hashCode2 + i;
    }

    public String toString() {
        String str = this.providerServiceId;
        Integer num = this.androidMinVersion;
        String str2 = this.iosMinVersion;
        return "PaymentConfigVersion(providerServiceId=" + str + ", androidMinVersion=" + num + ", iosMinVersion=" + str2 + ")";
    }
}
