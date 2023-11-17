package p341ge.bog.mobilebank.giftcards.presentation.offersandapplications;

import aj0.C19257a;
import aj0.C19258b;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.fragment.app.C1505h;
import androidx.fragment.app.C1514j0;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.lifecycle.C1591i;
import androidx.lifecycle.C1613n0;
import androidx.lifecycle.C1619q;
import androidx.lifecycle.C1620q0;
import androidx.lifecycle.C1636t0;
import androidx.lifecycle.C1638u0;
import androidx.lifecycle.C1645y;
import androidx.lifecycle.LiveData;
import androidx.recyclerview.widget.RecyclerView;
import bj0.C19391a;
import g91.C32343x;
import he1.C41212c;
import he1.C41217g;
import he1.C41222k;
import he1.C41238w;
import java.util.List;
import kotlin.jvm.internal.C41519a;
import kotlin.jvm.internal.C41520a0;
import kotlin.jvm.internal.C41532h;
import kotlin.jvm.internal.C41535k;
import kotlin.jvm.internal.C41536l;
import kotlin.jvm.internal.C41537m;
import kotlin.jvm.internal.DefaultConstructorMarker;
import m41.C37224b;
import mi0.C26233a;
import mi0.C26234b;
import o31.C37588a0;
import oh0.C27006a;
import oh0.C27014i;
import p163m0.C7047a;
import p341ge.bog.mobilebank.giftcards.presentation.activity.GiftCardsFlow;
import p341ge.bog.mobilebank.giftcards.presentation.offersandapplications.C24315c;
import th0.C28402h;
import ue1.C43064a;
import ue1.C43075l;
import ue1.C43080q;
import zh0.C30308a;

/* renamed from: ge.bog.mobilebank.giftcards.presentation.offersandapplications.OffersAndApplicationsDetailsFragment */
public final class OffersAndApplicationsDetailsFragment extends C24313a implements C19391a {

    /* renamed from: i */
    public C24315c.C24316a f62816i;

    /* renamed from: j */
    private final C41217g f62817j;

    /* renamed from: k */
    private final C41217g f62818k = C41219i.m119470b(new C24311k(this));

    /* renamed from: ge.bog.mobilebank.giftcards.presentation.offersandapplications.OffersAndApplicationsDetailsFragment$a */
    /* synthetic */ class C24300a extends C41535k implements C43080q {

        /* renamed from: d */
        public static final C24300a f62819d = new C24300a();

        C24300a() {
            super(3, C28402h.class, "inflate", "inflate(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Z)Lge/bog/mobilebank/giftcards/databinding/FragmentGiftCardOffersAndApplicationsBinding;", 0);
        }

        /* renamed from: b */
        public final C28402h mo61996b(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
            C41536l.m120489i(layoutInflater, "p0");
            return C28402h.m87130d(layoutInflater, viewGroup, z);
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
            return mo61996b((LayoutInflater) obj, (ViewGroup) obj2, ((Boolean) obj3).booleanValue());
        }
    }

    /* renamed from: ge.bog.mobilebank.giftcards.presentation.offersandapplications.OffersAndApplicationsDetailsFragment$b */
    /* synthetic */ class C24301b extends C41535k implements C43075l {
        C24301b(Object obj) {
            super(1, obj, C26233a.class, "submitList", "submitList(Ljava/util/List;)V", 0);
        }

        /* renamed from: b */
        public final void mo61997b(List list) {
            ((C26233a) this.receiver).mo6029i(list);
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            mo61997b((List) obj);
            return C41238w.f97225a;
        }
    }

    /* renamed from: ge.bog.mobilebank.giftcards.presentation.offersandapplications.OffersAndApplicationsDetailsFragment$c */
    /* synthetic */ class C24302c extends C41519a implements C43075l {
        C24302c(Object obj) {
            super(1, obj, C32343x.class, "toggleVisibility", "toggleVisibility(Landroid/view/View;ZZ)V", 1);
        }

        /* renamed from: b */
        public final void mo61998b(boolean z) {
            FrameLayout frameLayout = (FrameLayout) this.f97690d;
            C41536l.m120488h(frameLayout, "binding.progressBarView::toggleVisibility");
            C32343x.m95483r1(frameLayout, z, false, 2, (Object) null);
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            mo61998b(((Boolean) obj).booleanValue());
            return C41238w.f97225a;
        }
    }

    /* renamed from: ge.bog.mobilebank.giftcards.presentation.offersandapplications.OffersAndApplicationsDetailsFragment$d */
    /* synthetic */ class C24303d extends C41535k implements C43075l {
        C24303d(Object obj) {
            super(1, obj, OffersAndApplicationsDetailsFragment.class, "handleEvent", "handleEvent(Lge/bog/mobilebank/giftcards/presentation/offersandapplications/OffersAndApplicationsEvent;)V", 0);
        }

        /* renamed from: b */
        public final void mo61999b(C24321d dVar) {
            C41536l.m120489i(dVar, "p0");
            ((OffersAndApplicationsDetailsFragment) this.receiver).m78209n1(dVar);
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            mo61999b((C24321d) obj);
            return C41238w.f97225a;
        }
    }

