package p341ge.bog.mobilebank.model.payment;

import org.parceler.Parcel;
import p277ua.C8664c;

@Parcel
/* renamed from: ge.bog.mobilebank.model.payment.PaymentsServiceConfigInputOption */
public class PaymentsServiceConfigInputOption {
    @C8664c("amount")
    double amount;
    @C8664c("id")

    /* renamed from: id */
    String f81348id;
    @C8664c("service")
    String service;
    @C8664c("value")
    String value;

    public PaymentsServiceConfigInputOption(String str, String str2) {
        this.value = str;
        this.f81348id = str2;
    }

    public PaymentsServiceConfigInputOption copy() {
        return new PaymentsServiceConfigInputOption(this.value, this.f81348id, this.service, this.amount);
    }

    public double getAmount() {
        return this.amount;
    }

    public String getId() {
        return this.f81348id;
    }

    public String getService() {
        return this.service;
    }

    public String getValue() {
        return this.value;
    }

    public void setAmount(double d) {
        this.amount = d;
    }

    public void setId(String str) {
        this.f81348id = str;
    }

    public void setService(String str) {
        this.service = str;
    }

    public void setValue(String str) {
        this.value = str;
    }

    public String toString() {
        return getValue();
    }

    public PaymentsServiceConfigInputOption(String str, String str2, String str3, double d) {
        this.value = str;
        this.f81348id = str2;
        this.service = str3;
        this.amount = d;
    }

    public PaymentsServiceConfigInputOption() {
    }
}
