package com.google.android.gms.fido.fido2.api.common;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import java.util.Arrays;
import p182n6.C7258g;
import p195o6.C7461a;
import p324y6.C9079p;

public final class zzh extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzh> CREATOR = new C9079p();

    /* renamed from: d */
    private final boolean f12999d;

    /* renamed from: e */
    private final byte[] f13000e;

    public zzh(boolean z, byte[] bArr) {
        this.f12999d = z;
        this.f13000e = bArr;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof zzh)) {
            return false;
        }
        zzh zzh = (zzh) obj;
        if (this.f12999d != zzh.f12999d || !Arrays.equals(this.f13000e, zzh.f13000e)) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return C7258g.m27881b(Boolean.valueOf(this.f12999d), this.f13000e);
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a = C7461a.m28369a(parcel);
        C7461a.m28372d(parcel, 1, this.f12999d);
        C7461a.m28376h(parcel, 2, this.f13000e, false);
        C7461a.m28370b(parcel, a);
    }
}
