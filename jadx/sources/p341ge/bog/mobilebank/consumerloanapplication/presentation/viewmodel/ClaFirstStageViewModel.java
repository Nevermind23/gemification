package p341ge.bog.mobilebank.consumerloanapplication.presentation.viewmodel;

import android.os.Bundle;
import androidx.lifecycle.C1644x;
import androidx.lifecycle.LiveData;
import ed1.C40754t;
import ed1.C40762x;
import ee1.C40767b;
import g91.C32343x;
import gd1.C40992a;
import h00.C24846c;
import h90.C24922c;
import hd1.C41204a;
import hd1.C41205b;
import he1.C41224m;
import he1.C41233s;
import he1.C41238w;
import iu0.C36546y;
import j90.C25355a;
import j90.C25356b;
import j90.C25360c;
import j90.C25361d;
import java.math.BigDecimal;
import java.util.List;
import java.util.concurrent.TimeUnit;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.C41535k;
import kotlin.jvm.internal.C41536l;
import kotlin.jvm.internal.C41537m;
import kotlin.jvm.internal.DefaultConstructorMarker;
import o90.C26769a0;
import o90.C26782b0;
import o90.C26786c0;
import o90.C26790d0;
import o90.C26794e0;
import o90.C26798f0;
import o90.C26808g0;
import o90.C26817h0;
import o90.C26821i0;
import o90.C26825j0;
import o90.C26886v;
import o90.C26904w;
import o90.C26907x;
import o90.C26910y;
import o90.C26913z;
import p341ge.bog.mobilebank.cleanarch.lookup.presenttation.model.LookupUiModel;
import p341ge.bog.mobilebank.cleanarch.presentation.common.C21481a;
import p341ge.bog.mobilebank.cleanarch.presentation.common.C21484c;
import p341ge.bog.mobilebank.consumerloanapplication.presentation.model.common.ClaDetailsUiModel;
import p341ge.bog.mobilebank.consumerloanapplication.presentation.model.common.ResultData;
import p380ck.C10464h;
import p842nv.C26615g;
import p842nv.C26617h;
import p855oy.C27094a;
import p897tp.C28474a;
import q80.C27687a;
import q80.C27689c;
import r80.C27947a;
import r80.C27948b;
import t80.C28328e;
import ue1.C43075l;
import ue1.C43079p;
import w80.C29243b;
import x80.C29660d;

/* renamed from: ge.bog.mobilebank.consumerloanapplication.presentation.viewmodel.ClaFirstStageViewModel */
public final class ClaFirstStageViewModel extends C21481a {

    /* renamed from: C */
    public static final C22712c f59938C = new C22712c((DefaultConstructorMarker) null);

    /* renamed from: A */
    private final C1644x f59939A;

    /* renamed from: B */
    private final C1644x f59940B;

    /* renamed from: d */
    private final C26615g f59941d;

    /* renamed from: e */
    private final C29243b f59942e;

    /* renamed from: f */
    private final C28328e f59943f;

    /* renamed from: g */
    private final C27689c f59944g;
    /* access modifiers changed from: private */

    /* renamed from: h */
    public final C27687a f59945h;
    /* access modifiers changed from: private */

    /* renamed from: i */
    public final C26617h f59946i;
    /* access modifiers changed from: private */

    /* renamed from: j */
    public final C24922c f59947j;

    /* renamed from: k */
    private final C27094a f59948k;

    /* renamed from: l */
    private final C28474a f59949l;

    /* renamed from: m */
    private final C40767b f59950m;

    /* renamed from: n */
    private final C40767b f59951n;
    /* access modifiers changed from: private */

    /* renamed from: o */
    public ClaDetailsUiModel f59952o;
    /* access modifiers changed from: private */

    /* renamed from: p */
    public C25355a f59953p;
    /* access modifiers changed from: private */

    /* renamed from: q */
    public final C1644x f59954q;

    /* renamed from: r */
    private final LiveData f59955r;

    /* renamed from: s */
    private final C1644x f59956s;

    /* renamed from: t */
    private final LiveData f59957t;
    /* access modifiers changed from: private */

    /* renamed from: u */
    public final C1644x f59958u = new C1644x();
    /* access modifiers changed from: private */

    /* renamed from: v */
    public final C1644x f59959v = new C1644x();
    /* access modifiers changed from: private */

    /* renamed from: w */
    public final C1644x f59960w = new C1644x();
    /* access modifiers changed from: private */

    /* renamed from: x */
    public final C1644x f59961x;

    /* renamed from: y */
    private final LiveData f59962y;

    /* renamed from: z */
    private final C1644x f59963z;

    /* renamed from: ge.bog.mobilebank.consumerloanapplication.presentation.viewmodel.ClaFirstStageViewModel$a */
    static final class C22708a extends C41537m implements C43075l {

        /* renamed from: d */
        final /* synthetic */ ClaFirstStageViewModel f59964d;

        /* renamed from: ge.bog.mobilebank.consumerloanapplication.presentation.viewmodel.ClaFirstStageViewModel$a$a */
        static final class C22709a extends C41537m implements C43075l {

            /* renamed from: d */
            public static final C22709a f59965d = new C22709a();

            C22709a() {
                super(1);
            }

            /* renamed from: a */
            public final C25356b invoke(C27948b bVar) {
                C41536l.m120489i(bVar, "it");
                return new C25356b.C25359c(bVar);
            }
        }

        /* renamed from: ge.bog.mobilebank.consumerloanapplication.presentation.viewmodel.ClaFirstStageViewModel$a$b */
        static final class C22710b extends C41537m implements C43075l {

            /* renamed from: d */
            public static final C22710b f59966d = new C22710b();

            C22710b() {
                super(1);
            }

            /* renamed from: a */
            public final C25356b invoke(Throwable th) {
                C41536l.m120489i(th, "it");
                return new C25356b.C25357a(th);
            }
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C22708a(ClaFirstStageViewModel claFirstStageViewModel) {
            super(1);
            this.f59964d = claFirstStageViewModel;
        }

        /* access modifiers changed from: private */
        /* renamed from: d */
        public static final C25356b m73686d(C43075l lVar, Object obj) {
            C41536l.m120489i(lVar, "$tmp0");
            return (C25356b) lVar.invoke(obj);
        }

