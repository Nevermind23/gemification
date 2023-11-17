package p341ge.bog.mobilebank.kyc.presentation.incomeproperty;

import an0.C10105a;
import an0.C10106b;
import an0.C10108d;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.appcompat.app.C0209a;
import androidx.appcompat.app.C0218d;
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
import androidx.lifecycle.LiveData;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import b41.C31128a;
import b41.C31132b;
import en0.C12718d;
import g91.C32343x;
import he1.C41212c;
import he1.C41217g;
import he1.C41222k;
import he1.C41233s;
import he1.C41238w;
import java.util.Set;
import kotlin.jvm.internal.C41520a0;
import kotlin.jvm.internal.C41532h;
import kotlin.jvm.internal.C41536l;
import kotlin.jvm.internal.C41537m;
import kotlin.jvm.internal.DefaultConstructorMarker;
import ln0.C16602a;
import ln0.C16603b;
import ln0.C16618q;
import ln0.C16626t;
import ln0.C16629w;
import m41.C37224b;
import o31.C37588a0;
import p163m0.C7047a;
import p228r0.C8034d;
import p341ge.bog.designsystem.components.list.C13364a;
import p341ge.bog.designsystem.components.pagedescription.PageDescriptionView;
import p341ge.bog.mobilebank.cleanarch.presentation.common.StateView;
import p341ge.bog.mobilebank.kyc.presentation.incomeproperty.C14868d;
import p341ge.bog.mobilebank.p975ui.activities.C35388f2;
import ue1.C43064a;
import ue1.C43075l;
import ue1.C43079p;

/* renamed from: ge.bog.mobilebank.kyc.presentation.incomeproperty.IncomeSourceSelectorFragment */
public final class IncomeSourceSelectorFragment extends C14853a {

    /* renamed from: m */
    public static final C14835a f42926m = new C14835a((DefaultConstructorMarker) null);

    /* renamed from: i */
    private C12718d f42927i;

    /* renamed from: j */
    private final C41217g f42928j = C41219i.m119470b(new C14837c(this));

    /* renamed from: k */
    public C16603b f42929k;

    /* renamed from: l */
    private final C41217g f42930l;

    /* renamed from: ge.bog.mobilebank.kyc.presentation.incomeproperty.IncomeSourceSelectorFragment$a */
    public static final class C14835a {
        private C14835a() {
        }

        public /* synthetic */ C14835a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* renamed from: a */
        public final Bundle mo41471a(C16629w wVar) {
            C41536l.m120489i(wVar, "incomeType");
            return C0908e.m3336b(C41233s.m119492a("INCOME_TYPE", wVar));
        }
    }

