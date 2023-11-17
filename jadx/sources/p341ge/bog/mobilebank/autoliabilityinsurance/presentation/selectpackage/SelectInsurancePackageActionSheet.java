package p341ge.bog.mobilebank.autoliabilityinsurance.presentation.selectpackage;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.core.content.C0767a;
import androidx.fragment.app.C1514j0;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.C1591i;
import androidx.lifecycle.C1620q0;
import androidx.lifecycle.C1636t0;
import androidx.lifecycle.C1638u0;
import androidx.lifecycle.C1645y;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.flexbox.C3793d;
import com.google.android.flexbox.FlexboxLayoutManager;
import g91.C32343x;
import he1.C41212c;
import he1.C41217g;
import he1.C41222k;
import he1.C41238w;
import kotlin.jvm.internal.C41520a0;
import kotlin.jvm.internal.C41532h;
import kotlin.jvm.internal.C41536l;
import kotlin.jvm.internal.C41537m;
import p163m0.C7047a;
import p228r0.C8034d;
import p341ge.bog.designsystem.components.actionsheet.ActionSheetTitle;
import p380ck.C10464h;
import p438gl.C15291a;
import p438gl.C15293c;
import p438gl.C15295e;
import p451hk.C15525c;
import p451hk.C15526d;
import p451hk.C15529g;
import p452hl.C15531b;
import p493kk.C16451e;
import ue1.C43064a;
import ue1.C43075l;

/* renamed from: ge.bog.mobilebank.autoliabilityinsurance.presentation.selectpackage.SelectInsurancePackageActionSheet */
public final class SelectInsurancePackageActionSheet extends C15291a {

    /* renamed from: G */
    private C16451e f40969G;

    /* renamed from: H */
    private final C41217g f40970H;
    /* access modifiers changed from: private */

    /* renamed from: I */
    public String f40971I = "";

    /* renamed from: ge.bog.mobilebank.autoliabilityinsurance.presentation.selectpackage.SelectInsurancePackageActionSheet$a */
    static final class C13745a extends C41537m implements C43075l {

        /* renamed from: d */
        final /* synthetic */ SelectInsurancePackageActionSheet f40972d;

        /* renamed from: e */
        final /* synthetic */ C15531b f40973e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C13745a(SelectInsurancePackageActionSheet selectInsurancePackageActionSheet, C15531b bVar) {
            super(1);
            this.f40972d = selectInsurancePackageActionSheet;
            this.f40973e = bVar;
        }

        /* renamed from: a */
        public final void mo37646a(C15295e eVar) {
            this.f40972d.f40971I = eVar.mo42384e();
            this.f40973e.mo42644k(eVar.mo42383d());
            this.f40972d.m51366i2().f46471g.setImageUrl(eVar.mo42382c());
            this.f40972d.m51366i2().f46471g.setTitle(eVar.mo42386f());
            this.f40972d.m51366i2().f46469e.getButton().setEnabled(eVar.mo42387g());
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            mo37646a((C15295e) obj);
            return C41238w.f97225a;
        }
    }

    /* renamed from: ge.bog.mobilebank.autoliabilityinsurance.presentation.selectpackage.SelectInsurancePackageActionSheet$b */
    static final class C13746b extends C41537m implements C43075l {

        /* renamed from: d */
        final /* synthetic */ SelectInsurancePackageActionSheet f40974d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C13746b(SelectInsurancePackageActionSheet selectInsurancePackageActionSheet) {
            super(1);
            this.f40974d = selectInsurancePackageActionSheet;
        }

        /* renamed from: a */
        public final void mo37647a(int i) {
            this.f40974d.m51367j2().mo37650hw().mo37654z0(i);
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            mo37647a(((Number) obj).intValue());
            return C41238w.f97225a;
        }
    }

    /* renamed from: ge.bog.mobilebank.autoliabilityinsurance.presentation.selectpackage.SelectInsurancePackageActionSheet$c */
    static final class C13747c implements C1645y, C41532h {

        /* renamed from: a */
        private final /* synthetic */ C43075l f40975a;

