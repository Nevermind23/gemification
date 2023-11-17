package p341ge.bog.sso_client.models;

import androidx.annotation.Keep;
import kotlin.jvm.internal.C41536l;

@Keep
/* renamed from: ge.bog.sso_client.models.DeviceIdentifier */
public final class DeviceIdentifier {
    private final Long deviceId;
    private final String extCustomerId;

    public DeviceIdentifier(String str, Long l) {
        C41536l.m120489i(str, "extCustomerId");
        this.extCustomerId = str;
        this.deviceId = l;
    }

    public static /* synthetic */ DeviceIdentifier copy$default(DeviceIdentifier deviceIdentifier, String str, Long l, int i, Object obj) {
        if ((i & 1) != 0) {
            str = deviceIdentifier.extCustomerId;
        }
        if ((i & 2) != 0) {
            l = deviceIdentifier.deviceId;
        }
        return deviceIdentifier.copy(str, l);
    }

    public final String component1() {
        return this.extCustomerId;
    }

    public final Long component2() {
        return this.deviceId;
    }

    public final DeviceIdentifier copy(String str, Long l) {
        C41536l.m120489i(str, "extCustomerId");
        return new DeviceIdentifier(str, l);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof DeviceIdentifier)) {
            return false;
        }
        DeviceIdentifier deviceIdentifier = (DeviceIdentifier) obj;
        return C41536l.m120484d(this.extCustomerId, deviceIdentifier.extCustomerId) && C41536l.m120484d(this.deviceId, deviceIdentifier.deviceId);
    }

    public final Long getDeviceId() {
        return this.deviceId;
    }

    public final String getExtCustomerId() {
        return this.extCustomerId;
    }

    public int hashCode() {
        int hashCode = this.extCustomerId.hashCode() * 31;
        Long l = this.deviceId;
        return hashCode + (l == null ? 0 : l.hashCode());
    }

    public String toString() {
        return "DeviceIdentifier(extCustomerId=" + this.extCustomerId + ", deviceId=" + this.deviceId + ')';
    }
}
