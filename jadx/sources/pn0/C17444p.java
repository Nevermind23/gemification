package pn0;

import androidx.lifecycle.C1644x;
import androidx.lifecycle.LiveData;
import b41.C31128a;
import c41.C31270e;
import ed1.C40744k;
import ed1.C40749p;
import ed1.C40754t;
import ed1.C40762x;
import ee1.C40767b;
import g91.C32343x;
import gn0.C15363a;
import hd1.C41204a;
import hd1.C41205b;
import he1.C41224m;
import he1.C41238w;
import hn0.C15537b;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import jn0.C16254a;
import jn0.C16276c;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.C41535k;
import kotlin.jvm.internal.C41536l;
import kotlin.jvm.internal.C41537m;
import kotlin.jvm.internal.DefaultConstructorMarker;
import m41.C37224b;
import p341ge.bog.mobilebank.cleanarch.presentation.common.C21481a;
import rn0.C17680a;
import ue1.C43075l;
import ue1.C43079p;

/* renamed from: pn0.p */
public final class C17444p extends C21481a implements C17433e, C17434f, C16276c {

    /* renamed from: d */
    private final /* synthetic */ C16276c f48849d;

    /* renamed from: e */
    private final C17433e f48850e = this;

    /* renamed from: f */
    private final C17434f f48851f = this;

    /* renamed from: g */
    private final C40767b f48852g;
    /* access modifiers changed from: private */

    /* renamed from: h */
    public final C1644x f48853h;
    /* access modifiers changed from: private */

    /* renamed from: i */
    public final C1644x f48854i;

    /* renamed from: pn0.p$a */
    static final class C17445a extends C41537m implements C43075l {

        /* renamed from: d */
        public static final C17445a f48855d = new C17445a();

        C17445a() {
            super(1);
        }

        /* renamed from: a */
        public final C31128a invoke(C31128a aVar) {
            C31128a.C31129a aVar2;
            C41536l.m120489i(aVar, "it");
            try {
                if (aVar instanceof C31128a.C31131c) {
                    List<C15537b> list = (List) ((C31128a.C31131c) aVar).mo71340a();
                    ArrayList arrayList = new ArrayList(C41343r.m119925u(list, 10));
                    for (C15537b bVar : list) {
                        arrayList.add(new C17680a(bVar.mo42659c(), bVar.mo42658b()));
                    }
                    return new C31128a.C31131c(arrayList, aVar.mo71341b());
                } else if (aVar instanceof C31128a.C31129a) {
                    aVar2 = new C31128a.C31129a(((C31128a.C31129a) aVar).mo71342c(), aVar.mo71341b(), (Object) null, 4, (DefaultConstructorMarker) null);
                    return aVar2;
                } else if (aVar instanceof C31128a.C31130b) {
                    return new C31128a.C31130b(aVar.mo71341b(), (Object) null, 2, (DefaultConstructorMarker) null);
                } else {
                    throw new NoWhenBranchMatchedException();
                }
            } catch (Throwable th) {
                aVar2 = new C31128a.C31129a(th, aVar.mo71341b(), (Object) null, 4, (DefaultConstructorMarker) null);
            }
        }
    }

    /* renamed from: pn0.p$b */
    static final class C17446b extends C41537m implements C43079p {

        /* renamed from: d */
        public static final C17446b f48856d = new C17446b();

        C17446b() {
            super(2);
        }

        /* renamed from: a */
        public final C31128a invoke(C31128a aVar, String str) {
            C41536l.m120489i(aVar, "result");
            C41536l.m120489i(str, "selected");
            try {
                if (aVar instanceof C31128a.C31131c) {
                    return new C31128a.C31131c(new C41224m((List) ((C31128a.C31131c) aVar).mo71340a(), str), aVar.mo71341b());
                }
                if (aVar instanceof C31128a.C31129a) {
                    return new C31128a.C31129a(((C31128a.C31129a) aVar).mo71342c(), aVar.mo71341b(), (Object) null, 4, (DefaultConstructorMarker) null);
                }
                if (aVar instanceof C31128a.C31130b) {
                    return new C31128a.C31130b(aVar.mo71341b(), (Object) null, 2, (DefaultConstructorMarker) null);
                }
                throw new NoWhenBranchMatchedException();
            } catch (Throwable th) {
                return new C31128a.C31129a(th, aVar.mo71341b(), (Object) null, 4, (DefaultConstructorMarker) null);
            }
        }
    }

    /* renamed from: pn0.p$c */
    static final class C17447c extends C41537m implements C43075l {

        /* renamed from: d */
        final /* synthetic */ C17444p f48857d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C17447c(C17444p pVar) {
            super(1);
            this.f48857d = pVar;
        }

