package p341ge.bog.mobilebank.cleanarch.data.loan.entity;

import androidx.annotation.Keep;
import kotlin.jvm.internal.C41536l;

@Keep
/* renamed from: ge.bog.mobilebank.cleanarch.data.loan.entity.RsApprovalEntity */
public final class RsApprovalEntity {
    private final String applicationId;

    public RsApprovalEntity(String str) {
        C41536l.m120489i(str, "applicationId");
        this.applicationId = str;
    }

    public static /* synthetic */ RsApprovalEntity copy$default(RsApprovalEntity rsApprovalEntity, String str, int i, Object obj) {
        if ((i & 1) != 0) {
            str = rsApprovalEntity.applicationId;
        }
        return rsApprovalEntity.copy(str);
    }

    public final String component1() {
        return this.applicationId;
    }

    public final RsApprovalEntity copy(String str) {
        C41536l.m120489i(str, "applicationId");
        return new RsApprovalEntity(str);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof RsApprovalEntity) && C41536l.m120484d(this.applicationId, ((RsApprovalEntity) obj).applicationId);
    }

    public final String getApplicationId() {
        return this.applicationId;
    }

    public int hashCode() {
        return this.applicationId.hashCode();
    }

    public String toString() {
        String str = this.applicationId;
        return "RsApprovalEntity(applicationId=" + str + ")";
    }
}
