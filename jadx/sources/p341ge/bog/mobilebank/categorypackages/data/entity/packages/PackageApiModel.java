package p341ge.bog.mobilebank.categorypackages.data.entity.packages;

import androidx.annotation.Keep;
import com.salesforce.marketingcloud.C11398b;
import java.util.List;
import kotlin.jvm.internal.C41536l;
import p190o1.C7397t;
import p341ge.bog.mobilebank.categorypackages.data.entity.PackageBenefitEntity;

@Keep
/* renamed from: ge.bog.mobilebank.categorypackages.data.entity.packages.PackageApiModel */
public final class PackageApiModel {
    private final PackageDetailsApiModel activePackageDetails;
    private final String advertisementText;
    private final Double annualFeeAmount;
    private final String annualFeeCcy;
    private final long clientKey;
    private final String description;
    private final Double feeAmount;
    private final String feeCcy;
    private final String feePeriodType;
    private final Double initialLimitAmount;
    private final String limitType;
    private final Double monthlyFeeAmount;
    private final String monthlyFeeCcy;
    private final List<PackageBenefitEntity> packageBenefits;
    private final String packageGroup;
    private final String packageName;
    private final PackageStatus packageStatus;
    private final PackageDetailsApiModel pendingPackageDetails;
    private final Integer priority;
    private final String recommendedPackage;
    private final Boolean showDefault;

    public PackageApiModel(long j, String str, String str2, Integer num, String str3, Double d, String str4, Double d2, String str5, Double d3, String str6, PackageStatus packageStatus2, String str7, String str8, Double d4, String str9, String str10, Boolean bool, PackageDetailsApiModel packageDetailsApiModel, PackageDetailsApiModel packageDetailsApiModel2, List<PackageBenefitEntity> list) {
        C41536l.m120489i(str, "packageName");
        this.clientKey = j;
        this.packageName = str;
        this.description = str2;
        this.priority = num;
        this.feePeriodType = str3;
        this.feeAmount = d;
        this.feeCcy = str4;
        this.monthlyFeeAmount = d2;
        this.monthlyFeeCcy = str5;
        this.annualFeeAmount = d3;
        this.annualFeeCcy = str6;
        this.packageStatus = packageStatus2;
        this.recommendedPackage = str7;
        this.limitType = str8;
        this.initialLimitAmount = d4;
        this.packageGroup = str9;
        this.advertisementText = str10;
        this.showDefault = bool;
        this.activePackageDetails = packageDetailsApiModel;
        this.pendingPackageDetails = packageDetailsApiModel2;
        this.packageBenefits = list;
    }

    public static /* synthetic */ PackageApiModel copy$default(PackageApiModel packageApiModel, long j, String str, String str2, Integer num, String str3, Double d, String str4, Double d2, String str5, Double d3, String str6, PackageStatus packageStatus2, String str7, String str8, Double d4, String str9, String str10, Boolean bool, PackageDetailsApiModel packageDetailsApiModel, PackageDetailsApiModel packageDetailsApiModel2, List list, int i, Object obj) {
        PackageApiModel packageApiModel2 = packageApiModel;
        int i2 = i;
        return packageApiModel.copy((i2 & 1) != 0 ? packageApiModel2.clientKey : j, (i2 & 2) != 0 ? packageApiModel2.packageName : str, (i2 & 4) != 0 ? packageApiModel2.description : str2, (i2 & 8) != 0 ? packageApiModel2.priority : num, (i2 & 16) != 0 ? packageApiModel2.feePeriodType : str3, (i2 & 32) != 0 ? packageApiModel2.feeAmount : d, (i2 & 64) != 0 ? packageApiModel2.feeCcy : str4, (i2 & 128) != 0 ? packageApiModel2.monthlyFeeAmount : d2, (i2 & C11398b.f33139r) != 0 ? packageApiModel2.monthlyFeeCcy : str5, (i2 & C11398b.f33140s) != 0 ? packageApiModel2.annualFeeAmount : d3, (i2 & C11398b.f33141t) != 0 ? packageApiModel2.annualFeeCcy : str6, (i2 & C11398b.f33142u) != 0 ? packageApiModel2.packageStatus : packageStatus2, (i2 & C11398b.f33143v) != 0 ? packageApiModel2.recommendedPackage : str7, (i2 & 8192) != 0 ? packageApiModel2.limitType : str8, (i2 & 16384) != 0 ? packageApiModel2.initialLimitAmount : d4, (i2 & 32768) != 0 ? packageApiModel2.packageGroup : str9, (i2 & 65536) != 0 ? packageApiModel2.advertisementText : str10, (i2 & 131072) != 0 ? packageApiModel2.showDefault : bool, (i2 & 262144) != 0 ? packageApiModel2.activePackageDetails : packageDetailsApiModel, (i2 & 524288) != 0 ? packageApiModel2.pendingPackageDetails : packageDetailsApiModel2, (i2 & 1048576) != 0 ? packageApiModel2.packageBenefits : list);
    }

