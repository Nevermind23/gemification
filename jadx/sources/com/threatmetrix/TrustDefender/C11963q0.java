package com.threatmetrix.TrustDefender;

import android.net.ConnectivityManager;
import android.net.ProxyInfo;
import android.net.Uri;
import com.threatmetrix.TrustDefender.C11907h;
import p585re.C17603t;

/* renamed from: com.threatmetrix.TrustDefender.q0 */
public abstract class C11963q0 {

    /* renamed from: a */
    private static final String f35137a = C11907h.m43615j(C11963q0.class);

    /* renamed from: a */
    public static String m43907a(C17603t tVar) {
        Object systemService = tVar.f49314a.getSystemService("connectivity");
        if (!(systemService instanceof ConnectivityManager)) {
            C11907h.C11908a.m43630h(f35137a, "Service is not valid");
            return null;
        }
        ProxyInfo defaultProxy = ((ConnectivityManager) systemService).getDefaultProxy();
        if (defaultProxy == null) {
            return null;
        }
        String host = defaultProxy.getHost();
        int port = defaultProxy.getPort();
        if (!C11921k0.m43732o(host) || port <= 0) {
            Uri pacFileUrl = defaultProxy.getPacFileUrl();
            if (pacFileUrl == null) {
                return null;
            }
            String uri = pacFileUrl.toString();
            String str = f35137a;
            C11907h.C11908a.m43624b(str, "proxy information " + uri);
            if (C11921k0.m43732o(uri)) {
                return uri;
            }
            return null;
        }
        String str2 = f35137a;
        C11907h.C11908a.m43624b(str2, "proxy information " + host + ":" + port);
        return host + ":" + port;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:4:0x000a, code lost:
        r2 = (android.net.ConnectivityManager) r2;
     */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static boolean m43908b(android.content.Context r2) {
        /*
            java.lang.String r0 = "connectivity"
            java.lang.Object r2 = r2.getSystemService(r0)     // Catch:{ SecurityException -> 0x0029, Exception -> 0x001e }
            boolean r0 = r2 instanceof android.net.ConnectivityManager     // Catch:{ SecurityException -> 0x0029, Exception -> 0x001e }
            if (r0 == 0) goto L_0x0036
            android.net.ConnectivityManager r2 = (android.net.ConnectivityManager) r2     // Catch:{ SecurityException -> 0x0029, Exception -> 0x001e }
            android.net.Network r0 = r2.getActiveNetwork()     // Catch:{ SecurityException -> 0x0029, Exception -> 0x001e }
            if (r0 == 0) goto L_0x0036
            android.net.NetworkCapabilities r2 = r2.getNetworkCapabilities(r0)     // Catch:{ SecurityException -> 0x0029, Exception -> 0x001e }
            if (r2 == 0) goto L_0x0036
            r0 = 4
            boolean r2 = r2.hasTransport(r0)     // Catch:{ SecurityException -> 0x0029, Exception -> 0x001e }
            return r2
        L_0x001e:
            r2 = move-exception
            java.lang.String r0 = f35137a
            java.lang.String r2 = r2.toString()
            com.threatmetrix.TrustDefender.C11907h.m43607b(r0, r2)
            goto L_0x0036
        L_0x0029:
            r2 = move-exception
            java.lang.String r0 = f35137a
            java.lang.String r1 = r2.getMessage()
            com.threatmetrix.TrustDefender.C11907h.m43607b(r0, r1)
            com.threatmetrix.TrustDefender.C12014y0.m44139c(r2)
        L_0x0036:
            r2 = 0
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.threatmetrix.TrustDefender.C11963q0.m43908b(android.content.Context):boolean");
    }
}
