package com.google.android.gms.tapandpay.firstparty;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.ReflectedParcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import p182n6.C7258g;
import p195o6.C7461a;
import p325y7.C9091i;

public final class ContactlessSetupItem extends AbstractSafeParcelable implements ReflectedParcelable {
    public static final Parcelable.Creator<ContactlessSetupItem> CREATOR = new C9091i();

    /* renamed from: d */
    int f15195d;

    /* renamed from: e */
    int f15196e;

    public ContactlessSetupItem(int i, int i2) {
        this.f15195d = i;
        this.f15196e = i2;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof ContactlessSetupItem) {
            ContactlessSetupItem contactlessSetupItem = (ContactlessSetupItem) obj;
            if (this.f15195d == contactlessSetupItem.f15195d && this.f15196e == contactlessSetupItem.f15196e) {
                return true;
            }
            return false;
        }
        return false;
    }

    public final int hashCode() {
        return C7258g.m27881b(Integer.valueOf(this.f15195d), Integer.valueOf(this.f15196e));
    }

    public final String toString() {
        return C7258g.m27882c(this).mo21632a("type", Integer.valueOf(this.f15195d)).mo21632a("status", Integer.valueOf(this.f15196e)).toString();
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a = C7461a.m28369a(parcel);
        C7461a.m28383o(parcel, 1, this.f15195d);
        C7461a.m28383o(parcel, 2, this.f15196e);
        C7461a.m28370b(parcel, a);
    }
}
