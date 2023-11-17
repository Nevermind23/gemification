package p341ge.bog.mobilebank.cardapplications.data.entity;

import androidx.annotation.Keep;
import kotlin.jvm.internal.C41536l;

@Keep
/* renamed from: ge.bog.mobilebank.cardapplications.data.entity.DebitCardRegisterResultEntity */
public final class DebitCardRegisterResultEntity {
    private final Long cardId;
    private final Long registerCardResultCode;

    public DebitCardRegisterResultEntity(Long l, Long l2) {
        this.cardId = l;
        this.registerCardResultCode = l2;
    }

    public static /* synthetic */ DebitCardRegisterResultEntity copy$default(DebitCardRegisterResultEntity debitCardRegisterResultEntity, Long l, Long l2, int i, Object obj) {
        if ((i & 1) != 0) {
            l = debitCardRegisterResultEntity.cardId;
        }
        if ((i & 2) != 0) {
            l2 = debitCardRegisterResultEntity.registerCardResultCode;
        }
        return debitCardRegisterResultEntity.copy(l, l2);
    }

    public final Long component1() {
        return this.cardId;
    }

    public final Long component2() {
        return this.registerCardResultCode;
    }

    public final DebitCardRegisterResultEntity copy(Long l, Long l2) {
        return new DebitCardRegisterResultEntity(l, l2);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof DebitCardRegisterResultEntity)) {
            return false;
        }
        DebitCardRegisterResultEntity debitCardRegisterResultEntity = (DebitCardRegisterResultEntity) obj;
        return C41536l.m120484d(this.cardId, debitCardRegisterResultEntity.cardId) && C41536l.m120484d(this.registerCardResultCode, debitCardRegisterResultEntity.registerCardResultCode);
    }

    public final Long getCardId() {
        return this.cardId;
    }

    public final Long getRegisterCardResultCode() {
        return this.registerCardResultCode;
    }

    public int hashCode() {
        Long l = this.cardId;
        int i = 0;
        int hashCode = (l == null ? 0 : l.hashCode()) * 31;
        Long l2 = this.registerCardResultCode;
        if (l2 != null) {
            i = l2.hashCode();
        }
        return hashCode + i;
    }

    public String toString() {
        Long l = this.cardId;
        Long l2 = this.registerCardResultCode;
        return "DebitCardRegisterResultEntity(cardId=" + l + ", registerCardResultCode=" + l2 + ")";
    }
}
