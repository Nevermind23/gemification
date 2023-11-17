package p341ge.bog.mobilebank.products.data.model;

import androidx.annotation.Keep;
import com.salesforce.marketingcloud.C11398b;
import java.math.BigDecimal;
import java.util.List;
import kotlin.jvm.internal.C41536l;
import p190o1.C7397t;

@Keep
/* renamed from: ge.bog.mobilebank.products.data.model.CreditCardAccountApiModel */
public final class CreditCardAccountApiModel {
    private final long acctKey;
    private final String acctName;
    private final BigDecimal amount;
    private final BigDecimal atmPercent;
    private final String attachmentUrl;
    private final double availableAmount;
    private final BillInfoApiModel billInfo;
    private final long cardId;
    private final String cardPdfUrl;
    private final String cardSubProduct;
    private final List<String> cardSubProductGroupList;
    private final String cardSubProductGroups;
    private final List<String> cardTypeList;
    private final String cardTypes;
    private final String ccy;
    private final String fileId;
    private final String fileUrl;
    private final boolean hasCashback;
    private final boolean hasInstallment;
    private final boolean isHasMR;
    private final List<CreditMrInsuranceApiModel> mrInsurance;
    private final String nameDictionaryKey;
    private final int orderNo;
    private final BigDecimal overdraftLimit;
    private final BigDecimal posPercent;
    private final String printAcctNo;
    private final String productCode;
    private final String productDictionaryKey;
    private final List<String> productFunctions;
    private final long productId;
    private final List<String> widgetList;

    public CreditCardAccountApiModel(long j, String str, String str2, double d, BigDecimal bigDecimal, String str3, int i, String str4, String str5, String str6, String str7, String str8, List<String> list, long j2, String str9, List<String> list2, List<String> list3, boolean z, boolean z2, boolean z3, BillInfoApiModel billInfoApiModel, BigDecimal bigDecimal2, BigDecimal bigDecimal3, String str10, List<String> list4, long j3, List<CreditMrInsuranceApiModel> list5, BigDecimal bigDecimal4, String str11, String str12, String str13) {
        String str14 = str9;
        C41536l.m120489i(str2, "printAcctNo");
        C41536l.m120489i(str3, "ccy");
        C41536l.m120489i(str14, "nameDictionaryKey");
        this.acctKey = j;
        this.acctName = str;
        this.printAcctNo = str2;
        this.availableAmount = d;
        this.amount = bigDecimal;
        this.ccy = str3;
        this.orderNo = i;
        this.productCode = str4;
        this.productDictionaryKey = str5;
        this.cardTypes = str6;
        this.cardSubProduct = str7;
        this.cardSubProductGroups = str8;
        this.widgetList = list;
        this.cardId = j2;
        this.nameDictionaryKey = str14;
        this.cardTypeList = list2;
        this.cardSubProductGroupList = list3;
        this.isHasMR = z;
        this.hasCashback = z2;
        this.hasInstallment = z3;
        this.billInfo = billInfoApiModel;
        this.atmPercent = bigDecimal2;
        this.posPercent = bigDecimal3;
        this.attachmentUrl = str10;
        this.productFunctions = list4;
        this.productId = j3;
        this.mrInsurance = list5;
        this.overdraftLimit = bigDecimal4;
        this.cardPdfUrl = str11;
        this.fileUrl = str12;
        this.fileId = str13;
    }

