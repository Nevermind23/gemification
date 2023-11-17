package pr0;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.widget.NestedScrollView;
import androidx.recyclerview.widget.RecyclerView;
import lr0.C37131f;
import p086g1.C6201a;
import p341ge.bog.designsystem.components.accountpicker.AccountPickerView;
import p341ge.bog.designsystem.components.buttons.Button;
import p341ge.bog.designsystem.components.checkbox.CheckboxView;
import p341ge.bog.designsystem.components.chips.Chip;
import p341ge.bog.designsystem.components.chips.ChipGroup;
import p341ge.bog.designsystem.components.emptywidget.EmptyWidget;
import p341ge.bog.designsystem.components.fixedbutton.FixedButtonView;
import p341ge.bog.designsystem.components.inlinefeedback.InlineFeedback;
import p341ge.bog.designsystem.components.input.Input;
import p341ge.bog.designsystem.components.layersandshadows.LayerView;
import p341ge.bog.mobilebank.cleanarch.presentation.common.StateView;
import p341ge.bog.mobilebank.p975ui.views.widgets.BigDividerView;

/* renamed from: pr0.g0 */
public final class C37955g0 implements C6201a {

    /* renamed from: A */
    public final Button f91142A;

    /* renamed from: B */
    public final FrameLayout f91143B;

    /* renamed from: C */
    public final StateView f91144C;

    /* renamed from: D */
    public final CheckboxView f91145D;

    /* renamed from: E */
    public final FrameLayout f91146E;

    /* renamed from: d */
    private final StateView f91147d;

    /* renamed from: e */
    public final AccountPickerView f91148e;

    /* renamed from: f */
    public final Input f91149f;

    /* renamed from: g */
    public final Chip f91150g;

    /* renamed from: h */
    public final Chip f91151h;

    /* renamed from: i */
    public final ConstraintLayout f91152i;

    /* renamed from: j */
    public final LinearLayout f91153j;

    /* renamed from: k */
    public final RecyclerView f91154k;

    /* renamed from: l */
    public final LayerView f91155l;

    /* renamed from: m */
    public final LayerView f91156m;

    /* renamed from: n */
    public final LayerView f91157n;

    /* renamed from: o */
    public final EmptyWidget f91158o;

    /* renamed from: p */
    public final NestedScrollView f91159p;

    /* renamed from: q */
    public final InlineFeedback f91160q;

    /* renamed from: r */
    public final FixedButtonView f91161r;

    /* renamed from: s */
    public final EmptyWidget f91162s;

    /* renamed from: t */
    public final BigDividerView f91163t;

    /* renamed from: u */
    public final InlineFeedback f91164u;

    /* renamed from: v */
    public final View f91165v;

    /* renamed from: w */
    public final ChipGroup f91166w;

    /* renamed from: x */
    public final Input f91167x;

    /* renamed from: y */
    public final EmptyWidget f91168y;

    /* renamed from: z */
    public final RecyclerView f91169z;