    /* renamed from: ge.bog.mobilebank.giftcards.presentation.offersandapplications.OffersAndApplicationsDetailsFragment$e */
    static final class C24304e implements C1645y, C41532h {

        /* renamed from: a */
        private final /* synthetic */ C43075l f62820a;

        C24304e(C43075l lVar) {
            C41536l.m120489i(lVar, "function");
            this.f62820a = lVar;
        }

        public final boolean equals(Object obj) {
            if (!(obj instanceof C1645y) || !(obj instanceof C41532h)) {
                return false;
            }
            return C41536l.m120484d(getFunctionDelegate(), ((C41532h) obj).getFunctionDelegate());
        }

        public final C41212c getFunctionDelegate() {
            return this.f62820a;
        }

        public final int hashCode() {
            return getFunctionDelegate().hashCode();
        }

        public final /* synthetic */ void onChanged(Object obj) {
            this.f62820a.invoke(obj);
        }
    }

    /* renamed from: ge.bog.mobilebank.giftcards.presentation.offersandapplications.OffersAndApplicationsDetailsFragment$f */
    public static final class C24305f extends C41537m implements C43064a {

        /* renamed from: d */
        final /* synthetic */ C43064a f62821d;

        /* renamed from: ge.bog.mobilebank.giftcards.presentation.offersandapplications.OffersAndApplicationsDetailsFragment$f$a */
        public static final class C24306a extends C41537m implements C43064a {

            /* renamed from: d */
            final /* synthetic */ C43064a f62822d;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            public C24306a(C43064a aVar) {
                super(0);
                this.f62822d = aVar;
            }

            /* renamed from: b */
            public final C1613n0 invoke() {
                return (C1613n0) this.f62822d.invoke();
            }
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C24305f(C43064a aVar) {
            super(0);
            this.f62821d = aVar;
        }

        public final C1620q0.C1624b invoke() {
            return C37588a0.f90326a.mo90779a(new C24306a(this.f62821d));
        }
    }

    /* renamed from: ge.bog.mobilebank.giftcards.presentation.offersandapplications.OffersAndApplicationsDetailsFragment$g */
    public static final class C24307g extends C41537m implements C43064a {

        /* renamed from: d */
        final /* synthetic */ Fragment f62823d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C24307g(Fragment fragment) {
            super(0);
            this.f62823d = fragment;
        }

        public final Fragment invoke() {
            return this.f62823d;
        }
    }

    /* renamed from: ge.bog.mobilebank.giftcards.presentation.offersandapplications.OffersAndApplicationsDetailsFragment$h */
    public static final class C24308h extends C41537m implements C43064a {

        /* renamed from: d */
        final /* synthetic */ C43064a f62824d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C24308h(C43064a aVar) {
            super(0);
            this.f62824d = aVar;
        }

        public final C1638u0 invoke() {
            return (C1638u0) this.f62824d.invoke();
        }
    }

    /* renamed from: ge.bog.mobilebank.giftcards.presentation.offersandapplications.OffersAndApplicationsDetailsFragment$i */
    public static final class C24309i extends C41537m implements C43064a {

        /* renamed from: d */
        final /* synthetic */ C41217g f62825d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C24309i(C41217g gVar) {
            super(0);
            this.f62825d = gVar;
        }

        public final C1636t0 invoke() {
            C1636t0 viewModelStore = C1514j0.m5375d(this.f62825d).getViewModelStore();
            C41536l.m120488h(viewModelStore, "owner.viewModelStore");
            return viewModelStore;
        }
    }

    /* renamed from: ge.bog.mobilebank.giftcards.presentation.offersandapplications.OffersAndApplicationsDetailsFragment$j */
    public static final class C24310j extends C41537m implements C43064a {

        /* renamed from: d */
        final /* synthetic */ C43064a f62826d;

        /* renamed from: e */
        final /* synthetic */ C41217g f62827e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C24310j(C43064a aVar, C41217g gVar) {
            super(0);
            this.f62826d = aVar;
            this.f62827e = gVar;
        }

        public final C7047a invoke() {
            C7047a aVar;
            C43064a aVar2 = this.f62826d;
            if (aVar2 != null && (aVar = (C7047a) aVar2.invoke()) != null) {
                return aVar;
            }
            C1638u0 a = C1514j0.m5375d(this.f62827e);
            C1591i iVar = a instanceof C1591i ? (C1591i) a : null;
            C7047a defaultViewModelCreationExtras = iVar != null ? iVar.getDefaultViewModelCreationExtras() : null;
            return defaultViewModelCreationExtras == null ? C7047a.C7048a.f20987b : defaultViewModelCreationExtras;
        }
    }

    /* renamed from: ge.bog.mobilebank.giftcards.presentation.offersandapplications.OffersAndApplicationsDetailsFragment$k */
    static final class C24311k extends C41537m implements C43064a {

