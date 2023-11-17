package p341ge.bog.mobilebank.cleanarch.data.pfm.cashflow.entity;

import androidx.annotation.Keep;
import kotlin.jvm.internal.C41536l;

@Keep
/* renamed from: ge.bog.mobilebank.cleanarch.data.pfm.cashflow.entity.CashFlowMonthEntity */
public final class CashFlowMonthEntity {
    private final CashFlowBalanceEntity current;
    private final CashFlowBalanceEntity forecasting;
    private final String month;

    public CashFlowMonthEntity(String str, CashFlowBalanceEntity cashFlowBalanceEntity, CashFlowBalanceEntity cashFlowBalanceEntity2) {
        C41536l.m120489i(str, "month");
        C41536l.m120489i(cashFlowBalanceEntity, "current");
        C41536l.m120489i(cashFlowBalanceEntity2, "forecasting");
        this.month = str;
        this.current = cashFlowBalanceEntity;
        this.forecasting = cashFlowBalanceEntity2;
    }

    public static /* synthetic */ CashFlowMonthEntity copy$default(CashFlowMonthEntity cashFlowMonthEntity, String str, CashFlowBalanceEntity cashFlowBalanceEntity, CashFlowBalanceEntity cashFlowBalanceEntity2, int i, Object obj) {
        if ((i & 1) != 0) {
            str = cashFlowMonthEntity.month;
        }
        if ((i & 2) != 0) {
            cashFlowBalanceEntity = cashFlowMonthEntity.current;
        }
        if ((i & 4) != 0) {
            cashFlowBalanceEntity2 = cashFlowMonthEntity.forecasting;
        }
        return cashFlowMonthEntity.copy(str, cashFlowBalanceEntity, cashFlowBalanceEntity2);
    }

    public final String component1() {
        return this.month;
    }

    public final CashFlowBalanceEntity component2() {
        return this.current;
    }

    public final CashFlowBalanceEntity component3() {
        return this.forecasting;
    }

    public final CashFlowMonthEntity copy(String str, CashFlowBalanceEntity cashFlowBalanceEntity, CashFlowBalanceEntity cashFlowBalanceEntity2) {
        C41536l.m120489i(str, "month");
        C41536l.m120489i(cashFlowBalanceEntity, "current");
        C41536l.m120489i(cashFlowBalanceEntity2, "forecasting");
        return new CashFlowMonthEntity(str, cashFlowBalanceEntity, cashFlowBalanceEntity2);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CashFlowMonthEntity)) {
            return false;
        }
        CashFlowMonthEntity cashFlowMonthEntity = (CashFlowMonthEntity) obj;
        return C41536l.m120484d(this.month, cashFlowMonthEntity.month) && C41536l.m120484d(this.current, cashFlowMonthEntity.current) && C41536l.m120484d(this.forecasting, cashFlowMonthEntity.forecasting);
    }

    public final CashFlowBalanceEntity getCurrent() {
        return this.current;
    }

    public final CashFlowBalanceEntity getForecasting() {
        return this.forecasting;
    }

    public final String getMonth() {
        return this.month;
    }

    public int hashCode() {
        return (((this.month.hashCode() * 31) + this.current.hashCode()) * 31) + this.forecasting.hashCode();
    }

    public String toString() {
        String str = this.month;
        CashFlowBalanceEntity cashFlowBalanceEntity = this.current;
        CashFlowBalanceEntity cashFlowBalanceEntity2 = this.forecasting;
        return "CashFlowMonthEntity(month=" + str + ", current=" + cashFlowBalanceEntity + ", forecasting=" + cashFlowBalanceEntity2 + ")";
    }
}
