package p341ge.bog.mobilebank.loanactivation.presentation.activation.details;

import android.os.Bundle;
import android.os.Parcelable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.p016os.C0908e;
import androidx.fragment.app.C1505h;
import androidx.fragment.app.C1514j0;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.lifecycle.C1591i;
import androidx.lifecycle.C1619q;
import androidx.lifecycle.C1620q0;
import androidx.lifecycle.C1636t0;
import androidx.lifecycle.C1638u0;
import androidx.lifecycle.C1645y;
import androidx.lifecycle.LiveData;
import androidx.recyclerview.widget.RecyclerView;
import aq0.C31016a;
import aq0.C31022e;
import aq0.C31023f;
import aq0.C31028k;
import bq0.C31169a;
import com.salesforce.marketingcloud.storage.p385db.C11769i;
import g91.C32286a1;
import g91.C32343x;
import hc1.C41143c;
import hc1.C41185v;
import he1.C41212c;
import he1.C41217g;
import he1.C41222k;
import he1.C41224m;
import he1.C41233s;
import he1.C41238w;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.HashMap;
import kotlin.jvm.internal.C41520a0;
import kotlin.jvm.internal.C41532h;
import kotlin.jvm.internal.C41535k;
import kotlin.jvm.internal.C41536l;
import kotlin.jvm.internal.C41537m;
import kotlin.jvm.internal.DefaultConstructorMarker;
import lq0.C37124a;
import m41.C37223a;
import m41.C37224b;
import np0.C37439e;
import np0.C37442h;
import nq0.C37444a;
import o00.C26656a;
import p00.C27113k;
import p163m0.C7047a;
import p228r0.C8034d;
import p341ge.bog.designsystem.components.buttons.Button;
import p341ge.bog.mobilebank.loanactivation.presentation.activation.details.C32415a;
import p341ge.bog.mobilebank.loanactivation.presentation.activation.model.details.ActivationDetailsData;
import p341ge.bog.mobilebank.loanactivation.presentation.activation.model.result.ActivationResultData;
import p341ge.bog.mobilebank.loanactivation.presentation.activation.result.ActivationResultFragment;
import p341ge.bog.mobilebank.model.offers.Summary;
import p420fh.C12902d;
import p420fh.C12910e;
import sp0.C38495n;
import ue1.C43064a;
import ue1.C43075l;

/* renamed from: ge.bog.mobilebank.loanactivation.presentation.activation.details.ActivationDetailsFragment */
public final class ActivationDetailsFragment extends C32417b implements C26656a, C41185v.C41186a {

    /* renamed from: l */
    public static final C32402a f79858l = new C32402a((DefaultConstructorMarker) null);

    /* renamed from: g */
    private C38495n f79859g;

    /* renamed from: h */
    private final C41217g f79860h = C41219i.m119470b(new C32403b(this));

    /* renamed from: i */
    public C31022e f79861i;

    /* renamed from: j */
    private final C41217g f79862j;

    /* renamed from: k */
    private final C31169a f79863k;

    /* renamed from: ge.bog.mobilebank.loanactivation.presentation.activation.details.ActivationDetailsFragment$a */
    public static final class C32402a {
        private C32402a() {
        }

        public /* synthetic */ C32402a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* renamed from: a */
        public final Bundle mo73171a(ActivationDetailsData activationDetailsData, C37124a aVar) {
            C41536l.m120489i(activationDetailsData, "data");
            C41536l.m120489i(aVar, C11769i.C11770a.f34151n);
            return C0908e.m3336b(C41233s.m119492a("EXTRA_DETAILS_DATA", activationDetailsData), C41233s.m119492a("EXTRA_KEYS", aVar));
        }
    }

    /* renamed from: ge.bog.mobilebank.loanactivation.presentation.activation.details.ActivationDetailsFragment$b */
    static final class C32403b extends C41537m implements C43064a {

        /* renamed from: d */
        final /* synthetic */ ActivationDetailsFragment f79864d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C32403b(ActivationDetailsFragment activationDetailsFragment) {
            super(0);
            this.f79864d = activationDetailsFragment;
        }

        /* renamed from: b */
        public final C37124a invoke() {
            Serializable serializable = this.f79864d.requireArguments().getSerializable("EXTRA_KEYS");
            C41536l.m120487g(serializable, "null cannot be cast to non-null type ge.bog.mobilebank.loanactivation.presentation.activation.model.LoanType");
            return (C37124a) serializable;
        }
    }

