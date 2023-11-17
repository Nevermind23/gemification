package p341ge.bog.mobilebank.lifestyleoffers.presentation.home;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.activity.result.ActivityResult;
import androidx.activity.result.C0173b;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
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
import b41.C31128a;
import g91.C32343x;
import go0.C15396a;
import go0.C15397b;
import go0.C15398c;
import go0.C15399d;
import go0.C15400e;
import go0.C15401f;
import go0.C15402g;
import go0.C15403h;
import go0.C15404i;
import go0.C15405j;
import go0.C15406k;
import he1.C41212c;
import he1.C41217g;
import he1.C41222k;
import he1.C41224m;
import he1.C41238w;
import ho0.C15569i;
import iu0.C36546y;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import ko0.C16521c;
import kotlin.jvm.internal.C41520a0;
import kotlin.jvm.internal.C41532h;
import kotlin.jvm.internal.C41535k;
import kotlin.jvm.internal.C41536l;
import kotlin.jvm.internal.C41537m;
import kotlin.jvm.internal.DefaultConstructorMarker;
import m41.C37223a;
import m41.C37224b;
import o31.C37602i;
import o31.C37621w;
import p017b.C2106d;
import p163m0.C7047a;
import p341ge.bog.mobilebank.cleanarch.presentation.common.C21481a;
import p341ge.bog.mobilebank.cleanarch.presentation.common.C21507e;
import p341ge.bog.mobilebank.lifestyleoffers.presentation.allcategories.LifestyleOffersAllCategoriesActivity;
import p341ge.bog.mobilebank.lifestyleoffers.presentation.chooser.LifestyleChooserActivity;
import p341ge.bog.mobilebank.lifestyleoffers.presentation.home.LifestyleOffersHomeViewModel;
import p341ge.bog.mobilebank.lifestyleoffers.presentation.offer.activity.LifestyleOfferDetailedActivity;
import p341ge.bog.mobilebank.lifestyleoffers.presentation.offer.activity.LifestyleOffersByCategoryActivity;
import p341ge.bog.mobilebank.lifestyleoffers.presentation.progress.progresslist.LifestyleOffersProgressActivity;
import p341ge.bog.mobilebank.lifestyleoffers.presentation.shared.VisibilityPercentageLayoutManager;
import p341ge.bog.mobilebank.lifestyleoffers.presentation.shared.model.LifestyleOffersFilterResultData;
import p341ge.bog.mobilebank.p975ui.fragments.C35651n1;
import p380ck.C10464h;
import q31.C38122f;
import q31.C38125h;
import ro0.C17703e;
import ro0.C17708g;
import ro0.C17709h;
import sn0.C17899c;
import ue1.C43064a;
import ue1.C43075l;
import uo0.C18274f;
import xn0.C18851i;

/* renamed from: ge.bog.mobilebank.lifestyleoffers.presentation.home.a */
public final class C15000a extends C35651n1 implements C21507e {

    /* renamed from: j */
    public static final C15001a f43228j = new C15001a((DefaultConstructorMarker) null);

    /* renamed from: d */
    private C18851i f43229d;

    /* renamed from: e */
    private final C41217g f43230e;
    /* access modifiers changed from: private */

    /* renamed from: f */
    public final C15569i f43231f = new C15569i();
    /* access modifiers changed from: private */

    /* renamed from: g */
    public C0173b f43232g;

    /* renamed from: h */
    private final C17703e f43233h = new C17703e(new C15012l(this));

    /* renamed from: i */
    private boolean f43234i;

    /* renamed from: ge.bog.mobilebank.lifestyleoffers.presentation.home.a$a */
    public static final class C15001a {
        private C15001a() {
        }

        public /* synthetic */ C15001a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* renamed from: a */
        public final C15000a mo41973a(boolean z) {
            C15000a aVar = new C15000a();
            aVar.setViewPagerFragment(z);
            return aVar;
        }
    }

    /* renamed from: ge.bog.mobilebank.lifestyleoffers.presentation.home.a$b */
    static final class C15002b extends C41537m implements C43075l {

        /* renamed from: d */
        final /* synthetic */ C15000a f43235d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C15002b(C15000a aVar) {
            super(1);
            this.f43235d = aVar;
        }

