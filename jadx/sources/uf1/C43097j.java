package uf1;

import cf1.C40419j;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InterruptedIOException;
import java.net.ProtocolException;
import java.net.Proxy;
import java.net.SocketTimeoutException;
import java.security.cert.CertificateException;
import javax.net.ssl.SSLHandshakeException;
import javax.net.ssl.SSLPeerUnverifiedException;
import kotlin.jvm.internal.C41536l;
import kotlin.jvm.internal.DefaultConstructorMarker;
import of1.C41869b0;
import of1.C41872c0;
import of1.C41880d0;
import of1.C41889f0;
import of1.C41931v;
import of1.C41935w;
import of1.C41944z;
import p341ge.bog.mobilebank.p975ui.views.widgets.BogInputLayout;
import pf1.C42197d;
import tf1.C42998c;
import tf1.C43002e;
import tf1.C43006f;

/* renamed from: uf1.j */
public final class C43097j implements C41935w {

    /* renamed from: b */
    public static final C43098a f100538b = new C43098a((DefaultConstructorMarker) null);

    /* renamed from: a */
    private final C41944z f100539a;

    /* renamed from: uf1.j$a */
    public static final class C43098a {
        private C43098a() {
        }

        public /* synthetic */ C43098a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public C43097j(C41944z zVar) {
        C41536l.m120489i(zVar, "client");
        this.f100539a = zVar;
    }

    /* renamed from: b */
    private final C41869b0 m123669b(C41880d0 d0Var, String str) {
        String v;
        C41931v s;
        boolean z;
        C41872c0 c0Var = null;
        if (!this.f100539a.mo97059r() || (v = C41880d0.m121379v(d0Var, "Location", (String) null, 2, (Object) null)) == null || (s = d0Var.mo96742e0().mo96681j().mo96963s(v)) == null) {
            return null;
        }
        if (!C41536l.m120484d(s.mo96964t(), d0Var.mo96742e0().mo96681j().mo96964t()) && !this.f100539a.mo97060s()) {
            return null;
        }
        C41869b0.C41870a h = d0Var.mo96742e0().mo96679h();
        if (C43093f.m123647a(str)) {
            int q = d0Var.mo96747q();
            C43093f fVar = C43093f.f100524a;
            if (fVar.mo101662c(str) || q == 308 || q == 307) {
                z = true;
            } else {
                z = false;
            }
            if (!fVar.mo101661b(str) || q == 308 || q == 307) {
                if (z) {
                    c0Var = d0Var.mo96742e0().mo96672a();
                }
                h.mo96693k(str, c0Var);
            } else {
                h.mo96693k("GET", (C41872c0) null);
            }
            if (!z) {
                h.mo96697o("Transfer-Encoding");
                h.mo96697o("Content-Length");
                h.mo96697o("Content-Type");
            }
        }
        if (!C42197d.m122544j(d0Var.mo96742e0().mo96681j(), s)) {
            h.mo96697o("Authorization");
        }
        return h.mo96706x(s).mo96684b();
    }

    /* renamed from: c */
    private final C41869b0 m123670c(C41880d0 d0Var, C42998c cVar) {
        C41889f0 f0Var;
        C43006f h;
        if (cVar == null || (h = cVar.mo101514h()) == null) {
            f0Var = null;
        } else {
            f0Var = h.mo101562B();
        }
        int q = d0Var.mo96747q();
        String g = d0Var.mo96742e0().mo96678g();
        if (!(q == 307 || q == 308)) {
            if (q == 401) {
                return this.f100539a.mo97047e().mo91242a(f0Var, d0Var);
            }
            if (q == 421) {
                C41872c0 a = d0Var.mo96742e0().mo96672a();
                if ((a != null && a.mo96708i()) || cVar == null || !cVar.mo101517k()) {
                    return null;
                }
                cVar.mo101514h().mo101584z();
                return d0Var.mo96742e0();
            } else if (q == 503) {
                C41880d0 R = d0Var.mo96737R();
                if ((R == null || R.mo96747q() != 503) && m123674g(d0Var, Integer.MAX_VALUE) == 0) {
                    return d0Var.mo96742e0();
                }
                return null;
            } else if (q == 407) {
                C41536l.m120486f(f0Var);
                if (f0Var.mo96801b().type() == Proxy.Type.HTTP) {
                    return this.f100539a.mo97038G().mo91242a(f0Var, d0Var);
                }
                throw new ProtocolException("Received HTTP_PROXY_AUTH (407) code while not using proxy");
            } else if (q != 408) {
                switch (q) {
                    case BogInputLayout.INPUT_TYPE_TEXT_PASSWORD:
                    case BogInputLayout.INPUT_TYPE_NUM_PASSWORD:
                    case BogInputLayout.INPUT_TYPE_NUM_REAL:
                    case BogInputLayout.INPUT_TYPE_NUM_DIGIT:
                        break;
                    default:
                        return null;
                }
            } else if (!this.f100539a.mo97041J()) {
                return null;
            } else {
                C41872c0 a2 = d0Var.mo96742e0().mo96672a();
                if (a2 != null && a2.mo96708i()) {
                    return null;
                }
                C41880d0 R2 = d0Var.mo96737R();
                if ((R2 == null || R2.mo96747q() != 408) && m123674g(d0Var, 0) <= 0) {
                    return d0Var.mo96742e0();
                }
                return null;
            }
        }
        return m123669b(d0Var, g);
    }

