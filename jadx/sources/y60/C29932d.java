package y60;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.core.p016os.C0908e;
import androidx.fragment.app.C1514j0;
import androidx.fragment.app.C1533o;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.lifecycle.C1591i;
import androidx.lifecycle.C1620q0;
import androidx.lifecycle.C1636t0;
import androidx.lifecycle.C1638u0;
import androidx.lifecycle.C1645y;
import androidx.lifecycle.LiveData;
import g91.C32297d;
import g91.C32343x;
import hc1.C41143c;
import hc1.C41185v;
import he1.C41212c;
import he1.C41217g;
import he1.C41222k;
import he1.C41233s;
import he1.C41238w;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.C41520a0;
import kotlin.jvm.internal.C41532h;
import kotlin.jvm.internal.C41535k;
import kotlin.jvm.internal.C41536l;
import kotlin.jvm.internal.C41537m;
import kotlin.jvm.internal.DefaultConstructorMarker;
import m41.C37223a;
import p163m0.C7047a;
import p341ge.bog.designsystem.components.buttons.Button;
import p341ge.bog.mobilebank.cleanarch.presentation.common.C21484c;
import p341ge.bog.mobilebank.cleanarch.presentation.common.C21503d;
import p341ge.bog.mobilebank.cleanarch.products.cards.mcc.presentation.model.MccStateUiModel;
import p341ge.bog.mobilebank.cleanarch.products.cards.mcc.presentation.viewmodel.ManageMccViewModel;
import p90.C27293f;
import ue1.C43064a;
import ue1.C43075l;
import z60.C30232b;
import z60.C30234c;

/* renamed from: y60.d */
public final class C29932d extends C29929a implements C41185v.C41186a {

    /* renamed from: P */
    public static final C29933a f75725P = new C29933a((DefaultConstructorMarker) null);

    /* renamed from: K */
    private final C41217g f75726K;

    /* renamed from: L */
    private C27293f f75727L;

    /* renamed from: M */
    private final C30232b f75728M = new C30232b();

    /* renamed from: N */
    private final C41217g f75729N = C41219i.m119470b(new C29942j(this));

    /* renamed from: O */
    private final C41217g f75730O = C41219i.m119470b(new C29949q(this));

    /* renamed from: y60.d$a */
    public static final class C29933a {
        private C29933a() {
        }

        public /* synthetic */ C29933a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* renamed from: b */
        public static /* synthetic */ C29932d m90820b(C29933a aVar, long j, boolean z, int i, Object obj) {
            if ((i & 2) != 0) {
                z = false;
            }
            return aVar.mo70245a(j, z);
        }

        /* renamed from: a */
        public final C29932d mo70245a(long j, boolean z) {
            C29932d dVar = new C29932d();
            dVar.setArguments(C0908e.m3336b(C41233s.m119492a("CARD_ID", Long.valueOf(j)), C41233s.m119492a("TOGGLE_BY_DEFAULT", Boolean.valueOf(z))));
            return dVar;
        }
    }

    /* renamed from: y60.d$b */
    /* synthetic */ class C29934b implements C30234c, C41532h {

        /* renamed from: a */
        final /* synthetic */ ManageMccViewModel f75731a;

        C29934b(ManageMccViewModel manageMccViewModel) {
            this.f75731a = manageMccViewModel;
        }

        /* renamed from: a */
        public final void mo70246a(int i, boolean z) {
            this.f75731a.mo55635sw(i, z);
        }

        public final boolean equals(Object obj) {
            if (!(obj instanceof C30234c) || !(obj instanceof C41532h)) {
                return false;
            }
            return C41536l.m120484d(getFunctionDelegate(), ((C41532h) obj).getFunctionDelegate());
        }

        public final C41212c getFunctionDelegate() {
            return new C41535k(2, this.f75731a, ManageMccViewModel.class, "toggleState", "toggleState(IZ)V", 0);
        }

        public final int hashCode() {
            return getFunctionDelegate().hashCode();
        }
    }

