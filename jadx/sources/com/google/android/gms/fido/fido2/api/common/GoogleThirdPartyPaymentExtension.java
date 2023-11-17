package com.google.android.gms.fido.fido2.api.common;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import p182n6.C7258g;
import p195o6.C7461a;
import p324y6.C9069f;

public class GoogleThirdPartyPaymentExtension extends AbstractSafeParcelable {
    public static final Parcelable.Creator<GoogleThirdPartyPaymentExtension> CREATOR = new C9069f();

    /* renamed from: d */
    private final boolean f12924d;

    public GoogleThirdPartyPaymentExtension(boolean z) {
        this.f12924d = z;
    }

    public boolean equals(Object obj) {
        if ((obj instanceof GoogleThirdPartyPaymentExtension) && this.f12924d == ((GoogleThirdPartyPaymentExtension) obj).mo12501v()) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        return C7258g.m27881b(Boolean.valueOf(this.f12924d));
    }

    /* renamed from: v */
    public boolean mo12501v() {
        return this.f12924d;
    }

    public void writeToParcel(Parcel parcel, int i) {
        int a = C7461a.m28369a(parcel);
        C7461a.m28372d(parcel, 1, mo12501v());
        C7461a.m28370b(parcel, a);
    }
}
