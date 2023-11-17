package tf1;

import ag1.C40309c;
import ag1.C40311d;
import bg1.C40370d;
import dg1.C40677c;
import dg1.C40679d;
import dg1.C40691m;
import java.io.IOException;
import java.net.ConnectException;
import java.net.Proxy;
import java.net.Socket;
import java.security.cert.Certificate;
import java.security.cert.X509Certificate;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.TimeUnit;
import javax.net.ssl.SSLPeerUnverifiedException;
import kotlin.jvm.internal.C41536l;
import kotlin.jvm.internal.C41537m;
import kotlin.jvm.internal.DefaultConstructorMarker;
import of1.C41863a;
import of1.C41864a0;
import of1.C41869b0;
import of1.C41872c0;
import of1.C41880d0;
import of1.C41882e;
import of1.C41889f0;
import of1.C41890g;
import of1.C41902j;
import of1.C41917r;
import of1.C41924t;
import of1.C41931v;
import of1.C41944z;
import okhttp3.internal.http2.ConnectionShutdownException;
import okhttp3.internal.http2.StreamResetException;
import pf1.C42197d;
import sf1.C42562e;
import ue1.C43064a;
import uf1.C43091d;
import uf1.C43094g;
import vf1.C43159b;
import wf1.C43194a;
import wf1.C43202e;
import wf1.C43221f;
import wf1.C43227h;
import wf1.C43239l;
import xf1.C43286k;

/* renamed from: tf1.f */
public final class C43006f extends C43202e.C43205c implements C41902j {

    /* renamed from: t */
    public static final C43007a f100399t = new C43007a((DefaultConstructorMarker) null);

    /* renamed from: c */
    private final C43012g f100400c;

    /* renamed from: d */
    private final C41889f0 f100401d;

    /* renamed from: e */
    private Socket f100402e;

    /* renamed from: f */
    private Socket f100403f;
    /* access modifiers changed from: private */

    /* renamed from: g */
    public C41924t f100404g;

    /* renamed from: h */
    private C41864a0 f100405h;

    /* renamed from: i */
    private C43202e f100406i;

    /* renamed from: j */
    private C40679d f100407j;

    /* renamed from: k */
    private C40677c f100408k;

    /* renamed from: l */
    private boolean f100409l;

    /* renamed from: m */
    private boolean f100410m;

    /* renamed from: n */
    private int f100411n;

    /* renamed from: o */
    private int f100412o;

    /* renamed from: p */
    private int f100413p;

    /* renamed from: q */
    private int f100414q = 1;

    /* renamed from: r */
    private final List f100415r = new ArrayList();

    /* renamed from: s */
    private long f100416s = Long.MAX_VALUE;

    /* renamed from: tf1.f$a */
    public static final class C43007a {
        private C43007a() {
        }

        public /* synthetic */ C43007a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    /* renamed from: tf1.f$b */
    public /* synthetic */ class C43008b {

        /* renamed from: a */
        public static final /* synthetic */ int[] f100417a;

        static {
            int[] iArr = new int[Proxy.Type.values().length];
            iArr[Proxy.Type.DIRECT.ordinal()] = 1;
            iArr[Proxy.Type.HTTP.ordinal()] = 2;
            f100417a = iArr;
        }
    }

    /* renamed from: tf1.f$c */
    static final class C43009c extends C41537m implements C43064a {

        /* renamed from: d */
        final /* synthetic */ C41890g f100418d;

        /* renamed from: e */
        final /* synthetic */ C41924t f100419e;

        /* renamed from: f */
        final /* synthetic */ C41863a f100420f;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C43009c(C41890g gVar, C41924t tVar, C41863a aVar) {
            super(0);
            this.f100418d = gVar;
            this.f100419e = tVar;
            this.f100420f = aVar;
        }

        /* renamed from: b */
        public final List invoke() {
            C40309c d = this.f100418d.mo96810d();
            C41536l.m120486f(d);
            return d.mo94334a(this.f100419e.mo96917d(), this.f100420f.mo96668l().mo96954i());
        }
    }

    /* renamed from: tf1.f$d */
    static final class C43010d extends C41537m implements C43064a {

        /* renamed from: d */
        final /* synthetic */ C43006f f100421d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C43010d(C43006f fVar) {
            super(0);
            this.f100421d = fVar;
        }

        /* renamed from: b */
        public final List invoke() {
            C41924t d = this.f100421d.f100404g;
            C41536l.m120486f(d);
            List<Certificate> d2 = d.mo96917d();
            ArrayList arrayList = new ArrayList(C41343r.m119925u(d2, 10));
            for (Certificate certificate : d2) {
                arrayList.add((X509Certificate) certificate);
            }
            return arrayList;
        }
    }

    /* renamed from: tf1.f$e */
    public static final class C43011e extends C40370d.C40374d {

        /* renamed from: g */
        final /* synthetic */ C40679d f100422g;

        /* renamed from: h */
        final /* synthetic */ C40677c f100423h;

        /* renamed from: i */
        final /* synthetic */ C42998c f100424i;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C43011e(C40679d dVar, C40677c cVar, C42998c cVar2) {
            super(true, dVar, cVar);
            this.f100422g = dVar;
            this.f100423h = cVar;
            this.f100424i = cVar2;
        }

        public void close() {
            this.f100424i.mo101507a(-1, true, true, (IOException) null);
        }
    }

