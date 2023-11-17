package p341ge.bog.mobilebank.giftcards.data.model;

import androidx.annotation.Keep;
import com.salesforce.marketingcloud.C11398b;
import java.math.BigDecimal;
import java.util.List;
import kotlin.jvm.internal.C41536l;

@Keep
/* renamed from: ge.bog.mobilebank.giftcards.data.model.GiftCardOfferDetailsApiModel */
public final class GiftCardOfferDetailsApiModel {
    private final BigDecimal amountMaxLimit;
    private final BigDecimal amountMinLimit;
    private final BudgetTypeApiModel budgetType;
    private final String clientInn;
    private final Long clientKey;
    private final String clientShortEN;
    private final String clientShortGE;
    private final ExpirationTypeApiModel expirationType;
    private final List<String> offerBrandListEn;
    private final List<String> offerBrandListGe;
    private final String offerCategory;
    private final OfferExpirationApiModel offerExpiration;
    private final Integer offerId;
    private final String offerLogoStorageId;
    private final String offerLogoStorageUrl;
    private final String offerNameEN;
    private final String offerNameGE;
    private final OfferBudgetApiModel offersBudget;
    private final List<String> purchaseMethods;
    private final Integer resultCode;
    private final String resultDesc;

    public GiftCardOfferDetailsApiModel(BigDecimal bigDecimal, BigDecimal bigDecimal2, BudgetTypeApiModel budgetTypeApiModel, String str, Long l, String str2, String str3, ExpirationTypeApiModel expirationTypeApiModel, List<String> list, List<String> list2, OfferBudgetApiModel offerBudgetApiModel, String str4, OfferExpirationApiModel offerExpirationApiModel, Integer num, String str5, String str6, String str7, String str8, List<String> list3, Integer num2, String str9) {
        this.amountMaxLimit = bigDecimal;
        this.amountMinLimit = bigDecimal2;
        this.budgetType = budgetTypeApiModel;
        this.clientInn = str;
        this.clientKey = l;
        this.clientShortEN = str2;
        this.clientShortGE = str3;
        this.expirationType = expirationTypeApiModel;
        this.offerBrandListEn = list;
        this.offerBrandListGe = list2;
        this.offersBudget = offerBudgetApiModel;
        this.offerCategory = str4;
        this.offerExpiration = offerExpirationApiModel;
        this.offerId = num;
        this.offerLogoStorageId = str5;
        this.offerLogoStorageUrl = str6;
        this.offerNameEN = str7;
        this.offerNameGE = str8;
        this.purchaseMethods = list3;
        this.resultCode = num2;
        this.resultDesc = str9;
    }

    public static /* synthetic */ GiftCardOfferDetailsApiModel copy$default(GiftCardOfferDetailsApiModel giftCardOfferDetailsApiModel, BigDecimal bigDecimal, BigDecimal bigDecimal2, BudgetTypeApiModel budgetTypeApiModel, String str, Long l, String str2, String str3, ExpirationTypeApiModel expirationTypeApiModel, List list, List list2, OfferBudgetApiModel offerBudgetApiModel, String str4, OfferExpirationApiModel offerExpirationApiModel, Integer num, String str5, String str6, String str7, String str8, List list3, Integer num2, String str9, int i, Object obj) {
        GiftCardOfferDetailsApiModel giftCardOfferDetailsApiModel2 = giftCardOfferDetailsApiModel;
        int i2 = i;
        return giftCardOfferDetailsApiModel.copy((i2 & 1) != 0 ? giftCardOfferDetailsApiModel2.amountMaxLimit : bigDecimal, (i2 & 2) != 0 ? giftCardOfferDetailsApiModel2.amountMinLimit : bigDecimal2, (i2 & 4) != 0 ? giftCardOfferDetailsApiModel2.budgetType : budgetTypeApiModel, (i2 & 8) != 0 ? giftCardOfferDetailsApiModel2.clientInn : str, (i2 & 16) != 0 ? giftCardOfferDetailsApiModel2.clientKey : l, (i2 & 32) != 0 ? giftCardOfferDetailsApiModel2.clientShortEN : str2, (i2 & 64) != 0 ? giftCardOfferDetailsApiModel2.clientShortGE : str3, (i2 & 128) != 0 ? giftCardOfferDetailsApiModel2.expirationType : expirationTypeApiModel, (i2 & C11398b.f33139r) != 0 ? giftCardOfferDetailsApiModel2.offerBrandListEn : list, (i2 & C11398b.f33140s) != 0 ? giftCardOfferDetailsApiModel2.offerBrandListGe : list2, (i2 & C11398b.f33141t) != 0 ? giftCardOfferDetailsApiModel2.offersBudget : offerBudgetApiModel, (i2 & C11398b.f33142u) != 0 ? giftCardOfferDetailsApiModel2.offerCategory : str4, (i2 & C11398b.f33143v) != 0 ? giftCardOfferDetailsApiModel2.offerExpiration : offerExpirationApiModel, (i2 & 8192) != 0 ? giftCardOfferDetailsApiModel2.offerId : num, (i2 & 16384) != 0 ? giftCardOfferDetailsApiModel2.offerLogoStorageId : str5, (i2 & 32768) != 0 ? giftCardOfferDetailsApiModel2.offerLogoStorageUrl : str6, (i2 & 65536) != 0 ? giftCardOfferDetailsApiModel2.offerNameEN : str7, (i2 & 131072) != 0 ? giftCardOfferDetailsApiModel2.offerNameGE : str8, (i2 & 262144) != 0 ? giftCardOfferDetailsApiModel2.purchaseMethods : list3, (i2 & 524288) != 0 ? giftCardOfferDetailsApiModel2.resultCode : num2, (i2 & 1048576) != 0 ? giftCardOfferDetailsApiModel2.resultDesc : str9);
    }

