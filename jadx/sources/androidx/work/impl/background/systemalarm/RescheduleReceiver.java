package androidx.work.impl.background.systemalarm;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import androidx.work.C2073m;
import androidx.work.impl.C2007e0;

public class RescheduleReceiver extends BroadcastReceiver {

    /* renamed from: a */
    private static final String f5967a = C2073m.m8073i("RescheduleReceiver");

    public void onReceive(Context context, Intent intent) {
        C2073m e = C2073m.m8071e();
        String str = f5967a;
        e.mo6959a(str, "Received intent " + intent);
        try {
            C2007e0.m7860n(context).mo6832x(goAsync());
        } catch (IllegalStateException e2) {
            C2073m.m8071e().mo6962d(f5967a, "Cannot reschedule jobs. WorkManager needs to be initialized via a ContentProvider#onCreate() or an Application#onCreate().", e2);
        }
    }
}
