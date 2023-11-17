package p341ge.bog.mobilebank.galtandtaggart.presentation.landing;

import androidx.lifecycle.C1644x;
import androidx.lifecycle.LiveData;
import b41.C31128a;
import b41.C31132b;
import c41.C31270e;
import ed1.C40749p;
import ed1.C40754t;
import ed1.C40762x;
import ee1.C40765a;
import ee1.C40767b;
import g91.C32343x;
import gd1.C40992a;
import hd1.C41204a;
import hd1.C41205b;
import he1.C41224m;
import he1.C41238w;
import java.math.BigDecimal;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.C41535k;
import kotlin.jvm.internal.C41536l;
import kotlin.jvm.internal.C41537m;
import kotlin.jvm.internal.DefaultConstructorMarker;
import m41.C37223a;
import m41.C37224b;
import of0.C26986t;
import of0.C26987u;
import of0.C26988v;
import of0.C26989w;
import of0.C26990x;
import of0.C26991y;
import p341ge.bog.mobilebank.cleanarch.domain.home.model.ProductType;
import p341ge.bog.mobilebank.cleanarch.presentation.common.C21481a;
import p729cv.C19799c;
import ue1.C43075l;
import ue1.C43079p;
import we0.C29322a0;
import we0.C29326c0;
import we0.C29329e;
import we0.C29346l0;
import we0.C29348m0;
import we0.C29366x;
import xe0.C29749g;
import xe0.C29751i;

/* renamed from: ge.bog.mobilebank.galtandtaggart.presentation.landing.GTLandingViewModel$ViewModel */
public final class GTLandingViewModel$ViewModel extends C21481a implements C26986t, C26987u {

    /* renamed from: A */
    private final C40767b f61342A;
    /* access modifiers changed from: private */

    /* renamed from: d */
    public final C29326c0 f61343d;
    /* access modifiers changed from: private */

    /* renamed from: e */
    public final C19799c f61344e;
    /* access modifiers changed from: private */

    /* renamed from: f */
    public final C29366x f61345f;
    /* access modifiers changed from: private */

    /* renamed from: g */
    public final C29322a0 f61346g;
    /* access modifiers changed from: private */

    /* renamed from: h */
    public final C29329e f61347h;

    /* renamed from: i */
    private final C29348m0 f61348i;

    /* renamed from: j */
    private final C29346l0 f61349j;

    /* renamed from: k */
    private final C26986t f61350k = this;

    /* renamed from: l */
    private final C26987u f61351l = this;
    /* access modifiers changed from: private */

    /* renamed from: m */
    public final C1644x f61352m;

    /* renamed from: n */
    private final C1644x f61353n;

    /* renamed from: o */
    private final C1644x f61354o;

    /* renamed from: p */
    private final C1644x f61355p;

    /* renamed from: q */
    private final C1644x f61356q;

    /* renamed from: r */
    private final C1644x f61357r;

    /* renamed from: s */
    private final C1644x f61358s;

    /* renamed from: t */
    private final C1644x f61359t;

    /* renamed from: u */
    private final C1644x f61360u;

    /* renamed from: v */
    private final C1644x f61361v;

    /* renamed from: w */
    private final C1644x f61362w;

    /* renamed from: x */
    private final C1644x f61363x;

    /* renamed from: y */
    private final C1644x f61364y;

    /* renamed from: z */
    private final C40765a f61365z;

    /* renamed from: ge.bog.mobilebank.galtandtaggart.presentation.landing.GTLandingViewModel$ViewModel$a */
    static final class C23479a extends C41537m implements C43075l {

        /* renamed from: d */
        final /* synthetic */ GTLandingViewModel$ViewModel f61366d;

