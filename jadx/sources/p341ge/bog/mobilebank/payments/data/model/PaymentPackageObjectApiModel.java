package p341ge.bog.mobilebank.payments.data.model;

import androidx.annotation.Keep;
import kotlin.jvm.internal.C41536l;

@Keep
/* renamed from: ge.bog.mobilebank.payments.data.model.PaymentPackageObjectApiModel */
public final class PaymentPackageObjectApiModel {
    private final String defaultIconUrl;
    private final PaymentPackageApiModel servicePackage;

    public PaymentPackageObjectApiModel(PaymentPackageApiModel paymentPackageApiModel, String str) {
        C41536l.m120489i(paymentPackageApiModel, "servicePackage");
        this.servicePackage = paymentPackageApiModel;
        this.defaultIconUrl = str;
    }

    public static /* synthetic */ PaymentPackageObjectApiModel copy$default(PaymentPackageObjectApiModel paymentPackageObjectApiModel, PaymentPackageApiModel paymentPackageApiModel, String str, int i, Object obj) {
        if ((i & 1) != 0) {
            paymentPackageApiModel = paymentPackageObjectApiModel.servicePackage;
        }
        if ((i & 2) != 0) {
            str = paymentPackageObjectApiModel.defaultIconUrl;
        }
        return paymentPackageObjectApiModel.copy(paymentPackageApiModel, str);
    }

    public final PaymentPackageApiModel component1() {
        return this.servicePackage;
    }

    public final String component2() {
        return this.defaultIconUrl;
    }

    public final PaymentPackageObjectApiModel copy(PaymentPackageApiModel paymentPackageApiModel, String str) {
        C41536l.m120489i(paymentPackageApiModel, "servicePackage");
        return new PaymentPackageObjectApiModel(paymentPackageApiModel, str);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PaymentPackageObjectApiModel)) {
            return false;
        }
        PaymentPackageObjectApiModel paymentPackageObjectApiModel = (PaymentPackageObjectApiModel) obj;
        return C41536l.m120484d(this.servicePackage, paymentPackageObjectApiModel.servicePackage) && C41536l.m120484d(this.defaultIconUrl, paymentPackageObjectApiModel.defaultIconUrl);
    }

    public final String getDefaultIconUrl() {
        return this.defaultIconUrl;
    }

    public final PaymentPackageApiModel getServicePackage() {
        return this.servicePackage;
    }

    public int hashCode() {
        int hashCode = this.servicePackage.hashCode() * 31;
        String str = this.defaultIconUrl;
        return hashCode + (str == null ? 0 : str.hashCode());
    }

    public String toString() {
        PaymentPackageApiModel paymentPackageApiModel = this.servicePackage;
        String str = this.defaultIconUrl;
        return "PaymentPackageObjectApiModel(servicePackage=" + paymentPackageApiModel + ", defaultIconUrl=" + str + ")";
    }
}
