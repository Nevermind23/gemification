package ue0;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.ConstraintLayout;
import ie0.C25188h;
import p086g1.C6201a;
import p341ge.bog.designsystem.components.biginput.BigInputView;
import p341ge.bog.designsystem.components.buttons.Button;
import p341ge.bog.designsystem.components.chips.ChipGroup;
import p341ge.bog.designsystem.components.digitalkeyboard.NumericKeyboardView;
import p341ge.bog.designsystem.components.loading.LoadingView;
import p341ge.bog.designsystem.components.pagedescription.PageDescriptionView;
import p341ge.bog.mobilebank.cleanarch.presentation.common.StateView;
import p90.C27272c8;

/* renamed from: ue0.f0 */
public final class C28725f0 implements C6201a {

    /* renamed from: d */
    private final ConstraintLayout f73224d;

    /* renamed from: e */
    public final Button f73225e;

    /* renamed from: f */
    public final Button f73226f;

    /* renamed from: g */
    public final PageDescriptionView f73227g;

    /* renamed from: h */
    public final StateView f73228h;

    /* renamed from: i */
    public final ChipGroup f73229i;

    /* renamed from: j */
    public final PageDescriptionView f73230j;

    /* renamed from: k */
    public final Button f73231k;

    /* renamed from: l */
    public final BigInputView f73232l;

    /* renamed from: m */
    public final LoadingView f73233m;

    /* renamed from: n */
    public final NumericKeyboardView f73234n;

    /* renamed from: o */
    public final View f73235o;

    /* renamed from: p */
    public final C27272c8 f73236p;

