package p341ge.bog.mobilebank.lifestyleoffers.presentation.allcategories;

import a81.C30772sa;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.FrameLayout;
import androidx.activity.ComponentActivity;
import androidx.activity.result.ActivityResult;
import androidx.activity.result.C0173b;
import androidx.cardview.widget.CardView;
import androidx.core.view.ViewCompat;
import androidx.lifecycle.C1617p0;
import androidx.lifecycle.C1620q0;
import androidx.lifecycle.C1636t0;
import androidx.lifecycle.C1645y;
import androidx.recyclerview.widget.RecyclerView;
import b41.C31128a;
import do0.C12390a;
import do0.C12391b;
import do0.C12392c;
import do0.C12393d;
import do0.C12394e;
import do0.C12395f;
import do0.C12405p;
import g91.C32343x;
import he1.C41212c;
import he1.C41217g;
import he1.C41224m;
import he1.C41238w;
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
import o31.C37602i;
import o31.C37621w;
import p017b.C2106d;
import p163m0.C7047a;
import p341ge.bog.designsystem.components.buttons.Button;
import p341ge.bog.designsystem.components.layersandshadows.LayerView;
import p341ge.bog.designsystem.components.pagestate.PageState;
import p341ge.bog.mobilebank.lifestyleoffers.presentation.offer.activity.LifestyleOfferDetailedActivity;
import p341ge.bog.mobilebank.lifestyleoffers.presentation.offer.activity.LifestyleOffersByCategoryActivity;
import p341ge.bog.mobilebank.lifestyleoffers.presentation.offer.activity.LifestyleOffersFilterActivity;
import p341ge.bog.mobilebank.lifestyleoffers.presentation.shared.VisibilityPercentageLayoutManager;
import p341ge.bog.mobilebank.lifestyleoffers.presentation.shared.model.LifestyleOffersFilterResultData;
import p380ck.C10464h;
import q31.C38125h;
import ro0.C17703e;
import ro0.C17708g;
import sn0.C17899c;
import ue1.C43064a;
import ue1.C43075l;
import uo0.C18273e;
import xn0.C18846d;

/* renamed from: ge.bog.mobilebank.lifestyleoffers.presentation.allcategories.LifestyleOffersAllCategoriesActivity */
public final class LifestyleOffersAllCategoriesActivity extends C30772sa {

    /* renamed from: M */
    public static final C14936a f43098M = new C14936a((DefaultConstructorMarker) null);
    /* access modifiers changed from: private */

    /* renamed from: F */
    public C18846d f43099F;

    /* renamed from: G */
    private final C41217g f43100G = new C1617p0(C41520a0.m120436b(LifestyleOffersAllCategoriesViewModel$ViewModel.class), new C14951p(this), new C14950o(this), new C14952q((C43064a) null, this));
    /* access modifiers changed from: private */

    /* renamed from: H */
    public final C12405p f43101H = new C12405p();
    /* access modifiers changed from: private */

    /* renamed from: I */
    public final C16302a f43102I = new C16302a();
    /* access modifiers changed from: private */

    /* renamed from: J */
    public final C17703e f43103J = new C17703e(new C14947l(this));
    /* access modifiers changed from: private */

    /* renamed from: K */
    public final C0173b f43104K;

    /* renamed from: L */
    private final C41217g f43105L;

    /* renamed from: ge.bog.mobilebank.lifestyleoffers.presentation.allcategories.LifestyleOffersAllCategoriesActivity$a */
    public static final class C14936a {
        private C14936a() {
        }

        public /* synthetic */ C14936a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* renamed from: b */
        public static /* synthetic */ void m54784b(C14936a aVar, Context context, LifestyleOffersFilterResultData lifestyleOffersFilterResultData, int i, Object obj) {
            if ((i & 2) != 0) {
                lifestyleOffersFilterResultData = null;
            }
            aVar.mo41862a(context, lifestyleOffersFilterResultData);
        }

        /* renamed from: a */
        public final void mo41862a(Context context, LifestyleOffersFilterResultData lifestyleOffersFilterResultData) {
            C41536l.m120489i(context, "context");
            Intent intent = new Intent(context, LifestyleOffersAllCategoriesActivity.class);
            intent.putExtra("EXTRA_FILTER_DATA", lifestyleOffersFilterResultData);
            context.startActivity(intent);
        }
    }