        /* access modifiers changed from: private */
        /* renamed from: e */
        public static final C25356b m73687e(C43075l lVar, Object obj) {
            C41536l.m120489i(lVar, "$tmp0");
            return (C25356b) lVar.invoke(obj);
        }

        /* renamed from: c */
        public final C40754t invoke(C41224m mVar) {
            C41536l.m120489i(mVar, "<name for destructuring parameter 0>");
            return this.f59964d.f59945h.mo67227a((String) mVar.mo95675a(), (String) mVar.mo95676b()).mo95075O().mo95026k0(new C22728a(C22709a.f59965d)).mo95035t0(new C22729b(C22710b.f59966d)).mo94977D0(C25356b.C25358b.f65004a);
        }
    }

    /* renamed from: ge.bog.mobilebank.consumerloanapplication.presentation.viewmodel.ClaFirstStageViewModel$b */
    static final class C22711b extends C41537m implements C43075l {

        /* renamed from: d */
        final /* synthetic */ ClaFirstStageViewModel f59967d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C22711b(ClaFirstStageViewModel claFirstStageViewModel) {
            super(1);
            this.f59967d = claFirstStageViewModel;
        }

        /* renamed from: a */
        public final void mo56275a(C25356b bVar) {
            ClaDetailsUiModel claDetailsUiModel = null;
            if (bVar instanceof C25356b.C25358b) {
                C21484c.m69417i(this.f59967d.f59960w, (Object) null, 1, (Object) null);
            } else if (bVar instanceof C25356b.C25359c) {
                String bigDecimal = ((C25356b.C25359c) bVar).mo63936a().mo67530a().toString();
                C41536l.m120488h(bigDecimal, "loanCalculationResult.lo…tion.pmtAmount.toString()");
                ClaDetailsUiModel yw = this.f59967d.f59952o;
                if (yw == null) {
                    C41536l.m120506z("loanData");
                } else {
                    claDetailsUiModel = yw;
                }
                C21484c.m69418j(this.f59967d.f59960w, new C25360c(bigDecimal, claDetailsUiModel.mo56192g()));
            } else if (bVar instanceof C25356b.C25357a) {
                C21484c.m69415g(this.f59967d.f59960w, ((C25356b.C25357a) bVar).mo63932a(), (Object) null, 2, (Object) null);
            }
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            mo56275a((C25356b) obj);
            return C41238w.f97225a;
        }
    }

    /* renamed from: ge.bog.mobilebank.consumerloanapplication.presentation.viewmodel.ClaFirstStageViewModel$c */
    public static final class C22712c {
        private C22712c() {
        }

