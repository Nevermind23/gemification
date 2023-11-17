package p341ge.bog.mobilebank.model.bonus;

import java.util.List;
import p277ua.C8664c;

/* renamed from: ge.bog.mobilebank.model.bonus.BonusPrizeList */
public class BonusPrizeList {
    @C8664c("list")
    private List<BonusPrize> prizeList;
    private BonusPrizeListSummary summary;

    public List<BonusPrize> getPrizeList() {
        return this.prizeList;
    }

    public BonusPrizeListSummary getSummary() {
        return this.summary;
    }

    public void setSummary(BonusPrizeListSummary bonusPrizeListSummary) {
        this.summary = bonusPrizeListSummary;
    }
}
