package p341ge.bog.mobilebank.cleanarch.presentation.moneyrequest.viewmodel;

import a30.C19152b;
import a30.C19159d;
import a30.C19166f;
import androidx.lifecycle.C1644x;
import androidx.lifecycle.LiveData;
import ed1.C40735b0;
import ed1.C40739f;
import ed1.C40749p;
import ed1.C40754t;
import ed1.C40762x;
import ee1.C40765a;
import ee1.C40767b;
import g91.C32343x;
import gd1.C40992a;
import h30.C24863k;
import h30.C24864l;
import h30.C24865m;
import h30.C24866n;
import h30.C24867o;
import h30.C24868p;
import h30.C24869q;
import h30.C24870r;
import h30.C24871s;
import h30.C24872t;
import h30.C24873u;
import h30.C24874v;
import h30.C24875w;
import h30.C24876x;
import hd1.C41204a;
import hd1.C41205b;
import he1.C41224m;
import he1.C41238w;
import iu0.C36546y;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.C41535k;
import kotlin.jvm.internal.C41536l;
import kotlin.jvm.internal.C41537m;
import kotlin.jvm.internal.DefaultConstructorMarker;
import p341ge.bog.mobilebank.cleanarch.presentation.common.C21481a;
import p366bk.C10320i;
import p366bk.C10328q;
import p773gv.C24789d0;
import p773gv.C24800g;
import p773gv.C24807j;
import p773gv.C24817l;
import p773gv.C24819m;
import p773gv.C24824q;
import p773gv.C24827t;
import p773gv.C24830w;
import p881ru.C28103l;
import p891su.C28261a;
import ue1.C43075l;
import ue1.C43079p;
import z20.C30141b;
import z20.C30142c;

/* renamed from: ge.bog.mobilebank.cleanarch.presentation.moneyrequest.viewmodel.MoneyRequestSelectContactViewModel */
public final class MoneyRequestSelectContactViewModel extends C21481a {
    /* access modifiers changed from: private */

    /* renamed from: d */
    public final C24789d0 f58412d;
    /* access modifiers changed from: private */

    /* renamed from: e */
    public final C24800g f58413e;

    /* renamed from: f */
    private final C24830w f58414f;

    /* renamed from: g */
    private final C24819m f58415g;
    /* access modifiers changed from: private */

    /* renamed from: h */
    public final C30142c f58416h;
    /* access modifiers changed from: private */

    /* renamed from: i */
    public final C30141b f58417i;
    /* access modifiers changed from: private */

    /* renamed from: j */
    public final C36546y f58418j;

    /* renamed from: k */
    private final C24817l f58419k;

    /* renamed from: l */
    private final C28103l f58420l;
    /* access modifiers changed from: private */

    /* renamed from: m */
    public final C24827t f58421m;
    /* access modifiers changed from: private */

    /* renamed from: n */
    public final C24807j f58422n;

    /* renamed from: o */
    private boolean f58423o = true;

    /* renamed from: p */
    private boolean f58424p;
    /* access modifiers changed from: private */

    /* renamed from: q */
    public final C1644x f58425q = new C1644x(C41341q.m119907j());

    /* renamed from: r */
    private final C40765a f58426r;
    /* access modifiers changed from: private */

    /* renamed from: s */
    public final C1644x f58427s;
    /* access modifiers changed from: private */

    /* renamed from: t */
    public final C1644x f58428t;
    /* access modifiers changed from: private */

    /* renamed from: u */
    public final C40767b f58429u;

    /* renamed from: v */
    private final C40767b f58430v;

    /* renamed from: ge.bog.mobilebank.cleanarch.presentation.moneyrequest.viewmodel.MoneyRequestSelectContactViewModel$a */
    /* synthetic */ class C21937a extends C41535k implements C43079p {

        /* renamed from: d */
        public static final C21937a f58431d = new C21937a();

        C21937a() {
            super(2, C41224m.class, "<init>", "<init>(Ljava/lang/Object;Ljava/lang/Object;)V", 0);
        }

        /* renamed from: b */
        public final C41224m invoke(Long l, String str) {
            return new C41224m(l, str);
        }
    }

