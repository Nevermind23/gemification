package com.google.android.gms.tapandpay.firstparty;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import p182n6.C7258g;
import p195o6.C7461a;
import p325y7.C9097o;

public final class zzt extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzt> CREATOR = new C9097o();

    /* renamed from: d */
    final ContactlessSetupItem[] f15288d;

    public zzt(ContactlessSetupItem[] contactlessSetupItemArr) {
        this.f15288d = contactlessSetupItemArr;
    }

    public final String toString() {
        C7258g.C7259a c = C7258g.m27882c(this);
        for (ContactlessSetupItem contactlessSetupItem : this.f15288d) {
            c.mo21632a("type", Integer.valueOf(contactlessSetupItem.f15195d));
            c.mo21632a("status", Integer.valueOf(contactlessSetupItem.f15196e));
        }
        return c.toString();
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a = C7461a.m28369a(parcel);
        C7461a.m28363B(parcel, 1, this.f15288d, i, false);
        C7461a.m28370b(parcel, a);
    }
}
