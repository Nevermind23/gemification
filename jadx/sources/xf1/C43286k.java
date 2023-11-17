package xf1;

import ag1.C40306a;
import ag1.C40308b;
import ag1.C40309c;
import ag1.C40312e;
import dg1.C40672b;
import java.net.InetSocketAddress;
import java.net.Socket;
import java.security.GeneralSecurityException;
import java.security.KeyStore;
import java.security.SecureRandom;
import java.security.Security;
import java.security.cert.X509Certificate;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.net.ssl.KeyManager;
import javax.net.ssl.SSLContext;
import javax.net.ssl.SSLSocket;
import javax.net.ssl.SSLSocketFactory;
import javax.net.ssl.TrustManager;
import javax.net.ssl.TrustManagerFactory;
import javax.net.ssl.X509TrustManager;
import kotlin.jvm.internal.C41536l;
import kotlin.jvm.internal.DefaultConstructorMarker;
import of1.C41864a0;
import of1.C41944z;
import yf1.C43380e;

/* renamed from: xf1.k */
public class C43286k {

    /* renamed from: a */
    public static final C43287a f101052a;
    /* access modifiers changed from: private */

    /* renamed from: b */
    public static volatile C43286k f101053b;

    /* renamed from: c */
    private static final Logger f101054c = Logger.getLogger(C41944z.class.getName());

    /* renamed from: xf1.k$a */
    public static final class C43287a {
        private C43287a() {
        }

        public /* synthetic */ C43287a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* renamed from: d */
        private final C43286k m124311d() {
            C43380e.f101221a.mo102060b();
            C43286k a = C43267b.f101022e.mo101956a();
            if (a != null) {
                return a;
            }
            C43286k a2 = C43269c.f101025f.mo101962a();
            C41536l.m120486f(a2);
            return a2;
        }

        /* renamed from: e */
        private final C43286k m124312e() {
            C43284j a;
            C43272d a2;
            C43274e b;
            if (m124315j() && (b = C43274e.f101034e.mo101973b()) != null) {
                return b;
            }
            if (m124314i() && (a2 = C43272d.f101031e.mo101969a()) != null) {
                return a2;
            }
            if (m124316k() && (a = C43284j.f101049e.mo101982a()) != null) {
                return a;
            }
            C43282i a3 = C43282i.f101047d.mo101980a();
            if (a3 != null) {
                return a3;
            }
            C43286k a4 = C43277f.f101038i.mo101979a();
            if (a4 != null) {
                return a4;
            }
            return new C43286k();
        }

        /* access modifiers changed from: private */
        /* renamed from: f */
        public final C43286k m124313f() {
            if (mo101989h()) {
                return m124311d();
            }
            return m124312e();
        }

        /* renamed from: i */
        private final boolean m124314i() {
            return C41536l.m120484d("BC", Security.getProviders()[0].getName());
        }

        /* renamed from: j */
        private final boolean m124315j() {
            return C41536l.m120484d("Conscrypt", Security.getProviders()[0].getName());
        }

        /* renamed from: k */
        private final boolean m124316k() {
            return C41536l.m120484d("OpenJSSE", Security.getProviders()[0].getName());
        }

        /* renamed from: b */
        public final List mo101986b(List list) {
            boolean z;
            C41536l.m120489i(list, "protocols");
            ArrayList<C41864a0> arrayList = new ArrayList<>();
            for (Object next : list) {
                if (((C41864a0) next) != C41864a0.HTTP_1_0) {
                    z = true;
                } else {
                    z = false;
                }
                if (z) {
                    arrayList.add(next);
                }
            }
            ArrayList arrayList2 = new ArrayList(C41343r.m119925u(arrayList, 10));
            for (C41864a0 a0Var : arrayList) {
                arrayList2.add(a0Var.toString());
            }
            return arrayList2;
        }

        /* renamed from: c */
        public final byte[] mo101987c(List list) {
            C41536l.m120489i(list, "protocols");
            C40672b bVar = new C40672b();
            for (String str : mo101986b(list)) {
                bVar.mo94715R0(str.length());
                bVar.mo94728d0(str);
            }
            return bVar.mo94712P0();
        }

        /* renamed from: g */
        public final C43286k mo101988g() {
            return C43286k.f101053b;
        }

        /* renamed from: h */
        public final boolean mo101989h() {
            return C41536l.m120484d("Dalvik", System.getProperty("java.vm.name"));
        }
    }

    static {
        C43287a aVar = new C43287a((DefaultConstructorMarker) null);
        f101052a = aVar;
        f101053b = aVar.m124313f();
    }

