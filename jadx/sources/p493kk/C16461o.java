package p493kk;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import p086g1.C6201a;
import p341ge.bog.designsystem.components.creditcardsmallpicker.CreditCardSmallPickerView;
import p341ge.bog.designsystem.components.fixedbutton.FixedButtonView;
import p341ge.bog.designsystem.components.inlinefeedback.InlineFeedback;
import p341ge.bog.designsystem.components.layersandshadows.LayerView;
import p341ge.bog.designsystem.components.list.ListItem;
import p341ge.bog.designsystem.components.notificationbadges.BadgeRelativeLayout;
import p341ge.bog.designsystem.components.pagedescription.PageDescriptionView;
import p341ge.bog.designsystem.components.toggle.ToggleView;
import p451hk.C15527e;

/* renamed from: kk.o */
public final class C16461o implements C6201a {

    /* renamed from: A */
    public final BadgeRelativeLayout f46578A;

    /* renamed from: B */
    public final LayerView f46579B;

    /* renamed from: d */
    private final ConstraintLayout f46580d;

    /* renamed from: e */
    public final TextView f46581e;

    /* renamed from: f */
    public final InlineFeedback f46582f;

    /* renamed from: g */
    public final ToggleView f46583g;

    /* renamed from: h */
    public final View f46584h;

    /* renamed from: i */
    public final TextView f46585i;

    /* renamed from: j */
    public final CreditCardSmallPickerView f46586j;

    /* renamed from: k */
    public final ListItem f46587k;

    /* renamed from: l */
    public final ListItem f46588l;

    /* renamed from: m */
    public final TextView f46589m;

    /* renamed from: n */
    public final TextView f46590n;

    /* renamed from: o */
    public final TextView f46591o;

    /* renamed from: p */
    public final TextView f46592p;

    /* renamed from: q */
    public final TextView f46593q;

    /* renamed from: r */
    public final LayerView f46594r;

    /* renamed from: s */
    public final TextView f46595s;

    /* renamed from: t */
    public final BadgeRelativeLayout f46596t;

    /* renamed from: u */
    public final LayerView f46597u;

    /* renamed from: v */
    public final TextView f46598v;

    /* renamed from: w */
    public final PageDescriptionView f46599w;

    /* renamed from: x */
    public final FixedButtonView f46600x;

    /* renamed from: y */
    public final FrameLayout f46601y;

    /* renamed from: z */
    public final View f46602z;

