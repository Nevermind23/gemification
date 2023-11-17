package cg1;

import dg1.C40672b;
import dg1.C40679d;
import dg1.C40688j;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.Set;
import java.util.concurrent.TimeUnit;
import kotlin.jvm.internal.C41536l;
import kotlin.jvm.internal.DefaultConstructorMarker;
import of1.C41869b0;
import of1.C41872c0;
import of1.C41880d0;
import of1.C41884e0;
import of1.C41902j;
import of1.C41928u;
import of1.C41935w;
import of1.C41937x;
import se1.C42550b;
import uf1.C43092e;
import xf1.C43286k;

/* renamed from: cg1.a */
public final class C40446a implements C41935w {

    /* renamed from: a */
    private final C40448b f96045a;

    /* renamed from: b */
    private volatile Set f96046b;

    /* renamed from: c */
    private volatile C40447a f96047c;

    /* renamed from: cg1.a$a */
    public enum C40447a {
        NONE,
        BASIC,
        HEADERS,
        BODY
    }

    /* renamed from: cg1.a$b */
    public interface C40448b {

        /* renamed from: a */
        public static final C40449a f96053a = C40449a.f96055a;

        /* renamed from: b */
        public static final C40448b f96054b = new C40449a.C40450a();

        /* renamed from: cg1.a$b$a */
        public static final class C40449a {

            /* renamed from: a */
            static final /* synthetic */ C40449a f96055a = new C40449a();

            /* renamed from: cg1.a$b$a$a */
            private static final class C40450a implements C40448b {
                /* renamed from: a */
                public void mo94506a(String str) {
                    C41536l.m120489i(str, "message");
                    C43286k.m124296k(C43286k.f101052a.mo101988g(), str, 0, (Throwable) null, 6, (Object) null);
                }
            }

            private C40449a() {
            }
        }

        /* renamed from: a */
        void mo94506a(String str);
    }

    public C40446a() {
        this((C40448b) null, 1, (DefaultConstructorMarker) null);
    }

    /* renamed from: b */
    private final boolean m117196b(C41928u uVar) {
        String b = uVar.mo96925b("Content-Encoding");
        if (b != null && !C40439w.m117115s(b, "identity", true) && !C40439w.m117115s(b, "gzip", true)) {
            return true;
        }
        return false;
    }

    /* renamed from: d */
    private final void m117197d(C41928u uVar, int i) {
        String str;
        if (this.f96046b.contains(uVar.mo96926c(i))) {
            str = "██";
        } else {
            str = uVar.mo96932n(i);
        }
        C40448b bVar = this.f96045a;
        bVar.mo94506a(uVar.mo96926c(i) + ": " + str);
    }