    /* renamed from: ge.bog.mobilebank.loanactivation.presentation.activation.details.ActivationDetailsFragment$c */
    /* synthetic */ class C32404c extends C41535k implements C43075l {
        C32404c(Object obj) {
            super(1, obj, ActivationDetailsFragment.class, "setViewState", "setViewState(Lge/bog/mobilebank/loanactivation/presentation/activation/model/details/ActivationDetailsUiState;)V", 0);
        }

        /* renamed from: b */
        public final void mo73173b(C37444a aVar) {
            C41536l.m120489i(aVar, "p0");
            ((ActivationDetailsFragment) this.receiver).m95698v1(aVar);
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            mo73173b((C37444a) obj);
            return C41238w.f97225a;
        }
    }

    /* renamed from: ge.bog.mobilebank.loanactivation.presentation.activation.details.ActivationDetailsFragment$d */
    /* synthetic */ class C32405d extends C41535k implements C43075l {
        C32405d(Object obj) {
            super(1, obj, ActivationDetailsFragment.class, "onPreContractResponse", "onPreContractResponse(Ljava/lang/String;)V", 0);
        }

        /* renamed from: b */
        public final void mo73174b(String str) {
            C41536l.m120489i(str, "p0");
            ((ActivationDetailsFragment) this.receiver).m95694r1(str);
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            mo73174b((String) obj);
            return C41238w.f97225a;
        }
    }

    /* renamed from: ge.bog.mobilebank.loanactivation.presentation.activation.details.ActivationDetailsFragment$e */
    /* synthetic */ class C32406e extends C41535k implements C43075l {
        C32406e(Object obj) {
            super(1, obj, ActivationDetailsFragment.class, "showScaDialog", "showScaDialog(Lkotlin/Pair;)V", 0);
        }

        /* renamed from: b */
        public final void mo73175b(C41224m mVar) {
            C41536l.m120489i(mVar, "p0");
            ((ActivationDetailsFragment) this.receiver).m95699x1(mVar);
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            mo73175b((C41224m) obj);
            return C41238w.f97225a;
        }
    }

    /* renamed from: ge.bog.mobilebank.loanactivation.presentation.activation.details.ActivationDetailsFragment$f */
    /* synthetic */ class C32407f extends C41535k implements C43075l {
        C32407f(Object obj) {
            super(1, obj, ActivationDetailsFragment.class, "openActivationResult", "openActivationResult(Lge/bog/mobilebank/loanactivation/presentation/activation/model/result/ActivationResultData;)V", 0);
        }

        /* renamed from: b */
        public final void mo73176b(ActivationResultData activationResultData) {
            C41536l.m120489i(activationResultData, "p0");
            ((ActivationDetailsFragment) this.receiver).m95695s1(activationResultData);
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            mo73176b((ActivationResultData) obj);
            return C41238w.f97225a;
        }
    }

    /* renamed from: ge.bog.mobilebank.loanactivation.presentation.activation.details.ActivationDetailsFragment$g */
    static final class C32408g implements C1645y, C41532h {

        /* renamed from: a */
        private final /* synthetic */ C43075l f79865a;

        C32408g(C43075l lVar) {
            C41536l.m120489i(lVar, "function");
            this.f79865a = lVar;
        }

        public final boolean equals(Object obj) {
            if (!(obj instanceof C1645y) || !(obj instanceof C41532h)) {
                return false;
            }
            return C41536l.m120484d(getFunctionDelegate(), ((C41532h) obj).getFunctionDelegate());
        }

        public final C41212c getFunctionDelegate() {
            return this.f79865a;
        }

        public final int hashCode() {
            return getFunctionDelegate().hashCode();
        }

        public final /* synthetic */ void onChanged(Object obj) {
            this.f79865a.invoke(obj);
        }
    }

    /* renamed from: ge.bog.mobilebank.loanactivation.presentation.activation.details.ActivationDetailsFragment$h */
    public static final class C32409h extends C41537m implements C43064a {

        /* renamed from: d */
        final /* synthetic */ Fragment f79866d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C32409h(Fragment fragment) {
            super(0);
            this.f79866d = fragment;
        }

        public final Fragment invoke() {
            return this.f79866d;
        }
    }

    /* renamed from: ge.bog.mobilebank.loanactivation.presentation.activation.details.ActivationDetailsFragment$i */
    public static final class C32410i extends C41537m implements C43064a {

        /* renamed from: d */
        final /* synthetic */ C43064a f79867d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C32410i(C43064a aVar) {
            super(0);
            this.f79867d = aVar;
        }