    /* renamed from: ge.bog.mobilebank.cleanarch.presentation.moneyrequest.viewmodel.MoneyRequestSelectContactViewModel$b */
    static final class C21938b extends C41537m implements C43075l {

        /* renamed from: d */
        final /* synthetic */ MoneyRequestSelectContactViewModel f58432d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C21938b(MoneyRequestSelectContactViewModel moneyRequestSelectContactViewModel) {
            super(1);
            this.f58432d = moneyRequestSelectContactViewModel;
        }

        /* renamed from: a */
        public final C40739f invoke(C41224m mVar) {
            C41536l.m120489i(mVar, "<name for destructuring parameter 0>");
            Long l = (Long) mVar.mo95675a();
            String str = (String) mVar.mo95676b();
            C24807j zw = this.f58432d.f58422n;
            C41536l.m120488h(l, "contactId");
            long longValue = l.longValue();
            C41536l.m120488h(str, "phone");
            return zw.mo63219c(longValue, str);
        }
    }

    /* renamed from: ge.bog.mobilebank.cleanarch.presentation.moneyrequest.viewmodel.MoneyRequestSelectContactViewModel$c */
    static final class C21939c extends C41537m implements C43075l {

        /* renamed from: d */
        public static final C21939c f58433d = new C21939c();

        C21939c() {
            super(1);
        }

        public final void invoke(Throwable th) {
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((Throwable) obj);
            return C41238w.f97225a;
        }
    }

    /* renamed from: ge.bog.mobilebank.cleanarch.presentation.moneyrequest.viewmodel.MoneyRequestSelectContactViewModel$d */
    static final class C21940d extends C41537m implements C43075l {

        /* renamed from: d */
        final /* synthetic */ MoneyRequestSelectContactViewModel f58434d;

        /* renamed from: ge.bog.mobilebank.cleanarch.presentation.moneyrequest.viewmodel.MoneyRequestSelectContactViewModel$d$a */
        static final class C21941a extends C41537m implements C43075l {

            /* renamed from: d */
            final /* synthetic */ String f58435d;

            /* renamed from: e */
            final /* synthetic */ MoneyRequestSelectContactViewModel f58436e;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            C21941a(String str, MoneyRequestSelectContactViewModel moneyRequestSelectContactViewModel) {
                super(1);
                this.f58435d = str;
                this.f58436e = moneyRequestSelectContactViewModel;
            }

            /* renamed from: a */
            public final C19152b invoke(List list) {
                boolean z;
                C41536l.m120489i(list, "contacts");
                if (!list.isEmpty()) {
                    return new C19152b.C19157e(this.f58436e.f58417i.mo70494b(list));
                }
                String str = this.f58435d;
                C41536l.m120488h(str, "search");
                if (str.length() == 0) {
                    z = true;
                } else {
                    z = false;
                }
                if (z) {
                    return C19152b.C19155c.f53342a;
                }
                return C19152b.C19156d.f53343a;
            }
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C21940d(MoneyRequestSelectContactViewModel moneyRequestSelectContactViewModel) {
            super(1);
            this.f58434d = moneyRequestSelectContactViewModel;
        }

        /* access modifiers changed from: private */
        /* renamed from: c */
        public static final C19152b m71068c(C43075l lVar, Object obj) {
            C41536l.m120489i(lVar, "$tmp0");
            return (C19152b) lVar.invoke(obj);
        }

        /* renamed from: b */
        public final C40754t invoke(String str) {
            C41536l.m120489i(str, "search");
            return this.f58434d.f58412d.mo63207e(str).mo95075O().mo95026k0(new C21952b(new C21941a(str, this.f58434d))).mo95037u0(C19152b.C19153a.f53340a).mo94977D0(C19152b.C19154b.f53341a);
        }
    }

    /* renamed from: ge.bog.mobilebank.cleanarch.presentation.moneyrequest.viewmodel.MoneyRequestSelectContactViewModel$e */
    static final class C21942e extends C41537m implements C43075l {

