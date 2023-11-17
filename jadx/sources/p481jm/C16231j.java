package p481jm;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ProgressBar;
import androidx.appcompat.widget.LinearLayoutCompat;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.Guideline;
import androidx.core.widget.NestedScrollView;
import androidx.recyclerview.widget.RecyclerView;
import p086g1.C6201a;
import p341ge.bog.designsystem.components.emptywidget.EmptyWidget;
import p341ge.bog.designsystem.components.fixedbutton.FixedButtonCheckboxView;
import p341ge.bog.designsystem.components.input.Input;
import p341ge.bog.designsystem.components.layersandshadows.LayerView;
import p341ge.bog.designsystem.components.loading.LoadingView;
import p341ge.bog.designsystem.components.pagedescription.PageDescriptionView;
import p341ge.bog.mobilebank.cleanarch.presentation.common.StateView;
import p411em.C12489f;
import p90.C27272c8;

/* renamed from: jm.j */
public final class C16231j implements C6201a {

    /* renamed from: d */
    private final ConstraintLayout f45870d;

    /* renamed from: e */
    public final EmptyWidget f45871e;

    /* renamed from: f */
    public final RecyclerView f45872f;

    /* renamed from: g */
    public final ConstraintLayout f45873g;

    /* renamed from: h */
    public final StateView f45874h;

    /* renamed from: i */
    public final Input f45875i;

    /* renamed from: j */
    public final PageDescriptionView f45876j;

    /* renamed from: k */
    public final LinearLayoutCompat f45877k;

    /* renamed from: l */
    public final Guideline f45878l;

    /* renamed from: m */
    public final Guideline f45879m;

    /* renamed from: n */
    public final Input f45880n;

    /* renamed from: o */
    public final LayerView f45881o;

    /* renamed from: p */
    public final LoadingView f45882p;

    /* renamed from: q */
    public final ConstraintLayout f45883q;

    /* renamed from: r */
    public final NestedScrollView f45884r;

    /* renamed from: s */
    public final Input f45885s;

    /* renamed from: t */
    public final FixedButtonCheckboxView f45886t;

    /* renamed from: u */
    public final LayerView f45887u;

    /* renamed from: v */
    public final EmptyWidget f45888v;

    /* renamed from: w */
    public final FrameLayout f45889w;

    /* renamed from: x */
    public final ProgressBar f45890x;

    /* renamed from: y */
    public final C27272c8 f45891y;

