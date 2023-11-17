package p341ge.bog.mobilebank.categorypackages.presentation.application.firststage;

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
import g91.C32290b1;
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
import p341ge.bog.mobilebank.categorypackages.presentation.CategoryPackagesActivity;
import p341ge.bog.mobilebank.categorypackages.presentation.application.firststage.C14424b;
import p341ge.bog.mobilebank.categorypackages.presentation.application.firststage.C14439e;
import p341ge.bog.mobilebank.categorypackages.presentation.application.firststage.model.EmailUiModel;
import p341ge.bog.mobilebank.categorypackages.presentation.application.navigator.ApplicationNavigatorFragment;
import p341ge.bog.mobilebank.categorypackages.presentation.application.secondstage.SecondStageFragment;
import p341ge.bog.mobilebank.categorypackages.presentation.application.shared.model.SoloApplicationFormData;
import p356ao.C10114f;
import p357ap.C10127a;
import p413eo.C12748i;
import p511lo.C16630a;
import p511lo.C16631b;
import p511lo.C16632c;
import p511lo.C16637h;
import p511lo.C16638i;
import p525mo.C16815b;
import p553oo.C17289c;
import p596rp.C17713d;
import p610sp.C17913e;
import ue1.C43064a;
import ue1.C43075l;
import ue1.C43079p;

/* renamed from: ge.bog.mobilebank.categorypackages.presentation.application.firststage.FirstStageFragment */
public final class FirstStageFragment extends C14455g {

    /* renamed from: m */
    public static final C14401a f42166m = new C14401a((DefaultConstructorMarker) null);

    /* renamed from: i */
    private C12748i f42167i;

    /* renamed from: j */
    public C14439e.C14445c f42168j;

    /* renamed from: k */
    private final C41217g f42169k;

    /* renamed from: l */
    private final C41217g f42170l = C41219i.m119470b(new C14402b(this));

    /* renamed from: ge.bog.mobilebank.categorypackages.presentation.application.firststage.FirstStageFragment$a */
    public static final class C14401a {
        private C14401a() {
        }

        public /* synthetic */ C14401a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* renamed from: a */
        public final Bundle mo40565a(SoloApplicationFormData soloApplicationFormData) {
            C41536l.m120489i(soloApplicationFormData, "formData");
            return C0908e.m3336b(C41233s.m119492a("EXTRA_APPLICATION_INITIAL_DATA", soloApplicationFormData));
        }
    }

    /* renamed from: ge.bog.mobilebank.categorypackages.presentation.application.firststage.FirstStageFragment$b */
    static final class C14402b extends C41537m implements C43064a {

        /* renamed from: d */
        final /* synthetic */ FirstStageFragment f42171d;

        /* renamed from: ge.bog.mobilebank.categorypackages.presentation.application.firststage.FirstStageFragment$b$a */
        /* synthetic */ class C14403a implements C14424b.C14430f, C41532h {

            /* renamed from: a */
            final /* synthetic */ C16637h f42172a;

            C14403a(C16637h hVar) {
                this.f42172a = hVar;
            }

            public final boolean equals(Object obj) {
                if (!(obj instanceof C14424b.C14430f) || !(obj instanceof C41532h)) {
                    return false;
                }
                return C41536l.m120484d(getFunctionDelegate(), ((C41532h) obj).getFunctionDelegate());
            }

            public final C41212c getFunctionDelegate() {
                return new C41535k(0, this.f42172a, C16637h.class, "onEmailInputClicked", "onEmailInputClicked()V", 0);
            }

            public final int hashCode() {
                return getFunctionDelegate().hashCode();
            }

            public final void invoke() {
                this.f42172a.mo40602Gj();
            }
        }

        /* renamed from: ge.bog.mobilebank.categorypackages.presentation.application.firststage.FirstStageFragment$b$b */
        /* synthetic */ class C14404b implements C14424b.C14429e, C41532h {

            /* renamed from: a */
            final /* synthetic */ C16637h f42173a;

            C14404b(C16637h hVar) {
                this.f42173a = hVar;
            }

            public final boolean equals(Object obj) {
                if (!(obj instanceof C14424b.C14429e) || !(obj instanceof C41532h)) {
                    return false;
                }
                return C41536l.m120484d(getFunctionDelegate(), ((C41532h) obj).getFunctionDelegate());
            }

            public final C41212c getFunctionDelegate() {
                return new C41535k(0, this.f42173a, C16637h.class, "onAddNewEmailClicked", "onAddNewEmailClicked()V", 0);
            }

            public final int hashCode() {
                return getFunctionDelegate().hashCode();
            }

            public final void invoke() {
                this.f42173a.mo40612ro();
            }
        }

