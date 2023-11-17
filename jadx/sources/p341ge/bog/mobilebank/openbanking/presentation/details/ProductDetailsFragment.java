package p341ge.bog.mobilebank.openbanking.presentation.details;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.C1505h;
import androidx.fragment.app.C1514j0;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.C1591i;
import androidx.lifecycle.C1620q0;
import androidx.lifecycle.C1636t0;
import androidx.lifecycle.C1638u0;
import androidx.lifecycle.C1645y;
import androidx.recyclerview.widget.RecyclerView;
import ev0.C31830k;
import g91.C32359z0;
import he1.C41212c;
import he1.C41217g;
import he1.C41222k;
import he1.C41238w;
import iu0.C36546y;
import java.util.List;
import kotlin.jvm.internal.C41520a0;
import kotlin.jvm.internal.C41532h;
import kotlin.jvm.internal.C41536l;
import kotlin.jvm.internal.C41537m;
import nv0.C37474f;
import o31.C37600h;
import p163m0.C7047a;
import p341ge.bog.mobilebank.openbanking.presentation.ProductUiModel;
import p341ge.bog.mobilebank.openbanking.presentation.details.C33425d;
import p341ge.bog.mobilebank.p975ui.fragments.C35651n1;
import p366bk.C10328q;
import p420fh.C12902d;
import p420fh.C12910e;
import ue1.C43064a;
import ue1.C43075l;

/* renamed from: ge.bog.mobilebank.openbanking.presentation.details.ProductDetailsFragment */
public final class ProductDetailsFragment extends C35651n1 {

    /* renamed from: d */
    private C31830k f81552d;

    /* renamed from: e */
    private final C41217g f81553e;

    /* renamed from: f */
    private final C41217g f81554f = C41219i.m119470b(new C33394g(this));

    /* renamed from: ge.bog.mobilebank.openbanking.presentation.details.ProductDetailsFragment$a */
    public static final class C33388a extends C37600h {

        /* renamed from: b */
        final /* synthetic */ ProductDetailsFragment f81555b;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C33388a(ProductDetailsFragment productDetailsFragment, ProductDetailsViewModel$ViewModel productDetailsViewModel$ViewModel) {
            super(productDetailsViewModel$ViewModel);
            this.f81555b = productDetailsFragment;
        }

        /* access modifiers changed from: protected */
        /* renamed from: f */
        public void mo60667f() {
            this.f81555b.m98108n1().mo79214o1();
        }
    }

    /* renamed from: ge.bog.mobilebank.openbanking.presentation.details.ProductDetailsFragment$b */
    static final class C33389b extends C41537m implements C43075l {

        /* renamed from: d */
        final /* synthetic */ C33412b f81556d;

        /* renamed from: e */
        final /* synthetic */ ProductDetailsFragment f81557e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C33389b(C33412b bVar, ProductDetailsFragment productDetailsFragment) {
            super(1);
            this.f81556d = bVar;
            this.f81557e = productDetailsFragment;
        }

        /* access modifiers changed from: private */
        /* renamed from: c */
        public static final void m98111c(List list, ProductDetailsFragment productDetailsFragment) {
            C41536l.m120489i(productDetailsFragment, "this$0");
            C41536l.m120488h(list, "it");
            if (C41358y.m120019i0(list) instanceof C33425d.C33430e) {
                productDetailsFragment.m98106l1().f78527e.mo5425x1(list.size() - 1);
            }
        }

        /* renamed from: b */
        public final void mo79206b(List list) {
            this.f81556d.mo6030j(list, new C33424c(list, this.f81557e));
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            mo79206b((List) obj);
            return C41238w.f97225a;
        }
    }

    /* renamed from: ge.bog.mobilebank.openbanking.presentation.details.ProductDetailsFragment$c */
    static final class C33390c extends C41537m implements C43064a {

        /* renamed from: d */
        final /* synthetic */ ProductDetailsFragment f81558d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C33390c(ProductDetailsFragment productDetailsFragment) {
            super(0);
            this.f81558d = productDetailsFragment;
        }

        public final void invoke() {
            this.f81558d.m98108n1().onRefresh(6);
        }
    }

    /* renamed from: ge.bog.mobilebank.openbanking.presentation.details.ProductDetailsFragment$d */
    static final class C33391d extends C41537m implements C43075l {

        /* renamed from: d */
        final /* synthetic */ ProductDetailsFragment f81559d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C33391d(ProductDetailsFragment productDetailsFragment) {
            super(1);
            this.f81559d = productDetailsFragment;
        }

