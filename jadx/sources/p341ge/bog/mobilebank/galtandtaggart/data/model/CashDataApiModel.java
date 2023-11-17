package p341ge.bog.mobilebank.galtandtaggart.data.model;

import androidx.annotation.Keep;
import kotlin.jvm.internal.C41536l;

@Keep
/* renamed from: ge.bog.mobilebank.galtandtaggart.data.model.CashDataApiModel */
public final class CashDataApiModel {
    private final String accountID;
    private final String accountNo;
    private final CashApiModel cash;
    private final CashPaymentsApiModel payments;
    private final String tradingType;
    private final String updated;

    public CashDataApiModel(String str, String str2, String str3, String str4, CashApiModel cashApiModel, CashPaymentsApiModel cashPaymentsApiModel) {
        C41536l.m120489i(str, "accountID");
        C41536l.m120489i(str2, "accountNo");
        C41536l.m120489i(str3, "tradingType");
        C41536l.m120489i(str4, "updated");
        C41536l.m120489i(cashApiModel, "cash");
        C41536l.m120489i(cashPaymentsApiModel, "payments");
        this.accountID = str;
        this.accountNo = str2;
        this.tradingType = str3;
        this.updated = str4;
        this.cash = cashApiModel;
        this.payments = cashPaymentsApiModel;
    }

    public static /* synthetic */ CashDataApiModel copy$default(CashDataApiModel cashDataApiModel, String str, String str2, String str3, String str4, CashApiModel cashApiModel, CashPaymentsApiModel cashPaymentsApiModel, int i, Object obj) {
        if ((i & 1) != 0) {
            str = cashDataApiModel.accountID;
        }
        if ((i & 2) != 0) {
            str2 = cashDataApiModel.accountNo;
        }
        String str5 = str2;
        if ((i & 4) != 0) {
            str3 = cashDataApiModel.tradingType;
        }
        String str6 = str3;
        if ((i & 8) != 0) {
            str4 = cashDataApiModel.updated;
        }
        String str7 = str4;
        if ((i & 16) != 0) {
            cashApiModel = cashDataApiModel.cash;
        }
        CashApiModel cashApiModel2 = cashApiModel;
        if ((i & 32) != 0) {
            cashPaymentsApiModel = cashDataApiModel.payments;
        }
        return cashDataApiModel.copy(str, str5, str6, str7, cashApiModel2, cashPaymentsApiModel);
    }

    public final String component1() {
        return this.accountID;
    }

    public final String component2() {
        return this.accountNo;
    }

    public final String component3() {
        return this.tradingType;
    }

    public final String component4() {
        return this.updated;
    }

    public final CashApiModel component5() {
        return this.cash;
    }

    public final CashPaymentsApiModel component6() {
        return this.payments;
    }

    public final CashDataApiModel copy(String str, String str2, String str3, String str4, CashApiModel cashApiModel, CashPaymentsApiModel cashPaymentsApiModel) {
        C41536l.m120489i(str, "accountID");
        C41536l.m120489i(str2, "accountNo");
        C41536l.m120489i(str3, "tradingType");
        C41536l.m120489i(str4, "updated");
        C41536l.m120489i(cashApiModel, "cash");
        C41536l.m120489i(cashPaymentsApiModel, "payments");
        return new CashDataApiModel(str, str2, str3, str4, cashApiModel, cashPaymentsApiModel);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CashDataApiModel)) {
            return false;
        }
        CashDataApiModel cashDataApiModel = (CashDataApiModel) obj;
        return C41536l.m120484d(this.accountID, cashDataApiModel.accountID) && C41536l.m120484d(this.accountNo, cashDataApiModel.accountNo) && C41536l.m120484d(this.tradingType, cashDataApiModel.tradingType) && C41536l.m120484d(this.updated, cashDataApiModel.updated) && C41536l.m120484d(this.cash, cashDataApiModel.cash) && C41536l.m120484d(this.payments, cashDataApiModel.payments);
    }

    public final String getAccountID() {
        return this.accountID;
    }

    public final String getAccountNo() {
        return this.accountNo;
    }

    public final CashApiModel getCash() {
        return this.cash;
    }

    public final CashPaymentsApiModel getPayments() {
        return this.payments;
    }

    public final String getTradingType() {
        return this.tradingType;
    }

    public final String getUpdated() {
        return this.updated;
    }

    public int hashCode() {
        return (((((((((this.accountID.hashCode() * 31) + this.accountNo.hashCode()) * 31) + this.tradingType.hashCode()) * 31) + this.updated.hashCode()) * 31) + this.cash.hashCode()) * 31) + this.payments.hashCode();
    }

    public String toString() {
        String str = this.accountID;
        String str2 = this.accountNo;
        String str3 = this.tradingType;
        String str4 = this.updated;
        CashApiModel cashApiModel = this.cash;
        CashPaymentsApiModel cashPaymentsApiModel = this.payments;
        return "CashDataApiModel(accountID=" + str + ", accountNo=" + str2 + ", tradingType=" + str3 + ", updated=" + str4 + ", cash=" + cashApiModel + ", payments=" + cashPaymentsApiModel + ")";
    }
}