        /* renamed from: d */
        final /* synthetic */ MoneyRequestSelectContactViewModel f58437d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C21942e(MoneyRequestSelectContactViewModel moneyRequestSelectContactViewModel) {
            super(1);
            this.f58437d = moneyRequestSelectContactViewModel;
        }

        /* renamed from: a */
        public final void mo54586a(C19152b bVar) {
            this.f58437d.f58427s.mo4826r(bVar);
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            mo54586a((C19152b) obj);
            return C41238w.f97225a;
        }
    }

    /* renamed from: ge.bog.mobilebank.cleanarch.presentation.moneyrequest.viewmodel.MoneyRequestSelectContactViewModel$f */
    static final class C21943f extends C41537m implements C43075l {

        /* renamed from: d */
        public static final C21943f f58438d = new C21943f();

        C21943f() {
            super(1);
        }

        public final void invoke(Throwable th) {
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((Throwable) obj);
            return C41238w.f97225a;
        }
    }

    /* renamed from: ge.bog.mobilebank.cleanarch.presentation.moneyrequest.viewmodel.MoneyRequestSelectContactViewModel$g */
    static final class C21944g extends C41537m implements C43075l {

        /* renamed from: d */
        final /* synthetic */ MoneyRequestSelectContactViewModel f58439d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C21944g(MoneyRequestSelectContactViewModel moneyRequestSelectContactViewModel) {
            super(1);
            this.f58439d = moneyRequestSelectContactViewModel;
        }

        /* renamed from: a */
        public final void mo54588a(List list) {
            this.f58439d.mo54577Vw();
            C1644x Hw = this.f58439d.f58425q;
            C30142c Dw = this.f58439d.f58416h;
            C41536l.m120488h(list, "it");
            ArrayList arrayList = new ArrayList(Dw.mo70496b(list));
            MoneyRequestSelectContactViewModel moneyRequestSelectContactViewModel = this.f58439d;
            if (!arrayList.isEmpty()) {
                C19166f fVar = C19166f.ADD_NEW_RECEIVER;
                String string = moneyRequestSelectContactViewModel.f58418j.getString(C10328q.money_request_add_receiver_by_phone_short);
                C41536l.m120488h(string, "app.getString(R.string.m…_receiver_by_phone_short)");
                arrayList.add(0, new C19159d("ADDRESSEE-0", fVar, string, C10320i.ic_add_new_money_request_receiver_big, (String) null, (Long) null, "", (String) null, 48, (DefaultConstructorMarker) null));
            }
            Hw.mo4826r(arrayList);
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            mo54588a((List) obj);
            return C41238w.f97225a;
        }
    }

    /* renamed from: ge.bog.mobilebank.cleanarch.presentation.moneyrequest.viewmodel.MoneyRequestSelectContactViewModel$h */
    static final class C21945h extends C41537m implements C43075l {

        /* renamed from: d */
        public static final C21945h f58440d = new C21945h();

        C21945h() {
            super(1);
        }

        public final void invoke(Throwable th) {
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((Throwable) obj);
            return C41238w.f97225a;
        }
    }

    /* renamed from: ge.bog.mobilebank.cleanarch.presentation.moneyrequest.viewmodel.MoneyRequestSelectContactViewModel$i */
    static final class C21946i extends C41537m implements C43075l {

        /* renamed from: d */
        final /* synthetic */ MoneyRequestSelectContactViewModel f58441d;

        /* renamed from: ge.bog.mobilebank.cleanarch.presentation.moneyrequest.viewmodel.MoneyRequestSelectContactViewModel$i$a */
        static final class C21947a extends C41537m implements C43075l {

            /* renamed from: d */
            final /* synthetic */ C28261a f58442d;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            C21947a(C28261a aVar) {
                super(1);
                this.f58442d = aVar;
            }

            /* renamed from: a */
            public final C41224m invoke(Boolean bool) {
                C41536l.m120489i(bool, "isSelected");
                return new C41224m(this.f58442d, bool);
            }
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C21946i(MoneyRequestSelectContactViewModel moneyRequestSelectContactViewModel) {
            super(1);
            this.f58441d = moneyRequestSelectContactViewModel;
        }

