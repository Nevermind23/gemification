package p341ge.bog.mobilebank.autoliabilityinsurance.presentation.registermtplpolicy;

import androidx.lifecycle.C1644x;
import b41.C31128a;
import c41.C31270e;
import com.github.mikephil.charting.utils.Utils;
import ed1.C40749p;
import ed1.C40754t;
import ee1.C40767b;
import g91.C32343x;
import gd1.C40992a;
import hd1.C41204a;
import hd1.C41205b;
import he1.C41238w;
import java.util.List;
import kotlin.jvm.internal.C41536l;
import kotlin.jvm.internal.C41537m;
import kotlin.jvm.internal.DefaultConstructorMarker;
import p341ge.bog.mobilebank.autoliabilityinsurance.domain.model.SCARegisterPolicyParams;
import p341ge.bog.mobilebank.cleanarch.presentation.common.C21481a;
import p381cl.C10494k;
import p381cl.C10496l;
import p381cl.C10497m;
import p381cl.C10498n;
import p381cl.C10499o;
import p381cl.C10500p;
import p381cl.C10501q;
import p381cl.C10502r;
import p535nk.C17020c;
import p535nk.C17022e;
import p535nk.C17024f;
import p535nk.C17025g;
import p535nk.C17043u;
import p535nk.C17046x;
import p563pk.C17379i;
import p563pk.C17381k;
import p563pk.C17384n;
import pc0.C27494a;
import ue1.C43075l;
import ue1.C43080q;

/* renamed from: ge.bog.mobilebank.autoliabilityinsurance.presentation.registermtplpolicy.RegisterMtplPolicyViewModel$ViewModel */
public final class RegisterMtplPolicyViewModel$ViewModel extends C21481a implements C10497m, C10498n {

    /* renamed from: d */
    private final C17043u f40928d;
    /* access modifiers changed from: private */

    /* renamed from: e */
    public final C17046x f40929e;

    /* renamed from: f */
    private final C27494a f40930f;

    /* renamed from: g */
    private final C10498n f40931g = this;

    /* renamed from: h */
    private final C10497m f40932h = this;

    /* renamed from: i */
    private final C1644x f40933i = new C1644x();

    /* renamed from: j */
    private final C1644x f40934j = new C1644x();

    /* renamed from: k */
    private final C1644x f40935k = new C1644x();

    /* renamed from: l */
    private final C40767b f40936l;
    /* access modifiers changed from: private */

    /* renamed from: m */
    public SCARegisterPolicyParams f40937m;

    /* renamed from: ge.bog.mobilebank.autoliabilityinsurance.presentation.registermtplpolicy.RegisterMtplPolicyViewModel$ViewModel$a */
    static final class C13727a extends C41537m implements C43080q {

        /* renamed from: d */
        final /* synthetic */ RegisterMtplPolicyViewModel$ViewModel f40938d;

        /* renamed from: e */
        final /* synthetic */ C10494k f40939e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C13727a(RegisterMtplPolicyViewModel$ViewModel registerMtplPolicyViewModel$ViewModel, C10494k kVar) {
            super(3);
            this.f40938d = registerMtplPolicyViewModel$ViewModel;
            this.f40939e = kVar;
        }

        /* renamed from: a */
        public final C10496l invoke(C17381k kVar, List list, List list2) {
            C41536l.m120489i(kVar, "policyDetails");
            C41536l.m120489i(list, "providers");
            C41536l.m120489i(list2, "cards");
            this.f40938d.f40937m = this.f40939e.mo27207c(kVar, list, list2);
            return this.f40939e.mo27206a(kVar, list, list2);
        }
    }

    /* renamed from: ge.bog.mobilebank.autoliabilityinsurance.presentation.registermtplpolicy.RegisterMtplPolicyViewModel$ViewModel$b */
    static final class C13728b extends C41537m implements C43075l {

        /* renamed from: d */
        final /* synthetic */ RegisterMtplPolicyViewModel$ViewModel f40940d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C13728b(RegisterMtplPolicyViewModel$ViewModel registerMtplPolicyViewModel$ViewModel) {
            super(1);
            this.f40940d = registerMtplPolicyViewModel$ViewModel;
        }

