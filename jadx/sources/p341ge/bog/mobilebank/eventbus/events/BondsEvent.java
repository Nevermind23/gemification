package p341ge.bog.mobilebank.eventbus.events;

import java.util.ArrayList;
import p341ge.bog.mobilebank.eventbus.RootEvent;
import p341ge.bog.mobilebank.model.Bond;
import p341ge.bog.mobilebank.model.BondsWrapper;

/* renamed from: ge.bog.mobilebank.eventbus.events.BondsEvent */
public class BondsEvent extends RootEvent {
    private BondsWrapper bondsWrapper;

    public BondsWrapper getBondsWrapper() {
        return this.bondsWrapper;
    }

    public void setBondsWrapper(BondsWrapper bondsWrapper2) {
        this.bondsWrapper = bondsWrapper2;
        if (bondsWrapper2 != null && bondsWrapper2.getCashAgreements() != null && bondsWrapper2.getCashAgreements().size() > 0) {
            if (bondsWrapper2.getBonds() == null) {
                bondsWrapper2.setBonds(new ArrayList());
            }
            Bond bond = new Bond();
            bond.setCashAgreements(bondsWrapper2.getCashAgreements());
            bond.setCashValue(bondsWrapper2.getClientInfo().getCashValue());
            bondsWrapper2.getBonds().add(0, bond);
        }
    }
}
