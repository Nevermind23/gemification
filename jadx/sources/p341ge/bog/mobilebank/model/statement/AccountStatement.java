package p341ge.bog.mobilebank.model.statement;

import java.util.ArrayList;
import p277ua.C8664c;
import p341ge.bog.mobilebank.model.CurrencyWrapper;

/* renamed from: ge.bog.mobilebank.model.statement.AccountStatement */
public class AccountStatement {
    @C8664c("amounts")
    private ArrayList<CurrencyWrapper> amounts;
    @C8664c("entryComment")
    private String entryComment;
    @C8664c("postDate")
    private String postDate;

    public ArrayList<CurrencyWrapper> getAmounts() {
        return this.amounts;
    }

    public String getEntryComment() {
        return this.entryComment;
    }

    public String getPostDate() {
        return this.postDate;
    }
}
