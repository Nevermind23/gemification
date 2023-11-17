package com.google.android.gms.fido.fido2.api.common;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import p182n6.C7258g;
import p182n6.C7264i;
import p195o6.C7461a;
import p324y6.C9070g;

public final class zzag extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzag> CREATOR = new C9070g();

    /* renamed from: d */
    private final String f12990d;

    public zzag(String str) {
        this.f12990d = (String) C7264i.m27902k(str);
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof zzag)) {
            return false;
        }
        return this.f12990d.equals(((zzag) obj).f12990d);
    }

    public final int hashCode() {
        return C7258g.m27881b(this.f12990d);
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a = C7461a.m28369a(parcel);
        C7461a.m28392x(parcel, 1, this.f12990d, false);
        C7461a.m28370b(parcel, a);
    }
}
