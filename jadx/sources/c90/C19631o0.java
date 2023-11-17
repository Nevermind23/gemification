package c90;

import a90.C19211i;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
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
import androidx.recyclerview.widget.C1806i;
import b41.C31128a;
import g91.C32343x;
import h80.C24898e;
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
import p045d.C5769a;
import p163m0.C7047a;
import p341ge.bog.mobilebank.cleanarch.lookup.presenttation.model.LookupUiModel;
import p341ge.bog.mobilebank.cleanarch.presentation.common.C21481a;
import p341ge.bog.mobilebank.consumerloanapplication.presentation.model.addincomes.FormData;
import p341ge.bog.mobilebank.consumerloanapplication.presentation.viewmodel.IncomeTypeViewModel$ViewModel;
import u70.C28605a;
import ue1.C43064a;
import ue1.C43075l;

/* renamed from: c90.o0 */
public final class C19631o0 extends C19624l {

    /* renamed from: O */
    public static final C19632a f53952O = new C19632a((DefaultConstructorMarker) null);

    /* renamed from: K */
    private C24898e f53953K;

    /* renamed from: L */
    private final C41217g f53954L;
    /* access modifiers changed from: private */

    /* renamed from: M */
    public final C19211i f53955M = new C19211i(new C19633b(this));

    /* renamed from: N */
    private String f53956N = C32343x.m95388F("CLA.page.II.add.income.sheet.header", new Object[0]);

    /* renamed from: c90.o0$a */
    public static final class C19632a {
        private C19632a() {
        }

        public /* synthetic */ C19632a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* renamed from: a */
        public final C19631o0 mo47840a() {
            return new C19631o0();
        }
    }

    /* renamed from: c90.o0$b */
    static final class C19633b extends C41537m implements C43075l {

        /* renamed from: d */
        final /* synthetic */ C19631o0 f53957d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C19633b(C19631o0 o0Var) {
            super(1);
            this.f53957d = o0Var;
        }

        /* renamed from: a */
        public final void mo47841a(LookupUiModel lookupUiModel) {
            C41536l.m120489i(lookupUiModel, "selectedIncomeType");
            this.f53957d.m65275k2().mo56292lw().mo56288E6(lookupUiModel);
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            mo47841a((LookupUiModel) obj);
            return C41238w.f97225a;
        }
    }

    /* renamed from: c90.o0$c */
    static final class C19634c extends C41537m implements C43075l {

        /* renamed from: d */
        final /* synthetic */ C19631o0 f53958d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C19634c(C19631o0 o0Var) {
            super(1);
            this.f53958d = o0Var;
        }

        /* renamed from: a */
        public final void mo47842a(C31128a aVar) {
            if (aVar instanceof C31128a.C31130b) {
                this.f53958d.m65276l2(true);
            } else if (aVar instanceof C31128a.C31131c) {
                this.f53958d.f53955M.mo6029i((List) ((C31128a.C31131c) aVar).mo71340a());
                this.f53958d.m65276l2(false);
            } else if (aVar instanceof C31128a.C31129a) {
                this.f53958d.m65276l2(false);
                CardView cardView = this.f53958d.m65274j2().f63925h;
                C41536l.m120488h(cardView, "binding.retryButtonContainer");
                C32343x.m95447f1(cardView);
                this.f53958d.handleError(((C31128a.C31129a) aVar).mo71342c());
            }
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            mo47842a((C31128a) obj);
            return C41238w.f97225a;
        }
    }

    /* renamed from: c90.o0$d */
    static final class C19635d extends C41537m implements C43075l {

        /* renamed from: d */
        final /* synthetic */ C19631o0 f53959d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C19635d(C19631o0 o0Var) {
            super(1);
            this.f53959d = o0Var;
        }