        /* renamed from: ge.bog.mobilebank.categorypackages.presentation.application.firststage.FirstStageFragment$b$c */
        /* synthetic */ class C14405c implements C14424b.C14431g, C41532h {

            /* renamed from: a */
            final /* synthetic */ C16637h f42174a;

            C14405c(C16637h hVar) {
                this.f42174a = hVar;
            }

            /* renamed from: a */
            public final void mo40573a(String str) {
                C41536l.m120489i(str, "p0");
                this.f42174a.mo40604I7(str);
            }

            public final boolean equals(Object obj) {
                if (!(obj instanceof C14424b.C14431g) || !(obj instanceof C41532h)) {
                    return false;
                }
                return C41536l.m120484d(getFunctionDelegate(), ((C41532h) obj).getFunctionDelegate());
            }

            public final C41212c getFunctionDelegate() {
                return new C41535k(1, this.f42174a, C16637h.class, "onJobNameInput", "onJobNameInput(Ljava/lang/String;)V", 0);
            }

            public final int hashCode() {
                return getFunctionDelegate().hashCode();
            }
        }

        /* renamed from: ge.bog.mobilebank.categorypackages.presentation.application.firststage.FirstStageFragment$b$d */
        /* synthetic */ class C14406d implements C14424b.C14432h, C41532h {

            /* renamed from: a */
            final /* synthetic */ C16637h f42175a;

            C14406d(C16637h hVar) {
                this.f42175a = hVar;
            }

            /* renamed from: a */
            public final void mo40576a(C17713d dVar) {
                C41536l.m120489i(dVar, "p0");
                this.f42175a.mo40606Xc(dVar);
            }

            public final boolean equals(Object obj) {
                if (!(obj instanceof C14424b.C14432h) || !(obj instanceof C41532h)) {
                    return false;
                }
                return C41536l.m120484d(getFunctionDelegate(), ((C41532h) obj).getFunctionDelegate());
            }

            public final C41212c getFunctionDelegate() {
                return new C41535k(1, this.f42175a, C16637h.class, "onPaymentTypeSelected", "onPaymentTypeSelected(Lge/bog/mobilebank/categorypackages/presentation/shared/model/packagedetails/PaymentFeeUiModel;)V", 0);
            }

            public final int hashCode() {
                return getFunctionDelegate().hashCode();
            }
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C14402b(FirstStageFragment firstStageFragment) {
            super(0);
            this.f42171d = firstStageFragment;
        }

        /* renamed from: b */
        public final C14424b invoke() {
            return new C14424b(new C14403a(this.f42171d.m53367v1().mo40611qw()), new C14404b(this.f42171d.m53367v1().mo40611qw()), new C14405c(this.f42171d.m53367v1().mo40611qw()), new C14406d(this.f42171d.m53367v1().mo40611qw()));
        }
    }

    /* renamed from: ge.bog.mobilebank.categorypackages.presentation.application.firststage.FirstStageFragment$c */
    /* synthetic */ class C14407c extends C41535k implements C43075l {
        C14407c(Object obj) {
            super(1, obj, FirstStageFragment.class, "observeResponse", "observeResponse(Lge/bog/mobilebank/shared/requestedresult/RequestedResult;)V", 0);
        }

        /* renamed from: b */
        public final void mo40579b(C31128a aVar) {
            C41536l.m120489i(aVar, "p0");
            ((FirstStageFragment) this.receiver).m53344B1(aVar);
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            mo40579b((C31128a) obj);
            return C41238w.f97225a;
        }
    }

    /* renamed from: ge.bog.mobilebank.categorypackages.presentation.application.firststage.FirstStageFragment$d */
    /* synthetic */ class C14408d extends C41535k implements C43075l {
        C14408d(Object obj) {
            super(1, obj, FirstStageFragment.class, "openEmailSelectorActionSheet", "openEmailSelectorActionSheet(Ljava/lang/String;)V", 0);
        }

        /* renamed from: b */
        public final void mo40580b(String str) {
            C41536l.m120489i(str, "p0");
            ((FirstStageFragment) this.receiver).m53345C1(str);
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            mo40580b((String) obj);
            return C41238w.f97225a;
        }
    }

    /* renamed from: ge.bog.mobilebank.categorypackages.presentation.application.firststage.FirstStageFragment$e */
    static final class C14409e extends C41537m implements C43075l {

