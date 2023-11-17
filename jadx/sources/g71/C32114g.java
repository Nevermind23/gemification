package g71;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import androidx.constraintlayout.widget.ConstraintLayout;
import c71.C31285e;
import p086g1.C6201a;
import p341ge.bog.designsystem.components.buttons.Button;
import p341ge.bog.designsystem.components.creditcard.CreditCardView;
import p341ge.bog.designsystem.components.emptywidget.EmptyWidget;
import p341ge.bog.designsystem.components.fixedbutton.FixedButtonCardSelectorView;
import p341ge.bog.designsystem.components.input.Input;
import p341ge.bog.designsystem.components.layersandshadows.LayerView;
import p341ge.bog.designsystem.components.pagedescription.PageDescriptionView;
import p341ge.bog.mobilebank.cleanarch.presentation.common.StateView;

/* renamed from: g71.g */
public final class C32114g implements C6201a {

    /* renamed from: d */
    private final StateView f78990d;

    /* renamed from: e */
    public final LayerView f78991e;

    /* renamed from: f */
    public final ConstraintLayout f78992f;

    /* renamed from: g */
    public final LinearLayout f78993g;

    /* renamed from: h */
    public final FrameLayout f78994h;

    /* renamed from: i */
    public final Button f78995i;

    /* renamed from: j */
    public final CreditCardView f78996j;

    /* renamed from: k */
    public final View f78997k;

    /* renamed from: l */
    public final EmptyWidget f78998l;

    /* renamed from: m */
    public final PageDescriptionView f78999m;

    /* renamed from: n */
    public final PageDescriptionView f79000n;

    /* renamed from: o */
    public final FixedButtonCardSelectorView f79001o;

    /* renamed from: p */
    public final Input f79002p;

    /* renamed from: q */
    public final Input f79003q;

