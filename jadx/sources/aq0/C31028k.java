package aq0;

import androidx.lifecycle.C1644x;
import androidx.lifecycle.LiveData;
import b41.C31128a;
import b41.C31132b;
import c41.C31270e;
import cf1.C40407d;
import com.github.mikephil.charting.utils.Utils;
import ed1.C40749p;
import ed1.C40754t;
import ee1.C40767b;
import g91.C32300e0;
import g91.C32343x;
import g91.C32359z0;
import hd0.C24978b;
import hd1.C41204a;
import hd1.C41205b;
import he1.C41233s;
import he1.C41238w;
import j70.C25352k;
import java.util.List;
import kotlin.jvm.internal.C41536l;
import kotlin.jvm.internal.C41537m;
import kotlin.jvm.internal.DefaultConstructorMarker;
import ld0.C25950a;
import m41.C37223a;
import m41.C37224b;
import nq0.C37444a;
import p341ge.bog.mobilebank.cleanarch.presentation.common.C21481a;
import p341ge.bog.mobilebank.cleanarch.utm.data.entity.UtmParamsEntity;
import p341ge.bog.mobilebank.loanactivation.data.entity.RegisterLoanParamObject;
import p341ge.bog.mobilebank.loanactivation.presentation.activation.details.C32415a;
import p341ge.bog.mobilebank.loanactivation.presentation.activation.model.details.ActivationDetailsData;
import p341ge.bog.mobilebank.loanactivation.presentation.activation.model.form.checkdecision.CheckDecisionDetailsUiModel;
import p341ge.bog.mobilebank.loanactivation.presentation.activation.model.result.ActivationResultData;
import p341ge.bog.mobilebank.rest.manager.PreferencesApiManager;
import p748eu.C20292b;
import p758fu.C20557a;
import p842nv.C26617h;
import p897tp.C28474a;
import pc0.C27494a;
import ru0.C38345b;
import t70.C28323a;
import ue1.C43075l;
import up0.C39055b;
import up0.C39059f;
import yp0.C40044a;
import yp0.C40045b;

/* renamed from: aq0.k */
public final class C31028k extends C21481a implements C32415a, C31023f {

    /* renamed from: v */
    public static final C31029a f77190v = new C31029a((DefaultConstructorMarker) null);

    /* renamed from: d */
    private final ActivationDetailsData f77191d;
    /* access modifiers changed from: private */

    /* renamed from: e */
    public final C39055b f77192e;
    /* access modifiers changed from: private */

    /* renamed from: f */
    public final C39059f f77193f;

    /* renamed from: g */
    private final C26617h f77194g;

    /* renamed from: h */
    private final C38345b f77195h;

    /* renamed from: i */
    private final C25352k f77196i;

    /* renamed from: j */
    private final PreferencesApiManager f77197j;

    /* renamed from: k */
    private final C20292b f77198k;

    /* renamed from: l */
    private final C28474a f77199l;
    /* access modifiers changed from: private */

    /* renamed from: m */
    public final C27494a f77200m;

    /* renamed from: n */
    private final C32415a f77201n = this;

    /* renamed from: o */
    private final C31023f f77202o = this;
    /* access modifiers changed from: private */

    /* renamed from: p */
    public final C1644x f77203p;
    /* access modifiers changed from: private */

    /* renamed from: q */
    public final C1644x f77204q;

    /* renamed from: r */
    private final C1644x f77205r;
    /* access modifiers changed from: private */

    /* renamed from: s */
    public final C1644x f77206s;

    /* renamed from: t */
    private final C40767b f77207t;

    /* renamed from: u */
    private final C40767b f77208u;

    /* renamed from: aq0.k$a */
    public static final class C31029a {
        private C31029a() {
        }

        public /* synthetic */ C31029a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    /* renamed from: aq0.k$b */
    static final class C31030b extends C41537m implements C43075l {

        /* renamed from: d */
        final /* synthetic */ C31028k f77209d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C31030b(C31028k kVar) {
            super(1);
            this.f77209d = kVar;
        }

        /* renamed from: a */
        public final C40754t invoke(RegisterLoanParamObject registerLoanParamObject) {
            C41536l.m120489i(registerLoanParamObject, "params");
            return C31270e.m92878g(this.f77209d.f77193f.mo92750a(this.f77209d.f77200m.mo66809a(registerLoanParamObject)), -1);
        }
    }

