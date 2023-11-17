package p341ge.bog.mobilebank.loyaltyprogress.data.model;

import androidx.annotation.Keep;
import com.salesforce.marketingcloud.C11398b;
import java.util.List;
import kotlin.jvm.internal.C41536l;
import p341ge.bog.mobilebank.cleanarch.data.common.entity.YesNoApiEntity;

@Keep
/* renamed from: ge.bog.mobilebank.loyaltyprogress.data.model.StarsGuideProductsApiModel */
public final class StarsGuideProductsApiModel {
    private final List<SubProductApiModel> children;
    private final YesNoApiEntity hasDetails;
    private final String iconName;
    private final YesNoApiEntity isActive;
    private final String labelCategory;
    private final String labelCategoryDesc;
    private final String labelCategoryName;
    private final Integer orderId;
    private final Integer scoreNew;

    public StarsGuideProductsApiModel(String str, String str2, String str3, YesNoApiEntity yesNoApiEntity, String str4, Integer num, YesNoApiEntity yesNoApiEntity2, Integer num2, List<SubProductApiModel> list) {
        this.labelCategory = str;
        this.labelCategoryName = str2;
        this.labelCategoryDesc = str3;
        this.isActive = yesNoApiEntity;
        this.iconName = str4;
        this.orderId = num;
        this.hasDetails = yesNoApiEntity2;
        this.scoreNew = num2;
        this.children = list;
    }

    public static /* synthetic */ StarsGuideProductsApiModel copy$default(StarsGuideProductsApiModel starsGuideProductsApiModel, String str, String str2, String str3, YesNoApiEntity yesNoApiEntity, String str4, Integer num, YesNoApiEntity yesNoApiEntity2, Integer num2, List list, int i, Object obj) {
        StarsGuideProductsApiModel starsGuideProductsApiModel2 = starsGuideProductsApiModel;
        int i2 = i;
        return starsGuideProductsApiModel.copy((i2 & 1) != 0 ? starsGuideProductsApiModel2.labelCategory : str, (i2 & 2) != 0 ? starsGuideProductsApiModel2.labelCategoryName : str2, (i2 & 4) != 0 ? starsGuideProductsApiModel2.labelCategoryDesc : str3, (i2 & 8) != 0 ? starsGuideProductsApiModel2.isActive : yesNoApiEntity, (i2 & 16) != 0 ? starsGuideProductsApiModel2.iconName : str4, (i2 & 32) != 0 ? starsGuideProductsApiModel2.orderId : num, (i2 & 64) != 0 ? starsGuideProductsApiModel2.hasDetails : yesNoApiEntity2, (i2 & 128) != 0 ? starsGuideProductsApiModel2.scoreNew : num2, (i2 & C11398b.f33139r) != 0 ? starsGuideProductsApiModel2.children : list);
    }

    public final String component1() {
        return this.labelCategory;
    }

    public final String component2() {
        return this.labelCategoryName;
    }

    public final String component3() {
        return this.labelCategoryDesc;
    }

    public final YesNoApiEntity component4() {
        return this.isActive;
    }

    public final String component5() {
        return this.iconName;
    }

    public final Integer component6() {
        return this.orderId;
    }

    public final YesNoApiEntity component7() {
        return this.hasDetails;
    }

    public final Integer component8() {
        return this.scoreNew;
    }

    public final List<SubProductApiModel> component9() {
        return this.children;
    }

    public final StarsGuideProductsApiModel copy(String str, String str2, String str3, YesNoApiEntity yesNoApiEntity, String str4, Integer num, YesNoApiEntity yesNoApiEntity2, Integer num2, List<SubProductApiModel> list) {
        return new StarsGuideProductsApiModel(str, str2, str3, yesNoApiEntity, str4, num, yesNoApiEntity2, num2, list);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof StarsGuideProductsApiModel)) {
            return false;
        }
        StarsGuideProductsApiModel starsGuideProductsApiModel = (StarsGuideProductsApiModel) obj;
        return C41536l.m120484d(this.labelCategory, starsGuideProductsApiModel.labelCategory) && C41536l.m120484d(this.labelCategoryName, starsGuideProductsApiModel.labelCategoryName) && C41536l.m120484d(this.labelCategoryDesc, starsGuideProductsApiModel.labelCategoryDesc) && this.isActive == starsGuideProductsApiModel.isActive && C41536l.m120484d(this.iconName, starsGuideProductsApiModel.iconName) && C41536l.m120484d(this.orderId, starsGuideProductsApiModel.orderId) && this.hasDetails == starsGuideProductsApiModel.hasDetails && C41536l.m120484d(this.scoreNew, starsGuideProductsApiModel.scoreNew) && C41536l.m120484d(this.children, starsGuideProductsApiModel.children);
    }

    public final List<SubProductApiModel> getChildren() {
        return this.children;
    }

    public final YesNoApiEntity getHasDetails() {
        return this.hasDetails;
    }

    public final String getIconName() {
        return this.iconName;
    }

    public final String getLabelCategory() {
        return this.labelCategory;
    }

    public final String getLabelCategoryDesc() {
        return this.labelCategoryDesc;
    }

    public final String getLabelCategoryName() {
        return this.labelCategoryName;
    }

    public final Integer getOrderId() {
        return this.orderId;
    }

    public final Integer getScoreNew() {
        return this.scoreNew;
    }

    public int hashCode() {
        String str = this.labelCategory;
        int i = 0;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.labelCategoryName;
        int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.labelCategoryDesc;
        int hashCode3 = (hashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        YesNoApiEntity yesNoApiEntity = this.isActive;
        int hashCode4 = (hashCode3 + (yesNoApiEntity == null ? 0 : yesNoApiEntity.hashCode())) * 31;
        String str4 = this.iconName;
        int hashCode5 = (hashCode4 + (str4 == null ? 0 : str4.hashCode())) * 31;
        Integer num = this.orderId;
        int hashCode6 = (hashCode5 + (num == null ? 0 : num.hashCode())) * 31;
        YesNoApiEntity yesNoApiEntity2 = this.hasDetails;
        int hashCode7 = (hashCode6 + (yesNoApiEntity2 == null ? 0 : yesNoApiEntity2.hashCode())) * 31;
        Integer num2 = this.scoreNew;
        int hashCode8 = (hashCode7 + (num2 == null ? 0 : num2.hashCode())) * 31;
        List<SubProductApiModel> list = this.children;
        if (list != null) {
            i = list.hashCode();
        }
        return hashCode8 + i;
    }

    public final YesNoApiEntity isActive() {
        return this.isActive;
    }

    public String toString() {
        String str = this.labelCategory;
        String str2 = this.labelCategoryName;
        String str3 = this.labelCategoryDesc;
        YesNoApiEntity yesNoApiEntity = this.isActive;
        String str4 = this.iconName;
        Integer num = this.orderId;
        YesNoApiEntity yesNoApiEntity2 = this.hasDetails;
        Integer num2 = this.scoreNew;
        List<SubProductApiModel> list = this.children;
        return "StarsGuideProductsApiModel(labelCategory=" + str + ", labelCategoryName=" + str2 + ", labelCategoryDesc=" + str3 + ", isActive=" + yesNoApiEntity + ", iconName=" + str4 + ", orderId=" + num + ", hasDetails=" + yesNoApiEntity2 + ", scoreNew=" + num2 + ", children=" + list + ")";
    }
}
