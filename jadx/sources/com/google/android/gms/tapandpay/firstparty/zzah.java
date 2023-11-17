package com.google.android.gms.tapandpay.firstparty;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import p182n6.C7258g;
import p195o6.C7461a;

public final class zzah extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzah> CREATOR = new C4869b();

    /* renamed from: d */
    final boolean f15212d;

    /* renamed from: e */
    final int f15213e;

    /* renamed from: f */
    final int f15214f;

    /* renamed from: g */
    final int f15215g;

    zzah(boolean z, int i, int i2, int i3) {
        this.f15212d = z;
        this.f15213e = i;
        this.f15214f = i2;
        this.f15215g = i3;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof zzah) {
            zzah zzah = (zzah) obj;
            if (this.f15212d == zzah.f15212d && this.f15213e == zzah.f15213e && this.f15215g == zzah.f15215g && this.f15214f == zzah.f15214f) {
                return true;
            }
            return false;
        }
        return false;
    }

    public final int hashCode() {
        return C7258g.m27881b(Boolean.valueOf(this.f15212d), Integer.valueOf(this.f15213e), Integer.valueOf(this.f15215g), Integer.valueOf(this.f15214f));
    }

    public final String toString() {
        return C7258g.m27882c(this).mo21632a("requireCdcvmPassing", Boolean.valueOf(this.f15212d)).mo21632a("cdcvmExpirtaionInSecs", Integer.valueOf(this.f15213e)).mo21632a("unlockedTapLimit", Integer.valueOf(this.f15214f)).mo21632a("cdcvmTapLimit", Integer.valueOf(this.f15215g)).toString();
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a = C7461a.m28369a(parcel);
        C7461a.m28372d(parcel, 2, this.f15212d);
        C7461a.m28383o(parcel, 3, this.f15213e);
        C7461a.m28383o(parcel, 4, this.f15214f);
        C7461a.m28383o(parcel, 5, this.f15215g);
        C7461a.m28370b(parcel, a);
    }
}
