package p341ge.bog.mobilebank.deposits.data.entity.depositbreak;

import androidx.annotation.Keep;
import kotlin.jvm.internal.C41536l;

@Keep
/* renamed from: ge.bog.mobilebank.deposits.data.entity.depositbreak.DepositBreakProcessValidationEntity */
public final class DepositBreakProcessValidationEntity {
    private final DepositBreakProcessValidationStatusEntity status;

    public DepositBreakProcessValidationEntity(DepositBreakProcessValidationStatusEntity depositBreakProcessValidationStatusEntity) {
        C41536l.m120489i(depositBreakProcessValidationStatusEntity, "status");
        this.status = depositBreakProcessValidationStatusEntity;
    }

    public static /* synthetic */ DepositBreakProcessValidationEntity copy$default(DepositBreakProcessValidationEntity depositBreakProcessValidationEntity, DepositBreakProcessValidationStatusEntity depositBreakProcessValidationStatusEntity, int i, Object obj) {
        if ((i & 1) != 0) {
            depositBreakProcessValidationStatusEntity = depositBreakProcessValidationEntity.status;
        }
        return depositBreakProcessValidationEntity.copy(depositBreakProcessValidationStatusEntity);
    }

    public final DepositBreakProcessValidationStatusEntity component1() {
        return this.status;
    }

    public final DepositBreakProcessValidationEntity copy(DepositBreakProcessValidationStatusEntity depositBreakProcessValidationStatusEntity) {
        C41536l.m120489i(depositBreakProcessValidationStatusEntity, "status");
        return new DepositBreakProcessValidationEntity(depositBreakProcessValidationStatusEntity);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof DepositBreakProcessValidationEntity) && this.status == ((DepositBreakProcessValidationEntity) obj).status;
    }

    public final DepositBreakProcessValidationStatusEntity getStatus() {
        return this.status;
    }

    public int hashCode() {
        return this.status.hashCode();
    }

    public String toString() {
        DepositBreakProcessValidationStatusEntity depositBreakProcessValidationStatusEntity = this.status;
        return "DepositBreakProcessValidationEntity(status=" + depositBreakProcessValidationStatusEntity + ")";
    }
}
