package p341ge.bog.mobilebank.giftcards.data.model;

import androidx.annotation.Keep;
import com.salesforce.marketingcloud.C11398b;
import java.math.BigDecimal;
import java.util.List;
import kotlin.jvm.internal.C41536l;
import kotlin.jvm.internal.DefaultConstructorMarker;

@Keep
/* renamed from: ge.bog.mobilebank.giftcards.data.model.GiveAwayGiftCardApiModel */
public final class GiveAwayGiftCardApiModel {
    private final BigDecimal amount;
    private final Boolean canResend;
    private final String ccy;
    private final Long clientKey;
    private final String designId;
    private final String designName;
    private final String dstClientName;
    private final Long expDate;
    private final Long giftCardId;
    private final String giftText;
    private final Long giveAwayDate;
    private final Boolean isGiftCardSeen;
    private final List<String> offerBrandList;
    private final String offerLogoId;
    private final String offerName;
    private final String offerNameInt;
    private final String receiverMobilePhone;
    private final String status;

    public GiveAwayGiftCardApiModel(BigDecimal bigDecimal, Boolean bool, String str, Long l, String str2, String str3, String str4, Long l2, Long l3, String str5, Long l4, Boolean bool2, List<String> list, String str6, String str7, String str8, String str9, String str10) {
        List<String> list2 = list;
        C41536l.m120489i(list2, "offerBrandList");
        this.amount = bigDecimal;
        this.canResend = bool;
        this.ccy = str;
        this.clientKey = l;
        this.designId = str2;
        this.designName = str3;
        this.dstClientName = str4;
        this.expDate = l2;
        this.giftCardId = l3;
        this.giftText = str5;
        this.giveAwayDate = l4;
        this.isGiftCardSeen = bool2;
        this.offerBrandList = list2;
        this.offerLogoId = str6;
        this.offerName = str7;
        this.offerNameInt = str8;
        this.receiverMobilePhone = str9;
        this.status = str10;
    }

    public static /* synthetic */ GiveAwayGiftCardApiModel copy$default(GiveAwayGiftCardApiModel giveAwayGiftCardApiModel, BigDecimal bigDecimal, Boolean bool, String str, Long l, String str2, String str3, String str4, Long l2, Long l3, String str5, Long l4, Boolean bool2, List list, String str6, String str7, String str8, String str9, String str10, int i, Object obj) {
        GiveAwayGiftCardApiModel giveAwayGiftCardApiModel2 = giveAwayGiftCardApiModel;
        int i2 = i;
        return giveAwayGiftCardApiModel.copy((i2 & 1) != 0 ? giveAwayGiftCardApiModel2.amount : bigDecimal, (i2 & 2) != 0 ? giveAwayGiftCardApiModel2.canResend : bool, (i2 & 4) != 0 ? giveAwayGiftCardApiModel2.ccy : str, (i2 & 8) != 0 ? giveAwayGiftCardApiModel2.clientKey : l, (i2 & 16) != 0 ? giveAwayGiftCardApiModel2.designId : str2, (i2 & 32) != 0 ? giveAwayGiftCardApiModel2.designName : str3, (i2 & 64) != 0 ? giveAwayGiftCardApiModel2.dstClientName : str4, (i2 & 128) != 0 ? giveAwayGiftCardApiModel2.expDate : l2, (i2 & C11398b.f33139r) != 0 ? giveAwayGiftCardApiModel2.giftCardId : l3, (i2 & C11398b.f33140s) != 0 ? giveAwayGiftCardApiModel2.giftText : str5, (i2 & C11398b.f33141t) != 0 ? giveAwayGiftCardApiModel2.giveAwayDate : l4, (i2 & C11398b.f33142u) != 0 ? giveAwayGiftCardApiModel2.isGiftCardSeen : bool2, (i2 & C11398b.f33143v) != 0 ? giveAwayGiftCardApiModel2.offerBrandList : list, (i2 & 8192) != 0 ? giveAwayGiftCardApiModel2.offerLogoId : str6, (i2 & 16384) != 0 ? giveAwayGiftCardApiModel2.offerName : str7, (i2 & 32768) != 0 ? giveAwayGiftCardApiModel2.offerNameInt : str8, (i2 & 65536) != 0 ? giveAwayGiftCardApiModel2.receiverMobilePhone : str9, (i2 & 131072) != 0 ? giveAwayGiftCardApiModel2.status : str10);
    }

    public final BigDecimal component1() {
        return this.amount;
    }

    public final String component10() {
        return this.giftText;
    }

