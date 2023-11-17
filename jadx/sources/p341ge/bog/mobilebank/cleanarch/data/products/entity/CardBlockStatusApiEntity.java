package p341ge.bog.mobilebank.cleanarch.data.products.entity;

import androidx.annotation.Keep;
import kotlin.jvm.internal.C41536l;
import p190o1.C7397t;
import p341ge.bog.mobilebank.cleanarch.data.common.entity.YesNoApiEntity;

@Keep
/* renamed from: ge.bog.mobilebank.cleanarch.data.products.entity.CardBlockStatusApiEntity */
public final class CardBlockStatusApiEntity {
    private final long cardId;
    private final YesNoApiEntity isCardBlocked;

    public CardBlockStatusApiEntity(long j, YesNoApiEntity yesNoApiEntity) {
        C41536l.m120489i(yesNoApiEntity, "isCardBlocked");
        this.cardId = j;
        this.isCardBlocked = yesNoApiEntity;
    }

    public static /* synthetic */ CardBlockStatusApiEntity copy$default(CardBlockStatusApiEntity cardBlockStatusApiEntity, long j, YesNoApiEntity yesNoApiEntity, int i, Object obj) {
        if ((i & 1) != 0) {
            j = cardBlockStatusApiEntity.cardId;
        }
        if ((i & 2) != 0) {
            yesNoApiEntity = cardBlockStatusApiEntity.isCardBlocked;
        }
        return cardBlockStatusApiEntity.copy(j, yesNoApiEntity);
    }

    public final long component1() {
        return this.cardId;
    }

    public final YesNoApiEntity component2() {
        return this.isCardBlocked;
    }

    public final CardBlockStatusApiEntity copy(long j, YesNoApiEntity yesNoApiEntity) {
        C41536l.m120489i(yesNoApiEntity, "isCardBlocked");
        return new CardBlockStatusApiEntity(j, yesNoApiEntity);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CardBlockStatusApiEntity)) {
            return false;
        }
        CardBlockStatusApiEntity cardBlockStatusApiEntity = (CardBlockStatusApiEntity) obj;
        return this.cardId == cardBlockStatusApiEntity.cardId && this.isCardBlocked == cardBlockStatusApiEntity.isCardBlocked;
    }

    public final long getCardId() {
        return this.cardId;
    }

    public int hashCode() {
        return (C7397t.m28148a(this.cardId) * 31) + this.isCardBlocked.hashCode();
    }

    public final YesNoApiEntity isCardBlocked() {
        return this.isCardBlocked;
    }

    public String toString() {
        long j = this.cardId;
        YesNoApiEntity yesNoApiEntity = this.isCardBlocked;
        return "CardBlockStatusApiEntity(cardId=" + j + ", isCardBlocked=" + yesNoApiEntity + ")";
    }
}
