package mo0;

import android.os.Bundle;
import androidx.lifecycle.C1644x;
import b41.C31128a;
import b41.C31132b;
import c41.C31270e;
import ed1.C40749p;
import ed1.C40754t;
import g91.C32343x;
import hd1.C41204a;
import hd1.C41205b;
import he1.C41224m;
import he1.C41233s;
import he1.C41238w;
import iu0.C36546y;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.NoSuchElementException;
import ko0.C16516a;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.C41535k;
import kotlin.jvm.internal.C41536l;
import kotlin.jvm.internal.C41537m;
import kotlin.jvm.internal.DefaultConstructorMarker;
import m41.C37224b;
import p341ge.bog.mobilebank.cleanarch.presentation.common.C21481a;
import p380ck.C10464h;
import ue1.C43075l;
import uo0.C18272d;
import uo0.C18273e;
import vo0.C18490b;
import zn0.C19100l;
import zn0.C19102n;

/* renamed from: mo0.o */
public final class C16862o extends C21481a implements C16856i, C16857j {

    /* renamed from: d */
    private final long f47155d;
    /* access modifiers changed from: private */

    /* renamed from: e */
    public final boolean f47156e;
    /* access modifiers changed from: private */

    /* renamed from: f */
    public final C19102n f47157f;
    /* access modifiers changed from: private */

    /* renamed from: g */
    public final C19100l f47158g;
    /* access modifiers changed from: private */

    /* renamed from: h */
    public final C18490b f47159h;

    /* renamed from: i */
    private final C16856i f47160i = this;

    /* renamed from: j */
    private final C16857j f47161j = this;

    /* renamed from: k */
    private final C1644x f47162k = new C1644x();

    /* renamed from: l */
    private final C1644x f47163l = new C1644x();

    /* renamed from: m */
    private final C1644x f47164m = new C1644x();

    /* renamed from: n */
    private final C1644x f47165n = new C1644x();
    /* access modifiers changed from: private */

    /* renamed from: o */
    public List f47166o = new ArrayList();
    /* access modifiers changed from: private */

    /* renamed from: p */
    public long f47167p;

    /* renamed from: mo0.o$a */
    static final class C16863a extends C41537m implements C43075l {

        /* renamed from: d */
        final /* synthetic */ C16862o f47168d;

        /* renamed from: mo0.o$a$a */
        /* synthetic */ class C16864a extends C41535k implements C43075l {
            C16864a(Object obj) {
                super(1, obj, C18490b.class, "transform", "transformCategories(Ljava/util/List;)Ljava/util/List;", 0);
            }

            public final List invoke(List list) {
                return ((C18490b) this.receiver).mo46282j(list);
            }
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C16863a(C16862o oVar) {
            super(1);
            this.f47168d = oVar;
        }

        /* access modifiers changed from: private */
        public static final List invoke$lambda$0(C43075l lVar, Object obj) {
            C41536l.m120489i(lVar, "$tmp0");
            return (List) lVar.invoke(obj);
        }

        /* renamed from: b */
        public final C40754t invoke(Integer num) {
            C41536l.m120489i(num, "it");
            C40749p k0 = this.f47168d.f47157f.mo47303a().mo95075O().mo95026k0(new C16861n(new C16864a(this.f47168d.f47159h)));
            C41536l.m120488h(k0, "getLifestyleOffersAndCat…  .map(mapper::transform)");
            return C31270e.m92879h(k0, 1);
        }
    }

    /* renamed from: mo0.o$b */
    static final class C16865b extends C41537m implements C43075l {

        /* renamed from: d */
        final /* synthetic */ C16862o f47169d;

        /* renamed from: mo0.o$b$a */
        static final class C16866a extends C41537m implements C43075l {

            /* renamed from: d */
            final /* synthetic */ C16862o f47170d;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            C16866a(C16862o oVar) {
                super(1);
                this.f47170d = oVar;
            }

            /* renamed from: a */
            public final void mo43998a(List list) {
                C16862o oVar = this.f47170d;
                C41536l.m120488h(list, "offersAndCategories");
                oVar.f47166o = list;
                C16862o oVar2 = this.f47170d;
                oVar2.mo43983Ah(oVar2.f47167p);
            }

            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                mo43998a((List) obj);
                return C41238w.f97225a;
            }
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C16865b(C16862o oVar) {
            super(1);
            this.f47169d = oVar;
        }

