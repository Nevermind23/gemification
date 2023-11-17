package p341ge.bog.mobilebank.model;

import java.util.Iterator;
import p341ge.bog.mobilebank.eventbus.events.DepositOperationsEvent;
import p341ge.bog.mobilebank.model.deposits.Deposit;
import p341ge.bog.mobilebank.model.deposits.DepositsWrapper;

/* renamed from: ge.bog.mobilebank.model.DepositBondsContainer */
public class DepositBondsContainer {
    private DepositBondsListWrapper bonds;
    private DepositsWrapper deposits;
    private DepositBondsSummary summary;

    public DepositBondsListWrapper getBonds() {
        return this.bonds;
    }

    public DepositsWrapper getDeposits() {
        return this.deposits;
    }

    public int getSavingGoalsCount() {
        DepositsWrapper depositsWrapper = this.deposits;
        int i = 0;
        if (!(depositsWrapper == null || depositsWrapper.getDeposits() == null)) {
            Iterator<Deposit> it = this.deposits.getDeposits().iterator();
            while (it.hasNext()) {
                if (it.next().hasSavingGoal()) {
                    i++;
                }
            }
        }
        return i;
    }

    public DepositBondsSummary getSummary() {
        return this.summary;
    }

    public boolean hasSavingGoal(int i) {
        DepositsWrapper depositsWrapper = this.deposits;
        if (depositsWrapper == null || depositsWrapper.getDeposits() == null || this.deposits.getDeposits().size() <= i || !this.deposits.getDeposits().get(i).hasSavingGoal()) {
            return false;
        }
        return true;
    }

    public void resetOperations() {
        if (getDeposits() != null && getDeposits().getDeposits() != null) {
            Iterator<Deposit> it = getDeposits().getDeposits().iterator();
            while (it.hasNext()) {
                it.next().setOperationsEvent((DepositOperationsEvent) null);
            }
        }
    }

    public void setBonds(DepositBondsListWrapper depositBondsListWrapper) {
        this.bonds = depositBondsListWrapper;
    }

    public void setDeposits(DepositsWrapper depositsWrapper) {
        this.deposits = depositsWrapper;
    }

    public void setSummary(DepositBondsSummary depositBondsSummary) {
        this.summary = depositBondsSummary;
    }
}