    /* renamed from: y60.d$c */
    /* synthetic */ class C29935c extends C41535k implements C43075l {
        C29935c(Object obj) {
            super(1, obj, C29932d.class, "onMccStates", "onMccStates(Ljava/util/List;)V", 0);
        }

        /* renamed from: b */
        public final void mo70249b(List list) {
            C41536l.m120489i(list, "p0");
            ((C29932d) this.receiver).m90811t2(list);
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            mo70249b((List) obj);
            return C41238w.f97225a;
        }
    }

    /* renamed from: y60.d$d */
    /* synthetic */ class C29936d extends C41535k implements C43075l {
        C29936d(Object obj) {
            super(1, obj, C29932d.class, "onRetryError", "onRetryError(Lge/bog/mobilebank/cleanarch/presentation/common/Resource$Error;)V", 0);
        }

        /* renamed from: b */
        public final void mo70250b(C21503d.C21504a aVar) {
            C41536l.m120489i(aVar, "p0");
            ((C29932d) this.receiver).m90812u2(aVar);
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            mo70250b((C21503d.C21504a) obj);
            return C41238w.f97225a;
        }
    }

    /* renamed from: y60.d$e */
    /* synthetic */ class C29937e extends C41535k implements C43075l {
        C29937e(Object obj) {
            super(1, obj, C29932d.class, "setLoading", "setLoading(Z)V", 0);
        }

        /* renamed from: b */
        public final void mo70251b(boolean z) {
            ((C29932d) this.receiver).m90813v2(z);
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            mo70251b(((Boolean) obj).booleanValue());
            return C41238w.f97225a;
        }
    }

    /* renamed from: y60.d$f */
    /* synthetic */ class C29938f extends C41535k implements C43075l {
        C29938f(Object obj) {
            super(1, obj, C29932d.class, "handleError", "handleError(Lge/bog/mobilebank/cleanarch/presentation/common/Resource$Error;)V", 0);
        }

        /* renamed from: b */
        public final void mo70252b(C21503d.C21504a aVar) {
            C41536l.m120489i(aVar, "p0");
            ((C29932d) this.receiver).handleError(aVar);
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            mo70252b((C21503d.C21504a) obj);
            return C41238w.f97225a;
        }
    }

    /* renamed from: y60.d$g */
    /* synthetic */ class C29939g extends C41535k implements C43075l {
        C29939g(Object obj) {
            super(1, obj, C29932d.class, "setLoading", "setLoading(Z)V", 0);
        }

        /* renamed from: b */
        public final void mo70253b(boolean z) {
            ((C29932d) this.receiver).m90813v2(z);
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            mo70253b(((Boolean) obj).booleanValue());
            return C41238w.f97225a;
        }
    }

    /* renamed from: y60.d$h */
    static final class C29940h extends C41537m implements C43075l {

        /* renamed from: d */
        final /* synthetic */ C29932d f75732d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C29940h(C29932d dVar) {
            super(1);
            this.f75732d = dVar;
        }

        /* renamed from: a */
        public final void mo70254a(C41238w wVar) {
            C41536l.m120489i(wVar, "it");
            C1533o.m5445b(this.f75732d, "REQUEST_KEY_MCC_UPDATED", C0908e.m3336b(C41233s.m119492a("RESULT_KEY_MCC_UPDATED", Boolean.TRUE)));
            this.f75732d.mo4577k1();
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            mo70254a((C41238w) obj);
            return C41238w.f97225a;
        }
    }

    /* renamed from: y60.d$i */
    static final class C29941i extends C41537m implements C43075l {

        /* renamed from: d */
        final /* synthetic */ C29932d f75733d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C29941i(C29932d dVar) {
            super(1);
            this.f75733d = dVar;
        }

