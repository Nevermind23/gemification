package p341ge.bog.mobilebank.model.payment;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.util.ArrayList;
import org.parceler.Parcel;
import p277ua.C8664c;
import p341ge.bog.mobilebank.model.PaymentVoucher;

@Parcel
/* renamed from: ge.bog.mobilebank.model.payment.PaymentServiceConfig */
public class PaymentServiceConfig {
    public static final String TYPE_BY_LIST = "byList";
    public static final String TYPE_DEBT_LIST = "debtList";
    public static final String TYPE_GIFT_CARD = "giftCards";
    public static final String TYPE_MOBILE = "mobile";
    @C8664c("description")
    String description;
    @C8664c("id")

    /* renamed from: id */
    String f81345id;
    @C8664c("logo")
    String logo;
    @C8664c("logoSmall")
    String logoSmall;
    PaymentVoucher[] mVouchers;
    @C8664c("name")
    String name;
    @C8664c("parameter")
    PaymentServiceConfigParameter[] parameter;
    String type;

    @Retention(RetentionPolicy.SOURCE)
    /* renamed from: ge.bog.mobilebank.model.payment.PaymentServiceConfig$Type */
    public @interface Type {
    }

    public ArrayList<String> getAllParameterIdsByParamType(String str) {
        ArrayList<String> arrayList = new ArrayList<>();
        PaymentServiceConfigParameter[] paymentServiceConfigParameterArr = this.parameter;
        if (paymentServiceConfigParameterArr != null) {
            for (PaymentServiceConfigParameter paymentServiceConfigParameter : paymentServiceConfigParameterArr) {
                if (str.equals(paymentServiceConfigParameter.getParamType())) {
                    arrayList.add(paymentServiceConfigParameter.getId());
                }
            }
        }
        return arrayList;
    }

    public String getDescription() {
        return this.description;
    }

    public String getId() {
        return this.f81345id;
    }

    public String getLogo() {
        return this.logo;
    }

    public String getName() {
        return this.name;
    }

    public PaymentServiceConfigParameter[] getParameter() {
        return this.parameter;
    }

    public PaymentServiceConfigParameter getParameterByID(String str) {
        PaymentServiceConfigParameter[] paymentServiceConfigParameterArr = this.parameter;
        if (paymentServiceConfigParameterArr == null) {
            return null;
        }
        for (PaymentServiceConfigParameter paymentServiceConfigParameter : paymentServiceConfigParameterArr) {
            if (str.equals(paymentServiceConfigParameter.getId())) {
                return paymentServiceConfigParameter;
            }
        }
        return null;
    }

    public PaymentServiceConfigParameter getParameterByParamType(String str) {
        PaymentServiceConfigParameter[] paymentServiceConfigParameterArr = this.parameter;
        if (paymentServiceConfigParameterArr == null) {
            return null;
        }
        for (PaymentServiceConfigParameter paymentServiceConfigParameter : paymentServiceConfigParameterArr) {
            if (str.equals(paymentServiceConfigParameter.getParamType())) {
                return paymentServiceConfigParameter;
            }
        }
        return null;
    }

    public String getParameterIdByParamType(String str) {
        PaymentServiceConfigParameter[] paymentServiceConfigParameterArr = this.parameter;
        if (paymentServiceConfigParameterArr == null) {
            return "";
        }
        for (PaymentServiceConfigParameter paymentServiceConfigParameter : paymentServiceConfigParameterArr) {
            if (str.equals(paymentServiceConfigParameter.getParamType())) {
                return paymentServiceConfigParameter.getId();
            }
        }
        return "";
    }

    public PaymentServiceConfigInput[] getParameterInputByParamType(String str) {
        PaymentServiceConfigParameter[] paymentServiceConfigParameterArr = this.parameter;
        if (paymentServiceConfigParameterArr == null) {
            return null;
        }
        for (PaymentServiceConfigParameter paymentServiceConfigParameter : paymentServiceConfigParameterArr) {
            if (str.equals(paymentServiceConfigParameter.getParamType())) {
                return paymentServiceConfigParameter.getInput();
            }
        }
        return null;
    }

    public String getParameterTypeByID(String str) {
        PaymentServiceConfigParameter[] paymentServiceConfigParameterArr = this.parameter;
        if (paymentServiceConfigParameterArr == null) {
            return "";
        }
        for (PaymentServiceConfigParameter paymentServiceConfigParameter : paymentServiceConfigParameterArr) {
            if (str.equals(paymentServiceConfigParameter.getId())) {
                return paymentServiceConfigParameter.getParamType();
            }
        }
        return "";
    }

    public String getType() {
        return this.type;
    }

    public PaymentVoucher[] getVouchers() {
        return this.mVouchers;
    }

    public boolean isMobileServiceConfig() {
        String str = this.type;
        return str != null && str.equals(TYPE_MOBILE);
    }

    public void setDescription(String str) {
        this.description = str;
    }

    public void setId(String str) {
        this.f81345id = str;
    }

    public void setLogo(String str) {
        this.logo = str;
    }

    public void setName(String str) {
        this.name = str;
    }

    public void setParameter(PaymentServiceConfigParameter[] paymentServiceConfigParameterArr) {
        this.parameter = paymentServiceConfigParameterArr;
    }

    public void setType(String str) {
        this.type = str;
    }

    public void setVouchers(PaymentVoucher[] paymentVoucherArr) {
        this.mVouchers = paymentVoucherArr;
    }

    public boolean shouldShowByList() {
        String str = this.type;
        return str != null && str.equals(TYPE_BY_LIST);
    }
}