    /* renamed from: d */
    private final boolean m123671d(IOException iOException, boolean z) {
        if (iOException instanceof ProtocolException) {
            return false;
        }
        if (iOException instanceof InterruptedIOException) {
            if (!(iOException instanceof SocketTimeoutException) || z) {
                return false;
            }
            return true;
        } else if ((!(iOException instanceof SSLHandshakeException) || !(iOException.getCause() instanceof CertificateException)) && !(iOException instanceof SSLPeerUnverifiedException)) {
            return true;
        } else {
            return false;
        }
    }

    /* renamed from: e */
    private final boolean m123672e(IOException iOException, C43002e eVar, C41869b0 b0Var, boolean z) {
        if (!this.f100539a.mo97041J()) {
            return false;
        }
        if ((!z || !m123673f(iOException, b0Var)) && m123671d(iOException, z) && eVar.mo101553z()) {
            return true;
        }
        return false;
    }

    /* renamed from: f */
    private final boolean m123673f(IOException iOException, C41869b0 b0Var) {
        C41872c0 a = b0Var.mo96672a();
        if ((a == null || !a.mo96708i()) && !(iOException instanceof FileNotFoundException)) {
            return false;
        }
        return true;
    }

    /* renamed from: g */
    private final int m123674g(C41880d0 d0Var, int i) {
        String v = C41880d0.m121379v(d0Var, "Retry-After", (String) null, 2, (Object) null);
        if (v == null) {
            return i;
        }
        if (!new C40419j("\\d+").mo94489f(v)) {
            return Integer.MAX_VALUE;
        }
        Integer valueOf = Integer.valueOf(v);
        C41536l.m120488h(valueOf, "valueOf(header)");
        return valueOf.intValue();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:?, code lost:
        r0 = r0.mo96736Q().mo96775p(r7.mo96736Q().mo96763b((of1.C41884e0) null).mo96764c()).mo96764c();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:11:0x0040, code lost:
        r7 = r0;
        r0 = r1.mo101545o();
        r6 = m123670c(r7, r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:12:0x0049, code lost:
        if (r6 != null) goto L_0x005a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:13:0x004b, code lost:
        if (r0 == null) goto L_0x0056;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:15:0x0051, code lost:
        if (r0.mo101518l() == false) goto L_0x0056;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:16:0x0053, code lost:
        r1.mo101535B();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:17:0x0056, code lost:
        r1.mo101540j(false);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:18:0x0059, code lost:
        return r7;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:20:?, code lost:
        r0 = r6.mo96672a();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:21:0x005e, code lost:
        if (r0 == null) goto L_0x006a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:23:0x0064, code lost:
        if (r0.mo96708i() == false) goto L_0x006a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:24:0x0066, code lost:
        r1.mo101540j(false);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:25:0x0069, code lost:
        return r7;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:27:?, code lost:
        r0 = r7.mo96739a();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:28:0x006e, code lost:
        if (r0 != null) goto L_0x0071;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:30:0x0071, code lost:
        pf1.C42197d.m122547m(r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:31:0x0074, code lost:
        r8 = r8 + 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:32:0x0078, code lost:
        if (r8 > 20) goto L_0x007f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:36:0x008e, code lost:
        throw new java.net.ProtocolException(kotlin.jvm.internal.C41536l.m120497q("Too many follow-up requests: ", java.lang.Integer.valueOf(r8)));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:8:0x0026, code lost:
        if (r7 == null) goto L_0x0040;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public of1.C41880d0 mo21294a(of1.C41935w.C41936a r11) {
        /*
            r10 = this;
            java.lang.String r0 = "chain"
            kotlin.jvm.internal.C41536l.m120489i(r11, r0)
            uf1.g r11 = (uf1.C43094g) r11
            of1.b0 r0 = r11.mo101668i()
            tf1.e r1 = r11.mo101664e()
            java.util.List r2 = ie1.C41341q.m119907j()
            r3 = 0
            r4 = 0
            r5 = 1
            r8 = r3
            r7 = r4
        L_0x0018:
            r6 = r5
        L_0x0019:
            r1.mo101539h(r0, r6)
            boolean r6 = r1.mo96790x()     // Catch:{ all -> 0x00d1 }
            if (r6 != 0) goto L_0x00c9
            of1.d0 r0 = r11.mo97008a(r0)     // Catch:{ RouteException -> 0x00a7, IOException -> 0x008f }
            if (r7 == 0) goto L_0x0040
            of1.d0$a r0 = r0.mo96736Q()     // Catch:{ all -> 0x00d1 }
            of1.d0$a r6 = r7.mo96736Q()     // Catch:{ all -> 0x00d1 }
            of1.d0$a r6 = r6.mo96763b(r4)     // Catch:{ all -> 0x00d1 }
            of1.d0 r6 = r6.mo96764c()     // Catch:{ all -> 0x00d1 }
            of1.d0$a r0 = r0.mo96775p(r6)     // Catch:{ all -> 0x00d1 }
            of1.d0 r0 = r0.mo96764c()     // Catch:{ all -> 0x00d1 }
        L_0x0040:
            r7 = r0
            tf1.c r0 = r1.mo101545o()     // Catch:{ all -> 0x00d1 }
            of1.b0 r6 = r10.m123670c(r7, r0)     // Catch:{ all -> 0x00d1 }
            if (r6 != 0) goto L_0x005a
            if (r0 == 0) goto L_0x0056
            boolean r11 = r0.mo101518l()     // Catch:{ all -> 0x00d1 }
            if (r11 == 0) goto L_0x0056
            r1.mo101535B()     // Catch:{ all -> 0x00d1 }
        L_0x0056:
            r1.mo101540j(r3)
            return r7
        L_0x005a:
            of1.c0 r0 = r6.mo96672a()     // Catch:{ all -> 0x00d1 }
            if (r0 == 0) goto L_0x006a
            boolean r0 = r0.mo96708i()     // Catch:{ all -> 0x00d1 }
            if (r0 == 0) goto L_0x006a
            r1.mo101540j(r3)
            return r7
        L_0x006a:
            of1.e0 r0 = r7.mo96739a()     // Catch:{ all -> 0x00d1 }
            if (r0 != 0) goto L_0x0071
            goto L_0x0074
        L_0x0071:
            pf1.C42197d.m122547m(r0)     // Catch:{ all -> 0x00d1 }
        L_0x0074:
            int r8 = r8 + 1
            r0 = 20
            if (r8 > r0) goto L_0x007f
            r1.mo101540j(r5)
            r0 = r6
            goto L_0x0018
        L_0x007f:
            java.net.ProtocolException r11 = new java.net.ProtocolException     // Catch:{ all -> 0x00d1 }
            java.lang.String r0 = "Too many follow-up requests: "
            java.lang.Integer r2 = java.lang.Integer.valueOf(r8)     // Catch:{ all -> 0x00d1 }
            java.lang.String r0 = kotlin.jvm.internal.C41536l.m120497q(r0, r2)     // Catch:{ all -> 0x00d1 }
            r11.<init>(r0)     // Catch:{ all -> 0x00d1 }
            throw r11     // Catch:{ all -> 0x00d1 }
        L_0x008f:
            r6 = move-exception
            boolean r9 = r6 instanceof okhttp3.internal.http2.ConnectionShutdownException     // Catch:{ all -> 0x00d1 }
            if (r9 != 0) goto L_0x0096
            r9 = r5
            goto L_0x0097
        L_0x0096:
            r9 = r3
        L_0x0097:
            boolean r9 = r10.m123672e(r6, r1, r0, r9)     // Catch:{ all -> 0x00d1 }
            if (r9 == 0) goto L_0x00a2
            java.util.List r2 = ie1.C41358y.m120024n0(r2, r6)     // Catch:{ all -> 0x00d1 }
            goto L_0x00ba
        L_0x00a2:
            java.lang.Throwable r11 = pf1.C42197d.m122534a0(r6, r2)     // Catch:{ all -> 0x00d1 }
            throw r11     // Catch:{ all -> 0x00d1 }
        L_0x00a7:
            r6 = move-exception
            java.io.IOException r9 = r6.mo97166c()     // Catch:{ all -> 0x00d1 }
            boolean r9 = r10.m123672e(r9, r1, r0, r3)     // Catch:{ all -> 0x00d1 }
            if (r9 == 0) goto L_0x00c0
            java.io.IOException r6 = r6.mo97165b()     // Catch:{ all -> 0x00d1 }
            java.util.List r2 = ie1.C41358y.m120024n0(r2, r6)     // Catch:{ all -> 0x00d1 }
        L_0x00ba:
            r1.mo101540j(r5)
            r6 = r3
            goto L_0x0019
        L_0x00c0:
            java.io.IOException r11 = r6.mo97165b()     // Catch:{ all -> 0x00d1 }
            java.lang.Throwable r11 = pf1.C42197d.m122534a0(r11, r2)     // Catch:{ all -> 0x00d1 }
            throw r11     // Catch:{ all -> 0x00d1 }
        L_0x00c9:
            java.io.IOException r11 = new java.io.IOException     // Catch:{ all -> 0x00d1 }
            java.lang.String r0 = "Canceled"
            r11.<init>(r0)     // Catch:{ all -> 0x00d1 }
            throw r11     // Catch:{ all -> 0x00d1 }
        L_0x00d1:
            r11 = move-exception
            r1.mo101540j(r5)
            throw r11
        */
        throw new UnsupportedOperationException("Method not decompiled: uf1.C43097j.mo21294a(of1.w$a):of1.d0");
    }
}
