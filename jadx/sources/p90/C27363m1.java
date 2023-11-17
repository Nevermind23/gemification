package p90;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import p086g1.C6201a;
import p341ge.bog.mobilebank.p975ui.views.widgets.BogButton;
import p341ge.bog.mobilebank.p975ui.views.widgets.BogTextView;
import p341ge.bog.mobilebank.p975ui.views.widgets.CustomCheckBox;
import p366bk.C10324m;

/* renamed from: p90.m1 */
public final class C27363m1 implements C6201a {

    /* renamed from: d */
    private final FrameLayout f69273d;

    /* renamed from: e */
    public final CustomCheckBox f69274e;

    /* renamed from: f */
    public final LinearLayout f69275f;

    /* renamed from: g */
    public final BogTextView f69276g;

    /* renamed from: h */
    public final BogButton f69277h;

    /* renamed from: i */
    public final BogTextView f69278i;

    /* renamed from: j */
    public final BogTextView f69279j;

    /* renamed from: k */
    public final BogTextView f69280k;

    /* renamed from: l */
    public final ImageView f69281l;

    /* renamed from: m */
    public final FrameLayout f69282m;

    /* renamed from: n */
    public final C27272c8 f69283n;

    private C27363m1(FrameLayout frameLayout, CustomCheckBox customCheckBox, LinearLayout linearLayout, BogTextView bogTextView, BogButton bogButton, BogTextView bogTextView2, BogTextView bogTextView3, BogTextView bogTextView4, ImageView imageView, FrameLayout frameLayout2, C27272c8 c8Var) {
        this.f69273d = frameLayout;
        this.f69274e = customCheckBox;
        this.f69275f = linearLayout;
        this.f69276g = bogTextView;
        this.f69277h = bogButton;
        this.f69278i = bogTextView2;
        this.f69279j = bogTextView3;
        this.f69280k = bogTextView4;
        this.f69281l = imageView;
        this.f69282m = frameLayout2;
        this.f69283n = c8Var;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:18:0x0063, code lost:
        r0 = p366bk.C10322k.f28730Ex;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static p90.C27363m1 m84761a(android.view.View r14) {
        /*
            int r0 = p366bk.C10322k.agreement_checkbox
            android.view.View r1 = p086g1.C6202b.m24689a(r14, r0)
            r4 = r1
            ge.bog.mobilebank.ui.views.widgets.CustomCheckBox r4 = (p341ge.bog.mobilebank.p975ui.views.widgets.CustomCheckBox) r4
            if (r4 == 0) goto L_0x0079
            int r0 = p366bk.C10322k.bottom_layout
            android.view.View r1 = p086g1.C6202b.m24689a(r14, r0)
            r5 = r1
            android.widget.LinearLayout r5 = (android.widget.LinearLayout) r5
            if (r5 == 0) goto L_0x0079
            int r0 = p366bk.C10322k.conditions_btn
            android.view.View r1 = p086g1.C6202b.m24689a(r14, r0)
            r6 = r1
            ge.bog.mobilebank.ui.views.widgets.BogTextView r6 = (p341ge.bog.mobilebank.p975ui.views.widgets.BogTextView) r6
            if (r6 == 0) goto L_0x0079
            int r0 = p366bk.C10322k.enroll_btn
            android.view.View r1 = p086g1.C6202b.m24689a(r14, r0)
            r7 = r1
            ge.bog.mobilebank.ui.views.widgets.BogButton r7 = (p341ge.bog.mobilebank.p975ui.views.widgets.BogButton) r7
            if (r7 == 0) goto L_0x0079
            int r0 = p366bk.C10322k.offer_description
            android.view.View r1 = p086g1.C6202b.m24689a(r14, r0)
            r8 = r1
            ge.bog.mobilebank.ui.views.widgets.BogTextView r8 = (p341ge.bog.mobilebank.p975ui.views.widgets.BogTextView) r8
            if (r8 == 0) goto L_0x0079
            int r0 = p366bk.C10322k.offer_text2
            android.view.View r1 = p086g1.C6202b.m24689a(r14, r0)
            r9 = r1
            ge.bog.mobilebank.ui.views.widgets.BogTextView r9 = (p341ge.bog.mobilebank.p975ui.views.widgets.BogTextView) r9
            if (r9 == 0) goto L_0x0079
            int r0 = p366bk.C10322k.f28885qn
            android.view.View r1 = p086g1.C6202b.m24689a(r14, r0)
            r10 = r1
            ge.bog.mobilebank.ui.views.widgets.BogTextView r10 = (p341ge.bog.mobilebank.p975ui.views.widgets.BogTextView) r10
            if (r10 == 0) goto L_0x0079
            int r0 = p366bk.C10322k.plus_icon
            android.view.View r1 = p086g1.C6202b.m24689a(r14, r0)
            r11 = r1
            android.widget.ImageView r11 = (android.widget.ImageView) r11
            if (r11 == 0) goto L_0x0079
            int r0 = p366bk.C10322k.f28719Dq
            android.view.View r1 = p086g1.C6202b.m24689a(r14, r0)
            r12 = r1
            android.widget.FrameLayout r12 = (android.widget.FrameLayout) r12
            if (r12 == 0) goto L_0x0079
            int r0 = p366bk.C10322k.f28730Ex
            android.view.View r1 = p086g1.C6202b.m24689a(r14, r0)
            if (r1 == 0) goto L_0x0079
            p90.c8 r13 = p90.C27272c8.m84388a(r1)
            p90.m1 r0 = new p90.m1
            r3 = r14
            android.widget.FrameLayout r3 = (android.widget.FrameLayout) r3
            r2 = r0
            r2.<init>(r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13)
            return r0
        L_0x0079:
            android.content.res.Resources r14 = r14.getResources()
            java.lang.String r14 = r14.getResourceName(r0)
            java.lang.NullPointerException r0 = new java.lang.NullPointerException
            java.lang.String r1 = "Missing required view with ID: "
            java.lang.String r14 = r1.concat(r14)
            r0.<init>(r14)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: p90.C27363m1.m84761a(android.view.View):p90.m1");
    }

    /* renamed from: d */
    public static C27363m1 m84762d(LayoutInflater layoutInflater) {
        return m84763e(layoutInflater, (ViewGroup) null, false);
    }

    /* renamed from: e */
    public static C27363m1 m84763e(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(C10324m.activity_plus_offer, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return m84761a(inflate);
    }

    /* renamed from: c */
    public FrameLayout mo3946b() {
        return this.f69273d;
    }
}
