package p341ge.bog.mobilebank.giftcards.data.model;

import androidx.annotation.Keep;
import com.salesforce.marketingcloud.C11398b;
import java.math.BigDecimal;
import java.util.List;
import kotlin.jvm.internal.C41536l;
import p190o1.C7397t;

@Keep
/* renamed from: ge.bog.mobilebank.giftcards.data.model.ClientGiftCardApiModel */
public final class ClientGiftCardApiModel {
    private final BigDecimal availableAmount;
    private final Boolean canGiveAwayCard;
    private final String cardDesignStorageId;
    private final Long cardExpirationDate;
    private final String ccy;
    private final Long clientKey;
    private final BffExternalFileApiModel externalFile;
    private final long giftCardId;
    private final String giftCardPaymentCode;
    private final Boolean giftCardSeen;
    private final String giftText;
    private final List<String> offerBrandList;
    private final String offerLogoStorageId;
    private final String offerLogoStorageUrl;
    private final String offerName;
    private final String offerNameInt;
    private final String ownerMobilePhone;
    private final BigDecimal primaryAmount;
    private final String srcClientFirstName;
    private final String srcClientLastname;
    private final BigDecimal usedAmount;

    public ClientGiftCardApiModel(long j, BigDecimal bigDecimal, String str, Long l, String str2, String str3, Boolean bool, String str4, Boolean bool2, List<String> list, String str5, String str6, String str7, String str8, BigDecimal bigDecimal2, String str9, String str10, Long l2, String str11, BigDecimal bigDecimal3, BffExternalFileApiModel bffExternalFileApiModel) {
        this.giftCardId = j;
        this.availableAmount = bigDecimal;
        this.cardDesignStorageId = str;
        this.cardExpirationDate = l;
        this.ccy = str2;
        this.giftCardPaymentCode = str3;
        this.giftCardSeen = bool;
        this.giftText = str4;
        this.canGiveAwayCard = bool2;
        this.offerBrandList = list;
        this.offerLogoStorageId = str5;
        this.offerLogoStorageUrl = str6;
        this.offerName = str7;
        this.offerNameInt = str8;
        this.primaryAmount = bigDecimal2;
        this.srcClientFirstName = str9;
        this.srcClientLastname = str10;
        this.clientKey = l2;
        this.ownerMobilePhone = str11;
        this.usedAmount = bigDecimal3;
        this.externalFile = bffExternalFileApiModel;
    }

    public static /* synthetic */ ClientGiftCardApiModel copy$default(ClientGiftCardApiModel clientGiftCardApiModel, long j, BigDecimal bigDecimal, String str, Long l, String str2, String str3, Boolean bool, String str4, Boolean bool2, List list, String str5, String str6, String str7, String str8, BigDecimal bigDecimal2, String str9, String str10, Long l2, String str11, BigDecimal bigDecimal3, BffExternalFileApiModel bffExternalFileApiModel, int i, Object obj) {
        ClientGiftCardApiModel clientGiftCardApiModel2 = clientGiftCardApiModel;
        int i2 = i;
        return clientGiftCardApiModel.copy((i2 & 1) != 0 ? clientGiftCardApiModel2.giftCardId : j, (i2 & 2) != 0 ? clientGiftCardApiModel2.availableAmount : bigDecimal, (i2 & 4) != 0 ? clientGiftCardApiModel2.cardDesignStorageId : str, (i2 & 8) != 0 ? clientGiftCardApiModel2.cardExpirationDate : l, (i2 & 16) != 0 ? clientGiftCardApiModel2.ccy : str2, (i2 & 32) != 0 ? clientGiftCardApiModel2.giftCardPaymentCode : str3, (i2 & 64) != 0 ? clientGiftCardApiModel2.giftCardSeen : bool, (i2 & 128) != 0 ? clientGiftCardApiModel2.giftText : str4, (i2 & C11398b.f33139r) != 0 ? clientGiftCardApiModel2.canGiveAwayCard : bool2, (i2 & C11398b.f33140s) != 0 ? clientGiftCardApiModel2.offerBrandList : list, (i2 & C11398b.f33141t) != 0 ? clientGiftCardApiModel2.offerLogoStorageId : str5, (i2 & C11398b.f33142u) != 0 ? clientGiftCardApiModel2.offerLogoStorageUrl : str6, (i2 & C11398b.f33143v) != 0 ? clientGiftCardApiModel2.offerName : str7, (i2 & 8192) != 0 ? clientGiftCardApiModel2.offerNameInt : str8, (i2 & 16384) != 0 ? clientGiftCardApiModel2.primaryAmount : bigDecimal2, (i2 & 32768) != 0 ? clientGiftCardApiModel2.srcClientFirstName : str9, (i2 & 65536) != 0 ? clientGiftCardApiModel2.srcClientLastname : str10, (i2 & 131072) != 0 ? clientGiftCardApiModel2.clientKey : l2, (i2 & 262144) != 0 ? clientGiftCardApiModel2.ownerMobilePhone : str11, (i2 & 524288) != 0 ? clientGiftCardApiModel2.usedAmount : bigDecimal3, (i2 & 1048576) != 0 ? clientGiftCardApiModel2.externalFile : bffExternalFileApiModel);
    }

