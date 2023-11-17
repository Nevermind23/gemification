package c90;

import a90.C19214k;
import android.app.Dialog;
import android.content.DialogInterface;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import androidx.core.p016os.C0908e;
import androidx.fragment.app.C1514j0;
import androidx.fragment.app.C1533o;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.C1591i;
import androidx.lifecycle.C1619q;
import androidx.lifecycle.C1620q0;
import androidx.lifecycle.C1636t0;
import androidx.lifecycle.C1638u0;
import androidx.lifecycle.C1645y;
import androidx.lifecycle.LiveData;
import b41.C31128a;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import com.google.android.material.bottomsheet.C4956a;
import g91.C32343x;
import g91.C32355x0;
import h80.C24896d;
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
import o90.C26771a2;
import p163m0.C7047a;
import p341ge.bog.designsystem.components.pagedescription.PageDescriptionView;
import p341ge.bog.mobilebank.consumerloanapplication.presentation.model.addincomes.OrganizationUiModel;
import ue1.C43064a;
import ue1.C43075l;

/* renamed from: c90.k0 */
public final class C19611k0 extends C19610k {

    /* renamed from: P */
    public static final C19612a f53924P = new C19612a((DefaultConstructorMarker) null);

    /* renamed from: K */
    public C26771a2.C26773b f53925K;

    /* renamed from: L */
    private C24896d f53926L;

    /* renamed from: M */
    private final C41217g f53927M;
    /* access modifiers changed from: private */

    /* renamed from: N */
    public final C19214k f53928N = new C19214k(new C19613b(this));

    /* renamed from: O */
    private String f53929O = C32343x.m95388F("CLA.page.II.add.income.organization.field.label", new Object[0]);

    /* renamed from: c90.k0$a */
    public static final class C19612a {
        private C19612a() {
        }

        public /* synthetic */ C19612a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* renamed from: a */
        public final C19611k0 mo47829a(OrganizationUiModel organizationUiModel) {
            C19611k0 k0Var = new C19611k0();
            k0Var.setArguments(C0908e.m3336b(C41233s.m119492a("EXTRA_ORGANIZATION", organizationUiModel)));
            return k0Var;
        }
    }

    /* renamed from: c90.k0$b */
    static final class C19613b extends C41537m implements C43075l {

        /* renamed from: d */
        final /* synthetic */ C19611k0 f53930d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C19613b(C19611k0 k0Var) {
            super(1);
            this.f53930d = k0Var;
        }

        /* renamed from: a */
        public final void mo47830a(OrganizationUiModel organizationUiModel) {
            C41536l.m120489i(organizationUiModel, "organization");
            this.f53930d.m65252l2().mo66072yq(organizationUiModel);
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            mo47830a((OrganizationUiModel) obj);
            return C41238w.f97225a;
        }
    }

    /* renamed from: c90.k0$c */
    static final class C19614c extends C41537m implements C43075l {

        /* renamed from: d */
        final /* synthetic */ C19611k0 f53931d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C19614c(C19611k0 k0Var) {
            super(1);
            this.f53931d = k0Var;
        }

        /* renamed from: a */
        public final void mo47831a(C31128a aVar) {
            if (aVar instanceof C31128a.C31130b) {
                this.f53931d.m65254n2(true);
            } else if (aVar instanceof C31128a.C31131c) {
                this.f53931d.m65254n2(false);
                C31128a.C31131c cVar = (C31128a.C31131c) aVar;
                this.f53931d.f53928N.mo6029i((List) cVar.mo71340a());
                PageDescriptionView pageDescriptionView = this.f53931d.m65251j2().f63913e;
                C41536l.m120488h(pageDescriptionView, "binding.emptyHint");
                C32343x.m95483r1(pageDescriptionView, ((List) cVar.mo71340a()).isEmpty(), false, 2, (Object) null);
            } else if (aVar instanceof C31128a.C31129a) {
                this.f53931d.m65254n2(false);
                this.f53931d.handleError(((C31128a.C31129a) aVar).mo71342c());
            }
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            mo47831a((C31128a) obj);
            return C41238w.f97225a;
        }
    }

    /* renamed from: c90.k0$d */
    static final class C19615d extends C41537m implements C43075l {

        /* renamed from: d */
        final /* synthetic */ C19611k0 f53932d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C19615d(C19611k0 k0Var) {
            super(1);
            this.f53932d = k0Var;
        }

        /* renamed from: a */
        public final void mo47832a(OrganizationUiModel organizationUiModel) {
            C41536l.m120489i(organizationUiModel, "selectedPosition");
            if (this.f53932d.getActivity() != null) {
                C19611k0 k0Var = this.f53932d;
                C1533o.m5445b(k0Var, "SELECT_INCOME_ORGANIZATION_REQUEST_KEY", C0908e.m3336b(C41233s.m119492a("SELECT_INCOME_ORGANIZATION_RESULT_KEY", organizationUiModel)));
                k0Var.mo4577k1();
            }
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            mo47832a((OrganizationUiModel) obj);
            return C41238w.f97225a;
        }
    }

