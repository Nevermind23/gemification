package p341ge.bog.mobilebank.shared.payments.data.model;

import androidx.annotation.Keep;
import kotlin.jvm.internal.C41536l;

@Keep
/* renamed from: ge.bog.mobilebank.shared.payments.data.model.PaymentServiceConfigInputOptionApiModel */
public final class PaymentServiceConfigInputOptionApiModel {
    private final Double amount;

    /* renamed from: id */
    private final String f83753id;
    private final Boolean isJnr;
    private final String service;
    private final String value;

    public PaymentServiceConfigInputOptionApiModel(String str, String str2, String str3, Double d, Boolean bool) {
        C41536l.m120489i(str, "id");
        this.f83753id = str;
        this.value = str2;
        this.service = str3;
        this.amount = d;
        this.isJnr = bool;
    }

    public static /* synthetic */ PaymentServiceConfigInputOptionApiModel copy$default(PaymentServiceConfigInputOptionApiModel paymentServiceConfigInputOptionApiModel, String str, String str2, String str3, Double d, Boolean bool, int i, Object obj) {
        if ((i & 1) != 0) {
            str = paymentServiceConfigInputOptionApiModel.f83753id;
        }
        if ((i & 2) != 0) {
            str2 = paymentServiceConfigInputOptionApiModel.value;
        }
        String str4 = str2;
        if ((i & 4) != 0) {
            str3 = paymentServiceConfigInputOptionApiModel.service;
        }
        String str5 = str3;
        if ((i & 8) != 0) {
            d = paymentServiceConfigInputOptionApiModel.amount;
        }
        Double d2 = d;
        if ((i & 16) != 0) {
            bool = paymentServiceConfigInputOptionApiModel.isJnr;
        }
        return paymentServiceConfigInputOptionApiModel.copy(str, str4, str5, d2, bool);
    }

    public final String component1() {
        return this.f83753id;
    }

    public final String component2() {
        return this.value;
    }

    public final String component3() {
        return this.service;
    }

    public final Double component4() {
        return this.amount;
    }

    public final Boolean component5() {
        return this.isJnr;
    }

    public final PaymentServiceConfigInputOptionApiModel copy(String str, String str2, String str3, Double d, Boolean bool) {
        C41536l.m120489i(str, "id");
        return new PaymentServiceConfigInputOptionApiModel(str, str2, str3, d, bool);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PaymentServiceConfigInputOptionApiModel)) {
            return false;
        }
        PaymentServiceConfigInputOptionApiModel paymentServiceConfigInputOptionApiModel = (PaymentServiceConfigInputOptionApiModel) obj;
        return C41536l.m120484d(this.f83753id, paymentServiceConfigInputOptionApiModel.f83753id) && C41536l.m120484d(this.value, paymentServiceConfigInputOptionApiModel.value) && C41536l.m120484d(this.service, paymentServiceConfigInputOptionApiModel.service) && C41536l.m120484d(this.amount, paymentServiceConfigInputOptionApiModel.amount) && C41536l.m120484d(this.isJnr, paymentServiceConfigInputOptionApiModel.isJnr);
    }

    public final Double getAmount() {
        return this.amount;
    }

    public final String getId() {
        return this.f83753id;
    }

    public final String getService() {
        return this.service;
    }

    public final String getValue() {
        return this.value;
    }

    public int hashCode() {
        int hashCode = this.f83753id.hashCode() * 31;
        String str = this.value;
        int i = 0;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.service;
        int hashCode3 = (hashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        Double d = this.amount;
        int hashCode4 = (hashCode3 + (d == null ? 0 : d.hashCode())) * 31;
        Boolean bool = this.isJnr;
        if (bool != null) {
            i = bool.hashCode();
        }
        return hashCode4 + i;
    }

    public final Boolean isJnr() {
        return this.isJnr;
    }

    public String toString() {
        String str = this.f83753id;
        String str2 = this.value;
        String str3 = this.service;
        Double d = this.amount;
        Boolean bool = this.isJnr;
        return "PaymentServiceConfigInputOptionApiModel(id=" + str + ", value=" + str2 + ", service=" + str3 + ", amount=" + d + ", isJnr=" + bool + ")";
    }
}
