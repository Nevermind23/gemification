package com.facetec.sdk;

import java.security.cert.X509Certificate;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Set;
import javax.security.auth.x500.X500Principal;

/* renamed from: com.facetec.sdk.mh */
public final class C3423mh implements C3424mi {

    /* renamed from: a */
    private final Map<X500Principal, Set<X509Certificate>> f11247a = new LinkedHashMap();

    public C3423mh(X509Certificate... x509CertificateArr) {
        for (X509Certificate x509Certificate : x509CertificateArr) {
            X500Principal subjectX500Principal = x509Certificate.getSubjectX500Principal();
            Set set = this.f11247a.get(subjectX500Principal);
            if (set == null) {
                set = new LinkedHashSet(1);
                this.f11247a.put(subjectX500Principal, set);
            }
            set.add(x509Certificate);
        }
    }

    /* renamed from: a */
    public final X509Certificate mo9811a(X509Certificate x509Certificate) {
        Set<X509Certificate> set = this.f11247a.get(x509Certificate.getIssuerX500Principal());
        if (set == null) {
            return null;
        }
        for (X509Certificate x509Certificate2 : set) {
            try {
                x509Certificate.verify(x509Certificate2.getPublicKey());
                return x509Certificate2;
            } catch (Exception unused) {
            }
        }
        return null;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C3423mh) || !((C3423mh) obj).f11247a.equals(this.f11247a)) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return this.f11247a.hashCode();
    }
}