    /* renamed from: c90.k0$e */
    static final class C19616e implements C1645y, C41532h {

        /* renamed from: a */
        private final /* synthetic */ C43075l f53933a;

        C19616e(C43075l lVar) {
            C41536l.m120489i(lVar, "function");
            this.f53933a = lVar;
        }

        public final boolean equals(Object obj) {
            if (!(obj instanceof C1645y) || !(obj instanceof C41532h)) {
                return false;
            }
            return C41536l.m120484d(getFunctionDelegate(), ((C41532h) obj).getFunctionDelegate());
        }

        public final C41212c getFunctionDelegate() {
            return this.f53933a;
        }

        public final int hashCode() {
            return getFunctionDelegate().hashCode();
        }

        public final /* synthetic */ void onChanged(Object obj) {
            this.f53933a.invoke(obj);
        }
    }

    /* renamed from: c90.k0$f */
    static final class C19617f extends C41537m implements C43075l {

        /* renamed from: d */
        final /* synthetic */ C19611k0 f53934d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C19617f(C19611k0 k0Var) {
            super(1);
            this.f53934d = k0Var;
        }

        /* renamed from: a */
        public final void mo47835a(String str) {
            C41536l.m120489i(str, "it");
            this.f53934d.m65252l2().mo66066Y2(str);
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            mo47835a((String) obj);
            return C41238w.f97225a;
        }
    }

    /* renamed from: c90.k0$g */
    public static final class C19618g extends C41537m implements C43064a {

        /* renamed from: d */
        final /* synthetic */ Fragment f53935d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C19618g(Fragment fragment) {
            super(0);
            this.f53935d = fragment;
        }

        public final Fragment invoke() {
            return this.f53935d;
        }
    }

    /* renamed from: c90.k0$h */
    public static final class C19619h extends C41537m implements C43064a {

        /* renamed from: d */
        final /* synthetic */ C43064a f53936d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C19619h(C43064a aVar) {
            super(0);
            this.f53936d = aVar;
        }

        public final C1638u0 invoke() {
            return (C1638u0) this.f53936d.invoke();
        }
    }

    /* renamed from: c90.k0$i */
    public static final class C19620i extends C41537m implements C43064a {

        /* renamed from: d */
        final /* synthetic */ C41217g f53937d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C19620i(C41217g gVar) {
            super(0);
            this.f53937d = gVar;
        }

        public final C1636t0 invoke() {
            C1636t0 viewModelStore = C1514j0.m5375d(this.f53937d).getViewModelStore();
            C41536l.m120488h(viewModelStore, "owner.viewModelStore");
            return viewModelStore;
        }
    }

    /* renamed from: c90.k0$j */
    public static final class C19621j extends C41537m implements C43064a {

        /* renamed from: d */
        final /* synthetic */ C43064a f53938d;

        /* renamed from: e */
        final /* synthetic */ C41217g f53939e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C19621j(C43064a aVar, C41217g gVar) {
            super(0);
            this.f53938d = aVar;
            this.f53939e = gVar;
        }

        public final C7047a invoke() {
            C7047a aVar;
            C43064a aVar2 = this.f53938d;
            if (aVar2 != null && (aVar = (C7047a) aVar2.invoke()) != null) {
                return aVar;
            }
            C1638u0 a = C1514j0.m5375d(this.f53939e);
            C1591i iVar = a instanceof C1591i ? (C1591i) a : null;
            C7047a defaultViewModelCreationExtras = iVar != null ? iVar.getDefaultViewModelCreationExtras() : null;
            return defaultViewModelCreationExtras == null ? C7047a.C7048a.f20987b : defaultViewModelCreationExtras;
        }
    }

    /* renamed from: c90.k0$k */
    static final class C19622k extends C41537m implements C43064a {

        /* renamed from: d */
        final /* synthetic */ C19611k0 f53940d;

        /* renamed from: c90.k0$k$a */
        static final class C19623a extends C41537m implements C43064a {

            /* renamed from: d */
            final /* synthetic */ C19611k0 f53941d;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            C19623a(C19611k0 k0Var) {
                super(0);
                this.f53941d = k0Var;
            }

            /* renamed from: b */
            public final C26771a2 invoke() {
                C26771a2.C26773b k2 = this.f53941d.mo47828k2();
                Bundle arguments = this.f53941d.getArguments();
                return k2.mo32798a(arguments != null ? (OrganizationUiModel) arguments.getParcelable("EXTRA_ORGANIZATION") : null);
            }
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C19622k(C19611k0 k0Var) {
            super(0);
            this.f53940d = k0Var;
        }

