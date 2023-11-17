package p341ge.bog.mobilebank.galtandtaggart.presentation.onboarding.reviewdata;

import androidx.lifecycle.C1644x;
import b41.C31128a;
import c41.C31270e;
import df0.C19991a;
import df0.C19999i;
import ed1.C40749p;
import ed1.C40754t;
import ee1.C40767b;
import ef0.C20230e;
import eg0.C20235c;
import eg0.C20236d;
import eg0.C20237e;
import g31.C32054a;
import g41.C32081a;
import g91.C32343x;
import hd1.C41204a;
import hd1.C41205b;
import he1.C41238w;
import ie0.C25190j;
import iu0.C36546y;
import j70.C25352k;
import kotlin.jvm.internal.C41536l;
import kotlin.jvm.internal.C41537m;
import kotlin.jvm.internal.DefaultConstructorMarker;
import p341ge.bog.mobilebank.cleanarch.presentation.common.C21481a;
import p341ge.bog.mobilebank.model.Client;
import p380ck.C10463g;
import ue1.C43075l;
import we0.C29326c0;
import we0.C29366x;

/* renamed from: ge.bog.mobilebank.galtandtaggart.presentation.onboarding.reviewdata.GTOnboardingReviewDataViewModel$ViewModel */
public final class GTOnboardingReviewDataViewModel$ViewModel extends C21481a implements C20235c, C20236d {

    /* renamed from: d */
    private final C19991a f61623d;
    /* access modifiers changed from: private */

    /* renamed from: e */
    public final C19999i f61624e;

    /* renamed from: f */
    private final C29366x f61625f;

    /* renamed from: g */
    private final C29326c0 f61626g;

    /* renamed from: h */
    private final C25352k f61627h;

    /* renamed from: i */
    private final Client f61628i;

    /* renamed from: j */
    private final C20235c f61629j = this;

    /* renamed from: k */
    private final C20236d f61630k = this;

    /* renamed from: l */
    private final C40767b f61631l;

    /* renamed from: m */
    private final C1644x f61632m;

    /* renamed from: ge.bog.mobilebank.galtandtaggart.presentation.onboarding.reviewdata.GTOnboardingReviewDataViewModel$ViewModel$a */
    static final class C23628a extends C41537m implements C43075l {

        /* renamed from: d */
        final /* synthetic */ GTOnboardingReviewDataViewModel$ViewModel f61633d;

        /* renamed from: ge.bog.mobilebank.galtandtaggart.presentation.onboarding.reviewdata.GTOnboardingReviewDataViewModel$ViewModel$a$a */
        static final class C23629a extends C41537m implements C43075l {

            /* renamed from: d */
            public static final C23629a f61634d = new C23629a();

            C23629a() {
                super(1);
            }

            /* renamed from: a */
            public final C31128a invoke(Throwable th) {
                C41536l.m120489i(th, "error");
                return new C31128a.C31129a(th, 0, (Object) null, 6, (DefaultConstructorMarker) null);
            }
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C23628a(GTOnboardingReviewDataViewModel$ViewModel gTOnboardingReviewDataViewModel$ViewModel) {
            super(1);
            this.f61633d = gTOnboardingReviewDataViewModel$ViewModel;
        }

        /* access modifiers changed from: private */
        /* renamed from: c */
        public static final C31128a m76396c(C43075l lVar, Object obj) {
            C41536l.m120489i(lVar, "$tmp0");
            return (C31128a) lVar.invoke(obj);
        }

        /* renamed from: b */
        public final C40754t invoke(C41238w wVar) {
            C41536l.m120489i(wVar, "it");
            return this.f61633d.f61624e.mo48374a().mo94893M(new C31128a.C31131c(C41238w.f97225a, 0, 2, (DefaultConstructorMarker) null)).mo95075O().mo94977D0(new C31128a.C31130b(0, (Object) null, 3, (DefaultConstructorMarker) null)).mo95035t0(new C23630a(C23629a.f61634d));
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public GTOnboardingReviewDataViewModel$ViewModel(C19991a aVar, C19999i iVar, C29366x xVar, C29326c0 c0Var, C25352k kVar, Client client) {
        super((C41204a) null, 1, (DefaultConstructorMarker) null);
        C41536l.m120489i(aVar, "getPreloadedReviewDataUseCase");
        C41536l.m120489i(iVar, "submitGTOnboardingDataUseCase");
        C41536l.m120489i(xVar, "getGTStatusUseCase");
        C41536l.m120489i(c0Var, "getPortfolioOverview");
        C41536l.m120489i(kVar, "reloadProductsUseCase");
        C41536l.m120489i(client, "client");
        this.f61623d = aVar;
        this.f61624e = iVar;
        this.f61625f = xVar;
        this.f61626g = c0Var;
        this.f61627h = kVar;
        this.f61628i = client;
        C40767b h1 = C40767b.m118210h1();
        C41536l.m120488h(h1, "create<Unit>()");
        this.f61631l = h1;
        this.f61632m = new C1644x();
        C40749p L0 = h1.mo94989L0(new C20237e(new C23628a(this)));
        C41536l.m120488h(L0, "submitDataSubject.switch…or(error) }\n            }");
        bindToLifecycle(C31270e.m92876e(C32343x.m95413R0(L0), mo48713Q5()));
    }

    /* access modifiers changed from: private */
    /* renamed from: ew */
    public static final C40754t m76384ew(C43075l lVar, Object obj) {
        C41536l.m120489i(lVar, "$tmp0");
        return (C40754t) lVar.invoke(obj);
    }

    /* renamed from: D0 */
    public C20230e mo48712D0() {
        return this.f61623d.mo48369a();
    }

    /* renamed from: E */
    public void mo48710E() {
        this.f61631l.onNext(C41238w.f97225a);
    }

    /* renamed from: G1 */
    public void mo48711G1() {
        C32054a.C32063i iVar = C32054a.C32063i.f78904f;
        C10463g F = C36546y.m108282F();
        C41536l.m120488h(F, "getAnalytics()");
        C32081a.m94499a(iVar, F, " ", " ");
    }

    /* renamed from: gw */
    public final C20235c mo60502gw() {
        return this.f61629j;
    }

    /* renamed from: hw */
    public final C20236d mo60503hw() {
        return this.f61630k;
    }

    /* renamed from: iw */
    public C1644x mo48713Q5() {
        return this.f61632m;
    }

    /* renamed from: jw */
    public int mo60505jw() {
        if (this.f61628i.getUserInfo().isSolo()) {
            return C25190j.gt_onboarding_result_page_title_solo;
        }
        return C25190j.gt_onboarding_result_page_title;
    }

    /* renamed from: kw */
    public void mo60506kw() {
        C41205b E = this.f61625f.mo69214a(true).mo95092y().mo94882A().mo94886E();
        C41536l.m120488h(E, "getGTStatusUseCase(true)…rorComplete().subscribe()");
        bindToLifecycle(E);
        C41205b E2 = this.f61626g.mo69182a(true).mo95019d0().mo94882A().mo94886E();
        C41536l.m120488h(E2, "getPortfolioOverview(tru…rorComplete().subscribe()");
        bindToLifecycle(E2);
        this.f61627h.invoke();
    }
}
