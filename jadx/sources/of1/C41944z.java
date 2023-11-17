package of1;

import ag1.C40309c;
import ag1.C40311d;
import bg1.C40370d;
import bg1.C40379e;
import java.net.Proxy;
import java.net.ProxySelector;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Random;
import java.util.concurrent.TimeUnit;
import javax.net.SocketFactory;
import javax.net.ssl.HostnameVerifier;
import javax.net.ssl.SSLSocketFactory;
import javax.net.ssl.X509TrustManager;
import kotlin.jvm.internal.C41536l;
import kotlin.jvm.internal.DefaultConstructorMarker;
import of1.C41882e;
import of1.C41917r;
import pf1.C42197d;
import sf1.C42562e;
import tf1.C43002e;
import tf1.C43015h;
import xf1.C43286k;
import zf1.C43430a;

/* renamed from: of1.z */
public class C41944z implements Cloneable, C41882e.C41883a {

    /* renamed from: G */
    public static final C41946b f98600G = new C41946b((DefaultConstructorMarker) null);
    /* access modifiers changed from: private */

    /* renamed from: H */
    public static final List f98601H = C42197d.m122557w(C41864a0.HTTP_2, C41864a0.HTTP_1_1);
    /* access modifiers changed from: private */

    /* renamed from: I */
    public static final List f98602I = C42197d.m122557w(C41904l.f98494i, C41904l.f98496k);

    /* renamed from: A */
    private final int f98603A;

    /* renamed from: B */
    private final int f98604B;

    /* renamed from: C */
    private final int f98605C;

    /* renamed from: D */
    private final int f98606D;

    /* renamed from: E */
    private final long f98607E;

    /* renamed from: F */
    private final C43015h f98608F;

    /* renamed from: d */
    private final C41913p f98609d;

    /* renamed from: e */
    private final C41903k f98610e;

    /* renamed from: f */
    private final List f98611f;

    /* renamed from: g */
    private final List f98612g;

    /* renamed from: h */
    private final C41917r.C41920c f98613h;

    /* renamed from: i */
    private final boolean f98614i;

    /* renamed from: j */
    private final C41866b f98615j;

    /* renamed from: k */
    private final boolean f98616k;

    /* renamed from: l */
    private final boolean f98617l;

    /* renamed from: m */
    private final C41909n f98618m;

    /* renamed from: n */
    private final C41914q f98619n;

    /* renamed from: o */
    private final Proxy f98620o;

    /* renamed from: p */
    private final ProxySelector f98621p;

    /* renamed from: q */
    private final C41866b f98622q;

    /* renamed from: r */
    private final SocketFactory f98623r;
    /* access modifiers changed from: private */

    /* renamed from: s */
    public final SSLSocketFactory f98624s;

    /* renamed from: t */
    private final X509TrustManager f98625t;

    /* renamed from: u */
    private final List f98626u;

    /* renamed from: v */
    private final List f98627v;

    /* renamed from: w */
    private final HostnameVerifier f98628w;

    /* renamed from: x */
    private final C41890g f98629x;

    /* renamed from: y */
    private final C40309c f98630y;

    /* renamed from: z */
    private final int f98631z;

    /* renamed from: of1.z$b */
    public static final class C41946b {
        private C41946b() {
        }

        public /* synthetic */ C41946b(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* renamed from: a */
        public final List mo97123a() {
            return C41944z.f98602I;
        }

        /* renamed from: b */
        public final List mo97124b() {
            return C41944z.f98601H;
        }
    }

