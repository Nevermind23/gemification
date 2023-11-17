package p341ge.bog.mobilebank.lifestyleoffers.presentation.progress.progresslist;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.LinearLayout;
import androidx.activity.ComponentActivity;
import androidx.cardview.widget.CardView;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.lifecycle.C1593j;
import androidx.lifecycle.C1617p0;
import androidx.lifecycle.C1620q0;
import androidx.lifecycle.C1636t0;
import androidx.lifecycle.C1645y;
import androidx.viewpager2.adapter.FragmentStateAdapter;
import androidx.viewpager2.widget.ViewPager2;
import b41.C31128a;
import com.google.android.material.tabs.C5161d;
import com.google.android.material.tabs.TabLayout;
import g91.C32343x;
import he1.C41212c;
import he1.C41217g;
import he1.C41238w;
import java.util.List;
import ko0.C16521c;
import kotlin.jvm.internal.C41520a0;
import kotlin.jvm.internal.C41532h;
import kotlin.jvm.internal.C41536l;
import kotlin.jvm.internal.C41537m;
import kotlin.jvm.internal.DefaultConstructorMarker;
import m41.C37224b;
import o31.C37588a0;
import p163m0.C7047a;
import p341ge.bog.designsystem.components.tabgroup.TabsGroupView;
import p341ge.bog.mobilebank.lifestyleoffers.presentation.progress.progresslist.C15087d;
import po0.C17458c;
import po0.C17461f;
import po0.C17469n;
import ue1.C43064a;
import ue1.C43075l;
import xn0.C18849g;

/* renamed from: ge.bog.mobilebank.lifestyleoffers.presentation.progress.progresslist.LifestyleOffersProgressActivity */
public final class LifestyleOffersProgressActivity extends C15082a {

    /* renamed from: K */
    public static final C15063b f43312K = new C15063b((DefaultConstructorMarker) null);
    /* access modifiers changed from: private */

    /* renamed from: G */
    public C18849g f43313G;

    /* renamed from: H */
    private final C41217g f43314H = C41219i.m119470b(new C15064c(this));

    /* renamed from: I */
    public C15087d.C15089b f43315I;

    /* renamed from: J */
    private final C41217g f43316J = new C1617p0(C41520a0.m120436b(C15087d.class), new C15069h(this), new C15071j(this), new C15070i((C43064a) null, this));

    /* renamed from: ge.bog.mobilebank.lifestyleoffers.presentation.progress.progresslist.LifestyleOffersProgressActivity$a */
    private static final class C15062a extends FragmentStateAdapter {

        /* renamed from: l */
        private final List f43317l;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C15062a(List list, FragmentManager fragmentManager, C1593j jVar) {
            super(fragmentManager, jVar);
            C41536l.m120489i(list, "categoryOrders");
            C41536l.m120489i(fragmentManager, "parent");
            C41536l.m120489i(jVar, "viewLifecycle");
            this.f43317l = list;
        }

        public int getItemCount() {
            return this.f43317l.size();
        }

        /* renamed from: h */
        public Fragment mo6571h(int i) {
            return C15108l.f43383j.mo42063a((List) this.f43317l.get(i));
        }
    }

    /* renamed from: ge.bog.mobilebank.lifestyleoffers.presentation.progress.progresslist.LifestyleOffersProgressActivity$b */
    public static final class C15063b {
        private C15063b() {
        }

        public /* synthetic */ C15063b(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* renamed from: b */
        public static /* synthetic */ void m55194b(C15063b bVar, Context context, C16521c cVar, int i, Object obj) {
            if ((i & 2) != 0) {
                cVar = null;
            }
            bVar.mo42030a(context, cVar);
        }

        /* renamed from: a */
        public final void mo42030a(Context context, C16521c cVar) {
            C41536l.m120489i(context, "context");
            context.startActivity(new Intent(context, LifestyleOffersProgressActivity.class).putExtra("BENEFIT_TYPE", cVar));
        }
    }

