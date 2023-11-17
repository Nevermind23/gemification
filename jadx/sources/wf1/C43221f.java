package wf1;

import dg1.C40705x;
import dg1.C40707z;
import java.io.IOException;
import java.net.ProtocolException;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.concurrent.TimeUnit;
import kotlin.jvm.internal.C41536l;
import kotlin.jvm.internal.DefaultConstructorMarker;
import of1.C41864a0;
import of1.C41869b0;
import of1.C41880d0;
import of1.C41928u;
import of1.C41944z;
import pf1.C42197d;
import tf1.C43006f;
import uf1.C43091d;
import uf1.C43092e;
import uf1.C43094g;
import uf1.C43096i;
import uf1.C43099k;

/* renamed from: wf1.f */
public final class C43221f implements C43091d {

    /* renamed from: g */
    public static final C43222a f100905g = new C43222a((DefaultConstructorMarker) null);
    /* access modifiers changed from: private */

    /* renamed from: h */
    public static final List f100906h = C42197d.m122557w("connection", "host", "keep-alive", "proxy-connection", "te", "transfer-encoding", "encoding", "upgrade", ":method", ":path", ":scheme", ":authority");
    /* access modifiers changed from: private */

    /* renamed from: i */
    public static final List f100907i = C42197d.m122557w("connection", "host", "keep-alive", "proxy-connection", "te", "transfer-encoding", "encoding", "upgrade");

    /* renamed from: a */
    private final C43006f f100908a;

    /* renamed from: b */
    private final C43094g f100909b;

    /* renamed from: c */
    private final C43202e f100910c;

    /* renamed from: d */
    private volatile C43227h f100911d;

    /* renamed from: e */
    private final C41864a0 f100912e;

    /* renamed from: f */
    private volatile boolean f100913f;

    /* renamed from: wf1.f$a */
    public static final class C43222a {
        private C43222a() {
        }

        public /* synthetic */ C43222a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* renamed from: a */
        public final List mo101835a(C41869b0 b0Var) {
            C41536l.m120489i(b0Var, "request");
            C41928u e = b0Var.mo96676e();
            ArrayList arrayList = new ArrayList(e.size() + 4);
            arrayList.add(new C43196b(C43196b.f100772g, b0Var.mo96678g()));
            arrayList.add(new C43196b(C43196b.f100773h, C43096i.f100537a.mo101672c(b0Var.mo96681j())));
            String d = b0Var.mo96675d("Host");
            if (d != null) {
                arrayList.add(new C43196b(C43196b.f100775j, d));
            }
            arrayList.add(new C43196b(C43196b.f100774i, b0Var.mo96681j().mo96964t()));
            int size = e.size();
            int i = 0;
            while (i < size) {
                int i2 = i + 1;
                String c = e.mo96926c(i);
                Locale locale = Locale.US;
                C41536l.m120488h(locale, "US");
                String lowerCase = c.toLowerCase(locale);
                C41536l.m120488h(lowerCase, "this as java.lang.String).toLowerCase(locale)");
                if (!C43221f.f100906h.contains(lowerCase) || (C41536l.m120484d(lowerCase, "te") && C41536l.m120484d(e.mo96932n(i), "trailers"))) {
                    arrayList.add(new C43196b(lowerCase, e.mo96932n(i)));
                }
                i = i2;
            }
            return arrayList;
        }

        /* renamed from: b */
        public final C41880d0.C41881a mo101836b(C41928u uVar, C41864a0 a0Var) {
            C41536l.m120489i(uVar, "headerBlock");
            C41536l.m120489i(a0Var, "protocol");
            C41928u.C41929a aVar = new C41928u.C41929a();
            int size = uVar.size();
            C43099k kVar = null;
            int i = 0;
            while (i < size) {
                int i2 = i + 1;
                String c = uVar.mo96926c(i);
                String n = uVar.mo96932n(i);
                if (C41536l.m120484d(c, ":status")) {
                    kVar = C43099k.f100540d.mo101674a(C41536l.m120497q("HTTP/1.1 ", n));
                } else if (!C43221f.f100907i.contains(c)) {
                    aVar.mo96939d(c, n);
                }
                i = i2;
            }
            if (kVar != null) {
                return new C41880d0.C41881a().mo96776q(a0Var).mo96766g(kVar.f100542b).mo96773n(kVar.f100543c).mo96771l(aVar.mo96941f());
            }
            throw new ProtocolException("Expected ':status' header not present");
        }
    }