    public final Long component11() {
        return this.giveAwayDate;
    }

    public final Boolean component12() {
        return this.isGiftCardSeen;
    }

    public final List<String> component13() {
        return this.offerBrandList;
    }

    public final String component14() {
        return this.offerLogoId;
    }

    public final String component15() {
        return this.offerName;
    }

    public final String component16() {
        return this.offerNameInt;
    }

    public final String component17() {
        return this.receiverMobilePhone;
    }

    public final String component18() {
        return this.status;
    }

    public final Boolean component2() {
        return this.canResend;
    }

    public final String component3() {
        return this.ccy;
    }

    public final Long component4() {
        return this.clientKey;
    }

    public final String component5() {
        return this.designId;
    }

    public final String component6() {
        return this.designName;
    }

    public final String component7() {
        return this.dstClientName;
    }

    public final Long component8() {
        return this.expDate;
    }

    public final Long component9() {
        return this.giftCardId;
    }

    public final GiveAwayGiftCardApiModel copy(BigDecimal bigDecimal, Boolean bool, String str, Long l, String str2, String str3, String str4, Long l2, Long l3, String str5, Long l4, Boolean bool2, List<String> list, String str6, String str7, String str8, String str9, String str10) {
        BigDecimal bigDecimal2 = bigDecimal;
        C41536l.m120489i(list, "offerBrandList");
        return new GiveAwayGiftCardApiModel(bigDecimal, bool, str, l, str2, str3, str4, l2, l3, str5, l4, bool2, list, str6, str7, str8, str9, str10);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof GiveAwayGiftCardApiModel)) {
            return false;
        }
        GiveAwayGiftCardApiModel giveAwayGiftCardApiModel = (GiveAwayGiftCardApiModel) obj;
        return C41536l.m120484d(this.amount, giveAwayGiftCardApiModel.amount) && C41536l.m120484d(this.canResend, giveAwayGiftCardApiModel.canResend) && C41536l.m120484d(this.ccy, giveAwayGiftCardApiModel.ccy) && C41536l.m120484d(this.clientKey, giveAwayGiftCardApiModel.clientKey) && C41536l.m120484d(this.designId, giveAwayGiftCardApiModel.designId) && C41536l.m120484d(this.designName, giveAwayGiftCardApiModel.designName) && C41536l.m120484d(this.dstClientName, giveAwayGiftCardApiModel.dstClientName) && C41536l.m120484d(this.expDate, giveAwayGiftCardApiModel.expDate) && C41536l.m120484d(this.giftCardId, giveAwayGiftCardApiModel.giftCardId) && C41536l.m120484d(this.giftText, giveAwayGiftCardApiModel.giftText) && C41536l.m120484d(this.giveAwayDate, giveAwayGiftCardApiModel.giveAwayDate) && C41536l.m120484d(this.isGiftCardSeen, giveAwayGiftCardApiModel.isGiftCardSeen) && C41536l.m120484d(this.offerBrandList, giveAwayGiftCardApiModel.offerBrandList) && C41536l.m120484d(this.offerLogoId, giveAwayGiftCardApiModel.offerLogoId) && C41536l.m120484d(this.offerName, giveAwayGiftCardApiModel.offerName) && C41536l.m120484d(this.offerNameInt, giveAwayGiftCardApiModel.offerNameInt) && C41536l.m120484d(this.receiverMobilePhone, giveAwayGiftCardApiModel.receiverMobilePhone) && C41536l.m120484d(this.status, giveAwayGiftCardApiModel.status);
    }

    public final BigDecimal getAmount() {
        return this.amount;
    }

    public final Boolean getCanResend() {
        return this.canResend;
    }

    public final String getCcy() {
        return this.ccy;
    }

    public final Long getClientKey() {
        return this.clientKey;
    }

    public final String getDesignId() {
        return this.designId;
    }

    public final String getDesignName() {
        return this.designName;
    }

    public final String getDstClientName() {
        return this.dstClientName;
    }

    public final Long getExpDate() {
        return this.expDate;
    }

    public final Long getGiftCardId() {
        return this.giftCardId;
    }

    public final String getGiftText() {
        return this.giftText;
    }

    public final Long getGiveAwayDate() {
        return this.giveAwayDate;
    }

    public final List<String> getOfferBrandList() {
        return this.offerBrandList;
    }

    public final String getOfferLogoId() {
        return this.offerLogoId;
    }

    public final String getOfferName() {
        return this.offerName;
    }

    public final String getOfferNameInt() {
        return this.offerNameInt;
    }

    public final String getReceiverMobilePhone() {
        return this.receiverMobilePhone;
    }

    public final String getStatus() {
        return this.status;
    }

    public int hashCode() {
        BigDecimal bigDecimal = this.amount;
        int i = 0;
        int hashCode = (bigDecimal == null ? 0 : bigDecimal.hashCode()) * 31;
        Boolean bool = this.canResend;
        int hashCode2 = (hashCode + (bool == null ? 0 : bool.hashCode())) * 31;
        String str = this.ccy;
        int hashCode3 = (hashCode2 + (str == null ? 0 : str.hashCode())) * 31;
        Long l = this.clientKey;
        int hashCode4 = (hashCode3 + (l == null ? 0 : l.hashCode())) * 31;
        String str2 = this.designId;
        int hashCode5 = (hashCode4 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.designName;
        int hashCode6 = (hashCode5 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.dstClientName;
        int hashCode7 = (hashCode6 + (str4 == null ? 0 : str4.hashCode())) * 31;
        Long l2 = this.expDate;
        int hashCode8 = (hashCode7 + (l2 == null ? 0 : l2.hashCode())) * 31;
        Long l3 = this.giftCardId;
        int hashCode9 = (hashCode8 + (l3 == null ? 0 : l3.hashCode())) * 31;
        String str5 = this.giftText;
        int hashCode10 = (hashCode9 + (str5 == null ? 0 : str5.hashCode())) * 31;
        Long l4 = this.giveAwayDate;
        int hashCode11 = (hashCode10 + (l4 == null ? 0 : l4.hashCode())) * 31;
        Boolean bool2 = this.isGiftCardSeen;
        int hashCode12 = (((hashCode11 + (bool2 == null ? 0 : bool2.hashCode())) * 31) + this.offerBrandList.hashCode()) * 31;
        String str6 = this.offerLogoId;
        int hashCode13 = (hashCode12 + (str6 == null ? 0 : str6.hashCode())) * 31;
        String str7 = this.offerName;
        int hashCode14 = (hashCode13 + (str7 == null ? 0 : str7.hashCode())) * 31;
        String str8 = this.offerNameInt;
        int hashCode15 = (hashCode14 + (str8 == null ? 0 : str8.hashCode())) * 31;
        String str9 = this.receiverMobilePhone;
        int hashCode16 = (hashCode15 + (str9 == null ? 0 : str9.hashCode())) * 31;
        String str10 = this.status;
        if (str10 != null) {
            i = str10.hashCode();
        }
        return hashCode16 + i;
    }

    public final Boolean isGiftCardSeen() {
        return this.isGiftCardSeen;
    }

    public String toString() {
        BigDecimal bigDecimal = this.amount;
        Boolean bool = this.canResend;
        String str = this.ccy;
        Long l = this.clientKey;
        String str2 = this.designId;
        String str3 = this.designName;
        String str4 = this.dstClientName;
        Long l2 = this.expDate;
        Long l3 = this.giftCardId;
        String str5 = this.giftText;
        Long l4 = this.giveAwayDate;
        Boolean bool2 = this.isGiftCardSeen;
        List<String> list = this.offerBrandList;
        String str6 = this.offerLogoId;
        String str7 = this.offerName;
        String str8 = this.offerNameInt;
        String str9 = this.receiverMobilePhone;
        String str10 = this.status;
        return "GiveAwayGiftCardApiModel(amount=" + bigDecimal + ", canResend=" + bool + ", ccy=" + str + ", clientKey=" + l + ", designId=" + str2 + ", designName=" + str3 + ", dstClientName=" + str4 + ", expDate=" + l2 + ", giftCardId=" + l3 + ", giftText=" + str5 + ", giveAwayDate=" + l4 + ", isGiftCardSeen=" + bool2 + ", offerBrandList=" + list + ", offerLogoId=" + str6 + ", offerName=" + str7 + ", offerNameInt=" + str8 + ", receiverMobilePhone=" + str9 + ", status=" + str10 + ")";
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ GiveAwayGiftCardApiModel(BigDecimal bigDecimal, Boolean bool, String str, Long l, String str2, String str3, String str4, Long l2, Long l3, String str5, Long l4, Boolean bool2, List list, String str6, String str7, String str8, String str9, String str10, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(bigDecimal, bool, str, l, str2, str3, str4, l2, l3, str5, l4, bool2, (i & C11398b.f33143v) != 0 ? C41341q.m119907j() : list, str6, str7, str8, str9, str10);
    }
}
