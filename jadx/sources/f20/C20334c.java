package f20;

import android.content.Context;
import android.content.Intent;
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
import androidx.recyclerview.widget.C1832v;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import b00.C19305k;
import b41.C31128a;
import b41.C31132b;
import d20.C19854i;
import g91.C32359z0;
import h20.C24851a;
import h20.C24852b;
import he1.C41212c;
import he1.C41217g;
import he1.C41222k;
import he1.C41238w;
import i20.C25101a;
import i20.C25103c;
import i20.C25104d;
import i20.C25105e;
import i20.C25106f;
import ih0.C25209b;
import iu0.C36546y;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import k30.C25627a;
import kotlin.jvm.internal.C41520a0;
import kotlin.jvm.internal.C41532h;
import kotlin.jvm.internal.C41535k;
import kotlin.jvm.internal.C41536l;
import kotlin.jvm.internal.C41537m;
import kotlin.jvm.internal.DefaultConstructorMarker;
import l50.C25840t;
import m41.C37224b;
import org.parceler.C42035e;
import p163m0.C7047a;
import p341ge.bog.mobilebank.cleanarch.banner.presentation.model.BannerDeepLinkData;
import p341ge.bog.mobilebank.cleanarch.banner.presentation.model.BannerParameterData;
import p341ge.bog.mobilebank.cleanarch.gamification.views.GamificationBanner;
import p341ge.bog.mobilebank.cleanarch.junior.presentation.JuniorRequestDataUiModel;
import p341ge.bog.mobilebank.cleanarch.presentation.common.C21484c;
import p341ge.bog.mobilebank.cleanarch.presentation.common.C21503d;
import p341ge.bog.mobilebank.cleanarch.presentation.home.model.StoryGroupThumbnail;
import p341ge.bog.mobilebank.cleanarch.presentation.home.viewmodel.C21770a;
import p341ge.bog.mobilebank.cleanarch.presentation.home.viewmodel.HomeFragmentViewModel;
import p341ge.bog.mobilebank.model.KeyValue;
import p341ge.bog.mobilebank.p975ui.activities.C35388f2;
import p341ge.bog.mobilebank.p975ui.activities.MainActivity;
import p341ge.bog.mobilebank.p975ui.activities.MainActivityViewModel$ViewModel;
import p341ge.bog.mobilebank.p975ui.components.BogSwipeRefreshLayout;
import p341ge.bog.mobilebank.p975ui.fragments.C35651n1;
import p341ge.bog.mobilebank.rest.manager.PreferencesApiManager;
import p341ge.bog.mobilebank.rest.model.GooglePayState;
import p341ge.bog.mobilebank.shared.navigation.NavigatorConstants$JuniorFlow;
import p366bk.C10322k;
import p366bk.C10324m;
import p366bk.C10328q;
import p380ck.C10464h;
import p725cr.C19788a;
import q31.C38122f;
import q31.C38125h;
import r31.C38281a;
import tu0.C38796a;
import u00.C28534b;
import ue1.C43064a;
import ue1.C43075l;

/* renamed from: f20.c */
public final class C20334c extends C35651n1 {

    /* renamed from: j */
    public static final C20335a f55288j = new C20335a((DefaultConstructorMarker) null);
    /* access modifiers changed from: private */

    /* renamed from: d */
    public C19854i f55289d;

    /* renamed from: e */
    private final C41217g f55290e;

    /* renamed from: f */
    private final C41217g f55291f = C1514j0.m5374c(this, C41520a0.m120436b(MainActivityViewModel$ViewModel.class), new C20391y0(this), new C20393z0((C43064a) null, this), new C20337a1(this));

    /* renamed from: g */
    private boolean f55292g;

    /* renamed from: h */
    private RecyclerView f55293h;

    /* renamed from: i */
    private final C41217g f55294i = C41219i.m119470b(new C20355g1(this));

    /* renamed from: f20.c$a */
    public static final class C20335a {
        private C20335a() {
        }

        public /* synthetic */ C20335a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* renamed from: a */
        public final C20334c mo48821a() {
            C20334c cVar = new C20334c();
            cVar.setViewPagerFragment(true);
            return cVar;
        }
    }

    /* renamed from: f20.c$a0 */
    static final class C20336a0 extends C41537m implements C43075l {

        /* renamed from: d */
        final /* synthetic */ C20334c f55295d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C20336a0(C20334c cVar) {
            super(1);
            this.f55295d = cVar;
        }

        /* renamed from: a */
        public final void mo48822a(C25103c cVar) {
            C41536l.m120489i(cVar, "uiModel");
            Boolean bool = (Boolean) this.f55295d.m66421I1().mo70966Wr().mo4814f();
            if (bool == null) {
                bool = Boolean.FALSE;
            }
            boolean booleanValue = bool.booleanValue();
            List<C25101a> c = cVar.mo63553c();
            ArrayList arrayList = new ArrayList(C41343r.m119925u(c, 10));
            for (C25101a b : c) {
                arrayList.add(C25101a.m80064b(b, (String) null, (BigDecimal) null, (String) null, false, booleanValue, 15, (Object) null));
            }
            C19854i m1 = this.f55295d.f55289d;
            if (m1 == null) {
                C41536l.m120506z("contentAdapter");
                m1 = null;
            }
            m1.mo48156Q(C25103c.m80075b(cVar, (List) null, arrayList, (List) null, (List) null, false, false, 61, (Object) null));
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            mo48822a((C25103c) obj);
            return C41238w.f97225a;
        }
    }

    /* renamed from: f20.c$a1 */
    public static final class C20337a1 extends C41537m implements C43064a {

        /* renamed from: d */
        final /* synthetic */ Fragment f55296d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C20337a1(Fragment fragment) {
            super(0);
            this.f55296d = fragment;
        }

        public final C1620q0.C1624b invoke() {
            C1620q0.C1624b defaultViewModelProviderFactory = this.f55296d.requireActivity().getDefaultViewModelProviderFactory();
            C41536l.m120488h(defaultViewModelProviderFactory, "requireActivity().defaultViewModelProviderFactory");
            return defaultViewModelProviderFactory;
        }
    }

    /* renamed from: f20.c$b */
    public static final class C20338b implements C24851a {

        /* renamed from: a */
        final /* synthetic */ C20334c f55297a;

        C20338b(C20334c cVar) {
            this.f55297a = cVar;
        }

        /* renamed from: a */
        public void mo48823a(C25106f fVar) {
            C41536l.m120489i(fVar, "card");
            this.f55297a.m66425M1().mo54210Kx(fVar.mo63594b());
        }

        /* renamed from: b */
        public void mo48824b(C25106f fVar) {
            C41536l.m120489i(fVar, "card");
            Context requireContext = this.f55297a.requireContext();
            C41536l.m120488h(requireContext, "requireContext()");
            C38122f c = C38125h.m112238c(requireContext);
            C1505h requireActivity = this.f55297a.requireActivity();
            C41536l.m120488h(requireActivity, "requireActivity()");
            c.mo91628s(requireActivity, fVar.mo63594b());
            C38796a.C38798b a = fVar.mo63593a();
            C36546y.m108282F().mo27137H(a.mo92503b(), a.mo92502a(), a.mo92504c(), (Bundle) null, C10464h.C10465a.FACEBOOKANDFIREBASE);
        }
    }

    /* renamed from: f20.c$b0 */
    /* synthetic */ class C20339b0 extends C41535k implements C43075l {
        C20339b0(Object obj) {
            super(1, obj, C19854i.class, "setProgramTypeList", "setProgramTypeList(Ljava/util/List;)V", 0);
        }

        /* renamed from: b */
        public final void mo48825b(List list) {
            C41536l.m120489i(list, "p0");
            ((C19854i) this.receiver).mo48169d0(list);
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            mo48825b((List) obj);
            return C41238w.f97225a;
        }
    }

    /* renamed from: f20.c$b1 */
    public static final class C20340b1 extends C41537m implements C43064a {

        /* renamed from: d */
        final /* synthetic */ Fragment f55298d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C20340b1(Fragment fragment) {
            super(0);
            this.f55298d = fragment;
        }

