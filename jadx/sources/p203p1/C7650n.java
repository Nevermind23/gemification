package p203p1;

import android.net.ConnectivityManager;
import android.net.Network;
import android.net.NetworkCapabilities;
import kotlin.jvm.internal.C41536l;

/* renamed from: p1.n */
public abstract class C7650n {
    /* renamed from: a */
    public static final NetworkCapabilities m29089a(ConnectivityManager connectivityManager, Network network) {
        C41536l.m120489i(connectivityManager, "<this>");
        return connectivityManager.getNetworkCapabilities(network);
    }

    /* renamed from: b */
    public static final boolean m29090b(NetworkCapabilities networkCapabilities, int i) {
        C41536l.m120489i(networkCapabilities, "<this>");
        return networkCapabilities.hasCapability(i);
    }

    /* renamed from: c */
    public static final void m29091c(ConnectivityManager connectivityManager, ConnectivityManager.NetworkCallback networkCallback) {
        C41536l.m120489i(connectivityManager, "<this>");
        C41536l.m120489i(networkCallback, "networkCallback");
        connectivityManager.unregisterNetworkCallback(networkCallback);
    }
}
