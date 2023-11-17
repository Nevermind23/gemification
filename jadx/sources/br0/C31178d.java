package br0;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.constraintlayout.widget.Barrier;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.Group;
import androidx.recyclerview.widget.RecyclerView;
import p086g1.C6201a;
import p341ge.bog.designsystem.components.buttons.Button;
import p341ge.bog.designsystem.components.chips.ChipGroup;
import p341ge.bog.designsystem.components.emptywidget.EmptyWidget;
import p341ge.bog.designsystem.components.layersandshadows.LayerView;
import p341ge.bog.designsystem.components.loading.LoadingView;
import p341ge.bog.designsystem.components.pagedescription.PageDescriptionView;
import p341ge.bog.designsystem.components.pagestate.PageState;
import p90.C27272c8;
import xq0.C39836b;

/* renamed from: br0.d */
public final class C31178d implements C6201a {

    /* renamed from: A */
    public final C27272c8 f77448A;

    /* renamed from: d */
    private final ConstraintLayout f77449d;

    /* renamed from: e */
    public final Button f77450e;

    /* renamed from: f */
    public final FrameLayout f77451f;

    /* renamed from: g */
    public final View f77452g;

    /* renamed from: h */
    public final ChipGroup f77453h;

    /* renamed from: i */
    public final LayerView f77454i;

    /* renamed from: j */
    public final EmptyWidget f77455j;

    /* renamed from: k */
    public final LoadingView f77456k;

    /* renamed from: l */
    public final Barrier f77457l;

    /* renamed from: m */
    public final Group f77458m;

    /* renamed from: n */
    public final EmptyWidget f77459n;

    /* renamed from: o */
    public final Button f77460o;

    /* renamed from: p */
    public final LoadingView f77461p;

    /* renamed from: q */
    public final RecyclerView f77462q;

    /* renamed from: r */
    public final EmptyWidget f77463r;

    /* renamed from: s */
    public final Button f77464s;

    /* renamed from: t */
    public final RecyclerView f77465t;

    /* renamed from: u */
    public final Button f77466u;

    /* renamed from: v */
    public final PageDescriptionView f77467v;

    /* renamed from: w */
    public final EmptyWidget f77468w;

    /* renamed from: x */
    public final Button f77469x;

    /* renamed from: y */
    public final FrameLayout f77470y;

    /* renamed from: z */
    public final PageState f77471z;

