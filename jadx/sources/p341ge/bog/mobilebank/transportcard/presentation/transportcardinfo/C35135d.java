package p341ge.bog.mobilebank.transportcard.presentation.transportcardinfo;

import androidx.lifecycle.C1644x;
import b41.C31128a;
import c41.C31270e;
import ed1.C40749p;
import ed1.C40754t;
import ee1.C40767b;
import g91.C32343x;
import hd1.C41204a;
import hd1.C41205b;
import he1.C41224m;
import he1.C41238w;
import i71.C36361c;
import i71.C36363e;
import iu0.C36546y;
import java.util.List;
import java.util.concurrent.TimeUnit;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.C41535k;
import kotlin.jvm.internal.C41536l;
import kotlin.jvm.internal.C41537m;
import kotlin.jvm.internal.DefaultConstructorMarker;
import l71.C37091a;
import m41.C37224b;
import md0.C26186e;
import p341ge.bog.mobilebank.cleanarch.presentation.common.C21481a;
import p341ge.bog.mobilebank.transportcard.presentation.transportcardinfo.C35129a;
import ue1.C43075l;
import ue1.C43079p;
import v71.C39243a;
import v71.C39253k;
import v71.C39254l;
import v71.C39255m;
import v71.C39256n;
import v71.C39257o;
import v71.C39258p;
import w71.C39613a;

/* renamed from: ge.bog.mobilebank.transportcard.presentation.transportcardinfo.d */
public final class C35135d extends C21481a implements C39253k, C39254l, C37091a {
    /* access modifiers changed from: private */

    /* renamed from: d */
    public final C36361c f84688d;
    /* access modifiers changed from: private */

    /* renamed from: e */
    public final C36363e f84689e;
    /* access modifiers changed from: private */

    /* renamed from: f */
    public final C39613a f84690f;
    /* access modifiers changed from: private */

    /* renamed from: g */
    public final String f84691g;

    /* renamed from: h */
    private final /* synthetic */ C37091a f84692h;

    /* renamed from: i */
    private final C39253k f84693i = this;

    /* renamed from: j */
    private final C39254l f84694j = this;

    /* renamed from: k */
    private final C1644x f84695k = new C1644x();

    /* renamed from: l */
    private final C1644x f84696l = new C1644x();

    /* renamed from: m */
    private final C1644x f84697m = new C1644x();

    /* renamed from: n */
    private final C1644x f84698n = new C1644x();
    /* access modifiers changed from: private */

    /* renamed from: o */
    public final C40767b f84699o;

    /* renamed from: ge.bog.mobilebank.transportcard.presentation.transportcardinfo.d$a */
    static final class C35136a extends C41537m implements C43075l {

        /* renamed from: d */
        final /* synthetic */ C35135d f84700d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C35136a(C35135d dVar) {
            super(1);
            this.f84700d = dVar;
        }

        /* renamed from: a */
        public final void mo86036a(String str) {
            C1644x mw = this.f84700d.mo86022Om();
            C41536l.m120488h(str, "it");
            C37224b.m109966e(mw, str);
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            mo86036a((String) obj);
            return C41238w.f97225a;
        }
    }

    /* renamed from: ge.bog.mobilebank.transportcard.presentation.transportcardinfo.d$b */
    public interface C35137b {
        /* renamed from: a */
        C35135d mo32824a(String str);
    }

    /* renamed from: ge.bog.mobilebank.transportcard.presentation.transportcardinfo.d$c */
    static final class C35138c extends C41537m implements C43075l {

        /* renamed from: d */
        final /* synthetic */ C35135d f84701d;

