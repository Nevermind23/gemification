package p341ge.bog.mobilebank.products.data.model;

import androidx.annotation.Keep;
import com.salesforce.marketingcloud.C11398b;
import java.math.BigDecimal;
import java.util.List;
import kotlin.jvm.internal.C41536l;
import p277ua.C8664c;

@Keep
/* renamed from: ge.bog.mobilebank.products.data.model.CreditCardSummeryApiModel */
public final class CreditCardSummeryApiModel {
    @C8664c("acctKey")
    private final Long acctKey;
    @C8664c("acctName")
    private final String acctName;
    @C8664c("amount")
    private final BigDecimal amount;
    @C8664c("availableAmount")
    private final BigDecimal availableAmount;
    @C8664c("cardSubProduct")
    private final String cardSubProduct;
    @C8664c("cardSubProductGroupList")
    private final List<String> cardSubProductGroupList;
    @C8664c("cardSubProductGroups")
    private final List<String> cardSubProductGroups;
    @C8664c("cardTypeList")
    private final List<String> cardTypeList;
    @C8664c("cardTypes")
    private final String cardTypes;
    @C8664c("ccy")
    private final String ccy;
    @C8664c("nameDictionaryKey")
    private final String nameDictionaryKey;
    @C8664c("orderNo")
    private final int orderNo;
    @C8664c("printAcctNo")
    private final String printAcctNo;
    @C8664c("productCode")
    private final String productCode;
    @C8664c("productDictionaryKey")
    private final String productDictionaryKey;

    public CreditCardSummeryApiModel(Long l, String str, String str2, BigDecimal bigDecimal, BigDecimal bigDecimal2, String str3, int i, String str4, String str5, String str6, String str7, List<String> list, String str8, List<String> list2, List<String> list3) {
        this.acctKey = l;
        this.acctName = str;
        this.printAcctNo = str2;
        this.availableAmount = bigDecimal;
        this.amount = bigDecimal2;
        this.ccy = str3;
        this.orderNo = i;
        this.productCode = str4;
        this.productDictionaryKey = str5;
        this.cardTypes = str6;
        this.cardSubProduct = str7;
        this.cardSubProductGroups = list;
        this.nameDictionaryKey = str8;
        this.cardTypeList = list2;
        this.cardSubProductGroupList = list3;
    }

    public static /* synthetic */ CreditCardSummeryApiModel copy$default(CreditCardSummeryApiModel creditCardSummeryApiModel, Long l, String str, String str2, BigDecimal bigDecimal, BigDecimal bigDecimal2, String str3, int i, String str4, String str5, String str6, String str7, List list, String str8, List list2, List list3, int i2, Object obj) {
        CreditCardSummeryApiModel creditCardSummeryApiModel2 = creditCardSummeryApiModel;
        int i3 = i2;
        return creditCardSummeryApiModel.copy((i3 & 1) != 0 ? creditCardSummeryApiModel2.acctKey : l, (i3 & 2) != 0 ? creditCardSummeryApiModel2.acctName : str, (i3 & 4) != 0 ? creditCardSummeryApiModel2.printAcctNo : str2, (i3 & 8) != 0 ? creditCardSummeryApiModel2.availableAmount : bigDecimal, (i3 & 16) != 0 ? creditCardSummeryApiModel2.amount : bigDecimal2, (i3 & 32) != 0 ? creditCardSummeryApiModel2.ccy : str3, (i3 & 64) != 0 ? creditCardSummeryApiModel2.orderNo : i, (i3 & 128) != 0 ? creditCardSummeryApiModel2.productCode : str4, (i3 & C11398b.f33139r) != 0 ? creditCardSummeryApiModel2.productDictionaryKey : str5, (i3 & C11398b.f33140s) != 0 ? creditCardSummeryApiModel2.cardTypes : str6, (i3 & C11398b.f33141t) != 0 ? creditCardSummeryApiModel2.cardSubProduct : str7, (i3 & C11398b.f33142u) != 0 ? creditCardSummeryApiModel2.cardSubProductGroups : list, (i3 & C11398b.f33143v) != 0 ? creditCardSummeryApiModel2.nameDictionaryKey : str8, (i3 & 8192) != 0 ? creditCardSummeryApiModel2.cardTypeList : list2, (i3 & 16384) != 0 ? creditCardSummeryApiModel2.cardSubProductGroupList : list3);
    }

    public final Long component1() {
        return this.acctKey;
    }

    public final String component10() {
        return this.cardTypes;
    }

    public final String component11() {
        return this.cardSubProduct;
    }

    public final List<String> component12() {
        return this.cardSubProductGroups;
    }

    public final String component13() {
        return this.nameDictionaryKey;
    }

    public final List<String> component14() {
        return this.cardTypeList;
    }

    public final List<String> component15() {
        return this.cardSubProductGroupList;
    }

    public final String component2() {
        return this.acctName;
    }

    public final String component3() {
        return this.printAcctNo;
    }

