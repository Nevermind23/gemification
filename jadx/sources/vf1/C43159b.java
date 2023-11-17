package vf1;

import com.salesforce.marketingcloud.storage.p385db.C11769i;
import dg1.C40669a0;
import dg1.C40672b;
import dg1.C40677c;
import dg1.C40679d;
import dg1.C40687i;
import dg1.C40705x;
import dg1.C40707z;
import java.io.EOFException;
import java.io.IOException;
import java.net.ProtocolException;
import java.net.Proxy;
import java.util.concurrent.TimeUnit;
import kotlin.jvm.internal.C41536l;
import kotlin.jvm.internal.DefaultConstructorMarker;
import of1.C41869b0;
import of1.C41880d0;
import of1.C41909n;
import of1.C41928u;
import of1.C41931v;
import of1.C41944z;
import pf1.C42197d;
import tf1.C43006f;
import uf1.C43091d;
import uf1.C43092e;
import uf1.C43096i;
import uf1.C43099k;

/* renamed from: vf1.b */
public final class C43159b implements C43091d {

    /* renamed from: h */
    public static final C43163d f100676h = new C43163d((DefaultConstructorMarker) null);
    /* access modifiers changed from: private */

    /* renamed from: a */
    public final C41944z f100677a;

    /* renamed from: b */
    private final C43006f f100678b;
    /* access modifiers changed from: private */

    /* renamed from: c */
    public final C40679d f100679c;
    /* access modifiers changed from: private */

    /* renamed from: d */
    public final C40677c f100680d;
    /* access modifiers changed from: private */

    /* renamed from: e */
    public int f100681e;
    /* access modifiers changed from: private */

    /* renamed from: f */
    public final C43157a f100682f;
    /* access modifiers changed from: private */

    /* renamed from: g */
    public C41928u f100683g;

    /* renamed from: vf1.b$a */
    private abstract class C43160a implements C40707z {

        /* renamed from: d */
        private final C40687i f100684d;

        /* renamed from: e */
        private boolean f100685e;

        /* renamed from: f */
        final /* synthetic */ C43159b f100686f;

        public C43160a(C43159b bVar) {
            C41536l.m120489i(bVar, "this$0");
            this.f100686f = bVar;
            this.f100684d = new C40687i(bVar.f100679c.mo94678C());
        }

        /* renamed from: C */
        public C40669a0 mo94678C() {
            return this.f100684d;
        }

        /* access modifiers changed from: protected */
        /* renamed from: a */
        public final boolean mo101727a() {
            return this.f100685e;
        }

        /* renamed from: g */
        public long mo21305g(C40672b bVar, long j) {
            C41536l.m120489i(bVar, "sink");
            try {
                return this.f100686f.f100679c.mo21305g(bVar, j);
            } catch (IOException e) {
                this.f100686f.mo101654c().mo101561A();
                mo101728k();
                throw e;
            }
        }

        /* renamed from: k */
        public final void mo101728k() {
            if (this.f100686f.f100681e != 6) {
                if (this.f100686f.f100681e == 5) {
                    this.f100686f.m123784r(this.f100684d);
                    this.f100686f.f100681e = 6;
                    return;
                }
                throw new IllegalStateException(C41536l.m120497q("state: ", Integer.valueOf(this.f100686f.f100681e)));
            }
        }

        /* access modifiers changed from: protected */
        /* renamed from: m */
        public final void mo101729m(boolean z) {
            this.f100685e = z;
        }
    }

    /* renamed from: vf1.b$b */
    private final class C43161b implements C40705x {

        /* renamed from: d */
        private final C40687i f100687d;

        /* renamed from: e */
        private boolean f100688e;

        /* renamed from: f */
        final /* synthetic */ C43159b f100689f;

        public C43161b(C43159b bVar) {
            C41536l.m120489i(bVar, "this$0");
            this.f100689f = bVar;
            this.f100687d = new C40687i(bVar.f100680d.mo94673C());
        }

        /* renamed from: C */
        public C40669a0 mo94673C() {
            return this.f100687d;
        }

