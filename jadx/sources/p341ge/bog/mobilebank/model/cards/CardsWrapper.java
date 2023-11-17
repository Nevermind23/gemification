package p341ge.bog.mobilebank.model.cards;

import androidx.collection.ArrayMap;
import java.util.ArrayList;
import p863pw.C27635m;

/* renamed from: ge.bog.mobilebank.model.cards.CardsWrapper */
public class CardsWrapper {
    private ArrayMap<Long, ArrayList<C27635m>> cards;
    private ArrayList<InsSecCard> insSecCards;

    public ArrayMap<Long, ArrayList<C27635m>> getCards() {
        return this.cards;
    }

    public ArrayList<InsSecCard> getInsSecCards() {
        return this.insSecCards;
    }

    public void setCards(ArrayMap<Long, ArrayList<C27635m>> arrayMap) {
        this.cards = arrayMap;
    }
}
