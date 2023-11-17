package p341ge.bog.mobilebank.lifestyleoffers.data.entity;

import androidx.annotation.Keep;
import com.salesforce.marketingcloud.C11398b;
import java.util.List;
import kotlin.jvm.internal.C41536l;

@Keep
/* renamed from: ge.bog.mobilebank.lifestyleoffers.data.entity.OfferProgressApiModel */
public final class OfferProgressApiModel {
    private final String benefBadge;
    private final String benefType;
    private final String benefValue;
    private final Integer clientParticipationCount;
    private final Integer clientProgressCount;
    private final Integer clientProgressGoal;
    private final Object clientProgressPercentage;
    private final String clientStatus;
    private final Double clientSumAmount;
    private final Integer clientTransactionCount;
    private final Integer daysLeft;
    private final Long endDate;
    private final Double goalAmount;
    private final Integer goalTransactions;
    private final String hasOfferProducts;
    private final String offerDetailDesc;
    private final List<String> offerNameLongList;
    private final Integer offrParticipationCount;
    private final Integer ofrId;
    private final String promotionType;
    private final Long startDate;
    private final String templateDesc;
    private final String valueType;

    public OfferProgressApiModel(String str, Integer num, Integer num2, Integer num3, Object obj, String str2, Double d, Integer num4, Integer num5, Long l, Double d2, Integer num6, Integer num7, Integer num8, String str3, Long l2, String str4, String str5, List<String> list, String str6, String str7, String str8, String str9) {
        this.benefType = str;
        this.clientParticipationCount = num;
        this.clientProgressCount = num2;
        this.clientProgressGoal = num3;
        this.clientProgressPercentage = obj;
        this.clientStatus = str2;
        this.clientSumAmount = d;
        this.clientTransactionCount = num4;
        this.daysLeft = num5;
        this.endDate = l;
        this.goalAmount = d2;
        this.goalTransactions = num6;
        this.offrParticipationCount = num7;
        this.ofrId = num8;
        this.promotionType = str3;
        this.startDate = l2;
        this.templateDesc = str4;
        this.valueType = str5;
        this.offerNameLongList = list;
        this.offerDetailDesc = str6;
        this.hasOfferProducts = str7;
        this.benefValue = str8;
        this.benefBadge = str9;
    }

    public static /* synthetic */ OfferProgressApiModel copy$default(OfferProgressApiModel offerProgressApiModel, String str, Integer num, Integer num2, Integer num3, Object obj, String str2, Double d, Integer num4, Integer num5, Long l, Double d2, Integer num6, Integer num7, Integer num8, String str3, Long l2, String str4, String str5, List list, String str6, String str7, String str8, String str9, int i, Object obj2) {
        OfferProgressApiModel offerProgressApiModel2 = offerProgressApiModel;
        int i2 = i;
        return offerProgressApiModel.copy((i2 & 1) != 0 ? offerProgressApiModel2.benefType : str, (i2 & 2) != 0 ? offerProgressApiModel2.clientParticipationCount : num, (i2 & 4) != 0 ? offerProgressApiModel2.clientProgressCount : num2, (i2 & 8) != 0 ? offerProgressApiModel2.clientProgressGoal : num3, (i2 & 16) != 0 ? offerProgressApiModel2.clientProgressPercentage : obj, (i2 & 32) != 0 ? offerProgressApiModel2.clientStatus : str2, (i2 & 64) != 0 ? offerProgressApiModel2.clientSumAmount : d, (i2 & 128) != 0 ? offerProgressApiModel2.clientTransactionCount : num4, (i2 & C11398b.f33139r) != 0 ? offerProgressApiModel2.daysLeft : num5, (i2 & C11398b.f33140s) != 0 ? offerProgressApiModel2.endDate : l, (i2 & C11398b.f33141t) != 0 ? offerProgressApiModel2.goalAmount : d2, (i2 & C11398b.f33142u) != 0 ? offerProgressApiModel2.goalTransactions : num6, (i2 & C11398b.f33143v) != 0 ? offerProgressApiModel2.offrParticipationCount : num7, (i2 & 8192) != 0 ? offerProgressApiModel2.ofrId : num8, (i2 & 16384) != 0 ? offerProgressApiModel2.promotionType : str3, (i2 & 32768) != 0 ? offerProgressApiModel2.startDate : l2, (i2 & 65536) != 0 ? offerProgressApiModel2.templateDesc : str4, (i2 & 131072) != 0 ? offerProgressApiModel2.valueType : str5, (i2 & 262144) != 0 ? offerProgressApiModel2.offerNameLongList : list, (i2 & 524288) != 0 ? offerProgressApiModel2.offerDetailDesc : str6, (i2 & 1048576) != 0 ? offerProgressApiModel2.hasOfferProducts : str7, (i2 & 2097152) != 0 ? offerProgressApiModel2.benefValue : str8, (i2 & 4194304) != 0 ? offerProgressApiModel2.benefBadge : str9);
    }

