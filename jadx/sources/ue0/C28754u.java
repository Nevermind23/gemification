package ue0;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import androidx.swiperefreshlayout.widget.SwipeRefreshLayout;
import ie0.C25188h;
import p086g1.C6201a;
import p341ge.bog.designsystem.components.loading.LoadingView;
import p341ge.bog.designsystem.components.search.SearchView;
import p341ge.bog.mobilebank.cleanarch.presentation.common.StateView;
import p90.C27272c8;

/* renamed from: ue0.u */
public final class C28754u implements C6201a {

    /* renamed from: d */
    private final LinearLayout f73468d;

    /* renamed from: e */
    public final LoadingView f73469e;

    /* renamed from: f */
    public final RecyclerView f73470f;

    /* renamed from: g */
    public final SwipeRefreshLayout f73471g;

    /* renamed from: h */
    public final SearchView f73472h;

    /* renamed from: i */
    public final StateView f73473i;

    /* renamed from: j */
    public final LoadingView f73474j;

    /* renamed from: k */
    public final StateView f73475k;

    /* renamed from: l */
    public final TextView f73476l;

    /* renamed from: m */
    public final C27272c8 f73477m;

    private C28754u(LinearLayout linearLayout, LoadingView loadingView, RecyclerView recyclerView, SwipeRefreshLayout swipeRefreshLayout, SearchView searchView, StateView stateView, LoadingView loadingView2, StateView stateView2, TextView textView, C27272c8 c8Var) {
        this.f73468d = linearLayout;
        this.f73469e = loadingView;
        this.f73470f = recyclerView;
        this.f73471g = swipeRefreshLayout;
        this.f73472h = searchView;
        this.f73473i = stateView;
        this.f73474j = loadingView2;
        this.f73475k = stateView2;
        this.f73476l = textView;
        this.f73477m = c8Var;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:16:0x0058, code lost:
        r0 = ie0.C25187g.f64733z4;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static ue0.C28754u m88145a(android.view.View r13) {
        /*
            int r0 = ie0.C25187g.f64702j2
            android.view.View r1 = p086g1.C6202b.m24689a(r13, r0)
            r4 = r1
            ge.bog.designsystem.components.loading.LoadingView r4 = (p341ge.bog.designsystem.components.loading.LoadingView) r4
            if (r4 == 0) goto L_0x006e
            int r0 = ie0.C25187g.f64706k3
            android.view.View r1 = p086g1.C6202b.m24689a(r13, r0)
            r5 = r1
            androidx.recyclerview.widget.RecyclerView r5 = (androidx.recyclerview.widget.RecyclerView) r5
            if (r5 == 0) goto L_0x006e
            int r0 = ie0.C25187g.refresh_layout
            android.view.View r1 = p086g1.C6202b.m24689a(r13, r0)
            r6 = r1
            androidx.swiperefreshlayout.widget.SwipeRefreshLayout r6 = (androidx.swiperefreshlayout.widget.SwipeRefreshLayout) r6
            if (r6 == 0) goto L_0x006e
            int r0 = ie0.C25187g.f64729x3
            android.view.View r1 = p086g1.C6202b.m24689a(r13, r0)
            r7 = r1
            ge.bog.designsystem.components.search.SearchView r7 = (p341ge.bog.designsystem.components.search.SearchView) r7
            if (r7 == 0) goto L_0x006e
            int r0 = ie0.C25187g.f64690Z3
            android.view.View r1 = p086g1.C6202b.m24689a(r13, r0)
            r8 = r1
            ge.bog.mobilebank.cleanarch.presentation.common.StateView r8 = (p341ge.bog.mobilebank.cleanarch.presentation.common.StateView) r8
            if (r8 == 0) goto L_0x006e
            int r0 = ie0.C25187g.titleLoadingView
            android.view.View r1 = p086g1.C6202b.m24689a(r13, r0)
            r9 = r1
            ge.bog.designsystem.components.loading.LoadingView r9 = (p341ge.bog.designsystem.components.loading.LoadingView) r9
            if (r9 == 0) goto L_0x006e
            int r0 = ie0.C25187g.titleStateView
            android.view.View r1 = p086g1.C6202b.m24689a(r13, r0)
            r10 = r1
            ge.bog.mobilebank.cleanarch.presentation.common.StateView r10 = (p341ge.bog.mobilebank.cleanarch.presentation.common.StateView) r10
            if (r10 == 0) goto L_0x006e
            int r0 = ie0.C25187g.f64730x4
            android.view.View r1 = p086g1.C6202b.m24689a(r13, r0)
            r11 = r1
            android.widget.TextView r11 = (android.widget.TextView) r11
            if (r11 == 0) goto L_0x006e
            int r0 = ie0.C25187g.f64733z4
            android.view.View r1 = p086g1.C6202b.m24689a(r13, r0)
            if (r1 == 0) goto L_0x006e
            p90.c8 r12 = p90.C27272c8.m84388a(r1)
            ue0.u r0 = new ue0.u
            r3 = r13
            android.widget.LinearLayout r3 = (android.widget.LinearLayout) r3
            r2 = r0
            r2.<init>(r3, r4, r5, r6, r7, r8, r9, r10, r11, r12)
            return r0
        L_0x006e:
            android.content.res.Resources r13 = r13.getResources()
            java.lang.String r13 = r13.getResourceName(r0)
            java.lang.NullPointerException r0 = new java.lang.NullPointerException
            java.lang.String r1 = "Missing required view with ID: "
            java.lang.String r13 = r1.concat(r13)
            r0.<init>(r13)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: ue0.C28754u.m88145a(android.view.View):ue0.u");
    }

    /* renamed from: d */
    public static C28754u m88146d(LayoutInflater layoutInflater) {
        return m88147e(layoutInflater, (ViewGroup) null, false);
    }

    /* renamed from: e */
    public static C28754u m88147e(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(C25188h.activity_gt_my_investments, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return m88145a(inflate);
    }

    /* renamed from: c */
    public LinearLayout mo3946b() {
        return this.f73468d;
    }
}
