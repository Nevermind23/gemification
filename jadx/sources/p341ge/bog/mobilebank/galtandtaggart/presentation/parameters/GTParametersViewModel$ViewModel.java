package p341ge.bog.mobilebank.galtandtaggart.presentation.parameters;

import androidx.lifecycle.C1644x;
import b41.C31128a;
import b41.C31132b;
import c41.C31270e;
import ed1.C40749p;
import ed1.C40754t;
import ed1.C40762x;
import ee1.C40767b;
import gd1.C40992a;
import gg0.C24715d;
import gg0.C24716e;
import gg0.C24717f;
import gg0.C24718g;
import gg0.C24719h;
import gg0.C24720i;
import hd1.C41204a;
import hd1.C41205b;
import he1.C41224m;
import he1.C41238w;
import ie0.C25190j;
import java.util.List;
import kotlin.jvm.internal.C41536l;
import kotlin.jvm.internal.C41537m;
import kotlin.jvm.internal.DefaultConstructorMarker;
import p341ge.bog.mobilebank.cleanarch.presentation.common.C21481a;
import p341ge.bog.mobilebank.model.Client;
import p729cv.C19799c;
import ue1.C43075l;
import ue1.C43079p;
import we0.C29326c0;
import we0.C29327d;
import we0.C29340j;
import xe0.C29751i;

/* renamed from: ge.bog.mobilebank.galtandtaggart.presentation.parameters.GTParametersViewModel$ViewModel */
public final class GTParametersViewModel$ViewModel extends C21481a implements C24715d, C24716e {
    /* access modifiers changed from: private */

    /* renamed from: d */
    public final C29326c0 f61688d;
    /* access modifiers changed from: private */

    /* renamed from: e */
    public final C29327d f61689e;
    /* access modifiers changed from: private */

    /* renamed from: f */
    public final C29340j f61690f;

    /* renamed from: g */
    private final C19799c f61691g;

    /* renamed from: h */
    private final Client f61692h;

    /* renamed from: i */
    private final C24715d f61693i = this;

    /* renamed from: j */
    private final C24716e f61694j = this;

    /* renamed from: k */
    private final C40767b f61695k;

    /* renamed from: l */
    private final C1644x f61696l;

    /* renamed from: m */
    private final C1644x f61697m;

    /* renamed from: n */
    private final C1644x f61698n;

    /* renamed from: o */
    private final C1644x f61699o;
    /* access modifiers changed from: private */

    /* renamed from: p */
    public boolean f61700p;

    /* renamed from: ge.bog.mobilebank.galtandtaggart.presentation.parameters.GTParametersViewModel$ViewModel$a */
    static final class C23664a extends C41537m implements C43075l {

        /* renamed from: d */
        final /* synthetic */ GTParametersViewModel$ViewModel f61701d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C23664a(GTParametersViewModel$ViewModel gTParametersViewModel$ViewModel) {
            super(1);
            this.f61701d = gTParametersViewModel$ViewModel;
        }

        /* renamed from: a */
        public final C40754t invoke(C41238w wVar) {
            C41536l.m120489i(wVar, "it");
            return C31270e.m92878g(this.f61701d.f61690f.mo69194a(), 1);
        }
    }

    /* renamed from: ge.bog.mobilebank.galtandtaggart.presentation.parameters.GTParametersViewModel$ViewModel$b */
    static final class C23665b extends C41537m implements C43075l {

        /* renamed from: d */
        final /* synthetic */ GTParametersViewModel$ViewModel f61702d;

        /* renamed from: ge.bog.mobilebank.galtandtaggart.presentation.parameters.GTParametersViewModel$ViewModel$b$a */
        static final class C23666a extends C41537m implements C43075l {

            /* renamed from: d */
            final /* synthetic */ GTParametersViewModel$ViewModel f61703d;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            C23666a(GTParametersViewModel$ViewModel gTParametersViewModel$ViewModel) {
                super(1);
                this.f61703d = gTParametersViewModel$ViewModel;
            }

            /* renamed from: a */
            public final void mo60556a(C41238w wVar) {
                C41536l.m120489i(wVar, "it");
                this.f61703d.f61700p = true;
            }

            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                mo60556a((C41238w) obj);
                return C41238w.f97225a;
            }
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C23665b(GTParametersViewModel$ViewModel gTParametersViewModel$ViewModel) {
            super(1);
            this.f61702d = gTParametersViewModel$ViewModel;
        }

        /* renamed from: a */
        public final void mo60555a(C31128a aVar) {
            C41536l.m120488h(aVar, "result");
            C31132b.m92648j(aVar, (int[]) null, new C23666a(this.f61702d), 1, (Object) null);
            this.f61702d.mo60543ba().mo4823o(aVar);
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            mo60555a((C31128a) obj);
            return C41238w.f97225a;
        }
    }

