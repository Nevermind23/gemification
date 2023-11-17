package p536nl;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.recyclerview.widget.RecyclerView;
import p086g1.C6201a;
import p341ge.bog.designsystem.components.loading.LoadingView;
import p341ge.bog.designsystem.components.tabs.TabsView;
import p341ge.bog.mobilebank.cleanarch.presentation.common.StateView;
import p480jl.C16214e;
import p90.C27272c8;

/* renamed from: nl.e */
public final class C17052e implements C6201a {

    /* renamed from: d */
    private final LinearLayout f47589d;

    /* renamed from: e */
    public final TabsView f47590e;

    /* renamed from: f */
    public final StateView f47591f;

    /* renamed from: g */
    public final RecyclerView f47592g;

    /* renamed from: h */
    public final LoadingView f47593h;

    /* renamed from: i */
    public final C27272c8 f47594i;

    private C17052e(LinearLayout linearLayout, TabsView tabsView, StateView stateView, RecyclerView recyclerView, LoadingView loadingView, C27272c8 c8Var) {
        this.f47589d = linearLayout;
        this.f47590e = tabsView;
        this.f47591f = stateView;
        this.f47592g = recyclerView;
        this.f47593h = loadingView;
        this.f47594i = c8Var;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:8:0x002c, code lost:
        r0 = p480jl.C16213d.f45723D0;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static p536nl.C17052e m59909a(android.view.View r9) {
        /*
            int r0 = p480jl.C16213d.f45750o
            android.view.View r1 = p086g1.C6202b.m24689a(r9, r0)
            r4 = r1
            ge.bog.designsystem.components.tabs.TabsView r4 = (p341ge.bog.designsystem.components.tabs.TabsView) r4
            if (r4 == 0) goto L_0x0042
            int r0 = p480jl.C16213d.f45736U
            android.view.View r1 = p086g1.C6202b.m24689a(r9, r0)
            r5 = r1
            ge.bog.mobilebank.cleanarch.presentation.common.StateView r5 = (p341ge.bog.mobilebank.cleanarch.presentation.common.StateView) r5
            if (r5 == 0) goto L_0x0042
            int r0 = p480jl.C16213d.f45743j0
            android.view.View r1 = p086g1.C6202b.m24689a(r9, r0)
            r6 = r1
            androidx.recyclerview.widget.RecyclerView r6 = (androidx.recyclerview.widget.RecyclerView) r6
            if (r6 == 0) goto L_0x0042
            int r0 = p480jl.C16213d.f45744k0
            android.view.View r1 = p086g1.C6202b.m24689a(r9, r0)
            r7 = r1
            ge.bog.designsystem.components.loading.LoadingView r7 = (p341ge.bog.designsystem.components.loading.LoadingView) r7
            if (r7 == 0) goto L_0x0042
            int r0 = p480jl.C16213d.f45723D0
            android.view.View r1 = p086g1.C6202b.m24689a(r9, r0)
            if (r1 == 0) goto L_0x0042
            p90.c8 r8 = p90.C27272c8.m84388a(r1)
            nl.e r0 = new nl.e
            r3 = r9
            android.widget.LinearLayout r3 = (android.widget.LinearLayout) r3
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
        throw new UnsupportedOperationException("Method not decompiled: p536nl.C17052e.m59909a(android.view.View):nl.e");
    }

    /* renamed from: d */
    public static C17052e m59910d(LayoutInflater layoutInflater) {
        return m59911e(layoutInflater, (ViewGroup) null, false);
    }

    /* renamed from: e */
    public static C17052e m59911e(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(C16214e.activity_bnpl_categories, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return m59909a(inflate);
    }

    /* renamed from: c */
    public LinearLayout mo3946b() {
        return this.f47589d;
    }
}
