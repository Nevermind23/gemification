package ue0;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;
import androidx.swiperefreshlayout.widget.SwipeRefreshLayout;
import ie0.C25188h;
import p086g1.C6201a;
import p341ge.bog.designsystem.components.layersandshadows.LayerView;
import p341ge.bog.designsystem.components.loading.LoadingView;
import p341ge.bog.designsystem.components.pagedescription.PageDescriptionView;
import p341ge.bog.mobilebank.cleanarch.presentation.common.StateView;

/* renamed from: ue0.l0 */
public final class C28737l0 implements C6201a {

    /* renamed from: d */
    private final ConstraintLayout f73362d;

    /* renamed from: e */
    public final LayerView f73363e;

    /* renamed from: f */
    public final PageDescriptionView f73364f;

    /* renamed from: g */
    public final LayerView f73365g;

    /* renamed from: h */
    public final LinearLayout f73366h;

    /* renamed from: i */
    public final View f73367i;

    /* renamed from: j */
    public final PageDescriptionView f73368j;

    /* renamed from: k */
    public final RecyclerView f73369k;

    /* renamed from: l */
    public final SwipeRefreshLayout f73370l;

    /* renamed from: m */
    public final LoadingView f73371m;

    /* renamed from: n */
    public final StateView f73372n;

    private C28737l0(ConstraintLayout constraintLayout, LayerView layerView, PageDescriptionView pageDescriptionView, LayerView layerView2, LinearLayout linearLayout, View view, PageDescriptionView pageDescriptionView2, RecyclerView recyclerView, SwipeRefreshLayout swipeRefreshLayout, LoadingView loadingView, StateView stateView) {
        this.f73362d = constraintLayout;
        this.f73363e = layerView;
        this.f73364f = pageDescriptionView;
        this.f73365g = layerView2;
        this.f73366h = linearLayout;
        this.f73367i = view;
        this.f73368j = pageDescriptionView2;
        this.f73369k = recyclerView;
        this.f73370l = swipeRefreshLayout;
        this.f73371m = loadingView;
        this.f73372n = stateView;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:8:0x002c, code lost:
        r0 = ie0.C25187g.f64672G1;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static ue0.C28737l0 m88073a(android.view.View r14) {
        /*
            int r0 = ie0.C25187g.f64689Z0
            android.view.View r1 = p086g1.C6202b.m24689a(r14, r0)
            r4 = r1
            ge.bog.designsystem.components.layersandshadows.LayerView r4 = (p341ge.bog.designsystem.components.layersandshadows.LayerView) r4
            if (r4 == 0) goto L_0x0075
            int r0 = ie0.C25187g.f64701i1
            android.view.View r1 = p086g1.C6202b.m24689a(r14, r0)
            r5 = r1
            ge.bog.designsystem.components.pagedescription.PageDescriptionView r5 = (p341ge.bog.designsystem.components.pagedescription.PageDescriptionView) r5
            if (r5 == 0) goto L_0x0075
            int r0 = ie0.C25187g.f64714p1
            android.view.View r1 = p086g1.C6202b.m24689a(r14, r0)
            r6 = r1
            ge.bog.designsystem.components.layersandshadows.LayerView r6 = (p341ge.bog.designsystem.components.layersandshadows.LayerView) r6
            if (r6 == 0) goto L_0x0075
            int r0 = ie0.C25187g.f64668D1
            android.view.View r1 = p086g1.C6202b.m24689a(r14, r0)
            r7 = r1
            android.widget.LinearLayout r7 = (android.widget.LinearLayout) r7
            if (r7 == 0) goto L_0x0075
            int r0 = ie0.C25187g.f64672G1
            android.view.View r8 = p086g1.C6202b.m24689a(r14, r0)
            if (r8 == 0) goto L_0x0075
            int r0 = ie0.C25187g.f64723v2
            android.view.View r1 = p086g1.C6202b.m24689a(r14, r0)
            r9 = r1
            ge.bog.designsystem.components.pagedescription.PageDescriptionView r9 = (p341ge.bog.designsystem.components.pagedescription.PageDescriptionView) r9
            if (r9 == 0) goto L_0x0075
            int r0 = ie0.C25187g.f64699h3
            android.view.View r1 = p086g1.C6202b.m24689a(r14, r0)
            r10 = r1
            androidx.recyclerview.widget.RecyclerView r10 = (androidx.recyclerview.widget.RecyclerView) r10
            if (r10 == 0) goto L_0x0075
            int r0 = ie0.C25187g.refresh_layout
            android.view.View r1 = p086g1.C6202b.m24689a(r14, r0)
            r11 = r1
            androidx.swiperefreshlayout.widget.SwipeRefreshLayout r11 = (androidx.swiperefreshlayout.widget.SwipeRefreshLayout) r11
            if (r11 == 0) goto L_0x0075
            int r0 = ie0.C25187g.f64688Y3
            android.view.View r1 = p086g1.C6202b.m24689a(r14, r0)
            r12 = r1
            ge.bog.designsystem.components.loading.LoadingView r12 = (p341ge.bog.designsystem.components.loading.LoadingView) r12
            if (r12 == 0) goto L_0x0075
            int r0 = ie0.C25187g.f64691a4
            android.view.View r1 = p086g1.C6202b.m24689a(r14, r0)
            r13 = r1
            ge.bog.mobilebank.cleanarch.presentation.common.StateView r13 = (p341ge.bog.mobilebank.cleanarch.presentation.common.StateView) r13
            if (r13 == 0) goto L_0x0075
            ue0.l0 r0 = new ue0.l0
            r3 = r14
            androidx.constraintlayout.widget.ConstraintLayout r3 = (androidx.constraintlayout.widget.ConstraintLayout) r3
            r2 = r0
            r2.<init>(r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13)
            return r0
        L_0x0075:
            android.content.res.Resources r14 = r14.getResources()
            java.lang.String r14 = r14.getResourceName(r0)
            java.lang.NullPointerException r0 = new java.lang.NullPointerException
            java.lang.String r1 = "Missing required view with ID: "
            java.lang.String r14 = r1.concat(r14)
            r0.<init>(r14)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: ue0.C28737l0.m88073a(android.view.View):ue0.l0");
    }

    /* renamed from: d */
    public static C28737l0 m88074d(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(C25188h.fragment_gt_history, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return m88073a(inflate);
    }

    /* renamed from: c */
    public ConstraintLayout mo3946b() {
        return this.f73362d;
    }
}
