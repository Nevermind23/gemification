package o41;

import android.content.Context;
import android.net.ConnectivityManager;
import android.net.Network;
import android.net.NetworkCapabilities;
import com.google.firebase.perf.network.FirebasePerfUrlConnection;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLConnection;
import kotlin.jvm.internal.C41536l;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* renamed from: o41.g */
public final class C37635g {

    /* renamed from: b */
    public static final C37636a f90398b = new C37636a((DefaultConstructorMarker) null);

    /* renamed from: c */
    private static final String[] f90399c = {"https://google.com", "https://facebook.com", "https://magticom.ge"};

    /* renamed from: a */
    private final Context f90400a;

    /* renamed from: o41.g$a */
    public static final class C37636a {
        private C37636a() {
        }

        public /* synthetic */ C37636a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public C37635g(Context context) {
        C41536l.m120489i(context, "context");
        this.f90400a = context;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:13:0x0022, code lost:
        if (r1 == null) goto L_0x0025;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final boolean m110654a(java.lang.String r3, int r4) {
        /*
            r2 = this;
            r0 = 0
            r1 = 0
            java.net.HttpURLConnection r1 = r2.m110656e(r3, r4)     // Catch:{ Exception -> 0x0022, all -> 0x001b }
            r1.connect()     // Catch:{ Exception -> 0x0022, all -> 0x001b }
            int r3 = r1.getResponseCode()     // Catch:{ Exception -> 0x0022, all -> 0x001b }
            r4 = 200(0xc8, float:2.8E-43)
            if (r4 > r3) goto L_0x0017
            r4 = 300(0x12c, float:4.2E-43)
            if (r3 >= r4) goto L_0x0017
            r3 = 1
            r0 = r3
        L_0x0017:
            r1.disconnect()
            goto L_0x0025
        L_0x001b:
            r3 = move-exception
            if (r1 == 0) goto L_0x0021
            r1.disconnect()
        L_0x0021:
            throw r3
        L_0x0022:
            if (r1 == 0) goto L_0x0025
            goto L_0x0017
        L_0x0025:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: o41.C37635g.m110654a(java.lang.String, int):boolean");
    }

    /* renamed from: c */
    public static /* synthetic */ boolean m110655c(C37635g gVar, String[] strArr, int i, Object obj) {
        if ((i & 1) != 0) {
            strArr = f90399c;
        }
        return gVar.mo90813b(strArr);
    }

    /* renamed from: e */
    private final HttpURLConnection m110656e(String str, int i) {
        URLConnection uRLConnection = (URLConnection) FirebasePerfUrlConnection.instrument(new URL(str).openConnection());
        C41536l.m120487g(uRLConnection, "null cannot be cast to non-null type java.net.HttpURLConnection");
        HttpURLConnection httpURLConnection = (HttpURLConnection) uRLConnection;
        httpURLConnection.setRequestProperty("User-Agent", "Android");
        httpURLConnection.setRequestProperty("Connection", "close");
        httpURLConnection.setConnectTimeout(i);
        httpURLConnection.setReadTimeout(i);
        return httpURLConnection;
    }

    /* renamed from: b */
    public final boolean mo90813b(String[] strArr) {
        C41536l.m120489i(strArr, "urls");
        for (String a : strArr) {
            if (m110654a(a, 10000)) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: d */
    public final boolean mo90814d() {
        NetworkCapabilities networkCapabilities;
        Object systemService = this.f90400a.getSystemService("connectivity");
        C41536l.m120487g(systemService, "null cannot be cast to non-null type android.net.ConnectivityManager");
        ConnectivityManager connectivityManager = (ConnectivityManager) systemService;
        Network activeNetwork = connectivityManager.getActiveNetwork();
        if (activeNetwork == null || (networkCapabilities = connectivityManager.getNetworkCapabilities(activeNetwork)) == null) {
            return false;
        }
        if (!networkCapabilities.hasTransport(1) && !networkCapabilities.hasTransport(0) && !networkCapabilities.hasTransport(3) && !networkCapabilities.hasTransport(2)) {
            return false;
        }
        return true;
    }
}
