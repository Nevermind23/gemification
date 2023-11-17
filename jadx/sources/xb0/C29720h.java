package xb0;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.Group;
import androidx.core.widget.NestedScrollView;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewpager2.widget.ViewPager2;
import com.google.android.material.appbar.AppBarLayout;
import p086g1.C6201a;
import p341ge.bog.designsystem.components.buttons.Button;
import p341ge.bog.designsystem.components.emptywidget.EmptyWidget;
import p341ge.bog.designsystem.components.inlinefeedback2.InlineFeedback2;
import p341ge.bog.designsystem.components.layersandshadows.LayerView;
import p341ge.bog.designsystem.components.loading.LoadingView;
import p341ge.bog.designsystem.components.pagestate.PageState;
import p341ge.bog.designsystem.components.textprogressbar.TextProgressBarView;
import p341ge.bog.designsystem.components.toolbar.ToolbarView;
import p341ge.bog.mobilebank.cleanarch.presentation.common.StateView;
import rb0.C27986e;

/* renamed from: xb0.h */
public final class C29720h implements C6201a {

    /* renamed from: A */
    public final Button f75047A;

    /* renamed from: B */
    public final PageState f75048B;

    /* renamed from: C */
    public final ToolbarView f75049C;

    /* renamed from: D */
    public final Button f75050D;

    /* renamed from: E */
    public final Button f75051E;

    /* renamed from: d */
    private final ConstraintLayout f75052d;

    /* renamed from: e */
    public final LayerView f75053e;

    /* renamed from: f */
    public final C29738z f75054f;

    /* renamed from: g */
    public final AppBarLayout f75055g;

    /* renamed from: h */
    public final RecyclerView f75056h;

    /* renamed from: i */
    public final C29738z f75057i;

    /* renamed from: j */
    public final C29738z f75058j;

    /* renamed from: k */
    public final FrameLayout f75059k;

    /* renamed from: l */
    public final ViewPager2 f75060l;

    /* renamed from: m */
    public final C29738z f75061m;

    /* renamed from: n */
    public final ConstraintLayout f75062n;

    /* renamed from: o */
    public final StateView f75063o;

    /* renamed from: p */
    public final NestedScrollView f75064p;

    /* renamed from: q */
    public final InlineFeedback2 f75065q;

    /* renamed from: r */
    public final FrameLayout f75066r;

    /* renamed from: s */
    public final Button f75067s;

    /* renamed from: t */
    public final TextProgressBarView f75068t;

    /* renamed from: u */
    public final LayerView f75069u;

    /* renamed from: v */
    public final EmptyWidget f75070v;

    /* renamed from: w */
    public final FrameLayout f75071w;

    /* renamed from: x */
    public final Button f75072x;

    /* renamed from: y */
    public final LoadingView f75073y;

    /* renamed from: z */
    public final Group f75074z;

