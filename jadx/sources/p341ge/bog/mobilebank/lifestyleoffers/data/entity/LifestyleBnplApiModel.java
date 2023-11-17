package p341ge.bog.mobilebank.lifestyleoffers.data.entity;

import androidx.annotation.Keep;
import java.util.List;
import kotlin.jvm.internal.C41536l;

@Keep
/* renamed from: ge.bog.mobilebank.lifestyleoffers.data.entity.LifestyleBnplApiModel */
public final class LifestyleBnplApiModel {
    private final List<LifestyleBnplImageApiModel> bottom;
    private final List<LifestyleBnplImageApiModel> top;

    public LifestyleBnplApiModel(List<LifestyleBnplImageApiModel> list, List<LifestyleBnplImageApiModel> list2) {
        this.top = list;
        this.bottom = list2;
    }

    public static /* synthetic */ LifestyleBnplApiModel copy$default(LifestyleBnplApiModel lifestyleBnplApiModel, List<LifestyleBnplImageApiModel> list, List<LifestyleBnplImageApiModel> list2, int i, Object obj) {
        if ((i & 1) != 0) {
            list = lifestyleBnplApiModel.top;
        }
        if ((i & 2) != 0) {
            list2 = lifestyleBnplApiModel.bottom;
        }
        return lifestyleBnplApiModel.copy(list, list2);
    }

    public final List<LifestyleBnplImageApiModel> component1() {
        return this.top;
    }

    public final List<LifestyleBnplImageApiModel> component2() {
        return this.bottom;
    }

    public final LifestyleBnplApiModel copy(List<LifestyleBnplImageApiModel> list, List<LifestyleBnplImageApiModel> list2) {
        return new LifestyleBnplApiModel(list, list2);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof LifestyleBnplApiModel)) {
            return false;
        }
        LifestyleBnplApiModel lifestyleBnplApiModel = (LifestyleBnplApiModel) obj;
        return C41536l.m120484d(this.top, lifestyleBnplApiModel.top) && C41536l.m120484d(this.bottom, lifestyleBnplApiModel.bottom);
    }

    public final List<LifestyleBnplImageApiModel> getBottom() {
        return this.bottom;
    }

    public final List<LifestyleBnplImageApiModel> getTop() {
        return this.top;
    }

    public int hashCode() {
        List<LifestyleBnplImageApiModel> list = this.top;
        int i = 0;
        int hashCode = (list == null ? 0 : list.hashCode()) * 31;
        List<LifestyleBnplImageApiModel> list2 = this.bottom;
        if (list2 != null) {
            i = list2.hashCode();
        }
        return hashCode + i;
    }

    public String toString() {
        List<LifestyleBnplImageApiModel> list = this.top;
        List<LifestyleBnplImageApiModel> list2 = this.bottom;
        return "LifestyleBnplApiModel(top=" + list + ", bottom=" + list2 + ")";
    }
}
