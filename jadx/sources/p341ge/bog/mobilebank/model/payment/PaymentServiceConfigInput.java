package p341ge.bog.mobilebank.model.payment;

import org.parceler.Parcel;
import p277ua.C8664c;

@Parcel
/* renamed from: ge.bog.mobilebank.model.payment.PaymentServiceConfigInput */
public class PaymentServiceConfigInput {
    @C8664c("enable")
    Boolean enable;
    @C8664c("id")

    /* renamed from: id */
    String f81346id;
    String inputName;
    @C8664c("inputOption")
    PaymentsServiceConfigInputOption[] inputOption;
    Boolean inputOptionBundle;
    @C8664c("isNumeric")
    Boolean isNumeric;
    String manualValue;
    @C8664c("maxLength")
    Integer maxLength;
    @C8664c("name")
    String name;
    @C8664c("submit")
    Boolean submit;
    @C8664c("type")
    String type;
    @C8664c("value")
    String value;
    @C8664c("width")
    Integer width;

    public Boolean getEnable() {
        Boolean bool = this.enable;
        return Boolean.valueOf(bool == null ? true : bool.booleanValue());
    }

    public String getId() {
        return this.f81346id;
    }

    public String getInputName() {
        return this.inputName;
    }

    public PaymentsServiceConfigInputOption[] getInputOption() {
        return this.inputOption;
    }

    public boolean getInputOptionBundle() {
        Boolean bool = this.inputOptionBundle;
        if (bool == null) {
            return false;
        }
        return bool.booleanValue();
    }

    public Integer getMaxLength() {
        return this.maxLength;
    }

    public String getName() {
        return this.name;
    }

    public String getType() {
        return this.type;
    }

    public String getValue() {
        return this.value;
    }

    public Integer getWidth() {
        return this.width;
    }

    public boolean isNumeric() {
        Boolean bool = this.isNumeric;
        if (bool == null) {
            return false;
        }
        return bool.booleanValue();
    }

    public void setEnable(Boolean bool) {
        this.enable = bool;
    }

    public void setInputOption(PaymentsServiceConfigInputOption[] paymentsServiceConfigInputOptionArr) {
        this.inputOption = paymentsServiceConfigInputOptionArr;
    }

    public void setName(String str) {
        this.name = str;
    }

    public void setType(String str) {
        this.type = str;
    }

    public void setValue(String str) {
        this.value = str;
    }

    public void setWidth(Integer num) {
        this.width = num;
    }
}
