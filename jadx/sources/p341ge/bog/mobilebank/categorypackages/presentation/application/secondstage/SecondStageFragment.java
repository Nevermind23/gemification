package p341ge.bog.mobilebank.categorypackages.presentation.application.secondstage;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.cardview.widget.CardView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.p016os.C0908e;
import androidx.fragment.app.C1505h;
import androidx.fragment.app.C1514j0;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.C1591i;
import androidx.lifecycle.C1619q;
import androidx.lifecycle.C1620q0;
import androidx.lifecycle.C1636t0;
import androidx.lifecycle.C1638u0;
import androidx.lifecycle.C1645y;
import androidx.recyclerview.widget.RecyclerView;
import b41.C31128a;
import b41.C31132b;
import g91.C32343x;
import he1.C41212c;
import he1.C41217g;
import he1.C41222k;
import he1.C41233s;
import he1.C41238w;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.C41520a0;
import kotlin.jvm.internal.C41532h;
import kotlin.jvm.internal.C41535k;
import kotlin.jvm.internal.C41536l;
import kotlin.jvm.internal.C41537m;
import kotlin.jvm.internal.DefaultConstructorMarker;
import m41.C37224b;
import o31.C37588a0;
import p163m0.C7047a;
import p228r0.C8034d;
import p341ge.bog.designsystem.components.buttons.Button;
import p341ge.bog.designsystem.components.dialog.C13310d;
import p341ge.bog.mobilebank.categorypackages.presentation.CategoryPackagesActivity;
import p341ge.bog.mobilebank.categorypackages.presentation.application.navigator.ApplicationNavigatorFragment;
import p341ge.bog.mobilebank.categorypackages.presentation.application.secondstage.C14538c;
import p341ge.bog.mobilebank.categorypackages.presentation.application.secondstage.C14548g;
import p341ge.bog.mobilebank.categorypackages.presentation.application.secondstage.model.FinancialInfoUiModel;
import p341ge.bog.mobilebank.categorypackages.presentation.application.secondstage.solo_lounge_selector.model.SelectedLoungeData;
import p341ge.bog.mobilebank.categorypackages.presentation.application.shared.model.SoloApplicationFormData;
import p356ao.C10114f;
import p357ap.C10127a;
import p413eo.C12754l;
import p610sp.C17913e;
import p623to.C18058a;
import p623to.C18059b;
import p623to.C18060c;
import p623to.C18061d;
import p623to.C18062e;
import p623to.C18067j;
import p623to.C18068k;
import p636uo.C18265b;
import p704zo.C19108c;
import ue1.C43064a;
import ue1.C43075l;
import ue1.C43079p;

/* renamed from: ge.bog.mobilebank.categorypackages.presentation.application.secondstage.SecondStageFragment */
public final class SecondStageFragment extends C14536a {

    /* renamed from: m */
    public static final C14515a f42355m = new C14515a((DefaultConstructorMarker) null);

    /* renamed from: i */
    private C12754l f42356i;

    /* renamed from: j */
    public C14548g.C14556d f42357j;

    /* renamed from: k */
    private final C41217g f42358k;

    /* renamed from: l */
    private final C41217g f42359l = C41219i.m119470b(new C14516b(this));

    /* renamed from: ge.bog.mobilebank.categorypackages.presentation.application.secondstage.SecondStageFragment$a */
    public static final class C14515a {
        private C14515a() {
        }

        public /* synthetic */ C14515a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* renamed from: a */
        public final Bundle mo40768a(SoloApplicationFormData soloApplicationFormData) {
            C41536l.m120489i(soloApplicationFormData, "formData");
            return C0908e.m3336b(C41233s.m119492a("EXTRA_FORM_DATA", soloApplicationFormData));
        }
    }

    /* renamed from: ge.bog.mobilebank.categorypackages.presentation.application.secondstage.SecondStageFragment$b */
    static final class C14516b extends C41537m implements C43064a {

        /* renamed from: d */
        final /* synthetic */ SecondStageFragment f42360d;

