package of1;

import he1.C41217g;
import java.io.IOException;
import java.security.cert.Certificate;
import java.security.cert.X509Certificate;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import javax.net.ssl.SSLPeerUnverifiedException;
import javax.net.ssl.SSLSession;
import kotlin.jvm.internal.C41536l;
import kotlin.jvm.internal.C41537m;
import kotlin.jvm.internal.DefaultConstructorMarker;
import pf1.C42197d;
import ue1.C43064a;

/* renamed from: of1.t */
public final class C41924t {

    /* renamed from: e */
    public static final C41925a f98542e = new C41925a((DefaultConstructorMarker) null);

    /* renamed from: a */
    private final C41894g0 f98543a;

    /* renamed from: b */
    private final C41898i f98544b;

    /* renamed from: c */
    private final List f98545c;

    /* renamed from: d */
    private final C41217g f98546d;

    /* renamed from: of1.t$a */
    public static final class C41925a {

        /* renamed from: of1.t$a$a */
        static final class C41926a extends C41537m implements C43064a {

            /* renamed from: d */
            final /* synthetic */ List f98547d;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            C41926a(List list) {
                super(0);
                this.f98547d = list;
            }

            /* renamed from: b */
            public final List invoke() {
                return this.f98547d;
            }
        }

        private C41925a() {
        }

        public /* synthetic */ C41925a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* renamed from: b */
        private final List m121593b(Certificate[] certificateArr) {
            if (certificateArr != null) {
                return C42197d.m122557w(Arrays.copyOf(certificateArr, certificateArr.length));
            }
            return C41341q.m119907j();
        }

        /* renamed from: a */
        public final C41924t mo96922a(SSLSession sSLSession) {
            boolean z;
            List list;
            C41536l.m120489i(sSLSession, "<this>");
            String cipherSuite = sSLSession.getCipherSuite();
            if (cipherSuite != null) {
                if (C41536l.m120484d(cipherSuite, "TLS_NULL_WITH_NULL_NULL")) {
                    z = true;
                } else {
                    z = C41536l.m120484d(cipherSuite, "SSL_NULL_WITH_NULL_NULL");
                }
                if (!z) {
                    C41898i b = C41898i.f98420b.mo96830b(cipherSuite);
                    String protocol = sSLSession.getProtocol();
                    if (protocol == null) {
                        throw new IllegalStateException("tlsVersion == null".toString());
                    } else if (!C41536l.m120484d("NONE", protocol)) {
                        C41894g0 a = C41894g0.f98356e.mo96819a(protocol);
                        try {
                            list = m121593b(sSLSession.getPeerCertificates());
                        } catch (SSLPeerUnverifiedException unused) {
                            list = C41341q.m119907j();
                        }
                        return new C41924t(a, b, m121593b(sSLSession.getLocalCertificates()), new C41926a(list));
                    } else {
                        throw new IOException("tlsVersion == NONE");
                    }
                } else {
                    throw new IOException(C41536l.m120497q("cipherSuite == ", cipherSuite));
                }
            } else {
                throw new IllegalStateException("cipherSuite == null".toString());
            }
        }
    }

    /* renamed from: of1.t$b */
    static final class C41927b extends C41537m implements C43064a {

        /* renamed from: d */
        final /* synthetic */ C43064a f98548d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C41927b(C43064a aVar) {
            super(0);
            this.f98548d = aVar;
        }

        /* renamed from: b */
        public final List invoke() {
            try {
                return (List) this.f98548d.invoke();
            } catch (SSLPeerUnverifiedException unused) {
                return C41341q.m119907j();
            }
        }
    }

    public C41924t(C41894g0 g0Var, C41898i iVar, List list, C43064a aVar) {
        C41536l.m120489i(g0Var, "tlsVersion");
        C41536l.m120489i(iVar, "cipherSuite");
        C41536l.m120489i(list, "localCertificates");
        C41536l.m120489i(aVar, "peerCertificatesFn");
        this.f98543a = g0Var;
        this.f98544b = iVar;
        this.f98545c = list;
        this.f98546d = C41219i.m119470b(new C41927b(aVar));
    }

    /* renamed from: b */
    private final String m121588b(Certificate certificate) {
        if (certificate instanceof X509Certificate) {
            return ((X509Certificate) certificate).getSubjectDN().toString();
        }
        String type = certificate.getType();
        C41536l.m120488h(type, "type");
        return type;
    }

    /* renamed from: a */
    public final C41898i mo96915a() {
        return this.f98544b;
    }

    /* renamed from: c */
    public final List mo96916c() {
        return this.f98545c;
    }

    /* renamed from: d */
    public final List mo96917d() {
        return (List) this.f98546d.getValue();
    }

    /* renamed from: e */
    public final C41894g0 mo96918e() {
        return this.f98543a;
    }

    public boolean equals(Object obj) {
        if (obj instanceof C41924t) {
            C41924t tVar = (C41924t) obj;
            if (tVar.f98543a != this.f98543a || !C41536l.m120484d(tVar.f98544b, this.f98544b) || !C41536l.m120484d(tVar.mo96917d(), mo96917d()) || !C41536l.m120484d(tVar.f98545c, this.f98545c)) {
                return false;
            }
            return true;
        }
        return false;
    }

    public int hashCode() {
        return ((((((527 + this.f98543a.hashCode()) * 31) + this.f98544b.hashCode()) * 31) + mo96917d().hashCode()) * 31) + this.f98545c.hashCode();
    }

    public String toString() {
        List<Certificate> d = mo96917d();
        ArrayList arrayList = new ArrayList(C41343r.m119925u(d, 10));
        for (Certificate b : d) {
            arrayList.add(m121588b(b));
        }
        String obj = arrayList.toString();
        StringBuilder sb = new StringBuilder();
        sb.append("Handshake{tlsVersion=");
        sb.append(this.f98543a);
        sb.append(" cipherSuite=");
        sb.append(this.f98544b);
        sb.append(" peerCertificates=");
        sb.append(obj);
        sb.append(" localCertificates=");
        List<Certificate> list = this.f98545c;
        ArrayList arrayList2 = new ArrayList(C41343r.m119925u(list, 10));
        for (Certificate b2 : list) {
            arrayList2.add(m121588b(b2));
        }
        sb.append(arrayList2);
        sb.append('}');
        return sb.toString();
    }
}
