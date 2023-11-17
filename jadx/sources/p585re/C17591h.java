package p585re;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import com.threatmetrix.TrustDefender.C11889d;
import com.threatmetrix.TrustDefender.C11907h;

/* renamed from: re.h */
public class C17591h extends BroadcastReceiver {

    /* renamed from: b */
    private static final String f49274b = C11907h.m43615j(C17591h.class);

    /* renamed from: a */
    public C11889d f49275a;

    private C17591h(C11889d dVar) {
        this.f49275a = dVar;
    }

    /* renamed from: a */
    public static void m61175a(C11889d dVar, C17603t tVar) {
        if (tVar == null || tVar.f49314a == null) {
            C11907h.m43622q(f49274b, "Null context");
            return;
        }
        IntentFilter intentFilter = new IntentFilter();
        intentFilter.addAction("android.intent.action.SCREEN_ON");
        intentFilter.addAction("android.intent.action.SCREEN_OFF");
        tVar.f49314a.registerReceiver(new C17591h(dVar), intentFilter);
    }

    public void onReceive(Context context, Intent intent) {
        if ("android.intent.action.SCREEN_OFF".equals(intent.getAction())) {
            this.f49275a.mo31937J();
        } else if ("android.intent.action.SCREEN_ON".equals(intent.getAction())) {
            this.f49275a.mo31936H();
        }
    }
}
