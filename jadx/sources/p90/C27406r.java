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

/* renamed from: p90.r */
public final class C27406r implements C6201a {

    /* renamed from: d */
    private final LinearLayout f69626d;

    /* renamed from: e */
    public final TextTypeView f69627e;

    /* renamed from: f */
    public final LinearLayout f69628f;

    /* renamed from: g */
    public final TextTypeView f69629g;

    /* renamed from: h */
    public final BogTextView f69630h;

    /* renamed from: i */
    public final BogProgressBar f69631i;

    /* renamed from: j */
    public final TextTypeView f69632j;

    /* renamed from: k */
    public final LinearLayout f69633k;

    /* renamed from: l */
    public final BogButton f69634l;

    /* renamed from: m */
    public final TextTypeView f69635m;

    /* renamed from: n */
    public final C27272c8 f69636n;

    private C27406r(LinearLayout linearLayout, TextTypeView textTypeView, LinearLayout linearLayout2, TextTypeView textTypeView2, BogTextView bogTextView, BogProgressBar bogProgressBar, TextTypeView textTypeView3, LinearLayout linearLayout3, BogButton bogButton, TextTypeView textTypeView4, C27272c8 c8Var) {
        this.f69626d = linearLayout;
        this.f69627e = textTypeView;
        this.f69628f = linearLayout2;
        this.f69629g = textTypeView2;
        this.f69630h = bogTextView;
        this.f69631i = bogProgressBar;
        this.f69632j = textTypeView3;
        this.f69633k = linearLayout3;
        this.f69634l = bogButton;
        this.f69635m = textTypeView4;
        this.f69636n = c8Var;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:16:0x005b, code lost:
        r0 = p366bk.C10322k.f28730Ex;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static p90.C27406r m84926a(android.view.View r14) {
        /*
            int r0 = p366bk.C10322k.card_number_et
            android.view.View r1 = p086g1.C6202b.m24689a(r14, r0)
            r4 = r1
            ge.bog.mobilebank.ui.views.widgets.TextTypeView r4 = (p341ge.bog.mobilebank.p975ui.views.widgets.TextTypeView) r4
            if (r4 == 0) goto L_0x006f
            int r0 = p366bk.C10322k.footer_view
            android.view.View r1 = p086g1.C6202b.m24689a(r14, r0)
            r5 = r1
            android.widget.LinearLayout r5 = (android.widget.LinearLayout) r5
            if (r5 == 0) goto L_0x006f
            int r0 = p366bk.C10322k.group_name_et
            android.view.View r1 = p086g1.C6202b.m24689a(r14, r0)
            r6 = r1
            ge.bog.mobilebank.ui.views.widgets.TextTypeView r6 = (p341ge.bog.mobilebank.p975ui.views.widgets.TextTypeView) r6
            if (r6 == 0) goto L_0x006f
            int r0 = p366bk.C10322k.f28766Lf
            android.view.View r1 = p086g1.C6202b.m24689a(r14, r0)
            r7 = r1
            ge.bog.mobilebank.ui.views.widgets.BogTextView r7 = (p341ge.bog.mobilebank.p975ui.views.widgets.BogTextView) r7
            if (r7 == 0) goto L_0x006f
            int r0 = p366bk.C10322k.payment_wizard_progressbar
            android.view.View r1 = p086g1.C6202b.m24689a(r14, r0)
            r8 = r1
            ge.bog.mobilebank.ui.components.BogProgressBar r8 = (p341ge.bog.mobilebank.p975ui.components.BogProgressBar) r8
            if (r8 == 0) goto L_0x006f
            int r0 = p366bk.C10322k.personal_number_et
            android.view.View r1 = p086g1.C6202b.m24689a(r14, r0)
            r9 = r1
            ge.bog.mobilebank.ui.views.widgets.TextTypeView r9 = (p341ge.bog.mobilebank.p975ui.views.widgets.TextTypeView) r9
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
            p90.r r14 = new p90.r
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
        throw new UnsupportedOperationException("Method not decompiled: p90.C27406r.m84926a(android.view.View):p90.r");
    }

    /* renamed from: d */
    public static C27406r m84927d(LayoutInflater layoutInflater) {
        return m84928e(layoutInflater, (ViewGroup) null, false);
    }

    /* renamed from: e */
    public static C27406r m84928e(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(C10324m.activity_car_template_group, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return m84926a(inflate);
    }

    /* renamed from: c */
    public LinearLayout mo3946b() {
        return this.f69626d;
    }
}
