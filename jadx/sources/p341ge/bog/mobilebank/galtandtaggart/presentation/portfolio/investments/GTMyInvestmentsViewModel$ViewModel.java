package p341ge.bog.mobilebank.galtandtaggart.presentation.portfolio.investments;

import androidx.lifecycle.C1644x;
import androidx.lifecycle.LiveData;
import b41.C31128a;
import c41.C31270e;
import de1.C40640a;
import ed1.C40749p;
import ed1.C40754t;
import ed1.C40762x;
import ee1.C40767b;
import gd1.C40992a;
import hd1.C41204a;
import hd1.C41205b;
import he1.C41224m;
import he1.C41233s;
import he1.C41238w;
import ig0.C25197e;
import ig0.C25198f;
import ig0.C25199g;
import ig0.C25200h;
import ig0.C25201i;
import ig0.C25202j;
import ig0.C25203k;
import ig0.C25204l;
import ig0.C25205m;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.C41536l;
import kotlin.jvm.internal.C41537m;
import kotlin.jvm.internal.DefaultConstructorMarker;
import p341ge.bog.mobilebank.cleanarch.presentation.common.C21481a;
import ue1.C43075l;
import we0.C29328d0;
import we0.C29358q;
import we0.C29359r;
import xe0.C29748f;

/* renamed from: ge.bog.mobilebank.galtandtaggart.presentation.portfolio.investments.GTMyInvestmentsViewModel$ViewModel */
public final class GTMyInvestmentsViewModel$ViewModel extends C21481a implements C25197e, C23710b {
    /* access modifiers changed from: private */

    /* renamed from: d */
    public final C29359r f61742d;

    /* renamed from: e */
    private final C29328d0 f61743e;

    /* renamed from: f */
    private final C29358q f61744f;

    /* renamed from: g */
    private final C25197e f61745g = this;

    /* renamed from: h */
    private final C23710b f61746h = this;

    /* renamed from: i */
    private List f61747i = C41341q.m119907j();

    /* renamed from: j */
    private final C40767b f61748j;

    /* renamed from: k */
    private final C1644x f61749k;

    /* renamed from: l */
    private final C1644x f61750l;

    /* renamed from: m */
    private final C1644x f61751m;

    /* renamed from: ge.bog.mobilebank.galtandtaggart.presentation.portfolio.investments.GTMyInvestmentsViewModel$ViewModel$a */
    static final class C23697a extends C41537m implements C43075l {

        /* renamed from: d */
        public static final C23697a f61752d = new C23697a();

        C23697a() {
            super(1);
        }

        /* renamed from: a */
        public final C41224m invoke(Integer num) {
            C41536l.m120489i(num, "it");
            return C41233s.m119492a(C41341q.m119907j(), 1);
        }
    }

    /* renamed from: ge.bog.mobilebank.galtandtaggart.presentation.portfolio.investments.GTMyInvestmentsViewModel$ViewModel$b */
    static final class C23698b extends C41537m implements C43075l {

        /* renamed from: d */
        public static final C23698b f61753d = new C23698b();

        C23698b() {
            super(1);
        }

        /* renamed from: a */
        public final C41224m invoke(Integer num) {
            C41536l.m120489i(num, "it");
            return C41233s.m119492a(C41341q.m119907j(), 2);
        }
    }

    /* renamed from: ge.bog.mobilebank.galtandtaggart.presentation.portfolio.investments.GTMyInvestmentsViewModel$ViewModel$c */
    static final class C23699c extends C41537m implements C43075l {

        /* renamed from: d */
        public static final C23699c f61754d = new C23699c();

        C23699c() {
            super(1);
        }

        /* renamed from: a */
        public final C41224m invoke(List list) {
            C41536l.m120489i(list, "it");
            return C41233s.m119492a(list, 5);
        }
    }

    /* renamed from: ge.bog.mobilebank.galtandtaggart.presentation.portfolio.investments.GTMyInvestmentsViewModel$ViewModel$d */
    static final class C23700d extends C41537m implements C43075l {

