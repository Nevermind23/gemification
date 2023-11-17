package p341ge.bog.mobilebank.galtandtaggart.presentation.onboarding.identomat.typeselector;

import ag0.C19236a;
import ag0.C19237b;
import ag0.C19238c;
import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ProgressBar;
import androidx.core.p016os.C0908e;
import androidx.fragment.app.C1514j0;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.C1591i;
import androidx.lifecycle.C1619q;
import androidx.lifecycle.C1620q0;
import androidx.lifecycle.C1636t0;
import androidx.lifecycle.C1638u0;
import androidx.lifecycle.C1645y;
import androidx.lifecycle.LiveData;
import b41.C31128a;
import fb1.C31973a;
import g31.C32054a;
import g41.C32081a;
import g91.C32330r0;
import g91.C32343x;
import he1.C41212c;
import he1.C41217g;
import he1.C41222k;
import he1.C41233s;
import he1.C41238w;
import ie0.C25190j;
import iu0.C36546y;
import java.util.Map;
import kotlin.jvm.internal.C41520a0;
import kotlin.jvm.internal.C41532h;
import kotlin.jvm.internal.C41536l;
import kotlin.jvm.internal.C41537m;
import kotlin.jvm.internal.DefaultConstructorMarker;
import m41.C37224b;
import p163m0.C7047a;
import p341ge.bog.designsystem.components.actionsheet.ActionSheetTitle;
import p341ge.bog.mobilebank.galtandtaggart.presentation.landing.GTLandingViewModel$ViewModel;
import p380ck.C10463g;
import ue0.C28740n;
import ue1.C43064a;
import ue1.C43075l;

/* renamed from: ge.bog.mobilebank.galtandtaggart.presentation.onboarding.identomat.typeselector.b */
public final class C23583b extends C23582a {

    /* renamed from: P */
    public static final C23584a f61554P = new C23584a((DefaultConstructorMarker) null);

    /* renamed from: K */
    private C28740n f61555K;

    /* renamed from: L */
    private final C41217g f61556L = C41219i.m119470b(new C23586c(this));

    /* renamed from: M */
    private final C41217g f61557M;

    /* renamed from: N */
    private final C41217g f61558N;
    /* access modifiers changed from: private */

    /* renamed from: O */
    public C23585b f61559O;

    /* renamed from: ge.bog.mobilebank.galtandtaggart.presentation.onboarding.identomat.typeselector.b$a */
    public static final class C23584a {
        private C23584a() {
        }

        public /* synthetic */ C23584a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* renamed from: b */
        public static /* synthetic */ C23583b m76309b(C23584a aVar, boolean z, int i, Object obj) {
            if ((i & 1) != 0) {
                z = false;
            }
            return aVar.mo60472a(z);
        }

        /* renamed from: a */
        public final C23583b mo60472a(boolean z) {
            C23583b bVar = new C23583b();
            bVar.setArguments(C0908e.m3336b(C41233s.m119492a("KYC_REQUIRED", Boolean.valueOf(z))));
            return bVar;
        }
    }

    /* renamed from: ge.bog.mobilebank.galtandtaggart.presentation.onboarding.identomat.typeselector.b$b */
    public interface C23585b {
        /* renamed from: E */
        void mo60411E();
    }

    /* renamed from: ge.bog.mobilebank.galtandtaggart.presentation.onboarding.identomat.typeselector.b$c */
    static final class C23586c extends C41537m implements C43064a {

        /* renamed from: d */
        final /* synthetic */ C23583b f61560d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C23586c(C23583b bVar) {
            super(0);
            this.f61560d = bVar;
        }

        /* renamed from: b */
        public final Boolean invoke() {
            return Boolean.valueOf(this.f61560d.requireArguments().getBoolean("KYC_REQUIRED", false));
        }
    }

    /* renamed from: ge.bog.mobilebank.galtandtaggart.presentation.onboarding.identomat.typeselector.b$d */
    static final class C23587d extends C41537m implements C43075l {

