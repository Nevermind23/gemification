package p203p1;

import android.net.ConnectivityManager;
import kotlin.jvm.internal.C41536l;

/* renamed from: p1.q */
public abstract class C7653q {
    /* renamed from: a */
    public static final void m29094a(ConnectivityManager connectivityManager, ConnectivityManager.NetworkCallback networkCallback) {
        C41536l.m120489i(connectivityManager, "<this>");
        C41536l.m120489i(networkCallback, "networkCallback");
        connectivityManager.registerDefaultNetworkCallback(networkCallback);
    }
}
