package p157l7;

import android.app.Activity;
import android.app.PendingIntent;
import android.content.Intent;
import android.content.IntentSender;
import android.os.Bundle;
import android.util.Log;
import com.google.android.gms.common.api.Status;
import java.lang.ref.WeakReference;

/* renamed from: l7.g */
public final class C6987g extends C6985f {

    /* renamed from: b */
    private final WeakReference f20857b;

    /* renamed from: c */
    private final int f20858c;

    public C6987g(Activity activity, int i) {
        this.f20857b = new WeakReference(activity);
        this.f20858c = i;
    }

    /* renamed from: k1 */
    public final void mo21122k1(Status status, Bundle bundle) {
        int i;
        Activity activity = (Activity) this.f20857b.get();
        if (activity == null) {
            Log.d("TapAndPayClientImpl", "Ignoring onHandlePendingIntent, Activity is gone");
            return;
        }
        if (status.mo11901f0()) {
            try {
                status.mo11906s0(activity, this.f20858c);
                return;
            } catch (IntentSender.SendIntentException e) {
                Log.w("TapAndPayClientImpl", "Exception starting pending intent", e);
            }
        }
        PendingIntent createPendingResult = activity.createPendingResult(this.f20858c, new Intent(), 1073741824);
        if (createPendingResult == null) {
            Log.w("TapAndPayClientImpl", "Null pending result returned for onHandleStatusPendingIntent");
            return;
        }
        try {
            if (status.mo11905q0()) {
                i = -1;
            } else {
                i = status.mo11911x();
            }
            createPendingResult.send(i);
        } catch (PendingIntent.CanceledException e2) {
            Log.w("TapAndPayClientImpl", "Exception setting pending result", e2);
        }
    }
}
