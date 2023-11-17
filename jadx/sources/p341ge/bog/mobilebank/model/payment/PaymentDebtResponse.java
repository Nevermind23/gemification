package p341ge.bog.mobilebank.model.payment;

import org.parceler.Parcel;
import p277ua.C8664c;
import p341ge.bog.mobilebank.model.KeyValue;

@Parcel
/* renamed from: ge.bog.mobilebank.model.payment.PaymentDebtResponse */
public class PaymentDebtResponse {
    @C8664c("parameter")
    KeyValue[] parameter;

    public boolean containsKey(String str) {
        KeyValue[] keyValueArr = this.parameter;
        if (keyValueArr != null) {
            for (KeyValue keyValue : keyValueArr) {
                if (keyValue != null && keyValue.getKey() != null && keyValue.getKey().equals(str)) {
                    return true;
                }
            }
        }
        return false;
    }

    public KeyValue[] getParameter() {
        return this.parameter;
    }

    public String getValueByKey(String str) {
        KeyValue[] keyValueArr = this.parameter;
        if (keyValueArr == null) {
            return null;
        }
        for (KeyValue keyValue : keyValueArr) {
            if (keyValue.getKey().equals(str)) {
                return keyValue.getValue();
            }
        }
        return null;
    }

    public void setParameter(KeyValue[] keyValueArr) {
        this.parameter = keyValueArr;
    }
}
