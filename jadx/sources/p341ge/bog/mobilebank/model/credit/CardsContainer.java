package p341ge.bog.mobilebank.model.credit;

import java.util.ArrayList;
import p277ua.C8664c;

/* renamed from: ge.bog.mobilebank.model.credit.CardsContainer */
public class CardsContainer {
    @C8664c("accounts")
    private ArrayList<CreditCardAccount> accounts;
    private ArrayList<BillInfo> billInfo;
    @C8664c("summary")
    private CreditCardSummery summary;

    public ArrayList<CreditCardAccount> getAccounts() {
        return this.accounts;
    }

    public ArrayList<BillInfo> getBillInfo() {
        return this.billInfo;
    }

    public CreditCardSummery getSummary() {
        return this.summary;
    }

    public void setAccounts(ArrayList<CreditCardAccount> arrayList) {
        this.accounts = arrayList;
    }

    public void setSummary(CreditCardSummery creditCardSummery) {
        this.summary = creditCardSummery;
    }
}
