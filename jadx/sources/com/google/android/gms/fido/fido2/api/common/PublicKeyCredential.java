package com.google.android.gms.fido.fido2.api.common;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import java.util.Arrays;
import p182n6.C7258g;
import p182n6.C7264i;
import p195o6.C7461a;

public class PublicKeyCredential extends AbstractSafeParcelable {
    public static final Parcelable.Creator<PublicKeyCredential> CREATOR = new C4035d();

    /* renamed from: d */
    private final String f12925d;

    /* renamed from: e */
    private final String f12926e;

    /* renamed from: f */
    private final byte[] f12927f;

    /* renamed from: g */
    private final AuthenticatorAttestationResponse f12928g;

    /* renamed from: h */
    private final AuthenticatorAssertionResponse f12929h;

    /* renamed from: i */
    private final AuthenticatorErrorResponse f12930i;

    /* renamed from: j */
    private final AuthenticationExtensionsClientOutputs f12931j;

    /* renamed from: k */
    private final String f12932k;

    PublicKeyCredential(String str, String str2, byte[] bArr, AuthenticatorAttestationResponse authenticatorAttestationResponse, AuthenticatorAssertionResponse authenticatorAssertionResponse, AuthenticatorErrorResponse authenticatorErrorResponse, AuthenticationExtensionsClientOutputs authenticationExtensionsClientOutputs, String str3) {
        boolean z = true;
        if (!((authenticatorAttestationResponse != null && authenticatorAssertionResponse == null && authenticatorErrorResponse == null) || ((authenticatorAttestationResponse == null && authenticatorAssertionResponse != null && authenticatorErrorResponse == null) || (authenticatorAttestationResponse == null && authenticatorAssertionResponse == null && authenticatorErrorResponse != null)))) {
            z = false;
        }
        C7264i.m27892a(z);
        this.f12925d = str;
        this.f12926e = str2;
        this.f12927f = bArr;
        this.f12928g = authenticatorAttestationResponse;
        this.f12929h = authenticatorAssertionResponse;
        this.f12930i = authenticatorErrorResponse;
        this.f12931j = authenticationExtensionsClientOutputs;
        this.f12932k = str3;
    }

    /* renamed from: R */
    public byte[] mo12503R() {
        return this.f12927f;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof PublicKeyCredential)) {
            return false;
        }
        PublicKeyCredential publicKeyCredential = (PublicKeyCredential) obj;
        if (!C7258g.m27880a(this.f12925d, publicKeyCredential.f12925d) || !C7258g.m27880a(this.f12926e, publicKeyCredential.f12926e) || !Arrays.equals(this.f12927f, publicKeyCredential.f12927f) || !C7258g.m27880a(this.f12928g, publicKeyCredential.f12928g) || !C7258g.m27880a(this.f12929h, publicKeyCredential.f12929h) || !C7258g.m27880a(this.f12930i, publicKeyCredential.f12930i) || !C7258g.m27880a(this.f12931j, publicKeyCredential.f12931j) || !C7258g.m27880a(this.f12932k, publicKeyCredential.f12932k)) {
            return false;
        }
        return true;
    }

    /* renamed from: f0 */
    public String mo12505f0() {
        return this.f12926e;
    }

    public int hashCode() {
        return C7258g.m27881b(this.f12925d, this.f12926e, this.f12927f, this.f12929h, this.f12928g, this.f12930i, this.f12931j, this.f12932k);
    }

    /* renamed from: v */
    public String mo12507v() {
        return this.f12932k;
    }

    /* renamed from: w */
    public AuthenticationExtensionsClientOutputs mo12508w() {
        return this.f12931j;
    }

    public void writeToParcel(Parcel parcel, int i) {
        int a = C7461a.m28369a(parcel);
        C7461a.m28392x(parcel, 1, mo12510x(), false);
        C7461a.m28392x(parcel, 2, mo12505f0(), false);
        C7461a.m28376h(parcel, 3, mo12503R(), false);
        C7461a.m28390v(parcel, 4, this.f12928g, i, false);
        C7461a.m28390v(parcel, 5, this.f12929h, i, false);
        C7461a.m28390v(parcel, 6, this.f12930i, i, false);
        C7461a.m28390v(parcel, 7, mo12508w(), i, false);
        C7461a.m28392x(parcel, 8, mo12507v(), false);
        C7461a.m28370b(parcel, a);
    }

    /* renamed from: x */
    public String mo12510x() {
        return this.f12925d;
    }
}
