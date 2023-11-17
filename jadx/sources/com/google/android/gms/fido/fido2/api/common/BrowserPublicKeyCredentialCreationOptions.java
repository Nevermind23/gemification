package com.google.android.gms.fido.fido2.api.common;

import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import p182n6.C7258g;
import p182n6.C7264i;
import p195o6.C7461a;

public class BrowserPublicKeyCredentialCreationOptions extends BrowserRequestOptions {
    public static final Parcelable.Creator<BrowserPublicKeyCredentialCreationOptions> CREATOR = new C4051t();

    /* renamed from: d */
    private final PublicKeyCredentialCreationOptions f12896d;

    /* renamed from: e */
    private final Uri f12897e;

    /* renamed from: f */
    private final byte[] f12898f;

    BrowserPublicKeyCredentialCreationOptions(PublicKeyCredentialCreationOptions publicKeyCredentialCreationOptions, Uri uri, byte[] bArr) {
        this.f12896d = (PublicKeyCredentialCreationOptions) C7264i.m27902k(publicKeyCredentialCreationOptions);
        m15313R(uri);
        this.f12897e = uri;
        m15314f0(bArr);
        this.f12898f = bArr;
    }

    /* renamed from: R */
    private static Uri m15313R(Uri uri) {
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
    private static byte[] m15314f0(byte[] bArr) {
        boolean z = true;
        if (!(bArr == null || bArr.length == 32)) {
            z = false;
        }
        C7264i.m27893b(z, "clientDataHash must be 32 bytes long");
        return bArr;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof BrowserPublicKeyCredentialCreationOptions)) {
            return false;
        }
        BrowserPublicKeyCredentialCreationOptions browserPublicKeyCredentialCreationOptions = (BrowserPublicKeyCredentialCreationOptions) obj;
        if (!C7258g.m27880a(this.f12896d, browserPublicKeyCredentialCreationOptions.f12896d) || !C7258g.m27880a(this.f12897e, browserPublicKeyCredentialCreationOptions.f12897e)) {
            return false;
        }
        return true;
    }

    public int hashCode() {
        return C7258g.m27881b(this.f12896d, this.f12897e);
    }

    /* renamed from: v */
    public byte[] mo12468v() {
        return this.f12898f;
    }

    /* renamed from: w */
    public Uri mo12469w() {
        return this.f12897e;
    }

    public void writeToParcel(Parcel parcel, int i) {
        int a = C7461a.m28369a(parcel);
        C7461a.m28390v(parcel, 2, mo12471x(), i, false);
        C7461a.m28390v(parcel, 3, mo12469w(), i, false);
        C7461a.m28376h(parcel, 4, mo12468v(), false);
        C7461a.m28370b(parcel, a);
    }

    /* renamed from: x */
    public PublicKeyCredentialCreationOptions mo12471x() {
        return this.f12896d;
    }
}
