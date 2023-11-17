package p341ge.bog.mobilebank.autoliabilityinsurance.presentation.providerlist;

import androidx.lifecycle.C1644x;
import b41.C31128a;
import c41.C31270e;
import ed1.C40749p;
import ed1.C40754t;
import ee1.C40765a;
import ee1.C40767b;
import g91.C32343x;
import hd1.C41204a;
import hd1.C41205b;
import he1.C41224m;
import he1.C41238w;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.C41535k;
import kotlin.jvm.internal.C41536l;
import kotlin.jvm.internal.C41537m;
import kotlin.jvm.internal.DefaultConstructorMarker;
import p341ge.bog.mobilebank.cleanarch.presentation.common.C21481a;
import p367bl.C10332a;
import p535nk.C17019b;
import p535nk.C17028j;
import p535nk.C17045w;
import p563pk.C17378h;
import p700zk.C19040b;
import p700zk.C19041c;
import p700zk.C19042d;
import p700zk.C19043e;
import p700zk.C19044f;
import p700zk.C19045g;
import p700zk.C19046h;
import p700zk.C19047i;
import p700zk.C19048j;
import p700zk.C19049k;
import p700zk.C19050l;
import p700zk.C19051m;
import p700zk.C19052n;
import p700zk.C19053o;
import p700zk.C19054p;
import p700zk.C19055q;
import p700zk.C19056r;
import p700zk.C19057s;
import p700zk.C19058t;
import p700zk.C19059u;
import ue1.C43075l;
import ue1.C43079p;

/* renamed from: ge.bog.mobilebank.autoliabilityinsurance.presentation.providerlist.InsuranceProviderListViewModel$ViewModel */
public final class InsuranceProviderListViewModel$ViewModel extends C21481a implements C19040b, C19041c {

    /* renamed from: d */
    private final C17045w f40880d;

    /* renamed from: e */
    private final C19040b f40881e = this;

    /* renamed from: f */
    private final C19041c f40882f = this;

    /* renamed from: g */
    private final C1644x f40883g = new C1644x();

    /* renamed from: h */
    private final C1644x f40884h = new C1644x();

    /* renamed from: i */
    private final C1644x f40885i = new C1644x();

    /* renamed from: j */
    private final C40765a f40886j;

    /* renamed from: ge.bog.mobilebank.autoliabilityinsurance.presentation.providerlist.InsuranceProviderListViewModel$ViewModel$a */
    static final class C13697a extends C41537m implements C43075l {

        /* renamed from: d */
        public static final C13697a f40887d = new C13697a();

        C13697a() {
            super(1);
        }

        /* renamed from: a */
        public final Boolean invoke(C31128a aVar) {
            C41536l.m120489i(aVar, "it");
            return Boolean.valueOf(aVar instanceof C31128a.C31129a);
        }
    }

    /* renamed from: ge.bog.mobilebank.autoliabilityinsurance.presentation.providerlist.InsuranceProviderListViewModel$ViewModel$b */
    static final class C13698b extends C41537m implements C43079p {

        /* renamed from: d */
        public static final C13698b f40888d = new C13698b();

        C13698b() {
            super(2);
        }

        /* renamed from: a */
        public final C31128a invoke(C31128a aVar, List list) {
            C31128a aVar2;
            C41536l.m120489i(aVar, "p");
            C41536l.m120489i(list, "c");
            try {
                if (aVar instanceof C31128a.C31131c) {
                    List list2 = (List) ((C31128a.C31131c) aVar).mo71340a();
                    if (list2 == null) {
                        list2 = C41341q.m119907j();
                    }
                    return new C31128a.C31131c(new C41224m(list, list2), aVar.mo71341b());
                }
                if (aVar instanceof C31128a.C31129a) {
                    Throwable c = ((C31128a.C31129a) aVar).mo71342c();
                    int b = aVar.mo71341b();
                    List list3 = (List) aVar.mo71340a();
                    if (list3 == null) {
                        list3 = C41341q.m119907j();
                    }
                    aVar2 = new C31128a.C31129a(c, b, new C41224m(list, list3));
                } else if (aVar instanceof C31128a.C31130b) {
                    int b2 = aVar.mo71341b();
                    List list4 = (List) aVar.mo71340a();
                    if (list4 == null) {
                        list4 = C41341q.m119907j();
                    }
                    aVar2 = new C31128a.C31130b(b2, new C41224m(list, list4));
                } else {
                    throw new NoWhenBranchMatchedException();
                }
                return aVar2;
            } catch (Throwable th) {
                return new C31128a.C31129a(th, aVar.mo71341b(), (Object) null, 4, (DefaultConstructorMarker) null);
            }
        }
    }

