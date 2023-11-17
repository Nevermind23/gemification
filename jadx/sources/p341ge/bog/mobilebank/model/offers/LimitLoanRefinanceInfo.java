package p341ge.bog.mobilebank.model.offers;

import androidx.annotation.Keep;
import com.salesforce.marketingcloud.C11398b;
import hd0.C24978b;
import kotlin.jvm.internal.C41536l;
import kotlin.jvm.internal.DefaultConstructorMarker;
import p277ua.C8664c;

@Keep
/* renamed from: ge.bog.mobilebank.model.offers.LimitLoanRefinanceInfo */
public final class LimitLoanRefinanceInfo {
    private String desireRefFlag;
    @C8664c("isCreditorIdentified")
    private C24978b isCreditorIdentified;
    private boolean isSelected;
    private double productAmount;
    private String productCcy;
    private String productClass;
    private String productCode;
    private String productCreditor;
    private String productCreditorName;
    private String productDictionaryKey;
    private String productInitAmt;
    private String productKey;
    private String productName;
    private String productNo;
    private String productPmt;
    private String productRefFlag;
    private String productSource;
    private String productType;

    public LimitLoanRefinanceInfo(String str, String str2, String str3, String str4, String str5, String str6, double d, String str7, String str8, String str9, String str10, String str11, String str12, String str13, String str14, String str15, boolean z, C24978b bVar) {
        String str16 = str;
        String str17 = str2;
        String str18 = str3;
        String str19 = str5;
        String str20 = str6;
        String str21 = str7;
        String str22 = str8;
        String str23 = str9;
        String str24 = str10;
        String str25 = str11;
        String str26 = str12;
        String str27 = str13;
        String str28 = str14;
        String str29 = str15;
        C24978b bVar2 = bVar;
        C41536l.m120489i(str16, "productSource");
        C41536l.m120489i(str17, "productClass");
        C41536l.m120489i(str18, "productKey");
        C41536l.m120489i(str19, "productName");
        C41536l.m120489i(str20, "productInitAmt");
        C41536l.m120489i(str21, "desireRefFlag");
        C41536l.m120489i(str22, "productCode");
        C41536l.m120489i(str23, "productPmt");
        C41536l.m120489i(str24, "productRefFlag");
        C41536l.m120489i(str25, "productCcy");
        C41536l.m120489i(str26, "productType");
        C41536l.m120489i(str27, "productNo");
        C41536l.m120489i(str28, "productCreditor");
        C41536l.m120489i(str29, "productCreditorName");
        C41536l.m120489i(bVar2, "isCreditorIdentified");
        this.productSource = str16;
        this.productClass = str17;
        this.productKey = str18;
        this.productDictionaryKey = str4;
        this.productName = str19;
        this.productInitAmt = str20;
        this.productAmount = d;
        this.desireRefFlag = str21;
        this.productCode = str22;
        this.productPmt = str23;
        this.productRefFlag = str24;
        this.productCcy = str25;
        this.productType = str26;
        this.productNo = str27;
        this.productCreditor = str28;
        this.productCreditorName = str29;
        this.isSelected = z;
        this.isCreditorIdentified = bVar2;
    }

    public static /* synthetic */ LimitLoanRefinanceInfo copy$default(LimitLoanRefinanceInfo limitLoanRefinanceInfo, String str, String str2, String str3, String str4, String str5, String str6, double d, String str7, String str8, String str9, String str10, String str11, String str12, String str13, String str14, String str15, boolean z, C24978b bVar, int i, Object obj) {
        LimitLoanRefinanceInfo limitLoanRefinanceInfo2 = limitLoanRefinanceInfo;
        int i2 = i;
        return limitLoanRefinanceInfo.copy((i2 & 1) != 0 ? limitLoanRefinanceInfo2.productSource : str, (i2 & 2) != 0 ? limitLoanRefinanceInfo2.productClass : str2, (i2 & 4) != 0 ? limitLoanRefinanceInfo2.productKey : str3, (i2 & 8) != 0 ? limitLoanRefinanceInfo2.productDictionaryKey : str4, (i2 & 16) != 0 ? limitLoanRefinanceInfo2.productName : str5, (i2 & 32) != 0 ? limitLoanRefinanceInfo2.productInitAmt : str6, (i2 & 64) != 0 ? limitLoanRefinanceInfo2.productAmount : d, (i2 & 128) != 0 ? limitLoanRefinanceInfo2.desireRefFlag : str7, (i2 & C11398b.f33139r) != 0 ? limitLoanRefinanceInfo2.productCode : str8, (i2 & C11398b.f33140s) != 0 ? limitLoanRefinanceInfo2.productPmt : str9, (i2 & C11398b.f33141t) != 0 ? limitLoanRefinanceInfo2.productRefFlag : str10, (i2 & C11398b.f33142u) != 0 ? limitLoanRefinanceInfo2.productCcy : str11, (i2 & C11398b.f33143v) != 0 ? limitLoanRefinanceInfo2.productType : str12, (i2 & 8192) != 0 ? limitLoanRefinanceInfo2.productNo : str13, (i2 & 16384) != 0 ? limitLoanRefinanceInfo2.productCreditor : str14, (i2 & 32768) != 0 ? limitLoanRefinanceInfo2.productCreditorName : str15, (i2 & 65536) != 0 ? limitLoanRefinanceInfo2.isSelected : z, (i2 & 131072) != 0 ? limitLoanRefinanceInfo2.isCreditorIdentified : bVar);
    }