        public final Fragment invoke() {
            return this.f55298d;
        }
    }

    /* renamed from: f20.c$c */
    public static final class C20341c implements C24852b {

        /* renamed from: a */
        final /* synthetic */ C20334c f55299a;

        C20341c(C20334c cVar) {
            this.f55299a = cVar;
        }

        /* renamed from: a */
        public void mo48826a(StoryGroupThumbnail storyGroupThumbnail, int i) {
            C41536l.m120489i(storyGroupThumbnail, "story");
            this.f55299a.m66425M1().mo54206Gy(storyGroupThumbnail, i);
        }

        /* renamed from: b */
        public void mo48827b(StoryGroupThumbnail storyGroupThumbnail, int i) {
            C41536l.m120489i(storyGroupThumbnail, "story");
            this.f55299a.m66425M1().mo54207Hy(storyGroupThumbnail, i);
        }
    }

    /* renamed from: f20.c$c0 */
    static final class C20342c0 extends C41537m implements C43064a {

        /* renamed from: d */
        final /* synthetic */ C20334c f55300d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C20342c0(C20334c cVar) {
            super(0);
            this.f55300d = cVar;
        }

        public final void invoke() {
            this.f55300d.m66447j2(true);
        }
    }

    /* renamed from: f20.c$c1 */
    public static final class C20343c1 extends C41537m implements C43064a {

        /* renamed from: d */
        final /* synthetic */ C43064a f55301d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C20343c1(C43064a aVar) {
            super(0);
            this.f55301d = aVar;
        }

        public final C1638u0 invoke() {
            return (C1638u0) this.f55301d.invoke();
        }
    }

    /* renamed from: f20.c$d */
    /* synthetic */ class C20344d extends C41535k implements C43075l {
        C20344d(Object obj) {
            super(1, obj, C19854i.class, "setBudgetData", "setBudgetData(Lge/bog/mobilebank/cleanarch/presentation/home/viewmodel/BudgetViewModel$BudgetHomeData;)V", 0);
        }

        /* renamed from: b */
        public final void mo48828b(C21770a.C21771a aVar) {
            C41536l.m120489i(aVar, "p0");
            ((C19854i) this.receiver).mo48157R(aVar);
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            mo48828b((C21770a.C21771a) obj);
            return C41238w.f97225a;
        }
    }

    /* renamed from: f20.c$d0 */
    static final class C20345d0 extends C41537m implements C43064a {

        /* renamed from: d */
        final /* synthetic */ C20334c f55302d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C20345d0(C20334c cVar) {
            super(0);
            this.f55302d = cVar;
        }

        public final void invoke() {
            this.f55302d.m66447j2(false);
        }
    }

    /* renamed from: f20.c$d1 */
    public static final class C20346d1 extends C41537m implements C43064a {

        /* renamed from: d */
        final /* synthetic */ C41217g f55303d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C20346d1(C41217g gVar) {
            super(0);
            this.f55303d = gVar;
        }

        public final C1636t0 invoke() {
            C1636t0 viewModelStore = C1514j0.m5375d(this.f55303d).getViewModelStore();
            C41536l.m120488h(viewModelStore, "owner.viewModelStore");
            return viewModelStore;
        }
    }

    /* renamed from: f20.c$e */
    /* synthetic */ class C20347e extends C41535k implements C43075l {
        C20347e(Object obj) {
            super(1, obj, C19854i.class, "setOfferProducts", "setOfferProducts(Ljava/util/List;)V", 0);
        }

        /* renamed from: b */
        public final void mo48829b(List list) {
            C41536l.m120489i(list, "p0");
            ((C19854i) this.receiver).mo48167b0(list);
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            mo48829b((List) obj);
            return C41238w.f97225a;
        }
    }

    /* renamed from: f20.c$e0 */
    static final class C20348e0 extends C41537m implements C43075l {

        /* renamed from: d */
        public static final C20348e0 f55304d = new C20348e0();

        C20348e0() {
            super(1);
        }

        /* renamed from: a */
        public final void mo48830a(List list) {
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            mo48830a((List) obj);
            return C41238w.f97225a;
        }
    }

    /* renamed from: f20.c$e1 */
    public static final class C20349e1 extends C41537m implements C43064a {

        /* renamed from: d */
        final /* synthetic */ C43064a f55305d;

        /* renamed from: e */
        final /* synthetic */ C41217g f55306e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C20349e1(C43064a aVar, C41217g gVar) {
            super(0);
            this.f55305d = aVar;
            this.f55306e = gVar;
        }

        public final C7047a invoke() {
            C7047a aVar;
            C43064a aVar2 = this.f55305d;
            if (aVar2 != null && (aVar = (C7047a) aVar2.invoke()) != null) {
                return aVar;
            }
            C1638u0 a = C1514j0.m5375d(this.f55306e);
            C1591i iVar = a instanceof C1591i ? (C1591i) a : null;
            C7047a defaultViewModelCreationExtras = iVar != null ? iVar.getDefaultViewModelCreationExtras() : null;
            return defaultViewModelCreationExtras == null ? C7047a.C7048a.f20987b : defaultViewModelCreationExtras;
        }
    }

    /* renamed from: f20.c$f */
    /* synthetic */ class C20350f extends C41535k implements C43075l {
        C20350f(Object obj) {
            super(1, obj, C19854i.class, "setOfferInfo", "setOfferInfo(Lge/bog/mobilebank/cleanarch/presentation/offer/model/OfferInfoUIModel;)V", 0);
        }

        /* renamed from: b */
        public final void mo48831b(C25627a aVar) {
            C41536l.m120489i(aVar, "p0");
            ((C19854i) this.receiver).mo48166a0(aVar);
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            mo48831b((C25627a) obj);
            return C41238w.f97225a;
        }
    }

    /* renamed from: f20.c$f0 */
    static final class C20351f0 extends C41537m implements C43075l {

        /* renamed from: d */
        final /* synthetic */ C20334c f55307d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C20351f0(C20334c cVar) {
            super(1);
            this.f55307d = cVar;
        }

        /* renamed from: a */
        public final void mo48832a(List list) {
            C41536l.m120489i(list, "it");
            C19854i m1 = this.f55307d.f55289d;
            if (m1 == null) {
                C41536l.m120506z("contentAdapter");
                m1 = null;
            }
            m1.mo48164Y(list);
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            mo48832a((List) obj);
            return C41238w.f97225a;
        }
    }

    /* renamed from: f20.c$f1 */
    public static final class C20352f1 extends C41537m implements C43064a {

        /* renamed from: d */
        final /* synthetic */ Fragment f55308d;

        /* renamed from: e */
        final /* synthetic */ C41217g f55309e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C20352f1(Fragment fragment, C41217g gVar) {
            super(0);
            this.f55308d = fragment;
            this.f55309e = gVar;
        }

        public final C1620q0.C1624b invoke() {
            C1620q0.C1624b bVar;
            C1638u0 a = C1514j0.m5375d(this.f55309e);
            C1591i iVar = a instanceof C1591i ? (C1591i) a : null;
            if (iVar == null || (bVar = iVar.getDefaultViewModelProviderFactory()) == null) {
                bVar = this.f55308d.getDefaultViewModelProviderFactory();
            }
            C41536l.m120488h(bVar, "(owner as? HasDefaultVie…tViewModelProviderFactory");
            return bVar;
        }
    }

    /* renamed from: f20.c$g */
    /* synthetic */ class C20353g extends C41535k implements C43075l {
        C20353g(Object obj) {
            super(1, obj, C19854i.class, "setStudentCardBanner", "setStudentCardBanner(Z)V", 0);
        }

        /* renamed from: b */
        public final void mo48833b(boolean z) {
            ((C19854i) this.receiver).mo48171f0(z);
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            mo48833b(((Boolean) obj).booleanValue());
            return C41238w.f97225a;
        }
    }

    /* renamed from: f20.c$g0 */
    static final class C20354g0 extends C41537m implements C43075l {

        /* renamed from: d */
        final /* synthetic */ C20334c f55310d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C20354g0(C20334c cVar) {
            super(1);
            this.f55310d = cVar;
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((Throwable) obj);
            return C41238w.f97225a;
        }

