package p341ge.bog.mobilebank.eventbus.events;

import java.util.ArrayList;
import java.util.Iterator;
import p341ge.bog.mobilebank.eventbus.RootEvent;
import p341ge.bog.mobilebank.model.cards.PaymentsCard;

/* renamed from: ge.bog.mobilebank.eventbus.events.PaymentCardsEvent */
public class PaymentCardsEvent extends RootEvent {
    private ArrayList<PaymentsCard> paymentCards;
    public String providerIds;
    private ArrayList<PaymentsCard> savedCards;

    public PaymentCardsEvent() {
    }

    public PaymentCardsEvent copy() {
        if (this.paymentCards == null) {
            this.paymentCards = new ArrayList<>();
        }
        return new PaymentCardsEvent(this.paymentCards, this.savedCards, getState());
    }

    public ArrayList<PaymentsCard> getPaymentCards() {
        return this.paymentCards;
    }

    public ArrayList<PaymentsCard> getSavedCards() {
        return this.savedCards;
    }

    public void setPaymentCards(ArrayList<PaymentsCard> arrayList) {
        this.paymentCards = arrayList;
        this.savedCards = new ArrayList<>();
        if (arrayList != null && arrayList.size() > 0) {
            Iterator<PaymentsCard> it = arrayList.iterator();
            while (it.hasNext()) {
                PaymentsCard next = it.next();
                if (next.getPaymentCardType().equals("EXTERNAL")) {
                    this.savedCards.add(next);
                }
            }
        }
    }

    public PaymentCardsEvent(ArrayList<PaymentsCard> arrayList, ArrayList<PaymentsCard> arrayList2, int i) {
        this.paymentCards = arrayList;
        this.savedCards = arrayList2;
        setState(i);
    }
}
