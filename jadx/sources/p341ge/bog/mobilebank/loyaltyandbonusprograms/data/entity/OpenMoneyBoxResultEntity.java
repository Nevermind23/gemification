package p341ge.bog.mobilebank.loyaltyandbonusprograms.data.entity;

import androidx.annotation.Keep;
import p190o1.C7397t;

@Keep
/* renamed from: ge.bog.mobilebank.loyaltyandbonusprograms.data.entity.OpenMoneyBoxResultEntity */
public final class OpenMoneyBoxResultEntity {
    private final long casId;

    public OpenMoneyBoxResultEntity(long j) {
        this.casId = j;
    }

    public static /* synthetic */ OpenMoneyBoxResultEntity copy$default(OpenMoneyBoxResultEntity openMoneyBoxResultEntity, long j, int i, Object obj) {
        if ((i & 1) != 0) {
            j = openMoneyBoxResultEntity.casId;
        }
        return openMoneyBoxResultEntity.copy(j);
    }

    public final long component1() {
        return this.casId;
    }

    public final OpenMoneyBoxResultEntity copy(long j) {
        return new OpenMoneyBoxResultEntity(j);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof OpenMoneyBoxResultEntity) && this.casId == ((OpenMoneyBoxResultEntity) obj).casId;
    }

    public final long getCasId() {
        return this.casId;
    }

    public int hashCode() {
        return C7397t.m28148a(this.casId);
    }

    public String toString() {
        long j = this.casId;
        return "OpenMoneyBoxResultEntity(casId=" + j + ")";
    }
}
