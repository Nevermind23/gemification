package yf1;

import android.net.ssl.SSLSockets;
import android.os.Build;
import java.io.IOException;
import java.util.List;
import javax.net.ssl.SSLParameters;
import javax.net.ssl.SSLSocket;
import kotlin.jvm.internal.C41536l;
import kotlin.jvm.internal.DefaultConstructorMarker;
import xf1.C43286k;

/* renamed from: yf1.c */
public final class C43376c implements C43396m {

    /* renamed from: a */
    public static final C43377a f101217a = new C43377a((DefaultConstructorMarker) null);

    /* renamed from: yf1.c$a */
    public static final class C43377a {
        private C43377a() {
        }

        public /* synthetic */ C43377a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* renamed from: a */
        public final C43396m mo102054a() {
            if (mo102055b()) {
                return new C43376c();
            }
            return null;
        }

        /* renamed from: b */
        public final boolean mo102055b() {
            return C43286k.f101052a.mo101989h() && Build.VERSION.SDK_INT >= 29;
        }
    }

    /* renamed from: a */
    public boolean mo102050a() {
        return f101217a.mo102055b();
    }

    /* renamed from: b */
    public boolean mo102051b(SSLSocket sSLSocket) {
        C41536l.m120489i(sSLSocket, "sslSocket");
        return SSLSockets.isSupportedSocket(sSLSocket);
    }

    /* renamed from: c */
    public String mo102052c(SSLSocket sSLSocket) {
        boolean z;
        C41536l.m120489i(sSLSocket, "sslSocket");
        String a = sSLSocket.getApplicationProtocol();
        if (a == null) {
            z = true;
        } else {
            z = C41536l.m120484d(a, "");
        }
        if (z) {
            return null;
        }
        return a;
    }

    /* renamed from: d */
    public void mo102053d(SSLSocket sSLSocket, String str, List list) {
        C41536l.m120489i(sSLSocket, "sslSocket");
        C41536l.m120489i(list, "protocols");
        try {
            SSLSockets.setUseSessionTickets(sSLSocket, true);
            SSLParameters sSLParameters = sSLSocket.getSSLParameters();
            Object[] array = C43286k.f101052a.mo101986b(list).toArray(new String[0]);
            if (array != null) {
                sSLParameters.setApplicationProtocols((String[]) array);
                sSLSocket.setSSLParameters(sSLParameters);
                return;
            }
            throw new NullPointerException("null cannot be cast to non-null type kotlin.Array<T of kotlin.collections.ArraysKt__ArraysJVMKt.toTypedArray>");
        } catch (IllegalArgumentException e) {
            throw new IOException("Android internal error", e);
        }
    }
}
