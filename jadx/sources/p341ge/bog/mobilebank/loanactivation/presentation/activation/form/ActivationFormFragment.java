package p341ge.bog.mobilebank.loanactivation.presentation.activation.form;

import android.os.Bundle;
import android.os.Parcelable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.p016os.C0908e;
import androidx.core.widget.NestedScrollView;
import androidx.fragment.app.C1505h;
import androidx.fragment.app.C1514j0;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.C1591i;
import androidx.lifecycle.C1619q;
import androidx.lifecycle.C1620q0;
import androidx.lifecycle.C1636t0;
import androidx.lifecycle.C1638u0;
import androidx.lifecycle.C1645y;
import b41.C31128a;
import b41.C31132b;
import com.salesforce.marketingcloud.storage.p385db.C11769i;
import cq0.C31371a;
import cq0.C31372b;
import cq0.C31373c;
import cq0.C31374d;
import cq0.C31375e;
import cq0.C31376f;
import cq0.C31377g;
import cq0.C31378h;
import cq0.C31379i;
import cq0.C31380j;
import cq0.C31386o;
import cq0.C31387p;
import dq0.C31566b;
import dq0.C31571f;
import dq0.C31574g;
import eq0.C31752k;
import fq0.C31977d;
import g91.C32286a1;
import g91.C32290b1;
import g91.C32343x;
import gq0.C36029g;
import he1.C41212c;
import he1.C41217g;
import he1.C41222k;
import he1.C41233s;
import he1.C41238w;
import java.io.Serializable;
import java.util.List;
import kotlin.jvm.internal.C41520a0;
import kotlin.jvm.internal.C41532h;
import kotlin.jvm.internal.C41535k;
import kotlin.jvm.internal.C41536l;
import kotlin.jvm.internal.C41537m;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kq0.C36930a;
import kq0.C36931b;
import kq0.C36932c;
import lq0.C37124a;
import m41.C37224b;
import np0.C37439e;
import oq0.C37707a;
import p163m0.C7047a;
import p228r0.C8034d;
import p341ge.bog.mobilebank.loanactivation.presentation.activation.details.ActivationDetailsFragment;
import p341ge.bog.mobilebank.loanactivation.presentation.activation.form.C32440a;
import p341ge.bog.mobilebank.loanactivation.presentation.activation.form.actionsheet.accountselector.model.LoanAccountSelectorData;
import p341ge.bog.mobilebank.loanactivation.presentation.activation.form.actionsheet.recommender.model.RecommenderData;
import p341ge.bog.mobilebank.loanactivation.presentation.activation.model.conditions.ConditionsData;
import p341ge.bog.mobilebank.loanactivation.presentation.activation.model.details.ActivationDetailsData;
import p341ge.bog.mobilebank.loanactivation.presentation.activation.model.form.account.LoanAccountListItem;
import p341ge.bog.mobilebank.loanactivation.presentation.activation.model.insuranceprovider.InsuranceProviderData;
import sp0.C38493l;
import sq0.C38508a;
import ue1.C43064a;
import ue1.C43075l;
import ue1.C43079p;
import yp0.C40044a;

/* renamed from: ge.bog.mobilebank.loanactivation.presentation.activation.form.ActivationFormFragment */
public final class ActivationFormFragment extends C32473e implements C36931b, C36930a, C36932c {

    /* renamed from: k */
    public static final C32418a f79876k = new C32418a((DefaultConstructorMarker) null);

    /* renamed from: g */
    private C38493l f79877g;

    /* renamed from: h */
    private final C41217g f79878h = C41219i.m119470b(new C32419b(this));

    /* renamed from: i */
    public C31386o f79879i;

    /* renamed from: j */
    private final C41217g f79880j;

    /* renamed from: ge.bog.mobilebank.loanactivation.presentation.activation.form.ActivationFormFragment$a */
    public static final class C32418a {
        private C32418a() {
        }

        public /* synthetic */ C32418a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* renamed from: a */
        public final Bundle mo73189a(String str, String str2, C37124a aVar) {
            C41536l.m120489i(str, "limitId");
            C41536l.m120489i(str2, "operationType");
            C41536l.m120489i(aVar, C11769i.C11770a.f34151n);
            return C0908e.m3336b(C41233s.m119492a("EXTRA_OPERATION_TYPE", str2), C41233s.m119492a("EXTRA_LIMIT_ID", str), C41233s.m119492a("EXTRA_KEYS", aVar));
        }
    }

    /* renamed from: ge.bog.mobilebank.loanactivation.presentation.activation.form.ActivationFormFragment$b */
    static final class C32419b extends C41537m implements C43064a {

        /* renamed from: d */
        final /* synthetic */ ActivationFormFragment f79881d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C32419b(ActivationFormFragment activationFormFragment) {
            super(0);
            this.f79881d = activationFormFragment;
        }

        /* renamed from: b */
        public final C37124a invoke() {
            Serializable serializable = this.f79881d.requireArguments().getSerializable("EXTRA_KEYS");
            C41536l.m120487g(serializable, "null cannot be cast to non-null type ge.bog.mobilebank.loanactivation.presentation.activation.model.LoanType");
            return (C37124a) serializable;
        }
    }

