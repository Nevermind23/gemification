package com.google.android.gms.auth;

import android.accounts.Account;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import p195o6.C7461a;

public class AccountChangeEventsRequest extends AbstractSafeParcelable {
    public static final Parcelable.Creator<AccountChangeEventsRequest> CREATOR = new C3830b();

    /* renamed from: d */
    final int f11989d;

    /* renamed from: e */
    int f11990e;

    /* renamed from: f */
    String f11991f;

    /* renamed from: g */
    Account f11992g;

    public AccountChangeEventsRequest() {
        this.f11989d = 1;
    }

    public void writeToParcel(Parcel parcel, int i) {
        int a = C7461a.m28369a(parcel);
        C7461a.m28383o(parcel, 1, this.f11989d);
        C7461a.m28383o(parcel, 2, this.f11990e);
        C7461a.m28392x(parcel, 3, this.f11991f, false);
        C7461a.m28390v(parcel, 4, this.f11992g, i, false);
        C7461a.m28370b(parcel, a);
    }

    AccountChangeEventsRequest(int i, int i2, String str, Account account) {
        this.f11989d = i;
        this.f11990e = i2;
        this.f11991f = str;
        if (account != null || TextUtils.isEmpty(str)) {
            this.f11992g = account;
        } else {
            this.f11992g = new Account(str, "com.google");
        }
    }
}
