package p341ge.bog.mobilebank.categorypackages.data.entity;

import androidx.annotation.Keep;
import com.salesforce.marketingcloud.C11398b;
import kotlin.jvm.internal.C41536l;
import p341ge.bog.mobilebank.cleanarch.data.common.entity.YesNoApiEntity;
import p341ge.bog.mobilebank.shared.data.ExternalFileEntity;

@Keep
/* renamed from: ge.bog.mobilebank.categorypackages.data.entity.PackageBenefitEntity */
public final class PackageBenefitEntity {
    private final String activeBadgeSourceKey;
    private final String activeDeepLinkParams;
    private final Integer benefTypeId;
    private final YesNoApiEntity benefitBadge;
    private final String benefitDictionaryKey;
    private final String benefitIconSubProduct;
    private final String benefitTypeName;
    private final String channelCode;
    private final String conditionsUrl;
    private final String deepLinkParams;
    private final ExternalFileEntity externalFile;

    /* renamed from: id */
    private final Integer f42159id;
    private final Integer orderNo;
    private final Integer packageId;
    private final String packageName;
    private final String pageName;
    private final String productStatus;
    private final String standardConditionDictionaryKey;
    private final String valueDictionaryKey;

    public PackageBenefitEntity(String str, String str2, Integer num, YesNoApiEntity yesNoApiEntity, String str3, String str4, String str5, String str6, String str7, ExternalFileEntity externalFileEntity, Integer num2, Integer num3, Integer num4, String str8, String str9, String str10, String str11, String str12, String str13) {
        this.activeBadgeSourceKey = str;
        this.activeDeepLinkParams = str2;
        this.benefTypeId = num;
        this.benefitBadge = yesNoApiEntity;
        this.benefitDictionaryKey = str3;
        this.benefitIconSubProduct = str4;
        this.benefitTypeName = str5;
        this.channelCode = str6;
        this.deepLinkParams = str7;
        this.externalFile = externalFileEntity;
        this.f42159id = num2;
        this.orderNo = num3;
        this.packageId = num4;
        this.packageName = str8;
        this.pageName = str9;
        this.productStatus = str10;
        this.valueDictionaryKey = str11;
        this.standardConditionDictionaryKey = str12;
        this.conditionsUrl = str13;
    }

    public static /* synthetic */ PackageBenefitEntity copy$default(PackageBenefitEntity packageBenefitEntity, String str, String str2, Integer num, YesNoApiEntity yesNoApiEntity, String str3, String str4, String str5, String str6, String str7, ExternalFileEntity externalFileEntity, Integer num2, Integer num3, Integer num4, String str8, String str9, String str10, String str11, String str12, String str13, int i, Object obj) {
        PackageBenefitEntity packageBenefitEntity2 = packageBenefitEntity;
        int i2 = i;
        return packageBenefitEntity.copy((i2 & 1) != 0 ? packageBenefitEntity2.activeBadgeSourceKey : str, (i2 & 2) != 0 ? packageBenefitEntity2.activeDeepLinkParams : str2, (i2 & 4) != 0 ? packageBenefitEntity2.benefTypeId : num, (i2 & 8) != 0 ? packageBenefitEntity2.benefitBadge : yesNoApiEntity, (i2 & 16) != 0 ? packageBenefitEntity2.benefitDictionaryKey : str3, (i2 & 32) != 0 ? packageBenefitEntity2.benefitIconSubProduct : str4, (i2 & 64) != 0 ? packageBenefitEntity2.benefitTypeName : str5, (i2 & 128) != 0 ? packageBenefitEntity2.channelCode : str6, (i2 & C11398b.f33139r) != 0 ? packageBenefitEntity2.deepLinkParams : str7, (i2 & C11398b.f33140s) != 0 ? packageBenefitEntity2.externalFile : externalFileEntity, (i2 & C11398b.f33141t) != 0 ? packageBenefitEntity2.f42159id : num2, (i2 & C11398b.f33142u) != 0 ? packageBenefitEntity2.orderNo : num3, (i2 & C11398b.f33143v) != 0 ? packageBenefitEntity2.packageId : num4, (i2 & 8192) != 0 ? packageBenefitEntity2.packageName : str8, (i2 & 16384) != 0 ? packageBenefitEntity2.pageName : str9, (i2 & 32768) != 0 ? packageBenefitEntity2.productStatus : str10, (i2 & 65536) != 0 ? packageBenefitEntity2.valueDictionaryKey : str11, (i2 & 131072) != 0 ? packageBenefitEntity2.standardConditionDictionaryKey : str12, (i2 & 262144) != 0 ? packageBenefitEntity2.conditionsUrl : str13);
    }

    public final String component1() {
        return this.activeBadgeSourceKey;
    }

