package p341ge.bog.mobilebank.bnpl.presentation.categories;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import androidx.activity.ComponentActivity;
import androidx.lifecycle.C1617p0;
import androidx.lifecycle.C1620q0;
import androidx.lifecycle.C1636t0;
import androidx.lifecycle.C1645y;
import androidx.recyclerview.widget.RecyclerView;
import b41.C31128a;
import com.google.android.material.tabs.TabLayout;
import g91.C32300e0;
import g91.C32343x;
import he1.C41212c;
import he1.C41217g;
import he1.C41238w;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.C41520a0;
import kotlin.jvm.internal.C41532h;
import kotlin.jvm.internal.C41536l;
import kotlin.jvm.internal.C41537m;
import kotlin.jvm.internal.C41550z;
import kotlin.jvm.internal.DefaultConstructorMarker;
import o31.C37616s;
import p163m0.C7047a;
import p341ge.bog.designsystem.components.tabs.TabsView;
import p341ge.bog.mobilebank.bnpl.presentation.model.BnplCategoryUiModel;
import p341ge.bog.mobilebank.bnpl.presentation.offers.details.BnplOfferDetailsActivity;
import p480jl.C16211b;
import p536nl.C17052e;
import p646vl.C18411a;
import ue1.C43064a;
import ue1.C43075l;

/* renamed from: ge.bog.mobilebank.bnpl.presentation.categories.BnplCategoriesActivity */
public final class BnplCategoriesActivity extends C13792d {

    /* renamed from: L */
    public static final C13774a f41021L = new C13774a((DefaultConstructorMarker) null);

    /* renamed from: G */
    private final C41217g f41022G = C41219i.m119470b(new C13778e(this));

    /* renamed from: H */
    private final C41217g f41023H = C41219i.m119470b(new C13775b(this));

    /* renamed from: I */
    private final C41217g f41024I = new C1617p0(C41520a0.m120436b(BnplCategoriesViewModel$ViewModel.class), new C13782i(this), new C13781h(this), new C13783j((C43064a) null, this));

    /* renamed from: J */
    private final C41217g f41025J = C41219i.m119470b(new C13784k(this));

    /* renamed from: K */
    private final C41217g f41026K = C41219i.m119470b(new C13777d(this));

    /* renamed from: ge.bog.mobilebank.bnpl.presentation.categories.BnplCategoriesActivity$a */
    public static final class C13774a {
        private C13774a() {
        }

        public /* synthetic */ C13774a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* renamed from: a */
        public final void mo38146a(Context context, long j, List list) {
            C41536l.m120489i(context, "context");
            C41536l.m120489i(list, "categories");
            context.startActivity(new Intent(context, BnplCategoriesActivity.class).putExtra("CATEGORY_ID_ARG", j).putExtra("CATEGORIES_ARG", new ArrayList(list)));
        }
    }

    /* renamed from: ge.bog.mobilebank.bnpl.presentation.categories.BnplCategoriesActivity$b */
    static final class C13775b extends C41537m implements C43064a {

        /* renamed from: d */
        final /* synthetic */ BnplCategoriesActivity f41027d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C13775b(BnplCategoriesActivity bnplCategoriesActivity) {
            super(0);
            this.f41027d = bnplCategoriesActivity;
        }

        /* access modifiers changed from: private */
        /* renamed from: c */
        public static final void m51450c(BnplCategoriesActivity bnplCategoriesActivity, long j, String str) {
            C41536l.m120489i(bnplCategoriesActivity, "this$0");
            BnplOfferDetailsActivity.f41206K.mo38294a(j, str, bnplCategoriesActivity);
        }

        /* renamed from: b */
        public final C13788b invoke() {
            return new C13788b(new C13787a(this.f41027d));
        }
    }

    /* renamed from: ge.bog.mobilebank.bnpl.presentation.categories.BnplCategoriesActivity$c */
    static final class C13776c extends C41537m implements C43075l {

        /* renamed from: d */
        final /* synthetic */ BnplCategoriesActivity f41028d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C13776c(BnplCategoriesActivity bnplCategoriesActivity) {
            super(1);
            this.f41028d = bnplCategoriesActivity;
        }

        /* renamed from: a */
        public final void mo38148a(C31128a aVar) {
            if (aVar instanceof C31128a.C31131c) {
                this.f41028d.m51437I2().mo38162m((List) ((C31128a.C31131c) aVar).mo71340a());
                this.f41028d.m51439K2().f47591f.mo53595c();
            } else if (aVar instanceof C31128a.C31129a) {
                this.f41028d.mo74709H1(((C31128a.C31129a) aVar).mo71342c());
                this.f41028d.m51439K2().f47591f.mo53595c();
            } else if (aVar instanceof C31128a.C31130b) {
                this.f41028d.m51439K2().f47591f.mo53597e();
            }
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            mo38148a((C31128a) obj);
            return C41238w.f97225a;
        }
    }

