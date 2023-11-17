package com.google.android.gms.fido.fido2.api.common;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import p182n6.C7258g;
import p195o6.C7461a;
import p324y6.C9076m;

public class UserVerificationMethodExtension extends AbstractSafeParcelable {
    public static final Parcelable.Creator<UserVerificationMethodExtension> CREATOR = new C9076m();

    /* renamed from: d */
    private final boolean f12983d;

    public UserVerificationMethodExtension(boolean z) {
        this.f12983d = z;
    }

    public boolean equals(Object obj) {
        if ((obj instanceof UserVerificationMethodExtension) && this.f12983d == ((UserVerificationMethodExtension) obj).f12983d) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        return C7258g.m27881b(Boolean.valueOf(this.f12983d));
    }

    /* renamed from: v */
    public boolean mo12575v() {
        return this.f12983d;
    }

    public void writeToParcel(Parcel parcel, int i) {
        int a = C7461a.m28369a(parcel);
        C7461a.m28372d(parcel, 1, mo12575v());
        C7461a.m28370b(parcel, a);
    }
}
