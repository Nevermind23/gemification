package com.google.android.gms.fido.fido2.api.common;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import p182n6.C7258g;
import p182n6.C7264i;
import p195o6.C7461a;
import p324y6.C9074k;

public class PublicKeyCredentialRpEntity extends AbstractSafeParcelable {
    public static final Parcelable.Creator<PublicKeyCredentialRpEntity> CREATOR = new C9074k();

    /* renamed from: d */
    private final String f12959d;

    /* renamed from: e */
    private final String f12960e;

    /* renamed from: f */
    private final String f12961f;

    public PublicKeyCredentialRpEntity(String str, String str2, String str3) {
        this.f12959d = (String) C7264i.m27902k(str);
        this.f12960e = (String) C7264i.m27902k(str2);
        this.f12961f = str3;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof PublicKeyCredentialRpEntity)) {
            return false;
        }
        PublicKeyCredentialRpEntity publicKeyCredentialRpEntity = (PublicKeyCredentialRpEntity) obj;
        if (!C7258g.m27880a(this.f12959d, publicKeyCredentialRpEntity.f12959d) || !C7258g.m27880a(this.f12960e, publicKeyCredentialRpEntity.f12960e) || !C7258g.m27880a(this.f12961f, publicKeyCredentialRpEntity.f12961f)) {
            return false;
        }
        return true;
    }

    public int hashCode() {
        return C7258g.m27881b(this.f12959d, this.f12960e, this.f12961f);
    }

    /* renamed from: v */
    public String mo12548v() {
        return this.f12961f;
    }

    /* renamed from: w */
    public String mo12549w() {
        return this.f12959d;
    }

    public void writeToParcel(Parcel parcel, int i) {
        int a = C7461a.m28369a(parcel);
        C7461a.m28392x(parcel, 2, mo12549w(), false);
        C7461a.m28392x(parcel, 3, mo12551x(), false);
        C7461a.m28392x(parcel, 4, mo12548v(), false);
        C7461a.m28370b(parcel, a);
    }

    /* renamed from: x */
    public String mo12551x() {
        return this.f12960e;
    }
}