        public synchronized void close() {
            if (!this.f100688e) {
                this.f100688e = true;
                this.f100689f.f100680d.mo94728d0("0\r\n\r\n");
                this.f100689f.m123784r(this.f100687d);
                this.f100689f.f100681e = 3;
            }
        }

        public synchronized void flush() {
            if (!this.f100688e) {
                this.f100689f.f100680d.flush();
            }
        }

        /* renamed from: x1 */
        public void mo21301x1(C40672b bVar, long j) {
            C41536l.m120489i(bVar, "source");
            if (!(!this.f100688e)) {
                throw new IllegalStateException("closed".toString());
            } else if (j != 0) {
                this.f100689f.f100680d.mo94733h1(j);
                this.f100689f.f100680d.mo94728d0("\r\n");
                this.f100689f.f100680d.mo21301x1(bVar, j);
                this.f100689f.f100680d.mo94728d0("\r\n");
            }
        }
    }

    /* renamed from: vf1.b$c */
    private final class C43162c extends C43160a {

        /* renamed from: g */
        private final C41931v f100690g;

        /* renamed from: h */
        private long f100691h = -1;

        /* renamed from: i */
        private boolean f100692i = true;

        /* renamed from: j */
        final /* synthetic */ C43159b f100693j;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C43162c(C43159b bVar, C41931v vVar) {
            super(bVar);
            C41536l.m120489i(bVar, "this$0");
            C41536l.m120489i(vVar, C11769i.C11770a.f34149l);
            this.f100693j = bVar;
            this.f100690g = vVar;
        }

        /* renamed from: n */
        private final void m123809n() {
            boolean z;
            if (this.f100691h != -1) {
                this.f100693j.f100679c.mo94752r0();
            }
            try {
                this.f100691h = this.f100693j.f100679c.mo94696D1();
                String obj = C40440x.m117146P0(this.f100693j.f100679c.mo94752r0()).toString();
                if (this.f100691h >= 0) {
                    if (obj.length() > 0) {
                        z = true;
                    } else {
                        z = false;
                    }
                    if (!z || C40439w.m117109H(obj, ";", false, 2, (Object) null)) {
                        if (this.f100691h == 0) {
                            this.f100692i = false;
                            C43159b bVar = this.f100693j;
                            bVar.f100683g = bVar.f100682f.mo101723a();
                            C41944z j = this.f100693j.f100677a;
                            C41536l.m120486f(j);
                            C41909n n = j.mo97055n();
                            C41931v vVar = this.f100690g;
                            C41928u o = this.f100693j.f100683g;
                            C41536l.m120486f(o);
                            C43092e.m123644f(n, vVar, o);
                            mo101728k();
                            return;
                        }
                        return;
                    }
                }
                throw new ProtocolException("expected chunk size and optional extensions but was \"" + this.f100691h + obj + '\"');
            } catch (NumberFormatException e) {
                throw new ProtocolException(e.getMessage());
            }
        }

        public void close() {
            if (!mo101727a()) {
                if (this.f100692i && !C42197d.m122553s(this, 100, TimeUnit.MILLISECONDS)) {
                    this.f100693j.mo101654c().mo101561A();
                    mo101728k();
                }
                mo101729m(true);
            }
        }

        /* renamed from: g */
        public long mo21305g(C40672b bVar, long j) {
            boolean z;
            C41536l.m120489i(bVar, "sink");
            if (j >= 0) {
                z = true;
            } else {
                z = false;
            }
            if (!z) {
                throw new IllegalArgumentException(C41536l.m120497q("byteCount < 0: ", Long.valueOf(j)).toString());
            } else if (!(!mo101727a())) {
                throw new IllegalStateException("closed".toString());
            } else if (!this.f100692i) {
                return -1;
            } else {
                long j2 = this.f100691h;
                if (j2 == 0 || j2 == -1) {
                    m123809n();
                    if (!this.f100692i) {
                        return -1;
                    }
                }
                long g = super.mo21305g(bVar, Math.min(j, this.f100691h));
                if (g != -1) {
                    this.f100691h -= g;
                    return g;
                }
                this.f100693j.mo101654c().mo101561A();
                ProtocolException protocolException = new ProtocolException("unexpected end of stream");
                mo101728k();
                throw protocolException;
            }
        }
    }