        /* renamed from: a */
        public final void mo43997a(C31128a aVar) {
            Object obj;
            C31128a.C31129a aVar2;
            C41536l.m120488h(aVar, "result");
            C16862o oVar = this.f47169d;
            try {
                if (aVar instanceof C31128a.C31131c) {
                    List<C18272d> list = (List) ((C31128a.C31131c) aVar).mo71340a();
                    C41536l.m120488h(list, "offerCategories");
                    ArrayList arrayList = new ArrayList(C41343r.m119925u(list, 10));
                    for (C18272d l : list) {
                        arrayList.add(oVar.f47159h.mo46283l(l));
                    }
                    obj = new C31128a.C31131c(C41233s.m119492a(arrayList, Long.valueOf(oVar.f47167p)), aVar.mo71341b());
                } else if (aVar instanceof C31128a.C31129a) {
                    aVar2 = new C31128a.C31129a(((C31128a.C31129a) aVar).mo71342c(), aVar.mo71341b(), (Object) null, 4, (DefaultConstructorMarker) null);
                    obj = aVar2;
                } else if (aVar instanceof C31128a.C31130b) {
                    obj = new C31128a.C31130b(aVar.mo71341b(), (Object) null, 2, (DefaultConstructorMarker) null);
                } else {
                    throw new NoWhenBranchMatchedException();
                }
            } catch (Throwable th) {
                aVar2 = new C31128a.C31129a(th, aVar.mo71341b(), (Object) null, 4, (DefaultConstructorMarker) null);
            }
            this.f47169d.mo43986gf().mo4823o(obj);
            C31132b.m92648j(aVar, (int[]) null, new C16866a(this.f47169d), 1, (Object) null);
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            mo43997a((C31128a) obj);
            return C41238w.f97225a;
        }
    }

    /* renamed from: mo0.o$c */
    static final class C16867c extends C41537m implements C43075l {

        /* renamed from: d */
        final /* synthetic */ C16862o f47171d;

        /* renamed from: mo0.o$c$a */
        static final class C16868a extends C41537m implements C43075l {

            /* renamed from: d */
            final /* synthetic */ C16862o f47172d;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            C16868a(C16862o oVar) {
                super(1);
                this.f47172d = oVar;
            }

            /* renamed from: a */
            public final C41224m invoke(List list) {
                C41536l.m120489i(list, "it");
                return C41233s.m119492a(C18490b.m62965h(this.f47172d.f47159h, list, false, 2, (Object) null), Boolean.valueOf(this.f47172d.f47156e));
            }
        }

        /* renamed from: mo0.o$c$b */
        static final class C16869b extends C41537m implements C43075l {

            /* renamed from: d */
            final /* synthetic */ C16862o f47173d;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            C16869b(C16862o oVar) {
                super(1);
                this.f47173d = oVar;
            }

            /* renamed from: a */
            public final C41224m invoke(C41224m mVar) {
                C41536l.m120489i(mVar, "<name for destructuring parameter 0>");
                boolean booleanValue = ((Boolean) mVar.mo95676b()).booleanValue();
                return C41233s.m119492a(this.f47173d.m59386ww((List) mVar.mo95675a()), Boolean.valueOf(booleanValue));
            }
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C16867c(C16862o oVar) {
            super(1);
            this.f47171d = oVar;
        }

        /* access modifiers changed from: private */
        /* renamed from: d */
        public static final C41224m m59405d(C43075l lVar, Object obj) {
            C41536l.m120489i(lVar, "$tmp0");
            return (C41224m) lVar.invoke(obj);
        }

        /* access modifiers changed from: private */
        /* renamed from: e */
        public static final C41224m m59406e(C43075l lVar, Object obj) {
            C41536l.m120489i(lVar, "$tmp0");
            return (C41224m) lVar.invoke(obj);
        }

        /* renamed from: c */
        public final C40754t invoke(Integer num) {
            C41536l.m120489i(num, "it");
            C40749p k0 = this.f47171d.f47158g.mo47301a().mo95075O().mo95026k0(new C16871p(new C16868a(this.f47171d))).mo95026k0(new C16872q(new C16869b(this.f47171d)));
            C41536l.m120488h(k0, "class ViewModel @Assiste…ViewModel\n        }\n    }");
            return C31270e.m92879h(k0, 1);
        }
    }

