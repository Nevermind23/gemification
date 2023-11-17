package p182n6;

import android.app.Activity;
import android.content.Intent;

/* renamed from: n6.t */
final class C7287t extends C7290v {

    /* renamed from: d */
    final /* synthetic */ Intent f21477d;

    /* renamed from: e */
    final /* synthetic */ Activity f21478e;

    /* renamed from: f */
    final /* synthetic */ int f21479f;

    C7287t(Intent intent, Activity activity, int i) {
        this.f21477d = intent;
        this.f21478e = activity;
        this.f21479f = i;
    }

    /* renamed from: a */
    public final void mo21660a() {
        Intent intent = this.f21477d;
        if (intent != null) {
            this.f21478e.startActivityForResult(intent, this.f21479f);
        }
    }
}
