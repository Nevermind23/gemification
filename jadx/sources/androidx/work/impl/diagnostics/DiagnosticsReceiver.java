package androidx.work.impl.diagnostics;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import androidx.work.C2073m;
import androidx.work.C2076o;
import androidx.work.C2094x;
import androidx.work.impl.workers.DiagnosticsWorker;

public class DiagnosticsReceiver extends BroadcastReceiver {

    /* renamed from: a */
    private static final String f6028a = C2073m.m8073i("DiagnosticsRcvr");

    public void onReceive(Context context, Intent intent) {
        if (intent != null) {
            C2073m.m8071e().mo6959a(f6028a, "Requesting diagnostics");
            try {
                C2094x.m8110g(context).mo6981d(C2076o.m8093e(DiagnosticsWorker.class));
            } catch (IllegalStateException e) {
                C2073m.m8071e().mo6962d(f6028a, "WorkManager is not initialized", e);
            }
        }
    }
}
