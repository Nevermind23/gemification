package xn0;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.cardview.widget.CardView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.widget.NestedScrollView;
import p086g1.C6201a;
import p341ge.bog.designsystem.components.buttons.Button;
import p341ge.bog.designsystem.components.pagestate.PageState;
import p341ge.bog.designsystem.components.textimagecard.TextImageCardView;
import p341ge.bog.designsystem.components.timer.TimerView;
import p90.C27272c8;
import p90.C27486z7;
import sn0.C17902f;

/* renamed from: xn0.c */
public final class C18845c implements C6201a {

    /* renamed from: d */
    private final ConstraintLayout f52673d;

    /* renamed from: e */
    public final LinearLayout f52674e;

    /* renamed from: f */
    public final LinearLayout f52675f;

    /* renamed from: g */
    public final TextView f52676g;

    /* renamed from: h */
    public final AppCompatImageView f52677h;

    /* renamed from: i */
    public final PageState f52678i;

    /* renamed from: j */
    public final TextView f52679j;

    /* renamed from: k */
    public final Button f52680k;

    /* renamed from: l */
    public final TextImageCardView f52681l;

    /* renamed from: m */
    public final LinearLayout f52682m;

    /* renamed from: n */
    public final TextView f52683n;

    /* renamed from: o */
    public final FrameLayout f52684o;

    /* renamed from: p */
    public final C27486z7 f52685p;

    /* renamed from: q */
    public final CardView f52686q;

    /* renamed from: r */
    public final NestedScrollView f52687r;

    /* renamed from: s */
    public final TimerView f52688s;

    /* renamed from: t */
    public final C27272c8 f52689t;

    /* renamed from: u */
    public final Button f52690u;

