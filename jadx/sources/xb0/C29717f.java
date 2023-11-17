package xb0;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.ProgressBar;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.widget.NestedScrollView;
import p086g1.C6201a;
import p341ge.bog.designsystem.components.buttons.Button;
import p341ge.bog.designsystem.components.fixedbutton.FixedButtonCheckboxView;
import p341ge.bog.designsystem.components.input.Input;
import p341ge.bog.designsystem.components.layersandshadows.LayerView;
import p341ge.bog.designsystem.components.loading.LoadingView;
import p341ge.bog.designsystem.components.pagedescription.PageDescriptionView;
import p341ge.bog.mobilebank.cleanarch.presentation.common.StateView;
import p90.C27272c8;
import rb0.C27986e;

/* renamed from: xb0.f */
public final class C29717f implements C6201a {

    /* renamed from: d */
    private final ConstraintLayout f75015d;

    /* renamed from: e */
    public final Input f75016e;

    /* renamed from: f */
    public final FixedButtonCheckboxView f75017f;

    /* renamed from: g */
    public final PageDescriptionView f75018g;

    /* renamed from: h */
    public final LayerView f75019h;

    /* renamed from: i */
    public final C29712c0 f75020i;

    /* renamed from: j */
    public final NestedScrollView f75021j;

    /* renamed from: k */
    public final StateView f75022k;

    /* renamed from: l */
    public final C29729q f75023l;

    /* renamed from: m */
    public final PageDescriptionView f75024m;

    /* renamed from: n */
    public final LayerView f75025n;

    /* renamed from: o */
    public final C29712c0 f75026o;

    /* renamed from: p */
    public final LinearLayout f75027p;

    /* renamed from: q */
    public final PageDescriptionView f75028q;

    /* renamed from: r */
    public final Button f75029r;

    /* renamed from: s */
    public final FrameLayout f75030s;

    /* renamed from: t */
    public final ProgressBar f75031t;

    /* renamed from: u */
    public final LoadingView f75032u;

    /* renamed from: v */
    public final C27272c8 f75033v;

