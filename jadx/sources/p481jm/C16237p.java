package p481jm;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.ScrollView;
import androidx.constraintlayout.widget.Barrier;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.Group;
import androidx.constraintlayout.widget.Guideline;
import p086g1.C6201a;
import p341ge.bog.designsystem.components.chips.ChipGroup;
import p341ge.bog.designsystem.components.creditcardwidget.CreditCardWidgetBannerView;
import p341ge.bog.designsystem.components.emptywidget.EmptyWidget;
import p341ge.bog.designsystem.components.input.Input;
import p341ge.bog.designsystem.components.layersandshadows.LayerView;
import p341ge.bog.designsystem.components.loading.LoadingView;
import p341ge.bog.designsystem.components.pagedescription.PageDescriptionView;
import p411em.C12489f;

/* renamed from: jm.p */
public final class C16237p implements C6201a {

    /* renamed from: d */
    private final ScrollView f45936d;

    /* renamed from: e */
    public final Input f45937e;

    /* renamed from: f */
    public final Input f45938f;

    /* renamed from: g */
    public final CreditCardWidgetBannerView f45939g;

    /* renamed from: h */
    public final EmptyWidget f45940h;

    /* renamed from: i */
    public final ConstraintLayout f45941i;

    /* renamed from: j */
    public final LinearLayout f45942j;

    /* renamed from: k */
    public final Barrier f45943k;

    /* renamed from: l */
    public final Input f45944l;

    /* renamed from: m */
    public final PageDescriptionView f45945m;

    /* renamed from: n */
    public final Group f45946n;

    /* renamed from: o */
    public final Input f45947o;

    /* renamed from: p */
    public final ChipGroup f45948p;

    /* renamed from: q */
    public final Group f45949q;

    /* renamed from: r */
    public final Guideline f45950r;

    /* renamed from: s */
    public final Guideline f45951s;

    /* renamed from: t */
    public final LoadingView f45952t;

    /* renamed from: u */
    public final LayerView f45953u;

    /* renamed from: v */
    public final EmptyWidget f45954v;

    /* renamed from: w */
    public final C16227f0 f45955w;

    /* renamed from: x */
    public final Input f45956x;