        /* renamed from: ge.bog.mobilebank.galtandtaggart.presentation.landing.GTLandingViewModel$ViewModel$a$a */
        /* synthetic */ class C23480a extends C41535k implements C43075l {
            C23480a(Object obj) {
                super(1, obj, GTLandingViewModel$ViewModel.class, "checkIfNeedsPopup", "checkIfNeedsPopup(Lge/bog/mobilebank/galtandtaggart/domain/model/IdentomatStatus;)V", 0);
            }

            /* renamed from: b */
            public final void mo60329b(C29749g gVar) {
                C41536l.m120489i(gVar, "p0");
                ((GTLandingViewModel$ViewModel) this.receiver).m75982tw(gVar);
            }

            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                mo60329b((C29749g) obj);
                return C41238w.f97225a;
            }
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C23479a(GTLandingViewModel$ViewModel gTLandingViewModel$ViewModel) {
            super(1);
            this.f61366d = gTLandingViewModel$ViewModel;
        }

        /* access modifiers changed from: private */
        /* renamed from: c */
        public static final void m76007c(C43075l lVar, Object obj) {
            C41536l.m120489i(lVar, "$tmp0");
            lVar.invoke(obj);
        }

        /* renamed from: b */
        public final C40754t invoke(C41238w wVar) {
            C41536l.m120489i(wVar, "it");
            C40762x m = this.f61366d.f61347h.mo69185a().mo95084m(new C23492b(new C23480a(this.f61366d)));
            C41536l.m120488h(m, "checkIdentomatStatusUseC…cess(::checkIfNeedsPopup)");
            return C31270e.m92880i(m, -1);
        }
    }

    /* renamed from: ge.bog.mobilebank.galtandtaggart.presentation.landing.GTLandingViewModel$ViewModel$b */
    static final class C23481b extends C41537m implements C43075l {

        /* renamed from: d */
        final /* synthetic */ GTLandingViewModel$ViewModel f61367d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C23481b(GTLandingViewModel$ViewModel gTLandingViewModel$ViewModel) {
            super(1);
            this.f61367d = gTLandingViewModel$ViewModel;
        }

        /* renamed from: a */
        public final C40754t invoke(C41238w wVar) {
            C41536l.m120489i(wVar, "it");
            return C31270e.m92878g(this.f61367d.f61346g.mo69178a(), -1);
        }
    }

    /* renamed from: ge.bog.mobilebank.galtandtaggart.presentation.landing.GTLandingViewModel$ViewModel$c */
    static final class C23482c extends C41537m implements C43075l {

        /* renamed from: d */
        final /* synthetic */ GTLandingViewModel$ViewModel f61368d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C23482c(GTLandingViewModel$ViewModel gTLandingViewModel$ViewModel) {
            super(1);
            this.f61368d = gTLandingViewModel$ViewModel;
        }

        /* renamed from: a */
        public final C40754t invoke(Integer num) {
            boolean z;
            C41536l.m120489i(num, "requestCode");
            C29366x lw = this.f61368d.f61345f;
            if (num.intValue() == 6 || num.intValue() == 2) {
                z = true;
            } else {
                z = false;
            }
            C40749p O = lw.mo69214a(z).mo95075O();
            C41536l.m120488h(O, "getGTStatusUseCase(reque…E_REFRESH).toObservable()");
            return C31270e.m92879h(O, num.intValue());
        }
    }

    /* renamed from: ge.bog.mobilebank.galtandtaggart.presentation.landing.GTLandingViewModel$ViewModel$d */
    static final class C23483d extends C41537m implements C43075l {

        /* renamed from: d */
        final /* synthetic */ GTLandingViewModel$ViewModel f61369d;

        /* renamed from: e */
        final /* synthetic */ GTLandingViewModel$GTLandingData f61370e;

        /* renamed from: ge.bog.mobilebank.galtandtaggart.presentation.landing.GTLandingViewModel$ViewModel$d$a */
        static final class C23484a extends C41537m implements C43075l {

            /* renamed from: d */
            final /* synthetic */ GTLandingViewModel$ViewModel f61371d;

            /* renamed from: e */
            final /* synthetic */ GTLandingViewModel$GTLandingData f61372e;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            C23484a(GTLandingViewModel$ViewModel gTLandingViewModel$ViewModel, GTLandingViewModel$GTLandingData gTLandingViewModel$GTLandingData) {
                super(1);
                this.f61371d = gTLandingViewModel$ViewModel;
                this.f61372e = gTLandingViewModel$GTLandingData;
            }