        /* renamed from: a */
        public final void mo79207a(String str) {
            C41536l.m120489i(str, "it");
            C32359z0.m95583n0(this.f81559d.requireActivity(), str, this.f81559d.getString(C10328q.f28961m2));
            C36546y.m108282F().mo27152s("open_banking", this.f81559d.m98107m1().mo79105d().mo79091a(), "click_share_account");
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            mo79207a((String) obj);
            return C41238w.f97225a;
        }
    }

    /* renamed from: ge.bog.mobilebank.openbanking.presentation.details.ProductDetailsFragment$e */
    static final class C33392e extends C41537m implements C43075l {

        /* renamed from: d */
        final /* synthetic */ ProductDetailsFragment f81560d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C33392e(ProductDetailsFragment productDetailsFragment) {
            super(1);
            this.f81560d = productDetailsFragment;
        }

        /* renamed from: a */
        public final void mo79208a(String str) {
            C41536l.m120489i(str, "it");
            C32359z0.m95596x(str);
            C1505h activity = this.f81560d.getActivity();
            if (activity != null) {
                String string = this.f81560d.getString(C10328q.f28953c2);
                C41536l.m120488h(string, "getString(R.string.common_text_number_copied)");
                C12910e.m48787e(activity, string, (C12902d.C12905b) null, false, 6, (Object) null);
            }
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            mo79208a((String) obj);
            return C41238w.f97225a;
        }
    }

    /* renamed from: ge.bog.mobilebank.openbanking.presentation.details.ProductDetailsFragment$f */
    static final class C33393f implements C1645y, C41532h {

        /* renamed from: a */
        private final /* synthetic */ C43075l f81561a;

        C33393f(C43075l lVar) {
            C41536l.m120489i(lVar, "function");
            this.f81561a = lVar;
        }

        public final boolean equals(Object obj) {
            if (!(obj instanceof C1645y) || !(obj instanceof C41532h)) {
                return false;
            }
            return C41536l.m120484d(getFunctionDelegate(), ((C41532h) obj).getFunctionDelegate());
        }

        public final C41212c getFunctionDelegate() {
            return this.f81561a;
        }

        public final int hashCode() {
            return getFunctionDelegate().hashCode();
        }

        public final /* synthetic */ void onChanged(Object obj) {
            this.f81561a.invoke(obj);
        }
    }

    /* renamed from: ge.bog.mobilebank.openbanking.presentation.details.ProductDetailsFragment$g */
    static final class C33394g extends C41537m implements C43064a {

        /* renamed from: d */
        final /* synthetic */ ProductDetailsFragment f81562d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C33394g(ProductDetailsFragment productDetailsFragment) {
            super(0);
            this.f81562d = productDetailsFragment;
        }

        /* renamed from: b */
        public final ProductUiModel invoke() {
            C1505h requireActivity = this.f81562d.requireActivity();
            C41536l.m120487g(requireActivity, "null cannot be cast to non-null type ge.bog.mobilebank.openbanking.presentation.details.OpenBankProductDetailsActivity");
            ProductUiModel E2 = ((OpenBankProductDetailsActivity) requireActivity).mo79203E2();
            C41536l.m120486f(E2);
            return E2;
        }
    }

    /* renamed from: ge.bog.mobilebank.openbanking.presentation.details.ProductDetailsFragment$h */
    public static final class C33395h extends C41537m implements C43064a {

        /* renamed from: d */
        final /* synthetic */ Fragment f81563d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C33395h(Fragment fragment) {
            super(0);
            this.f81563d = fragment;
        }

        public final Fragment invoke() {
            return this.f81563d;
        }
    }

    /* renamed from: ge.bog.mobilebank.openbanking.presentation.details.ProductDetailsFragment$i */
    public static final class C33396i extends C41537m implements C43064a {

        /* renamed from: d */
        final /* synthetic */ C43064a f81564d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C33396i(C43064a aVar) {
            super(0);
            this.f81564d = aVar;
        }

        public final C1638u0 invoke() {
            return (C1638u0) this.f81564d.invoke();
        }
    }

    /* renamed from: ge.bog.mobilebank.openbanking.presentation.details.ProductDetailsFragment$j */
    public static final class C33397j extends C41537m implements C43064a {

        /* renamed from: d */
        final /* synthetic */ C41217g f81565d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C33397j(C41217g gVar) {
            super(0);
            this.f81565d = gVar;
        }

