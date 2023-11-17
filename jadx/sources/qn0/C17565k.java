package qn0;

import androidx.lifecycle.C1644x;
import androidx.lifecycle.LiveData;
import ed1.C40744k;
import ed1.C40749p;
import ee1.C40767b;
import g91.C32343x;
import gn0.C15364b;
import hd1.C41204a;
import hd1.C41205b;
import he1.C41224m;
import he1.C41238w;
import hn0.C15538c;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import jn0.C16254a;
import jn0.C16278d;
import kotlin.jvm.internal.C41535k;
import kotlin.jvm.internal.C41536l;
import kotlin.jvm.internal.C41537m;
import kotlin.jvm.internal.DefaultConstructorMarker;
import m41.C37224b;
import p341ge.bog.mobilebank.cleanarch.presentation.common.C21481a;
import rn0.C17680a;
import ue1.C43075l;
import ue1.C43079p;

/* renamed from: qn0.k */
public final class C17565k extends C21481a implements C17558d, C17559e, C16278d {

    /* renamed from: d */
    private final /* synthetic */ C16278d f49113d;

    /* renamed from: e */
    private final C17558d f49114e = this;

    /* renamed from: f */
    private final C17559e f49115f = this;

    /* renamed from: g */
    private final C40767b f49116g;
    /* access modifiers changed from: private */

    /* renamed from: h */
    public final C1644x f49117h;
    /* access modifiers changed from: private */

    /* renamed from: i */
    public final C1644x f49118i;

    /* renamed from: qn0.k$a */
    static final class C17566a extends C41537m implements C43075l {

        /* renamed from: d */
        public static final C17566a f49119d = new C17566a();

        C17566a() {
            super(1);
        }

        public final List invoke(List list) {
            C41536l.m120489i(list, "it");
            ArrayList arrayList = new ArrayList(C41343r.m119925u(list, 10));
            Iterator it = list.iterator();
            while (it.hasNext()) {
                C15538c cVar = (C15538c) it.next();
                arrayList.add(new C17680a(cVar.mo42663a(), cVar.mo42664b()));
            }
            return arrayList;
        }
    }

    /* renamed from: qn0.k$b */
    /* synthetic */ class C17567b extends C41535k implements C43079p {

        /* renamed from: d */
        public static final C17567b f49120d = new C17567b();

        C17567b() {
            super(2, C41224m.class, "<init>", "<init>(Ljava/lang/Object;Ljava/lang/Object;)V", 0);
        }

        /* renamed from: b */
        public final C41224m invoke(List list, String str) {
            C41536l.m120489i(list, "p0");
            return new C41224m(list, str);
        }
    }

    /* renamed from: qn0.k$c */
    static final class C17568c extends C41537m implements C43075l {

        /* renamed from: d */
        final /* synthetic */ C17565k f49121d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C17568c(C17565k kVar) {
            super(1);
            this.f49121d = kVar;
        }

        /* renamed from: a */
        public final void mo45099a(C41224m mVar) {
            this.f49121d.f49117h.mo4826r(mVar);
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            mo45099a((C41224m) obj);
            return C41238w.f97225a;
        }
    }

    /* renamed from: qn0.k$d */
    static final class C17569d extends C41537m implements C43079p {

        /* renamed from: d */
        public static final C17569d f49122d = new C17569d();

        C17569d() {
            super(2);
        }

