package p341ge.bog.mobilebank.cardapplications.presentation.viewmodel;

import af1.C40303i;
import androidx.lifecycle.C1644x;
import androidx.lifecycle.LiveData;
import ba1.C10146d0;
import c41.C31270e;
import e41.C31658b;
import ed1.C40749p;
import ed1.C40754t;
import ee1.C40767b;
import g91.C32300e0;
import g91.C32343x;
import hd1.C41204a;
import he1.C41224m;
import he1.C41238w;
import j51.C36735g;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.C41520a0;
import kotlin.jvm.internal.C41536l;
import kotlin.jvm.internal.C41537m;
import kotlin.jvm.internal.C41539o;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.properties.C41555e;
import m41.C37224b;
import m51.C37228a;
import md0.C26186e;
import o31.C37591c;
import p341ge.bog.mobilebank.cardapplications.presentation.model.SelectedAddress;
import p341ge.bog.mobilebank.cleanarch.presentation.common.C21481a;
import p341ge.bog.mobilebank.shared.tmx_profiling.TMXFlags;
import p355an.C10099q;
import p412en.C12673v3;
import p412en.C12681w3;
import p412en.C12686x3;
import p412en.C12709y3;
import p523mm.C16730c;
import p523mm.C16740f;
import p523mm.C16752j0;
import p523mm.C16755k0;
import p537nm.C17082f;
import p565pm.C17389d;
import p565pm.C17390e;
import p674xm.C18781a;
import p688ym.C18956a;
import p688ym.C18957b;
import ue1.C43075l;

/* renamed from: ge.bog.mobilebank.cardapplications.presentation.viewmodel.OrderInstantCardViewModel$ViewModel */
public final class OrderInstantCardViewModel$ViewModel extends C21481a implements C12673v3, C12681w3 {

    /* renamed from: w */
    static final /* synthetic */ C40303i[] f41896w = {C41520a0.m120439e(new C41539o(OrderInstantCardViewModel$ViewModel.class, "deliveryData", "getDeliveryData()Lge/bog/mobilebank/cardapplications/presentation/model/instantcards/DeliveryData;", 0))};
    /* access modifiers changed from: private */

    /* renamed from: d */
    public final C16740f f41897d;
    /* access modifiers changed from: private */

    /* renamed from: e */
    public final C16730c f41898e;
    /* access modifiers changed from: private */

    /* renamed from: f */
    public final C36735g f41899f;

    /* renamed from: g */
    private final C31658b f41900g;
    /* access modifiers changed from: private */

    /* renamed from: h */
    public final C16752j0 f41901h;

    /* renamed from: i */
    private final C16755k0 f41902i;

    /* renamed from: j */
    private final C10099q f41903j;

    /* renamed from: k */
    private final C12673v3 f41904k = this;

    /* renamed from: l */
    private final C12681w3 f41905l = this;

    /* renamed from: m */
    private final C1644x f41906m;

    /* renamed from: n */
    private final C1644x f41907n;

    /* renamed from: o */
    private final C1644x f41908o;

    /* renamed from: p */
    private final C1644x f41909p;

    /* renamed from: q */
    private final C1644x f41910q;

    /* renamed from: r */
    private final C1644x f41911r;

    /* renamed from: s */
    private final C40767b f41912s;
    /* access modifiers changed from: private */

    /* renamed from: t */
    public String f41913t;
    /* access modifiers changed from: private */

    /* renamed from: u */
    public final List f41914u;

    /* renamed from: v */
    private final C41555e f41915v;

    /* renamed from: ge.bog.mobilebank.cardapplications.presentation.viewmodel.OrderInstantCardViewModel$ViewModel$a */
    static final class C14260a extends C41537m implements C43075l {

        /* renamed from: d */
        final /* synthetic */ OrderInstantCardViewModel$ViewModel f41916d;