    /* renamed from: ge.bog.mobilebank.galtandtaggart.presentation.parameters.GTParametersViewModel$ViewModel$c */
    static final class C23667c extends C41537m implements C43075l {

        /* renamed from: d */
        final /* synthetic */ GTParametersViewModel$ViewModel f61704d;

        /* renamed from: ge.bog.mobilebank.galtandtaggart.presentation.parameters.GTParametersViewModel$ViewModel$c$a */
        static final class C23668a extends C41537m implements C43079p {

            /* renamed from: d */
            public static final C23668a f61705d = new C23668a();

            C23668a() {
                super(2);
            }

            /* renamed from: a */
            public final C41224m invoke(C29751i iVar, List list) {
                C41536l.m120489i(iVar, "overview");
                C41536l.m120489i(list, "params");
                return new C41224m(iVar, list);
            }
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C23667c(GTParametersViewModel$ViewModel gTParametersViewModel$ViewModel) {
            super(1);
            this.f61704d = gTParametersViewModel$ViewModel;
        }

        /* access modifiers changed from: private */
        /* renamed from: c */
        public static final C41224m m76506c(C43079p pVar, Object obj, Object obj2) {
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
            C40749p O = C40762x.m118154T(C40762x.m118161w(this.f61704d.f61688d.mo69182a(z)), this.f61704d.f61689e.mo69183a(), new C23679c(C23668a.f61705d)).mo95075O();
            C41536l.m120488h(O, "zip(\n                   …         }.toObservable()");
            return C31270e.m92879h(O, num.intValue());
        }
    }

    /* renamed from: ge.bog.mobilebank.galtandtaggart.presentation.parameters.GTParametersViewModel$ViewModel$d */
    static final class C23669d extends C41537m implements C43075l {

        /* renamed from: d */
        final /* synthetic */ GTParametersViewModel$ViewModel f61706d;

        /* renamed from: ge.bog.mobilebank.galtandtaggart.presentation.parameters.GTParametersViewModel$ViewModel$d$a */
        static final class C23670a extends C41537m implements C43075l {

            /* renamed from: d */
            final /* synthetic */ GTParametersViewModel$ViewModel f61707d;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            C23670a(GTParametersViewModel$ViewModel gTParametersViewModel$ViewModel) {
                super(1);
                this.f61707d = gTParametersViewModel$ViewModel;
            }

            /* renamed from: a */
            public final void mo60560a(C41224m mVar) {
                this.f61707d.mo60542R8().mo4823o(new C31128a.C31131c(mVar.mo95678e(), 0, 2, (DefaultConstructorMarker) null));
                this.f61707d.mo60540Fi().mo4823o(new C31128a.C31131c(mVar.mo95680f(), 0, 2, (DefaultConstructorMarker) null));
            }

            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                mo60560a((C41224m) obj);
                return C41238w.f97225a;
            }
        }

        /* renamed from: ge.bog.mobilebank.galtandtaggart.presentation.parameters.GTParametersViewModel$ViewModel$d$b */
        static final class C23671b extends C41537m implements C43075l {

            /* renamed from: d */
            final /* synthetic */ GTParametersViewModel$ViewModel f61708d;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            C23671b(GTParametersViewModel$ViewModel gTParametersViewModel$ViewModel) {
                super(1);
                this.f61708d = gTParametersViewModel$ViewModel;
            }

            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                invoke((Throwable) obj);
                return C41238w.f97225a;
            }

            public final void invoke(Throwable th) {
                C41536l.m120489i(th, "it");
                this.f61708d.mo60542R8().mo4823o(new C31128a.C31129a(th, 0, (Object) null, 6, (DefaultConstructorMarker) null));
            }
        }

        /* renamed from: ge.bog.mobilebank.galtandtaggart.presentation.parameters.GTParametersViewModel$ViewModel$d$c */
        static final class C23672c extends C41537m implements C43075l {

            /* renamed from: d */
            final /* synthetic */ GTParametersViewModel$ViewModel f61709d;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            C23672c(GTParametersViewModel$ViewModel gTParametersViewModel$ViewModel) {
                super(1);
                this.f61709d = gTParametersViewModel$ViewModel;
            }

            /* renamed from: a */
            public final void mo60562a(C41224m mVar) {
                this.f61709d.mo60542R8().mo4823o(new C31128a.C31130b(0, (Object) null, 3, (DefaultConstructorMarker) null));
            }

            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                mo60562a((C41224m) obj);
                return C41238w.f97225a;
            }
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C23669d(GTParametersViewModel$ViewModel gTParametersViewModel$ViewModel) {
            super(1);
            this.f61706d = gTParametersViewModel$ViewModel;
        }