    /* renamed from: ge.bog.mobilebank.autoliabilityinsurance.presentation.providerlist.InsuranceProviderListViewModel$ViewModel$c */
    /* synthetic */ class C13699c extends C41535k implements C43075l {
        C13699c(Object obj) {
            super(1, obj, C10332a.class, "convert", "convert(Lge/bog/mobilebank/shared/requestedresult/RequestedResult;)Ljava/util/List;", 0);
        }

        /* renamed from: b */
        public final List invoke(C31128a aVar) {
            C41536l.m120489i(aVar, "p0");
            return ((C10332a) this.receiver).mo26928c(aVar);
        }
    }

    /* renamed from: ge.bog.mobilebank.autoliabilityinsurance.presentation.providerlist.InsuranceProviderListViewModel$ViewModel$d */
    static final class C13700d extends C41537m implements C43075l {

        /* renamed from: d */
        final /* synthetic */ InsuranceProviderListViewModel$ViewModel f40889d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C13700d(InsuranceProviderListViewModel$ViewModel insuranceProviderListViewModel$ViewModel) {
            super(1);
            this.f40889d = insuranceProviderListViewModel$ViewModel;
        }

        /* renamed from: a */
        public final void mo37597a(List list) {
            this.f40889d.mo37585Ij().mo4826r(list);
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            mo37597a((List) obj);
            return C41238w.f97225a;
        }
    }

    /* renamed from: ge.bog.mobilebank.autoliabilityinsurance.presentation.providerlist.InsuranceProviderListViewModel$ViewModel$e */
    static final class C13701e extends C41537m implements C43075l {

        /* renamed from: d */
        final /* synthetic */ InsuranceProviderListViewModel$ViewModel f40890d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C13701e(InsuranceProviderListViewModel$ViewModel insuranceProviderListViewModel$ViewModel) {
            super(1);
            this.f40890d = insuranceProviderListViewModel$ViewModel;
        }

        /* renamed from: a */
        public final void mo37598a(Integer num) {
            this.f40890d.mo37592fj().mo4823o(num);
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            mo37598a((Integer) obj);
            return C41238w.f97225a;
        }
    }

    /* renamed from: ge.bog.mobilebank.autoliabilityinsurance.presentation.providerlist.InsuranceProviderListViewModel$ViewModel$f */
    static final class C13702f extends C41537m implements C43075l {

        /* renamed from: d */
        public static final C13702f f40891d = new C13702f();

        C13702f() {
            super(1);
        }

        /* renamed from: a */
        public final List invoke(C31128a.C31131c cVar) {
            C41536l.m120489i(cVar, "it");
            Object a = cVar.mo71340a();
            C41536l.m120487g(a, "null cannot be cast to non-null type kotlin.Pair<ge.bog.mobilebank.autoliabilityinsurance.domain.model.LimitType, kotlin.collections.List<ge.bog.mobilebank.autoliabilityinsurance.domain.model.AutoLiabilityInsuranceProvider>>");
            return ((C17378h) ((C41224m) a).mo95678e()).mo44862a();
        }
    }

    /* renamed from: ge.bog.mobilebank.autoliabilityinsurance.presentation.providerlist.InsuranceProviderListViewModel$ViewModel$g */
    static final class C13703g extends C41537m implements C43075l {

        /* renamed from: d */
        final /* synthetic */ C17028j f40892d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C13703g(C17028j jVar) {
            super(1);
            this.f40892d = jVar;
        }

