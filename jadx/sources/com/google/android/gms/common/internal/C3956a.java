package com.google.android.gms.common.internal;

import android.accounts.Account;
import android.os.Binder;
import android.os.RemoteException;
import android.util.Log;
import com.google.android.gms.common.internal.C3966e;

/* renamed from: com.google.android.gms.common.internal.a */
public abstract class C3956a extends C3966e.C3967a {
    /* renamed from: y */
    public static Account m15007y(C3966e eVar) {
        Account account = null;
        if (eVar != null) {
            long clearCallingIdentity = Binder.clearCallingIdentity();
            try {
                account = eVar.mo12215q();
            } catch (RemoteException unused) {
                Log.w("AccountAccessor", "Remote account accessor probably died");
            } catch (Throwable th) {
                Binder.restoreCallingIdentity(clearCallingIdentity);
                throw th;
            }
            Binder.restoreCallingIdentity(clearCallingIdentity);
        }
        return account;
    }
}