        /* renamed from: ge.bog.mobilebank.categorypackages.presentation.application.secondstage.SecondStageFragment$b$a */
        /* synthetic */ class C14517a implements C14538c.C14540b, C41532h {

            /* renamed from: a */
            final /* synthetic */ C18067j f42361a;

            C14517a(C18067j jVar) {
                this.f42361a = jVar;
            }

            public final boolean equals(Object obj) {
                if (!(obj instanceof C14538c.C14540b) || !(obj instanceof C41532h)) {
                    return false;
                }
                return C41536l.m120484d(getFunctionDelegate(), ((C41532h) obj).getFunctionDelegate());
            }

            public final C41212c getFunctionDelegate() {
                return new C41535k(0, this.f42361a, C18067j.class, "onAddFinancialInfoClick", "onAddFinancialInfoClick()V", 0);
            }

            public final int hashCode() {
                return getFunctionDelegate().hashCode();
            }

            public final void invoke() {
                this.f42361a.mo40806om();
            }
        }

        /* renamed from: ge.bog.mobilebank.categorypackages.presentation.application.secondstage.SecondStageFragment$b$b */
        /* synthetic */ class C14518b implements C14538c.C14541c, C41532h {

            /* renamed from: a */
            final /* synthetic */ C18067j f42362a;

            C14518b(C18067j jVar) {
                this.f42362a = jVar;
            }

            /* renamed from: a */
            public final void mo40773a(FinancialInfoUiModel financialInfoUiModel) {
                C41536l.m120489i(financialInfoUiModel, "p0");
                this.f42362a.mo40804dk(financialInfoUiModel);
            }

            public final boolean equals(Object obj) {
                if (!(obj instanceof C14538c.C14541c) || !(obj instanceof C41532h)) {
                    return false;
                }
                return C41536l.m120484d(getFunctionDelegate(), ((C41532h) obj).getFunctionDelegate());
            }

            public final C41212c getFunctionDelegate() {
                return new C41535k(1, this.f42362a, C18067j.class, "onRemoveInfoClicked", "onRemoveInfoClicked(Lge/bog/mobilebank/categorypackages/presentation/application/secondstage/model/FinancialInfoUiModel;)V", 0);
            }

            public final int hashCode() {
                return getFunctionDelegate().hashCode();
            }
        }

        /* renamed from: ge.bog.mobilebank.categorypackages.presentation.application.secondstage.SecondStageFragment$b$c */
        /* synthetic */ class C14519c implements C14538c.C14542d, C41532h {

            /* renamed from: a */
            final /* synthetic */ C18067j f42363a;

            C14519c(C18067j jVar) {
                this.f42363a = jVar;
            }

            public final boolean equals(Object obj) {
                if (!(obj instanceof C14538c.C14542d) || !(obj instanceof C41532h)) {
                    return false;
                }
                return C41536l.m120484d(getFunctionDelegate(), ((C41532h) obj).getFunctionDelegate());
            }

            public final C41212c getFunctionDelegate() {
                return new C41535k(0, this.f42363a, C18067j.class, "onSoloLoungeInputClick", "onSoloLoungeInputClick()V", 0);
            }

            public final int hashCode() {
                return getFunctionDelegate().hashCode();
            }

            public final void invoke() {
                this.f42363a.mo40800On();
            }
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C14516b(SecondStageFragment secondStageFragment) {
            super(0);
            this.f42360d = secondStageFragment;
        }

        /* renamed from: b */
        public final C14538c invoke() {
            return new C14538c(new C14517a(this.f42360d.m53665y1().mo40807pw()), new C14518b(this.f42360d.m53665y1().mo40807pw()), new C14519c(this.f42360d.m53665y1().mo40807pw()));
        }
    }

    /* renamed from: ge.bog.mobilebank.categorypackages.presentation.application.secondstage.SecondStageFragment$c */
    /* synthetic */ class C14520c extends C41535k implements C43075l {
        C14520c(Object obj) {
            super(1, obj, SecondStageFragment.class, "observeResponseState", "observeResponseState(Lge/bog/mobilebank/shared/requestedresult/RequestedResult;)V", 0);
        }

        /* renamed from: b */
        public final void mo40779b(C31128a aVar) {
            C41536l.m120489i(aVar, "p0");
            ((SecondStageFragment) this.receiver).m53640E1(aVar);
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            mo40779b((C31128a) obj);
            return C41238w.f97225a;
        }
    }

