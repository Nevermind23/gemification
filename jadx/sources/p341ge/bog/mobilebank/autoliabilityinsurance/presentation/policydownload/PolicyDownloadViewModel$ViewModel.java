package p341ge.bog.mobilebank.autoliabilityinsurance.presentation.policydownload;

import androidx.lifecycle.C1644x;
import b41.C31128a;
import c41.C31270e;
import ed1.C40749p;
import ed1.C40754t;
import ed1.C40762x;
import ee1.C40767b;
import g91.C32343x;
import hd1.C41204a;
import hd1.C41205b;
import he1.C41224m;
import he1.C41233s;
import he1.C41238w;
import kotlin.jvm.internal.C41536l;
import kotlin.jvm.internal.C41537m;
import kotlin.jvm.internal.DefaultConstructorMarker;
import m41.C37224b;
import p341ge.bog.mobilebank.autoliabilityinsurance.domain.model.PolicyDetailsModel;
import p341ge.bog.mobilebank.cleanarch.presentation.common.C21481a;
import p535nk.C17031k;
import p535nk.C17032l;
import p686yk.C18933f;
import p686yk.C18934g;
import p686yk.C18935h;
import p686yk.C18936i;
import p686yk.C18937j;
import p686yk.C18938k;
import ue1.C43075l;
import ue1.C43079p;
import xd0.C29742a;
import yd0.C29991a;
import yd0.C30003b;

/* renamed from: ge.bog.mobilebank.autoliabilityinsurance.presentation.policydownload.PolicyDownloadViewModel$ViewModel */
public final class PolicyDownloadViewModel$ViewModel extends C21481a implements C18933f, C18934g {
    /* access modifiers changed from: private */

    /* renamed from: d */
    public final C17031k f40850d;

    /* renamed from: e */
    private final C18933f f40851e = this;

    /* renamed from: f */
    private final C18934g f40852f = this;
    /* access modifiers changed from: private */

    /* renamed from: g */
    public PolicyDetailsModel f40853g;

    /* renamed from: h */
    private final C40767b f40854h;

    /* renamed from: i */
    private final C1644x f40855i;

    /* renamed from: j */
    private final C1644x f40856j;

    /* renamed from: ge.bog.mobilebank.autoliabilityinsurance.presentation.policydownload.PolicyDownloadViewModel$ViewModel$a */
    static final class C13683a extends C41537m implements C43079p {

        /* renamed from: d */
        public static final C13683a f40857d = new C13683a();

        C13683a() {
            super(2);
        }

        /* renamed from: a */
        public final C41224m invoke(PolicyDetailsModel policyDetailsModel, C30003b bVar) {
            C41536l.m120489i(policyDetailsModel, "policy");
            C41536l.m120489i(bVar, "info");
            return C41233s.m119492a(policyDetailsModel, bVar);
        }
    }

    /* renamed from: ge.bog.mobilebank.autoliabilityinsurance.presentation.policydownload.PolicyDownloadViewModel$ViewModel$b */
    static final class C13684b extends C41537m implements C43075l {

        /* renamed from: d */
        final /* synthetic */ PolicyDownloadViewModel$ViewModel f40858d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C13684b(PolicyDownloadViewModel$ViewModel policyDownloadViewModel$ViewModel) {
            super(1);
            this.f40858d = policyDownloadViewModel$ViewModel;
        }

        /* renamed from: a */
        public final void mo37573a(C41224m mVar) {
            C30003b bVar = (C30003b) mVar.mo95676b();
            this.f40858d.f40853g = (PolicyDetailsModel) mVar.mo95675a();
            C1644x qw = this.f40858d.mo37571w7();
            C41536l.m120488h(bVar, "info");
            C37224b.m109965d(qw, bVar);
            this.f40858d.m51187rw();
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            mo37573a((C41224m) obj);
            return C41238w.f97225a;
        }
    }

    /* renamed from: ge.bog.mobilebank.autoliabilityinsurance.presentation.policydownload.PolicyDownloadViewModel$ViewModel$c */
    static final class C13685c extends C41537m implements C43075l {

        /* renamed from: d */
        final /* synthetic */ PolicyDownloadViewModel$ViewModel f40859d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C13685c(PolicyDownloadViewModel$ViewModel policyDownloadViewModel$ViewModel) {
            super(1);
            this.f40859d = policyDownloadViewModel$ViewModel;
        }