        /* renamed from: d */
        final /* synthetic */ FirstStageFragment f42176d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C14409e(FirstStageFragment firstStageFragment) {
            super(1);
            this.f42176d = firstStageFragment;
        }

        /* renamed from: a */
        public final void mo40581a(C41238w wVar) {
            C41536l.m120489i(wVar, "it");
            this.f42176d.m53350H1();
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            mo40581a((C41238w) obj);
            return C41238w.f97225a;
        }
    }

    /* renamed from: ge.bog.mobilebank.categorypackages.presentation.application.firststage.FirstStageFragment$f */
    /* synthetic */ class C14410f extends C41535k implements C43075l {
        C14410f(Object obj) {
            super(1, obj, FirstStageFragment.class, "startApplicationSecondStage", "startApplicationSecondStage(Lge/bog/mobilebank/categorypackages/presentation/application/shared/model/SoloApplicationFormData;)V", 0);
        }

        /* renamed from: b */
        public final void mo40582b(SoloApplicationFormData soloApplicationFormData) {
            C41536l.m120489i(soloApplicationFormData, "p0");
            ((FirstStageFragment) this.receiver).m53351I1(soloApplicationFormData);
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            mo40582b((SoloApplicationFormData) obj);
            return C41238w.f97225a;
        }
    }

    /* renamed from: ge.bog.mobilebank.categorypackages.presentation.application.firststage.FirstStageFragment$g */
    /* synthetic */ class C14411g extends C41535k implements C43075l {
        C14411g(Object obj) {
            super(1, obj, FirstStageFragment.class, "startPreContract", "startPreContract(Lge/bog/mobilebank/categorypackages/presentation/application/shared/model/SoloApplicationFormData;)V", 0);
        }

        /* renamed from: b */
        public final void mo40583b(SoloApplicationFormData soloApplicationFormData) {
            C41536l.m120489i(soloApplicationFormData, "p0");
            ((FirstStageFragment) this.receiver).m53352J1(soloApplicationFormData);
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            mo40583b((SoloApplicationFormData) obj);
            return C41238w.f97225a;
        }
    }

    /* renamed from: ge.bog.mobilebank.categorypackages.presentation.application.firststage.FirstStageFragment$h */
    /* synthetic */ class C14412h extends C41535k implements C43075l {
        C14412h(Object obj) {
            super(1, obj, FirstStageFragment.class, "submitAdapterData", "submitAdapterData(Ljava/util/List;)V", 0);
        }

        /* renamed from: b */
        public final void mo40584b(List list) {
            C41536l.m120489i(list, "p0");
            ((FirstStageFragment) this.receiver).m53353K1(list);
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            mo40584b((List) obj);
            return C41238w.f97225a;
        }
    }

    /* renamed from: ge.bog.mobilebank.categorypackages.presentation.application.firststage.FirstStageFragment$i */
    static final class C14413i extends C41537m implements C43075l {

        /* renamed from: d */
        final /* synthetic */ FirstStageFragment f42177d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C14413i(FirstStageFragment firstStageFragment) {
            super(1);
            this.f42177d = firstStageFragment;
        }

        /* renamed from: a */
        public final void mo40585a(Object obj) {
            C41536l.m120489i(obj, "it");
            FrameLayout frameLayout = this.f42177d.m53366t1().f37746f;
            C41536l.m120488h(frameLayout, "binding.progressBar");
            C32343x.m95455i0(frameLayout);
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            mo40585a(obj);
            return C41238w.f97225a;
        }
    }

    /* renamed from: ge.bog.mobilebank.categorypackages.presentation.application.firststage.FirstStageFragment$j */
    static final class C14414j extends C41537m implements C43075l {

        /* renamed from: d */
        final /* synthetic */ FirstStageFragment f42178d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C14414j(FirstStageFragment firstStageFragment) {
            super(1);
            this.f42178d = firstStageFragment;
        }

        /* renamed from: a */
        public final void mo40586a(Object obj) {
            FrameLayout frameLayout = this.f42178d.m53366t1().f37746f;
            C41536l.m120488h(frameLayout, "binding.progressBar");
            C32343x.m95447f1(frameLayout);
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            mo40586a(obj);
            return C41238w.f97225a;
        }
    }

    /* renamed from: ge.bog.mobilebank.categorypackages.presentation.application.firststage.FirstStageFragment$k */
    static final class C14415k extends C41537m implements C43079p {

