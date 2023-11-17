package tf1;

import java.io.IOException;
import java.io.InterruptedIOException;
import java.net.ProtocolException;
import java.net.UnknownServiceException;
import java.security.cert.CertificateException;
import java.util.Arrays;
import java.util.List;
import javax.net.ssl.SSLException;
import javax.net.ssl.SSLHandshakeException;
import javax.net.ssl.SSLPeerUnverifiedException;
import javax.net.ssl.SSLSocket;
import kotlin.jvm.internal.C41536l;
import of1.C41904l;

/* renamed from: tf1.b */
public final class C42997b {

    /* renamed from: a */
    private final List f100345a;

    /* renamed from: b */
    private int f100346b;

    /* renamed from: c */
    private boolean f100347c;

    /* renamed from: d */
    private boolean f100348d;

    public C42997b(List list) {
        C41536l.m120489i(list, "connectionSpecs");
        this.f100345a = list;
    }

    /* renamed from: c */
    private final boolean m123352c(SSLSocket sSLSocket) {
        int i = this.f100346b;
        int size = this.f100345a.size();
        while (i < size) {
            int i2 = i + 1;
            if (((C41904l) this.f100345a.get(i)).mo96836e(sSLSocket)) {
                return true;
            }
            i = i2;
        }
        return false;
    }

    /* renamed from: a */
    public final C41904l mo101505a(SSLSocket sSLSocket) {
        C41904l lVar;
        C41536l.m120489i(sSLSocket, "sslSocket");
        int i = this.f100346b;
        int size = this.f100345a.size();
        while (true) {
            if (i >= size) {
                lVar = null;
                break;
            }
            int i2 = i + 1;
            lVar = (C41904l) this.f100345a.get(i);
            if (lVar.mo96836e(sSLSocket)) {
                this.f100346b = i2;
                break;
            }
            i = i2;
        }
        if (lVar != null) {
            this.f100347c = m123352c(sSLSocket);
            lVar.mo96834c(sSLSocket, this.f100348d);
            return lVar;
        }
        StringBuilder sb = new StringBuilder();
        sb.append("Unable to find acceptable protocols. isFallback=");
        sb.append(this.f100348d);
        sb.append(", modes=");
        sb.append(this.f100345a);
        sb.append(", supported protocols=");
        String[] enabledProtocols = sSLSocket.getEnabledProtocols();
        C41536l.m120486f(enabledProtocols);
        String arrays = Arrays.toString(enabledProtocols);
        C41536l.m120488h(arrays, "toString(this)");
        sb.append(arrays);
        throw new UnknownServiceException(sb.toString());
    }

    /* renamed from: b */
    public final boolean mo101506b(IOException iOException) {
        C41536l.m120489i(iOException, "e");
        this.f100348d = true;
        if (this.f100347c && !(iOException instanceof ProtocolException) && !(iOException instanceof InterruptedIOException) && ((!(iOException instanceof SSLHandshakeException) || !(iOException.getCause() instanceof CertificateException)) && !(iOException instanceof SSLPeerUnverifiedException) && (iOException instanceof SSLException))) {
            return true;
        }
        return false;
    }
}
