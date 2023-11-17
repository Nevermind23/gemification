package p341ge.bog.mobilebank.categorypackages.presentation.application.navigator;

import android.app.Dialog;
import android.content.Context;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.os.Parcelable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import androidx.activity.result.C0173b;
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
import g91.C32343x;
import hc1.C41143c;
import hc1.C41185v;
import he1.C41217g;
import he1.C41222k;
import he1.C41233s;
import he1.C41238w;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.C41520a0;
import kotlin.jvm.internal.C41535k;
import kotlin.jvm.internal.C41536l;
import kotlin.jvm.internal.C41537m;
import kotlin.jvm.internal.DefaultConstructorMarker;
import m41.C37224b;
import o00.C26656a;
import o00.C26657b;
import o31.C37588a0;
import p00.C27113k;
import p163m0.C7047a;
import p228r0.C8034d;
import p341ge.bog.mobilebank.categorypackages.data.entity.PackageActivationParamsObject;
import p341ge.bog.mobilebank.categorypackages.presentation.application.firststage.FirstStageFragment;
import p341ge.bog.mobilebank.categorypackages.presentation.application.navigator.C14475b;
import p341ge.bog.mobilebank.categorypackages.presentation.application.result.ApplicationResultFragment;
import p341ge.bog.mobilebank.categorypackages.presentation.application.result.model.ApplicationResultData;
import p341ge.bog.mobilebank.categorypackages.presentation.application.secondstage.SecondStageFragment;
import p341ge.bog.mobilebank.categorypackages.presentation.application.shared.model.SoloApplicationFormData;
import p341ge.bog.mobilebank.model.offers.Summary;
import p341ge.bog.mobilebank.p975ui.components.BogProgressBar;
import p356ao.C10114f;
import p356ao.C10117i;
import p371bp.C10349c;
import p413eo.C12750j;
import p420fh.C12902d;
import p420fh.C12910e;
import p595ro.C17683a;
import p595ro.C17684b;
import p595ro.C17687e;
import p610sp.C17913e;
import p745er.C20288a;
import q31.C38122f;
import q31.C38125h;
import ue1.C43064a;
import ue1.C43075l;

/* renamed from: ge.bog.mobilebank.categorypackages.presentation.application.navigator.ApplicationNavigatorFragment */
public final class ApplicationNavigatorFragment extends C14498e implements C26656a, C26657b, C41185v.C41186a {

    /* renamed from: B */
    public static final C14458a f42261B = new C14458a((DefaultConstructorMarker) null);

    /* renamed from: A */
    private final C41217g f42262A;

    /* renamed from: y */
    private C12750j f42263y;

    /* renamed from: z */
    public C14475b.C14477b f42264z;

    /* renamed from: ge.bog.mobilebank.categorypackages.presentation.application.navigator.ApplicationNavigatorFragment$a */
    public static final class C14458a {
        private C14458a() {
        }

        public /* synthetic */ C14458a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* renamed from: b */
        public static /* synthetic */ Bundle m53506b(C14458a aVar, SoloApplicationFormData soloApplicationFormData, boolean z, int i, Object obj) {
            if ((i & 2) != 0) {
                z = false;
            }
            return aVar.mo40667a(soloApplicationFormData, z);
        }

        /* renamed from: a */
        public final Bundle mo40667a(SoloApplicationFormData soloApplicationFormData, boolean z) {
            C41536l.m120489i(soloApplicationFormData, "formData");
            return C0908e.m3336b(C41233s.m119492a("EXTRA_APPLICATION_INITIAL_DATA", soloApplicationFormData), C41233s.m119492a("EXTRA_FOR_PRE_CONTRACT", Boolean.valueOf(z)));
        }
    }

    /* renamed from: ge.bog.mobilebank.categorypackages.presentation.application.navigator.ApplicationNavigatorFragment$b */
    /* synthetic */ class C14459b extends C41535k implements C43075l {
        C14459b(Object obj) {
            super(1, obj, ApplicationNavigatorFragment.class, "onLoading", "onLoading(Z)V", 0);
        }

        /* renamed from: b */
        public final void mo40668b(boolean z) {
            ((ApplicationNavigatorFragment) this.receiver).m53492U1(z);
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            mo40668b(((Boolean) obj).booleanValue());
            return C41238w.f97225a;
        }
    }

