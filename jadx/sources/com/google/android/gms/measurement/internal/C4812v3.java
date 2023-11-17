package com.google.android.gms.measurement.internal;

import android.net.ConnectivityManager;
import android.net.NetworkInfo;

/* renamed from: com.google.android.gms.measurement.internal.v3 */
public final class C4812v3 extends C4583a9 {
    public C4812v3(C4719m9 m9Var) {
        super(m9Var);
    }

    /* access modifiers changed from: protected */
    /* renamed from: l */
    public final boolean mo14304l() {
        return false;
    }

    /* renamed from: m */
    public final boolean mo14935m() {
        mo14301i();
        ConnectivityManager connectivityManager = (ConnectivityManager) this.f14613a.mo14550c().getSystemService("connectivity");
        NetworkInfo networkInfo = null;
        if (connectivityManager != null) {
            try {
                networkInfo = connectivityManager.getActiveNetworkInfo();
            } catch (SecurityException unused) {
            }
        }
        if (networkInfo == null || !networkInfo.isConnected()) {
            return false;
        }
        return true;
    }
}
