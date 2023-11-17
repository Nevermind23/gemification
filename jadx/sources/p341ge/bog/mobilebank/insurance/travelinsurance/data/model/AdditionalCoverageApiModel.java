package p341ge.bog.mobilebank.insurance.travelinsurance.data.model;

import androidx.annotation.Keep;
import kotlin.jvm.internal.C41536l;

@Keep
/* renamed from: ge.bog.mobilebank.insurance.travelinsurance.data.model.AdditionalCoverageApiModel */
public final class AdditionalCoverageApiModel {
    private final String category;
    private final Boolean isCovered;
    private final String limit;
    private final String name;

    public AdditionalCoverageApiModel(String str, String str2, String str3, Boolean bool) {
        this.category = str;
        this.name = str2;
        this.limit = str3;
        this.isCovered = bool;
    }

    public static /* synthetic */ AdditionalCoverageApiModel copy$default(AdditionalCoverageApiModel additionalCoverageApiModel, String str, String str2, String str3, Boolean bool, int i, Object obj) {
        if ((i & 1) != 0) {
            str = additionalCoverageApiModel.category;
        }
        if ((i & 2) != 0) {
            str2 = additionalCoverageApiModel.name;
        }
        if ((i & 4) != 0) {
            str3 = additionalCoverageApiModel.limit;
        }
        if ((i & 8) != 0) {
            bool = additionalCoverageApiModel.isCovered;
        }
        return additionalCoverageApiModel.copy(str, str2, str3, bool);
    }

    public final String component1() {
        return this.category;
    }

    public final String component2() {
        return this.name;
    }

    public final String component3() {
        return this.limit;
    }

    public final Boolean component4() {
        return this.isCovered;
    }

    public final AdditionalCoverageApiModel copy(String str, String str2, String str3, Boolean bool) {
        return new AdditionalCoverageApiModel(str, str2, str3, bool);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AdditionalCoverageApiModel)) {
            return false;
        }
        AdditionalCoverageApiModel additionalCoverageApiModel = (AdditionalCoverageApiModel) obj;
        return C41536l.m120484d(this.category, additionalCoverageApiModel.category) && C41536l.m120484d(this.name, additionalCoverageApiModel.name) && C41536l.m120484d(this.limit, additionalCoverageApiModel.limit) && C41536l.m120484d(this.isCovered, additionalCoverageApiModel.isCovered);
    }

    public final String getCategory() {
        return this.category;
    }

    public final String getLimit() {
        return this.limit;
    }

    public final String getName() {
        return this.name;
    }

    public int hashCode() {
        String str = this.category;
        int i = 0;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.name;
        int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.limit;
        int hashCode3 = (hashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        Boolean bool = this.isCovered;
        if (bool != null) {
            i = bool.hashCode();
        }
        return hashCode3 + i;
    }

    public final Boolean isCovered() {
        return this.isCovered;
    }

    public String toString() {
        String str = this.category;
        String str2 = this.name;
        String str3 = this.limit;
        Boolean bool = this.isCovered;
        return "AdditionalCoverageApiModel(category=" + str + ", name=" + str2 + ", limit=" + str3 + ", isCovered=" + bool + ")";
    }
}