    private C16461o(ConstraintLayout constraintLayout, TextView textView, InlineFeedback inlineFeedback, ToggleView toggleView, View view, TextView textView2, CreditCardSmallPickerView creditCardSmallPickerView, ListItem listItem, ListItem listItem2, TextView textView3, TextView textView4, TextView textView5, TextView textView6, TextView textView7, LayerView layerView, TextView textView8, BadgeRelativeLayout badgeRelativeLayout, LayerView layerView2, TextView textView9, PageDescriptionView pageDescriptionView, FixedButtonView fixedButtonView, FrameLayout frameLayout, View view2, BadgeRelativeLayout badgeRelativeLayout2, LayerView layerView3) {
        this.f46580d = constraintLayout;
        this.f46581e = textView;
        this.f46582f = inlineFeedback;
        this.f46583g = toggleView;
        this.f46584h = view;
        this.f46585i = textView2;
        this.f46586j = creditCardSmallPickerView;
        this.f46587k = listItem;
        this.f46588l = listItem2;
        this.f46589m = textView3;
        this.f46590n = textView4;
        this.f46591o = textView5;
        this.f46592p = textView6;
        this.f46593q = textView7;
        this.f46594r = layerView;
        this.f46595s = textView8;
        this.f46596t = badgeRelativeLayout;
        this.f46597u = layerView2;
        this.f46598v = textView9;
        this.f46599w = pageDescriptionView;
        this.f46600x = fixedButtonView;
        this.f46601y = frameLayout;
        this.f46602z = view2;
        this.f46578A = badgeRelativeLayout2;
        this.f46579B = layerView3;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:42:0x00f0, code lost:
        r1 = p451hk.C15526d.f44055J1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:6:0x0023, code lost:
        r1 = p451hk.C15526d.f44071h0;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static p493kk.C16461o m58649a(android.view.View r29) {
        /*
            r0 = r29
            int r1 = p451hk.C15526d.annual
            android.view.View r2 = p086g1.C6202b.m24689a(r0, r1)
            r5 = r2
            android.widget.TextView r5 = (android.widget.TextView) r5
            if (r5 == 0) goto L_0x011a
            int r1 = p451hk.C15526d.automatic_payment_feedback
            android.view.View r2 = p086g1.C6202b.m24689a(r0, r1)
            r6 = r2
            ge.bog.designsystem.components.inlinefeedback.InlineFeedback r6 = (p341ge.bog.designsystem.components.inlinefeedback.InlineFeedback) r6
            if (r6 == 0) goto L_0x011a
            int r1 = p451hk.C15526d.automatic_toggle_view
            android.view.View r2 = p086g1.C6202b.m24689a(r0, r1)
            r7 = r2
            ge.bog.designsystem.components.toggle.ToggleView r7 = (p341ge.bog.designsystem.components.toggle.ToggleView) r7
            if (r7 == 0) goto L_0x011a
            int r1 = p451hk.C15526d.f44071h0
            android.view.View r8 = p086g1.C6202b.m24689a(r0, r1)
            if (r8 == 0) goto L_0x011a
            int r1 = p451hk.C15526d.first_payment
            android.view.View r2 = p086g1.C6202b.m24689a(r0, r1)
            r9 = r2
            android.widget.TextView r9 = (android.widget.TextView) r9
            if (r9 == 0) goto L_0x011a
            int r1 = p451hk.C15526d.insurance_card_picker
            android.view.View r2 = p086g1.C6202b.m24689a(r0, r1)
            r10 = r2
            ge.bog.designsystem.components.creditcardsmallpicker.CreditCardSmallPickerView r10 = (p341ge.bog.designsystem.components.creditcardsmallpicker.CreditCardSmallPickerView) r10
            if (r10 == 0) goto L_0x011a
            int r1 = p451hk.C15526d.item_automatic_payment
            android.view.View r2 = p086g1.C6202b.m24689a(r0, r1)
            r11 = r2
            ge.bog.designsystem.components.list.ListItem r11 = (p341ge.bog.designsystem.components.list.ListItem) r11
            if (r11 == 0) goto L_0x011a
            int r1 = p451hk.C15526d.item_monthly_payment
            android.view.View r2 = p086g1.C6202b.m24689a(r0, r1)
            r12 = r2
            ge.bog.designsystem.components.list.ListItem r12 = (p341ge.bog.designsystem.components.list.ListItem) r12
            if (r12 == 0) goto L_0x011a
            int r1 = p451hk.C15526d.label_annual
            android.view.View r2 = p086g1.C6202b.m24689a(r0, r1)
            r13 = r2
            android.widget.TextView r13 = (android.widget.TextView) r13
            if (r13 == 0) goto L_0x011a
            int r1 = p451hk.C15526d.label_automatic_payment
            android.view.View r2 = p086g1.C6202b.m24689a(r0, r1)
            r14 = r2
            android.widget.TextView r14 = (android.widget.TextView) r14
            if (r14 == 0) goto L_0x011a
            int r1 = p451hk.C15526d.label_first_payment
            android.view.View r2 = p086g1.C6202b.m24689a(r0, r1)
            r15 = r2
            android.widget.TextView r15 = (android.widget.TextView) r15
            if (r15 == 0) goto L_0x011a
            int r1 = p451hk.C15526d.label_monthly
            android.view.View r2 = p086g1.C6202b.m24689a(r0, r1)
            r16 = r2
            android.widget.TextView r16 = (android.widget.TextView) r16
            if (r16 == 0) goto L_0x011a
            int r1 = p451hk.C15526d.label_monthly_payment
            android.view.View r2 = p086g1.C6202b.m24689a(r0, r1)
            r17 = r2
            android.widget.TextView r17 = (android.widget.TextView) r17
            if (r17 == 0) goto L_0x011a
            int r1 = p451hk.C15526d.f44057P0
            android.view.View r2 = p086g1.C6202b.m24689a(r0, r1)
            r18 = r2
            ge.bog.designsystem.components.layersandshadows.LayerView r18 = (p341ge.bog.designsystem.components.layersandshadows.LayerView) r18
            if (r18 == 0) goto L_0x011a
            int r1 = p451hk.C15526d.monthly
            android.view.View r2 = p086g1.C6202b.m24689a(r0, r1)
            r19 = r2
            android.widget.TextView r19 = (android.widget.TextView) r19
            if (r19 == 0) goto L_0x011a
            int r1 = p451hk.C15526d.monthly_badge_layout
            android.view.View r2 = p086g1.C6202b.m24689a(r0, r1)
            r20 = r2
            ge.bog.designsystem.components.notificationbadges.BadgeRelativeLayout r20 = (p341ge.bog.designsystem.components.notificationbadges.BadgeRelativeLayout) r20
            if (r20 == 0) goto L_0x011a
            int r1 = p451hk.C15526d.monthly_checkout_layer
            android.view.View r2 = p086g1.C6202b.m24689a(r0, r1)
            r21 = r2
            ge.bog.designsystem.components.layersandshadows.LayerView r21 = (p341ge.bog.designsystem.components.layersandshadows.LayerView) r21
            if (r21 == 0) goto L_0x011a
            int r1 = p451hk.C15526d.monthly_payment
            android.view.View r2 = p086g1.C6202b.m24689a(r0, r1)
            r22 = r2
            android.widget.TextView r22 = (android.widget.TextView) r22
            if (r22 == 0) goto L_0x011a
            int r1 = p451hk.C15526d.f44078n1
            android.view.View r2 = p086g1.C6202b.m24689a(r0, r1)
            r23 = r2
            ge.bog.designsystem.components.pagedescription.PageDescriptionView r23 = (p341ge.bog.designsystem.components.pagedescription.PageDescriptionView) r23
            if (r23 == 0) goto L_0x011a
            int r1 = p451hk.C15526d.f44082p1
            android.view.View r2 = p086g1.C6202b.m24689a(r0, r1)
            r24 = r2
            ge.bog.designsystem.components.fixedbutton.FixedButtonView r24 = (p341ge.bog.designsystem.components.fixedbutton.FixedButtonView) r24
            if (r24 == 0) goto L_0x011a
            int r1 = p451hk.C15526d.f44048A1
            android.view.View r2 = p086g1.C6202b.m24689a(r0, r1)
            r25 = r2
            android.widget.FrameLayout r25 = (android.widget.FrameLayout) r25
            if (r25 == 0) goto L_0x011a
            int r1 = p451hk.C15526d.f44055J1
            android.view.View r26 = p086g1.C6202b.m24689a(r0, r1)
            if (r26 == 0) goto L_0x011a
            int r1 = p451hk.C15526d.yearly_badge_layout
            android.view.View r2 = p086g1.C6202b.m24689a(r0, r1)
            r27 = r2
            ge.bog.designsystem.components.notificationbadges.BadgeRelativeLayout r27 = (p341ge.bog.designsystem.components.notificationbadges.BadgeRelativeLayout) r27
            if (r27 == 0) goto L_0x011a
            int r1 = p451hk.C15526d.yearly_checkout_layer
            android.view.View r2 = p086g1.C6202b.m24689a(r0, r1)
            r28 = r2
            ge.bog.designsystem.components.layersandshadows.LayerView r28 = (p341ge.bog.designsystem.components.layersandshadows.LayerView) r28
            if (r28 == 0) goto L_0x011a
            kk.o r1 = new kk.o
            r3 = r1
            r4 = r0
            androidx.constraintlayout.widget.ConstraintLayout r4 = (androidx.constraintlayout.widget.ConstraintLayout) r4
            r3.<init>(r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20, r21, r22, r23, r24, r25, r26, r27, r28)
            return r1
        L_0x011a:
            android.content.res.Resources r0 = r29.getResources()
            java.lang.String r0 = r0.getResourceName(r1)
            java.lang.NullPointerException r1 = new java.lang.NullPointerException
            java.lang.String r2 = "Missing required view with ID: "
            java.lang.String r0 = r2.concat(r0)
            r1.<init>(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: p493kk.C16461o.m58649a(android.view.View):kk.o");
    }

    /* renamed from: d */
    public static C16461o m58650d(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(C15527e.fragment_register_mtpl_policy, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return m58649a(inflate);
    }

    /* renamed from: c */
    public ConstraintLayout mo3946b() {
        return this.f46580d;
    }
}
