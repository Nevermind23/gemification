package xn0;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.recyclerview.widget.RecyclerView;
import p086g1.C6201a;
import p341ge.bog.mobilebank.p975ui.components.BogSwipeRefreshLayout;
import p90.C27486z7;
import sn0.C17902f;

/* renamed from: xn0.i */
public final class C18851i implements C6201a {

    /* renamed from: d */
    private final CoordinatorLayout f52749d;

    /* renamed from: e */
    public final FrameLayout f52750e;

    /* renamed from: f */
    public final RecyclerView f52751f;

    /* renamed from: g */
    public final C27486z7 f52752g;

    /* renamed from: h */
    public final FrameLayout f52753h;

    /* renamed from: i */
    public final BogSwipeRefreshLayout f52754i;

    private C18851i(CoordinatorLayout coordinatorLayout, FrameLayout frameLayout, RecyclerView recyclerView, C27486z7 z7Var, FrameLayout frameLayout2, BogSwipeRefreshLayout bogSwipeRefreshLayout) {
        this.f52749d = coordinatorLayout;
        this.f52750e = frameLayout;
        this.f52751f = recyclerView;
        this.f52752g = z7Var;
        this.f52753h = frameLayout2;
        this.f52754i = bogSwipeRefreshLayout;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:4:0x0016, code lost:
        r0 = sn0.C17901e.f50963d0;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static xn0.C18851i m63774a(android.view.View r9) {
        /*
            int r0 = sn0.C17901e.f50954K
            android.view.View r1 = p086g1.C6202b.m24689a(r9, r0)
            r4 = r1
            android.widget.FrameLayout r4 = (android.widget.FrameLayout) r4
            if (r4 == 0) goto L_0x0042
            int r0 = sn0.C17901e.f50961b0
            android.view.View r1 = p086g1.C6202b.m24689a(r9, r0)
            r5 = r1
            androidx.recyclerview.widget.RecyclerView r5 = (androidx.recyclerview.widget.RecyclerView) r5
            if (r5 == 0) goto L_0x0042
            int r0 = sn0.C17901e.f50963d0
            android.view.View r1 = p086g1.C6202b.m24689a(r9, r0)
            if (r1 == 0) goto L_0x0042
            p90.z7 r6 = p90.C27486z7.m85250a(r1)
            int r0 = sn0.C17901e.f50964e0
            android.view.View r1 = p086g1.C6202b.m24689a(r9, r0)
            r7 = r1
            android.widget.FrameLayout r7 = (android.widget.FrameLayout) r7
            if (r7 == 0) goto L_0x0042
            int r0 = sn0.C17901e.f50973j0
            android.view.View r1 = p086g1.C6202b.m24689a(r9, r0)
            r8 = r1
            ge.bog.mobilebank.ui.components.BogSwipeRefreshLayout r8 = (p341ge.bog.mobilebank.p975ui.components.BogSwipeRefreshLayout) r8
            if (r8 == 0) goto L_0x0042
            xn0.i r0 = new xn0.i
            r3 = r9
            androidx.coordinatorlayout.widget.CoordinatorLayout r3 = (androidx.coordinatorlayout.widget.CoordinatorLayout) r3
            r2 = r0
            r2.<init>(r3, r4, r5, r6, r7, r8)
            return r0
        L_0x0042:
            android.content.res.Resources r9 = r9.getResources()
            java.lang.String r9 = r9.getResourceName(r0)
            java.lang.NullPointerException r0 = new java.lang.NullPointerException
            java.lang.String r1 = "Missing required view with ID: "
            java.lang.String r9 = r1.concat(r9)
            r0.<init>(r9)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: xn0.C18851i.m63774a(android.view.View):xn0.i");
    }

    /* renamed from: d */
    public static C18851i m63775d(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(C17902f.fragment_lifestyle_offers, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return m63774a(inflate);
    }

    /* renamed from: c */
    public CoordinatorLayout mo3946b() {
        return this.f52749d;
    }
}
