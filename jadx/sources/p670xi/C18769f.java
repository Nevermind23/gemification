package p670xi;

import android.widget.RadioGroup;
import p341ge.bog.designsystem.components.onetimepassword.OneTimePasswordView;

/* renamed from: xi.f */
public final /* synthetic */ class C18769f implements RadioGroup.OnCheckedChangeListener {

    /* renamed from: a */
    public final /* synthetic */ OneTimePasswordView f52467a;

    public /* synthetic */ C18769f(OneTimePasswordView oneTimePasswordView) {
        this.f52467a = oneTimePasswordView;
    }

    public final void onCheckedChanged(RadioGroup radioGroup, int i) {
        OneTimePasswordView.m50375d(this.f52467a, radioGroup, i);
    }
}