        public final C1638u0 invoke() {
            return (C1638u0) this.f79867d.invoke();
        }
    }

    /* renamed from: ge.bog.mobilebank.loanactivation.presentation.activation.details.ActivationDetailsFragment$j */
    public static final class C32411j extends C41537m implements C43064a {

        /* renamed from: d */
        final /* synthetic */ C41217g f79868d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C32411j(C41217g gVar) {
            super(0);
            this.f79868d = gVar;
        }

        public final C1636t0 invoke() {
            C1636t0 viewModelStore = C1514j0.m5375d(this.f79868d).getViewModelStore();
            C41536l.m120488h(viewModelStore, "owner.viewModelStore");
            return viewModelStore;
        }
    }

    /* renamed from: ge.bog.mobilebank.loanactivation.presentation.activation.details.ActivationDetailsFragment$k */
    public static final class C32412k extends C41537m implements C43064a {

        /* renamed from: d */
        final /* synthetic */ C43064a f79869d;

        /* renamed from: e */
        final /* synthetic */ C41217g f79870e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C32412k(C43064a aVar, C41217g gVar) {
            super(0);
            this.f79869d = aVar;
            this.f79870e = gVar;
        }

        public final C7047a invoke() {
            C7047a aVar;
            C43064a aVar2 = this.f79869d;
            if (aVar2 != null && (aVar = (C7047a) aVar2.invoke()) != null) {
                return aVar;
            }
            C1638u0 a = C1514j0.m5375d(this.f79870e);
            C1591i iVar = a instanceof C1591i ? (C1591i) a : null;
            C7047a defaultViewModelCreationExtras = iVar != null ? iVar.getDefaultViewModelCreationExtras() : null;
            return defaultViewModelCreationExtras == null ? C7047a.C7048a.f20987b : defaultViewModelCreationExtras;
        }
    }

    /* renamed from: ge.bog.mobilebank.loanactivation.presentation.activation.details.ActivationDetailsFragment$l */
    static final class C32413l extends C41537m implements C43064a {

        /* renamed from: d */
        final /* synthetic */ ActivationDetailsFragment f79871d;

        /* renamed from: ge.bog.mobilebank.loanactivation.presentation.activation.details.ActivationDetailsFragment$l$a */
        static final class C32414a extends C41537m implements C43064a {

            /* renamed from: d */
            final /* synthetic */ ActivationDetailsFragment f79872d;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            C32414a(ActivationDetailsFragment activationDetailsFragment) {
                super(0);
                this.f79872d = activationDetailsFragment;
            }

            /* renamed from: b */
            public final C31028k invoke() {
                C31022e o1 = this.f79872d.mo73170o1();
                Parcelable parcelable = this.f79872d.requireArguments().getParcelable("EXTRA_DETAILS_DATA");
                C41536l.m120486f(parcelable);
                return o1.mo32802a((ActivationDetailsData) parcelable);
            }
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C32413l(ActivationDetailsFragment activationDetailsFragment) {
            super(0);
            this.f79871d = activationDetailsFragment;
        }

        public final C1620q0.C1624b invoke() {
            return C32286a1.f79687a.mo72809a(new C32414a(this.f79871d));
        }
    }

    public ActivationDetailsFragment() {
        C32413l lVar = new C32413l(this);
        C41217g a = C41219i.m119469a(C41222k.NONE, new C32410i(new C32409h(this)));
        this.f79862j = C1514j0.m5374c(this, C41520a0.m120436b(C31028k.class), new C32411j(a), new C32412k((C43064a) null, a), lVar);
        this.f79863k = new C31169a();
    }

    /* renamed from: n1 */
    private final C38495n m95691n1() {
        C38495n nVar = this.f79859g;
        C41536l.m120486f(nVar);
        return nVar;
    }

    private final void observeData() {
        C31023f tw = m95693q1().mo71224tw();
        tw.mo71218a().mo4819k(getViewLifecycleOwner(), new C32408g(new C32404c(this)));
        LiveData U1 = tw.mo71217U1();
        C1619q viewLifecycleOwner = getViewLifecycleOwner();
        C41536l.m120488h(viewLifecycleOwner, "viewLifecycleOwner");
        C37224b.m109963b(U1, viewLifecycleOwner, new C32405d(this));
        LiveData a0 = tw.mo71219a0();
        C1619q viewLifecycleOwner2 = getViewLifecycleOwner();
        C41536l.m120488h(viewLifecycleOwner2, "viewLifecycleOwner");
        C37224b.m109963b(a0, viewLifecycleOwner2, new C32406e(this));
        LiveData hg = tw.mo71220hg();
        C1619q viewLifecycleOwner3 = getViewLifecycleOwner();
        C41536l.m120488h(viewLifecycleOwner3, "viewLifecycleOwner");
        C37224b.m109963b(hg, viewLifecycleOwner3, new C32407f(this));
    }