        /* renamed from: ge.bog.mobilebank.cardapplications.presentation.viewmodel.OrderInstantCardViewModel$ViewModel$a$a */
        static final class C14261a extends C41537m implements C43075l {

            /* renamed from: d */
            final /* synthetic */ OrderInstantCardViewModel$ViewModel f41917d;

            /* renamed from: ge.bog.mobilebank.cardapplications.presentation.viewmodel.OrderInstantCardViewModel$ViewModel$a$a$a */
            static final class C14262a extends C41537m implements C43075l {

                /* renamed from: d */
                final /* synthetic */ OrderInstantCardViewModel$ViewModel f41918d;

                /* JADX INFO: super call moved to the top of the method (can break code semantics) */
                C14262a(OrderInstantCardViewModel$ViewModel orderInstantCardViewModel$ViewModel) {
                    super(1);
                    this.f41918d = orderInstantCardViewModel$ViewModel;
                }

                /* renamed from: a */
                public final void mo39996a(C17082f fVar) {
                    Object obj;
                    OrderInstantCardViewModel$ViewModel orderInstantCardViewModel$ViewModel = this.f41918d;
                    C18956a iw = orderInstantCardViewModel$ViewModel.m52866rw();
                    Iterator it = this.f41918d.f41914u.iterator();
                    while (true) {
                        if (!it.hasNext()) {
                            obj = null;
                            break;
                        }
                        obj = it.next();
                        if (C41536l.m120484d(fVar.mo44311b(), ((C17389d) obj).mo44910d())) {
                            break;
                        }
                    }
                    orderInstantCardViewModel$ViewModel.m52868yw(C18956a.m64051b(iw, (C17389d) obj, (C17389d) null, (C17389d) null, (C17389d) null, 14, (Object) null));
                }

                public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                    mo39996a((C17082f) obj);
                    return C41238w.f97225a;
                }
            }

            /* renamed from: ge.bog.mobilebank.cardapplications.presentation.viewmodel.OrderInstantCardViewModel$ViewModel$a$a$b */
            static final class C14263b extends C41537m implements C43075l {

                /* renamed from: d */
                public static final C14263b f41919d = new C14263b();

                C14263b() {
                    super(1);
                }

                /* renamed from: a */
                public final String invoke(C17082f fVar) {
                    C41536l.m120489i(fVar, "countryInfo");
                    return C32300e0.f79712a.mo72819e(fVar.mo44313d(), fVar.mo44312c());
                }
            }

            /* renamed from: ge.bog.mobilebank.cardapplications.presentation.viewmodel.OrderInstantCardViewModel$ViewModel$a$a$c */
            static final class C14264c extends C41537m implements C43075l {

                /* renamed from: d */
                final /* synthetic */ OrderInstantCardViewModel$ViewModel f41920d;

                /* JADX INFO: super call moved to the top of the method (can break code semantics) */
                C14264c(OrderInstantCardViewModel$ViewModel orderInstantCardViewModel$ViewModel) {
                    super(1);
                    this.f41920d = orderInstantCardViewModel$ViewModel;
                }

                /* renamed from: a */
                public final void mo39998a(String str) {
                    OrderInstantCardViewModel$ViewModel orderInstantCardViewModel$ViewModel = this.f41920d;
                    C41536l.m120488h(str, "country");
                    orderInstantCardViewModel$ViewModel.f41913t = str;
                }

                public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                    mo39998a((String) obj);
                    return C41238w.f97225a;
                }
            }

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            C14261a(OrderInstantCardViewModel$ViewModel orderInstantCardViewModel$ViewModel) {
                super(1);
                this.f41917d = orderInstantCardViewModel$ViewModel;
            }

            /* access modifiers changed from: private */
            /* renamed from: e */
            public static final void m52888e(C43075l lVar, Object obj) {
                C41536l.m120489i(lVar, "$tmp0");
                lVar.invoke(obj);
            }

