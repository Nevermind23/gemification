package tf1;

import java.net.InetAddress;
import java.net.InetSocketAddress;
import java.net.Proxy;
import java.net.SocketAddress;
import java.net.SocketException;
import java.net.URI;
import java.net.UnknownHostException;
import java.util.ArrayList;
import java.util.List;
import java.util.NoSuchElementException;
import kotlin.jvm.internal.C41536l;
import kotlin.jvm.internal.DefaultConstructorMarker;
import of1.C41863a;
import of1.C41882e;
import of1.C41889f0;
import of1.C41917r;
import of1.C41931v;
import pf1.C42197d;

/* renamed from: tf1.i */
public final class C43016i {

    /* renamed from: i */
    public static final C43017a f100433i = new C43017a((DefaultConstructorMarker) null);

    /* renamed from: a */
    private final C41863a f100434a;

    /* renamed from: b */
    private final C43015h f100435b;

    /* renamed from: c */
    private final C41882e f100436c;

    /* renamed from: d */
    private final C41917r f100437d;

    /* renamed from: e */
    private List f100438e = C41341q.m119907j();

    /* renamed from: f */
    private int f100439f;

    /* renamed from: g */
    private List f100440g = C41341q.m119907j();

    /* renamed from: h */
    private final List f100441h = new ArrayList();

    /* renamed from: tf1.i$a */
    public static final class C43017a {
        private C43017a() {
        }

        public /* synthetic */ C43017a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* renamed from: a */
        public final String mo101597a(InetSocketAddress inetSocketAddress) {
            C41536l.m120489i(inetSocketAddress, "<this>");
            InetAddress address = inetSocketAddress.getAddress();
            if (address == null) {
                String hostName = inetSocketAddress.getHostName();
                C41536l.m120488h(hostName, "hostName");
                return hostName;
            }
            String hostAddress = address.getHostAddress();
            C41536l.m120488h(hostAddress, "address.hostAddress");
            return hostAddress;
        }
    }

    /* renamed from: tf1.i$b */
    public static final class C43018b {

        /* renamed from: a */
        private final List f100442a;

        /* renamed from: b */
        private int f100443b;

        public C43018b(List list) {
            C41536l.m120489i(list, "routes");
            this.f100442a = list;
        }

        /* renamed from: a */
        public final List mo101598a() {
            return this.f100442a;
        }

        /* renamed from: b */
        public final boolean mo101599b() {
            return this.f100443b < this.f100442a.size();
        }

        /* renamed from: c */
        public final C41889f0 mo101600c() {
            if (mo101599b()) {
                List list = this.f100442a;
                int i = this.f100443b;
                this.f100443b = i + 1;
                return (C41889f0) list.get(i);
            }
            throw new NoSuchElementException();
        }
    }

    public C43016i(C41863a aVar, C43015h hVar, C41882e eVar, C41917r rVar) {
        C41536l.m120489i(aVar, "address");
        C41536l.m120489i(hVar, "routeDatabase");
        C41536l.m120489i(eVar, "call");
        C41536l.m120489i(rVar, "eventListener");
        this.f100434a = aVar;
        this.f100435b = hVar;
        this.f100436c = eVar;
        this.f100437d = rVar;
        m123475f(aVar.mo96668l(), aVar.mo96662g());
    }

    /* renamed from: b */
    private final boolean m123472b() {
        return this.f100439f < this.f100438e.size();
    }

    /* renamed from: d */
    private final Proxy m123473d() {
        if (m123472b()) {
            List list = this.f100438e;
            int i = this.f100439f;
            this.f100439f = i + 1;
            Proxy proxy = (Proxy) list.get(i);
            m123474e(proxy);
            return proxy;
        }
        throw new SocketException("No route to " + this.f100434a.mo96668l().mo96954i() + "; exhausted proxy configurations: " + this.f100438e);
    }

    /* renamed from: e */
    private final void m123474e(Proxy proxy) {
        String str;
        int i;
        ArrayList arrayList = new ArrayList();
        this.f100440g = arrayList;
        if (proxy.type() == Proxy.Type.DIRECT || proxy.type() == Proxy.Type.SOCKS) {
            str = this.f100434a.mo96668l().mo96954i();
            i = this.f100434a.mo96668l().mo96959o();
        } else {
            SocketAddress address = proxy.address();
            if (address instanceof InetSocketAddress) {
                C43017a aVar = f100433i;
                C41536l.m120488h(address, "proxyAddress");
                InetSocketAddress inetSocketAddress = (InetSocketAddress) address;
                str = aVar.mo101597a(inetSocketAddress);
                i = inetSocketAddress.getPort();
            } else {
                throw new IllegalArgumentException(C41536l.m120497q("Proxy.address() is not an InetSocketAddress: ", address.getClass()).toString());
            }
        }
        boolean z = false;
        if (1 <= i && i < 65536) {
            z = true;
        }
        if (!z) {
            throw new SocketException("No route to " + str + ':' + i + "; port is out of range");
        } else if (proxy.type() == Proxy.Type.SOCKS) {
            arrayList.add(InetSocketAddress.createUnresolved(str, i));
        } else {
            this.f100437d.mo96897m(this.f100436c, str);
            List<InetAddress> a = this.f100434a.mo96657c().mo96882a(str);
            if (!a.isEmpty()) {
                this.f100437d.mo96896l(this.f100436c, str, a);
                for (InetAddress inetSocketAddress2 : a) {
                    arrayList.add(new InetSocketAddress(inetSocketAddress2, i));
                }
                return;
            }
            throw new UnknownHostException(this.f100434a.mo96657c() + " returned no addresses for " + str);
        }
    }

    /* renamed from: f */
    private final void m123475f(C41931v vVar, Proxy proxy) {
        this.f100437d.mo96899o(this.f100436c, vVar);
        List g = m123476g(proxy, vVar, this);
        this.f100438e = g;
        this.f100439f = 0;
        this.f100437d.mo96898n(this.f100436c, vVar, g);
    }

    /* renamed from: g */
    private static final List m123476g(Proxy proxy, C41931v vVar, C43016i iVar) {
        boolean z;
        if (proxy != null) {
            return C41339p.m119900e(proxy);
        }
        URI u = vVar.mo96966u();
        if (u.getHost() == null) {
            return C42197d.m122557w(Proxy.NO_PROXY);
        }
        List<Proxy> select = iVar.f100434a.mo96665i().select(u);
        if (select == null || select.isEmpty()) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            return C42197d.m122557w(Proxy.NO_PROXY);
        }
        C41536l.m120488h(select, "proxiesOrNull");
        return C42197d.m122527U(select);
    }

    /* renamed from: a */
    public final boolean mo101595a() {
        return m123472b() || (this.f100441h.isEmpty() ^ true);
    }

    /* renamed from: c */
    public final C43018b mo101596c() {
        if (mo101595a()) {
            ArrayList arrayList = new ArrayList();
            while (m123472b()) {
                Proxy d = m123473d();
                for (InetSocketAddress f0Var : this.f100440g) {
                    C41889f0 f0Var2 = new C41889f0(this.f100434a, d, f0Var);
                    if (this.f100435b.mo101594c(f0Var2)) {
                        this.f100441h.add(f0Var2);
                    } else {
                        arrayList.add(f0Var2);
                    }
                }
                if (!arrayList.isEmpty()) {
                    break;
                }
            }
            if (arrayList.isEmpty()) {
                boolean unused = C41352v.m119965z(arrayList, this.f100441h);
                this.f100441h.clear();
            }
            return new C43018b(arrayList);
        }
        throw new NoSuchElementException();
    }
}
