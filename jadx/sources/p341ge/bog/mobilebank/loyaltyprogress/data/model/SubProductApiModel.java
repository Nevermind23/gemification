package p341ge.bog.mobilebank.loyaltyprogress.data.model;

import androidx.annotation.Keep;
import kotlin.jvm.internal.C41536l;
import p341ge.bog.mobilebank.cleanarch.data.common.entity.YesNoApiEntity;

@Keep
/* renamed from: ge.bog.mobilebank.loyaltyprogress.data.model.SubProductApiModel */
public final class SubProductApiModel {
    private final Integer categoryCoefficient;
    private final YesNoApiEntity isActive;
    private final String labelCategoryDesc;
    private final Integer orderId;

    public SubProductApiModel(Integer num, String str, YesNoApiEntity yesNoApiEntity, Integer num2) {
        this.categoryCoefficient = num;
        this.labelCategoryDesc = str;
        this.isActive = yesNoApiEntity;
        this.orderId = num2;
    }

    public static /* synthetic */ SubProductApiModel copy$default(SubProductApiModel subProductApiModel, Integer num, String str, YesNoApiEntity yesNoApiEntity, Integer num2, int i, Object obj) {
        if ((i & 1) != 0) {
            num = subProductApiModel.categoryCoefficient;
        }
        if ((i & 2) != 0) {
            str = subProductApiModel.labelCategoryDesc;
        }
        if ((i & 4) != 0) {
            yesNoApiEntity = subProductApiModel.isActive;
        }
        if ((i & 8) != 0) {
            num2 = subProductApiModel.orderId;
        }
        return subProductApiModel.copy(num, str, yesNoApiEntity, num2);
    }

    public final Integer component1() {
        return this.categoryCoefficient;
    }

    public final String component2() {
        return this.labelCategoryDesc;
    }

    public final YesNoApiEntity component3() {
        return this.isActive;
    }

    public final Integer component4() {
        return this.orderId;
    }

    public final SubProductApiModel copy(Integer num, String str, YesNoApiEntity yesNoApiEntity, Integer num2) {
        return new SubProductApiModel(num, str, yesNoApiEntity, num2);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SubProductApiModel)) {
            return false;
        }
        SubProductApiModel subProductApiModel = (SubProductApiModel) obj;
        return C41536l.m120484d(this.categoryCoefficient, subProductApiModel.categoryCoefficient) && C41536l.m120484d(this.labelCategoryDesc, subProductApiModel.labelCategoryDesc) && this.isActive == subProductApiModel.isActive && C41536l.m120484d(this.orderId, subProductApiModel.orderId);
    }

    public final Integer getCategoryCoefficient() {
        return this.categoryCoefficient;
    }

    public final String getLabelCategoryDesc() {
        return this.labelCategoryDesc;
    }

    public final Integer getOrderId() {
        return this.orderId;
    }

    public int hashCode() {
        Integer num = this.categoryCoefficient;
        int i = 0;
        int hashCode = (num == null ? 0 : num.hashCode()) * 31;
        String str = this.labelCategoryDesc;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        YesNoApiEntity yesNoApiEntity = this.isActive;
        int hashCode3 = (hashCode2 + (yesNoApiEntity == null ? 0 : yesNoApiEntity.hashCode())) * 31;
        Integer num2 = this.orderId;
        if (num2 != null) {
            i = num2.hashCode();
        }
        return hashCode3 + i;
    }

    public final YesNoApiEntity isActive() {
        return this.isActive;
    }

    public String toString() {
        Integer num = this.categoryCoefficient;
        String str = this.labelCategoryDesc;
        YesNoApiEntity yesNoApiEntity = this.isActive;
        Integer num2 = this.orderId;
        return "SubProductApiModel(categoryCoefficient=" + num + ", labelCategoryDesc=" + str + ", isActive=" + yesNoApiEntity + ", orderId=" + num2 + ")";
    }
}