    public final long component1() {
        return this.giftCardId;
    }

    public final List<String> component10() {
        return this.offerBrandList;
    }

    public final String component11() {
        return this.offerLogoStorageId;
    }

    public final String component12() {
        return this.offerLogoStorageUrl;
    }

    public final String component13() {
        return this.offerName;
    }

    public final String component14() {
        return this.offerNameInt;
    }

    public final BigDecimal component15() {
        return this.primaryAmount;
    }

    public final String component16() {
        return this.srcClientFirstName;
    }

    public final String component17() {
        return this.srcClientLastname;
    }

    public final Long component18() {
        return this.clientKey;
    }

    public final String component19() {
        return this.ownerMobilePhone;
    }

    public final BigDecimal component2() {
        return this.availableAmount;
    }

    public final BigDecimal component20() {
        return this.usedAmount;
    }

    public final BffExternalFileApiModel component21() {
        return this.externalFile;
    }

    public final String component3() {
        return this.cardDesignStorageId;
    }

    public final Long component4() {
        return this.cardExpirationDate;
    }

    public final String component5() {
        return this.ccy;
    }

    public final String component6() {
        return this.giftCardPaymentCode;
    }

    public final Boolean component7() {
        return this.giftCardSeen;
    }

    public final String component8() {
        return this.giftText;
    }

    public final Boolean component9() {
        return this.canGiveAwayCard;
    }

