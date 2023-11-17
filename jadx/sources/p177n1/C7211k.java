package p177n1;

import android.content.Context;
import android.net.ConnectivityManager;
import android.net.NetworkCapabilities;
import android.net.NetworkInfo;
import android.os.Build;
import androidx.core.net.C0901a;
import androidx.work.C2073m;
import kotlin.jvm.internal.C41536l;
import p151l1.C6862b;
import p203p1.C7650n;
import p203p1.C7651o;
import p216q1.C7819c;

/* renamed from: n1.k */
public abstract class C7211k {
    /* access modifiers changed from: private */

    /* renamed from: a */
    public static final String f21377a;

    static {
        String i = C2073m.m8073i("NetworkStateTracker");
        C41536l.m120488h(i, "tagWithPrefix(\"NetworkStateTracker\")");
        f21377a = i;
    }

    /* renamed from: a */
    public static final C7207h m27764a(Context context, C7819c cVar) {
        C41536l.m120489i(context, "context");
        C41536l.m120489i(cVar, "taskExecutor");
        if (Build.VERSION.SDK_INT >= 24) {
            return new C7209j(context, cVar);
        }
        return new C7212l(context, cVar);
    }

    /* renamed from: c */
    public static final C6862b m27766c(ConnectivityManager connectivityManager) {
        boolean z;
        C41536l.m120489i(connectivityManager, "<this>");
        NetworkInfo activeNetworkInfo = connectivityManager.getActiveNetworkInfo();
        boolean z2 = true;
        if (activeNetworkInfo == null || !activeNetworkInfo.isConnected()) {
            z = false;
        } else {
            z = true;
        }
        boolean d = m27767d(connectivityManager);
        boolean a = C0901a.m3326a(connectivityManager);
        if (activeNetworkInfo == null || activeNetworkInfo.isRoaming()) {
            z2 = false;
        }
        return new C6862b(z, d, a, z2);
    }

    /* renamed from: d */
    public static final boolean m27767d(ConnectivityManager connectivityManager) {
        C41536l.m120489i(connectivityManager, "<this>");
        try {
            NetworkCapabilities a = C7650n.m29089a(connectivityManager, C7651o.m29092a(connectivityManager));
            if (a != null) {
                return C7650n.m29090b(a, 16);
            }
            return false;
        } catch (SecurityException e) {
            C2073m.m8071e().mo6962d(f21377a, "Unable to validate active network", e);
            return false;
        }
    }
}