        /* renamed from: d */
        final /* synthetic */ GTMyInvestmentsViewModel$ViewModel f61755d;

        /* renamed from: ge.bog.mobilebank.galtandtaggart.presentation.portfolio.investments.GTMyInvestmentsViewModel$ViewModel$d$a */
        static final class C23701a extends C41537m implements C43075l {

            /* renamed from: d */
            public static final C23701a f61756d = new C23701a();

            C23701a() {
                super(1);
            }

            public final List invoke(List list) {
                C41536l.m120489i(list, "it");
                ArrayList arrayList = new ArrayList(C41343r.m119925u(list, 10));
                Iterator it = list.iterator();
                while (it.hasNext()) {
                    arrayList.add(new C23703f((C29748f) it.next()));
                }
                return arrayList;
            }
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C23700d(GTMyInvestmentsViewModel$ViewModel gTMyInvestmentsViewModel$ViewModel) {
            super(1);
            this.f61755d = gTMyInvestmentsViewModel$ViewModel;
        }

        /* access modifiers changed from: private */
        public static final List invoke$lambda$0(C43075l lVar, Object obj) {
            C41536l.m120489i(lVar, "$tmp0");
            return (List) lVar.invoke(obj);
        }

        /* renamed from: b */
        public final C40754t invoke(C41224m mVar) {
            C40762x xVar;
            C41536l.m120489i(mVar, "<name for destructuring parameter 0>");
            List list = (List) mVar.mo95675a();
            int intValue = ((Number) mVar.mo95676b()).intValue();
            if (intValue == 5) {
                xVar = C40762x.m118162z(list);
            } else {
                xVar = this.f61755d.f61742d.mo69208a().mo95062A(new C23711c(C23701a.f61756d));
            }
            C40749p O = xVar.mo95075O();
            C41536l.m120488h(O, "when (rc) {\n            …          .toObservable()");
            return C31270e.m92879h(O, intValue);
        }
    }

    /* renamed from: ge.bog.mobilebank.galtandtaggart.presentation.portfolio.investments.GTMyInvestmentsViewModel$ViewModel$e */
    static final class C23702e extends C41537m implements C43075l {

        /* renamed from: d */
        public static final C23702e f61757d = new C23702e();

        C23702e() {
            super(1);
        }

        public final void invoke(Throwable th) {
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((Throwable) obj);
            return C41238w.f97225a;
        }
    }

    /* renamed from: ge.bog.mobilebank.galtandtaggart.presentation.portfolio.investments.GTMyInvestmentsViewModel$ViewModel$f */
    public static final class C23703f {

        /* renamed from: a */
        private final C29748f f61758a;

        public C23703f(C29748f fVar) {
            C41536l.m120489i(fVar, "clientSymbol");
            this.f61758a = fVar;
        }

        /* renamed from: a */
        public final C29748f mo60596a() {
            return this.f61758a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof C23703f) && C41536l.m120484d(this.f61758a, ((C23703f) obj).f61758a);
        }

        public int hashCode() {
            return this.f61758a.hashCode();
        }

        public String toString() {
            C29748f fVar = this.f61758a;
            return "ClientSymbolListItem(clientSymbol=" + fVar + ")";
        }
    }

    /* renamed from: ge.bog.mobilebank.galtandtaggart.presentation.portfolio.investments.GTMyInvestmentsViewModel$ViewModel$g */
    static final class C23704g extends C41537m implements C43075l {

        /* renamed from: d */
        final /* synthetic */ String f61759d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C23704g(String str) {
            super(1);
            this.f61759d = str;
        }

        /* renamed from: a */
        public final C41224m invoke(List list) {
            C41536l.m120489i(list, "it");
            return new C41224m(this.f61759d, new C31128a.C31131c(list, 0, 2, (DefaultConstructorMarker) null));
        }
    }

    /* renamed from: ge.bog.mobilebank.galtandtaggart.presentation.portfolio.investments.GTMyInvestmentsViewModel$ViewModel$h */
    static final class C23705h extends C41537m implements C43075l {

