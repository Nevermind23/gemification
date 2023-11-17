package p341ge.bog.mobilebank.autoliabilityinsurance.presentation.policydetails;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.core.p016os.C0908e;
import androidx.fragment.app.C1514j0;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.C1591i;
import androidx.lifecycle.C1620q0;
import androidx.lifecycle.C1636t0;
import androidx.lifecycle.C1638u0;
import androidx.lifecycle.C1645y;
import com.salesforce.marketingcloud.UrlHandler;
import g91.C32343x;
import he1.C41212c;
import he1.C41217g;
import he1.C41222k;
import he1.C41233s;
import he1.C41238w;
import kotlin.jvm.internal.C41520a0;
import kotlin.jvm.internal.C41532h;
import kotlin.jvm.internal.C41536l;
import kotlin.jvm.internal.C41537m;
import p163m0.C7047a;
import p228r0.C8034d;
import p380ck.C10464h;
import p451hk.C15526d;
import p493kk.C16459m;
import p658wk.C18602a;
import p658wk.C18604c;
import ue1.C43064a;
import ue1.C43075l;

/* renamed from: ge.bog.mobilebank.autoliabilityinsurance.presentation.policydetails.PolicyDetailsFragment */
public final class PolicyDetailsFragment extends C13673a {

    /* renamed from: i */
    private C16459m f40813i;

    /* renamed from: j */
    private final C41217g f40814j;

    /* renamed from: k */
    private final C41217g f40815k = C41219i.m119470b(new C13664b(this));

    /* renamed from: ge.bog.mobilebank.autoliabilityinsurance.presentation.policydetails.PolicyDetailsFragment$a */
    static final class C13663a extends C41537m implements C43075l {

        /* renamed from: d */
        final /* synthetic */ PolicyDetailsFragment f40816d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C13663a(PolicyDetailsFragment policyDetailsFragment) {
            super(1);
            this.f40816d = policyDetailsFragment;
        }

        /* renamed from: a */
        public final void mo37549a(C18604c cVar) {
            this.f40816d.m51145j1().f46565o.setText(cVar.mo46457g());
            this.f40816d.m51145j1().f46566p.setText(cVar.mo46458h());
            this.f40816d.m51145j1().f46570t.setText(cVar.mo46461j());
            this.f40816d.m51145j1().f46572v.setText(cVar.mo46462k());
            this.f40816d.m51145j1().f46562l.setText(cVar.mo46453d());
            this.f40816d.m51145j1().f46555e.setText(cVar.mo46450a());
            this.f40816d.m51145j1().f46567q.setText(cVar.mo46460i());
            this.f40816d.m51145j1().f46561k.setText(cVar.mo46452c());
            if (!cVar.mo46463l()) {
                this.f40816d.m51145j1().f46556f.setVisibility(0);
                this.f40816d.m51145j1().f46563m.setText(cVar.mo46454e());
                this.f40816d.m51145j1().f46564n.setText(cVar.mo46456f());
                this.f40816d.m51145j1().f46560j.setText(cVar.mo46451b());
                return;
            }
            this.f40816d.m51145j1().f46556f.setVisibility(8);
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            mo37549a((C18604c) obj);
            return C41238w.f97225a;
        }
    }

    /* renamed from: ge.bog.mobilebank.autoliabilityinsurance.presentation.policydetails.PolicyDetailsFragment$b */
    static final class C13664b extends C41537m implements C43064a {

        /* renamed from: d */
        final /* synthetic */ PolicyDetailsFragment f40817d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C13664b(PolicyDetailsFragment policyDetailsFragment) {
            super(0);
            this.f40817d = policyDetailsFragment;
        }

        public final String invoke() {
            Bundle arguments = this.f40817d.getArguments();
            String string = arguments != null ? arguments.getString("selected_path") : null;
            C41536l.m120486f(string);
            return string;
        }
    }

    /* renamed from: ge.bog.mobilebank.autoliabilityinsurance.presentation.policydetails.PolicyDetailsFragment$c */
    static final class C13665c implements C1645y, C41532h {

        /* renamed from: a */
        private final /* synthetic */ C43075l f40818a;

        C13665c(C43075l lVar) {
            C41536l.m120489i(lVar, "function");
            this.f40818a = lVar;
        }

        public final boolean equals(Object obj) {
            if (!(obj instanceof C1645y) || !(obj instanceof C41532h)) {
                return false;
            }
            return C41536l.m120484d(getFunctionDelegate(), ((C41532h) obj).getFunctionDelegate());
        }

        public final C41212c getFunctionDelegate() {
            return this.f40818a;
        }

        public final int hashCode() {
            return getFunctionDelegate().hashCode();
        }

        public final /* synthetic */ void onChanged(Object obj) {
            this.f40818a.invoke(obj);
        }
    }

    /* renamed from: ge.bog.mobilebank.autoliabilityinsurance.presentation.policydetails.PolicyDetailsFragment$d */
    public static final class C13666d extends C41537m implements C43064a {

        /* renamed from: d */
        final /* synthetic */ Fragment f40819d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C13666d(Fragment fragment) {
            super(0);
            this.f40819d = fragment;
        }

        public final Fragment invoke() {
            return this.f40819d;
        }
    }

    /* renamed from: ge.bog.mobilebank.autoliabilityinsurance.presentation.policydetails.PolicyDetailsFragment$e */
    public static final class C13667e extends C41537m implements C43064a {

        /* renamed from: d */
        final /* synthetic */ C43064a f40820d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C13667e(C43064a aVar) {
            super(0);
            this.f40820d = aVar;
        }

