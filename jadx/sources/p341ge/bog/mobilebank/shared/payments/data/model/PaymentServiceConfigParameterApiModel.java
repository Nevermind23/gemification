package p341ge.bog.mobilebank.shared.payments.data.model;

import androidx.annotation.Keep;
import java.util.List;
import kotlin.jvm.internal.C41536l;

@Keep
/* renamed from: ge.bog.mobilebank.shared.payments.data.model.PaymentServiceConfigParameterApiModel */
public final class PaymentServiceConfigParameterApiModel {
    private final String description;
    private final Boolean hidden;

    /* renamed from: id */
    private final String f83755id;
    private final List<PaymentServiceConfigInputApiModel> input;
    private final Boolean mandatory;
    private final String name;
    private final String paramType;
    private final Boolean successParam;

    public PaymentServiceConfigParameterApiModel(String str, String str2, String str3, String str4, Boolean bool, Boolean bool2, Boolean bool3, List<PaymentServiceConfigInputApiModel> list) {
        C41536l.m120489i(str, "id");
        this.f83755id = str;
        this.paramType = str2;
        this.name = str3;
        this.description = str4;
        this.mandatory = bool;
        this.successParam = bool2;
        this.hidden = bool3;
        this.input = list;
    }

    public static /* synthetic */ PaymentServiceConfigParameterApiModel copy$default(PaymentServiceConfigParameterApiModel paymentServiceConfigParameterApiModel, String str, String str2, String str3, String str4, Boolean bool, Boolean bool2, Boolean bool3, List list, int i, Object obj) {
        PaymentServiceConfigParameterApiModel paymentServiceConfigParameterApiModel2 = paymentServiceConfigParameterApiModel;
        int i2 = i;
        return paymentServiceConfigParameterApiModel.copy((i2 & 1) != 0 ? paymentServiceConfigParameterApiModel2.f83755id : str, (i2 & 2) != 0 ? paymentServiceConfigParameterApiModel2.paramType : str2, (i2 & 4) != 0 ? paymentServiceConfigParameterApiModel2.name : str3, (i2 & 8) != 0 ? paymentServiceConfigParameterApiModel2.description : str4, (i2 & 16) != 0 ? paymentServiceConfigParameterApiModel2.mandatory : bool, (i2 & 32) != 0 ? paymentServiceConfigParameterApiModel2.successParam : bool2, (i2 & 64) != 0 ? paymentServiceConfigParameterApiModel2.hidden : bool3, (i2 & 128) != 0 ? paymentServiceConfigParameterApiModel2.input : list);
    }

    public final String component1() {
        return this.f83755id;
    }

    public final String component2() {
        return this.paramType;
    }

    public final String component3() {
        return this.name;
    }

    public final String component4() {
        return this.description;
    }

    public final Boolean component5() {
        return this.mandatory;
    }

    public final Boolean component6() {
        return this.successParam;
    }

    public final Boolean component7() {
        return this.hidden;
    }

    public final List<PaymentServiceConfigInputApiModel> component8() {
        return this.input;
    }

    public final PaymentServiceConfigParameterApiModel copy(String str, String str2, String str3, String str4, Boolean bool, Boolean bool2, Boolean bool3, List<PaymentServiceConfigInputApiModel> list) {
        C41536l.m120489i(str, "id");
        return new PaymentServiceConfigParameterApiModel(str, str2, str3, str4, bool, bool2, bool3, list);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PaymentServiceConfigParameterApiModel)) {
            return false;
        }
        PaymentServiceConfigParameterApiModel paymentServiceConfigParameterApiModel = (PaymentServiceConfigParameterApiModel) obj;
        return C41536l.m120484d(this.f83755id, paymentServiceConfigParameterApiModel.f83755id) && C41536l.m120484d(this.paramType, paymentServiceConfigParameterApiModel.paramType) && C41536l.m120484d(this.name, paymentServiceConfigParameterApiModel.name) && C41536l.m120484d(this.description, paymentServiceConfigParameterApiModel.description) && C41536l.m120484d(this.mandatory, paymentServiceConfigParameterApiModel.mandatory) && C41536l.m120484d(this.successParam, paymentServiceConfigParameterApiModel.successParam) && C41536l.m120484d(this.hidden, paymentServiceConfigParameterApiModel.hidden) && C41536l.m120484d(this.input, paymentServiceConfigParameterApiModel.input);
    }

    public final String getDescription() {
        return this.description;
    }

    public final Boolean getHidden() {
        return this.hidden;
    }

    public final String getId() {
        return this.f83755id;
    }

    public final List<PaymentServiceConfigInputApiModel> getInput() {
        return this.input;
    }

    public final Boolean getMandatory() {
        return this.mandatory;
    }

    public final String getName() {
        return this.name;
    }

    public final String getParamType() {
        return this.paramType;
    }

    public final Boolean getSuccessParam() {
        return this.successParam;
    }

    public int hashCode() {
        int hashCode = this.f83755id.hashCode() * 31;
        String str = this.paramType;
        int i = 0;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.name;
        int hashCode3 = (hashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.description;
        int hashCode4 = (hashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31;
        Boolean bool = this.mandatory;
        int hashCode5 = (hashCode4 + (bool == null ? 0 : bool.hashCode())) * 31;
        Boolean bool2 = this.successParam;
        int hashCode6 = (hashCode5 + (bool2 == null ? 0 : bool2.hashCode())) * 31;
        Boolean bool3 = this.hidden;
        int hashCode7 = (hashCode6 + (bool3 == null ? 0 : bool3.hashCode())) * 31;
        List<PaymentServiceConfigInputApiModel> list = this.input;
        if (list != null) {
            i = list.hashCode();
        }
        return hashCode7 + i;
    }

    public String toString() {
        String str = this.f83755id;
        String str2 = this.paramType;
        String str3 = this.name;
        String str4 = this.description;
        Boolean bool = this.mandatory;
        Boolean bool2 = this.successParam;
        Boolean bool3 = this.hidden;
        List<PaymentServiceConfigInputApiModel> list = this.input;
        return "PaymentServiceConfigParameterApiModel(id=" + str + ", paramType=" + str2 + ", name=" + str3 + ", description=" + str4 + ", mandatory=" + bool + ", successParam=" + bool2 + ", hidden=" + bool3 + ", input=" + list + ")";
    }
}
