package p341ge.bog.mobilebank.insurance.travelinsurance.presentation.provider;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
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
import androidx.recyclerview.widget.RecyclerView;
import em0.C20275b;
import g91.C32303f;
import g91.C32343x;
import he1.C41212c;
import he1.C41217g;
import he1.C41222k;
import he1.C41233s;
import he1.C41238w;
import java.util.List;
import kotlin.jvm.internal.C41520a0;
import kotlin.jvm.internal.C41532h;
import kotlin.jvm.internal.C41536l;
import kotlin.jvm.internal.C41537m;
import kotlin.jvm.internal.DefaultConstructorMarker;
import m41.C37224b;
import o31.C37588a0;
import p163m0.C7047a;
import p228r0.C8034d;
import p341ge.bog.mobilebank.insurance.travelinsurance.presentation.fillinfo.TravelInsuranceFilledInfo;
import p341ge.bog.mobilebank.insurance.travelinsurance.presentation.provider.C24596d;
import p341ge.bog.mobilebank.rest.model.RetrofitClient;
import p341ge.bog.mobilebank.shared2.environment.TargetEnvironment;
import ue1.C43064a;
import ue1.C43075l;
import y71.C40030d;
import y71.C40034h;
import z71.C40179f;

/* renamed from: ge.bog.mobilebank.insurance.travelinsurance.presentation.provider.InsuranceProvidersFragment */
public final class InsuranceProvidersFragment extends C24593a {

    /* renamed from: l */
    public static final C24582a f63382l = new C24582a((DefaultConstructorMarker) null);

    /* renamed from: g */
    private C40179f f63383g;

    /* renamed from: h */
    public C24596d.C24603f f63384h;

    /* renamed from: i */
    public TargetEnvironment f63385i;

    /* renamed from: j */
    private final C41217g f63386j;
    /* access modifiers changed from: private */

    /* renamed from: k */
    public C20275b f63387k;

    /* renamed from: ge.bog.mobilebank.insurance.travelinsurance.presentation.provider.InsuranceProvidersFragment$a */
    public static final class C24582a {
        private C24582a() {
        }

        public /* synthetic */ C24582a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    /* renamed from: ge.bog.mobilebank.insurance.travelinsurance.presentation.provider.InsuranceProvidersFragment$b */
    static final class C24583b extends C41537m implements C43075l {

        /* renamed from: d */
        final /* synthetic */ InsuranceProvidersFragment f63388d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C24583b(InsuranceProvidersFragment insuranceProvidersFragment) {
            super(1);
            this.f63388d = insuranceProvidersFragment;
        }

        /* access modifiers changed from: private */
        /* renamed from: c */
        public static final void m78990c(InsuranceProvidersFragment insuranceProvidersFragment) {
            C41536l.m120489i(insuranceProvidersFragment, "this$0");
            RecyclerView.C1747p layoutManager = insuranceProvidersFragment.m78984n1().f95497f.getLayoutManager();
            if (layoutManager != null) {
                layoutManager.mo5197J1(0);
            }
        }

        /* renamed from: b */
        public final void mo62780b(List list) {
            C20275b k1 = this.f63388d.f63387k;
            if (k1 == null) {
                C41536l.m120506z("insuranceProvidersAdapter");
                k1 = null;
            }
            k1.mo6030j(list, new C24594b(this.f63388d));
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            mo62780b((List) obj);
            return C41238w.f97225a;
        }
    }

    /* renamed from: ge.bog.mobilebank.insurance.travelinsurance.presentation.provider.InsuranceProvidersFragment$c */
    static final class C24584c extends C41537m implements C43075l {

        /* renamed from: d */
        final /* synthetic */ InsuranceProvidersFragment f63389d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C24584c(InsuranceProvidersFragment insuranceProvidersFragment) {
            super(1);
            this.f63389d = insuranceProvidersFragment;
        }

        /* renamed from: a */
        public final void mo62781a(String str) {
            C41536l.m120489i(str, "it");
            this.f63389d.m78983m1(str);
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            mo62781a((String) obj);
            return C41238w.f97225a;
        }
    }

    /* renamed from: ge.bog.mobilebank.insurance.travelinsurance.presentation.provider.InsuranceProvidersFragment$d */
    static final class C24585d extends C41537m implements C43075l {

        /* renamed from: d */
        final /* synthetic */ InsuranceProvidersFragment f63390d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C24585d(InsuranceProvidersFragment insuranceProvidersFragment) {
            super(1);
            this.f63390d = insuranceProvidersFragment;
        }

