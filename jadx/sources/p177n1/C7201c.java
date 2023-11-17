package p177n1;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import androidx.work.C2073m;
import kotlin.jvm.internal.C41536l;
import p216q1.C7819c;

/* renamed from: n1.c */
public final class C7201c extends C7203e {
    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C7201c(Context context, C7819c cVar) {
        super(context, cVar);
        C41536l.m120489i(context, "context");
        C41536l.m120489i(cVar, "taskExecutor");
    }

    /* renamed from: j */
    public IntentFilter mo21563j() {
        IntentFilter intentFilter = new IntentFilter();
        intentFilter.addAction("android.intent.action.BATTERY_OKAY");
        intentFilter.addAction("android.intent.action.BATTERY_LOW");
        return intentFilter;
    }

    /* renamed from: k */
    public void mo21564k(Intent intent) {
        C41536l.m120489i(intent, "intent");
        if (intent.getAction() != null) {
            C2073m e = C2073m.m8071e();
            String a = C7202d.f21362a;
            e.mo6959a(a, "Received " + intent.getAction());
            String action = intent.getAction();
            if (action != null) {
                int hashCode = action.hashCode();
                if (hashCode != -1980154005) {
                    if (hashCode == 490310653 && action.equals("android.intent.action.BATTERY_LOW")) {
                        mo21574g(Boolean.FALSE);
                    }
                } else if (action.equals("android.intent.action.BATTERY_OKAY")) {
                    mo21574g(Boolean.TRUE);
                }
            }
        }
    }

    /* renamed from: l */
    public Boolean mo21562e() {
        Intent registerReceiver = mo21572d().registerReceiver((BroadcastReceiver) null, new IntentFilter("android.intent.action.BATTERY_CHANGED"));
        if (registerReceiver == null) {
            C2073m.m8071e().mo6961c(C7202d.f21362a, "getInitialState - null intent received");
            return Boolean.FALSE;
        }
        int intExtra = registerReceiver.getIntExtra("status", -1);
        float intExtra2 = ((float) registerReceiver.getIntExtra("level", -1)) / ((float) registerReceiver.getIntExtra("scale", -1));
        boolean z = true;
        if (intExtra != 1 && intExtra2 <= 0.15f) {
            z = false;
        }
        return Boolean.valueOf(z);
    }
}