    /* renamed from: p1 */
    private final C37124a m95692p1() {
        return (C37124a) this.f79860h.getValue();
    }

    /* renamed from: q1 */
    private final C31028k m95693q1() {
        return (C31028k) this.f79862j.getValue();
    }

    /* access modifiers changed from: private */
    /* renamed from: r1 */
    public final void m95694r1(String str) {
        C27113k.C27114a aVar = C27113k.f68083P;
        String F = C32343x.m95388F(m95692p1().mo90062D(), new Object[0]);
        C27113k c = C27113k.C27114a.m84066c(aVar, str, true, C32343x.m95388F(m95692p1().mo90061C(), new Object[0]), (ArrayList) null, (Summary) null, F, 24, (Object) null);
        FragmentManager childFragmentManager = getChildFragmentManager();
        C41536l.m120488h(childFragmentManager, "childFragmentManager");
        c.mo4576A1(childFragmentManager, (String) null);
    }

    /* access modifiers changed from: private */
    /* renamed from: s1 */
    public final void m95695s1(ActivationResultData activationResultData) {
        C8034d.m30522a(this).mo22118M(C37439e.fragment_activation_result, ActivationResultFragment.f80108g.mo73559a(activationResultData, m95692p1()));
    }

    /* renamed from: t1 */
    private final void m95696t1() {
        Button button = m95691n1().f92245f;
        button.setButtonText(C32343x.m95388F(m95692p1().mo90091e(), new Object[0]));
        button.setOnClickListener(new C31016a(this));
        m95691n1().f92258s.setText(C32343x.m95388F(m95692p1().mo90063E(), new Object[0]));
        m95691n1().f92247h.setText(C32343x.m95388F(m95692p1().mo90093f(), new Object[0]));
        m95691n1().f92254o.setText(C32343x.m95388F("loan.activation.summary.page.keep.amount", new Object[0]));
        m95691n1().f92251l.setTitle(C32343x.m95388F(m95692p1().mo90105n(), new Object[0]));
    }

    /* access modifiers changed from: private */
    /* renamed from: u1 */
    public static final void m95697u1(ActivationDetailsFragment activationDetailsFragment, View view) {
        C41536l.m120489i(activationDetailsFragment, "this$0");
        activationDetailsFragment.m95693q1().mo71223sw().mo71222s0();
    }

