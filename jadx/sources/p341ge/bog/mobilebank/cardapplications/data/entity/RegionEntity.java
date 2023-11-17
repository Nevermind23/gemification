package p341ge.bog.mobilebank.cardapplications.data.entity;

import androidx.annotation.Keep;
import kotlin.jvm.internal.C41536l;
import p341ge.bog.mobilebank.cleanarch.data.common.entity.YesNoApiEntity;

@Keep
/* renamed from: ge.bog.mobilebank.cardapplications.data.entity.RegionEntity */
public final class RegionEntity {
    private final YesNoApiEntity regionFlag;
    private final String regionId;
    private final String regionName;

    public RegionEntity(String str, String str2, YesNoApiEntity yesNoApiEntity) {
        C41536l.m120489i(str, "regionId");
        C41536l.m120489i(str2, "regionName");
        this.regionId = str;
        this.regionName = str2;
        this.regionFlag = yesNoApiEntity;
    }

    public static /* synthetic */ RegionEntity copy$default(RegionEntity regionEntity, String str, String str2, YesNoApiEntity yesNoApiEntity, int i, Object obj) {
        if ((i & 1) != 0) {
            str = regionEntity.regionId;
        }
        if ((i & 2) != 0) {
            str2 = regionEntity.regionName;
        }
        if ((i & 4) != 0) {
            yesNoApiEntity = regionEntity.regionFlag;
        }
        return regionEntity.copy(str, str2, yesNoApiEntity);
    }

    public final String component1() {
        return this.regionId;
    }

    public final String component2() {
        return this.regionName;
    }

    public final YesNoApiEntity component3() {
        return this.regionFlag;
    }

    public final RegionEntity copy(String str, String str2, YesNoApiEntity yesNoApiEntity) {
        C41536l.m120489i(str, "regionId");
        C41536l.m120489i(str2, "regionName");
        return new RegionEntity(str, str2, yesNoApiEntity);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof RegionEntity)) {
            return false;
        }
        RegionEntity regionEntity = (RegionEntity) obj;
        return C41536l.m120484d(this.regionId, regionEntity.regionId) && C41536l.m120484d(this.regionName, regionEntity.regionName) && this.regionFlag == regionEntity.regionFlag;
    }

    public final YesNoApiEntity getRegionFlag() {
        return this.regionFlag;
    }

    public final String getRegionId() {
        return this.regionId;
    }

    public final String getRegionName() {
        return this.regionName;
    }

    public int hashCode() {
        int hashCode = ((this.regionId.hashCode() * 31) + this.regionName.hashCode()) * 31;
        YesNoApiEntity yesNoApiEntity = this.regionFlag;
        return hashCode + (yesNoApiEntity == null ? 0 : yesNoApiEntity.hashCode());
    }

    public String toString() {
        String str = this.regionId;
        String str2 = this.regionName;
        YesNoApiEntity yesNoApiEntity = this.regionFlag;
        return "RegionEntity(regionId=" + str + ", regionName=" + str2 + ", regionFlag=" + yesNoApiEntity + ")";
    }
}
