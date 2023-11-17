package com.facetec.sdk;

import com.facetec.sdk.C3252jm;
import com.facetec.sdk.C3260jr;
import com.facetec.sdk.C3264jt;
import com.facetec.sdk.C3295kc;
import java.io.IOException;
import java.net.Proxy;
import java.net.ProxySelector;
import java.net.Socket;
import java.security.GeneralSecurityException;
import java.security.SecureRandom;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import javax.net.SocketFactory;
import javax.net.ssl.HostnameVerifier;
import javax.net.ssl.KeyManager;
import javax.net.ssl.SSLContext;
import javax.net.ssl.SSLSocket;
import javax.net.ssl.SSLSocketFactory;
import javax.net.ssl.TrustManager;
import javax.net.ssl.X509TrustManager;

/* renamed from: com.facetec.sdk.ju */
public class C3268ju implements Cloneable {

    /* renamed from: b */
    static final List<C3271jv> f10664b = C3303ki.m13273e((T[]) new C3271jv[]{C3271jv.HTTP_2, C3271jv.HTTP_1_1});

    /* renamed from: e */
    static final List<C3252jm> f10665e = C3303ki.m13273e((T[]) new C3252jm[]{C3252jm.f10629c, C3252jm.f10628a});

    /* renamed from: A */
    private boolean f10666A;

    /* renamed from: B */
    private boolean f10667B;

    /* renamed from: C */
    private boolean f10668C;

    /* renamed from: D */
    private C3257jp f10669D;

    /* renamed from: a */
    final List<C3272jw> f10670a;

    /* renamed from: c */
    final List<C3272jw> f10671c;

    /* renamed from: d */
    final C3264jt.C3267e f10672d;

    /* renamed from: f */
    final C3317kq f10673f;

    /* renamed from: g */
    final C3235jb f10674g;

    /* renamed from: h */
    final int f10675h;

    /* renamed from: i */
    final int f10676i;

    /* renamed from: j */
    public final C3238je f10677j;

    /* renamed from: k */
    private C3254jn f10678k;

    /* renamed from: l */
    final int f10679l;

    /* renamed from: m */
    public final int f10680m;

    /* renamed from: n */
    final int f10681n;

    /* renamed from: o */
    private Proxy f10682o;

    /* renamed from: p */
    private SocketFactory f10683p;

    /* renamed from: q */
    private C3255jo f10684q;

    /* renamed from: r */
    private List<C3252jm> f10685r;

    /* renamed from: s */
    private ProxySelector f10686s;

    /* renamed from: t */
    private List<C3271jv> f10687t;

    /* renamed from: u */
    private C3238je f10688u;

    /* renamed from: v */
    private C3244jh f10689v;

    /* renamed from: w */
    private SSLSocketFactory f10690w;

    /* renamed from: x */
    private HostnameVerifier f10691x;

    /* renamed from: y */
    private C3430ml f10692y;

    /* renamed from: z */
    private C3249jk f10693z;

    /* renamed from: com.facetec.sdk.ju$e */
    public static final class C3270e {

        /* renamed from: B */
        public int f10694B;

        /* renamed from: C */
        public int f10695C;

        /* renamed from: a */
        List<C3252jm> f10696a = C3268ju.f10665e;

        /* renamed from: b */
        C3254jn f10697b = new C3254jn();

        /* renamed from: c */
        List<C3271jv> f10698c = C3268ju.f10664b;

        /* renamed from: d */
        final List<C3272jw> f10699d = new ArrayList();

        /* renamed from: e */
        Proxy f10700e;

        /* renamed from: f */
        final List<C3272jw> f10701f = new ArrayList();

        /* renamed from: g */
        C3255jo f10702g;

        /* renamed from: h */
        C3264jt.C3267e f10703h = C3264jt.m13069e(C3264jt.f10662b);

        /* renamed from: i */
        C3235jb f10704i;

        /* renamed from: j */
        ProxySelector f10705j;

        /* renamed from: k */
        public SSLSocketFactory f10706k;

