package com.medallia.digital.mobilesdk;

import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import java.io.ByteArrayOutputStream;
import java.io.InputStream;

/* renamed from: com.medallia.digital.mobilesdk.l8 */
final class C10988l8 {

    /* renamed from: a */
    static final int f31552a = 1024;

    C10988l8() {
    }

    /* renamed from: a */
    static ByteArrayOutputStream m40230a(InputStream inputStream) {
        byte[] bArr = new byte[1024];
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        while (true) {
            int read = inputStream.read(bArr);
            if (read == -1) {
                return byteArrayOutputStream;
            }
            byteArrayOutputStream.write(bArr, 0, read);
        }
    }

    /* renamed from: b */
    static boolean m40232b() {
        boolean c = m40233c();
        C10735b4.m39109b("isNetworkAvailable: " + c);
        return c;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:20:0x004d, code lost:
        if (r1.hasTransport(3) != false) goto L_0x005a;
     */
    /* renamed from: c */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    static boolean m40233c() {
        /*
            r0 = 1
            com.medallia.digital.mobilesdk.i4 r1 = com.medallia.digital.mobilesdk.C10884i4.m39721c()     // Catch:{ Exception -> 0x0052 }
            android.content.Context r1 = r1.mo28483b()     // Catch:{ Exception -> 0x0052 }
            java.lang.String r2 = "connectivity"
            java.lang.Object r1 = r1.getSystemService(r2)     // Catch:{ Exception -> 0x0052 }
            android.net.ConnectivityManager r1 = (android.net.ConnectivityManager) r1     // Catch:{ Exception -> 0x0052 }
            if (r1 == 0) goto L_0x005a
            android.net.Network r2 = r1.getActiveNetwork()     // Catch:{ Exception -> 0x0052 }
            r3 = 0
            if (r2 == 0) goto L_0x0050
            android.net.NetworkCapabilities r4 = r1.getNetworkCapabilities(r2)     // Catch:{ Exception -> 0x0052 }
            if (r4 != 0) goto L_0x0021
            goto L_0x0050
        L_0x0021:
            android.net.NetworkCapabilities r1 = r1.getNetworkCapabilities(r2)     // Catch:{ Exception -> 0x0052 }
            r2 = 12
            boolean r2 = r1.hasCapability(r2)     // Catch:{ Exception -> 0x0052 }
            if (r2 == 0) goto L_0x0050
            r2 = 16
            boolean r2 = r1.hasCapability(r2)     // Catch:{ Exception -> 0x0052 }
            if (r2 == 0) goto L_0x0050
            boolean r2 = r1.hasTransport(r0)     // Catch:{ Exception -> 0x0052 }
            if (r2 != 0) goto L_0x005a
            r2 = 4
            boolean r2 = r1.hasTransport(r2)     // Catch:{ Exception -> 0x0052 }
            if (r2 != 0) goto L_0x005a
            boolean r2 = r1.hasTransport(r3)     // Catch:{ Exception -> 0x0052 }
            if (r2 != 0) goto L_0x005a
            r2 = 3
            boolean r1 = r1.hasTransport(r2)     // Catch:{ Exception -> 0x0052 }
            if (r1 == 0) goto L_0x0050
            goto L_0x005a
        L_0x0050:
            r0 = r3
            goto L_0x005a
        L_0x0052:
            r1 = move-exception
            java.lang.String r1 = r1.getMessage()
            com.medallia.digital.mobilesdk.C10735b4.m39111c(r1)
        L_0x005a:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "isNetworkAvailable > API23: "
            r1.append(r2)
            r1.append(r0)
            java.lang.String r1 = r1.toString()
            com.medallia.digital.mobilesdk.C10735b4.m39109b(r1)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.medallia.digital.mobilesdk.C10988l8.m40233c():boolean");
    }

    /* renamed from: d */
    static boolean m40234d() {
        NetworkInfo activeNetworkInfo;
        boolean z = true;
        try {
            ConnectivityManager connectivityManager = (ConnectivityManager) C10884i4.m39721c().mo28483b().getSystemService("connectivity");
            if (connectivityManager != null && ((activeNetworkInfo = connectivityManager.getActiveNetworkInfo()) == null || !activeNetworkInfo.isConnectedOrConnecting())) {
                z = false;
            }
        } catch (Exception e) {
            C10735b4.m39111c(e.getMessage());
        }
        C10735b4.m39109b("isNetworkAvailable < API23: " + z);
        return z;
    }

    /* renamed from: a */
    static boolean m40231a() {
        try {
            ConnectivityManager connectivityManager = (ConnectivityManager) C10884i4.m39721c().mo28483b().getSystemService("connectivity");
            if (connectivityManager != null) {
                return connectivityManager.getNetworkInfo(0).isConnected();
            }
            return false;
        } catch (Exception e) {
            C10735b4.m39111c(e.getMessage());
            return false;
        }
    }
}
