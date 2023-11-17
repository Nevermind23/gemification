package p341ge.bog.mobilebank.cleanarch.presentation.referals;

import a81.C30772sa;
import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;
import androidx.activity.ComponentActivity;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.lifecycle.C1593j;
import androidx.lifecycle.C1617p0;
import androidx.lifecycle.C1620q0;
import androidx.lifecycle.C1636t0;
import androidx.viewpager2.adapter.FragmentStateAdapter;
import androidx.viewpager2.widget.ViewPager2;
import com.google.android.material.tabs.C5161d;
import com.google.android.material.tabs.TabLayout;
import g91.C32297d;
import g91.C32303f;
import he1.C41217g;
import he1.C41238w;
import java.math.BigDecimal;
import kotlin.jvm.internal.C41520a0;
import kotlin.jvm.internal.C41536l;
import kotlin.jvm.internal.C41537m;
import kotlin.jvm.internal.DefaultConstructorMarker;
import p163m0.C7047a;
import p341ge.bog.designsystem.components.tabs.TabsView;
import p341ge.bog.mobilebank.cleanarch.presentation.common.C21484c;
import p341ge.bog.mobilebank.cleanarch.presentation.common.C21503d;
import p341ge.bog.mobilebank.cleanarch.presentation.referals.viewmodel.ReferalsViewModel;
import p366bk.C10322k;
import p366bk.C10324m;
import p366bk.C10328q;
import p893sw.C28279b;
import q50.C27682a;
import r50.C27921c;
import r50.C27931g;
import ue1.C43064a;
import ue1.C43075l;

/* renamed from: ge.bog.mobilebank.cleanarch.presentation.referals.ReferalsActivity */
public final class ReferalsActivity extends C30772sa {

    /* renamed from: O */
    public static final C22342a f59210O = new C22342a((DefaultConstructorMarker) null);

    /* renamed from: F */
    private final C41217g f59211F = new C1617p0(C41520a0.m120436b(ReferalsViewModel.class), new C22357p(this), new C22356o(this), new C22358q((C43064a) null, this));

    /* renamed from: G */
    private final C22343b f59212G;

    /* renamed from: H */
    private final C41217g f59213H;

    /* renamed from: I */
    private final C41217g f59214I;

    /* renamed from: J */
    private final C41217g f59215J;

    /* renamed from: K */
    private final C41217g f59216K;

    /* renamed from: L */
    private final C41217g f59217L;

    /* renamed from: M */
    private final C41217g f59218M;

    /* renamed from: N */
    private final C41217g f59219N;

    /* renamed from: ge.bog.mobilebank.cleanarch.presentation.referals.ReferalsActivity$a */
    public static final class C22342a {
        private C22342a() {
        }

        public /* synthetic */ C22342a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    /* renamed from: ge.bog.mobilebank.cleanarch.presentation.referals.ReferalsActivity$b */
    private static final class C22343b extends FragmentStateAdapter {

        /* renamed from: l */
        private boolean f59220l;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C22343b(FragmentManager fragmentManager, C1593j jVar) {
            super(fragmentManager, jVar);
            C41536l.m120489i(fragmentManager, "manager");
            C41536l.m120489i(jVar, "lifecycle");
        }

        public int getItemCount() {
            return 2;
        }

        /* renamed from: h */
        public Fragment mo6571h(int i) {
            if (i == 0) {
                return C27931g.f71130g.mo67503a();
            }
            return C27921c.f71118f.mo67499a();
        }

        /* renamed from: z */
        public final void mo55278z(boolean z) {
            this.f59220l = z;
            notifyDataSetChanged();
        }
    }

    /* renamed from: ge.bog.mobilebank.cleanarch.presentation.referals.ReferalsActivity$c */
    static final class C22344c extends C41537m implements C43075l {

        /* renamed from: d */
        final /* synthetic */ ReferalsActivity f59221d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C22344c(ReferalsActivity referalsActivity) {
            super(1);
            this.f59221d = referalsActivity;
        }

