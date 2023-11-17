package com.google.android.gms.tapandpay.firstparty;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.ReflectedParcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import p182n6.C7258g;
import p195o6.C7461a;
import p325y7.C9083a;

public final class AccountInfo extends AbstractSafeParcelable implements ReflectedParcelable {
    public static final Parcelable.Creator<AccountInfo> CREATOR = new C9083a();

    /* renamed from: d */
    String f15155d;

    /* renamed from: e */
    String f15156e;

    public AccountInfo(String str, String str2) {
        this.f15155d = str;
        this.f15156e = str2;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof AccountInfo) {
            AccountInfo accountInfo = (AccountInfo) obj;
            if (!C7258g.m27880a(this.f15155d, accountInfo.f15155d) || !C7258g.m27880a(this.f15156e, accountInfo.f15156e)) {
                return false;
            }
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return C7258g.m27881b(this.f15155d, this.f15156e);
    }

    public final String toString() {
        return C7258g.m27882c(this).mo21632a("accountId", this.f15155d).mo21632a("accountName", this.f15156e).toString();
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a = C7461a.m28369a(parcel);
        C7461a.m28392x(parcel, 2, this.f15155d, false);
        C7461a.m28392x(parcel, 3, this.f15156e, false);
        C7461a.m28370b(parcel, a);
    }
}
