package p341ge.bog.mobilebank.giftcards.data.model;

import androidx.annotation.Keep;
import com.salesforce.marketingcloud.C11398b;
import java.math.BigDecimal;
import java.util.List;
import kotlin.jvm.internal.C41536l;
import kotlin.jvm.internal.DefaultConstructorMarker;

@Keep
/* renamed from: ge.bog.mobilebank.giftcards.data.model.PurchasedGiftCardApiModel */
public final class PurchasedGiftCardApiModel {
    private final Boolean canResend;
    private final Long clientKey;
    private final String designId;
    private final String dstClientName;
    private final String dstClientPhoneNumber;
    private final Long expirationDate;
    private final BigDecimal giftCardAmount;
    private final String giftCardAmountCcy;
    private final Long giftCardId;
    private final Boolean giftCardSeen;
    private final String giftText;
    private final List<String> offerBrandlist;
    private final String offerLogoStorageId;
    private final String offerName;
    private final String offerNameInt;
    private final BigDecimal purchaseAmount;
    private final String purchaseCcy;
    private final Long purchaseDate;
    private final Long purchaseId;
    private final String status;

    public PurchasedGiftCardApiModel(Boolean bool, Long l, String str, String str2, String str3, Long l2, BigDecimal bigDecimal, String str4, Long l3, Boolean bool2, String str5, List<String> list, String str6, String str7, String str8, BigDecimal bigDecimal2, String str9, Long l4, Long l5, String str10) {
        C41536l.m120489i(list, "offerBrandlist");
        this.canResend = bool;
        this.clientKey = l;
        this.designId = str;
        this.dstClientName = str2;
        this.dstClientPhoneNumber = str3;
        this.expirationDate = l2;
        this.giftCardAmount = bigDecimal;
        this.giftCardAmountCcy = str4;
        this.giftCardId = l3;
        this.giftCardSeen = bool2;
        this.giftText = str5;
        this.offerBrandlist = list;
        this.offerLogoStorageId = str6;
        this.offerName = str7;
        this.offerNameInt = str8;
        this.purchaseAmount = bigDecimal2;
        this.purchaseCcy = str9;
        this.purchaseDate = l4;
        this.purchaseId = l5;
        this.status = str10;
    }

    public static /* synthetic */ PurchasedGiftCardApiModel copy$default(PurchasedGiftCardApiModel purchasedGiftCardApiModel, Boolean bool, Long l, String str, String str2, String str3, Long l2, BigDecimal bigDecimal, String str4, Long l3, Boolean bool2, String str5, List list, String str6, String str7, String str8, BigDecimal bigDecimal2, String str9, Long l4, Long l5, String str10, int i, Object obj) {
        PurchasedGiftCardApiModel purchasedGiftCardApiModel2 = purchasedGiftCardApiModel;
        int i2 = i;
        return purchasedGiftCardApiModel.copy((i2 & 1) != 0 ? purchasedGiftCardApiModel2.canResend : bool, (i2 & 2) != 0 ? purchasedGiftCardApiModel2.clientKey : l, (i2 & 4) != 0 ? purchasedGiftCardApiModel2.designId : str, (i2 & 8) != 0 ? purchasedGiftCardApiModel2.dstClientName : str2, (i2 & 16) != 0 ? purchasedGiftCardApiModel2.dstClientPhoneNumber : str3, (i2 & 32) != 0 ? purchasedGiftCardApiModel2.expirationDate : l2, (i2 & 64) != 0 ? purchasedGiftCardApiModel2.giftCardAmount : bigDecimal, (i2 & 128) != 0 ? purchasedGiftCardApiModel2.giftCardAmountCcy : str4, (i2 & C11398b.f33139r) != 0 ? purchasedGiftCardApiModel2.giftCardId : l3, (i2 & C11398b.f33140s) != 0 ? purchasedGiftCardApiModel2.giftCardSeen : bool2, (i2 & C11398b.f33141t) != 0 ? purchasedGiftCardApiModel2.giftText : str5, (i2 & C11398b.f33142u) != 0 ? purchasedGiftCardApiModel2.offerBrandlist : list, (i2 & C11398b.f33143v) != 0 ? purchasedGiftCardApiModel2.offerLogoStorageId : str6, (i2 & 8192) != 0 ? purchasedGiftCardApiModel2.offerName : str7, (i2 & 16384) != 0 ? purchasedGiftCardApiModel2.offerNameInt : str8, (i2 & 32768) != 0 ? purchasedGiftCardApiModel2.purchaseAmount : bigDecimal2, (i2 & 65536) != 0 ? purchasedGiftCardApiModel2.purchaseCcy : str9, (i2 & 131072) != 0 ? purchasedGiftCardApiModel2.purchaseDate : l4, (i2 & 262144) != 0 ? purchasedGiftCardApiModel2.purchaseId : l5, (i2 & 524288) != 0 ? purchasedGiftCardApiModel2.status : str10);
    }

