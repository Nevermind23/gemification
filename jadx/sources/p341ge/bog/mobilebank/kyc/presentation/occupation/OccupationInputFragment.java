package p341ge.bog.mobilebank.kyc.presentation.occupation;

import an0.C10105a;
import an0.C10106b;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.fragment.app.C1514j0;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.C1591i;
import androidx.lifecycle.C1620q0;
import androidx.lifecycle.C1636t0;
import androidx.lifecycle.C1638u0;
import androidx.lifecycle.C1645y;
import en0.C12719e;
import g91.C32343x;
import he1.C41212c;
import he1.C41217g;
import he1.C41222k;
import he1.C41238w;
import kotlin.jvm.internal.C41520a0;
import kotlin.jvm.internal.C41532h;
import kotlin.jvm.internal.C41536l;
import kotlin.jvm.internal.C41537m;
import kotlin.jvm.internal.DefaultConstructorMarker;
import ln0.C16629w;
import nn0.C17111a;
import nn0.C17118h;
import nn0.C17131s;
import p163m0.C7047a;
import p228r0.C8034d;
import p341ge.bog.designsystem.components.list.C13364a;
import p341ge.bog.mobilebank.kyc.presentation.incomeproperty.IncomeSourceSelectorFragment;
import ue1.C43064a;
import ue1.C43075l;

/* renamed from: ge.bog.mobilebank.kyc.presentation.occupation.OccupationInputFragment */
public final class OccupationInputFragment extends C14905a {

    /* renamed from: k */
    public static final C14887a f43009k = new C14887a((DefaultConstructorMarker) null);

    /* renamed from: i */
    private final C41217g f43010i;

    /* renamed from: j */
    private C12719e f43011j;

    /* renamed from: ge.bog.mobilebank.kyc.presentation.occupation.OccupationInputFragment$a */
    public static final class C14887a {
        private C14887a() {
        }

        public /* synthetic */ C14887a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    /* renamed from: ge.bog.mobilebank.kyc.presentation.occupation.OccupationInputFragment$b */
    static final class C14888b extends C41537m implements C43075l {

        /* renamed from: d */
        final /* synthetic */ OccupationInputFragment f43012d;

        /* renamed from: e */
        final /* synthetic */ C17118h f43013e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C14888b(OccupationInputFragment occupationInputFragment, C17118h hVar) {
            super(1);
            this.f43012d = occupationInputFragment;
            this.f43013e = hVar;
        }

        /* renamed from: a */
        public final void mo41537a(C17131s sVar) {
            this.f43012d.m54669k1().f37634e.getButton().setEnabled(sVar.mo44547f());
            this.f43013e.mo44533E(sVar.mo44543c(), sVar.mo44542b(), sVar.mo44544d(), sVar.mo44541a(), sVar.mo44545e());
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            mo41537a((C17131s) obj);
            return C41238w.f97225a;
        }
    }

    /* renamed from: ge.bog.mobilebank.kyc.presentation.occupation.OccupationInputFragment$c */
    static final class C14889c extends C41537m implements C43075l {

        /* renamed from: d */
        final /* synthetic */ OccupationInputFragment f43014d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C14889c(OccupationInputFragment occupationInputFragment) {
            super(1);
            this.f43014d = occupationInputFragment;
        }

        /* renamed from: a */
        public final void mo41538a(int i) {
            this.f43014d.m54670l1().mo41551ow().mo41546M9(i);
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            mo41538a(((Number) obj).intValue());
            return C41238w.f97225a;
        }
    }

    /* renamed from: ge.bog.mobilebank.kyc.presentation.occupation.OccupationInputFragment$d */
    static final class C14890d extends C41537m implements C43075l {

        /* renamed from: d */
        final /* synthetic */ OccupationInputFragment f43015d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C14890d(OccupationInputFragment occupationInputFragment) {
            super(1);
            this.f43015d = occupationInputFragment;
        }

        /* renamed from: a */
        public final void mo41539a(String str) {
            C41536l.m120489i(str, "it");
            this.f43015d.m54670l1().mo41553v2(str);
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            mo41539a((String) obj);
            return C41238w.f97225a;
        }
    }