        /* renamed from: a */
        public final void mo62782a(TravelInsuranceFilledInfo travelInsuranceFilledInfo) {
            C41536l.m120489i(travelInsuranceFilledInfo, "filledInfo");
            C8034d.m30522a(this.f63390d).mo22118M(C40030d.action_InsuranceProvidersFragment_to_insuranceSummaryFragment, C0908e.m3336b(C41233s.m119492a(this.f63390d.getString(C40034h.arg_filled_info), travelInsuranceFilledInfo)));
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            mo62782a((TravelInsuranceFilledInfo) obj);
            return C41238w.f97225a;
        }
    }

    /* renamed from: ge.bog.mobilebank.insurance.travelinsurance.presentation.provider.InsuranceProvidersFragment$e */
    static final class C24586e implements C1645y, C41532h {

        /* renamed from: a */
        private final /* synthetic */ C43075l f63391a;

        C24586e(C43075l lVar) {
            C41536l.m120489i(lVar, "function");
            this.f63391a = lVar;
        }

        public final boolean equals(Object obj) {
            if (!(obj instanceof C1645y) || !(obj instanceof C41532h)) {
                return false;
            }
            return C41536l.m120484d(getFunctionDelegate(), ((C41532h) obj).getFunctionDelegate());
        }

        public final C41212c getFunctionDelegate() {
            return this.f63391a;
        }

        public final int hashCode() {
            return getFunctionDelegate().hashCode();
        }

        public final /* synthetic */ void onChanged(Object obj) {
            this.f63391a.invoke(obj);
        }
    }

    /* renamed from: ge.bog.mobilebank.insurance.travelinsurance.presentation.provider.InsuranceProvidersFragment$f */
    public static final class C24587f extends C41537m implements C43064a {

        /* renamed from: d */
        final /* synthetic */ Fragment f63392d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C24587f(Fragment fragment) {
            super(0);
            this.f63392d = fragment;
        }

        public final Fragment invoke() {
            return this.f63392d;
        }
    }

    /* renamed from: ge.bog.mobilebank.insurance.travelinsurance.presentation.provider.InsuranceProvidersFragment$g */
    public static final class C24588g extends C41537m implements C43064a {

        /* renamed from: d */
        final /* synthetic */ C43064a f63393d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C24588g(C43064a aVar) {
            super(0);
            this.f63393d = aVar;
        }

        public final C1638u0 invoke() {
            return (C1638u0) this.f63393d.invoke();
        }
    }

    /* renamed from: ge.bog.mobilebank.insurance.travelinsurance.presentation.provider.InsuranceProvidersFragment$h */
    public static final class C24589h extends C41537m implements C43064a {

        /* renamed from: d */
        final /* synthetic */ C41217g f63394d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C24589h(C41217g gVar) {
            super(0);
            this.f63394d = gVar;
        }

        public final C1636t0 invoke() {
            C1636t0 viewModelStore = C1514j0.m5375d(this.f63394d).getViewModelStore();
            C41536l.m120488h(viewModelStore, "owner.viewModelStore");
            return viewModelStore;
        }
    }

    /* renamed from: ge.bog.mobilebank.insurance.travelinsurance.presentation.provider.InsuranceProvidersFragment$i */
    public static final class C24590i extends C41537m implements C43064a {

        /* renamed from: d */
        final /* synthetic */ C43064a f63395d;

        /* renamed from: e */
        final /* synthetic */ C41217g f63396e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C24590i(C43064a aVar, C41217g gVar) {
            super(0);
            this.f63395d = aVar;
            this.f63396e = gVar;
        }

        public final C7047a invoke() {
            C7047a aVar;
            C43064a aVar2 = this.f63395d;
            if (aVar2 != null && (aVar = (C7047a) aVar2.invoke()) != null) {
                return aVar;
            }
            C1638u0 a = C1514j0.m5375d(this.f63396e);
            C1591i iVar = a instanceof C1591i ? (C1591i) a : null;
            C7047a defaultViewModelCreationExtras = iVar != null ? iVar.getDefaultViewModelCreationExtras() : null;
            return defaultViewModelCreationExtras == null ? C7047a.C7048a.f20987b : defaultViewModelCreationExtras;
        }
    }

    /* renamed from: ge.bog.mobilebank.insurance.travelinsurance.presentation.provider.InsuranceProvidersFragment$j */
    static final class C24591j extends C41537m implements C43064a {

        /* renamed from: d */
        final /* synthetic */ InsuranceProvidersFragment f63397d;

        /* renamed from: ge.bog.mobilebank.insurance.travelinsurance.presentation.provider.InsuranceProvidersFragment$j$a */
        static final class C24592a extends C41537m implements C43064a {

