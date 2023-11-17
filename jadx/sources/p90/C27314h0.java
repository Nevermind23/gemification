package p90;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import p086g1.C6201a;
import p341ge.bog.mobilebank.p975ui.components.BogProgressBar;
import p341ge.bog.mobilebank.p975ui.views.widgets.BogButton;
import p341ge.bog.mobilebank.p975ui.views.widgets.BogTextView;
import p341ge.bog.mobilebank.p975ui.views.widgets.TextTypeView;
import p366bk.C10324m;

/* renamed from: p90.h0 */
public final class C27314h0 implements C6201a {

    /* renamed from: d */
    private final LinearLayout f68843d;

    /* renamed from: e */
    public final TextTypeView f68844e;

    /* renamed from: f */
    public final TextTypeView f68845f;

    /* renamed from: g */
    public final LinearLayout f68846g;

    /* renamed from: h */
    public final TextTypeView f68847h;

    /* renamed from: i */
    public final BogTextView f68848i;

    /* renamed from: j */
    public final BogProgressBar f68849j;

    /* renamed from: k */
    public final LinearLayout f68850k;

    /* renamed from: l */
    public final BogButton f68851l;

    /* renamed from: m */
    public final TextTypeView f68852m;

    /* renamed from: n */
    public final C27272c8 f68853n;

    private C27314h0(LinearLayout linearLayout, TextTypeView textTypeView, TextTypeView textTypeView2, LinearLayout linearLayout2, TextTypeView textTypeView3, BogTextView bogTextView, BogProgressBar bogProgressBar, LinearLayout linearLayout3, BogButton bogButton, TextTypeView textTypeView4, C27272c8 c8Var) {
        this.f68843d = linearLayout;
        this.f68844e = textTypeView;
        this.f68845f = textTypeView2;
        this.f68846g = linearLayout2;
        this.f68847h = textTypeView3;
        this.f68848i = bogTextView;
        this.f68849j = bogProgressBar;
        this.f68850k = linearLayout3;
        this.f68851l = bogButton;
        this.f68852m = textTypeView4;
        this.f68853n = c8Var;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:16:0x005b, code lost:
        r0 = p366bk.C10322k.f28730Ex;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static p90.C27314h0 m84562a(android.view.View r14) {
        /*
            int r0 = p366bk.C10322k.address_et
            android.view.View r1 = p086g1.C6202b.m24689a(r14, r0)
            r4 = r1
            ge.bog.mobilebank.ui.views.widgets.TextTypeView r4 = (p341ge.bog.mobilebank.p975ui.views.widgets.TextTypeView) r4
            if (r4 == 0) goto L_0x006f
            int r0 = p366bk.C10322k.flat_number_et
            android.view.View r1 = p086g1.C6202b.m24689a(r14, r0)
            r5 = r1
            ge.bog.mobilebank.ui.views.widgets.TextTypeView r5 = (p341ge.bog.mobilebank.p975ui.views.widgets.TextTypeView) r5
            if (r5 == 0) goto L_0x006f
            int r0 = p366bk.C10322k.footer_view
            android.view.View r1 = p086g1.C6202b.m24689a(r14, r0)
            r6 = r1
            android.widget.LinearLayout r6 = (android.widget.LinearLayout) r6
            if (r6 == 0) goto L_0x006f
            int r0 = p366bk.C10322k.group_name_et
            android.view.View r1 = p086g1.C6202b.m24689a(r14, r0)
            r7 = r1
            ge.bog.mobilebank.ui.views.widgets.TextTypeView r7 = (p341ge.bog.mobilebank.p975ui.views.widgets.TextTypeView) r7
            if (r7 == 0) goto L_0x006f
            int r0 = p366bk.C10322k.f28766Lf
            android.view.View r1 = p086g1.C6202b.m24689a(r14, r0)
            r8 = r1
            ge.bog.mobilebank.ui.views.widgets.BogTextView r8 = (p341ge.bog.mobilebank.p975ui.views.widgets.BogTextView) r8
            if (r8 == 0) goto L_0x006f
            int r0 = p366bk.C10322k.payment_wizard_progressbar
            android.view.View r1 = p086g1.C6202b.m24689a(r14, r0)
            r9 = r1
            ge.bog.mobilebank.ui.components.BogProgressBar r9 = (p341ge.bog.mobilebank.p975ui.components.BogProgressBar) r9
            if (r9 == 0) goto L_0x006f
            r10 = r14
            android.widget.LinearLayout r10 = (android.widget.LinearLayout) r10
            int r0 = p366bk.C10322k.f28914yt
            android.view.View r1 = p086g1.C6202b.m24689a(r14, r0)
            r11 = r1
            ge.bog.mobilebank.ui.views.widgets.BogButton r11 = (p341ge.bog.mobilebank.p975ui.views.widgets.BogButton) r11
            if (r11 == 0) goto L_0x006f
            int r0 = p366bk.C10322k.template_icon_tv
            android.view.View r1 = p086g1.C6202b.m24689a(r14, r0)
            r12 = r1
            ge.bog.mobilebank.ui.views.widgets.TextTypeView r12 = (p341ge.bog.mobilebank.p975ui.views.widgets.TextTypeView) r12
            if (r12 == 0) goto L_0x006f
            int r0 = p366bk.C10322k.f28730Ex
            android.view.View r1 = p086g1.C6202b.m24689a(r14, r0)
            if (r1 == 0) goto L_0x006f
            p90.c8 r13 = p90.C27272c8.m84388a(r1)
            p90.h0 r14 = new p90.h0
            r2 = r14
            r3 = r10
            r2.<init>(r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13)
            return r14
        L_0x006f:
            android.content.res.Resources r14 = r14.getResources()
            java.lang.String r14 = r14.getResourceName(r0)
            java.lang.NullPointerException r0 = new java.lang.NullPointerException
            java.lang.String r1 = "Missing required view with ID: "
            java.lang.String r14 = r1.concat(r14)
            r0.<init>(r14)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: p90.C27314h0.m84562a(android.view.View):p90.h0");
    }

    /* renamed from: d */
    public static C27314h0 m84563d(LayoutInflater layoutInflater) {
        return m84564e(layoutInflater, (ViewGroup) null, false);
    }

    /* renamed from: e */
    public static C27314h0 m84564e(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(C10324m.activity_house_template_group, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return m84562a(inflate);
    }

    /* renamed from: c */
    public LinearLayout mo3946b() {
        return this.f68843d;
    }
}
