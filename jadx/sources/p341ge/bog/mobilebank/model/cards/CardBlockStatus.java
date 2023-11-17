package p341ge.bog.mobilebank.model.cards;

import hd0.C24978b;
import kotlin.jvm.internal.C41536l;
import p190o1.C7397t;

/* renamed from: ge.bog.mobilebank.model.cards.CardBlockStatus */
public final class CardBlockStatus {
    private final long cardId;
    private final C24978b isCardBlocked;

    public CardBlockStatus(long j, C24978b bVar) {
        C41536l.m120489i(bVar, "isCardBlocked");
        this.cardId = j;
        this.isCardBlocked = bVar;
    }

    private final C24978b component2() {
        return this.isCardBlocked;
    }

    public static /* synthetic */ CardBlockStatus copy$default(CardBlockStatus cardBlockStatus, long j, C24978b bVar, int i, Object obj) {
        if ((i & 1) != 0) {
            j = cardBlockStatus.cardId;
        }
        if ((i & 2) != 0) {
            bVar = cardBlockStatus.isCardBlocked;
        }
        return cardBlockStatus.copy(j, bVar);
    }

    public final long component1() {
        return this.cardId;
    }

    public final CardBlockStatus copy(long j, C24978b bVar) {
        C41536l.m120489i(bVar, "isCardBlocked");
        return new CardBlockStatus(j, bVar);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CardBlockStatus)) {
            return false;
        }
        CardBlockStatus cardBlockStatus = (CardBlockStatus) obj;
        return this.cardId == cardBlockStatus.cardId && this.isCardBlocked == cardBlockStatus.isCardBlocked;
    }

    public final long getCardId() {
        return this.cardId;
    }

    public final boolean getIsCardBlocked() {
        return this.isCardBlocked == C24978b.YES;
    }

    public int hashCode() {
        return (C7397t.m28148a(this.cardId) * 31) + this.isCardBlocked.hashCode();
    }

    public String toString() {
        long j = this.cardId;
        C24978b bVar = this.isCardBlocked;
        return "CardBlockStatus(cardId=" + j + ", isCardBlocked=" + bVar + ")";
    }
}