    /* renamed from: ge.bog.mobilebank.categorypackages.presentation.application.navigator.ApplicationNavigatorFragment$c */
    /* synthetic */ class C14460c extends C41535k implements C43075l {
        C14460c(Object obj) {
            super(1, obj, ApplicationNavigatorFragment.class, "onError", "onError(Ljava/lang/String;)V", 0);
        }

        /* renamed from: b */
        public final void mo40669b(String str) {
            C41536l.m120489i(str, "p0");
            ((ApplicationNavigatorFragment) this.receiver).m53491T1(str);
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            mo40669b((String) obj);
            return C41238w.f97225a;
        }
    }

    /* renamed from: ge.bog.mobilebank.categorypackages.presentation.application.navigator.ApplicationNavigatorFragment$d */
    /* synthetic */ class C14461d extends C41535k implements C43075l {
        C14461d(Object obj) {
            super(1, obj, ApplicationNavigatorFragment.class, "openPreContract", "openPreContract(Ljava/lang/String;)V", 0);
        }

        /* renamed from: b */
        public final void mo40670b(String str) {
            C41536l.m120489i(str, "p0");
            ((ApplicationNavigatorFragment) this.receiver).m53493V1(str);
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            mo40670b((String) obj);
            return C41238w.f97225a;
        }
    }

    /* renamed from: ge.bog.mobilebank.categorypackages.presentation.application.navigator.ApplicationNavigatorFragment$e */
    /* synthetic */ class C14462e extends C41535k implements C43075l {
        C14462e(Object obj) {
            super(1, obj, ApplicationNavigatorFragment.class, "startFirstStage", "startFirstStage(Lge/bog/mobilebank/categorypackages/presentation/application/shared/model/SoloApplicationFormData;)V", 0);
        }

        /* renamed from: b */
        public final void mo40671b(SoloApplicationFormData soloApplicationFormData) {
            C41536l.m120489i(soloApplicationFormData, "p0");
            ((ApplicationNavigatorFragment) this.receiver).m53498a2(soloApplicationFormData);
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            mo40671b((SoloApplicationFormData) obj);
            return C41238w.f97225a;
        }
    }

    /* renamed from: ge.bog.mobilebank.categorypackages.presentation.application.navigator.ApplicationNavigatorFragment$f */
    /* synthetic */ class C14463f extends C41535k implements C43075l {
        C14463f(Object obj) {
            super(1, obj, ApplicationNavigatorFragment.class, "startSecondStage", "startSecondStage(Lge/bog/mobilebank/categorypackages/presentation/application/shared/model/SoloApplicationFormData;)V", 0);
        }

        /* renamed from: b */
        public final void mo40672b(SoloApplicationFormData soloApplicationFormData) {
            C41536l.m120489i(soloApplicationFormData, "p0");
            ((ApplicationNavigatorFragment) this.receiver).m53499b2(soloApplicationFormData);
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            mo40672b((SoloApplicationFormData) obj);
            return C41238w.f97225a;
        }
    }

    /* renamed from: ge.bog.mobilebank.categorypackages.presentation.application.navigator.ApplicationNavigatorFragment$g */
    /* synthetic */ class C14464g extends C41535k implements C43075l {
        C14464g(Object obj) {
            super(1, obj, ApplicationNavigatorFragment.class, "openSoloUsageTermsActionSheet", "openSoloUsageTermsActionSheet(Ljava/lang/String;)V", 0);
        }

        /* renamed from: b */
        public final void mo40673b(String str) {
            C41536l.m120489i(str, "p0");
            ((ApplicationNavigatorFragment) this.receiver).m53495X1(str);
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            mo40673b((String) obj);
            return C41238w.f97225a;
        }
    }

    /* renamed from: ge.bog.mobilebank.categorypackages.presentation.application.navigator.ApplicationNavigatorFragment$h */
    /* synthetic */ class C14465h extends C41535k implements C43075l {
        C14465h(Object obj) {
            super(1, obj, ApplicationNavigatorFragment.class, "openResultScreen", "openResultScreen(Lge/bog/mobilebank/categorypackages/presentation/application/result/model/ApplicationResultData;)V", 0);
        }

        /* renamed from: b */
        public final void mo40674b(ApplicationResultData applicationResultData) {
            C41536l.m120489i(applicationResultData, "p0");
            ((ApplicationNavigatorFragment) this.receiver).m53494W1(applicationResultData);
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            mo40674b((ApplicationResultData) obj);
            return C41238w.f97225a;
        }
    }

