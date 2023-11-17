package com.google.android.gms.auth;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import java.util.List;
import p182n6.C7264i;
import p195o6.C7461a;

public class AccountChangeEventsResponse extends AbstractSafeParcelable {
    public static final Parcelable.Creator<AccountChangeEventsResponse> CREATOR = new C3831c();

    /* renamed from: d */
    final int f11993d;

    /* renamed from: e */
    final List f11994e;

    AccountChangeEventsResponse(int i, List list) {
        this.f11993d = i;
        this.f11994e = (List) C7264i.m27902k(list);
    }

    public void writeToParcel(Parcel parcel, int i) {
        int a = C7461a.m28369a(parcel);
        C7461a.m28383o(parcel, 1, this.f11993d);
        C7461a.m28364C(parcel, 2, this.f11994e, false);
        C7461a.m28370b(parcel, a);
    }
}
