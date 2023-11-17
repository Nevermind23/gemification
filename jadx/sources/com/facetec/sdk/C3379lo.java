package com.facetec.sdk;

import com.facetec.sdk.C3260jr;
import com.facetec.sdk.C3272jw;
import com.facetec.sdk.C3295kc;
import java.io.IOException;
import java.net.ProtocolException;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.concurrent.TimeUnit;

/* renamed from: com.facetec.sdk.lo */
public final class C3379lo implements C3344lc {

    /* renamed from: a */
    private static final List<String> f11125a = C3303ki.m13273e((T[]) new String[]{"connection", "host", "keep-alive", "proxy-connection", "te", "transfer-encoding", "encoding", "upgrade"});

    /* renamed from: d */
    private static final List<String> f11126d = C3303ki.m13273e((T[]) new String[]{"connection", "host", "keep-alive", "proxy-connection", "te", "transfer-encoding", "encoding", "upgrade", ":method", ":path", ":scheme", ":authority"});

    /* renamed from: b */
    private final C3272jw.C3273a f11127b;

    /* renamed from: c */
    final C3325kw f11128c;

    /* renamed from: e */
    private final C3364ln f11129e;

    /* renamed from: f */
    private C3384lq f11130f;

    /* renamed from: g */
    private final C3271jv f11131g;

    /* renamed from: com.facetec.sdk.lo$d */
    class C3380d extends C3438mt {

        /* renamed from: a */
        private long f11132a = 0;

        /* renamed from: b */
        private boolean f11133b = false;

        C3380d(C3465nf nfVar) {
            super(nfVar);
        }

        /* renamed from: a */
        private void m13471a(IOException iOException) {
            if (!this.f11133b) {
                this.f11133b = true;
                C3379lo loVar = C3379lo.this;
                loVar.f11128c.mo9675c(false, (C3344lc) loVar, iOException);
            }
        }

        /* renamed from: c */
        public final long mo9643c(C3431mm mmVar, long j) {
            try {
                long c = mo9920e().mo9643c(mmVar, j);
                if (c > 0) {
                    this.f11132a += c;
                }
                return c;
            } catch (IOException e) {
                m13471a(e);
                throw e;
            }
        }

        public final void close() {
            super.close();
            m13471a((IOException) null);
        }
    }

    public C3379lo(C3268ju juVar, C3272jw.C3273a aVar, C3325kw kwVar, C3364ln lnVar) {
        this.f11127b = aVar;
        this.f11128c = kwVar;
        this.f11129e = lnVar;
        List<C3271jv> m = juVar.mo9519m();
        C3271jv jvVar = C3271jv.H2_PRIOR_KNOWLEDGE;
        this.f11131g = !m.contains(jvVar) ? C3271jv.HTTP_2 : jvVar;
    }

    /* renamed from: a */
    public final void mo9695a() {
        this.f11129e.mo9721a();
    }

    /* renamed from: b */
    public final C3461nc mo9697b(C3293kb kbVar, long j) {
        return this.f11130f.mo9748b();
    }

    /* renamed from: d */
    public final C3291ka mo9699d(C3295kc kcVar) {
        C3325kw kwVar = this.f11128c;
        C3264jt jtVar = kwVar.f10934a;
        C3247ji jiVar = kwVar.f10937d;
        return new C3345ld(kcVar.mo9611e("Content-Type"), C3328ky.m13335c(kcVar), C3442mx.m13804a((C3465nf) new C3380d(this.f11130f.f11155g)));
    }

    /* renamed from: e */
    public final void mo9701e(C3293kb kbVar) {
        if (this.f11130f == null) {
            boolean z = kbVar.mo9592d() != null;
            C3260jr c = kbVar.mo9590c();
            ArrayList arrayList = new ArrayList(c.mo9487a() + 4);
            arrayList.add(new C3362lm(C3362lm.f11054d, kbVar.mo9589b()));
            arrayList.add(new C3362lm(C3362lm.f11053c, C3347lf.m13371b(kbVar.mo9588a())));
            String c2 = kbVar.mo9591c("Host");
            if (c2 != null) {
                arrayList.add(new C3362lm(C3362lm.f11056g, c2));
            }
            arrayList.add(new C3362lm(C3362lm.f11052b, kbVar.mo9588a().mo9547e()));
            int a = c.mo9487a();
            for (int i = 0; i < a; i++) {
                C3435mq b = C3435mq.m13741b(c.mo9489b(i).toLowerCase(Locale.US));
                if (!f11126d.contains(b.mo9903e())) {
                    arrayList.add(new C3362lm(b, c.mo9490c(i)));
                }
            }
            C3384lq b2 = this.f11129e.mo9726b(arrayList, z);
            this.f11130f = b2;
            TimeUnit timeUnit = TimeUnit.MILLISECONDS;
            b2.f11156h.mo9913b((long) this.f11127b.mo9540e(), timeUnit);
            this.f11130f.f11157i.mo9913b((long) this.f11127b.mo9538b(), timeUnit);
        }
    }

    /* renamed from: b */
    public final C3295kc.C3296d mo9696b(boolean z) {
        C3260jr d = this.f11130f.mo9751d();
        C3271jv jvVar = this.f11131g;
        C3260jr.C3261d dVar = new C3260jr.C3261d();
        int a = d.mo9487a();
        C3346le leVar = null;
        for (int i = 0; i < a; i++) {
            String b = d.mo9489b(i);
            String c = d.mo9490c(i);
            if (b.equals(":status")) {
                leVar = C3346le.m13370e("HTTP/1.1 ".concat(String.valueOf(c)));
            } else if (!f11125a.contains(b)) {
                C3300kf.f10832d.mo9533e(dVar, b, c);
            }
        }
        if (leVar != null) {
            C3295kc.C3296d b2 = new C3295kc.C3296d().mo9624d(jvVar).mo9627e(leVar.f10986c).mo9630e(leVar.f10987e).mo9622b(dVar.mo9498c());
            if (!z || C3300kf.f10832d.mo9528d(b2) != 100) {
                return b2;
            }
            return null;
        }
        throw new ProtocolException("Expected ':status' header not present");
    }

    /* renamed from: b */
    public final void mo9698b() {
        C3384lq lqVar = this.f11130f;
        if (lqVar != null) {
            lqVar.mo9749b(C3361ll.CANCEL);
        }
    }

    /* renamed from: e */
    public final void mo9700e() {
        this.f11130f.mo9748b().close();
    }
}