        /* renamed from: a */
        public final void mo70255a(C37223a aVar) {
            HashMap hashMap = (HashMap) aVar.mo90296a();
            if (hashMap != null) {
                C29932d dVar = this.f75733d;
                C41185v e = C41185v.C41187b.m119423e(C41185v.f97155C, "CARDS_CHANGE_CARD_MCC_STATE", hashMap, (C41143c) null, 4, (Object) null);
                FragmentManager childFragmentManager = dVar.getChildFragmentManager();
                C41536l.m120488h(childFragmentManager, "childFragmentManager");
                e.mo4576A1(childFragmentManager, (String) null);
            }
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            mo70255a((C37223a) obj);
            return C41238w.f97225a;
        }
    }

    /* renamed from: y60.d$j */
    static final class C29942j extends C41537m implements C43064a {

        /* renamed from: d */
        final /* synthetic */ C29932d f75734d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C29942j(C29932d dVar) {
            super(0);
            this.f75734d = dVar;
        }

        /* renamed from: b */
        public final Long invoke() {
            Bundle arguments = this.f75734d.getArguments();
            long j = -1;
            if (arguments != null) {
                j = arguments.getLong("CARD_ID", -1);
            }
            return Long.valueOf(j);
        }
    }

    /* renamed from: y60.d$k */
    static final class C29943k implements C1645y, C41532h {

        /* renamed from: a */
        private final /* synthetic */ C43075l f75735a;

        C29943k(C43075l lVar) {
            C41536l.m120489i(lVar, "function");
            this.f75735a = lVar;
        }

        public final boolean equals(Object obj) {
            if (!(obj instanceof C1645y) || !(obj instanceof C41532h)) {
                return false;
            }
            return C41536l.m120484d(getFunctionDelegate(), ((C41532h) obj).getFunctionDelegate());
        }

        public final C41212c getFunctionDelegate() {
            return this.f75735a;
        }

        public final int hashCode() {
            return getFunctionDelegate().hashCode();
        }

        public final /* synthetic */ void onChanged(Object obj) {
            this.f75735a.invoke(obj);
        }
    }

    /* renamed from: y60.d$l */
    public static final class C29944l extends C41537m implements C43064a {

        /* renamed from: d */
        final /* synthetic */ Fragment f75736d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C29944l(Fragment fragment) {
            super(0);
            this.f75736d = fragment;
        }

        public final Fragment invoke() {
            return this.f75736d;
        }
    }

    /* renamed from: y60.d$m */
    public static final class C29945m extends C41537m implements C43064a {

        /* renamed from: d */
        final /* synthetic */ C43064a f75737d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C29945m(C43064a aVar) {
            super(0);
            this.f75737d = aVar;
        }

        public final C1638u0 invoke() {
            return (C1638u0) this.f75737d.invoke();
        }
    }

    /* renamed from: y60.d$n */
    public static final class C29946n extends C41537m implements C43064a {

        /* renamed from: d */
        final /* synthetic */ C41217g f75738d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C29946n(C41217g gVar) {
            super(0);
            this.f75738d = gVar;
        }

        public final C1636t0 invoke() {
            C1636t0 viewModelStore = C1514j0.m5375d(this.f75738d).getViewModelStore();
            C41536l.m120488h(viewModelStore, "owner.viewModelStore");
            return viewModelStore;
        }
    }

    /* renamed from: y60.d$o */
    public static final class C29947o extends C41537m implements C43064a {

        /* renamed from: d */
        final /* synthetic */ C43064a f75739d;

        /* renamed from: e */
        final /* synthetic */ C41217g f75740e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C29947o(C43064a aVar, C41217g gVar) {
            super(0);
            this.f75739d = aVar;
            this.f75740e = gVar;
        }

        public final C7047a invoke() {
            C7047a aVar;
            C43064a aVar2 = this.f75739d;
            if (aVar2 != null && (aVar = (C7047a) aVar2.invoke()) != null) {
                return aVar;
            }
            C1638u0 a = C1514j0.m5375d(this.f75740e);
            C1591i iVar = a instanceof C1591i ? (C1591i) a : null;
            C7047a defaultViewModelCreationExtras = iVar != null ? iVar.getDefaultViewModelCreationExtras() : null;
            return defaultViewModelCreationExtras == null ? C7047a.C7048a.f20987b : defaultViewModelCreationExtras;
        }
    }

