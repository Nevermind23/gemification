package com.google.android.gms.fido.fido2.api.common;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.fido.fido2.api.common.COSEAlgorithmIdentifier;
import com.google.android.gms.fido.fido2.api.common.PublicKeyCredentialType;
import p182n6.C7258g;
import p182n6.C7264i;
import p195o6.C7461a;
import p324y6.C9073j;

public class PublicKeyCredentialParameters extends AbstractSafeParcelable {
    public static final Parcelable.Creator<PublicKeyCredentialParameters> CREATOR = new C9073j();

    /* renamed from: d */
    private final PublicKeyCredentialType f12948d;

    /* renamed from: e */
    private final COSEAlgorithmIdentifier f12949e;

    public PublicKeyCredentialParameters(String str, int i) {
        C7264i.m27902k(str);
        try {
            this.f12948d = PublicKeyCredentialType.m15366a(str);
            C7264i.m27902k(Integer.valueOf(i));
            try {
                this.f12949e = COSEAlgorithmIdentifier.m15323a(i);
            } catch (COSEAlgorithmIdentifier.UnsupportedAlgorithmIdentifierException e) {
                throw new IllegalArgumentException(e);
            }
        } catch (PublicKeyCredentialType.UnsupportedPublicKeyCredTypeException e2) {
            throw new IllegalArgumentException(e2);
        }
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof PublicKeyCredentialParameters)) {
            return false;
        }
        PublicKeyCredentialParameters publicKeyCredentialParameters = (PublicKeyCredentialParameters) obj;
        if (!this.f12948d.equals(publicKeyCredentialParameters.f12948d) || !this.f12949e.equals(publicKeyCredentialParameters.f12949e)) {
            return false;
        }
        return true;
    }

    public int hashCode() {
        return C7258g.m27881b(this.f12948d, this.f12949e);
    }

    /* renamed from: v */
    public int mo12533v() {
        return this.f12949e.mo12478b();
    }

    /* renamed from: w */
    public String mo12534w() {
        return this.f12948d.toString();
    }

    public void writeToParcel(Parcel parcel, int i) {
        int a = C7461a.m28369a(parcel);
        C7461a.m28392x(parcel, 2, mo12534w(), false);
        C7461a.m28385q(parcel, 3, Integer.valueOf(mo12533v()), false);
        C7461a.m28370b(parcel, a);
    }
}