    private C16237p(ScrollView scrollView, Input input, Input input2, CreditCardWidgetBannerView creditCardWidgetBannerView, EmptyWidget emptyWidget, ConstraintLayout constraintLayout, LinearLayout linearLayout, Barrier barrier, Input input3, PageDescriptionView pageDescriptionView, Group group, Input input4, ChipGroup chipGroup, Group group2, Guideline guideline, Guideline guideline2, LoadingView loadingView, LayerView layerView, EmptyWidget emptyWidget2, C16227f0 f0Var, Input input5) {
        this.f45936d = scrollView;
        this.f45937e = input;
        this.f45938f = input2;
        this.f45939g = creditCardWidgetBannerView;
        this.f45940h = emptyWidget;
        this.f45941i = constraintLayout;
        this.f45942j = linearLayout;
        this.f45943k = barrier;
        this.f45944l = input3;
        this.f45945m = pageDescriptionView;
        this.f45946n = group;
        this.f45947o = input4;
        this.f45948p = chipGroup;
        this.f45949q = group2;
        this.f45950r = guideline;
        this.f45951s = guideline2;
        this.f45952t = loadingView;
        this.f45953u = layerView;
        this.f45954v = emptyWidget2;
        this.f45955w = f0Var;
        this.f45956x = input5;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:36:0x00cf, code lost:
        r1 = p411em.C12488e.pin_layout;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static p481jm.C16237p m57883a(android.view.View r25) {
        /*
            r0 = r25
            int r1 = p411em.C12488e.f37196c
            android.view.View r2 = p086g1.C6202b.m24689a(r0, r1)
            r5 = r2
            ge.bog.designsystem.components.input.Input r5 = (p341ge.bog.designsystem.components.input.Input) r5
            if (r5 == 0) goto L_0x00f1
            int r1 = p411em.C12488e.account_type_input
            android.view.View r2 = p086g1.C6202b.m24689a(r0, r1)
            r6 = r2
            ge.bog.designsystem.components.input.Input r6 = (p341ge.bog.designsystem.components.input.Input) r6
            if (r6 == 0) goto L_0x00f1
            int r1 = p411em.C12488e.f37217p
            android.view.View r2 = p086g1.C6202b.m24689a(r0, r1)
            r7 = r2
            ge.bog.designsystem.components.creditcardwidget.CreditCardWidgetBannerView r7 = (p341ge.bog.designsystem.components.creditcardwidget.CreditCardWidgetBannerView) r7
            if (r7 == 0) goto L_0x00f1
            int r1 = p411em.C12488e.f37222t
            android.view.View r2 = p086g1.C6202b.m24689a(r0, r1)
            r8 = r2
            ge.bog.designsystem.components.emptywidget.EmptyWidget r8 = (p341ge.bog.designsystem.components.emptywidget.EmptyWidget) r8
            if (r8 == 0) goto L_0x00f1
            int r1 = p411em.C12488e.card_details_inputs
            android.view.View r2 = p086g1.C6202b.m24689a(r0, r1)
            r9 = r2
            androidx.constraintlayout.widget.ConstraintLayout r9 = (androidx.constraintlayout.widget.ConstraintLayout) r9
            if (r9 == 0) goto L_0x00f1
            int r1 = p411em.C12488e.card_details_inputs_loaders
            android.view.View r2 = p086g1.C6202b.m24689a(r0, r1)
            r10 = r2
            android.widget.LinearLayout r10 = (android.widget.LinearLayout) r10
            if (r10 == 0) goto L_0x00f1
            int r1 = p411em.C12488e.card_headers
            android.view.View r2 = p086g1.C6202b.m24689a(r0, r1)
            r11 = r2
            androidx.constraintlayout.widget.Barrier r11 = (androidx.constraintlayout.widget.Barrier) r11
            if (r11 == 0) goto L_0x00f1
            int r1 = p411em.C12488e.card_limit
            android.view.View r2 = p086g1.C6202b.m24689a(r0, r1)
            r12 = r2
            ge.bog.designsystem.components.input.Input r12 = (p341ge.bog.designsystem.components.input.Input) r12
            if (r12 == 0) goto L_0x00f1
            int r1 = p411em.C12488e.card_limits_description
            android.view.View r2 = p086g1.C6202b.m24689a(r0, r1)
            r13 = r2
            ge.bog.designsystem.components.pagedescription.PageDescriptionView r13 = (p341ge.bog.designsystem.components.pagedescription.PageDescriptionView) r13
            if (r13 == 0) goto L_0x00f1
            int r1 = p411em.C12488e.card_limits_group
            android.view.View r2 = p086g1.C6202b.m24689a(r0, r1)
            r14 = r2
            androidx.constraintlayout.widget.Group r14 = (androidx.constraintlayout.widget.Group) r14
            if (r14 == 0) goto L_0x00f1
            int r1 = p411em.C12488e.f37175E
            android.view.View r2 = p086g1.C6202b.m24689a(r0, r1)
            r15 = r2
            ge.bog.designsystem.components.input.Input r15 = (p341ge.bog.designsystem.components.input.Input) r15
            if (r15 == 0) goto L_0x00f1
            int r1 = p411em.C12488e.currency_chips
            android.view.View r2 = p086g1.C6202b.m24689a(r0, r1)
            r16 = r2
            ge.bog.designsystem.components.chips.ChipGroup r16 = (p341ge.bog.designsystem.components.chips.ChipGroup) r16
            if (r16 == 0) goto L_0x00f1
            int r1 = p411em.C12488e.currency_group
            android.view.View r2 = p086g1.C6202b.m24689a(r0, r1)
            r17 = r2
            androidx.constraintlayout.widget.Group r17 = (androidx.constraintlayout.widget.Group) r17
            if (r17 == 0) goto L_0x00f1
            int r1 = p411em.C12488e.f37174D0
            android.view.View r2 = p086g1.C6202b.m24689a(r0, r1)
            r18 = r2
            androidx.constraintlayout.widget.Guideline r18 = (androidx.constraintlayout.widget.Guideline) r18
            if (r18 == 0) goto L_0x00f1
            int r1 = p411em.C12488e.f37176E0
            android.view.View r2 = p086g1.C6202b.m24689a(r0, r1)
            r19 = r2
            androidx.constraintlayout.widget.Guideline r19 = (androidx.constraintlayout.widget.Guideline) r19
            if (r19 == 0) goto L_0x00f1
            int r1 = p411em.C12488e.f37180H0
            android.view.View r2 = p086g1.C6202b.m24689a(r0, r1)
            r20 = r2
            ge.bog.designsystem.components.loading.LoadingView r20 = (p341ge.bog.designsystem.components.loading.LoadingView) r20
            if (r20 == 0) goto L_0x00f1
            int r1 = p411em.C12488e.f37186O0
            android.view.View r2 = p086g1.C6202b.m24689a(r0, r1)
            r21 = r2
            ge.bog.designsystem.components.layersandshadows.LayerView r21 = (p341ge.bog.designsystem.components.layersandshadows.LayerView) r21
            if (r21 == 0) goto L_0x00f1
            int r1 = p411em.C12488e.main_currency_header
            android.view.View r2 = p086g1.C6202b.m24689a(r0, r1)
            r22 = r2
            ge.bog.designsystem.components.emptywidget.EmptyWidget r22 = (p341ge.bog.designsystem.components.emptywidget.EmptyWidget) r22
            if (r22 == 0) goto L_0x00f1
            int r1 = p411em.C12488e.pin_layout
            android.view.View r2 = p086g1.C6202b.m24689a(r0, r1)
            if (r2 == 0) goto L_0x00f1
            jm.f0 r23 = p481jm.C16227f0.m57836a(r2)
            int r1 = p411em.C12488e.student_region
            android.view.View r2 = p086g1.C6202b.m24689a(r0, r1)
            r24 = r2
            ge.bog.designsystem.components.input.Input r24 = (p341ge.bog.designsystem.components.input.Input) r24
            if (r24 == 0) goto L_0x00f1
            jm.p r1 = new jm.p
            r3 = r1
            r4 = r0
            android.widget.ScrollView r4 = (android.widget.ScrollView) r4
            r3.<init>(r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20, r21, r22, r23, r24)
            return r1
        L_0x00f1:
            android.content.res.Resources r0 = r25.getResources()
            java.lang.String r0 = r0.getResourceName(r1)
            java.lang.NullPointerException r1 = new java.lang.NullPointerException
            java.lang.String r2 = "Missing required view with ID: "
            java.lang.String r0 = r2.concat(r0)
            r1.<init>(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: p481jm.C16237p.m57883a(android.view.View):jm.p");
    }

    /* renamed from: d */
    public static C16237p m57884d(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(C12489f.fragment_order_card_details, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return m57883a(inflate);
    }

    /* renamed from: c */
    public ScrollView mo3946b() {
        return this.f45936d;
    }
}