    public C41944z(C41945a aVar) {
        ProxySelector proxySelector;
        C41536l.m120489i(aVar, "builder");
        this.f98609d = aVar.mo97114r();
        this.f98610e = aVar.mo97111o();
        this.f98611f = C42197d.m122527U(aVar.mo97120x());
        this.f98612g = C42197d.m122527U(aVar.mo97122z());
        this.f98613h = aVar.mo97116t();
        this.f98614i = aVar.mo97071G();
        this.f98615j = aVar.mo97105i();
        this.f98616k = aVar.mo97117u();
        this.f98617l = aVar.mo97118v();
        this.f98618m = aVar.mo97113q();
        aVar.mo97106j();
        this.f98619n = aVar.mo97115s();
        this.f98620o = aVar.mo97067C();
        if (aVar.mo97067C() != null) {
            proxySelector = C43430a.f101294a;
        } else {
            proxySelector = aVar.mo97069E();
            proxySelector = proxySelector == null ? ProxySelector.getDefault() : proxySelector;
            if (proxySelector == null) {
                proxySelector = C43430a.f101294a;
            }
        }
        this.f98621p = proxySelector;
        this.f98622q = aVar.mo97068D();
        this.f98623r = aVar.mo97073I();
        List p = aVar.mo97112p();
        this.f98626u = p;
        this.f98627v = aVar.mo97066B();
        this.f98628w = aVar.mo97119w();
        this.f98631z = aVar.mo97107k();
        this.f98603A = aVar.mo97110n();
        this.f98604B = aVar.mo97070F();
        this.f98605C = aVar.mo97075K();
        this.f98606D = aVar.mo97065A();
        this.f98607E = aVar.mo97121y();
        C43015h H = aVar.mo97072H();
        this.f98608F = H == null ? new C43015h() : H;
        boolean z = true;
        if (!(p instanceof Collection) || !p.isEmpty()) {
            Iterator it = p.iterator();
            while (true) {
                if (it.hasNext()) {
                    if (((C41904l) it.next()).mo96838f()) {
                        z = false;
                        break;
                    }
                } else {
                    break;
                }
            }
        }
        if (z) {
            this.f98624s = null;
            this.f98630y = null;
            this.f98625t = null;
            this.f98629x = C41890g.f98349d;
        } else if (aVar.mo97074J() != null) {
            this.f98624s = aVar.mo97074J();
            C40309c l = aVar.mo97108l();
            C41536l.m120486f(l);
            this.f98630y = l;
            X509TrustManager L = aVar.mo97076L();
            C41536l.m120486f(L);
            this.f98625t = L;
            C41890g m = aVar.mo97109m();
            C41536l.m120486f(l);
            this.f98629x = m.mo96811e(l);
        } else {
            C43286k.C43287a aVar2 = C43286k.f101052a;
            X509TrustManager o = aVar2.mo101988g().mo101968o();
            this.f98625t = o;
            C43286k g = aVar2.mo101988g();
            C41536l.m120486f(o);
            this.f98624s = g.mo101971n(o);
            C40309c.C40310a aVar3 = C40309c.f95766a;
            C41536l.m120486f(o);
            C40309c a = aVar3.mo94340a(o);
            this.f98630y = a;
            C41890g m2 = aVar.mo97109m();
            C41536l.m120486f(a);
            this.f98629x = m2.mo96811e(a);
        }
        m121732M();
    }

    /* renamed from: M */
    private final void m121732M() {
        boolean z;
        boolean z2;
        boolean z3;
        boolean z4 = true;
        if (!(!this.f98611f.contains((Object) null))) {
            throw new IllegalStateException(C41536l.m120497q("Null interceptor: ", mo97063y()).toString());
        } else if (!this.f98612g.contains((Object) null)) {
            List list = this.f98626u;
            if (!(list instanceof Collection) || !list.isEmpty()) {
                Iterator it = list.iterator();
                while (true) {
                    if (it.hasNext()) {
                        if (((C41904l) it.next()).mo96838f()) {
                            z = false;
                            break;
                        }
                    } else {
                        break;
                    }
                }
            }
            z = true;
            if (z) {
                if (this.f98624s == null) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                if (z2) {
                    if (this.f98630y == null) {
                        z3 = true;
                    } else {
                        z3 = false;
                    }
                    if (z3) {
                        if (this.f98625t != null) {
                            z4 = false;
                        }
                        if (!z4) {
                            throw new IllegalStateException("Check failed.".toString());
                        } else if (!C41536l.m120484d(this.f98629x, C41890g.f98349d)) {
                            throw new IllegalStateException("Check failed.".toString());
                        }
                    } else {
                        throw new IllegalStateException("Check failed.".toString());
                    }
                } else {
                    throw new IllegalStateException("Check failed.".toString());
                }
            } else if (this.f98624s == null) {
                throw new IllegalStateException("sslSocketFactory == null".toString());
            } else if (this.f98630y == null) {
                throw new IllegalStateException("certificateChainCleaner == null".toString());
            } else if (this.f98625t == null) {
                throw new IllegalStateException("x509TrustManager == null".toString());
            }
        } else {
            throw new IllegalStateException(C41536l.m120497q("Null network interceptor: ", mo97032A()).toString());
        }
    }

    /* renamed from: A */
    public final List mo97032A() {
        return this.f98612g;
    }

    /* renamed from: B */
    public C41945a mo97033B() {
        return new C41945a(this);
    }