        /* renamed from: a */
        public final void mo44938a(C31128a aVar) {
            this.f48857d.f48853h.mo4826r(aVar);
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            mo44938a((C31128a) obj);
            return C41238w.f97225a;
        }
    }

    /* renamed from: pn0.p$d */
    static final class C17448d extends C41537m implements C43079p {

        /* renamed from: d */
        public static final C17448d f48858d = new C17448d();

        C17448d() {
            super(2);
        }

        /* renamed from: a */
        public final C15537b invoke(String str, List list) {
            Object obj;
            C41536l.m120489i(str, "code");
            C41536l.m120489i(list, "list");
            Iterator it = list.iterator();
            while (true) {
                if (!it.hasNext()) {
                    obj = null;
                    break;
                }
                obj = it.next();
                if (C41536l.m120484d(((C15537b) obj).mo42659c(), str)) {
                    break;
                }
            }
            C41536l.m120486f(obj);
            return (C15537b) obj;
        }
    }

    /* renamed from: pn0.p$e */
    static final class C17449e extends C41537m implements C43075l {

        /* renamed from: d */
        final /* synthetic */ C17444p f48859d;

        /* renamed from: e */
        final /* synthetic */ C16254a f48860e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C17449e(C17444p pVar, C16254a aVar) {
            super(1);
            this.f48859d = pVar;
            this.f48860e = aVar;
        }

        /* renamed from: a */
        public final void mo44940a(C15537b bVar) {
            C17444p pVar = this.f48859d;
            C41536l.m120488h(bVar, "it");
            pVar.mo41424Vc(bVar, this.f48860e);
            C37224b.m109962a(this.f48859d.f48854i);
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            mo44940a((C15537b) obj);
            return C41238w.f97225a;
        }
    }

    /* renamed from: pn0.p$f */
    /* synthetic */ class C17450f extends C41535k implements C43079p {

        /* renamed from: d */
        public static final C17450f f48861d = new C17450f();

        C17450f() {
            super(2, C41224m.class, "<init>", "<init>(Ljava/lang/Object;Ljava/lang/Object;)V", 0);
        }

        /* renamed from: b */
        public final C41224m invoke(Integer num, String str) {
            C41536l.m120489i(num, "p0");
            return new C41224m(num, str);
        }
    }

    /* renamed from: pn0.p$g */
    static final class C17451g extends C41537m implements C43075l {

        /* renamed from: d */
        final /* synthetic */ C15363a f48862d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C17451g(C15363a aVar) {
            super(1);
            this.f48862d = aVar;
        }

        /* renamed from: a */
        public final C40754t invoke(C41224m mVar) {
            C41536l.m120489i(mVar, "<name for destructuring parameter 0>");
            Integer num = (Integer) mVar.mo95675a();
            String str = (String) mVar.mo95676b();
            C15363a aVar = this.f48862d;
            C41536l.m120488h(str, "countryCode");
            C40762x a = aVar.mo42453a(str);
            C41536l.m120488h(num, "rc");
            return C31270e.m92880i(a, num.intValue());
        }
    }

    /* renamed from: pn0.p$h */
    static final class C17452h extends C41537m implements C43075l {

        /* renamed from: d */
        public static final C17452h f48863d = new C17452h();

        C17452h() {
            super(1);
        }

        /* renamed from: a */
        public final Boolean invoke(C31128a aVar) {
            C41536l.m120489i(aVar, "it");
            return Boolean.valueOf(aVar instanceof C31128a.C31131c);
        }
    }

    /* renamed from: pn0.p$i */
    static final class C17453i extends C41537m implements C43075l {

        /* renamed from: d */
        public static final C17453i f48864d = new C17453i();

        C17453i() {
            super(1);
        }

