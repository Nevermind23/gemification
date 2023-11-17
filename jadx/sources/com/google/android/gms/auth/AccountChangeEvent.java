package com.google.android.gms.auth;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import p182n6.C7258g;
import p182n6.C7264i;
import p195o6.C7461a;

public class AccountChangeEvent extends AbstractSafeParcelable {
    public static final Parcelable.Creator<AccountChangeEvent> CREATOR = new C3795a();

    /* renamed from: d */
    final int f11983d;

    /* renamed from: e */
    final long f11984e;

    /* renamed from: f */
    final String f11985f;

    /* renamed from: g */
    final int f11986g;

    /* renamed from: h */
    final int f11987h;

    /* renamed from: i */
    final String f11988i;

    AccountChangeEvent(int i, long j, String str, int i2, int i3, String str2) {
        this.f11983d = i;
        this.f11984e = j;
        this.f11985f = (String) C7264i.m27902k(str);
        this.f11986g = i2;
        this.f11987h = i3;
        this.f11988i = str2;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof AccountChangeEvent)) {
            return false;
        }
        if (obj == this) {
            return true;
        }
        AccountChangeEvent accountChangeEvent = (AccountChangeEvent) obj;
        if (this.f11983d == accountChangeEvent.f11983d && this.f11984e == accountChangeEvent.f11984e && C7258g.m27880a(this.f11985f, accountChangeEvent.f11985f) && this.f11986g == accountChangeEvent.f11986g && this.f11987h == accountChangeEvent.f11987h && C7258g.m27880a(this.f11988i, accountChangeEvent.f11988i)) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        return C7258g.m27881b(Integer.valueOf(this.f11983d), Long.valueOf(this.f11984e), this.f11985f, Integer.valueOf(this.f11986g), Integer.valueOf(this.f11987h), this.f11988i);
    }

    public String toString() {
        int i = this.f11986g;
        String str = i != 1 ? i != 2 ? i != 3 ? i != 4 ? "UNKNOWN" : "RENAMED_TO" : "RENAMED_FROM" : "REMOVED" : "ADDED";
        String str2 = this.f11985f;
        String str3 = this.f11988i;
        int i2 = this.f11987h;
        return "AccountChangeEvent {accountName = " + str2 + ", changeType = " + str + ", changeData = " + str3 + ", eventIndex = " + i2 + "}";
    }

    public void writeToParcel(Parcel parcel, int i) {
        int a = C7461a.m28369a(parcel);
        C7461a.m28383o(parcel, 1, this.f11983d);
        C7461a.m28387s(parcel, 2, this.f11984e);
        C7461a.m28392x(parcel, 3, this.f11985f, false);
        C7461a.m28383o(parcel, 4, this.f11986g);
        C7461a.m28383o(parcel, 5, this.f11987h);
        C7461a.m28392x(parcel, 6, this.f11988i, false);
        C7461a.m28370b(parcel, a);
    }
}