        /* renamed from: a */
        public final void mo37629a(C10496l lVar) {
            this.f40940d.mo27223a().mo4826r(lVar);
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            mo37629a((C10496l) obj);
            return C41238w.f97225a;
        }
    }

    /* renamed from: ge.bog.mobilebank.autoliabilityinsurance.presentation.registermtplpolicy.RegisterMtplPolicyViewModel$ViewModel$c */
    static final class C13729c extends C41537m implements C43075l {

        /* renamed from: d */
        final /* synthetic */ RegisterMtplPolicyViewModel$ViewModel f40941d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C13729c(RegisterMtplPolicyViewModel$ViewModel registerMtplPolicyViewModel$ViewModel) {
            super(1);
            this.f40941d = registerMtplPolicyViewModel$ViewModel;
        }

        /* renamed from: a */
        public final C40754t invoke(C17384n nVar) {
            C41536l.m120489i(nVar, "params");
            C40749p O = this.f40941d.f40929e.mo44237a(nVar.mo44889a()).mo95075O();
            C41536l.m120488h(O, "registerInsurancePolicyU…arameters).toObservable()");
            return C31270e.m92879h(O, -1);
        }
    }

    /* renamed from: ge.bog.mobilebank.autoliabilityinsurance.presentation.registermtplpolicy.RegisterMtplPolicyViewModel$ViewModel$d */
    static final class C13730d extends C41537m implements C43075l {

        /* renamed from: d */
        final /* synthetic */ RegisterMtplPolicyViewModel$ViewModel f40942d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C13730d(RegisterMtplPolicyViewModel$ViewModel registerMtplPolicyViewModel$ViewModel) {
            super(1);
            this.f40942d = registerMtplPolicyViewModel$ViewModel;
        }

