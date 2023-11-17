package p341ge.bog.mobilebank.model.bonus;

import java.util.ArrayList;
import p277ua.C8664c;

/* renamed from: ge.bog.mobilebank.model.bonus.BonusStatementDetailsWrapper */
public class BonusStatementDetailsWrapper {
    @C8664c("list")
    private ArrayList<BonusStatementDetail> list;
    @C8664c("summary")
    private BonusDetailsSummery summary;

    public ArrayList<BonusStatementDetail> getList() {
        return this.list;
    }

    public BonusDetailsSummery getSummary() {
        return this.summary;
    }

    public void setList(ArrayList<BonusStatementDetail> arrayList) {
        this.list = arrayList;
    }

    public void setSummary(BonusDetailsSummery bonusDetailsSummery) {
        this.summary = bonusDetailsSummery;
    }
}
