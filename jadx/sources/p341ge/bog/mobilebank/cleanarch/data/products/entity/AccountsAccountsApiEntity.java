package p341ge.bog.mobilebank.cleanarch.data.products.entity;

import androidx.annotation.Keep;
import java.util.List;
import kotlin.jvm.internal.C41536l;

@Keep
/* renamed from: ge.bog.mobilebank.cleanarch.data.products.entity.AccountsAccountsApiEntity */
public final class AccountsAccountsApiEntity {
    private final List<AccountApiEntity> accounts;
    private final List<AccountSubAccountAmountSumsApiEntity> subAccountRealAmountSums;
    private final AccountAmountCcyApiEntity summary;

    public AccountsAccountsApiEntity(AccountAmountCcyApiEntity accountAmountCcyApiEntity, List<AccountApiEntity> list, List<AccountSubAccountAmountSumsApiEntity> list2) {
        C41536l.m120489i(accountAmountCcyApiEntity, "summary");
        C41536l.m120489i(list, "accounts");
        this.summary = accountAmountCcyApiEntity;
        this.accounts = list;
        this.subAccountRealAmountSums = list2;
    }

    public static /* synthetic */ AccountsAccountsApiEntity copy$default(AccountsAccountsApiEntity accountsAccountsApiEntity, AccountAmountCcyApiEntity accountAmountCcyApiEntity, List<AccountApiEntity> list, List<AccountSubAccountAmountSumsApiEntity> list2, int i, Object obj) {
        if ((i & 1) != 0) {
            accountAmountCcyApiEntity = accountsAccountsApiEntity.summary;
        }
        if ((i & 2) != 0) {
            list = accountsAccountsApiEntity.accounts;
        }
        if ((i & 4) != 0) {
            list2 = accountsAccountsApiEntity.subAccountRealAmountSums;
        }
        return accountsAccountsApiEntity.copy(accountAmountCcyApiEntity, list, list2);
    }

    public final AccountAmountCcyApiEntity component1() {
        return this.summary;
    }

    public final List<AccountApiEntity> component2() {
        return this.accounts;
    }

    public final List<AccountSubAccountAmountSumsApiEntity> component3() {
        return this.subAccountRealAmountSums;
    }

    public final AccountsAccountsApiEntity copy(AccountAmountCcyApiEntity accountAmountCcyApiEntity, List<AccountApiEntity> list, List<AccountSubAccountAmountSumsApiEntity> list2) {
        C41536l.m120489i(accountAmountCcyApiEntity, "summary");
        C41536l.m120489i(list, "accounts");
        return new AccountsAccountsApiEntity(accountAmountCcyApiEntity, list, list2);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AccountsAccountsApiEntity)) {
            return false;
        }
        AccountsAccountsApiEntity accountsAccountsApiEntity = (AccountsAccountsApiEntity) obj;
        return C41536l.m120484d(this.summary, accountsAccountsApiEntity.summary) && C41536l.m120484d(this.accounts, accountsAccountsApiEntity.accounts) && C41536l.m120484d(this.subAccountRealAmountSums, accountsAccountsApiEntity.subAccountRealAmountSums);
    }

    public final List<AccountApiEntity> getAccounts() {
        return this.accounts;
    }

    public final List<AccountSubAccountAmountSumsApiEntity> getSubAccountRealAmountSums() {
        return this.subAccountRealAmountSums;
    }

    public final AccountAmountCcyApiEntity getSummary() {
        return this.summary;
    }

    public int hashCode() {
        int hashCode = ((this.summary.hashCode() * 31) + this.accounts.hashCode()) * 31;
        List<AccountSubAccountAmountSumsApiEntity> list = this.subAccountRealAmountSums;
        return hashCode + (list == null ? 0 : list.hashCode());
    }

    public String toString() {
        AccountAmountCcyApiEntity accountAmountCcyApiEntity = this.summary;
        List<AccountApiEntity> list = this.accounts;
        List<AccountSubAccountAmountSumsApiEntity> list2 = this.subAccountRealAmountSums;
        return "AccountsAccountsApiEntity(summary=" + accountAmountCcyApiEntity + ", accounts=" + list + ", subAccountRealAmountSums=" + list2 + ")";
    }
}