    /* renamed from: ge.bog.mobilebank.categorypackages.presentation.application.navigator.ApplicationNavigatorFragment$i */
    /* synthetic */ class C14466i extends C41535k implements C43075l {
        C14466i(Object obj) {
            super(1, obj, ApplicationNavigatorFragment.class, "showSca", "showSca(Lge/bog/mobilebank/categorypackages/data/entity/PackageActivationParamsObject;)V", 0);
        }

        /* renamed from: b */
        public final void mo40675b(PackageActivationParamsObject packageActivationParamsObject) {
            C41536l.m120489i(packageActivationParamsObject, "p0");
            ((ApplicationNavigatorFragment) this.receiver).m53496Y1(packageActivationParamsObject);
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            mo40675b((PackageActivationParamsObject) obj);
            return C41238w.f97225a;
        }
    }

    /* renamed from: ge.bog.mobilebank.categorypackages.presentation.application.navigator.ApplicationNavigatorFragment$j */
    /* synthetic */ class C14467j extends C41535k implements C43075l {
        C14467j(Object obj) {
            super(1, obj, ApplicationNavigatorFragment.class, "startCardOrderList", "startCardOrderList(Ljava/util/List;)V", 0);
        }

        /* renamed from: b */
        public final void mo40676b(List list) {
            C41536l.m120489i(list, "p0");
            ((ApplicationNavigatorFragment) this.receiver).m53497Z1(list);
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            mo40676b((List) obj);
            return C41238w.f97225a;
        }
    }

    /* renamed from: ge.bog.mobilebank.categorypackages.presentation.application.navigator.ApplicationNavigatorFragment$k */
    public static final class C14468k extends C41537m implements C43064a {

        /* renamed from: d */
        final /* synthetic */ Fragment f42265d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C14468k(Fragment fragment) {
            super(0);
            this.f42265d = fragment;
        }

        public final Fragment invoke() {
            return this.f42265d;
        }
    }

    /* renamed from: ge.bog.mobilebank.categorypackages.presentation.application.navigator.ApplicationNavigatorFragment$l */
    public static final class C14469l extends C41537m implements C43064a {

        /* renamed from: d */
        final /* synthetic */ C43064a f42266d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C14469l(C43064a aVar) {
            super(0);
            this.f42266d = aVar;
        }

        public final C1638u0 invoke() {
            return (C1638u0) this.f42266d.invoke();
        }
    }

    /* renamed from: ge.bog.mobilebank.categorypackages.presentation.application.navigator.ApplicationNavigatorFragment$m */
    public static final class C14470m extends C41537m implements C43064a {

        /* renamed from: d */
        final /* synthetic */ C41217g f42267d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C14470m(C41217g gVar) {
            super(0);
            this.f42267d = gVar;
        }

        public final C1636t0 invoke() {
            C1636t0 viewModelStore = C1514j0.m5375d(this.f42267d).getViewModelStore();
            C41536l.m120488h(viewModelStore, "owner.viewModelStore");
            return viewModelStore;
        }
    }

    /* renamed from: ge.bog.mobilebank.categorypackages.presentation.application.navigator.ApplicationNavigatorFragment$n */
    public static final class C14471n extends C41537m implements C43064a {

        /* renamed from: d */
        final /* synthetic */ C43064a f42268d;

        /* renamed from: e */
        final /* synthetic */ C41217g f42269e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C14471n(C43064a aVar, C41217g gVar) {
            super(0);
            this.f42268d = aVar;
            this.f42269e = gVar;
        }

        public final C7047a invoke() {
            C7047a aVar;
            C43064a aVar2 = this.f42268d;
            if (aVar2 != null && (aVar = (C7047a) aVar2.invoke()) != null) {
                return aVar;
            }
            C1638u0 a = C1514j0.m5375d(this.f42269e);
            C1591i iVar = a instanceof C1591i ? (C1591i) a : null;
            C7047a defaultViewModelCreationExtras = iVar != null ? iVar.getDefaultViewModelCreationExtras() : null;
            return defaultViewModelCreationExtras == null ? C7047a.C7048a.f20987b : defaultViewModelCreationExtras;
        }
    }

