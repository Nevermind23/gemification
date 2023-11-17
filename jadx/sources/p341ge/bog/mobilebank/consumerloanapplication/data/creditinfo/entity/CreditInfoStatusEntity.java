package p341ge.bog.mobilebank.consumerloanapplication.data.creditinfo.entity;

import androidx.annotation.Keep;
import kotlin.jvm.internal.C41536l;

@Keep
/* renamed from: ge.bog.mobilebank.consumerloanapplication.data.creditinfo.entity.CreditInfoStatusEntity */
public final class CreditInfoStatusEntity {
    private final String serviceKey;
    private final String serviceStatus;

    public CreditInfoStatusEntity(String str, String str2) {
        C41536l.m120489i(str, "serviceKey");
        C41536l.m120489i(str2, "serviceStatus");
        this.serviceKey = str;
        this.serviceStatus = str2;
    }

    public static /* synthetic */ CreditInfoStatusEntity copy$default(CreditInfoStatusEntity creditInfoStatusEntity, String str, String str2, int i, Object obj) {
        if ((i & 1) != 0) {
            str = creditInfoStatusEntity.serviceKey;
        }
        if ((i & 2) != 0) {
            str2 = creditInfoStatusEntity.serviceStatus;
        }
        return creditInfoStatusEntity.copy(str, str2);
    }

    public final String component1() {
        return this.serviceKey;
    }

    public final String component2() {
        return this.serviceStatus;
    }

    public final CreditInfoStatusEntity copy(String str, String str2) {
        C41536l.m120489i(str, "serviceKey");
        C41536l.m120489i(str2, "serviceStatus");
        return new CreditInfoStatusEntity(str, str2);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CreditInfoStatusEntity)) {
            return false;
        }
        CreditInfoStatusEntity creditInfoStatusEntity = (CreditInfoStatusEntity) obj;
        return C41536l.m120484d(this.serviceKey, creditInfoStatusEntity.serviceKey) && C41536l.m120484d(this.serviceStatus, creditInfoStatusEntity.serviceStatus);
    }

    public final String getServiceKey() {
        return this.serviceKey;
    }

    public final String getServiceStatus() {
        return this.serviceStatus;
    }

    public int hashCode() {
        return (this.serviceKey.hashCode() * 31) + this.serviceStatus.hashCode();
    }

    public String toString() {
        String str = this.serviceKey;
        String str2 = this.serviceStatus;
        return "CreditInfoStatusEntity(serviceKey=" + str + ", serviceStatus=" + str2 + ")";
    }
}