        /* renamed from: a */
        public final C15538c invoke(String str, List list) {
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
                if (C41536l.m120484d(((C15538c) obj).mo42663a(), str)) {
                    break;
                }
            }
            C41536l.m120486f(obj);
            return (C15538c) obj;
        }
    }

    /* renamed from: qn0.k$e */
    static final class C17570e extends C41537m implements C43075l {

        /* renamed from: d */
        final /* synthetic */ C17565k f49123d;

        /* renamed from: e */
        final /* synthetic */ C16254a f49124e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C17570e(C17565k kVar, C16254a aVar) {
            super(1);
            this.f49123d = kVar;
            this.f49124e = aVar;
        }

        /* renamed from: a */
        public final void mo45101a(C15538c cVar) {
            C17565k kVar = this.f49123d;
            C41536l.m120488h(cVar, "it");
            kVar.mo41427g8(cVar, this.f49124e);
            C37224b.m109962a(this.f49123d.f49118i);
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            mo45101a((C15538c) obj);
            return C41238w.f97225a;
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C17565k(C15364b bVar, C16278d dVar, C16254a aVar) {
        super((C41204a) null, 1, (DefaultConstructorMarker) null);
        C41536l.m120489i(bVar, "getCountries");
        C41536l.m120489i(dVar, "delegate");
        C41536l.m120489i(aVar, "addressType");
        this.f49113d = dVar;
        C40767b h1 = C40767b.m118210h1();
        C41536l.m120488h(h1, "create<String>()");
        this.f49116g = h1;
        this.f49117h = new C1644x();
        this.f49118i = new C1644x();
        C40749p m1 = bVar.mo42454a().mo95075O().mo95040w0().mo102096m1(2);
        C40749p Y0 = m1.mo95026k0(new C17560f(C17566a.f49119d)).mo95014Y0(mo43263m3(aVar).mo94949h("").mo94945B(), new C17561g(C17567b.f49120d));
        C41536l.m120488h(Y0, "countries.map {\n        …     ::Pair\n            )");
        C41205b F0 = C32343x.m95413R0(Y0).mo94981F0(new C17562h(new C17568c(this)));
        C41536l.m120488h(F0, "countries.map {\n        …ue = it\n                }");
        bindToLifecycle(F0);
        C40749p Y02 = h1.mo95014Y0(m1, new C17563i(C17569d.f49122d));
        C41536l.m120488h(Y02, "onSelectCountryCode.with…== code }!!\n            }");
        C41205b F02 = C32343x.m95413R0(Y02).mo94981F0(new C17564j(new C17570e(this, aVar)));
        C41536l.m120488h(F02, "onSelectCountryCode.with….call()\n                }");
        bindToLifecycle(F02);
    }

    /* access modifiers changed from: private */
    /* renamed from: iw */
    public static final List m61124iw(C43075l lVar, Object obj) {
        C41536l.m120489i(lVar, "$tmp0");
        return (List) lVar.invoke(obj);
    }

    /* access modifiers changed from: private */
    /* renamed from: jw */
    public static final C41224m m61125jw(C43079p pVar, Object obj, Object obj2) {
        C41536l.m120489i(pVar, "$tmp0");
        return (C41224m) pVar.invoke(obj, obj2);
    }

    /* access modifiers changed from: private */
    /* renamed from: kw */
    public static final void m61126kw(C43075l lVar, Object obj) {
        C41536l.m120489i(lVar, "$tmp0");
        lVar.invoke(obj);
    }

    /* access modifiers changed from: private */
    /* renamed from: lw */
    public static final C15538c m61127lw(C43079p pVar, Object obj, Object obj2) {
        C41536l.m120489i(pVar, "$tmp0");
        return (C15538c) pVar.invoke(obj, obj2);
    }

    /* access modifiers changed from: private */
    /* renamed from: mw */
    public static final void m61128mw(C43075l lVar, Object obj) {
        C41536l.m120489i(lVar, "$tmp0");
        lVar.invoke(obj);
    }

    /* renamed from: C */
    public void mo45092C(String str) {
        C41536l.m120489i(str, "countryCode");
        this.f49116g.onNext(str);
    }

    /* renamed from: b */
    public LiveData mo45093b() {
        return this.f49117h;
    }

    /* renamed from: g8 */
    public void mo41427g8(C15538c cVar, C16254a aVar) {
        C41536l.m120489i(cVar, "country");
        C41536l.m120489i(aVar, "addressType");
        this.f49113d.mo41427g8(cVar, aVar);
    }

    /* renamed from: m3 */
    public C40744k mo43263m3(C16254a aVar) {
        C41536l.m120489i(aVar, "addressType");
        return this.f49113d.mo43263m3(aVar);
    }

    /* renamed from: p */
    public LiveData mo45094p() {
        return this.f49118i;
    }

    /* renamed from: pw */
    public final C17558d mo45095pw() {
        return this.f49114e;
    }

    /* renamed from: qw */
    public final C17559e mo45096qw() {
        return this.f49115f;
    }
}
