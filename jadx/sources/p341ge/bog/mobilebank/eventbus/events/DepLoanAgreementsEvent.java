package p341ge.bog.mobilebank.eventbus.events;

import java.util.List;
import p341ge.bog.mobilebank.eventbus.RootEvent;
import p341ge.bog.mobilebank.model.DepLoanAgreement;

/* renamed from: ge.bog.mobilebank.eventbus.events.DepLoanAgreementsEvent */
public final class DepLoanAgreementsEvent extends RootEvent {
    private List<DepLoanAgreement> agreements;

    public final List<DepLoanAgreement> getAgreements() {
        return this.agreements;
    }

    public final void setAgreements(List<DepLoanAgreement> list) {
        this.agreements = list;
    }
}