    /* renamed from: C */
    public C41897h0 mo97034C(C41869b0 b0Var, C41901i0 i0Var) {
        C41536l.m120489i(b0Var, "request");
        C41536l.m120489i(i0Var, "listener");
        C40370d dVar = new C40370d(C42562e.f100169i, b0Var, i0Var, new Random(), (long) this.f98606D, (C40379e) null, this.f98607E);
        dVar.mo94415o(this);
        return dVar;
    }

    /* renamed from: D */
    public final int mo97035D() {
        return this.f98606D;
    }

    /* renamed from: E */
    public final List mo97036E() {
        return this.f98627v;
    }

    /* renamed from: F */
    public final Proxy mo97037F() {
        return this.f98620o;
    }

    /* renamed from: G */
    public final C41866b mo97038G() {
        return this.f98622q;
    }

    /* renamed from: H */
    public final ProxySelector mo97039H() {
        return this.f98621p;
    }

    /* renamed from: I */
    public final int mo97040I() {
        return this.f98604B;
    }

    /* renamed from: J */
    public final boolean mo97041J() {
        return this.f98614i;
    }

    /* renamed from: K */
    public final SocketFactory mo97042K() {
        return this.f98623r;
    }

    /* renamed from: L */
    public final SSLSocketFactory mo97043L() {
        SSLSocketFactory sSLSocketFactory = this.f98624s;
        if (sSLSocketFactory != null) {
            return sSLSocketFactory;
        }
        throw new IllegalStateException("CLEARTEXT-only client");
    }

    /* renamed from: N */
    public final int mo97044N() {
        return this.f98605C;
    }

    /* renamed from: O */
    public final X509TrustManager mo97045O() {
        return this.f98625t;
    }

    /* renamed from: a */
    public C41882e mo96791a(C41869b0 b0Var) {
        C41536l.m120489i(b0Var, "request");
        return new C43002e(this, b0Var, false);
    }

    public Object clone() {
        return super.clone();
    }

    /* renamed from: e */
    public final C41866b mo97047e() {
        return this.f98615j;
    }

    /* renamed from: f */
    public final C41871c mo97048f() {
        return null;
    }

    /* renamed from: g */
    public final int mo97049g() {
        return this.f98631z;
    }

    /* renamed from: h */
    public final C40309c mo97050h() {
        return this.f98630y;
    }

    /* renamed from: j */
    public final C41890g mo97051j() {
        return this.f98629x;
    }

    /* renamed from: k */
    public final int mo97052k() {
        return this.f98603A;
    }

    /* renamed from: l */
    public final C41903k mo97053l() {
        return this.f98610e;
    }

    /* renamed from: m */
    public final List mo97054m() {
        return this.f98626u;
    }

    /* renamed from: n */
    public final C41909n mo97055n() {
        return this.f98618m;
    }

    /* renamed from: o */
    public final C41913p mo97056o() {
        return this.f98609d;
    }

    /* renamed from: p */
    public final C41914q mo97057p() {
        return this.f98619n;
    }

    /* renamed from: q */
    public final C41917r.C41920c mo97058q() {
        return this.f98613h;
    }

    /* renamed from: r */
    public final boolean mo97059r() {
        return this.f98616k;
    }

    /* renamed from: s */
    public final boolean mo97060s() {
        return this.f98617l;
    }

    /* renamed from: t */
    public final C43015h mo97061t() {
        return this.f98608F;
    }

    /* renamed from: u */
    public final HostnameVerifier mo97062u() {
        return this.f98628w;
    }

    /* renamed from: y */
    public final List mo97063y() {
        return this.f98611f;
    }

    /* renamed from: z */
    public final long mo97064z() {
        return this.f98607E;
    }

    /* renamed from: of1.z$a */
    public static final class C41945a {

        /* renamed from: A */
        private int f98632A;

        /* renamed from: B */
        private long f98633B;

        /* renamed from: C */
        private C43015h f98634C;

        /* renamed from: a */
        private C41913p f98635a;

        /* renamed from: b */
        private C41903k f98636b;

        /* renamed from: c */
        private final List f98637c;

        /* renamed from: d */
        private final List f98638d;

        /* renamed from: e */
        private C41917r.C41920c f98639e;

        /* renamed from: f */
        private boolean f98640f;

        /* renamed from: g */
        private C41866b f98641g;

        /* renamed from: h */
        private boolean f98642h;

        /* renamed from: i */
        private boolean f98643i;

        /* renamed from: j */
        private C41909n f98644j;

        /* renamed from: k */
        private C41914q f98645k;