        /* renamed from: a */
        public final void mo47843a(FormData formData) {
            C41536l.m120489i(formData, "formData");
            if (this.f53959d.getActivity() != null) {
                C19631o0 o0Var = this.f53959d;
                C1533o.m5445b(o0Var, "SELECT_INCOME_TYPE_REQUEST_KEY", C0908e.m3336b(C41233s.m119492a("SELECT_INCOME_TYPE_RESULT_KEY", formData)));
                o0Var.mo4577k1();
            }
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            mo47843a((FormData) obj);
            return C41238w.f97225a;
        }
    }

    /* renamed from: c90.o0$e */
    static final class C19636e implements C1645y, C41532h {

        /* renamed from: a */
        private final /* synthetic */ C43075l f53960a;

        C19636e(C43075l lVar) {
            C41536l.m120489i(lVar, "function");
            this.f53960a = lVar;
        }

        public final boolean equals(Object obj) {
            if (!(obj instanceof C1645y) || !(obj instanceof C41532h)) {
                return false;
            }
            return C41536l.m120484d(getFunctionDelegate(), ((C41532h) obj).getFunctionDelegate());
        }

        public final C41212c getFunctionDelegate() {
            return this.f53960a;
        }

        public final int hashCode() {
            return getFunctionDelegate().hashCode();
        }

        public final /* synthetic */ void onChanged(Object obj) {
            this.f53960a.invoke(obj);
        }
    }

    /* renamed from: c90.o0$f */
    public static final class C19637f extends C41537m implements C43064a {

        /* renamed from: d */
        final /* synthetic */ Fragment f53961d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C19637f(Fragment fragment) {
            super(0);
            this.f53961d = fragment;
        }

        public final Fragment invoke() {
            return this.f53961d;
        }
    }

    /* renamed from: c90.o0$g */
    public static final class C19638g extends C41537m implements C43064a {

        /* renamed from: d */
        final /* synthetic */ C43064a f53962d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C19638g(C43064a aVar) {
            super(0);
            this.f53962d = aVar;
        }

        public final C1638u0 invoke() {
            return (C1638u0) this.f53962d.invoke();
        }
    }

    /* renamed from: c90.o0$h */
    public static final class C19639h extends C41537m implements C43064a {

        /* renamed from: d */
        final /* synthetic */ C41217g f53963d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C19639h(C41217g gVar) {
            super(0);
            this.f53963d = gVar;
        }

        public final C1636t0 invoke() {
            C1636t0 viewModelStore = C1514j0.m5375d(this.f53963d).getViewModelStore();
            C41536l.m120488h(viewModelStore, "owner.viewModelStore");
            return viewModelStore;
        }
    }

    /* renamed from: c90.o0$i */
    public static final class C19640i extends C41537m implements C43064a {

        /* renamed from: d */
        final /* synthetic */ C43064a f53964d;

        /* renamed from: e */
        final /* synthetic */ C41217g f53965e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C19640i(C43064a aVar, C41217g gVar) {
            super(0);
            this.f53964d = aVar;
            this.f53965e = gVar;
        }

        public final C7047a invoke() {
            C7047a aVar;
            C43064a aVar2 = this.f53964d;
            if (aVar2 != null && (aVar = (C7047a) aVar2.invoke()) != null) {
                return aVar;
            }
            C1638u0 a = C1514j0.m5375d(this.f53965e);
            C1591i iVar = a instanceof C1591i ? (C1591i) a : null;
            C7047a defaultViewModelCreationExtras = iVar != null ? iVar.getDefaultViewModelCreationExtras() : null;
            return defaultViewModelCreationExtras == null ? C7047a.C7048a.f20987b : defaultViewModelCreationExtras;
        }
    }

    /* renamed from: c90.o0$j */
    public static final class C19641j extends C41537m implements C43064a {

        /* renamed from: d */
        final /* synthetic */ Fragment f53966d;

        /* renamed from: e */
        final /* synthetic */ C41217g f53967e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C19641j(Fragment fragment, C41217g gVar) {
            super(0);
            this.f53966d = fragment;
            this.f53967e = gVar;
        }