    public final BigDecimal component1() {
        return this.amountMaxLimit;
    }

    public final List<String> component10() {
        return this.offerBrandListGe;
    }

    public final OfferBudgetApiModel component11() {
        return this.offersBudget;
    }

    public final String component12() {
        return this.offerCategory;
    }

    public final OfferExpirationApiModel component13() {
        return this.offerExpiration;
    }

    public final Integer component14() {
        return this.offerId;
    }

    public final String component15() {
        return this.offerLogoStorageId;
    }

    public final String component16() {
        return this.offerLogoStorageUrl;
    }

    public final String component17() {
        return this.offerNameEN;
    }

    public final String component18() {
        return this.offerNameGE;
    }

    public final List<String> component19() {
        return this.purchaseMethods;
    }

    public final BigDecimal component2() {
        return this.amountMinLimit;
    }

    public final Integer component20() {
        return this.resultCode;
    }

    public final String component21() {
        return this.resultDesc;
    }

    public final BudgetTypeApiModel component3() {
        return this.budgetType;
    }

    public final String component4() {
        return this.clientInn;
    }

    public final Long component5() {
        return this.clientKey;
    }

    public final String component6() {
        return this.clientShortEN;
    }

    public final String component7() {
        return this.clientShortGE;
    }

    public final ExpirationTypeApiModel component8() {
        return this.expirationType;
    }

    public final List<String> component9() {
        return this.offerBrandListEn;
    }

