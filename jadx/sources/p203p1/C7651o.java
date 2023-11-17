package p203p1;

import android.net.ConnectivityManager;
import android.net.Network;
import kotlin.jvm.internal.C41536l;

/* renamed from: p1.o */
public abstract class C7651o {
    /* renamed from: a */
    public static final Network m29092a(ConnectivityManager connectivityManager) {
        C41536l.m120489i(connectivityManager, "<this>");
        return connectivityManager.getActiveNetwork();
    }
}
