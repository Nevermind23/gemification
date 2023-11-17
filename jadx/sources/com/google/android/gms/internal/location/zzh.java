package com.google.android.gms.internal.location;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.location.zzw;
import java.util.Collections;
import java.util.List;
import p182n6.C7258g;
import p195o6.C7461a;

public final class zzh extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzh> CREATOR = new C4084l();

    /* renamed from: g */
    static final List f13126g = Collections.emptyList();

    /* renamed from: h */
    static final zzw f13127h = new zzw();

    /* renamed from: d */
    final zzw f13128d;

    /* renamed from: e */
    final List f13129e;

    /* renamed from: f */
    final String f13130f;

    zzh(zzw zzw, List list, String str) {
        this.f13128d = zzw;
        this.f13129e = list;
        this.f13130f = str;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof zzh)) {
            return false;
        }
        zzh zzh = (zzh) obj;
        if (!C7258g.m27880a(this.f13128d, zzh.f13128d) || !C7258g.m27880a(this.f13129e, zzh.f13129e) || !C7258g.m27880a(this.f13130f, zzh.f13130f)) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return this.f13128d.hashCode();
    }

    public final String toString() {
        String valueOf = String.valueOf(this.f13128d);
        String valueOf2 = String.valueOf(this.f13129e);
        String str = this.f13130f;
        int length = valueOf.length();
        StringBuilder sb = new StringBuilder(length + 77 + valueOf2.length() + String.valueOf(str).length());
        sb.append("DeviceOrientationRequestInternal{deviceOrientationRequest=");
        sb.append(valueOf);
        sb.append(", clients=");
        sb.append(valueOf2);
        sb.append(", tag='");
        sb.append(str);
        sb.append("'}");
        return sb.toString();
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a = C7461a.m28369a(parcel);
        C7461a.m28390v(parcel, 1, this.f13128d, i, false);
        C7461a.m28364C(parcel, 2, this.f13129e, false);
        C7461a.m28392x(parcel, 3, this.f13130f, false);
        C7461a.m28370b(parcel, a);
    }
}