    /* renamed from: aq0.k$c */
    static final class C31031c extends C41537m implements C43075l {

        /* renamed from: d */
        final /* synthetic */ C31028k f77210d;

        /* renamed from: aq0.k$c$a */
        static final class C31032a extends C41537m implements C43075l {

            /* renamed from: d */
            final /* synthetic */ C31028k f77211d;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            C31032a(C31028k kVar) {
                super(1);
                this.f77211d = kVar;
            }

            /* renamed from: a */
            public final void mo71228a(C41238w wVar) {
                C41536l.m120489i(wVar, "it");
                C31028k.m92406vw(this.f77211d, C40044a.LOAN_RESULT_SUCCESS, (String) null, 2, (Object) null);
                this.f77211d.m92407ww();
                C37224b.m109965d(this.f77211d.f77206s, new ActivationResultData(this.f77211d.mo71221qw().mo73322g().mo73384a().mo73368l(), this.f77211d.mo71221qw().mo73322g().mo73384a().mo73369m(), this.f77211d.mo71221qw().mo73322g().mo73384a().mo73372r(), this.f77211d.mo71221qw().mo73322g().mo73384a().mo73374t(), this.f77211d.mo71221qw().mo73322g().mo73384a().mo73362g(), this.f77211d.mo71221qw().mo73317d()));
            }

            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                mo71228a((C41238w) obj);
                return C41238w.f97225a;
            }
        }

        /* renamed from: aq0.k$c$b */
        static final class C31033b extends C41537m implements C43075l {

            /* renamed from: d */
            final /* synthetic */ C31028k f77212d;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            C31033b(C31028k kVar) {
                super(1);
                this.f77212d = kVar;
            }

            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                invoke((Throwable) obj);
                return C41238w.f97225a;
            }

            public final void invoke(Throwable th) {
                Throwable th2 = th;
                C41536l.m120489i(th2, "throwable");
                C31028k kVar = this.f77212d;
                C40044a aVar = C40044a.LOAN_RESULT_ERROR;
                String str = "";
                String Z = C32343x.m95428Z(th2, str);
                if (Z != null) {
                    str = Z;
                }
                kVar.m92401o5(aVar, str);
                C1644x mw = this.f77212d.f77203p;
                C37444a aVar2 = (C37444a) this.f77212d.f77203p.mo4814f();
                mw.mo4826r(aVar2 != null ? C37444a.m110309b(aVar2, Utils.DOUBLE_EPSILON, (Double) null, (Double) null, (Double) null, (String) null, (List) null, C32343x.m95466m(th), false, false, 447, (Object) null) : null);
            }
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C31031c(C31028k kVar) {
            super(1);
            this.f77210d = kVar;
        }

        /* renamed from: a */
        public final void mo71227a(C31128a aVar) {
            this.f77210d.m92408xw(aVar instanceof C31128a.C31130b);
            C41536l.m120488h(aVar, "result");
            C31132b.m92648j(aVar, (int[]) null, new C31032a(this.f77210d), 1, (Object) null);
            C31132b.m92643e(aVar, (int[]) null, new C31033b(this.f77210d), 1, (Object) null);
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            mo71227a((C31128a) obj);
            return C41238w.f97225a;
        }
    }

    /* renamed from: aq0.k$d */
    static final class C31034d extends C41537m implements C43075l {

        /* renamed from: d */
        final /* synthetic */ C31028k f77213d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C31034d(C31028k kVar) {
            super(1);
            this.f77213d = kVar;
        }

