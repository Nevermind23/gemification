package com.google.android.gms.tapandpay.firstparty;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import p182n6.C7258g;
import p195o6.C7461a;

public final class zzg extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzg> CREATOR = new C4879l();

    /* renamed from: d */
    private boolean f15276d;

    /* renamed from: e */
    private boolean f15277e;

    private zzg() {
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof zzg) {
            zzg zzg = (zzg) obj;
            if (!C7258g.m27880a(Boolean.valueOf(this.f15276d), Boolean.valueOf(zzg.f15276d)) || !C7258g.m27880a(Boolean.valueOf(this.f15277e), Boolean.valueOf(zzg.f15277e))) {
                return false;
            }
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return C7258g.m27881b(Boolean.valueOf(this.f15276d), Boolean.valueOf(this.f15277e));
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a = C7461a.m28369a(parcel);
        C7461a.m28372d(parcel, 1, this.f15276d);
        C7461a.m28372d(parcel, 2, this.f15277e);
        C7461a.m28370b(parcel, a);
    }

    zzg(boolean z, boolean z2) {
        this.f15276d = z;
        this.f15277e = z2;
    }
}
