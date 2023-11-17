package p341ge.bog.mobilebank.galtandtaggart.presentation.shared;

import androidx.lifecycle.C1644x;
import b41.C31128a;
import b41.C31132b;
import c41.C31270e;
import ed1.C40749p;
import ed1.C40754t;
import ee1.C40767b;
import gd1.C40992a;
import hd1.C41204a;
import hd1.C41205b;
import he1.C41224m;
import he1.C41233s;
import he1.C41238w;
import java.util.Date;
import java.util.Iterator;
import kg0.C25728d;
import kg0.C25729e;
import kg0.C25730f;
import kg0.C25731g;
import kg0.C25732h;
import kg0.C25733i;
import kotlin.jvm.internal.C41536l;
import kotlin.jvm.internal.C41537m;
import kotlin.jvm.internal.DefaultConstructorMarker;
import o31.C37595e;
import p341ge.bog.mobilebank.cleanarch.presentation.common.C21481a;
import ue1.C43075l;
import ue1.C43079p;
import ug0.C28775a;
import we0.C29324b0;
import we0.C29326c0;
import we0.C29362u;
import xe0.C29751i;

/* renamed from: ge.bog.mobilebank.galtandtaggart.presentation.shared.GTPortfolioViewModel$ViewModel */
public final class GTPortfolioViewModel$ViewModel extends C21481a implements C25729e, C25730f {
    /* access modifiers changed from: private */

    /* renamed from: d */
    public final C29326c0 f61859d;
    /* access modifiers changed from: private */

    /* renamed from: e */
    public final C29324b0 f61860e;
    /* access modifiers changed from: private */

    /* renamed from: f */
    public final C29362u f61861f;

    /* renamed from: g */
    private final C25729e f61862g = this;

    /* renamed from: h */
    private final C25730f f61863h = this;

    /* renamed from: i */
    private final C40767b f61864i;

    /* renamed from: j */
    private final C1644x f61865j;

    /* renamed from: k */
    private final C1644x f61866k;

    /* renamed from: l */
    private final C1644x f61867l;

    /* renamed from: ge.bog.mobilebank.galtandtaggart.presentation.shared.GTPortfolioViewModel$ViewModel$a */
    static final class C23769a extends C41537m implements C43075l {

        /* renamed from: d */
        final /* synthetic */ GTPortfolioViewModel$ViewModel f61868d;

        /* renamed from: ge.bog.mobilebank.galtandtaggart.presentation.shared.GTPortfolioViewModel$ViewModel$a$a */
        static final class C23770a extends C41537m implements C43079p {

            /* renamed from: d */
            public static final C23770a f61869d = new C23770a();

            C23770a() {
                super(2);
            }

            /* renamed from: a */
            public final C41224m invoke(C29751i iVar, Boolean bool) {
                C41536l.m120489i(iVar, "portfolio");
                C41536l.m120489i(bool, "market");
                return new C41224m(iVar, bool);
            }
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C23769a(GTPortfolioViewModel$ViewModel gTPortfolioViewModel$ViewModel) {
            super(1);
            this.f61868d = gTPortfolioViewModel$ViewModel;
        }

        /* access modifiers changed from: private */
        /* renamed from: c */
        public static final C41224m m76760c(C43079p pVar, Object obj, Object obj2) {
            C41536l.m120489i(pVar, "$tmp0");
            return (C41224m) pVar.invoke(obj, obj2);
        }

        /* renamed from: b */
        public final C40754t invoke(Integer num) {
            C41536l.m120489i(num, "requestCode");
            boolean z = true;
            if (!(num.intValue() == 2 || num.intValue() == 1)) {
                z = false;
            }
            C40749p d1 = C40749p.m118037d1(this.f61868d.f61859d.mo69182a(z), this.f61868d.f61861f.mo69210b().mo95075O(), new C23776a(C23770a.f61869d));
            C41536l.m120488h(d1, "zip(\n                   …      }\n                )");
            return C31270e.m92879h(d1, num.intValue());
        }
    }

    /* renamed from: ge.bog.mobilebank.galtandtaggart.presentation.shared.GTPortfolioViewModel$ViewModel$b */
    static final class C23771b extends C41537m implements C43075l {

        /* renamed from: d */
        final /* synthetic */ GTPortfolioViewModel$ViewModel f61870d;

        /* renamed from: ge.bog.mobilebank.galtandtaggart.presentation.shared.GTPortfolioViewModel$ViewModel$b$a */
        static final class C23772a extends C41537m implements C43075l {

