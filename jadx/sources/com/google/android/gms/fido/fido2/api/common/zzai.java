package com.google.android.gms.fido.fido2.api.common;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import java.util.Arrays;
import p182n6.C7258g;
import p182n6.C7264i;
import p195o6.C7461a;
import p324y6.C9071h;

public final class zzai extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzai> CREATOR = new C9071h();

    /* renamed from: d */
    private final byte[][] f12991d;

    public zzai(byte[][] bArr) {
        boolean z;
        boolean z2;
        boolean z3;
        boolean z4;
        boolean z5;
        if (bArr != null) {
            z = true;
        } else {
            z = false;
        }
        C7264i.m27892a(z);
        if (1 != ((bArr.length & 1) ^ 1)) {
            z2 = false;
        } else {
            z2 = true;
        }
        C7264i.m27892a(z2);
        for (int i = 0; i < bArr.length; i += 2) {
            if (i == 0 || bArr[i] != null) {
                z3 = true;
            } else {
                z3 = false;
            }
            C7264i.m27892a(z3);
            int i2 = i + 1;
            if (bArr[i2] != null) {
                z4 = true;
            } else {
                z4 = false;
            }
            C7264i.m27892a(z4);
            int length = bArr[i2].length;
            if (length == 32 || length == 64) {
                z5 = true;
            } else {
                z5 = false;
            }
            C7264i.m27892a(z5);
        }
        this.f12991d = bArr;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof zzai)) {
            return false;
        }
        return Arrays.deepEquals(this.f12991d, ((zzai) obj).f12991d);
    }

    public final int hashCode() {
        Object[] objArr = this.f12991d;
        int length = objArr.length;
        int i = 0;
        for (int i2 = 0; i2 < length; i2++) {
            i ^= C7258g.m27881b(objArr[i2]);
        }
        return i;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a = C7461a.m28369a(parcel);
        C7461a.m28377i(parcel, 1, this.f12991d, false);
        C7461a.m28370b(parcel, a);
    }
}