    /* renamed from: ge.bog.mobilebank.lifestyleoffers.presentation.allcategories.LifestyleOffersAllCategoriesActivity$b */
    static final class C14937b extends C41537m implements C43064a {

        /* renamed from: d */
        final /* synthetic */ LifestyleOffersAllCategoriesActivity f43106d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C14937b(LifestyleOffersAllCategoriesActivity lifestyleOffersAllCategoriesActivity) {
            super(0);
            this.f43106d = lifestyleOffersAllCategoriesActivity;
        }

        /* renamed from: b */
        public final LifestyleOffersFilterResultData invoke() {
            return (LifestyleOffersFilterResultData) this.f43106d.getIntent().getParcelableExtra("EXTRA_FILTER_DATA");
        }
    }

    /* renamed from: ge.bog.mobilebank.lifestyleoffers.presentation.allcategories.LifestyleOffersAllCategoriesActivity$c */
    static final class C14938c extends C41537m implements C43075l {

        /* renamed from: d */
        final /* synthetic */ LifestyleOffersAllCategoriesActivity f43107d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C14938c(LifestyleOffersAllCategoriesActivity lifestyleOffersAllCategoriesActivity) {
            super(1);
            this.f43107d = lifestyleOffersAllCategoriesActivity;
        }

        /* renamed from: a */
        public final void mo41864a(C31128a aVar) {
            C18846d dVar = null;
            if (aVar instanceof C31128a.C31130b) {
                C18846d L2 = this.f43107d.f43099F;
                if (L2 == null) {
                    C41536l.m120506z("binding");
                } else {
                    dVar = L2;
                }
                FrameLayout frameLayout = dVar.f52696i;
                C41536l.m120488h(frameLayout, "binding.progressBar");
                C32343x.m95447f1(frameLayout);
            } else if (aVar instanceof C31128a.C31131c) {
                C18846d L22 = this.f43107d.f43099F;
                if (L22 == null) {
                    C41536l.m120506z("binding");
                } else {
                    dVar = L22;
                }
                FrameLayout frameLayout2 = dVar.f52696i;
                C41536l.m120488h(frameLayout2, "binding.progressBar");
                C32343x.m95455i0(frameLayout2);
                LifestyleOffersFilterResultData M2 = this.f43107d.m54770U2();
                if (M2 != null) {
                    this.f43107d.m54772W2().mo41877lw(M2);
                }
            } else if (aVar instanceof C31128a.C31129a) {
                C18846d L23 = this.f43107d.f43099F;
                if (L23 == null) {
                    C41536l.m120506z("binding");
                    L23 = null;
                }
                CardView cardView = L23.f52699l;
                C41536l.m120488h(cardView, "binding.retryButtonContainer");
                C32343x.m95447f1(cardView);
                C18846d L24 = this.f43107d.f43099F;
                if (L24 == null) {
                    C41536l.m120506z("binding");
                } else {
                    dVar = L24;
                }
                FrameLayout frameLayout3 = dVar.f52696i;
                C41536l.m120488h(frameLayout3, "binding.progressBar");
                C32343x.m95455i0(frameLayout3);
                this.f43107d.mo74709H1(((C31128a.C31129a) aVar).mo71342c());
            }
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            mo41864a((C31128a) obj);
            return C41238w.f97225a;
        }
    }

    /* renamed from: ge.bog.mobilebank.lifestyleoffers.presentation.allcategories.LifestyleOffersAllCategoriesActivity$d */
    static final class C14939d extends C41537m implements C43075l {

        /* renamed from: d */
        final /* synthetic */ LifestyleOffersAllCategoriesActivity f43108d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C14939d(LifestyleOffersAllCategoriesActivity lifestyleOffersAllCategoriesActivity) {
            super(1);
            this.f43108d = lifestyleOffersAllCategoriesActivity;
        }

        /* access modifiers changed from: private */
        /* renamed from: c */
        public static final void m54789c(LifestyleOffersAllCategoriesActivity lifestyleOffersAllCategoriesActivity) {
            C41536l.m120489i(lifestyleOffersAllCategoriesActivity, "this$0");
            lifestyleOffersAllCategoriesActivity.f43103J.mo45259e();
            lifestyleOffersAllCategoriesActivity.f43103J.mo45261h();
        }

