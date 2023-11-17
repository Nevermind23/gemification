package com.facetec.sdk;

import com.facetec.sdk.C3272jw;
import com.facetec.sdk.C3295kc;
import java.net.ProtocolException;

/* renamed from: com.facetec.sdk.kv */
public final class C3323kv implements C3272jw {

    /* renamed from: b */
    private final boolean f10931b;

    /* renamed from: com.facetec.sdk.kv$e */
    static final class C3324e extends C3437ms {

        /* renamed from: d */
        long f10932d;

        C3324e(C3461nc ncVar) {
            super(ncVar);
        }

        /* renamed from: b */
        public final void mo9671b(C3431mm mmVar, long j) {
            super.mo9671b(mmVar, j);
            this.f10932d += j;
        }
    }

    public C3323kv(boolean z) {
        this.f10931b = z;
    }

    /* renamed from: e */
    public final C3295kc mo9536e(C3272jw.C3273a aVar) {
        C3295kc kcVar;
        C3341la laVar = (C3341la) aVar;
        C3344lc lcVar = laVar.f10970d;
        C3325kw c = laVar.mo9691c();
        C3319ks ksVar = laVar.f10969c;
        C3293kb a = laVar.mo9537a();
        long currentTimeMillis = System.currentTimeMillis();
        laVar.mo9693i();
        laVar.mo9692f();
        lcVar.mo9701e(a);
        laVar.mo9693i();
        laVar.mo9692f();
        C3295kc.C3296d dVar = null;
        if (C3329kz.m13343d(a.mo9589b()) && a.mo9592d() != null) {
            if ("100-continue".equalsIgnoreCase(a.mo9591c("Expect"))) {
                lcVar.mo9695a();
                laVar.mo9693i();
                laVar.mo9692f();
                dVar = lcVar.mo9696b(true);
            }
            if (dVar == null) {
                laVar.mo9693i();
                laVar.mo9692f();
                C3434mp d = C3442mx.m13809d((C3461nc) new C3324e(lcVar.mo9697b(a, a.mo9592d().mo9501d())));
                a.mo9592d().mo9502e(d);
                d.close();
                laVar.mo9693i();
                laVar.mo9692f();
            } else if (!ksVar.mo9662d()) {
                c.mo9679e();
            }
        }
        lcVar.mo9700e();
        if (dVar == null) {
            laVar.mo9693i();
            laVar.mo9692f();
            dVar = lcVar.mo9696b(false);
        }
        C3295kc a2 = dVar.mo9619a(a).mo9629e(c.mo9677d().mo9658c()).mo9618a(currentTimeMillis).mo9628e(System.currentTimeMillis()).mo9621a();
        int b = a2.mo9606b();
        if (b == 100) {
            a2 = lcVar.mo9696b(false).mo9619a(a).mo9629e(c.mo9677d().mo9658c()).mo9618a(currentTimeMillis).mo9628e(System.currentTimeMillis()).mo9621a();
            b = a2.mo9606b();
        }
        laVar.mo9693i();
        laVar.mo9692f();
        if (!this.f10931b || b != 101) {
            kcVar = a2.mo9612f().mo9625d(lcVar.mo9699d(a2)).mo9621a();
        } else {
            kcVar = a2.mo9612f().mo9625d(C3303ki.f10842d).mo9621a();
        }
        if ("close".equalsIgnoreCase(kcVar.mo9609d().mo9591c("Connection")) || "close".equalsIgnoreCase(kcVar.mo9611e("Connection"))) {
            c.mo9679e();
        }
        if ((b != 204 && b != 205) || kcVar.mo9607c().mo9586d() <= 0) {
            return kcVar;
        }
        StringBuilder sb = new StringBuilder("HTTP ");
        sb.append(b);
        sb.append(" had non-zero Content-Length: ");
        sb.append(kcVar.mo9607c().mo9586d());
        throw new ProtocolException(sb.toString());
    }
}
