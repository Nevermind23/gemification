package p341ge.bog.mobilebank.autoliabilityinsurance.presentation.providerlist;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.C1514j0;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.C1591i;
import androidx.lifecycle.C1619q;
import androidx.lifecycle.C1620q0;
import androidx.lifecycle.C1636t0;
import androidx.lifecycle.C1638u0;
import androidx.lifecycle.C1645y;
import androidx.lifecycle.LiveData;
import androidx.recyclerview.widget.RecyclerView;
import he1.C41212c;
import he1.C41217g;
import he1.C41222k;
import he1.C41238w;
import java.util.List;
import kotlin.jvm.internal.C41520a0;
import kotlin.jvm.internal.C41532h;
import kotlin.jvm.internal.C41536l;
import kotlin.jvm.internal.C41537m;
import m41.C37224b;
import p163m0.C7047a;
import p228r0.C8034d;
import p353al.C10067d;
import p451hk.C15526d;
import p451hk.C15527e;
import ue1.C43064a;
import ue1.C43075l;

/* renamed from: ge.bog.mobilebank.autoliabilityinsurance.presentation.providerlist.InsuranceProviderListFragment */
public final class InsuranceProviderListFragment extends C13715a {

    /* renamed from: i */
    private final C41217g f40866i;

    /* renamed from: j */
    private RecyclerView f40867j;
    /* access modifiers changed from: private */

    /* renamed from: k */
    public C10067d f40868k;

    /* renamed from: ge.bog.mobilebank.autoliabilityinsurance.presentation.providerlist.InsuranceProviderListFragment$a */
    static final class C13688a extends C41537m implements C43075l {

        /* renamed from: d */
        final /* synthetic */ InsuranceProviderListFragment f40869d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C13688a(InsuranceProviderListFragment insuranceProviderListFragment) {
            super(1);
            this.f40869d = insuranceProviderListFragment;
        }

        /* renamed from: a */
        public final void mo37579a(List list) {
            C10067d h1 = this.f40869d.f40868k;
            if (h1 == null) {
                C41536l.m120506z("adapter");
                h1 = null;
            }
            h1.mo6029i(list);
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            mo37579a((List) obj);
            return C41238w.f97225a;
        }
    }

    /* renamed from: ge.bog.mobilebank.autoliabilityinsurance.presentation.providerlist.InsuranceProviderListFragment$b */
    static final class C13689b extends C41537m implements C43075l {

        /* renamed from: d */
        final /* synthetic */ InsuranceProviderListFragment f40870d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C13689b(InsuranceProviderListFragment insuranceProviderListFragment) {
            super(1);
            this.f40870d = insuranceProviderListFragment;
        }

        /* renamed from: a */
        public final void mo37580a(C41238w wVar) {
            C41536l.m120489i(wVar, "it");
            C8034d.m30522a(this.f40870d).mo22117L(C15526d.action_insuranceProviderListFragment_to_selectInsurancePackageActionSheet);
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            mo37580a((C41238w) obj);
            return C41238w.f97225a;
        }
    }

    /* renamed from: ge.bog.mobilebank.autoliabilityinsurance.presentation.providerlist.InsuranceProviderListFragment$c */
    static final class C13690c extends C41537m implements C43075l {

        /* renamed from: d */
        final /* synthetic */ InsuranceProviderListFragment f40871d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C13690c(InsuranceProviderListFragment insuranceProviderListFragment) {
            super(1);
            this.f40871d = insuranceProviderListFragment;
        }

        /* renamed from: a */
        public final void mo37581a(Integer num) {
            C10067d h1 = this.f40871d.f40868k;
            if (h1 == null) {
                C41536l.m120506z("adapter");
                h1 = null;
            }
            C41536l.m120488h(num, "it");
            h1.mo26516s(num.intValue());
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            mo37581a((Integer) obj);
            return C41238w.f97225a;
        }
    }

    /* renamed from: ge.bog.mobilebank.autoliabilityinsurance.presentation.providerlist.InsuranceProviderListFragment$d */
    static final class C13691d implements C1645y, C41532h {

        /* renamed from: a */
        private final /* synthetic */ C43075l f40872a;

        C13691d(C43075l lVar) {
            C41536l.m120489i(lVar, "function");
            this.f40872a = lVar;
        }

        public final boolean equals(Object obj) {
            if (!(obj instanceof C1645y) || !(obj instanceof C41532h)) {
                return false;
            }
            return C41536l.m120484d(getFunctionDelegate(), ((C41532h) obj).getFunctionDelegate());
        }

        public final C41212c getFunctionDelegate() {
            return this.f40872a;
        }

        public final int hashCode() {
            return getFunctionDelegate().hashCode();
        }

        public final /* synthetic */ void onChanged(Object obj) {
            this.f40872a.invoke(obj);
        }
    }

    /* renamed from: ge.bog.mobilebank.autoliabilityinsurance.presentation.providerlist.InsuranceProviderListFragment$e */
    public static final class C13692e extends C41537m implements C43064a {

        /* renamed from: d */
        final /* synthetic */ Fragment f40873d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C13692e(Fragment fragment) {
            super(0);
            this.f40873d = fragment;
        }

        public final Fragment invoke() {
            return this.f40873d;
        }
    }

