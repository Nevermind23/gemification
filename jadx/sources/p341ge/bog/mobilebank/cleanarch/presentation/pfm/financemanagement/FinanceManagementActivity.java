package p341ge.bog.mobilebank.cleanarch.presentation.pfm.financemanagement;

import a81.C30772sa;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.viewpager.widget.ViewPager;
import com.google.android.material.tabs.TabLayout;
import iu0.C36546y;
import java.util.List;
import kotlin.jvm.internal.C41536l;
import kotlin.jvm.internal.DefaultConstructorMarker;
import l40.C25806c;
import p341ge.bog.designsystem.components.tabs.TabsView;
import p341ge.bog.mobilebank.cleanarch.presentation.common.C21507e;
import p341ge.bog.mobilebank.cleanarch.presentation.pfm.financialcalendar.C22179a;
import p341ge.bog.mobilebank.p975ui.views.widgets.BogViewPager;
import p366bk.C10328q;
import p90.C27304g0;
import q31.C38122f;
import q31.C38125h;
import y00.C29883a;
import z30.C30146d;

/* renamed from: ge.bog.mobilebank.cleanarch.presentation.pfm.financemanagement.FinanceManagementActivity */
public final class FinanceManagementActivity extends C30772sa {

    /* renamed from: L */
    public static final C22161a f58918L = new C22161a((DefaultConstructorMarker) null);
    /* access modifiers changed from: private */

    /* renamed from: F */
    public C27304g0 f58919F;

    /* renamed from: G */
    private C29883a f58920G;

    /* renamed from: H */
    private C21507e f58921H;

    /* renamed from: I */
    private int f58922I = -1;

    /* renamed from: J */
    private final List f58923J = C41341q.m119910m(Integer.valueOf(C10328q.categorization_tab), Integer.valueOf(C10328q.chash_flow), Integer.valueOf(C10328q.header_text_statement), Integer.valueOf(C10328q.financial_calendar));

    /* renamed from: K */
    private final List f58924K = C41341q.m119910m("analysis", "cash_flow", "statement", "calendar");

    /* renamed from: ge.bog.mobilebank.cleanarch.presentation.pfm.financemanagement.FinanceManagementActivity$a */
    public static final class C22161a {
        private C22161a() {
        }

        public /* synthetic */ C22161a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* renamed from: a */
        public final void mo54998a(Context context) {
            C41536l.m120489i(context, "context");
            context.startActivity(new Intent(context, FinanceManagementActivity.class));
        }
    }

    /* renamed from: ge.bog.mobilebank.cleanarch.presentation.pfm.financemanagement.FinanceManagementActivity$b */
    private final class C22162b extends C29883a {

        /* renamed from: i */
        final /* synthetic */ FinanceManagementActivity f58925i;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C22162b(FinanceManagementActivity financeManagementActivity, FragmentManager fragmentManager) {
            super(fragmentManager, 1);
            C41536l.m120489i(fragmentManager, "fragmentManager");
            this.f58925i = financeManagementActivity;
        }

        /* renamed from: d */
        public int mo6557d() {
            return 4;
        }

        /* renamed from: t */
        public Fragment mo4805t(int i) {
            if (i == 0) {
                return C30146d.f76007u.mo70511a();
            }
            if (i == 1) {
                return C25806c.f65636k.mo64447a();
            }
            if (i == 2) {
                return C38122f.C38123a.m112206b(C38125h.m112238c(this.f58925i), (Long) null, 1, (Object) null);
            }
            if (i == 3) {
                return C22179a.f58952o.mo55010a();
            }
            throw new IllegalStateException("Invalid position: " + i);
        }
    }

    /* renamed from: ge.bog.mobilebank.cleanarch.presentation.pfm.financemanagement.FinanceManagementActivity$c */
    public static final class C22163c implements TabLayout.C5149d {

        /* renamed from: a */
        final /* synthetic */ FinanceManagementActivity f58926a;

        C22163c(FinanceManagementActivity financeManagementActivity) {
            this.f58926a = financeManagementActivity;
        }

