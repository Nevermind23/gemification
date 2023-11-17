package p341ge.bog.mobilebank.model.statement;

import java.util.ArrayList;
import p277ua.C8664c;

/* renamed from: ge.bog.mobilebank.model.statement.AccountStatementWrapper */
public class AccountStatementWrapper {
    @C8664c("acctNo")
    private String acctNo;
    @C8664c("balance")
    private StatementBalance balance;
    @C8664c("cards")
    private ArrayList<StatementCard> cards;
    @C8664c("ccy")
    private Object ccy;
    @C8664c("owner")
    private String owner;
    @C8664c("statement")
    private ArrayList<AccountStatement> statement;

    public String getAcctNo() {
        return this.acctNo;
    }

    public StatementBalance getBalance() {
        return this.balance;
    }

    public ArrayList<StatementCard> getCards() {
        return this.cards;
    }

    public Object getCcy() {
        return this.ccy;
    }

    public ArrayList<AccountStatement> getStatement() {
        return this.statement;
    }

    public void setAcctNo(String str) {
        this.acctNo = str;
    }

    public void setCards(ArrayList<StatementCard> arrayList) {
        this.cards = arrayList;
    }

    public void setCcy(Object obj) {
        this.ccy = obj;
    }

    public void setStatement(ArrayList<AccountStatement> arrayList) {
        this.statement = arrayList;
    }
}