    public final String component1() {
        return this.productSource;
    }

    public final String component10() {
        return this.productPmt;
    }

    public final String component11() {
        return this.productRefFlag;
    }

    public final String component12() {
        return this.productCcy;
    }

    public final String component13() {
        return this.productType;
    }

    public final String component14() {
        return this.productNo;
    }

    public final String component15() {
        return this.productCreditor;
    }

    public final String component16() {
        return this.productCreditorName;
    }

    public final boolean component17() {
        return this.isSelected;
    }

    public final C24978b component18() {
        return this.isCreditorIdentified;
    }

    public final String component2() {
        return this.productClass;
    }

    public final String component3() {
        return this.productKey;
    }

    public final String component4() {
        return this.productDictionaryKey;
    }

    public final String component5() {
        return this.productName;
    }

    public final String component6() {
        return this.productInitAmt;
    }

    public final double component7() {
        return this.productAmount;
    }

    public final String component8() {
        return this.desireRefFlag;
    }

    public final String component9() {
        return this.productCode;
    }

    public final LimitLoanRefinanceInfo copy(String str, String str2, String str3, String str4, String str5, String str6, double d, String str7, String str8, String str9, String str10, String str11, String str12, String str13, String str14, String str15, boolean z, C24978b bVar) {
        String str16 = str;
        C41536l.m120489i(str16, "productSource");
        C41536l.m120489i(str2, "productClass");
        C41536l.m120489i(str3, "productKey");
        C41536l.m120489i(str5, "productName");
        C41536l.m120489i(str6, "productInitAmt");
        C41536l.m120489i(str7, "desireRefFlag");
        C41536l.m120489i(str8, "productCode");
        C41536l.m120489i(str9, "productPmt");
        C41536l.m120489i(str10, "productRefFlag");
        C41536l.m120489i(str11, "productCcy");
        C41536l.m120489i(str12, "productType");
        C41536l.m120489i(str13, "productNo");
        C41536l.m120489i(str14, "productCreditor");
        C41536l.m120489i(str15, "productCreditorName");
        C41536l.m120489i(bVar, "isCreditorIdentified");
        return new LimitLoanRefinanceInfo(str16, str2, str3, str4, str5, str6, d, str7, str8, str9, str10, str11, str12, str13, str14, str15, z, bVar);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof LimitLoanRefinanceInfo)) {
            return false;
        }
        LimitLoanRefinanceInfo limitLoanRefinanceInfo = (LimitLoanRefinanceInfo) obj;
        return C41536l.m120484d(this.productSource, limitLoanRefinanceInfo.productSource) && C41536l.m120484d(this.productClass, limitLoanRefinanceInfo.productClass) && C41536l.m120484d(this.productKey, limitLoanRefinanceInfo.productKey) && C41536l.m120484d(this.productDictionaryKey, limitLoanRefinanceInfo.productDictionaryKey) && C41536l.m120484d(this.productName, limitLoanRefinanceInfo.productName) && C41536l.m120484d(this.productInitAmt, limitLoanRefinanceInfo.productInitAmt) && Double.compare(this.productAmount, limitLoanRefinanceInfo.productAmount) == 0 && C41536l.m120484d(this.desireRefFlag, limitLoanRefinanceInfo.desireRefFlag) && C41536l.m120484d(this.productCode, limitLoanRefinanceInfo.productCode) && C41536l.m120484d(this.productPmt, limitLoanRefinanceInfo.productPmt) && C41536l.m120484d(this.productRefFlag, limitLoanRefinanceInfo.productRefFlag) && C41536l.m120484d(this.productCcy, limitLoanRefinanceInfo.productCcy) && C41536l.m120484d(this.productType, limitLoanRefinanceInfo.productType) && C41536l.m120484d(this.productNo, limitLoanRefinanceInfo.productNo) && C41536l.m120484d(this.productCreditor, limitLoanRefinanceInfo.productCreditor) && C41536l.m120484d(this.productCreditorName, limitLoanRefinanceInfo.productCreditorName) && this.isSelected == limitLoanRefinanceInfo.isSelected && this.isCreditorIdentified == limitLoanRefinanceInfo.isCreditorIdentified;
    }

    public final String getDesireRefFlag() {
        return this.desireRefFlag;
    }

    public final double getProductAmount() {
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

    public final String getProductType() {
        return this.productType;
    }

    public int hashCode() {
        int hashCode = ((((this.productSource.hashCode() * 31) + this.productClass.hashCode()) * 31) + this.productKey.hashCode()) * 31;
        String str = this.productDictionaryKey;
        int hashCode2 = (((((((((((((((((((((((((hashCode + (str == null ? 0 : str.hashCode())) * 31) + this.productName.hashCode()) * 31) + this.productInitAmt.hashCode()) * 31) + Double.doubleToLongBits(this.productAmount)) * 31) + this.desireRefFlag.hashCode()) * 31) + this.productCode.hashCode()) * 31) + this.productPmt.hashCode()) * 31) + this.productRefFlag.hashCode()) * 31) + this.productCcy.hashCode()) * 31) + this.productType.hashCode()) * 31) + this.productNo.hashCode()) * 31) + this.productCreditor.hashCode()) * 31) + this.productCreditorName.hashCode()) * 31;
        boolean z = this.isSelected;
        if (z) {
            z = true;
        }
        return ((hashCode2 + (z ? 1 : 0)) * 31) + this.isCreditorIdentified.hashCode();
    }

    public final C24978b isCreditorIdentified() {
        return this.isCreditorIdentified;
    }

    public final boolean isSelected() {
        return this.isSelected;
    }

    public final void setCreditorIdentified(C24978b bVar) {
        C41536l.m120489i(bVar, "<set-?>");
        this.isCreditorIdentified = bVar;
    }

    public final void setDesireRefFlag(String str) {
        C41536l.m120489i(str, "<set-?>");
        this.desireRefFlag = str;
    }

    public final void setProductAmount(double d) {
        this.productAmount = d;
    }

    public final void setProductCcy(String str) {
        C41536l.m120489i(str, "<set-?>");
        this.productCcy = str;
    }

    public final void setProductClass(String str) {
        C41536l.m120489i(str, "<set-?>");
        this.productClass = str;
    }

    public final void setProductCode(String str) {
        C41536l.m120489i(str, "<set-?>");
        this.productCode = str;
    }

    public final void setProductCreditor(String str) {
        C41536l.m120489i(str, "<set-?>");
        this.productCreditor = str;
    }

    public final void setProductCreditorName(String str) {
        C41536l.m120489i(str, "<set-?>");
        this.productCreditorName = str;
    }

    public final void setProductDictionaryKey(String str) {
        this.productDictionaryKey = str;
    }

    public final void setProductInitAmt(String str) {
        C41536l.m120489i(str, "<set-?>");
        this.productInitAmt = str;
    }

    public final void setProductKey(String str) {
        C41536l.m120489i(str, "<set-?>");
        this.productKey = str;
    }

    public final void setProductName(String str) {
        C41536l.m120489i(str, "<set-?>");
        this.productName = str;
    }

    public final void setProductNo(String str) {
        C41536l.m120489i(str, "<set-?>");
        this.productNo = str;
    }

    public final void setProductPmt(String str) {
        C41536l.m120489i(str, "<set-?>");
        this.productPmt = str;
    }

    public final void setProductRefFlag(String str) {
        C41536l.m120489i(str, "<set-?>");
        this.productRefFlag = str;
    }

    public final void setProductSource(String str) {
        C41536l.m120489i(str, "<set-?>");
        this.productSource = str;
    }

    public final void setProductType(String str) {
        C41536l.m120489i(str, "<set-?>");
        this.productType = str;
    }

    public final void setSelected(boolean z) {
        this.isSelected = z;
    }

    public String toString() {
        String str = this.productSource;
        String str2 = this.productClass;
        String str3 = this.productKey;
        String str4 = this.productDictionaryKey;
        String str5 = this.productName;
        String str6 = this.productInitAmt;
        double d = this.productAmount;
        String str7 = this.desireRefFlag;
        String str8 = this.productCode;
        String str9 = this.productPmt;
        String str10 = this.productRefFlag;
        String str11 = this.productCcy;
        String str12 = this.productType;
        String str13 = this.productNo;
        return "{\"productSource\": \"" + str + "\",\"productClass\": \"" + str2 + "\",\"productKey\": \"" + str3 + "\",\"productDictionaryKey\": \"" + str4 + "\",\"productName\": \"" + str5 + "\",\"productInitAmt\": \"" + str6 + "\",\"productAmount\": \"" + d + "\",\"desireRefFlag\": \"" + str7 + "\",\"productCode\": \"" + str8 + "\",\"productPmt\": \"" + str9 + "\",\"productRefFlag\": \"" + str10 + "\",\"productCcy\": \"" + str11 + "\",\"productType\": \"" + str12 + "\",\"productNo\": \"" + str13 + "\"}";
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ LimitLoanRefinanceInfo(String str, String str2, String str3, String str4, String str5, String str6, double d, String str7, String str8, String str9, String str10, String str11, String str12, String str13, String str14, String str15, boolean z, C24978b bVar, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, str2, str3, str4, str5, str6, d, str7, str8, str9, str10, str11, str12, str13, str14, str15, (i & 65536) != 0 ? false : z, bVar);
    }
}
