package p540np;

import android.widget.RadioGroup;
import p341ge.bog.mobilebank.categorypackages.presentation.packagecancelfeedback.PackageCancelFeedbackFragment;
import p413eo.C12764q;

/* renamed from: np.c */
public final /* synthetic */ class C17137c implements RadioGroup.OnCheckedChangeListener {

    /* renamed from: a */
    public final /* synthetic */ C12764q f47958a;

    /* renamed from: b */
    public final /* synthetic */ PackageCancelFeedbackFragment f47959b;

    public /* synthetic */ C17137c(C12764q qVar, PackageCancelFeedbackFragment packageCancelFeedbackFragment) {
        this.f47958a = qVar;
        this.f47959b = packageCancelFeedbackFragment;
    }

    public final void onCheckedChanged(RadioGroup radioGroup, int i) {
        PackageCancelFeedbackFragment.m54261A1(this.f47958a, this.f47959b, radioGroup, i);
    }
}