        /* renamed from: d */
        final /* synthetic */ FirstStageFragment f42179d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C14415k(FirstStageFragment firstStageFragment) {
            super(2);
            this.f42179d = firstStageFragment;
        }

        /* renamed from: a */
        public final void mo40587a(Throwable th, Object obj) {
            C41536l.m120489i(th, "<anonymous parameter 0>");
            CardView cardView = this.f42179d.m53366t1().f37749i;
            C41536l.m120488h(cardView, "binding.retryButtonContainer");
            C32343x.m95447f1(cardView);
            FrameLayout frameLayout = this.f42179d.m53366t1().f37746f;
            C41536l.m120488h(frameLayout, "binding.progressBar");
            C32343x.m95455i0(frameLayout);
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            mo40587a((Throwable) obj, obj2);
            return C41238w.f97225a;
        }
    }

    /* renamed from: ge.bog.mobilebank.categorypackages.presentation.application.firststage.FirstStageFragment$l */
    static final class C14416l implements C1645y, C41532h {

        /* renamed from: a */
        private final /* synthetic */ C43075l f42180a;

        C14416l(C43075l lVar) {
            C41536l.m120489i(lVar, "function");
            this.f42180a = lVar;
        }

        public final boolean equals(Object obj) {
            if (!(obj instanceof C1645y) || !(obj instanceof C41532h)) {
                return false;
            }
            return C41536l.m120484d(getFunctionDelegate(), ((C41532h) obj).getFunctionDelegate());
        }

        public final C41212c getFunctionDelegate() {
            return this.f42180a;
        }

        public final int hashCode() {
            return getFunctionDelegate().hashCode();
        }

        public final /* synthetic */ void onChanged(Object obj) {
            this.f42180a.invoke(obj);
        }
    }

    /* renamed from: ge.bog.mobilebank.categorypackages.presentation.application.firststage.FirstStageFragment$m */
    public static final class C14417m extends C41537m implements C43064a {

        /* renamed from: d */
        final /* synthetic */ Fragment f42181d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C14417m(Fragment fragment) {
            super(0);
            this.f42181d = fragment;
        }

        public final Fragment invoke() {
            return this.f42181d;
        }
    }

    /* renamed from: ge.bog.mobilebank.categorypackages.presentation.application.firststage.FirstStageFragment$n */
    public static final class C14418n extends C41537m implements C43064a {

        /* renamed from: d */
        final /* synthetic */ C43064a f42182d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C14418n(C43064a aVar) {
            super(0);
            this.f42182d = aVar;
        }

        public final C1638u0 invoke() {
            return (C1638u0) this.f42182d.invoke();
        }
    }

    /* renamed from: ge.bog.mobilebank.categorypackages.presentation.application.firststage.FirstStageFragment$o */
    public static final class C14419o extends C41537m implements C43064a {

        /* renamed from: d */
        final /* synthetic */ C41217g f42183d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C14419o(C41217g gVar) {
            super(0);
            this.f42183d = gVar;
        }

        public final C1636t0 invoke() {
            C1636t0 viewModelStore = C1514j0.m5375d(this.f42183d).getViewModelStore();
            C41536l.m120488h(viewModelStore, "owner.viewModelStore");
            return viewModelStore;
        }
    }

    /* renamed from: ge.bog.mobilebank.categorypackages.presentation.application.firststage.FirstStageFragment$p */
    public static final class C14420p extends C41537m implements C43064a {

        /* renamed from: d */
        final /* synthetic */ C43064a f42184d;

        /* renamed from: e */
        final /* synthetic */ C41217g f42185e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C14420p(C43064a aVar, C41217g gVar) {
            super(0);
            this.f42184d = aVar;
            this.f42185e = gVar;
        }

        public final C7047a invoke() {
            C7047a aVar;
            C43064a aVar2 = this.f42184d;
            if (aVar2 != null && (aVar = (C7047a) aVar2.invoke()) != null) {
                return aVar;
            }
            C1638u0 a = C1514j0.m5375d(this.f42185e);
            C1591i iVar = a instanceof C1591i ? (C1591i) a : null;
            C7047a defaultViewModelCreationExtras = iVar != null ? iVar.getDefaultViewModelCreationExtras() : null;
            return defaultViewModelCreationExtras == null ? C7047a.C7048a.f20987b : defaultViewModelCreationExtras;
        }
    }

    /* renamed from: ge.bog.mobilebank.categorypackages.presentation.application.firststage.FirstStageFragment$q */
    static final class C14421q extends C41537m implements C43064a {

        /* renamed from: d */
        final /* synthetic */ FirstStageFragment f42186d;

