package iy0;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.constraintlayout.widget.Guideline;
import androidx.recyclerview.widget.RecyclerView;
import hy0.C36272f;
import p086g1.C6201a;
import p341ge.bog.designsystem.components.emptywidget.EmptyWidget;
import p341ge.bog.designsystem.components.loading.LoadingView;
import p341ge.bog.designsystem.components.pagedescription.PageDescriptionView;
import p341ge.bog.designsystem.components.search.SearchView;
import p341ge.bog.mobilebank.cleanarch.presentation.common.StateView;
import p90.C27272c8;

/* renamed from: iy0.g */
public final class C36596g implements C6201a {

    /* renamed from: d */
    private final LinearLayout f88194d;

    /* renamed from: e */
    public final LinearLayout f88195e;

    /* renamed from: f */
    public final RecyclerView f88196f;

    /* renamed from: g */
    public final PageDescriptionView f88197g;

    /* renamed from: h */
    public final EmptyWidget f88198h;

    /* renamed from: i */
    public final Guideline f88199i;

    /* renamed from: j */
    public final Guideline f88200j;

    /* renamed from: k */
    public final StateView f88201k;

    /* renamed from: l */
    public final EmptyWidget f88202l;

    /* renamed from: m */
    public final RecyclerView f88203m;

    /* renamed from: n */
    public final LoadingView f88204n;

    /* renamed from: o */
    public final SearchView f88205o;

    /* renamed from: p */
    public final C27272c8 f88206p;

    private C36596g(LinearLayout linearLayout, LinearLayout linearLayout2, RecyclerView recyclerView, PageDescriptionView pageDescriptionView, EmptyWidget emptyWidget, Guideline guideline, Guideline guideline2, StateView stateView, EmptyWidget emptyWidget2, RecyclerView recyclerView2, LoadingView loadingView, SearchView searchView, C27272c8 c8Var) {
        this.f88194d = linearLayout;
        this.f88195e = linearLayout2;
        this.f88196f = recyclerView;
        this.f88197g = pageDescriptionView;
        this.f88198h = emptyWidget;
        this.f88199i = guideline;
        this.f88200j = guideline2;
        this.f88201k = stateView;
        this.f88202l = emptyWidget2;
        this.f88203m = recyclerView2;
        this.f88204n = loadingView;
        this.f88205o = searchView;
        this.f88206p = c8Var;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:22:0x007b, code lost:
        r1 = hy0.C36271e.f87549u2;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static iy0.C36596g m108510a(android.view.View r17) {
        /*
            r0 = r17
            int r1 = hy0.C36271e.f87487F
            android.view.View r2 = p086g1.C6202b.m24689a(r0, r1)
            r5 = r2
            android.widget.LinearLayout r5 = (android.widget.LinearLayout) r5
            if (r5 == 0) goto L_0x0091
            int r1 = hy0.C36271e.categories_list
            android.view.View r2 = p086g1.C6202b.m24689a(r0, r1)
            r6 = r2
            androidx.recyclerview.widget.RecyclerView r6 = (androidx.recyclerview.widget.RecyclerView) r6
            if (r6 == 0) goto L_0x0091
            int r1 = hy0.C36271e.empty_search
            android.view.View r2 = p086g1.C6202b.m24689a(r0, r1)
            r7 = r2
            ge.bog.designsystem.components.pagedescription.PageDescriptionView r7 = (p341ge.bog.designsystem.components.pagedescription.PageDescriptionView) r7
            if (r7 == 0) goto L_0x0091
            int r1 = hy0.C36271e.every_product_header
            android.view.View r2 = p086g1.C6202b.m24689a(r0, r1)
            r8 = r2
            ge.bog.designsystem.components.emptywidget.EmptyWidget r8 = (p341ge.bog.designsystem.components.emptywidget.EmptyWidget) r8
            if (r8 == 0) goto L_0x0091
            int r1 = hy0.C36271e.f87483B0
            android.view.View r2 = p086g1.C6202b.m24689a(r0, r1)
            r9 = r2
            androidx.constraintlayout.widget.Guideline r9 = (androidx.constraintlayout.widget.Guideline) r9
            if (r9 == 0) goto L_0x0091
            int r1 = hy0.C36271e.f87484C0
            android.view.View r2 = p086g1.C6202b.m24689a(r0, r1)
            r10 = r2
            androidx.constraintlayout.widget.Guideline r10 = (androidx.constraintlayout.widget.Guideline) r10
            if (r10 == 0) goto L_0x0091
            int r1 = hy0.C36271e.f87525j1
            android.view.View r2 = p086g1.C6202b.m24689a(r0, r1)
            r11 = r2
            ge.bog.mobilebank.cleanarch.presentation.common.StateView r11 = (p341ge.bog.mobilebank.cleanarch.presentation.common.StateView) r11
            if (r11 == 0) goto L_0x0091
            int r1 = hy0.C36271e.nbo_products_header
            android.view.View r2 = p086g1.C6202b.m24689a(r0, r1)
            r12 = r2
            ge.bog.designsystem.components.emptywidget.EmptyWidget r12 = (p341ge.bog.designsystem.components.emptywidget.EmptyWidget) r12
            if (r12 == 0) goto L_0x0091
            int r1 = hy0.C36271e.nbo_products_list
            android.view.View r2 = p086g1.C6202b.m24689a(r0, r1)
            r13 = r2
            androidx.recyclerview.widget.RecyclerView r13 = (androidx.recyclerview.widget.RecyclerView) r13
            if (r13 == 0) goto L_0x0091
            int r1 = hy0.C36271e.f87503W1
            android.view.View r2 = p086g1.C6202b.m24689a(r0, r1)
            r14 = r2
            ge.bog.designsystem.components.loading.LoadingView r14 = (p341ge.bog.designsystem.components.loading.LoadingView) r14
            if (r14 == 0) goto L_0x0091
            int r1 = hy0.C36271e.f87517f2
            android.view.View r2 = p086g1.C6202b.m24689a(r0, r1)
            r15 = r2
            ge.bog.designsystem.components.search.SearchView r15 = (p341ge.bog.designsystem.components.search.SearchView) r15
            if (r15 == 0) goto L_0x0091
            int r1 = hy0.C36271e.f87549u2
            android.view.View r2 = p086g1.C6202b.m24689a(r0, r1)
            if (r2 == 0) goto L_0x0091
            p90.c8 r16 = p90.C27272c8.m84388a(r2)
            iy0.g r1 = new iy0.g
            r4 = r0
            android.widget.LinearLayout r4 = (android.widget.LinearLayout) r4
            r3 = r1
            r3.<init>(r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16)
            return r1
        L_0x0091:
            android.content.res.Resources r0 = r17.getResources()
            java.lang.String r0 = r0.getResourceName(r1)
            java.lang.NullPointerException r1 = new java.lang.NullPointerException
            java.lang.String r2 = "Missing required view with ID: "
            java.lang.String r0 = r2.concat(r0)
            r1.<init>(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: iy0.C36596g.m108510a(android.view.View):iy0.g");
    }

    /* renamed from: d */
    public static C36596g m108511d(LayoutInflater layoutInflater) {
        return m108512e(layoutInflater, (ViewGroup) null, false);
    }

    /* renamed from: e */
    public static C36596g m108512e(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(C36272f.activity_add_new_product, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return m108510a(inflate);
    }

    /* renamed from: c */
    public LinearLayout mo3946b() {
        return this.f88194d;
    }
}
