package p341ge.bog.mobilebank.openbanking.data.model;

import androidx.annotation.Keep;
import kotlin.jvm.internal.C41536l;

@Keep
/* renamed from: ge.bog.mobilebank.openbanking.data.model.OpenBankAccountBalanceApiModel */
public final class OpenBankAccountBalanceApiModel {
    private final BalanceAmountApiModel balanceAmount;
    private final String balanceType;
    private final String lastChangeDateTime;
    private final String referenceDate;

    public OpenBankAccountBalanceApiModel(BalanceAmountApiModel balanceAmountApiModel, String str, String str2, String str3) {
        C41536l.m120489i(balanceAmountApiModel, "balanceAmount");
        this.balanceAmount = balanceAmountApiModel;
        this.balanceType = str;
        this.referenceDate = str2;
        this.lastChangeDateTime = str3;
    }

    public static /* synthetic */ OpenBankAccountBalanceApiModel copy$default(OpenBankAccountBalanceApiModel openBankAccountBalanceApiModel, BalanceAmountApiModel balanceAmountApiModel, String str, String str2, String str3, int i, Object obj) {
        if ((i & 1) != 0) {
            balanceAmountApiModel = openBankAccountBalanceApiModel.balanceAmount;
        }
        if ((i & 2) != 0) {
            str = openBankAccountBalanceApiModel.balanceType;
        }
        if ((i & 4) != 0) {
            str2 = openBankAccountBalanceApiModel.referenceDate;
        }
        if ((i & 8) != 0) {
            str3 = openBankAccountBalanceApiModel.lastChangeDateTime;
        }
        return openBankAccountBalanceApiModel.copy(balanceAmountApiModel, str, str2, str3);
    }

    public final BalanceAmountApiModel component1() {
        return this.balanceAmount;
    }

    public final String component2() {
        return this.balanceType;
    }

    public final String component3() {
        return this.referenceDate;
    }

    public final String component4() {
        return this.lastChangeDateTime;
    }

    public final OpenBankAccountBalanceApiModel copy(BalanceAmountApiModel balanceAmountApiModel, String str, String str2, String str3) {
        C41536l.m120489i(balanceAmountApiModel, "balanceAmount");
        return new OpenBankAccountBalanceApiModel(balanceAmountApiModel, str, str2, str3);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof OpenBankAccountBalanceApiModel)) {
            return false;
        }
        OpenBankAccountBalanceApiModel openBankAccountBalanceApiModel = (OpenBankAccountBalanceApiModel) obj;
        return C41536l.m120484d(this.balanceAmount, openBankAccountBalanceApiModel.balanceAmount) && C41536l.m120484d(this.balanceType, openBankAccountBalanceApiModel.balanceType) && C41536l.m120484d(this.referenceDate, openBankAccountBalanceApiModel.referenceDate) && C41536l.m120484d(this.lastChangeDateTime, openBankAccountBalanceApiModel.lastChangeDateTime);
    }

    public final BalanceAmountApiModel getBalanceAmount() {
        return this.balanceAmount;
    }

    public final String getBalanceType() {
        return this.balanceType;
    }

    public final String getLastChangeDateTime() {
        return this.lastChangeDateTime;
    }

    public final String getReferenceDate() {
        return this.referenceDate;
    }

    public int hashCode() {
        int hashCode = this.balanceAmount.hashCode() * 31;
        String str = this.balanceType;
        int i = 0;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.referenceDate;
        int hashCode3 = (hashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.lastChangeDateTime;
        if (str3 != null) {
            i = str3.hashCode();
        }
        return hashCode3 + i;
    }

    public String toString() {
        BalanceAmountApiModel balanceAmountApiModel = this.balanceAmount;
        String str = this.balanceType;
        String str2 = this.referenceDate;
        String str3 = this.lastChangeDateTime;
        return "OpenBankAccountBalanceApiModel(balanceAmount=" + balanceAmountApiModel + ", balanceType=" + str + ", referenceDate=" + str2 + ", lastChangeDateTime=" + str3 + ")";
    }
}
