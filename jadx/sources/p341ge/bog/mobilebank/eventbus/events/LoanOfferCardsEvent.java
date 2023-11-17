package p341ge.bog.mobilebank.eventbus.events;

import java.util.List;
import p341ge.bog.mobilebank.eventbus.RootEvent;
import p341ge.bog.mobilebank.model.offers.LoanOfferCard;

/* renamed from: ge.bog.mobilebank.eventbus.events.LoanOfferCardsEvent */
public class LoanOfferCardsEvent extends RootEvent {
    private List<LoanOfferCard> cardList;

    public List<LoanOfferCard> getCardList() {
        return this.cardList;
    }

    public void setCardList(List<LoanOfferCard> list) {
        this.cardList = list;
    }
}