        /* renamed from: a */
        public final void mo55279a(C28279b bVar) {
            C41536l.m120489i(bVar, "userInfo");
            this.f59221d.m72458O2(bVar);
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            mo55279a((C28279b) obj);
            return C41238w.f97225a;
        }
    }

    /* renamed from: ge.bog.mobilebank.cleanarch.presentation.referals.ReferalsActivity$d */
    static final class C22345d extends C41537m implements C43075l {

        /* renamed from: d */
        final /* synthetic */ ReferalsActivity f59222d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C22345d(ReferalsActivity referalsActivity) {
            super(1);
            this.f59222d = referalsActivity;
        }

        /* renamed from: a */
        public final void mo55280a(boolean z) {
            if (z) {
                this.f59222d.mo86441o2();
            } else {
                this.f59222d.mo86425J1();
            }
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            mo55280a(((Boolean) obj).booleanValue());
            return C41238w.f97225a;
        }
    }

    /* renamed from: ge.bog.mobilebank.cleanarch.presentation.referals.ReferalsActivity$e */
    static final class C22346e extends C41537m implements C43075l {

        /* renamed from: d */
        final /* synthetic */ ReferalsActivity f59223d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C22346e(ReferalsActivity referalsActivity) {
            super(1);
            this.f59223d = referalsActivity;
        }

        /* renamed from: a */
        public final void mo55281a(C21503d.C21504a aVar) {
            C41536l.m120489i(aVar, "error");
            this.f59223d.mo52674G1(aVar);
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            mo55281a((C21503d.C21504a) obj);
            return C41238w.f97225a;
        }
    }

    /* renamed from: ge.bog.mobilebank.cleanarch.presentation.referals.ReferalsActivity$f */
    static final class C22347f extends C41537m implements C43075l {

        /* renamed from: d */
        final /* synthetic */ ReferalsActivity f59224d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C22347f(ReferalsActivity referalsActivity) {
            super(1);
            this.f59224d = referalsActivity;
        }

        /* renamed from: a */
        public final void mo55282a(C28279b bVar) {
            C41536l.m120489i(bVar, "it");
            ReferalsActivity referalsActivity = this.f59224d;
            C32297d.m95160h(referalsActivity, referalsActivity.getString(C10328q.f28956f2));
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            mo55282a((C28279b) obj);
            return C41238w.f97225a;
        }
    }

    /* renamed from: ge.bog.mobilebank.cleanarch.presentation.referals.ReferalsActivity$g */
    static final class C22348g extends C41537m implements C43075l {

        /* renamed from: d */
        final /* synthetic */ ReferalsActivity f59225d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C22348g(ReferalsActivity referalsActivity) {
            super(1);
            this.f59225d = referalsActivity;
        }

        /* renamed from: a */
        public final void mo55283a(boolean z) {
            if (z) {
                this.f59225d.mo86441o2();
            } else {
                this.f59225d.mo86425J1();
            }
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            mo55283a(((Boolean) obj).booleanValue());
            return C41238w.f97225a;
        }
    }

    /* renamed from: ge.bog.mobilebank.cleanarch.presentation.referals.ReferalsActivity$h */
    static final class C22349h extends C41537m implements C43075l {

        /* renamed from: d */
        final /* synthetic */ ReferalsActivity f59226d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C22349h(ReferalsActivity referalsActivity) {
            super(1);
            this.f59226d = referalsActivity;
        }

        /* renamed from: a */
        public final void mo55284a(C21503d.C21504a aVar) {
            C41536l.m120489i(aVar, "it");
            this.f59226d.mo52674G1(aVar);
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            mo55284a((C21503d.C21504a) obj);
            return C41238w.f97225a;
        }
    }

    /* renamed from: ge.bog.mobilebank.cleanarch.presentation.referals.ReferalsActivity$i */
    public static final class C22350i extends ViewPager2.C1928i {
        C22350i() {
        }
    }