    /* renamed from: vf1.b$d */
    public static final class C43163d {
        private C43163d() {
        }

        public /* synthetic */ C43163d(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    /* renamed from: vf1.b$e */
    private final class C43164e extends C43160a {

        /* renamed from: g */
        private long f100694g;

        /* renamed from: h */
        final /* synthetic */ C43159b f100695h;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C43164e(C43159b bVar, long j) {
            super(bVar);
            C41536l.m120489i(bVar, "this$0");
            this.f100695h = bVar;
            this.f100694g = j;
            if (j == 0) {
                mo101728k();
            }
        }

        public void close() {
            if (!mo101727a()) {
                if (this.f100694g != 0 && !C42197d.m122553s(this, 100, TimeUnit.MILLISECONDS)) {
                    this.f100695h.mo101654c().mo101561A();
                    mo101728k();
                }
                mo101729m(true);
            }
        }

        /* renamed from: g */
        public long mo21305g(C40672b bVar, long j) {
            boolean z;
            C41536l.m120489i(bVar, "sink");
            if (j >= 0) {
                z = true;
            } else {
                z = false;
            }
            if (!z) {
                throw new IllegalArgumentException(C41536l.m120497q("byteCount < 0: ", Long.valueOf(j)).toString());
            } else if (!mo101727a()) {
                long j2 = this.f100694g;
                if (j2 == 0) {
                    return -1;
                }
                long g = super.mo21305g(bVar, Math.min(j2, j));
                if (g != -1) {
                    long j3 = this.f100694g - g;
                    this.f100694g = j3;
                    if (j3 == 0) {
                        mo101728k();
                    }
                    return g;
                }
                this.f100695h.mo101654c().mo101561A();
                ProtocolException protocolException = new ProtocolException("unexpected end of stream");
                mo101728k();
                throw protocolException;
            } else {
                throw new IllegalStateException("closed".toString());
            }
        }
    }

    /* renamed from: vf1.b$f */
    private final class C43165f implements C40705x {

        /* renamed from: d */
        private final C40687i f100696d;

        /* renamed from: e */
        private boolean f100697e;

        /* renamed from: f */
        final /* synthetic */ C43159b f100698f;

        public C43165f(C43159b bVar) {
            C41536l.m120489i(bVar, "this$0");
            this.f100698f = bVar;
            this.f100696d = new C40687i(bVar.f100680d.mo94673C());
        }

        /* renamed from: C */
        public C40669a0 mo94673C() {
            return this.f100696d;
        }

        public void close() {
            if (!this.f100697e) {
                this.f100697e = true;
                this.f100698f.m123784r(this.f100696d);
                this.f100698f.f100681e = 3;
            }
        }

        public void flush() {
            if (!this.f100697e) {
                this.f100698f.f100680d.flush();
            }
        }

        /* renamed from: x1 */
        public void mo21301x1(C40672b bVar, long j) {
            C41536l.m120489i(bVar, "source");
            if (!this.f100697e) {
                C42197d.m122546l(bVar.mo94709M0(), 0, j);
                this.f100698f.f100680d.mo21301x1(bVar, j);
                return;
            }
            throw new IllegalStateException("closed".toString());
        }
    }

    /* renamed from: vf1.b$g */
    private final class C43166g extends C43160a {

        /* renamed from: g */
        private boolean f100699g;

        /* renamed from: h */
        final /* synthetic */ C43159b f100700h;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C43166g(C43159b bVar) {
            super(bVar);
            C41536l.m120489i(bVar, "this$0");
            this.f100700h = bVar;
        }

        public void close() {
            if (!mo101727a()) {
                if (!this.f100699g) {
                    mo101728k();
                }
                mo101729m(true);
            }
        }

        /* renamed from: g */
        public long mo21305g(C40672b bVar, long j) {
            boolean z;
            C41536l.m120489i(bVar, "sink");
            if (j >= 0) {
                z = true;
            } else {
                z = false;
            }
            if (!z) {
                throw new IllegalArgumentException(C41536l.m120497q("byteCount < 0: ", Long.valueOf(j)).toString());
            } else if (!(!mo101727a())) {
                throw new IllegalStateException("closed".toString());
            } else if (this.f100699g) {
                return -1;
            } else {
                long g = super.mo21305g(bVar, j);
                if (g != -1) {
                    return g;
                }
                this.f100699g = true;
                mo101728k();
                return -1;
            }
        }
    }

    public C43159b(C41944z zVar, C43006f fVar, C40679d dVar, C40677c cVar) {
        C41536l.m120489i(fVar, "connection");
        C41536l.m120489i(dVar, "source");
        C41536l.m120489i(cVar, "sink");
        this.f100677a = zVar;
        this.f100678b = fVar;
        this.f100679c = dVar;
        this.f100680d = cVar;
        this.f100682f = new C43157a(dVar);
    }

    /* access modifiers changed from: private */
    /* renamed from: r */
    public final void m123784r(C40687i iVar) {
        C40669a0 i = iVar.mo94830i();
        iVar.mo94831j(C40669a0.f96310e);
        i.mo94682a();
        i.mo94683b();
    }

    /* renamed from: s */
    private final boolean m123785s(C41869b0 b0Var) {
        return C40439w.m117115s("chunked", b0Var.mo96675d("Transfer-Encoding"), true);
    }

    /* renamed from: t */
    private final boolean m123786t(C41880d0 d0Var) {
        return C40439w.m117115s("chunked", C41880d0.m121379v(d0Var, "Transfer-Encoding", (String) null, 2, (Object) null), true);
    }

    /* renamed from: u */
    private final C40705x m123787u() {
        int i = this.f100681e;
        boolean z = true;
        if (i != 1) {
            z = false;
        }
        if (z) {
            this.f100681e = 2;
            return new C43161b(this);
        }
        throw new IllegalStateException(C41536l.m120497q("state: ", Integer.valueOf(i)).toString());
    }

    /* renamed from: v */
    private final C40707z m123788v(C41931v vVar) {
        boolean z;
        int i = this.f100681e;
        if (i == 4) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            this.f100681e = 5;
            return new C43162c(this, vVar);
        }
        throw new IllegalStateException(C41536l.m120497q("state: ", Integer.valueOf(i)).toString());
    }

