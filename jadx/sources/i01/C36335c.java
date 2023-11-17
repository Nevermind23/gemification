package i01;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import e01.C31639c;
import p086g1.C6201a;
import p341ge.bog.designsystem.components.biginput.BigInputView;
import p341ge.bog.designsystem.components.buttons.Button;
import p341ge.bog.designsystem.components.chips.ChipGroup;
import p341ge.bog.designsystem.components.creditcardsmallpicker.CreditCardSmallPickerView;
import p341ge.bog.designsystem.components.inlinefeedback2.InlineFeedback2;
import p341ge.bog.designsystem.components.layersandshadows.LayerView;
import p341ge.bog.designsystem.components.pagestate.PageState;

/* renamed from: i01.c */
public final class C36335c implements C6201a {

    /* renamed from: d */
    private final ConstraintLayout f87678d;

    /* renamed from: e */
    public final TextView f87679e;

    /* renamed from: f */
    public final LayerView f87680f;

    /* renamed from: g */
    public final CreditCardSmallPickerView f87681g;

    /* renamed from: h */
    public final LayerView f87682h;

    /* renamed from: i */
    public final ChipGroup f87683i;

    /* renamed from: j */
    public final LayerView f87684j;

    /* renamed from: k */
    public final Button f87685k;

    /* renamed from: l */
    public final InlineFeedback2 f87686l;

    /* renamed from: m */
    public final TextView f87687m;

    /* renamed from: n */
    public final FrameLayout f87688n;

    /* renamed from: o */
    public final InlineFeedback2 f87689o;

    /* renamed from: p */
    public final LayerView f87690p;

    /* renamed from: q */
    public final BigInputView f87691q;

    /* renamed from: r */
    public final FrameLayout f87692r;

    /* renamed from: s */
    public final Button f87693s;

    /* renamed from: t */
    public final PageState f87694t;

    /* renamed from: u */
    public final C36338f f87695u;