            /* renamed from: a */
            public final void mo60333a(String str) {
                GTLandingViewModel$ViewModel gTLandingViewModel$ViewModel = this.f61371d;
                C41536l.m120488h(str, "status");
                gTLandingViewModel$ViewModel.m75963Bw(str, this.f61372e);
            }

            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                mo60333a((String) obj);
                return C41238w.f97225a;
            }
        }

        /* renamed from: ge.bog.mobilebank.galtandtaggart.presentation.landing.GTLandingViewModel$ViewModel$d$b */
        static final class C23485b extends C41537m implements C43075l {

            /* renamed from: d */
            final /* synthetic */ GTLandingViewModel$ViewModel f61373d;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            C23485b(GTLandingViewModel$ViewModel gTLandingViewModel$ViewModel) {
                super(1);
                this.f61373d = gTLandingViewModel$ViewModel;
            }

            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                invoke((Throwable) obj);
                return C41238w.f97225a;
            }

            public final void invoke(Throwable th) {
                C41536l.m120489i(th, "it");
                this.f61373d.mo60310Fk().mo4823o(new C31128a.C31129a(th, 0, (Object) null, 6, (DefaultConstructorMarker) null));
            }
        }

        /* renamed from: ge.bog.mobilebank.galtandtaggart.presentation.landing.GTLandingViewModel$ViewModel$d$c */
        static final class C23486c extends C41537m implements C43075l {

            /* renamed from: d */
            final /* synthetic */ GTLandingViewModel$ViewModel f61374d;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            C23486c(GTLandingViewModel$ViewModel gTLandingViewModel$ViewModel) {
                super(1);
                this.f61374d = gTLandingViewModel$ViewModel;
            }

            /* renamed from: a */
            public final void mo60335a(String str) {
                this.f61374d.mo60310Fk().mo4823o(new C31128a.C31130b(0, (Object) null, 3, (DefaultConstructorMarker) null));
            }

            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                mo60335a((String) obj);
                return C41238w.f97225a;
            }
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C23483d(GTLandingViewModel$ViewModel gTLandingViewModel$ViewModel, GTLandingViewModel$GTLandingData gTLandingViewModel$GTLandingData) {
            super(1);
            this.f61369d = gTLandingViewModel$ViewModel;
            this.f61370e = gTLandingViewModel$GTLandingData;
        }

        /* renamed from: a */
        public final void mo60332a(C31128a aVar) {
            C41536l.m120488h(aVar, "result");
            C31132b.m92648j(aVar, (int[]) null, new C23484a(this.f61369d, this.f61370e), 1, (Object) null);
            C31132b.m92643e(aVar, (int[]) null, new C23485b(this.f61369d), 1, (Object) null);
            C31132b.m92646h(aVar, (int[]) null, new C23486c(this.f61369d), 1, (Object) null);
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            mo60332a((C31128a) obj);
            return C41238w.f97225a;
        }
    }

    /* renamed from: ge.bog.mobilebank.galtandtaggart.presentation.landing.GTLandingViewModel$ViewModel$e */
    static final class C23487e extends C41537m implements C43075l {

        /* renamed from: d */
        final /* synthetic */ GTLandingViewModel$ViewModel f61375d;

        /* renamed from: ge.bog.mobilebank.galtandtaggart.presentation.landing.GTLandingViewModel$ViewModel$e$a */
        static final class C23488a extends C41537m implements C43079p {

            /* renamed from: d */
            public static final C23488a f61376d = new C23488a();

            C23488a() {
                super(2);
            }

            /* renamed from: a */
            public final C41224m invoke(C29751i iVar, List list) {
                C41536l.m120489i(iVar, "overview");
                C41536l.m120489i(list, "products");
                return new C41224m(iVar, list);
            }
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C23487e(GTLandingViewModel$ViewModel gTLandingViewModel$ViewModel) {
            super(1);
            this.f61375d = gTLandingViewModel$ViewModel;
        }

        /* access modifiers changed from: private */
        /* renamed from: c */
        public static final C41224m m76016c(C43079p pVar, Object obj, Object obj2) {
            C41536l.m120489i(pVar, "$tmp0");
            return (C41224m) pVar.invoke(obj, obj2);
        }

        /* renamed from: b */
        public final C40754t invoke(Integer num) {
            boolean z;
            C41536l.m120489i(num, "it");
            if (num.intValue() == 2 || num.intValue() == 1) {
                z = true;
            } else {
                z = false;
            }
            C40749p d1 = C40749p.m118037d1(this.f61375d.f61343d.mo69182a(z), C19799c.m65565e(this.f61375d.f61344e, false, 1, (Object) null), new C23493c(C23488a.f61376d));
            C41536l.m120488h(d1, "zip(\n                   …                        }");
            return C31270e.m92879h(d1, num.intValue());
        }
    }

    /* renamed from: ge.bog.mobilebank.galtandtaggart.presentation.landing.GTLandingViewModel$ViewModel$f */
    static final class C23489f extends C41537m implements C43075l {

        /* renamed from: d */
        final /* synthetic */ GTLandingViewModel$ViewModel f61377d;

        /* renamed from: ge.bog.mobilebank.galtandtaggart.presentation.landing.GTLandingViewModel$ViewModel$f$a */
        static final class C23490a extends C41537m implements C43075l {

            /* renamed from: d */
            final /* synthetic */ GTLandingViewModel$ViewModel f61378d;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            C23490a(GTLandingViewModel$ViewModel gTLandingViewModel$ViewModel) {
                super(1);
                this.f61378d = gTLandingViewModel$ViewModel;
            }

            /* renamed from: a */
            public final void mo60339a(C41224m mVar) {
                String str;
                Object obj;
                C29751i iVar = (C29751i) mVar.mo95675a();
                List list = (List) mVar.mo95676b();
                C1644x pw = this.f61378d.f61352m;
                C41536l.m120488h(list, "products");
                Iterator it = list.iterator();
                while (true) {
                    str = null;
                    if (!it.hasNext()) {
                        obj = null;
                        break;
                    }
                    obj = it.next();
                    if (C41536l.m120484d(((ProductType) obj).getProduct(), "GTP_TRADING")) {
                        break;
                    }
                }
                ProductType productType = (ProductType) obj;
                if (productType != null) {
                    str = productType.getStatus();
                }
                boolean z = true;
                Boolean valueOf = Boolean.valueOf(!C41536l.m120484d(str, "OPEN_NO_NEW_TRADES"));
                BigDecimal e = iVar.mo69805e();
                BigDecimal valueOf2 = BigDecimal.valueOf(0);
                C41536l.m120488h(valueOf2, "valueOf(this.toLong())");
                if (e.compareTo(valueOf2) <= 0) {
                    z = false;
                }
                pw.mo4823o(new C41224m(valueOf, Boolean.valueOf(z)));
            }

            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                mo60339a((C41224m) obj);
                return C41238w.f97225a;
            }
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C23489f(GTLandingViewModel$ViewModel gTLandingViewModel$ViewModel) {
            super(1);
            this.f61377d = gTLandingViewModel$ViewModel;
        }

        /* renamed from: a */
        public final void mo60338a(C31128a aVar) {
            C41536l.m120488h(aVar, "result");
            C31132b.m92648j(aVar, (int[]) null, new C23490a(this.f61377d), 1, (Object) null);
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            mo60338a((C31128a) obj);
            return C41238w.f97225a;
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public GTLandingViewModel$ViewModel(C29326c0 c0Var, C19799c cVar, C29366x xVar, C29322a0 a0Var, C29329e eVar, C29348m0 m0Var, C29346l0 l0Var) {
        super((C41204a) null, 1, (DefaultConstructorMarker) null);
        C41536l.m120489i(c0Var, "getPortfolioOverview");
        C41536l.m120489i(cVar, "getProductTypes");
        C41536l.m120489i(xVar, "getGTStatusUseCase");
        C41536l.m120489i(a0Var, "getOnboardingPrecheckUseCase");
        C41536l.m120489i(eVar, "checkIdentomatStatusUseCase");
        C41536l.m120489i(m0Var, "shouldShowKycPopup");
        C41536l.m120489i(l0Var, "markKycPopupShown");
        this.f61343d = c0Var;
        this.f61344e = cVar;
        this.f61345f = xVar;
        this.f61346g = a0Var;
        this.f61347h = eVar;
        this.f61348i = m0Var;
        this.f61349j = l0Var;
        Boolean bool = Boolean.FALSE;
        this.f61352m = new C1644x(new C41224m(bool, bool));
        this.f61353n = new C1644x(bool);
        this.f61354o = new C1644x(bool);
        this.f61355p = new C1644x();
        this.f61356q = new C1644x();
        this.f61357r = new C1644x();
        this.f61358s = new C1644x();
        this.f61359t = new C1644x();
        this.f61360u = new C1644x();
        this.f61361v = new C1644x();
        this.f61362w = new C1644x();
        this.f61363x = new C1644x();
        this.f61364y = new C1644x();
        C40765a h1 = C40765a.m118198h1();
        C41536l.m120488h(h1, "create<Unit>()");
        this.f61365z = h1;
        C40767b h12 = C40767b.m118210h1();
        C41536l.m120488h(h12, "create<Unit>()");
        this.f61342A = h12;
    }

    /* access modifiers changed from: private */
    /* renamed from: Aw */
    public static final void m75962Aw(C43075l lVar, Object obj) {
        C41536l.m120489i(lVar, "$tmp0");
        lVar.invoke(obj);
    }

    /* access modifiers changed from: private */
    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* JADX WARNING: Code restructure failed: missing block: B:10:0x0070, code lost:
        if (r9.equals(p341ge.bog.mobilebank.cleanarch.domain.home.model.ProductType.PRODUCT_STATUS_REJECTED) == false) goto L_0x007b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:12:0x0079, code lost:
        if (r9.equals(p341ge.bog.mobilebank.cleanarch.domain.home.model.ProductType.PRODUCT_STATUS_NEW) == false) goto L_0x007b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:14:0x00ac, code lost:
        mo60310Fk().mo4823o(new b41.C31128a.C31131c(1, 0, 2, (kotlin.jvm.internal.DefaultConstructorMarker) null));
        r8.f61353n.mo4823o(java.lang.Boolean.TRUE);
        m41.C37224b.m109962a(mo60325xw());
        r9 = r8.f61352m;
        r1 = java.lang.Boolean.FALSE;
        r9.mo4823o(new he1.C41224m(r1, r1));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:31:0x012e, code lost:
        if (r9.equals("GT_HOME_PAGE") == false) goto L_0x0143;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:33:0x0137, code lost:
        if (r9.equals("GT_ACCOUNT_OPENING_REJECTED") == false) goto L_0x0143;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:34:0x013a, code lost:
        r8.f61357r.mo4823o(0);
     */
    /* JADX WARNING: Removed duplicated region for block: B:17:0x00dc  */
    /* JADX WARNING: Removed duplicated region for block: B:37:0x0149  */
    /* JADX WARNING: Removed duplicated region for block: B:39:? A[RETURN, SYNTHETIC] */
    /* renamed from: Bw */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void m75963Bw(java.lang.String r9, p341ge.bog.mobilebank.galtandtaggart.presentation.landing.GTLandingViewModel$GTLandingData r10) {
        /*
            r8 = this;
            int r0 = r9.hashCode()
            r1 = 77184(0x12d80, float:1.08158E-40)
            r2 = 3
            r3 = 0
            r4 = 2
            r5 = 1
            r6 = 0
            if (r0 == r1) goto L_0x0073
            r1 = 174130302(0xa61047e, float:1.0834201E-32)
            if (r0 == r1) goto L_0x006a
            r1 = 1967871671(0x754b56b7, float:2.5776246E32)
            if (r0 == r1) goto L_0x0019
            goto L_0x007b
        L_0x0019:
            java.lang.String r0 = "APPROVED"
            boolean r0 = r9.equals(r0)
            if (r0 != 0) goto L_0x0022
            goto L_0x007b
        L_0x0022:
            androidx.lifecycle.x r9 = r8.mo60310Fk()
            b41.a$c r0 = new b41.a$c
            java.lang.Integer r1 = java.lang.Integer.valueOf(r2)
            r0.<init>(r1, r6, r4, r3)
            r9.mo4823o(r0)
            androidx.lifecycle.x r9 = r8.f61353n
            java.lang.Boolean r0 = java.lang.Boolean.FALSE
            r9.mo4823o(r0)
            ed1.p r9 = r8.onRefresh()
            ed1.p r0 = r8.onInit()
            ed1.p r9 = ed1.C40749p.m118047l0(r9, r0)
            ge.bog.mobilebank.galtandtaggart.presentation.landing.GTLandingViewModel$ViewModel$e r0 = new ge.bog.mobilebank.galtandtaggart.presentation.landing.GTLandingViewModel$ViewModel$e
            r0.<init>(r8)
            of0.z r1 = new of0.z
            r1.<init>(r0)
            ed1.p r9 = r9.mo94989L0(r1)
            ge.bog.mobilebank.galtandtaggart.presentation.landing.GTLandingViewModel$ViewModel$f r0 = new ge.bog.mobilebank.galtandtaggart.presentation.landing.GTLandingViewModel$ViewModel$f
            r0.<init>(r8)
            of0.a0 r1 = new of0.a0
            r1.<init>(r0)
            hd1.b r9 = r9.mo94981F0(r1)
            java.lang.String r0 = "private fun onStatusSucc…onActionsheet()\n        }"
            kotlin.jvm.internal.C41536l.m120488h(r9, r0)
            r8.bindToLifecycle((hd1.C41205b) r9)
            goto L_0x00d6
        L_0x006a:
            java.lang.String r0 = "REJECTED"
            boolean r0 = r9.equals(r0)
            if (r0 != 0) goto L_0x00ac
            goto L_0x007b
        L_0x0073:
            java.lang.String r0 = "NEW"
            boolean r0 = r9.equals(r0)
            if (r0 != 0) goto L_0x00ac
        L_0x007b:
            androidx.lifecycle.x r0 = r8.mo60310Fk()
            b41.a$c r1 = new b41.a$c
            java.lang.Integer r7 = java.lang.Integer.valueOf(r5)
            r1.<init>(r7, r6, r4, r3)
            r0.mo4823o(r1)
            androidx.lifecycle.x r0 = r8.f61353n
            java.lang.Boolean r1 = java.lang.Boolean.FALSE
            r0.mo4823o(r1)
            androidx.lifecycle.x r0 = r8.f61352m
            he1.m r3 = new he1.m
            r3.<init>(r1, r1)
            r0.mo4823o(r3)
            androidx.lifecycle.x r0 = r8.f61354o
            java.lang.String r1 = "PENDING"
            boolean r9 = kotlin.jvm.internal.C41536l.m120484d(r9, r1)
            java.lang.Boolean r9 = java.lang.Boolean.valueOf(r9)
            r0.mo4823o(r9)
            goto L_0x00d6
        L_0x00ac:
            androidx.lifecycle.x r9 = r8.mo60310Fk()
            b41.a$c r0 = new b41.a$c
            java.lang.Integer r1 = java.lang.Integer.valueOf(r5)
            r0.<init>(r1, r6, r4, r3)
            r9.mo4823o(r0)
            androidx.lifecycle.x r9 = r8.f61353n
            java.lang.Boolean r0 = java.lang.Boolean.TRUE
            r9.mo4823o(r0)
            androidx.lifecycle.x r9 = r8.mo60317do()
            m41.C37224b.m109962a(r9)
            androidx.lifecycle.x r9 = r8.f61352m
            he1.m r0 = new he1.m
            java.lang.Boolean r1 = java.lang.Boolean.FALSE
            r0.<init>(r1, r1)
            r9.mo4823o(r0)
        L_0x00d6:
            java.lang.String r9 = r10.mo60297b()
            if (r9 == 0) goto L_0x0143
            int r0 = r9.hashCode()
            switch(r0) {
                case -1399047511: goto L_0x0131;
                case -894772963: goto L_0x0128;
                case -366534646: goto L_0x0115;
                case 870147274: goto L_0x00f7;
                case 1388048361: goto L_0x00e4;
                default: goto L_0x00e3;
            }
        L_0x00e3:
            goto L_0x0143
        L_0x00e4:
            java.lang.String r0 = "GT_MARKET_ORDER_COMPLETED"
            boolean r9 = r9.equals(r0)
            if (r9 != 0) goto L_0x00ed
            goto L_0x0143
        L_0x00ed:
            androidx.lifecycle.x r9 = r8.f61357r
            java.lang.Integer r0 = java.lang.Integer.valueOf(r2)
            r9.mo4823o(r0)
            goto L_0x0143
        L_0x00f7:
            java.lang.String r0 = "GT_STOCK_PAGE"
            boolean r9 = r9.equals(r0)
            if (r9 != 0) goto L_0x0100
            goto L_0x0143
        L_0x0100:
            androidx.lifecycle.x r9 = r8.f61357r
            java.lang.Integer r0 = java.lang.Integer.valueOf(r6)
            r9.mo4823o(r0)
            java.lang.String r9 = r10.mo60298d()
            if (r9 == 0) goto L_0x0143
            androidx.lifecycle.x r0 = r8.f61364y
            m41.C37224b.m109965d(r0, r9)
            goto L_0x0143
        L_0x0115:
            java.lang.String r0 = "GT_WACHLISTS_TAB"
            boolean r9 = r9.equals(r0)
            if (r9 != 0) goto L_0x011e
            goto L_0x0143
        L_0x011e:
            androidx.lifecycle.x r9 = r8.f61357r
            java.lang.Integer r0 = java.lang.Integer.valueOf(r5)
            r9.mo4823o(r0)
            goto L_0x0143
        L_0x0128:
            java.lang.String r0 = "GT_HOME_PAGE"
            boolean r9 = r9.equals(r0)
            if (r9 != 0) goto L_0x013a
            goto L_0x0143
        L_0x0131:
            java.lang.String r0 = "GT_ACCOUNT_OPENING_REJECTED"
            boolean r9 = r9.equals(r0)
            if (r9 != 0) goto L_0x013a
            goto L_0x0143
        L_0x013a:
            androidx.lifecycle.x r9 = r8.f61357r
            java.lang.Integer r0 = java.lang.Integer.valueOf(r6)
            r9.mo4823o(r0)
        L_0x0143:
            boolean r9 = r10.mo60296a()
            if (r9 == 0) goto L_0x014c
            r8.mo60311Ft()
        L_0x014c:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p341ge.bog.mobilebank.galtandtaggart.presentation.landing.GTLandingViewModel$ViewModel.m75963Bw(java.lang.String, ge.bog.mobilebank.galtandtaggart.presentation.landing.GTLandingViewModel$GTLandingData):void");
    }

    /* access modifiers changed from: private */
    /* renamed from: Cw */
    public static final C40754t m75964Cw(C43075l lVar, Object obj) {
        C41536l.m120489i(lVar, "$tmp0");
        return (C40754t) lVar.invoke(obj);
    }

    /* access modifiers changed from: private */
    /* renamed from: Dw */
    public static final void m75965Dw(C43075l lVar, Object obj) {
        C41536l.m120489i(lVar, "$tmp0");
        lVar.invoke(obj);
    }

    /* renamed from: rw */
    private final void m75980rw() {
        C40749p L0 = this.f61342A.mo94977D0(C41238w.f97225a).mo94989L0(new C26991y(new C23479a(this)));
        C41536l.m120488h(L0, "private fun checkIdentom…ndToLifecycle()\n        }");
        bindToLifecycle(C31270e.m92876e(C32343x.m95462k1(L0), this.f61355p));
    }

    /* access modifiers changed from: private */
    /* renamed from: sw */
    public static final C40754t m75981sw(C43075l lVar, Object obj) {
        C41536l.m120489i(lVar, "$tmp0");
        return (C40754t) lVar.invoke(obj);
    }

    /* access modifiers changed from: private */
    /* renamed from: tw */
    public final void m75982tw(C29749g gVar) {
        if (gVar == C29749g.KYC_DOC_REQUIRED && this.f61348i.invoke()) {
            C37224b.m109962a(this.f61363x);
        }
    }

    /* renamed from: uw */
    private final void m75983uw() {
        C40749p L0 = this.f61365z.mo94989L0(new C26990x(new C23481b(this)));
        C41536l.m120488h(L0, "private fun configureReg…ndToLifecycle()\n        }");
        bindToLifecycle(C31270e.m92876e(C32343x.m95462k1(L0), this.f61358s));
    }

    /* access modifiers changed from: private */
    /* renamed from: vw */
    public static final C40754t m75984vw(C43075l lVar, Object obj) {
        C41536l.m120489i(lVar, "$tmp0");
        return (C40754t) lVar.invoke(obj);
    }

    /* access modifiers changed from: private */
    /* renamed from: zw */
    public static final C40754t m75985zw(C43075l lVar, Object obj) {
        C41536l.m120489i(lVar, "$tmp0");
        return (C40754t) lVar.invoke(obj);
    }

    /* renamed from: Cd */
    public LiveData mo60308Cd() {
        return this.f61358s;
    }

    /* renamed from: Ef */
    public void mo60309Ef() {
        this.f61349j.mo69199a();
    }

    /* renamed from: Fk */
    public C1644x mo60310Fk() {
        return this.f61356q;
    }

    /* renamed from: Ft */
    public void mo60311Ft() {
        C37224b.m109962a(this.f61362w);
    }

    /* renamed from: He */
    public LiveData mo60312He() {
        return this.f61363x;
    }

    /* renamed from: I8 */
    public LiveData mo60313I8() {
        return this.f61355p;
    }

    /* renamed from: Pm */
    public LiveData mo60314Pm() {
        return this.f61354o;
    }

    /* renamed from: Ws */
    public LiveData mo60315Ws() {
        return this.f61352m;
    }

    /* renamed from: dh */
    public void mo60316dh() {
        this.f61361v.mo4823o(new C37223a(C41238w.f97225a));
    }

    /* renamed from: g9 */
    public LiveData mo60318g9() {
        return this.f61362w;
    }

    /* renamed from: h8 */
    public LiveData mo60319h8() {
        return this.f61353n;
    }

    /* renamed from: pc */
    public LiveData mo60320pc() {
        return this.f61364y;
    }

    /* renamed from: u3 */
    public void mo60321u3() {
        this.f61365z.onNext(C41238w.f97225a);
    }

    /* renamed from: ww */
    public final C26986t mo60322ww() {
        return this.f61350k;
    }

    /* renamed from: xf */
    public void mo60323xf(GTLandingViewModel$GTLandingData gTLandingViewModel$GTLandingData) {
        C41536l.m120489i(gTLandingViewModel$GTLandingData, "data");
        C41205b F0 = C40749p.m118047l0(onRefresh(), onInit()).mo94989L0(new C26988v(new C23482c(this))).mo95027o0(C40992a.m118827a()).mo94981F0(new C26989w(new C23483d(this, gTLandingViewModel$GTLandingData)));
        C41536l.m120488h(F0, "override fun init(data: …ntomatSubject()\n        }");
        bindToLifecycle(F0);
        m75983uw();
        m75980rw();
    }

    /* renamed from: xv */
    public LiveData mo60324xv() {
        return this.f61357r;
    }

    /* renamed from: xw */
    public C1644x mo60317do() {
        return this.f61359t;
    }

    /* renamed from: yw */
    public final C26987u mo60326yw() {
        return this.f61351l;
    }

    /* renamed from: zv */
    public LiveData mo60327zv() {
        return this.f61361v;
    }
}