        /* renamed from: l */
        private Proxy f98646l;

        /* renamed from: m */
        private ProxySelector f98647m;

        /* renamed from: n */
        private C41866b f98648n;

        /* renamed from: o */
        private SocketFactory f98649o;

        /* renamed from: p */
        private SSLSocketFactory f98650p;

        /* renamed from: q */
        private X509TrustManager f98651q;

        /* renamed from: r */
        private List f98652r;

        /* renamed from: s */
        private List f98653s;

        /* renamed from: t */
        private HostnameVerifier f98654t;

        /* renamed from: u */
        private C41890g f98655u;

        /* renamed from: v */
        private C40309c f98656v;

        /* renamed from: w */
        private int f98657w;

        /* renamed from: x */
        private int f98658x;

        /* renamed from: y */
        private int f98659y;

        /* renamed from: z */
        private int f98660z;

        public C41945a() {
            this.f98635a = new C41913p();
            this.f98636b = new C41903k();
            this.f98637c = new ArrayList();
            this.f98638d = new ArrayList();
            this.f98639e = C42197d.m122541g(C41917r.f98534b);
            this.f98640f = true;
            C41866b bVar = C41866b.f98262b;
            this.f98641g = bVar;
            this.f98642h = true;
            this.f98643i = true;
            this.f98644j = C41909n.f98520b;
            this.f98645k = C41914q.f98531b;
            this.f98648n = bVar;
            SocketFactory socketFactory = SocketFactory.getDefault();
            C41536l.m120488h(socketFactory, "getDefault()");
            this.f98649o = socketFactory;
            C41946b bVar2 = C41944z.f98600G;
            this.f98652r = bVar2.mo97123a();
            this.f98653s = bVar2.mo97124b();
            this.f98654t = C40311d.f95767a;
            this.f98655u = C41890g.f98349d;
            this.f98658x = 10000;
            this.f98659y = 10000;
            this.f98660z = 10000;
            this.f98633B = 1024;
        }

        /* renamed from: A */
        public final int mo97065A() {
            return this.f98632A;
        }

        /* renamed from: B */
        public final List mo97066B() {
            return this.f98653s;
        }

        /* renamed from: C */
        public final Proxy mo97067C() {
            return this.f98646l;
        }

        /* renamed from: D */
        public final C41866b mo97068D() {
            return this.f98648n;
        }

        /* renamed from: E */
        public final ProxySelector mo97069E() {
            return this.f98647m;
        }

        /* renamed from: F */
        public final int mo97070F() {
            return this.f98659y;
        }

        /* renamed from: G */
        public final boolean mo97071G() {
            return this.f98640f;
        }

        /* renamed from: H */
        public final C43015h mo97072H() {
            return this.f98634C;
        }

        /* renamed from: I */
        public final SocketFactory mo97073I() {
            return this.f98649o;
        }

        /* renamed from: J */
        public final SSLSocketFactory mo97074J() {
            return this.f98650p;
        }

        /* renamed from: K */
        public final int mo97075K() {
            return this.f98660z;
        }

        /* renamed from: L */
        public final X509TrustManager mo97076L() {
            return this.f98651q;
        }

        /* renamed from: M */
        public final C41945a mo97077M(HostnameVerifier hostnameVerifier) {
            C41536l.m120489i(hostnameVerifier, "hostnameVerifier");
            if (!C41536l.m120484d(hostnameVerifier, mo97119w())) {
                mo97092a0((C43015h) null);
            }
            mo97087W(hostnameVerifier);
            return this;
        }

        /* renamed from: N */
        public final C41945a mo97078N(List list) {
            boolean z;
            C41536l.m120489i(list, "protocols");
            List B0 = C41358y.m119991B0(list);
            C41864a0 a0Var = C41864a0.H2_PRIOR_KNOWLEDGE;
            boolean z2 = false;
            if (B0.contains(a0Var) || B0.contains(C41864a0.HTTP_1_1)) {
                z = true;
            } else {
                z = false;
            }
            if (z) {
                if (!B0.contains(a0Var) || B0.size() <= 1) {
                    z2 = true;
                }
                if (!z2) {
                    throw new IllegalArgumentException(C41536l.m120497q("protocols containing h2_prior_knowledge cannot use other protocols: ", B0).toString());
                } else if (!(!B0.contains(C41864a0.HTTP_1_0))) {
                    throw new IllegalArgumentException(C41536l.m120497q("protocols must not contain http/1.0: ", B0).toString());
                } else if (!B0.contains((Object) null)) {
                    B0.remove(C41864a0.SPDY_3);
                    if (!C41536l.m120484d(B0, mo97066B())) {
                        mo97092a0((C43015h) null);
                    }
                    List unmodifiableList = Collections.unmodifiableList(B0);
                    C41536l.m120488h(unmodifiableList, "unmodifiableList(protocolsCopy)");
                    mo97088X(unmodifiableList);
                    return this;
                } else {
                    throw new IllegalArgumentException("protocols must not contain null".toString());
                }
            } else {
                throw new IllegalArgumentException(C41536l.m120497q("protocols must contain h2_prior_knowledge or http/1.1: ", B0).toString());
            }
        }

