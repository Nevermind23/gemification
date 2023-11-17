package com.google.android.gms.fido.fido2.api.common;

import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import p182n6.C7258g;
import p182n6.C7264i;
import p195o6.C7461a;

public class BrowserPublicKeyCredentialRequestOptions extends BrowserRequestOptions {
    public static final Parcelable.Creator<BrowserPublicKeyCredentialRequestOptions> CREATOR = new C4052u();

    /* renamed from: d */
    private final PublicKeyCredentialRequestOptions f12899d;

    /* renamed from: e */
    private final Uri f12900e;

    /* renamed from: f */
    private final byte[] f12901f;

    BrowserPublicKeyCredentialRequestOptions(PublicKeyCredentialRequestOptions publicKeyCredentialRequestOptions, Uri uri, byte[] bArr) {
        this.f12899d = (PublicKeyCredentialRequestOptions) C7264i.m27902k(publicKeyCredentialRequestOptions);
        m15318R(uri);
        this.f12900e = uri;
        m15319f0(bArr);
        this.f12901f = bArr;
    }

    /* renamed from: R */
    private static Uri m15318R(Uri uri) {
        boolean z;
        C7264i.m27902k(uri);
        boolean z2 = true;
        if (uri.getScheme() != null) {
            z = true;
        } else {
            z = false;
        }
        C7264i.m27893b(z, "origin scheme must be non-empty");
        if (uri.getAuthority() == null) {
            z2 = false;
        }
        C7264i.m27893b(z2, "origin authority must be non-empty");
        return uri;
    }

    /* renamed from: f0 */
    private static byte[] m15319f0(byte[] bArr) {
        boolean z = true;
        if (!(bArr == null || bArr.length == 32)) {
            z = false;
        }
        C7264i.m27893b(z, "clientDataHash must be 32 bytes long");
        return bArr;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof BrowserPublicKeyCredentialRequestOptions)) {
            return false;
        }
        BrowserPublicKeyCredentialRequestOptions browserPublicKeyCredentialRequestOptions = (BrowserPublicKeyCredentialRequestOptions) obj;
        if (!C7258g.m27880a(this.f12899d, browserPublicKeyCredentialRequestOptions.f12899d) || !C7258g.m27880a(this.f12900e, browserPublicKeyCredentialRequestOptions.f12900e)) {
            return false;
        }
        return true;
    }

    public int hashCode() {
        return C7258g.m27881b(this.f12899d, this.f12900e);
    }

    /* renamed from: v */
    public byte[] mo12474v() {
        return this.f12901f;
    }

    /* renamed from: w */
    public Uri mo12475w() {
        return this.f12900e;
    }

    public void writeToParcel(Parcel parcel, int i) {
        int a = C7461a.m28369a(parcel);
        C7461a.m28390v(parcel, 2, mo12477x(), i, false);
        C7461a.m28390v(parcel, 3, mo12475w(), i, false);
        C7461a.m28376h(parcel, 4, mo12474v(), false);
        C7461a.m28370b(parcel, a);
    }

    /* renamed from: x */
    public PublicKeyCredentialRequestOptions mo12477x() {
        return this.f12899d;
    }
}