    public static /* synthetic */ CreditCardAccountApiModel copy$default(CreditCardAccountApiModel creditCardAccountApiModel, long j, String str, String str2, double d, BigDecimal bigDecimal, String str3, int i, String str4, String str5, String str6, String str7, String str8, List list, long j2, String str9, List list2, List list3, boolean z, boolean z2, boolean z3, BillInfoApiModel billInfoApiModel, BigDecimal bigDecimal2, BigDecimal bigDecimal3, String str10, List list4, long j3, List list5, BigDecimal bigDecimal4, String str11, String str12, String str13, int i2, Object obj) {
        CreditCardAccountApiModel creditCardAccountApiModel2 = creditCardAccountApiModel;
        int i3 = i2;
        long j4 = (i3 & 1) != 0 ? creditCardAccountApiModel2.acctKey : j;
        String str14 = (i3 & 2) != 0 ? creditCardAccountApiModel2.acctName : str;
        String str15 = (i3 & 4) != 0 ? creditCardAccountApiModel2.printAcctNo : str2;
        double d2 = (i3 & 8) != 0 ? creditCardAccountApiModel2.availableAmount : d;
        BigDecimal bigDecimal5 = (i3 & 16) != 0 ? creditCardAccountApiModel2.amount : bigDecimal;
        String str16 = (i3 & 32) != 0 ? creditCardAccountApiModel2.ccy : str3;
        int i4 = (i3 & 64) != 0 ? creditCardAccountApiModel2.orderNo : i;
        String str17 = (i3 & 128) != 0 ? creditCardAccountApiModel2.productCode : str4;
        String str18 = (i3 & C11398b.f33139r) != 0 ? creditCardAccountApiModel2.productDictionaryKey : str5;
        String str19 = (i3 & C11398b.f33140s) != 0 ? creditCardAccountApiModel2.cardTypes : str6;
        String str20 = (i3 & C11398b.f33141t) != 0 ? creditCardAccountApiModel2.cardSubProduct : str7;
        return creditCardAccountApiModel.copy(j4, str14, str15, d2, bigDecimal5, str16, i4, str17, str18, str19, str20, (i3 & C11398b.f33142u) != 0 ? creditCardAccountApiModel2.cardSubProductGroups : str8, (i3 & C11398b.f33143v) != 0 ? creditCardAccountApiModel2.widgetList : list, (i3 & 8192) != 0 ? creditCardAccountApiModel2.cardId : j2, (i3 & 16384) != 0 ? creditCardAccountApiModel2.nameDictionaryKey : str9, (32768 & i3) != 0 ? creditCardAccountApiModel2.cardTypeList : list2, (i3 & 65536) != 0 ? creditCardAccountApiModel2.cardSubProductGroupList : list3, (i3 & 131072) != 0 ? creditCardAccountApiModel2.isHasMR : z, (i3 & 262144) != 0 ? creditCardAccountApiModel2.hasCashback : z2, (i3 & 524288) != 0 ? creditCardAccountApiModel2.hasInstallment : z3, (i3 & 1048576) != 0 ? creditCardAccountApiModel2.billInfo : billInfoApiModel, (i3 & 2097152) != 0 ? creditCardAccountApiModel2.atmPercent : bigDecimal2, (i3 & 4194304) != 0 ? creditCardAccountApiModel2.posPercent : bigDecimal3, (i3 & 8388608) != 0 ? creditCardAccountApiModel2.attachmentUrl : str10, (i3 & 16777216) != 0 ? creditCardAccountApiModel2.productFunctions : list4, (i3 & 33554432) != 0 ? creditCardAccountApiModel2.productId : j3, (i3 & 67108864) != 0 ? creditCardAccountApiModel2.mrInsurance : list5, (134217728 & i3) != 0 ? creditCardAccountApiModel2.overdraftLimit : bigDecimal4, (i3 & 268435456) != 0 ? creditCardAccountApiModel2.cardPdfUrl : str11, (i3 & 536870912) != 0 ? creditCardAccountApiModel2.fileUrl : str12, (i3 & 1073741824) != 0 ? creditCardAccountApiModel2.fileId : str13);
    }

    public final long component1() {
        return this.acctKey;
    }

    public final String component10() {
        return this.cardTypes;
    }

    public final String component11() {
        return this.cardSubProduct;
    }

    public final String component12() {
        return this.cardSubProductGroups;
    }

    public final List<String> component13() {
        return this.widgetList;
    }

    public final long component14() {
        return this.cardId;
    }

    public final String component15() {
        return this.nameDictionaryKey;
    }

    public final List<String> component16() {
        return this.cardTypeList;
    }

    public final List<String> component17() {
        return this.cardSubProductGroupList;
    }

    public final boolean component18() {
        return this.isHasMR;
    }

    public final boolean component19() {
        return this.hasCashback;
    }

    public final String component2() {
        return this.acctName;
    }

    public final boolean component20() {
        return this.hasInstallment;
    }

    public final BillInfoApiModel component21() {
        return this.billInfo;
    }

    public final BigDecimal component22() {
        return this.atmPercent;
    }

    public final BigDecimal component23() {
        return this.posPercent;
    }

    public final String component24() {
        return this.attachmentUrl;
    }

    public final List<String> component25() {
        return this.productFunctions;
    }

    public final long component26() {
        return this.productId;
    }

    public final List<CreditMrInsuranceApiModel> component27() {
        return this.mrInsurance;
    }

    public final BigDecimal component28() {
        return this.overdraftLimit;
    }

    public final String component29() {
        return this.cardPdfUrl;
    }

