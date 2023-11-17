package p341ge.bog.mobilebank.loyaltyprogress.data.model;

import androidx.annotation.Keep;
import kotlin.jvm.internal.C41536l;

@Keep
/* renamed from: ge.bog.mobilebank.loyaltyprogress.data.model.BenefitApiModel */
public final class BenefitApiModel {
    private final String benefitDesc;
    private final String benefitStatus;
    private final String benefitValue;
    private final String clientKey;
    private final String labelDesc;
    private final String labelType;
    private final String orderValue;

    public BenefitApiModel(String str, String str2, String str3, String str4, String str5, String str6, String str7) {
        this.clientKey = str;
        this.labelType = str2;
        this.labelDesc = str3;
        this.benefitValue = str4;
        this.benefitStatus = str5;
        this.orderValue = str6;
        this.benefitDesc = str7;
    }

    public static /* synthetic */ BenefitApiModel copy$default(BenefitApiModel benefitApiModel, String str, String str2, String str3, String str4, String str5, String str6, String str7, int i, Object obj) {
        if ((i & 1) != 0) {
            str = benefitApiModel.clientKey;
        }
        if ((i & 2) != 0) {
            str2 = benefitApiModel.labelType;
        }
        String str8 = str2;
        if ((i & 4) != 0) {
            str3 = benefitApiModel.labelDesc;
        }
        String str9 = str3;
        if ((i & 8) != 0) {
            str4 = benefitApiModel.benefitValue;
        }
        String str10 = str4;
        if ((i & 16) != 0) {
            str5 = benefitApiModel.benefitStatus;
        }
        String str11 = str5;
        if ((i & 32) != 0) {
            str6 = benefitApiModel.orderValue;
        }
        String str12 = str6;
        if ((i & 64) != 0) {
            str7 = benefitApiModel.benefitDesc;
        }
        return benefitApiModel.copy(str, str8, str9, str10, str11, str12, str7);
    }

    public final String component1() {
        return this.clientKey;
    }

    public final String component2() {
        return this.labelType;
    }

    public final String component3() {
        return this.labelDesc;
    }

    public final String component4() {
        return this.benefitValue;
    }

    public final String component5() {
        return this.benefitStatus;
    }

    public final String component6() {
        return this.orderValue;
    }

    public final String component7() {
        return this.benefitDesc;
    }

    public final BenefitApiModel copy(String str, String str2, String str3, String str4, String str5, String str6, String str7) {
        return new BenefitApiModel(str, str2, str3, str4, str5, str6, str7);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof BenefitApiModel)) {
            return false;
        }
        BenefitApiModel benefitApiModel = (BenefitApiModel) obj;
        return C41536l.m120484d(this.clientKey, benefitApiModel.clientKey) && C41536l.m120484d(this.labelType, benefitApiModel.labelType) && C41536l.m120484d(this.labelDesc, benefitApiModel.labelDesc) && C41536l.m120484d(this.benefitValue, benefitApiModel.benefitValue) && C41536l.m120484d(this.benefitStatus, benefitApiModel.benefitStatus) && C41536l.m120484d(this.orderValue, benefitApiModel.orderValue) && C41536l.m120484d(this.benefitDesc, benefitApiModel.benefitDesc);
    }

    public final String getBenefitDesc() {
        return this.benefitDesc;
    }

    public final String getBenefitStatus() {
        return this.benefitStatus;
    }

    public final String getBenefitValue() {
        return this.benefitValue;
    }

    public final String getClientKey() {
        return this.clientKey;
    }

    public final String getLabelDesc() {
        return this.labelDesc;
    }

    public final String getLabelType() {
        return this.labelType;
    }

    public final String getOrderValue() {
        return this.orderValue;
    }

    public int hashCode() {
        String str = this.clientKey;
        int i = 0;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.labelType;
        int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.labelDesc;
        int hashCode3 = (hashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.benefitValue;
        int hashCode4 = (hashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.benefitStatus;
        int hashCode5 = (hashCode4 + (str5 == null ? 0 : str5.hashCode())) * 31;
        String str6 = this.orderValue;
        int hashCode6 = (hashCode5 + (str6 == null ? 0 : str6.hashCode())) * 31;
        String str7 = this.benefitDesc;
        if (str7 != null) {
            i = str7.hashCode();
        }
        return hashCode6 + i;
    }

    public String toString() {
        String str = this.clientKey;
        String str2 = this.labelType;
        String str3 = this.labelDesc;
        String str4 = this.benefitValue;
        String str5 = this.benefitStatus;
        String str6 = this.orderValue;
        String str7 = this.benefitDesc;
        return "BenefitApiModel(clientKey=" + str + ", labelType=" + str2 + ", labelDesc=" + str3 + ", benefitValue=" + str4 + ", benefitStatus=" + str5 + ", orderValue=" + str6 + ", benefitDesc=" + str7 + ")";
    }
}
