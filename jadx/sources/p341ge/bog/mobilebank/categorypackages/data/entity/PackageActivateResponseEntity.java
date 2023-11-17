package p341ge.bog.mobilebank.categorypackages.data.entity;

import androidx.annotation.Keep;
import kotlin.jvm.internal.C41536l;

@Keep
/* renamed from: ge.bog.mobilebank.categorypackages.data.entity.PackageActivateResponseEntity */
public final class PackageActivateResponseEntity {
    private final Boolean digitalSoloPackageActivated;
    private final Boolean genesysActivityRegistered;
    private final String newPackageName;
    private final Long packageActivationDate;
    private final Boolean rbPackageActivated;
    private final Boolean soloPackageActivated;
    private final String status;

    public PackageActivateResponseEntity(Boolean bool, Boolean bool2, Boolean bool3, String str, Boolean bool4, String str2, Long l) {
        this.genesysActivityRegistered = bool;
        this.digitalSoloPackageActivated = bool2;
        this.rbPackageActivated = bool3;
        this.newPackageName = str;
        this.soloPackageActivated = bool4;
        this.status = str2;
        this.packageActivationDate = l;
    }

    public static /* synthetic */ PackageActivateResponseEntity copy$default(PackageActivateResponseEntity packageActivateResponseEntity, Boolean bool, Boolean bool2, Boolean bool3, String str, Boolean bool4, String str2, Long l, int i, Object obj) {
        if ((i & 1) != 0) {
            bool = packageActivateResponseEntity.genesysActivityRegistered;
        }
        if ((i & 2) != 0) {
            bool2 = packageActivateResponseEntity.digitalSoloPackageActivated;
        }
        Boolean bool5 = bool2;
        if ((i & 4) != 0) {
            bool3 = packageActivateResponseEntity.rbPackageActivated;
        }
        Boolean bool6 = bool3;
        if ((i & 8) != 0) {
            str = packageActivateResponseEntity.newPackageName;
        }
        String str3 = str;
        if ((i & 16) != 0) {
            bool4 = packageActivateResponseEntity.soloPackageActivated;
        }
        Boolean bool7 = bool4;
        if ((i & 32) != 0) {
            str2 = packageActivateResponseEntity.status;
        }
        String str4 = str2;
        if ((i & 64) != 0) {
            l = packageActivateResponseEntity.packageActivationDate;
        }
        return packageActivateResponseEntity.copy(bool, bool5, bool6, str3, bool7, str4, l);
    }

    public final Boolean component1() {
        return this.genesysActivityRegistered;
    }

    public final Boolean component2() {
        return this.digitalSoloPackageActivated;
    }

    public final Boolean component3() {
        return this.rbPackageActivated;
    }

    public final String component4() {
        return this.newPackageName;
    }

    public final Boolean component5() {
        return this.soloPackageActivated;
    }

    public final String component6() {
        return this.status;
    }

    public final Long component7() {
        return this.packageActivationDate;
    }

    public final PackageActivateResponseEntity copy(Boolean bool, Boolean bool2, Boolean bool3, String str, Boolean bool4, String str2, Long l) {
        return new PackageActivateResponseEntity(bool, bool2, bool3, str, bool4, str2, l);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PackageActivateResponseEntity)) {
            return false;
        }
        PackageActivateResponseEntity packageActivateResponseEntity = (PackageActivateResponseEntity) obj;
        return C41536l.m120484d(this.genesysActivityRegistered, packageActivateResponseEntity.genesysActivityRegistered) && C41536l.m120484d(this.digitalSoloPackageActivated, packageActivateResponseEntity.digitalSoloPackageActivated) && C41536l.m120484d(this.rbPackageActivated, packageActivateResponseEntity.rbPackageActivated) && C41536l.m120484d(this.newPackageName, packageActivateResponseEntity.newPackageName) && C41536l.m120484d(this.soloPackageActivated, packageActivateResponseEntity.soloPackageActivated) && C41536l.m120484d(this.status, packageActivateResponseEntity.status) && C41536l.m120484d(this.packageActivationDate, packageActivateResponseEntity.packageActivationDate);
    }

    public final Boolean getDigitalSoloPackageActivated() {
        return this.digitalSoloPackageActivated;
    }

    public final Boolean getGenesysActivityRegistered() {
        return this.genesysActivityRegistered;
    }

    public final String getNewPackageName() {
        return this.newPackageName;
    }

    public final Long getPackageActivationDate() {
        return this.packageActivationDate;
    }

    public final Boolean getRbPackageActivated() {
        return this.rbPackageActivated;
    }

    public final Boolean getSoloPackageActivated() {
        return this.soloPackageActivated;
    }

    public final String getStatus() {
        return this.status;
    }

    public int hashCode() {
        Boolean bool = this.genesysActivityRegistered;
        int i = 0;
        int hashCode = (bool == null ? 0 : bool.hashCode()) * 31;
        Boolean bool2 = this.digitalSoloPackageActivated;
        int hashCode2 = (hashCode + (bool2 == null ? 0 : bool2.hashCode())) * 31;
        Boolean bool3 = this.rbPackageActivated;
        int hashCode3 = (hashCode2 + (bool3 == null ? 0 : bool3.hashCode())) * 31;
        String str = this.newPackageName;
        int hashCode4 = (hashCode3 + (str == null ? 0 : str.hashCode())) * 31;
        Boolean bool4 = this.soloPackageActivated;
        int hashCode5 = (hashCode4 + (bool4 == null ? 0 : bool4.hashCode())) * 31;
        String str2 = this.status;
        int hashCode6 = (hashCode5 + (str2 == null ? 0 : str2.hashCode())) * 31;
        Long l = this.packageActivationDate;
        if (l != null) {
            i = l.hashCode();
        }
        return hashCode6 + i;
    }

    public String toString() {
        Boolean bool = this.genesysActivityRegistered;
        Boolean bool2 = this.digitalSoloPackageActivated;
        Boolean bool3 = this.rbPackageActivated;
        String str = this.newPackageName;
        Boolean bool4 = this.soloPackageActivated;
        String str2 = this.status;
        Long l = this.packageActivationDate;
        return "PackageActivateResponseEntity(genesysActivityRegistered=" + bool + ", digitalSoloPackageActivated=" + bool2 + ", rbPackageActivated=" + bool3 + ", newPackageName=" + str + ", soloPackageActivated=" + bool4 + ", status=" + str2 + ", packageActivationDate=" + l + ")";
    }
}
