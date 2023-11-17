package p341ge.bog.mobilebank.model.payment;

import org.parceler.Parcel;
import p277ua.C8664c;

@Parcel
/* renamed from: ge.bog.mobilebank.model.payment.PaymentServiceConfigParameter */
public class PaymentServiceConfigParameter {
    @C8664c("description")
    String description;
    @C8664c("id")

    /* renamed from: id */
    String f81347id;
    @C8664c("input")
    PaymentServiceConfigInput[] input;
    @C8664c("mandatory")
    Boolean mandatory;
    @C8664c("name")
    String name;
    @C8664c("paramMask")
    String paramMask;
    @C8664c("paramType")
    String paramType;
    @C8664c("successParam")
    boolean successParam;

    public void copyDataTo(PaymentServiceConfigParameter paymentServiceConfigParameter, int i) {
        String str;
        paymentServiceConfigParameter.setDescription(this.description);
        StringBuilder sb = new StringBuilder();
        sb.append(this.f81347id);
        if (i == 0) {
            str = "";
        } else {
            str = "_" + i;
        }
        sb.append(str);
        paymentServiceConfigParameter.setId(sb.toString());
        paymentServiceConfigParameter.setName(this.name);
        paymentServiceConfigParameter.setMandatory(this.mandatory);
        paymentServiceConfigParameter.setSuccessParam(this.successParam);
        paymentServiceConfigParameter.setParamMask(this.paramMask);
        paymentServiceConfigParameter.setParamType(this.paramType);
        paymentServiceConfigParameter.setInput(new PaymentServiceConfigInput[]{this.input[i]});
    }

    public String getDescription() {
        return this.description;
    }

    public String getId() {
        return this.f81347id;
    }

    public PaymentServiceConfigInput[] getInput() {
        return this.input;
    }

    public String getName() {
        return this.name;
    }

    public String getParamMask() {
        String str = this.paramMask;
        if (str == null) {
            return null;
        }
        return str.toLowerCase();
    }

    public String getParamType() {
        return this.paramType;
    }

    public Boolean isMandatory() {
        Boolean bool = this.mandatory;
        return Boolean.valueOf(bool == null ? false : bool.booleanValue());
    }

    public void setDescription(String str) {
        this.description = str;
    }

    public void setId(String str) {
        this.f81347id = str;
    }

    public void setInput(PaymentServiceConfigInput[] paymentServiceConfigInputArr) {
        this.input = paymentServiceConfigInputArr;
    }

    public void setMandatory(Boolean bool) {
        this.mandatory = bool;
    }

    public void setName(String str) {
        this.name = str;
    }

    public void setParamMask(String str) {
        this.paramMask = str;
    }

    public void setParamType(String str) {
        this.paramType = str;
    }

    public void setSuccessParam(boolean z) {
        this.successParam = z;
    }
}
