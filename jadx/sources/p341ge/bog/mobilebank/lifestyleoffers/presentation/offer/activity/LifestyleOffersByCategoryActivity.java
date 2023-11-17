package p341ge.bog.mobilebank.lifestyleoffers.presentation.offer.activity;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import androidx.activity.ComponentActivity;
import androidx.cardview.widget.CardView;
import androidx.lifecycle.C1617p0;
import androidx.lifecycle.C1620q0;
import androidx.lifecycle.C1636t0;
import androidx.lifecycle.C1645y;
import androidx.recyclerview.widget.RecyclerView;
import b41.C31128a;
import com.google.android.material.tabs.TabLayout;
import g91.C32286a1;
import g91.C32343x;
import he1.C41212c;
import he1.C41217g;
import he1.C41224m;
import he1.C41238w;
import io0.C15719i;
import io0.C15720j;
import io0.C15721k;
import io0.C15722l;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import jo0.C16302a;
import ko0.C16516a;
import kotlin.jvm.internal.C41520a0;
import kotlin.jvm.internal.C41532h;
import kotlin.jvm.internal.C41535k;
import kotlin.jvm.internal.C41536l;
import kotlin.jvm.internal.C41537m;
import kotlin.jvm.internal.DefaultConstructorMarker;
import m41.C37223a;
import mo0.C16856i;
import mo0.C16862o;
import o31.C37621w;
import p163m0.C7047a;
import p341ge.bog.designsystem.components.layersandshadows.LayerView;
import p341ge.bog.designsystem.components.pagestate.PageState;
import p341ge.bog.designsystem.components.tabs.TabsView;
import p341ge.bog.mobilebank.lifestyleoffers.presentation.shared.VisibilityPercentageLayoutManager;
import p380ck.C10464h;
import q31.C38125h;
import ro0.C17703e;
import sn0.C17899c;
import ue1.C43064a;
import ue1.C43075l;
import uo0.C18271c;
import uo0.C18273e;
import xn0.C18847e;

/* renamed from: ge.bog.mobilebank.lifestyleoffers.presentation.offer.activity.LifestyleOffersByCategoryActivity */
public final class LifestyleOffersByCategoryActivity extends C15057b {

    /* renamed from: L */
    public static final C15033a f43273L = new C15033a((DefaultConstructorMarker) null);

    /* renamed from: G */
    public C16862o.C16870d f43274G;
    /* access modifiers changed from: private */

    /* renamed from: H */
    public C18847e f43275H;

    /* renamed from: I */
    private final C16302a f43276I = new C16302a();

    /* renamed from: J */
    private final C17703e f43277J = new C17703e(new C15038f(this));

    /* renamed from: K */
    private final C41217g f43278K = new C1617p0(C41520a0.m120436b(C16862o.class), new C15041i(this), new C15043k(this), new C15042j((C43064a) null, this));

    /* renamed from: ge.bog.mobilebank.lifestyleoffers.presentation.offer.activity.LifestyleOffersByCategoryActivity$a */
    public static final class C15033a {
        private C15033a() {
        }

        public /* synthetic */ C15033a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* renamed from: b */
        public static /* synthetic */ void m55134b(C15033a aVar, Context context, long j, boolean z, int i, Object obj) {
            if ((i & 2) != 0) {
                j = 0;
            }
            if ((i & 4) != 0) {
                z = false;
            }
            aVar.mo41999a(context, j, z);
        }

        /* renamed from: a */
        public final void mo41999a(Context context, long j, boolean z) {
            C41536l.m120489i(context, "context");
            Intent intent = new Intent(context, LifestyleOffersByCategoryActivity.class);
            intent.putExtra("EXTRA_CATEGORY_ID", j);
            intent.putExtra("EXTRA_IS_LAST_MINUTE_OFFERS", z);
            context.startActivity(intent);
        }
    }

    /* renamed from: ge.bog.mobilebank.lifestyleoffers.presentation.offer.activity.LifestyleOffersByCategoryActivity$b */
    static final class C15034b extends C41537m implements C43075l {

        /* renamed from: d */
        final /* synthetic */ LifestyleOffersByCategoryActivity f43279d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C15034b(LifestyleOffersByCategoryActivity lifestyleOffersByCategoryActivity) {
            super(1);
            this.f43279d = lifestyleOffersByCategoryActivity;
        }