            /* renamed from: d */
            final /* synthetic */ GTPortfolioViewModel$ViewModel f61871d;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            C23772a(GTPortfolioViewModel$ViewModel gTPortfolioViewModel$ViewModel) {
                super(1);
                this.f61871d = gTPortfolioViewModel$ViewModel;
            }

            /* renamed from: a */
            public final void mo60699a(C41224m mVar) {
                this.f61871d.getPortfolioOverview().mo4823o(new C31128a.C31131c(mVar.mo95678e(), 0, 2, (DefaultConstructorMarker) null));
                this.f61871d.mo60695u().mo4823o(new C31128a.C31131c(mVar.mo95680f(), 0, 2, (DefaultConstructorMarker) null));
            }

            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                mo60699a((C41224m) obj);
                return C41238w.f97225a;
            }
        }

        /* renamed from: ge.bog.mobilebank.galtandtaggart.presentation.shared.GTPortfolioViewModel$ViewModel$b$b */
        static final class C23773b extends C41537m implements C43075l {

            /* renamed from: d */
            final /* synthetic */ GTPortfolioViewModel$ViewModel f61872d;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            C23773b(GTPortfolioViewModel$ViewModel gTPortfolioViewModel$ViewModel) {
                super(1);
                this.f61872d = gTPortfolioViewModel$ViewModel;
            }

            /* renamed from: a */
            public final void mo60700a(C41224m mVar) {
                this.f61872d.getPortfolioOverview().mo4823o(new C31128a.C31130b(0, (Object) null, 3, (DefaultConstructorMarker) null));
                this.f61872d.mo60695u().mo4823o(new C31128a.C31130b(0, (Object) null, 3, (DefaultConstructorMarker) null));
            }

            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                mo60700a((C41224m) obj);
                return C41238w.f97225a;
            }
        }

        /* renamed from: ge.bog.mobilebank.galtandtaggart.presentation.shared.GTPortfolioViewModel$ViewModel$b$c */
        static final class C23774c extends C41537m implements C43075l {

            /* renamed from: d */
            final /* synthetic */ GTPortfolioViewModel$ViewModel f61873d;

            /* renamed from: e */
            final /* synthetic */ C31128a f61874e;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            C23774c(GTPortfolioViewModel$ViewModel gTPortfolioViewModel$ViewModel, C31128a aVar) {
                super(1);
                this.f61873d = gTPortfolioViewModel$ViewModel;
                this.f61874e = aVar;
            }

            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                invoke((Throwable) obj);
                return C41238w.f97225a;
            }

            public final void invoke(Throwable th) {
                C41536l.m120489i(th, "it");
                Throwable th2 = th;
                this.f61873d.getPortfolioOverview().mo4823o(new C31128a.C31129a(th2, this.f61874e.mo71341b(), (Object) null, 4, (DefaultConstructorMarker) null));
                this.f61873d.mo60695u().mo4823o(new C31128a.C31129a(th2, this.f61874e.mo71341b(), (Object) null, 4, (DefaultConstructorMarker) null));
            }
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C23771b(GTPortfolioViewModel$ViewModel gTPortfolioViewModel$ViewModel) {
            super(1);
            this.f61870d = gTPortfolioViewModel$ViewModel;
        }