    private C29720h(ConstraintLayout constraintLayout, LayerView layerView, C29738z zVar, AppBarLayout appBarLayout, RecyclerView recyclerView, C29738z zVar2, C29738z zVar3, FrameLayout frameLayout, ViewPager2 viewPager2, C29738z zVar4, ConstraintLayout constraintLayout2, StateView stateView, NestedScrollView nestedScrollView, InlineFeedback2 inlineFeedback2, FrameLayout frameLayout2, Button button, TextProgressBarView textProgressBarView, LayerView layerView2, EmptyWidget emptyWidget, FrameLayout frameLayout3, Button button2, LoadingView loadingView, Group group, Button button3, PageState pageState, ToolbarView toolbarView, Button button4, Button button5) {
        this.f75052d = constraintLayout;
        this.f75053e = layerView;
        this.f75054f = zVar;
        this.f75055g = appBarLayout;
        this.f75056h = recyclerView;
        this.f75057i = zVar2;
        this.f75058j = zVar3;
        this.f75059k = frameLayout;
        this.f75060l = viewPager2;
        this.f75061m = zVar4;
        this.f75062n = constraintLayout2;
        this.f75063o = stateView;
        this.f75064p = nestedScrollView;
        this.f75065q = inlineFeedback2;
        this.f75066r = frameLayout2;
        this.f75067s = button;
        this.f75068t = textProgressBarView;
        this.f75069u = layerView2;
        this.f75070v = emptyWidget;
        this.f75071w = frameLayout3;
        this.f75072x = button2;
        this.f75073y = loadingView;
        this.f75074z = group;
        this.f75047A = button3;
        this.f75048B = pageState;
        this.f75049C = toolbarView;
        this.f75050D = button4;
        this.f75051E = button5;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:16:0x005d, code lost:
        r1 = rb0.C27985d.interest_section;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:2:0x000d, code lost:
        r1 = rb0.C27985d.additional_functions_section;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:8:0x002f, code lost:
        r1 = rb0.C27985d.deposit_details_section;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static xb0.C29720h m90245a(android.view.View r32) {
        /*
            r0 = r32
            int r1 = rb0.C27985d.action_buttons_layer
            android.view.View r2 = p086g1.C6202b.m24689a(r0, r1)
            r5 = r2
            ge.bog.designsystem.components.layersandshadows.LayerView r5 = (p341ge.bog.designsystem.components.layersandshadows.LayerView) r5
            if (r5 == 0) goto L_0x0149
            int r1 = rb0.C27985d.additional_functions_section
            android.view.View r2 = p086g1.C6202b.m24689a(r0, r1)
            if (r2 == 0) goto L_0x0149
            xb0.z r6 = xb0.C29738z.m90317a(r2)
            int r1 = rb0.C27985d.f71295t
            android.view.View r2 = p086g1.C6202b.m24689a(r0, r1)
            r7 = r2
            com.google.android.material.appbar.AppBarLayout r7 = (com.google.android.material.appbar.AppBarLayout) r7
            if (r7 == 0) goto L_0x0149
            int r1 = rb0.C27985d.banners_recycler
            android.view.View r2 = p086g1.C6202b.m24689a(r0, r1)
            r8 = r2
            androidx.recyclerview.widget.RecyclerView r8 = (androidx.recyclerview.widget.RecyclerView) r8
            if (r8 == 0) goto L_0x0149
            int r1 = rb0.C27985d.deposit_details_section
            android.view.View r2 = p086g1.C6202b.m24689a(r0, r1)
            if (r2 == 0) goto L_0x0149
            xb0.z r9 = xb0.C29738z.m90317a(r2)
            int r1 = rb0.C27985d.deposit_operations_section
            android.view.View r2 = p086g1.C6202b.m24689a(r0, r1)
            if (r2 == 0) goto L_0x0149
            xb0.z r10 = xb0.C29738z.m90317a(r2)
            int r1 = rb0.C27985d.f71276d0
            android.view.View r2 = p086g1.C6202b.m24689a(r0, r1)
            r11 = r2
            android.widget.FrameLayout r11 = (android.widget.FrameLayout) r11
            if (r11 == 0) goto L_0x0149
            int r1 = rb0.C27985d.f71284k0
            android.view.View r2 = p086g1.C6202b.m24689a(r0, r1)
            r12 = r2
            androidx.viewpager2.widget.ViewPager2 r12 = (androidx.viewpager2.widget.ViewPager2) r12
            if (r12 == 0) goto L_0x0149
            int r1 = rb0.C27985d.interest_section
            android.view.View r2 = p086g1.C6202b.m24689a(r0, r1)
            if (r2 == 0) goto L_0x0149
            xb0.z r13 = xb0.C29738z.m90317a(r2)
            int r1 = rb0.C27985d.f71298x0
            android.view.View r2 = p086g1.C6202b.m24689a(r0, r1)
            r14 = r2
            androidx.constraintlayout.widget.ConstraintLayout r14 = (androidx.constraintlayout.widget.ConstraintLayout) r14
            if (r14 == 0) goto L_0x0149
            int r1 = rb0.C27985d.f71300y0
            android.view.View r2 = p086g1.C6202b.m24689a(r0, r1)
            r15 = r2
            ge.bog.mobilebank.cleanarch.presentation.common.StateView r15 = (p341ge.bog.mobilebank.cleanarch.presentation.common.StateView) r15
            if (r15 == 0) goto L_0x0149
            int r1 = rb0.C27985d.f71254C0
            android.view.View r2 = p086g1.C6202b.m24689a(r0, r1)
            r16 = r2
            androidx.core.widget.NestedScrollView r16 = (androidx.core.widget.NestedScrollView) r16
            if (r16 == 0) goto L_0x0149
            int r1 = rb0.C27985d.prolongation_info
            android.view.View r2 = p086g1.C6202b.m24689a(r0, r1)
            r17 = r2
            ge.bog.designsystem.components.inlinefeedback2.InlineFeedback2 r17 = (p341ge.bog.designsystem.components.inlinefeedback2.InlineFeedback2) r17
            if (r17 == 0) goto L_0x0149
            int r1 = rb0.C27985d.f71265N0
            android.view.View r2 = p086g1.C6202b.m24689a(r0, r1)
            r18 = r2
            android.widget.FrameLayout r18 = (android.widget.FrameLayout) r18
            if (r18 == 0) goto L_0x0149
            int r1 = rb0.C27985d.f71266O0
            android.view.View r2 = p086g1.C6202b.m24689a(r0, r1)
            r19 = r2
            ge.bog.designsystem.components.buttons.Button r19 = (p341ge.bog.designsystem.components.buttons.Button) r19
            if (r19 == 0) goto L_0x0149
            int r1 = rb0.C27985d.saving_goal
            android.view.View r2 = p086g1.C6202b.m24689a(r0, r1)
            r20 = r2
            ge.bog.designsystem.components.textprogressbar.TextProgressBarView r20 = (p341ge.bog.designsystem.components.textprogressbar.TextProgressBarView) r20
            if (r20 == 0) goto L_0x0149
            int r1 = rb0.C27985d.saving_goal_layer
            android.view.View r2 = p086g1.C6202b.m24689a(r0, r1)
            r21 = r2
            ge.bog.designsystem.components.layersandshadows.LayerView r21 = (p341ge.bog.designsystem.components.layersandshadows.LayerView) r21
            if (r21 == 0) goto L_0x0149
            int r1 = rb0.C27985d.saving_goals_header
            android.view.View r2 = p086g1.C6202b.m24689a(r0, r1)
            r22 = r2
            ge.bog.designsystem.components.emptywidget.EmptyWidget r22 = (p341ge.bog.designsystem.components.emptywidget.EmptyWidget) r22
            if (r22 == 0) goto L_0x0149
            int r1 = rb0.C27985d.f71272X0
            android.view.View r2 = p086g1.C6202b.m24689a(r0, r1)
            r23 = r2
            android.widget.FrameLayout r23 = (android.widget.FrameLayout) r23
            if (r23 == 0) goto L_0x0149
            int r1 = rb0.C27985d.single_action_button
            android.view.View r2 = p086g1.C6202b.m24689a(r0, r1)
            r24 = r2
            ge.bog.designsystem.components.buttons.Button r24 = (p341ge.bog.designsystem.components.buttons.Button) r24
            if (r24 == 0) goto L_0x0149
            int r1 = rb0.C27985d.f71281g1
            android.view.View r2 = p086g1.C6202b.m24689a(r0, r1)
            r25 = r2
            ge.bog.designsystem.components.loading.LoadingView r25 = (p341ge.bog.designsystem.components.loading.LoadingView) r25
            if (r25 == 0) goto L_0x0149
            int r1 = rb0.C27985d.small_action_buttons
            android.view.View r2 = p086g1.C6202b.m24689a(r0, r1)
            r26 = r2
            androidx.constraintlayout.widget.Group r26 = (androidx.constraintlayout.widget.Group) r26
            if (r26 == 0) goto L_0x0149
            int r1 = rb0.C27985d.statement_button
            android.view.View r2 = p086g1.C6202b.m24689a(r0, r1)
            r27 = r2
            ge.bog.designsystem.components.buttons.Button r27 = (p341ge.bog.designsystem.components.buttons.Button) r27
            if (r27 == 0) goto L_0x0149
            int r1 = rb0.C27985d.f71285k1
            android.view.View r2 = p086g1.C6202b.m24689a(r0, r1)
            r28 = r2
            ge.bog.designsystem.components.pagestate.PageState r28 = (p341ge.bog.designsystem.components.pagestate.PageState) r28
            if (r28 == 0) goto L_0x0149
            int r1 = rb0.C27985d.f71294s1
            android.view.View r2 = p086g1.C6202b.m24689a(r0, r1)
            r29 = r2
            ge.bog.designsystem.components.toolbar.ToolbarView r29 = (p341ge.bog.designsystem.components.toolbar.ToolbarView) r29
            if (r29 == 0) goto L_0x0149
            int r1 = rb0.C27985d.top_up_button
            android.view.View r2 = p086g1.C6202b.m24689a(r0, r1)
            r30 = r2
            ge.bog.designsystem.components.buttons.Button r30 = (p341ge.bog.designsystem.components.buttons.Button) r30
            if (r30 == 0) goto L_0x0149
            int r1 = rb0.C27985d.f71297w1
            android.view.View r2 = p086g1.C6202b.m24689a(r0, r1)
            r31 = r2
            ge.bog.designsystem.components.buttons.Button r31 = (p341ge.bog.designsystem.components.buttons.Button) r31
            if (r31 == 0) goto L_0x0149
            xb0.h r1 = new xb0.h
            r3 = r1
            r4 = r0
            androidx.constraintlayout.widget.ConstraintLayout r4 = (androidx.constraintlayout.widget.ConstraintLayout) r4
            r3.<init>(r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20, r21, r22, r23, r24, r25, r26, r27, r28, r29, r30, r31)
            return r1
        L_0x0149:
            android.content.res.Resources r0 = r32.getResources()
            java.lang.String r0 = r0.getResourceName(r1)
            java.lang.NullPointerException r1 = new java.lang.NullPointerException
            java.lang.String r2 = "Missing required view with ID: "
            java.lang.String r0 = r2.concat(r0)
            r1.<init>(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: xb0.C29720h.m90245a(android.view.View):xb0.h");
    }

    /* renamed from: d */
    public static C29720h m90246d(LayoutInflater layoutInflater) {
        return m90247e(layoutInflater, (ViewGroup) null, false);
    }

    /* renamed from: e */
    public static C29720h m90247e(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(C27986e.activity_deposit_details, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return m90245a(inflate);
    }

    /* renamed from: c */
    public ConstraintLayout mo3946b() {
        return this.f75052d;
    }
}
