package p341ge.bog.mobilebank.galtandtaggart.presentation.onboarding.employmentinfo;

import androidx.lifecycle.C1644x;
import b41.C31128a;
import c41.C31270e;
import df0.C19992b;
import df0.C19994d;
import ed1.C40749p;
import ed1.C40754t;
import ee1.C40767b;
import ef0.C20232g;
import gd1.C40992a;
import hd1.C41204a;
import he1.C41238w;
import ie0.C25190j;
import java.util.concurrent.atomic.AtomicReference;
import kotlin.jvm.internal.C41536l;
import kotlin.jvm.internal.C41537m;
import kotlin.jvm.internal.DefaultConstructorMarker;
import p341ge.bog.mobilebank.cleanarch.presentation.common.C21481a;
import p341ge.bog.mobilebank.model.Client;
import ue1.C43075l;
import vf0.C29050j;
import vf0.C29051k;
import vf0.C29052l;
import wf0.C29370a;
import xf0.C29761a;
import xf0.C29763b;
import xf0.C29764c;
import xf0.C29765d;
import xf0.C29766e;

/* renamed from: ge.bog.mobilebank.galtandtaggart.presentation.onboarding.employmentinfo.GTOnboardingEmploymentInfoViewModel$ViewModel */
public final class GTOnboardingEmploymentInfoViewModel$ViewModel extends C21481a implements C29050j, C29051k {
    /* access modifiers changed from: private */

    /* renamed from: d */
    public final C19992b f61503d;

    /* renamed from: e */
    private final C19994d f61504e;
    /* access modifiers changed from: private */

    /* renamed from: f */
    public final C29370a f61505f;

    /* renamed from: g */
    private final Client f61506g;

    /* renamed from: h */
    private final C29050j f61507h = this;

    /* renamed from: i */
    private final C29051k f61508i = this;

    /* renamed from: j */
    private final C1644x f61509j = new C1644x();

    /* renamed from: k */
    private boolean f61510k;
    /* access modifiers changed from: private */

    /* renamed from: l */
    public AtomicReference f61511l = new AtomicReference((Object) null);
    /* access modifiers changed from: private */

    /* renamed from: m */
    public AtomicReference f61512m = new AtomicReference((Object) null);

    /* renamed from: n */
    private final C1644x f61513n = new C1644x();

    /* renamed from: o */
    private final C1644x f61514o = new C1644x();

    /* renamed from: p */
    private final C1644x f61515p = new C1644x();

    /* renamed from: q */
    private final C1644x f61516q = new C1644x();

    /* renamed from: r */
    private final C1644x f61517r = new C1644x();

    /* renamed from: s */
    private final C40767b f61518s;

    /* renamed from: ge.bog.mobilebank.galtandtaggart.presentation.onboarding.employmentinfo.GTOnboardingEmploymentInfoViewModel$ViewModel$a */
    static final class C23566a extends C41537m implements C43075l {

        /* renamed from: d */
        final /* synthetic */ GTOnboardingEmploymentInfoViewModel$ViewModel f61519d;

        /* renamed from: ge.bog.mobilebank.galtandtaggart.presentation.onboarding.employmentinfo.GTOnboardingEmploymentInfoViewModel$ViewModel$a$a */
        static final class C23567a extends C41537m implements C43075l {

            /* renamed from: d */
            final /* synthetic */ GTOnboardingEmploymentInfoViewModel$ViewModel f61520d;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            C23567a(GTOnboardingEmploymentInfoViewModel$ViewModel gTOnboardingEmploymentInfoViewModel$ViewModel) {
                super(1);
                this.f61520d = gTOnboardingEmploymentInfoViewModel$ViewModel;
            }

            /* renamed from: a */
            public final C29766e invoke(C20232g gVar) {
                C41536l.m120489i(gVar, "it");
                return this.f61520d.f61505f.mo69220d(gVar);
            }
        }

        /* renamed from: ge.bog.mobilebank.galtandtaggart.presentation.onboarding.employmentinfo.GTOnboardingEmploymentInfoViewModel$ViewModel$a$b */
        static final class C23568b extends C41537m implements C43075l {

            /* renamed from: d */
            final /* synthetic */ GTOnboardingEmploymentInfoViewModel$ViewModel f61521d;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            C23568b(GTOnboardingEmploymentInfoViewModel$ViewModel gTOnboardingEmploymentInfoViewModel$ViewModel) {
                super(1);
                this.f61521d = gTOnboardingEmploymentInfoViewModel$ViewModel;
            }

            /* renamed from: a */
            public final void mo60458a(C29766e eVar) {
                this.f61521d.f61511l.set(eVar);
                this.f61521d.f61512m.set(eVar);
            }

            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                mo60458a((C29766e) obj);
                return C41238w.f97225a;
            }
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C23566a(GTOnboardingEmploymentInfoViewModel$ViewModel gTOnboardingEmploymentInfoViewModel$ViewModel) {
            super(1);
            this.f61519d = gTOnboardingEmploymentInfoViewModel$ViewModel;
        }