        /* renamed from: a */
        public final C40754t invoke(Integer num) {
            C41536l.m120489i(num, "it");
            C40749p O = this.f40892d.mo44221c().mo95075O();
            C41536l.m120488h(O, "getLimitAndProvidersUseCase().toObservable()");
            return C31270e.m92879h(O, num.intValue());
        }
    }

    /* renamed from: ge.bog.mobilebank.autoliabilityinsurance.presentation.providerlist.InsuranceProviderListViewModel$ViewModel$h */
    static final class C13704h extends C41537m implements C43075l {

        /* renamed from: d */
        public static final C13704h f40893d = new C13704h();

        C13704h() {
            super(1);
        }

        /* renamed from: a */
        public final C41224m invoke(String str) {
            C41536l.m120489i(str, "it");
            return new C41224m(6, str);
        }
    }

    /* renamed from: ge.bog.mobilebank.autoliabilityinsurance.presentation.providerlist.InsuranceProviderListViewModel$ViewModel$i */
    /* synthetic */ class C13705i extends C41535k implements C43079p {

        /* renamed from: d */
        public static final C13705i f40894d = new C13705i();

        C13705i() {
            super(2, C41224m.class, "<init>", "<init>(Ljava/lang/Object;Ljava/lang/Object;)V", 0);
        }

        /* renamed from: b */
        public final C41224m invoke(Integer num, String str) {
            C41536l.m120489i(num, "p0");
            return new C41224m(num, str);
        }
    }

    /* renamed from: ge.bog.mobilebank.autoliabilityinsurance.presentation.providerlist.InsuranceProviderListViewModel$ViewModel$j */
    static final class C13706j extends C41537m implements C43075l {

        /* renamed from: d */
        final /* synthetic */ C17019b f40895d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C13706j(C17019b bVar) {
            super(1);
            this.f40895d = bVar;
        }

        /* renamed from: a */
        public final C40754t invoke(C41224m mVar) {
            C41536l.m120489i(mVar, "<name for destructuring parameter 0>");
            int intValue = ((Number) mVar.mo95675a()).intValue();
            String str = (String) mVar.mo95676b();
            C17019b bVar = this.f40895d;
            C41536l.m120488h(str, "ccy");
            C40749p O = bVar.mo44215a(str).mo95075O();
            C41536l.m120488h(O, "getProviders(ccy).toObservable()");
            return C31270e.m92879h(O, intValue);
        }
    }

    /* renamed from: ge.bog.mobilebank.autoliabilityinsurance.presentation.providerlist.InsuranceProviderListViewModel$ViewModel$k */
    static final class C13707k extends C41537m implements C43075l {

        /* renamed from: d */
        public static final C13707k f40896d = new C13707k();

        C13707k() {
            super(1);
        }

        /* renamed from: a */
        public final C31128a invoke(C31128a aVar) {
            C41536l.m120489i(aVar, "result");
            try {
                if (aVar instanceof C31128a.C31131c) {
                    C41224m mVar = (C41224m) ((C31128a.C31131c) aVar).mo71340a();
                    return new C31128a.C31131c(new C41224m(((C17378h) mVar.mo95675a()).mo44862a(), (List) mVar.mo95676b()), aVar.mo71341b());
                } else if (aVar instanceof C31128a.C31129a) {
                    return new C31128a.C31129a(((C31128a.C31129a) aVar).mo71342c(), aVar.mo71341b(), (Object) null, 4, (DefaultConstructorMarker) null);
                } else {
                    if (aVar instanceof C31128a.C31130b) {
                        return new C31128a.C31130b(aVar.mo71341b(), (Object) null, 2, (DefaultConstructorMarker) null);
                    }
                    throw new NoWhenBranchMatchedException();
                }
            } catch (Throwable th) {
                return new C31128a.C31129a(th, aVar.mo71341b(), (Object) null, 4, (DefaultConstructorMarker) null);
            }
        }
    }

    /* renamed from: ge.bog.mobilebank.autoliabilityinsurance.presentation.providerlist.InsuranceProviderListViewModel$ViewModel$l */
    /* synthetic */ class C13708l extends C41535k implements C43079p {

        /* renamed from: d */
        public static final C13708l f40897d = new C13708l();

        C13708l() {
            super(2, C41224m.class, "<init>", "<init>(Ljava/lang/Object;Ljava/lang/Object;)V", 0);
        }

        /* renamed from: b */
        public final C41224m invoke(Integer num, Boolean bool) {
            C41536l.m120489i(num, "p0");
            return new C41224m(num, bool);
        }
    }