            /* access modifiers changed from: private */
            /* renamed from: f */
            public static final String m52889f(C43075l lVar, Object obj) {
                C41536l.m120489i(lVar, "$tmp0");
                return (String) lVar.invoke(obj);
            }

            /* access modifiers changed from: private */
            /* renamed from: g */
            public static final void m52890g(C43075l lVar, Object obj) {
                C41536l.m120489i(lVar, "$tmp0");
                lVar.invoke(obj);
            }

            /* renamed from: d */
            public final C40754t invoke(List list) {
                C41536l.m120489i(list, "points");
                C32343x.m95475p(this.f41917d.f41914u, list);
                return C26186e.m81990h(this.f41917d.f41897d.mo43869a()).mo95084m(new C14278l(new C14262a(this.f41917d))).mo95062A(new C14279m(C14263b.f41919d)).mo95084m(new C14280n(new C14264c(this.f41917d))).mo95075O();
            }
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C14260a(OrderInstantCardViewModel$ViewModel orderInstantCardViewModel$ViewModel) {
            super(1);
            this.f41916d = orderInstantCardViewModel$ViewModel;
        }

        /* access modifiers changed from: private */
        /* renamed from: c */
        public static final C40754t m52883c(C43075l lVar, Object obj) {
            C41536l.m120489i(lVar, "$tmp0");
            return (C40754t) lVar.invoke(obj);
        }

