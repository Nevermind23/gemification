package c90;

import a90.C19208g;
import android.app.Dialog;
import android.content.DialogInterface;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import androidx.cardview.widget.CardView;
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
import androidx.recyclerview.widget.RecyclerView;
import b41.C31128a;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import com.google.android.material.bottomsheet.C4956a;
import g91.C32343x;
import g91.C32355x0;
import h80.C24899f;
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
import o90.C26861t1;
import p163m0.C7047a;
import p341ge.bog.designsystem.components.pagedescription.PageDescriptionView;
import p341ge.bog.mobilebank.cleanarch.lookup.presenttation.model.LookupUiModel;
import p341ge.bog.mobilebank.cleanarch.presentation.common.C21481a;
import ue1.C43064a;
import ue1.C43075l;

/* renamed from: c90.g0 */
public final class C19590g0 extends C19608j {

    /* renamed from: P */
    public static final C19591a f53892P = new C19591a((DefaultConstructorMarker) null);

    /* renamed from: K */
    public C26861t1.C26867c f53893K;

    /* renamed from: L */
    private C24899f f53894L;

    /* renamed from: M */
    private final C41217g f53895M;
    /* access modifiers changed from: private */

    /* renamed from: N */
    public final C19208g f53896N = new C19208g(new C19592b(this));

    /* renamed from: O */
    private String f53897O = C32343x.m95388F("CLA.page.II.add.income.position.search.header", new Object[0]);

    /* renamed from: c90.g0$a */
    public static final class C19591a {
        private C19591a() {
        }

        public /* synthetic */ C19591a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* renamed from: a */
        public final C19590g0 mo47818a(LookupUiModel lookupUiModel) {
            C19590g0 g0Var = new C19590g0();
            g0Var.setArguments(C0908e.m3336b(C41233s.m119492a("EXTRA_POSITION", lookupUiModel)));
            return g0Var;
        }
    }

    /* renamed from: c90.g0$b */
    static final class C19592b extends C41537m implements C43075l {

        /* renamed from: d */
        final /* synthetic */ C19590g0 f53898d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C19592b(C19590g0 g0Var) {
            super(1);
            this.f53898d = g0Var;
        }

        /* renamed from: a */
        public final void mo47819a(LookupUiModel lookupUiModel) {
            C41536l.m120489i(lookupUiModel, "position");
            this.f53898d.m65228m2().mo66160mw().mo66155l3(lookupUiModel);
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            mo47819a((LookupUiModel) obj);
            return C41238w.f97225a;
        }
    }

    /* renamed from: c90.g0$c */
    static final class C19593c extends C41537m implements C43075l {

        /* renamed from: d */
        final /* synthetic */ C19590g0 f53899d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C19593c(C19590g0 g0Var) {
            super(1);
            this.f53899d = g0Var;
        }

        /* renamed from: a */
        public final void mo47820a(C31128a aVar) {
            if (aVar instanceof C31128a.C31130b) {
                this.f53899d.m65230o2(true);
            } else if (aVar instanceof C31128a.C31131c) {
                this.f53899d.m65230o2(false);
            } else if (aVar instanceof C31128a.C31129a) {
                this.f53899d.m65230o2(false);
                CardView cardView = this.f53899d.m65227k2().f63931i;
                C41536l.m120488h(cardView, "binding.retryButtonContainer");
                C32343x.m95447f1(cardView);
                this.f53899d.handleError(((C31128a.C31129a) aVar).mo71342c());
            }
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            mo47820a((C31128a) obj);
            return C41238w.f97225a;
        }
    }

    /* renamed from: c90.g0$d */
    static final class C19594d extends C41537m implements C43075l {

        /* renamed from: d */
        final /* synthetic */ C19590g0 f53900d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C19594d(C19590g0 g0Var) {
            super(1);
            this.f53900d = g0Var;
        }

        /* renamed from: a */
        public final void mo47821a(List list) {
            this.f53900d.f53896N.mo6029i(list);
            PageDescriptionView pageDescriptionView = this.f53900d.m65227k2().f63927e;
            C41536l.m120488h(pageDescriptionView, "binding.emptyHint");
            C32343x.m95483r1(pageDescriptionView, list.isEmpty(), false, 2, (Object) null);
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            mo47821a((List) obj);
            return C41238w.f97225a;
        }
    }

    /* renamed from: c90.g0$e */
    static final class C19595e extends C41537m implements C43075l {

        /* renamed from: d */
        final /* synthetic */ C19590g0 f53901d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C19595e(C19590g0 g0Var) {
            super(1);
            this.f53901d = g0Var;
        }

