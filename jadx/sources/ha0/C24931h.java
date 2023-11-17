package ha0;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import androidx.cardview.widget.CardView;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.viewpager2.widget.ViewPager2;
import da0.C19952f;
import p086g1.C6201a;
import p341ge.bog.designsystem.components.biginput.BigInputView;
import p341ge.bog.designsystem.components.buttons.Button;
import p341ge.bog.designsystem.components.inlinefeedback.InlineFeedback;
import p90.C27272c8;
import p90.C27486z7;

/* renamed from: ha0.h */
public final class C24931h implements C6201a {

    /* renamed from: d */
    private final CoordinatorLayout f64120d;

    /* renamed from: e */
    public final Button f64121e;

    /* renamed from: f */
    public final LinearLayout f64122f;

    /* renamed from: g */
    public final BigInputView f64123g;

    /* renamed from: h */
    public final InlineFeedback f64124h;

    /* renamed from: i */
    public final C24942s f64125i;

    /* renamed from: j */
    public final C24943t f64126j;

    /* renamed from: k */
    public final FrameLayout f64127k;

    /* renamed from: l */
    public final C24940q f64128l;

    /* renamed from: m */
    public final FrameLayout f64129m;

    /* renamed from: n */
    public final C27486z7 f64130n;

    /* renamed from: o */
    public final CardView f64131o;

    /* renamed from: p */
    public final C27272c8 f64132p;

    /* renamed from: q */
    public final ViewPager2 f64133q;

    /* renamed from: r */
    public final C24941r f64134r;

    /* renamed from: s */
    public final C24942s f64135s;

