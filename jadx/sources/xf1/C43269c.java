package xf1;

import ag1.C40309c;
import ag1.C40312e;
import android.os.Build;
import android.security.NetworkSecurityPolicy;
import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.net.InetSocketAddress;
import java.net.Socket;
import java.security.cert.TrustAnchor;
import java.security.cert.X509Certificate;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import javax.net.ssl.SSLSocket;
import javax.net.ssl.X509TrustManager;
import kotlin.jvm.internal.C41536l;
import kotlin.jvm.internal.DefaultConstructorMarker;
import yf1.C43378d;
import yf1.C43383h;
import yf1.C43386i;
import yf1.C43389j;
import yf1.C43391k;
import yf1.C43394l;
import yf1.C43396m;
import yf1.C43397n;

/* renamed from: xf1.c */
public final class C43269c extends C43286k {

    /* renamed from: f */
    public static final C43270a f101025f = new C43270a((DefaultConstructorMarker) null);
    /* access modifiers changed from: private */

    /* renamed from: g */
    public static final boolean f101026g;

    /* renamed from: d */
    private final List f101027d;

    /* renamed from: e */
    private final C43389j f101028e;

    /* renamed from: xf1.c$a */
    public static final class C43270a {
        private C43270a() {
        }

        public /* synthetic */ C43270a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* renamed from: a */
        public final C43286k mo101962a() {
            if (mo101963b()) {
                return new C43269c();
            }
            return null;
        }

        /* renamed from: b */
        public final boolean mo101963b() {
            return C43269c.f101026g;
        }
    }

    /* renamed from: xf1.c$b */
    public static final class C43271b implements C40312e {

        /* renamed from: a */
        private final X509TrustManager f101029a;

        /* renamed from: b */
        private final Method f101030b;

        public C43271b(X509TrustManager x509TrustManager, Method method) {
            C41536l.m120489i(x509TrustManager, "trustManager");
            C41536l.m120489i(method, "findByIssuerAndSignatureMethod");
            this.f101029a = x509TrustManager;
            this.f101030b = method;
        }

        /* renamed from: a */
        public X509Certificate mo94337a(X509Certificate x509Certificate) {
            C41536l.m120489i(x509Certificate, "cert");
            try {
                Object invoke = this.f101030b.invoke(this.f101029a, new Object[]{x509Certificate});
                if (invoke != null) {
                    return ((TrustAnchor) invoke).getTrustedCert();
                }
                throw new NullPointerException("null cannot be cast to non-null type java.security.cert.TrustAnchor");
            } catch (IllegalAccessException e) {
                throw new AssertionError("unable to get issues and signature", e);
            } catch (InvocationTargetException unused) {
                return null;
            }
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C43271b)) {
                return false;
            }
            C43271b bVar = (C43271b) obj;
            return C41536l.m120484d(this.f101029a, bVar.f101029a) && C41536l.m120484d(this.f101030b, bVar.f101030b);
        }

        public int hashCode() {
            return (this.f101029a.hashCode() * 31) + this.f101030b.hashCode();
        }

        public String toString() {
            return "CustomTrustRootIndex(trustManager=" + this.f101029a + ", findByIssuerAndSignatureMethod=" + this.f101030b + ')';
        }
    }

    static {
        boolean z = false;
        if (C43286k.f101052a.mo101989h() && Build.VERSION.SDK_INT < 30) {
            z = true;
        }
        f101026g = z;
    }

    public C43269c() {
        List o = C41341q.m119912o(C43397n.C43398a.m124496b(C43397n.f101243j, (String) null, 1, (Object) null), new C43394l(C43383h.f101225f.mo102065d()), new C43394l(C43391k.f101239a.mo102072a()), new C43394l(C43386i.f101233a.mo102068a()));
        ArrayList arrayList = new ArrayList();
        for (Object next : o) {
            if (((C43396m) next).mo102050a()) {
                arrayList.add(next);
            }
        }
        this.f101027d = arrayList;
        this.f101028e = C43389j.f101235d.mo102071a();
    }

    /* renamed from: c */
    public C40309c mo101952c(X509TrustManager x509TrustManager) {
        C41536l.m120489i(x509TrustManager, "trustManager");
        C43378d a = C43378d.f101218d.mo102058a(x509TrustManager);
        if (a == null) {
            return super.mo101952c(x509TrustManager);
        }
        return a;
    }

    /* renamed from: d */
    public C40312e mo101958d(X509TrustManager x509TrustManager) {
        C41536l.m120489i(x509TrustManager, "trustManager");
        try {
            Method declaredMethod = x509TrustManager.getClass().getDeclaredMethod("findTrustAnchorByIssuerAndSignature", new Class[]{X509Certificate.class});
            declaredMethod.setAccessible(true);
            C41536l.m120488h(declaredMethod, "method");
            return new C43271b(x509TrustManager, declaredMethod);
        } catch (NoSuchMethodException unused) {
            return super.mo101958d(x509TrustManager);
        }
    }

    /* renamed from: e */
    public void mo101953e(SSLSocket sSLSocket, String str, List list) {
        Object obj;
        C41536l.m120489i(sSLSocket, "sslSocket");
        C41536l.m120489i(list, "protocols");
        Iterator it = this.f101027d.iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            }
            obj = it.next();
            if (((C43396m) obj).mo102051b(sSLSocket)) {
                break;
            }
        }
        C43396m mVar = (C43396m) obj;
        if (mVar != null) {
            mVar.mo102053d(sSLSocket, str, list);
        }
    }

    /* renamed from: f */
    public void mo101959f(Socket socket, InetSocketAddress inetSocketAddress, int i) {
        C41536l.m120489i(socket, "socket");
        C41536l.m120489i(inetSocketAddress, "address");
        try {
            socket.connect(inetSocketAddress, i);
        } catch (ClassCastException e) {
            if (Build.VERSION.SDK_INT == 26) {
                throw new IOException("Exception in connect", e);
            }
            throw e;
        }
    }

    /* renamed from: g */
    public String mo101954g(SSLSocket sSLSocket) {
        Object obj;
        C41536l.m120489i(sSLSocket, "sslSocket");
        Iterator it = this.f101027d.iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            }
            obj = it.next();
            if (((C43396m) obj).mo102051b(sSLSocket)) {
                break;
            }
        }
        C43396m mVar = (C43396m) obj;
        if (mVar == null) {
            return null;
        }
        return mVar.mo102052c(sSLSocket);
    }

    /* renamed from: h */
    public Object mo101960h(String str) {
        C41536l.m120489i(str, "closer");
        return this.f101028e.mo102069a(str);
    }

    /* renamed from: i */
    public boolean mo101955i(String str) {
        C41536l.m120489i(str, "hostname");
        if (Build.VERSION.SDK_INT >= 24) {
            return NetworkSecurityPolicy.getInstance().isCleartextTrafficPermitted(str);
        }
        return NetworkSecurityPolicy.getInstance().isCleartextTrafficPermitted();
    }

    /* renamed from: l */
    public void mo101961l(String str, Object obj) {
        C41536l.m120489i(str, "message");
        if (!this.f101028e.mo102070b(obj)) {
            C43286k.m124296k(this, str, 5, (Throwable) null, 4, (Object) null);
        }
    }
}