    /* renamed from: ge.bog.mobilebank.categorypackages.presentation.application.secondstage.SecondStageFragment$d */
    /* synthetic */ class C14521d extends C41535k implements C43075l {
        C14521d(Object obj) {
            super(1, obj, SecondStageFragment.class, "submitAdapterData", "submitAdapterData(Ljava/util/List;)V", 0);
        }

        /* renamed from: b */
        public final void mo40780b(List list) {
            C41536l.m120489i(list, "p0");
            ((SecondStageFragment) this.receiver).m53649N1(list);
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            mo40780b((List) obj);
            return C41238w.f97225a;
        }
    }

    /* renamed from: ge.bog.mobilebank.categorypackages.presentation.application.secondstage.SecondStageFragment$e */
    /* synthetic */ class C14522e extends C41535k implements C43075l {
        C14522e(Object obj) {
            super(1, obj, SecondStageFragment.class, "showRemoveFinancialInfoPopUp", "showRemoveFinancialInfoPopUp(Lge/bog/mobilebank/categorypackages/presentation/application/secondstage/model/FinancialInfoUiModel;)V", 0);
        }

        /* renamed from: b */
        public final void mo40781b(FinancialInfoUiModel financialInfoUiModel) {
            C41536l.m120489i(financialInfoUiModel, "p0");
            ((SecondStageFragment) this.receiver).m53645J1(financialInfoUiModel);
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            mo40781b((FinancialInfoUiModel) obj);
            return C41238w.f97225a;
        }
    }

    /* renamed from: ge.bog.mobilebank.categorypackages.presentation.application.secondstage.SecondStageFragment$f */
    /* synthetic */ class C14523f extends C41535k implements C43075l {
        C14523f(Object obj) {
            super(1, obj, SecondStageFragment.class, "onSoloLoungeInputClick", "onSoloLoungeInputClick(Lge/bog/mobilebank/categorypackages/presentation/application/secondstage/solo_lounge_selector/model/SelectedLoungeData;)V", 0);
        }

        /* renamed from: b */
        public final void mo40782b(SelectedLoungeData selectedLoungeData) {
            C41536l.m120489i(selectedLoungeData, "p0");
            ((SecondStageFragment) this.receiver).m53642G1(selectedLoungeData);
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            mo40782b((SelectedLoungeData) obj);
            return C41238w.f97225a;
        }
    }

    /* renamed from: ge.bog.mobilebank.categorypackages.presentation.application.secondstage.SecondStageFragment$g */
    /* synthetic */ class C14524g extends C41535k implements C43075l {
        C14524g(Object obj) {
            super(1, obj, SecondStageFragment.class, "startPreContract", "startPreContract(Lge/bog/mobilebank/categorypackages/presentation/application/shared/model/SoloApplicationFormData;)V", 0);
        }

        /* renamed from: b */
        public final void mo40783b(SoloApplicationFormData soloApplicationFormData) {
            C41536l.m120489i(soloApplicationFormData, "p0");
            ((SecondStageFragment) this.receiver).m53648M1(soloApplicationFormData);
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            mo40783b((SoloApplicationFormData) obj);
            return C41238w.f97225a;
        }
    }

    /* renamed from: ge.bog.mobilebank.categorypackages.presentation.application.secondstage.SecondStageFragment$h */
    /* synthetic */ class C14525h extends C41535k implements C43075l {
        C14525h(Object obj) {
            super(1, obj, SecondStageFragment.class, "onFinancialInfoClick", "onFinancialInfoClick(Ljava/util/List;)V", 0);
        }

        /* renamed from: b */
        public final void mo40784b(List list) {
            C41536l.m120489i(list, "p0");
            ((SecondStageFragment) this.receiver).m53641F1(list);
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            mo40784b((List) obj);
            return C41238w.f97225a;
        }
    }

    /* renamed from: ge.bog.mobilebank.categorypackages.presentation.application.secondstage.SecondStageFragment$i */
    static final class C14526i extends C41537m implements C43075l {

        /* renamed from: d */
        final /* synthetic */ SecondStageFragment f42364d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C14526i(SecondStageFragment secondStageFragment) {
            super(1);
            this.f42364d = secondStageFragment;
        }