        /* renamed from: d */
        final /* synthetic */ C23583b f61561d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C23587d(C23583b bVar) {
            super(1);
            this.f61561d = bVar;
        }

        /* renamed from: a */
        public final void mo60474a(C31128a aVar) {
            if (aVar instanceof C31128a.C31131c) {
                this.f61561d.m76302t2();
                this.f61561d.m76307y2();
                ProgressBar progressBar = this.f61561d.m76297o2().f73392h;
                C41536l.m120488h(progressBar, "binding.loadingView");
                C32343x.m95483r1(progressBar, false, false, 2, (Object) null);
            } else if (aVar instanceof C31128a.C31130b) {
                ProgressBar progressBar2 = this.f61561d.m76297o2().f73392h;
                C41536l.m120488h(progressBar2, "binding.loadingView");
                C32343x.m95483r1(progressBar2, true, false, 2, (Object) null);
            } else if (aVar instanceof C31128a.C31129a) {
                ProgressBar progressBar3 = this.f61561d.m76297o2().f73392h;
                C41536l.m120488h(progressBar3, "binding.loadingView");
                C32343x.m95483r1(progressBar3, false, false, 2, (Object) null);
                this.f61561d.handleError(((C31128a.C31129a) aVar).mo71342c());
            }
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            mo60474a((C31128a) obj);
            return C41238w.f97225a;
        }
    }

    /* renamed from: ge.bog.mobilebank.galtandtaggart.presentation.onboarding.identomat.typeselector.b$e */
    static final class C23588e extends C41537m implements C43075l {

        /* renamed from: d */
        final /* synthetic */ C23583b f61562d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C23588e(C23583b bVar) {
            super(1);
            this.f61562d = bVar;
        }

        /* renamed from: a */
        public final void mo60475a(C41238w wVar) {
            C41536l.m120489i(wVar, "it");
            if (!this.f61562d.m76299q2()) {
                C23585b k2 = this.f61562d.f61559O;
                if (k2 != null) {
                    k2.mo60411E();
                }
            } else if (C32330r0.m95338m(this.f61562d.getContext(), "android.permission.CAMERA")) {
                this.f61562d.m76298p2().mo60322ww().mo60316dh();
                this.f61562d.mo4577k1();
            }
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            mo60475a((C41238w) obj);
            return C41238w.f97225a;
        }
    }

    /* renamed from: ge.bog.mobilebank.galtandtaggart.presentation.onboarding.identomat.typeselector.b$f */
    static final class C23589f implements C1645y, C41532h {

        /* renamed from: a */
        private final /* synthetic */ C43075l f61563a;

        C23589f(C43075l lVar) {
            C41536l.m120489i(lVar, "function");
            this.f61563a = lVar;
        }

        public final boolean equals(Object obj) {
            if (!(obj instanceof C1645y) || !(obj instanceof C41532h)) {
                return false;
            }
            return C41536l.m120484d(getFunctionDelegate(), ((C41532h) obj).getFunctionDelegate());
        }

        public final C41212c getFunctionDelegate() {
            return this.f61563a;
        }

        public final int hashCode() {
            return getFunctionDelegate().hashCode();
        }

        public final /* synthetic */ void onChanged(Object obj) {
            this.f61563a.invoke(obj);
        }
    }

    /* renamed from: ge.bog.mobilebank.galtandtaggart.presentation.onboarding.identomat.typeselector.b$g */
    static final class C23590g extends C41537m implements C43064a {

        /* renamed from: d */
        final /* synthetic */ C23583b f61564d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C23590g(C23583b bVar) {
            super(0);
            this.f61564d = bVar;
        }

        public final void invoke() {
            this.f61564d.m76300r2().mo60467gw().mo47479Go();
        }
    }

    /* renamed from: ge.bog.mobilebank.galtandtaggart.presentation.onboarding.identomat.typeselector.b$h */
    public static final class C23591h extends C41537m implements C43064a {

