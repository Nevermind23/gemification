package p341ge.bog.mobilebank.products.data.model;

import androidx.annotation.Keep;
import java.util.List;
import kotlin.jvm.internal.C41536l;

@Keep
/* renamed from: ge.bog.mobilebank.products.data.model.AccountsAndDetailsApiModel */
public final class AccountsAndDetailsApiModel {
    private final AccountsAccountsApiModel accounts;
    private final List<AccountDetailsApiModel> details;
    private final List<AccountOverdraftParamsApiModel> overdraftParams;

    public AccountsAndDetailsApiModel(AccountsAccountsApiModel accountsAccountsApiModel, List<AccountDetailsApiModel> list, List<AccountOverdraftParamsApiModel> list2) {
        C41536l.m120489i(accountsAccountsApiModel, "accounts");
        C41536l.m120489i(list, "details");
        C41536l.m120489i(list2, "overdraftParams");
        this.accounts = accountsAccountsApiModel;
        this.details = list;
        this.overdraftParams = list2;
    }

    public static /* synthetic */ AccountsAndDetailsApiModel copy$default(AccountsAndDetailsApiModel accountsAndDetailsApiModel, AccountsAccountsApiModel accountsAccountsApiModel, List<AccountDetailsApiModel> list, List<AccountOverdraftParamsApiModel> list2, int i, Object obj) {
        if ((i & 1) != 0) {
            accountsAccountsApiModel = accountsAndDetailsApiModel.accounts;
        }
        if ((i & 2) != 0) {
            list = accountsAndDetailsApiModel.details;
        }
        if ((i & 4) != 0) {
            list2 = accountsAndDetailsApiModel.overdraftParams;
        }
        return accountsAndDetailsApiModel.copy(accountsAccountsApiModel, list, list2);
    }

    public final AccountsAccountsApiModel component1() {
        return this.accounts;
    }

    public final List<AccountDetailsApiModel> component2() {
        return this.details;
    }

    public final List<AccountOverdraftParamsApiModel> component3() {
        return this.overdraftParams;
    }

    public final AccountsAndDetailsApiModel copy(AccountsAccountsApiModel accountsAccountsApiModel, List<AccountDetailsApiModel> list, List<AccountOverdraftParamsApiModel> list2) {
        C41536l.m120489i(accountsAccountsApiModel, "accounts");
        C41536l.m120489i(list, "details");
        C41536l.m120489i(list2, "overdraftParams");
        return new AccountsAndDetailsApiModel(accountsAccountsApiModel, list, list2);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AccountsAndDetailsApiModel)) {
            return false;
        }
        AccountsAndDetailsApiModel accountsAndDetailsApiModel = (AccountsAndDetailsApiModel) obj;
        return C41536l.m120484d(this.accounts, accountsAndDetailsApiModel.accounts) && C41536l.m120484d(this.details, accountsAndDetailsApiModel.details) && C41536l.m120484d(this.overdraftParams, accountsAndDetailsApiModel.overdraftParams);
    }

    public final AccountsAccountsApiModel getAccounts() {
        return this.accounts;
    }

    public final List<AccountDetailsApiModel> getDetails() {
        return this.details;
    }

    public final List<AccountOverdraftParamsApiModel> getOverdraftParams() {
        return this.overdraftParams;
    }

    public int hashCode() {
        return (((this.accounts.hashCode() * 31) + this.details.hashCode()) * 31) + this.overdraftParams.hashCode();
    }

    public String toString() {
        AccountsAccountsApiModel accountsAccountsApiModel = this.accounts;
        List<AccountDetailsApiModel> list = this.details;
        List<AccountOverdraftParamsApiModel> list2 = this.overdraftParams;
        return "AccountsAndDetailsApiModel(accounts=" + accountsAccountsApiModel + ", details=" + list + ", overdraftParams=" + list2 + ")";
    }
}