        /* renamed from: b */
        public final void mo41865b(List list) {
            this.f43108d.f43101H.mo6030j(list, new C14957a(this.f43108d));
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            mo41865b((List) obj);
            return C41238w.f97225a;
        }
    }

    /* renamed from: ge.bog.mobilebank.lifestyleoffers.presentation.allcategories.LifestyleOffersAllCategoriesActivity$e */
    static final class C14940e extends C41537m implements C43075l {

        /* renamed from: d */
        final /* synthetic */ LifestyleOffersAllCategoriesActivity f43109d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C14940e(LifestyleOffersAllCategoriesActivity lifestyleOffersAllCategoriesActivity) {
            super(1);
            this.f43109d = lifestyleOffersAllCategoriesActivity;
        }

        /* access modifiers changed from: private */
        /* renamed from: c */
        public static final void m54792c(LifestyleOffersAllCategoriesActivity lifestyleOffersAllCategoriesActivity) {
            C41536l.m120489i(lifestyleOffersAllCategoriesActivity, "this$0");
            lifestyleOffersAllCategoriesActivity.f43103J.mo45259e();
            lifestyleOffersAllCategoriesActivity.f43103J.mo45261h();
        }

        /* renamed from: b */
        public final void mo41866b(List list) {
            this.f43109d.f43102I.mo6030j(list, new C14958b(this.f43109d));
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            mo41866b((List) obj);
            return C41238w.f97225a;
        }
    }

    /* renamed from: ge.bog.mobilebank.lifestyleoffers.presentation.allcategories.LifestyleOffersAllCategoriesActivity$f */
    static final class C14941f extends C41537m implements C43075l {

        /* renamed from: d */
        final /* synthetic */ LifestyleOffersAllCategoriesActivity f43110d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C14941f(LifestyleOffersAllCategoriesActivity lifestyleOffersAllCategoriesActivity) {
            super(1);
            this.f43110d = lifestyleOffersAllCategoriesActivity;
        }

        /* renamed from: a */
        public final void mo41867a(Integer num) {
            LifestyleOffersAllCategoriesActivity lifestyleOffersAllCategoriesActivity = this.f43110d;
            C41536l.m120488h(num, "it");
            lifestyleOffersAllCategoriesActivity.m54781f3(num.intValue());
            this.f43110d.m54780e3(num.intValue());
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            mo41867a((Integer) obj);
            return C41238w.f97225a;
        }
    }

    /* renamed from: ge.bog.mobilebank.lifestyleoffers.presentation.allcategories.LifestyleOffersAllCategoriesActivity$g */
    static final class C14942g extends C41537m implements C43075l {

        /* renamed from: d */
        final /* synthetic */ LifestyleOffersAllCategoriesActivity f43111d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C14942g(LifestyleOffersAllCategoriesActivity lifestyleOffersAllCategoriesActivity) {
            super(1);
            this.f43111d = lifestyleOffersAllCategoriesActivity;
        }

        /* renamed from: a */
        public final void mo41868a(C37223a aVar) {
            Long l = (Long) aVar.mo90296a();
            if (l != null) {
                LifestyleOffersByCategoryActivity.C15033a.m55134b(LifestyleOffersByCategoryActivity.f43273L, this.f43111d, l.longValue(), false, 4, (Object) null);
            }
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            mo41868a((C37223a) obj);
            return C41238w.f97225a;
        }
    }

    /* renamed from: ge.bog.mobilebank.lifestyleoffers.presentation.allcategories.LifestyleOffersAllCategoriesActivity$h */
    static final class C14943h extends C41537m implements C43075l {

        /* renamed from: d */
        final /* synthetic */ LifestyleOffersAllCategoriesActivity f43112d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C14943h(LifestyleOffersAllCategoriesActivity lifestyleOffersAllCategoriesActivity) {
            super(1);
            this.f43112d = lifestyleOffersAllCategoriesActivity;
        }

        /* renamed from: a */
        public final void mo41869a(C37223a aVar) {
            Long l = (Long) aVar.mo90296a();
            if (l != null) {
                LifestyleOfferDetailedActivity.f43256J.mo41989a(this.f43112d, l.longValue());
            }
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            mo41869a((C37223a) obj);
            return C41238w.f97225a;
        }
    }

    /* renamed from: ge.bog.mobilebank.lifestyleoffers.presentation.allcategories.LifestyleOffersAllCategoriesActivity$i */
    static final class C14944i extends C41537m implements C43075l {