        public final void invoke(Throwable th) {
            C41536l.m120489i(th, "it");
            C19854i m1 = this.f55310d.f55289d;
            if (m1 == null) {
                C41536l.m120506z("contentAdapter");
                m1 = null;
            }
            m1.mo48164Y(C41341q.m119907j());
        }
    }

    /* renamed from: f20.c$g1 */
    static final class C20355g1 extends C41537m implements C43064a {

        /* renamed from: d */
        final /* synthetic */ C20334c f55311d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C20355g1(C20334c cVar) {
            super(0);
            this.f55311d = cVar;
        }

        /* renamed from: b */
        public final BogSwipeRefreshLayout invoke() {
            return (BogSwipeRefreshLayout) this.f55311d.findView(C10322k.home_swipe_refresh);
        }
    }

    /* renamed from: f20.c$h */
    /* synthetic */ class C20356h extends C41535k implements C43075l {
        C20356h(Object obj) {
            super(1, obj, C19854i.class, "setPendingProductConfirmation", "setPendingProductConfirmation(Ljava/util/List;)V", 0);
        }

        /* renamed from: b */
        public final void mo48836b(List list) {
            C41536l.m120489i(list, "p0");
            ((C19854i) this.receiver).mo48168c0(list);
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            mo48836b((List) obj);
            return C41238w.f97225a;
        }
    }

    /* renamed from: f20.c$h0 */
    static final class C20357h0 extends C41537m implements C43075l {

        /* renamed from: d */
        public static final C20357h0 f55312d = new C20357h0();

        C20357h0() {
            super(1);
        }

        /* renamed from: a */
        public final void mo48837a(List list) {
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            mo48837a((List) obj);
            return C41238w.f97225a;
        }
    }

    /* renamed from: f20.c$i */
    /* synthetic */ class C20358i extends C41535k implements C43075l {
        C20358i(Object obj) {
            super(1, obj, C19854i.class, "setNboBanners", "setNboBanners(Lge/bog/mobilebank/cleanarch/presentation/home/model/NboBannersUiModel;)V", 0);
        }

        /* renamed from: b */
        public final void mo48838b(C25105e eVar) {
            C41536l.m120489i(eVar, "p0");
            ((C19854i) this.receiver).mo48163X(eVar);
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            mo48838b((C25105e) obj);
            return C41238w.f97225a;
        }
    }

    /* renamed from: f20.c$i0 */
    /* synthetic */ class C20359i0 extends C41535k implements C43075l {
        C20359i0(Object obj) {
            super(1, obj, C19854i.class, "setStories", "setStories(Ljava/util/List;)V", 0);
        }

        /* renamed from: b */
        public final void mo48839b(List list) {
            C41536l.m120489i(list, "p0");
            ((C19854i) this.receiver).mo48170e0(list);
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            mo48839b((List) obj);
            return C41238w.f97225a;
        }
    }

    /* renamed from: f20.c$j */
    /* synthetic */ class C20360j extends C41535k implements C43075l {
        C20360j(Object obj) {
            super(1, obj, C20334c.class, "handleNewLoanBannerClick", "handleNewLoanBannerClick(Z)V", 0);
        }

        /* renamed from: b */
        public final void mo48840b(boolean z) {
            ((C20334c) this.receiver).m66426N1(z);
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            mo48840b(((Boolean) obj).booleanValue());
            return C41238w.f97225a;
        }
    }

    /* renamed from: f20.c$j0 */
    static final class C20361j0 extends C41537m implements C43075l {

        /* renamed from: d */
        final /* synthetic */ C20334c f55313d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C20361j0(C20334c cVar) {
            super(1);
            this.f55313d = cVar;
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((Throwable) obj);
            return C41238w.f97225a;
        }

        public final void invoke(Throwable th) {
            C41536l.m120489i(th, "it");
            C19854i m1 = this.f55313d.f55289d;
            if (m1 == null) {
                C41536l.m120506z("contentAdapter");
                m1 = null;
            }
            m1.mo48170e0(C41341q.m119907j());
        }
    }

    /* renamed from: f20.c$k */
    /* synthetic */ class C20362k extends C41535k implements C43075l {
        C20362k(Object obj) {
            super(1, obj, C19854i.class, "setJuniorBanner", "setJuniorBanner(Ljava/util/List;)V", 0);
        }

        /* renamed from: b */
        public final void mo48842b(List list) {
            C41536l.m120489i(list, "p0");
            ((C19854i) this.receiver).mo48159T(list);
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            mo48842b((List) obj);
            return C41238w.f97225a;
        }
    }

    /* renamed from: f20.c$k0 */
    /* synthetic */ class C20363k0 implements GamificationBanner.C21046a, C41532h {
        C20363k0() {
        }

        public final boolean equals(Object obj) {
            if (!(obj instanceof GamificationBanner.C21046a) || !(obj instanceof C41532h)) {
                return false;
            }
            return C41536l.m120484d(getFunctionDelegate(), ((C41532h) obj).getFunctionDelegate());
        }

        public final C41212c getFunctionDelegate() {
            return new C41535k(0, C20334c.this, C20334c.class, "onGamificationBannerClicked", "onGamificationBannerClicked()V", 0);
        }

        public final int hashCode() {
            return getFunctionDelegate().hashCode();
        }

        public final void invoke() {
            C20334c.this.m66433V1();
        }
    }

    /* renamed from: f20.c$l */
    static final class C20364l extends C41537m implements C43075l {

        /* renamed from: d */
        final /* synthetic */ C20334c f55315d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C20364l(C20334c cVar) {
            super(1);
            this.f55315d = cVar;
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((Boolean) obj);
            return C41238w.f97225a;
        }

        public final void invoke(Boolean bool) {
            C19854i m1 = this.f55315d.f55289d;
            if (m1 == null) {
                C41536l.m120506z("contentAdapter");
                m1 = null;
            }
            C41536l.m120488h(bool, "it");
            m1.mo48174i0(bool.booleanValue());
        }
    }

    /* renamed from: f20.c$l0 */
    /* synthetic */ class C20365l0 implements GamificationBanner.C21046a, C41532h {
        C20365l0() {
        }

        public final boolean equals(Object obj) {
            if (!(obj instanceof GamificationBanner.C21046a) || !(obj instanceof C41532h)) {
                return false;
            }
            return C41536l.m120484d(getFunctionDelegate(), ((C41532h) obj).getFunctionDelegate());
        }

        public final C41212c getFunctionDelegate() {
            return new C41535k(0, C20334c.this, C20334c.class, "onGamificationBannerClosed", "onGamificationBannerClosed()V", 0);
        }

        public final int hashCode() {
            return getFunctionDelegate().hashCode();
        }

        public final void invoke() {
            C20334c.this.m66434W1();
        }
    }

    /* renamed from: f20.c$m */
    static final class C20366m extends C41537m implements C43075l {

        /* renamed from: d */
        final /* synthetic */ C20334c f55317d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C20366m(C20334c cVar) {
            super(1);
            this.f55317d = cVar;
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((Boolean) obj);
            return C41238w.f97225a;
        }

        public final void invoke(Boolean bool) {
            C1505h activity;
            C41536l.m120488h(bool, "it");
            if (bool.booleanValue() && (activity = this.f55317d.getActivity()) != null) {
                activity.invalidateOptionsMenu();
            }
        }
    }

    /* renamed from: f20.c$m0 */
    /* synthetic */ class C20367m0 extends C41535k implements C43075l {
        C20367m0(Object obj) {
            super(1, obj, C20334c.class, "onNboBannerClick", "onNboBannerClick(Lge/bog/mobilebank/cleanarch/presentation/home/model/BannerUiModel;)V", 0);
        }

        /* renamed from: b */
        public final void mo48850b(C25104d dVar) {
            C41536l.m120489i(dVar, "p0");
            ((C20334c) this.receiver).m66437Z1(dVar);
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            mo48850b((C25104d) obj);
            return C41238w.f97225a;
        }
    }