        /* renamed from: a */
        public final void mo41974a(List list) {
            this.f43235d.f43231f.mo6029i(list);
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            mo41974a((List) obj);
            return C41238w.f97225a;
        }
    }

    /* renamed from: ge.bog.mobilebank.lifestyleoffers.presentation.home.a$c */
    static final class C15003c extends C41537m implements C43075l {

        /* renamed from: d */
        final /* synthetic */ C15000a f43236d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C15003c(C15000a aVar) {
            super(1);
            this.f43236d = aVar;
        }

        /* renamed from: a */
        public final void mo41975a(C37223a aVar) {
            Long l = (Long) aVar.mo90296a();
            if (l != null) {
                C15000a aVar2 = this.f43236d;
                long longValue = l.longValue();
                LifestyleOfferDetailedActivity.C15022a aVar3 = LifestyleOfferDetailedActivity.f43256J;
                Context requireContext = aVar2.requireContext();
                C41536l.m120488h(requireContext, "requireContext()");
                aVar3.mo41989a(requireContext, longValue);
            }
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            mo41975a((C37223a) obj);
            return C41238w.f97225a;
        }
    }

    /* renamed from: ge.bog.mobilebank.lifestyleoffers.presentation.home.a$d */
    static final class C15004d extends C41537m implements C43075l {

        /* renamed from: d */
        final /* synthetic */ C15000a f43237d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C15004d(C15000a aVar) {
            super(1);
            this.f43237d = aVar;
        }

        /* renamed from: a */
        public final void mo41976a(C37223a aVar) {
            C41224m mVar = (C41224m) aVar.mo90296a();
            if (mVar != null) {
                C15000a aVar2 = this.f43237d;
                Context requireContext = aVar2.requireContext();
                C41536l.m120488h(requireContext, "requireContext()");
                C38122f c = C38125h.m112238c(requireContext);
                Context requireContext2 = aVar2.requireContext();
                C41536l.m120488h(requireContext2, "requireContext()");
                c.mo91561L0(((Number) mVar.mo95675a()).longValue(), (String) mVar.mo95676b(), requireContext2);
            }
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            mo41976a((C37223a) obj);
            return C41238w.f97225a;
        }
    }

    /* renamed from: ge.bog.mobilebank.lifestyleoffers.presentation.home.a$e */
    static final class C15005e extends C41537m implements C43075l {

        /* renamed from: d */
        final /* synthetic */ C15000a f43238d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C15005e(C15000a aVar) {
            super(1);
            this.f43238d = aVar;
        }

        /* renamed from: a */
        public final void mo41977a(C37223a aVar) {
            Context context;
            if (((C41238w) aVar.mo90296a()) != null && (context = this.f43238d.getContext()) != null) {
                LifestyleOffersAllCategoriesActivity.C14936a aVar2 = LifestyleOffersAllCategoriesActivity.f43098M;
                C41536l.m120488h(context, "it");
                LifestyleOffersAllCategoriesActivity.C14936a.m54784b(aVar2, context, (LifestyleOffersFilterResultData) null, 2, (Object) null);
            }
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            mo41977a((C37223a) obj);
            return C41238w.f97225a;
        }
    }

    /* renamed from: ge.bog.mobilebank.lifestyleoffers.presentation.home.a$f */
    static final class C15006f extends C41537m implements C43075l {

        /* renamed from: d */
        final /* synthetic */ C15000a f43239d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C15006f(C15000a aVar) {
            super(1);
            this.f43239d = aVar;
        }

        /* renamed from: a */
        public final void mo41978a(C37223a aVar) {
            if (aVar != null && ((C41238w) aVar.mo90296a()) != null) {
                C15000a aVar2 = this.f43239d;
                LifestyleChooserActivity.C14960a aVar3 = LifestyleChooserActivity.f43144J;
                Context requireContext = aVar2.requireContext();
                C41536l.m120488h(requireContext, "requireContext()");
                aVar3.mo41896a(requireContext, aVar2.f43232g);
            }
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            mo41978a((C37223a) obj);
            return C41238w.f97225a;
        }
    }

    /* renamed from: ge.bog.mobilebank.lifestyleoffers.presentation.home.a$g */
    static final class C15007g extends C41537m implements C43075l {

        /* renamed from: d */
        final /* synthetic */ C15000a f43240d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C15007g(C15000a aVar) {
            super(1);
            this.f43240d = aVar;
        }

