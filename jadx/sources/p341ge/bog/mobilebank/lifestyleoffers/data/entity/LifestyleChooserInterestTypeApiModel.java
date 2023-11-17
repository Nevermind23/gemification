package p341ge.bog.mobilebank.lifestyleoffers.data.entity;

import androidx.annotation.Keep;
import java.util.List;
import kotlin.jvm.internal.C41536l;

@Keep
/* renamed from: ge.bog.mobilebank.lifestyleoffers.data.entity.LifestyleChooserInterestTypeApiModel */
public final class LifestyleChooserInterestTypeApiModel {
    private final List<LifestyleChooserInterestSubTypeApiModel> interestSubTypes;
    private final String interestType;
    private final Long interestTypeImageId;
    private final String interestTypeImageUrl;
    private final String typeDesc;

    public LifestyleChooserInterestTypeApiModel(String str, String str2, Long l, String str3, List<LifestyleChooserInterestSubTypeApiModel> list) {
        this.interestType = str;
        this.typeDesc = str2;
        this.interestTypeImageId = l;
        this.interestTypeImageUrl = str3;
        this.interestSubTypes = list;
    }

    public static /* synthetic */ LifestyleChooserInterestTypeApiModel copy$default(LifestyleChooserInterestTypeApiModel lifestyleChooserInterestTypeApiModel, String str, String str2, Long l, String str3, List<LifestyleChooserInterestSubTypeApiModel> list, int i, Object obj) {
        if ((i & 1) != 0) {
            str = lifestyleChooserInterestTypeApiModel.interestType;
        }
        if ((i & 2) != 0) {
            str2 = lifestyleChooserInterestTypeApiModel.typeDesc;
        }
        String str4 = str2;
        if ((i & 4) != 0) {
            l = lifestyleChooserInterestTypeApiModel.interestTypeImageId;
        }
        Long l2 = l;
        if ((i & 8) != 0) {
            str3 = lifestyleChooserInterestTypeApiModel.interestTypeImageUrl;
        }
        String str5 = str3;
        if ((i & 16) != 0) {
            list = lifestyleChooserInterestTypeApiModel.interestSubTypes;
        }
        return lifestyleChooserInterestTypeApiModel.copy(str, str4, l2, str5, list);
    }

    public final String component1() {
        return this.interestType;
    }

    public final String component2() {
        return this.typeDesc;
    }

    public final Long component3() {
        return this.interestTypeImageId;
    }

    public final String component4() {
        return this.interestTypeImageUrl;
    }

    public final List<LifestyleChooserInterestSubTypeApiModel> component5() {
        return this.interestSubTypes;
    }

    public final LifestyleChooserInterestTypeApiModel copy(String str, String str2, Long l, String str3, List<LifestyleChooserInterestSubTypeApiModel> list) {
        return new LifestyleChooserInterestTypeApiModel(str, str2, l, str3, list);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof LifestyleChooserInterestTypeApiModel)) {
            return false;
        }
        LifestyleChooserInterestTypeApiModel lifestyleChooserInterestTypeApiModel = (LifestyleChooserInterestTypeApiModel) obj;
        return C41536l.m120484d(this.interestType, lifestyleChooserInterestTypeApiModel.interestType) && C41536l.m120484d(this.typeDesc, lifestyleChooserInterestTypeApiModel.typeDesc) && C41536l.m120484d(this.interestTypeImageId, lifestyleChooserInterestTypeApiModel.interestTypeImageId) && C41536l.m120484d(this.interestTypeImageUrl, lifestyleChooserInterestTypeApiModel.interestTypeImageUrl) && C41536l.m120484d(this.interestSubTypes, lifestyleChooserInterestTypeApiModel.interestSubTypes);
    }

    public final List<LifestyleChooserInterestSubTypeApiModel> getInterestSubTypes() {
        return this.interestSubTypes;
    }

    public final String getInterestType() {
        return this.interestType;
    }

    public final Long getInterestTypeImageId() {
        return this.interestTypeImageId;
    }

    public final String getInterestTypeImageUrl() {
        return this.interestTypeImageUrl;
    }

    public final String getTypeDesc() {
        return this.typeDesc;
    }

    public int hashCode() {
        String str = this.interestType;
        int i = 0;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.typeDesc;
        int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        Long l = this.interestTypeImageId;
        int hashCode3 = (hashCode2 + (l == null ? 0 : l.hashCode())) * 31;
        String str3 = this.interestTypeImageUrl;
        int hashCode4 = (hashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31;
        List<LifestyleChooserInterestSubTypeApiModel> list = this.interestSubTypes;
        if (list != null) {
            i = list.hashCode();
        }
        return hashCode4 + i;
    }

    public String toString() {
        String str = this.interestType;
        String str2 = this.typeDesc;
        Long l = this.interestTypeImageId;
        String str3 = this.interestTypeImageUrl;
        List<LifestyleChooserInterestSubTypeApiModel> list = this.interestSubTypes;
        return "LifestyleChooserInterestTypeApiModel(interestType=" + str + ", typeDesc=" + str2 + ", interestTypeImageId=" + l + ", interestTypeImageUrl=" + str3 + ", interestSubTypes=" + list + ")";
    }
}