        C13747c(C43075l lVar) {
            C41536l.m120489i(lVar, "function");
            this.f40975a = lVar;
        }

        public final boolean equals(Object obj) {
            if (!(obj instanceof C1645y) || !(obj instanceof C41532h)) {
                return false;
            }
            return C41536l.m120484d(getFunctionDelegate(), ((C41532h) obj).getFunctionDelegate());
        }

        public final C41212c getFunctionDelegate() {
            return this.f40975a;
        }

        public final int hashCode() {
            return getFunctionDelegate().hashCode();
        }

        public final /* synthetic */ void onChanged(Object obj) {
            this.f40975a.invoke(obj);
        }
    }

    /* renamed from: ge.bog.mobilebank.autoliabilityinsurance.presentation.selectpackage.SelectInsurancePackageActionSheet$d */
    public static final class C13748d extends C41537m implements C43064a {

        /* renamed from: d */
        final /* synthetic */ Fragment f40976d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C13748d(Fragment fragment) {
            super(0);
            this.f40976d = fragment;
        }

        public final Fragment invoke() {
            return this.f40976d;
        }
    }

    /* renamed from: ge.bog.mobilebank.autoliabilityinsurance.presentation.selectpackage.SelectInsurancePackageActionSheet$e */
    public static final class C13749e extends C41537m implements C43064a {

        /* renamed from: d */
        final /* synthetic */ C43064a f40977d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C13749e(C43064a aVar) {
            super(0);
            this.f40977d = aVar;
        }

        public final C1638u0 invoke() {
            return (C1638u0) this.f40977d.invoke();
        }
    }

    /* renamed from: ge.bog.mobilebank.autoliabilityinsurance.presentation.selectpackage.SelectInsurancePackageActionSheet$f */
    public static final class C13750f extends C41537m implements C43064a {

        /* renamed from: d */
        final /* synthetic */ C41217g f40978d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C13750f(C41217g gVar) {
            super(0);
            this.f40978d = gVar;
        }

        public final C1636t0 invoke() {
            C1636t0 viewModelStore = C1514j0.m5375d(this.f40978d).getViewModelStore();
            C41536l.m120488h(viewModelStore, "owner.viewModelStore");
            return viewModelStore;
        }
    }

    /* renamed from: ge.bog.mobilebank.autoliabilityinsurance.presentation.selectpackage.SelectInsurancePackageActionSheet$g */
    public static final class C13751g extends C41537m implements C43064a {

        /* renamed from: d */
        final /* synthetic */ C43064a f40979d;

        /* renamed from: e */
        final /* synthetic */ C41217g f40980e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C13751g(C43064a aVar, C41217g gVar) {
            super(0);
            this.f40979d = aVar;
            this.f40980e = gVar;
        }

        public final C7047a invoke() {
            C7047a aVar;
            C43064a aVar2 = this.f40979d;
            if (aVar2 != null && (aVar = (C7047a) aVar2.invoke()) != null) {
                return aVar;
            }
            C1638u0 a = C1514j0.m5375d(this.f40980e);
            C1591i iVar = a instanceof C1591i ? (C1591i) a : null;
            C7047a defaultViewModelCreationExtras = iVar != null ? iVar.getDefaultViewModelCreationExtras() : null;
            return defaultViewModelCreationExtras == null ? C7047a.C7048a.f20987b : defaultViewModelCreationExtras;
        }
    }

    /* renamed from: ge.bog.mobilebank.autoliabilityinsurance.presentation.selectpackage.SelectInsurancePackageActionSheet$h */
    public static final class C13752h extends C41537m implements C43064a {

        /* renamed from: d */
        final /* synthetic */ Fragment f40981d;

        /* renamed from: e */
        final /* synthetic */ C41217g f40982e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C13752h(Fragment fragment, C41217g gVar) {
            super(0);
            this.f40981d = fragment;
            this.f40982e = gVar;
        }