        /* renamed from: a */
        public final void mo41979a(C41238w wVar) {
            C41536l.m120489i(wVar, "it");
            LifestyleOffersByCategoryActivity.C15033a aVar = LifestyleOffersByCategoryActivity.f43273L;
            Context requireContext = this.f43240d.requireContext();
            C41536l.m120488h(requireContext, "requireContext()");
            LifestyleOffersByCategoryActivity.C15033a.m55134b(aVar, requireContext, 0, true, 2, (Object) null);
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            mo41979a((C41238w) obj);
            return C41238w.f97225a;
        }
    }

    /* renamed from: ge.bog.mobilebank.lifestyleoffers.presentation.home.a$h */
    static final class C15008h extends C41537m implements C43075l {

        /* renamed from: d */
        final /* synthetic */ C15000a f43241d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C15008h(C15000a aVar) {
            super(1);
            this.f43241d = aVar;
        }

        /* renamed from: a */
        public final void mo41980a(LifestyleOffersFilterResultData lifestyleOffersFilterResultData) {
            C41536l.m120489i(lifestyleOffersFilterResultData, "filterData");
            LifestyleOffersAllCategoriesActivity.C14936a aVar = LifestyleOffersAllCategoriesActivity.f43098M;
            Context requireContext = this.f43241d.requireContext();
            C41536l.m120488h(requireContext, "requireContext()");
            aVar.mo41862a(requireContext, lifestyleOffersFilterResultData);
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            mo41980a((LifestyleOffersFilterResultData) obj);
            return C41238w.f97225a;
        }
    }

    /* renamed from: ge.bog.mobilebank.lifestyleoffers.presentation.home.a$i */
    static final class C15009i extends C41537m implements C43075l {

        /* renamed from: d */
        final /* synthetic */ C15000a f43242d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C15009i(C15000a aVar) {
            super(1);
            this.f43242d = aVar;
        }

        /* renamed from: a */
        public final void mo41981a(C37223a aVar) {
            Long l = (Long) aVar.mo90296a();
            if (l != null) {
                C15000a aVar2 = this.f43242d;
                long longValue = l.longValue();
                LifestyleOffersByCategoryActivity.C15033a aVar3 = LifestyleOffersByCategoryActivity.f43273L;
                Context requireContext = aVar2.requireContext();
                C41536l.m120488h(requireContext, "requireContext()");
                LifestyleOffersByCategoryActivity.C15033a.m55134b(aVar3, requireContext, longValue, false, 4, (Object) null);
            }
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            mo41981a((C37223a) obj);
            return C41238w.f97225a;
        }
    }

    /* renamed from: ge.bog.mobilebank.lifestyleoffers.presentation.home.a$j */
    static final class C15010j extends C41537m implements C43075l {

        /* renamed from: d */
        final /* synthetic */ C15000a f43243d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C15010j(C15000a aVar) {
            super(1);
            this.f43243d = aVar;
        }

        /* renamed from: a */
        public final void mo41982a(C16521c cVar) {
            C41536l.m120489i(cVar, "position");
            LifestyleOffersProgressActivity.C15063b bVar = LifestyleOffersProgressActivity.f43312K;
            Context requireContext = this.f43243d.requireContext();
            C41536l.m120488h(requireContext, "requireContext()");
            bVar.mo42030a(requireContext, cVar);
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            mo41982a((C16521c) obj);
            return C41238w.f97225a;
        }
    }

    /* renamed from: ge.bog.mobilebank.lifestyleoffers.presentation.home.a$k */
    static final class C15011k extends C41537m implements C43075l {

        /* renamed from: d */
        final /* synthetic */ C15000a f43244d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C15011k(C15000a aVar) {
            super(1);
            this.f43244d = aVar;
        }

        /* renamed from: a */
        public final void mo41983a(C31128a aVar) {
            if (aVar instanceof C31128a.C31130b) {
                this.f43244d.m55035C1(true);
            } else if (aVar instanceof C31128a.C31131c) {
                this.f43244d.m55035C1(false);
                this.f43244d.m55065z1().f52751f.mo5425x1(0);
            } else if (aVar instanceof C31128a.C31129a) {
                this.f43244d.m55035C1(false);
                FrameLayout frameLayout = this.f43244d.m55065z1().f52753h;
                C41536l.m120488h(frameLayout, "binding.retryButtonContainer");
                C32343x.m95447f1(frameLayout);
                this.f43244d.handleError(((C31128a.C31129a) aVar).mo71342c());
            }
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            mo41983a((C31128a) obj);
            return C41238w.f97225a;
        }
    }

