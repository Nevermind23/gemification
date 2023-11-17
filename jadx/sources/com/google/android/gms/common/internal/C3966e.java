package com.google.android.gms.common.internal;

import android.accounts.Account;
import android.os.IBinder;
import android.os.IInterface;
import p092g7.C6251b;

/* renamed from: com.google.android.gms.common.internal.e */
public interface C3966e extends IInterface {

    /* renamed from: com.google.android.gms.common.internal.e$a */
    public static abstract class C3967a extends C6251b implements C3966e {
        /* renamed from: x */
        public static C3966e m15089x(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.common.internal.IAccountAccessor");
            if (queryLocalInterface instanceof C3966e) {
                return (C3966e) queryLocalInterface;
            }
            return new C3957a0(iBinder);
        }
    }

    /* renamed from: q */
    Account mo12215q();
}