    /* renamed from: ge.bog.mobilebank.loanactivation.presentation.activation.form.ActivationFormFragment$c */
    /* synthetic */ class C32420c extends C41535k implements C43075l {
        C32420c(Object obj) {
            super(1, obj, ActivationFormFragment.class, "setButtonLoading", "setButtonLoading(Z)V", 0);
        }

        /* renamed from: b */
        public final void mo73191b(boolean z) {
            ((ActivationFormFragment) this.receiver).m95730Q1(z);
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            mo73191b(((Boolean) obj).booleanValue());
            return C41238w.f97225a;
        }
    }

    /* renamed from: ge.bog.mobilebank.loanactivation.presentation.activation.form.ActivationFormFragment$d */
    /* synthetic */ class C32421d extends C41535k implements C43075l {
        C32421d(Object obj) {
            super(1, obj, ActivationFormFragment.class, "setResponseState", "setResponseState(Lge/bog/mobilebank/shared/requestedresult/RequestedResult;)V", 0);
        }

        /* renamed from: b */
        public final void mo73192b(C31128a aVar) {
            C41536l.m120489i(aVar, "p0");
            ((ActivationFormFragment) this.receiver).m95738Y1(aVar);
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            mo73192b((C31128a) obj);
            return C41238w.f97225a;
        }
    }

    /* renamed from: ge.bog.mobilebank.loanactivation.presentation.activation.form.ActivationFormFragment$e */
    /* synthetic */ class C32422e extends C41535k implements C43075l {
        C32422e(Object obj) {
            super(1, obj, ActivationFormFragment.class, "updateForm", "updateForm(Lge/bog/mobilebank/loanactivation/presentation/activation/model/form/ActivationFormUiState;)V", 0);
        }

        /* renamed from: b */
        public final void mo73193b(C37707a aVar) {
            C41536l.m120489i(aVar, "p0");
            ((ActivationFormFragment) this.receiver).m95744e2(aVar);
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            mo73193b((C37707a) obj);
            return C41238w.f97225a;
        }
    }

    /* renamed from: ge.bog.mobilebank.loanactivation.presentation.activation.form.ActivationFormFragment$f */
    /* synthetic */ class C32423f extends C41535k implements C43075l {
        C32423f(Object obj) {
            super(1, obj, ActivationFormFragment.class, "openPayDayChooserActionSheet", "openPayDayChooserActionSheet(Ljava/util/List;)V", 0);
        }

        /* renamed from: b */
        public final void mo73194b(List list) {
            C41536l.m120489i(list, "p0");
            ((ActivationFormFragment) this.receiver).m95728O1(list);
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            mo73194b((List) obj);
            return C41238w.f97225a;
        }
    }

    /* renamed from: ge.bog.mobilebank.loanactivation.presentation.activation.form.ActivationFormFragment$g */
    /* synthetic */ class C32424g extends C41535k implements C43075l {
        C32424g(Object obj) {
            super(1, obj, ActivationFormFragment.class, "openMonthChooserActionSheet", "openMonthChooserActionSheet(Ljava/util/List;)V", 0);
        }

        /* renamed from: b */
        public final void mo73195b(List list) {
            C41536l.m120489i(list, "p0");
            ((ActivationFormFragment) this.receiver).m95727N1(list);
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            mo73195b((List) obj);
            return C41238w.f97225a;
        }
    }

    /* renamed from: ge.bog.mobilebank.loanactivation.presentation.activation.form.ActivationFormFragment$h */
    /* synthetic */ class C32425h extends C41535k implements C43075l {
        C32425h(Object obj) {
            super(1, obj, ActivationFormFragment.class, "openDetailsFragment", "openDetailsFragment(Lge/bog/mobilebank/loanactivation/presentation/activation/model/details/ActivationDetailsData;)V", 0);
        }

        /* renamed from: b */
        public final void mo73196b(ActivationDetailsData activationDetailsData) {
            C41536l.m120489i(activationDetailsData, "p0");
            ((ActivationFormFragment) this.receiver).m95725L1(activationDetailsData);
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            mo73196b((ActivationDetailsData) obj);
            return C41238w.f97225a;
        }
    }

    /* renamed from: ge.bog.mobilebank.loanactivation.presentation.activation.form.ActivationFormFragment$i */
    /* synthetic */ class C32426i extends C41535k implements C43075l {
        C32426i(Object obj) {
            super(1, obj, ActivationFormFragment.class, "openConditionsActionSheet", "openConditionsActionSheet(Lge/bog/mobilebank/loanactivation/presentation/activation/model/conditions/ConditionsData;)V", 0);
        }

        /* renamed from: b */
        public final void mo73197b(ConditionsData conditionsData) {
            C41536l.m120489i(conditionsData, "p0");
            ((ActivationFormFragment) this.receiver).m95724K1(conditionsData);
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            mo73197b((ConditionsData) obj);
            return C41238w.f97225a;
        }
    }

    /* renamed from: ge.bog.mobilebank.loanactivation.presentation.activation.form.ActivationFormFragment$j */
    /* synthetic */ class C32427j extends C41535k implements C43075l {
        C32427j(Object obj) {
            super(1, obj, ActivationFormFragment.class, "openInsuranceProviderActionSheet", "openInsuranceProviderActionSheet(Ljava/util/List;)V", 0);
        }

        /* renamed from: b */
        public final void mo73198b(List list) {
            C41536l.m120489i(list, "p0");
            ((ActivationFormFragment) this.receiver).m95726M1(list);
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            mo73198b((List) obj);
            return C41238w.f97225a;
        }
    }