    /* renamed from: ge.bog.mobilebank.categorypackages.presentation.application.navigator.ApplicationNavigatorFragment$o */
    static final class C14472o extends C41537m implements C43064a {

        /* renamed from: d */
        final /* synthetic */ ApplicationNavigatorFragment f42270d;

        /* renamed from: ge.bog.mobilebank.categorypackages.presentation.application.navigator.ApplicationNavigatorFragment$o$a */
        static final class C14473a extends C41537m implements C43064a {

            /* renamed from: d */
            final /* synthetic */ ApplicationNavigatorFragment f42271d;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            C14473a(ApplicationNavigatorFragment applicationNavigatorFragment) {
                super(0);
                this.f42271d = applicationNavigatorFragment;
            }

            /* renamed from: b */
            public final C14475b invoke() {
                C14475b.C14477b N1 = this.f42271d.mo40666N1();
                Parcelable parcelable = this.f42271d.requireArguments().getParcelable("EXTRA_APPLICATION_INITIAL_DATA");
                C41536l.m120486f(parcelable);
                return N1.mo32783a((SoloApplicationFormData) parcelable, this.f42271d.requireArguments().getBoolean("EXTRA_FOR_PRE_CONTRACT"));
            }
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C14472o(ApplicationNavigatorFragment applicationNavigatorFragment) {
            super(0);
            this.f42270d = applicationNavigatorFragment;
        }

        public final C1620q0.C1624b invoke() {
            return C37588a0.f90326a.mo90779a(new C14473a(this.f42270d));
        }
    }

    public ApplicationNavigatorFragment() {
        C14472o oVar = new C14472o(this);
        C41217g a = C41219i.m119469a(C41222k.NONE, new C14469l(new C14468k(this)));
        this.f42262A = C1514j0.m5374c(this, C41520a0.m120436b(C14475b.class), new C14470m(a), new C14471n((C43064a) null, a), oVar);
    }

    /* renamed from: M1 */
    private final C12750j m53485M1() {
        C12750j jVar = this.f42263y;
        C41536l.m120486f(jVar);
        return jVar;
    }

    /* renamed from: O1 */
    private final C14475b m53486O1() {
        return (C14475b) this.f42262A.getValue();
    }

    /* renamed from: P1 */
    private final void m53487P1() {
        getChildFragmentManager().mo4367F1("ApplicationTermsActionSheet.REQUEST_KEY", getViewLifecycleOwner(), new C17683a(this));
        getChildFragmentManager().mo4367F1("ScaVerificationDialogFragment.CLOSE", getViewLifecycleOwner(), new C17684b(this));
    }

    /* access modifiers changed from: private */
    /* renamed from: Q1 */
    public static final void m53488Q1(ApplicationNavigatorFragment applicationNavigatorFragment, String str, Bundle bundle) {
        C41536l.m120489i(applicationNavigatorFragment, "this$0");
        C41536l.m120489i(str, "requestKey");
        C41536l.m120489i(bundle, "bundle");
        if (str.hashCode() != -742124909 || !str.equals("ApplicationTermsActionSheet.REQUEST_KEY")) {
            return;
        }
        if (bundle.getBoolean("ApplicationTermsActionSheet.REQUEST_KEY", false)) {
            applicationNavigatorFragment.m53486O1().mo40679Cw().mo40690kb();
            return;
        }
        C8034d.m30522a(applicationNavigatorFragment).mo22123U();
        C17913e.m61728j(applicationNavigatorFragment, true);
    }

    /* access modifiers changed from: private */
    /* renamed from: R1 */
    public static final void m53489R1(ApplicationNavigatorFragment applicationNavigatorFragment, String str, Bundle bundle) {
        C41536l.m120489i(applicationNavigatorFragment, "this$0");
        C41536l.m120489i(str, "requestKey");
        C41536l.m120489i(bundle, "<anonymous parameter 1>");
        if (str.hashCode() == 502912750 && str.equals("ScaVerificationDialogFragment.CLOSE")) {
            C8034d.m30522a(applicationNavigatorFragment).mo22123U();
        }
    }