        /* renamed from: a */
        public final List invoke(C31128a aVar) {
            C41536l.m120489i(aVar, "it");
            return (List) aVar.mo71340a();
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C17444p(C15363a aVar, C16276c cVar, C16254a aVar2) {
        super((C41204a) null, 1, (DefaultConstructorMarker) null);
        C41536l.m120489i(aVar, "getCities");
        C41536l.m120489i(cVar, "delegate");
        C41536l.m120489i(aVar2, "addressType");
        this.f48849d = cVar;
        C40767b h1 = C40767b.m118210h1();
        C41536l.m120488h(h1, "create<String>()");
        this.f48852g = h1;
        this.f48853h = new C1644x();
        this.f48854i = new C1644x();
        C40749p m1 = onRefresh().mo94977D0(1).mo95014Y0(mo43263m3(aVar2).mo94945B(), new C17435g(C17450f.f48861d)).mo94989L0(new C17436h(new C17451g(aVar))).mo95040w0().mo102096m1(2);
        C40749p k0 = m1.mo94990M(new C17437i(C17452h.f48863d)).mo95026k0(new C17438j(C17453i.f48864d));
        C40749p Y0 = m1.mo95026k0(new C17439k(C17445a.f48855d)).mo95014Y0(mo43264xp(aVar2).mo94949h("").mo94945B(), new C17440l(C17446b.f48856d));
        C41536l.m120488h(Y0, "citiesRequestedRes.map {…selected) }\n            }");
        C41205b F0 = C32343x.m95413R0(Y0).mo94981F0(new C17441m(new C17447c(this)));
        C41536l.m120488h(F0, "citiesRequestedRes.map {…ue = it\n                }");
        bindToLifecycle(F0);
        C40749p Y02 = h1.mo95014Y0(k0, new C17442n(C17448d.f48858d));
        C41536l.m120488h(Y02, "onSelectRegionCode.withL…== code }!!\n            }");
        C41205b F02 = C32343x.m95413R0(Y02).mo94981F0(new C17443o(new C17449e(this, aVar2)));
        C41536l.m120488h(F02, "onSelectRegionCode.withL….call()\n                }");
        bindToLifecycle(F02);
    }

    /* access modifiers changed from: private */
    public static final boolean _init_$lambda$2(C43075l lVar, Object obj) {
        C41536l.m120489i(lVar, "$tmp0");
        return ((Boolean) lVar.invoke(obj)).booleanValue();
    }

    /* access modifiers changed from: private */
    /* renamed from: mw */
    public static final C41224m m60902mw(C43079p pVar, Object obj, Object obj2) {
        C41536l.m120489i(pVar, "$tmp0");
        return (C41224m) pVar.invoke(obj, obj2);
    }

    /* access modifiers changed from: private */
    /* renamed from: nw */
    public static final C40754t m60903nw(C43075l lVar, Object obj) {
        C41536l.m120489i(lVar, "$tmp0");
        return (C40754t) lVar.invoke(obj);
    }

    /* access modifiers changed from: private */
    /* renamed from: ow */
    public static final List m60904ow(C43075l lVar, Object obj) {
        C41536l.m120489i(lVar, "$tmp0");
        return (List) lVar.invoke(obj);
    }

    /* access modifiers changed from: private */
    /* renamed from: pw */
    public static final C31128a m60905pw(C43075l lVar, Object obj) {
        C41536l.m120489i(lVar, "$tmp0");
        return (C31128a) lVar.invoke(obj);
    }

    /* access modifiers changed from: private */
    /* renamed from: qw */
    public static final C31128a m60906qw(C43079p pVar, Object obj, Object obj2) {
        C41536l.m120489i(pVar, "$tmp0");
        return (C31128a) pVar.invoke(obj, obj2);
    }

    /* access modifiers changed from: private */
    /* renamed from: rw */
    public static final void m60907rw(C43075l lVar, Object obj) {
        C41536l.m120489i(lVar, "$tmp0");
        lVar.invoke(obj);
    }

    /* access modifiers changed from: private */
    /* renamed from: sw */
    public static final C15537b m60908sw(C43079p pVar, Object obj, Object obj2) {
        C41536l.m120489i(pVar, "$tmp0");
        return (C15537b) pVar.invoke(obj, obj2);
    }

    /* access modifiers changed from: private */
    /* renamed from: tw */
    public static final void m60909tw(C43075l lVar, Object obj) {
        C41536l.m120489i(lVar, "$tmp0");
        lVar.invoke(obj);
    }

    /* renamed from: C */
    public void mo44931C(String str) {
        C41536l.m120489i(str, "regionCode");
        this.f48852g.onNext(str);
    }

    /* renamed from: Vc */
    public void mo41424Vc(C15537b bVar, C16254a aVar) {
        C41536l.m120489i(bVar, "city");
        C41536l.m120489i(aVar, "addressType");
        this.f48849d.mo41424Vc(bVar, aVar);
    }

    /* renamed from: b */
    public LiveData mo44932b() {
        return this.f48853h;
    }

    /* renamed from: m3 */
    public C40744k mo43263m3(C16254a aVar) {
        C41536l.m120489i(aVar, "addressType");
        return this.f48849d.mo43263m3(aVar);
    }

    /* renamed from: p */
    public LiveData mo44933p() {
        return this.f48854i;
    }

    /* renamed from: ww */
    public final C17433e mo44934ww() {
        return this.f48850e;
    }

    /* renamed from: xp */
    public C40744k mo43264xp(C16254a aVar) {
        C41536l.m120489i(aVar, "addressType");
        return this.f48849d.mo43264xp(aVar);
    }

    /* renamed from: xw */
    public final C17434f mo44935xw() {
        return this.f48851f;
    }
}
