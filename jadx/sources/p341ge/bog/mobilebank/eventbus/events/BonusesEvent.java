package p341ge.bog.mobilebank.eventbus.events;

import p341ge.bog.mobilebank.cleanarch.loyaltyprograms.data.entity.BonusWrapperEntity;
import p341ge.bog.mobilebank.eventbus.RootEvent;

/* renamed from: ge.bog.mobilebank.eventbus.events.BonusesEvent */
public class BonusesEvent extends RootEvent {
    private BonusWrapperEntity bonusWrapper;

    public BonusWrapperEntity getBonusWrapper() {
        return this.bonusWrapper;
    }

    public void setBonusWrapper(BonusWrapperEntity bonusWrapperEntity) {
        this.bonusWrapper = bonusWrapperEntity;
    }
}