    public final ExternalFileEntity component10() {
        return this.externalFile;
    }

    public final Integer component11() {
        return this.f42159id;
    }

    public final Integer component12() {
        return this.orderNo;
    }

    public final Integer component13() {
        return this.packageId;
    }

    public final String component14() {
        return this.packageName;
    }

    public final String component15() {
        return this.pageName;
    }

    public final String component16() {
        return this.productStatus;
    }

    public final String component17() {
        return this.valueDictionaryKey;
    }

    public final String component18() {
        return this.standardConditionDictionaryKey;
    }

    public final String component19() {
        return this.conditionsUrl;
    }

    public final String component2() {
        return this.activeDeepLinkParams;
    }

    public final Integer component3() {
        return this.benefTypeId;
    }

    public final YesNoApiEntity component4() {
        return this.benefitBadge;
    }

    public final String component5() {
        return this.benefitDictionaryKey;
    }

    public final String component6() {
        return this.benefitIconSubProduct;
    }

    public final String component7() {
        return this.benefitTypeName;
    }

    public final String component8() {
        return this.channelCode;
    }

    public final String component9() {
        return this.deepLinkParams;
    }

    public final PackageBenefitEntity copy(String str, String str2, Integer num, YesNoApiEntity yesNoApiEntity, String str3, String str4, String str5, String str6, String str7, ExternalFileEntity externalFileEntity, Integer num2, Integer num3, Integer num4, String str8, String str9, String str10, String str11, String str12, String str13) {
        return new PackageBenefitEntity(str, str2, num, yesNoApiEntity, str3, str4, str5, str6, str7, externalFileEntity, num2, num3, num4, str8, str9, str10, str11, str12, str13);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PackageBenefitEntity)) {
            return false;
        }
        PackageBenefitEntity packageBenefitEntity = (PackageBenefitEntity) obj;
        return C41536l.m120484d(this.activeBadgeSourceKey, packageBenefitEntity.activeBadgeSourceKey) && C41536l.m120484d(this.activeDeepLinkParams, packageBenefitEntity.activeDeepLinkParams) && C41536l.m120484d(this.benefTypeId, packageBenefitEntity.benefTypeId) && this.benefitBadge == packageBenefitEntity.benefitBadge && C41536l.m120484d(this.benefitDictionaryKey, packageBenefitEntity.benefitDictionaryKey) && C41536l.m120484d(this.benefitIconSubProduct, packageBenefitEntity.benefitIconSubProduct) && C41536l.m120484d(this.benefitTypeName, packageBenefitEntity.benefitTypeName) && C41536l.m120484d(this.channelCode, packageBenefitEntity.channelCode) && C41536l.m120484d(this.deepLinkParams, packageBenefitEntity.deepLinkParams) && C41536l.m120484d(this.externalFile, packageBenefitEntity.externalFile) && C41536l.m120484d(this.f42159id, packageBenefitEntity.f42159id) && C41536l.m120484d(this.orderNo, packageBenefitEntity.orderNo) && C41536l.m120484d(this.packageId, packageBenefitEntity.packageId) && C41536l.m120484d(this.packageName, packageBenefitEntity.packageName) && C41536l.m120484d(this.pageName, packageBenefitEntity.pageName) && C41536l.m120484d(this.productStatus, packageBenefitEntity.productStatus) && C41536l.m120484d(this.valueDictionaryKey, packageBenefitEntity.valueDictionaryKey) && C41536l.m120484d(this.standardConditionDictionaryKey, packageBenefitEntity.standardConditionDictionaryKey) && C41536l.m120484d(this.conditionsUrl, packageBenefitEntity.conditionsUrl);
    }

    public final String getActiveBadgeSourceKey() {
        return this.activeBadgeSourceKey;
    }

    public final String getActiveDeepLinkParams() {
        return this.activeDeepLinkParams;
    }

    public final Integer getBenefTypeId() {
        return this.benefTypeId;
    }

    public final YesNoApiEntity getBenefitBadge() {
        return this.benefitBadge;
    }

    public final String getBenefitDictionaryKey() {
        return this.benefitDictionaryKey;
    }

    public final String getBenefitIconSubProduct() {
        return this.benefitIconSubProduct;
    }

    public final String getBenefitTypeName() {
        return this.benefitTypeName;
    }

    public final String getChannelCode() {
        return this.channelCode;
    }

    public final String getConditionsUrl() {
        return this.conditionsUrl;
    }

    public final String getDeepLinkParams() {
        return this.deepLinkParams;
    }

    public final ExternalFileEntity getExternalFile() {
        return this.externalFile;
    }

    public final Integer getId() {
        return this.f42159id;
    }

    public final Integer getOrderNo() {
        return this.orderNo;
    }

    public final Integer getPackageId() {
        return this.packageId;
    }

    public final String getPackageName() {
        return this.packageName;
    }

    public final String getPageName() {
        return this.pageName;
    }

    public final String getProductStatus() {
        return this.productStatus;
    }

    public final String getStandardConditionDictionaryKey() {
        return this.standardConditionDictionaryKey;
    }

    public final String getValueDictionaryKey() {
        return this.valueDictionaryKey;
    }

    public int hashCode() {
        String str = this.activeBadgeSourceKey;
        int i = 0;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.activeDeepLinkParams;
        int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        Integer num = this.benefTypeId;
        int hashCode3 = (hashCode2 + (num == null ? 0 : num.hashCode())) * 31;
        YesNoApiEntity yesNoApiEntity = this.benefitBadge;
        int hashCode4 = (hashCode3 + (yesNoApiEntity == null ? 0 : yesNoApiEntity.hashCode())) * 31;
        String str3 = this.benefitDictionaryKey;
        int hashCode5 = (hashCode4 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.benefitIconSubProduct;
        int hashCode6 = (hashCode5 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.benefitTypeName;
        int hashCode7 = (hashCode6 + (str5 == null ? 0 : str5.hashCode())) * 31;
        String str6 = this.channelCode;
        int hashCode8 = (hashCode7 + (str6 == null ? 0 : str6.hashCode())) * 31;
        String str7 = this.deepLinkParams;
        int hashCode9 = (hashCode8 + (str7 == null ? 0 : str7.hashCode())) * 31;
        ExternalFileEntity externalFileEntity = this.externalFile;
        int hashCode10 = (hashCode9 + (externalFileEntity == null ? 0 : externalFileEntity.hashCode())) * 31;
        Integer num2 = this.f42159id;
        int hashCode11 = (hashCode10 + (num2 == null ? 0 : num2.hashCode())) * 31;
        Integer num3 = this.orderNo;
        int hashCode12 = (hashCode11 + (num3 == null ? 0 : num3.hashCode())) * 31;
        Integer num4 = this.packageId;
        int hashCode13 = (hashCode12 + (num4 == null ? 0 : num4.hashCode())) * 31;
        String str8 = this.packageName;
        int hashCode14 = (hashCode13 + (str8 == null ? 0 : str8.hashCode())) * 31;
        String str9 = this.pageName;
        int hashCode15 = (hashCode14 + (str9 == null ? 0 : str9.hashCode())) * 31;
        String str10 = this.productStatus;
        int hashCode16 = (hashCode15 + (str10 == null ? 0 : str10.hashCode())) * 31;
        String str11 = this.valueDictionaryKey;
        int hashCode17 = (hashCode16 + (str11 == null ? 0 : str11.hashCode())) * 31;
        String str12 = this.standardConditionDictionaryKey;
        int hashCode18 = (hashCode17 + (str12 == null ? 0 : str12.hashCode())) * 31;
        String str13 = this.conditionsUrl;
        if (str13 != null) {
            i = str13.hashCode();
        }
        return hashCode18 + i;
    }

    public String toString() {
        String str = this.activeBadgeSourceKey;
        String str2 = this.activeDeepLinkParams;
        Integer num = this.benefTypeId;
        YesNoApiEntity yesNoApiEntity = this.benefitBadge;
        String str3 = this.benefitDictionaryKey;
        String str4 = this.benefitIconSubProduct;
        String str5 = this.benefitTypeName;
        String str6 = this.channelCode;
        String str7 = this.deepLinkParams;
        ExternalFileEntity externalFileEntity = this.externalFile;
        Integer num2 = this.f42159id;
        Integer num3 = this.orderNo;
        Integer num4 = this.packageId;
        String str8 = this.packageName;
        String str9 = this.pageName;
        String str10 = this.productStatus;
        String str11 = this.valueDictionaryKey;
        String str12 = this.standardConditionDictionaryKey;
        String str13 = this.conditionsUrl;
        return "PackageBenefitEntity(activeBadgeSourceKey=" + str + ", activeDeepLinkParams=" + str2 + ", benefTypeId=" + num + ", benefitBadge=" + yesNoApiEntity + ", benefitDictionaryKey=" + str3 + ", benefitIconSubProduct=" + str4 + ", benefitTypeName=" + str5 + ", channelCode=" + str6 + ", deepLinkParams=" + str7 + ", externalFile=" + externalFileEntity + ", id=" + num2 + ", orderNo=" + num3 + ", packageId=" + num4 + ", packageName=" + str8 + ", pageName=" + str9 + ", productStatus=" + str10 + ", valueDictionaryKey=" + str11 + ", standardConditionDictionaryKey=" + str12 + ", conditionsUrl=" + str13 + ")";
    }
}
