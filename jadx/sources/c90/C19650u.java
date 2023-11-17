package c90;

import a90.C19205e;
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
import h80.C24892b;
import he1.C41212c;
import he1.C41217g;
import he1.C41222k;
import he1.C41233s;
import he1.C41238w;
import java.util.List;
import kotlin.jvm.internal.C41520a0;
import kotlin.jvm.internal.C41532h;
import kotlin.jvm.internal.C41535k;
import kotlin.jvm.internal.C41536l;
import kotlin.jvm.internal.C41537m;
import kotlin.jvm.internal.DefaultConstructorMarker;
import m41.C37224b;
import o31.C37588a0;
import o90.C26809g1;
import p163m0.C7047a;
import p341ge.bog.mobilebank.cleanarch.presentation.common.C21481a;
import p341ge.bog.mobilebank.consumerloanapplication.domain.lookup.model.Country;
import ue1.C43064a;
import ue1.C43075l;

/* renamed from: c90.u */
public final class C19650u extends C19604h {

    /* renamed from: P */
    public static final C19651a f53978P = new C19651a((DefaultConstructorMarker) null);

    /* renamed from: K */
    public C26809g1.C26814c f53979K;

    /* renamed from: L */
    private C24892b f53980L;

    /* renamed from: M */
    private final C41217g f53981M;
    /* access modifiers changed from: private */

    /* renamed from: N */
    public final C19205e f53982N = new C19205e(new C19652b(this));

    /* renamed from: O */
    private String f53983O = C32343x.m95388F("CLA.page.II.add.income.country.search.header", new Object[0]);

    /* renamed from: c90.u$a */
    public static final class C19651a {
        private C19651a() {
        }

        public /* synthetic */ C19651a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* renamed from: a */
        public final C19650u mo47851a(Country country) {
            C19650u uVar = new C19650u();
            uVar.setArguments(C0908e.m3336b(C41233s.m119492a("EXTRA_COUNTRY", country)));
            return uVar;
        }
    }

    /* renamed from: c90.u$b */
    static final class C19652b extends C41537m implements C43075l {

        /* renamed from: d */
        final /* synthetic */ C19650u f53984d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C19652b(C19650u uVar) {
            super(1);
            this.f53984d = uVar;
        }

        /* renamed from: a */
        public final void mo47852a(Country country) {
            C41536l.m120489i(country, "country");
            this.f53984d.m65310m2().mo66115uu(country);
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            mo47852a((Country) obj);
            return C41238w.f97225a;
        }
    }

    /* renamed from: c90.u$c */
    static final class C19653c extends C41537m implements C43075l {

        /* renamed from: d */
        final /* synthetic */ C19650u f53985d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C19653c(C19650u uVar) {
            super(1);
            this.f53985d = uVar;
        }

        /* renamed from: a */
        public final void mo47853a(C31128a aVar) {
            if (aVar instanceof C31128a.C31130b) {
                this.f53985d.m65312o2(true);
            } else if (aVar instanceof C31128a.C31131c) {
                this.f53985d.m65312o2(false);
            } else if (aVar instanceof C31128a.C31129a) {
                this.f53985d.m65312o2(false);
                CardView cardView = this.f53985d.m65309k2().f63888h;
                C41536l.m120488h(cardView, "binding.retryButtonContainer");
                C32343x.m95447f1(cardView);
                this.f53985d.handleError(((C31128a.C31129a) aVar).mo71342c());
            }
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            mo47853a((C31128a) obj);
            return C41238w.f97225a;
        }
    }

    /* renamed from: c90.u$d */
    static final class C19654d extends C41537m implements C43075l {

        /* renamed from: d */
        final /* synthetic */ C19650u f53986d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C19654d(C19650u uVar) {
            super(1);
            this.f53986d = uVar;
        }

        /* renamed from: a */
        public final void mo47854a(List list) {
            this.f53986d.f53982N.mo6029i(list);
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            mo47854a((List) obj);
            return C41238w.f97225a;
        }
    }

    /* renamed from: c90.u$e */
    static final class C19655e extends C41537m implements C43075l {

        /* renamed from: d */
        final /* synthetic */ C19650u f53987d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C19655e(C19650u uVar) {
            super(1);
            this.f53987d = uVar;
        }

        /* renamed from: a */
        public final void mo47855a(Country country) {
            C41536l.m120489i(country, "selectedCountry");
            if (this.f53987d.getActivity() != null) {
                C19650u uVar = this.f53987d;
                C1533o.m5445b(uVar, "SELECT_INCOME_COUNTRY_REQUEST_KEY", C0908e.m3336b(C41233s.m119492a("SELECT_INCOME_COUNTRY_RESULT_KEY", country)));
                uVar.mo4577k1();
            }
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            mo47855a((Country) obj);
            return C41238w.f97225a;
        }
    }