        public final C1620q0.C1624b invoke() {
            C1620q0.C1624b bVar;
            C1638u0 a = C1514j0.m5375d(this.f53967e);
            C1591i iVar = a instanceof C1591i ? (C1591i) a : null;
            if (iVar == null || (bVar = iVar.getDefaultViewModelProviderFactory()) == null) {
                bVar = this.f53966d.getDefaultViewModelProviderFactory();
            }
            C41536l.m120488h(bVar, "(owner as? HasDefaultVie…tViewModelProviderFactory");
            return bVar;
        }
    }

    public C19631o0() {
        C41217g a = C41219i.m119469a(C41222k.NONE, new C19638g(new C19637f(this)));
        this.f53954L = C1514j0.m5374c(this, C41520a0.m120436b(IncomeTypeViewModel$ViewModel.class), new C19639h(a), new C19640i((C43064a) null, a), new C19641j(this, a));
    }

    /* access modifiers changed from: private */
    /* renamed from: j2 */
    public final C24898e m65274j2() {
        C24898e eVar = this.f53953K;
        C41536l.m120486f(eVar);
        return eVar;
    }

    /* access modifiers changed from: private */
    /* renamed from: k2 */
    public final IncomeTypeViewModel$ViewModel m65275k2() {
        return (IncomeTypeViewModel$ViewModel) this.f53954L.getValue();
    }

    /* access modifiers changed from: private */
    /* renamed from: l2 */
    public final void m65276l2(boolean z) {
        CardView cardView = m65274j2().f63922e;
        C41536l.m120488h(cardView, "binding.progressBar");
        C32343x.m95483r1(cardView, z, false, 2, (Object) null);
    }

    /* renamed from: m2 */
    private final void m65277m2() {
        C24898e j2 = m65274j2();
        Drawable b = C5769a.m23210b(j2.mo3946b().getContext(), C28605a.f72564m);
        if (b != null) {
            C41536l.m120488h(b, "requireNotNull(\n        …st_divider_1dp)\n        )");
            C1806i iVar = new C1806i(getContext(), 1);
            iVar.mo5985l(b);
            j2.f63923f.mo5351j(iVar);
            j2.f63923f.setAdapter(this.f53955M);
            j2.f63924g.mo3946b().setOnClickListener(new C19629n0(j2, this));
            return;
        }
        throw new IllegalArgumentException("Required value was null.".toString());
    }

    /* access modifiers changed from: private */
    /* renamed from: n2 */
    public static final void m65278n2(C24898e eVar, C19631o0 o0Var, View view) {
        C41536l.m120489i(eVar, "$this_with");
        C41536l.m120489i(o0Var, "this$0");
        CardView cardView = eVar.f63925h;
        C41536l.m120488h(cardView, "retryButtonContainer");
        C32343x.m95455i0(cardView);
        C21481a.onRefresh$default(o0Var.m65275k2(), 0, 1, (Object) null);
    }

    private final void observeData() {
        m65275k2().mo56293mw().mo56294o0().mo4819k(getViewLifecycleOwner(), new C19636e(new C19634c(this)));
        LiveData h = m65275k2().mo56293mw().mo56289h();
        C1619q viewLifecycleOwner = getViewLifecycleOwner();
        C41536l.m120488h(viewLifecycleOwner, "viewLifecycleOwner");
        C37224b.m109963b(h, viewLifecycleOwner, new C19635d(this));
    }

    /* renamed from: Q1 */
    public String mo26364Q1() {
        return this.f53956N;
    }

    /* renamed from: T1 */
    public void mo26367T1(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        C41536l.m120489i(layoutInflater, "inflater");
        C41536l.m120489i(viewGroup, "container");
        this.f53953K = C24898e.m79574d(layoutInflater, viewGroup, true);
    }

    public void onDestroyView() {
        super.onDestroyView();
        this.f53953K = null;
    }

    public void onViewCreated(View view, Bundle bundle) {
        C41536l.m120489i(view, "view");
        super.onViewCreated(view, bundle);
        m65277m2();
        observeData();
    }
}