    private C32114g(StateView stateView, LayerView layerView, ConstraintLayout constraintLayout, LinearLayout linearLayout, FrameLayout frameLayout, Button button, CreditCardView creditCardView, View view, EmptyWidget emptyWidget, PageDescriptionView pageDescriptionView, PageDescriptionView pageDescriptionView2, FixedButtonCardSelectorView fixedButtonCardSelectorView, Input input, Input input2) {
        this.f78990d = stateView;
        this.f78991e = layerView;
        this.f78992f = constraintLayout;
        this.f78993g = linearLayout;
        this.f78994h = frameLayout;
        this.f78995i = button;
        this.f78996j = creditCardView;
        this.f78997k = view;
        this.f78998l = emptyWidget;
        this.f78999m = pageDescriptionView;
        this.f79000n = pageDescriptionView2;
        this.f79001o = fixedButtonCardSelectorView;
        this.f79002p = input;
        this.f79003q = input2;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:12:0x0044, code lost:
        r1 = c71.C31284d.tc_card_divider;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static g71.C32114g m94589a(android.view.View r18) {
        /*
            r0 = r18
            int r1 = c71.C31284d.buy_transport_card_layer_view
            android.view.View r2 = p086g1.C6202b.m24689a(r0, r1)
            r5 = r2
            ge.bog.designsystem.components.layersandshadows.LayerView r5 = (p341ge.bog.designsystem.components.layersandshadows.LayerView) r5
            if (r5 == 0) goto L_0x009a
            int r1 = c71.C31284d.f77706r
            android.view.View r2 = p086g1.C6202b.m24689a(r0, r1)
            r6 = r2
            androidx.constraintlayout.widget.ConstraintLayout r6 = (androidx.constraintlayout.widget.ConstraintLayout) r6
            if (r6 == 0) goto L_0x009a
            int r1 = c71.C31284d.f77710v
            android.view.View r2 = p086g1.C6202b.m24689a(r0, r1)
            r7 = r2
            android.widget.LinearLayout r7 = (android.widget.LinearLayout) r7
            if (r7 == 0) goto L_0x009a
            int r1 = c71.C31284d.f77699G
            android.view.View r2 = p086g1.C6202b.m24689a(r0, r1)
            r8 = r2
            android.widget.FrameLayout r8 = (android.widget.FrameLayout) r8
            if (r8 == 0) goto L_0x009a
            int r1 = c71.C31284d.f77702P
            android.view.View r2 = p086g1.C6202b.m24689a(r0, r1)
            r9 = r2
            ge.bog.designsystem.components.buttons.Button r9 = (p341ge.bog.designsystem.components.buttons.Button) r9
            if (r9 == 0) goto L_0x009a
            int r1 = c71.C31284d.tc_active_card
            android.view.View r2 = p086g1.C6202b.m24689a(r0, r1)
            r10 = r2
            ge.bog.designsystem.components.creditcard.CreditCardView r10 = (p341ge.bog.designsystem.components.creditcard.CreditCardView) r10
            if (r10 == 0) goto L_0x009a
            int r1 = c71.C31284d.tc_card_divider
            android.view.View r11 = p086g1.C6202b.m24689a(r0, r1)
            if (r11 == 0) goto L_0x009a
            int r1 = c71.C31284d.tc_details_empty_widget_2
            android.view.View r2 = p086g1.C6202b.m24689a(r0, r1)
            r12 = r2
            ge.bog.designsystem.components.emptywidget.EmptyWidget r12 = (p341ge.bog.designsystem.components.emptywidget.EmptyWidget) r12
            if (r12 == 0) goto L_0x009a
            int r1 = c71.C31284d.tc_details_page_description_1
            android.view.View r2 = p086g1.C6202b.m24689a(r0, r1)
            r13 = r2
            ge.bog.designsystem.components.pagedescription.PageDescriptionView r13 = (p341ge.bog.designsystem.components.pagedescription.PageDescriptionView) r13
            if (r13 == 0) goto L_0x009a
            int r1 = c71.C31284d.tc_details_page_description_2
            android.view.View r2 = p086g1.C6202b.m24689a(r0, r1)
            r14 = r2
            ge.bog.designsystem.components.pagedescription.PageDescriptionView r14 = (p341ge.bog.designsystem.components.pagedescription.PageDescriptionView) r14
            if (r14 == 0) goto L_0x009a
            int r1 = c71.C31284d.tc_details_pay_btn
            android.view.View r2 = p086g1.C6202b.m24689a(r0, r1)
            r15 = r2
            ge.bog.designsystem.components.fixedbutton.FixedButtonCardSelectorView r15 = (p341ge.bog.designsystem.components.fixedbutton.FixedButtonCardSelectorView) r15
            if (r15 == 0) goto L_0x009a
            int r1 = c71.C31284d.tc_pass_type_selector
            android.view.View r2 = p086g1.C6202b.m24689a(r0, r1)
            r16 = r2
            ge.bog.designsystem.components.input.Input r16 = (p341ge.bog.designsystem.components.input.Input) r16
            if (r16 == 0) goto L_0x009a
            int r1 = c71.C31284d.tc_select_card_pass_device_selector
            android.view.View r2 = p086g1.C6202b.m24689a(r0, r1)
            r17 = r2
            ge.bog.designsystem.components.input.Input r17 = (p341ge.bog.designsystem.components.input.Input) r17
            if (r17 == 0) goto L_0x009a
            g71.g r1 = new g71.g
            r4 = r0
            ge.bog.mobilebank.cleanarch.presentation.common.StateView r4 = (p341ge.bog.mobilebank.cleanarch.presentation.common.StateView) r4
            r3 = r1
            r3.<init>(r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17)
            return r1
        L_0x009a:
            android.content.res.Resources r0 = r18.getResources()
            java.lang.String r0 = r0.getResourceName(r1)
            java.lang.NullPointerException r1 = new java.lang.NullPointerException
            java.lang.String r2 = "Missing required view with ID: "
            java.lang.String r0 = r2.concat(r0)
            r1.<init>(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: g71.C32114g.m94589a(android.view.View):g71.g");
    }

    /* renamed from: d */
    public static C32114g m94590d(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(C31285e.fragment_select_transport_card_details, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return m94589a(inflate);
    }

    /* renamed from: c */
    public StateView mo3946b() {
        return this.f78990d;
    }
}