        /* renamed from: a */
        public void mo16942a(TabLayout.C5153g gVar) {
            C41536l.m120489i(gVar, "tab");
            C27304g0 E2 = this.f58926a.f58919F;
            if (E2 == null) {
                C41536l.m120506z("binding");
                E2 = null;
            }
            E2.f68750g.setCurrentItem(gVar.mo16958g());
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

    /* renamed from: ge.bog.mobilebank.cleanarch.presentation.pfm.financemanagement.FinanceManagementActivity$d */
    public static final class C22164d extends ViewPager.C1905m {

        /* renamed from: d */
        final /* synthetic */ FinanceManagementActivity f58927d;

        C22164d(FinanceManagementActivity financeManagementActivity) {
            this.f58927d = financeManagementActivity;
        }

        /* renamed from: Q */
        public void mo6549Q(int i) {
            this.f58927d.m71822I2(i);
        }
    }

    /* renamed from: G2 */
    private final C30146d m71820G2() {
        C29883a aVar = this.f58920G;
        if (aVar == null) {
            C41536l.m120506z("pagerAdapter");
            aVar = null;
        }
        Fragment w = aVar.mo70154w(0);
        if (w instanceof C30146d) {
            return (C30146d) w;
        }
        return null;
    }

    /* renamed from: H2 */
    private final void m71821H2() {
        C27304g0 g0Var = this.f58919F;
        C29883a aVar = null;
        if (g0Var == null) {
            C41536l.m120506z("binding");
            g0Var = null;
        }
        for (int i = 0; i < 4; i++) {
            TabsView tabsView = g0Var.f68748e;
            tabsView.addTab(tabsView.newTab().mo16971t(((Number) this.f58923J.get(i)).intValue()));
        }
        g0Var.f68748e.addOnTabSelectedListener((TabLayout.C5149d) new C22163c(this));
        BogViewPager bogViewPager = g0Var.f68750g;
        bogViewPager.setOffscreenPageLimit(4);
        bogViewPager.setFingerSwipable(false);
        C29883a aVar2 = this.f58920G;
        if (aVar2 == null) {
            C41536l.m120506z("pagerAdapter");
        } else {
            aVar = aVar2;
        }
        bogViewPager.setAdapter(aVar);
        bogViewPager.addOnPageChangeListener(new C22164d(this));
        m71822I2(0);
    }

    /* access modifiers changed from: private */
    /* renamed from: I2 */
    public final void m71822I2(int i) {
        C36546y.m108282F().mo27152s("finances", (String) this.f58924K.get(i), "select_tab");
        this.f58922I = i;
        C29883a aVar = this.f58920G;
        if (aVar == null) {
            C41536l.m120506z("pagerAdapter");
            aVar = null;
        }
        Fragment w = aVar.mo70154w(i);
        C21507e eVar = this.f58921H;
        if (eVar != null) {
            eVar.mo41972d3();
        }
        if (w instanceof C21507e) {
            C21507e eVar2 = (C21507e) w;
            eVar2.mo41971b3();
            this.f58921H = eVar2;
        }
    }

    /* renamed from: J2 */
    public static final void m71823J2(Context context) {
        f58918L.mo54998a(context);
    }

    /* access modifiers changed from: protected */
    /* renamed from: O1 */
    public void mo37451O1(Bundle bundle) {
        C27304g0 d = C27304g0.m84520d(getLayoutInflater());
        C41536l.m120488h(d, "inflate(layoutInflater)");
        this.f58919F = d;
        if (d == null) {
            C41536l.m120506z("binding");
            d = null;
        }
        setContentView((View) d.mo3946b());
        super.mo37451O1(bundle);
        FragmentManager supportFragmentManager = getSupportFragmentManager();
        C41536l.m120488h(supportFragmentManager, "supportFragmentManager");
        this.f58920G = new C22162b(this, supportFragmentManager);
        m71821H2();
    }

    public void onBackPressed() {
        C30146d G2 = m71820G2();
        if (G2 != null) {
            FragmentManager childFragmentManager = G2.getChildFragmentManager();
            if (childFragmentManager.mo4432r0() > 0) {
                childFragmentManager.mo4409g1();
                G2.mo70503M1();
                return;
            }
        }
        super.onBackPressed();
    }

    /* renamed from: z1 */
    public String mo38120z1() {
        String string = getString(C10328q.financial_manager);
        C41536l.m120488h(string, "getString(R.string.financial_manager)");
        return string;
    }
}