    private C24931h(CoordinatorLayout coordinatorLayout, Button button, LinearLayout linearLayout, BigInputView bigInputView, InlineFeedback inlineFeedback, C24942s sVar, C24943t tVar, FrameLayout frameLayout, C24940q qVar, FrameLayout frameLayout2, C27486z7 z7Var, CardView cardView, C27272c8 c8Var, ViewPager2 viewPager2, C24941r rVar, C24942s sVar2) {
        this.f64120d = coordinatorLayout;
        this.f64121e = button;
        this.f64122f = linearLayout;
        this.f64123g = bigInputView;
        this.f64124h = inlineFeedback;
        this.f64125i = sVar;
        this.f64126j = tVar;
        this.f64127k = frameLayout;
        this.f64128l = qVar;
        this.f64129m = frameLayout2;
        this.f64130n = z7Var;
        this.f64131o = cardView;
        this.f64132p = c8Var;
        this.f64133q = viewPager2;
        this.f64134r = rVar;
        this.f64135s = sVar2;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:14:0x0051, code lost:
        r1 = da0.C19951e.period_selector_layout;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:18:0x0068, code lost:
        r1 = da0.C19951e.f54538t0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x007f, code lost:
        r1 = da0.C19951e.f54510G0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:26:0x0097, code lost:
        r1 = da0.C19951e.withdrawal_selector_layout;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:8:0x002e, code lost:
        r1 = da0.C19951e.interest_rate_error_layout;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static ha0.C24931h m79704a(android.view.View r20) {
        /*
            r0 = r20
            int r1 = da0.C19951e.f54531l
            android.view.View r2 = p086g1.C6202b.m24689a(r0, r1)
            r5 = r2
            ge.bog.designsystem.components.buttons.Button r5 = (p341ge.bog.designsystem.components.buttons.Button) r5
            if (r5 == 0) goto L_0x00b9
            int r1 = da0.C19951e.currency_container
            android.view.View r2 = p086g1.C6202b.m24689a(r0, r1)
            r6 = r2
            android.widget.LinearLayout r6 = (android.widget.LinearLayout) r6
            if (r6 == 0) goto L_0x00b9
            int r1 = da0.C19951e.deposit_initial_amount_input
            android.view.View r2 = p086g1.C6202b.m24689a(r0, r1)
            r7 = r2
            ge.bog.designsystem.components.biginput.BigInputView r7 = (p341ge.bog.designsystem.components.biginput.BigInputView) r7
            if (r7 == 0) goto L_0x00b9
            int r1 = da0.C19951e.initial_amount_inline_feedback
            android.view.View r2 = p086g1.C6202b.m24689a(r0, r1)
            r8 = r2
            ge.bog.designsystem.components.inlinefeedback.InlineFeedback r8 = (p341ge.bog.designsystem.components.inlinefeedback.InlineFeedback) r8
            if (r8 == 0) goto L_0x00b9
            int r1 = da0.C19951e.interest_rate_error_layout
            android.view.View r2 = p086g1.C6202b.m24689a(r0, r1)
            if (r2 == 0) goto L_0x00b9
            ha0.s r9 = ha0.C24942s.m79750a(r2)
            int r1 = da0.C19951e.f54523b0
            android.view.View r2 = p086g1.C6202b.m24689a(r0, r1)
            if (r2 == 0) goto L_0x00b9
            ha0.t r10 = ha0.C24943t.m79753a(r2)
            int r1 = da0.C19951e.f54533m0
            android.view.View r2 = p086g1.C6202b.m24689a(r0, r1)
            r11 = r2
            android.widget.FrameLayout r11 = (android.widget.FrameLayout) r11
            if (r11 == 0) goto L_0x00b9
            int r1 = da0.C19951e.period_selector_layout
            android.view.View r2 = p086g1.C6202b.m24689a(r0, r1)
            if (r2 == 0) goto L_0x00b9
            ha0.q r12 = ha0.C24940q.m79744a(r2)
            int r1 = da0.C19951e.f54534p0
            android.view.View r2 = p086g1.C6202b.m24689a(r0, r1)
            r13 = r2
            android.widget.FrameLayout r13 = (android.widget.FrameLayout) r13
            if (r13 == 0) goto L_0x00b9
            int r1 = da0.C19951e.f54538t0
            android.view.View r2 = p086g1.C6202b.m24689a(r0, r1)
            if (r2 == 0) goto L_0x00b9
            p90.z7 r14 = p90.C27486z7.m85250a(r2)
            int r1 = da0.C19951e.f54539u0
            android.view.View r2 = p086g1.C6202b.m24689a(r0, r1)
            r15 = r2
            androidx.cardview.widget.CardView r15 = (androidx.cardview.widget.CardView) r15
            if (r15 == 0) goto L_0x00b9
            int r1 = da0.C19951e.f54510G0
            android.view.View r2 = p086g1.C6202b.m24689a(r0, r1)
            if (r2 == 0) goto L_0x00b9
            p90.c8 r16 = p90.C27272c8.m84388a(r2)
            int r1 = da0.C19951e.f54514I0
            android.view.View r2 = p086g1.C6202b.m24689a(r0, r1)
            r17 = r2
            androidx.viewpager2.widget.ViewPager2 r17 = (androidx.viewpager2.widget.ViewPager2) r17
            if (r17 == 0) goto L_0x00b9
            int r1 = da0.C19951e.withdrawal_selector_layout
            android.view.View r2 = p086g1.C6202b.m24689a(r0, r1)
            if (r2 == 0) goto L_0x00b9
            ha0.r r18 = ha0.C24941r.m79747a(r2)
            int r1 = da0.C19951e.withdrawal_type_error_layout
            android.view.View r2 = p086g1.C6202b.m24689a(r0, r1)
            if (r2 == 0) goto L_0x00b9
            ha0.s r19 = ha0.C24942s.m79750a(r2)
            ha0.h r1 = new ha0.h
            r3 = r1
            r4 = r0
            androidx.coordinatorlayout.widget.CoordinatorLayout r4 = (androidx.coordinatorlayout.widget.CoordinatorLayout) r4
            r3.<init>(r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19)
            return r1
        L_0x00b9:
            android.content.res.Resources r0 = r20.getResources()
            java.lang.String r0 = r0.getResourceName(r1)
            java.lang.NullPointerException r1 = new java.lang.NullPointerException
            java.lang.String r2 = "Missing required view with ID: "
            java.lang.String r0 = r2.concat(r0)
            r1.<init>(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: ha0.C24931h.m79704a(android.view.View):ha0.h");
    }

    /* renamed from: d */
    public static C24931h m79705d(LayoutInflater layoutInflater) {
        return m79706e(layoutInflater, (ViewGroup) null, false);
    }

    /* renamed from: e */
    public static C24931h m79706e(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(C19952f.activity_deposit_application, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return m79704a(inflate);
    }

    /* renamed from: c */
    public CoordinatorLayout mo3946b() {
        return this.f64120d;
    }
}