    /* renamed from: ge.bog.mobilebank.cleanarch.presentation.referals.ReferalsActivity$j */
    static final class C22351j extends C41537m implements C43064a {

        /* renamed from: d */
        final /* synthetic */ ReferalsActivity f59227d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C22351j(ReferalsActivity referalsActivity) {
            super(0);
            this.f59227d = referalsActivity;
        }

        /* renamed from: b */
        public final ViewPager2 invoke() {
            return (ViewPager2) this.f59227d.findViewById(C10322k.referal_pager);
        }
    }

    /* renamed from: ge.bog.mobilebank.cleanarch.presentation.referals.ReferalsActivity$k */
    static final class C22352k extends C41537m implements C43064a {

        /* renamed from: d */
        final /* synthetic */ ReferalsActivity f59228d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C22352k(ReferalsActivity referalsActivity) {
            super(0);
            this.f59228d = referalsActivity;
        }

        /* renamed from: b */
        public final TextView invoke() {
            return (TextView) this.f59228d.findViewById(C10322k.successful_shares_reward_community_value);
        }
    }

    /* renamed from: ge.bog.mobilebank.cleanarch.presentation.referals.ReferalsActivity$l */
    static final class C22353l extends C41537m implements C43064a {

        /* renamed from: d */
        final /* synthetic */ ReferalsActivity f59229d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C22353l(ReferalsActivity referalsActivity) {
            super(0);
            this.f59229d = referalsActivity;
        }

        /* renamed from: b */
        public final ConstraintLayout invoke() {
            return (ConstraintLayout) this.f59229d.findViewById(C10322k.successful_promo_code_shares_container);
        }
    }

    /* renamed from: ge.bog.mobilebank.cleanarch.presentation.referals.ReferalsActivity$m */
    static final class C22354m extends C41537m implements C43064a {

        /* renamed from: d */
        final /* synthetic */ ReferalsActivity f59230d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C22354m(ReferalsActivity referalsActivity) {
            super(0);
            this.f59230d = referalsActivity;
        }

        /* renamed from: b */
        public final TextView invoke() {
            return (TextView) this.f59230d.findViewById(C10322k.successful_shares_reward_points_title);
        }
    }

    /* renamed from: ge.bog.mobilebank.cleanarch.presentation.referals.ReferalsActivity$n */
    static final class C22355n extends C41537m implements C43064a {

        /* renamed from: d */
        final /* synthetic */ ReferalsActivity f59231d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C22355n(ReferalsActivity referalsActivity) {
            super(0);
            this.f59231d = referalsActivity;
        }

        /* renamed from: b */
        public final TextView invoke() {
            return (TextView) this.f59231d.findViewById(C10322k.successful_shares_reward_points_value);
        }
    }

    /* renamed from: ge.bog.mobilebank.cleanarch.presentation.referals.ReferalsActivity$o */
    public static final class C22356o extends C41537m implements C43064a {

        /* renamed from: d */
        final /* synthetic */ ComponentActivity f59232d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C22356o(ComponentActivity componentActivity) {
            super(0);
            this.f59232d = componentActivity;
        }

        public final C1620q0.C1624b invoke() {
            C1620q0.C1624b defaultViewModelProviderFactory = this.f59232d.getDefaultViewModelProviderFactory();
            C41536l.m120488h(defaultViewModelProviderFactory, "defaultViewModelProviderFactory");
            return defaultViewModelProviderFactory;
        }
    }

    /* renamed from: ge.bog.mobilebank.cleanarch.presentation.referals.ReferalsActivity$p */
    public static final class C22357p extends C41537m implements C43064a {

        /* renamed from: d */
        final /* synthetic */ ComponentActivity f59233d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C22357p(ComponentActivity componentActivity) {
            super(0);
            this.f59233d = componentActivity;
        }

        public final C1636t0 invoke() {
            C1636t0 viewModelStore = this.f59233d.getViewModelStore();
            C41536l.m120488h(viewModelStore, "viewModelStore");
            return viewModelStore;
        }
    }

