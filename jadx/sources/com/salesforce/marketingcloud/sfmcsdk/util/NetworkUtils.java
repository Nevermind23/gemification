package com.salesforce.marketingcloud.sfmcsdk.util;

import android.content.Context;
import android.net.ConnectivityManager;
import android.net.Network;
import android.net.NetworkCapabilities;
import com.salesforce.marketingcloud.sfmcsdk.components.logging.SFMCSdkLogger;
import kotlin.jvm.internal.C41536l;
import p261t7.C8420a;

public final class NetworkUtils {
    public static final NetworkUtils INSTANCE = new NetworkUtils();
    public static final String TAG = "~$NetworkUtils";

    private NetworkUtils() {
    }

    public static final boolean hasConnectivity(Context context) {
        C41536l.m120489i(context, "context");
        Object systemService = context.getSystemService("connectivity");
        if (systemService != null) {
            ConnectivityManager connectivityManager = (ConnectivityManager) systemService;
            Network activeNetwork = connectivityManager.getActiveNetwork();
            if (activeNetwork == null) {
                SFMCSdkLogger.INSTANCE.mo31452d(TAG, NetworkUtils$hasConnectivity$network$1$1.INSTANCE);
                return false;
            }
            NetworkCapabilities networkCapabilities = connectivityManager.getNetworkCapabilities(activeNetwork);
            if (networkCapabilities == null) {
                SFMCSdkLogger.INSTANCE.mo31452d(TAG, NetworkUtils$hasConnectivity$activeNetwork$1$1.INSTANCE);
                return false;
            } else if (networkCapabilities.hasTransport(1) || networkCapabilities.hasTransport(0) || networkCapabilities.hasTransport(3) || networkCapabilities.hasTransport(2)) {
                return true;
            } else {
                SFMCSdkLogger.INSTANCE.mo31452d(TAG, NetworkUtils$hasConnectivity$1.INSTANCE);
                return false;
            }
        } else {
            throw new NullPointerException("null cannot be cast to non-null type android.net.ConnectivityManager");
        }
    }

    public static final void installProvidersIfNeeded(Context context) {
        C41536l.m120489i(context, "context");
        C8420a.m31586a(context);
    }
}
