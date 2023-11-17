package com.google.android.gms.internal.measurement;

import android.os.Binder;

/* renamed from: com.google.android.gms.internal.measurement.z5 */
public abstract /* synthetic */ class C4514z5 {
    /* renamed from: a */
    public static Object m17303a(C4093a6 a6Var) {
        long clearCallingIdentity;
        try {
            return a6Var.mo12841a();
        } catch (SecurityException unused) {
            clearCallingIdentity = Binder.clearCallingIdentity();
            Object a = a6Var.mo12841a();
            Binder.restoreCallingIdentity(clearCallingIdentity);
            return a;
        } catch (Throwable th) {
            Binder.restoreCallingIdentity(clearCallingIdentity);
            throw th;
        }
    }
}