    public final BigDecimal component4() {
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

    public final CreditCardSummeryApiModel copy(Long l, String str, String str2, BigDecimal bigDecimal, BigDecimal bigDecimal2, String str3, int i, String str4, String str5, String str6, String str7, List<String> list, String str8, List<String> list2, List<String> list3) {
        return new CreditCardSummeryApiModel(l, str, str2, bigDecimal, bigDecimal2, str3, i, str4, str5, str6, str7, list, str8, list2, list3);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CreditCardSummeryApiModel)) {
            return false;
        }
        CreditCardSummeryApiModel creditCardSummeryApiModel = (CreditCardSummeryApiModel) obj;
        return C41536l.m120484d(this.acctKey, creditCardSummeryApiModel.acctKey) && C41536l.m120484d(this.acctName, creditCardSummeryApiModel.acctName) && C41536l.m120484d(this.printAcctNo, creditCardSummeryApiModel.printAcctNo) && C41536l.m120484d(this.availableAmount, creditCardSummeryApiModel.availableAmount) && C41536l.m120484d(this.amount, creditCardSummeryApiModel.amount) && C41536l.m120484d(this.ccy, creditCardSummeryApiModel.ccy) && this.orderNo == creditCardSummeryApiModel.orderNo && C41536l.m120484d(this.productCode, creditCardSummeryApiModel.productCode) && C41536l.m120484d(this.productDictionaryKey, creditCardSummeryApiModel.productDictionaryKey) && C41536l.m120484d(this.cardTypes, creditCardSummeryApiModel.cardTypes) && C41536l.m120484d(this.cardSubProduct, creditCardSummeryApiModel.cardSubProduct) && C41536l.m120484d(this.cardSubProductGroups, creditCardSummeryApiModel.cardSubProductGroups) && C41536l.m120484d(this.nameDictionaryKey, creditCardSummeryApiModel.nameDictionaryKey) && C41536l.m120484d(this.cardTypeList, creditCardSummeryApiModel.cardTypeList) && C41536l.m120484d(this.cardSubProductGroupList, creditCardSummeryApiModel.cardSubProductGroupList);
    }

    public final Long getAcctKey() {
        return this.acctKey;
    }

    public final String getAcctName() {
        return this.acctName;
    }

    public final BigDecimal getAmount() {
        return this.amount;
    }

    public final BigDecimal getAvailableAmount() {
        return this.availableAmount;
    }

    public final String getCardSubProduct() {
        return this.cardSubProduct;
    }

    public final List<String> getCardSubProductGroupList() {
        return this.cardSubProductGroupList;
    }

    public final List<String> getCardSubProductGroups() {
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

    public final String getNameDictionaryKey() {
        return this.nameDictionaryKey;
    }

    public final int getOrderNo() {
        return this.orderNo;
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

    public int hashCode() {
        Long l = this.acctKey;
        int i = 0;
        int hashCode = (l == null ? 0 : l.hashCode()) * 31;
        String str = this.acctName;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.printAcctNo;
        int hashCode3 = (hashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        BigDecimal bigDecimal = this.availableAmount;
        int hashCode4 = (hashCode3 + (bigDecimal == null ? 0 : bigDecimal.hashCode())) * 31;
        BigDecimal bigDecimal2 = this.amount;
        int hashCode5 = (hashCode4 + (bigDecimal2 == null ? 0 : bigDecimal2.hashCode())) * 31;
        String str3 = this.ccy;
        int hashCode6 = (((hashCode5 + (str3 == null ? 0 : str3.hashCode())) * 31) + this.orderNo) * 31;
        String str4 = this.productCode;
        int hashCode7 = (hashCode6 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.productDictionaryKey;
        int hashCode8 = (hashCode7 + (str5 == null ? 0 : str5.hashCode())) * 31;
        String str6 = this.cardTypes;
        int hashCode9 = (hashCode8 + (str6 == null ? 0 : str6.hashCode())) * 31;
        String str7 = this.cardSubProduct;
        int hashCode10 = (hashCode9 + (str7 == null ? 0 : str7.hashCode())) * 31;
        List<String> list = this.cardSubProductGroups;
        int hashCode11 = (hashCode10 + (list == null ? 0 : list.hashCode())) * 31;
        String str8 = this.nameDictionaryKey;
        int hashCode12 = (hashCode11 + (str8 == null ? 0 : str8.hashCode())) * 31;
        List<String> list2 = this.cardTypeList;
        int hashCode13 = (hashCode12 + (list2 == null ? 0 : list2.hashCode())) * 31;
        List<String> list3 = this.cardSubProductGroupList;
        if (list3 != null) {
            i = list3.hashCode();
        }
        return hashCode13 + i;
    }

    public String toString() {
        Long l = this.acctKey;
        String str = this.acctName;
        String str2 = this.printAcctNo;
        BigDecimal bigDecimal = this.availableAmount;
        BigDecimal bigDecimal2 = this.amount;
        String str3 = this.ccy;
        int i = this.orderNo;
        String str4 = this.productCode;
        String str5 = this.productDictionaryKey;
        String str6 = this.cardTypes;
        String str7 = this.cardSubProduct;
        List<String> list = this.cardSubProductGroups;
        String str8 = this.nameDictionaryKey;
        List<String> list2 = this.cardTypeList;
        List<String> list3 = this.cardSubProductGroupList;
        return "CreditCardSummeryApiModel(acctKey=" + l + ", acctName=" + str + ", printAcctNo=" + str2 + ", availableAmount=" + bigDecimal + ", amount=" + bigDecimal2 + ", ccy=" + str3 + ", orderNo=" + i + ", productCode=" + str4 + ", productDictionaryKey=" + str5 + ", cardTypes=" + str6 + ", cardSubProduct=" + str7 + ", cardSubProductGroups=" + list + ", nameDictionaryKey=" + str8 + ", cardTypeList=" + list2 + ", cardSubProductGroupList=" + list3 + ")";
    }
}