        /* renamed from: ge.bog.mobilebank.transportcard.presentation.transportcardinfo.d$c$a */
        /* synthetic */ class C35139a extends C41535k implements C43079p {

            /* renamed from: d */
            public static final C35139a f84702d = new C35139a();

            C35139a() {
                super(2, C41224m.class, "<init>", "<init>(Ljava/lang/Object;Ljava/lang/Object;)V", 0);
            }

            /* renamed from: b */
            public final C41224m invoke(List list, List list2) {
                return new C41224m(list, list2);
            }
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C35138c(C35135d dVar) {
            super(1);
            this.f84701d = dVar;
        }

        /* access modifiers changed from: private */
        /* renamed from: c */
        public static final C41224m m103240c(C43079p pVar, Object obj, Object obj2) {
            C41536l.m120489i(pVar, "$tmp0");
            return (C41224m) pVar.invoke(obj, obj2);
        }

        /* renamed from: b */
        public final C40754t invoke(Integer num) {
            C41536l.m120489i(num, "it");
            C40749p m = C40749p.m118048m(C26186e.m81987e(this.f84701d.f84688d.mo89090a(true)), C26186e.m81987e(this.f84701d.f84689e.mo89092a(true)), new C35142e(C35139a.f84702d));
            C41536l.m120488h(m, "combineLatest(\n         … ::Pair\n                )");
            return C31270e.m92879h(m, num.intValue());
        }
    }

    /* renamed from: ge.bog.mobilebank.transportcard.presentation.transportcardinfo.d$d */
    static final class C35140d extends C41537m implements C43075l {

        /* renamed from: d */
        final /* synthetic */ C35135d f84703d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C35140d(C35135d dVar) {
            super(1);
            this.f84703d = dVar;
        }

        /* renamed from: a */
        public final C35129a invoke(C31128a aVar) {
            C41536l.m120489i(aVar, "it");
            if (aVar instanceof C31128a.C31129a) {
                return C35129a.C35130a.f84682a;
            }
            if (aVar instanceof C31128a.C31130b) {
                return new C35129a.C35131b(aVar.mo71341b());
            }
            if (aVar instanceof C31128a.C31131c) {
                C39613a hw = this.f84703d.f84690f;
                Object a = aVar.mo71340a();
                C41536l.m120486f(a);
                Object e = ((C41224m) a).mo95678e();
                C41536l.m120488h(e, "it.data!!.first");
                Object a2 = aVar.mo71340a();
                C41536l.m120486f(a2);
                Object f = ((C41224m) a2).mo95680f();
                C41536l.m120488h(f, "it.data!!.second");
                return hw.mo93273a((List) e, (List) f);
            }
            throw new NoWhenBranchMatchedException();
        }
    }

    /* renamed from: ge.bog.mobilebank.transportcard.presentation.transportcardinfo.d$e */
    static final class C35141e extends C41537m implements C43075l {

        /* renamed from: d */
        final /* synthetic */ C35135d f84704d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C35141e(C35135d dVar) {
            super(1);
            this.f84704d = dVar;
        }