    public final String component1() {
        return this.benefType;
    }

    public final Long component10() {
        return this.endDate;
    }

    public final Double component11() {
        return this.goalAmount;
    }

    public final Integer component12() {
        return this.goalTransactions;
    }

    public final Integer component13() {
        return this.offrParticipationCount;
    }

    public final Integer component14() {
        return this.ofrId;
    }

    public final String component15() {
        return this.promotionType;
    }

    public final Long component16() {
        return this.startDate;
    }

    public final String component17() {
        return this.templateDesc;
    }

    public final String component18() {
        return this.valueType;
    }

    public final List<String> component19() {
        return this.offerNameLongList;
    }

    public final Integer component2() {
        return this.clientParticipationCount;
    }

    public final String component20() {
        return this.offerDetailDesc;
    }

    public final String component21() {
        return this.hasOfferProducts;
    }

    public final String component22() {
        return this.benefValue;
    }

    public final String component23() {
        return this.benefBadge;
    }

    public final Integer component3() {
        return this.clientProgressCount;
    }

    public final Integer component4() {
        return this.clientProgressGoal;
    }

    public final Object component5() {
        return this.clientProgressPercentage;
    }

    public final String component6() {
        return this.clientStatus;
    }

    public final Double component7() {
        return this.clientSumAmount;
    }

    public final Integer component8() {
        return this.clientTransactionCount;
    }

    public final Integer component9() {
        return this.daysLeft;
    }

