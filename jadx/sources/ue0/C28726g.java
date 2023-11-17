package ue0;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.Guideline;
import ie0.C25188h;
import p086g1.C6201a;
import p341ge.bog.designsystem.components.buttons.Button;
import p341ge.bog.designsystem.components.list.ListItem;
import p341ge.bog.designsystem.components.list.SingleLineSmallTextItem;
import p341ge.bog.designsystem.components.list.TwoLineReverseTextItem;
import p341ge.bog.designsystem.components.loading.LoadingView;
import p341ge.bog.mobilebank.cleanarch.presentation.common.StateView;

/* renamed from: ue0.g */
public final class C28726g implements C6201a {

    /* renamed from: d */
    private final StateView f73237d;

    /* renamed from: e */
    public final ListItem f73238e;

    /* renamed from: f */
    public final View f73239f;

    /* renamed from: g */
    public final TwoLineReverseTextItem f73240g;

    /* renamed from: h */
    public final AppCompatTextView f73241h;

    /* renamed from: i */
    public final Button f73242i;

    /* renamed from: j */
    public final Button f73243j;

    /* renamed from: k */
    public final ListItem f73244k;

    /* renamed from: l */
    public final TwoLineReverseTextItem f73245l;

    /* renamed from: m */
    public final AppCompatTextView f73246m;

    /* renamed from: n */
    public final ListItem f73247n;

    /* renamed from: o */
    public final AppCompatTextView f73248o;

    /* renamed from: p */
    public final AppCompatTextView f73249p;

    /* renamed from: q */
    public final LinearLayout f73250q;

    /* renamed from: r */
    public final ConstraintLayout f73251r;

    /* renamed from: s */
    public final Guideline f73252s;

    /* renamed from: t */
    public final Guideline f73253t;

    /* renamed from: u */
    public final LoadingView f73254u;

    /* renamed from: v */
    public final SingleLineSmallTextItem f73255v;

