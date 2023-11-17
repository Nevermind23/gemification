package eb0;

import android.view.View;
import p341ge.bog.designsystem.components.list.OvalIconToggleItem;
import p341ge.bog.mobilebank.depositapplication.presentation.depositsubmission.DepositApplicationSubmissionActivity;

/* renamed from: eb0.j */
public final /* synthetic */ class C20203j implements View.OnClickListener {

    /* renamed from: d */
    public final /* synthetic */ OvalIconToggleItem f54889d;

    /* renamed from: e */
    public final /* synthetic */ DepositApplicationSubmissionActivity f54890e;

    public /* synthetic */ C20203j(OvalIconToggleItem ovalIconToggleItem, DepositApplicationSubmissionActivity depositApplicationSubmissionActivity) {
        this.f54889d = ovalIconToggleItem;
        this.f54890e = depositApplicationSubmissionActivity;
    }

    public final void onClick(View view) {
        DepositApplicationSubmissionActivity.m74434p3(this.f54889d, this.f54890e, view);
    }
}