    /* renamed from: ge.bog.mobilebank.lifestyleoffers.presentation.home.a$l */
    /* synthetic */ class C15012l extends C41535k implements C43064a {
        C15012l(Object obj) {
            super(0, obj, C15000a.class, "getVisibleOffers", "getVisibleOffers()Ljava/util/Map;", 0);
        }

        /* renamed from: b */
        public final Map invoke() {
            return ((C15000a) this.receiver).m55034B1();
        }
    }

    /* renamed from: ge.bog.mobilebank.lifestyleoffers.presentation.home.a$m */
    static final class C15013m implements C1645y, C41532h {

        /* renamed from: a */
        private final /* synthetic */ C43075l f43245a;

        C15013m(C43075l lVar) {
            C41536l.m120489i(lVar, "function");
            this.f43245a = lVar;
        }

        public final boolean equals(Object obj) {
            if (!(obj instanceof C1645y) || !(obj instanceof C41532h)) {
                return false;
            }
            return C41536l.m120484d(getFunctionDelegate(), ((C41532h) obj).getFunctionDelegate());
        }

        public final C41212c getFunctionDelegate() {
            return this.f43245a;
        }

        public final int hashCode() {
            return getFunctionDelegate().hashCode();
        }

        public final /* synthetic */ void onChanged(Object obj) {
            this.f43245a.invoke(obj);
        }
    }

    /* renamed from: ge.bog.mobilebank.lifestyleoffers.presentation.home.a$n */
    public static final class C15014n extends C41537m implements C43064a {

        /* renamed from: d */
        final /* synthetic */ Fragment f43246d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C15014n(Fragment fragment) {
            super(0);
            this.f43246d = fragment;
        }

        public final Fragment invoke() {
            return this.f43246d;
        }
    }

    /* renamed from: ge.bog.mobilebank.lifestyleoffers.presentation.home.a$o */
    public static final class C15015o extends C41537m implements C43064a {

        /* renamed from: d */
        final /* synthetic */ C43064a f43247d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C15015o(C43064a aVar) {
            super(0);
            this.f43247d = aVar;
        }

        public final C1638u0 invoke() {
            return (C1638u0) this.f43247d.invoke();
        }
    }

    /* renamed from: ge.bog.mobilebank.lifestyleoffers.presentation.home.a$p */
    public static final class C15016p extends C41537m implements C43064a {

        /* renamed from: d */
        final /* synthetic */ C41217g f43248d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C15016p(C41217g gVar) {
            super(0);
            this.f43248d = gVar;
        }

        public final C1636t0 invoke() {
            C1636t0 viewModelStore = C1514j0.m5375d(this.f43248d).getViewModelStore();
            C41536l.m120488h(viewModelStore, "owner.viewModelStore");
            return viewModelStore;
        }
    }

    /* renamed from: ge.bog.mobilebank.lifestyleoffers.presentation.home.a$q */
    public static final class C15017q extends C41537m implements C43064a {

        /* renamed from: d */
        final /* synthetic */ C43064a f43249d;

        /* renamed from: e */
        final /* synthetic */ C41217g f43250e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C15017q(C43064a aVar, C41217g gVar) {
            super(0);
            this.f43249d = aVar;
            this.f43250e = gVar;
        }

        public final C7047a invoke() {
            C7047a aVar;
            C43064a aVar2 = this.f43249d;
            if (aVar2 != null && (aVar = (C7047a) aVar2.invoke()) != null) {
                return aVar;
            }
            C1638u0 a = C1514j0.m5375d(this.f43250e);
            C1591i iVar = a instanceof C1591i ? (C1591i) a : null;
            C7047a defaultViewModelCreationExtras = iVar != null ? iVar.getDefaultViewModelCreationExtras() : null;
            return defaultViewModelCreationExtras == null ? C7047a.C7048a.f20987b : defaultViewModelCreationExtras;
        }
    }

