package ke0;

import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.C41536l;
import p341ge.bog.mobilebank.galtandtaggart.data.model.AccountConfirmFilesApiModel;
import p341ge.bog.mobilebank.galtandtaggart.data.model.AccountStatementFilesApiModel;
import p341ge.bog.mobilebank.galtandtaggart.data.model.ConfirmFileApiModel;
import p341ge.bog.mobilebank.galtandtaggart.data.model.StatementFileApiModel;
import xe0.C29743a;

/* renamed from: ke0.a */
public final class C25712a {
    /* renamed from: a */
    public final List mo64279a(AccountConfirmFilesApiModel accountConfirmFilesApiModel) {
        C41536l.m120489i(accountConfirmFilesApiModel, "model");
        List<ConfirmFileApiModel> files = accountConfirmFilesApiModel.getFiles();
        if (files == null) {
            return C41341q.m119907j();
        }
        ArrayList arrayList = new ArrayList(C41343r.m119925u(files, 10));
        for (ConfirmFileApiModel confirmFileApiModel : files) {
            String displayName = confirmFileApiModel.getDisplayName();
            String str = "";
            if (displayName == null) {
                displayName = str;
            }
            String url = confirmFileApiModel.getUrl();
            if (url != null) {
                str = url;
            }
            arrayList.add(new C29743a(displayName, str));
        }
        return arrayList;
    }

    /* renamed from: b */
    public final List mo64280b(AccountStatementFilesApiModel accountStatementFilesApiModel) {
        C41536l.m120489i(accountStatementFilesApiModel, "model");
        List<StatementFileApiModel> files = accountStatementFilesApiModel.getFiles();
        if (files == null) {
            return C41341q.m119907j();
        }
        ArrayList arrayList = new ArrayList(C41343r.m119925u(files, 10));
        for (StatementFileApiModel statementFileApiModel : files) {
            String displayName = statementFileApiModel.getDisplayName();
            String str = "";
            if (displayName == null) {
                displayName = str;
            }
            String url = statementFileApiModel.getUrl();
            if (url != null) {
                str = url;
            }
            arrayList.add(new C29743a(displayName, str));
        }
        return arrayList;
    }
}