    /* renamed from: ge.bog.mobilebank.loanactivation.presentation.activation.form.ActivationFormFragment$k */
    /* synthetic */ class C32428k extends C41535k implements C43075l {
        C32428k(Object obj) {
            super(1, obj, ActivationFormFragment.class, "openAccountSelectorActionSheet", "openAccountSelectorActionSheet(Lge/bog/mobilebank/loanactivation/presentation/activation/form/actionsheet/accountselector/model/LoanAccountSelectorData;)V", 0);
        }

        /* renamed from: b */
        public final void mo73199b(LoanAccountSelectorData loanAccountSelectorData) {
            C41536l.m120489i(loanAccountSelectorData, "p0");
            ((ActivationFormFragment) this.receiver).m95723J1(loanAccountSelectorData);
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            mo73199b((LoanAccountSelectorData) obj);
            return C41238w.f97225a;
        }
    }

    /* renamed from: ge.bog.mobilebank.loanactivation.presentation.activation.form.ActivationFormFragment$l */
    /* synthetic */ class C32429l extends C41535k implements C43075l {
        C32429l(Object obj) {
            super(1, obj, ActivationFormFragment.class, "openRecommenderActionSheet", "openRecommenderActionSheet(Lge/bog/mobilebank/loanactivation/presentation/activation/form/actionsheet/recommender/model/RecommenderData;)V", 0);
        }

        /* renamed from: b */
        public final void mo73200b(RecommenderData recommenderData) {
            C41536l.m120489i(recommenderData, "p0");
            ((ActivationFormFragment) this.receiver).m95729P1(recommenderData);
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            mo73200b((RecommenderData) obj);
            return C41238w.f97225a;
        }
    }

    /* renamed from: ge.bog.mobilebank.loanactivation.presentation.activation.form.ActivationFormFragment$m */
    static final class C32430m implements C1645y, C41532h {

        /* renamed from: a */
        private final /* synthetic */ C43075l f79882a;

        C32430m(C43075l lVar) {
            C41536l.m120489i(lVar, "function");
            this.f79882a = lVar;
        }

        public final boolean equals(Object obj) {
            if (!(obj instanceof C1645y) || !(obj instanceof C41532h)) {
                return false;
            }
            return C41536l.m120484d(getFunctionDelegate(), ((C41532h) obj).getFunctionDelegate());
        }

        public final C41212c getFunctionDelegate() {
            return this.f79882a;
        }

        public final int hashCode() {
            return getFunctionDelegate().hashCode();
        }

        public final /* synthetic */ void onChanged(Object obj) {
            this.f79882a.invoke(obj);
        }
    }

    /* renamed from: ge.bog.mobilebank.loanactivation.presentation.activation.form.ActivationFormFragment$n */
    static final class C32431n extends C41537m implements C43075l {

        /* renamed from: d */
        final /* synthetic */ ActivationFormFragment f79883d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C32431n(ActivationFormFragment activationFormFragment) {
            super(1);
            this.f79883d = activationFormFragment;
        }

        /* renamed from: a */
        public final void mo73203a(Object obj) {
            C41536l.m120489i(obj, "it");
            FrameLayout frameLayout = this.f79883d.m95720F1().f92230i;
            C41536l.m120488h(frameLayout, "binding.loadingView");
            C32343x.m95455i0(frameLayout);
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            mo73203a(obj);
            return C41238w.f97225a;
        }
    }

    /* renamed from: ge.bog.mobilebank.loanactivation.presentation.activation.form.ActivationFormFragment$o */
    static final class C32432o extends C41537m implements C43075l {

        /* renamed from: d */
        final /* synthetic */ ActivationFormFragment f79884d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C32432o(ActivationFormFragment activationFormFragment) {
            super(1);
            this.f79884d = activationFormFragment;
        }

        /* renamed from: a */
        public final void mo73204a(Object obj) {
            FrameLayout frameLayout = this.f79884d.m95720F1().f92230i;
            C41536l.m120488h(frameLayout, "binding.loadingView");
            C32343x.m95447f1(frameLayout);
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            mo73204a(obj);
            return C41238w.f97225a;
        }
    }

    /* renamed from: ge.bog.mobilebank.loanactivation.presentation.activation.form.ActivationFormFragment$p */
    static final class C32433p extends C41537m implements C43079p {

        /* renamed from: d */
        final /* synthetic */ ActivationFormFragment f79885d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C32433p(ActivationFormFragment activationFormFragment) {
            super(2);
            this.f79885d = activationFormFragment;
        }

        /* renamed from: a */
        public final void mo73205a(Throwable th, Object obj) {
            C41536l.m120489i(th, "<anonymous parameter 0>");
            FrameLayout frameLayout = this.f79885d.m95720F1().f92230i;
            C41536l.m120488h(frameLayout, "binding.loadingView");
            C32343x.m95455i0(frameLayout);
            LinearLayout linearLayout = this.f79885d.m95720F1().f92228g;
            C41536l.m120488h(linearLayout, "binding.errorView");
            C32343x.m95447f1(linearLayout);
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            mo73205a((Throwable) obj, obj2);
            return C41238w.f97225a;
        }
    }

    /* renamed from: ge.bog.mobilebank.loanactivation.presentation.activation.form.ActivationFormFragment$q */
    public static final class C32434q extends C41537m implements C43064a {

        /* renamed from: d */
        final /* synthetic */ Fragment f79886d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C32434q(Fragment fragment) {
            super(0);
            this.f79886d = fragment;
        }

        public final Fragment invoke() {
            return this.f79886d;
        }
    }

    /* renamed from: ge.bog.mobilebank.loanactivation.presentation.activation.form.ActivationFormFragment$r */
    public static final class C32435r extends C41537m implements C43064a {