        /* renamed from: d */
        final /* synthetic */ Fragment f61565d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C23591h(Fragment fragment) {
            super(0);
            this.f61565d = fragment;
        }

        public final C1636t0 invoke() {
            C1636t0 viewModelStore = this.f61565d.requireActivity().getViewModelStore();
            C41536l.m120488h(viewModelStore, "requireActivity().viewModelStore");
            return viewModelStore;
        }
    }

    /* renamed from: ge.bog.mobilebank.galtandtaggart.presentation.onboarding.identomat.typeselector.b$i */
    public static final class C23592i extends C41537m implements C43064a {

        /* renamed from: d */
        final /* synthetic */ C43064a f61566d;

        /* renamed from: e */
        final /* synthetic */ Fragment f61567e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C23592i(C43064a aVar, Fragment fragment) {
            super(0);
            this.f61566d = aVar;
            this.f61567e = fragment;
        }

        public final C7047a invoke() {
            C7047a aVar;
            C43064a aVar2 = this.f61566d;
            if (aVar2 != null && (aVar = (C7047a) aVar2.invoke()) != null) {
                return aVar;
            }
            C7047a defaultViewModelCreationExtras = this.f61567e.requireActivity().getDefaultViewModelCreationExtras();
            C41536l.m120488h(defaultViewModelCreationExtras, "requireActivity().defaultViewModelCreationExtras");
            return defaultViewModelCreationExtras;
        }
    }

    /* renamed from: ge.bog.mobilebank.galtandtaggart.presentation.onboarding.identomat.typeselector.b$j */
    public static final class C23593j extends C41537m implements C43064a {

        /* renamed from: d */
        final /* synthetic */ Fragment f61568d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C23593j(Fragment fragment) {
            super(0);
            this.f61568d = fragment;
        }

        public final C1620q0.C1624b invoke() {
            C1620q0.C1624b defaultViewModelProviderFactory = this.f61568d.requireActivity().getDefaultViewModelProviderFactory();
            C41536l.m120488h(defaultViewModelProviderFactory, "requireActivity().defaultViewModelProviderFactory");
            return defaultViewModelProviderFactory;
        }
    }

    /* renamed from: ge.bog.mobilebank.galtandtaggart.presentation.onboarding.identomat.typeselector.b$k */
    public static final class C23594k extends C41537m implements C43064a {

        /* renamed from: d */
        final /* synthetic */ Fragment f61569d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C23594k(Fragment fragment) {
            super(0);
            this.f61569d = fragment;
        }

        public final Fragment invoke() {
            return this.f61569d;
        }
    }

    /* renamed from: ge.bog.mobilebank.galtandtaggart.presentation.onboarding.identomat.typeselector.b$l */
    public static final class C23595l extends C41537m implements C43064a {

        /* renamed from: d */
        final /* synthetic */ C43064a f61570d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C23595l(C43064a aVar) {
            super(0);
            this.f61570d = aVar;
        }

        public final C1638u0 invoke() {
            return (C1638u0) this.f61570d.invoke();
        }
    }

    /* renamed from: ge.bog.mobilebank.galtandtaggart.presentation.onboarding.identomat.typeselector.b$m */
    public static final class C23596m extends C41537m implements C43064a {

        /* renamed from: d */
        final /* synthetic */ C41217g f61571d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C23596m(C41217g gVar) {
            super(0);
            this.f61571d = gVar;
        }

        public final C1636t0 invoke() {
            C1636t0 viewModelStore = C1514j0.m5375d(this.f61571d).getViewModelStore();
            C41536l.m120488h(viewModelStore, "owner.viewModelStore");
            return viewModelStore;
        }
    }

    /* renamed from: ge.bog.mobilebank.galtandtaggart.presentation.onboarding.identomat.typeselector.b$n */
    public static final class C23597n extends C41537m implements C43064a {

        /* renamed from: d */
        final /* synthetic */ C43064a f61572d;

        /* renamed from: e */
        final /* synthetic */ C41217g f61573e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C23597n(C43064a aVar, C41217g gVar) {
            super(0);
            this.f61572d = aVar;
            this.f61573e = gVar;
        }

