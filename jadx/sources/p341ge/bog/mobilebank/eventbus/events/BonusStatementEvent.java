package p341ge.bog.mobilebank.eventbus.events;

import p341ge.bog.mobilebank.eventbus.RootEvent;
import p341ge.bog.mobilebank.model.bonus.BonusStatement;

/* renamed from: ge.bog.mobilebank.eventbus.events.BonusStatementEvent */
public class BonusStatementEvent extends RootEvent {
    private BonusStatement statement;

    public BonusStatement getStatement() {
        return this.statement;
    }

    public void setStatement(BonusStatement bonusStatement) {
        this.statement = bonusStatement;
    }
}