        /* renamed from: a */
        public final void mo47822a(LookupUiModel lookupUiModel) {
            C41536l.m120489i(lookupUiModel, "selectedPosition");
            if (this.f53901d.getActivity() != null) {
                C19590g0 g0Var = this.f53901d;
                C1533o.m5445b(g0Var, "SELECT_INCOME_POSITION_REQUEST_KEY", C0908e.m3336b(C41233s.m119492a("SELECT_INCOME_POSITION_RESULT_KEY", lookupUiModel)));
                g0Var.mo4577k1();
            }
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            mo47822a((LookupUiModel) obj);
            return C41238w.f97225a;
        }
    }

    /* renamed from: c90.g0$f */
    static final class C19596f implements C1645y, C41532h {

        /* renamed from: a */
        private final /* synthetic */ C43075l f53902a;

        C19596f(C43075l lVar) {
            C41536l.m120489i(lVar, "function");
            this.f53902a = lVar;
        }

        public final boolean equals(Object obj) {
            if (!(obj instanceof C1645y) || !(obj instanceof C41532h)) {
                return false;
            }
            return C41536l.m120484d(getFunctionDelegate(), ((C41532h) obj).getFunctionDelegate());
        }

        public final C41212c getFunctionDelegate() {
            return this.f53902a;
        }

        public final int hashCode() {
            return getFunctionDelegate().hashCode();
        }

        public final /* synthetic */ void onChanged(Object obj) {
            this.f53902a.invoke(obj);
        }
    }

    /* renamed from: c90.g0$g */
    static final class C19597g extends C41537m implements C43075l {

        /* renamed from: d */
        final /* synthetic */ C19590g0 f53903d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C19597g(C19590g0 g0Var) {
            super(1);
            this.f53903d = g0Var;
        }

        /* renamed from: a */
        public final void mo47825a(String str) {
            C41536l.m120489i(str, "query");
            this.f53903d.m65228m2().mo66160mw().mo66154Y2(str);
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            mo47825a((String) obj);
            return C41238w.f97225a;
        }
    }

    /* renamed from: c90.g0$h */
    public static final class C19598h extends C41537m implements C43064a {

        /* renamed from: d */
        final /* synthetic */ Fragment f53904d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C19598h(Fragment fragment) {
            super(0);
            this.f53904d = fragment;
        }

        public final Fragment invoke() {
            return this.f53904d;
        }
    }

    /* renamed from: c90.g0$i */
    public static final class C19599i extends C41537m implements C43064a {

        /* renamed from: d */
        final /* synthetic */ C43064a f53905d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C19599i(C43064a aVar) {
            super(0);
            this.f53905d = aVar;
        }

        public final C1638u0 invoke() {
            return (C1638u0) this.f53905d.invoke();
        }
    }

    /* renamed from: c90.g0$j */
    public static final class C19600j extends C41537m implements C43064a {

        /* renamed from: d */
        final /* synthetic */ C41217g f53906d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C19600j(C41217g gVar) {
            super(0);
            this.f53906d = gVar;
        }

        public final C1636t0 invoke() {
            C1636t0 viewModelStore = C1514j0.m5375d(this.f53906d).getViewModelStore();
            C41536l.m120488h(viewModelStore, "owner.viewModelStore");
            return viewModelStore;
        }
    }

    /* renamed from: c90.g0$k */
    public static final class C19601k extends C41537m implements C43064a {

        /* renamed from: d */
        final /* synthetic */ C43064a f53907d;

        /* renamed from: e */
        final /* synthetic */ C41217g f53908e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C19601k(C43064a aVar, C41217g gVar) {
            super(0);
            this.f53907d = aVar;
            this.f53908e = gVar;
        }

        public final C7047a invoke() {
            C7047a aVar;
            C43064a aVar2 = this.f53907d;
            if (aVar2 != null && (aVar = (C7047a) aVar2.invoke()) != null) {
                return aVar;
            }
            C1638u0 a = C1514j0.m5375d(this.f53908e);
            C1591i iVar = a instanceof C1591i ? (C1591i) a : null;
            C7047a defaultViewModelCreationExtras = iVar != null ? iVar.getDefaultViewModelCreationExtras() : null;
            return defaultViewModelCreationExtras == null ? C7047a.C7048a.f20987b : defaultViewModelCreationExtras;
        }
    }

    /* renamed from: c90.g0$l */
    static final class C19602l extends C41537m implements C43064a {

        /* renamed from: d */
        final /* synthetic */ C19590g0 f53909d;

        /* renamed from: c90.g0$l$a */
        static final class C19603a extends C41537m implements C43064a {

            /* renamed from: d */
            final /* synthetic */ C19590g0 f53910d;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            C19603a(C19590g0 g0Var) {
                super(0);
                this.f53910d = g0Var;
            }

            /* renamed from: b */
            public final C26861t1 invoke() {
                C26861t1.C26867c l2 = this.f53910d.mo47817l2();
                Bundle arguments = this.f53910d.getArguments();
                return l2.mo32795a(arguments != null ? (LookupUiModel) arguments.getParcelable("EXTRA_POSITION") : null);
            }
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C19602l(C19590g0 g0Var) {
            super(0);
            this.f53909d = g0Var;
        }

