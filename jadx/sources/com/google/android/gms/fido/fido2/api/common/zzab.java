package com.google.android.gms.fido.fido2.api.common;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import p182n6.C7258g;
import p182n6.C7264i;
import p195o6.C7461a;
import p324y6.C9067d;

public final class zzab extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzab> CREATOR = new C9067d();

    /* renamed from: d */
    private final long f12988d;

    public zzab(long j) {
        this.f12988d = ((Long) C7264i.m27902k(Long.valueOf(j))).longValue();
    }

    public final boolean equals(Object obj) {
        if ((obj instanceof zzab) && this.f12988d == ((zzab) obj).f12988d) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return C7258g.m27881b(Long.valueOf(this.f12988d));
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a = C7461a.m28369a(parcel);
        C7461a.m28387s(parcel, 1, this.f12988d);
        C7461a.m28370b(parcel, a);
    }
}