    /* renamed from: ge.bog.mobilebank.bnpl.presentation.categories.BnplCategoriesActivity$d */
    static final class C13777d extends C41537m implements C43064a {

        /* renamed from: d */
        final /* synthetic */ BnplCategoriesActivity f41029d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C13777d(BnplCategoriesActivity bnplCategoriesActivity) {
            super(0);
            this.f41029d = bnplCategoriesActivity;
        }

        /* renamed from: b */
        public final ArrayList invoke() {
            ArrayList parcelableArrayListExtra = this.f41029d.getIntent().getParcelableArrayListExtra("CATEGORIES_ARG");
            C41536l.m120486f(parcelableArrayListExtra);
            return parcelableArrayListExtra;
        }
    }

    /* renamed from: ge.bog.mobilebank.bnpl.presentation.categories.BnplCategoriesActivity$e */
    static final class C13778e extends C41537m implements C43064a {

        /* renamed from: d */
        final /* synthetic */ BnplCategoriesActivity f41030d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C13778e(BnplCategoriesActivity bnplCategoriesActivity) {
            super(0);
            this.f41030d = bnplCategoriesActivity;
        }

        /* renamed from: b */
        public final C17052e invoke() {
            return C17052e.m59910d(this.f41030d.getLayoutInflater());
        }
    }

    /* renamed from: ge.bog.mobilebank.bnpl.presentation.categories.BnplCategoriesActivity$f */
    static final class C13779f implements C1645y, C41532h {

        /* renamed from: a */
        private final /* synthetic */ C43075l f41031a;

        C13779f(C43075l lVar) {
            C41536l.m120489i(lVar, "function");
            this.f41031a = lVar;
        }

        public final boolean equals(Object obj) {
            if (!(obj instanceof C1645y) || !(obj instanceof C41532h)) {
                return false;
            }
            return C41536l.m120484d(getFunctionDelegate(), ((C41532h) obj).getFunctionDelegate());
        }

        public final C41212c getFunctionDelegate() {
            return this.f41031a;
        }

        public final int hashCode() {
            return getFunctionDelegate().hashCode();
        }

        public final /* synthetic */ void onChanged(Object obj) {
            this.f41031a.invoke(obj);
        }
    }

    /* renamed from: ge.bog.mobilebank.bnpl.presentation.categories.BnplCategoriesActivity$g */
    public static final class C13780g implements TabLayout.C5149d {

        /* renamed from: a */
        final /* synthetic */ BnplCategoriesActivity f41032a;

        C13780g(BnplCategoriesActivity bnplCategoriesActivity) {
            this.f41032a = bnplCategoriesActivity;
        }

        /* renamed from: a */
        public void mo16942a(TabLayout.C5153g gVar) {
            long j;
            C41536l.m120489i(gVar, "tab");
            BnplCategoriesActivity bnplCategoriesActivity = this.f41032a;
            Long l = (Long) gVar.mo16960i();
            if (l != null) {
                j = l.longValue();
            } else {
                j = 0;
            }
            bnplCategoriesActivity.m51442N2(j);
        }

        /* renamed from: b */
        public void mo16943b(TabLayout.C5153g gVar) {
            C41536l.m120489i(gVar, "tab");
        }

        /* renamed from: c */
        public void mo16944c(TabLayout.C5153g gVar) {
            C41536l.m120489i(gVar, "tab");
        }
    }

    /* renamed from: ge.bog.mobilebank.bnpl.presentation.categories.BnplCategoriesActivity$h */
    public static final class C13781h extends C41537m implements C43064a {

        /* renamed from: d */
        final /* synthetic */ ComponentActivity f41033d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C13781h(ComponentActivity componentActivity) {
            super(0);
            this.f41033d = componentActivity;
        }

        public final C1620q0.C1624b invoke() {
            C1620q0.C1624b defaultViewModelProviderFactory = this.f41033d.getDefaultViewModelProviderFactory();
            C41536l.m120488h(defaultViewModelProviderFactory, "defaultViewModelProviderFactory");
            return defaultViewModelProviderFactory;
        }
    }

    /* renamed from: ge.bog.mobilebank.bnpl.presentation.categories.BnplCategoriesActivity$i */
    public static final class C13782i extends C41537m implements C43064a {

        /* renamed from: d */
        final /* synthetic */ ComponentActivity f41034d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C13782i(ComponentActivity componentActivity) {
            super(0);
            this.f41034d = componentActivity;
        }

        public final C1636t0 invoke() {
            C1636t0 viewModelStore = this.f41034d.getViewModelStore();
            C41536l.m120488h(viewModelStore, "viewModelStore");
            return viewModelStore;
        }
    }

    /* renamed from: ge.bog.mobilebank.bnpl.presentation.categories.BnplCategoriesActivity$j */
    public static final class C13783j extends C41537m implements C43064a {

