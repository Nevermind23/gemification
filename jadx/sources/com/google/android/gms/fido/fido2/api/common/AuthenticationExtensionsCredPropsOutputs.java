package com.google.android.gms.fido.fido2.api.common;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import p182n6.C7258g;
import p195o6.C7461a;
import p324y6.C9077n;

public class AuthenticationExtensionsCredPropsOutputs extends AbstractSafeParcelable {
    public static final Parcelable.Creator<AuthenticationExtensionsCredPropsOutputs> CREATOR = new C9077n();

    /* renamed from: d */
    private final boolean f12879d;

    public AuthenticationExtensionsCredPropsOutputs(boolean z) {
        this.f12879d = z;
    }

    public boolean equals(Object obj) {
        if ((obj instanceof AuthenticationExtensionsCredPropsOutputs) && this.f12879d == ((AuthenticationExtensionsCredPropsOutputs) obj).f12879d) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        return C7258g.m27881b(Boolean.valueOf(this.f12879d));
    }

    /* renamed from: v */
    public boolean mo12435v() {
        return this.f12879d;
    }

    public void writeToParcel(Parcel parcel, int i) {
        int a = C7461a.m28369a(parcel);
        C7461a.m28372d(parcel, 1, mo12435v());
        C7461a.m28370b(parcel, a);
    }
}
