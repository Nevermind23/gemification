package xn0;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.cardview.widget.CardView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewpager2.widget.ViewPager2;
import p086g1.C6201a;
import p341ge.bog.designsystem.components.emptywidget.EmptyWidget;
import p341ge.bog.designsystem.components.layersandshadows.LayerView;
import p341ge.bog.designsystem.components.loading.LoadingView;
import p341ge.bog.designsystem.components.tabgroup.TabsGroupView;
import p90.C27272c8;
import p90.C27486z7;
import sn0.C17902f;

/* renamed from: xn0.g */
public final class C18849g implements C6201a {

    /* renamed from: d */
    private final ConstraintLayout f52727d;

    /* renamed from: e */
    public final LoadingView f52728e;

    /* renamed from: f */
    public final TabsGroupView f52729f;

    /* renamed from: g */
    public final LoadingView f52730g;

    /* renamed from: h */
    public final LinearLayout f52731h;

    /* renamed from: i */
    public final EmptyWidget f52732i;

    /* renamed from: j */
    public final C27486z7 f52733j;

    /* renamed from: k */
    public final CardView f52734k;

    /* renamed from: l */
    public final LayerView f52735l;

    /* renamed from: m */
    public final C27272c8 f52736m;

    /* renamed from: n */
    public final ViewPager2 f52737n;

    private C18849g(ConstraintLayout constraintLayout, LoadingView loadingView, TabsGroupView tabsGroupView, LoadingView loadingView2, LinearLayout linearLayout, EmptyWidget emptyWidget, C27486z7 z7Var, CardView cardView, LayerView layerView, C27272c8 c8Var, ViewPager2 viewPager2) {
        this.f52727d = constraintLayout;
        this.f52728e = loadingView;
        this.f52729f = tabsGroupView;
        this.f52730g = loadingView2;
        this.f52731h = linearLayout;
        this.f52732i = emptyWidget;
        this.f52733j = z7Var;
        this.f52734k = cardView;
        this.f52735l = layerView;
        this.f52736m = c8Var;
        this.f52737n = viewPager2;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x0037, code lost:
        r0 = sn0.C17901e.f50963d0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:16:0x0059, code lost:
        r0 = sn0.C17901e.f50979n0;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static xn0.C18849g m63764a(android.view.View r14) {
        /*
            int r0 = sn0.C17901e.f50969h
            android.view.View r1 = p086g1.C6202b.m24689a(r14, r0)
            r4 = r1
            ge.bog.designsystem.components.loading.LoadingView r4 = (p341ge.bog.designsystem.components.loading.LoadingView) r4
            if (r4 == 0) goto L_0x007a
            int r0 = sn0.C17901e.f50970i
            android.view.View r1 = p086g1.C6202b.m24689a(r14, r0)
            r5 = r1
            ge.bog.designsystem.components.tabgroup.TabsGroupView r5 = (p341ge.bog.designsystem.components.tabgroup.TabsGroupView) r5
            if (r5 == 0) goto L_0x007a
            int r0 = sn0.C17901e.f50948D
            android.view.View r1 = p086g1.C6202b.m24689a(r14, r0)
            r6 = r1
            ge.bog.designsystem.components.loading.LoadingView r6 = (p341ge.bog.designsystem.components.loading.LoadingView) r6
            if (r6 == 0) goto L_0x007a
            int r0 = sn0.C17901e.f50953J
            android.view.View r1 = p086g1.C6202b.m24689a(r14, r0)
            r7 = r1
            android.widget.LinearLayout r7 = (android.widget.LinearLayout) r7
            if (r7 == 0) goto L_0x007a
            int r0 = sn0.C17901e.progress_list_header
            android.view.View r1 = p086g1.C6202b.m24689a(r14, r0)
            r8 = r1
            ge.bog.designsystem.components.emptywidget.EmptyWidget r8 = (p341ge.bog.designsystem.components.emptywidget.EmptyWidget) r8
            if (r8 == 0) goto L_0x007a
            int r0 = sn0.C17901e.f50963d0
            android.view.View r1 = p086g1.C6202b.m24689a(r14, r0)
            if (r1 == 0) goto L_0x007a
            p90.z7 r9 = p90.C27486z7.m85250a(r1)
            int r0 = sn0.C17901e.f50964e0
            android.view.View r1 = p086g1.C6202b.m24689a(r14, r0)
            r10 = r1
            androidx.cardview.widget.CardView r10 = (androidx.cardview.widget.CardView) r10
            if (r10 == 0) goto L_0x007a
            int r0 = sn0.C17901e.tab
            android.view.View r1 = p086g1.C6202b.m24689a(r14, r0)
            r11 = r1
            ge.bog.designsystem.components.layersandshadows.LayerView r11 = (p341ge.bog.designsystem.components.layersandshadows.LayerView) r11
            if (r11 == 0) goto L_0x007a
            int r0 = sn0.C17901e.f50979n0
            android.view.View r1 = p086g1.C6202b.m24689a(r14, r0)
            if (r1 == 0) goto L_0x007a
            p90.c8 r12 = p90.C27272c8.m84388a(r1)
            int r0 = sn0.C17901e.f50981p0
            android.view.View r1 = p086g1.C6202b.m24689a(r14, r0)
            r13 = r1
            androidx.viewpager2.widget.ViewPager2 r13 = (androidx.viewpager2.widget.ViewPager2) r13
            if (r13 == 0) goto L_0x007a
            xn0.g r0 = new xn0.g
            r3 = r14
            androidx.constraintlayout.widget.ConstraintLayout r3 = (androidx.constraintlayout.widget.ConstraintLayout) r3
            r2 = r0
            r2.<init>(r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13)
            return r0
        L_0x007a:
            android.content.res.Resources r14 = r14.getResources()
            java.lang.String r14 = r14.getResourceName(r0)
            java.lang.NullPointerException r0 = new java.lang.NullPointerException
            java.lang.String r1 = "Missing required view with ID: "
            java.lang.String r14 = r1.concat(r14)
            r0.<init>(r14)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: xn0.C18849g.m63764a(android.view.View):xn0.g");
    }

    /* renamed from: d */
    public static C18849g m63765d(LayoutInflater layoutInflater) {
        return m63766e(layoutInflater, (ViewGroup) null, false);
    }

    /* renamed from: e */
    public static C18849g m63766e(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(C17902f.activity_lifestyle_offers_progress, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return m63764a(inflate);
    }

    /* renamed from: c */
    public ConstraintLayout mo3946b() {
        return this.f52727d;
    }
}