    /* renamed from: ge.bog.mobilebank.autoliabilityinsurance.presentation.providerlist.InsuranceProviderListViewModel$ViewModel$m */
    static final class C13709m extends C41537m implements C43075l {

        /* renamed from: d */
        public static final C13709m f40898d = new C13709m();

        C13709m() {
            super(1);
        }

        /* renamed from: a */
        public final Boolean invoke(C41224m mVar) {
            C41536l.m120489i(mVar, "<name for destructuring parameter 0>");
            Boolean bool = (Boolean) mVar.mo95676b();
            C41536l.m120488h(bool, "limitsLoadFailed");
            return bool;
        }
    }

    /* renamed from: ge.bog.mobilebank.autoliabilityinsurance.presentation.providerlist.InsuranceProviderListViewModel$ViewModel$n */
    static final class C13710n extends C41537m implements C43075l {

        /* renamed from: d */
        public static final C13710n f40899d = new C13710n();

        C13710n() {
            super(1);
        }

        /* renamed from: a */
        public final Integer invoke(C41224m mVar) {
            C41536l.m120489i(mVar, "<name for destructuring parameter 0>");
            return (Integer) mVar.mo95675a();
        }
    }

    /* renamed from: ge.bog.mobilebank.autoliabilityinsurance.presentation.providerlist.InsuranceProviderListViewModel$ViewModel$o */
    /* synthetic */ class C13711o extends C41535k implements C43079p {

        /* renamed from: d */
        public static final C13711o f40900d = new C13711o();

        C13711o() {
            super(2, C41224m.class, "<init>", "<init>(Ljava/lang/Object;Ljava/lang/Object;)V", 0);
        }

        /* renamed from: b */
        public final C41224m invoke(Integer num, Boolean bool) {
            C41536l.m120489i(num, "p0");
            return new C41224m(num, bool);
        }
    }

    /* renamed from: ge.bog.mobilebank.autoliabilityinsurance.presentation.providerlist.InsuranceProviderListViewModel$ViewModel$p */
    static final class C13712p extends C41537m implements C43075l {

        /* renamed from: d */
        public static final C13712p f40901d = new C13712p();

        C13712p() {
            super(1);
        }

        /* renamed from: a */
        public final Boolean invoke(C41224m mVar) {
            C41536l.m120489i(mVar, "<name for destructuring parameter 0>");
            return Boolean.valueOf(!((Boolean) mVar.mo95676b()).booleanValue());
        }
    }

    /* renamed from: ge.bog.mobilebank.autoliabilityinsurance.presentation.providerlist.InsuranceProviderListViewModel$ViewModel$q */
    static final class C13713q extends C41537m implements C43075l {

        /* renamed from: d */
        public static final C13713q f40902d = new C13713q();

        C13713q() {
            super(1);
        }

        /* renamed from: a */
        public final Integer invoke(C41224m mVar) {
            C41536l.m120489i(mVar, "<name for destructuring parameter 0>");
            return (Integer) mVar.mo95675a();
        }
    }

    /* renamed from: ge.bog.mobilebank.autoliabilityinsurance.presentation.providerlist.InsuranceProviderListViewModel$ViewModel$r */
    static final class C13714r extends C41537m implements C43079p {

        /* renamed from: d */
        public static final C13714r f40903d = new C13714r();

        C13714r() {
            super(2);
        }

