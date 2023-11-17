package p341ge.bog.mobilebank.model.deposits;

import java.util.ArrayList;
import java.util.Iterator;

/* renamed from: ge.bog.mobilebank.model.deposits.DepositsWrapper */
public class DepositsWrapper {
    private ArrayList<Deposit> deposits;
    private ArrayList<DepositDetails> details;
    private ArrayList<DepositMaximaWrapper> maximaDetails;
    private DepositSummery summary;

    public Deposit getDepositByAcctKey(Long l) {
        if (l == null || getDeposits() == null) {
            return null;
        }
        Iterator<Deposit> it = getDeposits().iterator();
        while (it.hasNext()) {
            Deposit next = it.next();
            if (l.equals(Long.valueOf(next.getAccountKey()))) {
                return next;
            }
        }
        return null;
    }

    public Deposit getDepositByAgreeKey(Long l) {
        if (l == null || getDeposits() == null) {
            return null;
        }
        Iterator<Deposit> it = getDeposits().iterator();
        while (it.hasNext()) {
            Deposit next = it.next();
            if (l.equals(Long.valueOf(next.getAgreeKey()))) {
                return next;
            }
        }
        return null;
    }

    public int getDepositPositionByKey(long j) {
        if (getDeposits() == null) {
            return -1;
        }
        for (int i = 0; i < getDeposits().size(); i++) {
            if (getDeposits().get(i).getAgreeKey() == j) {
                return i;
            }
        }
        return -1;
    }

    public ArrayList<Deposit> getDeposits() {
        return this.deposits;
    }

    public ArrayList<DepositDetails> getDetails() {
        return this.details;
    }

    public ArrayList<DepositMaximaWrapper> getMaximaDetails() {
        return this.maximaDetails;
    }

    public DepositSummery getSummary() {
        return this.summary;
    }

    public void setDeposits(ArrayList<Deposit> arrayList) {
        this.deposits = arrayList;
    }

    public void setDetails(ArrayList<DepositDetails> arrayList) {
        this.details = arrayList;
    }

    public void setMaximaDetails(ArrayList<DepositMaximaWrapper> arrayList) {
        this.maximaDetails = arrayList;
    }

    public void setSummary(DepositSummery depositSummery) {
        this.summary = depositSummery;
    }
}
