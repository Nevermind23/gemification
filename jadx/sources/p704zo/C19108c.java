package p704zo;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
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
import androidx.recyclerview.widget.RecyclerView;
import b41.C31128a;
import b41.C31132b;
import g91.C32343x;
import he1.C41212c;
import he1.C41217g;
import he1.C41222k;
import he1.C41224m;
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
import p163m0.C7047a;
import p341ge.bog.designsystem.components.buttons.Button;
import p341ge.bog.designsystem.components.list.C13364a;
import p341ge.bog.mobilebank.categorypackages.presentation.application.secondstage.solo_lounge_selector.model.SelectedLoungeData;
import p341ge.bog.mobilebank.categorypackages.presentation.application.secondstage.solo_lounge_selector.model.SoloLoungeItem;
import p356ao.C10112d;
import p413eo.C12738e;
import p704zo.C19128f;
import p704zo.C19138n;
import ue1.C43064a;
import ue1.C43075l;
import ue1.C43079p;

/* renamed from: zo.c */
public final class C19108c extends C19106a {

    /* renamed from: P */
    public static final C19109a f53284P = new C19109a((DefaultConstructorMarker) null);

    /* renamed from: K */
    private C12738e f53285K;

    /* renamed from: L */
    public C19138n.C19144d f53286L;

    /* renamed from: M */
    private final C41217g f53287M = C41219i.m119470b(new C19119j(this));

    /* renamed from: N */
    private final C41217g f53288N;

    /* renamed from: O */
    private final C41217g f53289O;

    /* renamed from: zo.c$a */
    public static final class C19109a {
        private C19109a() {
        }

        public /* synthetic */ C19109a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* renamed from: a */
        public final C19108c mo47309a(SelectedLoungeData selectedLoungeData) {
            C41536l.m120489i(selectedLoungeData, "selectedSoloLounge");
            C19108c cVar = new C19108c();
            cVar.setArguments(C0908e.m3336b(C41233s.m119492a("EXTRA_SELECTED_LOUNGE", selectedLoungeData)));
            return cVar;
        }
    }

    /* renamed from: zo.c$b */
    static final class C19110b extends C41537m implements C43064a {

        /* renamed from: d */
        final /* synthetic */ C19108c f53290d;

        /* renamed from: zo.c$b$a */
        /* synthetic */ class C19111a implements C19128f.C19129a, C41532h {

            /* renamed from: a */
            final /* synthetic */ C19133i f53291a;

            C19111a(C19133i iVar) {
                this.f53291a = iVar;
            }

            /* renamed from: a */
            public final void mo47311a(SoloLoungeItem soloLoungeItem) {
                C41536l.m120489i(soloLoungeItem, "p0");
                this.f53291a.mo47330ob(soloLoungeItem);
            }

            public final boolean equals(Object obj) {
                if (!(obj instanceof C19128f.C19129a) || !(obj instanceof C41532h)) {
                    return false;
                }
                return C41536l.m120484d(getFunctionDelegate(), ((C41532h) obj).getFunctionDelegate());
            }

            public final C41212c getFunctionDelegate() {
                return new C41535k(1, this.f53291a, C19133i.class, "onNextStep", "onNextStep(Lge/bog/mobilebank/categorypackages/presentation/application/secondstage/solo_lounge_selector/model/SoloLoungeItem;)V", 0);
            }

            public final int hashCode() {
                return getFunctionDelegate().hashCode();
            }
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C19110b(C19108c cVar) {
            super(0);
            this.f53290d = cVar;
        }

        /* renamed from: b */
        public final C19128f invoke() {
            return new C19128f(new C19111a(this.f53290d.m64472q2().mo47334ow()));
        }
    }

    /* renamed from: zo.c$c */
    /* synthetic */ class C19112c extends C41535k implements C43075l {
        C19112c(Object obj) {
            super(1, obj, C19108c.class, "observeResponseState", "observeResponseState(Lge/bog/mobilebank/shared/requestedresult/RequestedResult;)V", 0);
        }

        /* renamed from: b */
        public final void mo47314b(C31128a aVar) {
            C41536l.m120489i(aVar, "p0");
            ((C19108c) this.receiver).m64474s2(aVar);
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            mo47314b((C31128a) obj);
            return C41238w.f97225a;
        }
    }

