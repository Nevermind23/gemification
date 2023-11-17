package of1;

import java.net.Proxy;
import java.net.ProxySelector;
import java.util.List;
import java.util.Objects;
import javax.net.SocketFactory;
import javax.net.ssl.HostnameVerifier;
import javax.net.ssl.SSLSocketFactory;
import kotlin.jvm.internal.C41536l;
import of1.C41931v;
import pf1.C42197d;

/* renamed from: of1.a */
public final class C41863a {

    /* renamed from: a */
    private final C41914q f98241a;

    /* renamed from: b */
    private final SocketFactory f98242b;

    /* renamed from: c */
    private final SSLSocketFactory f98243c;

    /* renamed from: d */
    private final HostnameVerifier f98244d;

    /* renamed from: e */
    private final C41890g f98245e;

    /* renamed from: f */
    private final C41866b f98246f;

    /* renamed from: g */
    private final Proxy f98247g;

    /* renamed from: h */
    private final ProxySelector f98248h;

    /* renamed from: i */
    private final C41931v f98249i;

    /* renamed from: j */
    private final List f98250j;

    /* renamed from: k */
    private final List f98251k;

    public C41863a(String str, int i, C41914q qVar, SocketFactory socketFactory, SSLSocketFactory sSLSocketFactory, HostnameVerifier hostnameVerifier, C41890g gVar, C41866b bVar, Proxy proxy, List list, List list2, ProxySelector proxySelector) {
        C41536l.m120489i(str, "uriHost");
        C41536l.m120489i(qVar, "dns");
        C41536l.m120489i(socketFactory, "socketFactory");
        C41536l.m120489i(bVar, "proxyAuthenticator");
        C41536l.m120489i(list, "protocols");
        C41536l.m120489i(list2, "connectionSpecs");
        C41536l.m120489i(proxySelector, "proxySelector");
        this.f98241a = qVar;
        this.f98242b = socketFactory;
        this.f98243c = sSLSocketFactory;
        this.f98244d = hostnameVerifier;
        this.f98245e = gVar;
        this.f98246f = bVar;
        this.f98247g = proxy;
        this.f98248h = proxySelector;
        this.f98249i = new C41931v.C41932a().mo96969C(sSLSocketFactory != null ? "https" : "http").mo96993p(str).mo96997v(i).mo96981c();
        this.f98250j = C42197d.m122527U(list);
        this.f98251k = C42197d.m122527U(list2);
    }

    /* renamed from: a */
    public final C41890g mo96655a() {
        return this.f98245e;
    }

    /* renamed from: b */
    public final List mo96656b() {
        return this.f98251k;
    }

    /* renamed from: c */
    public final C41914q mo96657c() {
        return this.f98241a;
    }

    /* renamed from: d */
    public final boolean mo96658d(C41863a aVar) {
        C41536l.m120489i(aVar, "that");
        if (!C41536l.m120484d(this.f98241a, aVar.f98241a) || !C41536l.m120484d(this.f98246f, aVar.f98246f) || !C41536l.m120484d(this.f98250j, aVar.f98250j) || !C41536l.m120484d(this.f98251k, aVar.f98251k) || !C41536l.m120484d(this.f98248h, aVar.f98248h) || !C41536l.m120484d(this.f98247g, aVar.f98247g) || !C41536l.m120484d(this.f98243c, aVar.f98243c) || !C41536l.m120484d(this.f98244d, aVar.f98244d) || !C41536l.m120484d(this.f98245e, aVar.f98245e) || this.f98249i.mo96959o() != aVar.f98249i.mo96959o()) {
            return false;
        }
        return true;
    }

    /* renamed from: e */
    public final HostnameVerifier mo96659e() {
        return this.f98244d;
    }

    public boolean equals(Object obj) {
        if (obj instanceof C41863a) {
            C41863a aVar = (C41863a) obj;
            if (!C41536l.m120484d(this.f98249i, aVar.f98249i) || !mo96658d(aVar)) {
                return false;
            }
            return true;
        }
        return false;
    }

    /* renamed from: f */
    public final List mo96661f() {
        return this.f98250j;
    }

    /* renamed from: g */
    public final Proxy mo96662g() {
        return this.f98247g;
    }

    /* renamed from: h */
    public final C41866b mo96663h() {
        return this.f98246f;
    }

    public int hashCode() {
        return ((((((((((((((((((527 + this.f98249i.hashCode()) * 31) + this.f98241a.hashCode()) * 31) + this.f98246f.hashCode()) * 31) + this.f98250j.hashCode()) * 31) + this.f98251k.hashCode()) * 31) + this.f98248h.hashCode()) * 31) + Objects.hashCode(this.f98247g)) * 31) + Objects.hashCode(this.f98243c)) * 31) + Objects.hashCode(this.f98244d)) * 31) + Objects.hashCode(this.f98245e);
    }

    /* renamed from: i */
    public final ProxySelector mo96665i() {
        return this.f98248h;
    }

    /* renamed from: j */
    public final SocketFactory mo96666j() {
        return this.f98242b;
    }

    /* renamed from: k */
    public final SSLSocketFactory mo96667k() {
        return this.f98243c;
    }

    /* renamed from: l */
    public final C41931v mo96668l() {
        return this.f98249i;
    }

    public String toString() {
        String str;
        StringBuilder sb = new StringBuilder();
        sb.append("Address{");
        sb.append(this.f98249i.mo96954i());
        sb.append(':');
        sb.append(this.f98249i.mo96959o());
        sb.append(", ");
        Proxy proxy = this.f98247g;
        if (proxy != null) {
            str = C41536l.m120497q("proxy=", proxy);
        } else {
            str = C41536l.m120497q("proxySelector=", this.f98248h);
        }
        sb.append(str);
        sb.append('}');
        return sb.toString();
    }
}