        public final C1636t0 invoke() {
            C1636t0 viewModelStore = C1514j0.m5375d(this.f81565d).getViewModelStore();
            C41536l.m120488h(viewModelStore, "owner.viewModelStore");
            return viewModelStore;
        }
    }

    /* renamed from: ge.bog.mobilebank.openbanking.presentation.details.ProductDetailsFragment$k */
    public static final class C33398k extends C41537m implements C43064a {

        /* renamed from: d */
        final /* synthetic */ C43064a f81566d;

        /* renamed from: e */
        final /* synthetic */ C41217g f81567e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C33398k(C43064a aVar, C41217g gVar) {
            super(0);
            this.f81566d = aVar;
            this.f81567e = gVar;
        }

        public final C7047a invoke() {
            C7047a aVar;
            C43064a aVar2 = this.f81566d;
            if (aVar2 != null && (aVar = (C7047a) aVar2.invoke()) != null) {
                return aVar;
            }
            C1638u0 a = C1514j0.m5375d(this.f81567e);
            C1591i iVar = a instanceof C1591i ? (C1591i) a : null;
            C7047a defaultViewModelCreationExtras = iVar != null ? iVar.getDefaultViewModelCreationExtras() : null;
            return defaultViewModelCreationExtras == null ? C7047a.C7048a.f20987b : defaultViewModelCreationExtras;
        }
    }

    /* renamed from: ge.bog.mobilebank.openbanking.presentation.details.ProductDetailsFragment$l */
    public static final class C33399l extends C41537m implements C43064a {

        /* renamed from: d */
        final /* synthetic */ Fragment f81568d;

        /* renamed from: e */
        final /* synthetic */ C41217g f81569e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C33399l(Fragment fragment, C41217g gVar) {
            super(0);
            this.f81568d = fragment;
            this.f81569e = gVar;
        }

        public final C1620q0.C1624b invoke() {
            C1620q0.C1624b bVar;
            C1638u0 a = C1514j0.m5375d(this.f81569e);
            C1591i iVar = a instanceof C1591i ? (C1591i) a : null;
            if (iVar == null || (bVar = iVar.getDefaultViewModelProviderFactory()) == null) {
                bVar = this.f81568d.getDefaultViewModelProviderFactory();
            }
            C41536l.m120488h(bVar, "(owner as? HasDefaultVie…tViewModelProviderFactory");
            return bVar;
        }
    }

    public ProductDetailsFragment() {
        C41217g a = C41219i.m119469a(C41222k.NONE, new C33396i(new C33395h(this)));
        this.f81553e = C1514j0.m5374c(this, C41520a0.m120436b(ProductDetailsViewModel$ViewModel.class), new C33397j(a), new C33398k((C43064a) null, a), new C33399l(this, a));
    }

    /* access modifiers changed from: private */
    /* renamed from: l1 */
    public final C31830k m98106l1() {
        C31830k kVar = this.f81552d;
        C41536l.m120486f(kVar);
        return kVar;
    }

    /* access modifiers changed from: private */
    /* renamed from: m1 */
    public final ProductUiModel m98107m1() {
        return (ProductUiModel) this.f81554f.getValue();
    }

    /* access modifiers changed from: private */
    /* renamed from: n1 */
    public final ProductDetailsViewModel$ViewModel m98108n1() {
        return (ProductDetailsViewModel$ViewModel) this.f81553e.getValue();
    }

    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        C41536l.m120489i(layoutInflater, "inflater");
        this.f81552d = C31830k.m94110d(layoutInflater, viewGroup, false);
        RecyclerView c = m98106l1().mo3946b();
        C41536l.m120488h(c, "binding.root");
        return c;
    }

    public void onViewCreated(View view, Bundle bundle) {
        C41536l.m120489i(view, "view");
        C33412b bVar = new C33412b(m98108n1());
        bVar.mo79237s(new C33390c(this));
        bVar.mo79236r(new C33391d(this));
        bVar.mo79235q(new C33392e(this));
        m98106l1().f78527e.setAdapter(bVar);
        m98106l1().f78527e.mo5363n(new C33388a(this, m98108n1()));
        RecyclerView recyclerView = m98106l1().f78527e;
        Context requireContext = requireContext();
        C41536l.m120488h(requireContext, "requireContext()");
        recyclerView.mo5351j(new C37474f(requireContext));
        m98108n1().mo79216ww().mo79212j().mo4819k(getViewLifecycleOwner(), new C33393f(new C33389b(bVar, this)));
        m98108n1().mo79215vw().mo79213n9(m98107m1());
    }
}
