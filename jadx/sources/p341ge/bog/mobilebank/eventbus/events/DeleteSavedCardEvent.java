package p341ge.bog.mobilebank.eventbus.events;

import p341ge.bog.mobilebank.eventbus.RootEvent;

/* renamed from: ge.bog.mobilebank.eventbus.events.DeleteSavedCardEvent */
public class DeleteSavedCardEvent extends RootEvent {
    private Long cardId;

    public Long getCardId() {
        return this.cardId;
    }

    public void setCardId(Long l) {
        this.cardId = l;
    }
}
