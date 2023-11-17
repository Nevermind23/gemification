package com.facetec.sdk;

import java.net.InetAddress;
import java.net.Socket;
import java.security.SecureRandom;
import javax.net.ssl.KeyManager;
import javax.net.ssl.SSLContext;
import javax.net.ssl.SSLSocket;
import javax.net.ssl.SSLSocketFactory;
import javax.net.ssl.TrustManager;

/* renamed from: com.facetec.sdk.cz */
final class C2924cz extends SSLSocketFactory {
    private final SSLSocketFactory delegate;

    public C2924cz() {
        SSLContext instance = SSLContext.getInstance("TLS");
        instance.init((KeyManager[]) null, (TrustManager[]) null, (SecureRandom) null);
        this.delegate = instance.getSocketFactory();
    }

    /* renamed from: e */
    private static Socket m12210e(Socket socket) {
        if (socket != null && (socket instanceof SSLSocket)) {
            ((SSLSocket) socket).setEnabledProtocols(new String[]{"TLSv1.1", "TLSv1.2"});
        }
        return socket;
    }

    public final Socket createSocket() {
        return m12210e(this.delegate.createSocket());
    }

    public final String[] getDefaultCipherSuites() {
        return this.delegate.getDefaultCipherSuites();
    }

    public final String[] getSupportedCipherSuites() {
        return this.delegate.getSupportedCipherSuites();
    }

    public final Socket createSocket(Socket socket, String str, int i, boolean z) {
        return m12210e(this.delegate.createSocket(socket, str, i, z));
    }

    public final Socket createSocket(String str, int i) {
        return m12210e(this.delegate.createSocket(str, i));
    }

    public final Socket createSocket(String str, int i, InetAddress inetAddress, int i2) {
        return m12210e(this.delegate.createSocket(str, i, inetAddress, i2));
    }

    public final Socket createSocket(InetAddress inetAddress, int i) {
        return m12210e(this.delegate.createSocket(inetAddress, i));
    }

    public final Socket createSocket(InetAddress inetAddress, int i, InetAddress inetAddress2, int i2) {
        return m12210e(this.delegate.createSocket(inetAddress, i, inetAddress2, i2));
    }
}
