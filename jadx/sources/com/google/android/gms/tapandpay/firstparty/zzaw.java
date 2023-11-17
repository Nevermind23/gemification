package com.google.android.gms.tapandpay.firstparty;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import p182n6.C7258g;
import p195o6.C7461a;

public final class zzaw extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzaw> CREATOR = new C4873f();

    /* renamed from: d */
    final String f15259d;

    /* renamed from: e */
    final int f15260e;

    zzaw(String str, int i) {
        this.f15259d = str;
        this.f15260e = i;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof zzaw) {
            zzaw zzaw = (zzaw) obj;
            if (!C7258g.m27880a(this.f15259d, zzaw.f15259d) || this.f15260e != zzaw.f15260e) {
                return false;
            }
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return C7258g.m27881b(this.f15259d, Integer.valueOf(this.f15260e));
    }

    public final String toString() {
        return C7258g.m27882c(this).mo21632a("tokenReferenceId", this.f15259d).mo21632a("tokenProvider", Integer.valueOf(this.f15260e)).toString();
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a = C7461a.m28369a(parcel);
        C7461a.m28392x(parcel, 2, this.f15259d, false);
        C7461a.m28383o(parcel, 3, this.f15260e);
        C7461a.m28370b(parcel, a);
    }
}
