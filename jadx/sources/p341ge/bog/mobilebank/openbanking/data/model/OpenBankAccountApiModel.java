package p341ge.bog.mobilebank.openbanking.data.model;

import androidx.annotation.Keep;
import java.util.List;
import kotlin.jvm.internal.C41536l;

@Keep
/* renamed from: ge.bog.mobilebank.openbanking.data.model.OpenBankAccountApiModel */
public final class OpenBankAccountApiModel {
    private final String accountType;
    private final List<OpenBankAccountRowApiModel> accounts;
    private final OpenBankAccountSummaryApiModel summary;

    public OpenBankAccountApiModel(OpenBankAccountSummaryApiModel openBankAccountSummaryApiModel, String str, List<OpenBankAccountRowApiModel> list) {
        C41536l.m120489i(openBankAccountSummaryApiModel, "summary");
        C41536l.m120489i(str, "accountType");
        C41536l.m120489i(list, "accounts");
        this.summary = openBankAccountSummaryApiModel;
        this.accountType = str;
        this.accounts = list;
    }

    public static /* synthetic */ OpenBankAccountApiModel copy$default(OpenBankAccountApiModel openBankAccountApiModel, OpenBankAccountSummaryApiModel openBankAccountSummaryApiModel, String str, List<OpenBankAccountRowApiModel> list, int i, Object obj) {
        if ((i & 1) != 0) {
            openBankAccountSummaryApiModel = openBankAccountApiModel.summary;
        }
        if ((i & 2) != 0) {
            str = openBankAccountApiModel.accountType;
        }
        if ((i & 4) != 0) {
            list = openBankAccountApiModel.accounts;
        }
        return openBankAccountApiModel.copy(openBankAccountSummaryApiModel, str, list);
    }

    public final OpenBankAccountSummaryApiModel component1() {
        return this.summary;
    }

    public final String component2() {
        return this.accountType;
    }

    public final List<OpenBankAccountRowApiModel> component3() {
        return this.accounts;
    }

    public final OpenBankAccountApiModel copy(OpenBankAccountSummaryApiModel openBankAccountSummaryApiModel, String str, List<OpenBankAccountRowApiModel> list) {
        C41536l.m120489i(openBankAccountSummaryApiModel, "summary");
        C41536l.m120489i(str, "accountType");
        C41536l.m120489i(list, "accounts");
        return new OpenBankAccountApiModel(openBankAccountSummaryApiModel, str, list);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof OpenBankAccountApiModel)) {
            return false;
        }
        OpenBankAccountApiModel openBankAccountApiModel = (OpenBankAccountApiModel) obj;
        return C41536l.m120484d(this.summary, openBankAccountApiModel.summary) && C41536l.m120484d(this.accountType, openBankAccountApiModel.accountType) && C41536l.m120484d(this.accounts, openBankAccountApiModel.accounts);
    }

    public final String getAccountType() {
        return this.accountType;
    }

    public final List<OpenBankAccountRowApiModel> getAccounts() {
        return this.accounts;
    }

    public final OpenBankAccountSummaryApiModel getSummary() {
        return this.summary;
    }

    public int hashCode() {
        return (((this.summary.hashCode() * 31) + this.accountType.hashCode()) * 31) + this.accounts.hashCode();
    }

    public String toString() {
        OpenBankAccountSummaryApiModel openBankAccountSummaryApiModel = this.summary;
        String str = this.accountType;
        List<OpenBankAccountRowApiModel> list = this.accounts;
        return "OpenBankAccountApiModel(summary=" + openBankAccountSummaryApiModel + ", accountType=" + str + ", accounts=" + list + ")";
    }
}
