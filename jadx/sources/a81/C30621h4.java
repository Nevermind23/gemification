package a81;

import android.content.DialogInterface;
import p341ge.bog.mobilebank.p975ui.activities.MainActivity;

/* renamed from: a81.h4 */
public final /* synthetic */ class C30621h4 implements DialogInterface.OnDismissListener {

    /* renamed from: d */
    public final /* synthetic */ MainActivity f76629d;

    /* renamed from: e */
    public final /* synthetic */ Long f76630e;

    public /* synthetic */ C30621h4(MainActivity mainActivity, Long l) {
        this.f76629d = mainActivity;
        this.f76630e = l;
    }

    public final void onDismiss(DialogInterface dialogInterface) {
        this.f76629d.m103845q5(this.f76630e, dialogInterface);
    }
}