    public final OfferProgressApiModel copy(String str, Integer num, Integer num2, Integer num3, Object obj, String str2, Double d, Integer num4, Integer num5, Long l, Double d2, Integer num6, Integer num7, Integer num8, String str3, Long l2, String str4, String str5, List<String> list, String str6, String str7, String str8, String str9) {
        return new OfferProgressApiModel(str, num, num2, num3, obj, str2, d, num4, num5, l, d2, num6, num7, num8, str3, l2, str4, str5, list, str6, str7, str8, str9);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof OfferProgressApiModel)) {
            return false;
        }
        OfferProgressApiModel offerProgressApiModel = (OfferProgressApiModel) obj;
        return C41536l.m120484d(this.benefType, offerProgressApiModel.benefType) && C41536l.m120484d(this.clientParticipationCount, offerProgressApiModel.clientParticipationCount) && C41536l.m120484d(this.clientProgressCount, offerProgressApiModel.clientProgressCount) && C41536l.m120484d(this.clientProgressGoal, offerProgressApiModel.clientProgressGoal) && C41536l.m120484d(this.clientProgressPercentage, offerProgressApiModel.clientProgressPercentage) && C41536l.m120484d(this.clientStatus, offerProgressApiModel.clientStatus) && C41536l.m120484d(this.clientSumAmount, offerProgressApiModel.clientSumAmount) && C41536l.m120484d(this.clientTransactionCount, offerProgressApiModel.clientTransactionCount) && C41536l.m120484d(this.daysLeft, offerProgressApiModel.daysLeft) && C41536l.m120484d(this.endDate, offerProgressApiModel.endDate) && C41536l.m120484d(this.goalAmount, offerProgressApiModel.goalAmount) && C41536l.m120484d(this.goalTransactions, offerProgressApiModel.goalTransactions) && C41536l.m120484d(this.offrParticipationCount, offerProgressApiModel.offrParticipationCount) && C41536l.m120484d(this.ofrId, offerProgressApiModel.ofrId) && C41536l.m120484d(this.promotionType, offerProgressApiModel.promotionType) && C41536l.m120484d(this.startDate, offerProgressApiModel.startDate) && C41536l.m120484d(this.templateDesc, offerProgressApiModel.templateDesc) && C41536l.m120484d(this.valueType, offerProgressApiModel.valueType) && C41536l.m120484d(this.offerNameLongList, offerProgressApiModel.offerNameLongList) && C41536l.m120484d(this.offerDetailDesc, offerProgressApiModel.offerDetailDesc) && C41536l.m120484d(this.hasOfferProducts, offerProgressApiModel.hasOfferProducts) && C41536l.m120484d(this.benefValue, offerProgressApiModel.benefValue) && C41536l.m120484d(this.benefBadge, offerProgressApiModel.benefBadge);
    }

    public final String getBenefBadge() {
        return this.benefBadge;
    }

    public final String getBenefType() {
        return this.benefType;
    }

    public final String getBenefValue() {
        return this.benefValue;
    }

    public final Integer getClientParticipationCount() {
        return this.clientParticipationCount;
    }

    public final Integer getClientProgressCount() {
        return this.clientProgressCount;
    }

    public final Integer getClientProgressGoal() {
        return this.clientProgressGoal;
    }

    public final Object getClientProgressPercentage() {
        return this.clientProgressPercentage;
    }

    public final String getClientStatus() {
        return this.clientStatus;
    }

    public final Double getClientSumAmount() {
        return this.clientSumAmount;
    }

    public final Integer getClientTransactionCount() {
        return this.clientTransactionCount;
    }

    public final Integer getDaysLeft() {
        return this.daysLeft;
    }

    public final Long getEndDate() {
        return this.endDate;
    }

    public final Double getGoalAmount() {
        return this.goalAmount;
    }

    public final Integer getGoalTransactions() {
        return this.goalTransactions;
    }

    public final String getHasOfferProducts() {
        return this.hasOfferProducts;
    }

    public final String getOfferDetailDesc() {
        return this.offerDetailDesc;
    }

    public final List<String> getOfferNameLongList() {
        return this.offerNameLongList;
    }

    public final Integer getOffrParticipationCount() {
        return this.offrParticipationCount;
    }

    public final Integer getOfrId() {
        return this.ofrId;
    }

    public final String getPromotionType() {
        return this.promotionType;
    }

    public final Long getStartDate() {
        return this.startDate;
    }

    public final String getTemplateDesc() {
        return this.templateDesc;
    }

    public final String getValueType() {
        return this.valueType;
    }

    public int hashCode() {
        String str = this.benefType;
        int i = 0;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        Integer num = this.clientParticipationCount;
        int hashCode2 = (hashCode + (num == null ? 0 : num.hashCode())) * 31;
        Integer num2 = this.clientProgressCount;
        int hashCode3 = (hashCode2 + (num2 == null ? 0 : num2.hashCode())) * 31;
        Integer num3 = this.clientProgressGoal;
        int hashCode4 = (hashCode3 + (num3 == null ? 0 : num3.hashCode())) * 31;
        Object obj = this.clientProgressPercentage;
        int hashCode5 = (hashCode4 + (obj == null ? 0 : obj.hashCode())) * 31;
        String str2 = this.clientStatus;
        int hashCode6 = (hashCode5 + (str2 == null ? 0 : str2.hashCode())) * 31;
        Double d = this.clientSumAmount;
        int hashCode7 = (hashCode6 + (d == null ? 0 : d.hashCode())) * 31;
        Integer num4 = this.clientTransactionCount;
        int hashCode8 = (hashCode7 + (num4 == null ? 0 : num4.hashCode())) * 31;
        Integer num5 = this.daysLeft;
        int hashCode9 = (hashCode8 + (num5 == null ? 0 : num5.hashCode())) * 31;
        Long l = this.endDate;
        int hashCode10 = (hashCode9 + (l == null ? 0 : l.hashCode())) * 31;
        Double d2 = this.goalAmount;
        int hashCode11 = (hashCode10 + (d2 == null ? 0 : d2.hashCode())) * 31;
        Integer num6 = this.goalTransactions;
        int hashCode12 = (hashCode11 + (num6 == null ? 0 : num6.hashCode())) * 31;
        Integer num7 = this.offrParticipationCount;
        int hashCode13 = (hashCode12 + (num7 == null ? 0 : num7.hashCode())) * 31;
        Integer num8 = this.ofrId;
        int hashCode14 = (hashCode13 + (num8 == null ? 0 : num8.hashCode())) * 31;
        String str3 = this.promotionType;
        int hashCode15 = (hashCode14 + (str3 == null ? 0 : str3.hashCode())) * 31;
        Long l2 = this.startDate;
        int hashCode16 = (hashCode15 + (l2 == null ? 0 : l2.hashCode())) * 31;
        String str4 = this.templateDesc;
        int hashCode17 = (hashCode16 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.valueType;
        int hashCode18 = (hashCode17 + (str5 == null ? 0 : str5.hashCode())) * 31;
        List<String> list = this.offerNameLongList;
        int hashCode19 = (hashCode18 + (list == null ? 0 : list.hashCode())) * 31;
        String str6 = this.offerDetailDesc;
        int hashCode20 = (hashCode19 + (str6 == null ? 0 : str6.hashCode())) * 31;
        String str7 = this.hasOfferProducts;
        int hashCode21 = (hashCode20 + (str7 == null ? 0 : str7.hashCode())) * 31;
        String str8 = this.benefValue;
        int hashCode22 = (hashCode21 + (str8 == null ? 0 : str8.hashCode())) * 31;
        String str9 = this.benefBadge;
        if (str9 != null) {
            i = str9.hashCode();
        }
        return hashCode22 + i;
    }

    public String toString() {
        String str = this.benefType;
        Integer num = this.clientParticipationCount;
        Integer num2 = this.clientProgressCount;
        Integer num3 = this.clientProgressGoal;
        Object obj = this.clientProgressPercentage;
        String str2 = this.clientStatus;
        Double d = this.clientSumAmount;
        Integer num4 = this.clientTransactionCount;
        Integer num5 = this.daysLeft;
        Long l = this.endDate;
        Double d2 = this.goalAmount;
        Integer num6 = this.goalTransactions;
        Integer num7 = this.offrParticipationCount;
        Integer num8 = this.ofrId;
        String str3 = this.promotionType;
        Long l2 = this.startDate;
        String str4 = this.templateDesc;
        String str5 = this.valueType;
        List<String> list = this.offerNameLongList;
        String str6 = this.offerDetailDesc;
        String str7 = this.hasOfferProducts;
        String str8 = this.benefValue;
        String str9 = this.benefBadge;
        return "OfferProgressApiModel(benefType=" + str + ", clientParticipationCount=" + num + ", clientProgressCount=" + num2 + ", clientProgressGoal=" + num3 + ", clientProgressPercentage=" + obj + ", clientStatus=" + str2 + ", clientSumAmount=" + d + ", clientTransactionCount=" + num4 + ", daysLeft=" + num5 + ", endDate=" + l + ", goalAmount=" + d2 + ", goalTransactions=" + num6 + ", offrParticipationCount=" + num7 + ", ofrId=" + num8 + ", promotionType=" + str3 + ", startDate=" + l2 + ", templateDesc=" + str4 + ", valueType=" + str5 + ", offerNameLongList=" + list + ", offerDetailDesc=" + str6 + ", hasOfferProducts=" + str7 + ", benefValue=" + str8 + ", benefBadge=" + str9 + ")";
    }
}
