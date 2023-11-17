package com.google.android.gms.tapandpay.firstparty;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import p182n6.C7258g;
import p195o6.C7461a;

public final class zzaf extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzaf> CREATOR = new C4868a();

    /* renamed from: d */
    final int f15210d;

    /* renamed from: e */
    final int f15211e;

    zzaf(int i, int i2) {
        this.f15210d = i;
        this.f15211e = i2;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof zzaf) {
            zzaf zzaf = (zzaf) obj;
            if (this.f15210d == zzaf.f15210d && this.f15211e == zzaf.f15211e) {
                return true;
            }
            return false;
        }
        return false;
    }

    public final int hashCode() {
        return C7258g.m27881b(Integer.valueOf(this.f15210d), Integer.valueOf(this.f15211e));
    }

    public final String toString() {
        return C7258g.m27882c(this).mo21632a("cdcvmExpirtaionInSecs", Integer.valueOf(this.f15210d)).mo21632a("cdcvmTransactionLimit", Integer.valueOf(this.f15211e)).toString();
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a = C7461a.m28369a(parcel);
        C7461a.m28383o(parcel, 2, this.f15210d);
        C7461a.m28383o(parcel, 3, this.f15211e);
        C7461a.m28370b(parcel, a);
    }
}
