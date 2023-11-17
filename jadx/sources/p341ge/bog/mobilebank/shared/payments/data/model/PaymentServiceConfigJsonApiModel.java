package p341ge.bog.mobilebank.shared.payments.data.model;

import androidx.annotation.Keep;
import java.util.List;
import kotlin.jvm.internal.C41536l;

@Keep
/* renamed from: ge.bog.mobilebank.shared.payments.data.model.PaymentServiceConfigJsonApiModel */
public final class PaymentServiceConfigJsonApiModel {
    private final String description;

    /* renamed from: id */
    private final String f83754id;
    private final String logo;
    private final String logoSmall;
    private final String name;
    private final List<PaymentServiceConfigParameterApiModel> parameter;
    private final String type;

    public PaymentServiceConfigJsonApiModel(String str, String str2, String str3, String str4, String str5, String str6, List<PaymentServiceConfigParameterApiModel> list) {
        C41536l.m120489i(str, "id");
        this.f83754id = str;
        this.name = str2;
        this.description = str3;
        this.logo = str4;
        this.logoSmall = str5;
        this.type = str6;
        this.parameter = list;
    }

    public static /* synthetic */ PaymentServiceConfigJsonApiModel copy$default(PaymentServiceConfigJsonApiModel paymentServiceConfigJsonApiModel, String str, String str2, String str3, String str4, String str5, String str6, List<PaymentServiceConfigParameterApiModel> list, int i, Object obj) {
        if ((i & 1) != 0) {
            str = paymentServiceConfigJsonApiModel.f83754id;
        }
        if ((i & 2) != 0) {
            str2 = paymentServiceConfigJsonApiModel.name;
        }
        String str7 = str2;
        if ((i & 4) != 0) {
            str3 = paymentServiceConfigJsonApiModel.description;
        }
        String str8 = str3;
        if ((i & 8) != 0) {
            str4 = paymentServiceConfigJsonApiModel.logo;
        }
        String str9 = str4;
        if ((i & 16) != 0) {
            str5 = paymentServiceConfigJsonApiModel.logoSmall;
        }
        String str10 = str5;
        if ((i & 32) != 0) {
            str6 = paymentServiceConfigJsonApiModel.type;
        }
        String str11 = str6;
        if ((i & 64) != 0) {
            list = paymentServiceConfigJsonApiModel.parameter;
        }
        return paymentServiceConfigJsonApiModel.copy(str, str7, str8, str9, str10, str11, list);
    }

    public final String component1() {
        return this.f83754id;
    }

    public final String component2() {
        return this.name;
    }

    public final String component3() {
        return this.description;
    }

    public final String component4() {
        return this.logo;
    }

    public final String component5() {
        return this.logoSmall;
    }

    public final String component6() {
        return this.type;
    }

    public final List<PaymentServiceConfigParameterApiModel> component7() {
        return this.parameter;
    }

    public final PaymentServiceConfigJsonApiModel copy(String str, String str2, String str3, String str4, String str5, String str6, List<PaymentServiceConfigParameterApiModel> list) {
        C41536l.m120489i(str, "id");
        return new PaymentServiceConfigJsonApiModel(str, str2, str3, str4, str5, str6, list);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PaymentServiceConfigJsonApiModel)) {
            return false;
        }
        PaymentServiceConfigJsonApiModel paymentServiceConfigJsonApiModel = (PaymentServiceConfigJsonApiModel) obj;
        return C41536l.m120484d(this.f83754id, paymentServiceConfigJsonApiModel.f83754id) && C41536l.m120484d(this.name, paymentServiceConfigJsonApiModel.name) && C41536l.m120484d(this.description, paymentServiceConfigJsonApiModel.description) && C41536l.m120484d(this.logo, paymentServiceConfigJsonApiModel.logo) && C41536l.m120484d(this.logoSmall, paymentServiceConfigJsonApiModel.logoSmall) && C41536l.m120484d(this.type, paymentServiceConfigJsonApiModel.type) && C41536l.m120484d(this.parameter, paymentServiceConfigJsonApiModel.parameter);
    }

    public final String getDescription() {
        return this.description;
    }

    public final String getId() {
        return this.f83754id;
    }

    public final String getLogo() {
        return this.logo;
    }

    public final String getLogoSmall() {
        return this.logoSmall;
    }

    public final String getName() {
        return this.name;
    }

    public final List<PaymentServiceConfigParameterApiModel> getParameter() {
        return this.parameter;
    }

    public final String getType() {
        return this.type;
    }

    public int hashCode() {
        int hashCode = this.f83754id.hashCode() * 31;
        String str = this.name;
        int i = 0;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.description;
        int hashCode3 = (hashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.logo;
        int hashCode4 = (hashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.logoSmall;
        int hashCode5 = (hashCode4 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.type;
        int hashCode6 = (hashCode5 + (str5 == null ? 0 : str5.hashCode())) * 31;
        List<PaymentServiceConfigParameterApiModel> list = this.parameter;
        if (list != null) {
            i = list.hashCode();
        }
        return hashCode6 + i;
    }

    public String toString() {
        String str = this.f83754id;
        String str2 = this.name;
        String str3 = this.description;
        String str4 = this.logo;
        String str5 = this.logoSmall;
        String str6 = this.type;
        List<PaymentServiceConfigParameterApiModel> list = this.parameter;
        return "PaymentServiceConfigJsonApiModel(id=" + str + ", name=" + str2 + ", description=" + str3 + ", logo=" + str4 + ", logoSmall=" + str5 + ", type=" + str6 + ", parameter=" + list + ")";
    }
}
