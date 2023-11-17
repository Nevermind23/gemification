package com.google.android.gms.fido.fido2.api.common;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import p182n6.C7258g;
import p195o6.C7461a;

public class AuthenticationExtensionsClientOutputs extends AbstractSafeParcelable {
    public static final Parcelable.Creator<AuthenticationExtensionsClientOutputs> CREATOR = new C4045n();

    /* renamed from: d */
    private final UvmEntries f12875d;

    /* renamed from: e */
    private final zzf f12876e;

    /* renamed from: f */
    private final AuthenticationExtensionsCredPropsOutputs f12877f;

    /* renamed from: g */
    private final zzh f12878g;

    AuthenticationExtensionsClientOutputs(UvmEntries uvmEntries, zzf zzf, AuthenticationExtensionsCredPropsOutputs authenticationExtensionsCredPropsOutputs, zzh zzh) {
        this.f12875d = uvmEntries;
        this.f12876e = zzf;
        this.f12877f = authenticationExtensionsCredPropsOutputs;
        this.f12878g = zzh;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof AuthenticationExtensionsClientOutputs)) {
            return false;
        }
        AuthenticationExtensionsClientOutputs authenticationExtensionsClientOutputs = (AuthenticationExtensionsClientOutputs) obj;
        if (!C7258g.m27880a(this.f12875d, authenticationExtensionsClientOutputs.f12875d) || !C7258g.m27880a(this.f12876e, authenticationExtensionsClientOutputs.f12876e) || !C7258g.m27880a(this.f12877f, authenticationExtensionsClientOutputs.f12877f) || !C7258g.m27880a(this.f12878g, authenticationExtensionsClientOutputs.f12878g)) {
            return false;
        }
        return true;
    }

    public int hashCode() {
        return C7258g.m27881b(this.f12875d, this.f12876e, this.f12877f, this.f12878g);
    }

    /* renamed from: v */
    public AuthenticationExtensionsCredPropsOutputs mo12430v() {
        return this.f12877f;
    }

    /* renamed from: w */
    public UvmEntries mo12431w() {
        return this.f12875d;
    }

    public void writeToParcel(Parcel parcel, int i) {
        int a = C7461a.m28369a(parcel);
        C7461a.m28390v(parcel, 1, mo12431w(), i, false);
        C7461a.m28390v(parcel, 2, this.f12876e, i, false);
        C7461a.m28390v(parcel, 3, mo12430v(), i, false);
        C7461a.m28390v(parcel, 4, this.f12878g, i, false);
        C7461a.m28370b(parcel, a);
    }
}