        public final C1620q0.C1624b invoke() {
            C1620q0.C1624b bVar;
            C1638u0 a = C1514j0.m5375d(this.f40982e);
            C1591i iVar = a instanceof C1591i ? (C1591i) a : null;
            if (iVar == null || (bVar = iVar.getDefaultViewModelProviderFactory()) == null) {
                bVar = this.f40981d.getDefaultViewModelProviderFactory();
            }
            C41536l.m120488h(bVar, "(owner as? HasDefaultVie…tViewModelProviderFactory");
            return bVar;
        }
    }

    public SelectInsurancePackageActionSheet() {
        C41217g a = C41219i.m119469a(C41222k.NONE, new C13749e(new C13748d(this)));
        this.f40970H = C1514j0.m5374c(this, C41520a0.m120436b(SelectInsurancePackageViewModel$ViewModel.class), new C13750f(a), new C13751g((C43064a) null, a), new C13752h(this, a));
    }

    /* renamed from: h2 */
    private final void m51365h2(RecyclerView recyclerView, int i, int i2) {
        RecyclerView recyclerView2 = m51366i2().f46470f;
        C3793d dVar = new C3793d(recyclerView.getContext());
        dVar.mo11573r(i);
        dVar.mo11572o(C0767a.m2895e(requireContext(), i2));
        recyclerView2.mo5351j(dVar);
    }

    /* access modifiers changed from: private */
    /* renamed from: i2 */
    public final C16451e m51366i2() {
        C16451e eVar = this.f40969G;
        C41536l.m120486f(eVar);
        return eVar;
    }

    /* access modifiers changed from: private */
    /* renamed from: j2 */
    public final SelectInsurancePackageViewModel$ViewModel m51367j2() {
        return (SelectInsurancePackageViewModel$ViewModel) this.f40970H.getValue();
    }

    /* access modifiers changed from: private */
    /* renamed from: k2 */
    public static final void m51368k2(SelectInsurancePackageActionSheet selectInsurancePackageActionSheet, View view) {
        C41536l.m120489i(selectInsurancePackageActionSheet, "this$0");
        SelectInsurancePackageActionSheet selectInsurancePackageActionSheet2 = selectInsurancePackageActionSheet;
        C32343x.m95395I0(selectInsurancePackageActionSheet2, "mtpl_insurance", selectInsurancePackageActionSheet.f40971I, "choosed_provider_and_policy_next_button_click", C10464h.C10465a.FIREBASE, (Bundle) null, 16, (Object) null);
        C8034d.m30522a(selectInsurancePackageActionSheet).mo22117L(C15526d.action_selectInsurancePackageActionSheet_to_carNumberInputFragment);
    }

    /* renamed from: T1 */
    public void mo26367T1(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        C41536l.m120489i(layoutInflater, "inflater");
        C41536l.m120489i(viewGroup, "container");
        this.f40969G = C16451e.m58608d(layoutInflater, viewGroup, true);
    }

    public void onViewCreated(View view, Bundle bundle) {
        C41536l.m120489i(view, "view");
        super.onViewCreated(view, bundle);
        m51366i2().f46471g.setText(C32343x.m95388F("rbc.insurance.choose.limit.amount", new Object[0]));
        mo26372b2(ActionSheetTitle.C13155a.BASIC);
        mo26370a2(getString(C15529g.title_select_insurance_package_action_sheet));
        RecyclerView recyclerView = m51366i2().f46470f;
        FlexboxLayoutManager flexboxLayoutManager = new FlexboxLayoutManager(getContext());
        flexboxLayoutManager.mo11516X2(2);
        recyclerView.setLayoutManager(flexboxLayoutManager);
        C15531b bVar = new C15531b();
        bVar.mo42643j(new C13746b(this));
        RecyclerView recyclerView2 = m51366i2().f46470f;
        recyclerView2.setAdapter(bVar);
        C41536l.m120488h(recyclerView2, "onViewCreated$lambda$2");
        m51365h2(recyclerView2, 2, C15525c.divider_auto_liability_package_vertical);
        m51365h2(recyclerView2, 1, C15525c.divider_auto_liability_package_horizontal);
        m51366i2().f46469e.getButton().setOnClickListener(new C15293c(this));
        m51367j2().mo37651iw().mo37653md().mo4819k(getViewLifecycleOwner(), new C13747c(new C13745a(this, bVar)));
    }
}
