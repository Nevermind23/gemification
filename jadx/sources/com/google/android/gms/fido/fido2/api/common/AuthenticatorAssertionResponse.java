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

public class AuthenticatorAssertionResponse extends AuthenticatorResponse {
    public static final Parcelable.Creator<AuthenticatorAssertionResponse> CREATOR = new C4047p();

    /* renamed from: d */
    private final byte[] f12880d;

    /* renamed from: e */
    private final byte[] f12881e;

    /* renamed from: f */
    private final byte[] f12882f;

    /* renamed from: g */
    private final byte[] f12883g;

    /* renamed from: h */
    private final byte[] f12884h;

    AuthenticatorAssertionResponse(byte[] bArr, byte[] bArr2, byte[] bArr3, byte[] bArr4, byte[] bArr5) {
        this.f12880d = (byte[]) C7264i.m27902k(bArr);
        this.f12881e = (byte[]) C7264i.m27902k(bArr2);
        this.f12882f = (byte[]) C7264i.m27902k(bArr3);
        this.f12883g = (byte[]) C7264i.m27902k(bArr4);
        this.f12884h = bArr5;
    }

    /* renamed from: R */
    public byte[] mo12437R() {
        return this.f12883g;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof AuthenticatorAssertionResponse)) {
            return false;
        }
        AuthenticatorAssertionResponse authenticatorAssertionResponse = (AuthenticatorAssertionResponse) obj;
        if (!Arrays.equals(this.f12880d, authenticatorAssertionResponse.f12880d) || !Arrays.equals(this.f12881e, authenticatorAssertionResponse.f12881e) || !Arrays.equals(this.f12882f, authenticatorAssertionResponse.f12882f) || !Arrays.equals(this.f12883g, authenticatorAssertionResponse.f12883g) || !Arrays.equals(this.f12884h, authenticatorAssertionResponse.f12884h)) {
            return false;
        }
        return true;
    }

    /* renamed from: f0 */
    public byte[] mo12439f0() {
        return this.f12884h;
    }

    public int hashCode() {
        return C7258g.m27881b(Integer.valueOf(Arrays.hashCode(this.f12880d)), Integer.valueOf(Arrays.hashCode(this.f12881e)), Integer.valueOf(Arrays.hashCode(this.f12882f)), Integer.valueOf(Arrays.hashCode(this.f12883g)), Integer.valueOf(Arrays.hashCode(this.f12884h)));
    }

    public String toString() {
        C6454g a = C6456h.m25550a(this);
        C6447c0 c = C6447c0.m25540c();
        byte[] bArr = this.f12880d;
        a.mo20320b("keyHandle", c.mo20318d(bArr, 0, bArr.length));
        C6447c0 c2 = C6447c0.m25540c();
        byte[] bArr2 = this.f12881e;
        a.mo20320b("clientDataJSON", c2.mo20318d(bArr2, 0, bArr2.length));
        C6447c0 c3 = C6447c0.m25540c();
        byte[] bArr3 = this.f12882f;
        a.mo20320b("authenticatorData", c3.mo20318d(bArr3, 0, bArr3.length));
        C6447c0 c4 = C6447c0.m25540c();
        byte[] bArr4 = this.f12883g;
        a.mo20320b("signature", c4.mo20318d(bArr4, 0, bArr4.length));
        byte[] bArr5 = this.f12884h;
        if (bArr5 != null) {
            a.mo20320b("userHandle", C6447c0.m25540c().mo20318d(bArr5, 0, bArr5.length));
        }
        return a.toString();
    }

    /* renamed from: v */
    public byte[] mo12442v() {
        return this.f12882f;
    }

    /* renamed from: w */
    public byte[] mo12443w() {
        return this.f12881e;
    }

    public void writeToParcel(Parcel parcel, int i) {
        int a = C7461a.m28369a(parcel);
        C7461a.m28376h(parcel, 2, mo12445x(), false);
        C7461a.m28376h(parcel, 3, mo12443w(), false);
        C7461a.m28376h(parcel, 4, mo12442v(), false);
        C7461a.m28376h(parcel, 5, mo12437R(), false);
        C7461a.m28376h(parcel, 6, mo12439f0(), false);
        C7461a.m28370b(parcel, a);
    }

    /* renamed from: x */
    public byte[] mo12445x() {
        return this.f12880d;
    }
}