    /* renamed from: ge.bog.mobilebank.lifestyleoffers.presentation.progress.progresslist.LifestyleOffersProgressActivity$c */
    static final class C15064c extends C41537m implements C43064a {

        /* renamed from: d */
        final /* synthetic */ LifestyleOffersProgressActivity f43318d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C15064c(LifestyleOffersProgressActivity lifestyleOffersProgressActivity) {
            super(0);
            this.f43318d = lifestyleOffersProgressActivity;
        }

        /* renamed from: b */
        public final C16521c invoke() {
            Intent intent = this.f43318d.getIntent();
            Object serializableExtra = intent != null ? intent.getSerializableExtra("BENEFIT_TYPE") : null;
            if (serializableExtra instanceof C16521c) {
                return (C16521c) serializableExtra;
            }
            return null;
        }
    }

    /* renamed from: ge.bog.mobilebank.lifestyleoffers.presentation.progress.progresslist.LifestyleOffersProgressActivity$d */
    static final class C15065d extends C41537m implements C43075l {

        /* renamed from: d */
        final /* synthetic */ LifestyleOffersProgressActivity f43319d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C15065d(LifestyleOffersProgressActivity lifestyleOffersProgressActivity) {
            super(1);
            this.f43319d = lifestyleOffersProgressActivity;
        }

        /* renamed from: a */
        public final void mo42032a(C31128a aVar) {
            int i;
            C18849g F2 = this.f43319d.f43313G;
            C18849g gVar = null;
            if (F2 == null) {
                C41536l.m120506z("binding");
                F2 = null;
            }
            LinearLayout linearLayout = F2.f52731h;
            C41536l.m120488h(linearLayout, "binding.loader");
            int i2 = 0;
            if (aVar instanceof C31128a.C31130b) {
                i = 0;
            } else {
                i = 8;
            }
            linearLayout.setVisibility(i);
            C18849g F22 = this.f43319d.f43313G;
            if (F22 == null) {
                C41536l.m120506z("binding");
            } else {
                gVar = F22;
            }
            CardView cardView = gVar.f52734k;
            C41536l.m120488h(cardView, "binding.retryButtonContainer");
            if (!(aVar instanceof C31128a.C31129a)) {
                i2 = 8;
            }
            cardView.setVisibility(i2);
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            mo42032a((C31128a) obj);
            return C41238w.f97225a;
        }
    }

    /* renamed from: ge.bog.mobilebank.lifestyleoffers.presentation.progress.progresslist.LifestyleOffersProgressActivity$e */
    static final class C15066e extends C41537m implements C43075l {

        /* renamed from: d */
        final /* synthetic */ LifestyleOffersProgressActivity f43320d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C15066e(LifestyleOffersProgressActivity lifestyleOffersProgressActivity) {
            super(1);
            this.f43320d = lifestyleOffersProgressActivity;
        }

        /* access modifiers changed from: private */
        /* renamed from: c */
        public static final void m55199c(C17469n nVar, TabLayout.C5153g gVar, int i) {
            C41536l.m120489i(gVar, "tab");
            gVar.mo16972u((CharSequence) nVar.mo44970a().mo44964b().get(i));
        }

        /* renamed from: b */
        public final void mo42033b(C17469n nVar) {
            C18849g F2 = this.f43320d.f43313G;
            C18849g gVar = null;
            if (F2 == null) {
                C41536l.m120506z("binding");
                F2 = null;
            }
            ViewPager2 viewPager2 = F2.f52737n;
            List b = nVar.mo44971b();
            FragmentManager supportFragmentManager = this.f43320d.getSupportFragmentManager();
            C41536l.m120488h(supportFragmentManager, "supportFragmentManager");
            C1593j lifecycle = this.f43320d.getLifecycle();
            C41536l.m120488h(lifecycle, "lifecycle");
            viewPager2.setAdapter(new C15062a(b, supportFragmentManager, lifecycle));
            C18849g F22 = this.f43320d.f43313G;
            if (F22 == null) {
                C41536l.m120506z("binding");
                F22 = null;
            }
            TabsGroupView tabsGroupView = F22.f52729f;
            C18849g F23 = this.f43320d.f43313G;
            if (F23 == null) {
                C41536l.m120506z("binding");
                F23 = null;
            }
            new C5161d(tabsGroupView, F23.f52737n, new C15098g(nVar)).mo16990a();
            Integer a = nVar.mo44970a().mo44963a();
            if (a != null) {
                LifestyleOffersProgressActivity lifestyleOffersProgressActivity = this.f43320d;
                int intValue = a.intValue();
                C18849g F24 = lifestyleOffersProgressActivity.f43313G;
                if (F24 == null) {
                    C41536l.m120506z("binding");
                } else {
                    gVar = F24;
                }
                gVar.f52737n.setCurrentItem(intValue);
            }
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            mo42033b((C17469n) obj);
            return C41238w.f97225a;
        }
    }