    public final ClientGiftCardApiModel copy(long j, BigDecimal bigDecimal, String str, Long l, String str2, String str3, Boolean bool, String str4, Boolean bool2, List<String> list, String str5, String str6, String str7, String str8, BigDecimal bigDecimal2, String str9, String str10, Long l2, String str11, BigDecimal bigDecimal3, BffExternalFileApiModel bffExternalFileApiModel) {
        return new ClientGiftCardApiModel(j, bigDecimal, str, l, str2, str3, bool, str4, bool2, list, str5, str6, str7, str8, bigDecimal2, str9, str10, l2, str11, bigDecimal3, bffExternalFileApiModel);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ClientGiftCardApiModel)) {
            return false;
        }
        ClientGiftCardApiModel clientGiftCardApiModel = (ClientGiftCardApiModel) obj;
        return this.giftCardId == clientGiftCardApiModel.giftCardId && C41536l.m120484d(this.availableAmount, clientGiftCardApiModel.availableAmount) && C41536l.m120484d(this.cardDesignStorageId, clientGiftCardApiModel.cardDesignStorageId) && C41536l.m120484d(this.cardExpirationDate, clientGiftCardApiModel.cardExpirationDate) && C41536l.m120484d(this.ccy, clientGiftCardApiModel.ccy) && C41536l.m120484d(this.giftCardPaymentCode, clientGiftCardApiModel.giftCardPaymentCode) && C41536l.m120484d(this.giftCardSeen, clientGiftCardApiModel.giftCardSeen) && C41536l.m120484d(this.giftText, clientGiftCardApiModel.giftText) && C41536l.m120484d(this.canGiveAwayCard, clientGiftCardApiModel.canGiveAwayCard) && C41536l.m120484d(this.offerBrandList, clientGiftCardApiModel.offerBrandList) && C41536l.m120484d(this.offerLogoStorageId, clientGiftCardApiModel.offerLogoStorageId) && C41536l.m120484d(this.offerLogoStorageUrl, clientGiftCardApiModel.offerLogoStorageUrl) && C41536l.m120484d(this.offerName, clientGiftCardApiModel.offerName) && C41536l.m120484d(this.offerNameInt, clientGiftCardApiModel.offerNameInt) && C41536l.m120484d(this.primaryAmount, clientGiftCardApiModel.primaryAmount) && C41536l.m120484d(this.srcClientFirstName, clientGiftCardApiModel.srcClientFirstName) && C41536l.m120484d(this.srcClientLastname, clientGiftCardApiModel.srcClientLastname) && C41536l.m120484d(this.clientKey, clientGiftCardApiModel.clientKey) && C41536l.m120484d(this.ownerMobilePhone, clientGiftCardApiModel.ownerMobilePhone) && C41536l.m120484d(this.usedAmount, clientGiftCardApiModel.usedAmount) && C41536l.m120484d(this.externalFile, clientGiftCardApiModel.externalFile);
    }

    public final BigDecimal getAvailableAmount() {
        return this.availableAmount;
    }

    public final Boolean getCanGiveAwayCard() {
        return this.canGiveAwayCard;
    }

    public final String getCardDesignStorageId() {
        return this.cardDesignStorageId;
    }

    public final Long getCardExpirationDate() {
        return this.cardExpirationDate;
    }

    public final String getCcy() {
        return this.ccy;
    }

    public final Long getClientKey() {
        return this.clientKey;
    }

    public final BffExternalFileApiModel getExternalFile() {
        return this.externalFile;
    }

    public final long getGiftCardId() {
        return this.giftCardId;
    }

    public final String getGiftCardPaymentCode() {
        return this.giftCardPaymentCode;
    }

    public final Boolean getGiftCardSeen() {
        return this.giftCardSeen;
    }

    public final String getGiftText() {
        return this.giftText;
    }

    public final List<String> getOfferBrandList() {
        return this.offerBrandList;
    }

    public final String getOfferLogoStorageId() {
        return this.offerLogoStorageId;
    }

    public final String getOfferLogoStorageUrl() {
        return this.offerLogoStorageUrl;
    }

    public final String getOfferName() {
        return this.offerName;
    }

    public final String getOfferNameInt() {
        return this.offerNameInt;
    }

    public final String getOwnerMobilePhone() {
        return this.ownerMobilePhone;
    }

    public final BigDecimal getPrimaryAmount() {
        return this.primaryAmount;
    }

    public final String getSrcClientFirstName() {
        return this.srcClientFirstName;
    }

    public final String getSrcClientLastname() {
        return this.srcClientLastname;
    }

    public final BigDecimal getUsedAmount() {
        return this.usedAmount;
    }

    public int hashCode() {
        int a = C7397t.m28148a(this.giftCardId) * 31;
        BigDecimal bigDecimal = this.availableAmount;
        int i = 0;
        int hashCode = (a + (bigDecimal == null ? 0 : bigDecimal.hashCode())) * 31;
        String str = this.cardDesignStorageId;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        Long l = this.cardExpirationDate;
        int hashCode3 = (hashCode2 + (l == null ? 0 : l.hashCode())) * 31;
        String str2 = this.ccy;
        int hashCode4 = (hashCode3 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.giftCardPaymentCode;
        int hashCode5 = (hashCode4 + (str3 == null ? 0 : str3.hashCode())) * 31;
        Boolean bool = this.giftCardSeen;
        int hashCode6 = (hashCode5 + (bool == null ? 0 : bool.hashCode())) * 31;
        String str4 = this.giftText;
        int hashCode7 = (hashCode6 + (str4 == null ? 0 : str4.hashCode())) * 31;
        Boolean bool2 = this.canGiveAwayCard;
        int hashCode8 = (hashCode7 + (bool2 == null ? 0 : bool2.hashCode())) * 31;
        List<String> list = this.offerBrandList;
        int hashCode9 = (hashCode8 + (list == null ? 0 : list.hashCode())) * 31;
        String str5 = this.offerLogoStorageId;
        int hashCode10 = (hashCode9 + (str5 == null ? 0 : str5.hashCode())) * 31;
        String str6 = this.offerLogoStorageUrl;
        int hashCode11 = (hashCode10 + (str6 == null ? 0 : str6.hashCode())) * 31;
        String str7 = this.offerName;
        int hashCode12 = (hashCode11 + (str7 == null ? 0 : str7.hashCode())) * 31;
        String str8 = this.offerNameInt;
        int hashCode13 = (hashCode12 + (str8 == null ? 0 : str8.hashCode())) * 31;
        BigDecimal bigDecimal2 = this.primaryAmount;
        int hashCode14 = (hashCode13 + (bigDecimal2 == null ? 0 : bigDecimal2.hashCode())) * 31;
        String str9 = this.srcClientFirstName;
        int hashCode15 = (hashCode14 + (str9 == null ? 0 : str9.hashCode())) * 31;
        String str10 = this.srcClientLastname;
        int hashCode16 = (hashCode15 + (str10 == null ? 0 : str10.hashCode())) * 31;
        Long l2 = this.clientKey;
        int hashCode17 = (hashCode16 + (l2 == null ? 0 : l2.hashCode())) * 31;
        String str11 = this.ownerMobilePhone;
        int hashCode18 = (hashCode17 + (str11 == null ? 0 : str11.hashCode())) * 31;
        BigDecimal bigDecimal3 = this.usedAmount;
        int hashCode19 = (hashCode18 + (bigDecimal3 == null ? 0 : bigDecimal3.hashCode())) * 31;
        BffExternalFileApiModel bffExternalFileApiModel = this.externalFile;
        if (bffExternalFileApiModel != null) {
            i = bffExternalFileApiModel.hashCode();
        }
        return hashCode19 + i;
    }

    public String toString() {
        long j = this.giftCardId;
        BigDecimal bigDecimal = this.availableAmount;
        String str = this.cardDesignStorageId;
        Long l = this.cardExpirationDate;
        String str2 = this.ccy;
        String str3 = this.giftCardPaymentCode;
        Boolean bool = this.giftCardSeen;
        String str4 = this.giftText;
        Boolean bool2 = this.canGiveAwayCard;
        List<String> list = this.offerBrandList;
        String str5 = this.offerLogoStorageId;
        String str6 = this.offerLogoStorageUrl;
        String str7 = this.offerName;
        String str8 = this.offerNameInt;
        BigDecimal bigDecimal2 = this.primaryAmount;
        String str9 = this.srcClientFirstName;
        String str10 = this.srcClientLastname;
        Long l2 = this.clientKey;
        String str11 = this.ownerMobilePhone;
        BigDecimal bigDecimal3 = this.usedAmount;
        BffExternalFileApiModel bffExternalFileApiModel = this.externalFile;
        return "ClientGiftCardApiModel(giftCardId=" + j + ", availableAmount=" + bigDecimal + ", cardDesignStorageId=" + str + ", cardExpirationDate=" + l + ", ccy=" + str2 + ", giftCardPaymentCode=" + str3 + ", giftCardSeen=" + bool + ", giftText=" + str4 + ", canGiveAwayCard=" + bool2 + ", offerBrandList=" + list + ", offerLogoStorageId=" + str5 + ", offerLogoStorageUrl=" + str6 + ", offerName=" + str7 + ", offerNameInt=" + str8 + ", primaryAmount=" + bigDecimal2 + ", srcClientFirstName=" + str9 + ", srcClientLastname=" + str10 + ", clientKey=" + l2 + ", ownerMobilePhone=" + str11 + ", usedAmount=" + bigDecimal3 + ", externalFile=" + bffExternalFileApiModel + ")";
    }
}