    /* renamed from: ge.bog.mobilebank.lifestyleoffers.presentation.home.a$r */
    public static final class C15018r extends C41537m implements C43064a {

        /* renamed from: d */
        final /* synthetic */ Fragment f43251d;

        /* renamed from: e */
        final /* synthetic */ C41217g f43252e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C15018r(Fragment fragment, C41217g gVar) {
            super(0);
            this.f43251d = fragment;
            this.f43252e = gVar;
        }

        public final C1620q0.C1624b invoke() {
            C1620q0.C1624b bVar;
            C1638u0 a = C1514j0.m5375d(this.f43252e);
            C1591i iVar = a instanceof C1591i ? (C1591i) a : null;
            if (iVar == null || (bVar = iVar.getDefaultViewModelProviderFactory()) == null) {
                bVar = this.f43251d.getDefaultViewModelProviderFactory();
            }
            C41536l.m120488h(bVar, "(owner as? HasDefaultVie…tViewModelProviderFactory");
            return bVar;
        }
    }

    public C15000a() {
        C41217g a = C41219i.m119469a(C41222k.NONE, new C15015o(new C15014n(this)));
        this.f43230e = C1514j0.m5374c(this, C41520a0.m120436b(LifestyleOffersHomeViewModel.ViewModel.class), new C15016p(a), new C15017q((C43064a) null, a), new C15018r(this, a));
    }

    /* renamed from: A1 */
    private final LifestyleOffersHomeViewModel.ViewModel m55033A1() {
        return (LifestyleOffersHomeViewModel.ViewModel) this.f43230e.getValue();
    }

    /* access modifiers changed from: private */
    /* renamed from: B1 */
    public final Map m55034B1() {
        boolean z;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        if (m55065z1().f52751f.getScrollState() != 0) {
            z = true;
        } else {
            z = false;
        }
        if (this.f43231f.getItemCount() != 0 && !z) {
            RecyclerView.C1747p layoutManager = m55065z1().f52751f.getLayoutManager();
            C41536l.m120487g(layoutManager, "null cannot be cast to non-null type ge.bog.mobilebank.lifestyleoffers.presentation.shared.VisibilityPercentageLayoutManager");
            VisibilityPercentageLayoutManager visibilityPercentageLayoutManager = (VisibilityPercentageLayoutManager) layoutManager;
            int j2 = visibilityPercentageLayoutManager.mo5215j2();
            int o2 = visibilityPercentageLayoutManager.mo5221o2();
            if (j2 <= o2) {
                while (true) {
                    if (this.f43231f.getItemViewType(j2) == C18274f.C18281g.OFFERS.ordinal()) {
                        RecyclerView.C1734f0 e0 = m55065z1().f52751f.mo5320e0(j2);
                        C41536l.m120487g(e0, "null cannot be cast to non-null type ge.bog.mobilebank.lifestyleoffers.presentation.shared.OffersViewHolder");
                        linkedHashMap.putAll(((C17708g) e0).mo45274m("main"));
                    } else if (this.f43231f.getItemViewType(j2) == C18274f.C18281g.SLIDER.ordinal()) {
                        RecyclerView.C1734f0 e02 = m55065z1().f52751f.mo5320e0(j2);
                        C41536l.m120487g(e02, "null cannot be cast to non-null type ge.bog.mobilebank.lifestyleoffers.presentation.shared.SliderViewHolder");
                        linkedHashMap.putAll(((C17709h) e02).mo45276i("main"));
                    }
                    if (j2 == o2) {
                        break;
                    }
                    j2++;
                }
            }
        }
        return linkedHashMap;
    }

    /* access modifiers changed from: private */
    /* renamed from: C1 */
    public final void m55035C1(boolean z) {
        if (!z && m55065z1().f52754i.mo6147i()) {
            m55065z1().f52754i.setRefreshing(false);
        }
        FrameLayout frameLayout = m55065z1().f52753h;
        C41536l.m120488h(frameLayout, "binding.retryButtonContainer");
        C32343x.m95455i0(frameLayout);
        FrameLayout frameLayout2 = m55065z1().f52750e;
        C41536l.m120488h(frameLayout2, "binding.loadingView");
        C32343x.m95483r1(frameLayout2, z, false, 2, (Object) null);
    }

