package p90;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.ConstraintLayout;
import p086g1.C6201a;
import p341ge.bog.designsystem.components.tabs.TabsView;
import p341ge.bog.mobilebank.p975ui.views.widgets.BogViewPager;
import p366bk.C10324m;

/* renamed from: p90.g0 */
public final class C27304g0 implements C6201a {

    /* renamed from: d */
    private final ConstraintLayout f68747d;

    /* renamed from: e */
    public final TabsView f68748e;

    /* renamed from: f */
    public final C27272c8 f68749f;

    /* renamed from: g */
    public final BogViewPager f68750g;

    private C27304g0(ConstraintLayout constraintLayout, TabsView tabsView, C27272c8 c8Var, BogViewPager bogViewPager) {
        this.f68747d = constraintLayout;
        this.f68748e = tabsView;
        this.f68749f = c8Var;
        this.f68750g = bogViewPager;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:2:0x000a, code lost:
        r0 = p366bk.C10322k.f28730Ex;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static p90.C27304g0 m84519a(android.view.View r4) {
        /*
            int r0 = p366bk.C10322k.tabs
            android.view.View r1 = p086g1.C6202b.m24689a(r4, r0)
            ge.bog.designsystem.components.tabs.TabsView r1 = (p341ge.bog.designsystem.components.tabs.TabsView) r1
            if (r1 == 0) goto L_0x0029
            int r0 = p366bk.C10322k.f28730Ex
            android.view.View r2 = p086g1.C6202b.m24689a(r4, r0)
            if (r2 == 0) goto L_0x0029
            p90.c8 r0 = p90.C27272c8.m84388a(r2)
            int r2 = p366bk.C10322k.f28812ZA
            android.view.View r3 = p086g1.C6202b.m24689a(r4, r2)
            ge.bog.mobilebank.ui.views.widgets.BogViewPager r3 = (p341ge.bog.mobilebank.p975ui.views.widgets.BogViewPager) r3
            if (r3 == 0) goto L_0x0028
            p90.g0 r2 = new p90.g0
            androidx.constraintlayout.widget.ConstraintLayout r4 = (androidx.constraintlayout.widget.ConstraintLayout) r4
            r2.<init>(r4, r1, r0, r3)
            return r2
        L_0x0028:
            r0 = r2
        L_0x0029:
            android.content.res.Resources r4 = r4.getResources()
            java.lang.String r4 = r4.getResourceName(r0)
            java.lang.NullPointerException r0 = new java.lang.NullPointerException
            java.lang.String r1 = "Missing required view with ID: "
            java.lang.String r4 = r1.concat(r4)
            r0.<init>(r4)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: p90.C27304g0.m84519a(android.view.View):p90.g0");
    }

    /* renamed from: d */
    public static C27304g0 m84520d(LayoutInflater layoutInflater) {
        return m84521e(layoutInflater, (ViewGroup) null, false);
    }

    /* renamed from: e */
    public static C27304g0 m84521e(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(C10324m.activity_finance_management, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return m84519a(inflate);
    }

    /* renamed from: c */
    public ConstraintLayout mo3946b() {
        return this.f68747d;
    }
}
