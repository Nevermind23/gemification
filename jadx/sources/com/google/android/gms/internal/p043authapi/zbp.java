package com.google.android.gms.internal.p043authapi;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.auth.api.credentials.Credential;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import p038c7.C2275g;
import p195o6.C7461a;

/* renamed from: com.google.android.gms.internal.auth-api.zbp */
public final class zbp extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zbp> CREATOR = new C2275g();

    /* renamed from: d */
    private final Credential f13069d;

    public zbp(Credential credential) {
        this.f13069d = credential;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a = C7461a.m28369a(parcel);
        C7461a.m28390v(parcel, 1, this.f13069d, i, false);
        C7461a.m28370b(parcel, a);
    }
}
