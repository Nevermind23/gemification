package p341ge.bog.mobilebank.deposits.data.entity.depositbreak;

import androidx.annotation.Keep;
import kotlin.jvm.internal.C41536l;

@Keep
/* renamed from: ge.bog.mobilebank.deposits.data.entity.depositbreak.DepositBreakValidationEntity */
public final class DepositBreakValidationEntity {
    private final DepositBreakErrorTypeEntity errorType;
    private final String key;

    public DepositBreakValidationEntity(DepositBreakErrorTypeEntity depositBreakErrorTypeEntity, String str) {
        this.errorType = depositBreakErrorTypeEntity;
        this.key = str;
    }

    public static /* synthetic */ DepositBreakValidationEntity copy$default(DepositBreakValidationEntity depositBreakValidationEntity, DepositBreakErrorTypeEntity depositBreakErrorTypeEntity, String str, int i, Object obj) {
        if ((i & 1) != 0) {
            depositBreakErrorTypeEntity = depositBreakValidationEntity.errorType;
        }
        if ((i & 2) != 0) {
            str = depositBreakValidationEntity.key;
        }
        return depositBreakValidationEntity.copy(depositBreakErrorTypeEntity, str);
    }

    public final DepositBreakErrorTypeEntity component1() {
        return this.errorType;
    }

    public final String component2() {
        return this.key;
    }

    public final DepositBreakValidationEntity copy(DepositBreakErrorTypeEntity depositBreakErrorTypeEntity, String str) {
        return new DepositBreakValidationEntity(depositBreakErrorTypeEntity, str);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof DepositBreakValidationEntity)) {
            return false;
        }
        DepositBreakValidationEntity depositBreakValidationEntity = (DepositBreakValidationEntity) obj;
        return this.errorType == depositBreakValidationEntity.errorType && C41536l.m120484d(this.key, depositBreakValidationEntity.key);
    }

    public final DepositBreakErrorTypeEntity getErrorType() {
        return this.errorType;
    }

    public final String getKey() {
        return this.key;
    }

    public int hashCode() {
        DepositBreakErrorTypeEntity depositBreakErrorTypeEntity = this.errorType;
        int i = 0;
        int hashCode = (depositBreakErrorTypeEntity == null ? 0 : depositBreakErrorTypeEntity.hashCode()) * 31;
        String str = this.key;
        if (str != null) {
            i = str.hashCode();
        }
        return hashCode + i;
    }

    public String toString() {
        DepositBreakErrorTypeEntity depositBreakErrorTypeEntity = this.errorType;
        String str = this.key;
        return "DepositBreakValidationEntity(errorType=" + depositBreakErrorTypeEntity + ", key=" + str + ")";
    }
}
