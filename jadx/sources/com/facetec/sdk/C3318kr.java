package com.facetec.sdk;

import java.io.IOException;
import java.io.InterruptedIOException;
import java.net.ProtocolException;
import java.security.cert.CertificateException;
import java.util.List;
import javax.net.ssl.SSLException;
import javax.net.ssl.SSLHandshakeException;
import javax.net.ssl.SSLPeerUnverifiedException;
import javax.net.ssl.SSLProtocolException;
import javax.net.ssl.SSLSocket;

/* renamed from: com.facetec.sdk.kr */
public final class C3318kr {

    /* renamed from: a */
    boolean f10901a;

    /* renamed from: b */
    final List<C3252jm> f10902b;

    /* renamed from: c */
    int f10903c = 0;

    /* renamed from: e */
    boolean f10904e;

    public C3318kr(List<C3252jm> list) {
        this.f10902b = list;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: d */
    public final boolean mo9653d(SSLSocket sSLSocket) {
        for (int i = this.f10903c; i < this.f10902b.size(); i++) {
            if (this.f10902b.get(i).mo9469c(sSLSocket)) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: e */
    public final boolean mo9654e(IOException iOException) {
        this.f10901a = true;
        if (!this.f10904e || (iOException instanceof ProtocolException) || (iOException instanceof InterruptedIOException)) {
            return false;
        }
        boolean z = iOException instanceof SSLHandshakeException;
        if ((z && (iOException.getCause() instanceof CertificateException)) || (iOException instanceof SSLPeerUnverifiedException)) {
            return false;
        }
        if (z || (iOException instanceof SSLProtocolException) || (iOException instanceof SSLException)) {
            return true;
        }
        return false;
    }
}
