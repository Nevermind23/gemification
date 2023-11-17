package ca0;

import g91.C32319m;
import g91.C32343x;
import kotlin.jvm.internal.C41536l;
import x90.C29661a;
import x90.C29662b;

/* renamed from: ca0.j */
public abstract class C19678j {
    /* renamed from: a */
    public static final C19677i m65344a(C29661a aVar) {
        Double d;
        String str;
        C41536l.m120489i(aVar, "<this>");
        long b = aVar.mo69603b();
        Double a = aVar.mo69602a();
        if (a != null) {
            d = Double.valueOf(a.doubleValue() / 100.0d);
        } else {
            d = null;
        }
        String e = aVar.mo69606e();
        String E = C32343x.m95386E(aVar.mo69608f(), true, new Object[0]);
        Long d2 = aVar.mo69605d();
        if (d2 != null) {
            str = C32319m.m95314u(d2.longValue());
        } else {
            str = null;
        }
        return new C19677i(b, d, "GEL", e, E, str, aVar.mo69604c());
    }

    /* renamed from: b */
    public static final C19677i m65345b(C29662b bVar) {
        C41536l.m120489i(bVar, "<this>");
        return new C19677i(bVar.mo69621i(), Double.valueOf(bVar.mo69611a()), bVar.mo69614d(), bVar.mo69613c(), bVar.mo69612b(), (String) null, (String) null);
    }
}
