package p341ge.bog.mobilebank.lifestyleoffers.presentation.chooser;

import androidx.lifecycle.C1644x;
import b41.C31128a;
import b41.C31132b;
import c41.C31270e;
import ed1.C40749p;
import ed1.C40754t;
import ed1.C40762x;
import ee1.C40767b;
import eo0.C12796l;
import eo0.C12797m;
import eo0.C12798n;
import eo0.C12799o;
import eo0.C12800p;
import eo0.C12801q;
import eo0.C12802r;
import eo0.C12803s;
import eo0.C12804t;
import eo0.C12805u;
import g91.C32343x;
import gd1.C40992a;
import hd1.C41204a;
import hd1.C41205b;
import he1.C41224m;
import he1.C41232r;
import he1.C41238w;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.jvm.internal.C41536l;
import kotlin.jvm.internal.C41537m;
import kotlin.jvm.internal.DefaultConstructorMarker;
import p341ge.bog.mobilebank.cleanarch.presentation.common.C21481a;
import p341ge.bog.mobilebank.lifestyleoffers.domain.model.LifestyleChooserInterestSubType;
import p341ge.bog.mobilebank.lifestyleoffers.domain.model.LifestyleChooserInterestType;
import p341ge.bog.mobilebank.lifestyleoffers.domain.model.LifestyleClientInterest;
import p341ge.bog.mobilebank.shared.chooser.presentation.model.ChooserItem;
import ue1.C43075l;
import ue1.C43079p;
import ue1.C43080q;
import zn0.C19086a;
import zn0.C19087b;
import zn0.C19098j;
import zn0.C19099k;

/* renamed from: ge.bog.mobilebank.lifestyleoffers.presentation.chooser.LifestyleChooserViewModel$ViewModel */
public final class LifestyleChooserViewModel$ViewModel extends C21481a implements C12796l, C12797m {
    /* access modifiers changed from: private */

    /* renamed from: d */
    public final C19098j f43160d;
    /* access modifiers changed from: private */

    /* renamed from: e */
    public final C19099k f43161e;
    /* access modifiers changed from: private */

    /* renamed from: f */
    public final C19086a f43162f;
    /* access modifiers changed from: private */

    /* renamed from: g */
    public final C19087b f43163g;

    /* renamed from: h */
    private final C12796l f43164h = this;

    /* renamed from: i */
    private final C12797m f43165i = this;

    /* renamed from: j */
    private final C1644x f43166j = new C1644x();

    /* renamed from: k */
    private final C1644x f43167k = new C1644x();

    /* renamed from: l */
    private final C1644x f43168l = new C1644x();

    /* renamed from: m */
    private final C1644x f43169m = new C1644x();

    /* renamed from: n */
    private final C1644x f43170n = new C1644x();

    /* renamed from: o */
    private final C1644x f43171o = new C1644x();

    /* renamed from: p */
    private final C1644x f43172p = new C1644x(0);
    /* access modifiers changed from: private */

    /* renamed from: q */
    public final C40767b f43173q;

    /* renamed from: r */
    private final C40767b f43174r;
    /* access modifiers changed from: private */

    /* renamed from: s */
    public final C40767b f43175s;

    /* renamed from: t */
    private final Set f43176t;
    /* access modifiers changed from: private */

    /* renamed from: u */
    public List f43177u;
    /* access modifiers changed from: private */

    /* renamed from: v */
    public final Map f43178v;

    /* renamed from: w */
    private String f43179w;

    /* renamed from: ge.bog.mobilebank.lifestyleoffers.presentation.chooser.LifestyleChooserViewModel$ViewModel$a */
    static final class C14972a extends C41537m implements C43075l {

        /* renamed from: d */
        final /* synthetic */ LifestyleChooserViewModel$ViewModel f43180d;

        /* renamed from: ge.bog.mobilebank.lifestyleoffers.presentation.chooser.LifestyleChooserViewModel$ViewModel$a$a */
        static final class C14973a extends C41537m implements C43079p {

            /* renamed from: d */
            public static final C14973a f43181d = new C14973a();

            C14973a() {
                super(2);
            }

            /* renamed from: a */
            public final C41224m invoke(List list, List list2) {
                C41536l.m120489i(list, "interestTypes");
                C41536l.m120489i(list2, "clientInterests");
                return new C41224m(list, list2);
            }
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C14972a(LifestyleChooserViewModel$ViewModel lifestyleChooserViewModel$ViewModel) {
            super(1);
            this.f43180d = lifestyleChooserViewModel$ViewModel;
        }