        /* access modifiers changed from: private */
        /* renamed from: c */
        public static final C41224m m71074c(C43075l lVar, Object obj) {
            C41536l.m120489i(lVar, "$tmp0");
            return (C41224m) lVar.invoke(obj);
        }

        /* renamed from: b */
        public final C40735b0 invoke(C28261a aVar) {
            C41536l.m120489i(aVar, "contact");
            return this.f58441d.f58421m.mo63238a(aVar).mo95062A(new C21953c(new C21947a(aVar)));
        }
    }

    /* renamed from: ge.bog.mobilebank.cleanarch.presentation.moneyrequest.viewmodel.MoneyRequestSelectContactViewModel$j */
    static final class C21948j extends C41537m implements C43075l {

        /* renamed from: d */
        final /* synthetic */ MoneyRequestSelectContactViewModel f58443d;

        /* renamed from: e */
        final /* synthetic */ long f58444e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C21948j(MoneyRequestSelectContactViewModel moneyRequestSelectContactViewModel, long j) {
            super(1);
            this.f58443d = moneyRequestSelectContactViewModel;
            this.f58444e = j;
        }

        /* renamed from: a */
        public final C40735b0 invoke(C41224m mVar) {
            boolean z;
            C41536l.m120489i(mVar, "<name for destructuring parameter 0>");
            C28261a aVar = (C28261a) mVar.mo95675a();
            Boolean bool = (Boolean) mVar.mo95676b();
            boolean z2 = false;
            if (!aVar.mo67861q()) {
                String o = aVar.mo67859o();
                if (o == null || o.length() == 0) {
                    z = true;
                } else {
                    z = false;
                }
                if (z && aVar.mo67862r()) {
                    z2 = true;
                }
            }
            C41536l.m120488h(bool, "isSelected");
            if (bool.booleanValue() || !z2) {
                return this.f58443d.f58413e.mo63215c(this.f58444e).mo94898g(C40762x.m118162z(Boolean.FALSE));
            }
            return C40762x.m118162z(Boolean.valueOf(z2));
        }
    }

    /* renamed from: ge.bog.mobilebank.cleanarch.presentation.moneyrequest.viewmodel.MoneyRequestSelectContactViewModel$k */
    static final class C21949k extends C41537m implements C43075l {

        /* renamed from: d */
        final /* synthetic */ MoneyRequestSelectContactViewModel f58445d;

        /* renamed from: e */
        final /* synthetic */ long f58446e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C21949k(MoneyRequestSelectContactViewModel moneyRequestSelectContactViewModel, long j) {
            super(1);
            this.f58445d = moneyRequestSelectContactViewModel;
            this.f58446e = j;
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((Boolean) obj);
            return C41238w.f97225a;
        }

        public final void invoke(Boolean bool) {
            C41536l.m120488h(bool, "needsToAddNumber");
            if (bool.booleanValue()) {
                this.f58445d.f58429u.onNext(Long.valueOf(this.f58446e));
                this.f58445d.f58428t.mo4826r(C32343x.m95466m(Long.valueOf(this.f58446e)));
            }
        }
    }

    /* renamed from: ge.bog.mobilebank.cleanarch.presentation.moneyrequest.viewmodel.MoneyRequestSelectContactViewModel$l */
    static final class C21950l extends C41537m implements C43075l {

        /* renamed from: d */
        public static final C21950l f58447d = new C21950l();

        C21950l() {
            super(1);
        }