        /* renamed from: a */
        public final void mo40785a(Object obj) {
            C41536l.m120489i(obj, "it");
            FrameLayout frameLayout = this.f42364d.m53664v1().f37773f;
            C41536l.m120488h(frameLayout, "binding.progressBar");
            C32343x.m95455i0(frameLayout);
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            mo40785a(obj);
            return C41238w.f97225a;
        }
    }

    /* renamed from: ge.bog.mobilebank.categorypackages.presentation.application.secondstage.SecondStageFragment$j */
    static final class C14527j extends C41537m implements C43075l {

        /* renamed from: d */
        final /* synthetic */ SecondStageFragment f42365d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C14527j(SecondStageFragment secondStageFragment) {
            super(1);
            this.f42365d = secondStageFragment;
        }

        /* renamed from: a */
        public final void mo40786a(Object obj) {
            FrameLayout frameLayout = this.f42365d.m53664v1().f37773f;
            C41536l.m120488h(frameLayout, "binding.progressBar");
            C32343x.m95447f1(frameLayout);
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            mo40786a(obj);
            return C41238w.f97225a;
        }
    }

    /* renamed from: ge.bog.mobilebank.categorypackages.presentation.application.secondstage.SecondStageFragment$k */
    static final class C14528k extends C41537m implements C43079p {

        /* renamed from: d */
        final /* synthetic */ SecondStageFragment f42366d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C14528k(SecondStageFragment secondStageFragment) {
            super(2);
            this.f42366d = secondStageFragment;
        }

        /* renamed from: a */
        public final void mo40787a(Throwable th, Object obj) {
            C41536l.m120489i(th, "<anonymous parameter 0>");
            CardView cardView = this.f42366d.m53664v1().f37776i;
            C41536l.m120488h(cardView, "binding.retryButtonContainer");
            C32343x.m95447f1(cardView);
            FrameLayout frameLayout = this.f42366d.m53664v1().f37773f;
            C41536l.m120488h(frameLayout, "binding.progressBar");
            C32343x.m95455i0(frameLayout);
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            mo40787a((Throwable) obj, obj2);
            return C41238w.f97225a;
        }
    }

    /* renamed from: ge.bog.mobilebank.categorypackages.presentation.application.secondstage.SecondStageFragment$l */
    static final class C14529l implements C1645y, C41532h {

        /* renamed from: a */
        private final /* synthetic */ C43075l f42367a;

        C14529l(C43075l lVar) {
            C41536l.m120489i(lVar, "function");
            this.f42367a = lVar;
        }

        public final boolean equals(Object obj) {
            if (!(obj instanceof C1645y) || !(obj instanceof C41532h)) {
                return false;
            }
            return C41536l.m120484d(getFunctionDelegate(), ((C41532h) obj).getFunctionDelegate());
        }

        public final C41212c getFunctionDelegate() {
            return this.f42367a;
        }

        public final int hashCode() {
            return getFunctionDelegate().hashCode();
        }

        public final /* synthetic */ void onChanged(Object obj) {
            this.f42367a.invoke(obj);
        }
    }

    /* renamed from: ge.bog.mobilebank.categorypackages.presentation.application.secondstage.SecondStageFragment$m */
    public static final class C14530m extends C41537m implements C43064a {

        /* renamed from: d */
        final /* synthetic */ Fragment f42368d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C14530m(Fragment fragment) {
            super(0);
            this.f42368d = fragment;
        }

        public final Fragment invoke() {
            return this.f42368d;
        }
    }

    /* renamed from: ge.bog.mobilebank.categorypackages.presentation.application.secondstage.SecondStageFragment$n */
    public static final class C14531n extends C41537m implements C43064a {

        /* renamed from: d */
        final /* synthetic */ C43064a f42369d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C14531n(C43064a aVar) {
            super(0);
            this.f42369d = aVar;
        }

        public final C1638u0 invoke() {
            return (C1638u0) this.f42369d.invoke();
        }
    }

    /* renamed from: ge.bog.mobilebank.categorypackages.presentation.application.secondstage.SecondStageFragment$o */
    public static final class C14532o extends C41537m implements C43064a {

