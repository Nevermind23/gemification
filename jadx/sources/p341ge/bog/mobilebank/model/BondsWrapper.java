package p341ge.bog.mobilebank.model;

import java.util.ArrayList;
import p277ua.C8664c;

/* renamed from: ge.bog.mobilebank.model.BondsWrapper */
public class BondsWrapper {
    @C8664c("agreements")
    private ArrayList<Bond> bonds;
    private ArrayList<CashAgreement> cashAgreements;
    @C8664c("clientInfo")
    private AgreementClientInfo clientInfo;

    public int getBondByKey(long j) {
        if (getBonds() == null) {
            return -1;
        }
        for (int i = 0; i < getBonds().size(); i++) {
            if (getBonds().get(i).getId().longValue() == j) {
                return i;
            }
        }
        return -1;
    }

    public ArrayList<Bond> getBonds() {
        return this.bonds;
    }

    public ArrayList<CashAgreement> getCashAgreements() {
        return this.cashAgreements;
    }

    public AgreementClientInfo getClientInfo() {
        return this.clientInfo;
    }

    public void setBonds(ArrayList<Bond> arrayList) {
        this.bonds = arrayList;
    }

    public void setCashAgreements(ArrayList<CashAgreement> arrayList) {
        this.cashAgreements = arrayList;
    }

    public void setClientInfo(AgreementClientInfo agreementClientInfo) {
        this.clientInfo = agreementClientInfo;
    }
}
