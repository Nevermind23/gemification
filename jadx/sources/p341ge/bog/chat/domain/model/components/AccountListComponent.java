package p341ge.bog.chat.domain.model.components;

import androidx.annotation.Keep;
import java.util.List;
import kotlin.jvm.internal.C41536l;
import kotlin.jvm.internal.DefaultConstructorMarker;

@Keep
/* renamed from: ge.bog.chat.domain.model.components.AccountListComponent */
public final class AccountListComponent extends Component {
    private final List<AccountComponent> accountsList;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AccountListComponent(List<AccountComponent> list) {
        super((DefaultConstructorMarker) null);
        C41536l.m120489i(list, "accountsList");
        this.accountsList = list;
    }

    public static /* synthetic */ AccountListComponent copy$default(AccountListComponent accountListComponent, List<AccountComponent> list, int i, Object obj) {
        if ((i & 1) != 0) {
            list = accountListComponent.accountsList;
        }
        return accountListComponent.copy(list);
    }

    public final List<AccountComponent> component1() {
        return this.accountsList;
    }

    public final AccountListComponent copy(List<AccountComponent> list) {
        C41536l.m120489i(list, "accountsList");
        return new AccountListComponent(list);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof AccountListComponent) && C41536l.m120484d(this.accountsList, ((AccountListComponent) obj).accountsList);
    }

    public final List<AccountComponent> getAccountsList() {
        return this.accountsList;
    }

    public int hashCode() {
        return this.accountsList.hashCode();
    }

    public String toString() {
        List<AccountComponent> list = this.accountsList;
        return "AccountListComponent(accountsList=" + list + ")";
    }
}
