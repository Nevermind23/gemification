package p341ge.bog.mobilebank.services;

import android.content.Intent;
import android.location.Location;
import android.os.IBinder;
import com.google.android.gms.location.C4527a;
import g91.C32330r0;
import p183n7.C7310h;
import p337z7.C9221d;
import p337z7.C9223e;

/* renamed from: ge.bog.mobilebank.services.LastKnownLocationService */
public class LastKnownLocationService extends C34566c {

    /* renamed from: i */
    private C4527a f83514i;

    /* renamed from: ge.bog.mobilebank.services.LastKnownLocationService$a */
    class C34560a implements C9221d {
        C34560a() {
        }

        public void onFailure(Exception exc) {
            LastKnownLocationService.this.stopSelf();
        }
    }

    /* renamed from: ge.bog.mobilebank.services.LastKnownLocationService$b */
    class C34561b implements C9223e {
        C34561b() {
        }

        /* renamed from: b */
        public void mo17635a(Location location) {
            LastKnownLocationService.this.f83529h.setLastKnownLocation(location);
            LastKnownLocationService.this.stopSelf();
        }
    }

    public IBinder onBind(Intent intent) {
        return null;
    }

    public void onCreate() {
        super.onCreate();
        this.f83514i = C7310h.m27978a(this);
    }

    public void onDestroy() {
        super.onDestroy();
    }

    public int onStartCommand(Intent intent, int i, int i2) {
        if (C32330r0.m95338m(this, "android.permission.ACCESS_FINE_LOCATION")) {
            this.f83514i.mo13979A().mo24864i(new C34561b()).mo24861f(new C34560a());
        } else {
            this.f83529h.setLastKnownLocation((Location) null);
            stopSelf();
        }
        return super.onStartCommand(intent, i, i2);
    }
}