        /* renamed from: d */
        final /* synthetic */ C43064a f41035d;

        /* renamed from: e */
        final /* synthetic */ ComponentActivity f41036e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C13783j(C43064a aVar, ComponentActivity componentActivity) {
            super(0);
            this.f41035d = aVar;
            this.f41036e = componentActivity;
        }

        public final C7047a invoke() {
            C7047a aVar;
            C43064a aVar2 = this.f41035d;
            if (aVar2 != null && (aVar = (C7047a) aVar2.invoke()) != null) {
                return aVar;
            }
            C7047a defaultViewModelCreationExtras = this.f41036e.getDefaultViewModelCreationExtras();
            C41536l.m120488h(defaultViewModelCreationExtras, "this.defaultViewModelCreationExtras");
            return defaultViewModelCreationExtras;
        }
    }

    /* renamed from: ge.bog.mobilebank.bnpl.presentation.categories.BnplCategoriesActivity$k */
    static final class C13784k extends C41537m implements C43064a {

        /* renamed from: d */
        final /* synthetic */ BnplCategoriesActivity f41037d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C13784k(BnplCategoriesActivity bnplCategoriesActivity) {
            super(0);
            this.f41037d = bnplCategoriesActivity;
        }

        /* renamed from: b */
        public final Long invoke() {
            return Long.valueOf(this.f41037d.getIntent().getLongExtra("CATEGORY_ID_ARG", 0));
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: I2 */
    public final C13788b m51437I2() {
        return (C13788b) this.f41023H.getValue();
    }

    /* renamed from: J2 */
    private final List m51438J2() {
        Object value = this.f41026K.getValue();
        C41536l.m120488h(value, "<get-allCategories>(...)");
        return (List) value;
    }

    /* access modifiers changed from: private */
    /* renamed from: K2 */
    public final C17052e m51439K2() {
        return (C17052e) this.f41022G.getValue();
    }

    /* renamed from: L2 */
    private final long m51440L2() {
        return ((Number) this.f41025J.getValue()).longValue();
    }

    /* renamed from: M2 */
    private final BnplCategoriesViewModel$ViewModel m51441M2() {
        return (BnplCategoriesViewModel$ViewModel) this.f41024I.getValue();
    }

    /* access modifiers changed from: private */
    /* renamed from: N2 */
    public final void m51442N2(long j) {
        m51441M2().mo38154Ah(j);
    }

    /* renamed from: O2 */
    private final void m51443O2() {
        RecyclerView recyclerView = m51439K2().f47592g;
        recyclerView.setAdapter(m51437I2());
        C41536l.m120488h(recyclerView, "setupViews$lambda$0");
        C37616s.m110618b(recyclerView, C16211b.f45712a, 1, false, 4, (Object) null);
        TabsView tabsView = m51439K2().f47590e;
        tabsView.addOnTabSelectedListener((TabLayout.C5149d) new C13780g(this));
        C41550z zVar = new C41550z();
        int i = 0;
        for (Object next : m51438J2()) {
            int i2 = i + 1;
            if (i < 0) {
                C41341q.m119917t();
            }
            BnplCategoryUiModel bnplCategoryUiModel = (BnplCategoryUiModel) next;
            TabLayout.C5153g u = tabsView.newTab().mo16972u((CharSequence) C32300e0.f79712a.mo72818d(bnplCategoryUiModel.mo38280a(), bnplCategoryUiModel.mo38281b()));
            u.mo16970s(Long.valueOf(bnplCategoryUiModel.mo38282d()));
            tabsView.addTab(u);
            if (bnplCategoryUiModel.mo38282d() == m51440L2()) {
                zVar.f97717d = Integer.valueOf(i);
            }
            i = i2;
        }
        tabsView.post(new C18411a(zVar, tabsView));
    }

    /* access modifiers changed from: private */
    /* renamed from: P2 */
    public static final void m51444P2(C41550z zVar, TabsView tabsView) {
        TabLayout.C5153g tabAt;
        C41536l.m120489i(zVar, "$selectedIndex");
        C41536l.m120489i(tabsView, "$this_with");
        Integer num = (Integer) zVar.f97717d;
        if (num != null && (tabAt = tabsView.getTabAt(num.intValue())) != null) {
            tabAt.mo16964m();
        }
    }

    /* renamed from: l1 */
    private final void m51445l1() {
        m51441M2().mo38155iw().mo38156zt().mo4819k(this, new C13779f(new C13776c(this)));
    }

    /* access modifiers changed from: protected */
    /* renamed from: O1 */
    public void mo37451O1(Bundle bundle) {
        setContentView((View) m51439K2().mo3946b());
        super.mo37451O1(bundle);
        m51443O2();
        m51445l1();
    }

    /* renamed from: z1 */
    public String mo38120z1() {
        return C32343x.m95388F("text.bnpl.name", new Object[0]);
    }
}
