package p341ge.bog.mobilebank.autoliabilityinsurance.data.model;

import androidx.annotation.Keep;
import java.util.List;
import kotlin.jvm.internal.C41536l;

@Keep
/* renamed from: ge.bog.mobilebank.autoliabilityinsurance.data.model.LimitTypeApiModel */
public final class LimitTypeApiModel {
    private final List<LimitSetApiModel> limitSets;
    private final String limitType;
    private final String limitTypeDesc;

    public LimitTypeApiModel(String str, String str2, List<LimitSetApiModel> list) {
        C41536l.m120489i(str, "limitType");
        C41536l.m120489i(str2, "limitTypeDesc");
        C41536l.m120489i(list, "limitSets");
        this.limitType = str;
        this.limitTypeDesc = str2;
        this.limitSets = list;
    }

    public static /* synthetic */ LimitTypeApiModel copy$default(LimitTypeApiModel limitTypeApiModel, String str, String str2, List<LimitSetApiModel> list, int i, Object obj) {
        if ((i & 1) != 0) {
            str = limitTypeApiModel.limitType;
        }
        if ((i & 2) != 0) {
            str2 = limitTypeApiModel.limitTypeDesc;
        }
        if ((i & 4) != 0) {
            list = limitTypeApiModel.limitSets;
        }
        return limitTypeApiModel.copy(str, str2, list);
    }

    public final String component1() {
        return this.limitType;
    }

    public final String component2() {
        return this.limitTypeDesc;
    }

    public final List<LimitSetApiModel> component3() {
        return this.limitSets;
    }

    public final LimitTypeApiModel copy(String str, String str2, List<LimitSetApiModel> list) {
        C41536l.m120489i(str, "limitType");
        C41536l.m120489i(str2, "limitTypeDesc");
        C41536l.m120489i(list, "limitSets");
        return new LimitTypeApiModel(str, str2, list);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof LimitTypeApiModel)) {
            return false;
        }
        LimitTypeApiModel limitTypeApiModel = (LimitTypeApiModel) obj;
        return C41536l.m120484d(this.limitType, limitTypeApiModel.limitType) && C41536l.m120484d(this.limitTypeDesc, limitTypeApiModel.limitTypeDesc) && C41536l.m120484d(this.limitSets, limitTypeApiModel.limitSets);
    }

    public final List<LimitSetApiModel> getLimitSets() {
        return this.limitSets;
    }

    public final String getLimitType() {
        return this.limitType;
    }

    public final String getLimitTypeDesc() {
        return this.limitTypeDesc;
    }

    public int hashCode() {
        return (((this.limitType.hashCode() * 31) + this.limitTypeDesc.hashCode()) * 31) + this.limitSets.hashCode();
    }

    public String toString() {
        String str = this.limitType;
        String str2 = this.limitTypeDesc;
        List<LimitSetApiModel> list = this.limitSets;
        return "LimitTypeApiModel(limitType=" + str + ", limitTypeDesc=" + str2 + ", limitSets=" + list + ")";
    }
}