    /* access modifiers changed from: private */
    /* renamed from: D1 */
    public static final void m55036D1(C15000a aVar) {
        C41536l.m120489i(aVar, "this$0");
        C21481a.onRefresh$default(aVar.m55033A1(), 0, 1, (Object) null);
    }

    /* access modifiers changed from: private */
    /* renamed from: E1 */
    public static final void m55037E1(C15000a aVar, View view) {
        C41536l.m120489i(aVar, "this$0");
        aVar.m55033A1().onRefresh(6);
    }

    /* renamed from: F1 */
    private final void m55038F1() {
        this.f43232g = registerForActivityResult(new C2106d(), new C15397b(this));
    }

    /* access modifiers changed from: private */
    /* renamed from: G1 */
    public static final void m55039G1(C15000a aVar, ActivityResult activityResult) {
        C41536l.m120489i(aVar, "this$0");
        if (activityResult.mo371b() == -1) {
            aVar.m55033A1().mo41951pw().mo41941Yt();
        }
    }

    /* renamed from: H1 */
    private final void m55040H1() {
        RecyclerView recyclerView = m55065z1().f52751f;
        recyclerView.setLayoutManager(new VisibilityPercentageLayoutManager(requireContext()));
        int dimensionPixelSize = recyclerView.getResources().getDimensionPixelSize(C17899c.f50936a);
        recyclerView.setHasFixedSize(true);
        recyclerView.mo5351j(new C37621w(dimensionPixelSize, 0, 1, 2, (DefaultConstructorMarker) null));
        C41536l.m120488h(recyclerView, "setupViews$lambda$3");
        C37602i.m110577a(recyclerView);
        m55065z1().f52751f.setAdapter(this.f43231f);
        this.f43231f.setStateRestorationPolicy(RecyclerView.C1736h.C1737a.PREVENT_WHEN_EMPTY);
        this.f43231f.mo42808A(new C15399d(this));
        this.f43231f.mo42811v(new C15400e(this));
        this.f43231f.mo42814y(new C15401f(this));
        this.f43231f.mo42815z(new C15402g(this));
        this.f43231f.mo42813x(new C15403h(this));
        this.f43231f.mo42812w(new C15404i(this));
        this.f43231f.mo42809B(new C15405j(this));
        this.f43231f.mo42810C(new C15406k(this));
    }

    /* access modifiers changed from: private */
    /* renamed from: I1 */
    public static final void m55041I1(C15000a aVar, long j, Integer num) {
        C41536l.m120489i(aVar, "this$0");
        aVar.m55033A1().mo41951pw().mo41939Qq(j, num);
    }

    /* access modifiers changed from: private */
    /* renamed from: J1 */
    public static final void m55042J1(C15000a aVar, C16521c cVar) {
        C41536l.m120489i(aVar, "this$0");
        C41536l.m120489i(cVar, "progressInfoType");
        aVar.m55033A1().mo41951pw().mo41937Os(cVar);
    }

    /* access modifiers changed from: private */
    /* renamed from: K1 */
    public static final void m55043K1(C15000a aVar, long j, String str, boolean z) {
        C41536l.m120489i(aVar, "this$0");
        aVar.m55033A1().mo41951pw().mo41948h2(j, str, z);
    }

    /* access modifiers changed from: private */
    /* renamed from: L1 */
    public static final void m55044L1(C15000a aVar) {
        C41536l.m120489i(aVar, "this$0");
        aVar.m55033A1().mo41951pw().mo41940We();
    }

    /* access modifiers changed from: private */
    /* renamed from: M1 */
    public static final void m55045M1(C15000a aVar) {
        C41536l.m120489i(aVar, "this$0");
        aVar.m55033A1().mo41951pw().mo41935If();
    }

    /* access modifiers changed from: private */
    /* renamed from: N1 */
    public static final void m55046N1(C15000a aVar) {
        C41536l.m120489i(aVar, "this$0");
        aVar.m55033A1().mo41951pw().mo41943bi();
    }

    /* access modifiers changed from: private */
    /* renamed from: O1 */
    public static final void m55047O1(C15000a aVar, Long l, Integer num) {
        C41536l.m120489i(aVar, "this$0");
        aVar.m55033A1().mo41951pw().mo41947gb(l, num);
    }

