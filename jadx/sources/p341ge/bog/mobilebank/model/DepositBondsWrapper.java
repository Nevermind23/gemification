package p341ge.bog.mobilebank.model;

import java.util.ArrayList;

/* renamed from: ge.bog.mobilebank.model.DepositBondsWrapper */
public class DepositBondsWrapper {
    private ArrayList<DepositBond> bonds;
    private DepositBond summary;

    public ArrayList<DepositBond> getBonds() {
        return this.bonds;
    }

    public DepositBond getSummary() {
        return this.summary;
    }

    public void setSummary(DepositBond depositBond) {
        this.summary = depositBond;
    }
}
