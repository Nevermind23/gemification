package p341ge.bog.mobilebank.eventbus.events;

import p341ge.bog.mobilebank.eventbus.RootEvent;
import p341ge.bog.mobilebank.model.DepositBondsContainer;

/* renamed from: ge.bog.mobilebank.eventbus.events.DepositBondsEvent */
public class DepositBondsEvent extends RootEvent {
    private DepositBondsContainer depositBonds;

    public DepositBondsContainer getDepositBonds() {
        return this.depositBonds;
    }

    public void resetOperations() {
        if (getDepositBonds() != null) {
            getDepositBonds().resetOperations();
        }
    }

    public void setDepositBonds(DepositBondsContainer depositBondsContainer) {
        this.depositBonds = depositBondsContainer;
    }
}