    /* renamed from: f20.c$n */
    /* synthetic */ class C20368n extends C41535k implements C43075l {
        C20368n(Object obj) {
            super(1, obj, C19854i.class, "setAccountsAndCards", "setAccountsAndCards(Lge/bog/mobilebank/cleanarch/presentation/products/model/ExpandableAccountsWithCardsDetailsUIModel;)V", 0);
        }

        /* renamed from: b */
        public final void mo48851b(C25840t tVar) {
            C41536l.m120489i(tVar, "p0");
            ((C19854i) this.receiver).mo48154O(tVar);
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            mo48851b((C25840t) obj);
            return C41238w.f97225a;
        }
    }

    /* renamed from: f20.c$n0 */
    /* synthetic */ class C20369n0 extends C41535k implements C43075l {
        C20369n0(Object obj) {
            super(1, obj, C20334c.class, "onNboBannerRemove", "onNboBannerRemove(Ljava/lang/String;)V", 0);
        }

        /* renamed from: b */
        public final void mo48852b(String str) {
            C41536l.m120489i(str, "p0");
            ((C20334c) this.receiver).m66438a2(str);
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            mo48852b((String) obj);
            return C41238w.f97225a;
        }
    }

    /* renamed from: f20.c$o */
    /* synthetic */ class C20370o extends C41535k implements C43075l {
        C20370o(Object obj) {
            super(1, obj, C20334c.class, "onNboCardsResult", "onNboCardsResult(Lge/bog/mobilebank/shared/requestedresult/RequestedResult;)V", 0);
        }

        /* renamed from: b */
        public final void mo48853b(C31128a aVar) {
            C41536l.m120489i(aVar, "p0");
            ((C20334c) this.receiver).m66439b2(aVar);
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            mo48853b((C31128a) obj);
            return C41238w.f97225a;
        }
    }

    /* renamed from: f20.c$o0 */
    /* synthetic */ class C20371o0 extends C41535k implements C43075l {
        C20371o0(Object obj) {
            super(1, obj, C20334c.class, "onOpenCreditCardDetails", "onOpenCreditCardDetails(J)V", 0);
        }

        /* renamed from: b */
        public final void mo48854b(long j) {
            ((C20334c) this.receiver).m66440c2(j);
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            mo48854b(((Number) obj).longValue());
            return C41238w.f97225a;
        }
    }

    /* renamed from: f20.c$p */
    /* synthetic */ class C20372p extends C41535k implements C43075l {
        C20372p(Object obj) {
            super(1, obj, C20334c.class, "onStoriesResult", "onStoriesResult(Lge/bog/mobilebank/shared/requestedresult/RequestedResult;)V", 0);
        }

        /* renamed from: b */
        public final void mo48855b(C31128a aVar) {
            C41536l.m120489i(aVar, "p0");
            ((C20334c) this.receiver).m66441d2(aVar);
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            mo48855b((C31128a) obj);
            return C41238w.f97225a;
        }
    }

    /* renamed from: f20.c$p0 */
    /* synthetic */ class C20373p0 extends C41535k implements C43075l {
        C20373p0(Object obj) {
            super(1, obj, C20334c.class, "openJunior", "openJunior(Lge/bog/mobilebank/cleanarch/junior/presentation/JuniorRequestDataUiModel;)V", 0);
        }

        /* renamed from: b */
        public final void mo48856b(JuniorRequestDataUiModel juniorRequestDataUiModel) {
            C41536l.m120489i(juniorRequestDataUiModel, "p0");
            ((C20334c) this.receiver).m66442e2(juniorRequestDataUiModel);
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            mo48856b((JuniorRequestDataUiModel) obj);
            return C41238w.f97225a;
        }
    }

    /* renamed from: f20.c$q */
    static final class C20374q extends C41537m implements C43075l {

        /* renamed from: d */
        final /* synthetic */ C20334c f55318d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C20374q(C20334c cVar) {
            super(1);
            this.f55318d = cVar;
        }

        /* renamed from: a */
        public final void mo48857a(long j) {
            Context requireContext = this.f55318d.requireContext();
            C41536l.m120488h(requireContext, "requireContext()");
            C38122f c = C38125h.m112238c(requireContext);
            Context requireContext2 = this.f55318d.requireContext();
            C41536l.m120488h(requireContext2, "requireContext()");
            C38122f.C38123a.m112229y(c, requireContext2, Long.valueOf(j), (Integer) null, 4, (Object) null);
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            mo48857a(((Number) obj).longValue());
            return C41238w.f97225a;
        }
    }

    /* renamed from: f20.c$q0 */
    /* synthetic */ class C20375q0 extends C41535k implements C43064a {
        C20375q0(Object obj) {
            super(0, obj, C20334c.class, "startGooglePayFlow", "startGooglePayFlow()V", 0);
        }

        /* renamed from: b */
        public final void mo48858b() {
            ((C20334c) this.receiver).mo48819l2();
        }

        public /* bridge */ /* synthetic */ Object invoke() {
            mo48858b();
            return C41238w.f97225a;
        }
    }

    /* renamed from: f20.c$r */
    static final class C20376r extends C41537m implements C43075l {

        /* renamed from: d */
        final /* synthetic */ C20334c f55319d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C20376r(C20334c cVar) {
            super(1);
            this.f55319d = cVar;
        }

        /* renamed from: a */
        public final void mo48859a(C41238w wVar) {
            C41536l.m120489i(wVar, "it");
            Context requireContext = this.f55319d.requireContext();
            C41536l.m120488h(requireContext, "requireContext()");
            C38122f c = C38125h.m112238c(requireContext);
            Context requireContext2 = this.f55319d.requireContext();
            C41536l.m120488h(requireContext2, "requireContext()");
            c.mo91630t(requireContext2);
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            mo48859a((C41238w) obj);
            return C41238w.f97225a;
        }
    }

    /* renamed from: f20.c$r0 */
    /* synthetic */ class C20377r0 extends C41535k implements C43064a {
        C20377r0(Object obj) {
            super(0, obj, C20334c.class, "dismissGooglePayBanner", "dismissGooglePayBanner()V", 0);
        }

        /* renamed from: b */
        public final void mo48860b() {
            ((C20334c) this.receiver).m66420H1();
        }

        public /* bridge */ /* synthetic */ Object invoke() {
            mo48860b();
            return C41238w.f97225a;
        }
    }

    /* renamed from: f20.c$s */
    static final class C20378s extends C41537m implements C43075l {

        /* renamed from: d */
        final /* synthetic */ C20334c f55320d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C20378s(C20334c cVar) {
            super(1);
            this.f55320d = cVar;
        }

        /* renamed from: a */
        public final void mo48861a(StoryGroupThumbnail storyGroupThumbnail) {
            C41536l.m120489i(storyGroupThumbnail, "story");
            Context requireContext = this.f55320d.requireContext();
            C41536l.m120488h(requireContext, "requireContext()");
            C38122f c = C38125h.m112238c(requireContext);
            Context requireContext2 = this.f55320d.requireContext();
            C41536l.m120488h(requireContext2, "requireContext()");
            c.mo91550G(requireContext2, Long.valueOf(storyGroupThumbnail.mo54188b()), storyGroupThumbnail.mo54193f());
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            mo48861a((StoryGroupThumbnail) obj);
            return C41238w.f97225a;
        }
    }

    /* renamed from: f20.c$s0 */
    /* synthetic */ class C20379s0 extends C41535k implements C43075l {
        C20379s0(Object obj) {
            super(1, obj, C20334c.class, "onBalanceAppearanceChanged", "onBalanceAppearanceChanged(Z)V", 0);
        }

        /* renamed from: b */
        public final void mo48862b(boolean z) {
            ((C20334c) this.receiver).m66430R1(z);
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            mo48862b(((Boolean) obj).booleanValue());
            return C41238w.f97225a;
        }
    }