    /* renamed from: y60.d$p */
    public static final class C29948p extends C41537m implements C43064a {

        /* renamed from: d */
        final /* synthetic */ Fragment f75741d;

        /* renamed from: e */
        final /* synthetic */ C41217g f75742e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C29948p(Fragment fragment, C41217g gVar) {
            super(0);
            this.f75741d = fragment;
            this.f75742e = gVar;
        }

        public final C1620q0.C1624b invoke() {
            C1620q0.C1624b bVar;
            C1638u0 a = C1514j0.m5375d(this.f75742e);
            C1591i iVar = a instanceof C1591i ? (C1591i) a : null;
            if (iVar == null || (bVar = iVar.getDefaultViewModelProviderFactory()) == null) {
                bVar = this.f75741d.getDefaultViewModelProviderFactory();
            }
            C41536l.m120488h(bVar, "(owner as? HasDefaultVie…tViewModelProviderFactory");
            return bVar;
        }
    }

    /* renamed from: y60.d$q */
    static final class C29949q extends C41537m implements C43064a {

        /* renamed from: d */
        final /* synthetic */ C29932d f75743d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C29949q(C29932d dVar) {
            super(0);
            this.f75743d = dVar;
        }

        /* renamed from: b */
        public final Boolean invoke() {
            Bundle arguments = this.f75743d.getArguments();
            boolean z = false;
            if (arguments != null) {
                z = arguments.getBoolean("TOGGLE_BY_DEFAULT", false);
            }
            return Boolean.valueOf(z);
        }
    }

    public C29932d() {
        C41217g a = C41219i.m119469a(C41222k.NONE, new C29945m(new C29944l(this)));
        this.f75726K = C1514j0.m5374c(this, C41520a0.m120436b(ManageMccViewModel.class), new C29946n(a), new C29947o((C43064a) null, a), new C29948p(this, a));
    }

    /* renamed from: j2 */
    private final void m90801j2() {
        m90805n2().f68669l.mo3946b().setOnClickListener(new C29930b(this));
        m90805n2().f68667j.setOnClickListener(new C29931c(this));
        this.f75728M.mo70567j(new C29934b(m90809r2()));
    }

    /* access modifiers changed from: private */
    /* renamed from: k2 */
    public static final void m90802k2(C29932d dVar, View view) {
        C41536l.m120489i(dVar, "this$0");
        FrameLayout frameLayout = dVar.m90805n2().f68670m;
        C41536l.m120488h(frameLayout, "binding.retryButtonContainer");
        C32343x.m95455i0(frameLayout);
        dVar.m90809r2().mo55634qw(dVar.m90806o2(), dVar.m90808q2());
    }

    /* access modifiers changed from: private */
    /* renamed from: l2 */
    public static final void m90803l2(C29932d dVar, View view) {
        C41536l.m120489i(dVar, "this$0");
        ManageMccViewModel.m72977ow(dVar.m90809r2(), (String) null, (String) null, (String) null, 7, (Object) null);
    }

    /* renamed from: m2 */
    private final void m90804m2() {
        C21484c.m69411c(m90809r2().mo55631lw(), this, new C29935c(this), new C29937e(this), new C29936d(this));
        LiveData kw = m90809r2().mo55630kw();
        C29938f fVar = new C29938f(this);
        C21484c.m69411c(kw, this, new C29940h(this), new C29939g(this), fVar);
        m90809r2().mo55632mw().mo4819k(getViewLifecycleOwner(), new C29943k(new C29941i(this)));
    }

    /* renamed from: n2 */
    private final C27293f m90805n2() {
        C27293f fVar = this.f75727L;
        C41536l.m120486f(fVar);
        return fVar;
    }

