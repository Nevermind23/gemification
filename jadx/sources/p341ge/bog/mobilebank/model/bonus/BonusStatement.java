package p341ge.bog.mobilebank.model.bonus;

import java.util.List;

/* renamed from: ge.bog.mobilebank.model.bonus.BonusStatement */
public class BonusStatement {
    private List<BonusStatementItem> list;
    private BonusStatementSummary summary;

    public List<BonusStatementItem> getList() {
        return this.list;
    }

    public BonusStatementSummary getSummary() {
        return this.summary;
    }

    public void setList(List<BonusStatementItem> list2) {
        this.list = list2;
    }

    public void setSummary(BonusStatementSummary bonusStatementSummary) {
        this.summary = bonusStatementSummary;
    }
}