    private C31178d(ConstraintLayout constraintLayout, Button button, FrameLayout frameLayout, View view, ChipGroup chipGroup, LayerView layerView, EmptyWidget emptyWidget, LoadingView loadingView, Barrier barrier, Group group, EmptyWidget emptyWidget2, Button button2, LoadingView loadingView2, RecyclerView recyclerView, EmptyWidget emptyWidget3, Button button3, RecyclerView recyclerView2, Button button4, PageDescriptionView pageDescriptionView, EmptyWidget emptyWidget4, Button button5, FrameLayout frameLayout2, PageState pageState, C27272c8 c8Var) {
        this.f77449d = constraintLayout;
        this.f77450e = button;
        this.f77451f = frameLayout;
        this.f77452g = view;
        this.f77453h = chipGroup;
        this.f77454i = layerView;
        this.f77455j = emptyWidget;
        this.f77456k = loadingView;
        this.f77457l = barrier;
        this.f77458m = group;
        this.f77459n = emptyWidget2;
        this.f77460o = button2;
        this.f77461p = loadingView2;
        this.f77462q = recyclerView;
        this.f77463r = emptyWidget3;
        this.f77464s = button3;
        this.f77465t = recyclerView2;
        this.f77466u = button4;
        this.f77467v = pageDescriptionView;
        this.f77468w = emptyWidget4;
        this.f77469x = button5;
        this.f77470y = frameLayout2;
        this.f77471z = pageState;
        this.f77448A = c8Var;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:44:0x00fc, code lost:
        r1 = xq0.C39835a.f94549E;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:4:0x0018, code lost:
        r1 = xq0.C39835a.loading_overlay;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static br0.C31178d m92717a(android.view.View r28) {
        /*
            r0 = r28
            int r1 = xq0.C39835a.add_real_estate_button
            android.view.View r2 = p086g1.C6202b.m24689a(r0, r1)
            r5 = r2
            ge.bog.designsystem.components.buttons.Button r5 = (p341ge.bog.designsystem.components.buttons.Button) r5
            if (r5 == 0) goto L_0x0112
            int r1 = xq0.C39835a.f94550b
            android.view.View r2 = p086g1.C6202b.m24689a(r0, r1)
            r6 = r2
            android.widget.FrameLayout r6 = (android.widget.FrameLayout) r6
            if (r6 == 0) goto L_0x0112
            int r1 = xq0.C39835a.loading_overlay
            android.view.View r7 = p086g1.C6202b.m24689a(r0, r1)
            if (r7 == 0) goto L_0x0112
            int r1 = xq0.C39835a.loan_purpose_chips
            android.view.View r2 = p086g1.C6202b.m24689a(r0, r1)
            r8 = r2
            ge.bog.designsystem.components.chips.ChipGroup r8 = (p341ge.bog.designsystem.components.chips.ChipGroup) r8
            if (r8 == 0) goto L_0x0112
            int r1 = xq0.C39835a.loan_purpose_container
            android.view.View r2 = p086g1.C6202b.m24689a(r0, r1)
            r9 = r2
            ge.bog.designsystem.components.layersandshadows.LayerView r9 = (p341ge.bog.designsystem.components.layersandshadows.LayerView) r9
            if (r9 == 0) goto L_0x0112
            int r1 = xq0.C39835a.loan_purpose_header
            android.view.View r2 = p086g1.C6202b.m24689a(r0, r1)
            r10 = r2
            ge.bog.designsystem.components.emptywidget.EmptyWidget r10 = (p341ge.bog.designsystem.components.emptywidget.EmptyWidget) r10
            if (r10 == 0) goto L_0x0112
            int r1 = xq0.C39835a.loan_purpose_loader
            android.view.View r2 = p086g1.C6202b.m24689a(r0, r1)
            r11 = r2
            ge.bog.designsystem.components.loading.LoadingView r11 = (p341ge.bog.designsystem.components.loading.LoadingView) r11
            if (r11 == 0) goto L_0x0112
            int r1 = xq0.C39835a.my_real_estate_barrier
            android.view.View r2 = p086g1.C6202b.m24689a(r0, r1)
            r12 = r2
            androidx.constraintlayout.widget.Barrier r12 = (androidx.constraintlayout.widget.Barrier) r12
            if (r12 == 0) goto L_0x0112
            int r1 = xq0.C39835a.my_real_estate_group
            android.view.View r2 = p086g1.C6202b.m24689a(r0, r1)
            r13 = r2
            androidx.constraintlayout.widget.Group r13 = (androidx.constraintlayout.widget.Group) r13
            if (r13 == 0) goto L_0x0112
            int r1 = xq0.C39835a.my_real_estate_header
            android.view.View r2 = p086g1.C6202b.m24689a(r0, r1)
            r14 = r2
            ge.bog.designsystem.components.emptywidget.EmptyWidget r14 = (p341ge.bog.designsystem.components.emptywidget.EmptyWidget) r14
            if (r14 == 0) goto L_0x0112
            int r1 = xq0.C39835a.my_real_estate_info_button
            android.view.View r2 = p086g1.C6202b.m24689a(r0, r1)
            r15 = r2
            ge.bog.designsystem.components.buttons.Button r15 = (p341ge.bog.designsystem.components.buttons.Button) r15
            if (r15 == 0) goto L_0x0112
            int r1 = xq0.C39835a.my_real_estate_loader
            android.view.View r2 = p086g1.C6202b.m24689a(r0, r1)
            r16 = r2
            ge.bog.designsystem.components.loading.LoadingView r16 = (p341ge.bog.designsystem.components.loading.LoadingView) r16
            if (r16 == 0) goto L_0x0112
            int r1 = xq0.C39835a.my_real_estate_recycler
            android.view.View r2 = p086g1.C6202b.m24689a(r0, r1)
            r17 = r2
            androidx.recyclerview.widget.RecyclerView r17 = (androidx.recyclerview.widget.RecyclerView) r17
            if (r17 == 0) goto L_0x0112
            int r1 = xq0.C39835a.other_real_estate_header
            android.view.View r2 = p086g1.C6202b.m24689a(r0, r1)
            r18 = r2
            ge.bog.designsystem.components.emptywidget.EmptyWidget r18 = (p341ge.bog.designsystem.components.emptywidget.EmptyWidget) r18
            if (r18 == 0) goto L_0x0112
            int r1 = xq0.C39835a.other_real_estate_info_button
            android.view.View r2 = p086g1.C6202b.m24689a(r0, r1)
            r19 = r2
            ge.bog.designsystem.components.buttons.Button r19 = (p341ge.bog.designsystem.components.buttons.Button) r19
            if (r19 == 0) goto L_0x0112
            int r1 = xq0.C39835a.other_real_estate_recycler
            android.view.View r2 = p086g1.C6202b.m24689a(r0, r1)
            r20 = r2
            androidx.recyclerview.widget.RecyclerView r20 = (androidx.recyclerview.widget.RecyclerView) r20
            if (r20 == 0) goto L_0x0112
            int r1 = xq0.C39835a.f94553x
            android.view.View r2 = p086g1.C6202b.m24689a(r0, r1)
            r21 = r2
            ge.bog.designsystem.components.buttons.Button r21 = (p341ge.bog.designsystem.components.buttons.Button) r21
            if (r21 == 0) goto L_0x0112
            int r1 = xq0.C39835a.secure_with_real_estate_description
            android.view.View r2 = p086g1.C6202b.m24689a(r0, r1)
            r22 = r2
            ge.bog.designsystem.components.pagedescription.PageDescriptionView r22 = (p341ge.bog.designsystem.components.pagedescription.PageDescriptionView) r22
            if (r22 == 0) goto L_0x0112
            int r1 = xq0.C39835a.secure_with_real_estate_header
            android.view.View r2 = p086g1.C6202b.m24689a(r0, r1)
            r23 = r2
            ge.bog.designsystem.components.emptywidget.EmptyWidget r23 = (p341ge.bog.designsystem.components.emptywidget.EmptyWidget) r23
            if (r23 == 0) goto L_0x0112
            int r1 = xq0.C39835a.f94545A
            android.view.View r2 = p086g1.C6202b.m24689a(r0, r1)
            r24 = r2
            ge.bog.designsystem.components.buttons.Button r24 = (p341ge.bog.designsystem.components.buttons.Button) r24
            if (r24 == 0) goto L_0x0112
            int r1 = xq0.C39835a.f94546B
            android.view.View r2 = p086g1.C6202b.m24689a(r0, r1)
            r25 = r2
            android.widget.FrameLayout r25 = (android.widget.FrameLayout) r25
            if (r25 == 0) goto L_0x0112
            int r1 = xq0.C39835a.f94547C
            android.view.View r2 = p086g1.C6202b.m24689a(r0, r1)
            r26 = r2
            ge.bog.designsystem.components.pagestate.PageState r26 = (p341ge.bog.designsystem.components.pagestate.PageState) r26
            if (r26 == 0) goto L_0x0112
            int r1 = xq0.C39835a.f94549E
            android.view.View r2 = p086g1.C6202b.m24689a(r0, r1)
            if (r2 == 0) goto L_0x0112
            p90.c8 r27 = p90.C27272c8.m84388a(r2)
            br0.d r1 = new br0.d
            r3 = r1
            r4 = r0
            androidx.constraintlayout.widget.ConstraintLayout r4 = (androidx.constraintlayout.widget.ConstraintLayout) r4
            r3.<init>(r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20, r21, r22, r23, r24, r25, r26, r27)
            return r1
        L_0x0112:
            android.content.res.Resources r0 = r28.getResources()
            java.lang.String r0 = r0.getResourceName(r1)
            java.lang.NullPointerException r1 = new java.lang.NullPointerException
            java.lang.String r2 = "Missing required view with ID: "
            java.lang.String r0 = r2.concat(r0)
            r1.<init>(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: br0.C31178d.m92717a(android.view.View):br0.d");
    }

    /* renamed from: d */
    public static C31178d m92718d(LayoutInflater layoutInflater) {
        return m92719e(layoutInflater, (ViewGroup) null, false);
    }

    /* renamed from: e */
    public static C31178d m92719e(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(C39836b.activity_secured_loan, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return m92717a(inflate);
    }

    /* renamed from: c */
    public ConstraintLayout mo3946b() {
        return this.f77449d;
    }
}