        /* renamed from: a */
        public final void mo86040a(C35129a aVar) {
            boolean z;
            this.f84704d.mo86025b().mo4826r(aVar);
            if (this.f84704d.f84691g.length() > 0) {
                z = true;
            } else {
                z = false;
            }
            if (z && (aVar instanceof C35129a.C35132c)) {
                this.f84704d.f84699o.onNext(this.f84704d.f84691g);
            }
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            mo86040a((C35129a) obj);
            return C41238w.f97225a;
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C35135d(C36361c cVar, C36363e eVar, C39613a aVar, String str, C37091a aVar2) {
        super((C41204a) null, 1, (DefaultConstructorMarker) null);
        C41536l.m120489i(cVar, "getActivePassesUseCase");
        C41536l.m120489i(eVar, "getMigratedPassDevicesUseCase");
        C41536l.m120489i(aVar, "activePassesUiStateUiMapper");
        C41536l.m120489i(str, "passType");
        C41536l.m120489i(aVar2, "delegate");
        this.f84688d = cVar;
        this.f84689e = eVar;
        this.f84690f = aVar;
        this.f84691g = str;
        this.f84692h = aVar2;
        C40767b h1 = C40767b.m118210h1();
        C41536l.m120488h(h1, "create<String>()");
        this.f84699o = h1;
        m103218sw();
        C41205b F0 = h1.mo94999Q0(600, TimeUnit.MILLISECONDS).mo94981F0(new C39255m(new C35136a(this)));
        C41536l.m120488h(F0, "buyTransportCardClickSub…ent(it)\n                }");
        bindToLifecycle(F0);
    }

    /* access modifiers changed from: private */
    public static final void _init_$lambda$0(C43075l lVar, Object obj) {
        C41536l.m120489i(lVar, "$tmp0");
        lVar.invoke(obj);
    }

    /* renamed from: sw */
    private final void m103218sw() {
        C40749p k0 = C40749p.m118047l0(onInit(), onRefresh()).mo94989L0(new C39256n(new C35138c(this))).mo95026k0(new C39257o(new C35140d(this)));
        C41536l.m120488h(k0, "private fun subscribeToI…ndToLifecycle()\n        }");
        C41205b F0 = C32343x.m95413R0(k0).mo94981F0(new C39258p(new C35141e(this)));
        C41536l.m120488h(F0, "private fun subscribeToI…ndToLifecycle()\n        }");
        bindToLifecycle(F0);
    }

    /* access modifiers changed from: private */
    /* renamed from: tw */
    public static final C40754t m103219tw(C43075l lVar, Object obj) {
        C41536l.m120489i(lVar, "$tmp0");
        return (C40754t) lVar.invoke(obj);
    }

    /* access modifiers changed from: private */
    /* renamed from: uw */
    public static final C35129a m103220uw(C43075l lVar, Object obj) {
        C41536l.m120489i(lVar, "$tmp0");
        return (C35129a) lVar.invoke(obj);
    }

    /* access modifiers changed from: private */
    /* renamed from: vw */
    public static final void m103221vw(C43075l lVar, Object obj) {
        C41536l.m120489i(lVar, "$tmp0");
        lVar.invoke(obj);
    }

    /* renamed from: Js */
    public void mo86021Js(String str, String str2) {
        C41536l.m120489i(str, "deviceId");
        C41536l.m120489i(str2, "deviceType");
        this.f84692h.mo86021Js(str, str2);
    }

    /* renamed from: ac */
    public void mo86024ac() {
        mo86035t4();
        this.f84699o.onNext("");
    }

    /* renamed from: mw */
    public C1644x mo86022Om() {
        return this.f84696l;
    }

    /* renamed from: nw */
    public final C39253k mo86028nw() {
        return this.f84693i;
    }

    /* renamed from: ow */
    public C1644x mo86026ib() {
        return this.f84698n;
    }

    /* renamed from: pw */
    public final C39254l mo86030pw() {
        return this.f84694j;
    }

    /* renamed from: qw */
    public C1644x mo86023Te() {
        return this.f84697m;
    }

    /* renamed from: rc */
    public void mo86032rc(long j) {
        this.f84692h.mo86032rc(j);
    }

    /* renamed from: rw */
    public C1644x mo86025b() {
        return this.f84695k;
    }

    /* renamed from: sd */
    public void mo86034sd(int i) {
        C36546y.m108282F().mo27152s("travel_card", "payments_category/more_menu/my_payments", "edit_button_click");
        Object f = mo86025b().mo4814f();
        C41536l.m120487g(f, "null cannot be cast to non-null type ge.bog.mobilebank.transportcard.presentation.transportcardinfo.ActivePassesUiState.Success");
        C39243a aVar = (C39243a) ((C35129a.C35132c) f).mo86017a().get(i);
        mo86032rc(aVar.mo92866b());
        if (aVar.mo92865a()) {
            Object f2 = mo86025b().mo4814f();
            C41536l.m120487g(f2, "null cannot be cast to non-null type ge.bog.mobilebank.transportcard.presentation.transportcardinfo.ActivePassesUiState.Success");
            String d = ((C39243a) ((C35129a.C35132c) f2).mo86017a().get(i)).mo92868d();
            Object f3 = mo86025b().mo4814f();
            C41536l.m120487g(f3, "null cannot be cast to non-null type ge.bog.mobilebank.transportcard.presentation.transportcardinfo.ActivePassesUiState.Success");
            mo86021Js(d, ((C39243a) ((C35129a.C35132c) f3).mo86017a().get(i)).mo92873h());
            C37224b.m109966e(mo86023Te(), C41238w.f97225a);
            return;
        }
        C37224b.m109966e(mo86026ib(), C41238w.f97225a);
    }

    /* renamed from: t4 */
    public void mo86035t4() {
        this.f84692h.mo86035t4();
    }
}