    private C37955g0(StateView stateView, AccountPickerView accountPickerView, Input input, Chip chip, Chip chip2, ConstraintLayout constraintLayout, LinearLayout linearLayout, RecyclerView recyclerView, LayerView layerView, LayerView layerView2, LayerView layerView3, EmptyWidget emptyWidget, NestedScrollView nestedScrollView, InlineFeedback inlineFeedback, FixedButtonView fixedButtonView, EmptyWidget emptyWidget2, BigDividerView bigDividerView, InlineFeedback inlineFeedback2, View view, ChipGroup chipGroup, Input input2, EmptyWidget emptyWidget3, RecyclerView recyclerView2, Button button, FrameLayout frameLayout, StateView stateView2, CheckboxView checkboxView, FrameLayout frameLayout2) {
        this.f91147d = stateView;
        this.f91148e = accountPickerView;
        this.f91149f = input;
        this.f91150g = chip;
        this.f91151h = chip2;
        this.f91152i = constraintLayout;
        this.f91153j = linearLayout;
        this.f91154k = recyclerView;
        this.f91155l = layerView;
        this.f91156m = layerView2;
        this.f91157n = layerView3;
        this.f91158o = emptyWidget;
        this.f91159p = nestedScrollView;
        this.f91160q = inlineFeedback;
        this.f91161r = fixedButtonView;
        this.f91162s = emptyWidget2;
        this.f91163t = bigDividerView;
        this.f91164u = inlineFeedback2;
        this.f91165v = view;
        this.f91166w = chipGroup;
        this.f91167x = input2;
        this.f91168y = emptyWidget3;
        this.f91169z = recyclerView2;
        this.f91142A = button;
        this.f91143B = frameLayout;
        this.f91144C = stateView2;
        this.f91145D = checkboxView;
        this.f91146E = frameLayout2;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:34:0x00c3, code lost:
        r1 = lr0.C37130e.payment_loading_cover;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static pr0.C37955g0 m111565a(android.view.View r32) {
        /*
            r0 = r32
            int r1 = lr0.C37130e.f89428a
            android.view.View r2 = p086g1.C6202b.m24689a(r0, r1)
            r5 = r2
            ge.bog.designsystem.components.accountpicker.AccountPickerView r5 = (p341ge.bog.designsystem.components.accountpicker.AccountPickerView) r5
            if (r5 == 0) goto L_0x0138
            int r1 = lr0.C37130e.f89434l
            android.view.View r2 = p086g1.C6202b.m24689a(r0, r1)
            r6 = r2
            ge.bog.designsystem.components.input.Input r6 = (p341ge.bog.designsystem.components.input.Input) r6
            if (r6 == 0) goto L_0x0138
            int r1 = lr0.C37130e.chip_full
            android.view.View r2 = p086g1.C6202b.m24689a(r0, r1)
            r7 = r2
            ge.bog.designsystem.components.chips.Chip r7 = (p341ge.bog.designsystem.components.chips.Chip) r7
            if (r7 == 0) goto L_0x0138
            int r1 = lr0.C37130e.chip_part
            android.view.View r2 = p086g1.C6202b.m24689a(r0, r1)
            r8 = r2
            ge.bog.designsystem.components.chips.Chip r8 = (p341ge.bog.designsystem.components.chips.Chip) r8
            if (r8 == 0) goto L_0x0138
            int r1 = lr0.C37130e.f89450w
            android.view.View r2 = p086g1.C6202b.m24689a(r0, r1)
            r9 = r2
            androidx.constraintlayout.widget.ConstraintLayout r9 = (androidx.constraintlayout.widget.ConstraintLayout) r9
            if (r9 == 0) goto L_0x0138
            int r1 = lr0.C37130e.f89421F
            android.view.View r2 = p086g1.C6202b.m24689a(r0, r1)
            r10 = r2
            android.widget.LinearLayout r10 = (android.widget.LinearLayout) r10
            if (r10 == 0) goto L_0x0138
            int r1 = lr0.C37130e.full_prepayment_details
            android.view.View r2 = p086g1.C6202b.m24689a(r0, r1)
            r11 = r2
            androidx.recyclerview.widget.RecyclerView r11 = (androidx.recyclerview.widget.RecyclerView) r11
            if (r11 == 0) goto L_0x0138
            int r1 = lr0.C37130e.general_loading_layer
            android.view.View r2 = p086g1.C6202b.m24689a(r0, r1)
            r12 = r2
            ge.bog.designsystem.components.layersandshadows.LayerView r12 = (p341ge.bog.designsystem.components.layersandshadows.LayerView) r12
            if (r12 == 0) goto L_0x0138
            int r1 = lr0.C37130e.loan_details_layer
            android.view.View r2 = p086g1.C6202b.m24689a(r0, r1)
            r13 = r2
            ge.bog.designsystem.components.layersandshadows.LayerView r13 = (p341ge.bog.designsystem.components.layersandshadows.LayerView) r13
            if (r13 == 0) goto L_0x0138
            int r1 = lr0.C37130e.loan_details_loading_layer
            android.view.View r2 = p086g1.C6202b.m24689a(r0, r1)
            r14 = r2
            ge.bog.designsystem.components.layersandshadows.LayerView r14 = (p341ge.bog.designsystem.components.layersandshadows.LayerView) r14
            if (r14 == 0) goto L_0x0138
            int r1 = lr0.C37130e.loan_details_title
            android.view.View r2 = p086g1.C6202b.m24689a(r0, r1)
            r15 = r2
            ge.bog.designsystem.components.emptywidget.EmptyWidget r15 = (p341ge.bog.designsystem.components.emptywidget.EmptyWidget) r15
            if (r15 == 0) goto L_0x0138
            int r1 = lr0.C37130e.f89451w0
            android.view.View r2 = p086g1.C6202b.m24689a(r0, r1)
            r16 = r2
            androidx.core.widget.NestedScrollView r16 = (androidx.core.widget.NestedScrollView) r16
            if (r16 == 0) goto L_0x0138
            int r1 = lr0.C37130e.only_full_payment_hint
            android.view.View r2 = p086g1.C6202b.m24689a(r0, r1)
            r17 = r2
            ge.bog.designsystem.components.inlinefeedback.InlineFeedback r17 = (p341ge.bog.designsystem.components.inlinefeedback.InlineFeedback) r17
            if (r17 == 0) goto L_0x0138
            int r1 = lr0.C37130e.f89424J0
            android.view.View r2 = p086g1.C6202b.m24689a(r0, r1)
            r18 = r2
            ge.bog.designsystem.components.fixedbutton.FixedButtonView r18 = (p341ge.bog.designsystem.components.fixedbutton.FixedButtonView) r18
            if (r18 == 0) goto L_0x0138
            int r1 = lr0.C37130e.payment_details_title
            android.view.View r2 = p086g1.C6202b.m24689a(r0, r1)
            r19 = r2
            ge.bog.designsystem.components.emptywidget.EmptyWidget r19 = (p341ge.bog.designsystem.components.emptywidget.EmptyWidget) r19
            if (r19 == 0) goto L_0x0138
            int r1 = lr0.C37130e.payment_divider
            android.view.View r2 = p086g1.C6202b.m24689a(r0, r1)
            r20 = r2
            ge.bog.mobilebank.ui.views.widgets.BigDividerView r20 = (p341ge.bog.mobilebank.p975ui.views.widgets.BigDividerView) r20
            if (r20 == 0) goto L_0x0138
            int r1 = lr0.C37130e.payment_hint
            android.view.View r2 = p086g1.C6202b.m24689a(r0, r1)
            r21 = r2
            ge.bog.designsystem.components.inlinefeedback.InlineFeedback r21 = (p341ge.bog.designsystem.components.inlinefeedback.InlineFeedback) r21
            if (r21 == 0) goto L_0x0138
            int r1 = lr0.C37130e.payment_loading_cover
            android.view.View r22 = p086g1.C6202b.m24689a(r0, r1)
            if (r22 == 0) goto L_0x0138
            int r1 = lr0.C37130e.payment_type_group
            android.view.View r2 = p086g1.C6202b.m24689a(r0, r1)
            r23 = r2
            ge.bog.designsystem.components.chips.ChipGroup r23 = (p341ge.bog.designsystem.components.chips.ChipGroup) r23
            if (r23 == 0) goto L_0x0138
            int r1 = lr0.C37130e.payment_type_input
            android.view.View r2 = p086g1.C6202b.m24689a(r0, r1)
            r24 = r2
            ge.bog.designsystem.components.input.Input r24 = (p341ge.bog.designsystem.components.input.Input) r24
            if (r24 == 0) goto L_0x0138
            int r1 = lr0.C37130e.payment_type_title
            android.view.View r2 = p086g1.C6202b.m24689a(r0, r1)
            r25 = r2
            ge.bog.designsystem.components.emptywidget.EmptyWidget r25 = (p341ge.bog.designsystem.components.emptywidget.EmptyWidget) r25
            if (r25 == 0) goto L_0x0138
            int r1 = lr0.C37130e.prepayment_details
            android.view.View r2 = p086g1.C6202b.m24689a(r0, r1)
            r26 = r2
            androidx.recyclerview.widget.RecyclerView r26 = (androidx.recyclerview.widget.RecyclerView) r26
            if (r26 == 0) goto L_0x0138
            int r1 = lr0.C37130e.f89432f1
            android.view.View r2 = p086g1.C6202b.m24689a(r0, r1)
            r27 = r2
            ge.bog.designsystem.components.buttons.Button r27 = (p341ge.bog.designsystem.components.buttons.Button) r27
            if (r27 == 0) goto L_0x0138
            int r1 = lr0.C37130e.f89442q1
            android.view.View r2 = p086g1.C6202b.m24689a(r0, r1)
            r28 = r2
            android.widget.FrameLayout r28 = (android.widget.FrameLayout) r28
            if (r28 == 0) goto L_0x0138
            r29 = r0
            ge.bog.mobilebank.cleanarch.presentation.common.StateView r29 = (p341ge.bog.mobilebank.cleanarch.presentation.common.StateView) r29
            int r1 = lr0.C37130e.f89444s1
            android.view.View r2 = p086g1.C6202b.m24689a(r0, r1)
            r30 = r2
            ge.bog.designsystem.components.checkbox.CheckboxView r30 = (p341ge.bog.designsystem.components.checkbox.CheckboxView) r30
            if (r30 == 0) goto L_0x0138
            int r1 = lr0.C37130e.f89445t1
            android.view.View r2 = p086g1.C6202b.m24689a(r0, r1)
            r31 = r2
            android.widget.FrameLayout r31 = (android.widget.FrameLayout) r31
            if (r31 == 0) goto L_0x0138
            pr0.g0 r0 = new pr0.g0
            r3 = r0
            r4 = r29
            r3.<init>(r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20, r21, r22, r23, r24, r25, r26, r27, r28, r29, r30, r31)
            return r0
        L_0x0138:
            android.content.res.Resources r0 = r32.getResources()
            java.lang.String r0 = r0.getResourceName(r1)
            java.lang.NullPointerException r1 = new java.lang.NullPointerException
            java.lang.String r2 = "Missing required view with ID: "
            java.lang.String r0 = r2.concat(r0)
            r1.<init>(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: pr0.C37955g0.m111565a(android.view.View):pr0.g0");
    }

    /* renamed from: d */
    public static C37955g0 m111566d(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(C37131f.repayment_fragment, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return m111565a(inflate);
    }

    /* renamed from: c */
    public StateView mo3946b() {
        return this.f91147d;
    }
}
