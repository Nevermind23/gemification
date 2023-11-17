package com.facetec.sdk;

import java.security.NoSuchAlgorithmException;
import java.security.Provider;
import java.util.List;
import javax.net.ssl.SSLContext;
import javax.net.ssl.SSLSocket;
import javax.net.ssl.SSLSocketFactory;
import javax.net.ssl.X509TrustManager;
import org.conscrypt.Conscrypt;

/* renamed from: com.facetec.sdk.mb */
public final class C3417mb extends C3422mg {
    private C3417mb() {
    }

    /* renamed from: e */
    private static Provider m13591e() {
        return Conscrypt.newProviderBuilder().provideTrustManager().build();
    }

    /* renamed from: a */
    public final SSLContext mo9799a() {
        try {
            return SSLContext.getInstance("TLSv1.3", m13591e());
        } catch (NoSuchAlgorithmException e) {
            try {
                return SSLContext.getInstance("TLS", m13591e());
            } catch (NoSuchAlgorithmException unused) {
                throw new IllegalStateException("No TLS provider", e);
            }
        }
    }

    /* renamed from: b */
    public final String mo9781b(SSLSocket sSLSocket) {
        if (Conscrypt.isConscrypt(sSLSocket)) {
            return Conscrypt.getApplicationProtocol(sSLSocket);
        }
        return super.mo9781b(sSLSocket);
    }

    /* renamed from: d */
    public final void mo9782d(SSLSocket sSLSocket, String str, List<C3271jv> list) {
        if (Conscrypt.isConscrypt(sSLSocket)) {
            if (str != null) {
                Conscrypt.setUseSessionTickets(sSLSocket, true);
                Conscrypt.setHostname(sSLSocket, str);
            }
            Conscrypt.setApplicationProtocols(sSLSocket, (String[]) C3422mg.m13613c(list).toArray(new String[0]));
            return;
        }
        super.mo9782d(sSLSocket, str, list);
    }

    /* renamed from: e */
    public final X509TrustManager mo9784e(SSLSocketFactory sSLSocketFactory) {
        if (!Conscrypt.isConscrypt(sSLSocketFactory)) {
            return super.mo9784e(sSLSocketFactory);
        }
        try {
            Object d = C3422mg.m13614d((Object) sSLSocketFactory, Object.class, "sslParameters");
            if (d != null) {
                return (X509TrustManager) C3422mg.m13614d(d, X509TrustManager.class, "x509TrustManager");
            }
            return null;
        } catch (Exception e) {
            throw new UnsupportedOperationException("clientBuilder.sslSocketFactory(SSLSocketFactory) not supported on Conscrypt", e);
        }
    }

    /* renamed from: d */
    public static C3417mb m13590d() {
        try {
            Class.forName("org.conscrypt.Conscrypt");
            if (!Conscrypt.isAvailable()) {
                return null;
            }
            return new C3417mb();
        } catch (ClassNotFoundException unused) {
            return null;
        }
    }

    /* renamed from: d */
    public final void mo9814d(SSLSocketFactory sSLSocketFactory) {
        if (Conscrypt.isConscrypt(sSLSocketFactory)) {
            Conscrypt.setUseEngineSocket(sSLSocketFactory, true);
        }
    }
}
