package com.facetec.sdk;

import java.security.cert.CertificateParsingException;
import java.security.cert.X509Certificate;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.Locale;
import javax.net.ssl.HostnameVerifier;
import javax.net.ssl.SSLException;
import javax.net.ssl.SSLSession;

/* renamed from: com.facetec.sdk.mj */
public final class C3425mj implements HostnameVerifier {

    /* renamed from: e */
    public static final C3425mj f11248e = new C3425mj();

    private C3425mj() {
    }

    /* renamed from: b */
    public static boolean m13632b(String str, X509Certificate x509Certificate) {
        if (C3303ki.m13245a(str)) {
            return m13637d(str, x509Certificate);
        }
        return m13634c(str, x509Certificate);
    }

    /* renamed from: c */
    private static boolean m13634c(String str, X509Certificate x509Certificate) {
        String lowerCase = str.toLowerCase(Locale.US);
        for (String d : m13633c(x509Certificate, 2)) {
            if (m13636d(lowerCase, d)) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: d */
    private static boolean m13637d(String str, X509Certificate x509Certificate) {
        List<String> c = m13633c(x509Certificate, 7);
        int size = c.size();
        for (int i = 0; i < size; i++) {
            if (str.equalsIgnoreCase(c.get(i))) {
                return true;
            }
        }
        return false;
    }

    public final boolean verify(String str, SSLSession sSLSession) {
        try {
            return m13632b(str, (X509Certificate) sSLSession.getPeerCertificates()[0]);
        } catch (SSLException unused) {
            return false;
        }
    }

    /* renamed from: d */
    public static List<String> m13635d(X509Certificate x509Certificate) {
        List<String> c = m13633c(x509Certificate, 7);
        List<String> c2 = m13633c(x509Certificate, 2);
        ArrayList arrayList = new ArrayList(c.size() + c2.size());
        arrayList.addAll(c);
        arrayList.addAll(c2);
        return arrayList;
    }

    /* renamed from: c */
    private static List<String> m13633c(X509Certificate x509Certificate, int i) {
        Integer num;
        String str;
        ArrayList arrayList = new ArrayList();
        try {
            Collection<List<?>> subjectAlternativeNames = x509Certificate.getSubjectAlternativeNames();
            if (subjectAlternativeNames == null) {
                return Collections.emptyList();
            }
            for (List next : subjectAlternativeNames) {
                if (!(next == null || next.size() < 2 || (num = (Integer) next.get(0)) == null || num.intValue() != i || (str = (String) next.get(1)) == null)) {
                    arrayList.add(str);
                }
            }
            return arrayList;
        } catch (CertificateParsingException unused) {
            return Collections.emptyList();
        }
    }

    /* renamed from: d */
    private static boolean m13636d(String str, String str2) {
        if (str != null && str.length() != 0 && !str.startsWith(".") && !str.endsWith("..") && str2 != null && str2.length() != 0 && !str2.startsWith(".") && !str2.endsWith("..")) {
            if (!str.endsWith(".")) {
                StringBuilder sb = new StringBuilder();
                sb.append(str);
                sb.append('.');
                str = sb.toString();
            }
            if (!str2.endsWith(".")) {
                StringBuilder sb2 = new StringBuilder();
                sb2.append(str2);
                sb2.append('.');
                str2 = sb2.toString();
            }
            String lowerCase = str2.toLowerCase(Locale.US);
            if (!lowerCase.contains("*")) {
                return str.equals(lowerCase);
            }
            if (!lowerCase.startsWith("*.") || lowerCase.indexOf(42, 1) != -1 || str.length() < lowerCase.length() || "*.".equals(lowerCase)) {
                return false;
            }
            String substring = lowerCase.substring(1);
            if (!str.endsWith(substring)) {
                return false;
            }
            int length = str.length() - substring.length();
            if (length <= 0 || str.lastIndexOf(46, length - 1) == -1) {
                return true;
            }
            return false;
        }
        return false;
    }
}