    public final long component1() {
        return this.clientKey;
    }

    public final Double component10() {
        return this.annualFeeAmount;
    }

    public final String component11() {
        return this.annualFeeCcy;
    }

    public final PackageStatus component12() {
        return this.packageStatus;
    }

    public final String component13() {
        return this.recommendedPackage;
    }

    public final String component14() {
        return this.limitType;
    }

    public final Double component15() {
        return this.initialLimitAmount;
    }

    public final String component16() {
        return this.packageGroup;
    }

    public final String component17() {
        return this.advertisementText;
    }

    public final Boolean component18() {
        return this.showDefault;
    }

    public final PackageDetailsApiModel component19() {
        return this.activePackageDetails;
    }

    public final String component2() {
        return this.packageName;
    }

    public final PackageDetailsApiModel component20() {
        return this.pendingPackageDetails;
    }

    public final List<PackageBenefitEntity> component21() {
        return this.packageBenefits;
    }

    public final String component3() {
        return this.description;
    }

    public final Integer component4() {
        return this.priority;
    }

    public final String component5() {
        return this.feePeriodType;
    }

    public final Double component6() {
        return this.feeAmount;
    }

    public final String component7() {
        return this.feeCcy;
    }

    public final Double component8() {
        return this.monthlyFeeAmount;
    }

    public final String component9() {
        return this.monthlyFeeCcy;
    }