    /* renamed from: o2 */
    private final long m90806o2() {
        return ((Number) this.f75729N.getValue()).longValue();
    }

    /* renamed from: p2 */
    private final C41185v m90807p2() {
        FragmentManager childFragmentManager = getChildFragmentManager();
        C41536l.m120488h(childFragmentManager, "childFragmentManager");
        return C32343x.m95449g0(childFragmentManager, (String) null, 1, (Object) null);
    }

    /* renamed from: q2 */
    private final boolean m90808q2() {
        return ((Boolean) this.f75730O.getValue()).booleanValue();
    }

    /* renamed from: r2 */
    private final ManageMccViewModel m90809r2() {
        return (ManageMccViewModel) this.f75726K.getValue();
    }

    /* renamed from: s2 */
    public static final C29932d m90810s2(long j, boolean z) {
        return f75725P.mo70245a(j, z);
    }

    /* access modifiers changed from: private */
    /* renamed from: t2 */
    public final void m90811t2(List list) {
        Button button;
        this.f75728M.mo70568k(list);
        C27293f fVar = this.f75727L;
        if (fVar != null) {
            button = fVar.f68667j;
        } else {
            button = null;
        }
        if (button != null) {
            boolean z = false;
            if (!(list instanceof Collection) || !list.isEmpty()) {
                Iterator it = list.iterator();
                while (true) {
                    if (it.hasNext()) {
                        if (((MccStateUiModel) it.next()).mo55613d()) {
                            z = true;
                            break;
                        }
                    } else {
                        break;
                    }
                }
            }
            button.setEnabled(z);
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: u2 */
    public final void m90812u2(C21503d.C21504a aVar) {
        FrameLayout frameLayout;
        handleError(aVar);
        C27293f fVar = this.f75727L;
        if (fVar != null && (frameLayout = fVar.f68670m) != null) {
            C32343x.m95447f1(frameLayout);
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: v2 */
    public final void m90813v2(boolean z) {
        FrameLayout frameLayout;
        C27293f fVar = this.f75727L;
        if (fVar != null && (frameLayout = fVar.f68662e) != null) {
            C32343x.m95483r1(frameLayout, z, false, 2, (Object) null);
        }
    }

    /* renamed from: w2 */
    private final void m90814w2() {
        m90805n2().f68668k.setAdapter(this.f75728M);
    }

    /* renamed from: x2 */
    private final void m90815x2() {
        mo26370a2(C32343x.m95388F("text.cards.mcc.header", new Object[0]));
        m90805n2().f68667j.setButtonText(C32343x.m95388F("text.common.button.save", new Object[0]));
        m90805n2().f68666i.setText(C32343x.m95388F("text.cards.mcc.general.description", new Object[0]));
    }

    /* renamed from: O */
    public void mo37615O(String str, String str2, String str3, String str4) {
        C41536l.m120489i(str, "operationId");
        C41536l.m120489i(str2, "operationReference");
        C41536l.m120489i(str3, "scaAuthCode");
        C41185v p2 = m90807p2();
        if (p2 != null) {
            p2.mo4577k1();
        }
        m90809r2().mo55633nw(str, str2, str3);
    }

    /* renamed from: R */
    public void mo37616R(String str, String str2) {
        C41536l.m120489i(str, "message");
        C32297d.m95156d(this, str);
    }

    /* renamed from: S */
    public void mo37617S(boolean z) {
        m90813v2(z);
    }

    /* renamed from: T1 */
    public void mo26367T1(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        C41536l.m120489i(layoutInflater, "inflater");
        C41536l.m120489i(viewGroup, "container");
        this.f75727L = C27293f.m84473d(layoutInflater, viewGroup, true);
        m90815x2();
        m90814w2();
        m90801j2();
        m90804m2();
        m90809r2().mo55634qw(m90806o2(), m90808q2());
    }

    public void onDestroyView() {
        super.onDestroyView();
        this.f75727L = null;
    }
}
