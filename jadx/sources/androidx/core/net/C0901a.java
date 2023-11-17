package androidx.core.net;

import android.net.ConnectivityManager;

/* renamed from: androidx.core.net.a */
public abstract class C0901a {

    /* renamed from: androidx.core.net.a$a */
    static class C0902a {
        /* renamed from: a */
        static boolean m3327a(ConnectivityManager connectivityManager) {
            return connectivityManager.isActiveNetworkMetered();
        }
    }

    /* renamed from: a */
    public static boolean m3326a(ConnectivityManager connectivityManager) {
        return C0902a.m3327a(connectivityManager);
    }
}
