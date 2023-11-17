package p341ge.bog.mobilebank.cleanarch.data.products.entity;

import androidx.annotation.Keep;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.C41536l;

@Keep
/* renamed from: ge.bog.mobilebank.cleanarch.data.products.entity.CardsAndDetailsApiEntity */
public final class CardsAndDetailsApiEntity {
    private final Map<Long, ArrayList<CardApiEntity>> cards;
    private final List<CardInsSecCardApiEntity> insSecCards;

    public CardsAndDetailsApiEntity(Map<Long, ? extends ArrayList<CardApiEntity>> map, List<CardInsSecCardApiEntity> list) {
        C41536l.m120489i(map, "cards");
        C41536l.m120489i(list, "insSecCards");
        this.cards = map;
        this.insSecCards = list;
    }

    public static /* synthetic */ CardsAndDetailsApiEntity copy$default(CardsAndDetailsApiEntity cardsAndDetailsApiEntity, Map<Long, ArrayList<CardApiEntity>> map, List<CardInsSecCardApiEntity> list, int i, Object obj) {
        if ((i & 1) != 0) {
            map = cardsAndDetailsApiEntity.cards;
        }
        if ((i & 2) != 0) {
            list = cardsAndDetailsApiEntity.insSecCards;
        }
        return cardsAndDetailsApiEntity.copy(map, list);
    }

    public final Map<Long, ArrayList<CardApiEntity>> component1() {
        return this.cards;
    }

    public final List<CardInsSecCardApiEntity> component2() {
        return this.insSecCards;
    }

    public final CardsAndDetailsApiEntity copy(Map<Long, ? extends ArrayList<CardApiEntity>> map, List<CardInsSecCardApiEntity> list) {
        C41536l.m120489i(map, "cards");
        C41536l.m120489i(list, "insSecCards");
        return new CardsAndDetailsApiEntity(map, list);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CardsAndDetailsApiEntity)) {
            return false;
        }
        CardsAndDetailsApiEntity cardsAndDetailsApiEntity = (CardsAndDetailsApiEntity) obj;
        return C41536l.m120484d(this.cards, cardsAndDetailsApiEntity.cards) && C41536l.m120484d(this.insSecCards, cardsAndDetailsApiEntity.insSecCards);
    }

    public final Map<Long, ArrayList<CardApiEntity>> getCards() {
        return this.cards;
    }

    public final List<CardInsSecCardApiEntity> getInsSecCards() {
        return this.insSecCards;
    }

    public int hashCode() {
        return (this.cards.hashCode() * 31) + this.insSecCards.hashCode();
    }

    public String toString() {
        Map<Long, ArrayList<CardApiEntity>> map = this.cards;
        List<CardInsSecCardApiEntity> list = this.insSecCards;
        return "CardsAndDetailsApiEntity(cards=" + map + ", insSecCards=" + list + ")";
    }
}