        /* access modifiers changed from: private */
        /* renamed from: c */
        public static final C41224m m54938c(C43079p pVar, Object obj, Object obj2) {
            C41536l.m120489i(pVar, "$tmp0");
            return (C41224m) pVar.invoke(obj, obj2);
        }

        /* renamed from: b */
        public final C40754t invoke(Integer num) {
            C41536l.m120489i(num, "it");
            C40749p O = C40762x.m118154T(this.f43180d.f43160d.mo47299a(), this.f43180d.f43161e.mo47300a(), new C14990b(C14973a.f43181d)).mo95075O();
            C41536l.m120488h(O, "zip(\n                   …          .toObservable()");
            return C31270e.m92879h(O, 1);
        }
    }

    /* renamed from: ge.bog.mobilebank.lifestyleoffers.presentation.chooser.LifestyleChooserViewModel$ViewModel$b */
    static final class C14974b extends C41537m implements C43075l {

        /* renamed from: d */
        final /* synthetic */ LifestyleChooserViewModel$ViewModel f43182d;

        /* renamed from: ge.bog.mobilebank.lifestyleoffers.presentation.chooser.LifestyleChooserViewModel$ViewModel$b$a */
        static final class C14975a extends C41537m implements C43075l {

            /* renamed from: d */
            final /* synthetic */ LifestyleChooserViewModel$ViewModel f43183d;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            C14975a(LifestyleChooserViewModel$ViewModel lifestyleChooserViewModel$ViewModel) {
                super(1);
                this.f43183d = lifestyleChooserViewModel$ViewModel;
            }

            /* renamed from: a */
            public final void mo41919a(C41224m mVar) {
                this.f43183d.m54884Ew((List) mVar.mo95680f());
                this.f43183d.m54885Fw((List) mVar.mo95678e());
                LifestyleChooserViewModel$ViewModel lifestyleChooserViewModel$ViewModel = this.f43183d;
                Object f = mVar.mo95680f();
                C41536l.m120488h(f, "data.second");
                lifestyleChooserViewModel$ViewModel.f43177u = C41358y.m119991B0((Collection) f);
                this.f43183d.mo33453L3().mo4826r(this.f43183d.m54892Ww((List) mVar.mo95678e()));
            }

            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                mo41919a((C41224m) obj);
                return C41238w.f97225a;
            }
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C14974b(LifestyleChooserViewModel$ViewModel lifestyleChooserViewModel$ViewModel) {
            super(1);
            this.f43182d = lifestyleChooserViewModel$ViewModel;
        }

        /* renamed from: a */
        public final void mo41918a(C31128a aVar) {
            this.f43182d.mo33456Zq().mo4823o(aVar);
            C41536l.m120488h(aVar, "result");
            C31132b.m92648j(aVar, (int[]) null, new C14975a(this.f43182d), 1, (Object) null);
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            mo41918a((C31128a) obj);
            return C41238w.f97225a;
        }
    }

    /* renamed from: ge.bog.mobilebank.lifestyleoffers.presentation.chooser.LifestyleChooserViewModel$ViewModel$c */
    static final class C14976c extends C41537m implements C43075l {

        /* renamed from: d */
        final /* synthetic */ LifestyleChooserViewModel$ViewModel f43184d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C14976c(LifestyleChooserViewModel$ViewModel lifestyleChooserViewModel$ViewModel) {
            super(1);
            this.f43184d = lifestyleChooserViewModel$ViewModel;
        }

        /* renamed from: a */
        public final C40754t invoke(C41238w wVar) {
            C41536l.m120489i(wVar, "it");
            C40749p O = this.f43184d.f43161e.mo47300a().mo95075O();
            C41536l.m120488h(O, "getLifestyleClientIntere…          .toObservable()");
            return C31270e.m92879h(O, 1);
        }
    }

    /* renamed from: ge.bog.mobilebank.lifestyleoffers.presentation.chooser.LifestyleChooserViewModel$ViewModel$d */
    static final class C14977d extends C41537m implements C43075l {

        /* renamed from: d */
        final /* synthetic */ LifestyleChooserViewModel$ViewModel f43185d;

        /* renamed from: ge.bog.mobilebank.lifestyleoffers.presentation.chooser.LifestyleChooserViewModel$ViewModel$d$a */
        static final class C14978a extends C41537m implements C43075l {

            /* renamed from: d */
            final /* synthetic */ LifestyleChooserViewModel$ViewModel f43186d;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            C14978a(LifestyleChooserViewModel$ViewModel lifestyleChooserViewModel$ViewModel) {
                super(1);
                this.f43186d = lifestyleChooserViewModel$ViewModel;
            }