        /* renamed from: a */
        public final void mo60559a(C31128a aVar) {
            C41536l.m120488h(aVar, "result");
            C31132b.m92648j(aVar, (int[]) null, new C23670a(this.f61706d), 1, (Object) null);
            C31132b.m92643e(aVar, (int[]) null, new C23671b(this.f61706d), 1, (Object) null);
            C31132b.m92646h(aVar, (int[]) null, new C23672c(this.f61706d), 1, (Object) null);
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            mo60559a((C31128a) obj);
            return C41238w.f97225a;
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public GTParametersViewModel$ViewModel(C29326c0 c0Var, C29327d dVar, C29340j jVar, C19799c cVar, Client client) {
        super((C41204a) null, 1, (DefaultConstructorMarker) null);
        C41536l.m120489i(c0Var, "getPortfolioOverview");
        C41536l.m120489i(dVar, "checkGTClosableUseCase");
        C41536l.m120489i(jVar, "gtCloseUseCase");
        C41536l.m120489i(cVar, "getProductTypeListUseCase");
        C41536l.m120489i(client, "client");
        this.f61688d = c0Var;
        this.f61689e = dVar;
        this.f61690f = jVar;
        this.f61691g = cVar;
        this.f61692h = client;
        C40767b h1 = C40767b.m118210h1();
        C41536l.m120488h(h1, "create<Unit>()");
        this.f61695k = h1;
        this.f61696l = new C1644x();
        this.f61697m = new C1644x();
        this.f61698n = new C1644x();
        this.f61699o = new C1644x();
        m76485ww();
        m76482tw();
    }

    /* renamed from: tw */
    private final void m76482tw() {
        C41205b F0 = this.f61695k.mo94989L0(new C24717f(new C23664a(this))).mo95027o0(C40992a.m118827a()).mo94981F0(new C24718g(new C23665b(this)));
        C41536l.m120488h(F0, "private fun subscribeToC…ndToLifecycle()\n        }");
        bindToLifecycle(F0);
    }

    /* access modifiers changed from: private */
    /* renamed from: uw */
    public static final C40754t m76483uw(C43075l lVar, Object obj) {
        C41536l.m120489i(lVar, "$tmp0");
        return (C40754t) lVar.invoke(obj);
    }

    /* access modifiers changed from: private */
    /* renamed from: vw */
    public static final void m76484vw(C43075l lVar, Object obj) {
        C41536l.m120489i(lVar, "$tmp0");
        lVar.invoke(obj);
    }

    /* renamed from: ww */
    private final void m76485ww() {
        C41205b F0 = C40749p.m118047l0(onRefresh(), onInit()).mo94989L0(new C24719h(new C23667c(this))).mo95027o0(C40992a.m118827a()).mo94981F0(new C24720i(new C23669d(this)));
        C41536l.m120488h(F0, "private fun subscribeToI…ndToLifecycle()\n        }");
        bindToLifecycle(F0);
    }

    /* access modifiers changed from: private */
    /* renamed from: xw */
    public static final C40754t m76486xw(C43075l lVar, Object obj) {
        C41536l.m120489i(lVar, "$tmp0");
        return (C40754t) lVar.invoke(obj);
    }

    /* access modifiers changed from: private */
    /* renamed from: yw */
    public static final void m76487yw(C43075l lVar, Object obj) {
        C41536l.m120489i(lVar, "$tmp0");
        lVar.invoke(obj);
    }

    /* renamed from: l */
    public void mo60544l() {
        mo60541Po().mo4823o(Boolean.valueOf(this.f61700p));
    }

    /* renamed from: lw */
    public int mo60545lw() {
        if (this.f61692h.getUserInfo().isSolo() || this.f61692h.getUserInfo().isWealth()) {
            return C25190j.gt_close_desc_solo;
        }
        return C25190j.gt_close_desc;
    }

    /* renamed from: mw */
    public C1644x mo60543ba() {
        return this.f61698n;
    }

    /* renamed from: nw */
    public int mo60547nw() {
        if (this.f61692h.getUserInfo().isSolo() || this.f61692h.getUserInfo().isWealth()) {
            return C25190j.gt_actionsheet_secendory_title_close_account_solo;
        }
        return C25190j.gt_actionsheet_secendory_title_close_account;
    }

    /* renamed from: ow */
    public final C24715d mo60548ow() {
        return this.f61693i;
    }

    /* renamed from: pn */
    public void mo60549pn() {
        this.f61695k.onNext(C41238w.f97225a);
    }

    /* renamed from: pw */
    public C1644x mo60541Po() {
        return this.f61699o;
    }

    /* renamed from: qw */
    public final C24716e mo60551qw() {
        return this.f61694j;
    }

    /* renamed from: rw */
    public C1644x mo60540Fi() {
        return this.f61697m;
    }

    /* renamed from: sw */
    public C1644x mo60542R8() {
        return this.f61696l;
    }
}