    /* renamed from: ge.bog.mobilebank.cleanarch.presentation.referals.ReferalsActivity$q */
    public static final class C22358q extends C41537m implements C43064a {

        /* renamed from: d */
        final /* synthetic */ C43064a f59234d;

        /* renamed from: e */
        final /* synthetic */ ComponentActivity f59235e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C22358q(C43064a aVar, ComponentActivity componentActivity) {
            super(0);
            this.f59234d = aVar;
            this.f59235e = componentActivity;
        }

        public final C7047a invoke() {
            C7047a aVar;
            C43064a aVar2 = this.f59234d;
            if (aVar2 != null && (aVar = (C7047a) aVar2.invoke()) != null) {
                return aVar;
            }
            C7047a defaultViewModelCreationExtras = this.f59235e.getDefaultViewModelCreationExtras();
            C41536l.m120488h(defaultViewModelCreationExtras, "this.defaultViewModelCreationExtras");
            return defaultViewModelCreationExtras;
        }
    }

    /* renamed from: ge.bog.mobilebank.cleanarch.presentation.referals.ReferalsActivity$r */
    static final class C22359r extends C41537m implements C43064a {

        /* renamed from: d */
        final /* synthetic */ ReferalsActivity f59236d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C22359r(ReferalsActivity referalsActivity) {
            super(0);
            this.f59236d = referalsActivity;
        }

        /* renamed from: b */
        public final Integer invoke() {
            Intent intent = this.f59236d.getIntent();
            if (intent != null) {
                return Integer.valueOf(intent.getIntExtra("KEY_TAB", -1));
            }
            return null;
        }
    }

    /* renamed from: ge.bog.mobilebank.cleanarch.presentation.referals.ReferalsActivity$s */
    static final class C22360s extends C41537m implements C43064a {

        /* renamed from: d */
        final /* synthetic */ ReferalsActivity f59237d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C22360s(ReferalsActivity referalsActivity) {
            super(0);
            this.f59237d = referalsActivity;
        }

        /* renamed from: b */
        public final TabsView invoke() {
            return (TabsView) this.f59237d.findViewById(C10322k.tabs);
        }
    }

    public ReferalsActivity() {
        FragmentManager supportFragmentManager = getSupportFragmentManager();
        C41536l.m120488h(supportFragmentManager, "supportFragmentManager");
        C1593j lifecycle = getLifecycle();
        C41536l.m120488h(lifecycle, "lifecycle");
        this.f59212G = new C22343b(supportFragmentManager, lifecycle);
        this.f59213H = C41219i.m119470b(new C22351j(this));
        this.f59214I = C41219i.m119470b(new C22353l(this));
        this.f59215J = C41219i.m119470b(new C22352k(this));
        this.f59216K = C41219i.m119470b(new C22355n(this));
        this.f59217L = C41219i.m119470b(new C22354m(this));
        this.f59218M = C41219i.m119470b(new C22359r(this));
        this.f59219N = C41219i.m119470b(new C22360s(this));
    }

    /* renamed from: G2 */
    private final ViewPager2 m72450G2() {
        Object value = this.f59213H.getValue();
        C41536l.m120488h(value, "<get-referalPager>(...)");
        return (ViewPager2) value;
    }

    /* renamed from: H2 */
    private final TextView m72451H2() {
        Object value = this.f59215J.getValue();
        C41536l.m120488h(value, "<get-sharesCommunityValue>(...)");
        return (TextView) value;
    }

    /* renamed from: I2 */
    private final ConstraintLayout m72452I2() {
        Object value = this.f59214I.getValue();
        C41536l.m120488h(value, "<get-sharesContainer>(...)");
        return (ConstraintLayout) value;
    }

    /* renamed from: J2 */
    private final TextView m72453J2() {
        Object value = this.f59217L.getValue();
        C41536l.m120488h(value, "<get-sharesRewardPointsTitle>(...)");
        return (TextView) value;
    }