    /* access modifiers changed from: private */
    /* renamed from: P1 */
    public static final void m55048P1(C15000a aVar) {
        C41536l.m120489i(aVar, "this$0");
        C36546y.m108282F().mo27152s("bnpl", "Offers_Page", "click_BNPL_component");
        C36546y.m108282F().mo27137H("BNPL_click_BNPL_component", "", "", (Bundle) null, C10464h.C10465a.FACEBOOK);
        Context requireContext = aVar.requireContext();
        C41536l.m120488h(requireContext, "requireContext()");
        C38122f c = C38125h.m112238c(requireContext);
        Context requireContext2 = aVar.requireContext();
        C41536l.m120488h(requireContext2, "requireContext()");
        c.mo91558K(requireContext2);
    }

    private final void observeData() {
        LifestyleOffersHomeViewModel.C14999c zw = m55033A1().mo41962zw();
        zw.mo41934I1().mo4819k(getViewLifecycleOwner(), new C15013m(new C15003c(this)));
        zw.mo41949i2().mo4819k(getViewLifecycleOwner(), new C15013m(new C15004d(this)));
        zw.mo41946g5().mo4819k(getViewLifecycleOwner(), new C15013m(new C15005e(this)));
        zw.mo41938Pd().mo4819k(getViewLifecycleOwner(), new C15013m(new C15006f(this)));
        LiveData Lh = zw.mo41936Lh();
        C1619q viewLifecycleOwner = getViewLifecycleOwner();
        C41536l.m120488h(viewLifecycleOwner, "viewLifecycleOwner");
        C37224b.m109963b(Lh, viewLifecycleOwner, new C15007g(this));
        LiveData f8 = zw.mo41945f8();
        C1619q viewLifecycleOwner2 = getViewLifecycleOwner();
        C41536l.m120488h(viewLifecycleOwner2, "viewLifecycleOwner");
        C37224b.m109963b(f8, viewLifecycleOwner2, new C15008h(this));
        zw.mo41950pg().mo4819k(getViewLifecycleOwner(), new C15013m(new C15009i(this)));
        LiveData co = zw.mo41944co();
        C1619q viewLifecycleOwner3 = getViewLifecycleOwner();
        C41536l.m120488h(viewLifecycleOwner3, "viewLifecycleOwner");
        C37224b.m109963b(co, viewLifecycleOwner3, new C15010j(this));
        zw.mo41933B1().mo4819k(getViewLifecycleOwner(), new C15013m(new C15011k(this)));
        zw.mo41959x().mo4819k(getViewLifecycleOwner(), new C15013m(new C15002b(this)));
    }

    /* access modifiers changed from: private */
    /* renamed from: z1 */
    public final C18851i m55065z1() {
        C18851i iVar = this.f43229d;
        C41536l.m120486f(iVar);
        return iVar;
    }

    /* renamed from: b3 */
    public void mo41971b3() {
        m55033A1().mo41951pw().mo41942b3();
        this.f43233h.mo45261h();
        this.f43234i = true;
    }

    /* renamed from: d3 */
    public void mo41972d3() {
        this.f43233h.mo45259e();
        this.f43233h.mo45260f();
        this.f43234i = false;
    }

    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        C41536l.m120489i(layoutInflater, "inflater");
        this.f43229d = C18851i.m63775d(layoutInflater, viewGroup, false);
        CoordinatorLayout c = m55065z1().mo3946b();
        C41536l.m120488h(c, "binding.root");
        return c;
    }

    public void onDestroy() {
        super.onDestroy();
        if (this.f43234i) {
            this.f43233h.mo45259e();
        }
    }

    public void onDestroyView() {
        super.onDestroyView();
        this.f43229d = null;
    }

    public void onPause() {
        super.onPause();
        this.f43233h.mo45259e();
        this.f43233h.mo45260f();
    }

    public void onResume() {
        super.onResume();
        this.f43233h.mo45261h();
    }

    public void onViewCreated(View view, Bundle bundle) {
        C41536l.m120489i(view, "view");
        super.onViewCreated(view, bundle);
        m55040H1();
        observeData();
        m55038F1();
        m55065z1().f52754i.setOnRefreshListener(new C15396a(this));
        m55065z1().f52752g.mo3946b().setOnClickListener(new C15398c(this));
    }
}