    /* renamed from: ge.bog.mobilebank.lifestyleoffers.presentation.progress.progresslist.LifestyleOffersProgressActivity$f */
    static final class C15067f extends C41537m implements C43075l {

        /* renamed from: d */
        final /* synthetic */ LifestyleOffersProgressActivity f43321d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C15067f(LifestyleOffersProgressActivity lifestyleOffersProgressActivity) {
            super(1);
            this.f43321d = lifestyleOffersProgressActivity;
        }

        /* renamed from: a */
        public final void mo42034a(int i) {
            OffersProgressDetailActivity.f43328K.mo42039a(this.f43321d, i);
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            mo42034a(((Number) obj).intValue());
            return C41238w.f97225a;
        }
    }

    /* renamed from: ge.bog.mobilebank.lifestyleoffers.presentation.progress.progresslist.LifestyleOffersProgressActivity$g */
    static final class C15068g implements C1645y, C41532h {

        /* renamed from: a */
        private final /* synthetic */ C43075l f43322a;

        C15068g(C43075l lVar) {
            C41536l.m120489i(lVar, "function");
            this.f43322a = lVar;
        }

        public final boolean equals(Object obj) {
            if (!(obj instanceof C1645y) || !(obj instanceof C41532h)) {
                return false;
            }
            return C41536l.m120484d(getFunctionDelegate(), ((C41532h) obj).getFunctionDelegate());
        }

        public final C41212c getFunctionDelegate() {
            return this.f43322a;
        }

        public final int hashCode() {
            return getFunctionDelegate().hashCode();
        }

        public final /* synthetic */ void onChanged(Object obj) {
            this.f43322a.invoke(obj);
        }
    }

    /* renamed from: ge.bog.mobilebank.lifestyleoffers.presentation.progress.progresslist.LifestyleOffersProgressActivity$h */
    public static final class C15069h extends C41537m implements C43064a {

        /* renamed from: d */
        final /* synthetic */ ComponentActivity f43323d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C15069h(ComponentActivity componentActivity) {
            super(0);
            this.f43323d = componentActivity;
        }

        public final C1636t0 invoke() {
            C1636t0 viewModelStore = this.f43323d.getViewModelStore();
            C41536l.m120488h(viewModelStore, "viewModelStore");
            return viewModelStore;
        }
    }

    /* renamed from: ge.bog.mobilebank.lifestyleoffers.presentation.progress.progresslist.LifestyleOffersProgressActivity$i */
    public static final class C15070i extends C41537m implements C43064a {

        /* renamed from: d */
        final /* synthetic */ C43064a f43324d;

        /* renamed from: e */
        final /* synthetic */ ComponentActivity f43325e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C15070i(C43064a aVar, ComponentActivity componentActivity) {
            super(0);
            this.f43324d = aVar;
            this.f43325e = componentActivity;
        }

        public final C7047a invoke() {
            C7047a aVar;
            C43064a aVar2 = this.f43324d;
            if (aVar2 != null && (aVar = (C7047a) aVar2.invoke()) != null) {
                return aVar;
            }
            C7047a defaultViewModelCreationExtras = this.f43325e.getDefaultViewModelCreationExtras();
            C41536l.m120488h(defaultViewModelCreationExtras, "this.defaultViewModelCreationExtras");
            return defaultViewModelCreationExtras;
        }
    }