        /* renamed from: ge.bog.mobilebank.categorypackages.presentation.application.firststage.FirstStageFragment$q$a */
        static final class C14422a extends C41537m implements C43064a {

            /* renamed from: d */
            final /* synthetic */ FirstStageFragment f42187d;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            C14422a(FirstStageFragment firstStageFragment) {
                super(0);
                this.f42187d = firstStageFragment;
            }

            /* renamed from: b */
            public final C14439e invoke() {
                SoloApplicationFormData soloApplicationFormData;
                C14439e.C14445c u1 = this.f42187d.mo40564u1();
                Bundle arguments = this.f42187d.getArguments();
                if (arguments != null) {
                    soloApplicationFormData = (SoloApplicationFormData) arguments.getParcelable("EXTRA_APPLICATION_INITIAL_DATA");
                } else {
                    soloApplicationFormData = null;
                }
                C41536l.m120486f(soloApplicationFormData);
                return u1.mo32793a(soloApplicationFormData);
            }
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C14421q(FirstStageFragment firstStageFragment) {
            super(0);
            this.f42186d = firstStageFragment;
        }

        public final C1620q0.C1624b invoke() {
            return C37588a0.f90326a.mo90779a(new C14422a(this.f42186d));
        }
    }

    public FirstStageFragment() {
        C14421q qVar = new C14421q(this);
        C41217g a = C41219i.m119469a(C41222k.NONE, new C14418n(new C14417m(this)));
        this.f42169k = C1514j0.m5374c(this, C41520a0.m120436b(C14439e.class), new C14419o(a), new C14420p((C43064a) null, a), qVar);
    }

    /* renamed from: A1 */
    private final void m53343A1() {
        C16638i rw = m53367v1().mo40613rw();
        C1619q viewLifecycleOwner = getViewLifecycleOwner();
        C41536l.m120488h(viewLifecycleOwner, "viewLifecycleOwner");
        rw.mo40605L().mo4819k(viewLifecycleOwner, new C14416l(new C14407c(this)));
        C37224b.m109963b(rw.mo40609op(), viewLifecycleOwner, new C14408d(this));
        C37224b.m109963b(rw.mo40615vh(), viewLifecycleOwner, new C14409e(this));
        C37224b.m109963b(rw.mo40603H2(), viewLifecycleOwner, new C14410f(this));
        C37224b.m109963b(rw.mo40614v0(), viewLifecycleOwner, new C14411g(this));
        rw.mo40610q().mo4819k(viewLifecycleOwner, new C14416l(new C14412h(this)));
    }

    /* access modifiers changed from: private */
    /* renamed from: B1 */
    public final void m53344B1(C31128a aVar) {
        C31132b.m92648j(aVar, (int[]) null, new C14413i(this), 1, (Object) null);
        C31132b.m92646h(aVar, (int[]) null, new C14414j(this), 1, (Object) null);
        C31132b.m92644f(aVar, (int[]) null, new C14415k(this), 1, (Object) null);
    }

    /* access modifiers changed from: private */
    /* renamed from: C1 */
    public final void m53345C1(String str) {
        m53346D1();
        C16815b.f47096O.mo43941a(str).mo4576A1(getChildFragmentManager(), (String) null);
    }

    /* renamed from: D1 */
    private final void m53346D1() {
        C32290b1.m95111a(requireActivity());
        m53366t1().mo3946b().clearFocus();
    }

    /* renamed from: E1 */
    private final Button m53347E1() {
        C12748i t1 = m53366t1();
        C1505h activity = getActivity();
        C41536l.m120487g(activity, "null cannot be cast to non-null type ge.bog.mobilebank.categorypackages.presentation.CategoryPackagesActivity");
        ((CategoryPackagesActivity) activity).mo86429X1(C32343x.m95388F("packages.application.main.header", new Object[0]));
        t1.f37749i.getRootView().setOnClickListener(new C16631b(this));
        RecyclerView recyclerView = t1.f37747g;
        recyclerView.setAdapter(m53365s1());
        recyclerView.setItemAnimator((RecyclerView.C1742m) null);
        Button button = t1.f37745e.getButton();
        button.setEnabled(false);
        button.setButtonText(C32343x.m95388F("packages.application.I.button.label", new Object[0]));
        button.setOnClickListener(new C16632c(this));
        return button;
    }

