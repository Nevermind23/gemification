package p341ge.bog.mobilebank.galtandtaggart.data.model;

import androidx.annotation.Keep;
import java.util.List;
import kotlin.jvm.internal.C41536l;

@Keep
/* renamed from: ge.bog.mobilebank.galtandtaggart.data.model.AccountConfirmFilesApiModel */
public final class AccountConfirmFilesApiModel {
    private final List<ConfirmFileApiModel> files;

    public AccountConfirmFilesApiModel(List<ConfirmFileApiModel> list) {
        this.files = list;
    }

    public static /* synthetic */ AccountConfirmFilesApiModel copy$default(AccountConfirmFilesApiModel accountConfirmFilesApiModel, List<ConfirmFileApiModel> list, int i, Object obj) {
        if ((i & 1) != 0) {
            list = accountConfirmFilesApiModel.files;
        }
        return accountConfirmFilesApiModel.copy(list);
    }

    public final List<ConfirmFileApiModel> component1() {
        return this.files;
    }

    public final AccountConfirmFilesApiModel copy(List<ConfirmFileApiModel> list) {
        return new AccountConfirmFilesApiModel(list);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof AccountConfirmFilesApiModel) && C41536l.m120484d(this.files, ((AccountConfirmFilesApiModel) obj).files);
    }

    public final List<ConfirmFileApiModel> getFiles() {
        return this.files;
    }

    public int hashCode() {
        List<ConfirmFileApiModel> list = this.files;
        if (list == null) {
            return 0;
        }
        return list.hashCode();
    }

    public String toString() {
        List<ConfirmFileApiModel> list = this.files;
        return "AccountConfirmFilesApiModel(files=" + list + ")";
    }
}
