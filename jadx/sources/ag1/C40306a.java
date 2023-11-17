package ag1;

import java.security.GeneralSecurityException;
import java.security.cert.X509Certificate;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import javax.net.ssl.SSLPeerUnverifiedException;
import kotlin.jvm.internal.C41536l;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* renamed from: ag1.a */
public final class C40306a extends C40309c {

    /* renamed from: c */
    public static final C40307a f95763c = new C40307a((DefaultConstructorMarker) null);

    /* renamed from: b */
    private final C40312e f95764b;

    /* renamed from: ag1.a$a */
    public static final class C40307a {
        private C40307a() {
        }

        public /* synthetic */ C40307a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public C40306a(C40312e eVar) {
        C41536l.m120489i(eVar, "trustRootIndex");
        this.f95764b = eVar;
    }

    /* renamed from: b */
    private final boolean m116734b(X509Certificate x509Certificate, X509Certificate x509Certificate2) {
        if (!C41536l.m120484d(x509Certificate.getIssuerDN(), x509Certificate2.getSubjectDN())) {
            return false;
        }
        try {
            x509Certificate.verify(x509Certificate2.getPublicKey());
            return true;
        } catch (GeneralSecurityException unused) {
            return false;
        }
    }

    /* renamed from: a */
    public List mo94334a(List list, String str) {
        C41536l.m120489i(list, "chain");
        C41536l.m120489i(str, "hostname");
        ArrayDeque arrayDeque = new ArrayDeque(list);
        ArrayList arrayList = new ArrayList();
        Object removeFirst = arrayDeque.removeFirst();
        C41536l.m120488h(removeFirst, "queue.removeFirst()");
        arrayList.add(removeFirst);
        int i = 0;
        boolean z = false;
        while (i < 9) {
            i++;
            X509Certificate x509Certificate = (X509Certificate) arrayList.get(arrayList.size() - 1);
            X509Certificate a = this.f95764b.mo94337a(x509Certificate);
            if (a != null) {
                if (arrayList.size() > 1 || !C41536l.m120484d(x509Certificate, a)) {
                    arrayList.add(a);
                }
                if (m116734b(a, a)) {
                    return arrayList;
                }
                z = true;
            } else {
                Iterator it = arrayDeque.iterator();
                C41536l.m120488h(it, "queue.iterator()");
                while (it.hasNext()) {
                    Object next = it.next();
                    if (next != null) {
                        X509Certificate x509Certificate2 = (X509Certificate) next;
                        if (m116734b(x509Certificate, x509Certificate2)) {
                            it.remove();
                            arrayList.add(x509Certificate2);
                        }
                    } else {
                        throw new NullPointerException("null cannot be cast to non-null type java.security.cert.X509Certificate");
                    }
                }
                if (z) {
                    return arrayList;
                }
                throw new SSLPeerUnverifiedException(C41536l.m120497q("Failed to find a trusted cert that signed ", x509Certificate));
            }
        }
        throw new SSLPeerUnverifiedException(C41536l.m120497q("Certificate chain too long: ", arrayList));
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        return (obj instanceof C40306a) && C41536l.m120484d(((C40306a) obj).f95764b, this.f95764b);
    }

    public int hashCode() {
        return this.f95764b.hashCode();
    }
}
