package com.facetec.sdk;

import com.facetec.sdk.C3272jw;
import com.facetec.sdk.C3293kb;
import com.facetec.sdk.C3295kc;
import java.util.List;

/* renamed from: com.facetec.sdk.kx */
public final class C3327kx implements C3272jw {

    /* renamed from: a */
    private final C3255jo f10949a;

    public C3327kx(C3255jo joVar) {
        this.f10949a = joVar;
    }

    /* renamed from: e */
    public final C3295kc mo9536e(C3272jw.C3273a aVar) {
        boolean z;
        C3293kb a = aVar.mo9537a();
        C3293kb.C3294e e = a.mo9593e();
        C3297kd d = a.mo9592d();
        if (d != null) {
            C3276jy b = d.mo9500b();
            if (b != null) {
                e.mo9598a("Content-Type", b.toString());
            }
            long d2 = d.mo9501d();
            if (d2 != -1) {
                e.mo9598a("Content-Length", Long.toString(d2));
                e.mo9600c("Transfer-Encoding");
            } else {
                e.mo9598a("Transfer-Encoding", "chunked");
                e.mo9600c("Content-Length");
            }
        }
        if (a.mo9591c("Host") == null) {
            e.mo9598a("Host", C3303ki.m13251b(a.mo9588a(), false));
        }
        if (a.mo9591c("Connection") == null) {
            e.mo9598a("Connection", "Keep-Alive");
        }
        if (a.mo9591c("Accept-Encoding") == null && a.mo9591c("Range") == null) {
            e.mo9598a("Accept-Encoding", "gzip");
            z = true;
        } else {
            z = false;
        }
        C3255jo joVar = this.f10949a;
        a.mo9588a();
        List<C3251jl> b2 = joVar.mo9482b();
        if (!b2.isEmpty()) {
            StringBuilder sb = new StringBuilder();
            int size = b2.size();
            for (int i = 0; i < size; i++) {
                if (i > 0) {
                    sb.append("; ");
                }
                C3251jl jlVar = b2.get(i);
                sb.append(jlVar.f10620d);
                sb.append('=');
                sb.append(jlVar.f10619b);
            }
            e.mo9598a("Cookie", sb.toString());
        }
        if (a.mo9591c("User-Agent") == null) {
            e.mo9598a("User-Agent", C3311kl.m13288b());
        }
        C3295kc e2 = aVar.mo9541e(e.mo9599b());
        C3328ky.m13338e(this.f10949a, a.mo9588a(), e2.mo9610e());
        C3295kc.C3296d a2 = e2.mo9612f().mo9619a(a);
        if (z && "gzip".equalsIgnoreCase(e2.mo9611e("Content-Encoding")) && C3328ky.m13339e(e2)) {
            C3440mv mvVar = new C3440mv(e2.mo9607c().mo9584c());
            a2.mo9622b(e2.mo9610e().mo9491e().mo9496c("Content-Encoding").mo9496c("Content-Length").mo9498c());
            a2.mo9625d((C3291ka) new C3345ld(e2.mo9611e("Content-Type"), -1, C3442mx.m13804a((C3465nf) mvVar)));
        }
        return a2.mo9621a();
    }
}
