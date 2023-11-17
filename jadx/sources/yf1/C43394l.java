package yf1;

import java.util.List;
import javax.net.ssl.SSLSocket;
import kotlin.jvm.internal.C41536l;

/* renamed from: yf1.l */
public final class C43394l implements C43396m {

    /* renamed from: a */
    private final C43395a f101241a;

    /* renamed from: b */
    private C43396m f101242b;

    /* renamed from: yf1.l$a */
    public interface C43395a {
        /* renamed from: b */
        boolean mo102066b(SSLSocket sSLSocket);

        /* renamed from: c */
        C43396m mo102067c(SSLSocket sSLSocket);
    }

    public C43394l(C43395a aVar) {
        C41536l.m120489i(aVar, "socketAdapterFactory");
        this.f101241a = aVar;
    }

    /* renamed from: e */
    private final synchronized C43396m m124485e(SSLSocket sSLSocket) {
        if (this.f101242b == null && this.f101241a.mo102066b(sSLSocket)) {
            this.f101242b = this.f101241a.mo102067c(sSLSocket);
        }
        return this.f101242b;
    }

    /* renamed from: a */
    public boolean mo102050a() {
        return true;
    }

    /* renamed from: b */
    public boolean mo102051b(SSLSocket sSLSocket) {
        C41536l.m120489i(sSLSocket, "sslSocket");
        return this.f101241a.mo102066b(sSLSocket);
    }

    /* renamed from: c */
    public String mo102052c(SSLSocket sSLSocket) {
        C41536l.m120489i(sSLSocket, "sslSocket");
        C43396m e = m124485e(sSLSocket);
        if (e == null) {
            return null;
        }
        return e.mo102052c(sSLSocket);
    }

    /* renamed from: d */
    public void mo102053d(SSLSocket sSLSocket, String str, List list) {
        C41536l.m120489i(sSLSocket, "sslSocket");
        C41536l.m120489i(list, "protocols");
        C43396m e = m124485e(sSLSocket);
        if (e != null) {
            e.mo102053d(sSLSocket, str, list);
        }
    }
}
