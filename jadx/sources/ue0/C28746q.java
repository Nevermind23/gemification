package ue0;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.swiperefreshlayout.widget.SwipeRefreshLayout;
import androidx.viewpager2.widget.ViewPager2;
import ie0.C25188h;
import p086g1.C6201a;
import p341ge.bog.designsystem.components.buttons.Button;
import p341ge.bog.designsystem.components.inlinefeedback.InlineFeedback;
import p341ge.bog.designsystem.components.inlinefeedback2.InlineFeedback2;
import p341ge.bog.designsystem.components.layersandshadows.LayerView;
import p341ge.bog.designsystem.components.loading.LoadingView;
import p341ge.bog.designsystem.components.search.SearchView;
import p341ge.bog.designsystem.components.tabs.TabsView;
import p341ge.bog.mobilebank.cleanarch.presentation.common.StateView;
import p90.C27272c8;

/* renamed from: ue0.q */
public final class C28746q implements C6201a {

    /* renamed from: d */
    private final ConstraintLayout f73412d;

    /* renamed from: e */
    public final Button f73413e;

    /* renamed from: f */
    public final Button f73414f;

    /* renamed from: g */
    public final Button f73415g;

    /* renamed from: h */
    public final LayerView f73416h;

    /* renamed from: i */
    public final CoordinatorLayout f73417i;

    /* renamed from: j */
    public final ConstraintLayout f73418j;

    /* renamed from: k */
    public final TabsView f73419k;

    /* renamed from: l */
    public final InlineFeedback2 f73420l;

    /* renamed from: m */
    public final LoadingView f73421m;

    /* renamed from: n */
    public final StateView f73422n;

    /* renamed from: o */
    public final InlineFeedback f73423o;

    /* renamed from: p */
    public final LayerView f73424p;

    /* renamed from: q */
    public final SwipeRefreshLayout f73425q;

    /* renamed from: r */
    public final SearchView f73426r;

    /* renamed from: s */
    public final ViewPager2 f73427s;

    /* renamed from: t */
    public final LayerView f73428t;

    /* renamed from: u */
    public final C27272c8 f73429u;