    /* renamed from: mo0.o$d */
    public interface C16870d {
        /* renamed from: a */
        C16862o mo32566a(long j, boolean z);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C16862o(long j, boolean z, C19102n nVar, C19100l lVar, C18490b bVar) {
        super((C41204a) null, 1, (DefaultConstructorMarker) null);
        C41536l.m120489i(nVar, "getLifestyleOffersAndCategories");
        C41536l.m120489i(lVar, "getLifestyleLastMinuteOffers");
        C41536l.m120489i(bVar, "mapper");
        this.f47155d = j;
        this.f47156e = z;
        this.f47157f = nVar;
        this.f47158g = lVar;
        this.f47159h = bVar;
        this.f47167p = j;
        if (!z) {
            C40749p L0 = C40749p.m118047l0(onInit(), onRefresh()).mo94989L0(new C16858k(new C16863a(this)));
            C41536l.m120488h(L0, "merge(onInit(), onRefres…IT)\n                    }");
            C41205b F0 = C32343x.m95413R0(L0).mo94981F0(new C16859l(new C16865b(this)));
            C41536l.m120488h(F0, "merge(onInit(), onRefres…  }\n                    }");
            bindToLifecycle(F0);
            return;
        }
        C40749p L02 = C40749p.m118047l0(onInit(), onRefresh()).mo94989L0(new C16860m(new C16867c(this)));
        C41536l.m120488h(L02, "merge(onInit(), onRefres…IT)\n                    }");
        bindToLifecycle(C31270e.m92876e(C32343x.m95413R0(L02), mo43985L0()));
    }

    /* access modifiers changed from: private */
    /* renamed from: gw */
    public static final C40754t m59376gw(C43075l lVar, Object obj) {
        C41536l.m120489i(lVar, "$tmp0");
        return (C40754t) lVar.invoke(obj);
    }

    /* access modifiers changed from: private */
    /* renamed from: hw */
    public static final void m59377hw(C43075l lVar, Object obj) {
        C41536l.m120489i(lVar, "$tmp0");
        lVar.invoke(obj);
    }

    /* access modifiers changed from: private */
    /* renamed from: iw */
    public static final C40754t m59378iw(C43075l lVar, Object obj) {
        C41536l.m120489i(lVar, "$tmp0");
        return (C40754t) lVar.invoke(obj);
    }

    /* access modifiers changed from: private */
    /* renamed from: ww */
    public final List m59386ww(List list) {
        ArrayList arrayList = new ArrayList(C41343r.m119925u(list, 10));
        Iterator it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(new C16516a.C16518b((C18273e) it.next()));
        }
        return arrayList;
    }

    /* renamed from: Ah */
    public void mo43983Ah(long j) {
        boolean z;
        this.f47167p = j;
        for (C18272d dVar : this.f47166o) {
            if (dVar.mo45944e() == j) {
                z = true;
                continue;
            } else {
                z = false;
                continue;
            }
            if (z) {
                mo43985L0().mo4823o(new C31128a.C31131c(C41233s.m119492a(m59386ww(dVar.mo45947g()), Boolean.valueOf(this.f47156e)), 0, 2, (DefaultConstructorMarker) null));
                return;
            }
        }
        throw new NoSuchElementException("Collection contains no element matching the predicate.");
    }

    /* renamed from: h2 */
    public void mo43984h2(long j, String str, boolean z) {
        if (!z) {
            C36546y.m108282F().mo27137H("life_style_offers", "offer_click", String.valueOf(j), (Bundle) null, C10464h.C10465a.FACEBOOKANDFIREBASE);
            C37224b.m109965d(mo43987h4(), Long.valueOf(j));
            return;
        }
        mo43988ja().mo4823o(C32343x.m95466m(C41233s.m119492a(Long.valueOf(j), str)));
    }

    /* renamed from: ja */
    public C1644x mo43988ja() {
        return this.f47165n;
    }

    /* renamed from: qw */
    public C1644x mo43986gf() {
        return this.f47162k;
    }

    /* renamed from: rw */
    public final C16856i mo43990rw() {
        return this.f47160i;
    }

    /* renamed from: sw */
    public C1644x mo43985L0() {
        return this.f47163l;
    }

    /* renamed from: tw */
    public C1644x mo43987h4() {
        return this.f47164m;
    }

    /* renamed from: uw */
    public final C16857j mo43993uw() {
        return this.f47161j;
    }

    /* renamed from: vw */
    public String mo43994vw() {
        return this.f47156e ? "lastMinute" : "allCategories";
    }
}
