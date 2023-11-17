package p341ge.bog.mobilebank.cleanarch.data.products.entity;

import androidx.annotation.Keep;
import java.util.List;
import kotlin.jvm.internal.C41536l;

@Keep
/* renamed from: ge.bog.mobilebank.cleanarch.data.products.entity.AccountsApiEntity */
public final class AccountsApiEntity {
    private final AccountsAccountsApiEntity accounts;
    private final List<AccountDetailsApiEntity> details;
    private final List<AccountOverdraftParamsApiEntity> overdraftParams;

    public AccountsApiEntity(AccountsAccountsApiEntity accountsAccountsApiEntity, List<AccountDetailsApiEntity> list, List<AccountOverdraftParamsApiEntity> list2) {
        C41536l.m120489i(accountsAccountsApiEntity, "accounts");
        C41536l.m120489i(list, "details");
        C41536l.m120489i(list2, "overdraftParams");
        this.accounts = accountsAccountsApiEntity;
        this.details = list;
        this.overdraftParams = list2;
    }

    public static /* synthetic */ AccountsApiEntity copy$default(AccountsApiEntity accountsApiEntity, AccountsAccountsApiEntity accountsAccountsApiEntity, List<AccountDetailsApiEntity> list, List<AccountOverdraftParamsApiEntity> list2, int i, Object obj) {
        if ((i & 1) != 0) {
            accountsAccountsApiEntity = accountsApiEntity.accounts;
        }
        if ((i & 2) != 0) {
            list = accountsApiEntity.details;
        }
        if ((i & 4) != 0) {
            list2 = accountsApiEntity.overdraftParams;
        }
        return accountsApiEntity.copy(accountsAccountsApiEntity, list, list2);
    }

    public final AccountsAccountsApiEntity component1() {
        return this.accounts;
    }

    public final List<AccountDetailsApiEntity> component2() {
        return this.details;
    }

    public final List<AccountOverdraftParamsApiEntity> component3() {
        return this.overdraftParams;
    }

    public final AccountsApiEntity copy(AccountsAccountsApiEntity accountsAccountsApiEntity, List<AccountDetailsApiEntity> list, List<AccountOverdraftParamsApiEntity> list2) {
        C41536l.m120489i(accountsAccountsApiEntity, "accounts");
        C41536l.m120489i(list, "details");
        C41536l.m120489i(list2, "overdraftParams");
        return new AccountsApiEntity(accountsAccountsApiEntity, list, list2);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AccountsApiEntity)) {
            return false;
        }
        AccountsApiEntity accountsApiEntity = (AccountsApiEntity) obj;
        return C41536l.m120484d(this.accounts, accountsApiEntity.accounts) && C41536l.m120484d(this.details, accountsApiEntity.details) && C41536l.m120484d(this.overdraftParams, accountsApiEntity.overdraftParams);
    }

    public final AccountsAccountsApiEntity getAccounts() {
        return this.accounts;
    }

    public final List<AccountDetailsApiEntity> getDetails() {
        return this.details;
    }

    public final List<AccountOverdraftParamsApiEntity> getOverdraftParams() {
        return this.overdraftParams;
    }

    public int hashCode() {
        return (((this.accounts.hashCode() * 31) + this.details.hashCode()) * 31) + this.overdraftParams.hashCode();
    }

    public String toString() {
        AccountsAccountsApiEntity accountsAccountsApiEntity = this.accounts;
        List<AccountDetailsApiEntity> list = this.details;
        List<AccountOverdraftParamsApiEntity> list2 = this.overdraftParams;
        return "AccountsApiEntity(accounts=" + accountsAccountsApiEntity + ", details=" + list + ", overdraftParams=" + list2 + ")";
    }
}
