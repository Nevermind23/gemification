package sp0;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import np0.C37440f;
import p086g1.C6201a;
import p341ge.bog.designsystem.components.emptywidget.EmptyWidget;
import p341ge.bog.designsystem.components.inlinefeedback.InlineFeedback;
import p341ge.bog.designsystem.components.input.Input;
import p341ge.bog.designsystem.components.toggle.ToggleView;

/* renamed from: sp0.i */
public final class C38490i implements C6201a {

    /* renamed from: d */
    private final LinearLayout f92198d;

    /* renamed from: e */
    public final View f92199e;

    /* renamed from: f */
    public final InlineFeedback f92200f;

    /* renamed from: g */
    public final View f92201g;

    /* renamed from: h */
    public final Input f92202h;

    /* renamed from: i */
    public final EmptyWidget f92203i;

    /* renamed from: j */
    public final ConstraintLayout f92204j;

    /* renamed from: k */
    public final TextView f92205k;

    /* renamed from: l */
    public final TextView f92206l;

    /* renamed from: m */
    public final ConstraintLayout f92207m;

    /* renamed from: n */
    public final TextView f92208n;

    /* renamed from: o */
    public final TextView f92209o;

    /* renamed from: p */
    public final ToggleView f92210p;

    /* renamed from: q */
    public final ConstraintLayout f92211q;

    /* renamed from: r */
    public final TextView f92212r;

    /* renamed from: s */
    public final TextView f92213s;

    /* renamed from: t */
    public final ConstraintLayout f92214t;

    /* renamed from: u */
    public final TextView f92215u;

    /* renamed from: v */
    public final TextView f92216v;

    /* renamed from: w */
    public final ToggleView f92217w;