            /* renamed from: d */
            final /* synthetic */ InsuranceProvidersFragment f63398d;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            C24592a(InsuranceProvidersFragment insuranceProvidersFragment) {
                super(0);
                this.f63398d = insuranceProvidersFragment;
            }

            /* renamed from: b */
            public final C24596d invoke() {
                TravelInsuranceFilledInfo travelInsuranceFilledInfo;
                C24596d.C24603f p1 = this.f63398d.mo62779p1();
                Bundle arguments = this.f63398d.getArguments();
                if (arguments != null) {
                    travelInsuranceFilledInfo = (TravelInsuranceFilledInfo) arguments.getParcelable(this.f63398d.getString(C40034h.arg_filled_info));
                } else {
                    travelInsuranceFilledInfo = null;
                }
                C41536l.m120486f(travelInsuranceFilledInfo);
                return p1.mo32779a(travelInsuranceFilledInfo);
            }
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C24591j(InsuranceProvidersFragment insuranceProvidersFragment) {
            super(0);
            this.f63397d = insuranceProvidersFragment;
        }

        public final C1620q0.C1624b invoke() {
            return C37588a0.f90326a.mo90779a(new C24592a(this.f63397d));
        }
    }

    public InsuranceProvidersFragment() {
        C24591j jVar = new C24591j(this);
        C41217g a = C41219i.m119469a(C41222k.NONE, new C24588g(new C24587f(this)));
        this.f63386j = C1514j0.m5374c(this, C41520a0.m120436b(C24596d.class), new C24589h(a), new C24590i((C43064a) null, a), jVar);
    }

    /* renamed from: l1 */
    private final void m78982l1() {
        C24596d q1 = m78985q1();
        q1.mo62787Aw().mo4819k(getViewLifecycleOwner(), new C24586e(new C24583b(this)));
        LiveData yw = q1.mo62790yw();
        C1619q viewLifecycleOwner = getViewLifecycleOwner();
        C41536l.m120488h(viewLifecycleOwner, "viewLifecycleOwner");
        C37224b.m109963b(yw, viewLifecycleOwner, new C24584c(this));
        LiveData zw = q1.mo62791zw();
        C1619q viewLifecycleOwner2 = getViewLifecycleOwner();
        C41536l.m120488h(viewLifecycleOwner2, "viewLifecycleOwner");
        C37224b.m109963b(zw, viewLifecycleOwner2, new C24585d(this));
    }

    /* access modifiers changed from: private */
    /* renamed from: m1 */
    public final void m78983m1(String str) {
        String rbMiddleware = mo62778o1().getRbMiddleware();
        C32303f.m95195f(RetrofitClient.populateUrlWithExtraData(rbMiddleware + "?" + str), requireActivity(), "Insurance Details.PDF", "application/pdf");
    }

    /* access modifiers changed from: private */
    /* renamed from: n1 */
    public final C40179f m78984n1() {
        C40179f fVar = this.f63383g;
        C41536l.m120486f(fVar);
        return fVar;
    }

    /* renamed from: q1 */
    private final C24596d m78985q1() {
        return (C24596d) this.f63386j.getValue();
    }

    /* renamed from: r1 */
    private final void m78986r1() {
        C40179f n1 = m78984n1();
        n1.f95496e.setProgress(100.0f);
        n1.f95498g.setProgress(50.0f);
    }

    /* renamed from: o1 */
    public final TargetEnvironment mo62778o1() {
        TargetEnvironment targetEnvironment = this.f63385i;
        if (targetEnvironment != null) {
            return targetEnvironment;
        }
        C41536l.m120506z("environment");
        return null;
    }

    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        C41536l.m120489i(layoutInflater, "inflater");
        this.f63383g = C40179f.m116424d(layoutInflater, viewGroup, false);
        LinearLayout c = m78984n1().mo3946b();
        C41536l.m120488h(c, "binding.root");
        return c;
    }

    public void onDestroyView() {
        super.onDestroyView();
        this.f63383g = null;
    }

    public void onViewCreated(View view, Bundle bundle) {
        C41536l.m120489i(view, "view");
        C40179f n1 = m78984n1();
        super.onViewCreated(view, bundle);
        refreshHeaderText(C32343x.m95388F("text.insurance.product.type.TRI", new Object[0]));
        C20275b bVar = new C20275b(m78985q1());
        this.f63387k = bVar;
        n1.f95497f.setAdapter(bVar);
        n1.f95497f.setItemAnimator((RecyclerView.C1742m) null);
        m78986r1();
        m78982l1();
    }

    /* renamed from: p1 */
    public final C24596d.C24603f mo62779p1() {
        C24596d.C24603f fVar = this.f63384h;
        if (fVar != null) {
            return fVar;
        }
        C41536l.m120506z("factory");
        return null;
    }
}