        /* renamed from: O */
        public final C41945a mo97079O(long j, TimeUnit timeUnit) {
            C41536l.m120489i(timeUnit, "unit");
            mo97089Y(C42197d.m122545k("timeout", j, timeUnit));
            return this;
        }

        /* renamed from: P */
        public final C41945a mo97080P(boolean z) {
            mo97090Z(z);
            return this;
        }

        /* renamed from: Q */
        public final void mo97081Q(C41866b bVar) {
            C41536l.m120489i(bVar, "<set-?>");
            this.f98641g = bVar;
        }

        /* renamed from: R */
        public final void mo97082R(C41871c cVar) {
        }

        /* renamed from: S */
        public final void mo97083S(C40309c cVar) {
            this.f98656v = cVar;
        }

        /* renamed from: T */
        public final void mo97084T(int i) {
            this.f98658x = i;
        }

        /* renamed from: U */
        public final void mo97085U(C41913p pVar) {
            C41536l.m120489i(pVar, "<set-?>");
            this.f98635a = pVar;
        }

        /* renamed from: V */
        public final void mo97086V(C41917r.C41920c cVar) {
            C41536l.m120489i(cVar, "<set-?>");
            this.f98639e = cVar;
        }

        /* renamed from: W */
        public final void mo97087W(HostnameVerifier hostnameVerifier) {
            C41536l.m120489i(hostnameVerifier, "<set-?>");
            this.f98654t = hostnameVerifier;
        }

        /* renamed from: X */
        public final void mo97088X(List list) {
            C41536l.m120489i(list, "<set-?>");
            this.f98653s = list;
        }

        /* renamed from: Y */
        public final void mo97089Y(int i) {
            this.f98659y = i;
        }

        /* renamed from: Z */
        public final void mo97090Z(boolean z) {
            this.f98640f = z;
        }

        /* renamed from: a */
        public final C41945a mo97091a(C41935w wVar) {
            C41536l.m120489i(wVar, "interceptor");
            mo97120x().add(wVar);
            return this;
        }

        /* renamed from: a0 */
        public final void mo97092a0(C43015h hVar) {
            this.f98634C = hVar;
        }

        /* renamed from: b */
        public final C41945a mo97093b(C41935w wVar) {
            C41536l.m120489i(wVar, "interceptor");
            mo97122z().add(wVar);
            return this;
        }

        /* renamed from: b0 */
        public final void mo97094b0(SSLSocketFactory sSLSocketFactory) {
            this.f98650p = sSLSocketFactory;
        }

        /* renamed from: c */
        public final C41945a mo97095c(C41866b bVar) {
            C41536l.m120489i(bVar, "authenticator");
            mo97081Q(bVar);
            return this;
        }

        /* renamed from: c0 */
        public final void mo97096c0(int i) {
            this.f98660z = i;
        }

        /* renamed from: d */
        public final C41944z mo97097d() {
            return new C41944z(this);
        }

        /* renamed from: d0 */
        public final void mo97098d0(X509TrustManager x509TrustManager) {
            this.f98651q = x509TrustManager;
        }

        /* renamed from: e */
        public final C41945a mo97099e(C41871c cVar) {
            mo97082R(cVar);
            return this;
        }

        /* renamed from: e0 */
        public final C41945a mo97100e0(SSLSocketFactory sSLSocketFactory, X509TrustManager x509TrustManager) {
            C41536l.m120489i(sSLSocketFactory, "sslSocketFactory");
            C41536l.m120489i(x509TrustManager, "trustManager");
            if (!C41536l.m120484d(sSLSocketFactory, mo97074J()) || !C41536l.m120484d(x509TrustManager, mo97076L())) {
                mo97092a0((C43015h) null);
            }
            mo97094b0(sSLSocketFactory);
            mo97083S(C40309c.f95766a.mo94340a(x509TrustManager));
            mo97098d0(x509TrustManager);
            return this;
        }

