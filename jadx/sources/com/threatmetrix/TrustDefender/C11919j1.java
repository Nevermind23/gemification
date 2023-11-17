package com.threatmetrix.TrustDefender;

import android.location.Location;
import android.location.LocationListener;
import android.os.Bundle;
import com.salesforce.marketingcloud.messages.iam.C11651j;
import com.threatmetrix.TrustDefender.C11907h;

/* renamed from: com.threatmetrix.TrustDefender.j1 */
public class C11919j1 implements LocationListener {

    /* renamed from: b */
    private static final String f34867b = C11907h.m43615j(C11919j1.class);

    /* renamed from: a */
    private Location f34868a = null;

    /* renamed from: a */
    private boolean m43710a(Location location, Location location2) {
        if (location2 == null) {
            return true;
        }
        long time = location.getTime() - location2.getTime();
        boolean z = time > 120000;
        boolean z2 = time < -120000;
        boolean z3 = time > 0;
        if (z) {
            return true;
        }
        if (z2) {
            return false;
        }
        int accuracy = (int) (location.getAccuracy() - location2.getAccuracy());
        boolean z4 = accuracy > 0;
        boolean z5 = accuracy < 0;
        boolean z6 = accuracy > 200;
        boolean c = m43711c(location.getProvider(), location2.getProvider());
        if (z5) {
            return true;
        }
        return (z3 && !z4) || (z3 && !z6 && c);
    }

    /* renamed from: c */
    private boolean m43711c(String str, String str2) {
        return str == null ? str2 == null : str.equals(str2);
    }

    /* renamed from: b */
    public Location mo31960b() {
        if (this.f34868a != null) {
            return new Location(this.f34868a);
        }
        return null;
    }

    public void onLocationChanged(Location location) {
        if (location == null) {
            C11907h.m43607b(f34867b, "location is null, possibly provided by a mock location provider");
            return;
        }
        String str = f34867b;
        C11907h.m43607b(str, "olc");
        C11907h.C11908a.m43624b(str, "onLocationChanged() : " + location.getProvider() + ":" + location.getLatitude() + ":" + location.getLongitude() + ":" + location.getAccuracy());
        if (m43710a(location, this.f34868a)) {
            this.f34868a = location;
        }
    }

    public void onProviderDisabled(String str) {
        String str2 = f34867b;
        C11907h.C11908a.m43624b(str2, "onProviderDisabled: " + str);
    }

    public void onProviderEnabled(String str) {
        String str2 = f34867b;
        C11907h.C11908a.m43624b(str2, "onProviderEnabled: " + str);
    }

    public void onStatusChanged(String str, int i, Bundle bundle) {
        String str2 = f34867b;
        StringBuilder sb = new StringBuilder();
        sb.append("onStatusChanged: ");
        sb.append(str);
        sb.append(" status: ");
        sb.append(i == 2 ? "available " : i == 1 ? "temporarily unavailable" : i == 0 ? "Out of Service" : C11651j.f33767h);
        C11907h.C11908a.m43624b(str2, sb.toString());
    }
}
