package p341ge.bog.mobilebank.categorypackages.data.entity.packages;

import androidx.annotation.Keep;
import com.salesforce.marketingcloud.C11398b;
import kotlin.jvm.internal.C41536l;
import p190o1.C7397t;
import p341ge.bog.mobilebank.cleanarch.data.common.entity.YesNoApiEntity;

@Keep
/* renamed from: ge.bog.mobilebank.categorypackages.data.entity.packages.PackageDetailsApiModel */
public final class PackageDetailsApiModel {
    private final YesNoApiEntity closable;
    private final Long closePackageId;
    private final YesNoApiEntity displayActivePackageChange;
    private final YesNoApiEntity displayStandardFee;
    private final YesNoApiEntity displayTransactionStatistics;
    private final Long endDate;
    private final Double feeAmount;
    private final String feeCcy;
    private final Double feeOverdueAmount;
    private final String feePeriodType;
    private final Long graceEndDate;
    private final Double initialLimitAmount;
    private final String limitType;
    private final Long nextFeeGenDate;
    private final String packageDesc;
    private final long packageId;
    private final String packageName;
    private final Integer priority;
    private final Long startDate;
    private final PackageStatus status;

    public PackageDetailsApiModel(long j, String str, String str2, String str3, String str4, Double d, String str5, Double d2, Long l, Long l2, Long l3, Double d3, Long l4, PackageStatus packageStatus, Integer num, YesNoApiEntity yesNoApiEntity, YesNoApiEntity yesNoApiEntity2, YesNoApiEntity yesNoApiEntity3, YesNoApiEntity yesNoApiEntity4, Long l5) {
        C41536l.m120489i(str, "packageName");
        this.packageId = j;
        this.packageName = str;
        this.packageDesc = str2;
        this.feePeriodType = str3;
        this.feeCcy = str4;
        this.feeAmount = d;
        this.limitType = str5;
        this.initialLimitAmount = d2;
        this.startDate = l;
        this.endDate = l2;
        this.nextFeeGenDate = l3;
        this.feeOverdueAmount = d3;
        this.graceEndDate = l4;
        this.status = packageStatus;
        this.priority = num;
        this.displayActivePackageChange = yesNoApiEntity;
        this.displayStandardFee = yesNoApiEntity2;
        this.displayTransactionStatistics = yesNoApiEntity3;
        this.closable = yesNoApiEntity4;
        this.closePackageId = l5;
    }

    public static /* synthetic */ PackageDetailsApiModel copy$default(PackageDetailsApiModel packageDetailsApiModel, long j, String str, String str2, String str3, String str4, Double d, String str5, Double d2, Long l, Long l2, Long l3, Double d3, Long l4, PackageStatus packageStatus, Integer num, YesNoApiEntity yesNoApiEntity, YesNoApiEntity yesNoApiEntity2, YesNoApiEntity yesNoApiEntity3, YesNoApiEntity yesNoApiEntity4, Long l5, int i, Object obj) {
        PackageDetailsApiModel packageDetailsApiModel2 = packageDetailsApiModel;
        int i2 = i;
        return packageDetailsApiModel.copy((i2 & 1) != 0 ? packageDetailsApiModel2.packageId : j, (i2 & 2) != 0 ? packageDetailsApiModel2.packageName : str, (i2 & 4) != 0 ? packageDetailsApiModel2.packageDesc : str2, (i2 & 8) != 0 ? packageDetailsApiModel2.feePeriodType : str3, (i2 & 16) != 0 ? packageDetailsApiModel2.feeCcy : str4, (i2 & 32) != 0 ? packageDetailsApiModel2.feeAmount : d, (i2 & 64) != 0 ? packageDetailsApiModel2.limitType : str5, (i2 & 128) != 0 ? packageDetailsApiModel2.initialLimitAmount : d2, (i2 & C11398b.f33139r) != 0 ? packageDetailsApiModel2.startDate : l, (i2 & C11398b.f33140s) != 0 ? packageDetailsApiModel2.endDate : l2, (i2 & C11398b.f33141t) != 0 ? packageDetailsApiModel2.nextFeeGenDate : l3, (i2 & C11398b.f33142u) != 0 ? packageDetailsApiModel2.feeOverdueAmount : d3, (i2 & C11398b.f33143v) != 0 ? packageDetailsApiModel2.graceEndDate : l4, (i2 & 8192) != 0 ? packageDetailsApiModel2.status : packageStatus, (i2 & 16384) != 0 ? packageDetailsApiModel2.priority : num, (i2 & 32768) != 0 ? packageDetailsApiModel2.displayActivePackageChange : yesNoApiEntity, (i2 & 65536) != 0 ? packageDetailsApiModel2.displayStandardFee : yesNoApiEntity2, (i2 & 131072) != 0 ? packageDetailsApiModel2.displayTransactionStatistics : yesNoApiEntity3, (i2 & 262144) != 0 ? packageDetailsApiModel2.closable : yesNoApiEntity4, (i2 & 524288) != 0 ? packageDetailsApiModel2.closePackageId : l5);
    }