    private C28746q(ConstraintLayout constraintLayout, Button button, Button button2, Button button3, LayerView layerView, CoordinatorLayout coordinatorLayout, ConstraintLayout constraintLayout2, TabsView tabsView, InlineFeedback2 inlineFeedback2, LoadingView loadingView, StateView stateView, InlineFeedback inlineFeedback, LayerView layerView2, SwipeRefreshLayout swipeRefreshLayout, SearchView searchView, ViewPager2 viewPager2, LayerView layerView3, C27272c8 c8Var) {
        this.f73412d = constraintLayout;
        this.f73413e = button;
        this.f73414f = button2;
        this.f73415g = button3;
        this.f73416h = layerView;
        this.f73417i = coordinatorLayout;
        this.f73418j = constraintLayout2;
        this.f73419k = tabsView;
        this.f73420l = inlineFeedback2;
        this.f73421m = loadingView;
        this.f73422n = stateView;
        this.f73423o = inlineFeedback;
        this.f73424p = layerView2;
        this.f73425q = swipeRefreshLayout;
        this.f73426r = searchView;
        this.f73427s = viewPager2;
        this.f73428t = layerView3;
        this.f73429u = c8Var;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:30:0x00af, code lost:
        r1 = ie0.C25187g.f64733z4;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static ue0.C28746q m88109a(android.view.View r22) {
        /*
            r0 = r22
            int r1 = ie0.C25187g.buttonBuy
            android.view.View r2 = p086g1.C6202b.m24689a(r0, r1)
            r5 = r2
            ge.bog.designsystem.components.buttons.Button r5 = (p341ge.bog.designsystem.components.buttons.Button) r5
            if (r5 == 0) goto L_0x00c3
            int r1 = ie0.C25187g.buttonRegister
            android.view.View r2 = p086g1.C6202b.m24689a(r0, r1)
            r6 = r2
            ge.bog.designsystem.components.buttons.Button r6 = (p341ge.bog.designsystem.components.buttons.Button) r6
            if (r6 == 0) goto L_0x00c3
            int r1 = ie0.C25187g.buttonSell
            android.view.View r2 = p086g1.C6202b.m24689a(r0, r1)
            r7 = r2
            ge.bog.designsystem.components.buttons.Button r7 = (p341ge.bog.designsystem.components.buttons.Button) r7
            if (r7 == 0) goto L_0x00c3
            int r1 = ie0.C25187g.buySellButtonContainer
            android.view.View r2 = p086g1.C6202b.m24689a(r0, r1)
            r8 = r2
            ge.bog.designsystem.components.layersandshadows.LayerView r8 = (p341ge.bog.designsystem.components.layersandshadows.LayerView) r8
            if (r8 == 0) goto L_0x00c3
            int r1 = ie0.C25187g.coordinatorLayout
            android.view.View r2 = p086g1.C6202b.m24689a(r0, r1)
            r9 = r2
            androidx.coordinatorlayout.widget.CoordinatorLayout r9 = (androidx.coordinatorlayout.widget.CoordinatorLayout) r9
            if (r9 == 0) goto L_0x00c3
            r10 = r0
            androidx.constraintlayout.widget.ConstraintLayout r10 = (androidx.constraintlayout.widget.ConstraintLayout) r10
            int r1 = ie0.C25187g.gt_tabs
            android.view.View r2 = p086g1.C6202b.m24689a(r0, r1)
            r11 = r2
            ge.bog.designsystem.components.tabs.TabsView r11 = (p341ge.bog.designsystem.components.tabs.TabsView) r11
            if (r11 == 0) goto L_0x00c3
            int r1 = ie0.C25187g.identomat_feedback
            android.view.View r2 = p086g1.C6202b.m24689a(r0, r1)
            r12 = r2
            ge.bog.designsystem.components.inlinefeedback2.InlineFeedback2 r12 = (p341ge.bog.designsystem.components.inlinefeedback2.InlineFeedback2) r12
            if (r12 == 0) goto L_0x00c3
            int r1 = ie0.C25187g.loader_portfel_card
            android.view.View r2 = p086g1.C6202b.m24689a(r0, r1)
            r13 = r2
            ge.bog.designsystem.components.loading.LoadingView r13 = (p341ge.bog.designsystem.components.loading.LoadingView) r13
            if (r13 == 0) goto L_0x00c3
            int r1 = ie0.C25187g.main_state_view
            android.view.View r2 = p086g1.C6202b.m24689a(r0, r1)
            r14 = r2
            ge.bog.mobilebank.cleanarch.presentation.common.StateView r14 = (p341ge.bog.mobilebank.cleanarch.presentation.common.StateView) r14
            if (r14 == 0) goto L_0x00c3
            int r1 = ie0.C25187g.pending_status
            android.view.View r2 = p086g1.C6202b.m24689a(r0, r1)
            r15 = r2
            ge.bog.designsystem.components.inlinefeedback.InlineFeedback r15 = (p341ge.bog.designsystem.components.inlinefeedback.InlineFeedback) r15
            if (r15 == 0) goto L_0x00c3
            int r1 = ie0.C25187g.pending_status_wrapper
            android.view.View r2 = p086g1.C6202b.m24689a(r0, r1)
            r16 = r2
            ge.bog.designsystem.components.layersandshadows.LayerView r16 = (p341ge.bog.designsystem.components.layersandshadows.LayerView) r16
            if (r16 == 0) goto L_0x00c3
            int r1 = ie0.C25187g.refresh_view
            android.view.View r2 = p086g1.C6202b.m24689a(r0, r1)
            r17 = r2
            androidx.swiperefreshlayout.widget.SwipeRefreshLayout r17 = (androidx.swiperefreshlayout.widget.SwipeRefreshLayout) r17
            if (r17 == 0) goto L_0x00c3
            int r1 = ie0.C25187g.f64729x3
            android.view.View r2 = p086g1.C6202b.m24689a(r0, r1)
            r18 = r2
            ge.bog.designsystem.components.search.SearchView r18 = (p341ge.bog.designsystem.components.search.SearchView) r18
            if (r18 == 0) goto L_0x00c3
            int r1 = ie0.C25187g.tabs_view_pager
            android.view.View r2 = p086g1.C6202b.m24689a(r0, r1)
            r19 = r2
            androidx.viewpager2.widget.ViewPager2 r19 = (androidx.viewpager2.widget.ViewPager2) r19
            if (r19 == 0) goto L_0x00c3
            int r1 = ie0.C25187g.tabsWrapper
            android.view.View r2 = p086g1.C6202b.m24689a(r0, r1)
            r20 = r2
            ge.bog.designsystem.components.layersandshadows.LayerView r20 = (p341ge.bog.designsystem.components.layersandshadows.LayerView) r20
            if (r20 == 0) goto L_0x00c3
            int r1 = ie0.C25187g.f64733z4
            android.view.View r2 = p086g1.C6202b.m24689a(r0, r1)
            if (r2 == 0) goto L_0x00c3
            p90.c8 r21 = p90.C27272c8.m84388a(r2)
            ue0.q r0 = new ue0.q
            r3 = r0
            r4 = r10
            r3.<init>(r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20, r21)
            return r0
        L_0x00c3:
            android.content.res.Resources r0 = r22.getResources()
            java.lang.String r0 = r0.getResourceName(r1)
            java.lang.NullPointerException r1 = new java.lang.NullPointerException
            java.lang.String r2 = "Missing required view with ID: "
            java.lang.String r0 = r2.concat(r0)
            r1.<init>(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: ue0.C28746q.m88109a(android.view.View):ue0.q");
    }

    /* renamed from: d */
    public static C28746q m88110d(LayoutInflater layoutInflater) {
        return m88111e(layoutInflater, (ViewGroup) null, false);
    }

    /* renamed from: e */
    public static C28746q m88111e(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(C25188h.activity_gt, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return m88109a(inflate);
    }

    /* renamed from: c */
    public ConstraintLayout mo3946b() {
        return this.f73412d;
    }
}