        public final void invoke(Throwable th) {
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((Throwable) obj);
            return C41238w.f97225a;
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public MoneyRequestSelectContactViewModel(C24789d0 d0Var, C24800g gVar, C24830w wVar, C24819m mVar, C30142c cVar, C30141b bVar, C36546y yVar, C24817l lVar, C24824q qVar, C28103l lVar2, C24827t tVar, C24807j jVar) {
        super((C41204a) null, 1, (DefaultConstructorMarker) null);
        C41536l.m120489i(d0Var, "searchContact");
        C41536l.m120489i(gVar, "addReceiverByContact");
        C41536l.m120489i(wVar, "removeReceiverByPhoneNumber");
        C41536l.m120489i(mVar, "clearMoneyRequestReceivers");
        C41536l.m120489i(cVar, "itemMapper");
        C41536l.m120489i(bVar, "mapper");
        C41536l.m120489i(yVar, "app");
        C41536l.m120489i(lVar, "clearBillSplitOperations");
        C41536l.m120489i(qVar, "getMoneyRequestReceiversUseCase");
        C41536l.m120489i(lVar2, "getContactById");
        C41536l.m120489i(tVar, "isContactSelectedUseCase");
        C41536l.m120489i(jVar, "AddPhoneNumberAndAddToReceiversList");
        this.f58412d = d0Var;
        this.f58413e = gVar;
        this.f58414f = wVar;
        this.f58415g = mVar;
        this.f58416h = cVar;
        this.f58417i = bVar;
        this.f58418j = yVar;
        this.f58419k = lVar;
        this.f58420l = lVar2;
        this.f58421m = tVar;
        this.f58422n = jVar;
        C40765a i1 = C40765a.m118199i1("");
        C41536l.m120488h(i1, "createDefault(\"\")");
        this.f58426r = i1;
        this.f58427s = new C1644x();
        this.f58428t = new C1644x();
        C40767b h1 = C40767b.m118210h1();
        C41536l.m120488h(h1, "create<Long>()");
        this.f58429u = h1;
        C40767b h12 = C40767b.m118210h1();
        C41536l.m120488h(h12, "create<String>()");
        this.f58430v = h12;
        C41205b G = C40749p.m118037d1(h1, h12, new C24872t(C21937a.f58431d)).mo95006U(new C24873u(new C21938b(this))).mo94888G(new C24874v(), new C24875w(C21939c.f58433d));
        C41536l.m120488h(G, "zip(contactIdToAddPhoneN…     }, {\n\n            })");
        bindToLifecycle(G);
        C41205b G0 = i1.mo94989L0(new C24876x(new C21940d(this))).mo95027o0(C40992a.m118827a()).mo94983G0(new C24864l(new C21942e(this)), new C24865m(C21943f.f58438d));
        C41536l.m120488h(G0, "searchSubject.switchMap …ntStackTrace()\n        })");
        bindToLifecycle(G0);
        C41205b G02 = qVar.mo63235a().mo95027o0(C40992a.m118827a()).mo94983G0(new C24866n(new C21944g(this)), new C24867o(C21945h.f58440d));
        C41536l.m120488h(G02, "getMoneyRequestReceivers… error\n                })");
        addDisposable(G02);
    }

    /* access modifiers changed from: private */
    /* renamed from: Lw */
    public static final C40735b0 m71027Lw(C43075l lVar, Object obj) {
        C41536l.m120489i(lVar, "$tmp0");
        return (C40735b0) lVar.invoke(obj);
    }

    /* access modifiers changed from: private */
    /* renamed from: Mw */
    public static final void m71028Mw(C43075l lVar, Object obj) {
        C41536l.m120489i(lVar, "$tmp0");
        lVar.invoke(obj);
    }

    /* access modifiers changed from: private */
    /* renamed from: Nw */
    public static final void m71029Nw(C43075l lVar, Object obj) {
        C41536l.m120489i(lVar, "$tmp0");
        lVar.invoke(obj);
    }

    /* access modifiers changed from: private */
    /* renamed from: Ow */
    public static final C40735b0 m71030Ow(C43075l lVar, Object obj) {
        C41536l.m120489i(lVar, "$tmp0");
        return (C40735b0) lVar.invoke(obj);
    }

    /* access modifiers changed from: private */
    /* renamed from: Uw */
    public static final void m71031Uw() {
    }

    /* access modifiers changed from: private */
    public static final void _init_$lambda$5(C43075l lVar, Object obj) {
        C41536l.m120489i(lVar, "$tmp0");
        lVar.invoke(obj);
    }

    /* access modifiers changed from: private */
    /* renamed from: rw */
    public static final C41224m m71046rw(C43079p pVar, Object obj, Object obj2) {
        C41536l.m120489i(pVar, "$tmp0");
        return (C41224m) pVar.invoke(obj, obj2);
    }

    /* access modifiers changed from: private */
    /* renamed from: sw */
    public static final C40739f m71047sw(C43075l lVar, Object obj) {
        C41536l.m120489i(lVar, "$tmp0");
        return (C40739f) lVar.invoke(obj);
    }

    /* access modifiers changed from: private */
    /* renamed from: tw */
    public static final void m71048tw() {
    }

    /* access modifiers changed from: private */
    /* renamed from: uw */
    public static final void m71049uw(C43075l lVar, Object obj) {
        C41536l.m120489i(lVar, "$tmp0");
        lVar.invoke(obj);
    }

    /* access modifiers changed from: private */
    /* renamed from: vw */
    public static final C40754t m71050vw(C43075l lVar, Object obj) {
        C41536l.m120489i(lVar, "$tmp0");
        return (C40754t) lVar.invoke(obj);
    }

    /* access modifiers changed from: private */
    /* renamed from: ww */
    public static final void m71051ww(C43075l lVar, Object obj) {
        C41536l.m120489i(lVar, "$tmp0");
        lVar.invoke(obj);
    }

    /* access modifiers changed from: private */
    /* renamed from: xw */
    public static final void m71052xw(C43075l lVar, Object obj) {
        C41536l.m120489i(lVar, "$tmp0");
        lVar.invoke(obj);
    }

    /* access modifiers changed from: private */
    /* renamed from: yw */
    public static final void m71053yw(C43075l lVar, Object obj) {
        C41536l.m120489i(lVar, "$tmp0");
        lVar.invoke(obj);
    }

    /* renamed from: Kw */
    public final void mo54571Kw(long j) {
        C41205b I = this.f58420l.mo67637b(j).mo95087r(new C24863k(new C21946i(this))).mo95087r(new C24868p(new C21948j(this, j))).mo95063B(C40992a.m118827a()).mo95070I(new C24869q(new C21949k(this, j)), new C24870r(C21950l.f58447d));
        C41536l.m120488h(I, "fun addOrRemoveReceiver(…).bindToLifecycle()\n    }");
        bindToLifecycle(I);
    }

    /* renamed from: Pw */
    public final void mo54572Pw(String str) {
        C40767b bVar = this.f58430v;
        if (str == null) {
            str = "";
        }
        bVar.onNext(str);
    }

    /* renamed from: Qw */
    public final LiveData mo54573Qw() {
        return this.f58427s;
    }

    /* renamed from: Rw */
    public final LiveData mo54574Rw() {
        return this.f58425q;
    }

    /* renamed from: Sw */
    public final LiveData mo54575Sw() {
        return this.f58428t;
    }

    /* renamed from: Tw */
    public final void mo54576Tw(String str) {
        C41536l.m120489i(str, "phoneNumber");
        C41205b F = this.f58414f.mo63241a(str).mo94906z(C40992a.m118827a()).mo94887F(new C24871s());
        C41536l.m120488h(F, "removeReceiverByPhoneNum…            .subscribe {}");
        bindToLifecycle(F);
    }

    /* renamed from: Vw */
    public final void mo54577Vw() {
        C40765a aVar = this.f58426r;
        String str = (String) aVar.mo95100j1();
        if (str == null) {
            str = "";
        }
        aVar.onNext(str);
    }

    /* renamed from: Ww */
    public final void mo54578Ww(boolean z) {
        this.f58424p = z;
    }

    /* renamed from: Xw */
    public final void mo54579Xw(boolean z) {
        this.f58423o = z;
    }

    /* renamed from: Y2 */
    public final void mo54580Y2(String str) {
        C41536l.m120489i(str, "searchWord");
        this.f58426r.onNext(str);
    }

    /* access modifiers changed from: protected */
    public void onCleared() {
        super.onCleared();
        if (this.f58423o) {
            this.f58415g.mo63230a();
        }
        if (this.f58424p) {
            this.f58419k.mo63228a();
        }
    }
}