    public final long component1() {
        return this.packageId;
    }

    public final Long component10() {
        return this.endDate;
    }

    public final Long component11() {
        return this.nextFeeGenDate;
    }

    public final Double component12() {
        return this.feeOverdueAmount;
    }

    public final Long component13() {
        return this.graceEndDate;
    }

    public final PackageStatus component14() {
        return this.status;
    }

    public final Integer component15() {
        return this.priority;
    }

    public final YesNoApiEntity component16() {
        return this.displayActivePackageChange;
    }

    public final YesNoApiEntity component17() {
        return this.displayStandardFee;
    }

    public final YesNoApiEntity component18() {
        return this.displayTransactionStatistics;
    }

    public final YesNoApiEntity component19() {
        return this.closable;
    }

    public final String component2() {
        return this.packageName;
    }

    public final Long component20() {
        return this.closePackageId;
    }

    public final String component3() {
        return this.packageDesc;
    }

    public final String component4() {
        return this.feePeriodType;
    }

    public final String component5() {
        return this.feeCcy;
    }

    public final Double component6() {
        return this.feeAmount;
    }

    public final String component7() {
        return this.limitType;
    }

    public final Double component8() {
        return this.initialLimitAmount;
    }

    public final Long component9() {
        return this.startDate;
    }

    public final PackageDetailsApiModel copy(long j, String str, String str2, String str3, String str4, Double d, String str5, Double d2, Long l, Long l2, Long l3, Double d3, Long l4, PackageStatus packageStatus, Integer num, YesNoApiEntity yesNoApiEntity, YesNoApiEntity yesNoApiEntity2, YesNoApiEntity yesNoApiEntity3, YesNoApiEntity yesNoApiEntity4, Long l5) {
        long j2 = j;
        C41536l.m120489i(str, "packageName");
        return new PackageDetailsApiModel(j, str, str2, str3, str4, d, str5, d2, l, l2, l3, d3, l4, packageStatus, num, yesNoApiEntity, yesNoApiEntity2, yesNoApiEntity3, yesNoApiEntity4, l5);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PackageDetailsApiModel)) {
            return false;
        }
        PackageDetailsApiModel packageDetailsApiModel = (PackageDetailsApiModel) obj;
        return this.packageId == packageDetailsApiModel.packageId && C41536l.m120484d(this.packageName, packageDetailsApiModel.packageName) && C41536l.m120484d(this.packageDesc, packageDetailsApiModel.packageDesc) && C41536l.m120484d(this.feePeriodType, packageDetailsApiModel.feePeriodType) && C41536l.m120484d(this.feeCcy, packageDetailsApiModel.feeCcy) && C41536l.m120484d(this.feeAmount, packageDetailsApiModel.feeAmount) && C41536l.m120484d(this.limitType, packageDetailsApiModel.limitType) && C41536l.m120484d(this.initialLimitAmount, packageDetailsApiModel.initialLimitAmount) && C41536l.m120484d(this.startDate, packageDetailsApiModel.startDate) && C41536l.m120484d(this.endDate, packageDetailsApiModel.endDate) && C41536l.m120484d(this.nextFeeGenDate, packageDetailsApiModel.nextFeeGenDate) && C41536l.m120484d(this.feeOverdueAmount, packageDetailsApiModel.feeOverdueAmount) && C41536l.m120484d(this.graceEndDate, packageDetailsApiModel.graceEndDate) && this.status == packageDetailsApiModel.status && C41536l.m120484d(this.priority, packageDetailsApiModel.priority) && this.displayActivePackageChange == packageDetailsApiModel.displayActivePackageChange && this.displayStandardFee == packageDetailsApiModel.displayStandardFee && this.displayTransactionStatistics == packageDetailsApiModel.displayTransactionStatistics && this.closable == packageDetailsApiModel.closable && C41536l.m120484d(this.closePackageId, packageDetailsApiModel.closePackageId);
    }

    public final YesNoApiEntity getClosable() {
        return this.closable;
    }

    public final Long getClosePackageId() {
        return this.closePackageId;
    }

    public final YesNoApiEntity getDisplayActivePackageChange() {
        return this.displayActivePackageChange;
    }

    public final YesNoApiEntity getDisplayStandardFee() {
        return this.displayStandardFee;
    }

    public final YesNoApiEntity getDisplayTransactionStatistics() {
        return this.displayTransactionStatistics;
    }

    public final Long getEndDate() {
        return this.endDate;
    }

    public final Double getFeeAmount() {
        return this.feeAmount;
    }

    public final String getFeeCcy() {
        return this.feeCcy;
    }

    public final Double getFeeOverdueAmount() {
        return this.feeOverdueAmount;
    }

    public final String getFeePeriodType() {
        return this.feePeriodType;
    }

    public final Long getGraceEndDate() {
        return this.graceEndDate;
    }

    public final Double getInitialLimitAmount() {
        return this.initialLimitAmount;
    }

    public final String getLimitType() {
        return this.limitType;
    }

    public final Long getNextFeeGenDate() {
        return this.nextFeeGenDate;
    }

    public final String getPackageDesc() {
        return this.packageDesc;
    }

    public final long getPackageId() {
        return this.packageId;
    }

    public final String getPackageName() {
        return this.packageName;
    }

    public final Integer getPriority() {
        return this.priority;
    }

    public final Long getStartDate() {
        return this.startDate;
    }

    public final PackageStatus getStatus() {
        return this.status;
    }

    public int hashCode() {
        int a = ((C7397t.m28148a(this.packageId) * 31) + this.packageName.hashCode()) * 31;
        String str = this.packageDesc;
        int i = 0;
        int hashCode = (a + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.feePeriodType;
        int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.feeCcy;
        int hashCode3 = (hashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        Double d = this.feeAmount;
        int hashCode4 = (hashCode3 + (d == null ? 0 : d.hashCode())) * 31;
        String str4 = this.limitType;
        int hashCode5 = (hashCode4 + (str4 == null ? 0 : str4.hashCode())) * 31;
        Double d2 = this.initialLimitAmount;
        int hashCode6 = (hashCode5 + (d2 == null ? 0 : d2.hashCode())) * 31;
        Long l = this.startDate;
        int hashCode7 = (hashCode6 + (l == null ? 0 : l.hashCode())) * 31;
        Long l2 = this.endDate;
        int hashCode8 = (hashCode7 + (l2 == null ? 0 : l2.hashCode())) * 31;
        Long l3 = this.nextFeeGenDate;
        int hashCode9 = (hashCode8 + (l3 == null ? 0 : l3.hashCode())) * 31;
        Double d3 = this.feeOverdueAmount;
        int hashCode10 = (hashCode9 + (d3 == null ? 0 : d3.hashCode())) * 31;
        Long l4 = this.graceEndDate;
        int hashCode11 = (hashCode10 + (l4 == null ? 0 : l4.hashCode())) * 31;
        PackageStatus packageStatus = this.status;
        int hashCode12 = (hashCode11 + (packageStatus == null ? 0 : packageStatus.hashCode())) * 31;
        Integer num = this.priority;
        int hashCode13 = (hashCode12 + (num == null ? 0 : num.hashCode())) * 31;
        YesNoApiEntity yesNoApiEntity = this.displayActivePackageChange;
        int hashCode14 = (hashCode13 + (yesNoApiEntity == null ? 0 : yesNoApiEntity.hashCode())) * 31;
        YesNoApiEntity yesNoApiEntity2 = this.displayStandardFee;
        int hashCode15 = (hashCode14 + (yesNoApiEntity2 == null ? 0 : yesNoApiEntity2.hashCode())) * 31;
        YesNoApiEntity yesNoApiEntity3 = this.displayTransactionStatistics;
        int hashCode16 = (hashCode15 + (yesNoApiEntity3 == null ? 0 : yesNoApiEntity3.hashCode())) * 31;
        YesNoApiEntity yesNoApiEntity4 = this.closable;
        int hashCode17 = (hashCode16 + (yesNoApiEntity4 == null ? 0 : yesNoApiEntity4.hashCode())) * 31;
        Long l5 = this.closePackageId;
        if (l5 != null) {
            i = l5.hashCode();
        }
        return hashCode17 + i;
    }

    public String toString() {
        long j = this.packageId;
        String str = this.packageName;
        String str2 = this.packageDesc;
        String str3 = this.feePeriodType;
        String str4 = this.feeCcy;
        Double d = this.feeAmount;
        String str5 = this.limitType;
        Double d2 = this.initialLimitAmount;
        Long l = this.startDate;
        Long l2 = this.endDate;
        Long l3 = this.nextFeeGenDate;
        Double d3 = this.feeOverdueAmount;
        Long l4 = this.graceEndDate;
        PackageStatus packageStatus = this.status;
        Integer num = this.priority;
        YesNoApiEntity yesNoApiEntity = this.displayActivePackageChange;
        YesNoApiEntity yesNoApiEntity2 = this.displayStandardFee;
        YesNoApiEntity yesNoApiEntity3 = this.displayTransactionStatistics;
        YesNoApiEntity yesNoApiEntity4 = this.closable;
        Long l5 = this.closePackageId;
        return "PackageDetailsApiModel(packageId=" + j + ", packageName=" + str + ", packageDesc=" + str2 + ", feePeriodType=" + str3 + ", feeCcy=" + str4 + ", feeAmount=" + d + ", limitType=" + str5 + ", initialLimitAmount=" + d2 + ", startDate=" + l + ", endDate=" + l2 + ", nextFeeGenDate=" + l3 + ", feeOverdueAmount=" + d3 + ", graceEndDate=" + l4 + ", status=" + packageStatus + ", priority=" + num + ", displayActivePackageChange=" + yesNoApiEntity + ", displayStandardFee=" + yesNoApiEntity2 + ", displayTransactionStatistics=" + yesNoApiEntity3 + ", closable=" + yesNoApiEntity4 + ", closePackageId=" + l5 + ")";
    }
}