        /* renamed from: a */
        public final void mo42000a(C31128a aVar) {
            if (aVar instanceof C31128a.C31130b) {
                C18847e I2 = this.f43279d.f43275H;
                if (I2 == null) {
                    C41536l.m120506z("binding");
                    I2 = null;
                }
                LayerView layerView = I2.f52707h;
                C41536l.m120488h(layerView, "binding.loadingView");
                C32343x.m95447f1(layerView);
            } else if (aVar instanceof C31128a.C31131c) {
                this.f43279d.m55130Y2((C41224m) ((C31128a.C31131c) aVar).mo71340a());
            } else if (aVar instanceof C31128a.C31129a) {
                this.f43279d.m55126U2(((C31128a.C31129a) aVar).mo71342c());
            }
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            mo42000a((C31128a) obj);
            return C41238w.f97225a;
        }
    }

    /* renamed from: ge.bog.mobilebank.lifestyleoffers.presentation.offer.activity.LifestyleOffersByCategoryActivity$c */
    static final class C15035c extends C41537m implements C43075l {

        /* renamed from: d */
        final /* synthetic */ LifestyleOffersByCategoryActivity f43280d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C15035c(LifestyleOffersByCategoryActivity lifestyleOffersByCategoryActivity) {
            super(1);
            this.f43280d = lifestyleOffersByCategoryActivity;
        }

        /* renamed from: a */
        public final void mo42001a(C31128a aVar) {
            if (aVar instanceof C31128a.C31130b) {
                C18847e I2 = this.f43280d.f43275H;
                if (I2 == null) {
                    C41536l.m120506z("binding");
                    I2 = null;
                }
                LayerView layerView = I2.f52707h;
                C41536l.m120488h(layerView, "binding.loadingView");
                C32343x.m95447f1(layerView);
            } else if (aVar instanceof C31128a.C31131c) {
                this.f43280d.m55127V2((C41224m) ((C31128a.C31131c) aVar).mo71340a());
            } else if (aVar instanceof C31128a.C31129a) {
                this.f43280d.m55126U2(((C31128a.C31129a) aVar).mo71342c());
            }
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            mo42001a((C31128a) obj);
            return C41238w.f97225a;
        }
    }

    /* renamed from: ge.bog.mobilebank.lifestyleoffers.presentation.offer.activity.LifestyleOffersByCategoryActivity$d */
    static final class C15036d extends C41537m implements C43075l {

        /* renamed from: d */
        final /* synthetic */ LifestyleOffersByCategoryActivity f43281d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C15036d(LifestyleOffersByCategoryActivity lifestyleOffersByCategoryActivity) {
            super(1);
            this.f43281d = lifestyleOffersByCategoryActivity;
        }

        /* renamed from: a */
        public final void mo42002a(C37223a aVar) {
            Long l;
            if (aVar != null && (l = (Long) aVar.mo90296a()) != null) {
                LifestyleOfferDetailedActivity.f43256J.mo41989a(this.f43281d, l.longValue());
            }
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            mo42002a((C37223a) obj);
            return C41238w.f97225a;
        }
    }

    /* renamed from: ge.bog.mobilebank.lifestyleoffers.presentation.offer.activity.LifestyleOffersByCategoryActivity$e */
    static final class C15037e extends C41537m implements C43075l {

        /* renamed from: d */
        final /* synthetic */ LifestyleOffersByCategoryActivity f43282d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C15037e(LifestyleOffersByCategoryActivity lifestyleOffersByCategoryActivity) {
            super(1);
            this.f43282d = lifestyleOffersByCategoryActivity;
        }

        /* renamed from: a */
        public final void mo42003a(C37223a aVar) {
            C41224m mVar = (C41224m) aVar.mo90296a();
            if (mVar != null) {
                LifestyleOffersByCategoryActivity lifestyleOffersByCategoryActivity = this.f43282d;
                C38125h.m112238c(lifestyleOffersByCategoryActivity).mo91561L0(((Number) mVar.mo95675a()).longValue(), (String) mVar.mo95676b(), lifestyleOffersByCategoryActivity);
            }
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            mo42003a((C37223a) obj);
            return C41238w.f97225a;
        }
    }

