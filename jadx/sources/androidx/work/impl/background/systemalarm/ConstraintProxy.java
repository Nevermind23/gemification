package androidx.work.impl.background.systemalarm;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import androidx.work.C1954c;
import androidx.work.C2073m;
import androidx.work.C2075n;
import java.util.Iterator;
import java.util.List;
import p190o1.C7399v;

abstract class ConstraintProxy extends BroadcastReceiver {

    /* renamed from: a */
    private static final String f5961a = C2073m.m8073i("ConstraintProxy");

    public static class BatteryChargingProxy extends ConstraintProxy {
        public /* bridge */ /* synthetic */ void onReceive(Context context, Intent intent) {
            ConstraintProxy.super.onReceive(context, intent);
        }
    }

    public static class BatteryNotLowProxy extends ConstraintProxy {
        public /* bridge */ /* synthetic */ void onReceive(Context context, Intent intent) {
            ConstraintProxy.super.onReceive(context, intent);
        }
    }

    public static class NetworkStateProxy extends ConstraintProxy {
        public /* bridge */ /* synthetic */ void onReceive(Context context, Intent intent) {
            ConstraintProxy.super.onReceive(context, intent);
        }
    }

    public static class StorageNotLowProxy extends ConstraintProxy {
        public /* bridge */ /* synthetic */ void onReceive(Context context, Intent intent) {
            ConstraintProxy.super.onReceive(context, intent);
        }
    }

    ConstraintProxy() {
    }

    /* renamed from: a */
    static void m7768a(Context context, List list) {
        boolean z;
        Iterator it = list.iterator();
        boolean z2 = false;
        boolean z3 = false;
        boolean z4 = false;
        boolean z5 = false;
        while (it.hasNext()) {
            C1954c cVar = ((C7399v) it.next()).f21639j;
            z2 |= cVar.mo6715f();
            z3 |= cVar.mo6716g();
            z4 |= cVar.mo6719i();
            if (cVar.mo6712d() != C2075n.NOT_REQUIRED) {
                z = true;
            } else {
                z = false;
            }
            z5 |= z;
            if (z2 && z3 && z4 && z5) {
                break;
            }
        }
        context.sendBroadcast(ConstraintProxyUpdateReceiver.m7769a(context, z2, z3, z4, z5));
    }

    public void onReceive(Context context, Intent intent) {
        C2073m e = C2073m.m8071e();
        String str = f5961a;
        e.mo6959a(str, "onReceive : " + intent);
        context.startService(C1974b.m7777a(context));
    }
}
