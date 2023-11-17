package of1;

import ag1.C40309c;
import android.support.p013v4.media.session.C0125b;
import dg1.C40681e;
import java.security.cert.Certificate;
import java.security.cert.X509Certificate;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import javax.net.ssl.SSLPeerUnverifiedException;
import kotlin.jvm.internal.C41536l;
import kotlin.jvm.internal.C41537m;
import kotlin.jvm.internal.DefaultConstructorMarker;
import ue1.C43064a;

/* renamed from: of1.g */
public final class C41890g {

    /* renamed from: c */
    public static final C41892b f98348c = new C41892b((DefaultConstructorMarker) null);

    /* renamed from: d */
    public static final C41890g f98349d = new C41891a().mo96814a();

    /* renamed from: a */
    private final Set f98350a;

    /* renamed from: b */
    private final C40309c f98351b;

    /* renamed from: of1.g$a */
    public static final class C41891a {

        /* renamed from: a */
        private final List f98352a = new ArrayList();

        /* renamed from: a */
        public final C41890g mo96814a() {
            return new C41890g(C41358y.m119993D0(this.f98352a), (C40309c) null, 2, (DefaultConstructorMarker) null);
        }
    }

    /* renamed from: of1.g$b */
    public static final class C41892b {
        private C41892b() {
        }

        public /* synthetic */ C41892b(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* renamed from: a */
        public final String mo96815a(Certificate certificate) {
            C41536l.m120489i(certificate, "certificate");
            if (certificate instanceof X509Certificate) {
                return C41536l.m120497q("sha256/", mo96816b((X509Certificate) certificate).mo94799a());
            }
            throw new IllegalArgumentException("Certificate pinning requires X509 certificates".toString());
        }

        /* renamed from: b */
        public final C40681e mo96816b(X509Certificate x509Certificate) {
            C41536l.m120489i(x509Certificate, "<this>");
            C40681e.C40682a aVar = C40681e.f96327g;
            byte[] encoded = x509Certificate.getPublicKey().getEncoded();
            C41536l.m120488h(encoded, "publicKey.encoded");
            return C40681e.C40682a.m117722e(aVar, encoded, 0, 0, 3, (Object) null).mo94792A();
        }
    }

    /* renamed from: of1.g$c */
    static final class C41893c extends C41537m implements C43064a {

        /* renamed from: d */
        final /* synthetic */ C41890g f98353d;

        /* renamed from: e */
        final /* synthetic */ List f98354e;

        /* renamed from: f */
        final /* synthetic */ String f98355f;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C41893c(C41890g gVar, List list, String str) {
            super(0);
            this.f98353d = gVar;
            this.f98354e = list;
            this.f98355f = str;
        }

        /* renamed from: b */
        public final List invoke() {
            List<Certificate> list;
            C40309c d = this.f98353d.mo96810d();
            if (d == null) {
                list = null;
            } else {
                list = d.mo94334a(this.f98354e, this.f98355f);
            }
            if (list == null) {
                list = this.f98354e;
            }
            ArrayList arrayList = new ArrayList(C41343r.m119925u(list, 10));
            for (Certificate certificate : list) {
                arrayList.add((X509Certificate) certificate);
            }
            return arrayList;
        }
    }

    public C41890g(Set set, C40309c cVar) {
        C41536l.m120489i(set, "pins");
        this.f98350a = set;
        this.f98351b = cVar;
    }

    /* renamed from: a */
    public final void mo96807a(String str, List list) {
        C41536l.m120489i(str, "hostname");
        C41536l.m120489i(list, "peerCertificates");
        mo96808b(str, new C41893c(this, list, str));
    }

    /* renamed from: b */
    public final void mo96808b(String str, C43064a aVar) {
        C41536l.m120489i(str, "hostname");
        C41536l.m120489i(aVar, "cleanedPeerCertificatesFn");
        List<Object> c = mo96809c(str);
        if (!c.isEmpty()) {
            List<X509Certificate> list = (List) aVar.invoke();
            for (X509Certificate x509Certificate : list) {
                Iterator it = c.iterator();
                if (it.hasNext()) {
                    C0125b.m366a(it.next());
                    throw null;
                }
            }
            StringBuilder sb = new StringBuilder();
            sb.append("Certificate pinning failure!");
            sb.append("\n  Peer certificate chain:");
            for (X509Certificate x509Certificate2 : list) {
                sb.append("\n    ");
                sb.append(f98348c.mo96815a(x509Certificate2));
                sb.append(": ");
                sb.append(x509Certificate2.getSubjectDN().getName());
            }
            sb.append("\n  Pinned certificates for ");
            sb.append(str);
            sb.append(":");
            for (Object a : c) {
                C0125b.m366a(a);
                sb.append("\n    ");
                sb.append((Object) null);
            }
            String sb2 = sb.toString();
            C41536l.m120488h(sb2, "StringBuilder().apply(builderAction).toString()");
            throw new SSLPeerUnverifiedException(sb2);
        }
    }

    /* renamed from: c */
    public final List mo96809c(String str) {
        C41536l.m120489i(str, "hostname");
        Set set = this.f98350a;
        List j = C41341q.m119907j();
        Iterator it = set.iterator();
        if (!it.hasNext()) {
            return j;
        }
        C0125b.m366a(it.next());
        throw null;
    }

    /* renamed from: d */
    public final C40309c mo96810d() {
        return this.f98351b;
    }

    /* renamed from: e */
    public final C41890g mo96811e(C40309c cVar) {
        C41536l.m120489i(cVar, "certificateChainCleaner");
        if (C41536l.m120484d(this.f98351b, cVar)) {
            return this;
        }
        return new C41890g(this.f98350a, cVar);
    }

    public boolean equals(Object obj) {
        if (obj instanceof C41890g) {
            C41890g gVar = (C41890g) obj;
            if (!C41536l.m120484d(gVar.f98350a, this.f98350a) || !C41536l.m120484d(gVar.f98351b, this.f98351b)) {
                return false;
            }
            return true;
        }
        return false;
    }

    public int hashCode() {
        int i;
        int hashCode = (1517 + this.f98350a.hashCode()) * 41;
        C40309c cVar = this.f98351b;
        if (cVar != null) {
            i = cVar.hashCode();
        } else {
            i = 0;
        }
        return hashCode + i;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C41890g(Set set, C40309c cVar, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(set, (i & 2) != 0 ? null : cVar);
    }
}