        /* renamed from: d */
        final /* synthetic */ String f61760d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C23705h(String str) {
            super(1);
            this.f61760d = str;
        }

        /* renamed from: a */
        public final C41224m invoke(Throwable th) {
            C41536l.m120489i(th, "it");
            return new C41224m(this.f61760d, new C31128a.C31129a(th, 0, (Object) null, 6, (DefaultConstructorMarker) null));
        }
    }

    /* renamed from: ge.bog.mobilebank.galtandtaggart.presentation.portfolio.investments.GTMyInvestmentsViewModel$ViewModel$i */
    static final class C23706i extends C41537m implements C43075l {

        /* renamed from: d */
        final /* synthetic */ GTMyInvestmentsViewModel$ViewModel f61761d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C23706i(GTMyInvestmentsViewModel$ViewModel gTMyInvestmentsViewModel$ViewModel) {
            super(1);
            this.f61761d = gTMyInvestmentsViewModel$ViewModel;
        }

        /* renamed from: a */
        public final void mo60602a(C41224m mVar) {
            C1644x xw = this.f61761d.mo60580J2();
            GTMyInvestmentsViewModel$ViewModel gTMyInvestmentsViewModel$ViewModel = this.f61761d;
            synchronized (xw) {
                gTMyInvestmentsViewModel$ViewModel.mo60580J2().mo4826r(mVar);
                C41238w wVar = C41238w.f97225a;
            }
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            mo60602a((C41224m) obj);
            return C41238w.f97225a;
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public GTMyInvestmentsViewModel$ViewModel(C29359r rVar, C29328d0 d0Var, C29358q qVar) {
        super((C41204a) null, 1, (DefaultConstructorMarker) null);
        C41536l.m120489i(rVar, "getClientSymbolsUseCase");
        C41536l.m120489i(d0Var, "getSymbolHistoryUseCase");
        C41536l.m120489i(qVar, "getClientEquity");
        this.f61742d = rVar;
        this.f61743e = d0Var;
        this.f61744f = qVar;
        C40767b h1 = C40767b.m118210h1();
        C41536l.m120488h(h1, "create<List<ClientSymbolListItem>>()");
        this.f61748j = h1;
        this.f61749k = new C1644x();
        this.f61750l = new C1644x();
        C1644x xVar = new C1644x();
        this.f61751m = xVar;
        C40749p o0 = C40749p.m118049m0(onInit().mo95026k0(new C25198f(C23697a.f61752d)), onRefresh().mo95026k0(new C25199g(C23698b.f61753d)), h1.mo95026k0(new C25200h(C23699c.f61754d))).mo94989L0(new C25201i(new C23700d(this))).mo95027o0(C40992a.m118827a());
        C41536l.m120488h(o0, "merge(\n                o…dSchedulers.mainThread())");
        bindToLifecycle(C31270e.m92876e(o0, mo60581Mo()));
        C40749p O = qVar.mo69207a().mo95063B(C40992a.m118827a()).mo95072K(C40640a.m117458b()).mo95082k(new C25202j(C23702e.f61757d)).mo95075O();
        C41536l.m120488h(O, "getClientEquity()\n      …          .toObservable()");
        bindToLifecycle(C31270e.m92876e(C31270e.m92879h(O, 1), xVar));
    }

    /* access modifiers changed from: private */
    /* renamed from: lw */
    public static final C41224m m76552lw(C43075l lVar, Object obj) {
        C41536l.m120489i(lVar, "$tmp0");
        return (C41224m) lVar.invoke(obj);
    }

    /* access modifiers changed from: private */
    /* renamed from: mw */
    public static final C41224m m76553mw(C43075l lVar, Object obj) {
        C41536l.m120489i(lVar, "$tmp0");
        return (C41224m) lVar.invoke(obj);
    }

    /* access modifiers changed from: private */
    /* renamed from: nw */
    public static final C41224m m76554nw(C43075l lVar, Object obj) {
        C41536l.m120489i(lVar, "$tmp0");
        return (C41224m) lVar.invoke(obj);
    }

    /* access modifiers changed from: private */
    /* renamed from: ow */
    public static final C40754t m76555ow(C43075l lVar, Object obj) {
        C41536l.m120489i(lVar, "$tmp0");
        return (C40754t) lVar.invoke(obj);
    }

    /* access modifiers changed from: private */
    /* renamed from: pw */
    public static final void m76556pw(C43075l lVar, Object obj) {
        C41536l.m120489i(lVar, "$tmp0");
        lVar.invoke(obj);
    }

    /* access modifiers changed from: private */
    /* renamed from: uw */
    public static final C41224m m76558uw(C43075l lVar, Object obj) {
        C41536l.m120489i(lVar, "$tmp0");
        return (C41224m) lVar.invoke(obj);
    }

    /* access modifiers changed from: private */
    /* renamed from: vw */
    public static final C41224m m76559vw(C43075l lVar, Object obj) {
        C41536l.m120489i(lVar, "$tmp0");
        return (C41224m) lVar.invoke(obj);
    }

    /* access modifiers changed from: private */
    /* renamed from: ww */
    public static final void m76560ww(C43075l lVar, Object obj) {
        C41536l.m120489i(lVar, "$tmp0");
        lVar.invoke(obj);
    }

    /* renamed from: zw */
    private final boolean m76561zw(C29748f fVar, String str) {
        boolean z;
        if (C40440x.m117135K(fVar.mo69790g(), str, true)) {
            return true;
        }
        String f = fVar.mo69789f();
        if (f != null) {
            z = C40440x.m117135K(f, str, true);
        } else {
            z = false;
        }
        if (z) {
            return true;
        }
        return false;
    }

    /* renamed from: Ov */
    public void mo60582Ov(String str) {
        boolean z;
        C41536l.m120489i(str, "filter");
        ArrayList arrayList = new ArrayList();
        if (str.length() == 0) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            arrayList.addAll(this.f61747i);
        } else {
            List list = this.f61747i;
            ArrayList arrayList2 = new ArrayList();
            for (Object next : list) {
                if (m76561zw(((C23703f) next).mo60596a(), str)) {
                    arrayList2.add(next);
                }
            }
            arrayList.addAll(arrayList2);
        }
        this.f61748j.onNext(arrayList);
    }

