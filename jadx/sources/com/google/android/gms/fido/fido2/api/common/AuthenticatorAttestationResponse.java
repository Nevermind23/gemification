package com.google.android.gms.fido.fido2.api.common;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;
import p105h7.C6447c0;
import p105h7.C6454g;
import p105h7.C6456h;
import p182n6.C7258g;
import p182n6.C7264i;
import p195o6.C7461a;

public class AuthenticatorAttestationResponse extends AuthenticatorResponse {
    public static final Parcelable.Creator<AuthenticatorAttestationResponse> CREATOR = new C4048q();

    /* renamed from: d */
    private final byte[] f12885d;

    /* renamed from: e */
    private final byte[] f12886e;

    /* renamed from: f */
    private final byte[] f12887f;

    /* renamed from: g */
    private final String[] f12888g;

    AuthenticatorAttestationResponse(byte[] bArr, byte[] bArr2, byte[] bArr3, String[] strArr) {
        this.f12885d = (byte[]) C7264i.m27902k(bArr);
        this.f12886e = (byte[]) C7264i.m27902k(bArr2);
        this.f12887f = (byte[]) C7264i.m27902k(bArr3);
        this.f12888g = (String[]) C7264i.m27902k(strArr);
    }

    /* renamed from: R */
    public String[] mo12446R() {
        return this.f12888g;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof AuthenticatorAttestationResponse)) {
            return false;
        }
        AuthenticatorAttestationResponse authenticatorAttestationResponse = (AuthenticatorAttestationResponse) obj;
        if (!Arrays.equals(this.f12885d, authenticatorAttestationResponse.f12885d) || !Arrays.equals(this.f12886e, authenticatorAttestationResponse.f12886e) || !Arrays.equals(this.f12887f, authenticatorAttestationResponse.f12887f)) {
            return false;
        }
        return true;
    }

    public int hashCode() {
        return C7258g.m27881b(Integer.valueOf(Arrays.hashCode(this.f12885d)), Integer.valueOf(Arrays.hashCode(this.f12886e)), Integer.valueOf(Arrays.hashCode(this.f12887f)));
    }

    public String toString() {
        C6454g a = C6456h.m25550a(this);
        C6447c0 c = C6447c0.m25540c();
        byte[] bArr = this.f12885d;
        a.mo20320b("keyHandle", c.mo20318d(bArr, 0, bArr.length));
        C6447c0 c2 = C6447c0.m25540c();
        byte[] bArr2 = this.f12886e;
        a.mo20320b("clientDataJSON", c2.mo20318d(bArr2, 0, bArr2.length));
        C6447c0 c3 = C6447c0.m25540c();
        byte[] bArr3 = this.f12887f;
        a.mo20320b("attestationObject", c3.mo20318d(bArr3, 0, bArr3.length));
        a.mo20320b("transports", Arrays.toString(this.f12888g));
        return a.toString();
    }

    /* renamed from: v */
    public byte[] mo12450v() {
        return this.f12887f;
    }

    /* renamed from: w */
    public byte[] mo12451w() {
        return this.f12886e;
    }

    public void writeToParcel(Parcel parcel, int i) {
        int a = C7461a.m28369a(parcel);
        C7461a.m28376h(parcel, 2, mo12453x(), false);
        C7461a.m28376h(parcel, 3, mo12451w(), false);
        C7461a.m28376h(parcel, 4, mo12450v(), false);
        C7461a.m28393y(parcel, 5, mo12446R(), false);
        C7461a.m28370b(parcel, a);
    }

    /* renamed from: x */
    public byte[] mo12453x() {
        return this.f12885d;
    }
}