        public /* synthetic */ C22712c(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    /* renamed from: ge.bog.mobilebank.consumerloanapplication.presentation.viewmodel.ClaFirstStageViewModel$d */
    /* synthetic */ class C22713d extends C41535k implements C43075l {
        C22713d(Object obj) {
            super(1, obj, C27094a.class, "transform", "transform(Ljava/util/List;)Ljava/util/List;", 0);
        }

        public final List invoke(List list) {
            C41536l.m120489i(list, "p0");
            return ((C27094a) this.receiver).mo66388b(list);
        }
    }

    /* renamed from: ge.bog.mobilebank.consumerloanapplication.presentation.viewmodel.ClaFirstStageViewModel$e */
    static final class C22714e extends C41537m implements C43079p {

        /* renamed from: d */
        final /* synthetic */ ClaFirstStageViewModel f59968d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C22714e(ClaFirstStageViewModel claFirstStageViewModel) {
            super(2);
            this.f59968d = claFirstStageViewModel;
        }

        /* renamed from: a */
        public final ClaDetailsUiModel invoke(C27947a aVar, List list) {
            C27947a aVar2 = aVar;
            C41536l.m120489i(aVar2, "loanDetails");
            C41536l.m120489i(list, "terms");
            return ClaDetailsUiModel.m73498b(this.f59968d.f59947j.mo63333a(aVar2), 0, (String) null, (String) null, (String) null, 0, 0, (BigDecimal) null, (BigDecimal) null, (BigDecimal) null, (String) null, (String) null, (String) null, list, C11051p3.f31758b, (Object) null);
        }
    }

    /* renamed from: ge.bog.mobilebank.consumerloanapplication.presentation.viewmodel.ClaFirstStageViewModel$f */
    static final class C22715f extends C41537m implements C43075l {

        /* renamed from: d */
        final /* synthetic */ ClaFirstStageViewModel f59969d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C22715f(ClaFirstStageViewModel claFirstStageViewModel) {
            super(1);
            this.f59969d = claFirstStageViewModel;
        }

        /* renamed from: a */
        public final void mo56278a(C41205b bVar) {
            C21484c.m69417i(this.f59969d.f59954q, (Object) null, 1, (Object) null);
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            mo56278a((C41205b) obj);
            return C41238w.f97225a;
        }
    }

    /* renamed from: ge.bog.mobilebank.consumerloanapplication.presentation.viewmodel.ClaFirstStageViewModel$g */
    static final class C22716g extends C41537m implements C43075l {

        /* renamed from: d */
        final /* synthetic */ ClaFirstStageViewModel f59970d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C22716g(ClaFirstStageViewModel claFirstStageViewModel) {
            super(1);
            this.f59970d = claFirstStageViewModel;
        }

        /* renamed from: a */
        public final void mo56279a(ClaDetailsUiModel claDetailsUiModel) {
            ClaFirstStageViewModel claFirstStageViewModel = this.f59970d;
            C41536l.m120488h(claDetailsUiModel, "loanDetails");
            claFirstStageViewModel.m73629Yw(claDetailsUiModel);
            C21484c.m69418j(this.f59970d.f59954q, claDetailsUiModel);
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            mo56279a((ClaDetailsUiModel) obj);
            return C41238w.f97225a;
        }
    }

    /* renamed from: ge.bog.mobilebank.consumerloanapplication.presentation.viewmodel.ClaFirstStageViewModel$h */
    static final class C22717h extends C41537m implements C43075l {

        /* renamed from: d */
        final /* synthetic */ ClaFirstStageViewModel f59971d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C22717h(ClaFirstStageViewModel claFirstStageViewModel) {
            super(1);
            this.f59971d = claFirstStageViewModel;
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((Throwable) obj);
            return C41238w.f97225a;
        }

        public final void invoke(Throwable th) {
            C21484c.m69415g(this.f59971d.f59954q, th, (Object) null, 2, (Object) null);
        }
    }

    /* renamed from: ge.bog.mobilebank.consumerloanapplication.presentation.viewmodel.ClaFirstStageViewModel$i */
    static final class C22718i extends C41537m implements C43075l {

        /* renamed from: d */
        public static final C22718i f59972d = new C22718i();

        C22718i() {
            super(1);
        }

        /* renamed from: a */
        public final List invoke(Throwable th) {
            C41536l.m120489i(th, "it");
            return C41341q.m119907j();
        }
    }

    /* renamed from: ge.bog.mobilebank.consumerloanapplication.presentation.viewmodel.ClaFirstStageViewModel$j */
    static final class C22719j extends C41537m implements C43075l {

        /* renamed from: d */
        final /* synthetic */ ClaFirstStageViewModel f59973d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C22719j(ClaFirstStageViewModel claFirstStageViewModel) {
            super(1);
            this.f59973d = claFirstStageViewModel;
        }

        /* renamed from: a */
        public final void mo56282a(C41205b bVar) {
            C21484c.m69417i(this.f59973d.f59958u, (Object) null, 1, (Object) null);
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            mo56282a((C41205b) obj);
            return C41238w.f97225a;
        }
    }

    /* renamed from: ge.bog.mobilebank.consumerloanapplication.presentation.viewmodel.ClaFirstStageViewModel$k */
    static final class C22720k extends C41537m implements C43075l {

        /* renamed from: d */
        final /* synthetic */ ClaFirstStageViewModel f59974d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C22720k(ClaFirstStageViewModel claFirstStageViewModel) {
            super(1);
            this.f59974d = claFirstStageViewModel;
        }

        /* renamed from: a */
        public final void mo56283a(List list) {
            ClaFirstStageViewModel claFirstStageViewModel = this.f59974d;
            C41536l.m120488h(list, "offers");
            if (claFirstStageViewModel.m73622Mw(list) != null) {
                this.f59974d.f59946i.mo65871a();
                this.f59974d.m73636ex();
            } else {
                C1644x Ew = this.f59974d.f59961x;
                ClaDetailsUiModel yw = this.f59974d.f59952o;
                if (yw == null) {
                    C41536l.m120506z("loanData");
                    yw = null;
                }
                Ew.mo4823o(C32343x.m95466m(yw));
            }
            C21484c.m69418j(this.f59974d.f59958u, C41238w.f97225a);
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            mo56283a((List) obj);
            return C41238w.f97225a;
        }
    }

    /* renamed from: ge.bog.mobilebank.consumerloanapplication.presentation.viewmodel.ClaFirstStageViewModel$l */
    /* synthetic */ class C22721l extends C41535k implements C43075l {

        /* renamed from: d */
        public static final C22721l f59975d = new C22721l();

        C22721l() {
            super(1, C25361d.C25363b.class, "<init>", "<init>(Lge/bog/mobilebank/consumerloanapplication/domain/prepareapplication/model/PrepareApplication;)V", 0);
        }

        /* renamed from: b */
        public final C25361d.C25363b invoke(C29660d dVar) {
            C41536l.m120489i(dVar, "p0");
            return new C25361d.C25363b(dVar);
        }
    }

    /* renamed from: ge.bog.mobilebank.consumerloanapplication.presentation.viewmodel.ClaFirstStageViewModel$m */
    static final class C22722m extends C41537m implements C43075l {

        /* renamed from: d */
        final /* synthetic */ ClaFirstStageViewModel f59976d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C22722m(ClaFirstStageViewModel claFirstStageViewModel) {
            super(1);
            this.f59976d = claFirstStageViewModel;
        }

        /* renamed from: a */
        public final void mo56285a(C41205b bVar) {
            C21484c.m69417i(this.f59976d.f59959v, (Object) null, 1, (Object) null);
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            mo56285a((C41205b) obj);
            return C41238w.f97225a;
        }
    }

    /* renamed from: ge.bog.mobilebank.consumerloanapplication.presentation.viewmodel.ClaFirstStageViewModel$n */
    static final class C22723n extends C41537m implements C43075l {

        /* renamed from: d */
        final /* synthetic */ ClaFirstStageViewModel f59977d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C22723n(ClaFirstStageViewModel claFirstStageViewModel) {
            super(1);
            this.f59977d = claFirstStageViewModel;
        }

        /* renamed from: a */
        public final void mo56286a(C25361d dVar) {
            C21484c.m69418j(this.f59977d.f59959v, C41238w.f97225a);
            ClaFirstStageViewModel claFirstStageViewModel = this.f59977d;
            C41536l.m120488h(dVar, "response");
            claFirstStageViewModel.m73633cx(dVar);
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            mo56286a((C25361d) obj);
            return C41238w.f97225a;
        }
    }

    /* renamed from: ge.bog.mobilebank.consumerloanapplication.presentation.viewmodel.ClaFirstStageViewModel$o */
    static final class C22724o extends C41537m implements C43075l {

        /* renamed from: d */
        final /* synthetic */ ClaFirstStageViewModel f59978d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C22724o(ClaFirstStageViewModel claFirstStageViewModel) {
            super(1);
            this.f59978d = claFirstStageViewModel;
        }

        /* renamed from: a */
        public final void mo56287a(String str) {
            try {
                C41536l.m120488h(str, "amountText");
                BigDecimal bigDecimal = new BigDecimal(str);
                C25355a uw = this.f59978d.f59953p;
                if (uw == null) {
                    C41536l.m120506z("appData");
                    uw = null;
                }
                if (!C41536l.m120484d(uw.mo63921b(), bigDecimal)) {
                    C25355a uw2 = this.f59978d.f59953p;
                    if (uw2 == null) {
                        C41536l.m120506z("appData");
                        uw2 = null;
                    }
                    uw2.mo63927g(bigDecimal);
                    this.f59978d.m73640gx();
                    this.f59978d.m73638fx();
                    if (this.f59978d.m73662ub(bigDecimal)) {
                        this.f59978d.m73621Lw();
                    }
                }
            } catch (Exception unused) {
                C25355a uw3 = this.f59978d.f59953p;
                if (uw3 == null) {
                    C41536l.m120506z("appData");
                    uw3 = null;
                }
                uw3.mo63927g((BigDecimal) null);
                this.f59978d.m73638fx();
                this.f59978d.m73640gx();
            }
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            mo56287a((String) obj);
            return C41238w.f97225a;
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ClaFirstStageViewModel(C26615g gVar, C29243b bVar, C28328e eVar, C27689c cVar, C27687a aVar, C26617h hVar, C24922c cVar2, C27094a aVar2, C28474a aVar3) {
        super((C41204a) null, 1, (DefaultConstructorMarker) null);
        C27689c cVar3 = cVar;
        C27687a aVar4 = aVar;
        C26617h hVar2 = hVar;
        C24922c cVar4 = cVar2;
        C27094a aVar5 = aVar2;
        C28474a aVar6 = aVar3;
        C41536l.m120489i(gVar, "getOffersUseCase");
        C41536l.m120489i(bVar, "prepareApplicationUseCase");
        C41536l.m120489i(eVar, "getLoanTermLookupUseCase");
        C41536l.m120489i(cVar3, "getLoanDetailsUseCase");
        C41536l.m120489i(aVar4, "calculateLoanPayment");
        C41536l.m120489i(hVar2, "refreshOffers");
        C41536l.m120489i(cVar4, "detailsMapper");
        C41536l.m120489i(aVar5, "lookupUiMapper");
        C41536l.m120489i(aVar6, "applicationEventPoster");
        this.f59941d = gVar;
        this.f59942e = bVar;
        this.f59943f = eVar;
        this.f59944g = cVar3;
        this.f59945h = aVar4;
        this.f59946i = hVar2;
        this.f59947j = cVar4;
        this.f59948k = aVar5;
        this.f59949l = aVar6;
        C40767b h1 = C40767b.m118210h1();
        C41536l.m120488h(h1, "create<Pair<String, String>>()");
        this.f59950m = h1;
        C40767b h12 = C40767b.m118210h1();
        C41536l.m120488h(h12, "create<String>()");
        this.f59951n = h12;
        C1644x xVar = new C1644x();
        this.f59954q = xVar;
        this.f59955r = xVar;
        C1644x xVar2 = new C1644x();
        this.f59956s = xVar2;
        this.f59957t = xVar2;
        C1644x xVar3 = new C1644x();
        this.f59961x = xVar3;
        this.f59962y = xVar3;
        this.f59963z = new C1644x();
        this.f59939A = new C1644x();
        this.f59940B = new C1644x();
        m73623Pw();
        m73656px();
        C41205b F0 = h1.mo94989L0(new C26790d0(new C22708a(this))).mo95027o0(C40992a.m118827a()).mo94981F0(new C26794e0(new C22711b(this)));
        C41536l.m120488h(F0, "calculationSubject.switc…          }\n            }");
        bindToLifecycle(F0);
        C32343x.m95397J0(this, "applications_cl", "cl_first_page", "opened_cl_app_page_1", C10464h.C10465a.FACEBOOKANDFIREBASE, (Bundle) null, 16, (Object) null);
    }

    /* access modifiers changed from: private */
    /* renamed from: Lw */
    public final void m73621Lw() {
        C25355a aVar = this.f59953p;
        C25355a aVar2 = null;
        if (aVar == null) {
            C41536l.m120506z("appData");
            aVar = null;
        }
        if (aVar.mo63921b() != null) {
            C25355a aVar3 = this.f59953p;
            if (aVar3 == null) {
                C41536l.m120506z("appData");
                aVar3 = null;
            }
            if (aVar3.mo63922c() != null) {
                C25355a aVar4 = this.f59953p;
                if (aVar4 == null) {
                    C41536l.m120506z("appData");
                    aVar4 = null;
                }
                if (m73662ub(aVar4.mo63921b())) {
                    C40767b bVar = this.f59950m;
                    C25355a aVar5 = this.f59953p;
                    if (aVar5 == null) {
                        C41536l.m120506z("appData");
                        aVar5 = null;
                    }
                    String valueOf = String.valueOf(aVar5.mo63921b());
                    C25355a aVar6 = this.f59953p;
                    if (aVar6 == null) {
                        C41536l.m120506z("appData");
                    } else {
                        aVar2 = aVar6;
                    }
                    LookupUiModel c = aVar2.mo63922c();
                    C41536l.m120486f(c);
                    bVar.onNext(C41233s.m119492a(valueOf, c.mo52393d()));
                }
            }
        }
    }

    /* access modifiers changed from: private */
    /* JADX WARNING: Removed duplicated region for block: B:16:0x0045 A[Catch:{ Exception -> 0x0089 }, RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:17:0x0046 A[Catch:{ Exception -> 0x0089 }] */
    /* JADX WARNING: Removed duplicated region for block: B:33:0x007f A[Catch:{ Exception -> 0x0089 }] */
    /* JADX WARNING: Removed duplicated region for block: B:41:0x0084 A[SYNTHETIC] */
    /* renamed from: Mw */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final p341ge.bog.mobilebank.cleanarch.domain.offer.model.OfferInfo m73622Mw(java.util.List r10) {
        /*
            r9 = this;
            r0 = 0
            java.math.BigDecimal r1 = new java.math.BigDecimal     // Catch:{ Exception -> 0x0089 }
            java.lang.String r2 = "credit.application.CL.compare.existing.offer.amount"
            r3 = 0
            java.lang.Object[] r4 = new java.lang.Object[r3]     // Catch:{ Exception -> 0x0089 }
            java.lang.String r2 = g91.C32343x.m95388F(r2, r4)     // Catch:{ Exception -> 0x0089 }
            r1.<init>(r2)     // Catch:{ Exception -> 0x0089 }
            java.math.BigDecimal r2 = java.math.BigDecimal.ZERO     // Catch:{ Exception -> 0x0089 }
            int r2 = r1.compareTo(r2)     // Catch:{ Exception -> 0x0089 }
            r4 = 1
            if (r2 <= 0) goto L_0x001a
            r2 = r4
            goto L_0x001b
        L_0x001a:
            r2 = r3
        L_0x001b:
            j90.a r5 = r9.f59953p     // Catch:{ Exception -> 0x0089 }
            if (r5 != 0) goto L_0x0025
            java.lang.String r5 = "appData"
            kotlin.jvm.internal.C41536l.m120506z(r5)     // Catch:{ Exception -> 0x0089 }
            r5 = r0
        L_0x0025:
            java.math.BigDecimal r5 = r5.mo63921b()     // Catch:{ Exception -> 0x0089 }
            if (r5 == 0) goto L_0x0042
            java.math.BigDecimal r1 = r5.multiply(r1)     // Catch:{ Exception -> 0x0089 }
            java.lang.String r5 = "this.multiply(other)"
            kotlin.jvm.internal.C41536l.m120488h(r1, r5)     // Catch:{ Exception -> 0x0089 }
            if (r1 == 0) goto L_0x0042
            java.math.BigDecimal r5 = new java.math.BigDecimal     // Catch:{ Exception -> 0x0089 }
            java.lang.String r6 = "100"
            r5.<init>(r6)     // Catch:{ Exception -> 0x0089 }
            java.math.BigDecimal r1 = r1.divide(r5)     // Catch:{ Exception -> 0x0089 }
            goto L_0x0043
        L_0x0042:
            r1 = r0
        L_0x0043:
            if (r1 != 0) goto L_0x0046
            return r0
        L_0x0046:
            java.util.Iterator r10 = r10.iterator()     // Catch:{ Exception -> 0x0089 }
        L_0x004a:
            boolean r5 = r10.hasNext()     // Catch:{ Exception -> 0x0089 }
            if (r5 == 0) goto L_0x0085
            java.lang.Object r5 = r10.next()     // Catch:{ Exception -> 0x0089 }
            r6 = r5
            ge.bog.mobilebank.cleanarch.domain.offer.model.OfferInfo r6 = (p341ge.bog.mobilebank.cleanarch.domain.offer.model.OfferInfo) r6     // Catch:{ Exception -> 0x0089 }
            ge.bog.mobilebank.cleanarch.domain.offer.model.OfferProductCode r7 = r6.getProductCode()     // Catch:{ Exception -> 0x0089 }
            ge.bog.mobilebank.cleanarch.domain.offer.model.OfferProductCode$CL r8 = p341ge.bog.mobilebank.cleanarch.domain.offer.model.OfferProductCode.C21008CL.f56471f     // Catch:{ Exception -> 0x0089 }
            boolean r7 = kotlin.jvm.internal.C41536l.m120484d(r7, r8)     // Catch:{ Exception -> 0x0089 }
            if (r7 == 0) goto L_0x0081
            if (r2 == 0) goto L_0x007c
            java.lang.String r6 = r6.getOfferAmount()     // Catch:{ Exception -> 0x0089 }
            if (r6 == 0) goto L_0x0071
            java.math.BigDecimal r7 = new java.math.BigDecimal     // Catch:{ Exception -> 0x0089 }
            r7.<init>(r6)     // Catch:{ Exception -> 0x0089 }
            goto L_0x0073
        L_0x0071:
            java.math.BigDecimal r7 = java.math.BigDecimal.ZERO     // Catch:{ Exception -> 0x0089 }
        L_0x0073:
            int r6 = r7.compareTo(r1)     // Catch:{ Exception -> 0x0089 }
            if (r6 < 0) goto L_0x007a
            goto L_0x007c
        L_0x007a:
            r6 = r3
            goto L_0x007d
        L_0x007c:
            r6 = r4
        L_0x007d:
            if (r6 == 0) goto L_0x0081
            r6 = r4
            goto L_0x0082
        L_0x0081:
            r6 = r3
        L_0x0082:
            if (r6 == 0) goto L_0x004a
            goto L_0x0086
        L_0x0085:
            r5 = r0
        L_0x0086:
            ge.bog.mobilebank.cleanarch.domain.offer.model.OfferInfo r5 = (p341ge.bog.mobilebank.cleanarch.domain.offer.model.OfferInfo) r5     // Catch:{ Exception -> 0x0089 }
            r0 = r5
        L_0x0089:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: p341ge.bog.mobilebank.consumerloanapplication.presentation.viewmodel.ClaFirstStageViewModel.m73622Mw(java.util.List):ge.bog.mobilebank.cleanarch.domain.offer.model.OfferInfo");
    }

    /* renamed from: Pw */
    private final void m73623Pw() {
        C41205b I = C40762x.m118154T(this.f59944g.mo67228c(), this.f59943f.mo67970a().mo95062A(new C26825j0(new C22713d(this.f59948k))), new C26904w(new C22714e(this))).mo95063B(C40992a.m118827a()).mo95083l(new C26907x(new C22715f(this))).mo95070I(new C26910y(new C22716g(this)), new C26913z(new C22717h(this)));
        C41536l.m120488h(I, "private fun getLoanDetai…).bindToLifecycle()\n    }");
        bindToLifecycle(I);
    }

    /* access modifiers changed from: private */
    /* renamed from: Qw */
    public static final void m73624Qw(C43075l lVar, Object obj) {
        C41536l.m120489i(lVar, "$tmp0");
        lVar.invoke(obj);
    }

    /* access modifiers changed from: private */
    /* renamed from: Rw */
    public static final void m73625Rw(C43075l lVar, Object obj) {
        C41536l.m120489i(lVar, "$tmp0");
        lVar.invoke(obj);
    }

    /* access modifiers changed from: private */
    /* renamed from: Sw */
    public static final List m73626Sw(C43075l lVar, Object obj) {
        C41536l.m120489i(lVar, "$tmp0");
        return (List) lVar.invoke(obj);
    }

    /* access modifiers changed from: private */
    /* renamed from: Tw */
    public static final ClaDetailsUiModel m73627Tw(C43079p pVar, Object obj, Object obj2) {
        C41536l.m120489i(pVar, "$tmp0");
        return (ClaDetailsUiModel) pVar.invoke(obj, obj2);
    }

    /* access modifiers changed from: private */
    /* renamed from: Uw */
    public static final void m73628Uw(C43075l lVar, Object obj) {
        C41536l.m120489i(lVar, "$tmp0");
        lVar.invoke(obj);
    }

    /* access modifiers changed from: private */
    /* renamed from: Yw */
    public final void m73629Yw(ClaDetailsUiModel claDetailsUiModel) {
        this.f59952o = claDetailsUiModel;
        this.f59953p = new C25355a(claDetailsUiModel.mo56192g(), (BigDecimal) null, (LookupUiModel) null, (String) null, 14, (DefaultConstructorMarker) null);
    }

    /* access modifiers changed from: private */
    /* renamed from: Zw */
    public static final List m73630Zw(C43075l lVar, Object obj) {
        C41536l.m120489i(lVar, "$tmp0");
        return (List) lVar.invoke(obj);
    }

    /* access modifiers changed from: private */
    /* renamed from: ax */
    public static final void m73631ax(C43075l lVar, Object obj) {
        C41536l.m120489i(lVar, "$tmp0");
        lVar.invoke(obj);
    }

    /* access modifiers changed from: private */
    /* renamed from: bx */
    public static final void m73632bx(C43075l lVar, Object obj) {
        C41536l.m120489i(lVar, "$tmp0");
        lVar.invoke(obj);
    }

    /* access modifiers changed from: private */
    /* renamed from: cx */
    public final void m73633cx(C25361d dVar) {
        if (dVar instanceof C25361d.C25363b) {
            m73653nx();
            if (C41358y.m119999O(C41341q.m119910m(C24846c.A, C24846c.B, C24846c.M, C24846c.R), C24846c.f63808e.mo63281a(((C25361d.C25363b) dVar).mo63949a().mo69598a().mo69593b()))) {
                this.f59946i.mo65871a();
            }
            this.f59949l.mo68096b();
            m73642hx(dVar);
        } else if (dVar instanceof C25361d.C25362a) {
            m73642hx(dVar);
        } else {
            throw new NoWhenBranchMatchedException();
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: ex */
    public final void m73636ex() {
        C1644x xVar = this.f59963z;
        C24846c cVar = C24846c.A;
        C25355a aVar = this.f59953p;
        ClaDetailsUiModel claDetailsUiModel = null;
        if (aVar == null) {
            C41536l.m120506z("appData");
            aVar = null;
        }
        BigDecimal b = aVar.mo63921b();
        C41536l.m120486f(b);
        C25355a aVar2 = this.f59953p;
        if (aVar2 == null) {
            C41536l.m120506z("appData");
            aVar2 = null;
        }
        LookupUiModel c = aVar2.mo63922c();
        C41536l.m120486f(c);
        String d = c.mo52393d();
        ClaDetailsUiModel claDetailsUiModel2 = this.f59952o;
        if (claDetailsUiModel2 == null) {
            C41536l.m120506z("loanData");
        } else {
            claDetailsUiModel = claDetailsUiModel2;
        }
        xVar.mo4823o(C32343x.m95466m(new ResultData(true, cVar, (String) null, (String) null, b, d, claDetailsUiModel.mo56192g(), 8, (DefaultConstructorMarker) null)));
    }

    /* access modifiers changed from: private */
    /* renamed from: fx */
    public final void m73638fx() {
        C1644x xVar = this.f59940B;
        C25355a aVar = this.f59953p;
        if (aVar == null) {
            C41536l.m120506z("appData");
            aVar = null;
        }
        xVar.mo4823o(Boolean.valueOf(!m73662ub(aVar.mo63921b())));
    }

    /* access modifiers changed from: private */
    /* renamed from: gx */
    public final void m73640gx() {
        boolean z;
        C25355a aVar = this.f59953p;
        C25355a aVar2 = null;
        if (aVar == null) {
            C41536l.m120506z("appData");
            aVar = null;
        }
        if (aVar.mo63924e()) {
            C25355a aVar3 = this.f59953p;
            if (aVar3 == null) {
                C41536l.m120506z("appData");
            } else {
                aVar2 = aVar3;
            }
            if (m73662ub(aVar2.mo63921b())) {
                z = true;
                this.f59939A.mo4823o(Boolean.valueOf(z));
            }
        }
        z = false;
        this.f59939A.mo4823o(Boolean.valueOf(z));
    }

    /* JADX WARNING: Removed duplicated region for block: B:35:0x0071  */
    /* JADX WARNING: Removed duplicated region for block: B:39:0x0085  */
    /* JADX WARNING: Removed duplicated region for block: B:45:0x0097  */
    /* JADX WARNING: Removed duplicated region for block: B:48:0x00a6  */
    /* JADX WARNING: Removed duplicated region for block: B:51:0x00b9  */
    /* renamed from: hx */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final void m73642hx(j90.C25361d r14) {
        /*
            r13 = this;
            boolean r0 = r14 instanceof j90.C25361d.C25363b
            r1 = 0
            if (r0 == 0) goto L_0x0009
            r2 = r14
            j90.d$b r2 = (j90.C25361d.C25363b) r2
            goto L_0x000a
        L_0x0009:
            r2 = r1
        L_0x000a:
            if (r2 == 0) goto L_0x0011
            x80.d r2 = r2.mo63949a()
            goto L_0x0012
        L_0x0011:
            r2 = r1
        L_0x0012:
            boolean r3 = r14 instanceof j90.C25361d.C25362a
            if (r3 == 0) goto L_0x001a
            r4 = r14
            j90.d$a r4 = (j90.C25361d.C25362a) r4
            goto L_0x001b
        L_0x001a:
            r4 = r1
        L_0x001b:
            if (r4 == 0) goto L_0x0022
            java.lang.Throwable r4 = r4.mo63945a()
            goto L_0x0023
        L_0x0022:
            r4 = r1
        L_0x0023:
            r5 = 0
            if (r0 == 0) goto L_0x0040
            j90.d$b r14 = (j90.C25361d.C25363b) r14
            x80.d r14 = r14.mo63949a()
            x80.c r14 = r14.mo69598a()
            java.lang.String r14 = r14.mo69594c()
            if (r14 == 0) goto L_0x003e
            java.lang.Object[] r0 = new java.lang.Object[r5]
            java.lang.String r14 = g91.C32343x.m95388F(r14, r0)
        L_0x003c:
            r8 = r14
            goto L_0x006f
        L_0x003e:
            r8 = r1
            goto L_0x006f
        L_0x0040:
            if (r3 == 0) goto L_0x00df
            j90.d$a r14 = (j90.C25361d.C25362a) r14
            java.lang.Throwable r14 = r14.mo63945a()
            boolean r0 = r14 instanceof p341ge.bog.mobilebank.shared2.network.ApiError
            if (r0 == 0) goto L_0x004f
            ge.bog.mobilebank.shared2.network.ApiError r14 = (p341ge.bog.mobilebank.shared2.network.ApiError) r14
            goto L_0x0050
        L_0x004f:
            r14 = r1
        L_0x0050:
            if (r14 == 0) goto L_0x0066
            ge.bog.mobilebank.shared2.network.BankApiResponse r14 = r14.mo84685a()
            if (r14 == 0) goto L_0x0066
            java.lang.String r14 = r14.getKey()
            if (r14 == 0) goto L_0x0066
            java.lang.Object[] r0 = new java.lang.Object[r5]
            java.lang.String r14 = g91.C32343x.m95388F(r14, r0)
            if (r14 != 0) goto L_0x003c
        L_0x0066:
            int r14 = p366bk.C10328q.f28955d2
            java.lang.Object[] r0 = new java.lang.Object[r5]
            java.lang.String r14 = g91.C32343x.m95452h0(r14, r0)
            goto L_0x003c
        L_0x006f:
            if (r2 == 0) goto L_0x0085
            h00.c$a r14 = h00.C24846c.f63808e
            x80.c r0 = r2.mo69598a()
            java.lang.String r0 = r0.mo69593b()
            h00.c r14 = r14.mo63281a(r0)
            if (r14 != 0) goto L_0x0083
            h00.c r14 = h00.C24846c.ERROR
        L_0x0083:
            r7 = r14
            goto L_0x008f
        L_0x0085:
            boolean r14 = r4 instanceof java.net.SocketTimeoutException
            if (r14 == 0) goto L_0x008c
            h00.c r14 = h00.C24846c.TIME_OUT
            goto L_0x0083
        L_0x008c:
            h00.c r14 = h00.C24846c.ERROR
            goto L_0x0083
        L_0x008f:
            androidx.lifecycle.x r14 = r13.f59963z
            j90.a r0 = r13.f59953p
            java.lang.String r3 = "appData"
            if (r0 != 0) goto L_0x009b
            kotlin.jvm.internal.C41536l.m120506z(r3)
            r0 = r1
        L_0x009b:
            java.math.BigDecimal r10 = r0.mo63921b()
            kotlin.jvm.internal.C41536l.m120486f(r10)
            j90.a r0 = r13.f59953p
            if (r0 != 0) goto L_0x00aa
            kotlin.jvm.internal.C41536l.m120506z(r3)
            r0 = r1
        L_0x00aa:
            ge.bog.mobilebank.cleanarch.lookup.presenttation.model.LookupUiModel r0 = r0.mo63922c()
            kotlin.jvm.internal.C41536l.m120486f(r0)
            java.lang.String r11 = r0.mo52393d()
            ge.bog.mobilebank.consumerloanapplication.presentation.model.common.ClaDetailsUiModel r0 = r13.f59952o
            if (r0 != 0) goto L_0x00bf
            java.lang.String r0 = "loanData"
            kotlin.jvm.internal.C41536l.m120506z(r0)
            r0 = r1
        L_0x00bf:
            java.lang.String r12 = r0.mo56192g()
            if (r2 == 0) goto L_0x00cf
            x80.c r0 = r2.mo69598a()
            if (r0 == 0) goto L_0x00cf
            java.lang.String r1 = r0.mo69592a()
        L_0x00cf:
            r9 = r1
            ge.bog.mobilebank.consumerloanapplication.presentation.model.common.ResultData r0 = new ge.bog.mobilebank.consumerloanapplication.presentation.model.common.ResultData
            r6 = 1
            r5 = r0
            r5.<init>(r6, r7, r8, r9, r10, r11, r12)
            m41.a r0 = g91.C32343x.m95466m(r0)
            r14.mo4823o(r0)
            return
        L_0x00df:
            kotlin.NoWhenBranchMatchedException r14 = new kotlin.NoWhenBranchMatchedException
            r14.<init>()
            throw r14
        */
        throw new UnsupportedOperationException("Method not decompiled: p341ge.bog.mobilebank.consumerloanapplication.presentation.viewmodel.ClaFirstStageViewModel.m73642hx(j90.d):void");
    }

    /* renamed from: ix */
    private final void m73644ix() {
        C25355a aVar = this.f59953p;
        C25355a aVar2 = null;
        if (aVar == null) {
            C41536l.m120506z("appData");
            aVar = null;
        }
        if (aVar.mo63926f()) {
            C29243b bVar = this.f59942e;
            ClaDetailsUiModel claDetailsUiModel = this.f59952o;
            if (claDetailsUiModel == null) {
                C41536l.m120506z("loanData");
                claDetailsUiModel = null;
            }
            String h = claDetailsUiModel.mo56193h();
            ClaDetailsUiModel claDetailsUiModel2 = this.f59952o;
            if (claDetailsUiModel2 == null) {
                C41536l.m120506z("loanData");
                claDetailsUiModel2 = null;
            }
            String i = claDetailsUiModel2.mo56195i();
            C25355a aVar3 = this.f59953p;
            if (aVar3 == null) {
                C41536l.m120506z("appData");
                aVar3 = null;
            }
            String valueOf = String.valueOf(aVar3.mo63921b());
            C25355a aVar4 = this.f59953p;
            if (aVar4 == null) {
                C41536l.m120506z("appData");
                aVar4 = null;
            }
            LookupUiModel c = aVar4.mo63922c();
            C41536l.m120486f(c);
            String d = c.mo52393d();
            C25355a aVar5 = this.f59953p;
            if (aVar5 == null) {
                C41536l.m120506z("appData");
                aVar5 = null;
            }
            String a = aVar5.mo63920a();
            C25355a aVar6 = this.f59953p;
            if (aVar6 == null) {
                C41536l.m120506z("appData");
            } else {
                aVar2 = aVar6;
            }
            String d2 = aVar2.mo63923d();
            C41536l.m120486f(d2);
            C41205b H = bVar.mo69088a("CREDIT_APPLICATION", h, i, valueOf, d, a, true, d2).mo95062A(new C26798f0(C22721l.f59975d)).mo95065D(new C26808g0()).mo95063B(C40992a.m118827a()).mo95083l(new C26817h0(new C22722m(this))).mo95069H(new C26821i0(new C22723n(this)));
            C41536l.m120488h(H, "private fun prepareAppli…}.bindToLifecycle()\n    }");
            bindToLifecycle(H);
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: jx */
    public static final C25361d m73646jx(C43075l lVar, Object obj) {
        C41536l.m120489i(lVar, "$tmp0");
        return (C25361d) lVar.invoke(obj);
    }

    /* access modifiers changed from: private */
    /* renamed from: kx */
    public static final void m73648kx(C43075l lVar, Object obj) {
        C41536l.m120489i(lVar, "$tmp0");
        lVar.invoke(obj);
    }

    /* access modifiers changed from: private */
    /* renamed from: lx */
    public static final void m73650lx(C43075l lVar, Object obj) {
        C41536l.m120489i(lVar, "$tmp0");
        lVar.invoke(obj);
    }

    /* renamed from: nx */
    private final void m73653nx() {
        C36546y.m108282F().mo27137H("applications_CL_E2E", "CONSUMER_LOAN_E2E_SEND_TO_CRIF_PREPARE", (String) null, (Bundle) null, C10464h.C10465a.FACEBOOKANDFIREBASE);
    }

    /* renamed from: px */
    private final void m73656px() {
        C41205b F0 = this.f59951n.mo95032s(500, TimeUnit.MILLISECONDS).mo94981F0(new C26769a0(new C22724o(this)));
        C41536l.m120488h(F0, "private fun subscribeAmo…}.bindToLifecycle()\n    }");
        bindToLifecycle(F0);
    }

    /* access modifiers changed from: private */
    /* renamed from: qx */
    public static final void m73658qx(C43075l lVar, Object obj) {
        C41536l.m120489i(lVar, "$tmp0");
        lVar.invoke(obj);
    }

    /* access modifiers changed from: private */
    /* renamed from: rw */
    public static final C40754t m73659rw(C43075l lVar, Object obj) {
        C41536l.m120489i(lVar, "$tmp0");
        return (C40754t) lVar.invoke(obj);
    }

    /* access modifiers changed from: private */
    /* renamed from: sw */
    public static final void m73660sw(C43075l lVar, Object obj) {
        C41536l.m120489i(lVar, "$tmp0");
        lVar.invoke(obj);
    }

    /* access modifiers changed from: private */
    /* renamed from: ub */
    public final boolean m73662ub(BigDecimal bigDecimal) {
        if (bigDecimal != null) {
            ClaDetailsUiModel claDetailsUiModel = this.f59952o;
            ClaDetailsUiModel claDetailsUiModel2 = null;
            if (claDetailsUiModel == null) {
                C41536l.m120506z("loanData");
                claDetailsUiModel = null;
            }
            BigDecimal f = claDetailsUiModel.mo56191f();
            ClaDetailsUiModel claDetailsUiModel3 = this.f59952o;
            if (claDetailsUiModel3 == null) {
                C41536l.m120506z("loanData");
            } else {
                claDetailsUiModel2 = claDetailsUiModel3;
            }
            if (C43428j.m124583b(f, claDetailsUiModel2.mo56189e()).mo102099c(bigDecimal)) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: L0 */
    public final LiveData mo56257L0() {
        return this.f59958u;
    }

    /* renamed from: Nw */
    public final LiveData mo56258Nw() {
        return this.f59939A;
    }

    /* renamed from: Ow */
    public final LiveData mo56259Ow() {
        return this.f59960w;
    }

    /* renamed from: P6 */
    public final void mo56260P6() {
        m73644ix();
    }

    /* renamed from: Vw */
    public final LiveData mo56261Vw() {
        return this.f59955r;
    }

    /* renamed from: Ww */
    public final LiveData mo56262Ww() {
        return this.f59957t;
    }

    /* renamed from: Xw */
    public final LiveData mo56263Xw() {
        return this.f59962y;
    }

    /* renamed from: d */
    public final void mo56264d(String str) {
        C40767b bVar = this.f59951n;
        if (str == null) {
            str = "";
        }
        bVar.onNext(str);
    }

    /* renamed from: dx */
    public final void mo56265dx(LookupUiModel lookupUiModel) {
        C41536l.m120489i(lookupUiModel, "selectedTerm");
        C25355a aVar = this.f59953p;
        C25355a aVar2 = null;
        if (aVar == null) {
            C41536l.m120506z("appData");
            aVar = null;
        }
        if (!C41536l.m120484d(aVar.mo63922c(), lookupUiModel)) {
            C25355a aVar3 = this.f59953p;
            if (aVar3 == null) {
                C41536l.m120506z("appData");
            } else {
                aVar2 = aVar3;
            }
            aVar2.mo63928h(lookupUiModel);
            m73640gx();
            m73621Lw();
        }
    }

    /* renamed from: fn */
    public final LiveData mo56266fn() {
        return this.f59963z;
    }

    /* renamed from: iq */
    public final LiveData mo56267iq() {
        return this.f59940B;
    }

    /* renamed from: k0 */
    public final void mo56268k0() {
        C25355a aVar = this.f59953p;
        if (aVar == null) {
            C41536l.m120506z("appData");
            aVar = null;
        }
        if (aVar.mo63924e()) {
            C41205b H = C26615g.m83078c(this.f59941d, false, false, 3, (Object) null).mo95035t0(new C26886v(C22718i.f59972d)).mo94992N(C41341q.m119907j()).mo95063B(C40992a.m118827a()).mo95083l(new C26782b0(new C22719j(this))).mo95069H(new C26786c0(new C22720k(this)));
            C41536l.m120488h(H, "fun onContinueClick() {\n…DFIREBASE\n        )\n    }");
            bindToLifecycle(H);
            C32343x.m95397J0(this, "applications_cl", "cl_request", "cl_app_page_1_click_continue", C10464h.C10465a.FACEBOOKANDFIREBASE, (Bundle) null, 16, (Object) null);
        }
    }

    /* renamed from: mx */
    public final void mo56269mx() {
        m73623Pw();
    }

    /* renamed from: ox */
    public final void mo56270ox(String str) {
        C41536l.m120489i(str, "rsContract");
        C25355a aVar = this.f59953p;
        if (aVar == null) {
            C41536l.m120506z("appData");
            aVar = null;
        }
        aVar.mo63930i(str);
    }

    /* renamed from: te */
    public final LiveData mo56271te() {
        return this.f59959v;
    }
}