        /* renamed from: f */
        public final C41945a mo97101f(long j, TimeUnit timeUnit) {
            C41536l.m120489i(timeUnit, "unit");
            mo97084T(C42197d.m122545k("timeout", j, timeUnit));
            return this;
        }

        /* renamed from: f0 */
        public final C41945a mo97102f0(long j, TimeUnit timeUnit) {
            C41536l.m120489i(timeUnit, "unit");
            mo97096c0(C42197d.m122545k("timeout", j, timeUnit));
            return this;
        }

        /* renamed from: g */
        public final C41945a mo97103g(C41913p pVar) {
            C41536l.m120489i(pVar, "dispatcher");
            mo97085U(pVar);
            return this;
        }

        /* renamed from: h */
        public final C41945a mo97104h(C41917r rVar) {
            C41536l.m120489i(rVar, "eventListener");
            mo97086V(C42197d.m122541g(rVar));
            return this;
        }

        /* renamed from: i */
        public final C41866b mo97105i() {
            return this.f98641g;
        }

        /* renamed from: j */
        public final C41871c mo97106j() {
            return null;
        }

        /* renamed from: k */
        public final int mo97107k() {
            return this.f98657w;
        }

        /* renamed from: l */
        public final C40309c mo97108l() {
            return this.f98656v;
        }

        /* renamed from: m */
        public final C41890g mo97109m() {
            return this.f98655u;
        }

        /* renamed from: n */
        public final int mo97110n() {
            return this.f98658x;
        }

        /* renamed from: o */
        public final C41903k mo97111o() {
            return this.f98636b;
        }

        /* renamed from: p */
        public final List mo97112p() {
            return this.f98652r;
        }

        /* renamed from: q */
        public final C41909n mo97113q() {
            return this.f98644j;
        }

        /* renamed from: r */
        public final C41913p mo97114r() {
            return this.f98635a;
        }

        /* renamed from: s */
        public final C41914q mo97115s() {
            return this.f98645k;
        }

        /* renamed from: t */
        public final C41917r.C41920c mo97116t() {
            return this.f98639e;
        }

        /* renamed from: u */
        public final boolean mo97117u() {
            return this.f98642h;
        }

        /* renamed from: v */
        public final boolean mo97118v() {
            return this.f98643i;
        }

        /* renamed from: w */
        public final HostnameVerifier mo97119w() {
            return this.f98654t;
        }

        /* renamed from: x */
        public final List mo97120x() {
            return this.f98637c;
        }

        /* renamed from: y */
        public final long mo97121y() {
            return this.f98633B;
        }

        /* renamed from: z */
        public final List mo97122z() {
            return this.f98638d;
        }

        /* JADX INFO: this call moved to the top of the method (can break code semantics) */
        public C41945a(C41944z zVar) {
            this();
            C41536l.m120489i(zVar, "okHttpClient");
            this.f98635a = zVar.mo97056o();
            this.f98636b = zVar.mo97053l();
            boolean unused = C41352v.m119965z(this.f98637c, zVar.mo97063y());
            boolean unused2 = C41352v.m119965z(this.f98638d, zVar.mo97032A());
            this.f98639e = zVar.mo97058q();
            this.f98640f = zVar.mo97041J();
            this.f98641g = zVar.mo97047e();
            this.f98642h = zVar.mo97059r();
            this.f98643i = zVar.mo97060s();
            this.f98644j = zVar.mo97055n();
            zVar.mo97048f();
            this.f98645k = zVar.mo97057p();
            this.f98646l = zVar.mo97037F();
            this.f98647m = zVar.mo97039H();
            this.f98648n = zVar.mo97038G();
            this.f98649o = zVar.mo97042K();
            this.f98650p = zVar.f98624s;
            this.f98651q = zVar.mo97045O();
            this.f98652r = zVar.mo97054m();
            this.f98653s = zVar.mo97036E();
            this.f98654t = zVar.mo97062u();
            this.f98655u = zVar.mo97051j();
            this.f98656v = zVar.mo97050h();
            this.f98657w = zVar.mo97049g();
            this.f98658x = zVar.mo97052k();
            this.f98659y = zVar.mo97040I();
            this.f98660z = zVar.mo97044N();
            this.f98632A = zVar.mo97035D();
            this.f98633B = zVar.mo97064z();
            this.f98634C = zVar.mo97061t();
        }
    }

    public C41944z() {
        this(new C41945a());
    }
}