    /* renamed from: K2 */
    private final TextView m72454K2() {
        Object value = this.f59216K.getValue();
        C41536l.m120488h(value, "<get-sharesRewardPointsValue>(...)");
        return (TextView) value;
    }

    /* renamed from: L2 */
    private final Integer m72455L2() {
        return (Integer) this.f59218M.getValue();
    }

    /* renamed from: M2 */
    private final TabsView m72456M2() {
        Object value = this.f59219N.getValue();
        C41536l.m120488h(value, "<get-tabs>(...)");
        return (TabsView) value;
    }

    /* renamed from: N2 */
    private final ReferalsViewModel m72457N2() {
        return (ReferalsViewModel) this.f59211F.getValue();
    }

    /* access modifiers changed from: private */
    /* renamed from: O2 */
    public final void m72458O2(C28279b bVar) {
        C22343b bVar2 = this.f59212G;
        Boolean o = bVar.mo67916o();
        Boolean bool = Boolean.TRUE;
        bVar2.mo55278z(C41536l.m120484d(o, bool));
        if (C41536l.m120484d(bVar.mo67916o(), bool)) {
            m72456M2().setVisibility(8);
            m72450G2().setCurrentItem(1);
        }
        if (!(bVar.mo67907g() == null || bVar.mo67908h() == null)) {
            m72452I2().setVisibility(0);
            m72451H2().setText(String.valueOf(bVar.mo67912k()));
            TextView K2 = m72454K2();
            BigDecimal g = bVar.mo67907g();
            String h = C32303f.m95197h(bVar.mo67908h());
            K2.setText(g + h);
        }
        String h2 = bVar.mo67908h();
        if (h2 != null) {
            if (C41536l.m120484d(h2, "GEL")) {
                m72453J2().setText(getResources().getText(C10328q.promo_code_successful_share_prize_money_title));
            } else if (C41536l.m120484d(h2, "PLUS")) {
                m72453J2().setText(getResources().getText(C10328q.promo_code_points));
            }
        }
        Integer L2 = m72455L2();
        if (L2 != null && L2.intValue() != -1 && !C41536l.m120484d(bVar.mo67916o(), bool)) {
            m72450G2().setCurrentItem(L2.intValue());
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: P2 */
    public static final void m72459P2(ReferalsActivity referalsActivity, TabLayout.C5153g gVar, int i) {
        String str;
        C41536l.m120489i(referalsActivity, "this$0");
        C41536l.m120489i(gVar, "tab");
        if (i == 0) {
            str = referalsActivity.getString(C10328q.referals_passive_tab_title);
        } else {
            str = referalsActivity.getString(C10328q.referals_active_tab_title);
        }
        gVar.mo16972u(str);
    }

    /* access modifiers changed from: protected */
    /* renamed from: M1 */
    public int mo49479M1() {
        return C10324m.activity_referals;
    }

    /* access modifiers changed from: protected */
    /* renamed from: O1 */
    public void mo37451O1(Bundle bundle) {
        super.mo37451O1(bundle);
        C21484c.m69411c(m72457N2().mo55293pw(), this, new C22344c(this), new C22345d(this), new C22346e(this));
        C21484c.m69411c(m72457N2().mo55294qw(), this, new C22347f(this), new C22348g(this), new C22349h(this));
        m72457N2().mo55295rw();
        m72450G2().setAdapter(this.f59212G);
        m72450G2().mo6603h(new C22350i());
        m72450G2().setCurrentItem(1);
        m72450G2().setUserInputEnabled(false);
        new C5161d(m72456M2(), m72450G2(), new C27682a(this)).mo16990a();
        this.f59212G.notifyDataSetChanged();
    }

    /* renamed from: z1 */
    public String mo38120z1() {
        String string = getString(C10328q.referal_title);
        C41536l.m120488h(string, "getString(R.string.referal_title)");
        return string;
    }
}
