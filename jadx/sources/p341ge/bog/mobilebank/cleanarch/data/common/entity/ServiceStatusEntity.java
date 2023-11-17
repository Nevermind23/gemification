package p341ge.bog.mobilebank.cleanarch.data.common.entity;

import androidx.annotation.Keep;
import kotlin.jvm.internal.C41536l;
import kotlin.jvm.internal.DefaultConstructorMarker;

@Keep
/* renamed from: ge.bog.mobilebank.cleanarch.data.common.entity.ServiceStatusEntity */
public final class ServiceStatusEntity {
    private final String modificationDate;
    private final StatusEntity serviceStatus;
    private final boolean statusChangeAllowed;

    public ServiceStatusEntity(StatusEntity statusEntity, String str, boolean z) {
        C41536l.m120489i(statusEntity, "serviceStatus");
        this.serviceStatus = statusEntity;
        this.modificationDate = str;
        this.statusChangeAllowed = z;
    }

    public static /* synthetic */ ServiceStatusEntity copy$default(ServiceStatusEntity serviceStatusEntity, StatusEntity statusEntity, String str, boolean z, int i, Object obj) {
        if ((i & 1) != 0) {
            statusEntity = serviceStatusEntity.serviceStatus;
        }
        if ((i & 2) != 0) {
            str = serviceStatusEntity.modificationDate;
        }
        if ((i & 4) != 0) {
            z = serviceStatusEntity.statusChangeAllowed;
        }
        return serviceStatusEntity.copy(statusEntity, str, z);
    }

    public final StatusEntity component1() {
        return this.serviceStatus;
    }

    public final String component2() {
        return this.modificationDate;
    }

    public final boolean component3() {
        return this.statusChangeAllowed;
    }

    public final ServiceStatusEntity copy(StatusEntity statusEntity, String str, boolean z) {
        C41536l.m120489i(statusEntity, "serviceStatus");
        return new ServiceStatusEntity(statusEntity, str, z);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ServiceStatusEntity)) {
            return false;
        }
        ServiceStatusEntity serviceStatusEntity = (ServiceStatusEntity) obj;
        return this.serviceStatus == serviceStatusEntity.serviceStatus && C41536l.m120484d(this.modificationDate, serviceStatusEntity.modificationDate) && this.statusChangeAllowed == serviceStatusEntity.statusChangeAllowed;
    }

    public final String getModificationDate() {
        return this.modificationDate;
    }

    public final StatusEntity getServiceStatus() {
        return this.serviceStatus;
    }

    public final boolean getStatusChangeAllowed() {
        return this.statusChangeAllowed;
    }

    public int hashCode() {
        int hashCode = this.serviceStatus.hashCode() * 31;
        String str = this.modificationDate;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        boolean z = this.statusChangeAllowed;
        if (z) {
            z = true;
        }
        return hashCode2 + (z ? 1 : 0);
    }

    public String toString() {
        StatusEntity statusEntity = this.serviceStatus;
        String str = this.modificationDate;
        boolean z = this.statusChangeAllowed;
        return "ServiceStatusEntity(serviceStatus=" + statusEntity + ", modificationDate=" + str + ", statusChangeAllowed=" + z + ")";
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ ServiceStatusEntity(StatusEntity statusEntity, String str, boolean z, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(statusEntity, str, (i & 4) != 0 ? false : z);
    }
}
