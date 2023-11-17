package com.google.android.gms.internal.location;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.location.LocationRequest;
import java.util.Collections;
import java.util.List;
import p118i7.C6614y;
import p182n6.C7258g;
import p195o6.C7461a;

public final class zzbf extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzbf> CREATOR = new C4082j();

    /* renamed from: o */
    static final List f13098o = Collections.emptyList();

    /* renamed from: d */
    final LocationRequest f13099d;

    /* renamed from: e */
    final List f13100e;

    /* renamed from: f */
    final String f13101f;

    /* renamed from: g */
    final boolean f13102g;

    /* renamed from: h */
    final boolean f13103h;

    /* renamed from: i */
    final boolean f13104i;

    /* renamed from: j */
    final String f13105j;

    /* renamed from: k */
    final boolean f13106k;

    /* renamed from: l */
    boolean f13107l;

    /* renamed from: m */
    final String f13108m;

    /* renamed from: n */
    long f13109n;

    zzbf(LocationRequest locationRequest, List list, String str, boolean z, boolean z2, boolean z3, String str2, boolean z4, boolean z5, String str3, long j) {
        this.f13099d = locationRequest;
        this.f13100e = list;
        this.f13101f = str;
        this.f13102g = z;
        this.f13103h = z2;
        this.f13104i = z3;
        this.f13105j = str2;
        this.f13106k = z4;
        this.f13107l = z5;
        this.f13108m = str3;
        this.f13109n = j;
    }

    /* renamed from: v */
    public static zzbf m15462v(String str, LocationRequest locationRequest) {
        return new zzbf(locationRequest, C6614y.m25989v(), (String) null, false, false, false, (String) null, false, false, (String) null, Long.MAX_VALUE);
    }

    public final boolean equals(Object obj) {
        if (obj instanceof zzbf) {
            zzbf zzbf = (zzbf) obj;
            if (!C7258g.m27880a(this.f13099d, zzbf.f13099d) || !C7258g.m27880a(this.f13100e, zzbf.f13100e) || !C7258g.m27880a(this.f13101f, zzbf.f13101f) || this.f13102g != zzbf.f13102g || this.f13103h != zzbf.f13103h || this.f13104i != zzbf.f13104i || !C7258g.m27880a(this.f13105j, zzbf.f13105j) || this.f13106k != zzbf.f13106k || this.f13107l != zzbf.f13107l || !C7258g.m27880a(this.f13108m, zzbf.f13108m)) {
                return false;
            }
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return this.f13099d.hashCode();
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(this.f13099d);
        if (this.f13101f != null) {
            sb.append(" tag=");
            sb.append(this.f13101f);
        }
        if (this.f13105j != null) {
            sb.append(" moduleId=");
            sb.append(this.f13105j);
        }
        if (this.f13108m != null) {
            sb.append(" contextAttributionTag=");
            sb.append(this.f13108m);
        }
        sb.append(" hideAppOps=");
        sb.append(this.f13102g);
        sb.append(" clients=");
        sb.append(this.f13100e);
        sb.append(" forceCoarseLocation=");
        sb.append(this.f13103h);
        if (this.f13104i) {
            sb.append(" exemptFromBackgroundThrottle");
        }
        if (this.f13106k) {
            sb.append(" locationSettingsIgnored");
        }
        if (this.f13107l) {
            sb.append(" inaccurateLocationsDelayed");
        }
        return sb.toString();
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a = C7461a.m28369a(parcel);
        C7461a.m28390v(parcel, 1, this.f13099d, i, false);
        C7461a.m28364C(parcel, 5, this.f13100e, false);
        C7461a.m28392x(parcel, 6, this.f13101f, false);
        C7461a.m28372d(parcel, 7, this.f13102g);
        C7461a.m28372d(parcel, 8, this.f13103h);
        C7461a.m28372d(parcel, 9, this.f13104i);
        C7461a.m28392x(parcel, 10, this.f13105j, false);
        C7461a.m28372d(parcel, 11, this.f13106k);
        C7461a.m28372d(parcel, 12, this.f13107l);
        C7461a.m28392x(parcel, 13, this.f13108m, false);
        C7461a.m28387s(parcel, 14, this.f13109n);
        C7461a.m28370b(parcel, a);
    }
}