    private C38490i(LinearLayout linearLayout, View view, InlineFeedback inlineFeedback, View view2, Input input, EmptyWidget emptyWidget, ConstraintLayout constraintLayout, TextView textView, TextView textView2, ConstraintLayout constraintLayout2, TextView textView3, TextView textView4, ToggleView toggleView, ConstraintLayout constraintLayout3, TextView textView5, TextView textView6, ConstraintLayout constraintLayout4, TextView textView7, TextView textView8, ToggleView toggleView2) {
        this.f92198d = linearLayout;
        this.f92199e = view;
        this.f92200f = inlineFeedback;
        this.f92201g = view2;
        this.f92202h = input;
        this.f92203i = emptyWidget;
        this.f92204j = constraintLayout;
        this.f92205k = textView;
        this.f92206l = textView2;
        this.f92207m = constraintLayout2;
        this.f92208n = textView3;
        this.f92209o = textView4;
        this.f92210p = toggleView;
        this.f92211q = constraintLayout3;
        this.f92212r = textView5;
        this.f92213s = textView6;
        this.f92214t = constraintLayout4;
        this.f92215u = textView7;
        this.f92216v = textView8;
        this.f92217w = toggleView2;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:4:0x0015, code lost:
        r1 = np0.C37439e.insurance_info_divider;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static sp0.C38490i m112974a(android.view.View r23) {
        /*
            r0 = r23
            int r1 = np0.C37439e.insurance_divider
            android.view.View r4 = p086g1.C6202b.m24689a(r0, r1)
            if (r4 == 0) goto L_0x00de
            int r1 = np0.C37439e.insurance_feedback
            android.view.View r2 = p086g1.C6202b.m24689a(r0, r1)
            r5 = r2
            ge.bog.designsystem.components.inlinefeedback.InlineFeedback r5 = (p341ge.bog.designsystem.components.inlinefeedback.InlineFeedback) r5
            if (r5 == 0) goto L_0x00de
            int r1 = np0.C37439e.insurance_info_divider
            android.view.View r6 = p086g1.C6202b.m24689a(r0, r1)
            if (r6 == 0) goto L_0x00de
            int r1 = np0.C37439e.insurance_provider_input
            android.view.View r2 = p086g1.C6202b.m24689a(r0, r1)
            r7 = r2
            ge.bog.designsystem.components.input.Input r7 = (p341ge.bog.designsystem.components.input.Input) r7
            if (r7 == 0) goto L_0x00de
            int r1 = np0.C37439e.f89992V
            android.view.View r2 = p086g1.C6202b.m24689a(r0, r1)
            r8 = r2
            ge.bog.designsystem.components.emptywidget.EmptyWidget r8 = (p341ge.bog.designsystem.components.emptywidget.EmptyWidget) r8
            if (r8 == 0) goto L_0x00de
            int r1 = np0.C37439e.f89995Z
            android.view.View r2 = p086g1.C6202b.m24689a(r0, r1)
            r9 = r2
            androidx.constraintlayout.widget.ConstraintLayout r9 = (androidx.constraintlayout.widget.ConstraintLayout) r9
            if (r9 == 0) goto L_0x00de
            int r1 = np0.C37439e.life_insurance_amount
            android.view.View r2 = p086g1.C6202b.m24689a(r0, r1)
            r10 = r2
            android.widget.TextView r10 = (android.widget.TextView) r10
            if (r10 == 0) goto L_0x00de
            int r1 = np0.C37439e.life_insurance_desc
            android.view.View r2 = p086g1.C6202b.m24689a(r0, r1)
            r11 = r2
            android.widget.TextView r11 = (android.widget.TextView) r11
            if (r11 == 0) goto L_0x00de
            int r1 = np0.C37439e.life_insurance_info
            android.view.View r2 = p086g1.C6202b.m24689a(r0, r1)
            r12 = r2
            androidx.constraintlayout.widget.ConstraintLayout r12 = (androidx.constraintlayout.widget.ConstraintLayout) r12
            if (r12 == 0) goto L_0x00de
            int r1 = np0.C37439e.f90000d0
            android.view.View r2 = p086g1.C6202b.m24689a(r0, r1)
            r13 = r2
            android.widget.TextView r13 = (android.widget.TextView) r13
            if (r13 == 0) goto L_0x00de
            int r1 = np0.C37439e.life_insurance_title
            android.view.View r2 = p086g1.C6202b.m24689a(r0, r1)
            r14 = r2
            android.widget.TextView r14 = (android.widget.TextView) r14
            if (r14 == 0) goto L_0x00de
            int r1 = np0.C37439e.life_insurance_toggle
            android.view.View r2 = p086g1.C6202b.m24689a(r0, r1)
            r15 = r2
            ge.bog.designsystem.components.toggle.ToggleView r15 = (p341ge.bog.designsystem.components.toggle.ToggleView) r15
            if (r15 == 0) goto L_0x00de
            int r1 = np0.C37439e.payment_insurance
            android.view.View r2 = p086g1.C6202b.m24689a(r0, r1)
            r16 = r2
            androidx.constraintlayout.widget.ConstraintLayout r16 = (androidx.constraintlayout.widget.ConstraintLayout) r16
            if (r16 == 0) goto L_0x00de
            int r1 = np0.C37439e.payment_insurance_amount
            android.view.View r2 = p086g1.C6202b.m24689a(r0, r1)
            r17 = r2
            android.widget.TextView r17 = (android.widget.TextView) r17
            if (r17 == 0) goto L_0x00de
            int r1 = np0.C37439e.payment_insurance_desc
            android.view.View r2 = p086g1.C6202b.m24689a(r0, r1)
            r18 = r2
            android.widget.TextView r18 = (android.widget.TextView) r18
            if (r18 == 0) goto L_0x00de
            int r1 = np0.C37439e.payment_insurance_info
            android.view.View r2 = p086g1.C6202b.m24689a(r0, r1)
            r19 = r2
            androidx.constraintlayout.widget.ConstraintLayout r19 = (androidx.constraintlayout.widget.ConstraintLayout) r19
            if (r19 == 0) goto L_0x00de
            int r1 = np0.C37439e.payment_insurance_label
            android.view.View r2 = p086g1.C6202b.m24689a(r0, r1)
            r20 = r2
            android.widget.TextView r20 = (android.widget.TextView) r20
            if (r20 == 0) goto L_0x00de
            int r1 = np0.C37439e.payment_insurance_title
            android.view.View r2 = p086g1.C6202b.m24689a(r0, r1)
            r21 = r2
            android.widget.TextView r21 = (android.widget.TextView) r21
            if (r21 == 0) goto L_0x00de
            int r1 = np0.C37439e.payment_insurance_toggle
            android.view.View r2 = p086g1.C6202b.m24689a(r0, r1)
            r22 = r2
            ge.bog.designsystem.components.toggle.ToggleView r22 = (p341ge.bog.designsystem.components.toggle.ToggleView) r22
            if (r22 == 0) goto L_0x00de
            sp0.i r1 = new sp0.i
            r2 = r1
            r3 = r0
            android.widget.LinearLayout r3 = (android.widget.LinearLayout) r3
            r2.<init>(r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20, r21, r22)
            return r1
        L_0x00de:
            android.content.res.Resources r0 = r23.getResources()
            java.lang.String r0 = r0.getResourceName(r1)
            java.lang.NullPointerException r1 = new java.lang.NullPointerException
            java.lang.String r2 = "Missing required view with ID: "
            java.lang.String r0 = r2.concat(r0)
            r1.<init>(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: sp0.C38490i.m112974a(android.view.View):sp0.i");
    }

    /* renamed from: d */
    public static C38490i m112975d(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(C37440f.form_segment_insurance_provider, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return m112974a(inflate);
    }

    /* renamed from: c */
    public LinearLayout mo3946b() {
        return this.f92198d;
    }
}