    /* renamed from: ge.bog.mobilebank.autoliabilityinsurance.presentation.providerlist.InsuranceProviderListFragment$f */
    public static final class C13693f extends C41537m implements C43064a {

        /* renamed from: d */
        final /* synthetic */ C43064a f40874d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C13693f(C43064a aVar) {
            super(0);
            this.f40874d = aVar;
        }

        public final C1638u0 invoke() {
            return (C1638u0) this.f40874d.invoke();
        }
    }

    /* renamed from: ge.bog.mobilebank.autoliabilityinsurance.presentation.providerlist.InsuranceProviderListFragment$g */
    public static final class C13694g extends C41537m implements C43064a {

        /* renamed from: d */
        final /* synthetic */ C41217g f40875d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C13694g(C41217g gVar) {
            super(0);
            this.f40875d = gVar;
        }

        public final C1636t0 invoke() {
            C1636t0 viewModelStore = C1514j0.m5375d(this.f40875d).getViewModelStore();
            C41536l.m120488h(viewModelStore, "owner.viewModelStore");
            return viewModelStore;
        }
    }

    /* renamed from: ge.bog.mobilebank.autoliabilityinsurance.presentation.providerlist.InsuranceProviderListFragment$h */
    public static final class C13695h extends C41537m implements C43064a {

        /* renamed from: d */
        final /* synthetic */ C43064a f40876d;

        /* renamed from: e */
        final /* synthetic */ C41217g f40877e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C13695h(C43064a aVar, C41217g gVar) {
            super(0);
            this.f40876d = aVar;
            this.f40877e = gVar;
        }

        public final C7047a invoke() {
            C7047a aVar;
            C43064a aVar2 = this.f40876d;
            if (aVar2 != null && (aVar = (C7047a) aVar2.invoke()) != null) {
                return aVar;
            }
            C1638u0 a = C1514j0.m5375d(this.f40877e);
            C1591i iVar = a instanceof C1591i ? (C1591i) a : null;
            C7047a defaultViewModelCreationExtras = iVar != null ? iVar.getDefaultViewModelCreationExtras() : null;
            return defaultViewModelCreationExtras == null ? C7047a.C7048a.f20987b : defaultViewModelCreationExtras;
        }
    }

    /* renamed from: ge.bog.mobilebank.autoliabilityinsurance.presentation.providerlist.InsuranceProviderListFragment$i */
    public static final class C13696i extends C41537m implements C43064a {

        /* renamed from: d */
        final /* synthetic */ Fragment f40878d;

        /* renamed from: e */
        final /* synthetic */ C41217g f40879e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C13696i(Fragment fragment, C41217g gVar) {
            super(0);
            this.f40878d = fragment;
            this.f40879e = gVar;
        }

        public final C1620q0.C1624b invoke() {
            C1620q0.C1624b bVar;
            C1638u0 a = C1514j0.m5375d(this.f40879e);
            C1591i iVar = a instanceof C1591i ? (C1591i) a : null;
            if (iVar == null || (bVar = iVar.getDefaultViewModelProviderFactory()) == null) {
                bVar = this.f40878d.getDefaultViewModelProviderFactory();
            }
            C41536l.m120488h(bVar, "(owner as? HasDefaultVie…tViewModelProviderFactory");
            return bVar;
        }
    }

    public InsuranceProviderListFragment() {
        C41217g a = C41219i.m119469a(C41222k.NONE, new C13693f(new C13692e(this)));
        this.f40866i = C1514j0.m5374c(this, C41520a0.m120436b(InsuranceProviderListViewModel$ViewModel.class), new C13694g(a), new C13695h((C43064a) null, a), new C13696i(this, a));
    }

    /* renamed from: i1 */
    private final InsuranceProviderListViewModel$ViewModel m51202i1() {
        return (InsuranceProviderListViewModel$ViewModel) this.f40866i.getValue();
    }

    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        C41536l.m120489i(layoutInflater, "inflater");
        View inflate = layoutInflater.inflate(C15527e.fragment_insurance_provider_list, viewGroup, false);
        View findViewById = inflate.findViewById(C15526d.insurance_provider_list_recycler);
        C41536l.m120488h(findViewById, "it.findViewById(R.id.ins…e_provider_list_recycler)");
        RecyclerView recyclerView = (RecyclerView) findViewById;
        this.f40867j = recyclerView;
        if (recyclerView == null) {
            C41536l.m120506z("recyclerView");
            recyclerView = null;
        }
        C10067d dVar = new C10067d(m51202i1());
        this.f40868k = dVar;
        recyclerView.setAdapter(dVar);
        return inflate;
    }

    public void onViewCreated(View view, Bundle bundle) {
        C41536l.m120489i(view, "view");
        m51202i1().mo37588Nw().mo37585Ij().mo4819k(getViewLifecycleOwner(), new C13691d(new C13688a(this)));
        LiveData Fe = m51202i1().mo37588Nw().mo37584Fe();
        C1619q viewLifecycleOwner = getViewLifecycleOwner();
        C41536l.m120488h(viewLifecycleOwner, "viewLifecycleOwner");
        C37224b.m109963b(Fe, viewLifecycleOwner, new C13689b(this));
        m51202i1().mo37588Nw().mo37592fj().mo4819k(getViewLifecycleOwner(), new C13691d(new C13690c(this)));
    }
}
