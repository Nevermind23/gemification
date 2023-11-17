package ue0;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.swiperefreshlayout.widget.SwipeRefreshLayout;
import ie0.C25188h;
import p086g1.C6201a;
import p341ge.bog.designsystem.components.balancewidget.BalanceWidgetView;
import p341ge.bog.designsystem.components.buttonlist.ButtonListView;
import p341ge.bog.designsystem.components.inlinefeedback.InlineFeedback;
import p341ge.bog.designsystem.components.list.ListItem;
import p341ge.bog.designsystem.components.loading.LoadingView;
import p341ge.bog.mobilebank.cleanarch.presentation.common.StateView;

/* renamed from: ue0.m0 */
public final class C28739m0 implements C6201a {

    /* renamed from: d */
    private final SwipeRefreshLayout f73376d;

    /* renamed from: e */
    public final ListItem f73377e;

    /* renamed from: f */
    public final FrameLayout f73378f;

    /* renamed from: g */
    public final StateView f73379g;

    /* renamed from: h */
    public final ButtonListView f73380h;

    /* renamed from: i */
    public final C28711a1 f73381i;

    /* renamed from: j */
    public final InlineFeedback f73382j;

    /* renamed from: k */
    public final LoadingView f73383k;

    /* renamed from: l */
    public final LoadingView f73384l;

    /* renamed from: m */
    public final BalanceWidgetView f73385m;

    /* renamed from: n */
    public final StateView f73386n;

    /* renamed from: o */
    public final SwipeRefreshLayout f73387o;

    private C28739m0(SwipeRefreshLayout swipeRefreshLayout, ListItem listItem, FrameLayout frameLayout, StateView stateView, ButtonListView buttonListView, C28711a1 a1Var, InlineFeedback inlineFeedback, LoadingView loadingView, LoadingView loadingView2, BalanceWidgetView balanceWidgetView, StateView stateView2, SwipeRefreshLayout swipeRefreshLayout2) {
        this.f73376d = swipeRefreshLayout;
        this.f73377e = listItem;
        this.f73378f = frameLayout;
        this.f73379g = stateView;
        this.f73380h = buttonListView;
        this.f73381i = a1Var;
        this.f73382j = inlineFeedback;
        this.f73383k = loadingView;
        this.f73384l = loadingView2;
        this.f73385m = balanceWidgetView;
        this.f73386n = stateView2;
        this.f73387o = swipeRefreshLayout2;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:8:0x002c, code lost:
        r0 = ie0.C25187g.chart_container;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static ue0.C28739m0 m88081a(android.view.View r15) {
        /*
            int r0 = ie0.C25187g.buyingPower
            android.view.View r1 = p086g1.C6202b.m24689a(r15, r0)
            r4 = r1
            ge.bog.designsystem.components.list.ListItem r4 = (p341ge.bog.designsystem.components.list.ListItem) r4
            if (r4 == 0) goto L_0x007a
            int r0 = ie0.C25187g.buyingPowerContainer
            android.view.View r1 = p086g1.C6202b.m24689a(r15, r0)
            r5 = r1
            android.widget.FrameLayout r5 = (android.widget.FrameLayout) r5
            if (r5 == 0) goto L_0x007a
            int r0 = ie0.C25187g.buyingPowerStateView
            android.view.View r1 = p086g1.C6202b.m24689a(r15, r0)
            r6 = r1
            ge.bog.mobilebank.cleanarch.presentation.common.StateView r6 = (p341ge.bog.mobilebank.cleanarch.presentation.common.StateView) r6
            if (r6 == 0) goto L_0x007a
            int r0 = ie0.C25187g.buyingPowerZero
            android.view.View r1 = p086g1.C6202b.m24689a(r15, r0)
            r7 = r1
            ge.bog.designsystem.components.buttonlist.ButtonListView r7 = (p341ge.bog.designsystem.components.buttonlist.ButtonListView) r7
            if (r7 == 0) goto L_0x007a
            int r0 = ie0.C25187g.chart_container
            android.view.View r1 = p086g1.C6202b.m24689a(r15, r0)
            if (r1 == 0) goto L_0x007a
            ue0.a1 r8 = ue0.C28711a1.m87961a(r1)
            int r0 = ie0.C25187g.infoClosedMarket
            android.view.View r1 = p086g1.C6202b.m24689a(r15, r0)
            r9 = r1
            ge.bog.designsystem.components.inlinefeedback.InlineFeedback r9 = (p341ge.bog.designsystem.components.inlinefeedback.InlineFeedback) r9
            if (r9 == 0) goto L_0x007a
            int r0 = ie0.C25187g.loaderPortfelCard
            android.view.View r1 = p086g1.C6202b.m24689a(r15, r0)
            r10 = r1
            ge.bog.designsystem.components.loading.LoadingView r10 = (p341ge.bog.designsystem.components.loading.LoadingView) r10
            if (r10 == 0) goto L_0x007a
            int r0 = ie0.C25187g.f64702j2
            android.view.View r1 = p086g1.C6202b.m24689a(r15, r0)
            r11 = r1
            ge.bog.designsystem.components.loading.LoadingView r11 = (p341ge.bog.designsystem.components.loading.LoadingView) r11
            if (r11 == 0) goto L_0x007a
            int r0 = ie0.C25187g.portfelCard
            android.view.View r1 = p086g1.C6202b.m24689a(r15, r0)
            r12 = r1
            ge.bog.designsystem.components.balancewidget.BalanceWidgetView r12 = (p341ge.bog.designsystem.components.balancewidget.BalanceWidgetView) r12
            if (r12 == 0) goto L_0x007a
            int r0 = ie0.C25187g.portfel_state_view
            android.view.View r1 = p086g1.C6202b.m24689a(r15, r0)
            r13 = r1
            ge.bog.mobilebank.cleanarch.presentation.common.StateView r13 = (p341ge.bog.mobilebank.cleanarch.presentation.common.StateView) r13
            if (r13 == 0) goto L_0x007a
            r14 = r15
            androidx.swiperefreshlayout.widget.SwipeRefreshLayout r14 = (androidx.swiperefreshlayout.widget.SwipeRefreshLayout) r14
            ue0.m0 r15 = new ue0.m0
            r2 = r15
            r3 = r14
            r2.<init>(r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14)
            return r15
        L_0x007a:
            android.content.res.Resources r15 = r15.getResources()
            java.lang.String r15 = r15.getResourceName(r0)
            java.lang.NullPointerException r0 = new java.lang.NullPointerException
            java.lang.String r1 = "Missing required view with ID: "
            java.lang.String r15 = r1.concat(r15)
            r0.<init>(r15)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: ue0.C28739m0.m88081a(android.view.View):ue0.m0");
    }

    /* renamed from: d */
    public static C28739m0 m88082d(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(C25188h.fragment_gt_portfolio, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return m88081a(inflate);
    }

    /* renamed from: c */
    public SwipeRefreshLayout mo3946b() {
        return this.f73376d;
    }
}