        /* renamed from: b */
        public final C40754t invoke(Integer num) {
            C41536l.m120489i(num, "rc");
            C40749p Q = C16752j0.m59180b(this.f41916d.f41901h, (String) null, 1, (Object) null).mo95075O().mo94998Q(new C14277k(new C14261a(this.f41916d)));
            C41536l.m120488h(Q, "@HiltViewModel\n    class…fecycle()\n        }\n    }");
            return C31270e.m92879h(Q, num.intValue());
        }
    }

    /* renamed from: ge.bog.mobilebank.cardapplications.presentation.viewmodel.OrderInstantCardViewModel$ViewModel$b */
    public /* synthetic */ class C14265b {

        /* renamed from: a */
        public static final /* synthetic */ int[] f41921a;

        /* renamed from: b */
        public static final /* synthetic */ int[] f41922b;

        /* JADX WARNING: Can't wrap try/catch for region: R(14:0|(2:1|2)|3|(2:5|6)|7|(2:9|10)|11|13|14|15|16|(2:17|18)|19|21) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:15:0x0033 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:17:0x003b */
        static {
            /*
                pm.e[] r0 = p565pm.C17390e.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                r1 = 1
                pm.e r2 = p565pm.C17390e.COUNTRY     // Catch:{ NoSuchFieldError -> 0x0010 }
                int r2 = r2.ordinal()     // Catch:{ NoSuchFieldError -> 0x0010 }
                r0[r2] = r1     // Catch:{ NoSuchFieldError -> 0x0010 }
            L_0x0010:
                r2 = 2
                pm.e r3 = p565pm.C17390e.CITY     // Catch:{ NoSuchFieldError -> 0x0019 }
                int r3 = r3.ordinal()     // Catch:{ NoSuchFieldError -> 0x0019 }
                r0[r3] = r2     // Catch:{ NoSuchFieldError -> 0x0019 }
            L_0x0019:
                r3 = 3
                pm.e r4 = p565pm.C17390e.ADDRESS     // Catch:{ NoSuchFieldError -> 0x0022 }
                int r4 = r4.ordinal()     // Catch:{ NoSuchFieldError -> 0x0022 }
                r0[r4] = r3     // Catch:{ NoSuchFieldError -> 0x0022 }
            L_0x0022:
                f41921a = r0
                xm.a[] r0 = p674xm.C18781a.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                xm.a r4 = p674xm.C18781a.INSTANT_COUNTRY     // Catch:{ NoSuchFieldError -> 0x0033 }
                int r4 = r4.ordinal()     // Catch:{ NoSuchFieldError -> 0x0033 }
                r0[r4] = r1     // Catch:{ NoSuchFieldError -> 0x0033 }
            L_0x0033:
                xm.a r1 = p674xm.C18781a.INSTANT_CITY     // Catch:{ NoSuchFieldError -> 0x003b }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x003b }
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x003b }
            L_0x003b:
                xm.a r1 = p674xm.C18781a.INSTANT_SERVICE_CENTER     // Catch:{ NoSuchFieldError -> 0x0043 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0043 }
                r0[r1] = r3     // Catch:{ NoSuchFieldError -> 0x0043 }
            L_0x0043:
                f41922b = r0
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: p341ge.bog.mobilebank.cardapplications.presentation.viewmodel.OrderInstantCardViewModel$ViewModel.C14265b.<clinit>():void");
        }
    }

    /* renamed from: ge.bog.mobilebank.cardapplications.presentation.viewmodel.OrderInstantCardViewModel$ViewModel$c */
    static final class C14266c extends C41537m implements C43075l {

        /* renamed from: d */
        final /* synthetic */ OrderInstantCardViewModel$ViewModel f41923d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C14266c(OrderInstantCardViewModel$ViewModel orderInstantCardViewModel$ViewModel) {
            super(1);
            this.f41923d = orderInstantCardViewModel$ViewModel;
        }

        /* renamed from: a */
        public final C40754t invoke(C41224m mVar) {
            Long l;
            C41536l.m120489i(mVar, "it");
            C16730c hw = this.f41923d.f41898e;
            C37228a a = this.f41923d.f41899f.mo89562a();
            if (a != null) {
                l = Long.valueOf(a.mo90305b());
            } else {
                l = null;
            }
            C40749p f = C16730c.m59153b(hw, String.valueOf(l), (String) mVar.mo95678e(), (String) mVar.mo95680f(), C10146d0.C10177h.m37232a(), (String) null, (String) null, 48, (Object) null).mo94897f(C40749p.m118043h0(this.f41923d.f41913t));
            C41536l.m120488h(f, "createCardOrderAgreement…rvable.just(countryName))");
            return C31270e.m92879h(f, -1);
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public OrderInstantCardViewModel$ViewModel(C16740f fVar, C16730c cVar, C36735g gVar, C31658b bVar, C16752j0 j0Var, C16755k0 k0Var, C10099q qVar) {
        super((C41204a) null, 1, (DefaultConstructorMarker) null);
        C41536l.m120489i(fVar, "getOrderCountry");
        C41536l.m120489i(cVar, "createCardOrderAgreement");
        C41536l.m120489i(gVar, "getLoginInfo");
        C41536l.m120489i(bVar, "startTMXProfiling");
        C41536l.m120489i(j0Var, "getInstantCardServiceCenters");
        C41536l.m120489i(k0Var, "getInstantFeeAmountUseCase");
        C41536l.m120489i(qVar, "mapper");
        this.f41897d = fVar;
        this.f41898e = cVar;
        this.f41899f = gVar;
        this.f41900g = bVar;
        this.f41901h = j0Var;
        this.f41902i = k0Var;
        this.f41903j = qVar;
        C1644x xVar = new C1644x();
        this.f41906m = xVar;
        this.f41907n = new C1644x();
        this.f41908o = new C1644x();
        this.f41909p = new C1644x();
        this.f41910q = new C1644x();
        this.f41911r = new C1644x();
        C40767b h1 = C40767b.m118210h1();
        C41536l.m120488h(h1, "create<Pair<String, String>>()");
        this.f41912s = h1;
        this.f41913t = "";
        this.f41914u = new ArrayList();
        this.f41915v = C37591c.m110557b(C37591c.f90334a, new C18956a((C17389d) null, (C17389d) null, (C17389d) null, (C17389d) null, 15, (DefaultConstructorMarker) null), mo33345To(), (C43075l) null, 4, (Object) null);
        C40749p L0 = C40749p.m118047l0(onInit(), onRefresh()).mo94989L0(new C12686x3(new C14260a(this)));
        C41536l.m120488h(L0, "merge(onInit(), onRefres…ervable(rc)\n            }");
        bindToLifecycle(C31270e.m92876e(L0, xVar));
        m52869zw();
    }

    /* access modifiers changed from: private */
    /* renamed from: Aw */
    public static final C40754t m52851Aw(C43075l lVar, Object obj) {
        C41536l.m120489i(lVar, "$tmp0");
        return (C40754t) lVar.invoke(obj);
    }

    /* access modifiers changed from: private */
    /* renamed from: fw */
    public static final C40754t m52854fw(C43075l lVar, Object obj) {
        C41536l.m120489i(lVar, "$tmp0");
        return (C40754t) lVar.invoke(obj);
    }

    /* renamed from: pw */
    private final Set m52864pw(C18956a aVar, C18781a aVar2) {
        Set b = C41355w0.m119979b();
        for (C18781a aVar3 = C18781a.INSTANT_COUNTRY; aVar3 != null; aVar3 = aVar3.mo46583f()) {
            SelectedAddress qw = m52865qw(aVar3, aVar);
            if (qw != null) {
                b.add(qw);
            }
            if (aVar3 == aVar2) {
                break;
            }
        }
        return C41355w0.m119978a(b);
    }

    /* JADX WARNING: Removed duplicated region for block: B:17:0x0042  */
    /* JADX WARNING: Removed duplicated region for block: B:19:0x004c A[RETURN] */
    /* renamed from: qw */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final p341ge.bog.mobilebank.cardapplications.presentation.model.SelectedAddress m52865qw(p674xm.C18781a r4, p688ym.C18956a r5) {
        /*
            r3 = this;
            int[] r0 = p341ge.bog.mobilebank.cardapplications.presentation.viewmodel.OrderInstantCardViewModel$ViewModel.C14265b.f41922b
            int r1 = r4.ordinal()
            r0 = r0[r1]
            r1 = 1
            r2 = 0
            if (r0 == r1) goto L_0x0032
            r1 = 2
            if (r0 == r1) goto L_0x0023
            r1 = 3
            if (r0 == r1) goto L_0x0014
        L_0x0012:
            r5 = r2
            goto L_0x0040
        L_0x0014:
            pm.d r5 = r5.mo47004e()
            if (r5 == 0) goto L_0x0012
            long r0 = r5.mo44907a()
            java.lang.Long r5 = java.lang.Long.valueOf(r0)
            goto L_0x0040
        L_0x0023:
            pm.d r5 = r5.mo47002c()
            if (r5 == 0) goto L_0x0012
            long r0 = r5.mo44907a()
            java.lang.Long r5 = java.lang.Long.valueOf(r0)
            goto L_0x0040
        L_0x0032:
            pm.d r5 = r5.mo47003d()
            if (r5 == 0) goto L_0x0012
            long r0 = r5.mo44907a()
            java.lang.Long r5 = java.lang.Long.valueOf(r0)
        L_0x0040:
            if (r5 == 0) goto L_0x004c
            long r0 = r5.longValue()
            ge.bog.mobilebank.cardapplications.presentation.model.SelectedAddress r5 = new ge.bog.mobilebank.cardapplications.presentation.model.SelectedAddress
            r5.<init>(r4, r0)
            return r5
        L_0x004c:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: p341ge.bog.mobilebank.cardapplications.presentation.viewmodel.OrderInstantCardViewModel$ViewModel.m52865qw(xm.a, ym.a):ge.bog.mobilebank.cardapplications.presentation.model.SelectedAddress");
    }

    /* access modifiers changed from: private */
    /* renamed from: rw */
    public final C18956a m52866rw() {
        return (C18956a) this.f41915v.getValue(this, f41896w[0]);
    }

    /* renamed from: uw */
    private final void m52867uw(String str) {
        Long l;
        C16755k0 k0Var = this.f41902i;
        C37228a a = this.f41899f.mo89562a();
        if (a != null) {
            l = Long.valueOf(a.mo90305b());
        } else {
            l = null;
        }
        bindToLifecycle(C31270e.m92876e(C31270e.m92880i(k0Var.mo43879a(String.valueOf(l), str), -1), this.f41910q));
    }

    /* access modifiers changed from: private */
    /* renamed from: yw */
    public final void m52868yw(C18956a aVar) {
        this.f41915v.setValue(this, f41896w[0], aVar);
    }

    /* renamed from: zw */
    private final void m52869zw() {
        C40749p L0 = this.f41912s.mo94989L0(new C12709y3(new C14266c(this)));
        C41536l.m120488h(L0, "private fun subscribeToS…ndToLifecycle()\n        }");
        bindToLifecycle(C31270e.m92876e(L0, this.f41907n));
    }

    /* renamed from: B5 */
    public void mo33334B5(String str) {
        String str2;
        C41536l.m120489i(str, "address");
        bindToLifecycle(this.f41900g.mo72084b(TMXFlags.TMX_FLAG_CARD_ORDER_AGGR_KEY));
        C17389d e = m52866rw().mo47004e();
        if (e == null || (str2 = e.mo44910d()) == null) {
            str2 = "";
        }
        C40767b bVar = this.f41912s;
        String str3 = this.f41913t;
        bVar.onNext(new C41224m(str3 + ", " + str, str2));
    }

    /* renamed from: Mh */
    public LiveData mo33344Mh() {
        return this.f41906m;
    }

    /* renamed from: bt */
    public LiveData mo33347bt() {
        return this.f41910q;
    }

    /* renamed from: mm */
    public void mo33335mm(long j) {
        String d;
        for (C17389d dVar : this.f41914u) {
            List<C17389d> e = dVar.mo44911e();
            if (e != null) {
                for (C17389d dVar2 : e) {
                    List<C17389d> e2 = dVar2.mo44911e();
                    if (e2 != null) {
                        for (C17389d dVar3 : e2) {
                            if (dVar3.mo44907a() == j) {
                                this.f41913t = dVar.mo44908b();
                                m52868yw(C18956a.m64051b(m52866rw(), dVar, dVar2, dVar3, (C17389d) null, 8, (Object) null));
                            }
                        }
                    }
                }
            }
        }
        C17389d c = m52866rw().mo47002c();
        if (c != null && (d = c.mo44910d()) != null) {
            m52867uw(d);
        }
    }

    /* renamed from: sw */
    public C1644x mo33345To() {
        return this.f41911r;
    }

    /* renamed from: tw */
    public final C12673v3 mo39990tw() {
        return this.f41904k;
    }

    /* renamed from: v8 */
    public LiveData mo33348v8() {
        return this.f41907n;
    }

    /* renamed from: vw */
    public C1644x mo33346Yp() {
        return this.f41909p;
    }

    /* renamed from: ww */
    public final C12681w3 mo39992ww() {
        return this.f41905l;
    }

    /* renamed from: xw */
    public void mo39993xw(C17390e eVar) {
        C18781a aVar;
        C41536l.m120489i(eVar, "type");
        int i = C14265b.f41921a[eVar.ordinal()];
        if (i == 1) {
            aVar = C18781a.INSTANT_COUNTRY;
        } else if (i == 2) {
            aVar = C18781a.INSTANT_CITY;
        } else if (i == 3) {
            aVar = C18781a.INSTANT_SERVICE_CENTER;
        } else {
            throw new NoWhenBranchMatchedException();
        }
        C37224b.m109965d(mo33346Yp(), new C18957b(this.f41903j.mo26577d(this.f41914u), aVar, m52864pw(m52866rw(), aVar)));
    }
}
