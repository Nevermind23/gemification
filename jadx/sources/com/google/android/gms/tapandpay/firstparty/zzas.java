package com.google.android.gms.tapandpay.firstparty;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import java.math.BigDecimal;
import p182n6.C7258g;
import p195o6.C7461a;
import p325y7.C9090h;

public final class zzas extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzas> CREATOR = new C9090h();

    /* renamed from: d */
    final long f15244d;

    /* renamed from: e */
    final BigDecimal f15245e;

    /* renamed from: f */
    final String f15246f;

    /* renamed from: g */
    final long f15247g;

    /* renamed from: h */
    final int f15248h;

    public zzas(long j, BigDecimal bigDecimal, String str, long j2, int i) {
        this.f15244d = j;
        this.f15245e = bigDecimal;
        this.f15246f = str;
        this.f15247g = j2;
        this.f15248h = i;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof zzas) {
            zzas zzas = (zzas) obj;
            if (this.f15244d == zzas.f15244d && C7258g.m27880a(this.f15245e, zzas.f15245e) && C7258g.m27880a(this.f15246f, zzas.f15246f) && this.f15247g == zzas.f15247g && this.f15248h == zzas.f15248h) {
                return true;
            }
            return false;
        }
        return false;
    }

    public final int hashCode() {
        return C7258g.m27881b(Long.valueOf(this.f15244d), this.f15245e, this.f15246f, Long.valueOf(this.f15247g), Integer.valueOf(this.f15248h));
    }

    public final String toString() {
        return C7258g.m27882c(this).mo21632a("transactionId", Long.valueOf(this.f15244d)).mo21632a("amount", this.f15245e).mo21632a("currency", this.f15246f).mo21632a("transactionTimeMillis", Long.valueOf(this.f15247g)).mo21632a("type", Integer.valueOf(this.f15248h)).toString();
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a = C7461a.m28369a(parcel);
        C7461a.m28387s(parcel, 1, this.f15244d);
        C7461a.m28371c(parcel, 2, this.f15245e, false);
        C7461a.m28392x(parcel, 3, this.f15246f, false);
        C7461a.m28387s(parcel, 4, this.f15247g);
        C7461a.m28383o(parcel, 5, this.f15248h);
        C7461a.m28370b(parcel, a);
    }
}