    /* renamed from: ge.bog.mobilebank.lifestyleoffers.presentation.progress.progresslist.LifestyleOffersProgressActivity$j */
    static final class C15071j extends C41537m implements C43064a {

        /* renamed from: d */
        final /* synthetic */ LifestyleOffersProgressActivity f43326d;

        /* renamed from: ge.bog.mobilebank.lifestyleoffers.presentation.progress.progresslist.LifestyleOffersProgressActivity$j$a */
        static final class C15072a extends C41537m implements C43064a {

            /* renamed from: d */
            final /* synthetic */ LifestyleOffersProgressActivity f43327d;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            C15072a(LifestyleOffersProgressActivity lifestyleOffersProgressActivity) {
                super(0);
                this.f43327d = lifestyleOffersProgressActivity;
            }

            /* renamed from: b */
            public final C15087d invoke() {
                return this.f43327d.mo42029I2().mo32569a(this.f43327d.m55185H2());
            }
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C15071j(LifestyleOffersProgressActivity lifestyleOffersProgressActivity) {
            super(0);
            this.f43326d = lifestyleOffersProgressActivity;
        }

        public final C1620q0.C1624b invoke() {
            return C37588a0.f90326a.mo90779a(new C15072a(this.f43326d));
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: H2 */
    public final C16521c m55185H2() {
        return (C16521c) this.f43314H.getValue();
    }

    /* renamed from: J2 */
    private final C15087d m55186J2() {
        return (C15087d) this.f43316J.getValue();
    }

    /* renamed from: K2 */
    private final void m55187K2() {
        C17458c mw = m55186J2().mo42046mw();
        mw.mo42047t2().mo4819k(this, new C15068g(new C15065d(this)));
        mw.mo42049x().mo4819k(this, new C15068g(new C15066e(this)));
        C37224b.m109963b(m55186J2().mo42046mw().mo42048th(), this, new C15067f(this));
    }

    /* renamed from: L2 */
    private final void m55188L2() {
        C18849g gVar = this.f43313G;
        C18849g gVar2 = null;
        if (gVar == null) {
            C41536l.m120506z("binding");
            gVar = null;
        }
        gVar.f52732i.setTitle(C32343x.m95388F("life.style.campaign.list.current.campaigns.header", new Object[0]));
        C18849g gVar3 = this.f43313G;
        if (gVar3 == null) {
            C41536l.m120506z("binding");
        } else {
            gVar2 = gVar3;
        }
        gVar2.f52733j.mo3946b().setOnClickListener(new C17461f(this));
    }

    /* access modifiers changed from: private */
    /* renamed from: M2 */
    public static final void m55189M2(LifestyleOffersProgressActivity lifestyleOffersProgressActivity, View view) {
        C41536l.m120489i(lifestyleOffersProgressActivity, "this$0");
        lifestyleOffersProgressActivity.m55186J2().onRefresh(6);
    }

    /* renamed from: I2 */
    public final C15087d.C15089b mo42029I2() {
        C15087d.C15089b bVar = this.f43315I;
        if (bVar != null) {
            return bVar;
        }
        C41536l.m120506z("factory");
        return null;
    }

    /* access modifiers changed from: protected */
    /* renamed from: O1 */
    public void mo37451O1(Bundle bundle) {
        C18849g d = C18849g.m63765d(getLayoutInflater());
        C41536l.m120488h(d, "inflate(layoutInflater)");
        this.f43313G = d;
        if (d == null) {
            C41536l.m120506z("binding");
            d = null;
        }
        setContentView((View) d.mo3946b());
        super.mo37451O1(bundle);
        m55187K2();
        m55188L2();
    }

    /* renamed from: z1 */
    public String mo38120z1() {
        return C32343x.m95388F("life.style.campaign.list.main.header", new Object[0]);
    }
}
