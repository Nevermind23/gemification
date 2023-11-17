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
import org.bouncycastle.jsse.BCSSLParameters;
import org.bouncycastle.jsse.BCSSLSocket;
import org.bouncycastle.jsse.provider.BouncyCastleJsseProvider;

/* renamed from: xf1.d */
public final class C43272d extends C43286k {

    /* renamed from: e */
    public static final C43273a f101031e;
    /* access modifiers changed from: private */

    /* renamed from: f */
    public static final boolean f101032f;

    /* renamed from: d */
    private final Provider f101033d;

    /* renamed from: xf1.d$a */
    public static final class C43273a {
        private C43273a() {
        }

        public /* synthetic */ C43273a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* renamed from: a */
        public final C43272d mo101969a() {
            if (mo101970b()) {
                return new C43272d((DefaultConstructorMarker) null);
            }
            return null;
        }

        /* renamed from: b */
        public final boolean mo101970b() {
            return C43272d.f101032f;
        }
    }

    static {
        C43273a aVar = new C43273a((DefaultConstructorMarker) null);
        f101031e = aVar;
        boolean z = false;
        try {
            Class.forName("org.bouncycastle.jsse.provider.BouncyCastleJsseProvider", false, aVar.getClass().getClassLoader());
            z = true;
        } catch (ClassNotFoundException unused) {
        }
        f101032f = z;
    }

    public /* synthetic */ C43272d(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    /* renamed from: e */
    public void mo101953e(SSLSocket sSLSocket, String str, List list) {
        C41536l.m120489i(sSLSocket, "sslSocket");
        C41536l.m120489i(list, "protocols");
        if (sSLSocket instanceof BCSSLSocket) {
            BCSSLSocket bCSSLSocket = (BCSSLSocket) sSLSocket;
            BCSSLParameters parameters = bCSSLSocket.getParameters();
            Object[] array = C43286k.f101052a.mo101986b(list).toArray(new String[0]);
            if (array != null) {
                parameters.setApplicationProtocols((String[]) array);
                bCSSLSocket.setParameters(parameters);
                return;
            }
            throw new NullPointerException("null cannot be cast to non-null type kotlin.Array<T of kotlin.collections.ArraysKt__ArraysJVMKt.toTypedArray>");
        }
        super.mo101953e(sSLSocket, str, list);
    }

    /* renamed from: g */
    public String mo101954g(SSLSocket sSLSocket) {
        boolean z;
        C41536l.m120489i(sSLSocket, "sslSocket");
        if (!(sSLSocket instanceof BCSSLSocket)) {
            return super.mo101954g(sSLSocket);
        }
        String applicationProtocol = ((BCSSLSocket) sSLSocket).getApplicationProtocol();
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
        SSLContext instance = SSLContext.getInstance("TLS", this.f101033d);
        C41536l.m120488h(instance, "getInstance(\"TLS\", provider)");
        return instance;
    }

    /* renamed from: o */
    public X509TrustManager mo101968o() {
        TrustManagerFactory instance = TrustManagerFactory.getInstance("PKIX", "BCJSSE");
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

    private C43272d() {
        this.f101033d = new BouncyCastleJsseProvider();
    }
}
