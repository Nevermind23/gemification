package p341ge.bog.mobilebank.eventbus.events;

import p341ge.bog.mobilebank.eventbus.RootEvent;
import p341ge.bog.mobilebank.model.credit.CreditCardsWrapper;

/* renamed from: ge.bog.mobilebank.eventbus.events.CreditCardsEvent */
public class CreditCardsEvent extends RootEvent {
    private CreditCardsWrapper creditCardsWrapper;

    public CreditCardsWrapper getCreditCardsWrapper() {
        return this.creditCardsWrapper;
    }

    public void resetOperations() {
        getCreditCardsWrapper();
    }

    public void setCreditCardsWrapper(CreditCardsWrapper creditCardsWrapper2) {
        this.creditCardsWrapper = creditCardsWrapper2;
    }
}
