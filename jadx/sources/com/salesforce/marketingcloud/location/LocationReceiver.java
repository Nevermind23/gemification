package com.salesforce.marketingcloud.location;

import android.annotation.SuppressLint;
import android.app.PendingIntent;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.location.Location;
import com.google.android.gms.location.LocationResult;
import com.salesforce.marketingcloud.C11461g;
import com.salesforce.marketingcloud.MarketingCloudSdk;
import com.salesforce.marketingcloud.util.C11819h;
import com.salesforce.marketingcloud.util.C11824l;
import java.util.ArrayList;
import java.util.List;
import p183n7.C7297b;
import p183n7.C7300c;
import p183n7.C7306f;
import p189o0.C7357a;

@SuppressLint({"UnknownNullness"})
public class LocationReceiver extends BroadcastReceiver {

    /* renamed from: a */
    private static final String f33482a = "com.salesforce.marketingcloud.LOCATION_UPDATE";

    /* renamed from: b */
    private static final String f33483b = "com.salesforce.marketingcloud.GEOFENCE_TRIGGERED";

    /* renamed from: c */
    private static final String f33484c = C11461g.m41875a("LocationReceiver");

    /* renamed from: a */
    private static int m42130a(int i) {
        if (i == 1) {
            return 1;
        }
        int i2 = 2;
        if (i != 2) {
            i2 = 4;
            if (i != 4) {
                C11461g.m41891d(f33484c, "Unknown geofence transition %d", Integer.valueOf(i));
                return -1;
            }
        }
        return i2;
    }

    /* renamed from: b */
    static PendingIntent m42134b(Context context) {
        return PendingIntent.getBroadcast(context, 1, new Intent(context, LocationReceiver.class).setAction(f33483b), C11824l.m43291b(134217728));
    }

    /* renamed from: c */
    static PendingIntent m42135c(Context context) {
        return PendingIntent.getBroadcast(context, 0, new Intent(context, LocationReceiver.class).setAction(f33482a), C11824l.m43291b(134217728));
    }

    public void onReceive(Context context, Intent intent) {
        if (intent != null && intent.getAction() != null) {
            String str = f33484c;
            C11461g.m41891d(str, "onReceive - %s", intent.getAction());
            if (!C11824l.m43288a(500, 50) || MarketingCloudSdk.getInstance() == null) {
                C11461g.m41894e(str, "MarketingCloudSdk#init must be called in your application's onCreate", new Object[0]);
                return;
            }
            String action = intent.getAction();
            action.hashCode();
            if (action.equals(f33483b)) {
                m42132a(context, C7306f.m27970a(intent));
            } else if (action.equals(f33482a)) {
                m42131a(context, LocationResult.m17363v(intent));
            }
        }
    }

    /* renamed from: a */
    private static void m42131a(Context context, LocationResult locationResult) {
        if (locationResult == null) {
            C11461g.m41891d(f33484c, "LocationResult was null.", new Object[0]);
            return;
        }
        Location w = locationResult.mo13946w();
        if (w == null) {
            C11461g.m41891d(f33484c, "LastLocation was null.", new Object[0]);
        } else {
            C7357a.m28044b(context).mo21731d(C11548f.m42169a(w));
        }
    }

    /* renamed from: a */
    private static void m42132a(Context context, C7306f fVar) {
        C7357a b;
        Intent a;
        if (fVar == null) {
            C11461g.m41891d(f33484c, "Geofencing event was null.", new Object[0]);
            return;
        }
        if (fVar.mo21690f()) {
            String a2 = C7300c.m27965a(fVar.mo21686b());
            C11461g.m41880a(f33484c, "Geofencing event contained error: %s", a2);
            b = C7357a.m28044b(context);
            a = C11548f.m42167a(fVar.mo21686b(), a2);
        } else if (fVar.mo21688d() == null || fVar.mo21688d().isEmpty()) {
            C11461g.m41880a(f33484c, "GeofencingEvent without triggering geofences.", new Object[0]);
            return;
        } else {
            int c = fVar.mo21687c();
            C11461g.m41891d(f33484c, "Geofencing event transition: %d", Integer.valueOf(c));
            ArrayList arrayList = new ArrayList();
            for (C7297b bVar : fVar.mo21688d()) {
                C11461g.m41891d(f33484c, "Triggered fence id: %s", bVar.mo12826k());
                arrayList.add(bVar.mo12826k());
            }
            b = C7357a.m28044b(context);
            a = C11548f.m42168a(m42130a(c), (List<String>) arrayList, fVar.mo21689e());
        }
        b.mo21731d(a);
    }

    /* renamed from: a */
    static boolean m42133a(Context context) {
        return C11819h.m43267a(context.getPackageManager(), new Intent(context, LocationReceiver.class));
    }
}
