package uf1;

import dg1.C40688j;
import dg1.C40691m;
import java.util.List;
import kotlin.jvm.internal.C41536l;
import of1.C41869b0;
import of1.C41872c0;
import of1.C41880d0;
import of1.C41884e0;
import of1.C41907m;
import of1.C41909n;
import of1.C41935w;
import of1.C41937x;
import pf1.C42197d;

/* renamed from: uf1.a */
public final class C43087a implements C41935w {

    /* renamed from: a */
    private final C41909n f100517a;

    public C43087a(C41909n nVar) {
        C41536l.m120489i(nVar, "cookieJar");
        this.f100517a = nVar;
    }

    /* renamed from: b */
    private final String m123625b(List list) {
        StringBuilder sb = new StringBuilder();
        int i = 0;
        for (Object next : list) {
            int i2 = i + 1;
            if (i < 0) {
                C41341q.m119917t();
            }
            C41907m mVar = (C41907m) next;
            if (i > 0) {
                sb.append("; ");
            }
            sb.append(mVar.mo96859i());
            sb.append('=');
            sb.append(mVar.mo96864n());
            i = i2;
        }
        String sb2 = sb.toString();
        C41536l.m120488h(sb2, "StringBuilder().apply(builderAction).toString()");
        return sb2;
    }

    /* renamed from: a */
    public C41880d0 mo21294a(C41935w.C41936a aVar) {
        C41884e0 a;
        C41536l.m120489i(aVar, "chain");
        C41869b0 w = aVar.mo97011w();
        C41869b0.C41870a h = w.mo96679h();
        C41872c0 a2 = w.mo96672a();
        if (a2 != null) {
            C41937x b = a2.mo21299b();
            if (b != null) {
                h.mo96691i("Content-Type", b.toString());
            }
            long a3 = a2.mo21298a();
            if (a3 != -1) {
                h.mo96691i("Content-Length", String.valueOf(a3));
                h.mo96697o("Transfer-Encoding");
            } else {
                h.mo96691i("Transfer-Encoding", "chunked");
                h.mo96697o("Content-Length");
            }
        }
        boolean z = false;
        if (w.mo96675d("Host") == null) {
            h.mo96691i("Host", C42197d.m122526T(w.mo96681j(), false, 1, (Object) null));
        }
        if (w.mo96675d("Connection") == null) {
            h.mo96691i("Connection", "Keep-Alive");
        }
        if (w.mo96675d("Accept-Encoding") == null && w.mo96675d("Range") == null) {
            h.mo96691i("Accept-Encoding", "gzip");
            z = true;
        }
        List a4 = this.f100517a.mo96869a(w.mo96681j());
        if (!a4.isEmpty()) {
            h.mo96691i("Cookie", m123625b(a4));
        }
        if (w.mo96675d("User-Agent") == null) {
            h.mo96691i("User-Agent", "okhttp/4.10.0");
        }
        C41880d0 a5 = aVar.mo97008a(h.mo96684b());
        C43092e.m123644f(this.f100517a, w.mo96681j(), a5.mo96753w());
        C41880d0.C41881a s = a5.mo96736Q().mo96778s(w);
        if (z && C40439w.m117115s("gzip", C41880d0.m121379v(a5, "Content-Encoding", (String) null, 2, (Object) null), true) && C43092e.m123640b(a5) && (a = a5.mo96739a()) != null) {
            C40688j jVar = new C40688j(a.mo21304t());
            s.mo96771l(a5.mo96753w().mo96931j().mo96943h("Content-Encoding").mo96943h("Content-Length").mo96941f());
            s.mo96763b(new C43095h(C41880d0.m121379v(a5, "Content-Type", (String) null, 2, (Object) null), -1, C40691m.m117770b(jVar)));
        }
        return s.mo96764c();
    }
}