    /* renamed from: f20.c$t */
    /* synthetic */ class C20380t extends C41535k implements C43075l {
        C20380t(Object obj) {
            super(1, obj, C20334c.class, "onGamificationBannerShown", "onGamificationBannerShown(Lge/bog/mobilebank/gamification/domain/model/GamificationBannerType;)V", 0);
        }

        /* renamed from: b */
        public final void mo48863b(C25209b bVar) {
            C41536l.m120489i(bVar, "p0");
            ((C20334c) this.receiver).m66435X1(bVar);
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            mo48863b((C25209b) obj);
            return C41238w.f97225a;
        }
    }

    /* renamed from: f20.c$t0 */
    /* synthetic */ class C20381t0 extends C41535k implements C43075l {
        C20381t0(Object obj) {
            super(1, obj, C20334c.class, "onBalanceHiddenChanged", "onBalanceHiddenChanged(Z)V", 0);
        }

        /* renamed from: b */
        public final void mo48864b(boolean z) {
            ((C20334c) this.receiver).m66431S1(z);
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            mo48864b(((Boolean) obj).booleanValue());
            return C41238w.f97225a;
        }
    }

    /* renamed from: f20.c$u */
    /* synthetic */ class C20382u extends C41535k implements C43075l {
        C20382u(Object obj) {
            super(1, obj, C20334c.class, "setAccountsError", "setAccountsError(Lge/bog/mobilebank/cleanarch/presentation/common/Resource$Error;)V", 0);
        }

        /* renamed from: b */
        public final void mo48865b(C21503d.C21504a aVar) {
            C41536l.m120489i(aVar, "p0");
            ((C20334c) this.receiver).m66443g2(aVar);
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            mo48865b((C21503d.C21504a) obj);
            return C41238w.f97225a;
        }
    }

    /* renamed from: f20.c$u0 */
    /* synthetic */ class C20383u0 extends C41535k implements C43064a {
        C20383u0(Object obj) {
            super(0, obj, C20334c.class, "onLoanOverdueWarningClick", "onLoanOverdueWarningClick()V", 0);
        }

        /* renamed from: b */
        public final void mo48866b() {
            ((C20334c) this.receiver).m66436Y1();
        }

        public /* bridge */ /* synthetic */ Object invoke() {
            mo48866b();
            return C41238w.f97225a;
        }
    }

    /* renamed from: f20.c$v */
    /* synthetic */ class C20384v extends C41535k implements C43075l {
        C20384v(Object obj) {
            super(1, obj, C19854i.class, "setUpcomingPayment", "setUpcomingPayment(Lge/bog/mobilebank/cleanarch/presentation/commissions/model/UpcomingPaymentDataUIModel;)V", 0);
        }

        /* renamed from: b */
        public final void mo48867b(C28534b bVar) {
            C41536l.m120489i(bVar, "p0");
            ((C19854i) this.receiver).mo48172g0(bVar);
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            mo48867b((C28534b) obj);
            return C41238w.f97225a;
        }
    }

    /* renamed from: f20.c$v0 */
    static final class C20385v0 implements C1645y, C41532h {

        /* renamed from: a */
        private final /* synthetic */ C43075l f55321a;

        C20385v0(C43075l lVar) {
            C41536l.m120489i(lVar, "function");
            this.f55321a = lVar;
        }

        public final boolean equals(Object obj) {
            if (!(obj instanceof C1645y) || !(obj instanceof C41532h)) {
                return false;
            }
            return C41536l.m120484d(getFunctionDelegate(), ((C41532h) obj).getFunctionDelegate());
        }

        public final C41212c getFunctionDelegate() {
            return this.f55321a;
        }

        public final int hashCode() {
            return getFunctionDelegate().hashCode();
        }

        public final /* synthetic */ void onChanged(Object obj) {
            this.f55321a.invoke(obj);
        }
    }

    /* renamed from: f20.c$w */
    /* synthetic */ class C20386w extends C41535k implements C43075l {
        C20386w(Object obj) {
            super(1, obj, C20334c.class, "setUpcomingPaymentError", "setUpcomingPaymentError(Lge/bog/mobilebank/cleanarch/presentation/common/Resource$Error;)V", 0);
        }

        /* renamed from: b */
        public final void mo48870b(C21503d.C21504a aVar) {
            C41536l.m120489i(aVar, "p0");
            ((C20334c) this.receiver).m66449k2(aVar);
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            mo48870b((C21503d.C21504a) obj);
            return C41238w.f97225a;
        }
    }

    /* renamed from: f20.c$w0 */
    static final class C20387w0 extends C41537m implements C43064a {

        /* renamed from: d */
        final /* synthetic */ C20334c f55322d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C20387w0(C20334c cVar) {
            super(0);
            this.f55322d = cVar;
        }

        public final void invoke() {
            HomeFragmentViewModel.m70439ty(this.f55322d.m66425M1(), false, 1, (Object) null);
        }
    }

    /* renamed from: f20.c$x */
    /* synthetic */ class C20388x extends C41535k implements C43075l {
        C20388x(Object obj) {
            super(1, obj, C19854i.class, "setLastOperations", "setLastOperations(Ljava/util/List;)V", 0);
        }

        /* renamed from: b */
        public final void mo48871b(List list) {
            C41536l.m120489i(list, "p0");
            ((C19854i) this.receiver).mo48161V(list);
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            mo48871b((List) obj);
            return C41238w.f97225a;
        }
    }

    /* renamed from: f20.c$x0 */
    static final class C20389x0 extends C41537m implements C43064a {

        /* renamed from: d */
        final /* synthetic */ C20334c f55323d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C20389x0(C20334c cVar) {
            super(0);
            this.f55323d = cVar;
        }

        public final void invoke() {
            this.f55323d.m66425M1().mo54236wy();
        }
    }

    /* renamed from: f20.c$y */
    /* synthetic */ class C20390y extends C41535k implements C43075l {
        C20390y(Object obj) {
            super(1, obj, C19854i.class, "setLastOperationsLoading", "setLastOperationsLoading(Z)V", 0);
        }

        /* renamed from: b */
        public final void mo48872b(boolean z) {
            ((C19854i) this.receiver).mo48162W(z);
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            mo48872b(((Boolean) obj).booleanValue());
            return C41238w.f97225a;
        }
    }

    /* renamed from: f20.c$y0 */
    public static final class C20391y0 extends C41537m implements C43064a {

        /* renamed from: d */
        final /* synthetic */ Fragment f55324d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C20391y0(Fragment fragment) {
            super(0);
            this.f55324d = fragment;
        }

        public final C1636t0 invoke() {
            C1636t0 viewModelStore = this.f55324d.requireActivity().getViewModelStore();
            C41536l.m120488h(viewModelStore, "requireActivity().viewModelStore");
            return viewModelStore;
        }
    }

    /* renamed from: f20.c$z */
    static final class C20392z extends C41537m implements C43075l {

        /* renamed from: d */
        final /* synthetic */ C20334c f55325d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C20392z(C20334c cVar) {
            super(1);
            this.f55325d = cVar;
        }

        /* renamed from: a */
        public final void mo48873a(C21503d.C21504a aVar) {
            C41536l.m120489i(aVar, "it");
            this.f55325d.m66445i2(new C21503d.C21504a(aVar.mo53706f(), (Object) null, 2, (DefaultConstructorMarker) null));
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            mo48873a((C21503d.C21504a) obj);
            return C41238w.f97225a;
        }
    }

    /* renamed from: f20.c$z0 */
    public static final class C20393z0 extends C41537m implements C43064a {

        /* renamed from: d */
        final /* synthetic */ C43064a f55326d;

        /* renamed from: e */
        final /* synthetic */ Fragment f55327e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C20393z0(C43064a aVar, Fragment fragment) {
            super(0);
            this.f55326d = aVar;
            this.f55327e = fragment;
        }

        public final C7047a invoke() {
            C7047a aVar;
            C43064a aVar2 = this.f55326d;
            if (aVar2 != null && (aVar = (C7047a) aVar2.invoke()) != null) {
                return aVar;
            }
            C7047a defaultViewModelCreationExtras = this.f55327e.requireActivity().getDefaultViewModelCreationExtras();
            C41536l.m120488h(defaultViewModelCreationExtras, "requireActivity().defaultViewModelCreationExtras");
            return defaultViewModelCreationExtras;
        }
    }