        /* renamed from: d */
        final /* synthetic */ C41217g f42370d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C14532o(C41217g gVar) {
            super(0);
            this.f42370d = gVar;
        }

        public final C1636t0 invoke() {
            C1636t0 viewModelStore = C1514j0.m5375d(this.f42370d).getViewModelStore();
            C41536l.m120488h(viewModelStore, "owner.viewModelStore");
            return viewModelStore;
        }
    }

    /* renamed from: ge.bog.mobilebank.categorypackages.presentation.application.secondstage.SecondStageFragment$p */
    public static final class C14533p extends C41537m implements C43064a {

        /* renamed from: d */
        final /* synthetic */ C43064a f42371d;

        /* renamed from: e */
        final /* synthetic */ C41217g f42372e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C14533p(C43064a aVar, C41217g gVar) {
            super(0);
            this.f42371d = aVar;
            this.f42372e = gVar;
        }

        public final C7047a invoke() {
            C7047a aVar;
            C43064a aVar2 = this.f42371d;
            if (aVar2 != null && (aVar = (C7047a) aVar2.invoke()) != null) {
                return aVar;
            }
            C1638u0 a = C1514j0.m5375d(this.f42372e);
            C1591i iVar = a instanceof C1591i ? (C1591i) a : null;
            C7047a defaultViewModelCreationExtras = iVar != null ? iVar.getDefaultViewModelCreationExtras() : null;
            return defaultViewModelCreationExtras == null ? C7047a.C7048a.f20987b : defaultViewModelCreationExtras;
        }
    }

    /* renamed from: ge.bog.mobilebank.categorypackages.presentation.application.secondstage.SecondStageFragment$q */
    static final class C14534q extends C41537m implements C43064a {

        /* renamed from: d */
        final /* synthetic */ SecondStageFragment f42373d;

        /* renamed from: ge.bog.mobilebank.categorypackages.presentation.application.secondstage.SecondStageFragment$q$a */
        static final class C14535a extends C41537m implements C43064a {

            /* renamed from: d */
            final /* synthetic */ SecondStageFragment f42374d;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            C14535a(SecondStageFragment secondStageFragment) {
                super(0);
                this.f42374d = secondStageFragment;
            }

            /* renamed from: b */
            public final C14548g invoke() {
                C14548g.C14556d x1 = this.f42374d.mo40767x1();
                Bundle arguments = this.f42374d.getArguments();
                SoloApplicationFormData soloApplicationFormData = arguments != null ? (SoloApplicationFormData) arguments.getParcelable("EXTRA_FORM_DATA") : null;
                C41536l.m120486f(soloApplicationFormData);
                return x1.mo32815a(soloApplicationFormData);
            }
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C14534q(SecondStageFragment secondStageFragment) {
            super(0);
            this.f42373d = secondStageFragment;
        }

        public final C1620q0.C1624b invoke() {
            return C37588a0.f90326a.mo90779a(new C14535a(this.f42373d));
        }
    }

    public SecondStageFragment() {
        C14534q qVar = new C14534q(this);
        C41217g a = C41219i.m119469a(C41222k.NONE, new C14531n(new C14530m(this)));
        this.f42358k = C1514j0.m5374c(this, C41520a0.m120436b(C14548g.class), new C14532o(a), new C14533p((C43064a) null, a), qVar);
    }

    /* renamed from: A1 */
    private final void m53636A1() {
        getChildFragmentManager().mo4367F1("SOLO_LOUNGE_SELECTOR_REQUEST_KEY", getViewLifecycleOwner(), new C18058a(this));
        getChildFragmentManager().mo4367F1("REQUEST_KEY_ADD_FINANCIAL_INFO", getViewLifecycleOwner(), new C18059b(this));
    }

