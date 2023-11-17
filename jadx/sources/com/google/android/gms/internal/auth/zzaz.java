package com.google.android.gms.internal.auth;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import p182n6.C7264i;
import p195o6.C7461a;

public final class zzaz extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzaz> CREATOR = new C4070d();

    /* renamed from: d */
    final int f13078d = 1;

    /* renamed from: e */
    public final String f13079e;

    /* renamed from: f */
    public final byte[] f13080f;

    zzaz(int i, String str, byte[] bArr) {
        this.f13079e = (String) C7264i.m27902k(str);
        this.f13080f = (byte[]) C7264i.m27902k(bArr);
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a = C7461a.m28369a(parcel);
        C7461a.m28383o(parcel, 1, this.f13078d);
        C7461a.m28392x(parcel, 2, this.f13079e, false);
        C7461a.m28376h(parcel, 3, this.f13080f, false);
        C7461a.m28370b(parcel, a);
    }
}