    /* renamed from: k9 */
    public LiveData mo60583k9() {
        return this.f61751m;
    }

    /* renamed from: rw */
    public C1644x mo60581Mo() {
        return this.f61749k;
    }

    /* renamed from: sw */
    public final C25197e mo60585sw() {
        return this.f61745g;
    }

    /* renamed from: tw */
    public final C23710b mo60586tw() {
        return this.f61746h;
    }

    /* renamed from: xt */
    public void mo60587xt(String str) {
        C41536l.m120489i(str, "symbol");
        C41205b F0 = this.f61743e.mo69184a(str, (String) null, (String) null, 1, 1).mo95075O().mo95026k0(new C25203k(new C23704g(str))).mo95035t0(new C25204l(new C23705h(str))).mo94977D0(new C41224m(str, new C31128a.C31130b(0, (Object) null, 3, (DefaultConstructorMarker) null))).mo95027o0(C40992a.m118827a()).mo94981F0(new C25205m(new C23706i(this)));
        C41536l.m120488h(F0, "override fun getSymbolHi… .bindToLifecycle()\n    }");
        bindToLifecycle(F0);
    }

    /* renamed from: xw */
    public C1644x mo60580J2() {
        return this.f61750l;
    }

    /* renamed from: yw */
    public final void mo60589yw(List list) {
        C41536l.m120489i(list, "list");
        this.f61747i = list;
        Iterator it = list.iterator();
        while (it.hasNext()) {
            mo60587xt(((C23703f) it.next()).mo60596a().mo69790g());
        }
    }
}
