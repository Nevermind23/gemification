package iy0;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.constraintlayout.widget.Barrier;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.Group;
import androidx.constraintlayout.widget.Guideline;
import androidx.recyclerview.widget.RecyclerView;
import androidx.swiperefreshlayout.widget.SwipeRefreshLayout;
import hy0.C36272f;
import p086g1.C6201a;
import p341ge.bog.designsystem.components.buttons.Button;
import p341ge.bog.designsystem.components.creditcardwidget.CreditCardWidgetBannerView;
import p341ge.bog.designsystem.components.layersandshadows.LayerView;
import p341ge.bog.designsystem.components.list.ListItem;
import p341ge.bog.designsystem.components.list.SingleLineTextItem;
import p341ge.bog.designsystem.components.loading.LoadingView;
import p341ge.bog.designsystem.components.pagedescription.PageDescriptionView;
import p90.C27272c8;

/* renamed from: iy0.h */
public final class C36599h implements C6201a {

    /* renamed from: A */
    public final AppCompatTextView f88219A;

    /* renamed from: B */
    public final Group f88220B;

    /* renamed from: C */
    public final Button f88221C;

    /* renamed from: D */
    public final SwipeRefreshLayout f88222D;

    /* renamed from: E */
    public final ImageView f88223E;

    /* renamed from: F */
    public final C27272c8 f88224F;

    /* renamed from: d */
    private final ConstraintLayout f88225d;

    /* renamed from: e */
    public final Button f88226e;

    /* renamed from: f */
    public final CreditCardWidgetBannerView f88227f;

    /* renamed from: g */
    public final Button f88228g;

    /* renamed from: h */
    public final LoadingView f88229h;

    /* renamed from: i */
    public final Group f88230i;

    /* renamed from: j */
    public final Barrier f88231j;

    /* renamed from: k */
    public final ListItem f88232k;

    /* renamed from: l */
    public final View f88233l;

    /* renamed from: m */
    public final ConstraintLayout f88234m;

    /* renamed from: n */
    public final AppCompatTextView f88235n;

    /* renamed from: o */
    public final Guideline f88236o;

    /* renamed from: p */
    public final Guideline f88237p;

    /* renamed from: q */
    public final LoadingView f88238q;

    /* renamed from: r */
    public final AppCompatTextView f88239r;

    /* renamed from: s */
    public final PageDescriptionView f88240s;

    /* renamed from: t */
    public final LayerView f88241t;

    /* renamed from: u */
    public final LoadingView f88242u;

    /* renamed from: v */
    public final Group f88243v;

    /* renamed from: w */
    public final RecyclerView f88244w;

    /* renamed from: x */
    public final AppCompatTextView f88245x;

    /* renamed from: y */
    public final SingleLineTextItem f88246y;

    /* renamed from: z */
    public final Group f88247z;

