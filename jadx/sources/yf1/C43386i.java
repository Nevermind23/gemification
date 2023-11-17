package yf1;

import java.util.List;
import javax.net.ssl.SSLSocket;
import kotlin.jvm.internal.C41536l;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.bouncycastle.jsse.BCSSLParameters;
import org.bouncycastle.jsse.BCSSLSocket;
import xf1.C43272d;
import xf1.C43286k;
import yf1.C43394l;

/* renamed from: yf1.i */
public final class C43386i implements C43396m {

    /* renamed from: a */
    public static final C43388b f101233a = new C43388b((DefaultConstructorMarker) null);
    /* access modifiers changed from: private */

    /* renamed from: b */
    public static final C43394l.C43395a f101234b = new C43387a();

    /* renamed from: yf1.i$a */
    public static final class C43387a implements C43394l.C43395a {
        C43387a() {
        }

        /* renamed from: b */
        public boolean mo102066b(SSLSocket sSLSocket) {
            C41536l.m120489i(sSLSocket, "sslSocket");
            if (!C43272d.f101031e.mo101970b() || !(sSLSocket instanceof BCSSLSocket)) {
                return false;
            }
            return true;
        }

        /* renamed from: c */
        public C43396m mo102067c(SSLSocket sSLSocket) {
            C41536l.m120489i(sSLSocket, "sslSocket");
            return new C43386i();
        }
    }

    /* renamed from: yf1.i$b */
    public static final class C43388b {
        private C43388b() {
        }

        public /* synthetic */ C43388b(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* renamed from: a */
        public final C43394l.C43395a mo102068a() {
            return C43386i.f101234b;
        }
    }

    /* renamed from: a */
    public boolean mo102050a() {
        return C43272d.f101031e.mo101970b();
    }

    /* renamed from: b */
    public boolean mo102051b(SSLSocket sSLSocket) {
        C41536l.m120489i(sSLSocket, "sslSocket");
        return sSLSocket instanceof BCSSLSocket;
    }

    /* renamed from: c */
    public String mo102052c(SSLSocket sSLSocket) {
        boolean z;
        C41536l.m120489i(sSLSocket, "sslSocket");
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

    /* renamed from: d */
    public void mo102053d(SSLSocket sSLSocket, String str, List list) {
        C41536l.m120489i(sSLSocket, "sslSocket");
        C41536l.m120489i(list, "protocols");
        if (mo102051b(sSLSocket)) {
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
    }
}