    public C20334c() {
        C41217g a = C41219i.m119469a(C41222k.NONE, new C20343c1(new C20340b1(this)));
        this.f55290e = C1514j0.m5374c(this, C41520a0.m120436b(HomeFragmentViewModel.class), new C20346d1(a), new C20349e1((C43064a) null, a), new C20352f1(this, a));
    }

    /* access modifiers changed from: private */
    /* renamed from: H1 */
    public final void m66420H1() {
        m66425M1().mo54209Jx();
    }

    /* access modifiers changed from: private */
    /* renamed from: I1 */
    public final MainActivityViewModel$ViewModel m66421I1() {
        return (MainActivityViewModel$ViewModel) this.f55291f.getValue();
    }

    /* renamed from: J1 */
    private final C20338b m66422J1() {
        return new C20338b(this);
    }

    /* renamed from: K1 */
    private final C24852b m66423K1() {
        return new C20341c(this);
    }

    /* renamed from: L1 */
    private final BogSwipeRefreshLayout m66424L1() {
        Object value = this.f55294i.getValue();
        C41536l.m120488h(value, "<get-swipeRefresh>(...)");
        return (BogSwipeRefreshLayout) value;
    }

    /* access modifiers changed from: private */
    /* renamed from: M1 */
    public final HomeFragmentViewModel m66425M1() {
        return (HomeFragmentViewModel) this.f55290e.getValue();
    }

    /* access modifiers changed from: private */
    /* renamed from: N1 */
    public final void m66426N1(boolean z) {
        C36546y.m108282F().mo27152s("offers", "HOME_CONSUMER_LOAN_BANNER", "ACTION_OPEN_CONSUMER_LOAN_BANNER_FROM_HOME");
        if (z) {
            Context requireContext = requireContext();
            C41536l.m120488h(requireContext, "requireContext()");
            C38122f c = C38125h.m112238c(requireContext);
            Context requireContext2 = requireContext();
            C41536l.m120488h(requireContext2, "requireContext()");
            c.mo91590a(requireContext2);
            return;
        }
        C19305k.f53530L.mo47528a().mo4576A1(getChildFragmentManager(), (String) null);
    }

    /* renamed from: O1 */
    private final void m66427O1(boolean z, C43064a aVar, C43064a aVar2) {
        C19854i iVar = this.f55289d;
        if (iVar == null) {
            C41536l.m120506z("contentAdapter");
            iVar = null;
        }
        iVar.mo48153M();
        m66425M1().mo54211My(z, aVar, aVar2);
    }

    /* renamed from: P1 */
    static /* synthetic */ void m66428P1(C20334c cVar, boolean z, C43064a aVar, C43064a aVar2, int i, Object obj) {
        if ((i & 1) != 0) {
            z = false;
        }
        if ((i & 2) != 0) {
            aVar = null;
        }
        if ((i & 4) != 0) {
            aVar2 = null;
        }
        cVar.m66427O1(z, aVar, aVar2);
    }

    /* renamed from: Q1 */
    public static final C20334c m66429Q1() {
        return f55288j.mo48821a();
    }

    /* access modifiers changed from: private */
    /* renamed from: R1 */
    public final void m66430R1(boolean z) {
        m66425M1().mo54219cz(z);
    }

    /* access modifiers changed from: private */
    /* renamed from: S1 */
    public final void m66431S1(boolean z) {
        m66425M1().mo54202Dy(z);
    }

    /* access modifiers changed from: private */
    /* renamed from: U1 */
    public static final void m66432U1(C20334c cVar) {
        C41536l.m120489i(cVar, "this$0");
        cVar.m66427O1(true, new C20342c0(cVar), new C20345d0(cVar));
    }

    /* access modifiers changed from: private */
    /* renamed from: V1 */
    public final void m66433V1() {
        Context requireContext = requireContext();
        C41536l.m120488h(requireContext, "requireContext()");
        C38281a a = C38125h.m112236a(requireContext);
        Context requireContext2 = requireContext();
        C41536l.m120488h(requireContext2, "requireContext()");
        C38281a.C38282a.m112545a(a, requireContext2, (String) null, 2, (Object) null);
    }

    /* access modifiers changed from: private */
    /* renamed from: W1 */
    public final void m66434W1() {
        C19854i iVar = this.f55289d;
        if (iVar == null) {
            C41536l.m120506z("contentAdapter");
            iVar = null;
        }
        iVar.mo48158S(C25209b.NONE);
        m66425M1().mo54204Ey();
    }

    /* access modifiers changed from: private */
    /* renamed from: X1 */
    public final void m66435X1(C25209b bVar) {
        C19854i iVar = this.f55289d;
        if (iVar == null) {
            C41536l.m120506z("contentAdapter");
            iVar = null;
        }
        iVar.mo48158S(bVar);
    }

    /* access modifiers changed from: private */
    /* renamed from: Y1 */
    public final void m66436Y1() {
        m66425M1().mo54205Fy();
    }

    /* access modifiers changed from: private */
    /* renamed from: Z1 */
    public final void m66437Z1(C25104d dVar) {
        String str;
        ArrayList arrayList;
        List<BannerParameterData> parameters;
        String str2;
        String str3;
        String i = dVar.mo63570i();
        if (i != null) {
            m66425M1().mo54208Ix(i);
        }
        C1505h activity = getActivity();
        C41536l.m120487g(activity, "null cannot be cast to non-null type ge.bog.mobilebank.ui.activities.RootActivity");
        C35388f2 f2Var = (C35388f2) activity;
        Intent intent = new Intent("PUSH_NOTIF_INTENT");
        intent.putExtra("PUSH_NOTIFS_OPEN", true);
        BannerDeepLinkData k = dVar.mo63572k();
        if (k != null) {
            str = k.getType();
        } else {
            str = null;
        }
        intent.putExtra("type", str);
        BannerDeepLinkData k2 = dVar.mo63572k();
        if (k2 == null || (parameters = k2.getParameters()) == null) {
            arrayList = null;
        } else {
            arrayList = new ArrayList(C41343r.m119925u(parameters, 10));
            for (BannerParameterData bannerParameterData : parameters) {
                if (bannerParameterData != null) {
                    str2 = bannerParameterData.getKey();
                } else {
                    str2 = null;
                }
                if (bannerParameterData != null) {
                    str3 = bannerParameterData.getValue();
                } else {
                    str3 = null;
                }
                arrayList.add(new KeyValue(str2, str3));
            }
        }
        intent.putExtra("parameters", C42035e.m122121c(arrayList));
        C35388f2.m105048S1(f2Var, intent, false, 2, (Object) null);
    }

    /* access modifiers changed from: private */
    /* renamed from: a2 */
    public final void m66438a2(String str) {
        m66425M1().mo54216Yy(str);
    }

    /* access modifiers changed from: private */
    /* renamed from: b2 */
    public final void m66439b2(C31128a aVar) {
        C31132b.m92646h(aVar, (int[]) null, C20348e0.f55304d, 1, (Object) null);
        C31132b.m92648j(aVar, (int[]) null, new C20351f0(this), 1, (Object) null);
        C31132b.m92643e(aVar, (int[]) null, new C20354g0(this), 1, (Object) null);
    }

    /* access modifiers changed from: private */
    /* renamed from: c2 */
    public final void m66440c2(long j) {
        Context requireContext = requireContext();
        C41536l.m120488h(requireContext, "onOpenCreditCardDetails$lambda$8");
        C38125h.m112238c(requireContext).mo91546E(requireContext, j);
    }

    /* access modifiers changed from: private */
    /* renamed from: d2 */
    public final void m66441d2(C31128a aVar) {
        C31132b.m92646h(aVar, (int[]) null, C20357h0.f55312d, 1, (Object) null);
        C19854i iVar = this.f55289d;
        if (iVar == null) {
            C41536l.m120506z("contentAdapter");
            iVar = null;
        }
        C31132b.m92648j(aVar, (int[]) null, new C20359i0(iVar), 1, (Object) null);
        C31132b.m92643e(aVar, (int[]) null, new C20361j0(this), 1, (Object) null);
    }

