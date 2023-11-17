package p341ge.bog.mobilebank.shared.payments.data.model;

import androidx.annotation.Keep;
import com.salesforce.marketingcloud.C11398b;
import java.util.List;
import kotlin.jvm.internal.C41536l;

@Keep
/* renamed from: ge.bog.mobilebank.shared.payments.data.model.PaymentServiceConfigInputApiModel */
public final class PaymentServiceConfigInputApiModel {
    private final String dependedInputId;
    private final Boolean enable;
    private final String errorDesc;
    private final String hint;

    /* renamed from: id */
    private final String f83752id;
    private final String inputName;
    private final List<PaymentServiceConfigInputOptionApiModel> inputOption;
    private final Boolean inputOptionBundle;
    private final Boolean isNumeric;
    private final String mask;
    private final String name;
    private final String prefix;
    private final Boolean submit;
    private final String type;
    private final String validationRegex;
    private final String value;
    private final Integer width;

    public PaymentServiceConfigInputApiModel(String str, Boolean bool, String str2, Integer num, Boolean bool2, Boolean bool3, Boolean bool4, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, List<PaymentServiceConfigInputOptionApiModel> list) {
        C41536l.m120489i(str3, "inputName");
        this.type = str;
        this.enable = bool;
        this.value = str2;
        this.width = num;
        this.submit = bool2;
        this.inputOptionBundle = bool3;
        this.isNumeric = bool4;
        this.inputName = str3;
        this.mask = str4;
        this.hint = str5;
        this.prefix = str6;
        this.errorDesc = str7;
        this.validationRegex = str8;
        this.dependedInputId = str9;
        this.f83752id = str10;
        this.name = str11;
        this.inputOption = list;
    }

    public static /* synthetic */ PaymentServiceConfigInputApiModel copy$default(PaymentServiceConfigInputApiModel paymentServiceConfigInputApiModel, String str, Boolean bool, String str2, Integer num, Boolean bool2, Boolean bool3, Boolean bool4, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, List list, int i, Object obj) {
        PaymentServiceConfigInputApiModel paymentServiceConfigInputApiModel2 = paymentServiceConfigInputApiModel;
        int i2 = i;
        return paymentServiceConfigInputApiModel.copy((i2 & 1) != 0 ? paymentServiceConfigInputApiModel2.type : str, (i2 & 2) != 0 ? paymentServiceConfigInputApiModel2.enable : bool, (i2 & 4) != 0 ? paymentServiceConfigInputApiModel2.value : str2, (i2 & 8) != 0 ? paymentServiceConfigInputApiModel2.width : num, (i2 & 16) != 0 ? paymentServiceConfigInputApiModel2.submit : bool2, (i2 & 32) != 0 ? paymentServiceConfigInputApiModel2.inputOptionBundle : bool3, (i2 & 64) != 0 ? paymentServiceConfigInputApiModel2.isNumeric : bool4, (i2 & 128) != 0 ? paymentServiceConfigInputApiModel2.inputName : str3, (i2 & C11398b.f33139r) != 0 ? paymentServiceConfigInputApiModel2.mask : str4, (i2 & C11398b.f33140s) != 0 ? paymentServiceConfigInputApiModel2.hint : str5, (i2 & C11398b.f33141t) != 0 ? paymentServiceConfigInputApiModel2.prefix : str6, (i2 & C11398b.f33142u) != 0 ? paymentServiceConfigInputApiModel2.errorDesc : str7, (i2 & C11398b.f33143v) != 0 ? paymentServiceConfigInputApiModel2.validationRegex : str8, (i2 & 8192) != 0 ? paymentServiceConfigInputApiModel2.dependedInputId : str9, (i2 & 16384) != 0 ? paymentServiceConfigInputApiModel2.f83752id : str10, (i2 & 32768) != 0 ? paymentServiceConfigInputApiModel2.name : str11, (i2 & 65536) != 0 ? paymentServiceConfigInputApiModel2.inputOption : list);
    }