        /* renamed from: d */
        final /* synthetic */ C43064a f79887d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C32435r(C43064a aVar) {
            super(0);
            this.f79887d = aVar;
        }

        public final C1638u0 invoke() {
            return (C1638u0) this.f79887d.invoke();
        }
    }

    /* renamed from: ge.bog.mobilebank.loanactivation.presentation.activation.form.ActivationFormFragment$s */
    public static final class C32436s extends C41537m implements C43064a {

        /* renamed from: d */
        final /* synthetic */ C41217g f79888d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C32436s(C41217g gVar) {
            super(0);
            this.f79888d = gVar;
        }

        public final C1636t0 invoke() {
            C1636t0 viewModelStore = C1514j0.m5375d(this.f79888d).getViewModelStore();
            C41536l.m120488h(viewModelStore, "owner.viewModelStore");
            return viewModelStore;
        }
    }

    /* renamed from: ge.bog.mobilebank.loanactivation.presentation.activation.form.ActivationFormFragment$t */
    public static final class C32437t extends C41537m implements C43064a {

        /* renamed from: d */
        final /* synthetic */ C43064a f79889d;

        /* renamed from: e */
        final /* synthetic */ C41217g f79890e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C32437t(C43064a aVar, C41217g gVar) {
            super(0);
            this.f79889d = aVar;
            this.f79890e = gVar;
        }

        public final C7047a invoke() {
            C7047a aVar;
            C43064a aVar2 = this.f79889d;
            if (aVar2 != null && (aVar = (C7047a) aVar2.invoke()) != null) {
                return aVar;
            }
            C1638u0 a = C1514j0.m5375d(this.f79890e);
            C1591i iVar = a instanceof C1591i ? (C1591i) a : null;
            C7047a defaultViewModelCreationExtras = iVar != null ? iVar.getDefaultViewModelCreationExtras() : null;
            return defaultViewModelCreationExtras == null ? C7047a.C7048a.f20987b : defaultViewModelCreationExtras;
        }
    }

    /* renamed from: ge.bog.mobilebank.loanactivation.presentation.activation.form.ActivationFormFragment$u */
    static final class C32438u extends C41537m implements C43064a {

        /* renamed from: d */
        final /* synthetic */ ActivationFormFragment f79891d;

        /* renamed from: ge.bog.mobilebank.loanactivation.presentation.activation.form.ActivationFormFragment$u$a */
        static final class C32439a extends C41537m implements C43064a {

            /* renamed from: d */
            final /* synthetic */ ActivationFormFragment f79892d;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            C32439a(ActivationFormFragment activationFormFragment) {
                super(0);
                this.f79892d = activationFormFragment;
            }

            /* renamed from: b */
            public final C32445c invoke() {
                C31386o G1 = this.f79892d.mo73180G1();
                String string = this.f79892d.requireArguments().getString("EXTRA_LIMIT_ID");
                C41536l.m120486f(string);
                String string2 = this.f79892d.requireArguments().getString("EXTRA_OPERATION_TYPE");
                C41536l.m120486f(string2);
                return G1.mo32805a(string, string2, this.f79892d.m95721H1());
            }
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C32438u(ActivationFormFragment activationFormFragment) {
            super(0);
            this.f79891d = activationFormFragment;
        }

        public final C1620q0.C1624b invoke() {
            return C32286a1.f79687a.mo72809a(new C32439a(this.f79891d));
        }
    }

    public ActivationFormFragment() {
        C32438u uVar = new C32438u(this);
        C41217g a = C41219i.m119469a(C41222k.NONE, new C32435r(new C32434q(this)));
        this.f79880j = C1514j0.m5374c(this, C41520a0.m120436b(C32445c.class), new C32436s(a), new C32437t((C43064a) null, a), uVar);
    }

    /* access modifiers changed from: private */
    /* renamed from: F1 */
    public final C38493l m95720F1() {
        C38493l lVar = this.f79877g;
        C41536l.m120486f(lVar);
        return lVar;
    }

    /* access modifiers changed from: private */
    /* renamed from: H1 */
    public final C37124a m95721H1() {
        return (C37124a) this.f79878h.getValue();
    }

    /* renamed from: I1 */
    private final C32445c m95722I1() {
        return (C32445c) this.f79880j.getValue();
    }

    /* access modifiers changed from: private */
    /* renamed from: J1 */
    public final void m95723J1(LoanAccountSelectorData loanAccountSelectorData) {
        C31752k.f78339Q.mo72188a(loanAccountSelectorData).mo4576A1(getChildFragmentManager(), (String) null);
    }

    /* access modifiers changed from: private */
    /* renamed from: K1 */
    public final void m95724K1(ConditionsData conditionsData) {
        C31566b.f78139L.mo71994a(conditionsData).mo4576A1(getChildFragmentManager(), (String) null);
    }

    /* access modifiers changed from: private */
    /* renamed from: L1 */
    public final void m95725L1(ActivationDetailsData activationDetailsData) {
        C8034d.m30522a(this).mo22118M(C37439e.action_fragment_activation_form_to_fragment_activation_details, ActivationDetailsFragment.f79858l.mo73171a(activationDetailsData, m95721H1()));
    }

    /* access modifiers changed from: private */
    /* renamed from: M1 */
    public final void m95726M1(List list) {
        C31977d.f78761O.mo72474a(list, m95721H1()).mo4576A1(getChildFragmentManager(), (String) null);
    }

