package com.google.android.gms.fido.fido2.api.common;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import java.util.Arrays;
import p182n6.C7258g;
import p182n6.C7264i;
import p195o6.C7461a;

public final class zzq extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzq> CREATOR = new C4054w();

    /* renamed from: d */
    private final long f13001d;

    /* renamed from: e */
    private final byte[] f13002e;

    /* renamed from: f */
    private final byte[] f13003f;

    /* renamed from: g */
    private final byte[] f13004g;

    zzq(long j, byte[] bArr, byte[] bArr2, byte[] bArr3) {
        this.f13001d = j;
        this.f13002e = (byte[]) C7264i.m27902k(bArr);
        this.f13003f = (byte[]) C7264i.m27902k(bArr2);
        this.f13004g = (byte[]) C7264i.m27902k(bArr3);
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof zzq)) {
            return false;
        }
        zzq zzq = (zzq) obj;
        if (this.f13001d != zzq.f13001d || !Arrays.equals(this.f13002e, zzq.f13002e) || !Arrays.equals(this.f13003f, zzq.f13003f) || !Arrays.equals(this.f13004g, zzq.f13004g)) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return C7258g.m27881b(Long.valueOf(this.f13001d), this.f13002e, this.f13003f, this.f13004g);
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a = C7461a.m28369a(parcel);
        C7461a.m28387s(parcel, 1, this.f13001d);
        C7461a.m28376h(parcel, 2, this.f13002e, false);
        C7461a.m28376h(parcel, 3, this.f13003f, false);
        C7461a.m28376h(parcel, 4, this.f13004g, false);
        C7461a.m28370b(parcel, a);
    }
}