    /* renamed from: zo.c$d */
    /* synthetic */ class C19113d extends C41535k implements C43075l {
        C19113d(Object obj) {
            super(1, obj, C19108c.class, "handleAdapterData", "handleAdapterData(Lkotlin/Pair;)V", 0);
        }

        /* renamed from: b */
        public final void mo47315b(C41224m mVar) {
            C41536l.m120489i(mVar, "p0");
            ((C19108c) this.receiver).m64473r2(mVar);
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            mo47315b((C41224m) obj);
            return C41238w.f97225a;
        }
    }

    /* renamed from: zo.c$e */
    /* synthetic */ class C19114e extends C41535k implements C43075l {
        C19114e(Object obj) {
            super(1, obj, C19108c.class, "dismissWithResult", "dismissWithResult(Lge/bog/mobilebank/categorypackages/presentation/application/secondstage/solo_lounge_selector/model/SelectedLoungeData;)V", 0);
        }

        /* renamed from: b */
        public final void mo47316b(SelectedLoungeData selectedLoungeData) {
            C41536l.m120489i(selectedLoungeData, "p0");
            ((C19108c) this.receiver).m64468l2(selectedLoungeData);
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            mo47316b((SelectedLoungeData) obj);
            return C41238w.f97225a;
        }
    }

    /* renamed from: zo.c$f */
    static final class C19115f extends C41537m implements C43075l {

        /* renamed from: d */
        final /* synthetic */ C19108c f53292d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C19115f(C19108c cVar) {
            super(1);
            this.f53292d = cVar;
        }

        /* renamed from: a */
        public final void mo47317a(Object obj) {
            C41536l.m120489i(obj, "it");
            FrameLayout frameLayout = this.f53292d.m64470n2().f37701e;
            C41536l.m120488h(frameLayout, "binding.progressBar");
            C32343x.m95455i0(frameLayout);
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            mo47317a(obj);
            return C41238w.f97225a;
        }
    }

    /* renamed from: zo.c$g */
    static final class C19116g extends C41537m implements C43075l {

        /* renamed from: d */
        final /* synthetic */ C19108c f53293d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C19116g(C19108c cVar) {
            super(1);
            this.f53293d = cVar;
        }

        /* renamed from: a */
        public final void mo47318a(Object obj) {
            FrameLayout frameLayout = this.f53293d.m64470n2().f37701e;
            C41536l.m120488h(frameLayout, "binding.progressBar");
            C32343x.m95447f1(frameLayout);
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            mo47318a(obj);
            return C41238w.f97225a;
        }
    }

    /* renamed from: zo.c$h */
    static final class C19117h extends C41537m implements C43079p {

        /* renamed from: d */
        final /* synthetic */ C19108c f53294d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C19117h(C19108c cVar) {
            super(2);
            this.f53294d = cVar;
        }

        /* renamed from: a */
        public final void mo47319a(Throwable th, Object obj) {
            C41536l.m120489i(th, "<anonymous parameter 0>");
            CardView cardView = this.f53294d.m64470n2().f37704h;
            C41536l.m120488h(cardView, "binding.retryButtonContainer");
            C32343x.m95447f1(cardView);
            FrameLayout frameLayout = this.f53294d.m64470n2().f37701e;
            C41536l.m120488h(frameLayout, "binding.progressBar");
            C32343x.m95455i0(frameLayout);
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            mo47319a((Throwable) obj, obj2);
            return C41238w.f97225a;
        }
    }

    /* renamed from: zo.c$i */
    static final class C19118i implements C1645y, C41532h {

        /* renamed from: a */
        private final /* synthetic */ C43075l f53295a;

        C19118i(C43075l lVar) {
            C41536l.m120489i(lVar, "function");
            this.f53295a = lVar;
        }

        public final boolean equals(Object obj) {
            if (!(obj instanceof C1645y) || !(obj instanceof C41532h)) {
                return false;
            }
            return C41536l.m120484d(getFunctionDelegate(), ((C41532h) obj).getFunctionDelegate());
        }

        public final C41212c getFunctionDelegate() {
            return this.f53295a;
        }

        public final int hashCode() {
            return getFunctionDelegate().hashCode();
        }

        public final /* synthetic */ void onChanged(Object obj) {
            this.f53295a.invoke(obj);
        }
    }

    /* renamed from: zo.c$j */
    static final class C19119j extends C41537m implements C43064a {

        /* renamed from: d */
        final /* synthetic */ C19108c f53296d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C19119j(C19108c cVar) {
            super(0);
            this.f53296d = cVar;
        }

