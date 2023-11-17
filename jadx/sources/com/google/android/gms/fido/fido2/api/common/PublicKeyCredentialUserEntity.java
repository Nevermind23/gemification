package com.google.android.gms.fido.fido2.api.common;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import java.util.Arrays;
import p182n6.C7258g;
import p182n6.C7264i;
import p195o6.C7461a;
import p324y6.C9075l;

public class PublicKeyCredentialUserEntity extends AbstractSafeParcelable {
    public static final Parcelable.Creator<PublicKeyCredentialUserEntity> CREATOR = new C9075l();

    /* renamed from: d */
    private final byte[] f12965d;

    /* renamed from: e */
    private final String f12966e;

    /* renamed from: f */
    private final String f12967f;

    /* renamed from: g */
    private final String f12968g;

    public PublicKeyCredentialUserEntity(byte[] bArr, String str, String str2, String str3) {
        this.f12965d = (byte[]) C7264i.m27902k(bArr);
        this.f12966e = (String) C7264i.m27902k(str);
        this.f12967f = str2;
        this.f12968g = (String) C7264i.m27902k(str3);
    }

    /* renamed from: R */
    public String mo12555R() {
        return this.f12966e;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof PublicKeyCredentialUserEntity)) {
            return false;
        }
        PublicKeyCredentialUserEntity publicKeyCredentialUserEntity = (PublicKeyCredentialUserEntity) obj;
        if (!Arrays.equals(this.f12965d, publicKeyCredentialUserEntity.f12965d) || !C7258g.m27880a(this.f12966e, publicKeyCredentialUserEntity.f12966e) || !C7258g.m27880a(this.f12967f, publicKeyCredentialUserEntity.f12967f) || !C7258g.m27880a(this.f12968g, publicKeyCredentialUserEntity.f12968g)) {
            return false;
        }
        return true;
    }

    public int hashCode() {
        return C7258g.m27881b(this.f12965d, this.f12966e, this.f12967f, this.f12968g);
    }

    /* renamed from: v */
    public String mo12558v() {
        return this.f12968g;
    }

    /* renamed from: w */
    public String mo12559w() {
        return this.f12967f;
    }

    public void writeToParcel(Parcel parcel, int i) {
        int a = C7461a.m28369a(parcel);
        C7461a.m28376h(parcel, 2, mo12561x(), false);
        C7461a.m28392x(parcel, 3, mo12555R(), false);
        C7461a.m28392x(parcel, 4, mo12559w(), false);
        C7461a.m28392x(parcel, 5, mo12558v(), false);
        C7461a.m28370b(parcel, a);
    }

    /* renamed from: x */
    public byte[] mo12561x() {
        return this.f12965d;
    }
}
