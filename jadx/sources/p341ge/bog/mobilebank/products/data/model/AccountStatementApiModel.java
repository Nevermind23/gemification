package p341ge.bog.mobilebank.products.data.model;

import androidx.annotation.Keep;
import java.util.List;
import kotlin.jvm.internal.C41536l;

@Keep
/* renamed from: ge.bog.mobilebank.products.data.model.AccountStatementApiModel */
public final class AccountStatementApiModel {
    private final List<CurrencyApiModel> amounts;
    private final String entryComment;
    private final String postDate;

    public AccountStatementApiModel(String str, String str2, List<CurrencyApiModel> list) {
        C41536l.m120489i(str, "postDate");
        C41536l.m120489i(str2, "entryComment");
        C41536l.m120489i(list, "amounts");
        this.postDate = str;
        this.entryComment = str2;
        this.amounts = list;
    }

    public static /* synthetic */ AccountStatementApiModel copy$default(AccountStatementApiModel accountStatementApiModel, String str, String str2, List<CurrencyApiModel> list, int i, Object obj) {
        if ((i & 1) != 0) {
            str = accountStatementApiModel.postDate;
        }
        if ((i & 2) != 0) {
            str2 = accountStatementApiModel.entryComment;
        }
        if ((i & 4) != 0) {
            list = accountStatementApiModel.amounts;
        }
        return accountStatementApiModel.copy(str, str2, list);
    }

    public final String component1() {
        return this.postDate;
    }

    public final String component2() {
        return this.entryComment;
    }

    public final List<CurrencyApiModel> component3() {
        return this.amounts;
    }

    public final AccountStatementApiModel copy(String str, String str2, List<CurrencyApiModel> list) {
        C41536l.m120489i(str, "postDate");
        C41536l.m120489i(str2, "entryComment");
        C41536l.m120489i(list, "amounts");
        return new AccountStatementApiModel(str, str2, list);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AccountStatementApiModel)) {
            return false;
        }
        AccountStatementApiModel accountStatementApiModel = (AccountStatementApiModel) obj;
        return C41536l.m120484d(this.postDate, accountStatementApiModel.postDate) && C41536l.m120484d(this.entryComment, accountStatementApiModel.entryComment) && C41536l.m120484d(this.amounts, accountStatementApiModel.amounts);
    }

    public final List<CurrencyApiModel> getAmounts() {
        return this.amounts;
    }

    public final String getEntryComment() {
        return this.entryComment;
    }

    public final String getPostDate() {
        return this.postDate;
    }

    public int hashCode() {
        return (((this.postDate.hashCode() * 31) + this.entryComment.hashCode()) * 31) + this.amounts.hashCode();
    }

    public String toString() {
        String str = this.postDate;
        String str2 = this.entryComment;
        List<CurrencyApiModel> list = this.amounts;
        return "AccountStatementApiModel(postDate=" + str + ", entryComment=" + str2 + ", amounts=" + list + ")";
    }
}