        public final C7047a invoke() {
            C7047a aVar;
            C43064a aVar2 = this.f61572d;
            if (aVar2 != null && (aVar = (C7047a) aVar2.invoke()) != null) {
                return aVar;
            }
            C1638u0 a = C1514j0.m5375d(this.f61573e);
            C1591i iVar = a instanceof C1591i ? (C1591i) a : null;
            C7047a defaultViewModelCreationExtras = iVar != null ? iVar.getDefaultViewModelCreationExtras() : null;
            return defaultViewModelCreationExtras == null ? C7047a.C7048a.f20987b : defaultViewModelCreationExtras;
        }
    }

    /* renamed from: ge.bog.mobilebank.galtandtaggart.presentation.onboarding.identomat.typeselector.b$o */
    public static final class C23598o extends C41537m implements C43064a {

        /* renamed from: d */
        final /* synthetic */ Fragment f61574d;

        /* renamed from: e */
        final /* synthetic */ C41217g f61575e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C23598o(Fragment fragment, C41217g gVar) {
            super(0);
            this.f61574d = fragment;
            this.f61575e = gVar;
        }

        public final C1620q0.C1624b invoke() {
            C1620q0.C1624b bVar;
            C1638u0 a = C1514j0.m5375d(this.f61575e);
            C1591i iVar = a instanceof C1591i ? (C1591i) a : null;
            if (iVar == null || (bVar = iVar.getDefaultViewModelProviderFactory()) == null) {
                bVar = this.f61574d.getDefaultViewModelProviderFactory();
            }
            C41536l.m120488h(bVar, "(owner as? HasDefaultVie…tViewModelProviderFactory");
            return bVar;
        }
    }

    public C23583b() {
        C41217g a = C41219i.m119469a(C41222k.NONE, new C23595l(new C23594k(this)));
        this.f61557M = C1514j0.m5374c(this, C41520a0.m120436b(IdentomatTypeSelectorViewModel$ViewModel.class), new C23596m(a), new C23597n((C43064a) null, a), new C23598o(this, a));
        this.f61558N = C1514j0.m5374c(this, C41520a0.m120436b(GTLandingViewModel$ViewModel.class), new C23591h(this), new C23592i((C43064a) null, this), new C23593j(this));
    }

    /* renamed from: W1 */
    private final void m76286W1() {
        m76297o2().f73389e.setOnClickListener(new C19236a(this));
        m76297o2().f73390f.setOnClickListener(new C19237b(this));
        m76297o2().f73391g.setOnClickListener(new C19238c(this));
    }

    /* access modifiers changed from: private */
    /* renamed from: o2 */
    public final C28740n m76297o2() {
        C28740n nVar = this.f61555K;
        C41536l.m120486f(nVar);
        return nVar;
    }

    private final void observeData() {
        m76300r2().mo60468hw().mo47482Qb().mo4819k(getViewLifecycleOwner(), new C23589f(new C23587d(this)));
        LiveData fw = m76300r2().mo60466fw();
        C1619q viewLifecycleOwner = getViewLifecycleOwner();
        C41536l.m120488h(viewLifecycleOwner, "viewLifecycleOwner");
        C37224b.m109963b(fw, viewLifecycleOwner, new C23588e(this));
    }

    /* access modifiers changed from: private */
    /* renamed from: p2 */
    public final GTLandingViewModel$ViewModel m76298p2() {
        return (GTLandingViewModel$ViewModel) this.f61558N.getValue();
    }

    /* access modifiers changed from: private */
    /* renamed from: q2 */
    public final boolean m76299q2() {
        return ((Boolean) this.f61556L.getValue()).booleanValue();
    }

    /* access modifiers changed from: private */
    /* renamed from: r2 */
    public final IdentomatTypeSelectorViewModel$ViewModel m76300r2() {
        return (IdentomatTypeSelectorViewModel$ViewModel) this.f61557M.getValue();
    }