        public final C1620q0.C1624b invoke() {
            return C37588a0.f90326a.mo90779a(new C19603a(this.f53909d));
        }
    }

    public C19590g0() {
        C19602l lVar = new C19602l(this);
        C41217g a = C41219i.m119469a(C41222k.NONE, new C19599i(new C19598h(this)));
        this.f53895M = C1514j0.m5374c(this, C41520a0.m120436b(C26861t1.class), new C19600j(a), new C19601k((C43064a) null, a), lVar);
    }

    /* access modifiers changed from: private */
    /* renamed from: k2 */
    public final C24899f m65227k2() {
        C24899f fVar = this.f53894L;
        C41536l.m120486f(fVar);
        return fVar;
    }

    /* access modifiers changed from: private */
    /* renamed from: m2 */
    public final C26861t1 m65228m2() {
        return (C26861t1) this.f53895M.getValue();
    }

    /* access modifiers changed from: private */
    /* renamed from: n2 */
    public static final void m65229n2(C19590g0 g0Var, DialogInterface dialogInterface) {
        C41536l.m120489i(g0Var, "this$0");
        View requireView = g0Var.requireView();
        C41536l.m120488h(requireView, "requireView()");
        ViewGroup.LayoutParams layoutParams = requireView.getLayoutParams();
        if (layoutParams != null) {
            layoutParams.height = g0Var.getResources().getDisplayMetrics().heightPixels - C32355x0.m95522m(g0Var.getContext());
            requireView.setLayoutParams(layoutParams);
            ViewParent parent = g0Var.m65227k2().mo3946b().getParent();
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
    /* renamed from: o2 */
    public final void m65230o2(boolean z) {
        CardView cardView = m65227k2().f63928f;
        C41536l.m120488h(cardView, "binding.progressBar");
        C32343x.m95483r1(cardView, z, false, 2, (Object) null);
    }

    private final void observeData() {
        m65228m2().mo66161nw().mo66156Bj().mo4819k(getViewLifecycleOwner(), new C19596f(new C19593c(this)));
        m65228m2().mo66161nw().mo66157El().mo4819k(getViewLifecycleOwner(), new C19596f(new C19594d(this)));
        LiveData h = m65228m2().mo66161nw().mo66158h();
        C1619q viewLifecycleOwner = getViewLifecycleOwner();
        C41536l.m120488h(viewLifecycleOwner, "viewLifecycleOwner");
        C37224b.m109963b(h, viewLifecycleOwner, new C19595e(this));
    }

    /* renamed from: p2 */
    private final void m65231p2() {
        C24899f k2 = m65227k2();
        k2.f63932j.setHint(C32343x.m95388F("CLA.page.II.add.income.position.search.filed.input", new Object[0]));
        k2.f63927e.setText(C32343x.m95388F("CLA.page.II.add.income.position.search.explanatory", new Object[0]));
        k2.f63929g.setItemAnimator((RecyclerView.C1742m) null);
        k2.f63929g.setAdapter(this.f53896N);
        k2.f63932j.setOnTextChangeListener(new C19597g(this));
        k2.f63930h.mo3946b().setOnClickListener(new C19588f0(k2, this));
    }

    /* access modifiers changed from: private */
    /* renamed from: q2 */
    public static final void m65232q2(C24899f fVar, C19590g0 g0Var, View view) {
        C41536l.m120489i(fVar, "$this_with");
        C41536l.m120489i(g0Var, "this$0");
        CardView cardView = fVar.f63931i;
        C41536l.m120488h(cardView, "retryButtonContainer");
        C32343x.m95455i0(cardView);
        C21481a.onRefresh$default(g0Var.m65228m2(), 0, 1, (Object) null);
    }

    /* renamed from: Q1 */
    public String mo26364Q1() {
        return this.f53897O;
    }

    /* renamed from: T1 */
    public void mo26367T1(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        C41536l.m120489i(layoutInflater, "inflater");
        C41536l.m120489i(viewGroup, "container");
        this.f53894L = C24899f.m79578d(layoutInflater, viewGroup, true);
    }

    /* renamed from: l2 */
    public final C26861t1.C26867c mo47817l2() {
        C26861t1.C26867c cVar = this.f53893K;
        if (cVar != null) {
            return cVar;
        }
        C41536l.m120506z("factory");
        return null;
    }

    public void onDestroyView() {
        super.onDestroyView();
        this.f53894L = null;
    }

    public void onViewCreated(View view, Bundle bundle) {
        C41536l.m120489i(view, "view");
        super.onViewCreated(view, bundle);
        observeData();
        m65231p2();
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
            aVar.setOnShowListener(new C19586e0(this));
        }
        return q1;
    }
}
