package p341ge.bog.mobilebank.model.account;

import hd0.C24978b;
import p341ge.bog.mobilebank.model.AccountCountryType;
import p341ge.bog.mobilebank.model.TreasureCode;

/* renamed from: ge.bog.mobilebank.model.account.AccountOwnerInfo */
public class AccountOwnerInfo {
    private AccountCountryType acctBankType;
    private String bic;
    private boolean isTrusted;
    private C24978b isValidIban;
    private String owner;
    private TreasureCode treasureCode;

    public AccountCountryType getAcctBankType() {
        return this.acctBankType;
    }

    public String getBic() {
        return this.bic;
    }

    public String getOwner() {
        return this.owner;
    }

    public TreasureCode getTreasureCode() {
        return this.treasureCode;
    }

    public boolean isTrusted() {
        return this.isTrusted;
    }

    public boolean isValidIban() {
        return C24978b.YES == this.isValidIban;
    }
}
