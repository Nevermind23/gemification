package p341ge.bog.mobilebank.products.data.model;

import androidx.annotation.Keep;
import kotlin.jvm.internal.C41536l;
import p190o1.C7397t;

@Keep
/* renamed from: ge.bog.mobilebank.products.data.model.CardBlockStatusApiModel */
public final class CardBlockStatusApiModel {
    private final long cardId;
    private final YesNoApiModel isCardBlocked;

    public CardBlockStatusApiModel(long j, YesNoApiModel yesNoApiModel) {
        C41536l.m120489i(yesNoApiModel, "isCardBlocked");
        this.cardId = j;
        this.isCardBlocked = yesNoApiModel;
    }

    public static /* synthetic */ CardBlockStatusApiModel copy$default(CardBlockStatusApiModel cardBlockStatusApiModel, long j, YesNoApiModel yesNoApiModel, int i, Object obj) {
        if ((i & 1) != 0) {
            j = cardBlockStatusApiModel.cardId;
        }
        if ((i & 2) != 0) {
            yesNoApiModel = cardBlockStatusApiModel.isCardBlocked;
        }
        return cardBlockStatusApiModel.copy(j, yesNoApiModel);
    }

    public final long component1() {
        return this.cardId;
    }

    public final YesNoApiModel component2() {
        return this.isCardBlocked;
    }

    public final CardBlockStatusApiModel copy(long j, YesNoApiModel yesNoApiModel) {
        C41536l.m120489i(yesNoApiModel, "isCardBlocked");
        return new CardBlockStatusApiModel(j, yesNoApiModel);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CardBlockStatusApiModel)) {
            return false;
        }
        CardBlockStatusApiModel cardBlockStatusApiModel = (CardBlockStatusApiModel) obj;
        return this.cardId == cardBlockStatusApiModel.cardId && this.isCardBlocked == cardBlockStatusApiModel.isCardBlocked;
    }

    public final long getCardId() {
        return this.cardId;
    }

    public int hashCode() {
        return (C7397t.m28148a(this.cardId) * 31) + this.isCardBlocked.hashCode();
    }

    public final YesNoApiModel isCardBlocked() {
        return this.isCardBlocked;
    }

    public String toString() {
        long j = this.cardId;
        YesNoApiModel yesNoApiModel = this.isCardBlocked;
        return "CardBlockStatusApiModel(cardId=" + j + ", isCardBlocked=" + yesNoApiModel + ")";
    }
}
