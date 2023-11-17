package p341ge.bog.mobilebank.model;

import java.util.ArrayList;

/* renamed from: ge.bog.mobilebank.model.DepositBondsListWrapper */
public class DepositBondsListWrapper {
    private DepositBondsWrapper bonds;
    private ArrayList<DepositBondDetails> details;

    public DepositBondsWrapper getBonds() {
        return this.bonds;
    }

    public ArrayList<DepositBondDetails> getDetails() {
        return this.details;
    }

    public void setBonds(DepositBondsWrapper depositBondsWrapper) {
        this.bonds = depositBondsWrapper;
    }

    public void setDetails(ArrayList<DepositBondDetails> arrayList) {
        this.details = arrayList;
    }
}