    private C28726g(StateView stateView, ListItem listItem, View view, TwoLineReverseTextItem twoLineReverseTextItem, AppCompatTextView appCompatTextView, Button button, Button button2, ListItem listItem2, TwoLineReverseTextItem twoLineReverseTextItem2, AppCompatTextView appCompatTextView2, ListItem listItem3, AppCompatTextView appCompatTextView3, AppCompatTextView appCompatTextView4, LinearLayout linearLayout, ConstraintLayout constraintLayout, Guideline guideline, Guideline guideline2, LoadingView loadingView, SingleLineSmallTextItem singleLineSmallTextItem) {
        this.f73237d = stateView;
        this.f73238e = listItem;
        this.f73239f = view;
        this.f73240g = twoLineReverseTextItem;
        this.f73241h = appCompatTextView;
        this.f73242i = button;
        this.f73243j = button2;
        this.f73244k = listItem2;
        this.f73245l = twoLineReverseTextItem2;
        this.f73246m = appCompatTextView2;
        this.f73247n = listItem3;
        this.f73248o = appCompatTextView3;
        this.f73249p = appCompatTextView4;
        this.f73250q = linearLayout;
        this.f73251r = constraintLayout;
        this.f73252s = guideline;
        this.f73253t = guideline2;
        this.f73254u = loadingView;
        this.f73255v = singleLineSmallTextItem;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:2:0x000d, code lost:
        r1 = ie0.C25187g.available_divider;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static ue0.C28726g m88024a(android.view.View r23) {
        /*
            r0 = r23
            int r1 = ie0.C25187g.available
            android.view.View r2 = p086g1.C6202b.m24689a(r0, r1)
            r5 = r2
            ge.bog.designsystem.components.list.ListItem r5 = (p341ge.bog.designsystem.components.list.ListItem) r5
            if (r5 == 0) goto L_0x00d6
            int r1 = ie0.C25187g.available_divider
            android.view.View r6 = p086g1.C6202b.m24689a(r0, r1)
            if (r6 == 0) goto L_0x00d6
            int r1 = ie0.C25187g.available_title
            android.view.View r2 = p086g1.C6202b.m24689a(r0, r1)
            r7 = r2
            ge.bog.designsystem.components.list.TwoLineReverseTextItem r7 = (p341ge.bog.designsystem.components.list.TwoLineReverseTextItem) r7
            if (r7 == 0) goto L_0x00d6
            int r1 = ie0.C25187g.available_value
            android.view.View r2 = p086g1.C6202b.m24689a(r0, r1)
            r8 = r2
            androidx.appcompat.widget.AppCompatTextView r8 = (androidx.appcompat.widget.AppCompatTextView) r8
            if (r8 == 0) goto L_0x00d6
            int r1 = ie0.C25187g.button_add
            android.view.View r2 = p086g1.C6202b.m24689a(r0, r1)
            r9 = r2
            ge.bog.designsystem.components.buttons.Button r9 = (p341ge.bog.designsystem.components.buttons.Button) r9
            if (r9 == 0) goto L_0x00d6
            int r1 = ie0.C25187g.button_get
            android.view.View r2 = p086g1.C6202b.m24689a(r0, r1)
            r10 = r2
            ge.bog.designsystem.components.buttons.Button r10 = (p341ge.bog.designsystem.components.buttons.Button) r10
            if (r10 == 0) goto L_0x00d6
            int r1 = ie0.C25187g.buying_power
            android.view.View r2 = p086g1.C6202b.m24689a(r0, r1)
            r11 = r2
            ge.bog.designsystem.components.list.ListItem r11 = (p341ge.bog.designsystem.components.list.ListItem) r11
            if (r11 == 0) goto L_0x00d6
            int r1 = ie0.C25187g.buying_power_title
            android.view.View r2 = p086g1.C6202b.m24689a(r0, r1)
            r12 = r2
            ge.bog.designsystem.components.list.TwoLineReverseTextItem r12 = (p341ge.bog.designsystem.components.list.TwoLineReverseTextItem) r12
            if (r12 == 0) goto L_0x00d6
            int r1 = ie0.C25187g.buying_power_value
            android.view.View r2 = p086g1.C6202b.m24689a(r0, r1)
            r13 = r2
            androidx.appcompat.widget.AppCompatTextView r13 = (androidx.appcompat.widget.AppCompatTextView) r13
            if (r13 == 0) goto L_0x00d6
            int r1 = ie0.C25187g.commission_fee
            android.view.View r2 = p086g1.C6202b.m24689a(r0, r1)
            r14 = r2
            ge.bog.designsystem.components.list.ListItem r14 = (p341ge.bog.designsystem.components.list.ListItem) r14
            if (r14 == 0) goto L_0x00d6
            int r1 = ie0.C25187g.f64731y0
            android.view.View r2 = p086g1.C6202b.m24689a(r0, r1)
            r15 = r2
            androidx.appcompat.widget.AppCompatTextView r15 = (androidx.appcompat.widget.AppCompatTextView) r15
            if (r15 == 0) goto L_0x00d6
            int r1 = ie0.C25187g.f64732z0
            android.view.View r2 = p086g1.C6202b.m24689a(r0, r1)
            r16 = r2
            androidx.appcompat.widget.AppCompatTextView r16 = (androidx.appcompat.widget.AppCompatTextView) r16
            if (r16 == 0) goto L_0x00d6
            int r1 = ie0.C25187g.conditional_fields_layout
            android.view.View r2 = p086g1.C6202b.m24689a(r0, r1)
            r17 = r2
            android.widget.LinearLayout r17 = (android.widget.LinearLayout) r17
            if (r17 == 0) goto L_0x00d6
            int r1 = ie0.C25187g.f64670E0
            android.view.View r2 = p086g1.C6202b.m24689a(r0, r1)
            r18 = r2
            androidx.constraintlayout.widget.ConstraintLayout r18 = (androidx.constraintlayout.widget.ConstraintLayout) r18
            if (r18 == 0) goto L_0x00d6
            int r1 = ie0.C25187g.f64725w1
            android.view.View r2 = p086g1.C6202b.m24689a(r0, r1)
            r19 = r2
            androidx.constraintlayout.widget.Guideline r19 = (androidx.constraintlayout.widget.Guideline) r19
            if (r19 == 0) goto L_0x00d6
            int r1 = ie0.C25187g.f64728x1
            android.view.View r2 = p086g1.C6202b.m24689a(r0, r1)
            r20 = r2
            androidx.constraintlayout.widget.Guideline r20 = (androidx.constraintlayout.widget.Guideline) r20
            if (r20 == 0) goto L_0x00d6
            int r1 = ie0.C25187g.f64710m2
            android.view.View r2 = p086g1.C6202b.m24689a(r0, r1)
            r21 = r2
            ge.bog.designsystem.components.loading.LoadingView r21 = (p341ge.bog.designsystem.components.loading.LoadingView) r21
            if (r21 == 0) goto L_0x00d6
            int r1 = ie0.C25187g.pending_withdrawal
            android.view.View r2 = p086g1.C6202b.m24689a(r0, r1)
            r22 = r2
            ge.bog.designsystem.components.list.SingleLineSmallTextItem r22 = (p341ge.bog.designsystem.components.list.SingleLineSmallTextItem) r22
            if (r22 == 0) goto L_0x00d6
            ue0.g r1 = new ue0.g
            r3 = r1
            r4 = r0
            ge.bog.mobilebank.cleanarch.presentation.common.StateView r4 = (p341ge.bog.mobilebank.cleanarch.presentation.common.StateView) r4
            r3.<init>(r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20, r21, r22)
            return r1
        L_0x00d6:
            android.content.res.Resources r0 = r23.getResources()
            java.lang.String r0 = r0.getResourceName(r1)
            java.lang.NullPointerException r1 = new java.lang.NullPointerException
            java.lang.String r2 = "Missing required view with ID: "
            java.lang.String r0 = r2.concat(r0)
            r1.<init>(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: ue0.C28726g.m88024a(android.view.View):ue0.g");
    }

    /* renamed from: d */
    public static C28726g m88025d(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(C25188h.action_sheet_gt_balance, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return m88024a(inflate);
    }

    /* renamed from: c */
    public StateView mo3946b() {
        return this.f73237d;
    }
}