    /* access modifiers changed from: private */
    /* renamed from: e2 */
    public final void m66442e2(JuniorRequestDataUiModel juniorRequestDataUiModel) {
        C1505h requireActivity = requireActivity();
        C41536l.m120488h(requireActivity, "requireActivity()");
        C38122f c = C38125h.m112238c(requireActivity);
        Context requireContext = requireContext();
        C41536l.m120488h(requireContext, "requireContext()");
        C38122f.C38123a.m112228x(c, requireContext, juniorRequestDataUiModel, NavigatorConstants$JuniorFlow.ACTIVATION, false, 8, (Object) null);
    }

    /* access modifiers changed from: private */
    /* renamed from: g2 */
    public final void m66443g2(C21503d.C21504a aVar) {
        C19854i iVar = this.f55289d;
        if (iVar == null) {
            C41536l.m120506z("contentAdapter");
            iVar = null;
        }
        iVar.mo48155P(new C20387w0(this));
    }

    /* access modifiers changed from: private */
    /* renamed from: i2 */
    public final void m66445i2(C21503d.C21504a aVar) {
        C19854i iVar = this.f55289d;
        if (iVar == null) {
            C41536l.m120506z("contentAdapter");
            iVar = null;
        }
        iVar.mo48160U(new C20389x0(this));
    }

    /* access modifiers changed from: private */
    /* renamed from: j2 */
    public final void m66447j2(boolean z) {
        m66424L1().setRefreshing(z);
    }

    /* access modifiers changed from: private */
    /* renamed from: k2 */
    public final void m66449k2(C21503d.C21504a aVar) {
        C19854i iVar = this.f55289d;
        if (iVar == null) {
            C41536l.m120506z("contentAdapter");
            iVar = null;
        }
        iVar.mo48173h0();
    }

    private final void observeData() {
        HomeFragmentViewModel M1 = m66425M1();
        LiveData Ox = M1.mo54212Ox();
        C1619q viewLifecycleOwner = getViewLifecycleOwner();
        C41536l.m120488h(viewLifecycleOwner, "viewLifecycleOwner");
        C19854i iVar = this.f55289d;
        C19854i iVar2 = null;
        if (iVar == null) {
            C41536l.m120506z("contentAdapter");
            iVar = null;
        }
        C21484c.m69412d(Ox, viewLifecycleOwner, new C20368n(iVar), (C43075l) null, new C20382u(this), 4, (Object) null);
        LiveData oy = M1.mo54233oy();
        C1619q viewLifecycleOwner2 = getViewLifecycleOwner();
        C41536l.m120488h(viewLifecycleOwner2, "viewLifecycleOwner");
        C19854i iVar3 = this.f55289d;
        if (iVar3 == null) {
            C41536l.m120506z("contentAdapter");
            iVar3 = null;
        }
        C21484c.m69412d(oy, viewLifecycleOwner2, new C20384v(iVar3), (C43075l) null, new C20386w(this), 4, (Object) null);
        LiveData ay = M1.mo54217ay();
        C1619q viewLifecycleOwner3 = getViewLifecycleOwner();
        C19854i iVar4 = this.f55289d;
        if (iVar4 == null) {
            C41536l.m120506z("contentAdapter");
            iVar4 = null;
        }
        C20388x xVar = new C20388x(iVar4);
        C19854i iVar5 = this.f55289d;
        if (iVar5 == null) {
            C41536l.m120506z("contentAdapter");
            iVar5 = null;
        }
        C20390y yVar = new C20390y(iVar5);
        C41536l.m120488h(viewLifecycleOwner3, "viewLifecycleOwner");
        C21484c.m69411c(ay, viewLifecycleOwner3, xVar, yVar, new C20392z(this));
        LiveData Rx = M1.mo54213Rx();
        C1619q viewLifecycleOwner4 = getViewLifecycleOwner();
        C41536l.m120488h(viewLifecycleOwner4, "viewLifecycleOwner");
        C21484c.m69412d(Rx, viewLifecycleOwner4, new C20336a0(this), (C43075l) null, (C43075l) null, 12, (Object) null);
        LiveData hy = M1.mo54225hy();
        C1619q viewLifecycleOwner5 = getViewLifecycleOwner();
        C41536l.m120488h(viewLifecycleOwner5, "viewLifecycleOwner");
        C19854i iVar6 = this.f55289d;
        if (iVar6 == null) {
            C41536l.m120506z("contentAdapter");
            iVar6 = null;
        }
        C21484c.m69412d(hy, viewLifecycleOwner5, new C20339b0(iVar6), (C43075l) null, (C43075l) null, 12, (Object) null);
        LiveData Ux = M1.mo54215Ux();
        C1619q viewLifecycleOwner6 = getViewLifecycleOwner();
        C41536l.m120488h(viewLifecycleOwner6, "viewLifecycleOwner");
        C19854i iVar7 = this.f55289d;
        if (iVar7 == null) {
            C41536l.m120506z("contentAdapter");
            iVar7 = null;
        }
        C21484c.m69412d(Ux, viewLifecycleOwner6, new C20344d(iVar7), (C43075l) null, (C43075l) null, 12, (Object) null);
        LiveData ey = M1.mo54222ey();
        C1619q viewLifecycleOwner7 = getViewLifecycleOwner();
        C41536l.m120488h(viewLifecycleOwner7, "viewLifecycleOwner");
        C19854i iVar8 = this.f55289d;
        if (iVar8 == null) {
            C41536l.m120506z("contentAdapter");
            iVar8 = null;
        }
        C21484c.m69412d(ey, viewLifecycleOwner7, new C20347e(iVar8), (C43075l) null, (C43075l) null, 12, (Object) null);
        LiveData Eh = M1.mo54203Eh();
        C1619q viewLifecycleOwner8 = getViewLifecycleOwner();
        C41536l.m120488h(viewLifecycleOwner8, "viewLifecycleOwner");
        C19854i iVar9 = this.f55289d;
        if (iVar9 == null) {
            C41536l.m120506z("contentAdapter");
            iVar9 = null;
        }
        C21484c.m69412d(Eh, viewLifecycleOwner8, new C20350f(iVar9), (C43075l) null, (C43075l) null, 12, (Object) null);
        LiveData ny = M1.mo54232ny();
        C1619q viewLifecycleOwner9 = getViewLifecycleOwner();
        C41536l.m120488h(viewLifecycleOwner9, "viewLifecycleOwner");
        C19854i iVar10 = this.f55289d;
        if (iVar10 == null) {
            C41536l.m120506z("contentAdapter");
            iVar10 = null;
        }
        C21484c.m69412d(ny, viewLifecycleOwner9, new C20353g(iVar10), (C43075l) null, (C43075l) null, 12, (Object) null);
        LiveData gy = M1.mo54224gy();
        C1619q viewLifecycleOwner10 = getViewLifecycleOwner();
        C41536l.m120488h(viewLifecycleOwner10, "viewLifecycleOwner");
        C19854i iVar11 = this.f55289d;
        if (iVar11 == null) {
            C41536l.m120506z("contentAdapter");
            iVar11 = null;
        }
        C21484c.m69412d(gy, viewLifecycleOwner10, new C20356h(iVar11), (C43075l) null, (C43075l) null, 12, (Object) null);
        LiveData Tx = M1.mo54214Tx();
        C1619q viewLifecycleOwner11 = getViewLifecycleOwner();
        C41536l.m120488h(viewLifecycleOwner11, "viewLifecycleOwner");
        C19854i iVar12 = this.f55289d;
        if (iVar12 == null) {
            C41536l.m120506z("contentAdapter");
            iVar12 = null;
        }
        C21484c.m69412d(Tx, viewLifecycleOwner11, new C20358i(iVar12), (C43075l) null, (C43075l) null, 12, (Object) null);
        LiveData v = M1.mo54235v();
        C1619q viewLifecycleOwner12 = getViewLifecycleOwner();
        C41536l.m120488h(viewLifecycleOwner12, "viewLifecycleOwner");
        C21484c.m69412d(v, viewLifecycleOwner12, new C20360j(this), (C43075l) null, (C43075l) null, 12, (Object) null);
        LiveData jy = M1.mo54227jy();
        C1619q viewLifecycleOwner13 = getViewLifecycleOwner();
        C41536l.m120488h(viewLifecycleOwner13, "viewLifecycleOwner");
        C19854i iVar13 = this.f55289d;
        if (iVar13 == null) {
            C41536l.m120506z("contentAdapter");
        } else {
            iVar2 = iVar13;
        }
        C21484c.m69412d(jy, viewLifecycleOwner13, new C20362k(iVar2), (C43075l) null, (C43075l) null, 12, (Object) null);
        M1.mo54229ls().mo4819k(getViewLifecycleOwner(), new C20385v0(new C20364l(this)));
        M1.mo54228ky().mo4819k(getViewLifecycleOwner(), new C20385v0(new C20366m(this)));
        M1.mo54220dy().mo4819k(getViewLifecycleOwner(), new C20385v0(new C20370o(this)));
        M1.mo54231my().mo4819k(getViewLifecycleOwner(), new C20385v0(new C20372p(this)));
        LiveData ly = M1.mo54230ly();
        C1619q viewLifecycleOwner14 = getViewLifecycleOwner();
        C41536l.m120488h(viewLifecycleOwner14, "viewLifecycleOwner");
        C37224b.m109963b(ly, viewLifecycleOwner14, new C20374q(this));
        LiveData cy = M1.mo54218cy();
        C1619q viewLifecycleOwner15 = getViewLifecycleOwner();
        C41536l.m120488h(viewLifecycleOwner15, "viewLifecycleOwner");
        C37224b.m109963b(cy, viewLifecycleOwner15, new C20376r(this));
        LiveData fy = M1.mo54223fy();
        C1619q viewLifecycleOwner16 = getViewLifecycleOwner();
        C41536l.m120488h(viewLifecycleOwner16, "viewLifecycleOwner");
        C37224b.m109963b(fy, viewLifecycleOwner16, new C20378s(this));
        M1.mo54226iy().mo4819k(getViewLifecycleOwner(), new C20385v0(new C20380t(this)));
    }