    public final Boolean component1() {
        return this.canResend;
    }

    public final Boolean component10() {
        return this.giftCardSeen;
    }

    public final String component11() {
        return this.giftText;
    }

    public final List<String> component12() {
        return this.offerBrandlist;
    }

    public final String component13() {
        return this.offerLogoStorageId;
    }

    public final String component14() {
        return this.offerName;
    }

    public final String component15() {
        return this.offerNameInt;
    }

    public final BigDecimal component16() {
        return this.purchaseAmount;
    }

    public final String component17() {
        return this.purchaseCcy;
    }

    public final Long component18() {
        return this.purchaseDate;
    }

    public final Long component19() {
        return this.purchaseId;
    }

    public final Long component2() {
        return this.clientKey;
    }

    public final String component20() {
        return this.status;
    }

    public final String component3() {
        return this.designId;
    }

    public final String component4() {
        return this.dstClientName;
    }

    public final String component5() {
        return this.dstClientPhoneNumber;
    }

    public final Long component6() {
        return this.expirationDate;
    }

    public final BigDecimal component7() {
        return this.giftCardAmount;
    }

    public final String component8() {
        return this.giftCardAmountCcy;
    }

    public final Long component9() {
        return this.giftCardId;
    }

    public final PurchasedGiftCardApiModel copy(Boolean bool, Long l, String str, String str2, String str3, Long l2, BigDecimal bigDecimal, String str4, Long l3, Boolean bool2, String str5, List<String> list, String str6, String str7, String str8, BigDecimal bigDecimal2, String str9, Long l4, Long l5, String str10) {
        Boolean bool3 = bool;
        C41536l.m120489i(list, "offerBrandlist");
        return new PurchasedGiftCardApiModel(bool, l, str, str2, str3, l2, bigDecimal, str4, l3, bool2, str5, list, str6, str7, str8, bigDecimal2, str9, l4, l5, str10);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PurchasedGiftCardApiModel)) {
            return false;
        }
        PurchasedGiftCardApiModel purchasedGiftCardApiModel = (PurchasedGiftCardApiModel) obj;
        return C41536l.m120484d(this.canResend, purchasedGiftCardApiModel.canResend) && C41536l.m120484d(this.clientKey, purchasedGiftCardApiModel.clientKey) && C41536l.m120484d(this.designId, purchasedGiftCardApiModel.designId) && C41536l.m120484d(this.dstClientName, purchasedGiftCardApiModel.dstClientName) && C41536l.m120484d(this.dstClientPhoneNumber, purchasedGiftCardApiModel.dstClientPhoneNumber) && C41536l.m120484d(this.expirationDate, purchasedGiftCardApiModel.expirationDate) && C41536l.m120484d(this.giftCardAmount, purchasedGiftCardApiModel.giftCardAmount) && C41536l.m120484d(this.giftCardAmountCcy, purchasedGiftCardApiModel.giftCardAmountCcy) && C41536l.m120484d(this.giftCardId, purchasedGiftCardApiModel.giftCardId) && C41536l.m120484d(this.giftCardSeen, purchasedGiftCardApiModel.giftCardSeen) && C41536l.m120484d(this.giftText, purchasedGiftCardApiModel.giftText) && C41536l.m120484d(this.offerBrandlist, purchasedGiftCardApiModel.offerBrandlist) && C41536l.m120484d(this.offerLogoStorageId, purchasedGiftCardApiModel.offerLogoStorageId) && C41536l.m120484d(this.offerName, purchasedGiftCardApiModel.offerName) && C41536l.m120484d(this.offerNameInt, purchasedGiftCardApiModel.offerNameInt) && C41536l.m120484d(this.purchaseAmount, purchasedGiftCardApiModel.purchaseAmount) && C41536l.m120484d(this.purchaseCcy, purchasedGiftCardApiModel.purchaseCcy) && C41536l.m120484d(this.purchaseDate, purchasedGiftCardApiModel.purchaseDate) && C41536l.m120484d(this.purchaseId, purchasedGiftCardApiModel.purchaseId) && C41536l.m120484d(this.status, purchasedGiftCardApiModel.status);
    }

    public final Boolean getCanResend() {
        return this.canResend;
    }

    public final Long getClientKey() {
        return this.clientKey;
    }

    public final String getDesignId() {
        return this.designId;
    }

    public final String getDstClientName() {
        return this.dstClientName;
    }

    public final String getDstClientPhoneNumber() {
        return this.dstClientPhoneNumber;
    }

    public final Long getExpirationDate() {
        return this.expirationDate;
    }

    public final BigDecimal getGiftCardAmount() {
        return this.giftCardAmount;
    }

    public final String getGiftCardAmountCcy() {
        return this.giftCardAmountCcy;
    }

    public final Long getGiftCardId() {
        return this.giftCardId;
    }

    public final Boolean getGiftCardSeen() {
        return this.giftCardSeen;
    }

    public final String getGiftText() {
        return this.giftText;
    }

    public final List<String> getOfferBrandlist() {
        return this.offerBrandlist;
    }

    public final String getOfferLogoStorageId() {
        return this.offerLogoStorageId;
    }

    public final String getOfferName() {
        return this.offerName;
    }

    public final String getOfferNameInt() {
        return this.offerNameInt;
    }

    public final BigDecimal getPurchaseAmount() {
        return this.purchaseAmount;
    }

    public final String getPurchaseCcy() {
        return this.purchaseCcy;
    }

    public final Long getPurchaseDate() {
        return this.purchaseDate;
    }

    public final Long getPurchaseId() {
        return this.purchaseId;
    }

    public final String getStatus() {
        return this.status;
    }

    public int hashCode() {
        Boolean bool = this.canResend;
        int i = 0;
        int hashCode = (bool == null ? 0 : bool.hashCode()) * 31;
        Long l = this.clientKey;
        int hashCode2 = (hashCode + (l == null ? 0 : l.hashCode())) * 31;
        String str = this.designId;
        int hashCode3 = (hashCode2 + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.dstClientName;
        int hashCode4 = (hashCode3 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.dstClientPhoneNumber;
        int hashCode5 = (hashCode4 + (str3 == null ? 0 : str3.hashCode())) * 31;
        Long l2 = this.expirationDate;
        int hashCode6 = (hashCode5 + (l2 == null ? 0 : l2.hashCode())) * 31;
        BigDecimal bigDecimal = this.giftCardAmount;
        int hashCode7 = (hashCode6 + (bigDecimal == null ? 0 : bigDecimal.hashCode())) * 31;
        String str4 = this.giftCardAmountCcy;
        int hashCode8 = (hashCode7 + (str4 == null ? 0 : str4.hashCode())) * 31;
        Long l3 = this.giftCardId;
        int hashCode9 = (hashCode8 + (l3 == null ? 0 : l3.hashCode())) * 31;
        Boolean bool2 = this.giftCardSeen;
        int hashCode10 = (hashCode9 + (bool2 == null ? 0 : bool2.hashCode())) * 31;
        String str5 = this.giftText;
        int hashCode11 = (((hashCode10 + (str5 == null ? 0 : str5.hashCode())) * 31) + this.offerBrandlist.hashCode()) * 31;
        String str6 = this.offerLogoStorageId;
        int hashCode12 = (hashCode11 + (str6 == null ? 0 : str6.hashCode())) * 31;
        String str7 = this.offerName;
        int hashCode13 = (hashCode12 + (str7 == null ? 0 : str7.hashCode())) * 31;
        String str8 = this.offerNameInt;
        int hashCode14 = (hashCode13 + (str8 == null ? 0 : str8.hashCode())) * 31;
        BigDecimal bigDecimal2 = this.purchaseAmount;
        int hashCode15 = (hashCode14 + (bigDecimal2 == null ? 0 : bigDecimal2.hashCode())) * 31;
        String str9 = this.purchaseCcy;
        int hashCode16 = (hashCode15 + (str9 == null ? 0 : str9.hashCode())) * 31;
        Long l4 = this.purchaseDate;
        int hashCode17 = (hashCode16 + (l4 == null ? 0 : l4.hashCode())) * 31;
        Long l5 = this.purchaseId;
        int hashCode18 = (hashCode17 + (l5 == null ? 0 : l5.hashCode())) * 31;
        String str10 = this.status;
        if (str10 != null) {
            i = str10.hashCode();
        }
        return hashCode18 + i;
    }

    public String toString() {
        Boolean bool = this.canResend;
        Long l = this.clientKey;
        String str = this.designId;
        String str2 = this.dstClientName;
        String str3 = this.dstClientPhoneNumber;
        Long l2 = this.expirationDate;
        BigDecimal bigDecimal = this.giftCardAmount;
        String str4 = this.giftCardAmountCcy;
        Long l3 = this.giftCardId;
        Boolean bool2 = this.giftCardSeen;
        String str5 = this.giftText;
        List<String> list = this.offerBrandlist;
        String str6 = this.offerLogoStorageId;
        String str7 = this.offerName;
        String str8 = this.offerNameInt;
        BigDecimal bigDecimal2 = this.purchaseAmount;
        String str9 = this.purchaseCcy;
        Long l4 = this.purchaseDate;
        Long l5 = this.purchaseId;
        String str10 = this.status;
        return "PurchasedGiftCardApiModel(canResend=" + bool + ", clientKey=" + l + ", designId=" + str + ", dstClientName=" + str2 + ", dstClientPhoneNumber=" + str3 + ", expirationDate=" + l2 + ", giftCardAmount=" + bigDecimal + ", giftCardAmountCcy=" + str4 + ", giftCardId=" + l3 + ", giftCardSeen=" + bool2 + ", giftText=" + str5 + ", offerBrandlist=" + list + ", offerLogoStorageId=" + str6 + ", offerName=" + str7 + ", offerNameInt=" + str8 + ", purchaseAmount=" + bigDecimal2 + ", purchaseCcy=" + str9 + ", purchaseDate=" + l4 + ", purchaseId=" + l5 + ", status=" + str10 + ")";
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ PurchasedGiftCardApiModel(Boolean bool, Long l, String str, String str2, String str3, Long l2, BigDecimal bigDecimal, String str4, Long l3, Boolean bool2, String str5, List list, String str6, String str7, String str8, BigDecimal bigDecimal2, String str9, Long l4, Long l5, String str10, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(bool, l, str, str2, str3, l2, bigDecimal, str4, l3, bool2, str5, (i & C11398b.f33142u) != 0 ? C41341q.m119907j() : list, str6, str7, str8, bigDecimal2, str9, l4, l5, str10);
    }
}
