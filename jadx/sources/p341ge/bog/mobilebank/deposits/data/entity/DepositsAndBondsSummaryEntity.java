package p341ge.bog.mobilebank.deposits.data.entity;

import androidx.annotation.Keep;
import kotlin.jvm.internal.C41536l;
import p277ua.C8664c;

@Keep
/* renamed from: ge.bog.mobilebank.deposits.data.entity.DepositsAndBondsSummaryEntity */
public final class DepositsAndBondsSummaryEntity {
    @C8664c(alternate = {"bcBalance", "bcAmount", "balance"}, value = "amount")
    private final Number amount;
    @C8664c(alternate = {"currency"}, value = "ccy")
    private final String currency;
    private final Number orderNumber;

    public DepositsAndBondsSummaryEntity(Number number, String str, Number number2) {
        this.amount = number;
        this.currency = str;
        this.orderNumber = number2;
    }

    public static /* synthetic */ DepositsAndBondsSummaryEntity copy$default(DepositsAndBondsSummaryEntity depositsAndBondsSummaryEntity, Number number, String str, Number number2, int i, Object obj) {
        if ((i & 1) != 0) {
            number = depositsAndBondsSummaryEntity.amount;
        }
        if ((i & 2) != 0) {
            str = depositsAndBondsSummaryEntity.currency;
        }
        if ((i & 4) != 0) {
            number2 = depositsAndBondsSummaryEntity.orderNumber;
        }
        return depositsAndBondsSummaryEntity.copy(number, str, number2);
    }

    public final Number component1() {
        return this.amount;
    }

    public final String component2() {
        return this.currency;
    }

    public final Number component3() {
        return this.orderNumber;
    }

    public final DepositsAndBondsSummaryEntity copy(Number number, String str, Number number2) {
        return new DepositsAndBondsSummaryEntity(number, str, number2);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof DepositsAndBondsSummaryEntity)) {
            return false;
        }
        DepositsAndBondsSummaryEntity depositsAndBondsSummaryEntity = (DepositsAndBondsSummaryEntity) obj;
        return C41536l.m120484d(this.amount, depositsAndBondsSummaryEntity.amount) && C41536l.m120484d(this.currency, depositsAndBondsSummaryEntity.currency) && C41536l.m120484d(this.orderNumber, depositsAndBondsSummaryEntity.orderNumber);
    }

    public final Number getAmount() {
        return this.amount;
    }

    public final String getCurrency() {
        return this.currency;
    }

    public final Number getOrderNumber() {
        return this.orderNumber;
    }

    public int hashCode() {
        Number number = this.amount;
        int i = 0;
        int hashCode = (number == null ? 0 : number.hashCode()) * 31;
        String str = this.currency;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        Number number2 = this.orderNumber;
        if (number2 != null) {
            i = number2.hashCode();
        }
        return hashCode2 + i;
    }

    public String toString() {
        Number number = this.amount;
        String str = this.currency;
        Number number2 = this.orderNumber;
        return "DepositsAndBondsSummaryEntity(amount=" + number + ", currency=" + str + ", orderNumber=" + number2 + ")";
    }
}