    public final PackageApiModel copy(long j, String str, String str2, Integer num, String str3, Double d, String str4, Double d2, String str5, Double d3, String str6, PackageStatus packageStatus2, String str7, String str8, Double d4, String str9, String str10, Boolean bool, PackageDetailsApiModel packageDetailsApiModel, PackageDetailsApiModel packageDetailsApiModel2, List<PackageBenefitEntity> list) {
        long j2 = j;
        C41536l.m120489i(str, "packageName");
        return new PackageApiModel(j, str, str2, num, str3, d, str4, d2, str5, d3, str6, packageStatus2, str7, str8, d4, str9, str10, bool, packageDetailsApiModel, packageDetailsApiModel2, list);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PackageApiModel)) {
            return false;
        }
        PackageApiModel packageApiModel = (PackageApiModel) obj;
        return this.clientKey == packageApiModel.clientKey && C41536l.m120484d(this.packageName, packageApiModel.packageName) && C41536l.m120484d(this.description, packageApiModel.description) && C41536l.m120484d(this.priority, packageApiModel.priority) && C41536l.m120484d(this.feePeriodType, packageApiModel.feePeriodType) && C41536l.m120484d(this.feeAmount, packageApiModel.feeAmount) && C41536l.m120484d(this.feeCcy, packageApiModel.feeCcy) && C41536l.m120484d(this.monthlyFeeAmount, packageApiModel.monthlyFeeAmount) && C41536l.m120484d(this.monthlyFeeCcy, packageApiModel.monthlyFeeCcy) && C41536l.m120484d(this.annualFeeAmount, packageApiModel.annualFeeAmount) && C41536l.m120484d(this.annualFeeCcy, packageApiModel.annualFeeCcy) && this.packageStatus == packageApiModel.packageStatus && C41536l.m120484d(this.recommendedPackage, packageApiModel.recommendedPackage) && C41536l.m120484d(this.limitType, packageApiModel.limitType) && C41536l.m120484d(this.initialLimitAmount, packageApiModel.initialLimitAmount) && C41536l.m120484d(this.packageGroup, packageApiModel.packageGroup) && C41536l.m120484d(this.advertisementText, packageApiModel.advertisementText) && C41536l.m120484d(this.showDefault, packageApiModel.showDefault) && C41536l.m120484d(this.activePackageDetails, packageApiModel.activePackageDetails) && C41536l.m120484d(this.pendingPackageDetails, packageApiModel.pendingPackageDetails) && C41536l.m120484d(this.packageBenefits, packageApiModel.packageBenefits);
    }

    public final PackageDetailsApiModel getActivePackageDetails() {
        return this.activePackageDetails;
    }

    public final String getAdvertisementText() {
        return this.advertisementText;
    }

    public final Double getAnnualFeeAmount() {
        return this.annualFeeAmount;
    }

    public final String getAnnualFeeCcy() {
        return this.annualFeeCcy;
    }

    public final long getClientKey() {
        return this.clientKey;
    }

    public final String getDescription() {
        return this.description;
    }

    public final Double getFeeAmount() {
        return this.feeAmount;
    }

    public final String getFeeCcy() {
        return this.feeCcy;
    }

    public final String getFeePeriodType() {
        return this.feePeriodType;
    }

    public final Double getInitialLimitAmount() {
        return this.initialLimitAmount;
    }

    public final String getLimitType() {
        return this.limitType;
    }

    public final Double getMonthlyFeeAmount() {
        return this.monthlyFeeAmount;
    }

    public final String getMonthlyFeeCcy() {
        return this.monthlyFeeCcy;
    }

    public final List<PackageBenefitEntity> getPackageBenefits() {
        return this.packageBenefits;
    }

    public final String getPackageGroup() {
        return this.packageGroup;
    }

    public final String getPackageName() {
        return this.packageName;
    }

    public final PackageStatus getPackageStatus() {
        return this.packageStatus;
    }

    public final PackageDetailsApiModel getPendingPackageDetails() {
        return this.pendingPackageDetails;
    }

    public final Integer getPriority() {
        return this.priority;
    }

    public final String getRecommendedPackage() {
        return this.recommendedPackage;
    }

    public final Boolean getShowDefault() {
        return this.showDefault;
    }

    public int hashCode() {
        int a = ((C7397t.m28148a(this.clientKey) * 31) + this.packageName.hashCode()) * 31;
        String str = this.description;
        int i = 0;
        int hashCode = (a + (str == null ? 0 : str.hashCode())) * 31;
        Integer num = this.priority;
        int hashCode2 = (hashCode + (num == null ? 0 : num.hashCode())) * 31;
        String str2 = this.feePeriodType;
        int hashCode3 = (hashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        Double d = this.feeAmount;
        int hashCode4 = (hashCode3 + (d == null ? 0 : d.hashCode())) * 31;
        String str3 = this.feeCcy;
        int hashCode5 = (hashCode4 + (str3 == null ? 0 : str3.hashCode())) * 31;
        Double d2 = this.monthlyFeeAmount;
        int hashCode6 = (hashCode5 + (d2 == null ? 0 : d2.hashCode())) * 31;
        String str4 = this.monthlyFeeCcy;
        int hashCode7 = (hashCode6 + (str4 == null ? 0 : str4.hashCode())) * 31;
        Double d3 = this.annualFeeAmount;
        int hashCode8 = (hashCode7 + (d3 == null ? 0 : d3.hashCode())) * 31;
        String str5 = this.annualFeeCcy;
        int hashCode9 = (hashCode8 + (str5 == null ? 0 : str5.hashCode())) * 31;
        PackageStatus packageStatus2 = this.packageStatus;
        int hashCode10 = (hashCode9 + (packageStatus2 == null ? 0 : packageStatus2.hashCode())) * 31;
        String str6 = this.recommendedPackage;
        int hashCode11 = (hashCode10 + (str6 == null ? 0 : str6.hashCode())) * 31;
        String str7 = this.limitType;
        int hashCode12 = (hashCode11 + (str7 == null ? 0 : str7.hashCode())) * 31;
        Double d4 = this.initialLimitAmount;
        int hashCode13 = (hashCode12 + (d4 == null ? 0 : d4.hashCode())) * 31;
        String str8 = this.packageGroup;
        int hashCode14 = (hashCode13 + (str8 == null ? 0 : str8.hashCode())) * 31;
        String str9 = this.advertisementText;
        int hashCode15 = (hashCode14 + (str9 == null ? 0 : str9.hashCode())) * 31;
        Boolean bool = this.showDefault;
        int hashCode16 = (hashCode15 + (bool == null ? 0 : bool.hashCode())) * 31;
        PackageDetailsApiModel packageDetailsApiModel = this.activePackageDetails;
        int hashCode17 = (hashCode16 + (packageDetailsApiModel == null ? 0 : packageDetailsApiModel.hashCode())) * 31;
        PackageDetailsApiModel packageDetailsApiModel2 = this.pendingPackageDetails;
        int hashCode18 = (hashCode17 + (packageDetailsApiModel2 == null ? 0 : packageDetailsApiModel2.hashCode())) * 31;
        List<PackageBenefitEntity> list = this.packageBenefits;
        if (list != null) {
            i = list.hashCode();
        }
        return hashCode18 + i;
    }

    public String toString() {
        long j = this.clientKey;
        String str = this.packageName;
        String str2 = this.description;
        Integer num = this.priority;
        String str3 = this.feePeriodType;
        Double d = this.feeAmount;
        String str4 = this.feeCcy;
        Double d2 = this.monthlyFeeAmount;
        String str5 = this.monthlyFeeCcy;
        Double d3 = this.annualFeeAmount;
        String str6 = this.annualFeeCcy;
        PackageStatus packageStatus2 = this.packageStatus;
        String str7 = this.recommendedPackage;
        String str8 = this.limitType;
        Double d4 = this.initialLimitAmount;
        String str9 = this.packageGroup;
        String str10 = this.advertisementText;
        Boolean bool = this.showDefault;
        PackageDetailsApiModel packageDetailsApiModel = this.activePackageDetails;
        PackageDetailsApiModel packageDetailsApiModel2 = this.pendingPackageDetails;
        List<PackageBenefitEntity> list = this.packageBenefits;
        return "PackageApiModel(clientKey=" + j + ", packageName=" + str + ", description=" + str2 + ", priority=" + num + ", feePeriodType=" + str3 + ", feeAmount=" + d + ", feeCcy=" + str4 + ", monthlyFeeAmount=" + d2 + ", monthlyFeeCcy=" + str5 + ", annualFeeAmount=" + d3 + ", annualFeeCcy=" + str6 + ", packageStatus=" + packageStatus2 + ", recommendedPackage=" + str7 + ", limitType=" + str8 + ", initialLimitAmount=" + d4 + ", packageGroup=" + str9 + ", advertisementText=" + str10 + ", showDefault=" + bool + ", activePackageDetails=" + packageDetailsApiModel + ", pendingPackageDetails=" + packageDetailsApiModel2 + ", packageBenefits=" + list + ")";
    }
}