    /* renamed from: s2 */
    private final void m76301s2(String str) {
        C32054a.C32074t tVar = C32054a.C32074t.f78915f;
        C10463g F = C36546y.m108282F();
        C41536l.m120488h(F, "getAnalytics()");
        C32081a.m94499a(tVar, F, " ", str);
    }

    /* access modifiers changed from: private */
    /* renamed from: t2 */
    public final void m76302t2() {
        Map m = C41344r0.m119931m(C41233s.m119492a("identomat_residence_permit_front_instructions", getString(C25190j.gt_onboarding_identomat_scan_front_residency)), C41233s.m119492a("identomat_residence_permit_rear_instructions", getString(C25190j.gt_onboarding_identomat_scan_back_residency)), C41233s.m119492a("identomat_card_front_instructions", getString(C25190j.gt_onboarding_identomat_scan_front_id_card)), C41233s.m119492a("identomat_card_rear_instructions", getString(C25190j.gt_onboarding_identomat_scan_back_id_card)), C41233s.m119492a("identomat_passport_instructions", getString(C25190j.gt_onboarding_identomat_scan_passport)));
        C31973a aVar = C31973a.f78755a;
        Context requireContext = requireContext();
        C41536l.m120488h(requireContext, "requireContext()");
        aVar.mo72470e(requireContext, m, new C23590g(this));
    }

    /* access modifiers changed from: private */
    /* renamed from: u2 */
    public static final void m76303u2(C23583b bVar, View view) {
        C41536l.m120489i(bVar, "this$0");
        bVar.m76301s2("ID_CARD");
        bVar.m76300r2().mo60467gw().mo47481vc();
    }

    /* access modifiers changed from: private */
    /* renamed from: v2 */
    public static final void m76304v2(C23583b bVar, View view) {
        C41536l.m120489i(bVar, "this$0");
        bVar.m76301s2("PASSPORT");
        bVar.m76300r2().mo60467gw().mo47480ld();
    }

    /* access modifiers changed from: private */
    /* renamed from: w2 */
    public static final void m76305w2(C23583b bVar, View view) {
        C41536l.m120489i(bVar, "this$0");
        bVar.m76301s2("RESIDENCE_CARD");
        bVar.m76300r2().mo60467gw().mo47478A4();
    }

    /* renamed from: x2 */
    private final void m76306x2() {
        m76297o2().f73393i.setText(C32343x.m95388F("gt.onboarding.document.actionsheet.desc", new Object[0]));
    }

    /* access modifiers changed from: private */
    /* renamed from: y2 */
    public final void m76307y2() {
        Context requireContext = requireContext();
        C31973a aVar = C31973a.f78755a;
        Context requireContext2 = requireContext();
        C41536l.m120488h(requireContext2, "requireContext()");
        requireContext.startActivity(aVar.mo72466a(requireContext2));
    }

    /* renamed from: T1 */
    public void mo26367T1(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        C41536l.m120489i(layoutInflater, "inflater");
        C41536l.m120489i(viewGroup, "container");
        this.f61555K = C28740n.m88086d(layoutInflater, viewGroup, true);
    }

    public void onAttach(Context context) {
        C23585b bVar;
        C41536l.m120489i(context, "context");
        super.onAttach(context);
        if (context instanceof C23585b) {
            this.f61559O = (C23585b) context;
        } else if (getParentFragment() instanceof C23585b) {
            Fragment parentFragment = getParentFragment();
            if (parentFragment instanceof C23585b) {
                bVar = (C23585b) parentFragment;
            } else {
                bVar = null;
            }
            this.f61559O = bVar;
        }
    }

    public void onViewCreated(View view, Bundle bundle) {
        C41536l.m120489i(view, "view");
        super.onViewCreated(view, bundle);
        mo26372b2(ActionSheetTitle.C13155a.BASIC);
        mo26370a2(C32343x.m95388F("gt.onboarding.document.actionsheet.title", new Object[0]));
        m76306x2();
        observeData();
        m76286W1();
    }
}