    /* access modifiers changed from: private */
    /* renamed from: F1 */
    public static final void m53348F1(FirstStageFragment firstStageFragment, View view) {
        C41536l.m120489i(firstStageFragment, "this$0");
        firstStageFragment.m53367v1().onRefresh(6);
        CardView cardView = firstStageFragment.m53366t1().f37749i;
        C41536l.m120488h(cardView, "binding.retryButtonContainer");
        C32343x.m95455i0(cardView);
    }

    /* access modifiers changed from: private */
    /* renamed from: G1 */
    public static final void m53349G1(FirstStageFragment firstStageFragment, View view) {
        C41536l.m120489i(firstStageFragment, "this$0");
        firstStageFragment.m53367v1().mo40611qw().mo40608g0();
    }

    /* access modifiers changed from: private */
    /* renamed from: H1 */
    public final void m53350H1() {
        new C17289c().mo4576A1(getChildFragmentManager(), (String) null);
    }

    /* access modifiers changed from: private */
    /* renamed from: I1 */
    public final void m53351I1(SoloApplicationFormData soloApplicationFormData) {
        C8034d.m30522a(this).mo22118M(C10114f.action_applicationFirstStageFragment_to_applicationSecondStageFragment, SecondStageFragment.f42355m.mo40768a(soloApplicationFormData));
    }

    /* access modifiers changed from: private */
    /* renamed from: J1 */
    public final void m53352J1(SoloApplicationFormData soloApplicationFormData) {
        C8034d.m30522a(this).mo22118M(C10114f.action_applicationFirstStageFragment_applicationNavigatorFragment, ApplicationNavigatorFragment.f42261B.mo40667a(soloApplicationFormData, true));
    }

    /* access modifiers changed from: private */
    /* renamed from: K1 */
    public final void m53353K1(List list) {
        m53365s1().mo6029i(list);
        m53366t1().f37745e.getButton().setEnabled(m53368x1(list));
    }

    /* renamed from: s1 */
    private final C14424b m53365s1() {
        return (C14424b) this.f42170l.getValue();
    }

    /* access modifiers changed from: private */
    /* renamed from: t1 */
    public final C12748i m53366t1() {
        C12748i iVar = this.f42167i;
        C41536l.m120486f(iVar);
        return iVar;
    }

    /* access modifiers changed from: private */
    /* renamed from: v1 */
    public final C14439e m53367v1() {
        return (C14439e) this.f42169k.getValue();
    }

    /* renamed from: x1 */
    private final boolean m53368x1(List list) {
        Iterator it = list.iterator();
        while (it.hasNext()) {
            C14446f fVar = (C14446f) it.next();
            if ((fVar instanceof C10127a) && !((C10127a) fVar).mo26650b()) {
                return false;
            }
        }
        return true;
    }

    /* renamed from: y1 */
    private final void m53369y1() {
        getChildFragmentManager().mo4367F1("EMAIL_SELECTOR_REQUEST_KEY", getViewLifecycleOwner(), new C16630a(this));
    }

    /* access modifiers changed from: private */
    /* renamed from: z1 */
    public static final void m53370z1(FirstStageFragment firstStageFragment, String str, Bundle bundle) {
        EmailUiModel emailUiModel;
        C41536l.m120489i(firstStageFragment, "this$0");
        C41536l.m120489i(str, "requestKey");
        C41536l.m120489i(bundle, "data");
        if (str.hashCode() == -485656334 && str.equals("EMAIL_SELECTOR_REQUEST_KEY") && (emailUiModel = (EmailUiModel) bundle.getParcelable("EMAIL_RESULT_KEY")) != null) {
            firstStageFragment.m53367v1().mo40611qw().mo40607ca(emailUiModel);
        }
    }

    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        C41536l.m120489i(layoutInflater, "inflater");
        this.f42167i = C12748i.m48387d(layoutInflater, viewGroup, false);
        ConstraintLayout c = m53366t1().mo3946b();
        C41536l.m120488h(c, "binding.root");
        return c;
    }

    public void onDestroyView() {
        this.f42167i = null;
        super.onDestroyView();
    }

    public void onResume() {
        super.onResume();
        C17913e.m61729k(this, false);
    }

    public void onViewCreated(View view, Bundle bundle) {
        C41536l.m120489i(view, "view");
        super.onViewCreated(view, bundle);
        m53343A1();
        m53369y1();
        m53347E1();
    }

    /* renamed from: u1 */
    public final C14439e.C14445c mo40564u1() {
        C14439e.C14445c cVar = this.f42168j;
        if (cVar != null) {
            return cVar;
        }
        C41536l.m120506z("factory");
        return null;
    }
}
