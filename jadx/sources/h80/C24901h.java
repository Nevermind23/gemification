package h80;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import androidx.cardview.widget.CardView;
import androidx.constraintlayout.widget.ConstraintLayout;
import p086g1.C6201a;
import p341ge.bog.designsystem.components.chips.ChipGroup;
import p341ge.bog.designsystem.components.fixedbutton.FixedButtonView;
import p341ge.bog.designsystem.components.input.Input;
import p341ge.bog.mobilebank.p975ui.views.widgets.BogTextView;
import p90.C27272c8;
import p90.C27486z7;
import u70.C28607c;

/* renamed from: h80.h */
public final class C24901h implements C6201a {

    /* renamed from: d */
    private final ConstraintLayout f63941d;

    /* renamed from: e */
    public final FixedButtonView f63942e;

    /* renamed from: f */
    public final BogTextView f63943f;

    /* renamed from: g */
    public final Input f63944g;

    /* renamed from: h */
    public final LinearLayout f63945h;

    /* renamed from: i */
    public final Input f63946i;

    /* renamed from: j */
    public final BogTextView f63947j;

    /* renamed from: k */
    public final ChipGroup f63948k;

    /* renamed from: l */
    public final BogTextView f63949l;

    /* renamed from: m */
    public final LinearLayout f63950m;

    /* renamed from: n */
    public final Input f63951n;

    /* renamed from: o */
    public final BogTextView f63952o;

    /* renamed from: p */
    public final LinearLayout f63953p;

    /* renamed from: q */
    public final Input f63954q;

    /* renamed from: r */
    public final BogTextView f63955r;

    /* renamed from: s */
    public final CardView f63956s;

    /* renamed from: t */
    public final C27486z7 f63957t;

    /* renamed from: u */
    public final CardView f63958u;

    /* renamed from: v */
    public final C27272c8 f63959v;

    /* renamed from: w */
    public final FrameLayout f63960w;

