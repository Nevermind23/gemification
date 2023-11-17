package com.facetec.sdk;

import java.io.IOException;
import java.security.cert.Certificate;
import java.util.Collections;
import java.util.List;
import javax.net.ssl.SSLPeerUnverifiedException;
import javax.net.ssl.SSLSession;

/* renamed from: com.facetec.sdk.jq */
public final class C3259jq {

    /* renamed from: a */
    private final List<Certificate> f10650a;

    /* renamed from: c */
    private final C3299ke f10651c;

    /* renamed from: d */
    public final C3242jg f10652d;

    /* renamed from: e */
    private final List<Certificate> f10653e;

    private C3259jq(C3299ke keVar, C3242jg jgVar, List<Certificate> list, List<Certificate> list2) {
        this.f10651c = keVar;
        this.f10652d = jgVar;
        this.f10650a = list;
        this.f10653e = list2;
    }

    /* renamed from: b */
    public static C3259jq m13049b(SSLSession sSLSession) {
        Certificate[] certificateArr;
        List list;
        List list2;
        String cipherSuite = sSLSession.getCipherSuite();
        if (cipherSuite == null) {
            throw new IllegalStateException("cipherSuite == null");
        } else if (!"SSL_NULL_WITH_NULL_NULL".equals(cipherSuite)) {
            C3242jg b = C3242jg.m13014b(cipherSuite);
            String protocol = sSLSession.getProtocol();
            if (protocol == null) {
                throw new IllegalStateException("tlsVersion == null");
            } else if (!"NONE".equals(protocol)) {
                C3299ke d = C3299ke.m13223d(protocol);
                try {
                    certificateArr = sSLSession.getPeerCertificates();
                } catch (SSLPeerUnverifiedException unused) {
                    certificateArr = null;
                }
                if (certificateArr != null) {
                    list = C3303ki.m13273e((T[]) certificateArr);
                } else {
                    list = Collections.emptyList();
                }
                Certificate[] localCertificates = sSLSession.getLocalCertificates();
                if (localCertificates != null) {
                    list2 = C3303ki.m13273e((T[]) localCertificates);
                } else {
                    list2 = Collections.emptyList();
                }
                return new C3259jq(d, b, list, list2);
            } else {
                throw new IOException("tlsVersion == NONE");
            }
        } else {
            throw new IOException("cipherSuite == SSL_NULL_WITH_NULL_NULL");
        }
    }

    /* renamed from: d */
    public final List<Certificate> mo9484d() {
        return this.f10650a;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C3259jq)) {
            return false;
        }
        C3259jq jqVar = (C3259jq) obj;
        if (!this.f10651c.equals(jqVar.f10651c) || !this.f10652d.equals(jqVar.f10652d) || !this.f10650a.equals(jqVar.f10650a) || !this.f10653e.equals(jqVar.f10653e)) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return ((((((this.f10651c.hashCode() + 527) * 31) + this.f10652d.hashCode()) * 31) + this.f10650a.hashCode()) * 31) + this.f10653e.hashCode();
    }
}