    private C29717f(ConstraintLayout constraintLayout, Input input, FixedButtonCheckboxView fixedButtonCheckboxView, PageDescriptionView pageDescriptionView, LayerView layerView, C29712c0 c0Var, NestedScrollView nestedScrollView, StateView stateView, C29729q qVar, PageDescriptionView pageDescriptionView2, LayerView layerView2, C29712c0 c0Var2, LinearLayout linearLayout, PageDescriptionView pageDescriptionView3, Button button, FrameLayout frameLayout, ProgressBar progressBar, LoadingView loadingView, C27272c8 c8Var) {
        this.f75015d = constraintLayout;
        this.f75016e = input;
        this.f75017f = fixedButtonCheckboxView;
        this.f75018g = pageDescriptionView;
        this.f75019h = layerView;
        this.f75020i = c0Var;
        this.f75021j = nestedScrollView;
        this.f75022k = stateView;
        this.f75023l = qVar;
        this.f75024m = pageDescriptionView2;
        this.f75025n = layerView2;
        this.f75026o = c0Var2;
        this.f75027p = linearLayout;
        this.f75028q = pageDescriptionView3;
        this.f75029r = button;
        this.f75030s = frameLayout;
        this.f75031t = progressBar;
        this.f75032u = loadingView;
        this.f75033v = c8Var;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:14:0x0050, code lost:
        r1 = rb0.C27985d.current_amount;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:20:0x0072, code lost:
        r1 = rb0.C27985d.details_loss_container;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:34:0x00c6, code lost:
        r1 = rb0.C27985d.f71292r1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:8:0x002e, code lost:
        r1 = rb0.C27985d.break_details_without_break_container;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static xb0.C29717f m90232a(android.view.View r23) {
        /*
            r0 = r23
            int r1 = rb0.C27985d.f71275a
            android.view.View r2 = p086g1.C6202b.m24689a(r0, r1)
            r5 = r2
            ge.bog.designsystem.components.input.Input r5 = (p341ge.bog.designsystem.components.input.Input) r5
            if (r5 == 0) goto L_0x00dc
            int r1 = rb0.C27985d.f71282i
            android.view.View r2 = p086g1.C6202b.m24689a(r0, r1)
            r6 = r2
            ge.bog.designsystem.components.fixedbutton.FixedButtonCheckboxView r6 = (p341ge.bog.designsystem.components.fixedbutton.FixedButtonCheckboxView) r6
            if (r6 == 0) goto L_0x00dc
            int r1 = rb0.C27985d.break_amount_description
            android.view.View r2 = p086g1.C6202b.m24689a(r0, r1)
            r7 = r2
            ge.bog.designsystem.components.pagedescription.PageDescriptionView r7 = (p341ge.bog.designsystem.components.pagedescription.PageDescriptionView) r7
            if (r7 == 0) goto L_0x00dc
            int r1 = rb0.C27985d.break_details_container
            android.view.View r2 = p086g1.C6202b.m24689a(r0, r1)
            r8 = r2
            ge.bog.designsystem.components.layersandshadows.LayerView r8 = (p341ge.bog.designsystem.components.layersandshadows.LayerView) r8
            if (r8 == 0) goto L_0x00dc
            int r1 = rb0.C27985d.break_details_without_break_container
            android.view.View r2 = p086g1.C6202b.m24689a(r0, r1)
            if (r2 == 0) goto L_0x00dc
            xb0.c0 r9 = xb0.C29712c0.m90214a(r2)
            int r1 = rb0.C27985d.f71256E
            android.view.View r2 = p086g1.C6202b.m24689a(r0, r1)
            r10 = r2
            androidx.core.widget.NestedScrollView r10 = (androidx.core.widget.NestedScrollView) r10
            if (r10 == 0) goto L_0x00dc
            int r1 = rb0.C27985d.f71258F
            android.view.View r2 = p086g1.C6202b.m24689a(r0, r1)
            r11 = r2
            ge.bog.mobilebank.cleanarch.presentation.common.StateView r11 = (p341ge.bog.mobilebank.cleanarch.presentation.common.StateView) r11
            if (r11 == 0) goto L_0x00dc
            int r1 = rb0.C27985d.current_amount
            android.view.View r2 = p086g1.C6202b.m24689a(r0, r1)
            if (r2 == 0) goto L_0x00dc
            xb0.q r12 = xb0.C29729q.m90281a(r2)
            int r1 = rb0.C27985d.deposit_break_description
            android.view.View r2 = p086g1.C6202b.m24689a(r0, r1)
            r13 = r2
            ge.bog.designsystem.components.pagedescription.PageDescriptionView r13 = (p341ge.bog.designsystem.components.pagedescription.PageDescriptionView) r13
            if (r13 == 0) goto L_0x00dc
            int r1 = rb0.C27985d.deposit_break_description_container
            android.view.View r2 = p086g1.C6202b.m24689a(r0, r1)
            r14 = r2
            ge.bog.designsystem.components.layersandshadows.LayerView r14 = (p341ge.bog.designsystem.components.layersandshadows.LayerView) r14
            if (r14 == 0) goto L_0x00dc
            int r1 = rb0.C27985d.details_loss_container
            android.view.View r2 = p086g1.C6202b.m24689a(r0, r1)
            if (r2 == 0) goto L_0x00dc
            xb0.c0 r15 = xb0.C29712c0.m90214a(r2)
            int r1 = rb0.C27985d.f71277e0
            android.view.View r2 = p086g1.C6202b.m24689a(r0, r1)
            r16 = r2
            android.widget.LinearLayout r16 = (android.widget.LinearLayout) r16
            if (r16 == 0) goto L_0x00dc
            int r1 = rb0.C27985d.f71279f0
            android.view.View r2 = p086g1.C6202b.m24689a(r0, r1)
            r17 = r2
            ge.bog.designsystem.components.pagedescription.PageDescriptionView r17 = (p341ge.bog.designsystem.components.pagedescription.PageDescriptionView) r17
            if (r17 == 0) goto L_0x00dc
            int r1 = rb0.C27985d.f71263L0
            android.view.View r2 = p086g1.C6202b.m24689a(r0, r1)
            r18 = r2
            ge.bog.designsystem.components.buttons.Button r18 = (p341ge.bog.designsystem.components.buttons.Button) r18
            if (r18 == 0) goto L_0x00dc
            int r1 = rb0.C27985d.f71265N0
            android.view.View r2 = p086g1.C6202b.m24689a(r0, r1)
            r19 = r2
            android.widget.FrameLayout r19 = (android.widget.FrameLayout) r19
            if (r19 == 0) goto L_0x00dc
            int r1 = rb0.C27985d.round_loader
            android.view.View r2 = p086g1.C6202b.m24689a(r0, r1)
            r20 = r2
            android.widget.ProgressBar r20 = (android.widget.ProgressBar) r20
            if (r20 == 0) goto L_0x00dc
            int r1 = rb0.C27985d.f71280f1
            android.view.View r2 = p086g1.C6202b.m24689a(r0, r1)
            r21 = r2
            ge.bog.designsystem.components.loading.LoadingView r21 = (p341ge.bog.designsystem.components.loading.LoadingView) r21
            if (r21 == 0) goto L_0x00dc
            int r1 = rb0.C27985d.f71292r1
            android.view.View r2 = p086g1.C6202b.m24689a(r0, r1)
            if (r2 == 0) goto L_0x00dc
            p90.c8 r22 = p90.C27272c8.m84388a(r2)
            xb0.f r1 = new xb0.f
            r3 = r1
            r4 = r0
            androidx.constraintlayout.widget.ConstraintLayout r4 = (androidx.constraintlayout.widget.ConstraintLayout) r4
            r3.<init>(r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20, r21, r22)
            return r1
        L_0x00dc:
            android.content.res.Resources r0 = r23.getResources()
            java.lang.String r0 = r0.getResourceName(r1)
            java.lang.NullPointerException r1 = new java.lang.NullPointerException
            java.lang.String r2 = "Missing required view with ID: "
            java.lang.String r0 = r2.concat(r0)
            r1.<init>(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: xb0.C29717f.m90232a(android.view.View):xb0.f");
    }

    /* renamed from: d */
    public static C29717f m90233d(LayoutInflater layoutInflater) {
        return m90234e(layoutInflater, (ViewGroup) null, false);
    }

    /* renamed from: e */
    public static C29717f m90234e(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(C27986e.activity_break_deposit, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return m90232a(inflate);
    }

    /* renamed from: c */
    public ConstraintLayout mo3946b() {
        return this.f75015d;
    }
}
