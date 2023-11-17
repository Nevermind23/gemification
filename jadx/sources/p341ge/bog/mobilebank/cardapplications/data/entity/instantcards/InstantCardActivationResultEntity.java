package p341ge.bog.mobilebank.cardapplications.data.entity.instantcards;

import androidx.annotation.Keep;
import kotlin.jvm.internal.C41536l;

@Keep
/* renamed from: ge.bog.mobilebank.cardapplications.data.entity.instantcards.InstantCardActivationResultEntity */
public final class InstantCardActivationResultEntity {
    private final Long cardId;

    public InstantCardActivationResultEntity(Long l) {
        this.cardId = l;
    }

    public static /* synthetic */ InstantCardActivationResultEntity copy$default(InstantCardActivationResultEntity instantCardActivationResultEntity, Long l, int i, Object obj) {
        if ((i & 1) != 0) {
            l = instantCardActivationResultEntity.cardId;
        }
        return instantCardActivationResultEntity.copy(l);
    }

    public final Long component1() {
        return this.cardId;
    }

    public final InstantCardActivationResultEntity copy(Long l) {
        return new InstantCardActivationResultEntity(l);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof InstantCardActivationResultEntity) && C41536l.m120484d(this.cardId, ((InstantCardActivationResultEntity) obj).cardId);
    }

    public final Long getCardId() {
        return this.cardId;
    }

    public int hashCode() {
        Long l = this.cardId;
        if (l == null) {
            return 0;
        }
        return l.hashCode();
    }

    public String toString() {
        Long l = this.cardId;
        return "InstantCardActivationResultEntity(cardId=" + l + ")";
    }
}
