package p341ge.bog.mobilebank.model.account;

import java.math.BigDecimal;
import java.util.ArrayList;

/* renamed from: ge.bog.mobilebank.model.account.OperationResponse */
public class OperationResponse {
    private OperationBalance endBalance;
    private BigDecimal incomeSum;
    private ArrayList<AccountOperation> myOperations;
    private BigDecimal outcomeSum;
    private OperationBalance startBalance;

    public OperationBalance getEndBalance() {
        return this.endBalance;
    }

    public BigDecimal getIncomeSum() {
        return this.incomeSum;
    }

    public ArrayList<AccountOperation> getMyOperations() {
        return this.myOperations;
    }

    public BigDecimal getOutcomeSum() {
        return this.outcomeSum;
    }

    public OperationBalance getStartBalance() {
        return this.startBalance;
    }
}
