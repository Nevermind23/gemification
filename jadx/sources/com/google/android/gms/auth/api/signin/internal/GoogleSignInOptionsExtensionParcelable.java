package com.google.android.gms.auth.api.signin.internal;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import p195o6.C7461a;

public class GoogleSignInOptionsExtensionParcelable extends AbstractSafeParcelable {
    public static final Parcelable.Creator<GoogleSignInOptionsExtensionParcelable> CREATOR = new C3828a();

    /* renamed from: d */
    final int f12191d;

    /* renamed from: e */
    private int f12192e;

    /* renamed from: f */
    private Bundle f12193f;

    GoogleSignInOptionsExtensionParcelable(int i, int i2, Bundle bundle) {
        this.f12191d = i;
        this.f12192e = i2;
        this.f12193f = bundle;
    }

    /* renamed from: v */
    public int mo11805v() {
        return this.f12192e;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a = C7461a.m28369a(parcel);
        C7461a.m28383o(parcel, 1, this.f12191d);
        C7461a.m28383o(parcel, 2, mo11805v());
        C7461a.m28374f(parcel, 3, this.f12193f, false);
        C7461a.m28370b(parcel, a);
    }
}