    public final String component3() {
        return this.printAcctNo;
    }

    public final String component30() {
        return this.fileUrl;
    }

    public final String component31() {
        return this.fileId;
    }

    public final double component4() {
        return this.availableAmount;
    }

    public final BigDecimal component5() {
        return this.amount;
    }

    public final String component6() {
        return this.ccy;
    }

    public final int component7() {
        return this.orderNo;
    }

    public final String component8() {
        return this.productCode;
    }

    public final String component9() {
        return this.productDictionaryKey;
    }

    public final CreditCardAccountApiModel copy(long j, String str, String str2, double d, BigDecimal bigDecimal, String str3, int i, String str4, String str5, String str6, String str7, String str8, List<String> list, long j2, String str9, List<String> list2, List<String> list3, boolean z, boolean z2, boolean z3, BillInfoApiModel billInfoApiModel, BigDecimal bigDecimal2, BigDecimal bigDecimal3, String str10, List<String> list4, long j3, List<CreditMrInsuranceApiModel> list5, BigDecimal bigDecimal4, String str11, String str12, String str13) {
        long j4 = j;
        C41536l.m120489i(str2, "printAcctNo");
        C41536l.m120489i(str3, "ccy");
        C41536l.m120489i(str9, "nameDictionaryKey");
        return new CreditCardAccountApiModel(j, str, str2, d, bigDecimal, str3, i, str4, str5, str6, str7, str8, list, j2, str9, list2, list3, z, z2, z3, billInfoApiModel, bigDecimal2, bigDecimal3, str10, list4, j3, list5, bigDecimal4, str11, str12, str13);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CreditCardAccountApiModel)) {
            return false;
        }
        CreditCardAccountApiModel creditCardAccountApiModel = (CreditCardAccountApiModel) obj;
        return this.acctKey == creditCardAccountApiModel.acctKey && C41536l.m120484d(this.acctName, creditCardAccountApiModel.acctName) && C41536l.m120484d(this.printAcctNo, creditCardAccountApiModel.printAcctNo) && Double.compare(this.availableAmount, creditCardAccountApiModel.availableAmount) == 0 && C41536l.m120484d(this.amount, creditCardAccountApiModel.amount) && C41536l.m120484d(this.ccy, creditCardAccountApiModel.ccy) && this.orderNo == creditCardAccountApiModel.orderNo && C41536l.m120484d(this.productCode, creditCardAccountApiModel.productCode) && C41536l.m120484d(this.productDictionaryKey, creditCardAccountApiModel.productDictionaryKey) && C41536l.m120484d(this.cardTypes, creditCardAccountApiModel.cardTypes) && C41536l.m120484d(this.cardSubProduct, creditCardAccountApiModel.cardSubProduct) && C41536l.m120484d(this.cardSubProductGroups, creditCardAccountApiModel.cardSubProductGroups) && C41536l.m120484d(this.widgetList, creditCardAccountApiModel.widgetList) && this.cardId == creditCardAccountApiModel.cardId && C41536l.m120484d(this.nameDictionaryKey, creditCardAccountApiModel.nameDictionaryKey) && C41536l.m120484d(this.cardTypeList, creditCardAccountApiModel.cardTypeList) && C41536l.m120484d(this.cardSubProductGroupList, creditCardAccountApiModel.cardSubProductGroupList) && this.isHasMR == creditCardAccountApiModel.isHasMR && this.hasCashback == creditCardAccountApiModel.hasCashback && this.hasInstallment == creditCardAccountApiModel.hasInstallment && C41536l.m120484d(this.billInfo, creditCardAccountApiModel.billInfo) && C41536l.m120484d(this.atmPercent, creditCardAccountApiModel.atmPercent) && C41536l.m120484d(this.posPercent, creditCardAccountApiModel.posPercent) && C41536l.m120484d(this.attachmentUrl, creditCardAccountApiModel.attachmentUrl) && C41536l.m120484d(this.productFunctions, creditCardAccountApiModel.productFunctions) && this.productId == creditCardAccountApiModel.productId && C41536l.m120484d(this.mrInsurance, creditCardAccountApiModel.mrInsurance) && C41536l.m120484d(this.overdraftLimit, creditCardAccountApiModel.overdraftLimit) && C41536l.m120484d(this.cardPdfUrl, creditCardAccountApiModel.cardPdfUrl) && C41536l.m120484d(this.fileUrl, creditCardAccountApiModel.fileUrl) && C41536l.m120484d(this.fileId, creditCardAccountApiModel.fileId);
    }

    public final long getAcctKey() {
        return this.acctKey;
    }

    public final String getAcctName() {
        return this.acctName;
    }

    public final BigDecimal getAmount() {
        return this.amount;
    }

    public final BigDecimal getAtmPercent() {
        return this.atmPercent;
    }

    public final String getAttachmentUrl() {
        return this.attachmentUrl;
    }

    public final double getAvailableAmount() {
        return this.availableAmount;
    }

    public final BillInfoApiModel getBillInfo() {
        return this.billInfo;
    }

    public final long getCardId() {
        return this.cardId;
    }

    public final String getCardPdfUrl() {
        return this.cardPdfUrl;
    }

    public final String getCardSubProduct() {
        return this.cardSubProduct;
    }

    public final List<String> getCardSubProductGroupList() {
        return this.cardSubProductGroupList;
    }

    public final String getCardSubProductGroups() {
        return this.cardSubProductGroups;
    }

    public final List<String> getCardTypeList() {
        return this.cardTypeList;
    }

    public final String getCardTypes() {
        return this.cardTypes;
    }

    public final String getCcy() {
        return this.ccy;
    }

    public final String getFileId() {
        return this.fileId;
    }

    public final String getFileUrl() {
        return this.fileUrl;
    }

    public final boolean getHasCashback() {
        return this.hasCashback;
    }

    public final boolean getHasInstallment() {
        return this.hasInstallment;
    }

    public final List<CreditMrInsuranceApiModel> getMrInsurance() {
        return this.mrInsurance;
    }

    public final String getNameDictionaryKey() {
        return this.nameDictionaryKey;
    }

    public final int getOrderNo() {
        return this.orderNo;
    }

    public final BigDecimal getOverdraftLimit() {
        return this.overdraftLimit;
    }

    public final BigDecimal getPosPercent() {
        return this.posPercent;
    }

    public final String getPrintAcctNo() {
        return this.printAcctNo;
    }

    public final String getProductCode() {
        return this.productCode;
    }

    public final String getProductDictionaryKey() {
        return this.productDictionaryKey;
    }

    public final List<String> getProductFunctions() {
        return this.productFunctions;
    }

    public final long getProductId() {
        return this.productId;
    }

    public final List<String> getWidgetList() {
        return this.widgetList;
    }

    public int hashCode() {
        int a = C7397t.m28148a(this.acctKey) * 31;
        String str = this.acctName;
        int i = 0;
        int hashCode = (((((a + (str == null ? 0 : str.hashCode())) * 31) + this.printAcctNo.hashCode()) * 31) + Double.doubleToLongBits(this.availableAmount)) * 31;
        BigDecimal bigDecimal = this.amount;
        int hashCode2 = (((((hashCode + (bigDecimal == null ? 0 : bigDecimal.hashCode())) * 31) + this.ccy.hashCode()) * 31) + this.orderNo) * 31;
        String str2 = this.productCode;
        int hashCode3 = (hashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.productDictionaryKey;
        int hashCode4 = (hashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.cardTypes;
        int hashCode5 = (hashCode4 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.cardSubProduct;
        int hashCode6 = (hashCode5 + (str5 == null ? 0 : str5.hashCode())) * 31;
        String str6 = this.cardSubProductGroups;
        int hashCode7 = (hashCode6 + (str6 == null ? 0 : str6.hashCode())) * 31;
        List<String> list = this.widgetList;
        int hashCode8 = (((((hashCode7 + (list == null ? 0 : list.hashCode())) * 31) + C7397t.m28148a(this.cardId)) * 31) + this.nameDictionaryKey.hashCode()) * 31;
        List<String> list2 = this.cardTypeList;
        int hashCode9 = (hashCode8 + (list2 == null ? 0 : list2.hashCode())) * 31;
        List<String> list3 = this.cardSubProductGroupList;
        int hashCode10 = (hashCode9 + (list3 == null ? 0 : list3.hashCode())) * 31;
        boolean z = this.isHasMR;
        boolean z2 = true;
        if (z) {
            z = true;
        }
        int i2 = (hashCode10 + (z ? 1 : 0)) * 31;
        boolean z3 = this.hasCashback;
        if (z3) {
            z3 = true;
        }
        int i3 = (i2 + (z3 ? 1 : 0)) * 31;
        boolean z4 = this.hasInstallment;
        if (!z4) {
            z2 = z4;
        }
        int i4 = (i3 + (z2 ? 1 : 0)) * 31;
        BillInfoApiModel billInfoApiModel = this.billInfo;
        int hashCode11 = (i4 + (billInfoApiModel == null ? 0 : billInfoApiModel.hashCode())) * 31;
        BigDecimal bigDecimal2 = this.atmPercent;
        int hashCode12 = (hashCode11 + (bigDecimal2 == null ? 0 : bigDecimal2.hashCode())) * 31;
        BigDecimal bigDecimal3 = this.posPercent;
        int hashCode13 = (hashCode12 + (bigDecimal3 == null ? 0 : bigDecimal3.hashCode())) * 31;
        String str7 = this.attachmentUrl;
        int hashCode14 = (hashCode13 + (str7 == null ? 0 : str7.hashCode())) * 31;
        List<String> list4 = this.productFunctions;
        int hashCode15 = (((hashCode14 + (list4 == null ? 0 : list4.hashCode())) * 31) + C7397t.m28148a(this.productId)) * 31;
        List<CreditMrInsuranceApiModel> list5 = this.mrInsurance;
        int hashCode16 = (hashCode15 + (list5 == null ? 0 : list5.hashCode())) * 31;
        BigDecimal bigDecimal4 = this.overdraftLimit;
        int hashCode17 = (hashCode16 + (bigDecimal4 == null ? 0 : bigDecimal4.hashCode())) * 31;
        String str8 = this.cardPdfUrl;
        int hashCode18 = (hashCode17 + (str8 == null ? 0 : str8.hashCode())) * 31;
        String str9 = this.fileUrl;
        int hashCode19 = (hashCode18 + (str9 == null ? 0 : str9.hashCode())) * 31;
        String str10 = this.fileId;
        if (str10 != null) {
            i = str10.hashCode();
        }
        return hashCode19 + i;
    }

    public final boolean isHasMR() {
        return this.isHasMR;
    }

    public String toString() {
        long j = this.acctKey;
        String str = this.acctName;
        String str2 = this.printAcctNo;
        double d = this.availableAmount;
        BigDecimal bigDecimal = this.amount;
        String str3 = this.ccy;
        int i = this.orderNo;
        String str4 = this.productCode;
        String str5 = this.productDictionaryKey;
        String str6 = this.cardTypes;
        String str7 = this.cardSubProduct;
        String str8 = this.cardSubProductGroups;
        List<String> list = this.widgetList;
        long j2 = this.cardId;
        String str9 = this.nameDictionaryKey;
        List<String> list2 = this.cardTypeList;
        List<String> list3 = this.cardSubProductGroupList;
        boolean z = this.isHasMR;
        boolean z2 = this.hasCashback;
        boolean z3 = this.hasInstallment;
        BillInfoApiModel billInfoApiModel = this.billInfo;
        BigDecimal bigDecimal2 = this.atmPercent;
        BigDecimal bigDecimal3 = this.posPercent;
        String str10 = this.attachmentUrl;
        String str11 = str9;
        List<String> list4 = this.productFunctions;
        long j3 = this.productId;
        List<CreditMrInsuranceApiModel> list5 = this.mrInsurance;
        BigDecimal bigDecimal4 = this.overdraftLimit;
        String str12 = this.cardPdfUrl;
        String str13 = this.fileUrl;
        String str14 = this.fileId;
        return "CreditCardAccountApiModel(acctKey=" + j + ", acctName=" + str + ", printAcctNo=" + str2 + ", availableAmount=" + d + ", amount=" + bigDecimal + ", ccy=" + str3 + ", orderNo=" + i + ", productCode=" + str4 + ", productDictionaryKey=" + str5 + ", cardTypes=" + str6 + ", cardSubProduct=" + str7 + ", cardSubProductGroups=" + str8 + ", widgetList=" + list + ", cardId=" + j2 + ", nameDictionaryKey=" + str11 + ", cardTypeList=" + list2 + ", cardSubProductGroupList=" + list3 + ", isHasMR=" + z + ", hasCashback=" + z2 + ", hasInstallment=" + z3 + ", billInfo=" + billInfoApiModel + ", atmPercent=" + bigDecimal2 + ", posPercent=" + bigDecimal3 + ", attachmentUrl=" + str10 + ", productFunctions=" + list4 + ", productId=" + j3 + ", mrInsurance=" + list5 + ", overdraftLimit=" + bigDecimal4 + ", cardPdfUrl=" + str12 + ", fileUrl=" + str13 + ", fileId=" + str14 + ")";
    }
}
