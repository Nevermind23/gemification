package p341ge.bog.mobilebank.autoliabilityinsurance.presentation.policydetail;

import androidx.lifecycle.C1644x;
import androidx.lifecycle.LiveData;
import ed1.C40749p;
import g91.C32343x;
import hd1.C41204a;
import hd1.C41205b;
import he1.C41238w;
import kotlin.jvm.internal.C41536l;
import kotlin.jvm.internal.C41537m;
import kotlin.jvm.internal.DefaultConstructorMarker;
import p341ge.bog.mobilebank.autoliabilityinsurance.domain.model.PolicyDetailsModel;
import p341ge.bog.mobilebank.cleanarch.presentation.common.C21481a;
import p535nk.C17032l;
import p645vk.C18407h;
import p645vk.C18408i;
import ue1.C43075l;

/* renamed from: ge.bog.mobilebank.autoliabilityinsurance.presentation.policydetail.PolicyDetailViewModel$ViewModel */
public final class PolicyDetailViewModel$ViewModel extends C21481a {

    /* renamed from: d */
    private final C17032l f40798d;
    /* access modifiers changed from: private */

    /* renamed from: e */
    public final C1644x f40799e = new C1644x();

    /* renamed from: ge.bog.mobilebank.autoliabilityinsurance.presentation.policydetail.PolicyDetailViewModel$ViewModel$a */
    static final class C13655a extends C41537m implements C43075l {

        /* renamed from: d */
        final /* synthetic */ PolicyDetailViewModel$ViewModel f40800d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C13655a(PolicyDetailViewModel$ViewModel policyDetailViewModel$ViewModel) {
            super(1);
            this.f40800d = policyDetailViewModel$ViewModel;
        }

        /* renamed from: a */
        public final void mo37545a(PolicyDetailsModel policyDetailsModel) {
            this.f40800d.f40799e.mo4826r(policyDetailsModel);
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            mo37545a((PolicyDetailsModel) obj);
            return C41238w.f97225a;
        }
    }

    /* renamed from: ge.bog.mobilebank.autoliabilityinsurance.presentation.policydetail.PolicyDetailViewModel$ViewModel$b */
    static final class C13656b extends C41537m implements C43075l {

        /* renamed from: d */
        public static final C13656b f40801d = new C13656b();

        C13656b() {
            super(1);
        }

        public final void invoke(Throwable th) {
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((Throwable) obj);
            return C41238w.f97225a;
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public PolicyDetailViewModel$ViewModel(C17032l lVar) {
        super((C41204a) null, 1, (DefaultConstructorMarker) null);
        C41536l.m120489i(lVar, "getSelectedPolicyUseCase");
        this.f40798d = lVar;
        C40749p O = lVar.mo44225a().mo95075O();
        C41536l.m120488h(O, "getSelectedPolicyUseCase…          .toObservable()");
        C41205b G0 = C32343x.m95413R0(O).mo94983G0(new C18407h(new C13655a(this)), new C18408i(C13656b.f40801d));
        C41536l.m120488h(G0, "getSelectedPolicyUseCase…cy\n                }, {})");
        bindToLifecycle(G0);
    }

    /* access modifiers changed from: private */
    public static final void _init_$lambda$0(C43075l lVar, Object obj) {
        C41536l.m120489i(lVar, "$tmp0");
        lVar.invoke(obj);
    }

    /* access modifiers changed from: private */
    /* renamed from: fw */
    public static final void m51127fw(C43075l lVar, Object obj) {
        C41536l.m120489i(lVar, "$tmp0");
        lVar.invoke(obj);
    }

    /* renamed from: hw */
    public LiveData mo37544hw() {
        return this.f40799e;
    }
}
