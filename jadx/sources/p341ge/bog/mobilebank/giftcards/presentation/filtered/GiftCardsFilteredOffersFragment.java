package p341ge.bog.mobilebank.giftcards.presentation.filtered;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
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
import ba1.C10145d;
import he1.C41212c;
import he1.C41217g;
import he1.C41222k;
import he1.C41233s;
import he1.C41238w;
import java.util.List;
import java.util.Set;
import kotlin.jvm.internal.C41520a0;
import kotlin.jvm.internal.C41532h;
import kotlin.jvm.internal.C41535k;
import kotlin.jvm.internal.C41536l;
import kotlin.jvm.internal.C41537m;
import kotlin.jvm.internal.DefaultConstructorMarker;
import m41.C37224b;
import o31.C37588a0;
import o31.C37615r;
import oh0.C27010e;
import oh0.C27014i;
import p163m0.C7047a;
import p228r0.C8034d;
import p341ge.bog.mobilebank.giftcards.presentation.activity.GiftCardFlowMode;
import p341ge.bog.mobilebank.giftcards.presentation.activity.GiftCardsActivity;
import p341ge.bog.mobilebank.giftcards.presentation.activity.GiftCardsFlow;
import p341ge.bog.mobilebank.giftcards.presentation.chooseanimation.model.GiftCardsMerchantAnimationsModel;
import p341ge.bog.mobilebank.giftcards.presentation.filtered.C24246a;
import p341ge.bog.mobilebank.giftcards.presentation.filtered.C24250b;
import p341ge.bog.mobilebank.giftcards.presentation.filtered.C24263f;
import p341ge.bog.mobilebank.shared.helper.C34646b;
import p341ge.bog.mobilebank.shared.helper.StringSource;
import th0.C28414n;
import ti0.C28439a;
import ue1.C43064a;
import ue1.C43075l;
import ue1.C43079p;

/* renamed from: ge.bog.mobilebank.giftcards.presentation.filtered.GiftCardsFilteredOffersFragment */
public final class GiftCardsFilteredOffersFragment extends C24268g implements C24246a.C24249c {

    /* renamed from: g */
    private C28414n f62697g;

    /* renamed from: h */
    private final C41217g f62698h = C41219i.m119470b(new C24234b(this));

    /* renamed from: i */
    public C24263f.C24266c f62699i;

    /* renamed from: j */
    private final C41217g f62700j;

    /* renamed from: k */
    private final C41217g f62701k;

    /* renamed from: ge.bog.mobilebank.giftcards.presentation.filtered.GiftCardsFilteredOffersFragment$a */
    static final class C24233a extends C41537m implements C43064a {

        /* renamed from: d */
        final /* synthetic */ GiftCardsFilteredOffersFragment f62702d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C24233a(GiftCardsFilteredOffersFragment giftCardsFilteredOffersFragment) {
            super(0);
            this.f62702d = giftCardsFilteredOffersFragment;
        }

        /* renamed from: b */
        public final C24246a invoke() {
            return new C24246a(this.f62702d);
        }
    }

    /* renamed from: ge.bog.mobilebank.giftcards.presentation.filtered.GiftCardsFilteredOffersFragment$b */
    static final class C24234b extends C41537m implements C43064a {

        /* renamed from: d */
        final /* synthetic */ GiftCardsFilteredOffersFragment f62703d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C24234b(GiftCardsFilteredOffersFragment giftCardsFilteredOffersFragment) {
            super(0);
            this.f62703d = giftCardsFilteredOffersFragment;
        }

        /* renamed from: b */
        public final GiftCardsFlow.FilteredOffers invoke() {
            Bundle arguments = this.f62703d.getArguments();
            GiftCardsFlow.FilteredOffers filteredOffers = arguments != null ? (GiftCardsFlow.FilteredOffers) arguments.getParcelable(this.f62703d.getString(C27014i.gift_cards_flow_extra)) : null;
            C41536l.m120486f(filteredOffers);
            return filteredOffers;
        }
    }

    /* renamed from: ge.bog.mobilebank.giftcards.presentation.filtered.GiftCardsFilteredOffersFragment$c */
    static final class C24235c extends C41537m implements C43075l {

        /* renamed from: d */
        final /* synthetic */ GiftCardsFilteredOffersFragment f62704d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C24235c(GiftCardsFilteredOffersFragment giftCardsFilteredOffersFragment) {
            super(1);
            this.f62704d = giftCardsFilteredOffersFragment;
        }

