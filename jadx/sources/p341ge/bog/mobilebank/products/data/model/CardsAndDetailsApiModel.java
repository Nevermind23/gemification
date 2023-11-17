package p341ge.bog.mobilebank.products.data.model;

import androidx.annotation.Keep;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.C41536l;

@Keep
/* renamed from: ge.bog.mobilebank.products.data.model.CardsAndDetailsApiModel */
public final class CardsAndDetailsApiModel {
    private final Map<Long, ArrayList<CardApiModel>> cards;
    private final List<CardInsSecCardApiModel> insSecCards;

    public CardsAndDetailsApiModel(Map<Long, ? extends ArrayList<CardApiModel>> map, List<CardInsSecCardApiModel> list) {
        C41536l.m120489i(map, "cards");
        C41536l.m120489i(list, "insSecCards");
        this.cards = map;
        this.insSecCards = list;
    }

    public static /* synthetic */ CardsAndDetailsApiModel copy$default(CardsAndDetailsApiModel cardsAndDetailsApiModel, Map<Long, ArrayList<CardApiModel>> map, List<CardInsSecCardApiModel> list, int i, Object obj) {
        if ((i & 1) != 0) {
            map = cardsAndDetailsApiModel.cards;
        }
        if ((i & 2) != 0) {
            list = cardsAndDetailsApiModel.insSecCards;
        }
        return cardsAndDetailsApiModel.copy(map, list);
    }

    public final Map<Long, ArrayList<CardApiModel>> component1() {
        return this.cards;
    }

    public final List<CardInsSecCardApiModel> component2() {
        return this.insSecCards;
    }

    public final CardsAndDetailsApiModel copy(Map<Long, ? extends ArrayList<CardApiModel>> map, List<CardInsSecCardApiModel> list) {
        C41536l.m120489i(map, "cards");
        C41536l.m120489i(list, "insSecCards");
        return new CardsAndDetailsApiModel(map, list);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CardsAndDetailsApiModel)) {
            return false;
        }
        CardsAndDetailsApiModel cardsAndDetailsApiModel = (CardsAndDetailsApiModel) obj;
        return C41536l.m120484d(this.cards, cardsAndDetailsApiModel.cards) && C41536l.m120484d(this.insSecCards, cardsAndDetailsApiModel.insSecCards);
    }

    public final Map<Long, ArrayList<CardApiModel>> getCards() {
        return this.cards;
    }

    public final List<CardInsSecCardApiModel> getInsSecCards() {
        return this.insSecCards;
    }

    public int hashCode() {
        return (this.cards.hashCode() * 31) + this.insSecCards.hashCode();
    }

    public String toString() {
        Map<Long, ArrayList<CardApiModel>> map = this.cards;
        List<CardInsSecCardApiModel> list = this.insSecCards;
        return "CardsAndDetailsApiModel(cards=" + map + ", insSecCards=" + list + ")";
    }
}
