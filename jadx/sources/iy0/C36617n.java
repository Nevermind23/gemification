package iy0;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.recyclerview.widget.RecyclerView;
import androidx.swiperefreshlayout.widget.SwipeRefreshLayout;
import hy0.C36272f;
import p086g1.C6201a;
import p90.C27272c8;

/* renamed from: iy0.n */
public final class C36617n implements C6201a {

    /* renamed from: d */
    private final CoordinatorLayout f88330d;

    /* renamed from: e */
    public final RecyclerView f88331e;

    /* renamed from: f */
    public final FrameLayout f88332f;

    /* renamed from: g */
    public final SwipeRefreshLayout f88333g;

    /* renamed from: h */
    public final C27272c8 f88334h;

    private C36617n(CoordinatorLayout coordinatorLayout, RecyclerView recyclerView, FrameLayout frameLayout, SwipeRefreshLayout swipeRefreshLayout, C27272c8 c8Var) {
        this.f88330d = coordinatorLayout;
        this.f88331e = recyclerView;
        this.f88332f = frameLayout;
        this.f88333g = swipeRefreshLayout;
        this.f88334h = c8Var;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:6:0x0021, code lost:
        r0 = hy0.C36271e.f87549u2;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static iy0.C36617n m108601a(android.view.View r8) {
        /*
            int r0 = hy0.C36271e.f87520h1
            android.view.View r1 = p086g1.C6202b.m24689a(r8, r0)
            r4 = r1
            androidx.recyclerview.widget.RecyclerView r4 = (androidx.recyclerview.widget.RecyclerView) r4
            if (r4 == 0) goto L_0x0037
            int r0 = hy0.C36271e.f87500U1
            android.view.View r1 = p086g1.C6202b.m24689a(r8, r0)
            r5 = r1
            android.widget.FrameLayout r5 = (android.widget.FrameLayout) r5
            if (r5 == 0) goto L_0x0037
            int r0 = hy0.C36271e.f87504X1
            android.view.View r1 = p086g1.C6202b.m24689a(r8, r0)
            r6 = r1
            androidx.swiperefreshlayout.widget.SwipeRefreshLayout r6 = (androidx.swiperefreshlayout.widget.SwipeRefreshLayout) r6
            if (r6 == 0) goto L_0x0037
            int r0 = hy0.C36271e.f87549u2
            android.view.View r1 = p086g1.C6202b.m24689a(r8, r0)
            if (r1 == 0) goto L_0x0037
            p90.c8 r7 = p90.C27272c8.m84388a(r1)
            iy0.n r0 = new iy0.n
            r3 = r8
            androidx.coordinatorlayout.widget.CoordinatorLayout r3 = (androidx.coordinatorlayout.widget.CoordinatorLayout) r3
            r2 = r0
            r2.<init>(r3, r4, r5, r6, r7)
            return r0
        L_0x0037:
            android.content.res.Resources r8 = r8.getResources()
            java.lang.String r8 = r8.getResourceName(r0)
            java.lang.NullPointerException r0 = new java.lang.NullPointerException
            java.lang.String r1 = "Missing required view with ID: "
            java.lang.String r8 = r1.concat(r8)
            r0.<init>(r8)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: iy0.C36617n.m108601a(android.view.View):iy0.n");
    }

    /* renamed from: d */
    public static C36617n m108602d(LayoutInflater layoutInflater) {
        return m108603e(layoutInflater, (ViewGroup) null, false);
    }

    /* renamed from: e */
    public static C36617n m108603e(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(C36272f.activity_product_list, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return m108601a(inflate);
    }

    /* renamed from: c */
    public CoordinatorLayout mo3946b() {
        return this.f88330d;
    }
}