        public final C1620q0.C1624b invoke() {
            return C37588a0.f90326a.mo90779a(new C19623a(this.f53940d));
        }
    }

    public C19611k0() {
        C19622k kVar = new C19622k(this);
        C41217g a = C41219i.m119469a(C41222k.NONE, new C19619h(new C19618g(this)));
        this.f53927M = C1514j0.m5374c(this, C41520a0.m120436b(C26771a2.class), new C19620i(a), new C19621j((C43064a) null, a), kVar);
    }

    /* access modifiers changed from: private */
    /* renamed from: j2 */
    public final C24896d m65251j2() {
        C24896d dVar = this.f53926L;
        C41536l.m120486f(dVar);
        return dVar;
    }

    /* access modifiers changed from: private */
    /* renamed from: l2 */
    public final C26771a2 m65252l2() {
        return (C26771a2) this.f53927M.getValue();
    }

    /* access modifiers changed from: private */
    /* renamed from: m2 */
    public static final void m65253m2(C19611k0 k0Var, DialogInterface dialogInterface) {
        C41536l.m120489i(k0Var, "this$0");
        View requireView = k0Var.requireView();
        C41536l.m120488h(requireView, "requireView()");
        ViewGroup.LayoutParams layoutParams = requireView.getLayoutParams();
        if (layoutParams != null) {
            layoutParams.height = k0Var.getResources().getDisplayMetrics().heightPixels - C32355x0.m95522m(k0Var.getContext());
            requireView.setLayoutParams(layoutParams);
            ViewParent parent = k0Var.m65251j2().mo3946b().getParent();
            C41536l.m120487g(parent, "null cannot be cast to non-null type android.view.View");
            View view = (View) parent;
            ViewGroup.LayoutParams layoutParams2 = view.getLayoutParams();
            if (layoutParams2 != null) {
                layoutParams2.height = -1;
                view.setLayoutParams(layoutParams2);
                C41536l.m120487g(dialogInterface, "null cannot be cast to non-null type com.google.android.material.bottomsheet.BottomSheetDialog");
                BottomSheetBehavior n = ((C4956a) dialogInterface).mo15614n();
                n.mo15579I0(3);
                n.mo15578H0(true);
                n.mo15596w0(false);
                return;
            }
            throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.LayoutParams");
        }
        throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.LayoutParams");
    }

    /* access modifiers changed from: private */
    /* renamed from: n2 */
    public final void m65254n2(boolean z) {
        m65251j2().f63914f.setVisibility(z ? 0 : 8);
    }

    /* renamed from: o2 */
    private final void m65255o2() {
        C24896d j2 = m65251j2();
        j2.f63915g.setAdapter(this.f53928N);
        j2.f63916h.setHint(C32343x.m95388F("CLA.page.II.add.income.organization.search.eg", new Object[0]));
        j2.f63913e.setText(C32343x.m95388F("CLA.page.II.add.income.organization.search.explanatory", new Object[0]));
        j2.f63916h.setOnTextChangeListener(new C19617f(this));
    }

    private final void observeData() {
        m65252l2().mo66071mw().mo66067ej().mo4819k(getViewLifecycleOwner(), new C19616e(new C19614c(this)));
        LiveData h = m65252l2().mo66071mw().mo66068h();
        C1619q viewLifecycleOwner = getViewLifecycleOwner();
        C41536l.m120488h(viewLifecycleOwner, "viewLifecycleOwner");
        C37224b.m109963b(h, viewLifecycleOwner, new C19615d(this));
    }

    /* renamed from: Q1 */
    public String mo26364Q1() {
        return this.f53929O;
    }

    /* renamed from: T1 */
    public void mo26367T1(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        C41536l.m120489i(layoutInflater, "inflater");
        C41536l.m120489i(viewGroup, "container");
        this.f53926L = C24896d.m79566d(layoutInflater, viewGroup, true);
    }

    /* renamed from: k2 */
    public final C26771a2.C26773b mo47828k2() {
        C26771a2.C26773b bVar = this.f53925K;
        if (bVar != null) {
            return bVar;
        }
        C41536l.m120506z("factory");
        return null;
    }

    public void onDestroyView() {
        super.onDestroyView();
        this.f53926L = null;
    }

    public void onViewCreated(View view, Bundle bundle) {
        C41536l.m120489i(view, "view");
        super.onViewCreated(view, bundle);
        m65255o2();
        observeData();
    }

    /* renamed from: q1 */
    public Dialog mo710q1(Bundle bundle) {
        C4956a aVar;
        Dialog q1 = super.mo710q1(bundle);
        if (q1 instanceof C4956a) {
            aVar = (C4956a) q1;
        } else {
            aVar = null;
        }
        if (aVar != null) {
            aVar.setOnShowListener(new C19609j0(this));
        }
        return q1;
    }
}
