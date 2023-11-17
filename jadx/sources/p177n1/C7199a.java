package p177n1;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import androidx.work.C2073m;
import kotlin.jvm.internal.C41536l;
import p216q1.C7819c;

/* renamed from: n1.a */
public final class C7199a extends C7203e {
    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C7199a(Context context, C7819c cVar) {
        super(context, cVar);
        C41536l.m120489i(context, "context");
        C41536l.m120489i(cVar, "taskExecutor");
    }

    /* renamed from: m */
    private final boolean m27733m(Intent intent) {
        int intExtra = intent.getIntExtra("status", -1);
        if (intExtra == 2 || intExtra == 5) {
            return true;
        }
        return false;
    }

    /* renamed from: j */
    public IntentFilter mo21563j() {
        IntentFilter intentFilter = new IntentFilter();
        intentFilter.addAction("android.os.action.CHARGING");
        intentFilter.addAction("android.os.action.DISCHARGING");
        return intentFilter;
    }

    /* renamed from: k */
    public void mo21564k(Intent intent) {
        C41536l.m120489i(intent, "intent");
        String action = intent.getAction();
        if (action != null) {
            C2073m e = C2073m.m8071e();
            String a = C7200b.f21361a;
            e.mo6959a(a, "Received " + action);
            switch (action.hashCode()) {
                case -1886648615:
                    if (action.equals("android.intent.action.ACTION_POWER_DISCONNECTED")) {
                        mo21574g(Boolean.FALSE);
                        return;
                    }
                    return;
                case -54942926:
                    if (action.equals("android.os.action.DISCHARGING")) {
                        mo21574g(Boolean.FALSE);
                        return;
                    }
                    return;
                case 948344062:
                    if (action.equals("android.os.action.CHARGING")) {
                        mo21574g(Boolean.TRUE);
                        return;
                    }
                    return;
                case 1019184907:
                    if (action.equals("android.intent.action.ACTION_POWER_CONNECTED")) {
                        mo21574g(Boolean.TRUE);
                        return;
                    }
                    return;
                default:
                    return;
            }
        }
    }

    /* renamed from: l */
    public Boolean mo21562e() {
        Intent registerReceiver = mo21572d().registerReceiver((BroadcastReceiver) null, new IntentFilter("android.intent.action.BATTERY_CHANGED"));
        if (registerReceiver != null) {
            return Boolean.valueOf(m27733m(registerReceiver));
        }
        C2073m.m8071e().mo6961c(C7200b.f21361a, "getInitialState - null intent received");
        return Boolean.FALSE;
    }
}
