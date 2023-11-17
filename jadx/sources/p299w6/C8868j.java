package p299w6;

import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.Intent;
import android.util.Log;
import android.view.View;

/* renamed from: w6.j */
final class C8868j implements View.OnClickListener {

    /* renamed from: d */
    final /* synthetic */ Context f24845d;

    /* renamed from: e */
    final /* synthetic */ Intent f24846e;

    C8868j(Context context, Intent intent) {
        this.f24845d = context;
        this.f24846e = intent;
    }

    public final void onClick(View view) {
        try {
            this.f24845d.startActivity(this.f24846e);
        } catch (ActivityNotFoundException e) {
            Log.e("DeferredLifecycleHelper", "Failed to start resolution intent", e);
        }
    }
}