    private C36599h(ConstraintLayout constraintLayout, Button button, CreditCardWidgetBannerView creditCardWidgetBannerView, Button button2, LoadingView loadingView, Group group, Barrier barrier, ListItem listItem, View view, ConstraintLayout constraintLayout2, AppCompatTextView appCompatTextView, Guideline guideline, Guideline guideline2, LoadingView loadingView2, AppCompatTextView appCompatTextView2, PageDescriptionView pageDescriptionView, LayerView layerView, LoadingView loadingView3, Group group2, RecyclerView recyclerView, AppCompatTextView appCompatTextView3, SingleLineTextItem singleLineTextItem, Group group3, AppCompatTextView appCompatTextView4, Group group4, Button button3, SwipeRefreshLayout swipeRefreshLayout, ImageView imageView, C27272c8 c8Var) {
        this.f88225d = constraintLayout;
        this.f88226e = button;
        this.f88227f = creditCardWidgetBannerView;
        this.f88228g = button2;
        this.f88229h = loadingView;
        this.f88230i = group;
        this.f88231j = barrier;
        this.f88232k = listItem;
        this.f88233l = view;
        this.f88234m = constraintLayout2;
        this.f88235n = appCompatTextView;
        this.f88236o = guideline;
        this.f88237p = guideline2;
        this.f88238q = loadingView2;
        this.f88239r = appCompatTextView2;
        this.f88240s = pageDescriptionView;
        this.f88241t = layerView;
        this.f88242u = loadingView3;
        this.f88243v = group2;
        this.f88244w = recyclerView;
        this.f88245x = appCompatTextView3;
        this.f88246y = singleLineTextItem;
        this.f88247z = group3;
        this.f88219A = appCompatTextView4;
        this.f88220B = group4;
        this.f88221C = button3;
        this.f88222D = swipeRefreshLayout;
        this.f88223E = imageView;
        this.f88224F = c8Var;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:14:0x004f, code lost:
        r1 = hy0.C36271e.f87516f0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:54:0x0138, code lost:
        r1 = hy0.C36271e.f87549u2;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static iy0.C36599h m108523a(android.view.View r33) {
        /*
            r0 = r33
            int r1 = hy0.C36271e.cancel_insurance_button
            android.view.View r2 = p086g1.C6202b.m24689a(r0, r1)
            r5 = r2
            ge.bog.designsystem.components.buttons.Button r5 = (p341ge.bog.designsystem.components.buttons.Button) r5
            if (r5 == 0) goto L_0x014e
            int r1 = hy0.C36271e.f87554z
            android.view.View r2 = p086g1.C6202b.m24689a(r0, r1)
            r6 = r2
            ge.bog.designsystem.components.creditcardwidget.CreditCardWidgetBannerView r6 = (p341ge.bog.designsystem.components.creditcardwidget.CreditCardWidgetBannerView) r6
            if (r6 == 0) goto L_0x014e
            int r1 = hy0.C36271e.card_insurance_button
            android.view.View r2 = p086g1.C6202b.m24689a(r0, r1)
            r7 = r2
            ge.bog.designsystem.components.buttons.Button r7 = (p341ge.bog.designsystem.components.buttons.Button) r7
            if (r7 == 0) goto L_0x014e
            int r1 = hy0.C36271e.f87482B
            android.view.View r2 = p086g1.C6202b.m24689a(r0, r1)
            r8 = r2
            ge.bog.designsystem.components.loading.LoadingView r8 = (p341ge.bog.designsystem.components.loading.LoadingView) r8
            if (r8 == 0) goto L_0x014e
            int r1 = hy0.C36271e.common_details
            android.view.View r2 = p086g1.C6202b.m24689a(r0, r1)
            r9 = r2
            androidx.constraintlayout.widget.Group r9 = (androidx.constraintlayout.widget.Group) r9
            if (r9 == 0) goto L_0x014e
            int r1 = hy0.C36271e.details_barrier
            android.view.View r2 = p086g1.C6202b.m24689a(r0, r1)
            r10 = r2
            androidx.constraintlayout.widget.Barrier r10 = (androidx.constraintlayout.widget.Barrier) r10
            if (r10 == 0) goto L_0x014e
            int r1 = hy0.C36271e.f87511d0
            android.view.View r2 = p086g1.C6202b.m24689a(r0, r1)
            r11 = r2
            ge.bog.designsystem.components.list.ListItem r11 = (p341ge.bog.designsystem.components.list.ListItem) r11
            if (r11 == 0) goto L_0x014e
            int r1 = hy0.C36271e.f87516f0
            android.view.View r12 = p086g1.C6202b.m24689a(r0, r1)
            if (r12 == 0) goto L_0x014e
            int r1 = hy0.C36271e.f87528k0
            android.view.View r2 = p086g1.C6202b.m24689a(r0, r1)
            r13 = r2
            androidx.constraintlayout.widget.ConstraintLayout r13 = (androidx.constraintlayout.widget.ConstraintLayout) r13
            if (r13 == 0) goto L_0x014e
            int r1 = hy0.C36271e.f87536n0
            android.view.View r2 = p086g1.C6202b.m24689a(r0, r1)
            r14 = r2
            androidx.appcompat.widget.AppCompatTextView r14 = (androidx.appcompat.widget.AppCompatTextView) r14
            if (r14 == 0) goto L_0x014e
            int r1 = hy0.C36271e.f87483B0
            android.view.View r2 = p086g1.C6202b.m24689a(r0, r1)
            r15 = r2
            androidx.constraintlayout.widget.Guideline r15 = (androidx.constraintlayout.widget.Guideline) r15
            if (r15 == 0) goto L_0x014e
            int r1 = hy0.C36271e.f87484C0
            android.view.View r2 = p086g1.C6202b.m24689a(r0, r1)
            r16 = r2
            androidx.constraintlayout.widget.Guideline r16 = (androidx.constraintlayout.widget.Guideline) r16
            if (r16 == 0) goto L_0x014e
            int r1 = hy0.C36271e.f87486E0
            android.view.View r2 = p086g1.C6202b.m24689a(r0, r1)
            r17 = r2
            ge.bog.designsystem.components.loading.LoadingView r17 = (p341ge.bog.designsystem.components.loading.LoadingView) r17
            if (r17 == 0) goto L_0x014e
            int r1 = hy0.C36271e.insurance_amount_text
            android.view.View r2 = p086g1.C6202b.m24689a(r0, r1)
            r18 = r2
            androidx.appcompat.widget.AppCompatTextView r18 = (androidx.appcompat.widget.AppCompatTextView) r18
            if (r18 == 0) goto L_0x014e
            int r1 = hy0.C36271e.insurance_description
            android.view.View r2 = p086g1.C6202b.m24689a(r0, r1)
            r19 = r2
            ge.bog.designsystem.components.pagedescription.PageDescriptionView r19 = (p341ge.bog.designsystem.components.pagedescription.PageDescriptionView) r19
            if (r19 == 0) goto L_0x014e
            int r1 = hy0.C36271e.insurance_details_container
            android.view.View r2 = p086g1.C6202b.m24689a(r0, r1)
            r20 = r2
            ge.bog.designsystem.components.layersandshadows.LayerView r20 = (p341ge.bog.designsystem.components.layersandshadows.LayerView) r20
            if (r20 == 0) goto L_0x014e
            int r1 = hy0.C36271e.insurance_details_loader
            android.view.View r2 = p086g1.C6202b.m24689a(r0, r1)
            r21 = r2
            ge.bog.designsystem.components.loading.LoadingView r21 = (p341ge.bog.designsystem.components.loading.LoadingView) r21
            if (r21 == 0) goto L_0x014e
            int r1 = hy0.C36271e.insurance_enabled_details
            android.view.View r2 = p086g1.C6202b.m24689a(r0, r1)
            r22 = r2
            androidx.constraintlayout.widget.Group r22 = (androidx.constraintlayout.widget.Group) r22
            if (r22 == 0) goto L_0x014e
            int r1 = hy0.C36271e.insurance_limits_recycler
            android.view.View r2 = p086g1.C6202b.m24689a(r0, r1)
            r23 = r2
            androidx.recyclerview.widget.RecyclerView r23 = (androidx.recyclerview.widget.RecyclerView) r23
            if (r23 == 0) goto L_0x014e
            int r1 = hy0.C36271e.insurance_period_text
            android.view.View r2 = p086g1.C6202b.m24689a(r0, r1)
            r24 = r2
            androidx.appcompat.widget.AppCompatTextView r24 = (androidx.appcompat.widget.AppCompatTextView) r24
            if (r24 == 0) goto L_0x014e
            int r1 = hy0.C36271e.f87501V0
            android.view.View r2 = p086g1.C6202b.m24689a(r0, r1)
            r25 = r2
            ge.bog.designsystem.components.list.SingleLineTextItem r25 = (p341ge.bog.designsystem.components.list.SingleLineTextItem) r25
            if (r25 == 0) goto L_0x014e
            int r1 = hy0.C36271e.f87522i1
            android.view.View r2 = p086g1.C6202b.m24689a(r0, r1)
            r26 = r2
            androidx.constraintlayout.widget.Group r26 = (androidx.constraintlayout.widget.Group) r26
            if (r26 == 0) goto L_0x014e
            int r1 = hy0.C36271e.next_payment_label
            android.view.View r2 = p086g1.C6202b.m24689a(r0, r1)
            r27 = r2
            androidx.appcompat.widget.AppCompatTextView r27 = (androidx.appcompat.widget.AppCompatTextView) r27
            if (r27 == 0) goto L_0x014e
            int r1 = hy0.C36271e.next_payments
            android.view.View r2 = p086g1.C6202b.m24689a(r0, r1)
            r28 = r2
            androidx.constraintlayout.widget.Group r28 = (androidx.constraintlayout.widget.Group) r28
            if (r28 == 0) goto L_0x014e
            int r1 = hy0.C36271e.f87509b2
            android.view.View r2 = p086g1.C6202b.m24689a(r0, r1)
            r29 = r2
            ge.bog.designsystem.components.buttons.Button r29 = (p341ge.bog.designsystem.components.buttons.Button) r29
            if (r29 == 0) goto L_0x014e
            int r1 = hy0.C36271e.f87540p2
            android.view.View r2 = p086g1.C6202b.m24689a(r0, r1)
            r30 = r2
            androidx.swiperefreshlayout.widget.SwipeRefreshLayout r30 = (androidx.swiperefreshlayout.widget.SwipeRefreshLayout) r30
            if (r30 == 0) goto L_0x014e
            int r1 = hy0.C36271e.f87541q2
            android.view.View r2 = p086g1.C6202b.m24689a(r0, r1)
            r31 = r2
            android.widget.ImageView r31 = (android.widget.ImageView) r31
            if (r31 == 0) goto L_0x014e
            int r1 = hy0.C36271e.f87549u2
            android.view.View r2 = p086g1.C6202b.m24689a(r0, r1)
            if (r2 == 0) goto L_0x014e
            p90.c8 r32 = p90.C27272c8.m84388a(r2)
            iy0.h r1 = new iy0.h
            r3 = r1
            r4 = r0
            androidx.constraintlayout.widget.ConstraintLayout r4 = (androidx.constraintlayout.widget.ConstraintLayout) r4
            r3.<init>(r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20, r21, r22, r23, r24, r25, r26, r27, r28, r29, r30, r31, r32)
            return r1
        L_0x014e:
            android.content.res.Resources r0 = r33.getResources()
            java.lang.String r0 = r0.getResourceName(r1)
            java.lang.NullPointerException r1 = new java.lang.NullPointerException
            java.lang.String r2 = "Missing required view with ID: "
            java.lang.String r0 = r2.concat(r0)
            r1.<init>(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: iy0.C36599h.m108523a(android.view.View):iy0.h");
    }

    /* renamed from: d */
    public static C36599h m108524d(LayoutInflater layoutInflater) {
        return m108525e(layoutInflater, (ViewGroup) null, false);
    }

    /* renamed from: e */
    public static C36599h m108525e(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(C36272f.activity_card_insurance_details, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return m108523a(inflate);
    }

    /* renamed from: c */
    public ConstraintLayout mo3946b() {
        return this.f88225d;
    }
}
