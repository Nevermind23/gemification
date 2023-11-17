package com.google.android.gms.common.internal;

import android.accounts.Account;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import p195o6.C7461a;

public final class zat extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zat> CREATOR = new C3970h();

    /* renamed from: d */
    final int f12722d;

    /* renamed from: e */
    private final Account f12723e;

    /* renamed from: f */
    private final int f12724f;

    /* renamed from: g */
    private final GoogleSignInAccount f12725g;

    zat(int i, Account account, int i2, GoogleSignInAccount googleSignInAccount) {
        this.f12722d = i;
        this.f12723e = account;
        this.f12724f = i2;
        this.f12725g = googleSignInAccount;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a = C7461a.m28369a(parcel);
        C7461a.m28383o(parcel, 1, this.f12722d);
        C7461a.m28390v(parcel, 2, this.f12723e, i, false);
        C7461a.m28383o(parcel, 3, this.f12724f);
        C7461a.m28390v(parcel, 4, this.f12725g, i, false);
        C7461a.m28370b(parcel, a);
    }

    public zat(Account account, int i, GoogleSignInAccount googleSignInAccount) {
        this(2, account, i, googleSignInAccount);
    }
}