    /* renamed from: ge.bog.mobilebank.lifestyleoffers.presentation.offer.activity.LifestyleOffersByCategoryActivity$f */
    /* synthetic */ class C15038f extends C41535k implements C43064a {
        C15038f(Object obj) {
            super(0, obj, LifestyleOffersByCategoryActivity.class, "getVisibleOffers", "getVisibleOffers()Ljava/util/Map;", 0);
        }

        /* renamed from: b */
        public final Map invoke() {
            return ((LifestyleOffersByCategoryActivity) this.receiver).m55122Q2();
        }
    }

    /* renamed from: ge.bog.mobilebank.lifestyleoffers.presentation.offer.activity.LifestyleOffersByCategoryActivity$g */
    static final class C15039g implements C1645y, C41532h {

        /* renamed from: a */
        private final /* synthetic */ C43075l f43283a;

        C15039g(C43075l lVar) {
            C41536l.m120489i(lVar, "function");
            this.f43283a = lVar;
        }

        public final boolean equals(Object obj) {
            if (!(obj instanceof C1645y) || !(obj instanceof C41532h)) {
                return false;
            }
            return C41536l.m120484d(getFunctionDelegate(), ((C41532h) obj).getFunctionDelegate());
        }

        public final C41212c getFunctionDelegate() {
            return this.f43283a;
        }

        public final int hashCode() {
            return getFunctionDelegate().hashCode();
        }

        public final /* synthetic */ void onChanged(Object obj) {
            this.f43283a.invoke(obj);
        }
    }

    /* renamed from: ge.bog.mobilebank.lifestyleoffers.presentation.offer.activity.LifestyleOffersByCategoryActivity$h */
    static final class C15040h extends C41537m implements C43075l {

        /* renamed from: d */
        final /* synthetic */ LifestyleOffersByCategoryActivity f43284d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C15040h(LifestyleOffersByCategoryActivity lifestyleOffersByCategoryActivity) {
            super(1);
            this.f43284d = lifestyleOffersByCategoryActivity;
        }

        /* renamed from: a */
        public final void mo42007a(TabLayout.C5153g gVar) {
            Object obj;
            C16856i rw = this.f43284d.m55121P2().mo43990rw();
            if (gVar != null) {
                obj = gVar.mo16960i();
            } else {
                obj = null;
            }
            C41536l.m120487g(obj, "null cannot be cast to non-null type kotlin.Long");
            rw.mo43983Ah(((Long) obj).longValue());
            C32343x.m95393H0(this.f43284d, "life_style_offers", String.valueOf(gVar.mo16961j()), "CLICK_OFFERS_CATEGORY_TAB", C10464h.C10465a.FIREBASE, (Bundle) null, 16, (Object) null);
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            mo42007a((TabLayout.C5153g) obj);
            return C41238w.f97225a;
        }
    }

    /* renamed from: ge.bog.mobilebank.lifestyleoffers.presentation.offer.activity.LifestyleOffersByCategoryActivity$i */
    public static final class C15041i extends C41537m implements C43064a {

        /* renamed from: d */
        final /* synthetic */ ComponentActivity f43285d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C15041i(ComponentActivity componentActivity) {
            super(0);
            this.f43285d = componentActivity;
        }

        public final C1636t0 invoke() {
            C1636t0 viewModelStore = this.f43285d.getViewModelStore();
            C41536l.m120488h(viewModelStore, "viewModelStore");
            return viewModelStore;
        }
    }

    /* renamed from: ge.bog.mobilebank.lifestyleoffers.presentation.offer.activity.LifestyleOffersByCategoryActivity$j */
    public static final class C15042j extends C41537m implements C43064a {

        /* renamed from: d */
        final /* synthetic */ C43064a f43286d;

        /* renamed from: e */
        final /* synthetic */ ComponentActivity f43287e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C15042j(C43064a aVar, ComponentActivity componentActivity) {
            super(0);
            this.f43286d = aVar;
            this.f43287e = componentActivity;
        }

        public final C7047a invoke() {
            C7047a aVar;
            C43064a aVar2 = this.f43286d;
            if (aVar2 != null && (aVar = (C7047a) aVar2.invoke()) != null) {
                return aVar;
            }
            C7047a defaultViewModelCreationExtras = this.f43287e.getDefaultViewModelCreationExtras();
            C41536l.m120488h(defaultViewModelCreationExtras, "this.defaultViewModelCreationExtras");
            return defaultViewModelCreationExtras;
        }
    }

    /* renamed from: ge.bog.mobilebank.lifestyleoffers.presentation.offer.activity.LifestyleOffersByCategoryActivity$k */
    static final class C15043k extends C41537m implements C43064a {