        /* renamed from: d */
        final /* synthetic */ LifestyleOffersAllCategoriesActivity f43113d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C14944i(LifestyleOffersAllCategoriesActivity lifestyleOffersAllCategoriesActivity) {
            super(1);
            this.f43113d = lifestyleOffersAllCategoriesActivity;
        }

        /* renamed from: a */
        public final void mo41870a(C37223a aVar) {
            C41224m mVar = (C41224m) aVar.mo90296a();
            if (mVar != null) {
                LifestyleOffersAllCategoriesActivity lifestyleOffersAllCategoriesActivity = this.f43113d;
                C38125h.m112238c(lifestyleOffersAllCategoriesActivity).mo91561L0(((Number) mVar.mo95675a()).longValue(), (String) mVar.mo95676b(), lifestyleOffersAllCategoriesActivity);
            }
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            mo41870a((C37223a) obj);
            return C41238w.f97225a;
        }
    }

    /* renamed from: ge.bog.mobilebank.lifestyleoffers.presentation.allcategories.LifestyleOffersAllCategoriesActivity$j */
    static final class C14945j extends C41537m implements C43075l {

        /* renamed from: d */
        final /* synthetic */ LifestyleOffersAllCategoriesActivity f43114d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C14945j(LifestyleOffersAllCategoriesActivity lifestyleOffersAllCategoriesActivity) {
            super(1);
            this.f43114d = lifestyleOffersAllCategoriesActivity;
        }

        /* renamed from: a */
        public final void mo41871a(C37223a aVar) {
            LifestyleOffersFilterResultData lifestyleOffersFilterResultData = (LifestyleOffersFilterResultData) aVar.mo90296a();
            if (lifestyleOffersFilterResultData != null) {
                LifestyleOffersAllCategoriesActivity lifestyleOffersAllCategoriesActivity = this.f43114d;
                lifestyleOffersAllCategoriesActivity.f43104K.mo404a(LifestyleOffersFilterActivity.f43290J.mo42010a(lifestyleOffersAllCategoriesActivity, lifestyleOffersFilterResultData));
            }
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            mo41871a((C37223a) obj);
            return C41238w.f97225a;
        }
    }

    /* renamed from: ge.bog.mobilebank.lifestyleoffers.presentation.allcategories.LifestyleOffersAllCategoriesActivity$k */
    static final class C14946k extends C41537m implements C43075l {

        /* renamed from: d */
        final /* synthetic */ LifestyleOffersAllCategoriesActivity f43115d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C14946k(LifestyleOffersAllCategoriesActivity lifestyleOffersAllCategoriesActivity) {
            super(1);
            this.f43115d = lifestyleOffersAllCategoriesActivity;
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((Boolean) obj);
            return C41238w.f97225a;
        }

        public final void invoke(Boolean bool) {
            C18846d L2 = this.f43115d.f43099F;
            if (L2 == null) {
                C41536l.m120506z("binding");
                L2 = null;
            }
            PageState pageState = L2.f52692e;
            C41536l.m120488h(pageState, "binding.emptyFilteredDataLayout");
            C41536l.m120488h(bool, "showEmptyLayout");
            pageState.setVisibility(bool.booleanValue() ? 0 : 8);
        }
    }

    /* renamed from: ge.bog.mobilebank.lifestyleoffers.presentation.allcategories.LifestyleOffersAllCategoriesActivity$l */
    /* synthetic */ class C14947l extends C41535k implements C43064a {
        C14947l(Object obj) {
            super(0, obj, LifestyleOffersAllCategoriesActivity.class, "getVisibleOffers", "getVisibleOffers()Ljava/util/Map;", 0);
        }

        /* renamed from: b */
        public final Map invoke() {
            return ((LifestyleOffersAllCategoriesActivity) this.receiver).m54773X2();
        }
    }

    /* renamed from: ge.bog.mobilebank.lifestyleoffers.presentation.allcategories.LifestyleOffersAllCategoriesActivity$m */
    public static final class C14948m implements View.OnLayoutChangeListener {

        /* renamed from: d */
        final /* synthetic */ LifestyleOffersAllCategoriesActivity f43116d;

        public C14948m(LifestyleOffersAllCategoriesActivity lifestyleOffersAllCategoriesActivity) {
            this.f43116d = lifestyleOffersAllCategoriesActivity;
        }

