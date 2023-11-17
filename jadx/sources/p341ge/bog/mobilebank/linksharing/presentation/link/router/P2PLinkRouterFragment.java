package p341ge.bog.mobilebank.linksharing.presentation.link.router;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
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
import ap0.C10132e;
import g91.C32343x;
import he1.C41212c;
import he1.C41217g;
import he1.C41222k;
import he1.C41238w;
import kotlin.jvm.internal.C41520a0;
import kotlin.jvm.internal.C41532h;
import kotlin.jvm.internal.C41536l;
import kotlin.jvm.internal.C41537m;
import lp0.C16653a;
import lp0.C16654b;
import m41.C37224b;
import p163m0.C7047a;
import p228r0.C8034d;
import p341ge.bog.mobilebank.cleanarch.presentation.common.C21481a;
import p341ge.bog.mobilebank.cleanarch.presentation.common.StateView;
import p341ge.bog.mobilebank.linksharing.presentation.link.router.C15212b;
import q31.C38122f;
import q31.C38125h;
import ue1.C43064a;
import ue1.C43075l;

/* renamed from: ge.bog.mobilebank.linksharing.presentation.link.router.P2PLinkRouterFragment */
public final class P2PLinkRouterFragment extends C15211a {

    /* renamed from: g */
    private C10132e f43524g;

    /* renamed from: h */
    private final C41217g f43525h;

    /* renamed from: ge.bog.mobilebank.linksharing.presentation.link.router.P2PLinkRouterFragment$a */
    static final class C15197a extends C41537m implements C43075l {

        /* renamed from: d */
        final /* synthetic */ C10132e f43526d;

        /* renamed from: e */
        final /* synthetic */ P2PLinkRouterFragment f43527e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C15197a(C10132e eVar, P2PLinkRouterFragment p2PLinkRouterFragment) {
            super(1);
            this.f43526d = eVar;
            this.f43527e = p2PLinkRouterFragment;
        }

        /* renamed from: a */
        public final void mo42235a(C15212b bVar) {
            bVar.mo42252a(new C15212b.C15217e.C15218a(this.f43526d, C8034d.m30522a(this.f43527e)));
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            mo42235a((C15212b) obj);
            return C41238w.f97225a;
        }
    }

    /* renamed from: ge.bog.mobilebank.linksharing.presentation.link.router.P2PLinkRouterFragment$b */
    static final class C15198b extends C41537m implements C43075l {

        /* renamed from: d */
        final /* synthetic */ P2PLinkRouterFragment f43528d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C15198b(P2PLinkRouterFragment p2PLinkRouterFragment) {
            super(1);
            this.f43528d = p2PLinkRouterFragment;
        }

        /* renamed from: a */
        public final void mo42236a(String str) {
            C41536l.m120489i(str, "subProductCode");
            C1505h requireActivity = this.f43528d.requireActivity();
            C41536l.m120488h(requireActivity, "requireActivity()");
            C38122f c = C38125h.m112238c(requireActivity);
            Context requireContext = this.f43528d.requireContext();
            C41536l.m120488h(requireContext, "requireContext()");
            C38122f.C38123a.m112222r(c, requireContext, str, false, 4, (Object) null);
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            mo42236a((String) obj);
            return C41238w.f97225a;
        }
    }

    /* renamed from: ge.bog.mobilebank.linksharing.presentation.link.router.P2PLinkRouterFragment$c */
    static final class C15199c implements C1645y, C41532h {

        /* renamed from: a */
        private final /* synthetic */ C43075l f43529a;

        C15199c(C43075l lVar) {
            C41536l.m120489i(lVar, "function");
            this.f43529a = lVar;
        }

        public final boolean equals(Object obj) {
            if (!(obj instanceof C1645y) || !(obj instanceof C41532h)) {
                return false;
            }
            return C41536l.m120484d(getFunctionDelegate(), ((C41532h) obj).getFunctionDelegate());
        }

        public final C41212c getFunctionDelegate() {
            return this.f43529a;
        }

        public final int hashCode() {
            return getFunctionDelegate().hashCode();
        }

        public final /* synthetic */ void onChanged(Object obj) {
            this.f43529a.invoke(obj);
        }
    }

    /* renamed from: ge.bog.mobilebank.linksharing.presentation.link.router.P2PLinkRouterFragment$d */
    public static final class C15200d extends C41537m implements C43064a {

        /* renamed from: d */
        final /* synthetic */ Fragment f43530d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C15200d(Fragment fragment) {
            super(0);
            this.f43530d = fragment;
        }

        public final Fragment invoke() {
            return this.f43530d;
        }
    }

    /* renamed from: ge.bog.mobilebank.linksharing.presentation.link.router.P2PLinkRouterFragment$e */
    public static final class C15201e extends C41537m implements C43064a {

        /* renamed from: d */
        final /* synthetic */ C43064a f43531d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C15201e(C43064a aVar) {
            super(0);
            this.f43531d = aVar;
        }

        public final C1638u0 invoke() {
            return (C1638u0) this.f43531d.invoke();
        }
    }

    /* renamed from: ge.bog.mobilebank.linksharing.presentation.link.router.P2PLinkRouterFragment$f */
    public static final class C15202f extends C41537m implements C43064a {

        /* renamed from: d */
        final /* synthetic */ C41217g f43532d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C15202f(C41217g gVar) {
            super(0);
            this.f43532d = gVar;
        }

