package com.google.android.gms.tapandpay.firstparty;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import java.util.Arrays;
import p182n6.C7258g;
import p195o6.C7461a;

public final class zzb extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzb> CREATOR = new C4876i();

    /* renamed from: d */
    final String f15265d;

    /* renamed from: e */
    final byte[] f15266e;

    /* renamed from: f */
    final int f15267f;

    /* renamed from: g */
    final TokenStatus f15268g;

    /* renamed from: h */
    final String f15269h;

    /* renamed from: i */
    final zzaz f15270i;

    zzb(String str, byte[] bArr, int i, TokenStatus tokenStatus, String str2, zzaz zzaz) {
        this.f15265d = str;
        this.f15266e = bArr;
        this.f15267f = i;
        this.f15268g = tokenStatus;
        this.f15269h = str2;
        this.f15270i = zzaz;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof zzb) {
            zzb zzb = (zzb) obj;
            if (this.f15267f != zzb.f15267f || !C7258g.m27880a(this.f15265d, zzb.f15265d) || !Arrays.equals(this.f15266e, zzb.f15266e) || !C7258g.m27880a(this.f15268g, zzb.f15268g) || !C7258g.m27880a(this.f15269h, zzb.f15269h) || !C7258g.m27880a(this.f15270i, zzb.f15270i)) {
                return false;
            }
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return C7258g.m27881b(this.f15265d, this.f15266e, Integer.valueOf(this.f15267f), this.f15268g, this.f15269h, this.f15270i);
    }

    public final String toString() {
        String str;
        C7258g.C7259a a = C7258g.m27882c(this).mo21632a("clientTokenId", this.f15265d);
        byte[] bArr = this.f15266e;
        if (bArr == null) {
            str = null;
        } else {
            str = Arrays.toString(bArr);
        }
        return a.mo21632a("serverToken", str).mo21632a("cardNetwork", Integer.valueOf(this.f15267f)).mo21632a("tokenStatus", this.f15268g).mo21632a("tokenLastDigits", this.f15269h).mo21632a("transactionInfo", this.f15270i).toString();
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a = C7461a.m28369a(parcel);
        C7461a.m28392x(parcel, 1, this.f15265d, false);
        C7461a.m28376h(parcel, 2, this.f15266e, false);
        C7461a.m28383o(parcel, 3, this.f15267f);
        C7461a.m28390v(parcel, 4, this.f15268g, i, false);
        C7461a.m28392x(parcel, 5, this.f15269h, false);
        C7461a.m28390v(parcel, 6, this.f15270i, i, false);
        C7461a.m28370b(parcel, a);
    }
}
