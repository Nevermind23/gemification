package com.google.android.gms.fido.fido2.api.common;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import java.util.Arrays;
import p182n6.C7258g;
import p195o6.C7461a;
import p324y6.C9078o;

public final class zzf extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzf> CREATOR = new C9078o();

    /* renamed from: d */
    private final byte[] f12997d;

    /* renamed from: e */
    private final byte[] f12998e;

    public zzf(byte[] bArr, byte[] bArr2) {
        this.f12997d = bArr;
        this.f12998e = bArr2;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof zzf)) {
            return false;
        }
        zzf zzf = (zzf) obj;
        if (!Arrays.equals(this.f12997d, zzf.f12997d) || !Arrays.equals(this.f12998e, zzf.f12998e)) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return C7258g.m27881b(this.f12997d, this.f12998e);
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a = C7461a.m28369a(parcel);
        C7461a.m28376h(parcel, 1, this.f12997d, false);
        C7461a.m28376h(parcel, 2, this.f12998e, false);
        C7461a.m28370b(parcel, a);
    }
}
