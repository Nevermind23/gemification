package p341ge.bog.mobilebank.galtandtaggart.data.onboarding.userinfo.model;

import androidx.annotation.Keep;
import kotlin.jvm.internal.C41536l;
import kotlin.jvm.internal.DefaultConstructorMarker;

@Keep
/* renamed from: ge.bog.mobilebank.galtandtaggart.data.onboarding.userinfo.model.EmploymentInfoPostApiModel */
public final class EmploymentInfoPostApiModel {
    private final boolean broker;
    private final String directorOf;
    private final String employerName;
    private final String occupationStatus;
    private final String positionId;
    private final String sectorId;

    public EmploymentInfoPostApiModel(String str, String str2, boolean z, String str3, String str4, String str5) {
        C41536l.m120489i(str, "occupationStatus");
        C41536l.m120489i(str2, "employerName");
        C41536l.m120489i(str3, "directorOf");
        this.occupationStatus = str;
        this.employerName = str2;
        this.broker = z;
        this.directorOf = str3;
        this.sectorId = str4;
        this.positionId = str5;
    }

    public static /* synthetic */ EmploymentInfoPostApiModel copy$default(EmploymentInfoPostApiModel employmentInfoPostApiModel, String str, String str2, boolean z, String str3, String str4, String str5, int i, Object obj) {
        if ((i & 1) != 0) {
            str = employmentInfoPostApiModel.occupationStatus;
        }
        if ((i & 2) != 0) {
            str2 = employmentInfoPostApiModel.employerName;
        }
        String str6 = str2;
        if ((i & 4) != 0) {
            z = employmentInfoPostApiModel.broker;
        }
        boolean z2 = z;
        if ((i & 8) != 0) {
            str3 = employmentInfoPostApiModel.directorOf;
        }
        String str7 = str3;
        if ((i & 16) != 0) {
            str4 = employmentInfoPostApiModel.sectorId;
        }
        String str8 = str4;
        if ((i & 32) != 0) {
            str5 = employmentInfoPostApiModel.positionId;
        }
        return employmentInfoPostApiModel.copy(str, str6, z2, str7, str8, str5);
    }

    public final String component1() {
        return this.occupationStatus;
    }

    public final String component2() {
        return this.employerName;
    }

    public final boolean component3() {
        return this.broker;
    }

    public final String component4() {
        return this.directorOf;
    }

    public final String component5() {
        return this.sectorId;
    }

    public final String component6() {
        return this.positionId;
    }

    public final EmploymentInfoPostApiModel copy(String str, String str2, boolean z, String str3, String str4, String str5) {
        C41536l.m120489i(str, "occupationStatus");
        C41536l.m120489i(str2, "employerName");
        C41536l.m120489i(str3, "directorOf");
        return new EmploymentInfoPostApiModel(str, str2, z, str3, str4, str5);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof EmploymentInfoPostApiModel)) {
            return false;
        }
        EmploymentInfoPostApiModel employmentInfoPostApiModel = (EmploymentInfoPostApiModel) obj;
        return C41536l.m120484d(this.occupationStatus, employmentInfoPostApiModel.occupationStatus) && C41536l.m120484d(this.employerName, employmentInfoPostApiModel.employerName) && this.broker == employmentInfoPostApiModel.broker && C41536l.m120484d(this.directorOf, employmentInfoPostApiModel.directorOf) && C41536l.m120484d(this.sectorId, employmentInfoPostApiModel.sectorId) && C41536l.m120484d(this.positionId, employmentInfoPostApiModel.positionId);
    }

    public final boolean getBroker() {
        return this.broker;
    }

    public final String getDirectorOf() {
        return this.directorOf;
    }

    public final String getEmployerName() {
        return this.employerName;
    }

    public final String getOccupationStatus() {
        return this.occupationStatus;
    }

    public final String getPositionId() {
        return this.positionId;
    }

    public final String getSectorId() {
        return this.sectorId;
    }

    public int hashCode() {
        int hashCode = ((this.occupationStatus.hashCode() * 31) + this.employerName.hashCode()) * 31;
        boolean z = this.broker;
        if (z) {
            z = true;
        }
        int hashCode2 = (((hashCode + (z ? 1 : 0)) * 31) + this.directorOf.hashCode()) * 31;
        String str = this.sectorId;
        int i = 0;
        int hashCode3 = (hashCode2 + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.positionId;
        if (str2 != null) {
            i = str2.hashCode();
        }
        return hashCode3 + i;
    }

    public String toString() {
        String str = this.occupationStatus;
        String str2 = this.employerName;
        boolean z = this.broker;
        String str3 = this.directorOf;
        String str4 = this.sectorId;
        String str5 = this.positionId;
        return "EmploymentInfoPostApiModel(occupationStatus=" + str + ", employerName=" + str2 + ", broker=" + z + ", directorOf=" + str3 + ", sectorId=" + str4 + ", positionId=" + str5 + ")";
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ EmploymentInfoPostApiModel(String str, String str2, boolean z, String str3, String str4, String str5, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, str2, z, str3, (i & 16) != 0 ? null : str4, (i & 32) != 0 ? null : str5);
    }
}