    /* renamed from: ge.bog.mobilebank.kyc.presentation.incomeproperty.IncomeSourceSelectorFragment$b */
    public /* synthetic */ class C14836b {

        /* renamed from: a */
        public static final /* synthetic */ int[] f42931a;

        static {
            int[] iArr = new int[C16629w.values().length];
            try {
                iArr[C16629w.INCOME.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            f42931a = iArr;
        }
    }

    /* renamed from: ge.bog.mobilebank.kyc.presentation.incomeproperty.IncomeSourceSelectorFragment$c */
    static final class C14837c extends C41537m implements C43064a {

        /* renamed from: d */
        final /* synthetic */ IncomeSourceSelectorFragment f42932d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C14837c(IncomeSourceSelectorFragment incomeSourceSelectorFragment) {
            super(0);
            this.f42932d = incomeSourceSelectorFragment;
        }

        /* renamed from: b */
        public final C16629w invoke() {
            Bundle arguments = this.f42932d.getArguments();
            Object obj = arguments != null ? arguments.get("INCOME_TYPE") : null;
            C41536l.m120487g(obj, "null cannot be cast to non-null type ge.bog.mobilebank.kyc.presentation.incomeproperty.IncomeType");
            return (C16629w) obj;
        }
    }

    /* renamed from: ge.bog.mobilebank.kyc.presentation.incomeproperty.IncomeSourceSelectorFragment$d */
    static final class C14838d extends C41537m implements C43075l {

        /* renamed from: d */
        final /* synthetic */ IncomeSourceSelectorFragment f42933d;

        /* renamed from: e */
        final /* synthetic */ C16618q f42934e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C14838d(IncomeSourceSelectorFragment incomeSourceSelectorFragment, C16618q qVar) {
            super(1);
            this.f42933d = incomeSourceSelectorFragment;
            this.f42934e = qVar;
        }

        /* renamed from: a */
        public final void mo41473a(C16602a aVar) {
            this.f42933d.m54559k1().f37629f.getButton().setEnabled(aVar.mo43753d());
            this.f42934e.mo43761u(aVar.mo43750a(), aVar.mo43752c(), aVar.mo43751b());
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            mo41473a((C16602a) obj);
            return C41238w.f97225a;
        }
    }

    /* renamed from: ge.bog.mobilebank.kyc.presentation.incomeproperty.IncomeSourceSelectorFragment$e */
    static final class C14839e extends C41537m implements C43075l {

        /* renamed from: d */
        final /* synthetic */ IncomeSourceSelectorFragment f42935d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C14839e(IncomeSourceSelectorFragment incomeSourceSelectorFragment) {
            super(1);
            this.f42935d = incomeSourceSelectorFragment;
        }

        /* renamed from: a */
        public final void mo41474a(C14868d dVar) {
            C41536l.m120489i(dVar, "it");
            if (C41536l.m120484d(dVar, C14868d.C14869a.f42980a)) {
                C8034d.m30522a(this.f42935d).mo22118M(C10106b.action_incomeSourceSelectorFragment_self, IncomeSourceSelectorFragment.f42926m.mo41471a(C16629w.INCOME));
            } else if (C41536l.m120484d(dVar, C14868d.C14870b.f42981a)) {
                C8034d.m30522a(this.f42935d).mo22117L(C10106b.action_incomeSourceSelectorFragment_to_kycResultFragment);
            }
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            mo41474a((C14868d) obj);
            return C41238w.f97225a;
        }
    }

    /* renamed from: ge.bog.mobilebank.kyc.presentation.incomeproperty.IncomeSourceSelectorFragment$f */
    static final class C14840f extends C41537m implements C43075l {

        /* renamed from: d */
        final /* synthetic */ IncomeSourceSelectorFragment f42936d;

        /* renamed from: ge.bog.mobilebank.kyc.presentation.incomeproperty.IncomeSourceSelectorFragment$f$a */
        static final class C14841a extends C41537m implements C43075l {

            /* renamed from: d */
            final /* synthetic */ IncomeSourceSelectorFragment f42937d;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            C14841a(IncomeSourceSelectorFragment incomeSourceSelectorFragment) {
                super(1);
                this.f42937d = incomeSourceSelectorFragment;
            }

            /* renamed from: a */
            public final void mo41476a(C41238w wVar) {
                this.f42937d.m54559k1().mo3946b().mo53597e();
            }

            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                mo41476a((C41238w) obj);
                return C41238w.f97225a;
            }
        }

        /* renamed from: ge.bog.mobilebank.kyc.presentation.incomeproperty.IncomeSourceSelectorFragment$f$b */
        static final class C14842b extends C41537m implements C43079p {

            /* renamed from: d */
            final /* synthetic */ IncomeSourceSelectorFragment f42938d;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            C14842b(IncomeSourceSelectorFragment incomeSourceSelectorFragment) {
                super(2);
                this.f42938d = incomeSourceSelectorFragment;
            }

            /* renamed from: a */
            public final void mo41477a(Throwable th, C41238w wVar) {
                C35388f2 f2Var;
                C41536l.m120489i(th, "error");
                this.f42938d.m54559k1().mo3946b().mo53595c();
                C1505h requireActivity = this.f42938d.requireActivity();
                if (requireActivity instanceof C35388f2) {
                    f2Var = (C35388f2) requireActivity;
                } else {
                    f2Var = null;
                }
                if (f2Var != null) {
                    f2Var.mo74709H1(th);
                }
            }

            public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                mo41477a((Throwable) obj, (C41238w) obj2);
                return C41238w.f97225a;
            }
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C14840f(IncomeSourceSelectorFragment incomeSourceSelectorFragment) {
            super(1);
            this.f42936d = incomeSourceSelectorFragment;
        }

        /* renamed from: a */
        public final void mo41475a(C31128a aVar) {
            C41536l.m120488h(aVar, "it");
            C31132b.m92646h(aVar, (int[]) null, new C14841a(this.f42936d), 1, (Object) null);
            C31132b.m92644f(aVar, (int[]) null, new C14842b(this.f42936d), 1, (Object) null);
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            mo41475a((C31128a) obj);
            return C41238w.f97225a;
        }
    }

    /* renamed from: ge.bog.mobilebank.kyc.presentation.incomeproperty.IncomeSourceSelectorFragment$g */
    static final class C14843g extends C41537m implements C43075l {

        /* renamed from: d */
        final /* synthetic */ IncomeSourceSelectorFragment f42939d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C14843g(IncomeSourceSelectorFragment incomeSourceSelectorFragment) {
            super(1);
            this.f42939d = incomeSourceSelectorFragment;
        }

        /* renamed from: a */
        public final void mo41478a(String str) {
            C41536l.m120489i(str, "it");
            this.f42939d.mo41469m1().mo41502tw().mo41496Zk(str);
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            mo41478a((String) obj);
            return C41238w.f97225a;
        }
    }

    /* renamed from: ge.bog.mobilebank.kyc.presentation.incomeproperty.IncomeSourceSelectorFragment$h */
    static final class C14844h extends C41537m implements C43075l {

        /* renamed from: d */
        final /* synthetic */ IncomeSourceSelectorFragment f42940d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C14844h(IncomeSourceSelectorFragment incomeSourceSelectorFragment) {
            super(1);
            this.f42940d = incomeSourceSelectorFragment;
        }

        /* renamed from: a */
        public final void mo41479a(Set set) {
            C41536l.m120489i(set, "it");
            this.f42940d.mo41469m1().mo41502tw().mo41490Iu(set);
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            mo41479a((Set) obj);
            return C41238w.f97225a;
        }
    }

    /* renamed from: ge.bog.mobilebank.kyc.presentation.incomeproperty.IncomeSourceSelectorFragment$i */
    static final class C14845i extends C41537m implements C43075l {

        /* renamed from: d */
        final /* synthetic */ IncomeSourceSelectorFragment f42941d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C14845i(IncomeSourceSelectorFragment incomeSourceSelectorFragment) {
            super(1);
            this.f42941d = incomeSourceSelectorFragment;
        }

        /* renamed from: a */
        public final void mo41480a(int i) {
            RecyclerView.C1747p layoutManager = this.f42941d.m54559k1().f37632i.getLayoutManager();
            C41536l.m120487g(layoutManager, "null cannot be cast to non-null type androidx.recyclerview.widget.LinearLayoutManager");
            LinearLayoutManager linearLayoutManager = (LinearLayoutManager) layoutManager;
            if (linearLayoutManager.mo5223q2() == i) {
                linearLayoutManager.mo5201P2(i, 60);
            }
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            mo41480a(((Number) obj).intValue());
            return C41238w.f97225a;
        }
    }

    /* renamed from: ge.bog.mobilebank.kyc.presentation.incomeproperty.IncomeSourceSelectorFragment$j */
    static final class C14846j implements C1645y, C41532h {

        /* renamed from: a */
        private final /* synthetic */ C43075l f42942a;

        C14846j(C43075l lVar) {
            C41536l.m120489i(lVar, "function");
            this.f42942a = lVar;
        }

        public final boolean equals(Object obj) {
            if (!(obj instanceof C1645y) || !(obj instanceof C41532h)) {
                return false;
            }
            return C41536l.m120484d(getFunctionDelegate(), ((C41532h) obj).getFunctionDelegate());
        }

        public final C41212c getFunctionDelegate() {
            return this.f42942a;
        }

        public final int hashCode() {
            return getFunctionDelegate().hashCode();
        }

        public final /* synthetic */ void onChanged(Object obj) {
            this.f42942a.invoke(obj);
        }
    }

    /* renamed from: ge.bog.mobilebank.kyc.presentation.incomeproperty.IncomeSourceSelectorFragment$k */
    public static final class C14847k extends C41537m implements C43064a {

        /* renamed from: d */
        final /* synthetic */ Fragment f42943d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C14847k(Fragment fragment) {
            super(0);
            this.f42943d = fragment;
        }

        public final Fragment invoke() {
            return this.f42943d;
        }
    }

    /* renamed from: ge.bog.mobilebank.kyc.presentation.incomeproperty.IncomeSourceSelectorFragment$l */
    public static final class C14848l extends C41537m implements C43064a {

        /* renamed from: d */
        final /* synthetic */ C43064a f42944d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C14848l(C43064a aVar) {
            super(0);
            this.f42944d = aVar;
        }

        public final C1638u0 invoke() {
            return (C1638u0) this.f42944d.invoke();
        }
    }

    /* renamed from: ge.bog.mobilebank.kyc.presentation.incomeproperty.IncomeSourceSelectorFragment$m */
    public static final class C14849m extends C41537m implements C43064a {

        /* renamed from: d */
        final /* synthetic */ C41217g f42945d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C14849m(C41217g gVar) {
            super(0);
            this.f42945d = gVar;
        }

        public final C1636t0 invoke() {
            C1636t0 viewModelStore = C1514j0.m5375d(this.f42945d).getViewModelStore();
            C41536l.m120488h(viewModelStore, "owner.viewModelStore");
            return viewModelStore;
        }
    }

    /* renamed from: ge.bog.mobilebank.kyc.presentation.incomeproperty.IncomeSourceSelectorFragment$n */
    public static final class C14850n extends C41537m implements C43064a {

        /* renamed from: d */
        final /* synthetic */ C43064a f42946d;

        /* renamed from: e */
        final /* synthetic */ C41217g f42947e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C14850n(C43064a aVar, C41217g gVar) {
            super(0);
            this.f42946d = aVar;
            this.f42947e = gVar;
        }

        public final C7047a invoke() {
            C7047a aVar;
            C43064a aVar2 = this.f42946d;
            if (aVar2 != null && (aVar = (C7047a) aVar2.invoke()) != null) {
                return aVar;
            }
            C1638u0 a = C1514j0.m5375d(this.f42947e);
            C1591i iVar = a instanceof C1591i ? (C1591i) a : null;
            C7047a defaultViewModelCreationExtras = iVar != null ? iVar.getDefaultViewModelCreationExtras() : null;
            return defaultViewModelCreationExtras == null ? C7047a.C7048a.f20987b : defaultViewModelCreationExtras;
        }
    }

    /* renamed from: ge.bog.mobilebank.kyc.presentation.incomeproperty.IncomeSourceSelectorFragment$o */
    static final class C14851o extends C41537m implements C43064a {

        /* renamed from: d */
        final /* synthetic */ IncomeSourceSelectorFragment f42948d;

        /* renamed from: ge.bog.mobilebank.kyc.presentation.incomeproperty.IncomeSourceSelectorFragment$o$a */
        static final class C14852a extends C41537m implements C43064a {

            /* renamed from: d */
            final /* synthetic */ IncomeSourceSelectorFragment f42949d;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            C14852a(IncomeSourceSelectorFragment incomeSourceSelectorFragment) {
                super(0);
                this.f42949d = incomeSourceSelectorFragment;
            }

            /* renamed from: b */
            public final C14855c invoke() {
                return this.f42949d.mo41470n1().mo32791a(this.f42949d.m54560l1());
            }
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C14851o(IncomeSourceSelectorFragment incomeSourceSelectorFragment) {
            super(0);
            this.f42948d = incomeSourceSelectorFragment;
        }

        public final C1620q0.C1624b invoke() {
            return C37588a0.f90326a.mo90779a(new C14852a(this.f42948d));
        }
    }

    public IncomeSourceSelectorFragment() {
        C14851o oVar = new C14851o(this);
        C41217g a = C41219i.m119469a(C41222k.NONE, new C14848l(new C14847k(this)));
        this.f42930l = C1514j0.m5374c(this, C41520a0.m120436b(C14855c.class), new C14849m(a), new C14850n((C43064a) null, a), oVar);
    }

    /* access modifiers changed from: private */
    /* renamed from: k1 */
    public final C12718d m54559k1() {
        C12718d dVar = this.f42927i;
        C41536l.m120486f(dVar);
        return dVar;
    }

    /* access modifiers changed from: private */
    /* renamed from: l1 */
    public final C16629w m54560l1() {
        return (C16629w) this.f42928j.getValue();
    }

    /* access modifiers changed from: private */
    /* renamed from: o1 */
    public static final void m54561o1(IncomeSourceSelectorFragment incomeSourceSelectorFragment, View view) {
        C41536l.m120489i(incomeSourceSelectorFragment, "this$0");
        incomeSourceSelectorFragment.mo41469m1().mo41502tw().mo41500e6();
    }

    /* renamed from: m1 */
    public final C14855c mo41469m1() {
        return (C14855c) this.f42930l.getValue();
    }

    /* renamed from: n1 */
    public final C16603b mo41470n1() {
        C16603b bVar = this.f42929k;
        if (bVar != null) {
            return bVar;
        }
        C41536l.m120506z("viewModelAssistedFactory");
        return null;
    }

    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        C41536l.m120489i(layoutInflater, "inflater");
        this.f42927i = C12718d.m48266d(layoutInflater, viewGroup, false);
        StateView c = m54559k1().mo3946b();
        C41536l.m120488h(c, "binding.root");
        return c;
    }

    public void onDestroyView() {
        super.onDestroyView();
        this.f42927i = null;
    }

    public void onViewCreated(View view, Bundle bundle) {
        String str;
        int i;
        C41536l.m120489i(view, "view");
        C1505h requireActivity = requireActivity();
        C41536l.m120487g(requireActivity, "null cannot be cast to non-null type androidx.appcompat.app.AppCompatActivity");
        C0209a supportActionBar = ((C0218d) requireActivity).getSupportActionBar();
        if (supportActionBar != null) {
            if (C14836b.f42931a[m54560l1().ordinal()] == 1) {
                i = C10108d.title_income_source_selector;
            } else {
                i = C10108d.title_property_source_selector;
            }
            supportActionBar.mo572z(i);
        }
        PageDescriptionView pageDescriptionView = m54559k1().f37631h;
        if (C14836b.f42931a[m54560l1().ordinal()] == 1) {
            str = C32343x.m95388F("rbc.kyc.survey.select.amount.source", new Object[0]);
        } else {
            str = C32343x.m95388F("rbc.kyc.survey.select.property.source", new Object[0]);
        }
        pageDescriptionView.setText(str);
        C16618q qVar = new C16618q(new C14843g(this), new C14844h(this), new C14845i(this));
        m54559k1().f37632i.setAdapter(qVar);
        m54559k1().f37632i.mo5351j(new C13364a(requireContext().getDrawable(C10105a.f27870a), true, false));
        m54559k1().f37629f.getButton().setOnClickListener(new C16626t(this));
        mo41469m1().mo41503uw().mo41498b().mo4819k(getViewLifecycleOwner(), new C14846j(new C14838d(this, qVar)));
        LiveData M6 = mo41469m1().mo41503uw().mo41493M6();
        C1619q viewLifecycleOwner = getViewLifecycleOwner();
        C41536l.m120488h(viewLifecycleOwner, "viewLifecycleOwner");
        C37224b.m109963b(M6, viewLifecycleOwner, new C14839e(this));
        mo41469m1().mo41503uw().mo41505z6().mo4819k(getViewLifecycleOwner(), new C14846j(new C14840f(this)));
    }
}