    /* renamed from: S1 */
    private final void m53490S1() {
        C17687e Ew = m53486O1().mo40681Ew();
        C1619q viewLifecycleOwner = getViewLifecycleOwner();
        C41536l.m120488h(viewLifecycleOwner, "viewLifecycleOwner");
        C37224b.m109963b(Ew.mo40686e(), viewLifecycleOwner, new C14459b(this));
        C37224b.m109963b(Ew.mo40691x0(), viewLifecycleOwner, new C14460c(this));
        C37224b.m109963b(Ew.mo40689k(), viewLifecycleOwner, new C14461d(this));
        C37224b.m109963b(Ew.mo40692xm(), viewLifecycleOwner, new C14462e(this));
        C37224b.m109963b(Ew.mo40682H2(), viewLifecycleOwner, new C14463f(this));
        C37224b.m109963b(Ew.mo40687es(), viewLifecycleOwner, new C14464g(this));
        C37224b.m109963b(Ew.mo40684Sk(), viewLifecycleOwner, new C14465h(this));
        C37224b.m109963b(Ew.mo40688i3(), viewLifecycleOwner, new C14466i(this));
        C37224b.m109963b(Ew.mo40678Bo(), viewLifecycleOwner, new C14467j(this));
    }

    /* access modifiers changed from: private */
    /* renamed from: T1 */
    public final void m53491T1(String str) {
        boolean z;
        C1505h activity = getActivity();
        if (activity != null) {
            if (str.length() == 0) {
                z = true;
            } else {
                z = false;
            }
            if (z) {
                str = getString(C10117i.f27979a);
                C41536l.m120488h(str, "getString(R.string.error_data_general)");
            }
            C12910e.m48790h(activity, str, (C12902d.C12905b) null, false, 6, (Object) null);
        }
        C8034d.m30522a(this).mo22123U();
    }

    /* access modifiers changed from: private */
    /* renamed from: U1 */
    public final void m53492U1(boolean z) {
        FragmentManager childFragmentManager = getChildFragmentManager();
        C41536l.m120488h(childFragmentManager, "childFragmentManager");
        C41185v f = C20288a.m66331f(childFragmentManager, (String) null, 2, (Object) null);
        if (f != null) {
            f.mo95635L2(z);
        }
        BogProgressBar bogProgressBar = m53485M1().f37758e;
        C41536l.m120488h(bogProgressBar, "binding.progressBar");
        C32343x.m95483r1(bogProgressBar, z, false, 2, (Object) null);
    }

    /* access modifiers changed from: private */
    /* renamed from: V1 */
    public final void m53493V1(String str) {
        C27113k.C27114a aVar = C27113k.f68083P;
        String F = C32343x.m95388F("packages.application.accept.terms.header", new Object[0]);
        C27113k c = C27113k.C27114a.m84066c(aVar, str, false, C32343x.m95388F("packages.application.accept.terms.button.label", new Object[0]), (ArrayList) null, (Summary) null, F, 24, (Object) null);
        FragmentManager childFragmentManager = getChildFragmentManager();
        C41536l.m120488h(childFragmentManager, "childFragmentManager");
        c.mo4576A1(childFragmentManager, (String) null);
    }