    /* renamed from: a */
    public C41880d0 mo21294a(C41935w.C41936a aVar) {
        String str;
        String str2;
        String str3;
        char c;
        String str4;
        Charset charset;
        Long l;
        Charset charset2;
        Throwable th;
        Charset charset3;
        C41935w.C41936a aVar2 = aVar;
        C41536l.m120489i(aVar2, "chain");
        C40447a aVar3 = this.f96047c;
        C41869b0 w = aVar.mo97011w();
        if (aVar3 == C40447a.NONE) {
            return aVar2.mo97008a(w);
        }
        boolean z = aVar3 == C40447a.BODY;
        boolean z2 = z || aVar3 == C40447a.HEADERS;
        C41872c0 a = w.mo96672a();
        C41902j b = aVar.mo97009b();
        StringBuilder sb = new StringBuilder();
        sb.append("--> ");
        sb.append(w.mo96678g());
        sb.append(' ');
        sb.append(w.mo96681j());
        sb.append(b != null ? C41536l.m120497q(" ", b.mo96832a()) : "");
        String sb2 = sb.toString();
        if (!z2 && a != null) {
            sb2 = sb2 + " (" + a.mo21298a() + "-byte body)";
        }
        this.f96045a.mo94506a(sb2);
        if (z2) {
            C41928u e = w.mo96676e();
            if (a != null) {
                C41937x b2 = a.mo21299b();
                if (b2 != null && e.mo96925b("Content-Type") == null) {
                    this.f96045a.mo94506a(C41536l.m120497q("Content-Type: ", b2));
                }
                if (a.mo21298a() != -1 && e.mo96925b("Content-Length") == null) {
                    this.f96045a.mo94506a(C41536l.m120497q("Content-Length: ", Long.valueOf(a.mo21298a())));
                }
            }
            int size = e.size();
            for (int i = 0; i < size; i++) {
                m117197d(e, i);
            }
            if (!z || a == null) {
                this.f96045a.mo94506a(C41536l.m120497q("--> END ", w.mo96678g()));
            } else if (m117196b(w.mo96676e())) {
                this.f96045a.mo94506a("--> END " + w.mo96678g() + " (encoded body omitted)");
            } else if (a.mo96707h()) {
                this.f96045a.mo94506a("--> END " + w.mo96678g() + " (duplex request body omitted)");
            } else if (a.mo96708i()) {
                this.f96045a.mo94506a("--> END " + w.mo96678g() + " (one-shot body omitted)");
            } else {
                C40672b bVar = new C40672b();
                a.mo21300j(bVar);
                C41937x b3 = a.mo21299b();
                if (b3 == null) {
                    charset3 = null;
                } else {
                    charset3 = b3.mo97012c(StandardCharsets.UTF_8);
                }
                if (charset3 == null) {
                    charset3 = StandardCharsets.UTF_8;
                    C41536l.m120488h(charset3, "UTF_8");
                }
                this.f96045a.mo94506a("");
                if (C40451b.m117204a(bVar)) {
                    this.f96045a.mo94506a(bVar.mo94699F0(charset3));
                    this.f96045a.mo94506a("--> END " + w.mo96678g() + " (" + a.mo21298a() + "-byte body)");
                } else {
                    this.f96045a.mo94506a("--> END " + w.mo96678g() + " (binary " + a.mo21298a() + "-byte body omitted)");
                }
            }
        }
        long nanoTime = System.nanoTime();
        try {
            C41880d0 a2 = aVar2.mo97008a(w);
            long millis = TimeUnit.NANOSECONDS.toMillis(System.nanoTime() - nanoTime);
            C41884e0 a3 = a2.mo96739a();
            C41536l.m120486f(a3);
            long o = a3.mo21302o();
            if (o != -1) {
                str = o + "-byte";
            } else {
                str = "unknown-length";
            }
            C40448b bVar2 = this.f96045a;
            String str5 = "-byte body)";
            StringBuilder sb3 = new StringBuilder();
            long j = o;
            sb3.append("<-- ");
            sb3.append(a2.mo96747q());
            if (a2.mo96754x().length() == 0) {
                str2 = "-byte body omitted)";
                str3 = "";
                c = ' ';
            } else {
                String x = a2.mo96754x();
                StringBuilder sb4 = new StringBuilder();
                str2 = "-byte body omitted)";
                c = ' ';
                sb4.append(' ');
                sb4.append(x);
                str3 = sb4.toString();
            }
            sb3.append(str3);
            sb3.append(c);
            sb3.append(a2.mo96742e0().mo96681j());
            sb3.append(" (");
            sb3.append(millis);
            sb3.append("ms");
            if (!z2) {
                str4 = ", " + str + " body";
            } else {
                str4 = "";
            }
            sb3.append(str4);
            sb3.append(')');
            bVar2.mo94506a(sb3.toString());
            if (z2) {
                C41928u w2 = a2.mo96753w();
                int size2 = w2.size();
                for (int i2 = 0; i2 < size2; i2++) {
                    m117197d(w2, i2);
                }
                if (!z || !C43092e.m123640b(a2)) {
                    this.f96045a.mo94506a("<-- END HTTP");
                } else if (m117196b(a2.mo96753w())) {
                    this.f96045a.mo94506a("<-- END HTTP (encoded body omitted)");
                } else {
                    C40679d t = a3.mo21304t();
                    t.mo94739l(Long.MAX_VALUE);
                    C40672b B = t.mo94690B();
                    if (C40439w.m117115s("gzip", w2.mo96925b("Content-Encoding"), true)) {
                        l = Long.valueOf(B.mo94709M0());
                        C40688j jVar = new C40688j(B.clone());
                        try {
                            B = new C40672b();
                            B.mo94741l1(jVar);
                            charset = null;
                            C42550b.m123187a(jVar, (Throwable) null);
                        } catch (Throwable th2) {
                            Throwable th3 = th2;
                            C42550b.m123187a(jVar, th);
                            throw th3;
                        }
                    } else {
                        charset = null;
                        l = null;
                    }
                    C41937x q = a3.mo21303q();
                    if (q == null) {
                        charset2 = charset;
                    } else {
                        charset2 = q.mo97012c(StandardCharsets.UTF_8);
                    }
                    if (charset2 == null) {
                        charset2 = StandardCharsets.UTF_8;
                        C41536l.m120488h(charset2, "UTF_8");
                    }
                    if (!C40451b.m117204a(B)) {
                        this.f96045a.mo94506a("");
                        this.f96045a.mo94506a("<-- END HTTP (binary " + B.mo94709M0() + str2);
                        return a2;
                    }
                    if (j != 0) {
                        this.f96045a.mo94506a("");
                        this.f96045a.mo94506a(B.clone().mo94699F0(charset2));
                    }
                    if (l != null) {
                        this.f96045a.mo94506a("<-- END HTTP (" + B.mo94709M0() + "-byte, " + l + "-gzipped-byte body)");
                    } else {
                        this.f96045a.mo94506a("<-- END HTTP (" + B.mo94709M0() + str5);
                    }
                }
            }
            return a2;
        } catch (Exception e2) {
            Exception exc = e2;
            this.f96045a.mo94506a(C41536l.m120497q("<-- HTTP FAILED: ", exc));
            throw exc;
        }
    }

    /* renamed from: c */
    public final void mo94504c(C40447a aVar) {
        C41536l.m120489i(aVar, "<set-?>");
        this.f96047c = aVar;
    }

    /* renamed from: e */
    public final C40446a mo94505e(C40447a aVar) {
        C41536l.m120489i(aVar, "level");
        mo94504c(aVar);
        return this;
    }

    public C40446a(C40448b bVar) {
        C41536l.m120489i(bVar, "logger");
        this.f96045a = bVar;
        this.f96046b = C41357x0.m119985e();
        this.f96047c = C40447a.NONE;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C40446a(C40448b bVar, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? C40448b.f96054b : bVar);
    }
}
