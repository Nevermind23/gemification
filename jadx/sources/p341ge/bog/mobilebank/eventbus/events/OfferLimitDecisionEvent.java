package p341ge.bog.mobilebank.eventbus.events;

import p341ge.bog.mobilebank.cleanarch.consumerloandetails.data.entity.LimitLoanDecisionEntity;
import p341ge.bog.mobilebank.eventbus.RootEvent;

/* renamed from: ge.bog.mobilebank.eventbus.events.OfferLimitDecisionEvent */
public class OfferLimitDecisionEvent extends RootEvent {
    private LimitLoanDecisionEntity decision;
    public String limitId;
    public String operationType;
    public Integer responseCode;

    public LimitLoanDecisionEntity getDecision() {
        return this.decision;
    }

    public void setDecision(LimitLoanDecisionEntity limitLoanDecisionEntity) {
        this.decision = limitLoanDecisionEntity;
    }
}