        public void onLayoutChange(View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
            C41536l.m120489i(view, "view");
            view.removeOnLayoutChangeListener(this);
            int measuredHeight = view.getMeasuredHeight();
            C18846d L2 = this.f43116d.f43099F;
            if (L2 == null) {
                C41536l.m120506z("binding");
                L2 = null;
            }
            L2.f52697j.setPadding(0, measuredHeight, 0, 0);
        }
    }

    /* renamed from: ge.bog.mobilebank.lifestyleoffers.presentation.allcategories.LifestyleOffersAllCategoriesActivity$n */
    static final class C14949n implements C1645y, C41532h {

        /* renamed from: a */
        private final /* synthetic */ C43075l f43117a;

        C14949n(C43075l lVar) {
            C41536l.m120489i(lVar, "function");
            this.f43117a = lVar;
        }

        public final boolean equals(Object obj) {
            if (!(obj instanceof C1645y) || !(obj instanceof C41532h)) {
                return false;
            }
            return C41536l.m120484d(getFunctionDelegate(), ((C41532h) obj).getFunctionDelegate());
        }

        public final C41212c getFunctionDelegate() {
            return this.f43117a;
        }

        public final int hashCode() {
            return getFunctionDelegate().hashCode();
        }

        public final /* synthetic */ void onChanged(Object obj) {
            this.f43117a.invoke(obj);
        }
    }

    /* renamed from: ge.bog.mobilebank.lifestyleoffers.presentation.allcategories.LifestyleOffersAllCategoriesActivity$o */
    public static final class C14950o extends C41537m implements C43064a {

        /* renamed from: d */
        final /* synthetic */ ComponentActivity f43118d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C14950o(ComponentActivity componentActivity) {
            super(0);
            this.f43118d = componentActivity;
        }

        public final C1620q0.C1624b invoke() {
            C1620q0.C1624b defaultViewModelProviderFactory = this.f43118d.getDefaultViewModelProviderFactory();
            C41536l.m120488h(defaultViewModelProviderFactory, "defaultViewModelProviderFactory");
            return defaultViewModelProviderFactory;
        }
    }

    /* renamed from: ge.bog.mobilebank.lifestyleoffers.presentation.allcategories.LifestyleOffersAllCategoriesActivity$p */
    public static final class C14951p extends C41537m implements C43064a {

        /* renamed from: d */
        final /* synthetic */ ComponentActivity f43119d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C14951p(ComponentActivity componentActivity) {
            super(0);
            this.f43119d = componentActivity;
        }

        public final C1636t0 invoke() {
            C1636t0 viewModelStore = this.f43119d.getViewModelStore();
            C41536l.m120488h(viewModelStore, "viewModelStore");
            return viewModelStore;
        }
    }

    /* renamed from: ge.bog.mobilebank.lifestyleoffers.presentation.allcategories.LifestyleOffersAllCategoriesActivity$q */
    public static final class C14952q extends C41537m implements C43064a {

        /* renamed from: d */
        final /* synthetic */ C43064a f43120d;

        /* renamed from: e */
        final /* synthetic */ ComponentActivity f43121e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C14952q(C43064a aVar, ComponentActivity componentActivity) {
            super(0);
            this.f43120d = aVar;
            this.f43121e = componentActivity;
        }

        public final C7047a invoke() {
            C7047a aVar;
            C43064a aVar2 = this.f43120d;
            if (aVar2 != null && (aVar = (C7047a) aVar2.invoke()) != null) {
                return aVar;
            }
            C7047a defaultViewModelCreationExtras = this.f43121e.getDefaultViewModelCreationExtras();
            C41536l.m120488h(defaultViewModelCreationExtras, "this.defaultViewModelCreationExtras");
            return defaultViewModelCreationExtras;
        }
    }

    public LifestyleOffersAllCategoriesActivity() {
        C0173b registerForActivityResult = registerForActivityResult(new C2106d(), new C12390a(this));
        C41536l.m120488h(registerForActivityResult, "registerForActivityResul…              }\n        }");
        this.f43104K = registerForActivityResult;
        this.f43105L = C41219i.m119470b(new C14937b(this));
    }

    /* access modifiers changed from: private */
    /* renamed from: U2 */
    public final LifestyleOffersFilterResultData m54770U2() {
        return (LifestyleOffersFilterResultData) this.f43105L.getValue();
    }

