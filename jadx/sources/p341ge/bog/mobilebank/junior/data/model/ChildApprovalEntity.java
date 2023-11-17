package p341ge.bog.mobilebank.junior.data.model;

import androidx.annotation.Keep;
import kotlin.jvm.internal.C41536l;

@Keep
/* renamed from: ge.bog.mobilebank.junior.data.model.ChildApprovalEntity */
public final class ChildApprovalEntity {
    private final boolean isNewUser;
    private final boolean needApproveContact;
    private final String operationReference;
    private final int retryCount;

    public ChildApprovalEntity(boolean z, boolean z2, String str, int i) {
        C41536l.m120489i(str, "operationReference");
        this.isNewUser = z;
        this.needApproveContact = z2;
        this.operationReference = str;
        this.retryCount = i;
    }

    public static /* synthetic */ ChildApprovalEntity copy$default(ChildApprovalEntity childApprovalEntity, boolean z, boolean z2, String str, int i, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            z = childApprovalEntity.isNewUser;
        }
        if ((i2 & 2) != 0) {
            z2 = childApprovalEntity.needApproveContact;
        }
        if ((i2 & 4) != 0) {
            str = childApprovalEntity.operationReference;
        }
        if ((i2 & 8) != 0) {
            i = childApprovalEntity.retryCount;
        }
        return childApprovalEntity.copy(z, z2, str, i);
    }

    public final boolean component1() {
        return this.isNewUser;
    }

    public final boolean component2() {
        return this.needApproveContact;
    }

    public final String component3() {
        return this.operationReference;
    }

    public final int component4() {
        return this.retryCount;
    }

    public final ChildApprovalEntity copy(boolean z, boolean z2, String str, int i) {
        C41536l.m120489i(str, "operationReference");
        return new ChildApprovalEntity(z, z2, str, i);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ChildApprovalEntity)) {
            return false;
        }
        ChildApprovalEntity childApprovalEntity = (ChildApprovalEntity) obj;
        return this.isNewUser == childApprovalEntity.isNewUser && this.needApproveContact == childApprovalEntity.needApproveContact && C41536l.m120484d(this.operationReference, childApprovalEntity.operationReference) && this.retryCount == childApprovalEntity.retryCount;
    }

    public final boolean getNeedApproveContact() {
        return this.needApproveContact;
    }

    public final String getOperationReference() {
        return this.operationReference;
    }

    public final int getRetryCount() {
        return this.retryCount;
    }

    public int hashCode() {
        boolean z = this.isNewUser;
        boolean z2 = true;
        if (z) {
            z = true;
        }
        int i = (z ? 1 : 0) * true;
        boolean z3 = this.needApproveContact;
        if (!z3) {
            z2 = z3;
        }
        return ((((i + (z2 ? 1 : 0)) * 31) + this.operationReference.hashCode()) * 31) + this.retryCount;
    }

    public final boolean isNewUser() {
        return this.isNewUser;
    }

    public String toString() {
        boolean z = this.isNewUser;
        boolean z2 = this.needApproveContact;
        String str = this.operationReference;
        int i = this.retryCount;
        return "ChildApprovalEntity(isNewUser=" + z + ", needApproveContact=" + z2 + ", operationReference=" + str + ", retryCount=" + i + ")";
    }
}
