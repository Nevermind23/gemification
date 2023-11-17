package com.google.android.gms.common.internal;

import android.accounts.Account;
import android.os.IBinder;
import android.os.Parcel;
import p092g7.C6250a;
import p092g7.C6252c;

/* renamed from: com.google.android.gms.common.internal.a0 */
public final class C3957a0 extends C6250a implements C3966e {
    C3957a0(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.common.internal.IAccountAccessor");
    }

    /* renamed from: q */
    public final Account mo12215q() {
        Parcel k = mo19863k(2, mo19864x());
        Account account = (Account) C6252c.m24820a(k, Account.CREATOR);
        k.recycle();
        return account;
    }
}