    public C43006f(C43012g gVar, C41889f0 f0Var) {
        C41536l.m120489i(gVar, "connectionPool");
        C41536l.m120489i(f0Var, "route");
        this.f100400c = gVar;
        this.f100401d = f0Var;
    }

    /* renamed from: C */
    private final boolean m123426C(List list) {
        boolean z;
        if ((list instanceof Collection) && list.isEmpty()) {
            return false;
        }
        Iterator it = list.iterator();
        while (it.hasNext()) {
            C41889f0 f0Var = (C41889f0) it.next();
            if (f0Var.mo96801b().type() == Proxy.Type.DIRECT && this.f100401d.mo96801b().type() == Proxy.Type.DIRECT && C41536l.m120484d(this.f100401d.mo96803d(), f0Var.mo96803d())) {
                z = true;
                continue;
            } else {
                z = false;
                continue;
            }
            if (z) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: G */
    private final void m123427G(int i) {
        Socket socket = this.f100403f;
        C41536l.m120486f(socket);
        C40679d dVar = this.f100407j;
        C41536l.m120486f(dVar);
        C40677c cVar = this.f100408k;
        C41536l.m120486f(cVar);
        socket.setSoTimeout(0);
        C43202e a = new C43202e.C43203a(true, C42562e.f100169i).mo101821s(socket, this.f100401d.mo96800a().mo96668l().mo96954i(), dVar, cVar).mo101813k(this).mo101814l(i).mo101803a();
        this.f100406i = a;
        this.f100414q = C43202e.f100805F.mo101822a().mo101920d();
        C43202e.m123951y1(a, false, (C42562e) null, 3, (Object) null);
    }

    /* renamed from: H */
    private final boolean m123428H(C41931v vVar) {
        C41924t tVar;
        if (!C42197d.f99271h || Thread.holdsLock(this)) {
            C41931v l = this.f100401d.mo96800a().mo96668l();
            if (vVar.mo96959o() != l.mo96959o()) {
                return false;
            }
            if (C41536l.m120484d(vVar.mo96954i(), l.mo96954i())) {
                return true;
            }
            if (this.f100410m || (tVar = this.f100404g) == null) {
                return false;
            }
            C41536l.m120486f(tVar);
            if (m123430f(vVar, tVar)) {
                return true;
            }
            return false;
        }
        throw new AssertionError("Thread " + Thread.currentThread().getName() + " MUST hold lock on " + this);
    }

    /* renamed from: f */
    private final boolean m123430f(C41931v vVar, C41924t tVar) {
        List d = tVar.mo96917d();
        if (!(!d.isEmpty()) || !C40311d.f95767a.mo94342e(vVar.mo96954i(), (X509Certificate) d.get(0))) {
            return false;
        }
        return true;
    }

    /* renamed from: i */
    private final void m123431i(int i, int i2, C41882e eVar, C41917r rVar) {
        int i3;
        Socket socket;
        Proxy b = this.f100401d.mo96801b();
        C41863a a = this.f100401d.mo96800a();
        Proxy.Type type = b.type();
        if (type == null) {
            i3 = -1;
        } else {
            i3 = C43008b.f100417a[type.ordinal()];
        }
        if (i3 == 1 || i3 == 2) {
            socket = a.mo96666j().createSocket();
            C41536l.m120486f(socket);
        } else {
            socket = new Socket(b);
        }
        this.f100402e = socket;
        rVar.mo96893i(eVar, this.f100401d.mo96803d(), b);
        socket.setSoTimeout(i2);
        try {
            C43286k.f101052a.mo101988g().mo101959f(socket, this.f100401d.mo96803d(), i);
            try {
                this.f100407j = C40691m.m117770b(C40691m.m117775g(socket));
                this.f100408k = C40691m.m117769a(C40691m.m117772d(socket));
            } catch (NullPointerException e) {
                if (C41536l.m120484d(e.getMessage(), "throw with null exception")) {
                    throw new IOException(e);
                }
            }
        } catch (ConnectException e2) {
            ConnectException connectException = new ConnectException(C41536l.m120497q("Failed to connect to ", this.f100401d.mo96803d()));
            connectException.initCause(e2);
            throw connectException;
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v1, resolved type: javax.net.ssl.SSLSocket} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v3, resolved type: java.lang.String} */
    /* JADX WARNING: type inference failed for: r2v0 */
    /* JADX WARNING: type inference failed for: r2v2 */
    /* JADX WARNING: type inference failed for: r2v6 */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:34:0x0173  */
    /* JADX WARNING: Removed duplicated region for block: B:36:0x017f  */
    /* renamed from: j */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final void m123432j(tf1.C42997b r11) {
        /*
            r10 = this;
            of1.f0 r0 = r10.f100401d
            of1.a r0 = r0.mo96800a()
            javax.net.ssl.SSLSocketFactory r1 = r0.mo96667k()
            r2 = 0
            kotlin.jvm.internal.C41536l.m120486f(r1)     // Catch:{ all -> 0x0170 }
            java.net.Socket r3 = r10.f100402e     // Catch:{ all -> 0x0170 }
            of1.v r4 = r0.mo96668l()     // Catch:{ all -> 0x0170 }
            java.lang.String r4 = r4.mo96954i()     // Catch:{ all -> 0x0170 }
            of1.v r5 = r0.mo96668l()     // Catch:{ all -> 0x0170 }
            int r5 = r5.mo96959o()     // Catch:{ all -> 0x0170 }
            r6 = 1
            java.net.Socket r1 = r1.createSocket(r3, r4, r5, r6)     // Catch:{ all -> 0x0170 }
            if (r1 == 0) goto L_0x0168
            javax.net.ssl.SSLSocket r1 = (javax.net.ssl.SSLSocket) r1     // Catch:{ all -> 0x0170 }
            of1.l r11 = r11.mo101505a(r1)     // Catch:{ all -> 0x0165 }
            boolean r3 = r11.mo96839h()     // Catch:{ all -> 0x0165 }
            if (r3 == 0) goto L_0x0048
            xf1.k$a r3 = xf1.C43286k.f101052a     // Catch:{ all -> 0x0165 }
            xf1.k r3 = r3.mo101988g()     // Catch:{ all -> 0x0165 }
            of1.v r4 = r0.mo96668l()     // Catch:{ all -> 0x0165 }
            java.lang.String r4 = r4.mo96954i()     // Catch:{ all -> 0x0165 }
            java.util.List r5 = r0.mo96661f()     // Catch:{ all -> 0x0165 }
            r3.mo101953e(r1, r4, r5)     // Catch:{ all -> 0x0165 }
        L_0x0048:
            r1.startHandshake()     // Catch:{ all -> 0x0165 }
            javax.net.ssl.SSLSession r3 = r1.getSession()     // Catch:{ all -> 0x0165 }
            of1.t$a r4 = of1.C41924t.f98542e     // Catch:{ all -> 0x0165 }
            java.lang.String r5 = "sslSocketSession"
            kotlin.jvm.internal.C41536l.m120488h(r3, r5)     // Catch:{ all -> 0x0165 }
            of1.t r4 = r4.mo96922a(r3)     // Catch:{ all -> 0x0165 }
            javax.net.ssl.HostnameVerifier r5 = r0.mo96659e()     // Catch:{ all -> 0x0165 }
            kotlin.jvm.internal.C41536l.m120486f(r5)     // Catch:{ all -> 0x0165 }
            of1.v r7 = r0.mo96668l()     // Catch:{ all -> 0x0165 }
            java.lang.String r7 = r7.mo96954i()     // Catch:{ all -> 0x0165 }
            boolean r3 = r5.verify(r7, r3)     // Catch:{ all -> 0x0165 }
            if (r3 != 0) goto L_0x00f9
            java.util.List r11 = r4.mo96917d()     // Catch:{ all -> 0x0165 }
            boolean r3 = r11.isEmpty()     // Catch:{ all -> 0x0165 }
            r3 = r3 ^ r6
            if (r3 == 0) goto L_0x00d5
            r3 = 0
            java.lang.Object r11 = r11.get(r3)     // Catch:{ all -> 0x0165 }
            java.security.cert.X509Certificate r11 = (java.security.cert.X509Certificate) r11     // Catch:{ all -> 0x0165 }
            javax.net.ssl.SSLPeerUnverifiedException r3 = new javax.net.ssl.SSLPeerUnverifiedException     // Catch:{ all -> 0x0165 }
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch:{ all -> 0x0165 }
            r4.<init>()     // Catch:{ all -> 0x0165 }
            java.lang.String r5 = "\n              |Hostname "
            r4.append(r5)     // Catch:{ all -> 0x0165 }
            of1.v r0 = r0.mo96668l()     // Catch:{ all -> 0x0165 }
            java.lang.String r0 = r0.mo96954i()     // Catch:{ all -> 0x0165 }
            r4.append(r0)     // Catch:{ all -> 0x0165 }
            java.lang.String r0 = " not verified:\n              |    certificate: "
            r4.append(r0)     // Catch:{ all -> 0x0165 }
            of1.g$b r0 = of1.C41890g.f98348c     // Catch:{ all -> 0x0165 }
            java.lang.String r0 = r0.mo96815a(r11)     // Catch:{ all -> 0x0165 }
            r4.append(r0)     // Catch:{ all -> 0x0165 }
            java.lang.String r0 = "\n              |    DN: "
            r4.append(r0)     // Catch:{ all -> 0x0165 }
            java.security.Principal r0 = r11.getSubjectDN()     // Catch:{ all -> 0x0165 }
            java.lang.String r0 = r0.getName()     // Catch:{ all -> 0x0165 }
            r4.append(r0)     // Catch:{ all -> 0x0165 }
            java.lang.String r0 = "\n              |    subjectAltNames: "
            r4.append(r0)     // Catch:{ all -> 0x0165 }
            ag1.d r0 = ag1.C40311d.f95767a     // Catch:{ all -> 0x0165 }
            java.util.List r11 = r0.mo94341a(r11)     // Catch:{ all -> 0x0165 }
            r4.append(r11)     // Catch:{ all -> 0x0165 }
            java.lang.String r11 = "\n              "
            r4.append(r11)     // Catch:{ all -> 0x0165 }
            java.lang.String r11 = r4.toString()     // Catch:{ all -> 0x0165 }
            java.lang.String r11 = cf1.C40430p.m117091e(r11, r2, r6, r2)     // Catch:{ all -> 0x0165 }
            r3.<init>(r11)     // Catch:{ all -> 0x0165 }
            throw r3     // Catch:{ all -> 0x0165 }
        L_0x00d5:
            javax.net.ssl.SSLPeerUnverifiedException r11 = new javax.net.ssl.SSLPeerUnverifiedException     // Catch:{ all -> 0x0165 }
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch:{ all -> 0x0165 }
            r2.<init>()     // Catch:{ all -> 0x0165 }
            java.lang.String r3 = "Hostname "
            r2.append(r3)     // Catch:{ all -> 0x0165 }
            of1.v r0 = r0.mo96668l()     // Catch:{ all -> 0x0165 }
            java.lang.String r0 = r0.mo96954i()     // Catch:{ all -> 0x0165 }
            r2.append(r0)     // Catch:{ all -> 0x0165 }
            java.lang.String r0 = " not verified (no certificates)"
            r2.append(r0)     // Catch:{ all -> 0x0165 }
            java.lang.String r0 = r2.toString()     // Catch:{ all -> 0x0165 }
            r11.<init>(r0)     // Catch:{ all -> 0x0165 }
            throw r11     // Catch:{ all -> 0x0165 }
        L_0x00f9:
            of1.g r3 = r0.mo96655a()     // Catch:{ all -> 0x0165 }
            kotlin.jvm.internal.C41536l.m120486f(r3)     // Catch:{ all -> 0x0165 }
            of1.t r5 = new of1.t     // Catch:{ all -> 0x0165 }
            of1.g0 r6 = r4.mo96918e()     // Catch:{ all -> 0x0165 }
            of1.i r7 = r4.mo96915a()     // Catch:{ all -> 0x0165 }
            java.util.List r8 = r4.mo96916c()     // Catch:{ all -> 0x0165 }
            tf1.f$c r9 = new tf1.f$c     // Catch:{ all -> 0x0165 }
            r9.<init>(r3, r4, r0)     // Catch:{ all -> 0x0165 }
            r5.<init>(r6, r7, r8, r9)     // Catch:{ all -> 0x0165 }
            r10.f100404g = r5     // Catch:{ all -> 0x0165 }
            of1.v r0 = r0.mo96668l()     // Catch:{ all -> 0x0165 }
            java.lang.String r0 = r0.mo96954i()     // Catch:{ all -> 0x0165 }
            tf1.f$d r4 = new tf1.f$d     // Catch:{ all -> 0x0165 }
            r4.<init>(r10)     // Catch:{ all -> 0x0165 }
            r3.mo96808b(r0, r4)     // Catch:{ all -> 0x0165 }
            boolean r11 = r11.mo96839h()     // Catch:{ all -> 0x0165 }
            if (r11 == 0) goto L_0x0138
            xf1.k$a r11 = xf1.C43286k.f101052a     // Catch:{ all -> 0x0165 }
            xf1.k r11 = r11.mo101988g()     // Catch:{ all -> 0x0165 }
            java.lang.String r2 = r11.mo101954g(r1)     // Catch:{ all -> 0x0165 }
        L_0x0138:
            r10.f100403f = r1     // Catch:{ all -> 0x0165 }
            dg1.z r11 = dg1.C40691m.m117775g(r1)     // Catch:{ all -> 0x0165 }
            dg1.d r11 = dg1.C40691m.m117770b(r11)     // Catch:{ all -> 0x0165 }
            r10.f100407j = r11     // Catch:{ all -> 0x0165 }
            dg1.x r11 = dg1.C40691m.m117772d(r1)     // Catch:{ all -> 0x0165 }
            dg1.c r11 = dg1.C40691m.m117769a(r11)     // Catch:{ all -> 0x0165 }
            r10.f100408k = r11     // Catch:{ all -> 0x0165 }
            if (r2 == 0) goto L_0x0157
            of1.a0$a r11 = of1.C41864a0.f98252e     // Catch:{ all -> 0x0165 }
            of1.a0 r11 = r11.mo96671a(r2)     // Catch:{ all -> 0x0165 }
            goto L_0x0159
        L_0x0157:
            of1.a0 r11 = of1.C41864a0.HTTP_1_1     // Catch:{ all -> 0x0165 }
        L_0x0159:
            r10.f100405h = r11     // Catch:{ all -> 0x0165 }
            xf1.k$a r11 = xf1.C43286k.f101052a
            xf1.k r11 = r11.mo101988g()
            r11.mo101975b(r1)
            return
        L_0x0165:
            r11 = move-exception
            r2 = r1
            goto L_0x0171
        L_0x0168:
            java.lang.NullPointerException r11 = new java.lang.NullPointerException     // Catch:{ all -> 0x0170 }
            java.lang.String r0 = "null cannot be cast to non-null type javax.net.ssl.SSLSocket"
            r11.<init>(r0)     // Catch:{ all -> 0x0170 }
            throw r11     // Catch:{ all -> 0x0170 }
        L_0x0170:
            r11 = move-exception
        L_0x0171:
            if (r2 == 0) goto L_0x017c
            xf1.k$a r0 = xf1.C43286k.f101052a
            xf1.k r0 = r0.mo101988g()
            r0.mo101975b(r2)
        L_0x017c:
            if (r2 != 0) goto L_0x017f
            goto L_0x0182
        L_0x017f:
            pf1.C42197d.m122548n(r2)
        L_0x0182:
            throw r11
        */
        throw new UnsupportedOperationException("Method not decompiled: tf1.C43006f.m123432j(tf1.b):void");
    }

    /* renamed from: k */
    private final void m123433k(int i, int i2, int i3, C41882e eVar, C41917r rVar) {
        C41869b0 m = m123435m();
        C41931v j = m.mo96681j();
        int i4 = 0;
        while (i4 < 21) {
            i4++;
            m123431i(i, i2, eVar, rVar);
            m = m123434l(i2, i3, m, j);
            if (m != null) {
                Socket socket = this.f100402e;
                if (socket != null) {
                    C42197d.m122548n(socket);
                }
                this.f100402e = null;
                this.f100408k = null;
                this.f100407j = null;
                rVar.mo96891g(eVar, this.f100401d.mo96803d(), this.f100401d.mo96801b(), (C41864a0) null);
            } else {
                return;
            }
        }
    }

    /* renamed from: l */
    private final C41869b0 m123434l(int i, int i2, C41869b0 b0Var, C41931v vVar) {
        String str = "CONNECT " + C42197d.m122525S(vVar, true) + " HTTP/1.1";
        while (true) {
            C40679d dVar = this.f100407j;
            C41536l.m120486f(dVar);
            C40677c cVar = this.f100408k;
            C41536l.m120486f(cVar);
            C43159b bVar = new C43159b((C41944z) null, this, dVar, cVar);
            TimeUnit timeUnit = TimeUnit.MILLISECONDS;
            dVar.mo94678C().mo94688g((long) i, timeUnit);
            cVar.mo94673C().mo94688g((long) i2, timeUnit);
            bVar.mo101725A(b0Var.mo96676e(), str);
            bVar.mo101652a();
            C41880d0.C41881a f = bVar.mo101658f(false);
            C41536l.m120486f(f);
            C41880d0 c = f.mo96778s(b0Var).mo96764c();
            bVar.mo101726z(c);
            int q = c.mo96747q();
            if (q != 200) {
                if (q == 407) {
                    C41869b0 a = this.f100401d.mo96800a().mo96663h().mo91242a(this.f100401d, c);
                    if (a == null) {
                        throw new IOException("Failed to authenticate with proxy");
                    } else if (C40439w.m117115s("close", C41880d0.m121379v(c, "Connection", (String) null, 2, (Object) null), true)) {
                        return a;
                    } else {
                        b0Var = a;
                    }
                } else {
                    throw new IOException(C41536l.m120497q("Unexpected response code for CONNECT: ", Integer.valueOf(c.mo96747q())));
                }
            } else if (dVar.mo94690B().mo94714Q0() && cVar.mo94690B().mo94714Q0()) {
                return null;
            } else {
                throw new IOException("TLS tunnel buffered too many bytes!");
            }
        }
    }

    /* renamed from: m */
    private final C41869b0 m123435m() {
        C41869b0 b = new C41869b0.C41870a().mo96706x(this.f100401d.mo96800a().mo96668l()).mo96693k("CONNECT", (C41872c0) null).mo96691i("Host", C42197d.m122525S(this.f100401d.mo96800a().mo96668l(), true)).mo96691i("Proxy-Connection", "Keep-Alive").mo96691i("User-Agent", "okhttp/4.10.0").mo96684b();
        C41869b0 a = this.f100401d.mo96800a().mo96663h().mo91242a(this.f100401d, new C41880d0.C41881a().mo96778s(b).mo96776q(C41864a0.HTTP_1_1).mo96766g(407).mo96773n("Preemptive Authenticate").mo96763b(C42197d.f99266c).mo96779t(-1).mo96777r(-1).mo96770k("Proxy-Authenticate", "OkHttp-Preemptive").mo96764c());
        if (a == null) {
            return b;
        }
        return a;
    }

    /* renamed from: n */
    private final void m123436n(C42997b bVar, int i, C41882e eVar, C41917r rVar) {
        if (this.f100401d.mo96800a().mo96667k() == null) {
            List f = this.f100401d.mo96800a().mo96661f();
            C41864a0 a0Var = C41864a0.H2_PRIOR_KNOWLEDGE;
            if (f.contains(a0Var)) {
                this.f100403f = this.f100402e;
                this.f100405h = a0Var;
                m123427G(i);
                return;
            }
            this.f100403f = this.f100402e;
            this.f100405h = C41864a0.HTTP_1_1;
            return;
        }
        rVar.mo96884B(eVar);
        m123432j(bVar);
        rVar.mo96883A(eVar, this.f100404g);
        if (this.f100405h == C41864a0.HTTP_2) {
            m123427G(i);
        }
    }

    /* renamed from: A */
    public final synchronized void mo101561A() {
        this.f100409l = true;
    }

    /* renamed from: B */
    public C41889f0 mo101562B() {
        return this.f100401d;
    }

    /* renamed from: D */
    public final void mo101563D(long j) {
        this.f100416s = j;
    }

    /* renamed from: E */
    public final void mo101564E(boolean z) {
        this.f100409l = z;
    }

    /* renamed from: F */
    public Socket mo101565F() {
        Socket socket = this.f100403f;
        C41536l.m120486f(socket);
        return socket;
    }

    /* renamed from: I */
    public final synchronized void mo101566I(C43002e eVar, IOException iOException) {
        C41536l.m120489i(eVar, "call");
        if (iOException instanceof StreamResetException) {
            if (((StreamResetException) iOException).f98691d == C43194a.REFUSED_STREAM) {
                int i = this.f100413p + 1;
                this.f100413p = i;
                if (i > 1) {
                    this.f100409l = true;
                    this.f100411n++;
                }
            } else if (((StreamResetException) iOException).f98691d != C43194a.CANCEL || !eVar.mo96790x()) {
                this.f100409l = true;
                this.f100411n++;
            }
        } else if (!mo101581w() || (iOException instanceof ConnectionShutdownException)) {
            this.f100409l = true;
            if (this.f100412o == 0) {
                if (iOException != null) {
                    mo101571h(eVar.mo101541k(), this.f100401d, iOException);
                }
                this.f100411n++;
            }
        }
    }

    /* renamed from: a */
    public C41864a0 mo96832a() {
        C41864a0 a0Var = this.f100405h;
        C41536l.m120486f(a0Var);
        return a0Var;
    }

    /* renamed from: b */
    public synchronized void mo101567b(C43202e eVar, C43239l lVar) {
        C41536l.m120489i(eVar, "connection");
        C41536l.m120489i(lVar, "settings");
        this.f100414q = lVar.mo101920d();
    }

    /* renamed from: c */
    public void mo101568c(C43227h hVar) {
        C41536l.m120489i(hVar, "stream");
        hVar.mo101858d(C43194a.REFUSED_STREAM, (IOException) null);
    }

    /* renamed from: e */
    public final void mo101569e() {
        Socket socket = this.f100402e;
        if (socket != null) {
            C42197d.m122548n(socket);
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:21:0x00a2 A[Catch:{ IOException -> 0x00fd }] */
    /* JADX WARNING: Removed duplicated region for block: B:24:0x00bb  */
    /* JADX WARNING: Removed duplicated region for block: B:34:0x00e5  */
    /* JADX WARNING: Removed duplicated region for block: B:36:0x00f2  */
    /* JADX WARNING: Removed duplicated region for block: B:45:0x0109  */
    /* JADX WARNING: Removed duplicated region for block: B:48:0x0111  */
    /* JADX WARNING: Removed duplicated region for block: B:51:0x013b  */
    /* JADX WARNING: Removed duplicated region for block: B:52:0x0141  */
    /* renamed from: g */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo101570g(int r17, int r18, int r19, int r20, boolean r21, of1.C41882e r22, of1.C41917r r23) {
        /*
            r16 = this;
            r7 = r16
            r8 = r22
            r9 = r23
            java.lang.String r0 = "call"
            kotlin.jvm.internal.C41536l.m120489i(r8, r0)
            java.lang.String r0 = "eventListener"
            kotlin.jvm.internal.C41536l.m120489i(r9, r0)
            of1.a0 r0 = r7.f100405h
            r10 = 1
            if (r0 != 0) goto L_0x0017
            r0 = r10
            goto L_0x0018
        L_0x0017:
            r0 = 0
        L_0x0018:
            if (r0 == 0) goto L_0x015c
            of1.f0 r0 = r7.f100401d
            of1.a r0 = r0.mo96800a()
            java.util.List r0 = r0.mo96656b()
            tf1.b r11 = new tf1.b
            r11.<init>(r0)
            of1.f0 r1 = r7.f100401d
            of1.a r1 = r1.mo96800a()
            javax.net.ssl.SSLSocketFactory r1 = r1.mo96667k()
            if (r1 != 0) goto L_0x0086
            of1.l r1 = of1.C41904l.f98496k
            boolean r0 = r0.contains(r1)
            if (r0 == 0) goto L_0x0079
            of1.f0 r0 = r7.f100401d
            of1.a r0 = r0.mo96800a()
            of1.v r0 = r0.mo96668l()
            java.lang.String r0 = r0.mo96954i()
            xf1.k$a r1 = xf1.C43286k.f101052a
            xf1.k r1 = r1.mo101988g()
            boolean r1 = r1.mo101955i(r0)
            if (r1 == 0) goto L_0x0058
            goto L_0x0098
        L_0x0058:
            okhttp3.internal.connection.RouteException r1 = new okhttp3.internal.connection.RouteException
            java.net.UnknownServiceException r2 = new java.net.UnknownServiceException
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            java.lang.String r4 = "CLEARTEXT communication to "
            r3.append(r4)
            r3.append(r0)
            java.lang.String r0 = " not permitted by network security policy"
            r3.append(r0)
            java.lang.String r0 = r3.toString()
            r2.<init>(r0)
            r1.<init>(r2)
            throw r1
        L_0x0079:
            okhttp3.internal.connection.RouteException r0 = new okhttp3.internal.connection.RouteException
            java.net.UnknownServiceException r1 = new java.net.UnknownServiceException
            java.lang.String r2 = "CLEARTEXT communication not enabled for client"
            r1.<init>(r2)
            r0.<init>(r1)
            throw r0
        L_0x0086:
            of1.f0 r0 = r7.f100401d
            of1.a r0 = r0.mo96800a()
            java.util.List r0 = r0.mo96661f()
            of1.a0 r1 = of1.C41864a0.H2_PRIOR_KNOWLEDGE
            boolean r0 = r0.contains(r1)
            if (r0 != 0) goto L_0x014f
        L_0x0098:
            r12 = 0
            r13 = r12
        L_0x009a:
            of1.f0 r0 = r7.f100401d     // Catch:{ IOException -> 0x00fd }
            boolean r0 = r0.mo96802c()     // Catch:{ IOException -> 0x00fd }
            if (r0 == 0) goto L_0x00bb
            r1 = r16
            r2 = r17
            r3 = r18
            r4 = r19
            r5 = r22
            r6 = r23
            r1.m123433k(r2, r3, r4, r5, r6)     // Catch:{ IOException -> 0x00fd }
            java.net.Socket r0 = r7.f100402e     // Catch:{ IOException -> 0x00fd }
            if (r0 != 0) goto L_0x00b6
            goto L_0x00d8
        L_0x00b6:
            r14 = r17
            r15 = r18
            goto L_0x00c2
        L_0x00bb:
            r14 = r17
            r15 = r18
            r7.m123431i(r14, r15, r8, r9)     // Catch:{ IOException -> 0x00fb }
        L_0x00c2:
            r6 = r20
            r7.m123436n(r11, r6, r8, r9)     // Catch:{ IOException -> 0x00f9 }
            of1.f0 r0 = r7.f100401d     // Catch:{ IOException -> 0x00f9 }
            java.net.InetSocketAddress r0 = r0.mo96803d()     // Catch:{ IOException -> 0x00f9 }
            of1.f0 r1 = r7.f100401d     // Catch:{ IOException -> 0x00f9 }
            java.net.Proxy r1 = r1.mo96801b()     // Catch:{ IOException -> 0x00f9 }
            of1.a0 r2 = r7.f100405h     // Catch:{ IOException -> 0x00f9 }
            r9.mo96891g(r8, r0, r1, r2)     // Catch:{ IOException -> 0x00f9 }
        L_0x00d8:
            of1.f0 r0 = r7.f100401d
            boolean r0 = r0.mo96802c()
            if (r0 == 0) goto L_0x00f2
            java.net.Socket r0 = r7.f100402e
            if (r0 == 0) goto L_0x00e5
            goto L_0x00f2
        L_0x00e5:
            okhttp3.internal.connection.RouteException r0 = new okhttp3.internal.connection.RouteException
            java.net.ProtocolException r1 = new java.net.ProtocolException
            java.lang.String r2 = "Too many tunnel connections attempted: 21"
            r1.<init>(r2)
            r0.<init>(r1)
            throw r0
        L_0x00f2:
            long r0 = java.lang.System.nanoTime()
            r7.f100416s = r0
            return
        L_0x00f9:
            r0 = move-exception
            goto L_0x0104
        L_0x00fb:
            r0 = move-exception
            goto L_0x0102
        L_0x00fd:
            r0 = move-exception
            r14 = r17
            r15 = r18
        L_0x0102:
            r6 = r20
        L_0x0104:
            java.net.Socket r1 = r7.f100403f
            if (r1 != 0) goto L_0x0109
            goto L_0x010c
        L_0x0109:
            pf1.C42197d.m122548n(r1)
        L_0x010c:
            java.net.Socket r1 = r7.f100402e
            if (r1 != 0) goto L_0x0111
            goto L_0x0114
        L_0x0111:
            pf1.C42197d.m122548n(r1)
        L_0x0114:
            r7.f100403f = r12
            r7.f100402e = r12
            r7.f100407j = r12
            r7.f100408k = r12
            r7.f100404g = r12
            r7.f100405h = r12
            r7.f100406i = r12
            r7.f100414q = r10
            of1.f0 r1 = r7.f100401d
            java.net.InetSocketAddress r3 = r1.mo96803d()
            of1.f0 r1 = r7.f100401d
            java.net.Proxy r4 = r1.mo96801b()
            r5 = 0
            r1 = r23
            r2 = r22
            r6 = r0
            r1.mo96892h(r2, r3, r4, r5, r6)
            if (r13 != 0) goto L_0x0141
            okhttp3.internal.connection.RouteException r13 = new okhttp3.internal.connection.RouteException
            r13.<init>(r0)
            goto L_0x0144
        L_0x0141:
            r13.mo97164a(r0)
        L_0x0144:
            if (r21 == 0) goto L_0x014e
            boolean r0 = r11.mo101506b(r0)
            if (r0 == 0) goto L_0x014e
            goto L_0x009a
        L_0x014e:
            throw r13
        L_0x014f:
            okhttp3.internal.connection.RouteException r0 = new okhttp3.internal.connection.RouteException
            java.net.UnknownServiceException r1 = new java.net.UnknownServiceException
            java.lang.String r2 = "H2_PRIOR_KNOWLEDGE cannot be used with HTTPS"
            r1.<init>(r2)
            r0.<init>(r1)
            throw r0
        L_0x015c:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "already connected"
            java.lang.String r1 = r1.toString()
            r0.<init>(r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: tf1.C43006f.mo101570g(int, int, int, int, boolean, of1.e, of1.r):void");
    }

    /* renamed from: h */
    public final void mo101571h(C41944z zVar, C41889f0 f0Var, IOException iOException) {
        C41536l.m120489i(zVar, "client");
        C41536l.m120489i(f0Var, "failedRoute");
        C41536l.m120489i(iOException, "failure");
        if (f0Var.mo96801b().type() != Proxy.Type.DIRECT) {
            C41863a a = f0Var.mo96800a();
            a.mo96665i().connectFailed(a.mo96668l().mo96966u(), f0Var.mo96801b().address(), iOException);
        }
        zVar.mo97061t().mo101593b(f0Var);
    }

    /* renamed from: o */
    public final List mo101572o() {
        return this.f100415r;
    }

    /* renamed from: p */
    public final long mo101573p() {
        return this.f100416s;
    }

    /* renamed from: q */
    public final boolean mo101574q() {
        return this.f100409l;
    }

    /* renamed from: r */
    public final int mo101575r() {
        return this.f100411n;
    }

    /* renamed from: s */
    public C41924t mo101576s() {
        return this.f100404g;
    }

    /* renamed from: t */
    public final synchronized void mo101577t() {
        this.f100412o++;
    }

    public String toString() {
        Object a;
        StringBuilder sb = new StringBuilder();
        sb.append("Connection{");
        sb.append(this.f100401d.mo96800a().mo96668l().mo96954i());
        sb.append(':');
        sb.append(this.f100401d.mo96800a().mo96668l().mo96959o());
        sb.append(", proxy=");
        sb.append(this.f100401d.mo96801b());
        sb.append(" hostAddress=");
        sb.append(this.f100401d.mo96803d());
        sb.append(" cipherSuite=");
        C41924t tVar = this.f100404g;
        Object obj = "none";
        if (!(tVar == null || (a = tVar.mo96915a()) == null)) {
            obj = a;
        }
        sb.append(obj);
        sb.append(" protocol=");
        sb.append(this.f100405h);
        sb.append('}');
        return sb.toString();
    }

    /* renamed from: u */
    public final boolean mo101579u(C41863a aVar, List list) {
        C41536l.m120489i(aVar, "address");
        if (C42197d.f99271h && !Thread.holdsLock(this)) {
            throw new AssertionError("Thread " + Thread.currentThread().getName() + " MUST hold lock on " + this);
        } else if (this.f100415r.size() >= this.f100414q || this.f100409l || !this.f100401d.mo96800a().mo96658d(aVar)) {
            return false;
        } else {
            if (C41536l.m120484d(aVar.mo96668l().mo96954i(), mo101562B().mo96800a().mo96668l().mo96954i())) {
                return true;
            }
            if (this.f100406i == null || list == null || !m123426C(list) || aVar.mo96659e() != C40311d.f95767a || !m123428H(aVar.mo96668l())) {
                return false;
            }
            try {
                C41890g a = aVar.mo96655a();
                C41536l.m120486f(a);
                String i = aVar.mo96668l().mo96954i();
                C41924t s = mo101576s();
                C41536l.m120486f(s);
                a.mo96807a(i, s.mo96917d());
                return true;
            } catch (SSLPeerUnverifiedException unused) {
                return false;
            }
        }
    }

    /* renamed from: v */
    public final boolean mo101580v(boolean z) {
        long p;
        if (!C42197d.f99271h || !Thread.holdsLock(this)) {
            long nanoTime = System.nanoTime();
            Socket socket = this.f100402e;
            C41536l.m120486f(socket);
            Socket socket2 = this.f100403f;
            C41536l.m120486f(socket2);
            C40679d dVar = this.f100407j;
            C41536l.m120486f(dVar);
            if (socket.isClosed() || socket2.isClosed() || socket2.isInputShutdown() || socket2.isOutputShutdown()) {
                return false;
            }
            C43202e eVar = this.f100406i;
            if (eVar != null) {
                return eVar.mo101775K0(nanoTime);
            }
            synchronized (this) {
                p = nanoTime - mo101573p();
            }
            if (p < 10000000000L || !z) {
                return true;
            }
            return C42197d.m122512F(socket2, dVar);
        }
        throw new AssertionError("Thread " + Thread.currentThread().getName() + " MUST NOT hold lock on " + this);
    }

    /* renamed from: w */
    public final boolean mo101581w() {
        return this.f100406i != null;
    }

    /* renamed from: x */
    public final C43091d mo101582x(C41944z zVar, C43094g gVar) {
        C41536l.m120489i(zVar, "client");
        C41536l.m120489i(gVar, "chain");
        Socket socket = this.f100403f;
        C41536l.m120486f(socket);
        C40679d dVar = this.f100407j;
        C41536l.m120486f(dVar);
        C40677c cVar = this.f100408k;
        C41536l.m120486f(cVar);
        C43202e eVar = this.f100406i;
        if (eVar != null) {
            return new C43221f(zVar, this, gVar, eVar);
        }
        socket.setSoTimeout(gVar.mo101670k());
        TimeUnit timeUnit = TimeUnit.MILLISECONDS;
        dVar.mo94678C().mo94688g((long) gVar.mo101667h(), timeUnit);
        cVar.mo94673C().mo94688g((long) gVar.mo101669j(), timeUnit);
        return new C43159b(zVar, this, dVar, cVar);
    }

    /* renamed from: y */
    public final C40370d.C40374d mo101583y(C42998c cVar) {
        C41536l.m120489i(cVar, "exchange");
        Socket socket = this.f100403f;
        C41536l.m120486f(socket);
        C40679d dVar = this.f100407j;
        C41536l.m120486f(dVar);
        C40677c cVar2 = this.f100408k;
        C41536l.m120486f(cVar2);
        socket.setSoTimeout(0);
        mo101561A();
        return new C43011e(dVar, cVar2, cVar);
    }

    /* renamed from: z */
    public final synchronized void mo101584z() {
        this.f100410m = true;
    }
}
