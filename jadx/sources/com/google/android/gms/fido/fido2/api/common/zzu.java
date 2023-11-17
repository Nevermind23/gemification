package com.google.android.gms.fido.fido2.api.common;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import p182n6.C7258g;
import p182n6.C7264i;
import p195o6.C7461a;
import p324y6.C9081r;

public final class zzu extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzu> CREATOR = new C9081r();

    /* renamed from: d */
    private final boolean f13006d;

    public zzu(boolean z) {
        this.f13006d = ((Boolean) C7264i.m27902k(Boolean.valueOf(z))).booleanValue();
    }

    public final boolean equals(Object obj) {
        if ((obj instanceof zzu) && this.f13006d == ((zzu) obj).f13006d) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return C7258g.m27881b(Boolean.valueOf(this.f13006d));
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a = C7461a.m28369a(parcel);
        C7461a.m28372d(parcel, 1, this.f13006d);
        C7461a.m28370b(parcel, a);
    }
}
