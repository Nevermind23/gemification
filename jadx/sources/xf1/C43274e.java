package xf1;

import java.security.KeyStore;
import java.security.Provider;
import java.security.SecureRandom;
import java.util.Arrays;
import java.util.List;
import javax.net.ssl.KeyManager;
import javax.net.ssl.SSLContext;
import javax.net.ssl.SSLSocket;
import javax.net.ssl.SSLSocketFactory;
import javax.net.ssl.TrustManager;
import javax.net.ssl.TrustManagerFactory;
import javax.net.ssl.X509TrustManager;
import kotlin.jvm.internal.C41536l;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.conscrypt.Conscrypt;
import org.conscrypt.ConscryptHostnameVerifier;

/* renamed from: xf1.e */
public final class C43274e extends C43286k {

    /* renamed from: e */
    public static final C43275a f101034e;
    /* access modifiers changed from: private */

    /* renamed from: f */
    public static final boolean f101035f;

    /* renamed from: d */
    private final Provider f101036d;

    /* renamed from: xf1.e$a */
    public static final class C43275a {
        private C43275a() {
        }

        public /* synthetic */ C43275a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* renamed from: a */
        public final boolean mo101972a(int i, int i2, int i3) {
            Conscrypt.Version version = Conscrypt.version();
            if (version.major() != i) {
                if (version.major() > i) {
                    return true;
                }
                return false;
            } else if (version.minor() != i2) {
                if (version.minor() > i2) {
                    return true;
                }
                return false;
            } else if (version.patch() >= i3) {
                return true;
            } else {
                return false;
            }
        }

        /* renamed from: b */
        public final C43274e mo101973b() {
            if (mo101974c()) {
                return new C43274e((DefaultConstructorMarker) null);
            }
            return null;
        }

        /* renamed from: c */
        public final boolean mo101974c() {
            return C43274e.f101035f;
        }
    }

    /* renamed from: xf1.e$b */
    public static final class C43276b implements ConscryptHostnameVerifier {

        /* renamed from: a */
        public static final C43276b f101037a = new C43276b();

        private C43276b() {
        }
    }

    static {
        C43275a aVar = new C43275a((DefaultConstructorMarker) null);
        f101034e = aVar;
        boolean z = false;
        try {
            Class.forName("org.conscrypt.Conscrypt$Version", false, aVar.getClass().getClassLoader());
            if (Conscrypt.isAvailable() && aVar.mo101972a(2, 1, 0)) {
                z = true;
            }
        } catch (ClassNotFoundException | NoClassDefFoundError unused) {
        }
        f101035f = z;
    }

    public /* synthetic */ C43274e(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    /* renamed from: e */
    public void mo101953e(SSLSocket sSLSocket, String str, List list) {
        C41536l.m120489i(sSLSocket, "sslSocket");
        C41536l.m120489i(list, "protocols");
        if (Conscrypt.isConscrypt(sSLSocket)) {
            Conscrypt.setUseSessionTickets(sSLSocket, true);
            Object[] array = C43286k.f101052a.mo101986b(list).toArray(new String[0]);
            if (array != null) {
                Conscrypt.setApplicationProtocols(sSLSocket, (String[]) array);
                return;
            }
            throw new NullPointerException("null cannot be cast to non-null type kotlin.Array<T of kotlin.collections.ArraysKt__ArraysJVMKt.toTypedArray>");
        }
        super.mo101953e(sSLSocket, str, list);
    }

    /* renamed from: g */
    public String mo101954g(SSLSocket sSLSocket) {
        C41536l.m120489i(sSLSocket, "sslSocket");
        if (Conscrypt.isConscrypt(sSLSocket)) {
            return Conscrypt.getApplicationProtocol(sSLSocket);
        }
        return super.mo101954g(sSLSocket);
    }

    /* renamed from: m */
    public SSLContext mo101967m() {
        SSLContext instance = SSLContext.getInstance("TLS", this.f101036d);
        C41536l.m120488h(instance, "getInstance(\"TLS\", provider)");
        return instance;
    }

    /* renamed from: n */
    public SSLSocketFactory mo101971n(X509TrustManager x509TrustManager) {
        C41536l.m120489i(x509TrustManager, "trustManager");
        SSLContext m = mo101967m();
        m.init((KeyManager[]) null, new TrustManager[]{x509TrustManager}, (SecureRandom) null);
        SSLSocketFactory socketFactory = m.getSocketFactory();
        C41536l.m120488h(socketFactory, "newSSLContext().apply {\n…null)\n    }.socketFactory");
        return socketFactory;
    }

    /* renamed from: o */
    public X509TrustManager mo101968o() {
        TrustManagerFactory instance = TrustManagerFactory.getInstance(TrustManagerFactory.getDefaultAlgorithm());
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
                X509TrustManager x509TrustManager = (X509TrustManager) trustManager;
                Conscrypt.setHostnameVerifier(x509TrustManager, C43276b.f101037a);
                return x509TrustManager;
            }
            throw new NullPointerException("null cannot be cast to non-null type javax.net.ssl.X509TrustManager");
        }
        String arrays = Arrays.toString(trustManagers);
        C41536l.m120488h(arrays, "toString(this)");
        throw new IllegalStateException(C41536l.m120497q("Unexpected default trust managers: ", arrays).toString());
    }

    private C43274e() {
        Provider newProvider = Conscrypt.newProvider();
        C41536l.m120488h(newProvider, "newProvider()");
        this.f101036d = newProvider;
    }
}
