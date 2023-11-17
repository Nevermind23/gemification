package p341ge.bog.mobilebank.openbanking.data.model;

import androidx.annotation.Keep;
import kotlin.jvm.internal.C41536l;

@Keep
/* renamed from: ge.bog.mobilebank.openbanking.data.model.OpenBankAccountSummaryApiModel */
public final class OpenBankAccountSummaryApiModel {
    private final double amount;
    private final String ccy;

    public OpenBankAccountSummaryApiModel(String str, double d) {
        C41536l.m120489i(str, "ccy");
        this.ccy = str;
        this.amount = d;
    }

    public static /* synthetic */ OpenBankAccountSummaryApiModel copy$default(OpenBankAccountSummaryApiModel openBankAccountSummaryApiModel, String str, double d, int i, Object obj) {
        if ((i & 1) != 0) {
            str = openBankAccountSummaryApiModel.ccy;
        }
        if ((i & 2) != 0) {
            d = openBankAccountSummaryApiModel.amount;
        }
        return openBankAccountSummaryApiModel.copy(str, d);
    }

    public final String component1() {
        return this.ccy;
    }

    public final double component2() {
        return this.amount;
    }

    public final OpenBankAccountSummaryApiModel copy(String str, double d) {
        C41536l.m120489i(str, "ccy");
        return new OpenBankAccountSummaryApiModel(str, d);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof OpenBankAccountSummaryApiModel)) {
            return false;
        }
        OpenBankAccountSummaryApiModel openBankAccountSummaryApiModel = (OpenBankAccountSummaryApiModel) obj;
        return C41536l.m120484d(this.ccy, openBankAccountSummaryApiModel.ccy) && Double.compare(this.amount, openBankAccountSummaryApiModel.amount) == 0;
    }

    public final double getAmount() {
        return this.amount;
    }

    public final String getCcy() {
        return this.ccy;
    }

    public int hashCode() {
        return (this.ccy.hashCode() * 31) + Double.doubleToLongBits(this.amount);
    }

    public String toString() {
        String str = this.ccy;
        double d = this.amount;
        return "OpenBankAccountSummaryApiModel(ccy=" + str + ", amount=" + d + ")";
    }
}
