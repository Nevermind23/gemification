package p90;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.google.android.material.appbar.AppBarLayout;
import p086g1.C6201a;
import p341ge.bog.mobilebank.p975ui.views.widgets.BogTabLayout;
import p341ge.bog.mobilebank.p975ui.views.widgets.BogViewPager;
import p341ge.bog.mobilebank.p975ui.views.widgets.CircleIndicator;
import p341ge.bog.mobilebank.p975ui.views.widgets.cardview.CardView;
import p366bk.C10324m;

/* renamed from: p90.p1 */
public final class C27390p1 implements C6201a {

    /* renamed from: d */
    private final FrameLayout f69514d;

    /* renamed from: e */
    public final FrameLayout f69515e;

    /* renamed from: f */
    public final FrameLayout f69516f;

    /* renamed from: g */
    public final AppBarLayout f69517g;

    /* renamed from: h */
    public final CardView f69518h;

    /* renamed from: i */
    public final CircleIndicator f69519i;

    /* renamed from: j */
    public final BogTabLayout f69520j;

    /* renamed from: k */
    public final BogViewPager f69521k;

    /* renamed from: l */
    public final C27272c8 f69522l;

    private C27390p1(FrameLayout frameLayout, FrameLayout frameLayout2, FrameLayout frameLayout3, AppBarLayout appBarLayout, CardView cardView, CircleIndicator circleIndicator, BogTabLayout bogTabLayout, BogViewPager bogViewPager, C27272c8 c8Var) {
        this.f69514d = frameLayout;
        this.f69515e = frameLayout2;
        this.f69516f = frameLayout3;
        this.f69517g = appBarLayout;
        this.f69518h = cardView;
        this.f69519i = circleIndicator;
        this.f69520j = bogTabLayout;
        this.f69521k = bogViewPager;
        this.f69522l = c8Var;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:12:0x0045, code lost:
        r0 = p366bk.C10322k.f28730Ex;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static p90.C27390p1 m84863a(android.view.View r12) {
        /*
            int r0 = p366bk.C10322k.f28784Qe
            android.view.View r1 = p086g1.C6202b.m24689a(r12, r0)
            r4 = r1
            android.widget.FrameLayout r4 = (android.widget.FrameLayout) r4
            if (r4 == 0) goto L_0x0059
            r5 = r12
            android.widget.FrameLayout r5 = (android.widget.FrameLayout) r5
            int r0 = p366bk.C10322k.product_details_appbar
            android.view.View r1 = p086g1.C6202b.m24689a(r12, r0)
            r6 = r1
            com.google.android.material.appbar.AppBarLayout r6 = (com.google.android.material.appbar.AppBarLayout) r6
            if (r6 == 0) goto L_0x0059
            int r0 = p366bk.C10322k.product_details_card_view
            android.view.View r1 = p086g1.C6202b.m24689a(r12, r0)
            r7 = r1
            ge.bog.mobilebank.ui.views.widgets.cardview.CardView r7 = (p341ge.bog.mobilebank.p975ui.views.widgets.cardview.CardView) r7
            if (r7 == 0) goto L_0x0059
            int r0 = p366bk.C10322k.product_details_circle_indicator
            android.view.View r1 = p086g1.C6202b.m24689a(r12, r0)
            r8 = r1
            ge.bog.mobilebank.ui.views.widgets.CircleIndicator r8 = (p341ge.bog.mobilebank.p975ui.views.widgets.CircleIndicator) r8
            if (r8 == 0) goto L_0x0059
            int r0 = p366bk.C10322k.product_details_tab_layout
            android.view.View r1 = p086g1.C6202b.m24689a(r12, r0)
            r9 = r1
            ge.bog.mobilebank.ui.views.widgets.BogTabLayout r9 = (p341ge.bog.mobilebank.p975ui.views.widgets.BogTabLayout) r9
            if (r9 == 0) goto L_0x0059
            int r0 = p366bk.C10322k.product_details_viewpager
            android.view.View r1 = p086g1.C6202b.m24689a(r12, r0)
            r10 = r1
            ge.bog.mobilebank.ui.views.widgets.BogViewPager r10 = (p341ge.bog.mobilebank.p975ui.views.widgets.BogViewPager) r10
            if (r10 == 0) goto L_0x0059
            int r0 = p366bk.C10322k.f28730Ex
            android.view.View r1 = p086g1.C6202b.m24689a(r12, r0)
            if (r1 == 0) goto L_0x0059
            p90.c8 r11 = p90.C27272c8.m84388a(r1)
            p90.p1 r12 = new p90.p1
            r2 = r12
            r3 = r5
            r2.<init>(r3, r4, r5, r6, r7, r8, r9, r10, r11)
            return r12
        L_0x0059:
            android.content.res.Resources r12 = r12.getResources()
            java.lang.String r12 = r12.getResourceName(r0)
            java.lang.NullPointerException r0 = new java.lang.NullPointerException
            java.lang.String r1 = "Missing required view with ID: "
            java.lang.String r12 = r1.concat(r12)
            r0.<init>(r12)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: p90.C27390p1.m84863a(android.view.View):p90.p1");
    }

    /* renamed from: d */
    public static C27390p1 m84864d(LayoutInflater layoutInflater) {
        return m84865e(layoutInflater, (ViewGroup) null, false);
    }

    /* renamed from: e */
    public static C27390p1 m84865e(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(C10324m.activity_product_detailed, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return m84863a(inflate);
    }

    /* renamed from: c */
    public FrameLayout mo3946b() {
        return this.f69514d;
    }
}