        /* renamed from: a */
        public final String invoke(Integer num, List list) {
            C41536l.m120489i(num, "index");
            C41536l.m120489i(list, "ccyList");
            return (String) list.get(num.intValue());
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public InsuranceProviderListViewModel$ViewModel(C17019b bVar, C17028j jVar, C10332a aVar, C17045w wVar) {
        super((C41204a) null, 1, (DefaultConstructorMarker) null);
        C41536l.m120489i(bVar, "getProviders");
        C41536l.m120489i(jVar, "getLimitAndProvidersUseCase");
        C41536l.m120489i(aVar, "providersUiStateMapper");
        C41536l.m120489i(wVar, "onProviderSelected");
        this.f40880d = wVar;
        C40765a i1 = C40765a.m118199i1(0);
        C41536l.m120488h(i1, "createDefault(0)");
        this.f40886j = i1;
        C40767b h1 = C40767b.m118210h1();
        C41536l.m120488h(h1, "create<Boolean>()");
        C40749p l1 = C40749p.m118047l0(onRefresh().mo95014Y0(h1, new C19042d(C13708l.f40897d)).mo94990M(new C19059u(C13709m.f40898d)).mo95026k0(new C19043e(C13710n.f40899d)), onInit()).mo94989L0(new C19044f(new C13703g(jVar))).mo95042x0(1).mo102095l1();
        C41536l.m120488h(l1, "merge(\n                r…   }.replay(1).refCount()");
        l1.mo95026k0(new C19045g(C13697a.f40887d)).mo95016c(h1);
        C40749p k0 = l1.mo95030q0(C31128a.C31131c.class).mo95026k0(new C19046h(C13702f.f40891d));
        C40749p k02 = onRefresh().mo95014Y0(h1, new C19047i(C13711o.f40900d)).mo94990M(new C19048j(C13712p.f40901d)).mo95026k0(new C19049k(C13713q.f40902d));
        C40749p Y0 = i1.mo95014Y0(k0, new C19050l(C13714r.f40903d));
        C40749p A0 = C40749p.m118047l0(Y0.mo95026k0(new C19051m(C13704h.f40893d)), k02.mo95014Y0(Y0, new C19052n(C13705i.f40894d))).mo94989L0(new C19053o(new C13706j(bVar))).mo94972A0();
        C40749p k03 = C40749p.m118047l0(A0.mo95014Y0(k0, new C19055q(C13698b.f40888d)), l1.mo95026k0(new C19054p(C13707k.f40896d))).mo95026k0(new C19056r(new C13699c(aVar)));
        C41536l.m120488h(k03, "merge(\n                p…rsUiStateMapper::convert)");
        C41205b F0 = C32343x.m95413R0(k03).mo94981F0(new C19057s(new C13700d(this)));
        C41536l.m120488h(F0, "merge(\n                p…ue = it\n                }");
        bindToLifecycle(F0);
        C41205b F02 = i1.mo94981F0(new C19058t(new C13701e(this)));
        C41536l.m120488h(F02, "selectedCcyIndex.subscri…stValue(it)\n            }");
        bindToLifecycle(F02);
    }

    /* access modifiers changed from: private */
    /* renamed from: Aw */
    public static final C31128a m51206Aw(C43079p pVar, Object obj, Object obj2) {
        C41536l.m120489i(pVar, "$tmp0");
        return (C31128a) pVar.invoke(obj, obj2);
    }

    /* access modifiers changed from: private */
    /* renamed from: Bw */
    public static final List m51207Bw(C43075l lVar, Object obj) {
        C41536l.m120489i(lVar, "$tmp0");
        return (List) lVar.invoke(obj);
    }

    /* access modifiers changed from: private */
    /* renamed from: Cw */
    public static final void m51208Cw(C43075l lVar, Object obj) {
        C41536l.m120489i(lVar, "$tmp0");
        lVar.invoke(obj);
    }

    /* access modifiers changed from: private */
    /* renamed from: Dw */
    public static final void m51209Dw(C43075l lVar, Object obj) {
        C41536l.m120489i(lVar, "$tmp0");
        lVar.invoke(obj);
    }

    /* access modifiers changed from: private */
    /* renamed from: Ew */
    public static final Integer m51210Ew(C43075l lVar, Object obj) {
        C41536l.m120489i(lVar, "$tmp0");
        return (Integer) lVar.invoke(obj);
    }

    /* access modifiers changed from: private */
    /* renamed from: Fw */
    public static final C40754t m51211Fw(C43075l lVar, Object obj) {
        C41536l.m120489i(lVar, "$tmp0");
        return (C40754t) lVar.invoke(obj);
    }

    /* access modifiers changed from: private */
    /* renamed from: Gw */
    public static final Boolean m51212Gw(C43075l lVar, Object obj) {
        C41536l.m120489i(lVar, "$tmp0");
        return (Boolean) lVar.invoke(obj);
    }

    /* access modifiers changed from: private */
    /* renamed from: Hw */
    public static final List m51213Hw(C43075l lVar, Object obj) {
        C41536l.m120489i(lVar, "$tmp0");
        return (List) lVar.invoke(obj);
    }

    /* access modifiers changed from: private */
    /* renamed from: Iw */
    public static final C41224m m51214Iw(C43079p pVar, Object obj, Object obj2) {
        C41536l.m120489i(pVar, "$tmp0");
        return (C41224m) pVar.invoke(obj, obj2);
    }

    /* access modifiers changed from: private */
    /* renamed from: Jw */
    public static final boolean m51215Jw(C43075l lVar, Object obj) {
        C41536l.m120489i(lVar, "$tmp0");
        return ((Boolean) lVar.invoke(obj)).booleanValue();
    }

    /* access modifiers changed from: private */
    /* renamed from: Kw */
    public static final Integer m51216Kw(C43075l lVar, Object obj) {
        C41536l.m120489i(lVar, "$tmp0");
        return (Integer) lVar.invoke(obj);
    }

    /* access modifiers changed from: private */
    /* renamed from: Lw */
    public static final String m51217Lw(C43079p pVar, Object obj, Object obj2) {
        C41536l.m120489i(pVar, "$tmp0");
        return (String) pVar.invoke(obj, obj2);
    }

    /* access modifiers changed from: private */
    public static final boolean _init_$lambda$1(C43075l lVar, Object obj) {
        C41536l.m120489i(lVar, "$tmp0");
        return ((Boolean) lVar.invoke(obj)).booleanValue();
    }

    /* access modifiers changed from: private */
    /* renamed from: vw */
    public static final C41224m m51236vw(C43079p pVar, Object obj, Object obj2) {
        C41536l.m120489i(pVar, "$tmp0");
        return (C41224m) pVar.invoke(obj, obj2);
    }

    /* access modifiers changed from: private */
    /* renamed from: ww */
    public static final C41224m m51237ww(C43075l lVar, Object obj) {
        C41536l.m120489i(lVar, "$tmp0");
        return (C41224m) lVar.invoke(obj);
    }

    /* access modifiers changed from: private */
    /* renamed from: xw */
    public static final C41224m m51238xw(C43079p pVar, Object obj, Object obj2) {
        C41536l.m120489i(pVar, "$tmp0");
        return (C41224m) pVar.invoke(obj, obj2);
    }

    /* access modifiers changed from: private */
    /* renamed from: yw */
    public static final C40754t m51239yw(C43075l lVar, Object obj) {
        C41536l.m120489i(lVar, "$tmp0");
        return (C40754t) lVar.invoke(obj);
    }

    /* access modifiers changed from: private */
    /* renamed from: zw */
    public static final C31128a m51240zw(C43075l lVar, Object obj) {
        C41536l.m120489i(lVar, "$tmp0");
        return (C31128a) lVar.invoke(obj);
    }

    /* renamed from: J3 */
    public void mo37586J3() {
        onRefresh(6);
    }

    /* renamed from: Mw */
    public C1644x mo37584Fe() {
        return this.f40883g;
    }

    /* renamed from: Nw */
    public final C19041c mo37588Nw() {
        return this.f40882f;
    }

    /* renamed from: Ou */
    public void mo37589Ou(int i) {
        this.f40880d.mo44236a(i);
        mo37584Fe().mo4826r(C32343x.m95466m(C41238w.f97225a));
    }

    /* renamed from: Ow */
    public C1644x mo37585Ij() {
        return this.f40884h;
    }

    /* renamed from: Pw */
    public C1644x mo37592fj() {
        return this.f40885i;
    }

    /* renamed from: y */
    public void mo37593y(int i) {
        this.f40886j.onNext(Integer.valueOf(i));
    }
}