        /* renamed from: l */
        C3317kq f10707l;

        /* renamed from: m */
        public C3430ml f10708m;

        /* renamed from: n */
        HostnameVerifier f10709n;

        /* renamed from: o */
        SocketFactory f10710o;

        /* renamed from: p */
        C3238je f10711p;

        /* renamed from: q */
        C3257jp f10712q;

        /* renamed from: r */
        C3244jh f10713r;

        /* renamed from: s */
        C3238je f10714s;

        /* renamed from: t */
        C3249jk f10715t;

        /* renamed from: u */
        boolean f10716u;

        /* renamed from: v */
        boolean f10717v;

        /* renamed from: w */
        boolean f10718w;

        /* renamed from: x */
        public int f10719x;

        /* renamed from: y */
        int f10720y;

        /* renamed from: z */
        int f10721z;

        public C3270e() {
            ProxySelector proxySelector = ProxySelector.getDefault();
            this.f10705j = proxySelector;
            if (proxySelector == null) {
                this.f10705j = new C3420me();
            }
            this.f10702g = C3255jo.f10648d;
            this.f10710o = SocketFactory.getDefault();
            this.f10709n = C3425mj.f11248e;
            this.f10713r = C3244jh.f10598c;
            C3238je jeVar = C3238je.f10555b;
            this.f10714s = jeVar;
            this.f10711p = jeVar;
            this.f10715t = new C3249jk();
            this.f10712q = C3257jp.f10649e;
            this.f10718w = true;
            this.f10716u = true;
            this.f10717v = true;
            this.f10720y = 0;
            this.f10719x = 10000;
            this.f10694B = 10000;
            this.f10695C = 10000;
            this.f10721z = 0;
        }

        /* renamed from: c */
        public final C3268ju mo9534c() {
            return new C3268ju(this);
        }
    }

