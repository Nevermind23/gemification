package p341ge.bog.mobilebank.eventbus.events;

import p341ge.bog.mobilebank.eventbus.RootEvent;
import p341ge.bog.mobilebank.model.bonus.BonusPrizeList;

/* renamed from: ge.bog.mobilebank.eventbus.events.BonusPrizeHistoryEvent */
public class BonusPrizeHistoryEvent extends RootEvent {
    private BonusPrizeList bonusPrizeList;

    public BonusPrizeList getBonusPrizeList() {
        return this.bonusPrizeList;
    }

    public void setBonusPrizeList(BonusPrizeList bonusPrizeList2) {
        this.bonusPrizeList = bonusPrizeList2;
    }
}
