package com.google.android.gms.fido.fido2.api.common;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.fido.fido2.api.common.ErrorCode;
import p105h7.C6454g;
import p105h7.C6456h;
import p182n6.C7258g;
import p195o6.C7461a;

public class AuthenticatorErrorResponse extends AuthenticatorResponse {
    public static final Parcelable.Creator<AuthenticatorErrorResponse> CREATOR = new C4049r();

    /* renamed from: d */
    private final ErrorCode f12889d;

    /* renamed from: e */
    private final String f12890e;

    /* renamed from: f */
    private final int f12891f;

    AuthenticatorErrorResponse(int i, String str, int i2) {
        try {
            this.f12889d = ErrorCode.m15325b(i);
            this.f12890e = str;
            this.f12891f = i2;
        } catch (ErrorCode.UnsupportedErrorCodeException e) {
            throw new IllegalArgumentException(e);
        }
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof AuthenticatorErrorResponse)) {
            return false;
        }
        AuthenticatorErrorResponse authenticatorErrorResponse = (AuthenticatorErrorResponse) obj;
        if (!C7258g.m27880a(this.f12889d, authenticatorErrorResponse.f12889d) || !C7258g.m27880a(this.f12890e, authenticatorErrorResponse.f12890e) || !C7258g.m27880a(Integer.valueOf(this.f12891f), Integer.valueOf(authenticatorErrorResponse.f12891f))) {
            return false;
        }
        return true;
    }

    public int hashCode() {
        return C7258g.m27881b(this.f12889d, this.f12890e, Integer.valueOf(this.f12891f));
    }

    public String toString() {
        C6454g a = C6456h.m25550a(this);
        a.mo20319a("errorCode", this.f12889d.mo12483a());
        String str = this.f12890e;
        if (str != null) {
            a.mo20320b("errorMessage", str);
        }
        return a.toString();
    }

    /* renamed from: v */
    public int mo12457v() {
        return this.f12889d.mo12483a();
    }

    /* renamed from: w */
    public String mo12458w() {
        return this.f12890e;
    }

    public void writeToParcel(Parcel parcel, int i) {
        int a = C7461a.m28369a(parcel);
        C7461a.m28383o(parcel, 2, mo12457v());
        C7461a.m28392x(parcel, 3, mo12458w(), false);
        C7461a.m28383o(parcel, 4, this.f12891f);
        C7461a.m28370b(parcel, a);
    }
}
