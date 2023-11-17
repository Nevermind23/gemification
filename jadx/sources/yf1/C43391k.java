package yf1;

import java.util.List;
import javax.net.ssl.SSLSocket;
import kotlin.jvm.internal.C41536l;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.conscrypt.Conscrypt;
import xf1.C43274e;
import xf1.C43286k;
import yf1.C43394l;

/* renamed from: yf1.k */
public final class C43391k implements C43396m {

    /* renamed from: a */
    public static final C43393b f101239a = new C43393b((DefaultConstructorMarker) null);
    /* access modifiers changed from: private */

    /* renamed from: b */
    public static final C43394l.C43395a f101240b = new C43392a();

    /* renamed from: yf1.k$a */
    public static final class C43392a implements C43394l.C43395a {
        C43392a() {
        }

        /* renamed from: b */
        public boolean mo102066b(SSLSocket sSLSocket) {
            C41536l.m120489i(sSLSocket, "sslSocket");
            if (!C43274e.f101034e.mo101974c() || !Conscrypt.isConscrypt(sSLSocket)) {
                return false;
            }
            return true;
        }

        /* renamed from: c */
        public C43396m mo102067c(SSLSocket sSLSocket) {
            C41536l.m120489i(sSLSocket, "sslSocket");
            return new C43391k();
        }
    }

    /* renamed from: yf1.k$b */
    public static final class C43393b {
        private C43393b() {
        }

        public /* synthetic */ C43393b(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* renamed from: a */
        public final C43394l.C43395a mo102072a() {
            return C43391k.f101240b;
        }
    }

    /* renamed from: a */
    public boolean mo102050a() {
        return C43274e.f101034e.mo101974c();
    }

    /* renamed from: b */
    public boolean mo102051b(SSLSocket sSLSocket) {
        C41536l.m120489i(sSLSocket, "sslSocket");
        return Conscrypt.isConscrypt(sSLSocket);
    }

    /* renamed from: c */
    public String mo102052c(SSLSocket sSLSocket) {
        C41536l.m120489i(sSLSocket, "sslSocket");
        if (mo102051b(sSLSocket)) {
            return Conscrypt.getApplicationProtocol(sSLSocket);
        }
        return null;
    }

    /* renamed from: d */
    public void mo102053d(SSLSocket sSLSocket, String str, List list) {
        C41536l.m120489i(sSLSocket, "sslSocket");
        C41536l.m120489i(list, "protocols");
        if (mo102051b(sSLSocket)) {
            Conscrypt.setUseSessionTickets(sSLSocket, true);
            Object[] array = C43286k.f101052a.mo101986b(list).toArray(new String[0]);
            if (array != null) {
                Conscrypt.setApplicationProtocols(sSLSocket, (String[]) array);
                return;
            }
            throw new NullPointerException("null cannot be cast to non-null type kotlin.Array<T of kotlin.collections.ArraysKt__ArraysJVMKt.toTypedArray>");
        }
    }
}