    public final String component1() {
        return this.type;
    }

    public final String component10() {
        return this.hint;
    }

    public final String component11() {
        return this.prefix;
    }

    public final String component12() {
        return this.errorDesc;
    }

    public final String component13() {
        return this.validationRegex;
    }

    public final String component14() {
        return this.dependedInputId;
    }

    public final String component15() {
        return this.f83752id;
    }

    public final String component16() {
        return this.name;
    }

    public final List<PaymentServiceConfigInputOptionApiModel> component17() {
        return this.inputOption;
    }

    public final Boolean component2() {
        return this.enable;
    }

    public final String component3() {
        return this.value;
    }

    public final Integer component4() {
        return this.width;
    }

    public final Boolean component5() {
        return this.submit;
    }

    public final Boolean component6() {
        return this.inputOptionBundle;
    }

    public final Boolean component7() {
        return this.isNumeric;
    }

    public final String component8() {
        return this.inputName;
    }

    public final String component9() {
        return this.mask;
    }

    public final PaymentServiceConfigInputApiModel copy(String str, Boolean bool, String str2, Integer num, Boolean bool2, Boolean bool3, Boolean bool4, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, List<PaymentServiceConfigInputOptionApiModel> list) {
        String str12 = str;
        C41536l.m120489i(str3, "inputName");
        return new PaymentServiceConfigInputApiModel(str, bool, str2, num, bool2, bool3, bool4, str3, str4, str5, str6, str7, str8, str9, str10, str11, list);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PaymentServiceConfigInputApiModel)) {
            return false;
        }
        PaymentServiceConfigInputApiModel paymentServiceConfigInputApiModel = (PaymentServiceConfigInputApiModel) obj;
        return C41536l.m120484d(this.type, paymentServiceConfigInputApiModel.type) && C41536l.m120484d(this.enable, paymentServiceConfigInputApiModel.enable) && C41536l.m120484d(this.value, paymentServiceConfigInputApiModel.value) && C41536l.m120484d(this.width, paymentServiceConfigInputApiModel.width) && C41536l.m120484d(this.submit, paymentServiceConfigInputApiModel.submit) && C41536l.m120484d(this.inputOptionBundle, paymentServiceConfigInputApiModel.inputOptionBundle) && C41536l.m120484d(this.isNumeric, paymentServiceConfigInputApiModel.isNumeric) && C41536l.m120484d(this.inputName, paymentServiceConfigInputApiModel.inputName) && C41536l.m120484d(this.mask, paymentServiceConfigInputApiModel.mask) && C41536l.m120484d(this.hint, paymentServiceConfigInputApiModel.hint) && C41536l.m120484d(this.prefix, paymentServiceConfigInputApiModel.prefix) && C41536l.m120484d(this.errorDesc, paymentServiceConfigInputApiModel.errorDesc) && C41536l.m120484d(this.validationRegex, paymentServiceConfigInputApiModel.validationRegex) && C41536l.m120484d(this.dependedInputId, paymentServiceConfigInputApiModel.dependedInputId) && C41536l.m120484d(this.f83752id, paymentServiceConfigInputApiModel.f83752id) && C41536l.m120484d(this.name, paymentServiceConfigInputApiModel.name) && C41536l.m120484d(this.inputOption, paymentServiceConfigInputApiModel.inputOption);
    }

    public final String getDependedInputId() {
        return this.dependedInputId;
    }

    public final Boolean getEnable() {
        return this.enable;
    }

    public final String getErrorDesc() {
        return this.errorDesc;
    }

    public final String getHint() {
        return this.hint;
    }

    public final String getId() {
        return this.f83752id;
    }

    public final String getInputName() {
        return this.inputName;
    }

    public final List<PaymentServiceConfigInputOptionApiModel> getInputOption() {
        return this.inputOption;
    }

    public final Boolean getInputOptionBundle() {
        return this.inputOptionBundle;
    }

    public final String getMask() {
        return this.mask;
    }

    public final String getName() {
        return this.name;
    }

    public final String getPrefix() {
        return this.prefix;
    }

    public final Boolean getSubmit() {
        return this.submit;
    }

    public final String getType() {
        return this.type;
    }

    public final String getValidationRegex() {
        return this.validationRegex;
    }

    public final String getValue() {
        return this.value;
    }

    public final Integer getWidth() {
        return this.width;
    }

    public int hashCode() {
        String str = this.type;
        int i = 0;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        Boolean bool = this.enable;
        int hashCode2 = (hashCode + (bool == null ? 0 : bool.hashCode())) * 31;
        String str2 = this.value;
        int hashCode3 = (hashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        Integer num = this.width;
        int hashCode4 = (hashCode3 + (num == null ? 0 : num.hashCode())) * 31;
        Boolean bool2 = this.submit;
        int hashCode5 = (hashCode4 + (bool2 == null ? 0 : bool2.hashCode())) * 31;
        Boolean bool3 = this.inputOptionBundle;
        int hashCode6 = (hashCode5 + (bool3 == null ? 0 : bool3.hashCode())) * 31;
        Boolean bool4 = this.isNumeric;
        int hashCode7 = (((hashCode6 + (bool4 == null ? 0 : bool4.hashCode())) * 31) + this.inputName.hashCode()) * 31;
        String str3 = this.mask;
        int hashCode8 = (hashCode7 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.hint;
        int hashCode9 = (hashCode8 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.prefix;
        int hashCode10 = (hashCode9 + (str5 == null ? 0 : str5.hashCode())) * 31;
        String str6 = this.errorDesc;
        int hashCode11 = (hashCode10 + (str6 == null ? 0 : str6.hashCode())) * 31;
        String str7 = this.validationRegex;
        int hashCode12 = (hashCode11 + (str7 == null ? 0 : str7.hashCode())) * 31;
        String str8 = this.dependedInputId;
        int hashCode13 = (hashCode12 + (str8 == null ? 0 : str8.hashCode())) * 31;
        String str9 = this.f83752id;
        int hashCode14 = (hashCode13 + (str9 == null ? 0 : str9.hashCode())) * 31;
        String str10 = this.name;
        int hashCode15 = (hashCode14 + (str10 == null ? 0 : str10.hashCode())) * 31;
        List<PaymentServiceConfigInputOptionApiModel> list = this.inputOption;
        if (list != null) {
            i = list.hashCode();
        }
        return hashCode15 + i;
    }

    public final Boolean isNumeric() {
        return this.isNumeric;
    }

    public String toString() {
        String str = this.type;
        Boolean bool = this.enable;
        String str2 = this.value;
        Integer num = this.width;
        Boolean bool2 = this.submit;
        Boolean bool3 = this.inputOptionBundle;
        Boolean bool4 = this.isNumeric;
        String str3 = this.inputName;
        String str4 = this.mask;
        String str5 = this.hint;
        String str6 = this.prefix;
        String str7 = this.errorDesc;
        String str8 = this.validationRegex;
        String str9 = this.dependedInputId;
        String str10 = this.f83752id;
        String str11 = this.name;
        List<PaymentServiceConfigInputOptionApiModel> list = this.inputOption;
        return "PaymentServiceConfigInputApiModel(type=" + str + ", enable=" + bool + ", value=" + str2 + ", width=" + num + ", submit=" + bool2 + ", inputOptionBundle=" + bool3 + ", isNumeric=" + bool4 + ", inputName=" + str3 + ", mask=" + str4 + ", hint=" + str5 + ", prefix=" + str6 + ", errorDesc=" + str7 + ", validationRegex=" + str8 + ", dependedInputId=" + str9 + ", id=" + str10 + ", name=" + str11 + ", inputOption=" + list + ")";
    }
}
