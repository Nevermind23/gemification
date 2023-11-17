package com.facetec.sdk;

import java.net.InetAddress;
import java.net.Socket;
import javax.net.ssl.SSLSocket;
import javax.net.ssl.SSLSocketFactory;

/* renamed from: com.facetec.sdk.df */
final class C2943df extends SSLSocketFactory {

    /* renamed from: e */
    private static final String[] f9881e = {"TLSv1.2"};
    private final SSLSocketFactory delegate;

    public C2943df(SSLSocketFactory sSLSocketFactory) {
        this.delegate = sSLSocketFactory;
    }

    /* renamed from: e */
    private static Socket m12464e(Socket socket) {
        if (socket instanceof SSLSocket) {
            ((SSLSocket) socket).setEnabledProtocols(f9881e);
        }
        return socket;
    }

    public final Socket createSocket(Socket socket, String str, int i, boolean z) {
        return m12464e(this.delegate.createSocket(socket, str, i, z));
    }

    public final String[] getDefaultCipherSuites() {
        return this.delegate.getDefaultCipherSuites();
    }

    public final String[] getSupportedCipherSuites() {
        return this.delegate.getSupportedCipherSuites();
    }

    public final Socket createSocket(String str, int i) {
        return m12464e(this.delegate.createSocket(str, i));
    }

    public final Socket createSocket(String str, int i, InetAddress inetAddress, int i2) {
        return m12464e(this.delegate.createSocket(str, i, inetAddress, i2));
    }

    public final Socket createSocket(InetAddress inetAddress, int i) {
        return m12464e(this.delegate.createSocket(inetAddress, i));
    }

    public final Socket createSocket(InetAddress inetAddress, int i, InetAddress inetAddress2, int i2) {
        return m12464e(this.delegate.createSocket(inetAddress, i, inetAddress2, i2));
    }
}