        /* renamed from: a */
        public final void mo60698a(C31128a aVar) {
            C41536l.m120488h(aVar, "res");
            C31132b.m92648j(aVar, (int[]) null, new C23772a(this.f61870d), 1, (Object) null);
            C31132b.m92646h(aVar, (int[]) null, new C23773b(this.f61870d), 1, (Object) null);
            C31132b.m92643e(aVar, (int[]) null, new C23774c(this.f61870d, aVar), 1, (Object) null);
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            mo60698a((C31128a) obj);
            return C41238w.f97225a;
        }
    }

    /* renamed from: ge.bog.mobilebank.galtandtaggart.presentation.shared.GTPortfolioViewModel$ViewModel$c */
    static final class C23775c extends C41537m implements C43075l {

        /* renamed from: d */
        final /* synthetic */ GTPortfolioViewModel$ViewModel f61875d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C23775c(GTPortfolioViewModel$ViewModel gTPortfolioViewModel$ViewModel) {
            super(1);
            this.f61875d = gTPortfolioViewModel$ViewModel;
        }

        /* renamed from: a */
        public final C40754t invoke(C41224m mVar) {
            String str;
            C41536l.m120489i(mVar, "<name for destructuring parameter 0>");
            String str2 = (String) mVar.mo95675a();
            int intValue = ((Number) mVar.mo95676b()).intValue();
            boolean z = true;
            if (!(intValue == 2 || intValue == 1)) {
                z = false;
            }
            C31128a aVar = (C31128a) this.f61875d.getPortfolioOverview().mo4814f();
            String str3 = null;
            if (aVar == null || !(aVar instanceof C31128a.C31131c) || !C41536l.m120484d(str2, "1000m")) {
                str = null;
            } else {
                str3 = ((C29751i) ((C31128a.C31131c) aVar).mo71340a()).mo69807f();
                str = C37595e.m110568d(new Date());
            }
            C40749p O = this.f61875d.f61860e.mo69180a(str2, z, str3, str).mo95075O();
            C41536l.m120488h(O, "getPortfolioHistory(\n   …          .toObservable()");
            return C31270e.m92879h(O, intValue);
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public GTPortfolioViewModel$ViewModel(C29326c0 c0Var, C29324b0 b0Var, C29362u uVar) {
        super((C41204a) null, 1, (DefaultConstructorMarker) null);
        C41536l.m120489i(c0Var, "getPortfolioOverview");
        C41536l.m120489i(b0Var, "getPortfolioHistory");
        C41536l.m120489i(uVar, "getGTMarketIsOpen");
        this.f61859d = c0Var;
        this.f61860e = b0Var;
        this.f61861f = uVar;
        C40767b h1 = C40767b.m118210h1();
        C41536l.m120488h(h1, "create<Pair<String, Int>>()");
        this.f61864i = h1;
        this.f61865j = new C1644x();
        this.f61866k = new C1644x();
        this.f61867l = new C1644x();
        C41205b F0 = C40749p.m118047l0(onRefresh(), onInit()).mo94989L0(new C25731g(new C23769a(this))).mo95027o0(C40992a.m118827a()).mo94981F0(new C25732h(new C23771b(this)));
        C41536l.m120488h(F0, "merge(onRefresh(), onIni…      }\n                }");
        bindToLifecycle(F0);
        C40749p o0 = h1.mo94989L0(new C25733i(new C23775c(this))).mo95027o0(C40992a.m118827a());
        C41536l.m120488h(o0, "periodPortfolioHistorySu…dSchedulers.mainThread())");
        bindToLifecycle(C31270e.m92876e(o0, mo60688Ld()));
    }

    /* access modifiers changed from: private */
    /* renamed from: gw */
    public static final C40754t m76745gw(C43075l lVar, Object obj) {
        C41536l.m120489i(lVar, "$tmp0");
        return (C40754t) lVar.invoke(obj);
    }

    /* access modifiers changed from: private */
    /* renamed from: hw */
    public static final void m76746hw(C43075l lVar, Object obj) {
        C41536l.m120489i(lVar, "$tmp0");
        lVar.invoke(obj);
    }

    /* access modifiers changed from: private */
    /* renamed from: iw */
    public static final C40754t m76747iw(C43075l lVar, Object obj) {
        C41536l.m120489i(lVar, "$tmp0");
        return (C40754t) lVar.invoke(obj);
    }

    /* renamed from: H6 */
    public void mo60687H6(String str, int i) {
        Object obj;
        String str2;
        C41536l.m120489i(str, "period");
        Iterator it = C25728d.f65490b.iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            }
            obj = it.next();
            if (C41536l.m120484d(str, ((C28775a.C28782d) ((C41224m) obj).mo95675a()).mo68514b())) {
                break;
            }
        }
        C41224m mVar = (C41224m) obj;
        if (mVar == null || (str2 = (String) mVar.mo95680f()) == null) {
            str2 = "";
        }
        this.f61864i.onNext(C41233s.m119492a(str2, Integer.valueOf(i)));
    }

    /* renamed from: mw */
    public final C25729e mo60690mw() {
        return this.f61862g;
    }

    /* renamed from: nw */
    public C1644x mo60695u() {
        return this.f61867l;
    }

    /* renamed from: ow */
    public final C25730f mo60692ow() {
        return this.f61863h;
    }

    /* renamed from: pw */
    public C1644x mo60688Ld() {
        return this.f61865j;
    }

    /* renamed from: qw */
    public C1644x getPortfolioOverview() {
        return this.f61866k;
    }
}