        /* renamed from: a */
        public final C40754t invoke(C41238w wVar) {
            C41536l.m120489i(wVar, "it");
            CheckDecisionDetailsUiModel a = this.f77213d.mo71221qw().mo73322g().mo73384a();
            return C31270e.m92880i(this.f77213d.f77192e.mo92746a(Double.valueOf(a.mo73368l()), a.mo73369m(), Integer.valueOf(a.mo73372r()), Integer.valueOf(a.mo73374t()), this.f77213d.mo71221qw().mo73327k().name(), this.f77213d.mo71221qw().mo73323h(), a.mo73373s(), C24978b.m79846b(Boolean.valueOf(this.f77213d.mo71221qw().mo73326j())).mo63391e(), this.f77213d.mo71221qw().mo73329m(), this.f77213d.mo71221qw().mo73330p(), this.f77213d.mo71221qw().mo73321f(), a.mo73357d(), a.mo73359e(), a.mo73361f(), "LND_OFFER_CONSUMER", this.f77213d.mo71221qw().mo73319e(), this.f77213d.mo71221qw().mo73316b()), -1);
        }
    }

    /* renamed from: aq0.k$e */
    static final class C31035e extends C41537m implements C43075l {

        /* renamed from: d */
        final /* synthetic */ C31028k f77214d;

        /* renamed from: aq0.k$e$a */
        static final class C31036a extends C41537m implements C43075l {

            /* renamed from: d */
            final /* synthetic */ C31028k f77215d;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            C31036a(C31028k kVar) {
                super(1);
                this.f77215d = kVar;
            }

            /* renamed from: a */
            public final void mo71232a(C25950a aVar) {
                this.f77215d.m92408xw(true);
            }

            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                mo71232a((C25950a) obj);
                return C41238w.f97225a;
            }
        }

        /* renamed from: aq0.k$e$b */
        static final class C31037b extends C41537m implements C43075l {

            /* renamed from: d */
            final /* synthetic */ C31028k f77216d;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            C31037b(C31028k kVar) {
                super(1);
                this.f77216d = kVar;
            }

