package gu0;

import gu0.C36081c;
import kotlin.jvm.internal.C41536l;
import yt0.C40063d;

/* renamed from: gu0.a */
public final class C36079a {
    /* renamed from: a */
    public final C36080b mo88800a(C40063d dVar) {
        float f;
        C41536l.m120489i(dVar, "statusDetails");
        long a = dVar.mo93974a();
        C36081c.C36082a aVar = C36081c.f87223g;
        C36081c a2 = aVar.mo88820a(dVar.mo93976c(), C36081c.C36083b.BIG);
        String b = dVar.mo93975b();
        int n = dVar.mo93989n();
        long m = dVar.mo93988m();
        long e = dVar.mo93978e();
        String l = dVar.mo93987l();
        C36081c.C36083b bVar = C36081c.C36083b.SMALL;
        C36081c a3 = aVar.mo88820a(l, bVar);
        String k = dVar.mo93986k();
        C36081c a4 = aVar.mo88820a(dVar.mo93984i(), bVar);
        String g = dVar.mo93981g();
        int h = dVar.mo93982h();
        if (dVar.mo93982h() != 0) {
            f = (((float) dVar.mo93989n()) / ((float) dVar.mo93982h())) * ((float) 100);
        } else {
            f = 100.0f;
        }
        return new C36080b(a, a2, b, n, m, e, a3, k, a4, g, h, f, dVar.mo93985j(), dVar.mo93980f(), dVar.mo93977d());
    }
}