    private C18845c(ConstraintLayout constraintLayout, LinearLayout linearLayout, LinearLayout linearLayout2, TextView textView, AppCompatImageView appCompatImageView, PageState pageState, TextView textView2, Button button, TextImageCardView textImageCardView, LinearLayout linearLayout3, TextView textView3, FrameLayout frameLayout, C27486z7 z7Var, CardView cardView, NestedScrollView nestedScrollView, TimerView timerView, C27272c8 c8Var, Button button2) {
        this.f52673d = constraintLayout;
        this.f52674e = linearLayout;
        this.f52675f = linearLayout2;
        this.f52676g = textView;
        this.f52677h = appCompatImageView;
        this.f52678i = pageState;
        this.f52679j = textView2;
        this.f52680k = button;
        this.f52681l = textImageCardView;
        this.f52682m = linearLayout3;
        this.f52683n = textView3;
        this.f52684o = frameLayout;
        this.f52685p = z7Var;
        this.f52686q = cardView;
        this.f52687r = nestedScrollView;
        this.f52688s = timerView;
        this.f52689t = c8Var;
        this.f52690u = button2;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:22:0x007b, code lost:
        r1 = sn0.C17901e.f50963d0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:30:0x00ab, code lost:
        r1 = sn0.C17901e.f50979n0;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static xn0.C18845c m63744a(android.view.View r22) {
        /*
            r0 = r22
            int r1 = sn0.C17901e.f50960b
            android.view.View r2 = p086g1.C6202b.m24689a(r0, r1)
            r5 = r2
            android.widget.LinearLayout r5 = (android.widget.LinearLayout) r5
            if (r5 == 0) goto L_0x00cd
            int r1 = sn0.C17901e.f50967g
            android.view.View r2 = p086g1.C6202b.m24689a(r0, r1)
            r6 = r2
            android.widget.LinearLayout r6 = (android.widget.LinearLayout) r6
            if (r6 == 0) goto L_0x00cd
            int r1 = sn0.C17901e.f50984t
            android.view.View r2 = p086g1.C6202b.m24689a(r0, r1)
            r7 = r2
            android.widget.TextView r7 = (android.widget.TextView) r7
            if (r7 == 0) goto L_0x00cd
            int r1 = sn0.C17901e.f50951G
            android.view.View r2 = p086g1.C6202b.m24689a(r0, r1)
            r8 = r2
            androidx.appcompat.widget.AppCompatImageView r8 = (androidx.appcompat.widget.AppCompatImageView) r8
            if (r8 == 0) goto L_0x00cd
            int r1 = sn0.C17901e.offer_not_found_state
            android.view.View r2 = p086g1.C6202b.m24689a(r0, r1)
            r9 = r2
            ge.bog.designsystem.components.pagestate.PageState r9 = (p341ge.bog.designsystem.components.pagestate.PageState) r9
            if (r9 == 0) goto L_0x00cd
            int r1 = sn0.C17901e.f50955Q
            android.view.View r2 = p086g1.C6202b.m24689a(r0, r1)
            r10 = r2
            android.widget.TextView r10 = (android.widget.TextView) r10
            if (r10 == 0) goto L_0x00cd
            int r1 = sn0.C17901e.phone_button
            android.view.View r2 = p086g1.C6202b.m24689a(r0, r1)
            r11 = r2
            ge.bog.designsystem.components.buttons.Button r11 = (p341ge.bog.designsystem.components.buttons.Button) r11
            if (r11 == 0) goto L_0x00cd
            int r1 = sn0.C17901e.product_card
            android.view.View r2 = p086g1.C6202b.m24689a(r0, r1)
            r12 = r2
            ge.bog.designsystem.components.textimagecard.TextImageCardView r12 = (p341ge.bog.designsystem.components.textimagecard.TextImageCardView) r12
            if (r12 == 0) goto L_0x00cd
            int r1 = sn0.C17901e.product_container
            android.view.View r2 = p086g1.C6202b.m24689a(r0, r1)
            r13 = r2
            android.widget.LinearLayout r13 = (android.widget.LinearLayout) r13
            if (r13 == 0) goto L_0x00cd
            int r1 = sn0.C17901e.f50957X
            android.view.View r2 = p086g1.C6202b.m24689a(r0, r1)
            r14 = r2
            android.widget.TextView r14 = (android.widget.TextView) r14
            if (r14 == 0) goto L_0x00cd
            int r1 = sn0.C17901e.f50959Z
            android.view.View r2 = p086g1.C6202b.m24689a(r0, r1)
            r15 = r2
            android.widget.FrameLayout r15 = (android.widget.FrameLayout) r15
            if (r15 == 0) goto L_0x00cd
            int r1 = sn0.C17901e.f50963d0
            android.view.View r2 = p086g1.C6202b.m24689a(r0, r1)
            if (r2 == 0) goto L_0x00cd
            p90.z7 r16 = p90.C27486z7.m85250a(r2)
            int r1 = sn0.C17901e.f50964e0
            android.view.View r2 = p086g1.C6202b.m24689a(r0, r1)
            r17 = r2
            androidx.cardview.widget.CardView r17 = (androidx.cardview.widget.CardView) r17
            if (r17 == 0) goto L_0x00cd
            int r1 = sn0.C17901e.f50966f0
            android.view.View r2 = p086g1.C6202b.m24689a(r0, r1)
            r18 = r2
            androidx.core.widget.NestedScrollView r18 = (androidx.core.widget.NestedScrollView) r18
            if (r18 == 0) goto L_0x00cd
            int r1 = sn0.C17901e.f50976l0
            android.view.View r2 = p086g1.C6202b.m24689a(r0, r1)
            r19 = r2
            ge.bog.designsystem.components.timer.TimerView r19 = (p341ge.bog.designsystem.components.timer.TimerView) r19
            if (r19 == 0) goto L_0x00cd
            int r1 = sn0.C17901e.f50979n0
            android.view.View r2 = p086g1.C6202b.m24689a(r0, r1)
            if (r2 == 0) goto L_0x00cd
            p90.c8 r20 = p90.C27272c8.m84388a(r2)
            int r1 = sn0.C17901e.web_button
            android.view.View r2 = p086g1.C6202b.m24689a(r0, r1)
            r21 = r2
            ge.bog.designsystem.components.buttons.Button r21 = (p341ge.bog.designsystem.components.buttons.Button) r21
            if (r21 == 0) goto L_0x00cd
            xn0.c r1 = new xn0.c
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
        throw new UnsupportedOperationException("Method not decompiled: xn0.C18845c.m63744a(android.view.View):xn0.c");
    }

    /* renamed from: d */
    public static C18845c m63745d(LayoutInflater layoutInflater) {
        return m63746e(layoutInflater, (ViewGroup) null, false);
    }

    /* renamed from: e */
    public static C18845c m63746e(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(C17902f.activity_lifestyle_offer_detailed, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return m63744a(inflate);
    }

    /* renamed from: c */
    public ConstraintLayout mo3946b() {
        return this.f52673d;
    }
}