            /* renamed from: a */
            public final void mo71233a(C25950a aVar) {
                C41536l.m120489i(aVar, "it");
                this.f77216d.m92408xw(false);
                this.f77216d.f77204q.mo4826r(C32343x.m95466m(aVar.mo64864a()));
            }

            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                mo71233a((C25950a) obj);
                return C41238w.f97225a;
            }
        }

        /* renamed from: aq0.k$e$c */
        static final class C31038c extends C41537m implements C43075l {

            /* renamed from: d */
            final /* synthetic */ C31028k f77217d;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            C31038c(C31028k kVar) {
                super(1);
                this.f77217d = kVar;
            }

            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                invoke((Throwable) obj);
                return C41238w.f97225a;
            }

            public final void invoke(Throwable th) {
                C41536l.m120489i(th, "throwable");
                C1644x mw = this.f77217d.f77203p;
                C37444a aVar = (C37444a) this.f77217d.f77203p.mo4814f();
                mw.mo4826r(aVar != null ? C37444a.m110309b(aVar, Utils.DOUBLE_EPSILON, (Double) null, (Double) null, (Double) null, (String) null, (List) null, C32343x.m95466m(th), false, false, 319, (Object) null) : null);
            }
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C31035e(C31028k kVar) {
            super(1);
            this.f77214d = kVar;
        }

        /* renamed from: a */
        public final void mo71231a(C31128a aVar) {
            C41536l.m120488h(aVar, "result");
            C31132b.m92646h(aVar, (int[]) null, new C31036a(this.f77214d), 1, (Object) null);
            C31132b.m92648j(aVar, (int[]) null, new C31037b(this.f77214d), 1, (Object) null);
            C31132b.m92643e(aVar, (int[]) null, new C31038c(this.f77214d), 1, (Object) null);
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            mo71231a((C31128a) obj);
            return C41238w.f97225a;
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C31028k(ActivationDetailsData activationDetailsData, C31019d dVar, C39055b bVar, C39059f fVar, C26617h hVar, C38345b bVar2, C25352k kVar, PreferencesApiManager preferencesApiManager, C20292b bVar3, C28474a aVar, C27494a aVar2) {
        super((C41204a) null, 1, (DefaultConstructorMarker) null);
        C41536l.m120489i(activationDetailsData, "data");
        C41536l.m120489i(dVar, "uiStateHelper");
        C41536l.m120489i(bVar, "getActivationPreContract");
        C41536l.m120489i(fVar, "registerLoan");
        C41536l.m120489i(hVar, "refreshOffers");
        C41536l.m120489i(bVar2, "getNboOffers");
        C41536l.m120489i(kVar, "reloadProducts");
        C41536l.m120489i(preferencesApiManager, "preferencesApiManager");
        C41536l.m120489i(bVar3, "getAppSettingByName");
        C41536l.m120489i(aVar, "applicationEventPoster");
        C41536l.m120489i(aVar2, "otpParamsMapBuilder");
        this.f77191d = activationDetailsData;
        this.f77192e = bVar;
        this.f77193f = fVar;
        this.f77194g = hVar;
        this.f77195h = bVar2;
        this.f77196i = kVar;
        this.f77197j = preferencesApiManager;
        this.f77198k = bVar3;
        this.f77199l = aVar;
        this.f77200m = aVar2;
        C1644x xVar = new C1644x();
        this.f77203p = xVar;
        this.f77204q = new C1644x();
        this.f77205r = new C1644x();
        this.f77206s = new C1644x();
        C40767b h1 = C40767b.m118210h1();
        C41536l.m120488h(h1, "create<Unit>()");
        this.f77207t = h1;
        C40767b h12 = C40767b.m118210h1();
        C41536l.m120488h(h12, "create<RegisterLoanParamObject>()");
        this.f77208u = h12;
        m92406vw(this, C40044a.LOAN_SUMMARY_PAGE_LOADED, (String) null, 2, (Object) null);
        xVar.mo4826r(dVar.mo71216f(activationDetailsData));
        m92387Bw();
        m92409yw();
    }

    /* access modifiers changed from: private */
    /* renamed from: Aw */
    public static final void m92386Aw(C43075l lVar, Object obj) {
        C41536l.m120489i(lVar, "$tmp0");
        lVar.invoke(obj);
    }

    /* renamed from: Bw */
    private final void m92387Bw() {
        C40749p L0 = this.f77207t.mo94989L0(new C31026i(new C31034d(this)));
        C41536l.m120488h(L0, "private fun subscribeToP…ndToLifecycle()\n        }");
        C41205b F0 = C32343x.m95413R0(L0).mo94981F0(new C31027j(new C31035e(this)));
        C41536l.m120488h(F0, "private fun subscribeToP…ndToLifecycle()\n        }");
        bindToLifecycle(F0);
    }

    /* access modifiers changed from: private */
    /* renamed from: Cw */
    public static final C40754t m92388Cw(C43075l lVar, Object obj) {
        C41536l.m120489i(lVar, "$tmp0");
        return (C40754t) lVar.invoke(obj);
    }

    /* access modifiers changed from: private */
    /* renamed from: Dw */
    public static final void m92389Dw(C43075l lVar, Object obj) {
        C41536l.m120489i(lVar, "$tmp0");
        lVar.invoke(obj);
    }

    /* access modifiers changed from: private */
    /* renamed from: o5 */
    public final void m92401o5(C40044a aVar, String str) {
        String[] strArr = new String[3];
        String h = this.f77191d.mo73323h();
        if (h == null) {
            h = "";
        }
        strArr[0] = h;
        strArr[1] = this.f77191d.mo73328l();
        strArr[2] = str;
        C40045b.m116033a(this, aVar, C41341q.m119910m(strArr));
    }

    /* renamed from: rw */
    private final String m92404rw() {
        String str;
        C37223a aVar = (C37223a) this.f77204q.mo4814f();
        if (aVar != null) {
            str = (String) aVar.mo90299d();
        } else {
            str = null;
        }
        if (str == null) {
            return null;
        }
        byte[] bytes = str.getBytes(C40407d.f95989b);
        C41536l.m120488h(bytes, "this as java.lang.String).getBytes(charset)");
        if (bytes != null) {
            return C32359z0.m95597y(bytes);
        }
        return null;
    }

    /* renamed from: uw */
    private final RegisterLoanParamObject m92405uw(String str, String str2, String str3) {
        Long l;
        String str4;
        String str5;
        Double c;
        UtmParamsEntity utmParams = this.f77197j.getUtmParams();
        C20557a b = this.f77198k.mo48775b("UTM_PARAMETER_EXPIRATION_IN_HOURS");
        String str6 = null;
        if (b == null || (c = b.mo49086c()) == null) {
            l = null;
        } else {
            l = Long.valueOf((long) c.doubleValue());
        }
        if (!C28323a.m86959a(utmParams, l)) {
            utmParams = null;
        }
        String l2 = this.f77191d.mo73328l();
        String rw = m92404rw();
        Long f = this.f77191d.mo73321f();
        String m = this.f77191d.mo73329m();
        String h = this.f77191d.mo73323h();
        if (utmParams != null) {
            str4 = utmParams.getMedium();
        } else {
            str4 = null;
        }
        if (utmParams != null) {
            str5 = utmParams.getSource();
        } else {
            str5 = null;
        }
        if (utmParams != null) {
            str6 = utmParams.getCampaign();
        }
        return new RegisterLoanParamObject(l2, rw, f, m, h, str4, str5, str6, (String) null, (String) null, str, str2, str3, 768, (DefaultConstructorMarker) null);
    }

    /* renamed from: vw */
    static /* synthetic */ void m92406vw(C31028k kVar, C40044a aVar, String str, int i, Object obj) {
        if ((i & 2) != 0) {
            str = "";
        }
        kVar.m92401o5(aVar, str);
    }

    /* access modifiers changed from: private */
    /* renamed from: ww */
    public final void m92407ww() {
        this.f77194g.mo65871a();
        C38345b.C38346a.m112650a(this.f77195h, true, false, 2, (Object) null);
        this.f77196i.invoke();
        this.f77199l.mo68096b();
    }

    /* access modifiers changed from: private */
    /* renamed from: xw */
    public final void m92408xw(boolean z) {
        C1644x xVar = this.f77203p;
        C37444a aVar = (C37444a) xVar.mo4814f();
        xVar.mo4826r(aVar != null ? C37444a.m110309b(aVar, Utils.DOUBLE_EPSILON, (Double) null, (Double) null, (Double) null, (String) null, (List) null, (C37223a) null, z, false, 383, (Object) null) : null);
    }

    /* renamed from: yw */
    private final void m92409yw() {
        C40749p L0 = this.f77208u.mo94989L0(new C31024g(new C31030b(this)));
        C41536l.m120488h(L0, "private fun subscribeToL…ndToLifecycle()\n        }");
        C41205b F0 = C32343x.m95413R0(L0).mo94981F0(new C31025h(new C31031c(this)));
        C41536l.m120488h(F0, "private fun subscribeToL…ndToLifecycle()\n        }");
        bindToLifecycle(F0);
    }

    /* access modifiers changed from: private */
    /* renamed from: zw */
    public static final C40754t m92410zw(C43075l lVar, Object obj) {
        C41536l.m120489i(lVar, "$tmp0");
        return (C40754t) lVar.invoke(obj);
    }

    /* renamed from: U1 */
    public LiveData mo71217U1() {
        return this.f77204q;
    }

    /* renamed from: a */
    public LiveData mo71218a() {
        return this.f77203p;
    }

    /* renamed from: a0 */
    public LiveData mo71219a0() {
        return this.f77205r;
    }

    /* renamed from: hg */
    public LiveData mo71220hg() {
        return this.f77206s;
    }

    /* renamed from: qw */
    public final ActivationDetailsData mo71221qw() {
        return this.f77191d;
    }

    /* renamed from: s0 */
    public void mo71222s0() {
        m92406vw(this, C40044a.LOAN_SUMMARY_ACTIVATE_CLICK, (String) null, 2, (Object) null);
        this.f77207t.onNext(C41238w.f97225a);
    }

    /* renamed from: sw */
    public final C32415a mo71223sw() {
        return this.f77201n;
    }

    /* renamed from: tw */
    public final C31023f mo71224tw() {
        return this.f77202o;
    }

    /* renamed from: y4 */
    public void mo71225y4(String str, String str2, String str3) {
        RegisterLoanParamObject uw = m92405uw(str, str2, str3);
        if (C32300e0.f79712a.mo72816a(str, str2, str3)) {
            this.f77208u.onNext(uw);
            return;
        }
        C37224b.m109965d(this.f77205r, C41233s.m119492a(uw.getOtpServiceId(), this.f77200m.mo66809a(uw)));
        m92406vw(this, C40044a.LOAN_PRECONTRACT_AGREE_CLICK, (String) null, 2, (Object) null);
    }
}