    private C24901h(ConstraintLayout constraintLayout, FixedButtonView fixedButtonView, BogTextView bogTextView, Input input, LinearLayout linearLayout, Input input2, BogTextView bogTextView2, ChipGroup chipGroup, BogTextView bogTextView3, LinearLayout linearLayout2, Input input3, BogTextView bogTextView4, LinearLayout linearLayout3, Input input4, BogTextView bogTextView5, CardView cardView, C27486z7 z7Var, CardView cardView2, C27272c8 c8Var, FrameLayout frameLayout) {
        this.f63941d = constraintLayout;
        this.f63942e = fixedButtonView;
        this.f63943f = bogTextView;
        this.f63944g = input;
        this.f63945h = linearLayout;
        this.f63946i = input2;
        this.f63947j = bogTextView2;
        this.f63948k = chipGroup;
        this.f63949l = bogTextView3;
        this.f63950m = linearLayout2;
        this.f63951n = input3;
        this.f63952o = bogTextView4;
        this.f63953p = linearLayout3;
        this.f63954q = input4;
        this.f63955r = bogTextView5;
        this.f63956s = cardView;
        this.f63957t = z7Var;
        this.f63958u = cardView2;
        this.f63959v = c8Var;
        this.f63960w = frameLayout;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:30:0x00ab, code lost:
        r1 = u70.C28606b.f72567A0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:34:0x00c3, code lost:
        r1 = u70.C28606b.f72587Q0;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static h80.C24901h m79585a(android.view.View r24) {
        /*
            r0 = r24
            int r1 = u70.C28606b.add_btn
            android.view.View r2 = p086g1.C6202b.m24689a(r0, r1)
            r5 = r2
            ge.bog.designsystem.components.fixedbutton.FixedButtonView r5 = (p341ge.bog.designsystem.components.fixedbutton.FixedButtonView) r5
            if (r5 == 0) goto L_0x00e5
            int r1 = u70.C28606b.add_title
            android.view.View r2 = p086g1.C6202b.m24689a(r0, r1)
            r6 = r2
            ge.bog.mobilebank.ui.views.widgets.BogTextView r6 = (p341ge.bog.mobilebank.p975ui.views.widgets.BogTextView) r6
            if (r6 == 0) goto L_0x00e5
            int r1 = u70.C28606b.f72595e
            android.view.View r2 = p086g1.C6202b.m24689a(r0, r1)
            r7 = r2
            ge.bog.designsystem.components.input.Input r7 = (p341ge.bog.designsystem.components.input.Input) r7
            if (r7 == 0) goto L_0x00e5
            int r1 = u70.C28606b.country
            android.view.View r2 = p086g1.C6202b.m24689a(r0, r1)
            r8 = r2
            android.widget.LinearLayout r8 = (android.widget.LinearLayout) r8
            if (r8 == 0) goto L_0x00e5
            int r1 = u70.C28606b.country_selector
            android.view.View r2 = p086g1.C6202b.m24689a(r0, r1)
            r9 = r2
            ge.bog.designsystem.components.input.Input r9 = (p341ge.bog.designsystem.components.input.Input) r9
            if (r9 == 0) goto L_0x00e5
            int r1 = u70.C28606b.country_selector_title
            android.view.View r2 = p086g1.C6202b.m24689a(r0, r1)
            r10 = r2
            ge.bog.mobilebank.ui.views.widgets.BogTextView r10 = (p341ge.bog.mobilebank.p975ui.views.widgets.BogTextView) r10
            if (r10 == 0) goto L_0x00e5
            int r1 = u70.C28606b.currencies
            android.view.View r2 = p086g1.C6202b.m24689a(r0, r1)
            r11 = r2
            ge.bog.designsystem.components.chips.ChipGroup r11 = (p341ge.bog.designsystem.components.chips.ChipGroup) r11
            if (r11 == 0) goto L_0x00e5
            int r1 = u70.C28606b.f72566A
            android.view.View r2 = p086g1.C6202b.m24689a(r0, r1)
            r12 = r2
            ge.bog.mobilebank.ui.views.widgets.BogTextView r12 = (p341ge.bog.mobilebank.p975ui.views.widgets.BogTextView) r12
            if (r12 == 0) goto L_0x00e5
            int r1 = u70.C28606b.organization
            android.view.View r2 = p086g1.C6202b.m24689a(r0, r1)
            r13 = r2
            android.widget.LinearLayout r13 = (android.widget.LinearLayout) r13
            if (r13 == 0) goto L_0x00e5
            int r1 = u70.C28606b.organization_selector
            android.view.View r2 = p086g1.C6202b.m24689a(r0, r1)
            r14 = r2
            ge.bog.designsystem.components.input.Input r14 = (p341ge.bog.designsystem.components.input.Input) r14
            if (r14 == 0) goto L_0x00e5
            int r1 = u70.C28606b.organization_selector_title
            android.view.View r2 = p086g1.C6202b.m24689a(r0, r1)
            r15 = r2
            ge.bog.mobilebank.ui.views.widgets.BogTextView r15 = (p341ge.bog.mobilebank.p975ui.views.widgets.BogTextView) r15
            if (r15 == 0) goto L_0x00e5
            int r1 = u70.C28606b.f72605o0
            android.view.View r2 = p086g1.C6202b.m24689a(r0, r1)
            r16 = r2
            android.widget.LinearLayout r16 = (android.widget.LinearLayout) r16
            if (r16 == 0) goto L_0x00e5
            int r1 = u70.C28606b.position_selector
            android.view.View r2 = p086g1.C6202b.m24689a(r0, r1)
            r17 = r2
            ge.bog.designsystem.components.input.Input r17 = (p341ge.bog.designsystem.components.input.Input) r17
            if (r17 == 0) goto L_0x00e5
            int r1 = u70.C28606b.position_selector_title
            android.view.View r2 = p086g1.C6202b.m24689a(r0, r1)
            r18 = r2
            ge.bog.mobilebank.ui.views.widgets.BogTextView r18 = (p341ge.bog.mobilebank.p975ui.views.widgets.BogTextView) r18
            if (r18 == 0) goto L_0x00e5
            int r1 = u70.C28606b.f72608t0
            android.view.View r2 = p086g1.C6202b.m24689a(r0, r1)
            r19 = r2
            androidx.cardview.widget.CardView r19 = (androidx.cardview.widget.CardView) r19
            if (r19 == 0) goto L_0x00e5
            int r1 = u70.C28606b.f72567A0
            android.view.View r2 = p086g1.C6202b.m24689a(r0, r1)
            if (r2 == 0) goto L_0x00e5
            p90.z7 r20 = p90.C27486z7.m85250a(r2)
            int r1 = u70.C28606b.f72569B0
            android.view.View r2 = p086g1.C6202b.m24689a(r0, r1)
            r21 = r2
            androidx.cardview.widget.CardView r21 = (androidx.cardview.widget.CardView) r21
            if (r21 == 0) goto L_0x00e5
            int r1 = u70.C28606b.f72587Q0
            android.view.View r2 = p086g1.C6202b.m24689a(r0, r1)
            if (r2 == 0) goto L_0x00e5
            p90.c8 r22 = p90.C27272c8.m84388a(r2)
            int r1 = u70.C28606b.f72588R0
            android.view.View r2 = p086g1.C6202b.m24689a(r0, r1)
            r23 = r2
            android.widget.FrameLayout r23 = (android.widget.FrameLayout) r23
            if (r23 == 0) goto L_0x00e5
            h80.h r1 = new h80.h
            r3 = r1
            r4 = r0
            androidx.constraintlayout.widget.ConstraintLayout r4 = (androidx.constraintlayout.widget.ConstraintLayout) r4
            r3.<init>(r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20, r21, r22, r23)
            return r1
        L_0x00e5:
            android.content.res.Resources r0 = r24.getResources()
            java.lang.String r0 = r0.getResourceName(r1)
            java.lang.NullPointerException r1 = new java.lang.NullPointerException
            java.lang.String r2 = "Missing required view with ID: "
            java.lang.String r0 = r2.concat(r0)
            r1.<init>(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: h80.C24901h.m79585a(android.view.View):h80.h");
    }

    /* renamed from: d */
    public static C24901h m79586d(LayoutInflater layoutInflater) {
        return m79587e(layoutInflater, (ViewGroup) null, false);
    }

    /* renamed from: e */
    public static C24901h m79587e(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(C28607c.activity_add_income, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return m79585a(inflate);
    }

    /* renamed from: c */
    public ConstraintLayout mo3946b() {
        return this.f63941d;
    }
}