    /* renamed from: c90.u$f */
    static final class C19656f implements C1645y, C41532h {

        /* renamed from: a */
        private final /* synthetic */ C43075l f53988a;

        C19656f(C43075l lVar) {
            C41536l.m120489i(lVar, "function");
            this.f53988a = lVar;
        }

        public final boolean equals(Object obj) {
            if (!(obj instanceof C1645y) || !(obj instanceof C41532h)) {
                return false;
            }
            return C41536l.m120484d(getFunctionDelegate(), ((C41532h) obj).getFunctionDelegate());
        }

        public final C41212c getFunctionDelegate() {
            return this.f53988a;
        }

        public final int hashCode() {
            return getFunctionDelegate().hashCode();
        }

        public final /* synthetic */ void onChanged(Object obj) {
            this.f53988a.invoke(obj);
        }
    }

    /* renamed from: c90.u$g */
    /* synthetic */ class C19657g extends C41535k implements C43075l {
        C19657g(Object obj) {
            super(1, obj, C26809g1.class, "search", "search(Ljava/lang/String;)V", 0);
        }

        /* renamed from: b */
        public final void mo47858b(String str) {
            C41536l.m120489i(str, "p0");
            ((C26809g1) this.receiver).mo66110Y2(str);
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            mo47858b((String) obj);
            return C41238w.f97225a;
        }
    }

    /* renamed from: c90.u$h */
    public static final class C19658h extends C41537m implements C43064a {

        /* renamed from: d */
        final /* synthetic */ Fragment f53989d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C19658h(Fragment fragment) {
            super(0);
            this.f53989d = fragment;
        }

        public final Fragment invoke() {
            return this.f53989d;
        }
    }

    /* renamed from: c90.u$i */
    public static final class C19659i extends C41537m implements C43064a {

        /* renamed from: d */
        final /* synthetic */ C43064a f53990d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C19659i(C43064a aVar) {
            super(0);
            this.f53990d = aVar;
        }

        public final C1638u0 invoke() {
            return (C1638u0) this.f53990d.invoke();
        }
    }

    /* renamed from: c90.u$j */
    public static final class C19660j extends C41537m implements C43064a {

        /* renamed from: d */
        final /* synthetic */ C41217g f53991d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C19660j(C41217g gVar) {
            super(0);
            this.f53991d = gVar;
        }

        public final C1636t0 invoke() {
            C1636t0 viewModelStore = C1514j0.m5375d(this.f53991d).getViewModelStore();
            C41536l.m120488h(viewModelStore, "owner.viewModelStore");
            return viewModelStore;
        }
    }

    /* renamed from: c90.u$k */
    public static final class C19661k extends C41537m implements C43064a {

        /* renamed from: d */
        final /* synthetic */ C43064a f53992d;

        /* renamed from: e */
        final /* synthetic */ C41217g f53993e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C19661k(C43064a aVar, C41217g gVar) {
            super(0);
            this.f53992d = aVar;
            this.f53993e = gVar;
        }

        public final C7047a invoke() {
            C7047a aVar;
            C43064a aVar2 = this.f53992d;
            if (aVar2 != null && (aVar = (C7047a) aVar2.invoke()) != null) {
                return aVar;
            }
            C1638u0 a = C1514j0.m5375d(this.f53993e);
            C1591i iVar = a instanceof C1591i ? (C1591i) a : null;
            C7047a defaultViewModelCreationExtras = iVar != null ? iVar.getDefaultViewModelCreationExtras() : null;
            return defaultViewModelCreationExtras == null ? C7047a.C7048a.f20987b : defaultViewModelCreationExtras;
        }
    }

    /* renamed from: c90.u$l */
    static final class C19662l extends C41537m implements C43064a {

        /* renamed from: d */
        final /* synthetic */ C19650u f53994d;

        /* renamed from: c90.u$l$a */
        static final class C19663a extends C41537m implements C43064a {

            /* renamed from: d */
            final /* synthetic */ C19650u f53995d;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            C19663a(C19650u uVar) {
                super(0);
                this.f53995d = uVar;
            }

            /* renamed from: b */
            public final C26809g1 invoke() {
                C26809g1.C26814c l2 = this.f53995d.mo47850l2();
                Bundle arguments = this.f53995d.getArguments();
                return l2.mo32790a(arguments != null ? (Country) arguments.getParcelable("EXTRA_COUNTRY") : null);
            }
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C19662l(C19650u uVar) {
            super(0);
            this.f53994d = uVar;
        }

