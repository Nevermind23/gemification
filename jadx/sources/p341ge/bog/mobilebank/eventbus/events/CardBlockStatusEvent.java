package p341ge.bog.mobilebank.eventbus.events;

import p341ge.bog.mobilebank.eventbus.RootEvent;

/* renamed from: ge.bog.mobilebank.eventbus.events.CardBlockStatusEvent */
public class CardBlockStatusEvent extends RootEvent {
    private Long cardId;
    private Boolean isBlock;

    public Long getCardId() {
        return this.cardId;
    }

    public boolean isBlock() {
        return this.isBlock.booleanValue();
    }

    public void setBlock(Boolean bool) {
        this.isBlock = bool;
    }

    public void setCardId(Long l) {
        this.cardId = l;
    }
}
