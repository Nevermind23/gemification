package com.facetec.sdk;

import java.security.cert.Certificate;
import java.security.cert.X509Certificate;
import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import javax.net.ssl.SSLPeerUnverifiedException;

/* renamed from: com.facetec.sdk.jh */
public final class C3244jh {

    /* renamed from: c */
    public static final C3244jh f10598c = new C3244jh(new LinkedHashSet(new C3245c().f10601c), (C3430ml) null);

    /* renamed from: a */
    final C3430ml f10599a;

    /* renamed from: e */
    final Set<C3246e> f10600e;

    /* renamed from: com.facetec.sdk.jh$c */
    public static final class C3245c {

        /* renamed from: c */
        final List<C3246e> f10601c = new ArrayList();
    }

    /* renamed from: com.facetec.sdk.jh$e */
    static final class C3246e {

        /* renamed from: a */
        private String f10602a;

        /* renamed from: c */
        final String f10603c;

        /* renamed from: d */
        private String f10604d;

        /* renamed from: e */
        final C3435mq f10605e;

        /* access modifiers changed from: package-private */
        /* renamed from: b */
        public final boolean mo9456b(String str) {
            if (!this.f10602a.startsWith("*.")) {
                return str.equals(this.f10604d);
            }
            int indexOf = str.indexOf(46);
            if ((str.length() - indexOf) - 1 != this.f10604d.length()) {
                return false;
            }
            String str2 = this.f10604d;
            if (str.regionMatches(false, indexOf + 1, str2, 0, str2.length())) {
                return true;
            }
            return false;
        }

        public final boolean equals(Object obj) {
            if (!(obj instanceof C3246e)) {
                return false;
            }
            C3246e eVar = (C3246e) obj;
            if (!this.f10602a.equals(eVar.f10602a) || !this.f10603c.equals(eVar.f10603c) || !this.f10605e.equals(eVar.f10605e)) {
                return false;
            }
            return true;
        }

        public final int hashCode() {
            return ((((this.f10602a.hashCode() + 527) * 31) + this.f10603c.hashCode()) * 31) + this.f10605e.hashCode();
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append(this.f10603c);
            sb.append(this.f10605e.mo9901d());
            return sb.toString();
        }
    }

    C3244jh(Set<C3246e> set, C3430ml mlVar) {
        this.f10600e = set;
        this.f10599a = mlVar;
    }

    /* renamed from: c */
    private static C3435mq m13016c(X509Certificate x509Certificate) {
        return C3435mq.m13744d(x509Certificate.getPublicKey().getEncoded()).mo9897c();
    }

    /* renamed from: d */
    public static String m13017d(Certificate certificate) {
        if (certificate instanceof X509Certificate) {
            StringBuilder sb = new StringBuilder("sha256/");
            sb.append(m13016c((X509Certificate) certificate).mo9901d());
            return sb.toString();
        }
        throw new IllegalArgumentException("Certificate pinning requires X509 certificates");
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C3244jh)) {
            return false;
        }
        C3244jh jhVar = (C3244jh) obj;
        if (!C3303ki.m13274e((Object) this.f10599a, (Object) jhVar.f10599a) || !this.f10600e.equals(jhVar.f10600e)) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        int i;
        C3430ml mlVar = this.f10599a;
        if (mlVar != null) {
            i = mlVar.hashCode();
        } else {
            i = 0;
        }
        return (i * 31) + this.f10600e.hashCode();
    }

    /* renamed from: c */
    public final void mo9453c(String str, List<Certificate> list) {
        List emptyList = Collections.emptyList();
        for (C3246e next : this.f10600e) {
            if (next.mo9456b(str)) {
                if (emptyList.isEmpty()) {
                    emptyList = new ArrayList();
                }
                emptyList.add(next);
            }
        }
        if (!emptyList.isEmpty()) {
            C3430ml mlVar = this.f10599a;
            if (mlVar != null) {
                list = mlVar.mo9806c(list, str);
            }
            int size = list.size();
            for (int i = 0; i < size; i++) {
                X509Certificate x509Certificate = (X509Certificate) list.get(i);
                int size2 = emptyList.size();
                C3435mq mqVar = null;
                C3435mq mqVar2 = null;
                for (int i2 = 0; i2 < size2; i2++) {
                    C3246e eVar = (C3246e) emptyList.get(i2);
                    if (eVar.f10603c.equals("sha256/")) {
                        if (mqVar == null) {
                            mqVar = m13016c(x509Certificate);
                        }
                        if (eVar.f10605e.equals(mqVar)) {
                            return;
                        }
                    } else if (eVar.f10603c.equals("sha1/")) {
                        if (mqVar2 == null) {
                            mqVar2 = C3435mq.m13744d(x509Certificate.getPublicKey().getEncoded()).mo9893a();
                        }
                        if (eVar.f10605e.equals(mqVar2)) {
                            return;
                        }
                    } else {
                        StringBuilder sb = new StringBuilder("unsupported hashAlgorithm: ");
                        sb.append(eVar.f10603c);
                        throw new AssertionError(sb.toString());
                    }
                }
            }
            StringBuilder sb2 = new StringBuilder("Certificate pinning failure!\n  Peer certificate chain:");
            int size3 = list.size();
            for (int i3 = 0; i3 < size3; i3++) {
                X509Certificate x509Certificate2 = (X509Certificate) list.get(i3);
                sb2.append("\n    ");
                sb2.append(m13017d(x509Certificate2));
                sb2.append(": ");
                sb2.append(x509Certificate2.getSubjectDN().getName());
            }
            sb2.append("\n  Pinned certificates for ");
            sb2.append(str);
            sb2.append(":");
            int size4 = emptyList.size();
            for (int i4 = 0; i4 < size4; i4++) {
                sb2.append("\n    ");
                sb2.append((C3246e) emptyList.get(i4));
            }
            throw new SSLPeerUnverifiedException(sb2.toString());
        }
    }
}