    private C36335c(ConstraintLayout constraintLayout, TextView textView, LayerView layerView, CreditCardSmallPickerView creditCardSmallPickerView, LayerView layerView2, ChipGroup chipGroup, LayerView layerView3, Button button, InlineFeedback2 inlineFeedback2, TextView textView2, FrameLayout frameLayout, InlineFeedback2 inlineFeedback22, LayerView layerView4, BigInputView bigInputView, FrameLayout frameLayout2, Button button2, PageState pageState, C36338f fVar) {
        this.f87678d = constraintLayout;
        this.f87679e = textView;
        this.f87680f = layerView;
        this.f87681g = creditCardSmallPickerView;
        this.f87682h = layerView2;
        this.f87683i = chipGroup;
        this.f87684j = layerView3;
        this.f87685k = button;
        this.f87686l = inlineFeedback2;
        this.f87687m = textView2;
        this.f87688n = frameLayout;
        this.f87689o = inlineFeedback22;
        this.f87690p = layerView4;
        this.f87691q = bigInputView;
        this.f87692r = frameLayout2;
        this.f87693s = button2;
        this.f87694t = pageState;
        this.f87695u = fVar;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:32:0x00b7, code lost:
        r1 = e01.C31638b.f78209A;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static i01.C36335c m107830a(android.view.View r22) {
        /*
            r0 = r22
            int r1 = e01.C31638b.available_bills
            android.view.View r2 = p086g1.C6202b.m24689a(r0, r1)
            r5 = r2
            android.widget.TextView r5 = (android.widget.TextView) r5
            if (r5 == 0) goto L_0x00cd
            int r1 = e01.C31638b.f78212c
            android.view.View r2 = p086g1.C6202b.m24689a(r0, r1)
            r6 = r2
            ge.bog.designsystem.components.layersandshadows.LayerView r6 = (p341ge.bog.designsystem.components.layersandshadows.LayerView) r6
            if (r6 == 0) goto L_0x00cd
            int r1 = e01.C31638b.f78213d
            android.view.View r2 = p086g1.C6202b.m24689a(r0, r1)
            r7 = r2
            ge.bog.designsystem.components.creditcardsmallpicker.CreditCardSmallPickerView r7 = (p341ge.bog.designsystem.components.creditcardsmallpicker.CreditCardSmallPickerView) r7
            if (r7 == 0) goto L_0x00cd
            int r1 = e01.C31638b.card_picker_container
            android.view.View r2 = p086g1.C6202b.m24689a(r0, r1)
            r8 = r2
            ge.bog.designsystem.components.layersandshadows.LayerView r8 = (p341ge.bog.designsystem.components.layersandshadows.LayerView) r8
            if (r8 == 0) goto L_0x00cd
            int r1 = e01.C31638b.ccy_chips
            android.view.View r2 = p086g1.C6202b.m24689a(r0, r1)
            r9 = r2
            ge.bog.designsystem.components.chips.ChipGroup r9 = (p341ge.bog.designsystem.components.chips.ChipGroup) r9
            if (r9 == 0) goto L_0x00cd
            int r1 = e01.C31638b.chip_layer
            android.view.View r2 = p086g1.C6202b.m24689a(r0, r1)
            r10 = r2
            ge.bog.designsystem.components.layersandshadows.LayerView r10 = (p341ge.bog.designsystem.components.layersandshadows.LayerView) r10
            if (r10 == 0) goto L_0x00cd
            int r1 = e01.C31638b.f78214h
            android.view.View r2 = p086g1.C6202b.m24689a(r0, r1)
            r11 = r2
            ge.bog.designsystem.components.buttons.Button r11 = (p341ge.bog.designsystem.components.buttons.Button) r11
            if (r11 == 0) goto L_0x00cd
            int r1 = e01.C31638b.credit_card_feedback
            android.view.View r2 = p086g1.C6202b.m24689a(r0, r1)
            r12 = r2
            ge.bog.designsystem.components.inlinefeedback2.InlineFeedback2 r12 = (p341ge.bog.designsystem.components.inlinefeedback2.InlineFeedback2) r12
            if (r12 == 0) goto L_0x00cd
            int r1 = e01.C31638b.daily_limit
            android.view.View r2 = p086g1.C6202b.m24689a(r0, r1)
            r13 = r2
            android.widget.TextView r13 = (android.widget.TextView) r13
            if (r13 == 0) goto L_0x00cd
            int r1 = e01.C31638b.f78218o
            android.view.View r2 = p086g1.C6202b.m24689a(r0, r1)
            r14 = r2
            android.widget.FrameLayout r14 = (android.widget.FrameLayout) r14
            if (r14 == 0) goto L_0x00cd
            int r1 = e01.C31638b.f78220q
            android.view.View r2 = p086g1.C6202b.m24689a(r0, r1)
            r15 = r2
            ge.bog.designsystem.components.inlinefeedback2.InlineFeedback2 r15 = (p341ge.bog.designsystem.components.inlinefeedback2.InlineFeedback2) r15
            if (r15 == 0) goto L_0x00cd
            int r1 = e01.C31638b.f78221r
            android.view.View r2 = p086g1.C6202b.m24689a(r0, r1)
            r16 = r2
            ge.bog.designsystem.components.layersandshadows.LayerView r16 = (p341ge.bog.designsystem.components.layersandshadows.LayerView) r16
            if (r16 == 0) goto L_0x00cd
            int r1 = e01.C31638b.money_input
            android.view.View r2 = p086g1.C6202b.m24689a(r0, r1)
            r17 = r2
            ge.bog.designsystem.components.biginput.BigInputView r17 = (p341ge.bog.designsystem.components.biginput.BigInputView) r17
            if (r17 == 0) goto L_0x00cd
            int r1 = e01.C31638b.f78223u
            android.view.View r2 = p086g1.C6202b.m24689a(r0, r1)
            r18 = r2
            android.widget.FrameLayout r18 = (android.widget.FrameLayout) r18
            if (r18 == 0) goto L_0x00cd
            int r1 = e01.C31638b.f78225x
            android.view.View r2 = p086g1.C6202b.m24689a(r0, r1)
            r19 = r2
            ge.bog.designsystem.components.buttons.Button r19 = (p341ge.bog.designsystem.components.buttons.Button) r19
            if (r19 == 0) goto L_0x00cd
            int r1 = e01.C31638b.f78226y
            android.view.View r2 = p086g1.C6202b.m24689a(r0, r1)
            r20 = r2
            ge.bog.designsystem.components.pagestate.PageState r20 = (p341ge.bog.designsystem.components.pagestate.PageState) r20
            if (r20 == 0) goto L_0x00cd
            int r1 = e01.C31638b.f78209A
            android.view.View r2 = p086g1.C6202b.m24689a(r0, r1)
            if (r2 == 0) goto L_0x00cd
            i01.f r21 = i01.C36338f.m107843a(r2)
            i01.c r1 = new i01.c
            r3 = r1
            r4 = r0
            androidx.constraintlayout.widget.ConstraintLayout r4 = (androidx.constraintlayout.widget.ConstraintLayout) r4
            r3.<init>(r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20, r21)
            return r1
        L_0x00cd:
            android.content.res.Resources r0 = r22.getResources()
            java.lang.String r0 = r0.getResourceName(r1)
            java.lang.NullPointerException r1 = new java.lang.NullPointerException
            java.lang.String r2 = "Missing required view with ID: "
            java.lang.String r0 = r2.concat(r0)
            r1.<init>(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: i01.C36335c.m107830a(android.view.View):i01.c");
    }

    /* renamed from: d */
    public static C36335c m107831d(LayoutInflater layoutInflater) {
        return m107832e(layoutInflater, (ViewGroup) null, false);
    }

    /* renamed from: e */
    public static C36335c m107832e(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(C31639c.activity_qr_withdrawal, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return m107830a(inflate);
    }

    /* renamed from: c */
    public ConstraintLayout mo3946b() {
        return this.f87678d;
    }
}
