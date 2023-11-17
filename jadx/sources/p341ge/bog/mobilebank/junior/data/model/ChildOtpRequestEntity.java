package p341ge.bog.mobilebank.junior.data.model;

import androidx.annotation.Keep;
import p190o1.C7397t;

@Keep
/* renamed from: ge.bog.mobilebank.junior.data.model.ChildOtpRequestEntity */
public final class ChildOtpRequestEntity {
    private final long notificationId;
    private final long validationRequestId;

    public ChildOtpRequestEntity(long j, long j2) {
        this.notificationId = j;
        this.validationRequestId = j2;
    }

    public static /* synthetic */ ChildOtpRequestEntity copy$default(ChildOtpRequestEntity childOtpRequestEntity, long j, long j2, int i, Object obj) {
        if ((i & 1) != 0) {
            j = childOtpRequestEntity.notificationId;
        }
        if ((i & 2) != 0) {
            j2 = childOtpRequestEntity.validationRequestId;
        }
        return childOtpRequestEntity.copy(j, j2);
    }

    public final long component1() {
        return this.notificationId;
    }

    public final long component2() {
        return this.validationRequestId;
    }

    public final ChildOtpRequestEntity copy(long j, long j2) {
        return new ChildOtpRequestEntity(j, j2);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ChildOtpRequestEntity)) {
            return false;
        }
        ChildOtpRequestEntity childOtpRequestEntity = (ChildOtpRequestEntity) obj;
        return this.notificationId == childOtpRequestEntity.notificationId && this.validationRequestId == childOtpRequestEntity.validationRequestId;
    }

    public final long getNotificationId() {
        return this.notificationId;
    }

    public final long getValidationRequestId() {
        return this.validationRequestId;
    }

    public int hashCode() {
        return (C7397t.m28148a(this.notificationId) * 31) + C7397t.m28148a(this.validationRequestId);
    }

    public String toString() {
        long j = this.notificationId;
        long j2 = this.validationRequestId;
        return "ChildOtpRequestEntity(notificationId=" + j + ", validationRequestId=" + j2 + ")";
    }
}
