package xf1;

import java.security.KeyStore;
import java.security.Provider;
import java.util.Arrays;
import java.util.List;
import javax.net.ssl.SSLContext;
import javax.net.ssl.SSLSocket;
import javax.net.ssl.TrustManager;
import javax.net.ssl.TrustManagerFactory;
import javax.net.ssl.X509TrustManager;
import kotlin.jvm.internal.C41536l;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.openjsse.javax.net.ssl.SSLParameters;
import org.openjsse.net.ssl.OpenJSSE;

/* renamed from: xf1.j */
public final class C43284j extends C43286k {

    /* renamed from: e */
    public static final C43285a f101049e;
    /* access modifiers changed from: private */

    /* renamed from: f */
    public static final boolean f101050f;

    /* renamed from: d */
    private final Provider f101051d;

    /* renamed from: xf1.j$a */
    public static final class C43285a {
        private C43285a() {
        }

        public /* synthetic */ C43285a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* renamed from: a */
        public final C43284j mo101982a() {
            if (mo101983b()) {
                return new C43284j((DefaultConstructorMarker) null);
            }
            return null;
        }

        /* renamed from: b */
        public final boolean mo101983b() {
            return C43284j.f101050f;
        }
    }

    static {
        C43285a aVar = new C43285a((DefaultConstructorMarker) null);
        f101049e = aVar;
        boolean z = false;
        try {
            Class.forName("org.openjsse.net.ssl.OpenJSSE", false, aVar.getClass().getClassLoader());
            z = true;
        } catch (ClassNotFoundException unused) {
        }
        f101050f = z;
    }

    public /* synthetic */ C43284j(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    /* renamed from: e */
    public void mo101953e(SSLSocket sSLSocket, String str, List list) {
        C41536l.m120489i(sSLSocket, "sslSocket");
        C41536l.m120489i(list, "protocols");
        if (sSLSocket instanceof org.openjsse.javax.net.ssl.SSLSocket) {
            org.openjsse.javax.net.ssl.SSLSocket sSLSocket2 = (org.openjsse.javax.net.ssl.SSLSocket) sSLSocket;
            SSLParameters sSLParameters = sSLSocket2.getSSLParameters();
            if (sSLParameters instanceof SSLParameters) {
                SSLParameters sSLParameters2 = sSLParameters;
                Object[] array = C43286k.f101052a.mo101986b(list).toArray(new String[0]);
                if (array != null) {
                    sSLParameters2.setApplicationProtocols((String[]) array);
                    sSLSocket2.setSSLParameters(sSLParameters);
                    return;
                }
                throw new NullPointerException("null cannot be cast to non-null type kotlin.Array<T of kotlin.collections.ArraysKt__ArraysJVMKt.toTypedArray>");
            }
            return;
        }
        super.mo101953e(sSLSocket, str, list);
    }

    /* renamed from: g */
    public String mo101954g(SSLSocket sSLSocket) {
        boolean z;
        C41536l.m120489i(sSLSocket, "sslSocket");
        if (!(sSLSocket instanceof org.openjsse.javax.net.ssl.SSLSocket)) {
            return super.mo101954g(sSLSocket);
        }
        String applicationProtocol = ((org.openjsse.javax.net.ssl.SSLSocket) sSLSocket).getApplicationProtocol();
        if (applicationProtocol == null) {
            z = true;
        } else {
            z = C41536l.m120484d(applicationProtocol, "");
        }
        if (z) {
            return null;
        }
        return applicationProtocol;
    }

    /* renamed from: m */
    public SSLContext mo101967m() {
        SSLContext instance = SSLContext.getInstance("TLSv1.3", this.f101051d);
        C41536l.m120488h(instance, "getInstance(\"TLSv1.3\", provider)");
        return instance;
    }

    /* renamed from: o */
    public X509TrustManager mo101968o() {
        TrustManagerFactory instance = TrustManagerFactory.getInstance(TrustManagerFactory.getDefaultAlgorithm(), this.f101051d);
        instance.init((KeyStore) null);
        TrustManager[] trustManagers = instance.getTrustManagers();
        C41536l.m120486f(trustManagers);
        boolean z = true;
        if (trustManagers.length != 1 || !(trustManagers[0] instanceof X509TrustManager)) {
            z = false;
        }
        if (z) {
            TrustManager trustManager = trustManagers[0];
            if (trustManager != null) {
                return (X509TrustManager) trustManager;
            }
            throw new NullPointerException("null cannot be cast to non-null type javax.net.ssl.X509TrustManager");
        }
        String arrays = Arrays.toString(trustManagers);
        C41536l.m120488h(arrays, "toString(this)");
        throw new IllegalStateException(C41536l.m120497q("Unexpected default trust managers: ", arrays).toString());
    }

    private C43284j() {
        this.f101051d = new OpenJSSE();
    }
}
