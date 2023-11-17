package p341ge.bog.mobilebank.transportcard.data.model;

import androidx.annotation.Keep;
import kotlin.jvm.internal.C41536l;
import p190o1.C7397t;

@Keep
/* renamed from: ge.bog.mobilebank.transportcard.data.model.PassDeviceApiModel */
public final class PassDeviceApiModel {
    private final String deviceId;
    private final String deviceName;
    private final long deviceRegDate;
    private final String deviceType;
    private final boolean isPhysicalDevice;

    public PassDeviceApiModel(String str, String str2, String str3, boolean z, long j) {
        C41536l.m120489i(str, "deviceId");
        C41536l.m120489i(str2, "deviceType");
        C41536l.m120489i(str3, "deviceName");
        this.deviceId = str;
        this.deviceType = str2;
        this.deviceName = str3;
        this.isPhysicalDevice = z;
        this.deviceRegDate = j;
    }

    public static /* synthetic */ PassDeviceApiModel copy$default(PassDeviceApiModel passDeviceApiModel, String str, String str2, String str3, boolean z, long j, int i, Object obj) {
        if ((i & 1) != 0) {
            str = passDeviceApiModel.deviceId;
        }
        if ((i & 2) != 0) {
            str2 = passDeviceApiModel.deviceType;
        }
        String str4 = str2;
        if ((i & 4) != 0) {
            str3 = passDeviceApiModel.deviceName;
        }
        String str5 = str3;
        if ((i & 8) != 0) {
            z = passDeviceApiModel.isPhysicalDevice;
        }
        boolean z2 = z;
        if ((i & 16) != 0) {
            j = passDeviceApiModel.deviceRegDate;
        }
        return passDeviceApiModel.copy(str, str4, str5, z2, j);
    }

    public final String component1() {
        return this.deviceId;
    }

    public final String component2() {
        return this.deviceType;
    }

    public final String component3() {
        return this.deviceName;
    }

    public final boolean component4() {
        return this.isPhysicalDevice;
    }

    public final long component5() {
        return this.deviceRegDate;
    }

    public final PassDeviceApiModel copy(String str, String str2, String str3, boolean z, long j) {
        C41536l.m120489i(str, "deviceId");
        C41536l.m120489i(str2, "deviceType");
        C41536l.m120489i(str3, "deviceName");
        return new PassDeviceApiModel(str, str2, str3, z, j);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PassDeviceApiModel)) {
            return false;
        }
        PassDeviceApiModel passDeviceApiModel = (PassDeviceApiModel) obj;
        return C41536l.m120484d(this.deviceId, passDeviceApiModel.deviceId) && C41536l.m120484d(this.deviceType, passDeviceApiModel.deviceType) && C41536l.m120484d(this.deviceName, passDeviceApiModel.deviceName) && this.isPhysicalDevice == passDeviceApiModel.isPhysicalDevice && this.deviceRegDate == passDeviceApiModel.deviceRegDate;
    }

    public final String getDeviceId() {
        return this.deviceId;
    }

    public final String getDeviceName() {
        return this.deviceName;
    }

    public final long getDeviceRegDate() {
        return this.deviceRegDate;
    }

    public final String getDeviceType() {
        return this.deviceType;
    }

    public int hashCode() {
        int hashCode = ((((this.deviceId.hashCode() * 31) + this.deviceType.hashCode()) * 31) + this.deviceName.hashCode()) * 31;
        boolean z = this.isPhysicalDevice;
        if (z) {
            z = true;
        }
        return ((hashCode + (z ? 1 : 0)) * 31) + C7397t.m28148a(this.deviceRegDate);
    }

    public final boolean isPhysicalDevice() {
        return this.isPhysicalDevice;
    }

    public String toString() {
        String str = this.deviceId;
        String str2 = this.deviceType;
        String str3 = this.deviceName;
        boolean z = this.isPhysicalDevice;
        long j = this.deviceRegDate;
        return "PassDeviceApiModel(deviceId=" + str + ", deviceType=" + str2 + ", deviceName=" + str3 + ", isPhysicalDevice=" + z + ", deviceRegDate=" + j + ")";
    }
}