        /* renamed from: d */
        final /* synthetic */ OffersAndApplicationsDetailsFragment f62828d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C24311k(OffersAndApplicationsDetailsFragment offersAndApplicationsDetailsFragment) {
            super(0);
            this.f62828d = offersAndApplicationsDetailsFragment;
        }

        /* renamed from: b */
        public final C26233a invoke() {
            return new C26233a(C41341q.m119910m(new C19258b(this.f62828d), new C19257a(this.f62828d)), (C26234b) null, 2, (DefaultConstructorMarker) null);
        }
    }

    /* renamed from: ge.bog.mobilebank.giftcards.presentation.offersandapplications.OffersAndApplicationsDetailsFragment$l */
    static final class C24312l extends C41537m implements C43064a {

        /* renamed from: d */
        final /* synthetic */ OffersAndApplicationsDetailsFragment f62829d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C24312l(OffersAndApplicationsDetailsFragment offersAndApplicationsDetailsFragment) {
            super(0);
            this.f62829d = offersAndApplicationsDetailsFragment;
        }

        /* renamed from: b */
        public final C24315c invoke() {
            C24315c.C24316a k1 = this.f62829d.mo61995k1();
            OffersAndApplicationsDetailsFragment offersAndApplicationsDetailsFragment = this.f62829d;
            String string = offersAndApplicationsDetailsFragment.getString(C27014i.gift_cards_flow_extra);
            C41536l.m120488h(string, "getString(R.string.gift_cards_flow_extra)");
            return k1.mo32833a((GiftCardsFlow.GiftCardOffersAndApplicationsDetails) C32343x.m95419U0(offersAndApplicationsDetailsFragment, string));
        }
    }

    public OffersAndApplicationsDetailsFragment() {
        super(C24300a.f62819d);
        C37588a0 a0Var = C37588a0.f90326a;
        C24305f fVar = new C24305f(new C24312l(this));
        C41217g a = C41219i.m119469a(C41222k.NONE, new C24308h(new C24307g(this)));
        this.f62817j = C1514j0.m5374c(this, C41520a0.m120436b(C24315c.class), new C24309i(a), new C24310j((C43064a) null, a), fVar);
    }

    /* renamed from: l1 */
    private final C26233a m78207l1() {
        return (C26233a) this.f62818k.getValue();
    }

    /* renamed from: m1 */
    private final C24315c m78208m1() {
        return (C24315c) this.f62817j.getValue();
    }

    /* access modifiers changed from: private */
    /* renamed from: n1 */
    public final void m78209n1(C24321d dVar) {
        C1505h requireActivity = requireActivity();
        C41536l.m120488h(requireActivity, "requireActivity()");
        FragmentManager childFragmentManager = getChildFragmentManager();
        C41536l.m120488h(childFragmentManager, "childFragmentManager");
        dVar.mo62015a(requireActivity, this, childFragmentManager);
    }

    /* renamed from: o1 */
    private final void m78210o1() {
        C24315c m1 = m78208m1();
        m1.mo62007iw().mo4819k(getViewLifecycleOwner(), new C24304e(new C24301b(m78207l1())));
        LiveData jw = m1.mo62008jw();
        C1619q viewLifecycleOwner = getViewLifecycleOwner();
        FrameLayout frameLayout = ((C28402h) mo64933i1()).f72030f;
        C41536l.m120488h(frameLayout, "binding.progressBarView");
        jw.mo4819k(viewLifecycleOwner, new C24304e(new C24302c(frameLayout)));
        LiveData hw = m1.mo62006hw();
        C1619q viewLifecycleOwner2 = getViewLifecycleOwner();
        C41536l.m120488h(viewLifecycleOwner2, "viewLifecycleOwner");
        C37224b.m109963b(hw, viewLifecycleOwner2, new C24303d(this));
    }

    /* renamed from: c3 */
    public void mo47610c3() {
        m78208m1().mo62005c3();
    }

    /* renamed from: f3 */
    public void mo47611f3() {
        m78208m1().mo62010lw();
    }

    /* renamed from: g3 */
    public void mo47612g3() {
        m78208m1().mo62009kw();
    }

    /* renamed from: k1 */
    public final C24315c.C24316a mo61995k1() {
        C24315c.C24316a aVar = this.f62816i;
        if (aVar != null) {
            return aVar;
        }
        C41536l.m120506z("factory");
        return null;
    }

    public void onViewCreated(View view, Bundle bundle) {
        C41536l.m120489i(view, "view");
        RecyclerView recyclerView = ((C28402h) mo64933i1()).f72031g;
        super.onViewCreated(view, bundle);
        refreshHeaderText(C32343x.m95388F("giftcard.giver.product.name", new Object[0]));
        recyclerView.setAdapter(m78207l1());
        C1505h activity = getActivity();
        C41536l.m120487g(activity, "null cannot be cast to non-null type ge.bog.mobilebank.giftcards.presentation.activity.ContentScrollListener");
        C30308a aVar = (C30308a) activity;
        aVar.mo61582M(C27006a.f67780d);
        aVar.mo61583q0(false, true);
        m78210o1();
    }
}