    /* renamed from: k */
    public static /* synthetic */ void m124296k(C43286k kVar, String str, int i, Throwable th, int i2, Object obj) {
        if (obj == null) {
            if ((i2 & 2) != 0) {
                i = 4;
            }
            if ((i2 & 4) != 0) {
                th = null;
            }
            kVar.mo101984j(str, i, th);
            return;
        }
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: log");
    }

    /* renamed from: b */
    public void mo101975b(SSLSocket sSLSocket) {
        C41536l.m120489i(sSLSocket, "sslSocket");
    }

    /* renamed from: c */
    public C40309c mo101952c(X509TrustManager x509TrustManager) {
        C41536l.m120489i(x509TrustManager, "trustManager");
        return new C40306a(mo101958d(x509TrustManager));
    }

    /* renamed from: d */
    public C40312e mo101958d(X509TrustManager x509TrustManager) {
        C41536l.m120489i(x509TrustManager, "trustManager");
        X509Certificate[] acceptedIssuers = x509TrustManager.getAcceptedIssuers();
        C41536l.m120488h(acceptedIssuers, "trustManager.acceptedIssuers");
        return new C40308b((X509Certificate[]) Arrays.copyOf(acceptedIssuers, acceptedIssuers.length));
    }

    /* renamed from: e */
    public void mo101953e(SSLSocket sSLSocket, String str, List list) {
        C41536l.m120489i(sSLSocket, "sslSocket");
        C41536l.m120489i(list, "protocols");
    }

    /* renamed from: f */
    public void mo101959f(Socket socket, InetSocketAddress inetSocketAddress, int i) {
        C41536l.m120489i(socket, "socket");
        C41536l.m120489i(inetSocketAddress, "address");
        socket.connect(inetSocketAddress, i);
    }

    /* renamed from: g */
    public String mo101954g(SSLSocket sSLSocket) {
        C41536l.m120489i(sSLSocket, "sslSocket");
        return null;
    }

    /* renamed from: h */
    public Object mo101960h(String str) {
        C41536l.m120489i(str, "closer");
        if (f101054c.isLoggable(Level.FINE)) {
            return new Throwable(str);
        }
        return null;
    }

    /* renamed from: i */
    public boolean mo101955i(String str) {
        C41536l.m120489i(str, "hostname");
        return true;
    }

    /* renamed from: j */
    public void mo101984j(String str, int i, Throwable th) {
        Level level;
        C41536l.m120489i(str, "message");
        if (i == 5) {
            level = Level.WARNING;
        } else {
            level = Level.INFO;
        }
        f101054c.log(level, str, th);
    }

    /* renamed from: l */
    public void mo101961l(String str, Object obj) {
        C41536l.m120489i(str, "message");
        if (obj == null) {
            str = C41536l.m120497q(str, " To see where this was allocated, set the OkHttpClient logger level to FINE: Logger.getLogger(OkHttpClient.class.getName()).setLevel(Level.FINE);");
        }
        mo101984j(str, 5, (Throwable) obj);
    }

    /* renamed from: m */
    public SSLContext mo101967m() {
        SSLContext instance = SSLContext.getInstance("TLS");
        C41536l.m120488h(instance, "getInstance(\"TLS\")");
        return instance;
    }

    /* renamed from: n */
    public SSLSocketFactory mo101971n(X509TrustManager x509TrustManager) {
        C41536l.m120489i(x509TrustManager, "trustManager");
        try {
            SSLContext m = mo101967m();
            m.init((KeyManager[]) null, new TrustManager[]{x509TrustManager}, (SecureRandom) null);
            SSLSocketFactory socketFactory = m.getSocketFactory();
            C41536l.m120488h(socketFactory, "newSSLContext().apply {\n…ll)\n      }.socketFactory");
            return socketFactory;
        } catch (GeneralSecurityException e) {
            throw new AssertionError(C41536l.m120497q("No System TLS: ", e), e);
        }
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
                return (X509TrustManager) trustManager;
            }
            throw new NullPointerException("null cannot be cast to non-null type javax.net.ssl.X509TrustManager");
        }
        String arrays = Arrays.toString(trustManagers);
        C41536l.m120488h(arrays, "toString(this)");
        throw new IllegalStateException(C41536l.m120497q("Unexpected default trust managers: ", arrays).toString());
    }

    public String toString() {
        String simpleName = getClass().getSimpleName();
        C41536l.m120488h(simpleName, "javaClass.simpleName");
        return simpleName;
    }
}
