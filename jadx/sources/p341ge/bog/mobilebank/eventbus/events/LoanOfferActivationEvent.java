package p341ge.bog.mobilebank.eventbus.events;

import p341ge.bog.mobilebank.eventbus.RootEvent;

/* renamed from: ge.bog.mobilebank.eventbus.events.LoanOfferActivationEvent */
public class LoanOfferActivationEvent extends RootEvent {
    private long cardId;
    private String cardPan;

    public long getCardId() {
        return this.cardId;
    }

    public String getCardPan() {
        return this.cardPan;
    }

    public void setCardId(long j) {
        this.cardId = j;
    }

    public void setCardPan(String str) {
        this.cardPan = str;
    }
}