    private C28725f0(ConstraintLayout constraintLayout, Button button, Button button2, PageDescriptionView pageDescriptionView, StateView stateView, ChipGroup chipGroup, PageDescriptionView pageDescriptionView2, Button button3, BigInputView bigInputView, LoadingView loadingView, NumericKeyboardView numericKeyboardView, View view, C27272c8 c8Var) {
        this.f73224d = constraintLayout;
        this.f73225e = button;
        this.f73226f = button2;
        this.f73227g = pageDescriptionView;
        this.f73228h = stateView;
        this.f73229i = chipGroup;
        this.f73230j = pageDescriptionView2;
        this.f73231k = button3;
        this.f73232l = bigInputView;
        this.f73233m = loadingView;
        this.f73234n = numericKeyboardView;
        this.f73235o = view;
        this.f73236p = c8Var;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:20:0x0070, code lost:
        r1 = ie0.C25187g.separator_bottom;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x0078, code lost:
        r1 = ie0.C25187g.f64733z4;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static ue0.C28725f0 m88019a(android.view.View r17) {
        /*
            r0 = r17
            int r1 = ie0.C25187g.f64700i
            android.view.View r2 = p086g1.C6202b.m24689a(r0, r1)
            r5 = r2
            ge.bog.designsystem.components.buttons.Button r5 = (p341ge.bog.designsystem.components.buttons.Button) r5
            if (r5 == 0) goto L_0x008e
            int r1 = ie0.C25187g.button_change_input
            android.view.View r2 = p086g1.C6202b.m24689a(r0, r1)
            r6 = r2
            ge.bog.designsystem.components.buttons.Button r6 = (p341ge.bog.designsystem.components.buttons.Button) r6
            if (r6 == 0) goto L_0x008e
            int r1 = ie0.C25187g.buyPower
            android.view.View r2 = p086g1.C6202b.m24689a(r0, r1)
            r7 = r2
            ge.bog.designsystem.components.pagedescription.PageDescriptionView r7 = (p341ge.bog.designsystem.components.pagedescription.PageDescriptionView) r7
            if (r7 == 0) goto L_0x008e
            int r1 = ie0.C25187g.cashDataState
            android.view.View r2 = p086g1.C6202b.m24689a(r0, r1)
            r8 = r2
            ge.bog.mobilebank.cleanarch.presentation.common.StateView r8 = (p341ge.bog.mobilebank.cleanarch.presentation.common.StateView) r8
            if (r8 == 0) goto L_0x008e
            int r1 = ie0.C25187g.f64713o0
            android.view.View r2 = p086g1.C6202b.m24689a(r0, r1)
            r9 = r2
            ge.bog.designsystem.components.chips.ChipGroup r9 = (p341ge.bog.designsystem.components.chips.ChipGroup) r9
            if (r9 == 0) goto L_0x008e
            int r1 = ie0.C25187g.f64721v0
            android.view.View r2 = p086g1.C6202b.m24689a(r0, r1)
            r10 = r2
            ge.bog.designsystem.components.pagedescription.PageDescriptionView r10 = (p341ge.bog.designsystem.components.pagedescription.PageDescriptionView) r10
            if (r10 == 0) goto L_0x008e
            int r1 = ie0.C25187g.fake_button
            android.view.View r2 = p086g1.C6202b.m24689a(r0, r1)
            r11 = r2
            ge.bog.designsystem.components.buttons.Button r11 = (p341ge.bog.designsystem.components.buttons.Button) r11
            if (r11 == 0) goto L_0x008e
            int r1 = ie0.C25187g.input_view
            android.view.View r2 = p086g1.C6202b.m24689a(r0, r1)
            r12 = r2
            ge.bog.designsystem.components.biginput.BigInputView r12 = (p341ge.bog.designsystem.components.biginput.BigInputView) r12
            if (r12 == 0) goto L_0x008e
            int r1 = ie0.C25187g.f64702j2
            android.view.View r2 = p086g1.C6202b.m24689a(r0, r1)
            r13 = r2
            ge.bog.designsystem.components.loading.LoadingView r13 = (p341ge.bog.designsystem.components.loading.LoadingView) r13
            if (r13 == 0) goto L_0x008e
            int r1 = ie0.C25187g.numeric_keyboard_view
            android.view.View r2 = p086g1.C6202b.m24689a(r0, r1)
            r14 = r2
            ge.bog.designsystem.components.digitalkeyboard.NumericKeyboardView r14 = (p341ge.bog.designsystem.components.digitalkeyboard.NumericKeyboardView) r14
            if (r14 == 0) goto L_0x008e
            int r1 = ie0.C25187g.separator_bottom
            android.view.View r15 = p086g1.C6202b.m24689a(r0, r1)
            if (r15 == 0) goto L_0x008e
            int r1 = ie0.C25187g.f64733z4
            android.view.View r2 = p086g1.C6202b.m24689a(r0, r1)
            if (r2 == 0) goto L_0x008e
            p90.c8 r16 = p90.C27272c8.m84388a(r2)
            ue0.f0 r1 = new ue0.f0
            r4 = r0
            androidx.constraintlayout.widget.ConstraintLayout r4 = (androidx.constraintlayout.widget.ConstraintLayout) r4
            r3 = r1
            r3.<init>(r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16)
            return r1
        L_0x008e:
            android.content.res.Resources r0 = r17.getResources()
            java.lang.String r0 = r0.getResourceName(r1)
            java.lang.NullPointerException r1 = new java.lang.NullPointerException
            java.lang.String r2 = "Missing required view with ID: "
            java.lang.String r0 = r2.concat(r0)
            r1.<init>(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: ue0.C28725f0.m88019a(android.view.View):ue0.f0");
    }

    /* renamed from: d */
    public static C28725f0 m88020d(LayoutInflater layoutInflater) {
        return m88021e(layoutInflater, (ViewGroup) null, false);
    }

    /* renamed from: e */
    public static C28725f0 m88021e(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(C25188h.activity_gt_share_exchange, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return m88019a(inflate);
    }

    /* renamed from: c */
    public ConstraintLayout mo3946b() {
        return this.f73224d;
    }
}