    public final GiftCardOfferDetailsApiModel copy(BigDecimal bigDecimal, BigDecimal bigDecimal2, BudgetTypeApiModel budgetTypeApiModel, String str, Long l, String str2, String str3, ExpirationTypeApiModel expirationTypeApiModel, List<String> list, List<String> list2, OfferBudgetApiModel offerBudgetApiModel, String str4, OfferExpirationApiModel offerExpirationApiModel, Integer num, String str5, String str6, String str7, String str8, List<String> list3, Integer num2, String str9) {
        return new GiftCardOfferDetailsApiModel(bigDecimal, bigDecimal2, budgetTypeApiModel, str, l, str2, str3, expirationTypeApiModel, list, list2, offerBudgetApiModel, str4, offerExpirationApiModel, num, str5, str6, str7, str8, list3, num2, str9);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof GiftCardOfferDetailsApiModel)) {
            return false;
        }
        GiftCardOfferDetailsApiModel giftCardOfferDetailsApiModel = (GiftCardOfferDetailsApiModel) obj;
        return C41536l.m120484d(this.amountMaxLimit, giftCardOfferDetailsApiModel.amountMaxLimit) && C41536l.m120484d(this.amountMinLimit, giftCardOfferDetailsApiModel.amountMinLimit) && this.budgetType == giftCardOfferDetailsApiModel.budgetType && C41536l.m120484d(this.clientInn, giftCardOfferDetailsApiModel.clientInn) && C41536l.m120484d(this.clientKey, giftCardOfferDetailsApiModel.clientKey) && C41536l.m120484d(this.clientShortEN, giftCardOfferDetailsApiModel.clientShortEN) && C41536l.m120484d(this.clientShortGE, giftCardOfferDetailsApiModel.clientShortGE) && this.expirationType == giftCardOfferDetailsApiModel.expirationType && C41536l.m120484d(this.offerBrandListEn, giftCardOfferDetailsApiModel.offerBrandListEn) && C41536l.m120484d(this.offerBrandListGe, giftCardOfferDetailsApiModel.offerBrandListGe) && C41536l.m120484d(this.offersBudget, giftCardOfferDetailsApiModel.offersBudget) && C41536l.m120484d(this.offerCategory, giftCardOfferDetailsApiModel.offerCategory) && C41536l.m120484d(this.offerExpiration, giftCardOfferDetailsApiModel.offerExpiration) && C41536l.m120484d(this.offerId, giftCardOfferDetailsApiModel.offerId) && C41536l.m120484d(this.offerLogoStorageId, giftCardOfferDetailsApiModel.offerLogoStorageId) && C41536l.m120484d(this.offerLogoStorageUrl, giftCardOfferDetailsApiModel.offerLogoStorageUrl) && C41536l.m120484d(this.offerNameEN, giftCardOfferDetailsApiModel.offerNameEN) && C41536l.m120484d(this.offerNameGE, giftCardOfferDetailsApiModel.offerNameGE) && C41536l.m120484d(this.purchaseMethods, giftCardOfferDetailsApiModel.purchaseMethods) && C41536l.m120484d(this.resultCode, giftCardOfferDetailsApiModel.resultCode) && C41536l.m120484d(this.resultDesc, giftCardOfferDetailsApiModel.resultDesc);
    }

    public final BigDecimal getAmountMaxLimit() {
        return this.amountMaxLimit;
    }

    public final BigDecimal getAmountMinLimit() {
        return this.amountMinLimit;
    }

    public final BudgetTypeApiModel getBudgetType() {
        return this.budgetType;
    }

    public final String getClientInn() {
        return this.clientInn;
    }

    public final Long getClientKey() {
        return this.clientKey;
    }

    public final String getClientShortEN() {
        return this.clientShortEN;
    }

    public final String getClientShortGE() {
        return this.clientShortGE;
    }

    public final ExpirationTypeApiModel getExpirationType() {
        return this.expirationType;
    }

    public final List<String> getOfferBrandListEn() {
        return this.offerBrandListEn;
    }

    public final List<String> getOfferBrandListGe() {
        return this.offerBrandListGe;
    }

    public final String getOfferCategory() {
        return this.offerCategory;
    }

    public final OfferExpirationApiModel getOfferExpiration() {
        return this.offerExpiration;
    }

    public final Integer getOfferId() {
        return this.offerId;
    }

    public final String getOfferLogoStorageId() {
        return this.offerLogoStorageId;
    }

    public final String getOfferLogoStorageUrl() {
        return this.offerLogoStorageUrl;
    }

    public final String getOfferNameEN() {
        return this.offerNameEN;
    }

    public final String getOfferNameGE() {
        return this.offerNameGE;
    }

    public final OfferBudgetApiModel getOffersBudget() {
        return this.offersBudget;
    }

    public final List<String> getPurchaseMethods() {
        return this.purchaseMethods;
    }

    public final Integer getResultCode() {
        return this.resultCode;
    }

    public final String getResultDesc() {
        return this.resultDesc;
    }

    public int hashCode() {
        BigDecimal bigDecimal = this.amountMaxLimit;
        int i = 0;
        int hashCode = (bigDecimal == null ? 0 : bigDecimal.hashCode()) * 31;
        BigDecimal bigDecimal2 = this.amountMinLimit;
        int hashCode2 = (hashCode + (bigDecimal2 == null ? 0 : bigDecimal2.hashCode())) * 31;
        BudgetTypeApiModel budgetTypeApiModel = this.budgetType;
        int hashCode3 = (hashCode2 + (budgetTypeApiModel == null ? 0 : budgetTypeApiModel.hashCode())) * 31;
        String str = this.clientInn;
        int hashCode4 = (hashCode3 + (str == null ? 0 : str.hashCode())) * 31;
        Long l = this.clientKey;
        int hashCode5 = (hashCode4 + (l == null ? 0 : l.hashCode())) * 31;
        String str2 = this.clientShortEN;
        int hashCode6 = (hashCode5 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.clientShortGE;
        int hashCode7 = (hashCode6 + (str3 == null ? 0 : str3.hashCode())) * 31;
        ExpirationTypeApiModel expirationTypeApiModel = this.expirationType;
        int hashCode8 = (hashCode7 + (expirationTypeApiModel == null ? 0 : expirationTypeApiModel.hashCode())) * 31;
        List<String> list = this.offerBrandListEn;
        int hashCode9 = (hashCode8 + (list == null ? 0 : list.hashCode())) * 31;
        List<String> list2 = this.offerBrandListGe;
        int hashCode10 = (hashCode9 + (list2 == null ? 0 : list2.hashCode())) * 31;
        OfferBudgetApiModel offerBudgetApiModel = this.offersBudget;
        int hashCode11 = (hashCode10 + (offerBudgetApiModel == null ? 0 : offerBudgetApiModel.hashCode())) * 31;
        String str4 = this.offerCategory;
        int hashCode12 = (hashCode11 + (str4 == null ? 0 : str4.hashCode())) * 31;
        OfferExpirationApiModel offerExpirationApiModel = this.offerExpiration;
        int hashCode13 = (hashCode12 + (offerExpirationApiModel == null ? 0 : offerExpirationApiModel.hashCode())) * 31;
        Integer num = this.offerId;
        int hashCode14 = (hashCode13 + (num == null ? 0 : num.hashCode())) * 31;
        String str5 = this.offerLogoStorageId;
        int hashCode15 = (hashCode14 + (str5 == null ? 0 : str5.hashCode())) * 31;
        String str6 = this.offerLogoStorageUrl;
        int hashCode16 = (hashCode15 + (str6 == null ? 0 : str6.hashCode())) * 31;
        String str7 = this.offerNameEN;
        int hashCode17 = (hashCode16 + (str7 == null ? 0 : str7.hashCode())) * 31;
        String str8 = this.offerNameGE;
        int hashCode18 = (hashCode17 + (str8 == null ? 0 : str8.hashCode())) * 31;
        List<String> list3 = this.purchaseMethods;
        int hashCode19 = (hashCode18 + (list3 == null ? 0 : list3.hashCode())) * 31;
        Integer num2 = this.resultCode;
        int hashCode20 = (hashCode19 + (num2 == null ? 0 : num2.hashCode())) * 31;
        String str9 = this.resultDesc;
        if (str9 != null) {
            i = str9.hashCode();
        }
        return hashCode20 + i;
    }

    public String toString() {
        BigDecimal bigDecimal = this.amountMaxLimit;
        BigDecimal bigDecimal2 = this.amountMinLimit;
        BudgetTypeApiModel budgetTypeApiModel = this.budgetType;
        String str = this.clientInn;
        Long l = this.clientKey;
        String str2 = this.clientShortEN;
        String str3 = this.clientShortGE;
        ExpirationTypeApiModel expirationTypeApiModel = this.expirationType;
        List<String> list = this.offerBrandListEn;
        List<String> list2 = this.offerBrandListGe;
        OfferBudgetApiModel offerBudgetApiModel = this.offersBudget;
        String str4 = this.offerCategory;
        OfferExpirationApiModel offerExpirationApiModel = this.offerExpiration;
        Integer num = this.offerId;
        String str5 = this.offerLogoStorageId;
        String str6 = this.offerLogoStorageUrl;
        String str7 = this.offerNameEN;
        String str8 = this.offerNameGE;
        List<String> list3 = this.purchaseMethods;
        Integer num2 = this.resultCode;
        String str9 = this.resultDesc;
        return "GiftCardOfferDetailsApiModel(amountMaxLimit=" + bigDecimal + ", amountMinLimit=" + bigDecimal2 + ", budgetType=" + budgetTypeApiModel + ", clientInn=" + str + ", clientKey=" + l + ", clientShortEN=" + str2 + ", clientShortGE=" + str3 + ", expirationType=" + expirationTypeApiModel + ", offerBrandListEn=" + list + ", offerBrandListGe=" + list2 + ", offersBudget=" + offerBudgetApiModel + ", offerCategory=" + str4 + ", offerExpiration=" + offerExpirationApiModel + ", offerId=" + num + ", offerLogoStorageId=" + str5 + ", offerLogoStorageUrl=" + str6 + ", offerNameEN=" + str7 + ", offerNameGE=" + str8 + ", purchaseMethods=" + list3 + ", resultCode=" + num2 + ", resultDesc=" + str9 + ")";
    }
}
