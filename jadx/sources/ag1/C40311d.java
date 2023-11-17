package ag1;

import dg1.C40676b0;
import java.security.cert.Certificate;
import java.security.cert.CertificateParsingException;
import java.security.cert.X509Certificate;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Locale;
import javax.net.ssl.HostnameVerifier;
import javax.net.ssl.SSLException;
import javax.net.ssl.SSLSession;
import kotlin.jvm.internal.C41536l;
import pf1.C42194a;
import pf1.C42197d;

/* renamed from: ag1.d */
public final class C40311d implements HostnameVerifier {

    /* renamed from: a */
    public static final C40311d f95767a = new C40311d();

    private C40311d() {
    }

    /* renamed from: b */
    private final String m116739b(String str) {
        if (!m116741d(str)) {
            return str;
        }
        Locale locale = Locale.US;
        C41536l.m120488h(locale, "US");
        String lowerCase = str.toLowerCase(locale);
        C41536l.m120488h(lowerCase, "this as java.lang.String).toLowerCase(locale)");
        return lowerCase;
    }

    /* renamed from: c */
    private final List m116740c(X509Certificate x509Certificate, int i) {
        try {
            Collection<List<?>> subjectAlternativeNames = x509Certificate.getSubjectAlternativeNames();
            if (subjectAlternativeNames == null) {
                return C41341q.m119907j();
            }
            ArrayList arrayList = new ArrayList();
            for (List next : subjectAlternativeNames) {
                if (next != null) {
                    if (next.size() >= 2) {
                        if (C41536l.m120484d(next.get(0), Integer.valueOf(i))) {
                            Object obj = next.get(1);
                            if (obj != null) {
                                arrayList.add((String) obj);
                            }
                        }
                    }
                }
            }
            return arrayList;
        } catch (CertificateParsingException unused) {
            return C41341q.m119907j();
        }
    }

    /* renamed from: d */
    private final boolean m116741d(String str) {
        return str.length() == ((int) C40676b0.m117658b(str, 0, 0, 3, (Object) null));
    }

    /* renamed from: f */
    private final boolean m116742f(String str, String str2) {
        boolean z;
        boolean z2;
        if (str == null || str.length() == 0) {
            z = true;
        } else {
            z = false;
        }
        if (!z && !C40439w.m117109H(str, ".", false, 2, (Object) null) && !C40439w.m117114r(str, "..", false, 2, (Object) null)) {
            if (str2 == null || str2.length() == 0) {
                z2 = true;
            } else {
                z2 = false;
            }
            if (!z2 && !C40439w.m117109H(str2, ".", false, 2, (Object) null) && !C40439w.m117114r(str2, "..", false, 2, (Object) null)) {
                if (!C40439w.m117114r(str, ".", false, 2, (Object) null)) {
                    str = C41536l.m120497q(str, ".");
                }
                String str3 = str;
                if (!C40439w.m117114r(str2, ".", false, 2, (Object) null)) {
                    str2 = C41536l.m120497q(str2, ".");
                }
                String b = m116739b(str2);
                if (!C40440x.m117139M(b, "*", false, 2, (Object) null)) {
                    return C41536l.m120484d(str3, b);
                }
                if (!C40439w.m117109H(b, "*.", false, 2, (Object) null) || C40440x.m117155W(b, '*', 1, false, 4, (Object) null) != -1 || str3.length() < b.length() || C41536l.m120484d("*.", b)) {
                    return false;
                }
                String substring = b.substring(1);
                C41536l.m120488h(substring, "this as java.lang.String).substring(startIndex)");
                if (!C40439w.m117114r(str3, substring, false, 2, (Object) null)) {
                    return false;
                }
                int length = str3.length() - substring.length();
                if (length <= 0 || C40440x.m117160b0(str3, '.', length - 1, false, 4, (Object) null) == -1) {
                    return true;
                }
                return false;
            }
        }
        return false;
    }

    /* renamed from: g */
    private final boolean m116743g(String str, X509Certificate x509Certificate) {
        String b = m116739b(str);
        List<String> c = m116740c(x509Certificate, 2);
        if ((c instanceof Collection) && c.isEmpty()) {
            return false;
        }
        for (String f : c) {
            if (f95767a.m116742f(b, f)) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: h */
    private final boolean m116744h(String str, X509Certificate x509Certificate) {
        String e = C42194a.m122505e(str);
        List<String> c = m116740c(x509Certificate, 7);
        if ((c instanceof Collection) && c.isEmpty()) {
            return false;
        }
        for (String e2 : c) {
            if (C41536l.m120484d(e, C42194a.m122505e(e2))) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: a */
    public final List mo94341a(X509Certificate x509Certificate) {
        C41536l.m120489i(x509Certificate, "certificate");
        return C41358y.m120023m0(m116740c(x509Certificate, 7), m116740c(x509Certificate, 2));
    }

    /* renamed from: e */
    public final boolean mo94342e(String str, X509Certificate x509Certificate) {
        C41536l.m120489i(str, "host");
        C41536l.m120489i(x509Certificate, "certificate");
        if (C42197d.m122543i(str)) {
            return m116744h(str, x509Certificate);
        }
        return m116743g(str, x509Certificate);
    }

    public boolean verify(String str, SSLSession sSLSession) {
        C41536l.m120489i(str, "host");
        C41536l.m120489i(sSLSession, "session");
        if (!m116741d(str)) {
            return false;
        }
        try {
            Certificate certificate = sSLSession.getPeerCertificates()[0];
            if (certificate != null) {
                return mo94342e(str, (X509Certificate) certificate);
            }
            throw new NullPointerException("null cannot be cast to non-null type java.security.cert.X509Certificate");
        } catch (SSLException unused) {
            return false;
        }
    }
}
