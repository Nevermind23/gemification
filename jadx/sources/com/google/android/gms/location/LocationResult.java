package com.google.android.gms.location;

import android.content.Intent;
import android.location.Location;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.ReflectedParcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import java.util.Collections;
import java.util.List;
import p182n6.C7258g;
import p195o6.C7461a;

public final class LocationResult extends AbstractSafeParcelable implements ReflectedParcelable {
    public static final Parcelable.Creator<LocationResult> CREATOR = new C4540n();

    /* renamed from: e */
    static final List f13926e = Collections.emptyList();

    /* renamed from: d */
    private final List f13927d;

    LocationResult(List list) {
        this.f13927d = list;
    }

    /* renamed from: R */
    public static boolean m17362R(Intent intent) {
        if (intent == null) {
            return false;
        }
        return intent.hasExtra("com.google.android.gms.location.EXTRA_LOCATION_RESULT");
    }

    /* renamed from: v */
    public static LocationResult m17363v(Intent intent) {
        if (!m17362R(intent)) {
            return null;
        }
        return (LocationResult) intent.getParcelableExtra("com.google.android.gms.location.EXTRA_LOCATION_RESULT");
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x0037  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean equals(java.lang.Object r9) {
        /*
            r8 = this;
            boolean r0 = r9 instanceof com.google.android.gms.location.LocationResult
            r1 = 0
            if (r0 == 0) goto L_0x008c
            com.google.android.gms.location.LocationResult r9 = (com.google.android.gms.location.LocationResult) r9
            int r0 = android.os.Build.VERSION.SDK_INT
            r2 = 31
            if (r0 < r2) goto L_0x0016
            java.util.List r0 = r8.f13927d
            java.util.List r9 = r9.f13927d
            boolean r9 = r0.equals(r9)
            return r9
        L_0x0016:
            java.util.List r0 = r8.f13927d
            int r0 = r0.size()
            java.util.List r2 = r9.f13927d
            int r2 = r2.size()
            if (r0 == r2) goto L_0x0025
            return r1
        L_0x0025:
            java.util.List r0 = r8.f13927d
            java.util.Iterator r0 = r0.iterator()
            java.util.List r9 = r9.f13927d
            java.util.Iterator r9 = r9.iterator()
        L_0x0031:
            boolean r2 = r0.hasNext()
            if (r2 == 0) goto L_0x008a
            java.lang.Object r2 = r0.next()
            android.location.Location r2 = (android.location.Location) r2
            java.lang.Object r3 = r9.next()
            android.location.Location r3 = (android.location.Location) r3
            double r4 = r2.getLatitude()
            double r6 = r3.getLatitude()
            int r4 = java.lang.Double.compare(r4, r6)
            if (r4 == 0) goto L_0x0052
            return r1
        L_0x0052:
            double r4 = r2.getLongitude()
            double r6 = r3.getLongitude()
            int r4 = java.lang.Double.compare(r4, r6)
            if (r4 == 0) goto L_0x0061
            return r1
        L_0x0061:
            long r4 = r2.getTime()
            long r6 = r3.getTime()
            int r4 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r4 == 0) goto L_0x006e
            return r1
        L_0x006e:
            long r4 = r2.getElapsedRealtimeNanos()
            long r6 = r3.getElapsedRealtimeNanos()
            int r4 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r4 == 0) goto L_0x007b
            return r1
        L_0x007b:
            java.lang.String r2 = r2.getProvider()
            java.lang.String r3 = r3.getProvider()
            boolean r2 = p182n6.C7258g.m27880a(r2, r3)
            if (r2 != 0) goto L_0x0031
            return r1
        L_0x008a:
            r9 = 1
            return r9
        L_0x008c:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.location.LocationResult.equals(java.lang.Object):boolean");
    }

    public int hashCode() {
        return C7258g.m27881b(this.f13927d);
    }

    public String toString() {
        return "LocationResult".concat(String.valueOf(this.f13927d));
    }

    /* renamed from: w */
    public Location mo13946w() {
        int size = this.f13927d.size();
        if (size == 0) {
            return null;
        }
        return (Location) this.f13927d.get(size - 1);
    }

    public void writeToParcel(Parcel parcel, int i) {
        int a = C7461a.m28369a(parcel);
        C7461a.m28364C(parcel, 1, mo13948x(), false);
        C7461a.m28370b(parcel, a);
    }

    /* renamed from: x */
    public List mo13948x() {
        return this.f13927d;
    }
}