        public final C1638u0 invoke() {
            return (C1638u0) this.f40820d.invoke();
        }
    }

    /* renamed from: ge.bog.mobilebank.autoliabilityinsurance.presentation.policydetails.PolicyDetailsFragment$f */
    public static final class C13668f extends C41537m implements C43064a {

        /* renamed from: d */
        final /* synthetic */ C41217g f40821d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C13668f(C41217g gVar) {
            super(0);
            this.f40821d = gVar;
        }

        public final C1636t0 invoke() {
            C1636t0 viewModelStore = C1514j0.m5375d(this.f40821d).getViewModelStore();
            C41536l.m120488h(viewModelStore, "owner.viewModelStore");
            return viewModelStore;
        }
    }

    /* renamed from: ge.bog.mobilebank.autoliabilityinsurance.presentation.policydetails.PolicyDetailsFragment$g */
    public static final class C13669g extends C41537m implements C43064a {

        /* renamed from: d */
        final /* synthetic */ C43064a f40822d;

        /* renamed from: e */
        final /* synthetic */ C41217g f40823e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C13669g(C43064a aVar, C41217g gVar) {
            super(0);
            this.f40822d = aVar;
            this.f40823e = gVar;
        }

        public final C7047a invoke() {
            C7047a aVar;
            C43064a aVar2 = this.f40822d;
            if (aVar2 != null && (aVar = (C7047a) aVar2.invoke()) != null) {
                return aVar;
            }
            C1638u0 a = C1514j0.m5375d(this.f40823e);
            C1591i iVar = a instanceof C1591i ? (C1591i) a : null;
            C7047a defaultViewModelCreationExtras = iVar != null ? iVar.getDefaultViewModelCreationExtras() : null;
            return defaultViewModelCreationExtras == null ? C7047a.C7048a.f20987b : defaultViewModelCreationExtras;
        }
    }

    /* renamed from: ge.bog.mobilebank.autoliabilityinsurance.presentation.policydetails.PolicyDetailsFragment$h */
    public static final class C13670h extends C41537m implements C43064a {

        /* renamed from: d */
        final /* synthetic */ Fragment f40824d;

        /* renamed from: e */
        final /* synthetic */ C41217g f40825e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C13670h(Fragment fragment, C41217g gVar) {
            super(0);
            this.f40824d = fragment;
            this.f40825e = gVar;
        }

        public final C1620q0.C1624b invoke() {
            C1620q0.C1624b bVar;
            C1638u0 a = C1514j0.m5375d(this.f40825e);
            C1591i iVar = a instanceof C1591i ? (C1591i) a : null;
            if (iVar == null || (bVar = iVar.getDefaultViewModelProviderFactory()) == null) {
                bVar = this.f40824d.getDefaultViewModelProviderFactory();
            }
            C41536l.m120488h(bVar, "(owner as? HasDefaultVie…tViewModelProviderFactory");
            return bVar;
        }
    }

    public PolicyDetailsFragment() {
        C41217g a = C41219i.m119469a(C41222k.NONE, new C13667e(new C13666d(this)));
        this.f40814j = C1514j0.m5374c(this, C41520a0.m120436b(PolicyDetailsViewModel$ViewModel.class), new C13668f(a), new C13669g((C43064a) null, a), new C13670h(this, a));
    }

    /* access modifiers changed from: private */
    /* renamed from: j1 */
    public final C16459m m51145j1() {
        C16459m mVar = this.f40813i;
        C41536l.m120486f(mVar);
        return mVar;
    }

    /* renamed from: k1 */
    private final String m51146k1() {
        return (String) this.f40815k.getValue();
    }

    /* renamed from: l1 */
    private final PolicyDetailsViewModel$ViewModel m51147l1() {
        return (PolicyDetailsViewModel$ViewModel) this.f40814j.getValue();
    }

    /* access modifiers changed from: private */
    /* renamed from: m1 */
    public static final void m51148m1(PolicyDetailsFragment policyDetailsFragment, View view) {
        C41536l.m120489i(policyDetailsFragment, "this$0");
        PolicyDetailsFragment policyDetailsFragment2 = policyDetailsFragment;
        C32343x.m95395I0(policyDetailsFragment2, "mtpl_insurance", (String) null, "", C10464h.C10465a.FIREBASE, C0908e.m3336b(C41233s.m119492a("event_name", "mtpl_insurance"), C41233s.m119492a(UrlHandler.ACTION, "summary_page_next_button_click"), C41233s.m119492a("selected_path", policyDetailsFragment.m51146k1())), 2, (Object) null);
        C8034d.m30522a(policyDetailsFragment).mo22118M(C15526d.action_policyDetailsFragment_to_registerMtplPolicyFragment, C0908e.m3336b(C41233s.m119492a("selected_path", policyDetailsFragment.m51146k1())));
    }

    private final void observeData() {
        m51147l1().mo37553hw().mo37552fb().mo4819k(getViewLifecycleOwner(), new C13665c(new C13663a(this)));
    }

    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        C41536l.m120489i(layoutInflater, "inflater");
        this.f40813i = C16459m.m58642d(layoutInflater, viewGroup, false);
        LinearLayout c = m51145j1().mo3946b();
        C41536l.m120488h(c, "binding.root");
        return c;
    }

    public void onDestroyView() {
        super.onDestroyView();
        this.f40813i = null;
    }

    public void onViewCreated(View view, Bundle bundle) {
        C41536l.m120489i(view, "view");
        super.onViewCreated(view, bundle);
        observeData();
        m51145j1().f46571u.setOnClickListener(new C18602a(this));
    }
}