    /* access modifiers changed from: private */
    /* renamed from: B1 */
    public static final void m53637B1(SecondStageFragment secondStageFragment, String str, Bundle bundle) {
        SelectedLoungeData selectedLoungeData;
        C41536l.m120489i(secondStageFragment, "this$0");
        C41536l.m120489i(str, "requestKey");
        C41536l.m120489i(bundle, "data");
        if (str.hashCode() == -1860320620 && str.equals("SOLO_LOUNGE_SELECTOR_REQUEST_KEY") && (selectedLoungeData = (SelectedLoungeData) bundle.getParcelable("SELECTED_LOUNGE_RESULT_KEY")) != null) {
            secondStageFragment.m53665y1().mo40807pw().mo40797Cl(selectedLoungeData);
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: C1 */
    public static final void m53638C1(SecondStageFragment secondStageFragment, String str, Bundle bundle) {
        FinancialInfoUiModel financialInfoUiModel;
        C41536l.m120489i(secondStageFragment, "this$0");
        C41536l.m120489i(str, "requestKey");
        C41536l.m120489i(bundle, "data");
        if (str.hashCode() == 645692434 && str.equals("REQUEST_KEY_ADD_FINANCIAL_INFO") && (financialInfoUiModel = (FinancialInfoUiModel) bundle.getParcelable("RESULT_KEY_ADD_FINANCIAL_INFO")) != null) {
            secondStageFragment.m53665y1().mo40807pw().mo40801Wu(financialInfoUiModel);
        }
    }

    /* renamed from: D1 */
    private final void m53639D1() {
        C18068k qw = m53665y1().mo40809qw();
        C1619q viewLifecycleOwner = getViewLifecycleOwner();
        C41536l.m120488h(viewLifecycleOwner, "viewLifecycleOwner");
        qw.mo40799L().mo4819k(viewLifecycleOwner, new C14529l(new C14520c(this)));
        qw.mo40808q().mo4819k(viewLifecycleOwner, new C14529l(new C14521d(this)));
        C37224b.m109963b(qw.mo40805ds(), viewLifecycleOwner, new C14522e(this));
        C37224b.m109963b(qw.mo40802cf(), viewLifecycleOwner, new C14523f(this));
        C37224b.m109963b(qw.mo40811v0(), viewLifecycleOwner, new C14524g(this));
        C37224b.m109963b(qw.mo40803ci(), viewLifecycleOwner, new C14525h(this));
    }

    /* access modifiers changed from: private */
    /* renamed from: E1 */
    public final void m53640E1(C31128a aVar) {
        C31132b.m92648j(aVar, (int[]) null, new C14526i(this), 1, (Object) null);
        C31132b.m92646h(aVar, (int[]) null, new C14527j(this), 1, (Object) null);
        C31132b.m92644f(aVar, (int[]) null, new C14528k(this), 1, (Object) null);
    }

    /* access modifiers changed from: private */
    /* renamed from: F1 */
    public final void m53641F1(List list) {
        C18265b.f51580C.mo45916a(list).mo4576A1(getChildFragmentManager(), (String) null);
    }

    /* access modifiers changed from: private */
    /* renamed from: G1 */
    public final void m53642G1(SelectedLoungeData selectedLoungeData) {
        C19108c.f53284P.mo47309a(selectedLoungeData).mo4576A1(getChildFragmentManager(), (String) null);
    }

    /* renamed from: H1 */
    private final Button m53643H1() {
        C12754l v1 = m53664v1();
        C1505h activity = getActivity();
        C41536l.m120487g(activity, "null cannot be cast to non-null type ge.bog.mobilebank.categorypackages.presentation.CategoryPackagesActivity");
        ((CategoryPackagesActivity) activity).mo86429X1(C32343x.m95388F("packages.application.main.header", new Object[0]));
        v1.f37774g.setAdapter(m53663u1());
        v1.f37774g.setItemAnimator((RecyclerView.C1742m) null);
        Button button = v1.f37772e.getButton();
        button.setEnabled(false);
        button.setButtonText(C32343x.m95388F("packages.application.I.button.label", new Object[0]));
        button.setOnClickListener(new C18062e(this));
        return button;
    }

    /* access modifiers changed from: private */
    /* renamed from: I1 */
    public static final void m53644I1(SecondStageFragment secondStageFragment, View view) {
        C41536l.m120489i(secondStageFragment, "this$0");
        secondStageFragment.m53665y1().mo40807pw().mo40810s0();
    }

    /* access modifiers changed from: private */
    /* renamed from: J1 */
    public final void m53645J1(FinancialInfoUiModel financialInfoUiModel) {
        C13310d dVar = new C13310d();
        dVar.mo35647a2(C13310d.C13312b.TITLE_CLOSE_TWO_BUTTON);
        dVar.mo35648c2(C32343x.m95388F("packages.application.II.financial.info.delete.dialog.header", new Object[0]));
        dVar.mo35639Q1(C32343x.m95388F("packages.application.II.financial.info.delete.dialog.explanatory", new Object[0]));
        dVar.mo35646Z1(C32343x.m95388F("packages.application.II.financial.info.delete.dialog.primary.button.label", new Object[0]));
        dVar.mo35642U1(C32343x.m95388F("packages.application.II.financial.info.delete.dialog.secondary.button.label", new Object[0]));
        dVar.mo35645Y1(new C18060c(dVar, this, financialInfoUiModel));
        dVar.mo35641T1(new C18061d(dVar));
        dVar.mo4576A1(getChildFragmentManager(), (String) null);
    }

    /* access modifiers changed from: private */
    /* renamed from: K1 */
    public static final void m53646K1(C13310d dVar, SecondStageFragment secondStageFragment, FinancialInfoUiModel financialInfoUiModel, Button button) {
        C41536l.m120489i(dVar, "$this_apply");
        C41536l.m120489i(secondStageFragment, "this$0");
        C41536l.m120489i(financialInfoUiModel, "$info");
        C41536l.m120489i(button, "it");
        dVar.mo4577k1();
        secondStageFragment.m53665y1().mo40807pw().mo40798Hj(financialInfoUiModel);
    }

    /* access modifiers changed from: private */
    /* renamed from: L1 */
    public static final void m53647L1(C13310d dVar, Button button) {
        C41536l.m120489i(dVar, "$this_apply");
        C41536l.m120489i(button, "it");
        dVar.mo4577k1();
    }

    /* access modifiers changed from: private */
    /* renamed from: M1 */
    public final void m53648M1(SoloApplicationFormData soloApplicationFormData) {
        C8034d.m30522a(this).mo22118M(C10114f.action_applicationSecondStageFragment_applicationNavigatorFragment, ApplicationNavigatorFragment.f42261B.mo40667a(soloApplicationFormData, true));
    }

    /* access modifiers changed from: private */
    /* renamed from: N1 */
    public final void m53649N1(List list) {
        m53663u1().mo6029i(list);
        m53664v1().f37772e.getButton().setEnabled(m53666z1(list));
    }

    /* renamed from: u1 */
    private final C14538c m53663u1() {
        return (C14538c) this.f42359l.getValue();
    }

    /* access modifiers changed from: private */
    /* renamed from: v1 */
    public final C12754l m53664v1() {
        C12754l lVar = this.f42356i;
        C41536l.m120486f(lVar);
        return lVar;
    }

    /* access modifiers changed from: private */
    /* renamed from: y1 */
    public final C14548g m53665y1() {
        return (C14548g) this.f42358k.getValue();
    }

    /* renamed from: z1 */
    private final boolean m53666z1(List list) {
        Iterator it = list.iterator();
        while (it.hasNext()) {
            C14557h hVar = (C14557h) it.next();
            if ((hVar instanceof C10127a) && !((C10127a) hVar).mo26650b()) {
                return false;
            }
        }
        return true;
    }

    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        C41536l.m120489i(layoutInflater, "inflater");
        this.f42356i = C12754l.m48411d(layoutInflater, viewGroup, false);
        ConstraintLayout c = m53664v1().mo3946b();
        C41536l.m120488h(c, "binding.root");
        return c;
    }

    public void onDestroyView() {
        this.f42356i = null;
        super.onDestroyView();
    }

    public void onResume() {
        super.onResume();
        C17913e.m61729k(this, false);
    }

    public void onViewCreated(View view, Bundle bundle) {
        C41536l.m120489i(view, "view");
        super.onViewCreated(view, bundle);
        m53639D1();
        m53636A1();
        m53643H1();
    }

    /* renamed from: x1 */
    public final C14548g.C14556d mo40767x1() {
        C14548g.C14556d dVar = this.f42357j;
        if (dVar != null) {
            return dVar;
        }
        C41536l.m120506z("factory");
        return null;
    }
}
