package p341ge.bog.mobilebank.loanactivation.data.entity.loandecision;

import androidx.annotation.Keep;
import com.salesforce.marketingcloud.C11398b;
import kotlin.jvm.internal.C41536l;

@Keep
/* renamed from: ge.bog.mobilebank.loanactivation.data.entity.loandecision.RefinanceInfoApiModel */
public final class RefinanceInfoApiModel {
    private final String desireProductCreditor;
    private final String desireRefFlag;
    private final String isCreditorIdentified;
    private final Double productAmount;
    private final String productCcy;
    private final String productClass;
    private final String productCode;
    private final String productCreditor;
    private final String productCreditorName;
    private final String productDictionaryKey;
    private final String productInitAmt;
    private final String productKey;
    private final String productName;
    private final String productNo;
    private final String productPmt;
    private final String productRefFlag;
    private final String productSource;
    private final String productSuggestedCreditor;
    private final String productType;

    public RefinanceInfoApiModel(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, Double d, String str11, String str12, String str13, String str14, String str15, String str16, String str17, String str18) {
        C41536l.m120489i(str11, "desireRefFlag");
        this.productSource = str;
        this.desireProductCreditor = str2;
        this.productClass = str3;
        this.productCreditorName = str4;
        this.productKey = str5;
        this.productDictionaryKey = str6;
        this.productCreditor = str7;
        this.productName = str8;
        this.isCreditorIdentified = str9;
        this.productInitAmt = str10;
        this.productAmount = d;
        this.desireRefFlag = str11;
        this.productCode = str12;
        this.productPmt = str13;
        this.productRefFlag = str14;
        this.productCcy = str15;
        this.productSuggestedCreditor = str16;
        this.productType = str17;
        this.productNo = str18;
    }

    public static /* synthetic */ RefinanceInfoApiModel copy$default(RefinanceInfoApiModel refinanceInfoApiModel, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, Double d, String str11, String str12, String str13, String str14, String str15, String str16, String str17, String str18, int i, Object obj) {
        RefinanceInfoApiModel refinanceInfoApiModel2 = refinanceInfoApiModel;
        int i2 = i;
        return refinanceInfoApiModel.copy((i2 & 1) != 0 ? refinanceInfoApiModel2.productSource : str, (i2 & 2) != 0 ? refinanceInfoApiModel2.desireProductCreditor : str2, (i2 & 4) != 0 ? refinanceInfoApiModel2.productClass : str3, (i2 & 8) != 0 ? refinanceInfoApiModel2.productCreditorName : str4, (i2 & 16) != 0 ? refinanceInfoApiModel2.productKey : str5, (i2 & 32) != 0 ? refinanceInfoApiModel2.productDictionaryKey : str6, (i2 & 64) != 0 ? refinanceInfoApiModel2.productCreditor : str7, (i2 & 128) != 0 ? refinanceInfoApiModel2.productName : str8, (i2 & C11398b.f33139r) != 0 ? refinanceInfoApiModel2.isCreditorIdentified : str9, (i2 & C11398b.f33140s) != 0 ? refinanceInfoApiModel2.productInitAmt : str10, (i2 & C11398b.f33141t) != 0 ? refinanceInfoApiModel2.productAmount : d, (i2 & C11398b.f33142u) != 0 ? refinanceInfoApiModel2.desireRefFlag : str11, (i2 & C11398b.f33143v) != 0 ? refinanceInfoApiModel2.productCode : str12, (i2 & 8192) != 0 ? refinanceInfoApiModel2.productPmt : str13, (i2 & 16384) != 0 ? refinanceInfoApiModel2.productRefFlag : str14, (i2 & 32768) != 0 ? refinanceInfoApiModel2.productCcy : str15, (i2 & 65536) != 0 ? refinanceInfoApiModel2.productSuggestedCreditor : str16, (i2 & 131072) != 0 ? refinanceInfoApiModel2.productType : str17, (i2 & 262144) != 0 ? refinanceInfoApiModel2.productNo : str18);
    }

    public final String component1() {
        return this.productSource;
    }

    public final String component10() {
        return this.productInitAmt;
    }

    public final Double component11() {
        return this.productAmount;
    }

