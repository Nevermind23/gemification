package p341ge.bog.mobilebank.giftcards.data.model;

import androidx.annotation.Keep;
import java.util.List;
import kotlin.jvm.internal.C41536l;

@Keep
/* renamed from: ge.bog.mobilebank.giftcards.data.model.GiftedTypeGiftCardsApiModel */
public final class GiftedTypeGiftCardsApiModel {
    private final List<GiveAwayGiftCardApiModel> giveAwayGiftCards;
    private final List<PurchasedGiftCardApiModel> purchasedGiftCards;

    public GiftedTypeGiftCardsApiModel(List<PurchasedGiftCardApiModel> list, List<GiveAwayGiftCardApiModel> list2) {
        this.purchasedGiftCards = list;
        this.giveAwayGiftCards = list2;
    }

    public static /* synthetic */ GiftedTypeGiftCardsApiModel copy$default(GiftedTypeGiftCardsApiModel giftedTypeGiftCardsApiModel, List<PurchasedGiftCardApiModel> list, List<GiveAwayGiftCardApiModel> list2, int i, Object obj) {
        if ((i & 1) != 0) {
            list = giftedTypeGiftCardsApiModel.purchasedGiftCards;
        }
        if ((i & 2) != 0) {
            list2 = giftedTypeGiftCardsApiModel.giveAwayGiftCards;
        }
        return giftedTypeGiftCardsApiModel.copy(list, list2);
    }

    public final List<PurchasedGiftCardApiModel> component1() {
        return this.purchasedGiftCards;
    }

    public final List<GiveAwayGiftCardApiModel> component2() {
        return this.giveAwayGiftCards;
    }

    public final GiftedTypeGiftCardsApiModel copy(List<PurchasedGiftCardApiModel> list, List<GiveAwayGiftCardApiModel> list2) {
        return new GiftedTypeGiftCardsApiModel(list, list2);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof GiftedTypeGiftCardsApiModel)) {
            return false;
        }
        GiftedTypeGiftCardsApiModel giftedTypeGiftCardsApiModel = (GiftedTypeGiftCardsApiModel) obj;
        return C41536l.m120484d(this.purchasedGiftCards, giftedTypeGiftCardsApiModel.purchasedGiftCards) && C41536l.m120484d(this.giveAwayGiftCards, giftedTypeGiftCardsApiModel.giveAwayGiftCards);
    }

    public final List<GiveAwayGiftCardApiModel> getGiveAwayGiftCards() {
        return this.giveAwayGiftCards;
    }

    public final List<PurchasedGiftCardApiModel> getPurchasedGiftCards() {
        return this.purchasedGiftCards;
    }

    public int hashCode() {
        List<PurchasedGiftCardApiModel> list = this.purchasedGiftCards;
        int i = 0;
        int hashCode = (list == null ? 0 : list.hashCode()) * 31;
        List<GiveAwayGiftCardApiModel> list2 = this.giveAwayGiftCards;
        if (list2 != null) {
            i = list2.hashCode();
        }
        return hashCode + i;
    }

    public String toString() {
        List<PurchasedGiftCardApiModel> list = this.purchasedGiftCards;
        List<GiveAwayGiftCardApiModel> list2 = this.giveAwayGiftCards;
        return "GiftedTypeGiftCardsApiModel(purchasedGiftCards=" + list + ", giveAwayGiftCards=" + list2 + ")";
    }
}
