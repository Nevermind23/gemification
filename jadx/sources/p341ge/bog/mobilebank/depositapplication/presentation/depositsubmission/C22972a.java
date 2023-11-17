package p341ge.bog.mobilebank.depositapplication.presentation.depositsubmission;

import java.io.Serializable;
import p341ge.bog.mobilebank.cleanarch.domain.transferaccounts.model.TransferAccountItem;
import p341ge.bog.mobilebank.depositapplication.presentation.depositsubmission.DepositApplicationSubmissionActivity;
import y11.C39989a;

/* renamed from: ge.bog.mobilebank.depositapplication.presentation.depositsubmission.a */
public final /* synthetic */ class C22972a implements C39989a, Serializable {

    /* renamed from: d */
    public final /* synthetic */ String f60408d;

    public /* synthetic */ C22972a(String str) {
        this.f60408d = str;
    }

    /* renamed from: z */
    public final boolean mo57048z(TransferAccountItem transferAccountItem) {
        return DepositApplicationSubmissionActivity.C22960l.m74464c(this.f60408d, transferAccountItem);
    }
}
