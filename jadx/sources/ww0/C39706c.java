package ww0;

import cx0.C31453a;
import cx0.C31455b;
import g91.C32343x;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.C41536l;
import kotlin.jvm.internal.C41537m;
import ue1.C43075l;
import xw0.C39918a;
import xw0.C39919b;
import zc0.C30288a;

/* renamed from: ww0.c */
public final class C39706c {

    /* renamed from: a */
    private final C30288a f94335a;

    /* renamed from: ww0.c$a */
    static final class C39707a extends C41537m implements C43075l {

        /* renamed from: d */
        public static final C39707a f94336d = new C39707a();

        C39707a() {
            super(1);
        }

        public final Boolean invoke(Boolean bool) {
            C41536l.m120489i(bool, "it");
            return bool;
        }
    }

    /* renamed from: ww0.c$b */
    static final class C39708b extends C41537m implements C43075l {

        /* renamed from: d */
        public static final C39708b f94337d = new C39708b();

        C39708b() {
            super(1);
        }

        public final Boolean invoke(Boolean bool) {
            C41536l.m120489i(bool, "it");
            return bool;
        }
    }

    public C39706c(C30288a aVar) {
        C41536l.m120489i(aVar, "getDictionaryPopulatedObservable");
        this.f94335a = aVar;
    }

    /* renamed from: c */
    private final C31453a m115316c(C39919b bVar) {
        int i;
        boolean z;
        this.f94335a.mo70625a().mo94997P0(new C39704a(C39707a.f94336d)).mo94990M(new C39705b(C39708b.f94337d)).mo95020e();
        boolean w = bVar.mo93641w();
        boolean u = bVar.mo93639u();
        long j = bVar.mo93627j();
        String r = bVar.mo93635r();
        String o = bVar.mo93632o();
        String t = bVar.mo93637t();
        String h = bVar.mo93624h();
        String f = bVar.mo93622f();
        String q = bVar.mo93634q();
        String s = bVar.mo93636s();
        String E = C32343x.m95386E(bVar.mo93636s(), true, new Object[0]);
        String e = bVar.mo93620e();
        Integer m = bVar.mo93630m();
        if (m != null) {
            i = m.intValue();
        } else {
            i = 0;
        }
        String k = bVar.mo93628k();
        Double n = bVar.mo93631n();
        boolean y = bVar.mo93643y();
        boolean v = bVar.mo93640v();
        boolean i2 = bVar.mo93626i();
        String a = bVar.mo93616a();
        String b = bVar.mo93617b();
        String c = bVar.mo93618c();
        String d = bVar.mo93619d();
        Boolean x = bVar.mo93642x();
        String l = bVar.mo93629l();
        Boolean g = bVar.mo93623g();
        if (g != null) {
            z = g.booleanValue();
        } else {
            z = false;
        }
        return new C31453a(w, u, j, r, o, t, h, f, q, s, E, e, i, k, n, y, v, i2, a, b, c, d, x, l, z, bVar.mo93633p(), C32343x.m95386E(bVar.mo93633p(), false, new Object[0]));
    }

    /* renamed from: f */
    private final C39919b m115317f(C31453a aVar) {
        return new C39919b(aVar.mo71843y(), aVar.mo71841w(), aVar.mo71827j(), aVar.mo71836s(), aVar.mo71832o(), aVar.mo71840v(), aVar.mo71824h(), aVar.mo71822f(), aVar.mo71835r(), aVar.mo71837t(), aVar.mo71820e(), Integer.valueOf(aVar.mo71830m()), aVar.mo71828k(), aVar.mo71831n(), aVar.mo71815A(), aVar.mo71842x(), aVar.mo71826i(), aVar.mo71816a(), aVar.mo71817b(), aVar.mo71818c(), aVar.mo71819d(), aVar.mo71844z(), aVar.mo71829l(), Boolean.valueOf(aVar.mo71823g()), aVar.mo71834q());
    }

    /* access modifiers changed from: private */
    /* renamed from: g */
    public static final boolean m115318g(C43075l lVar, Object obj) {
        C41536l.m120489i(lVar, "$tmp0");
        return ((Boolean) lVar.invoke(obj)).booleanValue();
    }

    /* access modifiers changed from: private */
    /* renamed from: h */
    public static final boolean m115319h(C43075l lVar, Object obj) {
        C41536l.m120489i(lVar, "$tmp0");
        return ((Boolean) lVar.invoke(obj)).booleanValue();
    }

    /* renamed from: d */
    public final C31455b mo93432d(C39918a aVar) {
        C41536l.m120489i(aVar, "local");
        String b = aVar.mo93612b();
        List<C39919b> a = aVar.mo93611a();
        ArrayList arrayList = new ArrayList(C41343r.m119925u(a, 10));
        for (C39919b c : a) {
            arrayList.add(m115316c(c));
        }
        return new C31455b(b, arrayList);
    }

    /* renamed from: e */
    public final C39918a mo93433e(C31455b bVar) {
        C41536l.m120489i(bVar, "data");
        String b = bVar.mo71846b();
        List<C31453a> a = bVar.mo71845a();
        ArrayList arrayList = new ArrayList(C41343r.m119925u(a, 10));
        for (C31453a f : a) {
            arrayList.add(m115317f(f));
        }
        return new C39918a(b, arrayList);
    }
}