        /* renamed from: a */
        public final void mo61889a(StringSource stringSource) {
            GiftCardsFilteredOffersFragment giftCardsFilteredOffersFragment = this.f62704d;
            C41536l.m120488h(stringSource, "title");
            giftCardsFilteredOffersFragment.refreshHeaderText(C34646b.m101752f(stringSource, (Context) null, 1, (Object) null));
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            mo61889a((StringSource) obj);
            return C41238w.f97225a;
        }
    }

    /* renamed from: ge.bog.mobilebank.giftcards.presentation.filtered.GiftCardsFilteredOffersFragment$d */
    /* synthetic */ class C24236d extends C41535k implements C43075l {
        C24236d(Object obj) {
            super(1, obj, C24246a.class, "submitList", "submitList(Ljava/util/List;)V", 0);
        }

        /* renamed from: b */
        public final void mo61890b(List list) {
            ((C24246a) this.receiver).mo6029i(list);
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            mo61890b((List) obj);
            return C41238w.f97225a;
        }
    }

    /* renamed from: ge.bog.mobilebank.giftcards.presentation.filtered.GiftCardsFilteredOffersFragment$e */
    static final class C24237e extends C41537m implements C43075l {

        /* renamed from: d */
        final /* synthetic */ GiftCardsFilteredOffersFragment f62705d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C24237e(GiftCardsFilteredOffersFragment giftCardsFilteredOffersFragment) {
            super(1);
            this.f62705d = giftCardsFilteredOffersFragment;
        }

        /* renamed from: a */
        public final void mo61891a(C24250b bVar) {
            C41536l.m120489i(bVar, "event");
            if (bVar instanceof C24250b.C24251a) {
                this.f62705d.m78040u1(((C24250b.C24251a) bVar).mo61900a());
            } else if (bVar instanceof C24250b.C24252b) {
                this.f62705d.m78041v1(((C24250b.C24252b) bVar).mo61904a());
            }
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            mo61891a((C24250b) obj);
            return C41238w.f97225a;
        }
    }

    /* renamed from: ge.bog.mobilebank.giftcards.presentation.filtered.GiftCardsFilteredOffersFragment$f */
    static final class C24238f extends C41537m implements C43079p {

        /* renamed from: d */
        final /* synthetic */ GiftCardsFilteredOffersFragment f62706d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C24238f(GiftCardsFilteredOffersFragment giftCardsFilteredOffersFragment) {
            super(2);
            this.f62706d = giftCardsFilteredOffersFragment;
        }

        /* renamed from: a */
        public final void mo61892a(String str, Bundle bundle) {
            C41536l.m120489i(str, "<anonymous parameter 0>");
            C41536l.m120489i(bundle, "bundle");
            GiftCardsFlow.FilteredOffers filteredOffers = (GiftCardsFlow.FilteredOffers) bundle.getParcelable("FILTER_RESULT_DATA");
            if (filteredOffers != null) {
                this.f62706d.m78037r1().mo61931ow(filteredOffers.mo61610b());
            }
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            mo61892a((String) obj, (Bundle) obj2);
            return C41238w.f97225a;
        }
    }

    /* renamed from: ge.bog.mobilebank.giftcards.presentation.filtered.GiftCardsFilteredOffersFragment$g */
    static final class C24239g implements C1645y, C41532h {

        /* renamed from: a */
        private final /* synthetic */ C43075l f62707a;

        C24239g(C43075l lVar) {
            C41536l.m120489i(lVar, "function");
            this.f62707a = lVar;
        }

        public final boolean equals(Object obj) {
            if (!(obj instanceof C1645y) || !(obj instanceof C41532h)) {
                return false;
            }
            return C41536l.m120484d(getFunctionDelegate(), ((C41532h) obj).getFunctionDelegate());
        }

        public final C41212c getFunctionDelegate() {
            return this.f62707a;
        }

        public final int hashCode() {
            return getFunctionDelegate().hashCode();
        }

        public final /* synthetic */ void onChanged(Object obj) {
            this.f62707a.invoke(obj);
        }
    }

    /* renamed from: ge.bog.mobilebank.giftcards.presentation.filtered.GiftCardsFilteredOffersFragment$h */
    public static final class C24240h extends C41537m implements C43064a {

        /* renamed from: d */
        final /* synthetic */ Fragment f62708d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C24240h(Fragment fragment) {
            super(0);
            this.f62708d = fragment;
        }

