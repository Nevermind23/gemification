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
import p341ge.bog.designsystem.components.buttons.Button;
import p341ge.bog.designsystem.components.pagedescription.PageDescriptionView;
import p341ge.bog.designsystem.components.search.SearchView;
import p341ge.bog.mobilebank.cleanarch.presentation.common.StateView;
import p90.C27272c8;

/* renamed from: ue0.j0 */
public final class C28733j0 implements C6201a {

    /* renamed from: d */
    private final ConstraintLayout f73312d;

    /* renamed from: e */
    public final Button f73313e;

    /* renamed from: f */
    public final LinearLayout f73314f;

    /* renamed from: g */
    public final C28714b1 f73315g;

    /* renamed from: h */
    public final C28714b1 f73316h;

    /* renamed from: i */
    public final Button f73317i;

    /* renamed from: j */
    public final PageDescriptionView f73318j;

    /* renamed from: k */
    public final RecyclerView f73319k;

    /* renamed from: l */
    public final SearchView f73320l;

    /* renamed from: m */
    public final StateView f73321m;

    /* renamed from: n */
    public final SwipeRefreshLayout f73322n;

    /* renamed from: o */
    public final C27272c8 f73323o;

    private C28733j0(ConstraintLayout constraintLayout, Button button, LinearLayout linearLayout, C28714b1 b1Var, C28714b1 b1Var2, Button button2, PageDescriptionView pageDescriptionView, RecyclerView recyclerView, SearchView searchView, StateView stateView, SwipeRefreshLayout swipeRefreshLayout, C27272c8 c8Var) {
        this.f73312d = constraintLayout;
        this.f73313e = button;
        this.f73314f = linearLayout;
        this.f73315g = b1Var;
        this.f73316h = b1Var2;
        this.f73317i = button2;
        this.f73318j = pageDescriptionView;
        this.f73319k = recyclerView;
        this.f73320l = searchView;
        this.f73321m = stateView;
        this.f73322n = swipeRefreshLayout;
        this.f73323o = c8Var;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:20:0x0070, code lost:
        r0 = ie0.C25187g.f64733z4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:4:0x0016, code lost:
        r0 = ie0.C25187g.loadingView1;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static ue0.C28733j0 m88055a(android.view.View r15) {
        /*
            int r0 = ie0.C25187g.button_create_stock
            android.view.View r1 = p086g1.C6202b.m24689a(r15, r0)
            r4 = r1
            ge.bog.designsystem.components.buttons.Button r4 = (p341ge.bog.designsystem.components.buttons.Button) r4
            if (r4 == 0) goto L_0x0086
            int r0 = ie0.C25187g.f64702j2
            android.view.View r1 = p086g1.C6202b.m24689a(r15, r0)
            r5 = r1
            android.widget.LinearLayout r5 = (android.widget.LinearLayout) r5
            if (r5 == 0) goto L_0x0086
            int r0 = ie0.C25187g.loadingView1
            android.view.View r1 = p086g1.C6202b.m24689a(r15, r0)
            if (r1 == 0) goto L_0x0086
            ue0.b1 r6 = ue0.C28714b1.m87973a(r1)
            int r0 = ie0.C25187g.loadingView2
            android.view.View r1 = p086g1.C6202b.m24689a(r15, r0)
            if (r1 == 0) goto L_0x0086
            ue0.b1 r7 = ue0.C28714b1.m87973a(r1)
            int r0 = ie0.C25187g.page_desc_button
            android.view.View r1 = p086g1.C6202b.m24689a(r15, r0)
            r8 = r1
            ge.bog.designsystem.components.buttons.Button r8 = (p341ge.bog.designsystem.components.buttons.Button) r8
            if (r8 == 0) goto L_0x0086
            int r0 = ie0.C25187g.f64675I2
            android.view.View r1 = p086g1.C6202b.m24689a(r15, r0)
            r9 = r1
            ge.bog.designsystem.components.pagedescription.PageDescriptionView r9 = (p341ge.bog.designsystem.components.pagedescription.PageDescriptionView) r9
            if (r9 == 0) goto L_0x0086
            int r0 = ie0.C25187g.f64706k3
            android.view.View r1 = p086g1.C6202b.m24689a(r15, r0)
            r10 = r1
            androidx.recyclerview.widget.RecyclerView r10 = (androidx.recyclerview.widget.RecyclerView) r10
            if (r10 == 0) goto L_0x0086
            int r0 = ie0.C25187g.f64729x3
            android.view.View r1 = p086g1.C6202b.m24689a(r15, r0)
            r11 = r1
            ge.bog.designsystem.components.search.SearchView r11 = (p341ge.bog.designsystem.components.search.SearchView) r11
            if (r11 == 0) goto L_0x0086
            int r0 = ie0.C25187g.f64690Z3
            android.view.View r1 = p086g1.C6202b.m24689a(r15, r0)
            r12 = r1
            ge.bog.mobilebank.cleanarch.presentation.common.StateView r12 = (p341ge.bog.mobilebank.cleanarch.presentation.common.StateView) r12
            if (r12 == 0) goto L_0x0086
            int r0 = ie0.C25187g.f64693d4
            android.view.View r1 = p086g1.C6202b.m24689a(r15, r0)
            r13 = r1
            androidx.swiperefreshlayout.widget.SwipeRefreshLayout r13 = (androidx.swiperefreshlayout.widget.SwipeRefreshLayout) r13
            if (r13 == 0) goto L_0x0086
            int r0 = ie0.C25187g.f64733z4
            android.view.View r1 = p086g1.C6202b.m24689a(r15, r0)
            if (r1 == 0) goto L_0x0086
            p90.c8 r14 = p90.C27272c8.m84388a(r1)
            ue0.j0 r0 = new ue0.j0
            r3 = r15
            androidx.constraintlayout.widget.ConstraintLayout r3 = (androidx.constraintlayout.widget.ConstraintLayout) r3
            r2 = r0
            r2.<init>(r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14)
            return r0
        L_0x0086:
            android.content.res.Resources r15 = r15.getResources()
            java.lang.String r15 = r15.getResourceName(r0)
            java.lang.NullPointerException r0 = new java.lang.NullPointerException
            java.lang.String r1 = "Missing required view with ID: "
            java.lang.String r15 = r1.concat(r15)
            r0.<init>(r15)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: ue0.C28733j0.m88055a(android.view.View):ue0.j0");
    }

    /* renamed from: d */
    public static C28733j0 m88056d(LayoutInflater layoutInflater) {
        return m88057e(layoutInflater, (ViewGroup) null, false);
    }

    /* renamed from: e */
    public static C28733j0 m88057e(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(C25188h.activity_gt_watchlist_details, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return m88055a(inflate);
    }

    /* renamed from: c */
    public ConstraintLayout mo3946b() {
        return this.f73312d;
    }
}