        /* renamed from: a */
        public final void mo37631a(C31128a aVar) {
            this.f40942d.mo27224tb().mo4826r(aVar);
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            mo37631a((C31128a) obj);
            return C41238w.f97225a;
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public RegisterMtplPolicyViewModel$ViewModel(C17022e eVar, C17020c cVar, C17025g gVar, C17024f fVar, C10494k kVar, C17043u uVar, C17046x xVar, C27494a aVar) {
        super((C41204a) null, 1, (DefaultConstructorMarker) null);
        C41536l.m120489i(eVar, "getInsuranceCardsUseCase");
        C41536l.m120489i(cVar, "getCurrentPolicyDetailsUseCase");
        C41536l.m120489i(gVar, "getLastLoadedProvidersUseCase");
        C41536l.m120489i(fVar, "getLastLoadedInsuranceCardsUseCase");
        C41536l.m120489i(kVar, "mapper");
        C41536l.m120489i(uVar, "onPaymentMethodSelectedUseCase");
        C41536l.m120489i(xVar, "registerInsurancePolicyUseCase");
        C41536l.m120489i(aVar, "otpParamsMapBuilder");
        this.f40928d = uVar;
        this.f40929e = xVar;
        this.f40930f = aVar;
        C40767b h1 = C40767b.m118210h1();
        C41536l.m120488h(h1, "create<ScaParamPair>()");
        this.f40936l = h1;
        eVar.mo44217c().mo95063B(C40992a.m118827a()).mo95067F();
        C40749p X0 = cVar.mo44216a().mo95043y().mo95013X0(gVar.mo44220a(), fVar.mo44219a(), new C10499o(new C13727a(this, kVar)));
        C41536l.m120488h(X0, "getCurrentPolicyDetailsU… cards)\n                }");
        C41205b F0 = C32343x.m95413R0(X0).mo94981F0(new C10500p(new C13728b(this)));
        C41536l.m120488h(F0, "getCurrentPolicyDetailsU…ue = it\n                }");
        bindToLifecycle(F0);
        m51316rw();
    }

    /* access modifiers changed from: private */
    /* renamed from: hw */
    public static final C10496l m51311hw(C43080q qVar, Object obj, Object obj2, Object obj3) {
        C41536l.m120489i(qVar, "$tmp0");
        return (C10496l) qVar.invoke(obj, obj2, obj3);
    }

    /* access modifiers changed from: private */
    /* renamed from: iw */
    public static final void m51312iw(C43075l lVar, Object obj) {
        C41536l.m120489i(lVar, "$tmp0");
        lVar.invoke(obj);
    }

    /* renamed from: pw */
    private final C17384n m51315pw(String str, String str2, String str3, boolean z) {
        String str4;
        String str5;
        SCARegisterPolicyParams sCARegisterPolicyParams = this.f40937m;
        Long l = null;
        if (sCARegisterPolicyParams == null) {
            return null;
        }
        if (!z) {
            str4 = sCARegisterPolicyParams.getCardPan();
        } else {
            str4 = null;
        }
        if (!z) {
            str5 = sCARegisterPolicyParams.getExpDate();
        } else {
            str5 = null;
        }
        if (!z) {
            l = sCARegisterPolicyParams.getAcctKey();
        }
        return new C17384n("INSURANCE_REGISTER_MTPL_POLICY", this.f40930f.mo66809a(SCARegisterPolicyParams.copy$default(sCARegisterPolicyParams, 0, 0, (String) null, (String) null, (String) null, Utils.DOUBLE_EPSILON, (String) null, Utils.DOUBLE_EPSILON, (String) null, (String) null, (String) null, (String) null, (String) null, (Long) null, (String) null, (String) null, (String) null, str4, str5, l, 0, (String) null, str, str2, str3, 3276799, (Object) null)));
    }

    /* renamed from: rw */
    private final void m51316rw() {
        C40749p Q = this.f40936l.mo94998Q(new C10501q(new C13729c(this)));
        C41536l.m120488h(Q, "private fun subscribeToR…ndToLifecycle()\n        }");
        C41205b F0 = C32343x.m95413R0(Q).mo94981F0(new C10502r(new C13730d(this)));
        C41536l.m120488h(F0, "private fun subscribeToR…ndToLifecycle()\n        }");
        bindToLifecycle(F0);
    }

    /* access modifiers changed from: private */
    /* renamed from: sw */
    public static final C40754t m51317sw(C43075l lVar, Object obj) {
        C41536l.m120489i(lVar, "$tmp0");
        return (C40754t) lVar.invoke(obj);
    }

    /* access modifiers changed from: private */
    /* renamed from: tw */
    public static final void m51318tw(C43075l lVar, Object obj) {
        C41536l.m120489i(lVar, "$tmp0");
        lVar.invoke(obj);
    }

    /* renamed from: Am */
    public void mo27218Am() {
        C17384n pw = m51315pw((String) null, (String) null, (String) null, false);
        if (pw != null) {
            mo27222J5().mo4826r(C32343x.m95466m(pw));
        }
    }

    /* renamed from: Ff */
    public void mo27219Ff() {
        C17384n pw = m51315pw((String) null, (String) null, (String) null, true);
        if (pw != null) {
            this.f40936l.onNext(pw);
        }
    }

    /* renamed from: P1 */
    public void mo27220P1(C17379i iVar) {
        C41536l.m120489i(iVar, "paymentMethod");
        this.f40928d.mo44234a(iVar);
    }

    /* renamed from: h5 */
    public void mo27221h5(String str, String str2, String str3) {
        C17384n pw = m51315pw(str, str2, str3, false);
        if (pw != null) {
            this.f40936l.onNext(pw);
        }
    }

    /* renamed from: lw */
    public final C10497m mo37623lw() {
        return this.f40932h;
    }

    /* renamed from: mw */
    public final C10498n mo37624mw() {
        return this.f40931g;
    }

    /* renamed from: nw */
    public C1644x mo27222J5() {
        return this.f40935k;
    }

    /* renamed from: ow */
    public C1644x mo27224tb() {
        return this.f40934j;
    }

    /* renamed from: qw */
    public C1644x mo27223a() {
        return this.f40933i;
    }
}
