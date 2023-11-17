package p341ge.bog.mobilebank.lifestyleoffers.data.entity;

import androidx.annotation.Keep;
import com.salesforce.marketingcloud.C11398b;
import kotlin.jvm.internal.C41536l;

@Keep
/* renamed from: ge.bog.mobilebank.lifestyleoffers.data.entity.LifestyleOfferApiModel */
public final class LifestyleOfferApiModel {
    private final String address;
    private final String bannerImageUrl;
    private final String benefBadge;
    private final String benefName;
    private final String benefitValue;
    private final String brandName;
    private final Long categoryId;
    private final Long daysLeft;
    private final String detailImageUrl;
    private final Long endDate;
    private final String facebook;
    private final String imageUrl;
    private final String offerDesc;
    private final String offerDescLong;
    private final String offerName;
    private final String offerNameLong;
    private final Long ofrId;
    private final String phoneNumber;
    private final Long startDate;
    private final Boolean topFlag;
    private final String website;

    public LifestyleOfferApiModel(Long l, String str, String str2, String str3, String str4, Long l2, Long l3, Long l4, String str5, String str6, String str7, Long l5, Boolean bool, String str8, String str9, String str10, String str11, String str12, String str13, String str14, String str15) {
        this.ofrId = l;
        this.offerName = str;
        this.imageUrl = str2;
        this.detailImageUrl = str3;
        this.bannerImageUrl = str4;
        this.startDate = l2;
        this.endDate = l3;
        this.daysLeft = l4;
        this.benefName = str5;
        this.benefBadge = str6;
        this.benefitValue = str7;
        this.categoryId = l5;
        this.topFlag = bool;
        this.offerNameLong = str8;
        this.offerDesc = str9;
        this.offerDescLong = str10;
        this.brandName = str11;
        this.phoneNumber = str12;
        this.address = str13;
        this.facebook = str14;
        this.website = str15;
    }

    public static /* synthetic */ LifestyleOfferApiModel copy$default(LifestyleOfferApiModel lifestyleOfferApiModel, Long l, String str, String str2, String str3, String str4, Long l2, Long l3, Long l4, String str5, String str6, String str7, Long l5, Boolean bool, String str8, String str9, String str10, String str11, String str12, String str13, String str14, String str15, int i, Object obj) {
        LifestyleOfferApiModel lifestyleOfferApiModel2 = lifestyleOfferApiModel;
        int i2 = i;
        return lifestyleOfferApiModel.copy((i2 & 1) != 0 ? lifestyleOfferApiModel2.ofrId : l, (i2 & 2) != 0 ? lifestyleOfferApiModel2.offerName : str, (i2 & 4) != 0 ? lifestyleOfferApiModel2.imageUrl : str2, (i2 & 8) != 0 ? lifestyleOfferApiModel2.detailImageUrl : str3, (i2 & 16) != 0 ? lifestyleOfferApiModel2.bannerImageUrl : str4, (i2 & 32) != 0 ? lifestyleOfferApiModel2.startDate : l2, (i2 & 64) != 0 ? lifestyleOfferApiModel2.endDate : l3, (i2 & 128) != 0 ? lifestyleOfferApiModel2.daysLeft : l4, (i2 & C11398b.f33139r) != 0 ? lifestyleOfferApiModel2.benefName : str5, (i2 & C11398b.f33140s) != 0 ? lifestyleOfferApiModel2.benefBadge : str6, (i2 & C11398b.f33141t) != 0 ? lifestyleOfferApiModel2.benefitValue : str7, (i2 & C11398b.f33142u) != 0 ? lifestyleOfferApiModel2.categoryId : l5, (i2 & C11398b.f33143v) != 0 ? lifestyleOfferApiModel2.topFlag : bool, (i2 & 8192) != 0 ? lifestyleOfferApiModel2.offerNameLong : str8, (i2 & 16384) != 0 ? lifestyleOfferApiModel2.offerDesc : str9, (i2 & 32768) != 0 ? lifestyleOfferApiModel2.offerDescLong : str10, (i2 & 65536) != 0 ? lifestyleOfferApiModel2.brandName : str11, (i2 & 131072) != 0 ? lifestyleOfferApiModel2.phoneNumber : str12, (i2 & 262144) != 0 ? lifestyleOfferApiModel2.address : str13, (i2 & 524288) != 0 ? lifestyleOfferApiModel2.facebook : str14, (i2 & 1048576) != 0 ? lifestyleOfferApiModel2.website : str15);
    }

    public final Long component1() {
        return this.ofrId;
    }

    public final String component10() {
        return this.benefBadge;
    }

    public final String component11() {
        return this.benefitValue;
    }