    /* access modifiers changed from: private */
    /* renamed from: N1 */
    public final void m95727N1(List list) {
        C31574g.f78149J.mo71998a(list, m95721H1()).mo4576A1(getChildFragmentManager(), (String) null);
    }

    /* access modifiers changed from: private */
    /* renamed from: O1 */
    public final void m95728O1(List list) {
        C31571f.f78145J.mo71996a(list, m95721H1()).mo4576A1(getChildFragmentManager(), (String) null);
    }

    /* access modifiers changed from: private */
    /* renamed from: P1 */
    public final void m95729P1(RecommenderData recommenderData) {
        C36029g.f87148P.mo88748a(recommenderData).mo4576A1(getChildFragmentManager(), (String) null);
    }

    /* access modifiers changed from: private */
    /* renamed from: Q1 */
    public final void m95730Q1(boolean z) {
        m95720F1().f92231j.setLoading(z);
    }

    /* renamed from: R1 */
    private final void m95731R1() {
        getChildFragmentManager().mo4367F1("REQUEST_KEY_SELECTED_POSITION", this, new C31375e(this));
        getChildFragmentManager().mo4367F1("REQUEST_KEY_MONTH_CHOOSER", this, new C31376f(this));
        getChildFragmentManager().mo4367F1("REQUEST_KEY_CHOSEN_PROVIDER", this, new C31377g(this));
        getChildFragmentManager().mo4367F1("REQUEST_KEY_CONDITIONS", this, new C31378h(this));
        getChildFragmentManager().mo4367F1("REQUEST_KEY_ACCOUNT_SELECTED", this, new C31379i(this));
        getChildFragmentManager().mo4367F1("REQUEST_KEY_RECOMMENDER", this, new C31380j(this));
    }

    /* access modifiers changed from: private */
    /* renamed from: S1 */
    public static final void m95732S1(ActivationFormFragment activationFormFragment, String str, Bundle bundle) {
        C41536l.m120489i(activationFormFragment, "this$0");
        C41536l.m120489i(str, "<anonymous parameter 0>");
        C41536l.m120489i(bundle, "bundle");
        activationFormFragment.m95722I1().mo73246Fw().mo73215a7(bundle.getInt("RESULT_KEY_SELECTED_DAY_OF_MONTH"));
    }

    /* access modifiers changed from: private */
    /* renamed from: T1 */
    public static final void m95733T1(ActivationFormFragment activationFormFragment, String str, Bundle bundle) {
        C41536l.m120489i(activationFormFragment, "this$0");
        C41536l.m120489i(str, "<anonymous parameter 0>");
        C41536l.m120489i(bundle, "bundle");
        if (bundle.containsKey("RESULT_KEY_CHOSEN_PROVIDER")) {
            Parcelable parcelable = bundle.getParcelable("RESULT_KEY_CHOSEN_PROVIDER");
            C41536l.m120486f(parcelable);
            activationFormFragment.m95722I1().mo73246Fw().mo73208Kd((InsuranceProviderData) parcelable);
            return;
        }
        C32440a Fw = activationFormFragment.m95722I1().mo73246Fw();
        C40044a aVar = C40044a.SELECT_PROVIDER;
        String string = bundle.getString("RESULT_KEY_CHECKED_PROVIDER");
        C41536l.m120486f(string);
        Fw.mo73219o5(aVar, string);
    }

    /* access modifiers changed from: private */
    /* renamed from: U1 */
    public static final void m95734U1(ActivationFormFragment activationFormFragment, String str, Bundle bundle) {
        C41536l.m120489i(activationFormFragment, "this$0");
        C41536l.m120489i(str, "<anonymous parameter 0>");
        C41536l.m120489i(bundle, "bundle");
        if (bundle.containsKey("RESULT_KEY_CLOSE_BUTTON_CLICKED")) {
            C32440a.C32441a.m95802a(activationFormFragment.m95722I1().mo73246Fw(), C40044a.CLOSE_DRAWDOWN_ACTION_SHEET, (String) null, 2, (Object) null);
            C1505h activity = activationFormFragment.getActivity();
            if (activity != null) {
                activity.finish();
                return;
            }
            return;
        }
        C32440a.C32441a.m95802a(activationFormFragment.m95722I1().mo73246Fw(), C40044a.DRAWDOWN_ACTION_SHEET_GOT_IT, (String) null, 2, (Object) null);
    }