    /* renamed from: G1 */
    public final void mo48815G1() {
        m66425M1().mo54201Bx();
    }

    /* renamed from: T1 */
    public final void mo48816T1() {
        C19788a aVar;
        Fragment k0 = getChildFragmentManager().mo4418k0("FRAGMENT_TAG_GOOGLE_PAY");
        if (k0 instanceof C19788a) {
            aVar = (C19788a) k0;
        } else {
            aVar = null;
        }
        if (aVar != null) {
            aVar.mo4577k1();
        }
        m66428P1(this, false, (C43064a) null, (C43064a) null, 7, (Object) null);
    }

    /* renamed from: f2 */
    public final void mo48817f2() {
        HomeFragmentViewModel.m70439ty(m66425M1(), false, 1, (Object) null);
    }

    public String getHeaderText() {
        String string = getString(C10328q.navigation_title_home);
        C41536l.m120488h(string, "getString(R.string.navigation_title_home)");
        return string;
    }

    /* renamed from: h2 */
    public final void mo48818h2(boolean z) {
        this.f55292g = z;
        m66424L1().setCurrentlyOnScreen(z);
    }

    /* renamed from: l2 */
    public final void mo48819l2() {
        Context requireContext = requireContext();
        if (this.mPreferencesApiManager.getGooglePayState() == GooglePayState.WALLET_NEEDS_CREATION) {
            C41536l.m120488h(requireContext, "startGooglePayFlow$lambda$4");
            C38122f c = C38125h.m112238c(requireContext);
            C1505h requireActivity = requireActivity();
            C41536l.m120488h(requireActivity, "requireActivity()");
            c.mo91619n0(requireActivity);
            return;
        }
        C41536l.m120488h(requireContext, "startGooglePayFlow$lambda$4");
        C38122f.C38123a.m112205a(C38125h.m112238c(requireContext), (Long) null, 1, (Object) null).mo4576A1(getChildFragmentManager(), "FRAGMENT_TAG_GOOGLE_PAY");
    }

    /* access modifiers changed from: protected */
    public int layoutId() {
        return C10324m.fragment_home;
    }

    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        C41536l.m120489i(layoutInflater, "inflater");
        View onCreateView = super.onCreateView(layoutInflater, viewGroup, bundle);
        m66424L1().setDistanceToTriggerSync(((int) (((float) 64) * getResources().getDisplayMetrics().density)) * 3);
        m66424L1().setOnRefreshListener(new C20332a(this));
        m66424L1().setCurrentlyOnScreen(this.f55292g);
        return onCreateView;
    }

    public void onViewCreated(View view, Bundle bundle) {
        RecyclerView recyclerView;
        C1832v vVar;
        View view2 = view;
        C41536l.m120489i(view2, "view");
        super.onViewCreated(view, bundle);
        View findViewById = view2.findViewById(C10322k.content_recycler_view);
        C41536l.m120488h(findViewById, "view.findViewById(R.id.content_recycler_view)");
        this.f55293h = (RecyclerView) findViewById;
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(getContext());
        RecyclerView recyclerView2 = this.f55293h;
        if (recyclerView2 == null) {
            C41536l.m120506z("contentRecyclerView");
            recyclerView2 = null;
        }
        recyclerView2.setLayoutManager(linearLayoutManager);
        C1505h activity = getActivity();
        C41536l.m120487g(activity, "null cannot be cast to non-null type ge.bog.mobilebank.ui.activities.MainActivity");
        C20367m0 m0Var = new C20367m0(this);
        C20369n0 n0Var = new C20369n0(this);
        C20371o0 o0Var = new C20371o0(this);
        C20373p0 p0Var = new C20373p0(this);
        C20375q0 q0Var = new C20375q0(this);
        C20377r0 r0Var = new C20377r0(this);
        C20379s0 s0Var = new C20379s0(this);
        C20381t0 t0Var = new C20381t0(this);
        C20383u0 u0Var = new C20383u0(this);
        C20338b J1 = m66422J1();
        C24852b K1 = m66423K1();
        C20363k0 k0Var = new C20363k0();
        C20365l0 l0Var = new C20365l0();
        PreferencesApiManager preferencesApiManager = this.mPreferencesApiManager;
        C41536l.m120488h(preferencesApiManager, "mPreferencesApiManager");
        C19854i iVar = new C19854i((MainActivity) activity, m0Var, n0Var, o0Var, p0Var, q0Var, r0Var, s0Var, t0Var, u0Var, J1, K1, k0Var, l0Var, preferencesApiManager);
        iVar.mo48165Z(new C20333b(this));
        this.f55289d = iVar;
        RecyclerView recyclerView3 = this.f55293h;
        if (recyclerView3 == null) {
            C41536l.m120506z("contentRecyclerView");
            recyclerView3 = null;
        }
        C19854i iVar2 = this.f55289d;
        if (iVar2 == null) {
            C41536l.m120506z("contentAdapter");
            iVar2 = null;
        }
        recyclerView3.setAdapter(iVar2);
        RecyclerView recyclerView4 = this.f55293h;
        if (recyclerView4 == null) {
            C41536l.m120506z("contentRecyclerView");
            recyclerView4 = null;
        }
        RecyclerView.C1742m itemAnimator = recyclerView4.getItemAnimator();
        if (itemAnimator != null) {
            if (itemAnimator instanceof C1832v) {
                vVar = (C1832v) itemAnimator;
            } else {
                vVar = null;
            }
            if (vVar != null) {
                vVar.mo6072Q(false);
            }
        }
        RecyclerView recyclerView5 = this.f55293h;
        if (recyclerView5 == null) {
            C41536l.m120506z("contentRecyclerView");
            recyclerView = null;
        } else {
            recyclerView = recyclerView5;
        }
        C32359z0.m95582n(recyclerView, "SCREEN_TYPE_HOME_TIPPER", this.mPreferencesApiManager);
        observeData();
        m66425M1().mo54221dz();
        m66428P1(this, false, (C43064a) null, (C43064a) null, 7, (Object) null);
    }
}