    static {
        C3300kf.f10832d = new C3300kf() {
            /* renamed from: b */
            public final C3316kp mo9523b(C3249jk jkVar) {
                return jkVar.f10610d;
            }

            /* renamed from: c */
            public final boolean mo9527c(C3249jk jkVar, C3319ks ksVar) {
                return jkVar.mo9461b(ksVar);
            }

            /* renamed from: d */
            public final boolean mo9529d(C3237jd jdVar, C3237jd jdVar2) {
                return jdVar.mo9429b(jdVar2);
            }

            /* renamed from: e */
            public final void mo9533e(C3260jr.C3261d dVar, String str, String str2) {
                dVar.mo9495b(str, str2);
            }

            /* renamed from: b */
            public final IOException mo9524b(C3247ji jiVar, IOException iOException) {
                return ((C3277jz) jiVar).mo9566c(iOException);
            }

            /* renamed from: c */
            public final void mo9526c(C3252jm jmVar, SSLSocket sSLSocket, boolean z) {
                String[] strArr;
                String[] strArr2;
                if (jmVar.f10633d != null) {
                    strArr = C3303ki.m13246a((Comparator<? super String>) C3242jg.f10578b, sSLSocket.getEnabledCipherSuites(), jmVar.f10633d);
                } else {
                    strArr = sSLSocket.getEnabledCipherSuites();
                }
                if (jmVar.f10635h != null) {
                    strArr2 = C3303ki.m13246a((Comparator<? super String>) C3303ki.f10848j, sSLSocket.getEnabledProtocols(), jmVar.f10635h);
                } else {
                    strArr2 = sSLSocket.getEnabledProtocols();
                }
                String[] supportedCipherSuites = sSLSocket.getSupportedCipherSuites();
                int b = C3303ki.m13249b(C3242jg.f10578b, supportedCipherSuites, "TLS_FALLBACK_SCSV");
                if (z && b != -1) {
                    strArr = C3303ki.m13270d(strArr, supportedCipherSuites[b]);
                }
                C3252jm d = new C3252jm.C3253b(jmVar).mo9478e(strArr).mo9474b(strArr2).mo9477d();
                String[] strArr3 = d.f10635h;
                if (strArr3 != null) {
                    sSLSocket.setEnabledProtocols(strArr3);
                }
                String[] strArr4 = d.f10633d;
                if (strArr4 != null) {
                    sSLSocket.setEnabledCipherSuites(strArr4);
                }
            }

            /* renamed from: d */
            public final int mo9528d(C3295kc.C3296d dVar) {
                return dVar.f10811c;
            }

            /* renamed from: e */
            public final void mo9532e(C3260jr.C3261d dVar, String str) {
                int indexOf = str.indexOf(":", 1);
                if (indexOf != -1) {
                    dVar.mo9495b(str.substring(0, indexOf), str.substring(indexOf + 1));
                } else if (str.startsWith(":")) {
                    dVar.mo9495b("", str.substring(1));
                } else {
                    dVar.mo9495b("", str);
                }
            }

            /* renamed from: b */
            public final Socket mo9525b(C3249jk jkVar, C3237jd jdVar, C3325kw kwVar) {
                if (C3249jk.f10607h || Thread.holdsLock(jkVar)) {
                    for (C3319ks next : jkVar.f10609c) {
                        if (next.mo9665e(jdVar, (C3302kh) null) && next.mo9662d() && next != kwVar.mo9677d()) {
                            if (!C3325kw.f10933j && !Thread.holdsLock(kwVar.f10935b)) {
                                throw new AssertionError();
                            } else if (kwVar.f10942i == null && kwVar.f10936c.f10918o.size() == 1) {
                                Socket d = kwVar.mo9678d(true, false, false);
                                kwVar.f10936c = next;
                                next.f10918o.add(kwVar.f10936c.f10918o.get(0));
                                return d;
                            } else {
                                throw new IllegalStateException();
                            }
                        }
                    }
                    return null;
                }
                throw new AssertionError();
            }

            /* renamed from: e */
            public final C3319ks mo9530e(C3249jk jkVar, C3237jd jdVar, C3325kw kwVar, C3302kh khVar) {
                if (C3249jk.f10607h || Thread.holdsLock(jkVar)) {
                    for (C3319ks next : jkVar.f10609c) {
                        if (next.mo9665e(jdVar, khVar)) {
                            kwVar.mo9680e(next, true);
                            return next;
                        }
                    }
                    return null;
                }
                throw new AssertionError();
            }

            /* renamed from: e */
            public final void mo9531e(C3249jk jkVar, C3319ks ksVar) {
                if (C3249jk.f10607h || Thread.holdsLock(jkVar)) {
                    if (!jkVar.f10611e) {
                        jkVar.f10611e = true;
                        C3249jk.f10606a.execute(jkVar.f10608b);
                    }
                    jkVar.f10609c.add(ksVar);
                    return;
                }
                throw new AssertionError();
            }
        };
    }

    public C3268ju() {
        this(new C3270e());
    }

    /* renamed from: e */
    private static SSLSocketFactory m13072e(X509TrustManager x509TrustManager) {
        try {
            SSLContext a = C3422mg.m13612c().mo9799a();
            a.init((KeyManager[]) null, new TrustManager[]{x509TrustManager}, (SecureRandom) null);
            return a.getSocketFactory();
        } catch (GeneralSecurityException e) {
            throw C3303ki.m13250b("No System TLS", (Exception) e);
        }
    }

    /* renamed from: a */
    public final C3255jo mo9506a() {
        return this.f10684q;
    }

    /* renamed from: b */
    public final Proxy mo9508b() {
        return this.f10682o;
    }

    /* renamed from: c */
    public final ProxySelector mo9509c() {
        return this.f10686s;
    }

    /* renamed from: d */
    public final C3257jp mo9510d() {
        return this.f10669D;
    }

    /* renamed from: f */
    public final C3249jk mo9512f() {
        return this.f10693z;
    }

    /* renamed from: g */
    public final C3244jh mo9513g() {
        return this.f10689v;
    }