    public C43221f(C41944z zVar, C43006f fVar, C43094g gVar, C43202e eVar) {
        C41536l.m120489i(zVar, "client");
        C41536l.m120489i(fVar, "connection");
        C41536l.m120489i(gVar, "chain");
        C41536l.m120489i(eVar, "http2Connection");
        this.f100908a = fVar;
        this.f100909b = gVar;
        this.f100910c = eVar;
        List E = zVar.mo97036E();
        C41864a0 a0Var = C41864a0.H2_PRIOR_KNOWLEDGE;
        this.f100912e = !E.contains(a0Var) ? C41864a0.HTTP_2 : a0Var;
    }

    /* renamed from: a */
    public void mo101652a() {
        C43227h hVar = this.f100911d;
        C41536l.m120486f(hVar);
        hVar.mo101867n().close();
    }

    /* renamed from: b */
    public C40705x mo101653b(C41869b0 b0Var, long j) {
        C41536l.m120489i(b0Var, "request");
        C43227h hVar = this.f100911d;
        C41536l.m120486f(hVar);
        return hVar.mo101867n();
    }

    /* renamed from: c */
    public C43006f mo101654c() {
        return this.f100908a;
    }

    public void cancel() {
        this.f100913f = true;
        C43227h hVar = this.f100911d;
        if (hVar != null) {
            hVar.mo101859f(C43194a.CANCEL);
        }
    }

    /* renamed from: d */
    public long mo101656d(C41880d0 d0Var) {
        C41536l.m120489i(d0Var, "response");
        if (!C43092e.m123640b(d0Var)) {
            return 0;
        }
        return C42197d.m122556v(d0Var);
    }

    /* renamed from: e */
    public void mo101657e(C41869b0 b0Var) {
        boolean z;
        C41536l.m120489i(b0Var, "request");
        if (this.f100911d == null) {
            if (b0Var.mo96672a() != null) {
                z = true;
            } else {
                z = false;
            }
            this.f100911d = this.f100910c.mo101776O0(f100905g.mo101835a(b0Var), z);
            if (!this.f100913f) {
                C43227h hVar = this.f100911d;
                C41536l.m120486f(hVar);
                TimeUnit timeUnit = TimeUnit.MILLISECONDS;
                hVar.mo101875v().mo94688g((long) this.f100909b.mo101667h(), timeUnit);
                C43227h hVar2 = this.f100911d;
                C41536l.m120486f(hVar2);
                hVar2.mo101854G().mo94688g((long) this.f100909b.mo101669j(), timeUnit);
                return;
            }
            C43227h hVar3 = this.f100911d;
            C41536l.m120486f(hVar3);
            hVar3.mo101859f(C43194a.CANCEL);
            throw new IOException("Canceled");
        }
    }

    /* renamed from: f */
    public C41880d0.C41881a mo101658f(boolean z) {
        C43227h hVar = this.f100911d;
        C41536l.m120486f(hVar);
        C41880d0.C41881a b = f100905g.mo101836b(hVar.mo101852E(), this.f100912e);
        if (!z || b.mo96767h() != 100) {
            return b;
        }
        return null;
    }

    /* renamed from: g */
    public void mo101659g() {
        this.f100910c.flush();
    }

    /* renamed from: h */
    public C40707z mo101660h(C41880d0 d0Var) {
        C41536l.m120489i(d0Var, "response");
        C43227h hVar = this.f100911d;
        C41536l.m120486f(hVar);
        return hVar.mo101869p();
    }
}
