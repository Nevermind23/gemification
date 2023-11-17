package p341ge.bog.mobilebank.lifestyleoffers.data.entity;

import androidx.annotation.Keep;
import kotlin.jvm.internal.C41536l;

@Keep
/* renamed from: ge.bog.mobilebank.lifestyleoffers.data.entity.LifestyleChooserInterestSubTypeApiModel */
public final class LifestyleChooserInterestSubTypeApiModel {
    private final String interestSubType;
    private final String subTypeDesc;

    public LifestyleChooserInterestSubTypeApiModel(String str, String str2) {
        this.interestSubType = str;
        this.subTypeDesc = str2;
    }

    public static /* synthetic */ LifestyleChooserInterestSubTypeApiModel copy$default(LifestyleChooserInterestSubTypeApiModel lifestyleChooserInterestSubTypeApiModel, String str, String str2, int i, Object obj) {
        if ((i & 1) != 0) {
            str = lifestyleChooserInterestSubTypeApiModel.interestSubType;
        }
        if ((i & 2) != 0) {
            str2 = lifestyleChooserInterestSubTypeApiModel.subTypeDesc;
        }
        return lifestyleChooserInterestSubTypeApiModel.copy(str, str2);
    }

    public final String component1() {
        return this.interestSubType;
    }

    public final String component2() {
        return this.subTypeDesc;
    }

    public final LifestyleChooserInterestSubTypeApiModel copy(String str, String str2) {
        return new LifestyleChooserInterestSubTypeApiModel(str, str2);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof LifestyleChooserInterestSubTypeApiModel)) {
            return false;
        }
        LifestyleChooserInterestSubTypeApiModel lifestyleChooserInterestSubTypeApiModel = (LifestyleChooserInterestSubTypeApiModel) obj;
        return C41536l.m120484d(this.interestSubType, lifestyleChooserInterestSubTypeApiModel.interestSubType) && C41536l.m120484d(this.subTypeDesc, lifestyleChooserInterestSubTypeApiModel.subTypeDesc);
    }

    public final String getInterestSubType() {
        return this.interestSubType;
    }

    public final String getSubTypeDesc() {
        return this.subTypeDesc;
    }

    public int hashCode() {
        String str = this.interestSubType;
        int i = 0;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.subTypeDesc;
        if (str2 != null) {
            i = str2.hashCode();
        }
        return hashCode + i;
    }

    public String toString() {
        String str = this.interestSubType;
        String str2 = this.subTypeDesc;
        return "LifestyleChooserInterestSubTypeApiModel(interestSubType=" + str + ", subTypeDesc=" + str2 + ")";
    }
}