    /* access modifiers changed from: private */
    /* renamed from: v1 */
    public final void m95698v1(C37444a aVar) {
        Throwable th;
        RecyclerView recyclerView = m95691n1().f92256q;
        C31169a aVar2 = this.f79863k;
        aVar2.mo6029i(aVar.mo90547d());
        recyclerView.setAdapter(aVar2);
        Double k = aVar.mo90556k();
        if (k != null) {
            double doubleValue = k.doubleValue();
            TextView textView = m95691n1().f92259t;
            String Q = C32343x.m95410Q(doubleValue, aVar.mo90555j(), false, 2, (Object) null);
            textView.setText("-" + Q);
            ConstraintLayout constraintLayout = m95691n1().f92257r;
            C41536l.m120488h(constraintLayout, "binding.repaymentContainer");
            C32343x.m95447f1(constraintLayout);
        }
        Double e = aVar.mo90548e();
        if (e != null) {
            double doubleValue2 = e.doubleValue();
            TextView textView2 = m95691n1().f92248i;
            String Q2 = C32343x.m95410Q(doubleValue2, aVar.mo90555j(), false, 2, (Object) null);
            textView2.setText("-" + Q2);
            ConstraintLayout constraintLayout2 = m95691n1().f92246g;
            C41536l.m120488h(constraintLayout2, "binding.disbursementContainer");
            C32343x.m95447f1(constraintLayout2);
        }
        Double g = aVar.mo90551g();
        if (g != null) {
            m95691n1().f92255p.setText(C32343x.m95410Q(g.doubleValue(), aVar.mo90555j(), false, 2, (Object) null));
            ConstraintLayout constraintLayout3 = m95691n1().f92253n;
            C41536l.m120488h(constraintLayout3, "binding.keepContainer");
            C32343x.m95447f1(constraintLayout3);
        }
        m95691n1().f92251l.setBottomTitle(C32343x.m95410Q(aVar.mo90554i(), aVar.mo90555j(), false, 2, (Object) null));
        m95691n1().f92245f.setLoading(aVar.mo90552h());
        Button button = m95691n1().f92245f;
        C41536l.m120488h(button, "binding.continueButton");
        C32343x.m95483r1(button, aVar.mo90546c(), false, 2, (Object) null);
        FragmentManager childFragmentManager = getChildFragmentManager();
        C41536l.m120488h(childFragmentManager, "childFragmentManager");
        C41185v g0 = C32343x.m95449g0(childFragmentManager, (String) null, 1, (Object) null);
        if (g0 != null) {
            g0.mo95635L2(aVar.mo90552h());
        }
        C37223a f = aVar.mo90550f();
        if (f != null && (th = (Throwable) f.mo90296a()) != null) {
            C1505h activity = getActivity();
            if (activity != null) {
                C41536l.m120488h(activity, "activity");
                String a0 = C32343x.m95431a0(th, (String) null, 1, (Object) null);
                if (a0 == null) {
                    a0 = getString(C37442h.f90017a);
                    C41536l.m120488h(a0, "getString(R.string.error_data_general)");
                }
                C12910e.m48790h(activity, a0, (C12902d.C12905b) null, false, 6, (Object) null);
            }
            FragmentManager childFragmentManager2 = getChildFragmentManager();
            C41536l.m120488h(childFragmentManager2, "childFragmentManager");
            C41185v g02 = C32343x.m95449g0(childFragmentManager2, (String) null, 1, (Object) null);
            if (g02 != null) {
                g02.mo4577k1();
            }
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: x1 */
    public final void m95699x1(C41224m mVar) {
        C41185v e = C41185v.C41187b.m119423e(C41185v.f97155C, (String) mVar.mo95675a(), (HashMap) mVar.mo95676b(), (C41143c) null, 4, (Object) null);
        FragmentManager childFragmentManager = getChildFragmentManager();
        C41536l.m120488h(childFragmentManager, "childFragmentManager");
        e.mo4576A1(childFragmentManager, (String) null);
        FragmentManager childFragmentManager2 = getChildFragmentManager();
        C41536l.m120488h(childFragmentManager2, "childFragmentManager");
        C27113k e0 = C32343x.m95443e0(childFragmentManager2, (String) null, 1, (Object) null);
        if (e0 != null) {
            e0.mo4577k1();
        }
    }

    /* renamed from: O */
    public void mo37615O(String str, String str2, String str3, String str4) {
        C41536l.m120489i(str, "operationId");
        C41536l.m120489i(str2, "operationReference");
        C41536l.m120489i(str3, "scaAuthCode");
        m95693q1().mo71223sw().mo71225y4(str, str2, str3);
    }

    /* renamed from: R */
    public void mo37616R(String str, String str2) {
        C41536l.m120489i(str, "message");
        C1505h activity = getActivity();
        if (activity != null) {
            C12910e.m48790h(activity, str, (C12902d.C12905b) null, false, 6, (Object) null);
        }
        FragmentManager childFragmentManager = getChildFragmentManager();
        C41536l.m120488h(childFragmentManager, "childFragmentManager");
        C41185v g0 = C32343x.m95449g0(childFragmentManager, (String) null, 1, (Object) null);
        if (g0 != null) {
            g0.mo4577k1();
        }
        m95691n1().f92245f.setLoading(false);
    }

    /* renamed from: S */
    public void mo37617S(boolean z) {
        m95691n1().f92245f.setLoading(z);
    }

    /* renamed from: m */
    public void mo39137m() {
        C32415a.C32416a.m95714a(m95693q1().mo71223sw(), (String) null, (String) null, (String) null, 7, (Object) null);
    }

    /* renamed from: o1 */
    public final C31022e mo73170o1() {
        C31022e eVar = this.f79861i;
        if (eVar != null) {
            return eVar;
        }
        C41536l.m120506z("factory");
        return null;
    }

    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        C41536l.m120489i(layoutInflater, "inflater");
        this.f79859g = C38495n.m112995d(layoutInflater, viewGroup, false);
        ConstraintLayout c = m95691n1().mo3946b();
        C41536l.m120488h(c, "binding.root");
        return c;
    }

    public void onDestroyView() {
        super.onDestroyView();
        this.f79859g = null;
    }

    public void onViewCreated(View view, Bundle bundle) {
        C41536l.m120489i(view, "view");
        super.onViewCreated(view, bundle);
        observeData();
        m95696t1();
    }
}
