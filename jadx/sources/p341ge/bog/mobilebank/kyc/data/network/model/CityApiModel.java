package p341ge.bog.mobilebank.kyc.data.network.model;

import androidx.annotation.Keep;
import kotlin.jvm.internal.C41536l;

@Keep
/* renamed from: ge.bog.mobilebank.kyc.data.network.model.CityApiModel */
public final class CityApiModel {
    private final String country;
    private final String region;
    private final String regionDesc;

    public CityApiModel(String str, String str2, String str3) {
        C41536l.m120489i(str, "region");
        C41536l.m120489i(str2, "regionDesc");
        C41536l.m120489i(str3, "country");
        this.region = str;
        this.regionDesc = str2;
        this.country = str3;
    }

    public static /* synthetic */ CityApiModel copy$default(CityApiModel cityApiModel, String str, String str2, String str3, int i, Object obj) {
        if ((i & 1) != 0) {
            str = cityApiModel.region;
        }
        if ((i & 2) != 0) {
            str2 = cityApiModel.regionDesc;
        }
        if ((i & 4) != 0) {
            str3 = cityApiModel.country;
        }
        return cityApiModel.copy(str, str2, str3);
    }

    public final String component1() {
        return this.region;
    }

    public final String component2() {
        return this.regionDesc;
    }

    public final String component3() {
        return this.country;
    }

    public final CityApiModel copy(String str, String str2, String str3) {
        C41536l.m120489i(str, "region");
        C41536l.m120489i(str2, "regionDesc");
        C41536l.m120489i(str3, "country");
        return new CityApiModel(str, str2, str3);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CityApiModel)) {
            return false;
        }
        CityApiModel cityApiModel = (CityApiModel) obj;
        return C41536l.m120484d(this.region, cityApiModel.region) && C41536l.m120484d(this.regionDesc, cityApiModel.regionDesc) && C41536l.m120484d(this.country, cityApiModel.country);
    }

    public final String getCountry() {
        return this.country;
    }

    public final String getRegion() {
        return this.region;
    }

    public final String getRegionDesc() {
        return this.regionDesc;
    }

    public int hashCode() {
        return (((this.region.hashCode() * 31) + this.regionDesc.hashCode()) * 31) + this.country.hashCode();
    }

    public String toString() {
        String str = this.region;
        String str2 = this.regionDesc;
        String str3 = this.country;
        return "CityApiModel(region=" + str + ", regionDesc=" + str2 + ", country=" + str3 + ")";
    }
}