        /* renamed from: b */
        public final SelectedLoungeData invoke() {
            Bundle arguments = this.f53296d.getArguments();
            SelectedLoungeData selectedLoungeData = arguments != null ? (SelectedLoungeData) arguments.getParcelable("EXTRA_SELECTED_LOUNGE") : null;
            return selectedLoungeData == null ? new SelectedLoungeData((Long) null, (Long) null, (SoloLoungeItem) null, 7, (DefaultConstructorMarker) null) : selectedLoungeData;
        }
    }

    /* renamed from: zo.c$k */
    public static final class C19120k extends C41537m implements C43064a {

        /* renamed from: d */
        final /* synthetic */ Fragment f53297d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C19120k(Fragment fragment) {
            super(0);
            this.f53297d = fragment;
        }

        public final Fragment invoke() {
            return this.f53297d;
        }
    }

    /* renamed from: zo.c$l */
    public static final class C19121l extends C41537m implements C43064a {

        /* renamed from: d */
        final /* synthetic */ C43064a f53298d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C19121l(C43064a aVar) {
            super(0);
            this.f53298d = aVar;
        }

        public final C1638u0 invoke() {
            return (C1638u0) this.f53298d.invoke();
        }
    }

    /* renamed from: zo.c$m */
    public static final class C19122m extends C41537m implements C43064a {

        /* renamed from: d */
        final /* synthetic */ C41217g f53299d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C19122m(C41217g gVar) {
            super(0);
            this.f53299d = gVar;
        }

        public final C1636t0 invoke() {
            C1636t0 viewModelStore = C1514j0.m5375d(this.f53299d).getViewModelStore();
            C41536l.m120488h(viewModelStore, "owner.viewModelStore");
            return viewModelStore;
        }
    }

    /* renamed from: zo.c$n */
    public static final class C19123n extends C41537m implements C43064a {

        /* renamed from: d */
        final /* synthetic */ C43064a f53300d;

        /* renamed from: e */
        final /* synthetic */ C41217g f53301e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C19123n(C43064a aVar, C41217g gVar) {
            super(0);
            this.f53300d = aVar;
            this.f53301e = gVar;
        }

        public final C7047a invoke() {
            C7047a aVar;
            C43064a aVar2 = this.f53300d;
            if (aVar2 != null && (aVar = (C7047a) aVar2.invoke()) != null) {
                return aVar;
            }
            C1638u0 a = C1514j0.m5375d(this.f53301e);
            C1591i iVar = a instanceof C1591i ? (C1591i) a : null;
            C7047a defaultViewModelCreationExtras = iVar != null ? iVar.getDefaultViewModelCreationExtras() : null;
            return defaultViewModelCreationExtras == null ? C7047a.C7048a.f20987b : defaultViewModelCreationExtras;
        }
    }

    /* renamed from: zo.c$o */
    static final class C19124o extends C41537m implements C43064a {

        /* renamed from: d */
        final /* synthetic */ C19108c f53302d;

        /* renamed from: zo.c$o$a */
        static final class C19125a extends C41537m implements C43064a {

            /* renamed from: d */
            final /* synthetic */ C19108c f53303d;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            C19125a(C19108c cVar) {
                super(0);
                this.f53303d = cVar;
            }

            /* renamed from: b */
            public final C19138n invoke() {
                return this.f53303d.mo47308o2().mo32830a(this.f53303d.m64471p2());
            }
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C19124o(C19108c cVar) {
            super(0);
            this.f53302d = cVar;
        }

        public final C1620q0.C1624b invoke() {
            return C37588a0.f90326a.mo90779a(new C19125a(this.f53302d));
        }
    }

    public C19108c() {
        C19124o oVar = new C19124o(this);
        C41217g a = C41219i.m119469a(C41222k.NONE, new C19121l(new C19120k(this)));
        this.f53288N = C1514j0.m5374c(this, C41520a0.m120436b(C19138n.class), new C19122m(a), new C19123n((C43064a) null, a), oVar);
        this.f53289O = C41219i.m119470b(new C19110b(this));
    }

    /* access modifiers changed from: private */
    /* renamed from: l2 */
    public final void m64468l2(SelectedLoungeData selectedLoungeData) {
        C1533o.m5445b(this, "SOLO_LOUNGE_SELECTOR_REQUEST_KEY", C0908e.m3336b(C41233s.m119492a("SELECTED_LOUNGE_RESULT_KEY", selectedLoungeData)));
        mo4577k1();
    }