        public final Fragment invoke() {
            return this.f62708d;
        }
    }

    /* renamed from: ge.bog.mobilebank.giftcards.presentation.filtered.GiftCardsFilteredOffersFragment$i */
    public static final class C24241i extends C41537m implements C43064a {

        /* renamed from: d */
        final /* synthetic */ C43064a f62709d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C24241i(C43064a aVar) {
            super(0);
            this.f62709d = aVar;
        }

        public final C1638u0 invoke() {
            return (C1638u0) this.f62709d.invoke();
        }
    }

    /* renamed from: ge.bog.mobilebank.giftcards.presentation.filtered.GiftCardsFilteredOffersFragment$j */
    public static final class C24242j extends C41537m implements C43064a {

        /* renamed from: d */
        final /* synthetic */ C41217g f62710d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C24242j(C41217g gVar) {
            super(0);
            this.f62710d = gVar;
        }

        public final C1636t0 invoke() {
            C1636t0 viewModelStore = C1514j0.m5375d(this.f62710d).getViewModelStore();
            C41536l.m120488h(viewModelStore, "owner.viewModelStore");
            return viewModelStore;
        }
    }

    /* renamed from: ge.bog.mobilebank.giftcards.presentation.filtered.GiftCardsFilteredOffersFragment$k */
    public static final class C24243k extends C41537m implements C43064a {

        /* renamed from: d */
        final /* synthetic */ C43064a f62711d;

        /* renamed from: e */
        final /* synthetic */ C41217g f62712e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C24243k(C43064a aVar, C41217g gVar) {
            super(0);
            this.f62711d = aVar;
            this.f62712e = gVar;
        }

        public final C7047a invoke() {
            C7047a aVar;
            C43064a aVar2 = this.f62711d;
            if (aVar2 != null && (aVar = (C7047a) aVar2.invoke()) != null) {
                return aVar;
            }
            C1638u0 a = C1514j0.m5375d(this.f62712e);
            C1591i iVar = a instanceof C1591i ? (C1591i) a : null;
            C7047a defaultViewModelCreationExtras = iVar != null ? iVar.getDefaultViewModelCreationExtras() : null;
            return defaultViewModelCreationExtras == null ? C7047a.C7048a.f20987b : defaultViewModelCreationExtras;
        }
    }

    /* renamed from: ge.bog.mobilebank.giftcards.presentation.filtered.GiftCardsFilteredOffersFragment$l */
    static final class C24244l extends C41537m implements C43064a {

        /* renamed from: d */
        final /* synthetic */ GiftCardsFilteredOffersFragment f62713d;

        /* renamed from: ge.bog.mobilebank.giftcards.presentation.filtered.GiftCardsFilteredOffersFragment$l$a */
        static final class C24245a extends C41537m implements C43064a {

            /* renamed from: d */
            final /* synthetic */ GiftCardsFilteredOffersFragment f62714d;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            C24245a(GiftCardsFilteredOffersFragment giftCardsFilteredOffersFragment) {
                super(0);
                this.f62714d = giftCardsFilteredOffersFragment;
            }

            /* renamed from: b */
            public final C24263f invoke() {
                return this.f62714d.mo61886q1().mo32831a(this.f62714d.m78036p1());
            }
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C24244l(GiftCardsFilteredOffersFragment giftCardsFilteredOffersFragment) {
            super(0);
            this.f62713d = giftCardsFilteredOffersFragment;
        }

        public final C1620q0.C1624b invoke() {
            return C37588a0.f90326a.mo90779a(new C24245a(this.f62713d));
        }
    }

    public GiftCardsFilteredOffersFragment() {
        C24244l lVar = new C24244l(this);
        C41217g a = C41219i.m119469a(C41222k.NONE, new C24241i(new C24240h(this)));
        this.f62700j = C1514j0.m5374c(this, C41520a0.m120436b(C24263f.class), new C24242j(a), new C24243k((C43064a) null, a), lVar);
        this.f62701k = C41219i.m119470b(new C24233a(this));
    }

    /* renamed from: n1 */
    private final C24246a m78034n1() {
        return (C24246a) this.f62701k.getValue();
    }

    /* renamed from: o1 */
    private final C28414n m78035o1() {
        C28414n nVar = this.f62697g;
        C41536l.m120486f(nVar);
        return nVar;
    }