        public final C1620q0.C1624b invoke() {
            return C37588a0.f90326a.mo90779a(new C19663a(this.f53994d));
        }
    }

    public C19650u() {
        C19662l lVar = new C19662l(this);
        C41217g a = C41219i.m119469a(C41222k.NONE, new C19659i(new C19658h(this)));
        this.f53981M = C1514j0.m5374c(this, C41520a0.m120436b(C26809g1.class), new C19660j(a), new C19661k((C43064a) null, a), lVar);
    }

    /* access modifiers changed from: private */
    /* renamed from: k2 */
    public final C24892b m65309k2() {
        C24892b bVar = this.f53980L;
        C41536l.m120486f(bVar);
        return bVar;
    }

    /* access modifiers changed from: private */
    /* renamed from: m2 */
    public final C26809g1 m65310m2() {
        return (C26809g1) this.f53981M.getValue();
    }

    /* access modifiers changed from: private */
    /* renamed from: n2 */
    public static final void m65311n2(C19650u uVar, DialogInterface dialogInterface) {
        C41536l.m120489i(uVar, "this$0");
        View requireView = uVar.requireView();
        C41536l.m120488h(requireView, "requireView()");
        ViewGroup.LayoutParams layoutParams = requireView.getLayoutParams();
        if (layoutParams != null) {
            layoutParams.height = uVar.getResources().getDisplayMetrics().heightPixels - C32355x0.m95522m(uVar.getContext());
            requireView.setLayoutParams(layoutParams);
            ViewParent parent = uVar.m65309k2().mo3946b().getParent();
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
    public final void m65312o2(boolean z) {
        CardView cardView = m65309k2().f63885e;
        C41536l.m120488h(cardView, "binding.progressBar");
        C32343x.m95483r1(cardView, z, false, 2, (Object) null);
    }

    private final void observeData() {
        m65310m2().mo66114nw().mo66090Sa().mo4819k(getViewLifecycleOwner(), new C19656f(new C19653c(this)));
        m65310m2().mo66111kw().mo4819k(getViewLifecycleOwner(), new C19656f(new C19654d(this)));
        LiveData h = m65310m2().mo66114nw().mo66091h();
        C1619q viewLifecycleOwner = getViewLifecycleOwner();
        C41536l.m120488h(viewLifecycleOwner, "viewLifecycleOwner");
        C37224b.m109963b(h, viewLifecycleOwner, new C19655e(this));
    }

    /* renamed from: p2 */
    private final void m65313p2() {
        C24892b k2 = m65309k2();
        k2.f63886f.setItemAnimator((RecyclerView.C1742m) null);
        k2.f63886f.setAdapter(this.f53982N);
        k2.f63889i.setHint(C32343x.m95388F("CLA.page.II.add.income.country.search.filed.input", new Object[0]));
        k2.f63889i.setOnTextChangeListener(new C19657g(m65310m2()));
        k2.f63887g.mo3946b().setOnClickListener(new C19648s(k2, this));
    }

    /* access modifiers changed from: private */
    /* renamed from: q2 */
    public static final void m65314q2(C24892b bVar, C19650u uVar, View view) {
        C41536l.m120489i(bVar, "$this_with");
        C41536l.m120489i(uVar, "this$0");
        CardView cardView = bVar.f63888h;
        C41536l.m120488h(cardView, "retryButtonContainer");
        C32343x.m95455i0(cardView);
        C21481a.onRefresh$default(uVar.m65310m2(), 0, 1, (Object) null);
    }

    /* renamed from: Q1 */
    public String mo26364Q1() {
        return this.f53983O;
    }

    /* renamed from: T1 */
    public void mo26367T1(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        C41536l.m120489i(layoutInflater, "inflater");
        C41536l.m120489i(viewGroup, "container");
        this.f53980L = C24892b.m79550d(layoutInflater, viewGroup, true);
    }

    /* renamed from: l2 */
    public final C26809g1.C26814c mo47850l2() {
        C26809g1.C26814c cVar = this.f53979K;
        if (cVar != null) {
            return cVar;
        }
        C41536l.m120506z("factory");
        return null;
    }

    public void onDestroyView() {
        super.onDestroyView();
        this.f53980L = null;
    }

    public void onViewCreated(View view, Bundle bundle) {
        C41536l.m120489i(view, "view");
        super.onViewCreated(view, bundle);
        observeData();
        m65313p2();
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
            aVar.setOnShowListener(new C19649t(this));
        }
        return q1;
    }
}