    /* access modifiers changed from: private */
    /* renamed from: V1 */
    public static final void m95735V1(ActivationFormFragment activationFormFragment, String str, Bundle bundle) {
        C41536l.m120489i(activationFormFragment, "this$0");
        C41536l.m120489i(str, "<anonymous parameter 0>");
        C41536l.m120489i(bundle, "bundle");
        LoanAccountListItem loanAccountListItem = (LoanAccountListItem) bundle.getParcelable("REQUEST_KEY_ACCOUNT_SELECTED");
        if (loanAccountListItem != null) {
            activationFormFragment.m95722I1().mo73246Fw().mo73218k2(loanAccountListItem);
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: W1 */
    public static final void m95736W1(ActivationFormFragment activationFormFragment, String str, Bundle bundle) {
        C41536l.m120489i(activationFormFragment, "this$0");
        C41536l.m120489i(str, "<anonymous parameter 0>");
        C41536l.m120489i(bundle, "bundle");
        if (bundle.containsKey("RESULT_KEY_AMOUNT")) {
            C32440a.C32441a.m95802a(activationFormFragment.m95722I1().mo73246Fw(), C40044a.LOAN_RECOMMENDER_CONTINUE_CLICKED, (String) null, 2, (Object) null);
            String string = bundle.getString("RESULT_KEY_AMOUNT");
            if (string != null) {
                activationFormFragment.m95722I1().mo73246Fw().mo73214Zs(string, true);
            }
        } else if (bundle.containsKey("RESULT_KEY_CLOSE")) {
            C32440a.C32441a.m95802a(activationFormFragment.m95722I1().mo73246Fw(), C40044a.LOAN_RECOMMENDER_CLOSED, (String) null, 2, (Object) null);
        } else if (bundle.containsKey("RESULT_KEY_MAX_AMOUNT")) {
            C32440a.C32441a.m95802a(activationFormFragment.m95722I1().mo73246Fw(), C40044a.LOAN_RECOMMENDER_MAX_AMOUNT_CLICKED, (String) null, 2, (Object) null);
        } else if (bundle.containsKey("RESULT_KEY_RESET")) {
            C32440a.C32441a.m95802a(activationFormFragment.m95722I1().mo73246Fw(), C40044a.LOAN_RECOMMENDER_INITIAL_OFFER_CLICKED, (String) null, 2, (Object) null);
            activationFormFragment.m95722I1().mo73246Fw().mo73210Nm();
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: X1 */
    public static final void m95737X1(ActivationFormFragment activationFormFragment, String str, Bundle bundle) {
        C41536l.m120489i(activationFormFragment, "this$0");
        C41536l.m120489i(str, "<anonymous parameter 0>");
        C41536l.m120489i(bundle, "bundle");
        activationFormFragment.m95722I1().mo73246Fw().mo73221wq(bundle.getInt("RESULT_KEY_SELECTED_POSITION"));
    }

    /* access modifiers changed from: private */
    /* renamed from: Y1 */
    public final void m95738Y1(C31128a aVar) {
        C31132b.m92648j(aVar, (int[]) null, new C32431n(this), 1, (Object) null);
        C31132b.m92646h(aVar, (int[]) null, new C32432o(this), 1, (Object) null);
        C31132b.m92644f(aVar, (int[]) null, new C32433p(this), 1, (Object) null);
    }

    /* renamed from: Z1 */
    private final void m95739Z1() {
        m95720F1().f92233l.setOnScrollChangeListener(new C31371a(this));
        m95720F1().f92236o.setListener(this);
        m95720F1().f92234m.setListener(this);
        m95720F1().f92237p.setListener(this);
        m95720F1().f92226e.setTitleText(C32343x.m95388F(m95721H1().mo90067I(), new Object[0]));
        m95720F1().f92229h.setTitle(C32343x.m95388F(m95721H1().mo90079U(), new Object[0]));
        m95720F1().f92231j.setButtonText(C32343x.m95388F(m95721H1().mo90065G(), new Object[0]));
        m95720F1().f92236o.setUpViews(m95721H1());
        m95720F1().f92234m.setUpViews(m95721H1());
        m95720F1().f92231j.setOnClickListener(new C31372b(this));
        m95720F1().f92226e.setOnClickListener(new C31373c(this));
        m95720F1().f92232k.setOnClickListener(new C31374d(this));
    }

    /* access modifiers changed from: private */
    /* renamed from: a2 */
    public static final void m95740a2(ActivationFormFragment activationFormFragment, NestedScrollView nestedScrollView, int i, int i2, int i3, int i4) {
        C41536l.m120489i(activationFormFragment, "this$0");
        C41536l.m120489i(nestedScrollView, "<anonymous parameter 0>");
        C32290b1.m95111a(activationFormFragment.getActivity());
        activationFormFragment.m95720F1().mo3946b().clearFocus();
    }

    /* access modifiers changed from: private */
    /* renamed from: b2 */
    public static final void m95741b2(ActivationFormFragment activationFormFragment, View view) {
        C41536l.m120489i(activationFormFragment, "this$0");
        activationFormFragment.m95722I1().mo73246Fw().mo73217g0();
    }

    /* access modifiers changed from: private */
    /* renamed from: c2 */
    public static final void m95742c2(ActivationFormFragment activationFormFragment, View view) {
        C41536l.m120489i(activationFormFragment, "this$0");
        activationFormFragment.m95722I1().mo73246Fw().mo73220rl();
    }

    /* access modifiers changed from: private */
    /* renamed from: d2 */
    public static final void m95743d2(ActivationFormFragment activationFormFragment, View view) {
        C41536l.m120489i(activationFormFragment, "this$0");
        activationFormFragment.m95722I1().onRefresh(6);
        FrameLayout frameLayout = activationFormFragment.m95720F1().f92230i;
        C41536l.m120488h(frameLayout, "binding.loadingView");
        C32343x.m95447f1(frameLayout);
        LinearLayout linearLayout = activationFormFragment.m95720F1().f92228g;
        C41536l.m120488h(linearLayout, "binding.errorView");
        C32343x.m95455i0(linearLayout);
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v0, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v1, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v12, resolved type: ge.bog.designsystem.components.creditcardsmallpicker.CreditCardSmallPickerView} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v9, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v12, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v13, resolved type: java.lang.String} */
    /* access modifiers changed from: private */
    /* JADX WARNING: Multi-variable type inference failed */
    /* renamed from: e2 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void m95744e2(oq0.C37707a r13) {
        /*
            r12 = this;
            oq0.d r0 = r13.mo90909d()
            boolean r0 = r0.mo90942g()
            r1 = 0
            if (r0 != 0) goto L_0x0038
            sp0.l r0 = r12.m95720F1()
            ge.bog.designsystem.components.layersandshadows.LayerView r0 = r0.f92235n
            java.lang.String r2 = "binding.segmentLoanAmount"
            kotlin.jvm.internal.C41536l.m120488h(r0, r2)
            g91.C32343x.m95447f1(r0)
            sp0.l r0 = r12.m95720F1()
            ge.bog.designsystem.components.textgroup.TextGroupView r0 = r0.f92229h
            oq0.d r2 = r13.mo90909d()
            java.lang.Object r2 = r2.mo90941f()
            java.lang.String r2 = (java.lang.String) r2
            if (r2 == 0) goto L_0x0034
            java.lang.String r3 = r13.mo90917j()
            java.lang.String r2 = g91.C32343x.m95406O(r2, r3)
            goto L_0x0035
        L_0x0034:
            r2 = r1
        L_0x0035:
            r0.setBottomTitle(r2)
        L_0x0038:
            sp0.l r0 = r12.m95720F1()
            ge.bog.mobilebank.loanactivation.presentation.activation.form.view.FormLoanDetailsView r2 = r0.f92236o
            oq0.d r3 = r13.mo90909d()
            oq0.d r4 = r13.mo90918k()
            oq0.d r5 = r13.mo90922o()
            java.lang.String r6 = r13.mo90917j()
            lq0.a r7 = r12.m95721H1()
            r2.mo73282j(r3, r4, r5, r6, r7)
            sp0.l r0 = r12.m95720F1()
            ge.bog.mobilebank.loanactivation.presentation.activation.form.view.FormRefinanceView r0 = r0.f92237p
            java.lang.String r2 = "binding.segmentRefinanceInfo"
            kotlin.jvm.internal.C41536l.m120488h(r0, r2)
            oq0.c r2 = r13.mo90920m()
            boolean r2 = r2.mo90932d()
            r3 = 0
            r4 = 8
            if (r2 == 0) goto L_0x006f
            r2 = r3
            goto L_0x0070
        L_0x006f:
            r2 = r4
        L_0x0070:
            r0.setVisibility(r2)
            sp0.l r0 = r12.m95720F1()
            ge.bog.mobilebank.loanactivation.presentation.activation.form.view.FormRefinanceView r0 = r0.f92237p
            oq0.c r2 = r13.mo90920m()
            r0.mo73288c(r2)
            sp0.l r0 = r12.m95720F1()
            ge.bog.mobilebank.loanactivation.presentation.activation.form.view.FormInsuranceProviderView r0 = r0.f92234m
            java.lang.String r2 = "binding.segmentInsuranceProvider"
            kotlin.jvm.internal.C41536l.m120488h(r0, r2)
            boolean r2 = r13.mo90921n()
            if (r2 == 0) goto L_0x0093
            r2 = r3
            goto L_0x0094
        L_0x0093:
            r2 = r4
        L_0x0094:
            r0.setVisibility(r2)
            sp0.l r0 = r12.m95720F1()
            ge.bog.mobilebank.loanactivation.presentation.activation.form.view.FormInsuranceProviderView r0 = r0.f92234m
            oq0.d r2 = r13.mo90914h()
            oq0.e r5 = r13.mo90916i()
            oq0.e r6 = r13.mo90919l()
            oq0.b r7 = r13.mo90910e()
            r0.mo73277g(r2, r5, r6, r7)
            oq0.d r0 = r13.mo90908c()
            java.lang.Object r0 = r0.mo90941f()
            ge.bog.mobilebank.loanactivation.presentation.activation.model.form.account.LoanAccountListItem r0 = (p341ge.bog.mobilebank.loanactivation.presentation.activation.model.form.account.LoanAccountListItem) r0
            if (r0 == 0) goto L_0x00f8
            sp0.l r2 = r12.m95720F1()
            ge.bog.designsystem.components.creditcardsmallpicker.CreditCardSmallPickerView r2 = r2.f92226e
            ge.bog.designsystem.components.creditcardsmallpicker.CreditCardSmallPickerView$b$b r11 = new ge.bog.designsystem.components.creditcardsmallpicker.CreditCardSmallPickerView$b$b
            ge.bog.mobilebank.cleanarch.domain.transferaccounts.model.TransferExternalFile r5 = r0.mo73343f()
            if (r5 == 0) goto L_0x00ce
            java.lang.String r1 = r5.mo52204a()
        L_0x00ce:
            r6 = r1
            int r1 = np0.C37438d.f89976o
            java.lang.Integer r7 = java.lang.Integer.valueOf(r1)
            java.math.BigDecimal r1 = r0.mo73339d()
            java.lang.String r5 = r13.mo90917j()
            java.lang.String r8 = g91.C32343x.m95408P(r1, r5)
            r9 = 0
            r10 = 0
            r5 = r11
            r5.<init>(r6, r7, r8, r9, r10)
            r2.setCreditCard(r11)
            java.lang.String r0 = r0.mo73347i()
            if (r0 != 0) goto L_0x00f4
            java.lang.String r0 = r2.getTitleText()
        L_0x00f4:
            r2.setTitleText(r0)
            r1 = r2
        L_0x00f8:
            if (r1 != 0) goto L_0x0105
            sp0.l r0 = r12.m95720F1()
            ge.bog.designsystem.components.creditcardsmallpicker.CreditCardSmallPickerView r0 = r0.f92226e
            ge.bog.designsystem.components.creditcardsmallpicker.CreditCardSmallPickerView$b$a r1 = p341ge.bog.designsystem.components.creditcardsmallpicker.CreditCardSmallPickerView.C13279b.C13280a.f39265a
            r0.setCreditCard(r1)
        L_0x0105:
            sp0.l r0 = r12.m95720F1()
            ge.bog.designsystem.components.layersandshadows.LayerView r0 = r0.f92227f
            java.lang.String r1 = "binding.buttonContainer"
            kotlin.jvm.internal.C41536l.m120488h(r0, r1)
            boolean r1 = r13.mo90912f()
            if (r1 == 0) goto L_0x0117
            goto L_0x0118
        L_0x0117:
            r3 = r4
        L_0x0118:
            r0.setVisibility(r3)
            m41.a r13 = r13.mo90913g()
            if (r13 == 0) goto L_0x014a
            java.lang.Object r13 = r13.mo90296a()
            java.lang.Throwable r13 = (java.lang.Throwable) r13
            if (r13 == 0) goto L_0x014a
            androidx.fragment.app.h r0 = r12.getActivity()
            if (r0 == 0) goto L_0x014a
            java.lang.String r1 = "activity"
            kotlin.jvm.internal.C41536l.m120488h(r0, r1)
            int r1 = np0.C37442h.f90017a
            java.lang.String r1 = r12.getString(r1)
            java.lang.String r13 = g91.C32343x.m95428Z(r13, r1)
            if (r13 != 0) goto L_0x0142
            java.lang.String r13 = ""
        L_0x0142:
            r1 = r13
            r2 = 0
            r3 = 0
            r4 = 6
            r5 = 0
            p420fh.C12910e.m48790h(r0, r1, r2, r3, r4, r5)
        L_0x014a:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p341ge.bog.mobilebank.loanactivation.presentation.activation.form.ActivationFormFragment.m95744e2(oq0.a):void");
    }

    private final void observeData() {
        C1619q viewLifecycleOwner = getViewLifecycleOwner();
        C41536l.m120488h(viewLifecycleOwner, "viewLifecycleOwner");
        C31387p Jw = m95722I1().mo73250Jw();
        Jw.mo71758B1().mo4819k(viewLifecycleOwner, new C32430m(new C32421d(this)));
        Jw.mo71764a().mo4819k(viewLifecycleOwner, new C32430m(new C32422e(this)));
        C37224b.m109963b(Jw.mo71763Th(), viewLifecycleOwner, new C32423f(this));
        C37224b.m109963b(Jw.mo71759E8(), viewLifecycleOwner, new C32424g(this));
        C37224b.m109963b(Jw.mo71761Eu(), viewLifecycleOwner, new C32425h(this));
        C37224b.m109963b(Jw.mo71760Eq(), viewLifecycleOwner, new C32426i(this));
        C37224b.m109963b(Jw.mo71766w6(), viewLifecycleOwner, new C32427j(this));
        C37224b.m109963b(Jw.mo71765f7(), viewLifecycleOwner, new C32428k(this));
        C37224b.m109963b(Jw.mo71762Ko(), viewLifecycleOwner, new C32429l(this));
        Jw.mo71767x1().mo4819k(viewLifecycleOwner, new C32430m(new C32420c(this)));
    }

    /* renamed from: G1 */
    public final C31386o mo73180G1() {
        C31386o oVar = this.f79879i;
        if (oVar != null) {
            return oVar;
        }
        C41536l.m120506z("factory");
        return null;
    }

    /* renamed from: G2 */
    public void mo73181G2(C38508a.C38511c cVar) {
        C41536l.m120489i(cVar, "item");
        m95722I1().mo73246Fw().mo73207G2(cVar);
    }

    /* renamed from: N2 */
    public void mo73182N2() {
        m95722I1().mo73246Fw().mo73209N2();
    }

    /* renamed from: O0 */
    public void mo73183O0(boolean z) {
        m95722I1().mo73246Fw().mo73211O0(z);
    }

    /* renamed from: Q2 */
    public void mo73184Q2(boolean z) {
        m95722I1().mo73246Fw().mo73212Q2(z);
    }

    /* renamed from: T */
    public void mo73185T() {
        m95722I1().mo73246Fw().mo73213T();
    }

    /* renamed from: V */
    public void mo73186V(C40044a aVar) {
        C41536l.m120489i(aVar, "log");
        C32440a.C32441a.m95802a(m95722I1().mo73246Fw(), aVar, (String) null, 2, (Object) null);
    }

    /* renamed from: d */
    public void mo73187d(String str) {
        C41536l.m120489i(str, "amount");
        C32440a.C32441a.m95803b(m95722I1().mo73246Fw(), str, false, 2, (Object) null);
    }

    /* renamed from: e3 */
    public void mo73188e3() {
        m95722I1().mo73246Fw().mo73216e3();
    }

    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        C41536l.m120489i(layoutInflater, "inflater");
        this.f79877g = C38493l.m112987d(layoutInflater, viewGroup, false);
        ConstraintLayout c = m95720F1().mo3946b();
        C41536l.m120488h(c, "binding.root");
        return c;
    }

    public void onDestroyView() {
        super.onDestroyView();
        this.f79877g = null;
    }

    public void onViewCreated(View view, Bundle bundle) {
        C41536l.m120489i(view, "view");
        super.onViewCreated(view, bundle);
        observeData();
        m95731R1();
        m95739Z1();
    }
}