    private final void observeData() {
        C24263f r1 = m78037r1();
        r1.mo61933rw().mo4819k(getViewLifecycleOwner(), new C24239g(new C24235c(this)));
        r1.mo61932qw().mo4819k(getViewLifecycleOwner(), new C24239g(new C24236d(m78034n1())));
        LiveData sw = r1.mo61934sw();
        C1619q viewLifecycleOwner = getViewLifecycleOwner();
        C41536l.m120488h(viewLifecycleOwner, "viewLifecycleOwner");
        C37224b.m109963b(sw, viewLifecycleOwner, new C24237e(this));
    }

    /* access modifiers changed from: private */
    /* renamed from: p1 */
    public final GiftCardsFlow.FilteredOffers m78036p1() {
        return (GiftCardsFlow.FilteredOffers) this.f62698h.getValue();
    }

    /* access modifiers changed from: private */
    /* renamed from: r1 */
    public final C24263f m78037r1() {
        return (C24263f) this.f62700j.getValue();
    }

    /* renamed from: s1 */
    private final void m78038s1() {
        C28414n o1 = m78035o1();
        o1.f72147e.setLayoutManager(new GiftCardsFilteredOffersFragment$initViews$1$1(o1, getContext()));
        o1.f72147e.setItemAnimator(new C37615r(C24254d.f62724b.mo61917a()));
        o1.f72147e.setAdapter(m78034n1());
        o1.f72147e.setOnScrollChangeListener(new C28439a(o1, this));
    }

    /* access modifiers changed from: private */
    /* renamed from: t1 */
    public static final void m78039t1(C28414n nVar, GiftCardsFilteredOffersFragment giftCardsFilteredOffersFragment, View view, int i, int i2, int i3, int i4) {
        C41536l.m120489i(nVar, "$this_with");
        C41536l.m120489i(giftCardsFilteredOffersFragment, "this$0");
        if (nVar.f72147e.getScrollState() == 1) {
            Context requireContext = giftCardsFilteredOffersFragment.requireContext();
            C41536l.m120488h(requireContext, "requireContext()");
            C41536l.m120488h(view, "v");
            C10145d.m37091e(requireContext, view);
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: u1 */
    public final void m78040u1(Set set) {
        C8034d.m30522a(this).mo22118M(C27010e.action_giftCardsFilteredOffersFragment_to_giftCardsFilterFragment, C0908e.m3336b(C41233s.m119492a(getString(C27014i.gift_cards_flow_extra), new GiftCardsFlow.Filter(false, set, 1, (DefaultConstructorMarker) null))));
        C1533o.m5446c(this, "FILTER_REQUEST_KEY", new C24238f(this));
    }

    /* access modifiers changed from: private */
    /* renamed from: v1 */
    public final void m78041v1(GiftCardsMerchantAnimationsModel giftCardsMerchantAnimationsModel) {
        GiftCardsActivity.C24064a aVar = GiftCardsActivity.f62414H;
        Context requireContext = requireContext();
        C41536l.m120488h(requireContext, "requireContext()");
        aVar.mo61584a(requireContext, new GiftCardsFlow.Animations(false, giftCardsMerchantAnimationsModel, (GiftCardFlowMode) null, 5, (DefaultConstructorMarker) null));
    }

    /* renamed from: G */
    public void mo61882G() {
        m78037r1().mo61930G();
    }

    /* renamed from: I0 */
    public void mo61883I0(long j) {
        m78037r1().mo61935tw(j);
    }

    /* renamed from: N */
    public void mo61884N(long j, long j2) {
        m78037r1().mo61936uw(j, j2);
    }

    /* renamed from: f */
    public void mo61885f(String str) {
        C41536l.m120489i(str, "query");
        m78037r1().mo61937vw(str);
    }

    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        C41536l.m120489i(layoutInflater, "inflater");
        this.f62697g = C28414n.m87178d(layoutInflater, viewGroup, false);
        RecyclerView c = m78035o1().mo3946b();
        C41536l.m120488h(c, "binding.root");
        return c;
    }

    public void onDestroyView() {
        super.onDestroyView();
        this.f62697g = null;
    }

    public void onViewCreated(View view, Bundle bundle) {
        C41536l.m120489i(view, "view");
        super.onViewCreated(view, bundle);
        m78038s1();
        observeData();
    }

    /* renamed from: q1 */
    public final C24263f.C24266c mo61886q1() {
        C24263f.C24266c cVar = this.f62699i;
        if (cVar != null) {
            return cVar;
        }
        C41536l.m120506z("factory");
        return null;
    }
}
