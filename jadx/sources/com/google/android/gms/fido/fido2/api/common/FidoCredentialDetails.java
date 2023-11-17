package com.google.android.gms.fido.fido2.api.common;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import java.util.Arrays;
import p182n6.C7258g;
import p195o6.C7461a;

public class FidoCredentialDetails extends AbstractSafeParcelable {
    public static final Parcelable.Creator<FidoCredentialDetails> CREATOR = new C4056y();

    /* renamed from: d */
    private final String f12918d;

    /* renamed from: e */
    private final String f12919e;

    /* renamed from: f */
    private final byte[] f12920f;

    /* renamed from: g */
    private final byte[] f12921g;

    /* renamed from: h */
    private final boolean f12922h;

    /* renamed from: i */
    private final boolean f12923i;

    FidoCredentialDetails(String str, String str2, byte[] bArr, byte[] bArr2, boolean z, boolean z2) {
        this.f12918d = str;
        this.f12919e = str2;
        this.f12920f = bArr;
        this.f12921g = bArr2;
        this.f12922h = z;
        this.f12923i = z2;
    }

    /* renamed from: R */
    public String mo12490R() {
        return this.f12919e;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof FidoCredentialDetails)) {
            return false;
        }
        FidoCredentialDetails fidoCredentialDetails = (FidoCredentialDetails) obj;
        if (!C7258g.m27880a(this.f12918d, fidoCredentialDetails.f12918d) || !C7258g.m27880a(this.f12919e, fidoCredentialDetails.f12919e) || !Arrays.equals(this.f12920f, fidoCredentialDetails.f12920f) || !Arrays.equals(this.f12921g, fidoCredentialDetails.f12921g) || this.f12922h != fidoCredentialDetails.f12922h || this.f12923i != fidoCredentialDetails.f12923i) {
            return false;
        }
        return true;
    }

    /* renamed from: f0 */
    public byte[] mo12492f0() {
        return this.f12920f;
    }

    public int hashCode() {
        return C7258g.m27881b(this.f12918d, this.f12919e, this.f12920f, this.f12921g, Boolean.valueOf(this.f12922h), Boolean.valueOf(this.f12923i));
    }

    /* renamed from: q0 */
    public String mo12494q0() {
        return this.f12918d;
    }

    /* renamed from: v */
    public byte[] mo12495v() {
        return this.f12921g;
    }

    /* renamed from: w */
    public boolean mo12496w() {
        return this.f12922h;
    }

    public void writeToParcel(Parcel parcel, int i) {
        int a = C7461a.m28369a(parcel);
        C7461a.m28392x(parcel, 1, mo12494q0(), false);
        C7461a.m28392x(parcel, 2, mo12490R(), false);
        C7461a.m28376h(parcel, 3, mo12492f0(), false);
        C7461a.m28376h(parcel, 4, mo12495v(), false);
        C7461a.m28372d(parcel, 5, mo12496w());
        C7461a.m28372d(parcel, 6, mo12498x());
        C7461a.m28370b(parcel, a);
    }

    /* renamed from: x */
    public boolean mo12498x() {
        return this.f12923i;
    }
}
