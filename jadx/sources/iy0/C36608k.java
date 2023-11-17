package iy0;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.widget.NestedScrollView;
import androidx.viewpager2.widget.ViewPager2;
import hy0.C36272f;
import p086g1.C6201a;
import p341ge.bog.designsystem.components.loading.LoadingView;
import p341ge.bog.designsystem.components.tabs.TabsView;
import p90.C27272c8;

/* renamed from: iy0.k */
public final class C36608k implements C6201a {

    /* renamed from: d */
    private final ConstraintLayout f88296d;

    /* renamed from: e */
    public final ViewPager2 f88297e;

    /* renamed from: f */
    public final TabsView f88298f;

    /* renamed from: g */
    public final LoadingView f88299g;

    /* renamed from: h */
    public final FrameLayout f88300h;

    /* renamed from: i */
    public final C27272c8 f88301i;

    /* renamed from: j */
    public final NestedScrollView f88302j;

    private C36608k(ConstraintLayout constraintLayout, ViewPager2 viewPager2, TabsView tabsView, LoadingView loadingView, FrameLayout frameLayout, C27272c8 c8Var, NestedScrollView nestedScrollView) {
        this.f88296d = constraintLayout;
        this.f88297e = viewPager2;
        this.f88298f = tabsView;
        this.f88299g = loadingView;
        this.f88300h = frameLayout;
        this.f88301i = c8Var;
        this.f88302j = nestedScrollView;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:8:0x002c, code lost:
        r0 = hy0.C36271e.f87549u2;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static iy0.C36608k m108562a(android.view.View r10) {
        /*
            int r0 = hy0.C36271e.f87546t0
            android.view.View r1 = p086g1.C6202b.m24689a(r10, r0)
            r4 = r1
            androidx.viewpager2.widget.ViewPager2 r4 = (androidx.viewpager2.widget.ViewPager2) r4
            if (r4 == 0) goto L_0x004d
            int r0 = hy0.C36271e.loan_type_tabs
            android.view.View r1 = p086g1.C6202b.m24689a(r10, r0)
            r5 = r1
            ge.bog.designsystem.components.tabs.TabsView r5 = (p341ge.bog.designsystem.components.tabs.TabsView) r5
            if (r5 == 0) goto L_0x004d
            int r0 = hy0.C36271e.loans_loader
            android.view.View r1 = p086g1.C6202b.m24689a(r10, r0)
            r6 = r1
            ge.bog.designsystem.components.loading.LoadingView r6 = (p341ge.bog.designsystem.components.loading.LoadingView) r6
            if (r6 == 0) goto L_0x004d
            int r0 = hy0.C36271e.f87500U1
            android.view.View r1 = p086g1.C6202b.m24689a(r10, r0)
            r7 = r1
            android.widget.FrameLayout r7 = (android.widget.FrameLayout) r7
            if (r7 == 0) goto L_0x004d
            int r0 = hy0.C36271e.f87549u2
            android.view.View r1 = p086g1.C6202b.m24689a(r10, r0)
            if (r1 == 0) goto L_0x004d
            p90.c8 r8 = p90.C27272c8.m84388a(r1)
            int r0 = hy0.C36271e.viewpager_container
            android.view.View r1 = p086g1.C6202b.m24689a(r10, r0)
            r9 = r1
            androidx.core.widget.NestedScrollView r9 = (androidx.core.widget.NestedScrollView) r9
            if (r9 == 0) goto L_0x004d
            iy0.k r0 = new iy0.k
            r3 = r10
            androidx.constraintlayout.widget.ConstraintLayout r3 = (androidx.constraintlayout.widget.ConstraintLayout) r3
            r2 = r0
            r2.<init>(r3, r4, r5, r6, r7, r8, r9)
            return r0
        L_0x004d:
            android.content.res.Resources r10 = r10.getResources()
            java.lang.String r10 = r10.getResourceName(r0)
            java.lang.NullPointerException r0 = new java.lang.NullPointerException
            java.lang.String r1 = "Missing required view with ID: "
            java.lang.String r10 = r1.concat(r10)
            r0.<init>(r10)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: iy0.C36608k.m108562a(android.view.View):iy0.k");
    }

    /* renamed from: d */
    public static C36608k m108563d(LayoutInflater layoutInflater) {
        return m108564e(layoutInflater, (ViewGroup) null, false);
    }

    /* renamed from: e */
    public static C36608k m108564e(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(C36272f.activity_loan_list, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return m108562a(inflate);
    }

    /* renamed from: c */
    public ConstraintLayout mo3946b() {
        return this.f88296d;
    }
}
