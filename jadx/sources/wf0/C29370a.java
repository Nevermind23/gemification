package wf0;

import ef0.C20226a;
import ef0.C20227b;
import ef0.C20229d;
import ef0.C20231f;
import ef0.C20232g;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.C41536l;
import kotlin.jvm.internal.DefaultConstructorMarker;
import xf0.C29761a;
import xf0.C29763b;
import xf0.C29764c;
import xf0.C29765d;
import xf0.C29766e;

/* renamed from: wf0.a */
public final class C29370a {
    /* renamed from: e */
    private final C20231f m89449e(C29765d dVar) {
        return new C20231f(dVar.mo69921a(), dVar.mo69922b(), dVar.mo69923c());
    }

    /* renamed from: f */
    private final C29765d m89450f(C20231f fVar) {
        return new C29765d(fVar.mo48696a(), fVar.mo48697b(), fVar.mo48698c(), false, 8, (DefaultConstructorMarker) null);
    }

    /* renamed from: a */
    public final C29761a mo69217a(C20226a aVar) {
        C29765d dVar;
        C29765d dVar2;
        C41536l.m120489i(aVar, "data");
        C20231f i = aVar.mo48662i();
        if (i == null) {
            i = aVar.mo48654c();
        }
        C29765d dVar3 = null;
        if (i != null) {
            dVar = m89450f(i);
        } else {
            dVar = null;
        }
        List<C20231f> j = aVar.mo48663j();
        ArrayList arrayList = new ArrayList(C41343r.m119925u(j, 10));
        for (C20231f f : j) {
            arrayList.add(m89450f(f));
        }
        String h = aVar.mo48660h();
        C20231f m = aVar.mo48666m();
        if (m == null) {
            m = aVar.mo48656e();
        }
        if (m != null) {
            dVar2 = m89450f(m);
        } else {
            dVar2 = null;
        }
        List<C20231f> n = aVar.mo48667n();
        ArrayList arrayList2 = new ArrayList(C41343r.m119925u(n, 10));
        for (C20231f f2 : n) {
            arrayList2.add(m89450f(f2));
        }
        C20231f k = aVar.mo48664k();
        if (k == null) {
            k = aVar.mo48655d();
        }
        if (k != null) {
            dVar3 = m89450f(k);
        }
        C29765d dVar4 = dVar3;
        List<C20231f> l = aVar.mo48665l();
        ArrayList arrayList3 = new ArrayList(C41343r.m119925u(l, 10));
        for (C20231f f3 : l) {
            arrayList3.add(m89450f(f3));
        }
        return new C29761a(dVar, arrayList, h, dVar2, arrayList2, dVar4, arrayList3, aVar.mo48653a(), aVar.mo48658f(), aVar.mo48659g());
    }

    /* renamed from: b */
    public final C29763b mo69218b(C20227b bVar) {
        C29765d dVar;
        C41536l.m120489i(bVar, "data");
        C20231f a = bVar.mo48669a();
        if (a != null) {
            dVar = m89450f(a);
        } else {
            dVar = null;
        }
        List<C20231f> b = bVar.mo48670b();
        ArrayList arrayList = new ArrayList(C41343r.m119925u(b, 10));
        for (C20231f f : b) {
            arrayList.add(m89450f(f));
        }
        return new C29763b(dVar, arrayList);
    }

    /* renamed from: c */
    public final C29764c mo69219c(C20229d dVar) {
        C41536l.m120489i(dVar, "data");
        return new C29764c(dVar.mo48674a());
    }

    /* renamed from: d */
    public final C29766e mo69220d(C20232g gVar) {
        C41536l.m120489i(gVar, "data");
        return new C29766e(mo69217a(gVar.mo48702a()), mo69218b(gVar.mo48703b()), mo69219c(gVar.mo48704c()));
    }

    /* renamed from: g */
    public final C20226a mo69221g(C29761a aVar) {
        C20231f fVar;
        C20231f fVar2;
        C41536l.m120489i(aVar, "data");
        C29765d e = aVar.mo69891e();
        C20231f fVar3 = null;
        if (e != null) {
            fVar = m89449e(e);
        } else {
            fVar = null;
        }
        List<C29765d> f = aVar.mo69893f();
        ArrayList arrayList = new ArrayList(C41343r.m119925u(f, 10));
        for (C29765d e2 : f) {
            arrayList.add(m89449e(e2));
        }
        String d = aVar.mo69890d();
        C29765d i = aVar.mo69897i();
        if (i != null) {
            fVar2 = m89449e(i);
        } else {
            fVar2 = null;
        }
        List<C29765d> j = aVar.mo69898j();
        ArrayList arrayList2 = new ArrayList(C41343r.m119925u(j, 10));
        for (C29765d e3 : j) {
            arrayList2.add(m89449e(e3));
        }
        C29765d g = aVar.mo69894g();
        if (g != null) {
            fVar3 = m89449e(g);
        }
        C20231f fVar4 = fVar3;
        List<C29765d> h = aVar.mo69895h();
        ArrayList arrayList3 = new ArrayList(C41343r.m119925u(h, 10));
        for (C29765d e4 : h) {
            arrayList3.add(m89449e(e4));
        }
        return new C20226a(fVar, arrayList, d, fVar2, arrayList2, fVar4, arrayList3, aVar.mo69887a(), aVar.mo69888b(), aVar.mo69889c());
    }

    /* renamed from: h */
    public final C20227b mo69222h(C29763b bVar) {
        C20231f fVar;
        C41536l.m120489i(bVar, "data");
        C29765d a = bVar.mo69910a();
        if (a != null) {
            fVar = m89449e(a);
        } else {
            fVar = null;
        }
        List<C29765d> b = bVar.mo69911b();
        ArrayList arrayList = new ArrayList(C41343r.m119925u(b, 10));
        for (C29765d e : b) {
            arrayList.add(m89449e(e));
        }
        return new C20227b(fVar, arrayList);
    }

    /* renamed from: i */
    public final C20229d mo69223i(C29764c cVar) {
        C41536l.m120489i(cVar, "data");
        return new C20229d(cVar.mo69916a());
    }

    /* renamed from: j */
    public final C20232g mo69224j(C29766e eVar) {
        C41536l.m120489i(eVar, "data");
        return new C20232g(mo69221g(eVar.mo69929a()), mo69222h(eVar.mo69930b()), mo69223i(eVar.mo69931c()));
    }
}