    /* access modifiers changed from: private */
    /* renamed from: V2 */
    public static final void m54771V2(LifestyleOffersAllCategoriesActivity lifestyleOffersAllCategoriesActivity, ActivityResult activityResult) {
        Intent a;
        LifestyleOffersFilterResultData lifestyleOffersFilterResultData;
        C41536l.m120489i(lifestyleOffersAllCategoriesActivity, "this$0");
        if (activityResult != null && (a = activityResult.mo370a()) != null && (lifestyleOffersFilterResultData = (LifestyleOffersFilterResultData) a.getParcelableExtra("EXTRA_FILTER_DATA")) != null) {
            lifestyleOffersAllCategoriesActivity.m54772W2().mo41877lw(lifestyleOffersFilterResultData);
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: W2 */
    public final LifestyleOffersAllCategoriesViewModel$ViewModel m54772W2() {
        return (LifestyleOffersAllCategoriesViewModel$ViewModel) this.f43100G.getValue();
    }

    /* access modifiers changed from: private */
    /* renamed from: X2 */
    public final Map m54773X2() {
        boolean z;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        C18846d dVar = this.f43099F;
        if (dVar == null) {
            C41536l.m120506z("binding");
            dVar = null;
        }
        if (dVar.f52697j.getScrollState() != 0) {
            z = true;
        } else {
            z = false;
        }
        if ((this.f43101H.getItemCount() == 0 && this.f43102I.getItemCount() == 0) || z) {
            return linkedHashMap;
        }
        C18846d dVar2 = this.f43099F;
        if (dVar2 == null) {
            C41536l.m120506z("binding");
            dVar2 = null;
        }
        RecyclerView.C1747p layoutManager = dVar2.f52697j.getLayoutManager();
        C41536l.m120487g(layoutManager, "null cannot be cast to non-null type ge.bog.mobilebank.lifestyleoffers.presentation.shared.VisibilityPercentageLayoutManager");
        VisibilityPercentageLayoutManager visibilityPercentageLayoutManager = (VisibilityPercentageLayoutManager) layoutManager;
        int j2 = visibilityPercentageLayoutManager.mo5215j2();
        int o2 = visibilityPercentageLayoutManager.mo5221o2();
        if (j2 <= o2) {
            while (true) {
                C18846d dVar3 = this.f43099F;
                if (dVar3 == null) {
                    C41536l.m120506z("binding");
                    dVar3 = null;
                }
                if (dVar3.f52697j.getAdapter() instanceof C12405p) {
                    C18846d dVar4 = this.f43099F;
                    if (dVar4 == null) {
                        C41536l.m120506z("binding");
                        dVar4 = null;
                    }
                    RecyclerView.C1734f0 e0 = dVar4.f52697j.mo5320e0(j2);
                    C41536l.m120487g(e0, "null cannot be cast to non-null type ge.bog.mobilebank.lifestyleoffers.presentation.shared.OffersViewHolder");
                    linkedHashMap.putAll(((C17708g) e0).mo45274m("allOffers"));
                } else if (this.f43102I.mo6026f().get(j2) instanceof C16516a.C16518b) {
                    Object obj = this.f43102I.mo6026f().get(j2);
                    C41536l.m120487g(obj, "null cannot be cast to non-null type ge.bog.mobilebank.lifestyleoffers.presentation.offer.model.LifestyleOfferCategoryListItem.Offer");
                    C18273e b = ((C16516a.C16518b) obj).mo43663b();
                    Long valueOf = Long.valueOf(b.mo45962k());
                    C17703e.C17705b bVar = r8;
                    C17703e.C17705b bVar2 = new C17703e.C17705b("filter", b.mo45962k(), b.mo45954e(), (String) null, m54772W2().mo41881pw(), 8, (DefaultConstructorMarker) null);
                    linkedHashMap.put(valueOf, bVar);
                }
                if (j2 == o2) {
                    break;
                }
                j2++;
            }
        }
        return linkedHashMap;
    }

    /* renamed from: Y2 */
    private final void m54774Y2() {
        m54772W2().mo41888ww().mo33002ik().mo4819k(this, new C14949n(new C14938c(this)));
        m54772W2().mo41888ww().mo32999Lv().mo4819k(this, new C14949n(new C14939d(this)));
        m54772W2().mo41888ww().mo33004q8().mo4819k(this, new C14949n(new C14940e(this)));
        m54772W2().mo41880ow().mo4819k(this, new C14949n(new C14941f(this)));
        m54772W2().mo41888ww().mo33003q6().mo4819k(this, new C14949n(new C14942g(this)));
        m54772W2().mo41888ww().mo32998I1().mo4819k(this, new C14949n(new C14943h(this)));
        m54772W2().mo41888ww().mo33001i2().mo4819k(this, new C14949n(new C14944i(this)));
        m54772W2().mo41888ww().mo32997D4().mo4819k(this, new C14949n(new C14945j(this)));
        m54772W2().mo41888ww().mo33000Rr().mo4819k(this, new C14949n(new C14946k(this)));
    }

    /* access modifiers changed from: private */
    /* renamed from: Z2 */
    public static final void m54775Z2(LifestyleOffersAllCategoriesActivity lifestyleOffersAllCategoriesActivity, View view) {
        C41536l.m120489i(lifestyleOffersAllCategoriesActivity, "this$0");
        C18846d dVar = lifestyleOffersAllCategoriesActivity.f43099F;
        if (dVar == null) {
            C41536l.m120506z("binding");
            dVar = null;
        }
        CardView cardView = dVar.f52699l;
        C41536l.m120488h(cardView, "binding.retryButtonContainer");
        C32343x.m95455i0(cardView);
        lifestyleOffersAllCategoriesActivity.m54772W2().onRefresh(6);
    }

    /* access modifiers changed from: private */
    /* renamed from: a3 */
    public static final void m54776a3(LifestyleOffersAllCategoriesActivity lifestyleOffersAllCategoriesActivity, View view) {
        C41536l.m120489i(lifestyleOffersAllCategoriesActivity, "this$0");
        lifestyleOffersAllCategoriesActivity.m54772W2().mo41883rw().mo32995G();
        C32343x.m95393H0(lifestyleOffersAllCategoriesActivity, "life_style_offers", "FILTER_CATEGORIES", "open_offer_filter", C10464h.C10465a.FIREBASE, (Bundle) null, 16, (Object) null);
    }

    /* access modifiers changed from: private */
    /* renamed from: b3 */
    public static final void m54777b3(LifestyleOffersAllCategoriesActivity lifestyleOffersAllCategoriesActivity, long j, String str, boolean z) {
        C41536l.m120489i(lifestyleOffersAllCategoriesActivity, "this$0");
        lifestyleOffersAllCategoriesActivity.m54772W2().mo41883rw().mo32996nh(j, str, z);
    }

    /* access modifiers changed from: private */
    /* renamed from: c3 */
    public static final void m54778c3(LifestyleOffersAllCategoriesActivity lifestyleOffersAllCategoriesActivity, Long l, Integer num) {
        C41536l.m120489i(lifestyleOffersAllCategoriesActivity, "this$0");
        lifestyleOffersAllCategoriesActivity.m54772W2().mo41883rw().mo32994Db(l);
    }

    /* access modifiers changed from: private */
    /* renamed from: d3 */
    public static final void m54779d3(LifestyleOffersAllCategoriesActivity lifestyleOffersAllCategoriesActivity, long j, String str, boolean z) {
        C41536l.m120489i(lifestyleOffersAllCategoriesActivity, "this$0");
        lifestyleOffersAllCategoriesActivity.m54772W2().mo41883rw().mo32996nh(j, str, z);
    }

    /* access modifiers changed from: private */
    /* renamed from: e3 */
    public final void m54780e3(int i) {
        RecyclerView.C1736h hVar;
        C18846d dVar = this.f43099F;
        if (dVar == null) {
            C41536l.m120506z("binding");
            dVar = null;
        }
        RecyclerView recyclerView = dVar.f52697j;
        if (i > 0) {
            hVar = this.f43102I;
        } else {
            hVar = this.f43101H;
        }
        recyclerView.setAdapter(hVar);
    }

    /* access modifiers changed from: private */
    /* renamed from: f3 */
    public final void m54781f3(int i) {
        C18846d dVar = this.f43099F;
        if (dVar == null) {
            C41536l.m120506z("binding");
            dVar = null;
        }
        Button button = dVar.f52693f;
        if (i > 0) {
            button.setButtonBadgeCount(Integer.valueOf(i));
            button.setActivated(true);
            return;
        }
        button.setButtonBadgeCount((Integer) null);
        button.setActivated(false);
    }

    /* access modifiers changed from: protected */
    /* renamed from: O1 */
    public void mo37451O1(Bundle bundle) {
        C18846d d = C18846d.m63750d(getLayoutInflater());
        C41536l.m120488h(d, "inflate(layoutInflater)");
        this.f43099F = d;
        C18846d dVar = null;
        if (d == null) {
            C41536l.m120506z("binding");
            d = null;
        }
        setContentView((View) d.mo3946b());
        super.mo37451O1(bundle);
        m54774Y2();
        C18846d dVar2 = this.f43099F;
        if (dVar2 == null) {
            C41536l.m120506z("binding");
            dVar2 = null;
        }
        dVar2.f52695h.setText(C32343x.m95388F("life.style.offers.all.offers.page.filter.info", new Object[0]));
        C18846d dVar3 = this.f43099F;
        if (dVar3 == null) {
            C41536l.m120506z("binding");
            dVar3 = null;
        }
        dVar3.f52693f.setButtonText(C32343x.m95388F("life.style.offers.all.offers.page.filter.button.label", new Object[0]));
        C18846d dVar4 = this.f43099F;
        if (dVar4 == null) {
            C41536l.m120506z("binding");
            dVar4 = null;
        }
        dVar4.f52692e.setTitleText(C32343x.m95388F("life.style.offer.filter.no.offers.found", new Object[0]));
        C18846d dVar5 = this.f43099F;
        if (dVar5 == null) {
            C41536l.m120506z("binding");
            dVar5 = null;
        }
        dVar5.f52698k.mo3946b().setOnClickListener(new C12391b(this));
        C18846d dVar6 = this.f43099F;
        if (dVar6 == null) {
            C41536l.m120506z("binding");
            dVar6 = null;
        }
        dVar6.f52693f.setOnClickListener(new C12392c(this));
        C18846d dVar7 = this.f43099F;
        if (dVar7 == null) {
            C41536l.m120506z("binding");
            dVar7 = null;
        }
        RecyclerView recyclerView = dVar7.f52697j;
        recyclerView.setLayoutManager(new VisibilityPercentageLayoutManager(recyclerView.getContext()));
        int dimensionPixelSize = recyclerView.getResources().getDimensionPixelSize(C17899c.f50936a);
        recyclerView.setHasFixedSize(true);
        recyclerView.mo5351j(new C37621w(dimensionPixelSize, 0, 1, 2, (DefaultConstructorMarker) null));
        C41536l.m120488h(recyclerView, "onCreateSafe$lambda$4");
        C37602i.m110577a(recyclerView);
        C12405p pVar = this.f43101H;
        pVar.mo33010u(new C12393d(this));
        pVar.mo33009t(new C12394e(this));
        this.f43102I.mo43285l(new C12395f(this));
        C18846d dVar8 = this.f43099F;
        if (dVar8 == null) {
            C41536l.m120506z("binding");
            dVar8 = null;
        }
        LayerView layerView = dVar8.f52702o;
        C41536l.m120488h(layerView, "binding.toolbarContainer");
        if (!ViewCompat.m3579V(layerView) || layerView.isLayoutRequested()) {
            layerView.addOnLayoutChangeListener(new C14948m(this));
        } else {
            int measuredHeight = layerView.getMeasuredHeight();
            C18846d L2 = this.f43099F;
            if (L2 == null) {
                C41536l.m120506z("binding");
            } else {
                dVar = L2;
            }
            dVar.f52697j.setPadding(0, measuredHeight, 0, 0);
        }
        C32343x.m95393H0(this, "life_style_offers", "LIFESTYLE_OFFERS_ALL_CATEGORIES_PAGE", "OPEN_LIFESTYLE_OFFERS_ALL_CATEGORIES", C10464h.C10465a.FACEBOOKANDFIREBASE, (Bundle) null, 16, (Object) null);
    }

    /* access modifiers changed from: protected */
    public void onDestroy() {
        super.onDestroy();
        this.f43103J.mo45259e();
    }

    /* renamed from: z1 */
    public String mo38120z1() {
        return C32343x.m95388F("life.style.offers.all.offers.page.header", new Object[0]);
    }
}