        /* access modifiers changed from: private */
        /* renamed from: d */
        public static final C29766e m76247d(C43075l lVar, Object obj) {
            C41536l.m120489i(lVar, "$tmp0");
            return (C29766e) lVar.invoke(obj);
        }

        /* access modifiers changed from: private */
        /* renamed from: e */
        public static final void m76248e(C43075l lVar, Object obj) {
            C41536l.m120489i(lVar, "$tmp0");
            lVar.invoke(obj);
        }

        /* renamed from: c */
        public final C40754t invoke(C41238w wVar) {
            C41536l.m120489i(wVar, "it");
            C40749p O = this.f61519d.f61503d.mo48370a().mo95062A(new C23569a(new C23567a(this.f61519d))).mo95084m(new C23570b(new C23568b(this.f61519d))).mo95075O();
            C41536l.m120488h(O, "@HiltViewModel\n    class…        }\n        }\n    }");
            return C31270e.m92879h(O, 1);
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public GTOnboardingEmploymentInfoViewModel$ViewModel(C19992b bVar, C19994d dVar, C29370a aVar, Client client) {
        super((C41204a) null, 1, (DefaultConstructorMarker) null);
        C41536l.m120489i(bVar, "getUserInfoUseCase");
        C41536l.m120489i(dVar, "saveTemporaryUserInfoUseCase");
        C41536l.m120489i(aVar, "userInfoMapper");
        C41536l.m120489i(client, "client");
        this.f61503d = bVar;
        this.f61504e = dVar;
        this.f61505f = aVar;
        this.f61506g = client;
        C40767b h1 = C40767b.m118210h1();
        C41536l.m120488h(h1, "create<Unit>()");
        this.f61518s = h1;
        C40749p o0 = h1.mo94989L0(new C29052l(new C23566a(this))).mo95027o0(C40992a.m118827a());
        C41536l.m120488h(o0, "employmentInfoSubject.sw…dSchedulers.mainThread())");
        bindToLifecycle(C31270e.m92876e(o0, mo60442fq()));
        h1.onNext(C41238w.f97225a);
    }

    /* access modifiers changed from: private */
    /* renamed from: ew */
    public static final C40754t m76209ew(C43075l lVar, Object obj) {
        C41536l.m120489i(lVar, "$tmp0");
        return (C40754t) lVar.invoke(obj);
    }

    /* renamed from: sw */
    private final void m76214sw() {
        int i;
        C29766e eVar = (C29766e) this.f61512m.get();
        if (eVar == null) {
            mo60439Xa().mo4823o(Boolean.FALSE);
            return;
        }
        C29761a a = eVar.mo69929a();
        C29763b b = eVar.mo69930b();
        C29764c c = eVar.mo69931c();
        boolean z = false;
        if (a.mo69899k() && a.mo69901m(this.f61510k) && b.mo69910a() != null) {
            Integer a2 = c.mo69916a();
            if (a2 != null) {
                i = a2.intValue();
            } else {
                i = 0;
            }
            if (i > 0) {
                z = true;
            }
        }
        mo60439Xa().mo4823o(Boolean.valueOf(z));
    }

    /* renamed from: Dp */
    public void mo60427Dp(String str) {
        C41536l.m120489i(str, "companyTag");
        C29766e eVar = (C29766e) this.f61512m.get();
        if (eVar != null) {
            eVar.mo69929a().mo69904p(str);
        }
        m76214sw();
    }

    /* renamed from: Eg */
    public void mo60428Eg() {
        C31128a aVar = (C31128a) mo60442fq().mo4814f();
        if (aVar != null && (aVar instanceof C31128a.C31131c)) {
            mo60430J9().mo4823o(((C29766e) ((C31128a.C31131c) aVar).mo71340a()).mo69930b().mo69911b());
        }
    }

    /* renamed from: Ia */
    public void mo60429Ia() {
        C31128a aVar = (C31128a) mo60442fq().mo4814f();
        if (aVar != null && (aVar instanceof C31128a.C31131c)) {
            mo60440Yu().mo4823o(((C29766e) ((C31128a.C31131c) aVar).mo71340a()).mo69929a().mo69898j());
        }
    }

    /* renamed from: Jg */
    public void mo60431Jg() {
        C31128a aVar = (C31128a) mo60442fq().mo4814f();
        if (aVar != null && (aVar instanceof C31128a.C31131c)) {
            mo60426Ab().mo4823o(((C29766e) ((C31128a.C31131c) aVar).mo71340a()).mo69929a().mo69895h());
        }
    }

    /* renamed from: Kp */
    public void mo60432Kp(C29765d dVar) {
        C41536l.m120489i(dVar, "source");
        C29766e eVar = (C29766e) this.f61512m.get();
        if (eVar != null) {
            eVar.mo69930b().mo69912c(dVar);
            mo60442fq().mo4823o(new C31128a.C31131c(eVar, 0, 2, (DefaultConstructorMarker) null));
        }
        m76214sw();
    }

    /* renamed from: Nt */
    public void mo60433Nt(boolean z) {
        this.f61510k = z;
        m76214sw();
    }

    /* renamed from: Pj */
    public void mo60435Pj(C29765d dVar) {
        C41536l.m120489i(dVar, "status");
        C29766e eVar = (C29766e) this.f61512m.get();
        if (eVar != null) {
            eVar.mo69929a().mo69906r(dVar);
            mo60442fq().mo4823o(new C31128a.C31131c(eVar, 0, 2, (DefaultConstructorMarker) null));
            if (!eVar.mo69929a().mo69900l()) {
                mo60436Q7((C29765d) null);
                mo60453tp((C29765d) null);
                mo60455v2((String) null);
            }
        }
        m76214sw();
    }

    /* renamed from: Q7 */
    public void mo60436Q7(C29765d dVar) {
        C29766e eVar = (C29766e) this.f61512m.get();
        if (eVar != null) {
            eVar.mo69929a().mo69908t(dVar);
            mo60442fq().mo4823o(new C31128a.C31131c(eVar, 0, 2, (DefaultConstructorMarker) null));
        }
        m76214sw();
    }

    /* renamed from: Uq */
    public void mo60437Uq(boolean z) {
        C29766e eVar = (C29766e) this.f61512m.get();
        if (eVar != null) {
            eVar.mo69929a().mo69902n(z);
            mo60442fq().mo4823o(new C31128a.C31131c(eVar, 0, 2, (DefaultConstructorMarker) null));
        }
        m76214sw();
    }

    /* renamed from: Vh */
    public void mo60438Vh(int i) {
        C29766e eVar = (C29766e) this.f61512m.get();
        if (eVar != null) {
            eVar.mo69931c().mo69917b(Integer.valueOf(i));
        }
        m76214sw();
    }

    /* renamed from: du */
    public void mo60441du(String str) {
        C41536l.m120489i(str, "company");
        C29766e eVar = (C29766e) this.f61512m.get();
        if (eVar != null) {
            eVar.mo69929a().mo69903o(str);
        }
        m76214sw();
    }

    /* renamed from: jw */
    public final C29050j mo60443jw() {
        return this.f61507h;
    }

    /* renamed from: kw */
    public C1644x mo60439Xa() {
        return this.f61517r;
    }

    /* renamed from: lw */
    public final C29051k mo60445lw() {
        return this.f61508i;
    }

    /* renamed from: mw */
    public int mo60446mw() {
        if (this.f61506g.getUserInfo().isSolo() || this.f61506g.getUserInfo().isWealth()) {
            return C25190j.gt_onboarding_lov_share_in_company_solo;
        }
        return C25190j.gt_onboarding_lov_share_in_company;
    }

    /* renamed from: nw */
    public C1644x mo60426Ab() {
        return this.f61515p;
    }

    /* renamed from: ow */
    public C1644x mo60434O5() {
        return this.f61513n;
    }

    /* renamed from: pa */
    public void mo60449pa() {
        C31128a aVar = (C31128a) mo60442fq().mo4814f();
        if (aVar != null && (aVar instanceof C31128a.C31131c)) {
            mo60434O5().mo4823o(((C29766e) ((C31128a.C31131c) aVar).mo71340a()).mo69929a().mo69893f());
        }
    }

    /* renamed from: pw */
    public C1644x mo60440Yu() {
        return this.f61514o;
    }

    /* renamed from: qw */
    public C1644x mo60430J9() {
        return this.f61516q;
    }

    /* renamed from: rw */
    public C1644x mo60442fq() {
        return this.f61509j;
    }

    /* renamed from: tp */
    public void mo60453tp(C29765d dVar) {
        C29766e eVar = (C29766e) this.f61512m.get();
        if (eVar != null) {
            eVar.mo69929a().mo69907s(dVar);
            mo60442fq().mo4823o(new C31128a.C31131c(eVar, 0, 2, (DefaultConstructorMarker) null));
        }
        m76214sw();
    }

    /* renamed from: u9 */
    public void mo60454u9() {
        C29766e eVar = (C29766e) this.f61512m.get();
        if (eVar != null) {
            this.f61504e.mo48372a(this.f61505f.mo69224j(eVar));
        }
    }

    /* renamed from: v2 */
    public void mo60455v2(String str) {
        C29766e eVar = (C29766e) this.f61512m.get();
        if (eVar != null) {
            eVar.mo69929a().mo69905q(str);
        }
        m76214sw();
    }
}