    /* renamed from: ge.bog.mobilebank.kyc.presentation.occupation.OccupationInputFragment$e */
    static final class C14891e extends C41537m implements C43075l {

        /* renamed from: d */
        final /* synthetic */ OccupationInputFragment f43016d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C14891e(OccupationInputFragment occupationInputFragment) {
            super(1);
            this.f43016d = occupationInputFragment;
        }

        /* renamed from: a */
        public final void mo41540a(String str) {
            C41536l.m120489i(str, "it");
            this.f43016d.m54670l1().mo41548Yk(str);
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            mo41540a((String) obj);
            return C41238w.f97225a;
        }
    }

    /* renamed from: ge.bog.mobilebank.kyc.presentation.occupation.OccupationInputFragment$f */
    static final class C14892f extends C41537m implements C43064a {

        /* renamed from: d */
        final /* synthetic */ OccupationInputFragment f43017d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C14892f(OccupationInputFragment occupationInputFragment) {
            super(0);
            this.f43017d = occupationInputFragment;
        }

        public final void invoke() {
            C8034d.m30522a(this.f43017d).mo22117L(C10106b.action_occupationInputFragment_to_jobPositionSelectorActionSheet);
        }
    }

    /* renamed from: ge.bog.mobilebank.kyc.presentation.occupation.OccupationInputFragment$g */
    static final class C14893g implements C1645y, C41532h {

        /* renamed from: a */
        private final /* synthetic */ C43075l f43018a;

        C14893g(C43075l lVar) {
            C41536l.m120489i(lVar, "function");
            this.f43018a = lVar;
        }

        public final boolean equals(Object obj) {
            if (!(obj instanceof C1645y) || !(obj instanceof C41532h)) {
                return false;
            }
            return C41536l.m120484d(getFunctionDelegate(), ((C41532h) obj).getFunctionDelegate());
        }

        public final C41212c getFunctionDelegate() {
            return this.f43018a;
        }

        public final int hashCode() {
            return getFunctionDelegate().hashCode();
        }

        public final /* synthetic */ void onChanged(Object obj) {
            this.f43018a.invoke(obj);
        }
    }

    /* renamed from: ge.bog.mobilebank.kyc.presentation.occupation.OccupationInputFragment$h */
    public static final class C14894h extends C41537m implements C43064a {

        /* renamed from: d */
        final /* synthetic */ Fragment f43019d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C14894h(Fragment fragment) {
            super(0);
            this.f43019d = fragment;
        }

        public final Fragment invoke() {
            return this.f43019d;
        }
    }

    /* renamed from: ge.bog.mobilebank.kyc.presentation.occupation.OccupationInputFragment$i */
    public static final class C14895i extends C41537m implements C43064a {

        /* renamed from: d */
        final /* synthetic */ C43064a f43020d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C14895i(C43064a aVar) {
            super(0);
            this.f43020d = aVar;
        }

        public final C1638u0 invoke() {
            return (C1638u0) this.f43020d.invoke();
        }
    }

    /* renamed from: ge.bog.mobilebank.kyc.presentation.occupation.OccupationInputFragment$j */
    public static final class C14896j extends C41537m implements C43064a {

        /* renamed from: d */
        final /* synthetic */ C41217g f43021d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C14896j(C41217g gVar) {
            super(0);
            this.f43021d = gVar;
        }

        public final C1636t0 invoke() {
            C1636t0 viewModelStore = C1514j0.m5375d(this.f43021d).getViewModelStore();
            C41536l.m120488h(viewModelStore, "owner.viewModelStore");
            return viewModelStore;
        }
    }

    /* renamed from: ge.bog.mobilebank.kyc.presentation.occupation.OccupationInputFragment$k */
    public static final class C14897k extends C41537m implements C43064a {

        /* renamed from: d */
        final /* synthetic */ C43064a f43022d;

        /* renamed from: e */
        final /* synthetic */ C41217g f43023e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C14897k(C43064a aVar, C41217g gVar) {
            super(0);
            this.f43022d = aVar;
            this.f43023e = gVar;
        }

