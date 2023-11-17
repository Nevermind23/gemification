package p341ge.bog.mobilebank.loyaltyprogress.data.model;

import androidx.annotation.Keep;
import java.util.List;
import kotlin.jvm.internal.C41536l;

@Keep
/* renamed from: ge.bog.mobilebank.loyaltyprogress.data.model.StatusBenefitsApiModel */
public final class StatusBenefitsApiModel {
    private final String labelDesc;
    private final Integer labelEntryScore;
    private final String labelType;
    private final Integer orderId;
    private final List<BenefitApiModel> plusBenefitList;

    public StatusBenefitsApiModel(String str, String str2, Integer num, Integer num2, List<BenefitApiModel> list) {
        this.labelType = str;
        this.labelDesc = str2;
        this.labelEntryScore = num;
        this.orderId = num2;
        this.plusBenefitList = list;
    }

    public static /* synthetic */ StatusBenefitsApiModel copy$default(StatusBenefitsApiModel statusBenefitsApiModel, String str, String str2, Integer num, Integer num2, List<BenefitApiModel> list, int i, Object obj) {
        if ((i & 1) != 0) {
            str = statusBenefitsApiModel.labelType;
        }
        if ((i & 2) != 0) {
            str2 = statusBenefitsApiModel.labelDesc;
        }
        String str3 = str2;
        if ((i & 4) != 0) {
            num = statusBenefitsApiModel.labelEntryScore;
        }
        Integer num3 = num;
        if ((i & 8) != 0) {
            num2 = statusBenefitsApiModel.orderId;
        }
        Integer num4 = num2;
        if ((i & 16) != 0) {
            list = statusBenefitsApiModel.plusBenefitList;
        }
        return statusBenefitsApiModel.copy(str, str3, num3, num4, list);
    }

    public final String component1() {
        return this.labelType;
    }

    public final String component2() {
        return this.labelDesc;
    }

    public final Integer component3() {
        return this.labelEntryScore;
    }

    public final Integer component4() {
        return this.orderId;
    }

    public final List<BenefitApiModel> component5() {
        return this.plusBenefitList;
    }

    public final StatusBenefitsApiModel copy(String str, String str2, Integer num, Integer num2, List<BenefitApiModel> list) {
        return new StatusBenefitsApiModel(str, str2, num, num2, list);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof StatusBenefitsApiModel)) {
            return false;
        }
        StatusBenefitsApiModel statusBenefitsApiModel = (StatusBenefitsApiModel) obj;
        return C41536l.m120484d(this.labelType, statusBenefitsApiModel.labelType) && C41536l.m120484d(this.labelDesc, statusBenefitsApiModel.labelDesc) && C41536l.m120484d(this.labelEntryScore, statusBenefitsApiModel.labelEntryScore) && C41536l.m120484d(this.orderId, statusBenefitsApiModel.orderId) && C41536l.m120484d(this.plusBenefitList, statusBenefitsApiModel.plusBenefitList);
    }

    public final String getLabelDesc() {
        return this.labelDesc;
    }

    public final Integer getLabelEntryScore() {
        return this.labelEntryScore;
    }

    public final String getLabelType() {
        return this.labelType;
    }

    public final Integer getOrderId() {
        return this.orderId;
    }

    public final List<BenefitApiModel> getPlusBenefitList() {
        return this.plusBenefitList;
    }

    public int hashCode() {
        String str = this.labelType;
        int i = 0;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.labelDesc;
        int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        Integer num = this.labelEntryScore;
        int hashCode3 = (hashCode2 + (num == null ? 0 : num.hashCode())) * 31;
        Integer num2 = this.orderId;
        int hashCode4 = (hashCode3 + (num2 == null ? 0 : num2.hashCode())) * 31;
        List<BenefitApiModel> list = this.plusBenefitList;
        if (list != null) {
            i = list.hashCode();
        }
        return hashCode4 + i;
    }

    public String toString() {
        String str = this.labelType;
        String str2 = this.labelDesc;
        Integer num = this.labelEntryScore;
        Integer num2 = this.orderId;
        List<BenefitApiModel> list = this.plusBenefitList;
        return "StatusBenefitsApiModel(labelType=" + str + ", labelDesc=" + str2 + ", labelEntryScore=" + num + ", orderId=" + num2 + ", plusBenefitList=" + list + ")";
    }
}
