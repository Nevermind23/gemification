package com.google.android.gms.tapandpay.firstparty;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import p182n6.C7258g;
import p195o6.C7461a;

public final class zzv extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzv> CREATOR = new C4880m();

    /* renamed from: d */
    private boolean f15289d;

    private zzv() {
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof zzv) {
            return C7258g.m27880a(Boolean.valueOf(this.f15289d), Boolean.valueOf(((zzv) obj).f15289d));
        }
        return false;
    }

    public final int hashCode() {
        return C7258g.m27881b(Boolean.valueOf(this.f15289d));
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a = C7461a.m28369a(parcel);
        C7461a.m28372d(parcel, 1, this.f15289d);
        C7461a.m28370b(parcel, a);
    }

    zzv(boolean z) {
        this.f15289d = z;
    }
}
