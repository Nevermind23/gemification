package p341ge.bog.mobilebank.products.data.model;

import androidx.annotation.Keep;
import java.util.List;
import kotlin.jvm.internal.C41536l;

@Keep
/* renamed from: ge.bog.mobilebank.products.data.model.AccountsAccountsApiModel */
public final class AccountsAccountsApiModel {
    private final List<AccountApiModel> accounts;
    private final List<AccountSubAccountAmountSumsApiModel> subAccountRealAmountSums;
    private final AmountApiModel summary;

    public AccountsAccountsApiModel(AmountApiModel amountApiModel, List<AccountApiModel> list, List<AccountSubAccountAmountSumsApiModel> list2) {
        C41536l.m120489i(amountApiModel, "summary");
        C41536l.m120489i(list, "accounts");
        this.summary = amountApiModel;
        this.accounts = list;
        this.subAccountRealAmountSums = list2;
    }

    public static /* synthetic */ AccountsAccountsApiModel copy$default(AccountsAccountsApiModel accountsAccountsApiModel, AmountApiModel amountApiModel, List<AccountApiModel> list, List<AccountSubAccountAmountSumsApiModel> list2, int i, Object obj) {
        if ((i & 1) != 0) {
            amountApiModel = accountsAccountsApiModel.summary;
        }
        if ((i & 2) != 0) {
            list = accountsAccountsApiModel.accounts;
        }
        if ((i & 4) != 0) {
            list2 = accountsAccountsApiModel.subAccountRealAmountSums;
        }
        return accountsAccountsApiModel.copy(amountApiModel, list, list2);
    }

    public final AmountApiModel component1() {
        return this.summary;
    }

    public final List<AccountApiModel> component2() {
        return this.accounts;
    }

    public final List<AccountSubAccountAmountSumsApiModel> component3() {
        return this.subAccountRealAmountSums;
    }

    public final AccountsAccountsApiModel copy(AmountApiModel amountApiModel, List<AccountApiModel> list, List<AccountSubAccountAmountSumsApiModel> list2) {
        C41536l.m120489i(amountApiModel, "summary");
        C41536l.m120489i(list, "accounts");
        return new AccountsAccountsApiModel(amountApiModel, list, list2);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AccountsAccountsApiModel)) {
            return false;
        }
        AccountsAccountsApiModel accountsAccountsApiModel = (AccountsAccountsApiModel) obj;
        return C41536l.m120484d(this.summary, accountsAccountsApiModel.summary) && C41536l.m120484d(this.accounts, accountsAccountsApiModel.accounts) && C41536l.m120484d(this.subAccountRealAmountSums, accountsAccountsApiModel.subAccountRealAmountSums);
    }

    public final List<AccountApiModel> getAccounts() {
        return this.accounts;
    }

    public final List<AccountSubAccountAmountSumsApiModel> getSubAccountRealAmountSums() {
        return this.subAccountRealAmountSums;
    }

    public final AmountApiModel getSummary() {
        return this.summary;
    }

    public int hashCode() {
        int hashCode = ((this.summary.hashCode() * 31) + this.accounts.hashCode()) * 31;
        List<AccountSubAccountAmountSumsApiModel> list = this.subAccountRealAmountSums;
        return hashCode + (list == null ? 0 : list.hashCode());
    }

    public String toString() {
        AmountApiModel amountApiModel = this.summary;
        List<AccountApiModel> list = this.accounts;
        List<AccountSubAccountAmountSumsApiModel> list2 = this.subAccountRealAmountSums;
        return "AccountsAccountsApiModel(summary=" + amountApiModel + ", accounts=" + list + ", subAccountRealAmountSums=" + list2 + ")";
    }
}