    public final String component12() {
        return this.desireRefFlag;
    }

    public final String component13() {
        return this.productCode;
    }

    public final String component14() {
        return this.productPmt;
    }

    public final String component15() {
        return this.productRefFlag;
    }

    public final String component16() {
        return this.productCcy;
    }

    public final String component17() {
        return this.productSuggestedCreditor;
    }

    public final String component18() {
        return this.productType;
    }

    public final String component19() {
        return this.productNo;
    }

    public final String component2() {
        return this.desireProductCreditor;
    }

    public final String component3() {
        return this.productClass;
    }

    public final String component4() {
        return this.productCreditorName;
    }

    public final String component5() {
        return this.productKey;
    }

    public final String component6() {
        return this.productDictionaryKey;
    }

    public final String component7() {
        return this.productCreditor;
    }

    public final String component8() {
        return this.productName;
    }

    public final String component9() {
        return this.isCreditorIdentified;
    }

    public final RefinanceInfoApiModel copy(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, Double d, String str11, String str12, String str13, String str14, String str15, String str16, String str17, String str18) {
        String str19 = str;
        C41536l.m120489i(str11, "desireRefFlag");
        return new RefinanceInfoApiModel(str, str2, str3, str4, str5, str6, str7, str8, str9, str10, d, str11, str12, str13, str14, str15, str16, str17, str18);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof RefinanceInfoApiModel)) {
            return false;
        }
        RefinanceInfoApiModel refinanceInfoApiModel = (RefinanceInfoApiModel) obj;
        return C41536l.m120484d(this.productSource, refinanceInfoApiModel.productSource) && C41536l.m120484d(this.desireProductCreditor, refinanceInfoApiModel.desireProductCreditor) && C41536l.m120484d(this.productClass, refinanceInfoApiModel.productClass) && C41536l.m120484d(this.productCreditorName, refinanceInfoApiModel.productCreditorName) && C41536l.m120484d(this.productKey, refinanceInfoApiModel.productKey) && C41536l.m120484d(this.productDictionaryKey, refinanceInfoApiModel.productDictionaryKey) && C41536l.m120484d(this.productCreditor, refinanceInfoApiModel.productCreditor) && C41536l.m120484d(this.productName, refinanceInfoApiModel.productName) && C41536l.m120484d(this.isCreditorIdentified, refinanceInfoApiModel.isCreditorIdentified) && C41536l.m120484d(this.productInitAmt, refinanceInfoApiModel.productInitAmt) && C41536l.m120484d(this.productAmount, refinanceInfoApiModel.productAmount) && C41536l.m120484d(this.desireRefFlag, refinanceInfoApiModel.desireRefFlag) && C41536l.m120484d(this.productCode, refinanceInfoApiModel.productCode) && C41536l.m120484d(this.productPmt, refinanceInfoApiModel.productPmt) && C41536l.m120484d(this.productRefFlag, refinanceInfoApiModel.productRefFlag) && C41536l.m120484d(this.productCcy, refinanceInfoApiModel.productCcy) && C41536l.m120484d(this.productSuggestedCreditor, refinanceInfoApiModel.productSuggestedCreditor) && C41536l.m120484d(this.productType, refinanceInfoApiModel.productType) && C41536l.m120484d(this.productNo, refinanceInfoApiModel.productNo);
    }

    public final String getDesireProductCreditor() {
        return this.desireProductCreditor;
    }

    public final String getDesireRefFlag() {
        return this.desireRefFlag;
    }

    public final Double getProductAmount() {
        return this.productAmount;
    }

    public final String getProductCcy() {
        return this.productCcy;
    }

    public final String getProductClass() {
        return this.productClass;
    }

    public final String getProductCode() {
        return this.productCode;
    }

    public final String getProductCreditor() {
        return this.productCreditor;
    }

    public final String getProductCreditorName() {
        return this.productCreditorName;
    }

    public final String getProductDictionaryKey() {
        return this.productDictionaryKey;
    }

    public final String getProductInitAmt() {
        return this.productInitAmt;
    }

    public final String getProductKey() {
        return this.productKey;
    }

    public final String getProductName() {
        return this.productName;
    }

    public final String getProductNo() {
        return this.productNo;
    }

    public final String getProductPmt() {
        return this.productPmt;
    }

    public final String getProductRefFlag() {
        return this.productRefFlag;
    }

    public final String getProductSource() {
        return this.productSource;
    }

    public final String getProductSuggestedCreditor() {
        return this.productSuggestedCreditor;
    }

    public final String getProductType() {
        return this.productType;
    }

    public int hashCode() {
        String str = this.productSource;
        int i = 0;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.desireProductCreditor;
        int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.productClass;
        int hashCode3 = (hashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.productCreditorName;
        int hashCode4 = (hashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.productKey;
        int hashCode5 = (hashCode4 + (str5 == null ? 0 : str5.hashCode())) * 31;
        String str6 = this.productDictionaryKey;
        int hashCode6 = (hashCode5 + (str6 == null ? 0 : str6.hashCode())) * 31;
        String str7 = this.productCreditor;
        int hashCode7 = (hashCode6 + (str7 == null ? 0 : str7.hashCode())) * 31;
        String str8 = this.productName;
        int hashCode8 = (hashCode7 + (str8 == null ? 0 : str8.hashCode())) * 31;
        String str9 = this.isCreditorIdentified;
        int hashCode9 = (hashCode8 + (str9 == null ? 0 : str9.hashCode())) * 31;
        String str10 = this.productInitAmt;
        int hashCode10 = (hashCode9 + (str10 == null ? 0 : str10.hashCode())) * 31;
        Double d = this.productAmount;
        int hashCode11 = (((hashCode10 + (d == null ? 0 : d.hashCode())) * 31) + this.desireRefFlag.hashCode()) * 31;
        String str11 = this.productCode;
        int hashCode12 = (hashCode11 + (str11 == null ? 0 : str11.hashCode())) * 31;
        String str12 = this.productPmt;
        int hashCode13 = (hashCode12 + (str12 == null ? 0 : str12.hashCode())) * 31;
        String str13 = this.productRefFlag;
        int hashCode14 = (hashCode13 + (str13 == null ? 0 : str13.hashCode())) * 31;
        String str14 = this.productCcy;
        int hashCode15 = (hashCode14 + (str14 == null ? 0 : str14.hashCode())) * 31;
        String str15 = this.productSuggestedCreditor;
        int hashCode16 = (hashCode15 + (str15 == null ? 0 : str15.hashCode())) * 31;
        String str16 = this.productType;
        int hashCode17 = (hashCode16 + (str16 == null ? 0 : str16.hashCode())) * 31;
        String str17 = this.productNo;
        if (str17 != null) {
            i = str17.hashCode();
        }
        return hashCode17 + i;
    }

    public final String isCreditorIdentified() {
        return this.isCreditorIdentified;
    }

    public String toString() {
        String str = this.productSource;
        String str2 = this.desireProductCreditor;
        String str3 = this.productClass;
        String str4 = this.productCreditorName;
        String str5 = this.productKey;
        String str6 = this.productDictionaryKey;
        String str7 = this.productCreditor;
        String str8 = this.productName;
        String str9 = this.isCreditorIdentified;
        String str10 = this.productInitAmt;
        Double d = this.productAmount;
        String str11 = this.desireRefFlag;
        String str12 = this.productCode;
        String str13 = this.productPmt;
        String str14 = this.productRefFlag;
        String str15 = this.productCcy;
        String str16 = this.productSuggestedCreditor;
        String str17 = this.productType;
        String str18 = this.productNo;
        return "RefinanceInfoApiModel(productSource=" + str + ", desireProductCreditor=" + str2 + ", productClass=" + str3 + ", productCreditorName=" + str4 + ", productKey=" + str5 + ", productDictionaryKey=" + str6 + ", productCreditor=" + str7 + ", productName=" + str8 + ", isCreditorIdentified=" + str9 + ", productInitAmt=" + str10 + ", productAmount=" + d + ", desireRefFlag=" + str11 + ", productCode=" + str12 + ", productPmt=" + str13 + ", productRefFlag=" + str14 + ", productCcy=" + str15 + ", productSuggestedCreditor=" + str16 + ", productType=" + str17 + ", productNo=" + str18 + ")";
    }
}