        /* renamed from: d */
        final /* synthetic */ LifestyleOffersByCategoryActivity f43288d;

        /* renamed from: ge.bog.mobilebank.lifestyleoffers.presentation.offer.activity.LifestyleOffersByCategoryActivity$k$a */
        static final class C15044a extends C41537m implements C43064a {

            /* renamed from: d */
            final /* synthetic */ LifestyleOffersByCategoryActivity f43289d;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            C15044a(LifestyleOffersByCategoryActivity lifestyleOffersByCategoryActivity) {
                super(0);
                this.f43289d = lifestyleOffersByCategoryActivity;
            }

            /* renamed from: b */
            public final C16862o invoke() {
                return this.f43289d.mo41998O2().mo32566a(this.f43289d.getIntent().getLongExtra("EXTRA_CATEGORY_ID", 0), this.f43289d.getIntent().getBooleanExtra("EXTRA_IS_LAST_MINUTE_OFFERS", false));
            }
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C15043k(LifestyleOffersByCategoryActivity lifestyleOffersByCategoryActivity) {
            super(0);
            this.f43288d = lifestyleOffersByCategoryActivity;
        }

        public final C1620q0.C1624b invoke() {
            return C32286a1.f79687a.mo72809a(new C15044a(this.f43288d));
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: P2 */
    public final C16862o m55121P2() {
        return (C16862o) this.f43278K.getValue();
    }

    /* access modifiers changed from: private */
    /* renamed from: Q2 */
    public final Map m55122Q2() {
        boolean z;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        C18847e eVar = this.f43275H;
        C18847e eVar2 = null;
        if (eVar == null) {
            C41536l.m120506z("binding");
            eVar = null;
        }
        if (eVar.f52708i.getScrollState() != 0) {
            z = true;
        } else {
            z = false;
        }
        if (this.f43276I.getItemCount() != 0 && !z) {
            C18847e eVar3 = this.f43275H;
            if (eVar3 == null) {
                C41536l.m120506z("binding");
            } else {
                eVar2 = eVar3;
            }
            RecyclerView.C1747p layoutManager = eVar2.f52708i.getLayoutManager();
            C41536l.m120487g(layoutManager, "null cannot be cast to non-null type ge.bog.mobilebank.lifestyleoffers.presentation.shared.VisibilityPercentageLayoutManager");
            VisibilityPercentageLayoutManager visibilityPercentageLayoutManager = (VisibilityPercentageLayoutManager) layoutManager;
            int j2 = visibilityPercentageLayoutManager.mo5215j2();
            int o2 = visibilityPercentageLayoutManager.mo5221o2();
            if (j2 <= o2) {
                while (true) {
                    if (this.f43276I.mo6026f().get(j2) instanceof C16516a.C16518b) {
                        Object obj = this.f43276I.mo6026f().get(j2);
                        C41536l.m120487g(obj, "null cannot be cast to non-null type ge.bog.mobilebank.lifestyleoffers.presentation.offer.model.LifestyleOfferCategoryListItem.Offer");
                        C18273e b = ((C16516a.C16518b) obj).mo43663b();
                        linkedHashMap.put(Long.valueOf(b.mo45962k()), new C17703e.C17705b(m55121P2().mo43994vw(), b.mo45962k(), b.mo45954e(), (String) null, (String) null, 24, (DefaultConstructorMarker) null));
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

    /* renamed from: R2 */
    private final void m55123R2() {
        m55121P2().mo43993uw().mo43986gf().mo4819k(this, new C15039g(new C15034b(this)));
        m55121P2().mo43993uw().mo43985L0().mo4819k(this, new C15039g(new C15035c(this)));
        m55121P2().mo43993uw().mo43987h4().mo4819k(this, new C15039g(new C15036d(this)));
        m55121P2().mo43993uw().mo43988ja().mo4819k(this, new C15039g(new C15037e(this)));
    }

    /* access modifiers changed from: private */
    /* renamed from: S2 */
    public static final void m55124S2(LifestyleOffersByCategoryActivity lifestyleOffersByCategoryActivity, long j, String str, boolean z) {
        C41536l.m120489i(lifestyleOffersByCategoryActivity, "this$0");
        lifestyleOffersByCategoryActivity.m55121P2().mo43990rw().mo43984h2(j, str, z);
    }

    /* access modifiers changed from: private */
    /* renamed from: T2 */
    public static final void m55125T2(LifestyleOffersByCategoryActivity lifestyleOffersByCategoryActivity, View view) {
        C41536l.m120489i(lifestyleOffersByCategoryActivity, "this$0");
        C18847e eVar = lifestyleOffersByCategoryActivity.f43275H;
        if (eVar == null) {
            C41536l.m120506z("binding");
            eVar = null;
        }
        CardView cardView = eVar.f52710k;
        C41536l.m120488h(cardView, "binding.retryButtonContainer");
        C32343x.m95455i0(cardView);
        lifestyleOffersByCategoryActivity.m55121P2().onRefresh(6);
    }

    /* access modifiers changed from: private */
    /* renamed from: U2 */
    public final void m55126U2(Throwable th) {
        mo74709H1(th);
        C18847e eVar = this.f43275H;
        C18847e eVar2 = null;
        if (eVar == null) {
            C41536l.m120506z("binding");
            eVar = null;
        }
        CardView cardView = eVar.f52710k;
        C41536l.m120488h(cardView, "binding.retryButtonContainer");
        C32343x.m95447f1(cardView);
        C18847e eVar3 = this.f43275H;
        if (eVar3 == null) {
            C41536l.m120506z("binding");
        } else {
            eVar2 = eVar3;
        }
        LayerView layerView = eVar2.f52707h;
        C41536l.m120488h(layerView, "binding.loadingView");
        C32343x.m95455i0(layerView);
    }

    /* access modifiers changed from: private */
    /* renamed from: V2 */
    public final void m55127V2(C41224m mVar) {
        List list = (List) mVar.mo95675a();
        if (((Boolean) mVar.mo95676b()).booleanValue()) {
            mo86429X1(C32343x.m95388F("life.style.offers.main.page.last.minute.block.header", new Object[0]));
        }
        this.f43276I.mo6030j(list, new C15721k(this));
        C18847e eVar = this.f43275H;
        if (eVar == null) {
            C41536l.m120506z("binding");
            eVar = null;
        }
        LayerView layerView = eVar.f52707h;
        C41536l.m120488h(layerView, "binding.loadingView");
        C32343x.m95455i0(layerView);
    }

    /* access modifiers changed from: private */
    /* renamed from: W2 */
    public static final void m55128W2(LifestyleOffersByCategoryActivity lifestyleOffersByCategoryActivity) {
        C41536l.m120489i(lifestyleOffersByCategoryActivity, "this$0");
        lifestyleOffersByCategoryActivity.f43277J.mo45259e();
        lifestyleOffersByCategoryActivity.f43277J.mo45261h();
    }

    /* renamed from: X2 */
    private final void m55129X2(long j) {
        boolean z;
        C18847e eVar = this.f43275H;
        if (eVar == null) {
            C41536l.m120506z("binding");
            eVar = null;
        }
        int tabCount = eVar.f52704e.getTabCount();
        if (tabCount >= 0) {
            int i = 0;
            while (true) {
                C18847e eVar2 = this.f43275H;
                if (eVar2 == null) {
                    C41536l.m120506z("binding");
                    eVar2 = null;
                }
                TabLayout.C5153g tabAt = eVar2.f52704e.getTabAt(i);
                if (tabAt != null) {
                    z = C41536l.m120484d(tabAt.mo16960i(), Long.valueOf(j));
                } else {
                    z = false;
                }
                if (z) {
                    tabAt.mo16964m();
                    C32343x.m95393H0(this, "life_style_offers", String.valueOf(tabAt.mo16961j()), "OPEN_LIFESTYLE_OFFERS_BY_CATEGORIES", C10464h.C10465a.FACEBOOKANDFIREBASE, (Bundle) null, 16, (Object) null);
                    return;
                } else if (i != tabCount) {
                    i++;
                } else {
                    return;
                }
            }
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: Y2 */
    public final void m55130Y2(C41224m mVar) {
        Object obj;
        boolean z;
        mo86429X1(C32343x.m95388F("life.style.offers.main.page.header", new Object[0]));
        C18847e eVar = this.f43275H;
        C18847e eVar2 = null;
        if (eVar == null) {
            C41536l.m120506z("binding");
            eVar = null;
        }
        LayerView layerView = eVar.f52707h;
        C41536l.m120488h(layerView, "binding.loadingView");
        C32343x.m95455i0(layerView);
        List<C18271c> list = (List) mVar.mo95675a();
        long longValue = ((Number) mVar.mo95676b()).longValue();
        Iterator it = list.iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            }
            obj = it.next();
            if (((C18271c) obj).mo45936c() == longValue) {
                z = true;
                continue;
            } else {
                z = false;
                continue;
            }
            if (z) {
                break;
            }
        }
        if (obj == null) {
            C18847e eVar3 = this.f43275H;
            if (eVar3 == null) {
                C41536l.m120506z("binding");
                eVar3 = null;
            }
            PageState pageState = eVar3.f52705f;
            C41536l.m120488h(pageState, "binding.categoryNotFoundState");
            C32343x.m95447f1(pageState);
            C18847e eVar4 = this.f43275H;
            if (eVar4 == null) {
                C41536l.m120506z("binding");
            } else {
                eVar2 = eVar4;
            }
            eVar2.f52705f.setTitleText(C32343x.m95388F("life.style.offers.push.category.not.found", new Object[0]));
            return;
        }
        C18847e eVar5 = this.f43275H;
        if (eVar5 == null) {
            C41536l.m120506z("binding");
            eVar5 = null;
        }
        LayerView layerView2 = eVar5.f52706g;
        C41536l.m120488h(layerView2, "binding.header");
        C32343x.m95447f1(layerView2);
        C18847e eVar6 = this.f43275H;
        if (eVar6 == null) {
            C41536l.m120506z("binding");
        } else {
            eVar2 = eVar6;
        }
        TabsView tabsView = eVar2.f52704e;
        for (C18271c cVar : list) {
            TabLayout.C5153g newTab = tabsView.newTab();
            newTab.mo16972u(cVar.mo45934a());
            newTab.mo16970s(Long.valueOf(cVar.mo45936c()));
            C41536l.m120488h(newTab, "newTab().apply {\n       …yId\n                    }");
            tabsView.addTab(newTab);
        }
        tabsView.post(new C15722l(this, longValue, tabsView));
    }

    /* access modifiers changed from: private */
    /* renamed from: Z2 */
    public static final void m55131Z2(LifestyleOffersByCategoryActivity lifestyleOffersByCategoryActivity, long j, TabsView tabsView) {
        C41536l.m120489i(lifestyleOffersByCategoryActivity, "this$0");
        C41536l.m120489i(tabsView, "$this_apply");
        lifestyleOffersByCategoryActivity.m55129X2(j);
        C32343x.m95417T0(tabsView, new C15040h(lifestyleOffersByCategoryActivity));
    }

    /* access modifiers changed from: protected */
    /* renamed from: O1 */
    public void mo37451O1(Bundle bundle) {
        C18847e d = C18847e.m63755d(getLayoutInflater());
        C41536l.m120488h(d, "inflate(layoutInflater)");
        this.f43275H = d;
        C18847e eVar = null;
        if (d == null) {
            C41536l.m120506z("binding");
            d = null;
        }
        setContentView((View) d.mo3946b());
        super.mo37451O1(bundle);
        m55123R2();
        C18847e eVar2 = this.f43275H;
        if (eVar2 == null) {
            C41536l.m120506z("binding");
            eVar2 = null;
        }
        RecyclerView recyclerView = eVar2.f52708i;
        recyclerView.setLayoutManager(new VisibilityPercentageLayoutManager(recyclerView.getContext()));
        recyclerView.mo5351j(new C37621w(recyclerView.getResources().getDimensionPixelSize(C17899c.f50936a), 0, 1, 2, (DefaultConstructorMarker) null));
        recyclerView.setAdapter(this.f43276I);
        this.f43276I.mo43285l(new C15719i(this));
        C18847e eVar3 = this.f43275H;
        if (eVar3 == null) {
            C41536l.m120506z("binding");
        } else {
            eVar = eVar3;
        }
        eVar.f52709j.mo3946b().setOnClickListener(new C15720j(this));
    }

    /* renamed from: O2 */
    public final C16862o.C16870d mo41998O2() {
        C16862o.C16870d dVar = this.f43274G;
        if (dVar != null) {
            return dVar;
        }
        C41536l.m120506z("factory");
        return null;
    }

    /* access modifiers changed from: protected */
    public void onDestroy() {
        super.onDestroy();
        this.f43277J.mo45259e();
    }
}
