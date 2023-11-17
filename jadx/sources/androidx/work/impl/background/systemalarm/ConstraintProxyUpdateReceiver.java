package androidx.work.impl.background.systemalarm;

import android.content.BroadcastReceiver;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import androidx.work.C2073m;
import androidx.work.impl.C2007e0;
import androidx.work.impl.background.systemalarm.ConstraintProxy;
import p203p1.C7654r;

public class ConstraintProxyUpdateReceiver extends BroadcastReceiver {

    /* renamed from: a */
    static final String f5962a = C2073m.m8073i("ConstrntProxyUpdtRecvr");

    /* renamed from: androidx.work.impl.background.systemalarm.ConstraintProxyUpdateReceiver$a */
    class C1971a implements Runnable {

        /* renamed from: d */
        final /* synthetic */ Intent f5963d;

        /* renamed from: e */
        final /* synthetic */ Context f5964e;

        /* renamed from: f */
        final /* synthetic */ BroadcastReceiver.PendingResult f5965f;

        C1971a(Intent intent, Context context, BroadcastReceiver.PendingResult pendingResult) {
            this.f5963d = intent;
            this.f5964e = context;
            this.f5965f = pendingResult;
        }

        public void run() {
            try {
                boolean booleanExtra = this.f5963d.getBooleanExtra("KEY_BATTERY_NOT_LOW_PROXY_ENABLED", false);
                boolean booleanExtra2 = this.f5963d.getBooleanExtra("KEY_BATTERY_CHARGING_PROXY_ENABLED", false);
                boolean booleanExtra3 = this.f5963d.getBooleanExtra("KEY_STORAGE_NOT_LOW_PROXY_ENABLED", false);
                boolean booleanExtra4 = this.f5963d.getBooleanExtra("KEY_NETWORK_STATE_PROXY_ENABLED", false);
                C2073m.m8071e().mo6959a(ConstraintProxyUpdateReceiver.f5962a, "Updating proxies: (BatteryNotLowProxy (" + booleanExtra + "), BatteryChargingProxy (" + booleanExtra2 + "), StorageNotLowProxy (" + booleanExtra3 + "), NetworkStateProxy (" + booleanExtra4 + "), ");
                C7654r.m29095a(this.f5964e, ConstraintProxy.BatteryNotLowProxy.class, booleanExtra);
                C7654r.m29095a(this.f5964e, ConstraintProxy.BatteryChargingProxy.class, booleanExtra2);
                C7654r.m29095a(this.f5964e, ConstraintProxy.StorageNotLowProxy.class, booleanExtra3);
                C7654r.m29095a(this.f5964e, ConstraintProxy.NetworkStateProxy.class, booleanExtra4);
            } finally {
                this.f5965f.finish();
            }
        }
    }

    /* renamed from: a */
    public static Intent m7769a(Context context, boolean z, boolean z2, boolean z3, boolean z4) {
        Intent intent = new Intent("androidx.work.impl.background.systemalarm.UpdateProxies");
        intent.setComponent(new ComponentName(context, ConstraintProxyUpdateReceiver.class));
        intent.putExtra("KEY_BATTERY_NOT_LOW_PROXY_ENABLED", z).putExtra("KEY_BATTERY_CHARGING_PROXY_ENABLED", z2).putExtra("KEY_STORAGE_NOT_LOW_PROXY_ENABLED", z3).putExtra("KEY_NETWORK_STATE_PROXY_ENABLED", z4);
        return intent;
    }

    public void onReceive(Context context, Intent intent) {
        String str;
        if (intent != null) {
            str = intent.getAction();
        } else {
            str = null;
        }
        if (!"androidx.work.impl.background.systemalarm.UpdateProxies".equals(str)) {
            C2073m e = C2073m.m8071e();
            String str2 = f5962a;
            e.mo6959a(str2, "Ignoring unknown action " + str);
            return;
        }
        C2007e0.m7860n(context).mo6829t().mo22739c(new C1971a(intent, context, goAsync()));
    }
}
