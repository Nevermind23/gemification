package p341ge.bog.mobilebank.eventbus.events;

import java.math.BigDecimal;
import java.util.ArrayList;
import p341ge.bog.mobilebank.eventbus.RootEvent;
import p341ge.bog.mobilebank.model.account.AccountOperation;
import p341ge.bog.mobilebank.model.account.OperationBalance;

/* renamed from: ge.bog.mobilebank.eventbus.events.AllOperationsEvent */
public class AllOperationsEvent extends RootEvent {
    private Long acctKey;
    private boolean canDownloadMore = true;
    private Long cardId;
    private OperationBalance endBalance;
    private Long endDate;
    private String essServiceId;
    private BigDecimal incomeSum;
    private String merchantClientId;
    private Long operationEntryGroupId;
    private ArrayList<AccountOperation> operations = new ArrayList<>();
    private BigDecimal outcomeSum;
    private OperationBalance startBalance;
    private long startDate;

    public boolean canDownloadMore() {
        return this.canDownloadMore;
    }

    public Long getAcctKey() {
        return this.acctKey;
    }

    public Long getCardId() {
        return this.cardId;
    }

    public OperationBalance getEndBalance() {
        return this.endBalance;
    }

    public Long getEndDate() {
        return this.endDate;
    }

    public String getEssServiceId() {
        return this.essServiceId;
    }

    public BigDecimal getIncomeSum() {
        return this.incomeSum;
    }

    public String getMerchantClientId() {
        return this.merchantClientId;
    }

    public Long getOperationEntryGroupId() {
        return this.operationEntryGroupId;
    }

    public ArrayList<AccountOperation> getOperations() {
        return this.operations;
    }

    public BigDecimal getOutcomeSum() {
        return this.outcomeSum;
    }

    public OperationBalance getStartBalance() {
        return this.startBalance;
    }

    public long getStartDate() {
        return this.startDate;
    }

    public void setAcctKey(Long l) {
        this.acctKey = l;
    }

    public void setCanDownloadMore(boolean z) {
        this.canDownloadMore = z;
    }

    public void setCardId(Long l) {
        this.cardId = l;
    }

    public void setEndBalance(OperationBalance operationBalance) {
        this.endBalance = operationBalance;
    }

    public void setEndDate(Long l) {
        this.endDate = l;
    }

    public void setEssServiceId(String str) {
        this.essServiceId = str;
    }

    public void setIncomeSum(BigDecimal bigDecimal) {
        this.incomeSum = bigDecimal;
    }

    public void setMerchantClientId(String str) {
        this.merchantClientId = str;
    }

    public void setOperationEntryGroupId(Long l) {
        this.operationEntryGroupId = l;
    }

    public void setOperations(ArrayList<AccountOperation> arrayList) {
        this.operations = arrayList;
    }

    public void setOutcomeSum(BigDecimal bigDecimal) {
        this.outcomeSum = bigDecimal;
    }

    public void setStartBalance(OperationBalance operationBalance) {
        this.startBalance = operationBalance;
    }

    public void setStartDate(long j) {
        this.startDate = j;
    }
}
