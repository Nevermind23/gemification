package p341ge.bog.mobilebank.eventbus.events;

import p341ge.bog.mobilebank.eventbus.RootEvent;
import p341ge.bog.mobilebank.model.CashBackStatementWrapper;
import p341ge.bog.mobilebank.model.bonus.BonusStatementDetailsWrapper;
import p341ge.bog.mobilebank.model.statement.AccountReportId;
import p341ge.bog.mobilebank.model.statement.AccountStatementWrapper;
import p341ge.bog.mobilebank.model.statement.CasStatementWrapper;
import p341ge.bog.mobilebank.model.statement.ScoolStatementWrapper;

/* renamed from: ge.bog.mobilebank.eventbus.events.AccountStatementEvent */
public class AccountStatementEvent extends RootEvent {
    private AccountStatementWrapper accountStatementWrapper;
    private BonusStatementDetailsWrapper bonusStatementDetailsWrapper;
    private boolean canDownloadMore = true;
    private CasStatementWrapper casStatementWrapper;
    private CashBackStatementWrapper cashBackStatementWrapper;
    private boolean definetlyAccountsService;
    private Long endDate;
    private long itemKey;
    private AccountReportId reportID;
    private ScoolStatementWrapper scoolStatementWrapper;
    private Long startDate;
    private int type;

    public boolean canDownloadMore() {
        return this.canDownloadMore;
    }

    public AccountStatementWrapper getAccountStatementWrapper() {
        return this.accountStatementWrapper;
    }

    public BonusStatementDetailsWrapper getBonusStatementDetailsWrapper() {
        return this.bonusStatementDetailsWrapper;
    }

    public CasStatementWrapper getCasStatementWrapper() {
        return this.casStatementWrapper;
    }

    public CashBackStatementWrapper getCashBackStatementWrapper() {
        return this.cashBackStatementWrapper;
    }

    public Long getEndDate() {
        return this.endDate;
    }

    public long getItemKey() {
        return this.itemKey;
    }

    public AccountReportId getReportID() {
        return this.reportID;
    }

    public ScoolStatementWrapper getScoolStatementWrapper() {
        return this.scoolStatementWrapper;
    }

    public Long getStartDate() {
        return this.startDate;
    }

    public int getType() {
        return this.type;
    }

    public boolean isDefinetlyAccountsService() {
        return this.definetlyAccountsService;
    }

    public void setAccountStatementWrapper(AccountStatementWrapper accountStatementWrapper2) {
        this.accountStatementWrapper = accountStatementWrapper2;
    }

    public void setBonusStatementDetailsWrapper(BonusStatementDetailsWrapper bonusStatementDetailsWrapper2) {
        this.bonusStatementDetailsWrapper = bonusStatementDetailsWrapper2;
    }

    public void setCanDownloadMore(boolean z) {
        this.canDownloadMore = z;
    }

    public void setCasStatementWrapper(CasStatementWrapper casStatementWrapper2) {
        this.casStatementWrapper = casStatementWrapper2;
    }

    public void setCashBackStatementWrapper(CashBackStatementWrapper cashBackStatementWrapper2) {
        this.cashBackStatementWrapper = cashBackStatementWrapper2;
    }

    public void setDefinetlyAccountsService(boolean z) {
        this.definetlyAccountsService = z;
    }

    public void setEndDate(Long l) {
        this.endDate = l;
    }

    public void setItemKey(long j) {
        this.itemKey = j;
    }

    public void setReportID(AccountReportId accountReportId) {
        this.reportID = accountReportId;
    }

    public void setScoolStatementWrapper(ScoolStatementWrapper scoolStatementWrapper2) {
        this.scoolStatementWrapper = scoolStatementWrapper2;
    }

    public void setStartDate(Long l) {
        this.startDate = l;
    }

    public void setType(int i) {
        this.type = i;
    }
}