    /* renamed from: h */
    public final HostnameVerifier mo9514h() {
        return this.f10691x;
    }

    /* renamed from: i */
    public final SSLSocketFactory mo9515i() {
        return this.f10690w;
    }

    /* renamed from: j */
    public final C3238je mo9516j() {
        return this.f10688u;
    }

    /* renamed from: k */
    public final boolean mo9517k() {
        return this.f10667B;
    }

    /* renamed from: l */
    public final C3254jn mo9518l() {
        return this.f10678k;
    }

    /* renamed from: m */
    public final List<C3271jv> mo9519m() {
        return this.f10687t;
    }

    /* renamed from: n */
    public final boolean mo9520n() {
        return this.f10666A;
    }

    /* renamed from: o */
    public final boolean mo9521o() {
        return this.f10668C;
    }

    /* renamed from: r */
    public final List<C3252jm> mo9522r() {
        return this.f10685r;
    }

    C3268ju(C3270e eVar) {
        boolean z;
        this.f10678k = eVar.f10697b;
        this.f10682o = eVar.f10700e;
        this.f10687t = eVar.f10698c;
        this.f10685r = eVar.f10696a;
        this.f10670a = C3303ki.m13264d(eVar.f10699d);
        this.f10671c = C3303ki.m13264d(eVar.f10701f);
        this.f10672d = eVar.f10703h;
        this.f10686s = eVar.f10705j;
        this.f10684q = eVar.f10702g;
        this.f10674g = eVar.f10704i;
        this.f10673f = eVar.f10707l;
        this.f10683p = eVar.f10710o;
        Iterator<C3252jm> it = this.f10685r.iterator();
        loop0:
        while (true) {
            z = false;
            while (true) {
                if (!it.hasNext()) {
                    break loop0;
                }
                C3252jm next = it.next();
                if (z || next.mo9467b()) {
                    z = true;
                }
            }
        }
        SSLSocketFactory sSLSocketFactory = eVar.f10706k;
        if (sSLSocketFactory != null || !z) {
            this.f10690w = sSLSocketFactory;
            this.f10692y = eVar.f10708m;
        } else {
            X509TrustManager b = C3303ki.m13254b();
            this.f10690w = m13072e(b);
            this.f10692y = C3430ml.m13652b(b);
        }
        if (this.f10690w != null) {
            C3422mg.m13612c().mo9814d(this.f10690w);
        }
        this.f10691x = eVar.f10709n;
        C3244jh jhVar = eVar.f10713r;
        C3430ml mlVar = this.f10692y;
        this.f10689v = !C3303ki.m13274e((Object) jhVar.f10599a, (Object) mlVar) ? new C3244jh(jhVar.f10600e, mlVar) : jhVar;
        this.f10688u = eVar.f10714s;
        this.f10677j = eVar.f10711p;
        this.f10693z = eVar.f10715t;
        this.f10669D = eVar.f10712q;
        this.f10666A = eVar.f10718w;
        this.f10667B = eVar.f10716u;
        this.f10668C = eVar.f10717v;
        this.f10675h = eVar.f10720y;
        this.f10676i = eVar.f10719x;
        this.f10681n = eVar.f10694B;
        this.f10679l = eVar.f10695C;
        this.f10680m = eVar.f10721z;
        if (this.f10670a.contains((Object) null)) {
            StringBuilder sb = new StringBuilder("Null interceptor: ");
            sb.append(this.f10670a);
            throw new IllegalStateException(sb.toString());
        } else if (this.f10671c.contains((Object) null)) {
            StringBuilder sb2 = new StringBuilder("Null network interceptor: ");
            sb2.append(this.f10671c);
            throw new IllegalStateException(sb2.toString());
        }
    }

    /* renamed from: b */
    public final C3247ji mo9507b(C3293kb kbVar) {
        return C3277jz.m13151a(this, kbVar, false);
    }

    /* renamed from: e */
    public final SocketFactory mo9511e() {
        return this.f10683p;
    }
}