            /* renamed from: a */
            public final void mo41922a(List list) {
                this.f43186d.m54884Ew(list);
                this.f43186d.m54893Xw();
                LifestyleChooserViewModel$ViewModel lifestyleChooserViewModel$ViewModel = this.f43186d;
                C41536l.m120488h(list, "result");
                lifestyleChooserViewModel$ViewModel.f43177u = C41358y.m119991B0(list);
                C1644x Lw = this.f43186d.mo33453L3();
                LifestyleChooserViewModel$ViewModel lifestyleChooserViewModel$ViewModel2 = this.f43186d;
                Lw.mo4826r(lifestyleChooserViewModel$ViewModel2.m54892Ww(C41358y.m120036z0(lifestyleChooserViewModel$ViewModel2.f43178v.values())));
            }

            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                mo41922a((List) obj);
                return C41238w.f97225a;
            }
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C14977d(LifestyleChooserViewModel$ViewModel lifestyleChooserViewModel$ViewModel) {
            super(1);
            this.f43185d = lifestyleChooserViewModel$ViewModel;
        }

        /* renamed from: a */
        public final void mo41921a(C31128a aVar) {
            this.f43185d.mo33458vk().mo4823o(aVar);
            C41536l.m120488h(aVar, "data");
            C31132b.m92648j(aVar, (int[]) null, new C14978a(this.f43185d), 1, (Object) null);
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            mo41921a((C31128a) obj);
            return C41238w.f97225a;
        }
    }

    /* renamed from: ge.bog.mobilebank.lifestyleoffers.presentation.chooser.LifestyleChooserViewModel$ViewModel$e */
    static final class C14979e extends C41537m implements C43075l {

        /* renamed from: d */
        final /* synthetic */ LifestyleChooserViewModel$ViewModel f43187d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C14979e(LifestyleChooserViewModel$ViewModel lifestyleChooserViewModel$ViewModel) {
            super(1);
            this.f43187d = lifestyleChooserViewModel$ViewModel;
        }

        /* renamed from: a */
        public final C40754t invoke(C41232r rVar) {
            C41536l.m120489i(rVar, "saveParams");
            C40749p O = this.f43187d.f43162f.mo47291a((String) rVar.mo95691d(), (List) rVar.mo95692e()).mo94893M(rVar.mo95694f()).mo95075O();
            C41536l.m120488h(O, "addLifestyleClientIntere…          .toObservable()");
            return C31270e.m92879h(O, 1);
        }
    }

    /* renamed from: ge.bog.mobilebank.lifestyleoffers.presentation.chooser.LifestyleChooserViewModel$ViewModel$f */
    static final class C14980f extends C41537m implements C43075l {

        /* renamed from: d */
        final /* synthetic */ LifestyleChooserViewModel$ViewModel f43188d;

        /* renamed from: ge.bog.mobilebank.lifestyleoffers.presentation.chooser.LifestyleChooserViewModel$ViewModel$f$a */
        static final class C14981a extends C41537m implements C43075l {

            /* renamed from: d */
            final /* synthetic */ LifestyleChooserViewModel$ViewModel f43189d;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            C14981a(LifestyleChooserViewModel$ViewModel lifestyleChooserViewModel$ViewModel) {
                super(1);
                this.f43189d = lifestyleChooserViewModel$ViewModel;
            }

            /* renamed from: a */
            public final void mo41925a(List list) {
                C41536l.m120488h(list, "idsToDelete");
                if (!list.isEmpty()) {
                    this.f43189d.f43175s.onNext(list);
                } else {
                    this.f43189d.f43173q.onNext(C41238w.f97225a);
                }
            }

            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                mo41925a((List) obj);
                return C41238w.f97225a;
            }
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C14980f(LifestyleChooserViewModel$ViewModel lifestyleChooserViewModel$ViewModel) {
            super(1);
            this.f43188d = lifestyleChooserViewModel$ViewModel;
        }

        /* renamed from: a */
        public final void mo41924a(C31128a aVar) {
            this.f43188d.mo33458vk().mo4823o(aVar);
            C41536l.m120488h(aVar, "data");
            C31132b.m92648j(aVar, (int[]) null, new C14981a(this.f43188d), 1, (Object) null);
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            mo41924a((C31128a) obj);
            return C41238w.f97225a;
        }
    }

    /* renamed from: ge.bog.mobilebank.lifestyleoffers.presentation.chooser.LifestyleChooserViewModel$ViewModel$g */
    static final class C14982g extends C41537m implements C43075l {