    /* renamed from: w */
    private final C40707z m123789w(long j) {
        boolean z;
        int i = this.f100681e;
        if (i == 4) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            this.f100681e = 5;
            return new C43164e(this, j);
        }
        throw new IllegalStateException(C41536l.m120497q("state: ", Integer.valueOf(i)).toString());
    }

    /* renamed from: x */
    private final C40705x m123790x() {
        int i = this.f100681e;
        boolean z = true;
        if (i != 1) {
            z = false;
        }
        if (z) {
            this.f100681e = 2;
            return new C43165f(this);
        }
        throw new IllegalStateException(C41536l.m120497q("state: ", Integer.valueOf(i)).toString());
    }

    /* renamed from: y */
    private final C40707z m123791y() {
        boolean z;
        int i = this.f100681e;
        if (i == 4) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            this.f100681e = 5;
            mo101654c().mo101561A();
            return new C43166g(this);
        }
        throw new IllegalStateException(C41536l.m120497q("state: ", Integer.valueOf(i)).toString());
    }

    /* renamed from: A */
    public final void mo101725A(C41928u uVar, String str) {
        boolean z;
        C41536l.m120489i(uVar, "headers");
        C41536l.m120489i(str, "requestLine");
        int i = this.f100681e;
        if (i == 0) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            this.f100680d.mo94728d0(str).mo94728d0("\r\n");
            int size = uVar.size();
            for (int i2 = 0; i2 < size; i2++) {
                this.f100680d.mo94728d0(uVar.mo96926c(i2)).mo94728d0(": ").mo94728d0(uVar.mo96932n(i2)).mo94728d0("\r\n");
            }
            this.f100680d.mo94728d0("\r\n");
            this.f100681e = 1;
            return;
        }
        throw new IllegalStateException(C41536l.m120497q("state: ", Integer.valueOf(i)).toString());
    }

    /* renamed from: a */
    public void mo101652a() {
        this.f100680d.flush();
    }

    /* renamed from: b */
    public C40705x mo101653b(C41869b0 b0Var, long j) {
        C41536l.m120489i(b0Var, "request");
        if (b0Var.mo96672a() != null && b0Var.mo96672a().mo96707h()) {
            throw new ProtocolException("Duplex connections are not supported for HTTP/1");
        } else if (m123785s(b0Var)) {
            return m123787u();
        } else {
            if (j != -1) {
                return m123790x();
            }
            throw new IllegalStateException("Cannot stream a request body without chunked encoding or a known content length!");
        }
    }

    /* renamed from: c */
    public C43006f mo101654c() {
        return this.f100678b;
    }

    public void cancel() {
        mo101654c().mo101569e();
    }

    /* renamed from: d */
    public long mo101656d(C41880d0 d0Var) {
        C41536l.m120489i(d0Var, "response");
        if (!C43092e.m123640b(d0Var)) {
            return 0;
        }
        if (m123786t(d0Var)) {
            return -1;
        }
        return C42197d.m122556v(d0Var);
    }

    /* renamed from: e */
    public void mo101657e(C41869b0 b0Var) {
        C41536l.m120489i(b0Var, "request");
        C43096i iVar = C43096i.f100537a;
        Proxy.Type type = mo101654c().mo101562B().mo96801b().type();
        C41536l.m120488h(type, "connection.route().proxy.type()");
        mo101725A(b0Var.mo96676e(), iVar.mo101671a(b0Var, type));
    }

    /* renamed from: f */
    public C41880d0.C41881a mo101658f(boolean z) {
        int i = this.f100681e;
        boolean z2 = true;
        if (!(i == 1 || i == 3)) {
            z2 = false;
        }
        if (z2) {
            try {
                C43099k a = C43099k.f100540d.mo101674a(this.f100682f.mo101724b());
                C41880d0.C41881a l = new C41880d0.C41881a().mo96776q(a.f100541a).mo96766g(a.f100542b).mo96773n(a.f100543c).mo96771l(this.f100682f.mo101723a());
                if (z && a.f100542b == 100) {
                    return null;
                }
                if (a.f100542b == 100) {
                    this.f100681e = 3;
                    return l;
                }
                this.f100681e = 4;
                return l;
            } catch (EOFException e) {
                throw new IOException(C41536l.m120497q("unexpected end of stream on ", mo101654c().mo101562B().mo96800a().mo96668l().mo96962r()), e);
            }
        } else {
            throw new IllegalStateException(C41536l.m120497q("state: ", Integer.valueOf(i)).toString());
        }
    }

    /* renamed from: g */
    public void mo101659g() {
        this.f100680d.flush();
    }

    /* renamed from: h */
    public C40707z mo101660h(C41880d0 d0Var) {
        C41536l.m120489i(d0Var, "response");
        if (!C43092e.m123640b(d0Var)) {
            return m123789w(0);
        }
        if (m123786t(d0Var)) {
            return m123788v(d0Var.mo96742e0().mo96681j());
        }
        long v = C42197d.m122556v(d0Var);
        if (v != -1) {
            return m123789w(v);
        }
        return m123791y();
    }

    /* renamed from: z */
    public final void mo101726z(C41880d0 d0Var) {
        C41536l.m120489i(d0Var, "response");
        long v = C42197d.m122556v(d0Var);
        if (v != -1) {
            C40707z w = m123789w(v);
            C42197d.m122518L(w, Integer.MAX_VALUE, TimeUnit.MILLISECONDS);
            w.close();
        }
    }
}
