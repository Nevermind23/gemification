package yf1;

import ag1.C40309c;
import android.net.http.X509TrustManagerExtensions;
import java.security.cert.CertificateException;
import java.security.cert.X509Certificate;
import java.util.List;
import javax.net.ssl.SSLPeerUnverifiedException;
import javax.net.ssl.X509TrustManager;
import kotlin.jvm.internal.C41536l;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* renamed from: yf1.d */
public final class C43378d extends C40309c {

    /* renamed from: d */
    public static final C43379a f101218d = new C43379a((DefaultConstructorMarker) null);

    /* renamed from: b */
    private final X509TrustManager f101219b;

    /* renamed from: c */
    private final X509TrustManagerExtensions f101220c;

    /* renamed from: yf1.d$a */
    public static final class C43379a {
        private C43379a() {
        }

        public /* synthetic */ C43379a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* renamed from: a */
        public final C43378d mo102058a(X509TrustManager x509TrustManager) {
            X509TrustManagerExtensions x509TrustManagerExtensions;
            C41536l.m120489i(x509TrustManager, "trustManager");
            try {
                x509TrustManagerExtensions = new X509TrustManagerExtensions(x509TrustManager);
            } catch (IllegalArgumentException unused) {
                x509TrustManagerExtensions = null;
            }
            if (x509TrustManagerExtensions != null) {
                return new C43378d(x509TrustManager, x509TrustManagerExtensions);
            }
            return null;
        }
    }

    public C43378d(X509TrustManager x509TrustManager, X509TrustManagerExtensions x509TrustManagerExtensions) {
        C41536l.m120489i(x509TrustManager, "trustManager");
        C41536l.m120489i(x509TrustManagerExtensions, "x509TrustManagerExtensions");
        this.f101219b = x509TrustManager;
        this.f101220c = x509TrustManagerExtensions;
    }

    /* renamed from: a */
    public List mo94334a(List list, String str) {
        C41536l.m120489i(list, "chain");
        C41536l.m120489i(str, "hostname");
        Object[] array = list.toArray(new X509Certificate[0]);
        if (array != null) {
            try {
                List<X509Certificate> checkServerTrusted = this.f101220c.checkServerTrusted((X509Certificate[]) array, "RSA", str);
                C41536l.m120488h(checkServerTrusted, "x509TrustManagerExtensio…ficates, \"RSA\", hostname)");
                return checkServerTrusted;
            } catch (CertificateException e) {
                SSLPeerUnverifiedException sSLPeerUnverifiedException = new SSLPeerUnverifiedException(e.getMessage());
                sSLPeerUnverifiedException.initCause(e);
                throw sSLPeerUnverifiedException;
            }
        } else {
            throw new NullPointerException("null cannot be cast to non-null type kotlin.Array<T of kotlin.collections.ArraysKt__ArraysJVMKt.toTypedArray>");
        }
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof C43378d) || ((C43378d) obj).f101219b != this.f101219b) {
            return false;
        }
        return true;
    }

    public int hashCode() {
        return System.identityHashCode(this.f101219b);
    }
}