        /* renamed from: d */
        final /* synthetic */ LifestyleChooserViewModel$ViewModel f43190d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C14982g(LifestyleChooserViewModel$ViewModel lifestyleChooserViewModel$ViewModel) {
            super(1);
            this.f43190d = lifestyleChooserViewModel$ViewModel;
        }

        /* renamed from: a */
        public final C40754t invoke(List list) {
            C41536l.m120489i(list, "it");
            C40749p O = this.f43190d.f43163g.mo47292a(list).mo94893M(C41238w.f97225a).mo95075O();
            C41536l.m120488h(O, "deleteLifestyleClientInt…          .toObservable()");
            return C31270e.m92879h(O, 1);
        }
    }

    /* renamed from: ge.bog.mobilebank.lifestyleoffers.presentation.chooser.LifestyleChooserViewModel$ViewModel$h */
    static final class C14983h extends C41537m implements C43075l {

        /* renamed from: d */
        final /* synthetic */ LifestyleChooserViewModel$ViewModel f43191d;

        /* renamed from: ge.bog.mobilebank.lifestyleoffers.presentation.chooser.LifestyleChooserViewModel$ViewModel$h$a */
        static final class C14984a extends C41537m implements C43075l {

            /* renamed from: d */
            final /* synthetic */ LifestyleChooserViewModel$ViewModel f43192d;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            C14984a(LifestyleChooserViewModel$ViewModel lifestyleChooserViewModel$ViewModel) {
                super(1);
                this.f43192d = lifestyleChooserViewModel$ViewModel;
            }

            /* renamed from: a */
            public final void mo41928a(C41238w wVar) {
                this.f43192d.f43173q.onNext(C41238w.f97225a);
            }

            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                mo41928a((C41238w) obj);
                return C41238w.f97225a;
            }
        }

        /* renamed from: ge.bog.mobilebank.lifestyleoffers.presentation.chooser.LifestyleChooserViewModel$ViewModel$h$b */
        static final class C14985b extends C41537m implements C43075l {

            /* renamed from: d */
            final /* synthetic */ LifestyleChooserViewModel$ViewModel f43193d;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            C14985b(LifestyleChooserViewModel$ViewModel lifestyleChooserViewModel$ViewModel) {
                super(1);
                this.f43193d = lifestyleChooserViewModel$ViewModel;
            }

            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                invoke((Throwable) obj);
                return C41238w.f97225a;
            }

            public final void invoke(Throwable th) {
                C41536l.m120489i(th, "it");
                this.f43193d.f43173q.onNext(C41238w.f97225a);
            }
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C14983h(LifestyleChooserViewModel$ViewModel lifestyleChooserViewModel$ViewModel) {
            super(1);
            this.f43191d = lifestyleChooserViewModel$ViewModel;
        }

        /* renamed from: a */
        public final void mo41927a(C31128a aVar) {
            this.f43191d.mo33458vk().mo4823o(aVar);
            C41536l.m120488h(aVar, "data");
            C31132b.m92648j(aVar, (int[]) null, new C14984a(this.f43191d), 1, (Object) null);
            C31132b.m92643e(aVar, (int[]) null, new C14985b(this.f43191d), 1, (Object) null);
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            mo41927a((C31128a) obj);
            return C41238w.f97225a;
        }
    }

    /* renamed from: ge.bog.mobilebank.lifestyleoffers.presentation.chooser.LifestyleChooserViewModel$ViewModel$i */
    static final class C14986i extends C41537m implements C43075l {

        /* renamed from: d */
        public static final C14986i f43194d = new C14986i();

        C14986i() {
            super(1);
        }

        /* renamed from: a */
        public final CharSequence invoke(LifestyleChooserInterestSubType lifestyleChooserInterestSubType) {
            C41536l.m120489i(lifestyleChooserInterestSubType, "it");
            return lifestyleChooserInterestSubType.getSubTypeDesc();
        }
    }

    /* renamed from: ge.bog.mobilebank.lifestyleoffers.presentation.chooser.LifestyleChooserViewModel$ViewModel$j */
    static final class C14987j extends C41537m implements C43075l {

        /* renamed from: d */
        public static final C14987j f43195d = new C14987j();

        C14987j() {
            super(1);
        }

