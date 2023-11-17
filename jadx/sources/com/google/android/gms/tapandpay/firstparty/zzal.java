package com.google.android.gms.tapandpay.firstparty;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import p182n6.C7258g;
import p195o6.C7461a;
import p325y7.C9087e;

public final class zzal extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzal> CREATOR = new C9087e();

    /* renamed from: d */
    final boolean f15238d;

    /* renamed from: e */
    final boolean f15239e;

    /* renamed from: f */
    final boolean f15240f;

    /* renamed from: g */
    final int f15241g;

    public zzal(boolean z, boolean z2, boolean z3, int i) {
        this.f15238d = z;
        this.f15239e = z2;
        this.f15240f = z3;
        this.f15241g = i;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof zzal) {
            zzal zzal = (zzal) obj;
            if (this.f15238d == zzal.f15238d && this.f15239e == zzal.f15239e && this.f15240f == zzal.f15240f && this.f15241g == zzal.f15241g) {
                return true;
            }
            return false;
        }
        return false;
    }

    public final int hashCode() {
        return C7258g.m27881b(Boolean.valueOf(this.f15238d), Boolean.valueOf(this.f15239e), Boolean.valueOf(this.f15240f), Integer.valueOf(this.f15241g));
    }

    public final String toString() {
        return C7258g.m27882c(this).mo21632a("transactions", Boolean.valueOf(this.f15238d)).mo21632a("plasticTransactions", Boolean.valueOf(this.f15239e)).mo21632a("promotions", Boolean.valueOf(this.f15240f)).mo21632a("bitMask", Integer.valueOf(this.f15241g)).toString();
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a = C7461a.m28369a(parcel);
        C7461a.m28372d(parcel, 1, this.f15238d);
        C7461a.m28372d(parcel, 2, this.f15239e);
        C7461a.m28372d(parcel, 3, this.f15240f);
        C7461a.m28383o(parcel, 4, this.f15241g);
        C7461a.m28370b(parcel, a);
    }
}