        public final C7047a invoke() {
            C7047a aVar;
            C43064a aVar2 = this.f43022d;
            if (aVar2 != null && (aVar = (C7047a) aVar2.invoke()) != null) {
                return aVar;
            }
            C1638u0 a = C1514j0.m5375d(this.f43023e);
            C1591i iVar = a instanceof C1591i ? (C1591i) a : null;
            C7047a defaultViewModelCreationExtras = iVar != null ? iVar.getDefaultViewModelCreationExtras() : null;
            return defaultViewModelCreationExtras == null ? C7047a.C7048a.f20987b : defaultViewModelCreationExtras;
        }
    }

    /* renamed from: ge.bog.mobilebank.kyc.presentation.occupation.OccupationInputFragment$l */
    public static final class C14898l extends C41537m implements C43064a {

        /* renamed from: d */
        final /* synthetic */ Fragment f43024d;

        /* renamed from: e */
        final /* synthetic */ C41217g f43025e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C14898l(Fragment fragment, C41217g gVar) {
            super(0);
            this.f43024d = fragment;
            this.f43025e = gVar;
        }

        public final C1620q0.C1624b invoke() {
            C1620q0.C1624b bVar;
            C1638u0 a = C1514j0.m5375d(this.f43025e);
            C1591i iVar = a instanceof C1591i ? (C1591i) a : null;
            if (iVar == null || (bVar = iVar.getDefaultViewModelProviderFactory()) == null) {
                bVar = this.f43024d.getDefaultViewModelProviderFactory();
            }
            C41536l.m120488h(bVar, "(owner as? HasDefaultVie…tViewModelProviderFactory");
            return bVar;
        }
    }

    public OccupationInputFragment() {
        C41217g a = C41219i.m119469a(C41222k.NONE, new C14895i(new C14894h(this)));
        this.f43010i = C1514j0.m5374c(this, C41520a0.m120436b(OccupationInputViewModel$ViewModel.class), new C14896j(a), new C14897k((C43064a) null, a), new C14898l(this, a));
    }

    /* access modifiers changed from: private */
    /* renamed from: k1 */
    public final C12719e m54669k1() {
        C12719e eVar = this.f43011j;
        C41536l.m120486f(eVar);
        return eVar;
    }

    /* access modifiers changed from: private */
    /* renamed from: l1 */
    public final OccupationInputViewModel$ViewModel m54670l1() {
        return (OccupationInputViewModel$ViewModel) this.f43010i.getValue();
    }

    /* access modifiers changed from: private */
    /* renamed from: m1 */
    public static final void m54671m1(OccupationInputFragment occupationInputFragment, View view) {
        C41536l.m120489i(occupationInputFragment, "this$0");
        C8034d.m30522a(occupationInputFragment).mo22118M(C10106b.action_occupationInputFragment_to_incomeSourceSelectorFragment, IncomeSourceSelectorFragment.f42926m.mo41471a(C16629w.PROPERTY));
    }

    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        C41536l.m120489i(layoutInflater, "inflater");
        this.f43011j = C12719e.m48270d(layoutInflater, viewGroup, false);
        LinearLayout c = m54669k1().mo3946b();
        C41536l.m120488h(c, "binding.root");
        return c;
    }

    public void onDestroyView() {
        super.onDestroyView();
        this.f43011j = null;
    }

    public void onViewCreated(View view, Bundle bundle) {
        C41536l.m120489i(view, "view");
        C17118h hVar = new C17118h(new C14889c(this), new C14890d(this), new C14891e(this), new C14892f(this));
        m54669k1().f37635f.setText(C32343x.m95388F("rbc.kyc.survey.select.activity.type", new Object[0]));
        m54669k1().f37636g.setAdapter(hVar);
        m54669k1().f37636g.mo5351j(new C13364a(requireContext().getDrawable(C10105a.f27870a), true, false));
        m54669k1().f37634e.getButton().setOnClickListener(new C17111a(this));
        m54670l1().mo41552pw().mo41549b().mo4819k(getViewLifecycleOwner(), new C14893g(new C14888b(this, hVar)));
    }
}