    /* access modifiers changed from: private */
    /* renamed from: W1 */
    public final void m53494W1(ApplicationResultData applicationResultData) {
        C8034d.m30522a(this).mo22118M(C10114f.action_applicationNavigatorFragment_to_applicationResultScreenFragment, ApplicationResultFragment.f42324j.mo40715a(applicationResultData));
        FragmentManager childFragmentManager = getChildFragmentManager();
        C41536l.m120488h(childFragmentManager, "childFragmentManager");
        C27113k c = C20288a.m66328c(childFragmentManager, (String) null, 2, (Object) null);
        if (c != null) {
            c.mo4577k1();
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: X1 */
    public final void m53495X1(String str) {
        C10349c.f29526O.mo26981a(str).mo4576A1(getChildFragmentManager(), (String) null);
    }

    /* access modifiers changed from: private */
    /* renamed from: Y1 */
    public final void m53496Y1(PackageActivationParamsObject packageActivationParamsObject) {
        C41185v e = C41185v.C41187b.m119423e(C41185v.f97155C, packageActivationParamsObject.getServiceId(), m53486O1().mo40680Dw(packageActivationParamsObject), (C41143c) null, 4, (Object) null);
        FragmentManager childFragmentManager = getChildFragmentManager();
        C41536l.m120488h(childFragmentManager, "childFragmentManager");
        e.mo4576A1(childFragmentManager, (String) null);
        FragmentManager childFragmentManager2 = getChildFragmentManager();
        C41536l.m120488h(childFragmentManager2, "childFragmentManager");
        C27113k c = C20288a.m66328c(childFragmentManager2, (String) null, 2, (Object) null);
        if (c != null) {
            c.mo4577k1();
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: Z1 */
    public final void m53497Z1(List list) {
        Context requireContext = requireContext();
        C41536l.m120488h(requireContext, "requireContext()");
        C38122f c = C38125h.m112238c(requireContext);
        Context requireContext2 = requireContext();
        C41536l.m120488h(requireContext2, "requireContext()");
        c.mo91571Q0(requireContext2, (C0173b) null, (String) null, list);
        C1505h activity = getActivity();
        if (activity != null) {
            activity.finish();
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: a2 */
    public final void m53498a2(SoloApplicationFormData soloApplicationFormData) {
        C8034d.m30522a(this).mo22118M(C10114f.action_applicationNavigatorFragment_to_applicationFirstStageFragment, FirstStageFragment.f42166m.mo40565a(soloApplicationFormData));
    }

    /* access modifiers changed from: private */
    /* renamed from: b2 */
    public final void m53499b2(SoloApplicationFormData soloApplicationFormData) {
        C8034d.m30522a(this).mo22118M(C10114f.action_applicationNavigatorFragment_to_applicationSecondStageFragment, SecondStageFragment.f42355m.mo40768a(soloApplicationFormData));
    }

    /* renamed from: C */
    public void mo39136C() {
        C8034d.m30522a(this).mo22123U();
    }

    /* renamed from: N1 */
    public final C14475b.C14477b mo40666N1() {
        C14475b.C14477b bVar = this.f42264z;
        if (bVar != null) {
            return bVar;
        }
        C41536l.m120506z("factory");
        return null;
    }

    /* renamed from: O */
    public void mo37615O(String str, String str2, String str3, String str4) {
        C41536l.m120489i(str, "operationId");
        C41536l.m120489i(str2, "operationReference");
        C41536l.m120489i(str3, "scaAuthCode");
        m53486O1().mo40679Cw().mo40683O(str, str2, str3, str4);
        FragmentManager childFragmentManager = getChildFragmentManager();
        C41536l.m120488h(childFragmentManager, "childFragmentManager");
        C41185v f = C20288a.m66331f(childFragmentManager, (String) null, 2, (Object) null);
        if (f != null) {
            f.mo4577k1();
        }
    }

    /* renamed from: R */
    public void mo37616R(String str, String str2) {
        C41536l.m120489i(str, "message");
        m53491T1(str);
    }

    /* renamed from: S */
    public void mo37617S(boolean z) {
    }

    /* renamed from: m */
    public void mo39137m() {
        m53486O1().mo40679Cw().mo40685de();
        FragmentManager childFragmentManager = getChildFragmentManager();
        C41536l.m120488h(childFragmentManager, "childFragmentManager");
        C27113k c = C20288a.m66328c(childFragmentManager, (String) null, 2, (Object) null);
        if (c != null) {
            c.mo66414v2(true);
        }
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        mo4586v1(false);
    }

    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        Window window;
        Window window2;
        C41536l.m120489i(layoutInflater, "inflater");
        this.f42263y = C12750j.m48395d(layoutInflater, viewGroup, false);
        Dialog n1 = mo4579n1();
        if (!(n1 == null || (window2 = n1.getWindow()) == null)) {
            window2.setBackgroundDrawable(new ColorDrawable(0));
        }
        Dialog n12 = mo4579n1();
        if (!(n12 == null || (window = n12.getWindow()) == null)) {
            window.setDimAmount(0.1f);
        }
        ConstraintLayout c = m53485M1().mo3946b();
        C41536l.m120488h(c, "binding.root");
        return c;
    }

    public void onDestroyView() {
        this.f42263y = null;
        super.onDestroyView();
    }

    public void onViewCreated(View view, Bundle bundle) {
        C41536l.m120489i(view, "view");
        super.onViewCreated(view, bundle);
        C17913e.m61728j(this, false);
        m53490S1();
        m53487P1();
    }
}