    private C16231j(ConstraintLayout constraintLayout, EmptyWidget emptyWidget, RecyclerView recyclerView, ConstraintLayout constraintLayout2, StateView stateView, Input input, PageDescriptionView pageDescriptionView, LinearLayoutCompat linearLayoutCompat, Guideline guideline, Guideline guideline2, Input input2, LayerView layerView, LoadingView loadingView, ConstraintLayout constraintLayout3, NestedScrollView nestedScrollView, Input input3, FixedButtonCheckboxView fixedButtonCheckboxView, LayerView layerView2, EmptyWidget emptyWidget2, FrameLayout frameLayout, ProgressBar progressBar, C27272c8 c8Var) {
        this.f45870d = constraintLayout;
        this.f45871e = emptyWidget;
        this.f45872f = recyclerView;
        this.f45873g = constraintLayout2;
        this.f45874h = stateView;
        this.f45875i = input;
        this.f45876j = pageDescriptionView;
        this.f45877k = linearLayoutCompat;
        this.f45878l = guideline;
        this.f45879m = guideline2;
        this.f45880n = input2;
        this.f45881o = layerView;
        this.f45882p = loadingView;
        this.f45883q = constraintLayout3;
        this.f45884r = nestedScrollView;
        this.f45885s = input3;
        this.f45886t = fixedButtonCheckboxView;
        this.f45887u = layerView2;
        this.f45888v = emptyWidget2;
        this.f45889w = frameLayout;
        this.f45890x = progressBar;
        this.f45891y = c8Var;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:40:0x00e7, code lost:
        r1 = p411em.C12488e.f37198d2;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static p481jm.C16231j m57854a(android.view.View r26) {
        /*
            r0 = r26
            int r1 = p411em.C12488e.card_delivery_header
            android.view.View r2 = p086g1.C6202b.m24689a(r0, r1)
            r5 = r2
            ge.bog.designsystem.components.emptywidget.EmptyWidget r5 = (p341ge.bog.designsystem.components.emptywidget.EmptyWidget) r5
            if (r5 == 0) goto L_0x00fd
            int r1 = p411em.C12488e.card_fees
            android.view.View r2 = p086g1.C6202b.m24689a(r0, r1)
            r6 = r2
            androidx.recyclerview.widget.RecyclerView r6 = (androidx.recyclerview.widget.RecyclerView) r6
            if (r6 == 0) goto L_0x00fd
            int r1 = p411em.C12488e.card_pickup_inputs
            android.view.View r2 = p086g1.C6202b.m24689a(r0, r1)
            r7 = r2
            androidx.constraintlayout.widget.ConstraintLayout r7 = (androidx.constraintlayout.widget.ConstraintLayout) r7
            if (r7 == 0) goto L_0x00fd
            int r1 = p411em.C12488e.f37195a0
            android.view.View r2 = p086g1.C6202b.m24689a(r0, r1)
            r8 = r2
            ge.bog.mobilebank.cleanarch.presentation.common.StateView r8 = (p341ge.bog.mobilebank.cleanarch.presentation.common.StateView) r8
            if (r8 == 0) goto L_0x00fd
            int r1 = p411em.C12488e.delivery_city_selector
            android.view.View r2 = p086g1.C6202b.m24689a(r0, r1)
            r9 = r2
            ge.bog.designsystem.components.input.Input r9 = (p341ge.bog.designsystem.components.input.Input) r9
            if (r9 == 0) goto L_0x00fd
            int r1 = p411em.C12488e.f37219q0
            android.view.View r2 = p086g1.C6202b.m24689a(r0, r1)
            r10 = r2
            ge.bog.designsystem.components.pagedescription.PageDescriptionView r10 = (p341ge.bog.designsystem.components.pagedescription.PageDescriptionView) r10
            if (r10 == 0) goto L_0x00fd
            int r1 = p411em.C12488e.f37220r0
            android.view.View r2 = p086g1.C6202b.m24689a(r0, r1)
            r11 = r2
            androidx.appcompat.widget.LinearLayoutCompat r11 = (androidx.appcompat.widget.LinearLayoutCompat) r11
            if (r11 == 0) goto L_0x00fd
            int r1 = p411em.C12488e.f37174D0
            android.view.View r2 = p086g1.C6202b.m24689a(r0, r1)
            r12 = r2
            androidx.constraintlayout.widget.Guideline r12 = (androidx.constraintlayout.widget.Guideline) r12
            if (r12 == 0) goto L_0x00fd
            int r1 = p411em.C12488e.f37176E0
            android.view.View r2 = p086g1.C6202b.m24689a(r0, r1)
            r13 = r2
            androidx.constraintlayout.widget.Guideline r13 = (androidx.constraintlayout.widget.Guideline) r13
            if (r13 == 0) goto L_0x00fd
            int r1 = p411em.C12488e.input_address
            android.view.View r2 = p086g1.C6202b.m24689a(r0, r1)
            r14 = r2
            ge.bog.designsystem.components.input.Input r14 = (p341ge.bog.designsystem.components.input.Input) r14
            if (r14 == 0) goto L_0x00fd
            int r1 = p411em.C12488e.f37186O0
            android.view.View r2 = p086g1.C6202b.m24689a(r0, r1)
            r15 = r2
            ge.bog.designsystem.components.layersandshadows.LayerView r15 = (p341ge.bog.designsystem.components.layersandshadows.LayerView) r15
            if (r15 == 0) goto L_0x00fd
            int r1 = p411em.C12488e.f37205i1
            android.view.View r2 = p086g1.C6202b.m24689a(r0, r1)
            r16 = r2
            ge.bog.designsystem.components.loading.LoadingView r16 = (p341ge.bog.designsystem.components.loading.LoadingView) r16
            if (r16 == 0) goto L_0x00fd
            int r1 = p411em.C12488e.f37206j1
            android.view.View r2 = p086g1.C6202b.m24689a(r0, r1)
            r17 = r2
            androidx.constraintlayout.widget.ConstraintLayout r17 = (androidx.constraintlayout.widget.ConstraintLayout) r17
            if (r17 == 0) goto L_0x00fd
            int r1 = p411em.C12488e.f37209l1
            android.view.View r2 = p086g1.C6202b.m24689a(r0, r1)
            r18 = r2
            androidx.core.widget.NestedScrollView r18 = (androidx.core.widget.NestedScrollView) r18
            if (r18 == 0) goto L_0x00fd
            int r1 = p411em.C12488e.number_selector
            android.view.View r2 = p086g1.C6202b.m24689a(r0, r1)
            r19 = r2
            ge.bog.designsystem.components.input.Input r19 = (p341ge.bog.designsystem.components.input.Input) r19
            if (r19 == 0) goto L_0x00fd
            int r1 = p411em.C12488e.order_button
            android.view.View r2 = p086g1.C6202b.m24689a(r0, r1)
            r20 = r2
            ge.bog.designsystem.components.fixedbutton.FixedButtonCheckboxView r20 = (p341ge.bog.designsystem.components.fixedbutton.FixedButtonCheckboxView) r20
            if (r20 == 0) goto L_0x00fd
            int r1 = p411em.C12488e.pin_container
            android.view.View r2 = p086g1.C6202b.m24689a(r0, r1)
            r21 = r2
            ge.bog.designsystem.components.layersandshadows.LayerView r21 = (p341ge.bog.designsystem.components.layersandshadows.LayerView) r21
            if (r21 == 0) goto L_0x00fd
            int r1 = p411em.C12488e.pin_number_header
            android.view.View r2 = p086g1.C6202b.m24689a(r0, r1)
            r22 = r2
            ge.bog.designsystem.components.emptywidget.EmptyWidget r22 = (p341ge.bog.designsystem.components.emptywidget.EmptyWidget) r22
            if (r22 == 0) goto L_0x00fd
            int r1 = p411em.C12488e.regular_loader
            android.view.View r2 = p086g1.C6202b.m24689a(r0, r1)
            r23 = r2
            android.widget.FrameLayout r23 = (android.widget.FrameLayout) r23
            if (r23 == 0) goto L_0x00fd
            int r1 = p411em.C12488e.regular_loader_progress
            android.view.View r2 = p086g1.C6202b.m24689a(r0, r1)
            r24 = r2
            android.widget.ProgressBar r24 = (android.widget.ProgressBar) r24
            if (r24 == 0) goto L_0x00fd
            int r1 = p411em.C12488e.f37198d2
            android.view.View r2 = p086g1.C6202b.m24689a(r0, r1)
            if (r2 == 0) goto L_0x00fd
            p90.c8 r25 = p90.C27272c8.m84388a(r2)
            jm.j r1 = new jm.j
            r3 = r1
            r4 = r0
            androidx.constraintlayout.widget.ConstraintLayout r4 = (androidx.constraintlayout.widget.ConstraintLayout) r4
            r3.<init>(r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20, r21, r22, r23, r24, r25)
            return r1
        L_0x00fd:
            android.content.res.Resources r0 = r26.getResources()
            java.lang.String r0 = r0.getResourceName(r1)
            java.lang.NullPointerException r1 = new java.lang.NullPointerException
            java.lang.String r2 = "Missing required view with ID: "
            java.lang.String r0 = r2.concat(r0)
            r1.<init>(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: p481jm.C16231j.m57854a(android.view.View):jm.j");
    }

    /* renamed from: d */
    public static C16231j m57855d(LayoutInflater layoutInflater) {
        return m57856e(layoutInflater, (ViewGroup) null, false);
    }

    /* renamed from: e */
    public static C16231j m57856e(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(C12489f.activity_instant_delivery_application, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return m57854a(inflate);
    }

    /* renamed from: c */
    public ConstraintLayout mo3946b() {
        return this.f45870d;
    }
}
