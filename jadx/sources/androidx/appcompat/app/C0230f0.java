package androidx.appcompat.app;

import android.content.Context;
import android.location.Location;
import android.location.LocationManager;
import android.util.Log;
import androidx.core.content.C0787k;
import com.medallia.digital.mobilesdk.C10749b8;
import java.util.Calendar;

/* renamed from: androidx.appcompat.app.f0 */
class C0230f0 {

    /* renamed from: d */
    private static C0230f0 f1317d;

    /* renamed from: a */
    private final Context f1318a;

    /* renamed from: b */
    private final LocationManager f1319b;

    /* renamed from: c */
    private final C0231a f1320c = new C0231a();

    /* renamed from: androidx.appcompat.app.f0$a */
    private static class C0231a {

        /* renamed from: a */
        boolean f1321a;

        /* renamed from: b */
        long f1322b;

        C0231a() {
        }
    }

    C0230f0(Context context, LocationManager locationManager) {
        this.f1318a = context;
        this.f1319b = locationManager;
    }

    /* renamed from: a */
    static C0230f0 m718a(Context context) {
        if (f1317d == null) {
            Context applicationContext = context.getApplicationContext();
            f1317d = new C0230f0(applicationContext, (LocationManager) applicationContext.getSystemService("location"));
        }
        return f1317d;
    }

    /* renamed from: b */
    private Location m719b() {
        Location location;
        Location location2 = null;
        if (C0787k.m2943b(this.f1318a, "android.permission.ACCESS_COARSE_LOCATION") == 0) {
            location = m720c("network");
        } else {
            location = null;
        }
        if (C0787k.m2943b(this.f1318a, "android.permission.ACCESS_FINE_LOCATION") == 0) {
            location2 = m720c("gps");
        }
        if (location2 == null || location == null) {
            if (location2 != null) {
                return location2;
            }
            return location;
        } else if (location2.getTime() > location.getTime()) {
            return location2;
        } else {
            return location;
        }
    }

    /* renamed from: c */
    private Location m720c(String str) {
        try {
            if (this.f1319b.isProviderEnabled(str)) {
                return this.f1319b.getLastKnownLocation(str);
            }
            return null;
        } catch (Exception e) {
            Log.d("TwilightManager", "Failed to get last known location", e);
            return null;
        }
    }

    /* renamed from: e */
    private boolean m721e() {
        return this.f1320c.f1322b > System.currentTimeMillis();
    }

    /* renamed from: f */
    private void m722f(Location location) {
        long j;
        long j2;
        C0231a aVar = this.f1320c;
        long currentTimeMillis = System.currentTimeMillis();
        C0228e0 b = C0228e0.m716b();
        C0228e0 e0Var = b;
        e0Var.mo665a(currentTimeMillis - 86400000, location.getLatitude(), location.getLongitude());
        e0Var.mo665a(currentTimeMillis, location.getLatitude(), location.getLongitude());
        boolean z = true;
        if (b.f1315c != 1) {
            z = false;
        }
        boolean z2 = z;
        long j3 = b.f1314b;
        long j4 = b.f1313a;
        long j5 = j4;
        double latitude = location.getLatitude();
        long j6 = j3;
        b.mo665a(currentTimeMillis + 86400000, latitude, location.getLongitude());
        long j7 = b.f1314b;
        if (j6 == -1 || j5 == -1) {
            j = 43200000 + currentTimeMillis;
        } else {
            if (currentTimeMillis > j5) {
                j2 = j7 + 0;
            } else if (currentTimeMillis > j6) {
                j2 = j5 + 0;
            } else {
                j2 = j6 + 0;
            }
            j = j2 + C10749b8.C10751b.f30743b;
        }
        aVar.f1321a = z2;
        aVar.f1322b = j;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: d */
    public boolean mo667d() {
        C0231a aVar = this.f1320c;
        if (m721e()) {
            return aVar.f1321a;
        }
        Location b = m719b();
        if (b != null) {
            m722f(b);
            return aVar.f1321a;
        }
        Log.i("TwilightManager", "Could not get last known location. This is probably because the app does not have any location permissions. Falling back to hardcoded sunrise/sunset values.");
        int i = Calendar.getInstance().get(11);
        if (i < 6 || i >= 22) {
            return true;
        }
        return false;
    }
}
