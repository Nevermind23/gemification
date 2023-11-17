package p341ge.bog.mobilebank.eventbus.events;

import java.util.List;
import p341ge.bog.mobilebank.eventbus.RootEvent;
import p341ge.bog.mobilebank.model.bonus.ScoolCardStatementItem;

/* renamed from: ge.bog.mobilebank.eventbus.events.ScoolCardStatementEvent */
public class ScoolCardStatementEvent extends RootEvent {
    private long childClientKey;
    private List<ScoolCardStatementItem> statementItemList;

    public long getChildClientKey() {
        return this.childClientKey;
    }

    public List<ScoolCardStatementItem> getStatementItemList() {
        return this.statementItemList;
    }

    public void setChildClientKey(long j) {
        this.childClientKey = j;
    }

    public void setStatementItemList(List<ScoolCardStatementItem> list) {
        this.statementItemList = list;
    }
}