    /* renamed from: m2 */
    private final C19128f m64469m2() {
        return (C19128f) this.f53289O.getValue();
    }

    /* access modifiers changed from: private */
    /* renamed from: n2 */
    public final C12738e m64470n2() {
        C12738e eVar = this.f53285K;
        C41536l.m120486f(eVar);
        return eVar;
    }

    private final void observeData() {
        C19134j pw = m64472q2().mo47335pw();
        C1619q viewLifecycleOwner = getViewLifecycleOwner();
        C41536l.m120488h(viewLifecycleOwner, "viewLifecycleOwner");
        pw.mo47331L().mo4819k(viewLifecycleOwner, new C19118i(new C19112c(this)));
        pw.mo47333q().mo4819k(viewLifecycleOwner, new C19118i(new C19113d(this)));
        C37224b.m109963b(pw.mo47332R0(), viewLifecycleOwner, new C19114e(this));
    }

    /* access modifiers changed from: private */
    /* renamed from: p2 */
    public final SelectedLoungeData m64471p2() {
        return (SelectedLoungeData) this.f53287M.getValue();
    }

    /* access modifiers changed from: private */
    /* renamed from: q2 */
    public final C19138n m64472q2() {
        return (C19138n) this.f53288N.getValue();
    }

    /* access modifiers changed from: private */
    /* renamed from: r2 */
    public final void m64473r2(C41224m mVar) {
        boolean z;
        C19132h hVar = (C19132h) mVar.mo95676b();
        m64469m2().mo6029i((List) mVar.mo95675a());
        mo26370a2(C32343x.m95388F(hVar.mo47328b(), new Object[0]));
        Button J1 = mo26358J1();
        if (hVar != C19132h.CITY) {
            z = true;
        } else {
            z = false;
        }
        C32343x.m95483r1(J1, z, false, 2, (Object) null);
    }

    /* access modifiers changed from: private */
    /* renamed from: s2 */
    public final void m64474s2(C31128a aVar) {
        C31132b.m92648j(aVar, (int[]) null, new C19115f(this), 1, (Object) null);
        C31132b.m92646h(aVar, (int[]) null, new C19116g(this), 1, (Object) null);
        C31132b.m92644f(aVar, (int[]) null, new C19117h(this), 1, (Object) null);
    }

    /* renamed from: t2 */
    private final void m64475t2() {
        String str;
        C12738e n2 = m64470n2();
        if (m64471p2().mo40864e()) {
            str = C32343x.m95388F(C19132h.CITY.mo47328b(), new Object[0]);
        } else {
            str = C32343x.m95388F(C19132h.STREET.mo47328b(), new Object[0]);
        }
        mo26370a2(str);
        RecyclerView recyclerView = n2.f37702f;
        recyclerView.setAdapter(m64469m2());
        recyclerView.setItemAnimator((RecyclerView.C1742m) null);
        recyclerView.mo5351j(new C13364a(requireContext().getDrawable(C10112d.f27919m), true, false));
        n2.f37704h.getRootView().setOnClickListener(new C19107b(this));
    }

    /* access modifiers changed from: private */
    /* renamed from: u2 */
    public static final void m64476u2(C19108c cVar, View view) {
        C41536l.m120489i(cVar, "this$0");
        cVar.m64472q2().onRefresh(6);
        CardView cardView = cVar.m64470n2().f37704h;
        C41536l.m120488h(cardView, "binding.retryButtonContainer");
        C32343x.m95455i0(cardView);
    }

    /* renamed from: S1 */
    public void mo26366S1() {
        m64472q2().mo47334ow().mo47329hf();
    }

    /* renamed from: T1 */
    public void mo26367T1(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        C41536l.m120489i(layoutInflater, "inflater");
        C41536l.m120489i(viewGroup, "container");
        this.f53285K = C12738e.m48346d(layoutInflater, viewGroup, true);
    }

    /* renamed from: o2 */
    public final C19138n.C19144d mo47308o2() {
        C19138n.C19144d dVar = this.f53286L;
        if (dVar != null) {
            return dVar;
        }
        C41536l.m120506z("factory");
        return null;
    }

    public void onDestroyView() {
        this.f53285K = null;
        super.onDestroyView();
    }

    public void onViewCreated(View view, Bundle bundle) {
        C41536l.m120489i(view, "view");
        super.onViewCreated(view, bundle);
        observeData();
        m64475t2();
    }
}
