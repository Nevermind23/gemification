package com.google.android.gms.tapandpay.firstparty;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.ReflectedParcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import p182n6.C7258g;
import p195o6.C7461a;

public final class TokenStatus extends AbstractSafeParcelable implements ReflectedParcelable {
    public static final Parcelable.Creator<TokenStatus> CREATOR = new C4874g();

    /* renamed from: d */
    zzaw f15203d;

    /* renamed from: e */
    int f15204e;

    /* renamed from: f */
    boolean f15205f;

    TokenStatus(zzaw zzaw, int i, boolean z) {
        this.f15203d = zzaw;
        this.f15204e = i;
        this.f15205f = z;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof TokenStatus) {
            TokenStatus tokenStatus = (TokenStatus) obj;
            if (C7258g.m27880a(this.f15203d, tokenStatus.f15203d) && this.f15204e == tokenStatus.f15204e && this.f15205f == tokenStatus.f15205f) {
                return true;
            }
            return false;
        }
        return false;
    }

    public final int hashCode() {
        return C7258g.m27881b(this.f15203d, Integer.valueOf(this.f15204e), Boolean.valueOf(this.f15205f));
    }

    public final String toString() {
        return C7258g.m27882c(this).mo21632a("tokenReference", this.f15203d).mo21632a("tokenState", Integer.valueOf(this.f15204e)).mo21632a("isSelected", Boolean.valueOf(this.f15205f)).toString();
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a = C7461a.m28369a(parcel);
        C7461a.m28390v(parcel, 2, this.f15203d, i, false);
        C7461a.m28383o(parcel, 3, this.f15204e);
        C7461a.m28372d(parcel, 4, this.f15205f);
        C7461a.m28370b(parcel, a);
    }
}