        public final C1636t0 invoke() {
            C1636t0 viewModelStore = C1514j0.m5375d(this.f43532d).getViewModelStore();
            C41536l.m120488h(viewModelStore, "owner.viewModelStore");
            return viewModelStore;
        }
    }

    /* renamed from: ge.bog.mobilebank.linksharing.presentation.link.router.P2PLinkRouterFragment$g */
    public static final class C15203g extends C41537m implements C43064a {

        /* renamed from: d */
        final /* synthetic */ C43064a f43533d;

        /* renamed from: e */
        final /* synthetic */ C41217g f43534e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C15203g(C43064a aVar, C41217g gVar) {
            super(0);
            this.f43533d = aVar;
            this.f43534e = gVar;
        }

        public final C7047a invoke() {
            C7047a aVar;
            C43064a aVar2 = this.f43533d;
            if (aVar2 != null && (aVar = (C7047a) aVar2.invoke()) != null) {
                return aVar;
            }
            C1638u0 a = C1514j0.m5375d(this.f43534e);
            C1591i iVar = a instanceof C1591i ? (C1591i) a : null;
            C7047a defaultViewModelCreationExtras = iVar != null ? iVar.getDefaultViewModelCreationExtras() : null;
            return defaultViewModelCreationExtras == null ? C7047a.C7048a.f20987b : defaultViewModelCreationExtras;
        }
    }

    /* renamed from: ge.bog.mobilebank.linksharing.presentation.link.router.P2PLinkRouterFragment$h */
    public static final class C15204h extends C41537m implements C43064a {

        /* renamed from: d */
        final /* synthetic */ Fragment f43535d;

        /* renamed from: e */
        final /* synthetic */ C41217g f43536e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C15204h(Fragment fragment, C41217g gVar) {
            super(0);
            this.f43535d = fragment;
            this.f43536e = gVar;
        }

        public final C1620q0.C1624b invoke() {
            C1620q0.C1624b bVar;
            C1638u0 a = C1514j0.m5375d(this.f43536e);
            C1591i iVar = a instanceof C1591i ? (C1591i) a : null;
            if (iVar == null || (bVar = iVar.getDefaultViewModelProviderFactory()) == null) {
                bVar = this.f43535d.getDefaultViewModelProviderFactory();
            }
            C41536l.m120488h(bVar, "(owner as? HasDefaultVie…tViewModelProviderFactory");
            return bVar;
        }
    }

    public P2PLinkRouterFragment() {
        C41217g a = C41219i.m119469a(C41222k.NONE, new C15201e(new C15200d(this)));
        this.f43525h = C1514j0.m5374c(this, C41520a0.m120436b(P2PLinkRouterViewModel$ViewModel.class), new C15202f(a), new C15203g((C43064a) null, a), new C15204h(this, a));
    }

    /* renamed from: k1 */
    private final C10132e m55452k1() {
        C10132e eVar = this.f43524g;
        C41536l.m120486f(eVar);
        return eVar;
    }

    /* renamed from: l1 */
    private final P2PLinkRouterViewModel$ViewModel m55453l1() {
        return (P2PLinkRouterViewModel$ViewModel) this.f43525h.getValue();
    }

    /* access modifiers changed from: private */
    /* renamed from: m1 */
    public static final void m55454m1(P2PLinkRouterFragment p2PLinkRouterFragment, View view) {
        C41536l.m120489i(p2PLinkRouterFragment, "this$0");
        C21481a.onRefresh$default(p2PLinkRouterFragment.m55453l1(), 0, 1, (Object) null);
    }

    /* access modifiers changed from: private */
    /* renamed from: n1 */
    public static final void m55455n1(P2PLinkRouterFragment p2PLinkRouterFragment, View view) {
        C41536l.m120489i(p2PLinkRouterFragment, "this$0");
        p2PLinkRouterFragment.m55453l1().mo42242iw().mo42240ar();
    }

    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        C41536l.m120489i(layoutInflater, "inflater");
        this.f43524g = C10132e.m37057d(layoutInflater, viewGroup, false);
        StateView c = m55452k1().mo3946b();
        C41536l.m120488h(c, "binding.root");
        return c;
    }

    public void onDestroyView() {
        this.f43524g = null;
        super.onDestroyView();
    }

    public void onViewCreated(View view, Bundle bundle) {
        C41536l.m120489i(view, "view");
        C10132e k1 = m55452k1();
        super.onViewCreated(view, bundle);
        k1.f28077i.setText(C32343x.m95388F("text.p2p.link.error.page", new Object[0]));
        k1.f28079k.setButtonText(C32343x.m95388F("text.p2p.link.error.page.reload", new Object[0]));
        k1.f28078j.setText(C32343x.m95388F("text.p2p.link.empty.acct", new Object[0]));
        k1.f28076h.setButtonText(C32343x.m95388F("text.p2p.link.card.order.btn", new Object[0]));
        k1.f28079k.setOnClickListener(new C16653a(this));
        k1.f28076h.setOnClickListener(new C16654b(this));
        m55453l1().mo42243jw().mo42239Y0().mo4819k(getViewLifecycleOwner(), new C15199c(new C15197a(k1, this)));
        LiveData mf = m55453l1().mo42243jw().mo42245mf();
        C1619q viewLifecycleOwner = getViewLifecycleOwner();
        C41536l.m120488h(viewLifecycleOwner, "viewLifecycleOwner");
        C37224b.m109963b(mf, viewLifecycleOwner, new C15198b(this));
    }
}
