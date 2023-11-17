package eb0;

import android.view.View;
import p341ge.bog.designsystem.components.list.OvalIconToggleItem;
import p341ge.bog.mobilebank.depositapplication.presentation.depositsubmission.DepositApplicationSubmissionActivity;

/* renamed from: eb0.a */
public final /* synthetic */ class C20194a implements View.OnClickListener {

    /* renamed from: d */
    public final /* synthetic */ OvalIconToggleItem f54878d;

    /* renamed from: e */
    public final /* synthetic */ DepositApplicationSubmissionActivity f54879e;

    public /* synthetic */ C20194a(OvalIconToggleItem ovalIconToggleItem, DepositApplicationSubmissionActivity depositApplicationSubmissionActivity) {
        this.f54878d = ovalIconToggleItem;
        this.f54879e = depositApplicationSubmissionActivity;
    }

    public final void onClick(View view) {
        DepositApplicationSubmissionActivity.m74436r3(this.f54878d, this.f54879e, view);
    }
}
