package com.google.android.gms.fido.fido2.api.common;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import p182n6.C7258g;
import p182n6.C7264i;
import p195o6.C7461a;
import p324y6.C9082s;

public class FidoAppIdExtension extends AbstractSafeParcelable {
    public static final Parcelable.Creator<FidoAppIdExtension> CREATOR = new C9082s();

    /* renamed from: d */
    private final String f12917d;

    public FidoAppIdExtension(String str) {
        this.f12917d = (String) C7264i.m27902k(str);
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof FidoAppIdExtension)) {
            return false;
        }
        return this.f12917d.equals(((FidoAppIdExtension) obj).f12917d);
    }

    public int hashCode() {
        return C7258g.m27881b(this.f12917d);
    }

    /* renamed from: v */
    public String mo12488v() {
        return this.f12917d;
    }

    public void writeToParcel(Parcel parcel, int i) {
        int a = C7461a.m28369a(parcel);
        C7461a.m28392x(parcel, 2, mo12488v(), false);
        C7461a.m28370b(parcel, a);
    }
}