        /* renamed from: a */
        public final C40754t invoke(C41238w wVar) {
            C41536l.m120489i(wVar, "it");
            C17031k jw = this.f40859d.f40850d;
            PolicyDetailsModel kw = this.f40859d.f40853g;
            C41536l.m120486f(kw);
            C40749p O = jw.mo44224a(kw.mo37375h()).mo95075O();
            C41536l.m120488h(O, "getPolicyPdfUseCase(_reg…!!.docKey).toObservable()");
            return C31270e.m92879h(O, -1);
        }
    }

    /* renamed from: ge.bog.mobilebank.autoliabilityinsurance.presentation.policydownload.PolicyDownloadViewModel$ViewModel$d */
    static final class C13686d extends C41537m implements C43075l {

        /* renamed from: d */
        final /* synthetic */ PolicyDownloadViewModel$ViewModel f40860d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C13686d(PolicyDownloadViewModel$ViewModel policyDownloadViewModel$ViewModel) {
            super(1);
            this.f40860d = policyDownloadViewModel$ViewModel;
        }

        /* renamed from: a */
        public final void mo37575a(C31128a aVar) {
            this.f40860d.mo37566lu().mo4826r(aVar);
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            mo37575a((C31128a) obj);
            return C41238w.f97225a;
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public PolicyDownloadViewModel$ViewModel(C17032l lVar, C29742a aVar, C17031k kVar) {
        super((C41204a) null, 1, (DefaultConstructorMarker) null);
        C41536l.m120489i(lVar, "getSelectedPolicyUseCase");
        C41536l.m120489i(aVar, "getClientCampaignInfo");
        C41536l.m120489i(kVar, "getPolicyPdfUseCase");
        this.f40850d = kVar;
        C40767b h1 = C40767b.m118210h1();
        C41536l.m120488h(h1, "create<Unit>()");
        this.f40854h = h1;
        this.f40855i = new C1644x();
        this.f40856j = new C1644x();
        C40749p O = C40762x.m118154T(lVar.mo44225a(), aVar.mo47470a(C29991a.C29994c.C29995a.f75807e), new C18935h(C13683a.f40857d)).mo95075O();
        C41536l.m120488h(O, "zip(getSelectedPolicyUse…          .toObservable()");
        C41205b F0 = C32343x.m95462k1(O).mo94981F0(new C18936i(new C13684b(this)));
        C41536l.m120488h(F0, "zip(getSelectedPolicyUse…bject()\n                }");
        bindToLifecycle(F0);
    }

    /* access modifiers changed from: private */
    /* renamed from: hw */
    public static final C41224m m51181hw(C43079p pVar, Object obj, Object obj2) {
        C41536l.m120489i(pVar, "$tmp0");
        return (C41224m) pVar.invoke(obj, obj2);
    }

    /* access modifiers changed from: private */
    /* renamed from: iw */
    public static final void m51182iw(C43075l lVar, Object obj) {
        C41536l.m120489i(lVar, "$tmp0");
        lVar.invoke(obj);
    }

    /* access modifiers changed from: private */
    /* renamed from: rw */
    public final void m51187rw() {
        C40749p Q = this.f40854h.mo94998Q(new C18937j(new C13685c(this)));
        C41536l.m120488h(Q, "private fun subscribeToP…ndToLifecycle()\n        }");
        C41205b F0 = C32343x.m95413R0(Q).mo94981F0(new C18938k(new C13686d(this)));
        C41536l.m120488h(F0, "private fun subscribeToP…ndToLifecycle()\n        }");
        bindToLifecycle(F0);
    }

    /* access modifiers changed from: private */
    /* renamed from: sw */
    public static final C40754t m51188sw(C43075l lVar, Object obj) {
        C41536l.m120489i(lVar, "$tmp0");
        return (C40754t) lVar.invoke(obj);
    }

    /* access modifiers changed from: private */
    /* renamed from: tw */
    public static final void m51189tw(C43075l lVar, Object obj) {
        C41536l.m120489i(lVar, "$tmp0");
        lVar.invoke(obj);
    }

    /* renamed from: Lk */
    public void mo37565Lk() {
        this.f40854h.onNext(C41238w.f97225a);
    }

    /* renamed from: nw */
    public final C18933f mo37567nw() {
        return this.f40851e;
    }

    /* renamed from: ow */
    public final C18934g mo37568ow() {
        return this.f40852f;
    }

    /* renamed from: pw */
    public C1644x mo37566lu() {
        return this.f40855i;
    }

    /* renamed from: qw */
    public C1644x mo37571w7() {
        return this.f40856j;
    }
}