    public final Long component12() {
        return this.categoryId;
    }

    public final Boolean component13() {
        return this.topFlag;
    }

    public final String component14() {
        return this.offerNameLong;
    }

    public final String component15() {
        return this.offerDesc;
    }

    public final String component16() {
        return this.offerDescLong;
    }

    public final String component17() {
        return this.brandName;
    }

    public final String component18() {
        return this.phoneNumber;
    }

    public final String component19() {
        return this.address;
    }

    public final String component2() {
        return this.offerName;
    }

    public final String component20() {
        return this.facebook;
    }

    public final String component21() {
        return this.website;
    }

    public final String component3() {
        return this.imageUrl;
    }

    public final String component4() {
        return this.detailImageUrl;
    }

    public final String component5() {
        return this.bannerImageUrl;
    }

    public final Long component6() {
        return this.startDate;
    }

    public final Long component7() {
        return this.endDate;
    }

    public final Long component8() {
        return this.daysLeft;
    }

    public final String component9() {
        return this.benefName;
    }

    public final LifestyleOfferApiModel copy(Long l, String str, String str2, String str3, String str4, Long l2, Long l3, Long l4, String str5, String str6, String str7, Long l5, Boolean bool, String str8, String str9, String str10, String str11, String str12, String str13, String str14, String str15) {
        return new LifestyleOfferApiModel(l, str, str2, str3, str4, l2, l3, l4, str5, str6, str7, l5, bool, str8, str9, str10, str11, str12, str13, str14, str15);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof LifestyleOfferApiModel)) {
            return false;
        }
        LifestyleOfferApiModel lifestyleOfferApiModel = (LifestyleOfferApiModel) obj;
        return C41536l.m120484d(this.ofrId, lifestyleOfferApiModel.ofrId) && C41536l.m120484d(this.offerName, lifestyleOfferApiModel.offerName) && C41536l.m120484d(this.imageUrl, lifestyleOfferApiModel.imageUrl) && C41536l.m120484d(this.detailImageUrl, lifestyleOfferApiModel.detailImageUrl) && C41536l.m120484d(this.bannerImageUrl, lifestyleOfferApiModel.bannerImageUrl) && C41536l.m120484d(this.startDate, lifestyleOfferApiModel.startDate) && C41536l.m120484d(this.endDate, lifestyleOfferApiModel.endDate) && C41536l.m120484d(this.daysLeft, lifestyleOfferApiModel.daysLeft) && C41536l.m120484d(this.benefName, lifestyleOfferApiModel.benefName) && C41536l.m120484d(this.benefBadge, lifestyleOfferApiModel.benefBadge) && C41536l.m120484d(this.benefitValue, lifestyleOfferApiModel.benefitValue) && C41536l.m120484d(this.categoryId, lifestyleOfferApiModel.categoryId) && C41536l.m120484d(this.topFlag, lifestyleOfferApiModel.topFlag) && C41536l.m120484d(this.offerNameLong, lifestyleOfferApiModel.offerNameLong) && C41536l.m120484d(this.offerDesc, lifestyleOfferApiModel.offerDesc) && C41536l.m120484d(this.offerDescLong, lifestyleOfferApiModel.offerDescLong) && C41536l.m120484d(this.brandName, lifestyleOfferApiModel.brandName) && C41536l.m120484d(this.phoneNumber, lifestyleOfferApiModel.phoneNumber) && C41536l.m120484d(this.address, lifestyleOfferApiModel.address) && C41536l.m120484d(this.facebook, lifestyleOfferApiModel.facebook) && C41536l.m120484d(this.website, lifestyleOfferApiModel.website);
    }

    public final String getAddress() {
        return this.address;
    }

    public final String getBannerImageUrl() {
        return this.bannerImageUrl;
    }

    public final String getBenefBadge() {
        return this.benefBadge;
    }

    public final String getBenefName() {
        return this.benefName;
    }

    public final String getBenefitValue() {
        return this.benefitValue;
    }

    public final String getBrandName() {
        return this.brandName;
    }

    public final Long getCategoryId() {
        return this.categoryId;
    }

    public final Long getDaysLeft() {
        return this.daysLeft;
    }

    public final String getDetailImageUrl() {
        return this.detailImageUrl;
    }

    public final Long getEndDate() {
        return this.endDate;
    }

    public final String getFacebook() {
        return this.facebook;
    }

    public final String getImageUrl() {
        return this.imageUrl;
    }

    public final String getOfferDesc() {
        return this.offerDesc;
    }

    public final String getOfferDescLong() {
        return this.offerDescLong;
    }

    public final String getOfferName() {
        return this.offerName;
    }

    public final String getOfferNameLong() {
        return this.offerNameLong;
    }

    public final Long getOfrId() {
        return this.ofrId;
    }

    public final String getPhoneNumber() {
        return this.phoneNumber;
    }

    public final Long getStartDate() {
        return this.startDate;
    }

    public final Boolean getTopFlag() {
        return this.topFlag;
    }

    public final String getWebsite() {
        return this.website;
    }

    public int hashCode() {
        Long l = this.ofrId;
        int i = 0;
        int hashCode = (l == null ? 0 : l.hashCode()) * 31;
        String str = this.offerName;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.imageUrl;
        int hashCode3 = (hashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.detailImageUrl;
        int hashCode4 = (hashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.bannerImageUrl;
        int hashCode5 = (hashCode4 + (str4 == null ? 0 : str4.hashCode())) * 31;
        Long l2 = this.startDate;
        int hashCode6 = (hashCode5 + (l2 == null ? 0 : l2.hashCode())) * 31;
        Long l3 = this.endDate;
        int hashCode7 = (hashCode6 + (l3 == null ? 0 : l3.hashCode())) * 31;
        Long l4 = this.daysLeft;
        int hashCode8 = (hashCode7 + (l4 == null ? 0 : l4.hashCode())) * 31;
        String str5 = this.benefName;
        int hashCode9 = (hashCode8 + (str5 == null ? 0 : str5.hashCode())) * 31;
        String str6 = this.benefBadge;
        int hashCode10 = (hashCode9 + (str6 == null ? 0 : str6.hashCode())) * 31;
        String str7 = this.benefitValue;
        int hashCode11 = (hashCode10 + (str7 == null ? 0 : str7.hashCode())) * 31;
        Long l5 = this.categoryId;
        int hashCode12 = (hashCode11 + (l5 == null ? 0 : l5.hashCode())) * 31;
        Boolean bool = this.topFlag;
        int hashCode13 = (hashCode12 + (bool == null ? 0 : bool.hashCode())) * 31;
        String str8 = this.offerNameLong;
        int hashCode14 = (hashCode13 + (str8 == null ? 0 : str8.hashCode())) * 31;
        String str9 = this.offerDesc;
        int hashCode15 = (hashCode14 + (str9 == null ? 0 : str9.hashCode())) * 31;
        String str10 = this.offerDescLong;
        int hashCode16 = (hashCode15 + (str10 == null ? 0 : str10.hashCode())) * 31;
        String str11 = this.brandName;
        int hashCode17 = (hashCode16 + (str11 == null ? 0 : str11.hashCode())) * 31;
        String str12 = this.phoneNumber;
        int hashCode18 = (hashCode17 + (str12 == null ? 0 : str12.hashCode())) * 31;
        String str13 = this.address;
        int hashCode19 = (hashCode18 + (str13 == null ? 0 : str13.hashCode())) * 31;
        String str14 = this.facebook;
        int hashCode20 = (hashCode19 + (str14 == null ? 0 : str14.hashCode())) * 31;
        String str15 = this.website;
        if (str15 != null) {
            i = str15.hashCode();
        }
        return hashCode20 + i;
    }

    public String toString() {
        Long l = this.ofrId;
        String str = this.offerName;
        String str2 = this.imageUrl;
        String str3 = this.detailImageUrl;
        String str4 = this.bannerImageUrl;
        Long l2 = this.startDate;
        Long l3 = this.endDate;
        Long l4 = this.daysLeft;
        String str5 = this.benefName;
        String str6 = this.benefBadge;
        String str7 = this.benefitValue;
        Long l5 = this.categoryId;
        Boolean bool = this.topFlag;
        String str8 = this.offerNameLong;
        String str9 = this.offerDesc;
        String str10 = this.offerDescLong;
        String str11 = this.brandName;
        String str12 = this.phoneNumber;
        String str13 = this.address;
        String str14 = this.facebook;
        String str15 = this.website;
        return "LifestyleOfferApiModel(ofrId=" + l + ", offerName=" + str + ", imageUrl=" + str2 + ", detailImageUrl=" + str3 + ", bannerImageUrl=" + str4 + ", startDate=" + l2 + ", endDate=" + l3 + ", daysLeft=" + l4 + ", benefName=" + str5 + ", benefBadge=" + str6 + ", benefitValue=" + str7 + ", categoryId=" + l5 + ", topFlag=" + bool + ", offerNameLong=" + str8 + ", offerDesc=" + str9 + ", offerDescLong=" + str10 + ", brandName=" + str11 + ", phoneNumber=" + str12 + ", address=" + str13 + ", facebook=" + str14 + ", website=" + str15 + ")";
    }
}