        /* renamed from: a */
        public final CharSequence invoke(LifestyleChooserInterestSubType lifestyleChooserInterestSubType) {
            C41536l.m120489i(lifestyleChooserInterestSubType, "it");
            return lifestyleChooserInterestSubType.getSubTypeDesc();
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public LifestyleChooserViewModel$ViewModel(C19098j jVar, C19099k kVar, C19086a aVar, C19087b bVar) {
        super((C41204a) null, 1, (DefaultConstructorMarker) null);
        C41536l.m120489i(jVar, "getLifestyleChooserInterestsUseCase");
        C41536l.m120489i(kVar, "getLifestyleClientInterestsUseCase");
        C41536l.m120489i(aVar, "addLifestyleClientInterestUseCase");
        C41536l.m120489i(bVar, "deleteLifestyleClientInterestsUseCase");
        this.f43160d = jVar;
        this.f43161e = kVar;
        this.f43162f = aVar;
        this.f43163g = bVar;
        C40767b h1 = C40767b.m118210h1();
        C41536l.m120488h(h1, "create<Unit>()");
        this.f43173q = h1;
        C40767b h12 = C40767b.m118210h1();
        C41536l.m120488h(h12, "create<Triple<String, List<String>, List<Long>>>()");
        this.f43174r = h12;
        C40767b h13 = C40767b.m118210h1();
        C41536l.m120488h(h13, "create<List<Long>>()");
        this.f43175s = h13;
        this.f43176t = new LinkedHashSet();
        this.f43177u = new ArrayList();
        this.f43178v = new LinkedHashMap();
        this.f43179w = "";
        C41205b F0 = C40749p.m118047l0(onInit(), onRefresh()).mo94989L0(new C12798n(new C14972a(this))).mo95027o0(C40992a.m118827a()).mo94981F0(new C12799o(new C14974b(this)));
        C41536l.m120488h(F0, "merge(\n                o…      }\n                }");
        bindToLifecycle(F0);
        C40749p L0 = h1.mo94989L0(new C12800p(new C14976c(this)));
        C41536l.m120488h(L0, "updateSavedInterestsSubj…le(RC_INIT)\n            }");
        C41205b F02 = C32343x.m95413R0(L0).mo94981F0(new C12801q(new C14977d(this)));
        C41536l.m120488h(F02, "updateSavedInterestsSubj…      }\n                }");
        bindToLifecycle(F02);
        C40749p L02 = h12.mo94989L0(new C12802r(new C14979e(this)));
        C41536l.m120488h(L02, "saveClientInterestsSubje…le(RC_INIT)\n            }");
        C41205b F03 = C32343x.m95413R0(L02).mo94981F0(new C12803s(new C14980f(this)));
        C41536l.m120488h(F03, "saveClientInterestsSubje…      }\n                }");
        bindToLifecycle(F03);
        C40749p L03 = h13.mo94989L0(new C12804t(new C14982g(this)));
        C41536l.m120488h(L03, "deleteClientInterestsSub…le(RC_INIT)\n            }");
        C41205b F04 = C32343x.m95413R0(L03).mo94981F0(new C12805u(new C14983h(this)));
        C41536l.m120488h(F04, "deleteClientInterestsSub…Unit) }\n                }");
        bindToLifecycle(F04);
    }

    /* access modifiers changed from: private */
    /* JADX WARNING: Code restructure failed: missing block: B:7:0x0030, code lost:
        if (r4 != null) goto L_0x0037;
     */
    /* renamed from: Ew */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void m54884Ew(java.util.List r4) {
        /*
            r3 = this;
            java.util.Set r0 = r3.f43176t
            r0.clear()
            java.util.Set r0 = r3.f43176t
            if (r4 == 0) goto L_0x0033
            java.util.ArrayList r1 = new java.util.ArrayList
            r2 = 10
            int r2 = ie1.C41343r.m119925u(r4, r2)
            r1.<init>(r2)
            java.util.Iterator r4 = r4.iterator()
        L_0x0018:
            boolean r2 = r4.hasNext()
            if (r2 == 0) goto L_0x002c
            java.lang.Object r2 = r4.next()
            ge.bog.mobilebank.lifestyleoffers.domain.model.LifestyleClientInterest r2 = (p341ge.bog.mobilebank.lifestyleoffers.domain.model.LifestyleClientInterest) r2
            java.lang.String r2 = r2.getInterestSubType()
            r1.add(r2)
            goto L_0x0018
        L_0x002c:
            java.util.Set r4 = ie1.C41358y.m119993D0(r1)
            if (r4 == 0) goto L_0x0033
            goto L_0x0037
        L_0x0033:
            java.util.Set r4 = ie1.C41357x0.m119985e()
        L_0x0037:
            r0.addAll(r4)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p341ge.bog.mobilebank.lifestyleoffers.presentation.chooser.LifestyleChooserViewModel$ViewModel.m54884Ew(java.util.List):void");
    }

    /* access modifiers changed from: private */
    /* JADX WARNING: Code restructure failed: missing block: B:7:0x0034, code lost:
        if (r5 == null) goto L_0x0036;
     */
    /* renamed from: Fw */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void m54885Fw(java.util.List r5) {
        /*
            r4 = this;
            java.util.Map r0 = r4.f43178v
            r0.clear()
            java.util.Map r0 = r4.f43178v
            if (r5 == 0) goto L_0x0036
            java.util.ArrayList r1 = new java.util.ArrayList
            r2 = 10
            int r2 = ie1.C41343r.m119925u(r5, r2)
            r1.<init>(r2)
            java.util.Iterator r5 = r5.iterator()
        L_0x0018:
            boolean r2 = r5.hasNext()
            if (r2 == 0) goto L_0x0030
            java.lang.Object r2 = r5.next()
            ge.bog.mobilebank.lifestyleoffers.domain.model.LifestyleChooserInterestType r2 = (p341ge.bog.mobilebank.lifestyleoffers.domain.model.LifestyleChooserInterestType) r2
            java.lang.String r3 = r2.getInterestType()
            he1.m r2 = he1.C41233s.m119492a(r3, r2)
            r1.add(r2)
            goto L_0x0018
        L_0x0030:
            java.util.Map r5 = ie1.C41344r0.m119939u(r1)
            if (r5 != 0) goto L_0x003a
        L_0x0036:
            java.util.Map r5 = ie1.C41344r0.m119928j()
        L_0x003a:
            r0.putAll(r5)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p341ge.bog.mobilebank.lifestyleoffers.presentation.chooser.LifestyleChooserViewModel$ViewModel.m54885Fw(java.util.List):void");
    }

    /* renamed from: Gw */
    private final Set m54886Gw(List list) {
        ArrayList<LifestyleChooserInterestSubType> arrayList = new ArrayList<>();
        for (Object next : list) {
            if (this.f43176t.contains(((LifestyleChooserInterestSubType) next).getInterestSubType())) {
                arrayList.add(next);
            }
        }
        ArrayList arrayList2 = new ArrayList(C41343r.m119925u(arrayList, 10));
        for (LifestyleChooserInterestSubType interestSubType : arrayList) {
            arrayList2.add(interestSubType.getInterestSubType());
        }
        return C41358y.m119993D0(arrayList2);
    }

    /* renamed from: Iw */
    private final int m54887Iw() {
        Map map = this.f43178v;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Map.Entry entry : map.entrySet()) {
            if (!m54886Gw(((LifestyleChooserInterestType) entry.getValue()).getInterestSubTypes()).isEmpty()) {
                linkedHashMap.put(entry.getKey(), entry.getValue());
            }
        }
        return linkedHashMap.size();
    }

    /* renamed from: Kw */
    private final List m54888Kw(Set set) {
        List list = this.f43177u;
        ArrayList<LifestyleClientInterest> arrayList = new ArrayList<>();
        for (Object next : list) {
            if (set.contains(((LifestyleClientInterest) next).getInterestSubType())) {
                arrayList.add(next);
            }
        }
        ArrayList arrayList2 = new ArrayList(C41343r.m119925u(arrayList, 10));
        for (LifestyleClientInterest id : arrayList) {
            arrayList2.add(Long.valueOf(id.getId()));
        }
        return arrayList2;
    }

    /* renamed from: Sw */
    private final String m54889Sw(List list, Set set) {
        if (!set.isEmpty()) {
            ArrayList arrayList = new ArrayList();
            for (Object next : list) {
                if (set.contains(((LifestyleChooserInterestSubType) next).getInterestSubType())) {
                    arrayList.add(next);
                }
            }
            return C41358y.m120017g0(arrayList, (CharSequence) null, (CharSequence) null, (CharSequence) null, 0, (CharSequence) null, C14986i.f43194d, 31, (Object) null);
        }
        return C41358y.m120017g0(list, (CharSequence) null, (CharSequence) null, (CharSequence) null, 0, (CharSequence) null, C14987j.f43195d, 31, (Object) null);
    }

    /* renamed from: Uw */
    private final void m54890Uw(LifestyleChooserInterestType lifestyleChooserInterestType) {
        C1644x Pw = mo33455Y9();
        String typeDesc = lifestyleChooserInterestType.getTypeDesc();
        List<LifestyleChooserInterestSubType> interestSubTypes = lifestyleChooserInterestType.getInterestSubTypes();
        ArrayList arrayList = new ArrayList(C41343r.m119925u(interestSubTypes, 10));
        for (LifestyleChooserInterestSubType lifestyleChooserInterestSubType : interestSubTypes) {
            String subTypeDesc = lifestyleChooserInterestSubType.getSubTypeDesc();
            boolean z = true;
            if (lifestyleChooserInterestType.getInterestSubTypes().size() != 1 && !this.f43176t.contains(lifestyleChooserInterestSubType.getInterestSubType())) {
                z = false;
            }
            arrayList.add(new ChooserItem(lifestyleChooserInterestSubType, (C43080q) null, subTypeDesc, z, false, 0, 50, (DefaultConstructorMarker) null));
        }
        Pw.mo4823o(C32343x.m95466m(new C41224m(typeDesc, arrayList)));
    }

    /* renamed from: Vw */
    private final void m54891Vw(String str, List list, List list2) {
        this.f43174r.onNext(new C41232r(str, list, list2));
    }

    /* access modifiers changed from: private */
    /* renamed from: Ww */
    public final List m54892Ww(List list) {
        boolean z;
        boolean z2;
        Integer num;
        List list2 = list;
        int Iw = m54887Iw();
        if (Iw >= 3) {
            z = true;
        } else {
            z = false;
        }
        if (z && ((num = (Integer) mo41906Hw().mo4814f()) == null || num.intValue() != 0)) {
            mo33457vf().mo4823o(C32343x.m95466m(C41238w.f97225a));
        }
        mo41906Hw().mo4823o(Integer.valueOf(Iw));
        if (list2 == null) {
            return C41341q.m119907j();
        }
        ArrayList arrayList = new ArrayList(C41343r.m119925u(list2, 10));
        Iterator it = list.iterator();
        while (it.hasNext()) {
            LifestyleChooserInterestType lifestyleChooserInterestType = (LifestyleChooserInterestType) it.next();
            Set Gw = m54886Gw(lifestyleChooserInterestType.getInterestSubTypes());
            boolean z3 = !Gw.isEmpty();
            if (z3 || !z) {
                z2 = true;
            } else {
                z2 = false;
            }
            lifestyleChooserInterestType.setEnabled(z2);
            lifestyleChooserInterestType.setChosen(z3);
            lifestyleChooserInterestType.setChosenInterests(Gw);
            lifestyleChooserInterestType.setSubtypesDescriptions(m54889Sw(lifestyleChooserInterestType.getInterestSubTypes(), Gw));
            arrayList.add(LifestyleChooserInterestType.copy$default(lifestyleChooserInterestType, (String) null, (String) null, 0, (String) null, (List) null, false, false, (Set) null, (String) null, 511, (Object) null));
        }
        return arrayList;
    }

    /* access modifiers changed from: private */
    /* renamed from: Xw */
    public final void m54893Xw() {
        for (LifestyleChooserInterestType lifestyleChooserInterestType : this.f43178v.values()) {
            lifestyleChooserInterestType.setChosenInterests(m54886Gw(lifestyleChooserInterestType.getInterestSubTypes()));
        }
    }

    /* access modifiers changed from: private */
    public static final void _init_$lambda$5(C43075l lVar, Object obj) {
        C41536l.m120489i(lVar, "$tmp0");
        lVar.invoke(obj);
    }

    /* access modifiers changed from: private */
    /* renamed from: lw */
    public static final C40754t m54902lw(C43075l lVar, Object obj) {
        C41536l.m120489i(lVar, "$tmp0");
        return (C40754t) lVar.invoke(obj);
    }

    /* access modifiers changed from: private */
    /* renamed from: mw */
    public static final void m54903mw(C43075l lVar, Object obj) {
        C41536l.m120489i(lVar, "$tmp0");
        lVar.invoke(obj);
    }

    /* access modifiers changed from: private */
    /* renamed from: nw */
    public static final C40754t m54904nw(C43075l lVar, Object obj) {
        C41536l.m120489i(lVar, "$tmp0");
        return (C40754t) lVar.invoke(obj);
    }

    /* access modifiers changed from: private */
    /* renamed from: ow */
    public static final void m54905ow(C43075l lVar, Object obj) {
        C41536l.m120489i(lVar, "$tmp0");
        lVar.invoke(obj);
    }

    /* access modifiers changed from: private */
    /* renamed from: pw */
    public static final C40754t m54906pw(C43075l lVar, Object obj) {
        C41536l.m120489i(lVar, "$tmp0");
        return (C40754t) lVar.invoke(obj);
    }

    /* access modifiers changed from: private */
    /* renamed from: qw */
    public static final C40754t m54907qw(C43075l lVar, Object obj) {
        C41536l.m120489i(lVar, "$tmp0");
        return (C40754t) lVar.invoke(obj);
    }

    /* access modifiers changed from: private */
    /* renamed from: rw */
    public static final void m54908rw(C43075l lVar, Object obj) {
        C41536l.m120489i(lVar, "$tmp0");
        lVar.invoke(obj);
    }

    /* renamed from: Fg */
    public void mo33449Fg() {
        LifestyleChooserInterestType lifestyleChooserInterestType = (LifestyleChooserInterestType) this.f43178v.get(this.f43179w);
        if (lifestyleChooserInterestType != null) {
            this.f43175s.onNext(m54888Kw(lifestyleChooserInterestType.getChosenInterests()));
        }
    }

    /* renamed from: Hw */
    public C1644x mo41906Hw() {
        return this.f43172p;
    }

    /* renamed from: Jw */
    public final C12796l mo41907Jw() {
        return this.f43164h;
    }

    /* renamed from: Lw */
    public C1644x mo33453L3() {
        return this.f43168l;
    }

    /* renamed from: Mu */
    public void mo33450Mu(String str) {
        C41536l.m120489i(str, "interestType");
        this.f43179w = str;
        mo33454Rj().mo4823o(C32343x.m95466m(C41238w.f97225a));
    }

    /* renamed from: Mw */
    public C1644x mo33456Zq() {
        return this.f43166j;
    }

    /* renamed from: Nw */
    public C1644x mo33458vk() {
        return this.f43167k;
    }

    /* renamed from: Ow */
    public C1644x mo33454Rj() {
        return this.f43170n;
    }

    /* renamed from: Pw */
    public C1644x mo33455Y9() {
        return this.f43169m;
    }

    /* renamed from: Qw */
    public C1644x mo33457vf() {
        return this.f43171o;
    }

    /* renamed from: Rw */
    public final C12797m mo41914Rw() {
        return this.f43165i;
    }

    /* renamed from: Tw */
    public void mo41915Tw(List list) {
        C41536l.m120489i(list, "subtypes");
        LifestyleChooserInterestType lifestyleChooserInterestType = (LifestyleChooserInterestType) this.f43178v.get(this.f43179w);
        if (lifestyleChooserInterestType != null) {
            ArrayList arrayList = new ArrayList(C41343r.m119925u(list, 10));
            Iterator it = list.iterator();
            while (it.hasNext()) {
                arrayList.add(((LifestyleChooserInterestSubType) it.next()).getInterestSubType());
            }
            Set<String> chosenInterests = lifestyleChooserInterestType.getChosenInterests();
            ArrayList arrayList2 = new ArrayList();
            for (T next : chosenInterests) {
                if (!arrayList.contains((String) next)) {
                    arrayList2.add(next);
                }
            }
            List Kw = m54888Kw(C41358y.m119993D0(arrayList2));
            ArrayList arrayList3 = new ArrayList(C41343r.m119925u(list, 10));
            Iterator it2 = list.iterator();
            while (it2.hasNext()) {
                arrayList3.add(((LifestyleChooserInterestSubType) it2.next()).getInterestSubType());
            }
            ArrayList arrayList4 = new ArrayList();
            for (Object next2 : arrayList3) {
                if (!this.f43176t.contains((String) next2)) {
                    arrayList4.add(next2);
                }
            }
            if (!arrayList4.isEmpty()) {
                m54891Vw(lifestyleChooserInterestType.getInterestType(), arrayList4, Kw);
            } else if (!Kw.isEmpty()) {
                this.f43175s.onNext(Kw);
            }
        }
    }

    /* renamed from: Xl */
    public void mo33451Xl(String str) {
        C41536l.m120489i(str, "interestType");
        this.f43179w = str;
        LifestyleChooserInterestType lifestyleChooserInterestType = (LifestyleChooserInterestType) this.f43178v.get(str);
        if (lifestyleChooserInterestType != null) {
            m54890Uw(lifestyleChooserInterestType);
        }
    }

    /* renamed from: y6 */
    public void mo33452y6(String str) {
        C41536l.m120489i(str, "interestType");
        this.f43179w = str;
        LifestyleChooserInterestType lifestyleChooserInterestType = (LifestyleChooserInterestType) this.f43178v.get(str);
        if (lifestyleChooserInterestType != null && !lifestyleChooserInterestType.isChosen()) {
            m54890Uw(lifestyleChooserInterestType);
        }
    }
}
