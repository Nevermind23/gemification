package p341ge.bog.mobilebank.p975ui.widgets.atms;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.location.Location;
import android.os.IBinder;
import android.util.Log;
import com.google.android.gms.location.C4527a;
import g91.C32330r0;
import g91.C32359z0;
import p183n7.C7310h;
import p337z7.C9223e;
import p341ge.bog.mobilebank.services.C34566c;

/* renamed from: ge.bog.mobilebank.ui.widgets.atms.AtmLocationService */
public class AtmLocationService extends C34566c {

    /* renamed from: i */
    private BroadcastReceiver f86530i;

    /* renamed from: j */
    private C4527a f86531j;

    /* renamed from: ge.bog.mobilebank.ui.widgets.atms.AtmLocationService$a */
    class C35823a extends BroadcastReceiver {
        C35823a() {
        }

        public void onReceive(Context context, Intent intent) {
            if ("ge.bog.mobilebank.LOCATION_PERMISSIONS_GRANTED".equals(intent.getAction())) {
                AtmLocationService.this.m106282f();
            }
        }
    }

    /* renamed from: ge.bog.mobilebank.ui.widgets.atms.AtmLocationService$b */
    class C35824b implements C9223e {
        C35824b() {
        }

        /* renamed from: b */
        public void mo17635a(Location location) {
            if (location != null) {
                AtmLocationService.this.m106283g(location);
            }
            AtmLocationService.this.stopSelf();
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: f */
    public void m106282f() {
        if (m106284h()) {
            this.f86531j.mo13979A().mo24864i(new C35824b());
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: g */
    public void m106283g(Location location) {
        Intent intent = new Intent("ge.bog.mobilebank.services.LOCATION_UPDATE");
        intent.setClass(this, ServicePointsWidgetProvider.class);
        intent.putExtra("CURRENT_LOCATION", location);
        sendBroadcast(intent);
    }

    /* renamed from: h */
    private boolean m106284h() {
        return C32330r0.m95338m(this, "android.permission.ACCESS_FINE_LOCATION");
    }

    public IBinder onBind(Intent intent) {
        return null;
    }

    public void onCreate() {
        C32359z0.m95575j0(">>>>>> AtmLocationService oncreate");
        super.onCreate();
        this.f86531j = C7310h.m27978a(this);
        this.f86530i = new C35823a();
        IntentFilter intentFilter = new IntentFilter();
        intentFilter.addAction("ge.bog.mobilebank.LOCATION_PERMISSIONS_GRANTED");
        registerReceiver(this.f86530i, intentFilter);
        m106282f();
    }

    public void onDestroy() {
        super.onDestroy();
        Log.d("AtmLocationService", ">>>>>>> onDestory");
        unregisterReceiver(this.f86530i);
    }
}
