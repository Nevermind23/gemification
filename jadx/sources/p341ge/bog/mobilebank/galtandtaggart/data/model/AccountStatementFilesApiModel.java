package p341ge.bog.mobilebank.galtandtaggart.data.model;

import androidx.annotation.Keep;
import java.util.List;
import kotlin.jvm.internal.C41536l;

@Keep
/* renamed from: ge.bog.mobilebank.galtandtaggart.data.model.AccountStatementFilesApiModel */
public final class AccountStatementFilesApiModel {
    private final List<StatementFileApiModel> files;

    public AccountStatementFilesApiModel(List<StatementFileApiModel> list) {
        this.files = list;
    }

    public static /* synthetic */ AccountStatementFilesApiModel copy$default(AccountStatementFilesApiModel accountStatementFilesApiModel, List<StatementFileApiModel> list, int i, Object obj) {
        if ((i & 1) != 0) {
            list = accountStatementFilesApiModel.files;
        }
        return accountStatementFilesApiModel.copy(list);
    }

    public final List<StatementFileApiModel> component1() {
        return this.files;
    }

    public final AccountStatementFilesApiModel copy(List<StatementFileApiModel> list) {
        return new AccountStatementFilesApiModel(list);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof AccountStatementFilesApiModel) && C41536l.m120484d(this.files, ((AccountStatementFilesApiModel) obj).files);
    }

    public final List<StatementFileApiModel> getFiles() {
        return this.files;
    }

    public int hashCode() {
        List<StatementFileApiModel> list = this.files;
        if (list == null) {
            return 0;
        }
        return list.hashCode();
    }

    public String toString() {
        List<StatementFileApiModel> list = this.files;
        return "AccountStatementFilesApiModel(files=" + list + ")";
    }
}
