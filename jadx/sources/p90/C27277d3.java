package p90;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import p086g1.C6201a;
import p341ge.bog.mobilebank.p975ui.views.widgets.BogTextView;
import p341ge.bog.mobilebank.p975ui.views.widgets.TextTypeView;
import p366bk.C10324m;

/* renamed from: p90.d3 */
public final class C27277d3 implements C6201a {

    /* renamed from: d */
    private final LinearLayout f68522d;

    /* renamed from: e */
    public final LinearLayout f68523e;

    /* renamed from: f */
    public final TextTypeView f68524f;

    /* renamed from: g */
    public final TextTypeView f68525g;

    /* renamed from: h */
    public final FrameLayout f68526h;

    /* renamed from: i */
    public final C27251a7 f68527i;

    /* renamed from: j */
    public final C27477y7 f68528j;

    /* renamed from: k */
    public final BogTextView f68529k;

    /* renamed from: l */
    public final LinearLayout f68530l;

    /* renamed from: m */
    public final FrameLayout f68531m;

    /* renamed from: n */
    public final C27272c8 f68532n;

    /* renamed from: o */
    public final BogTextView f68533o;

    private C27277d3(LinearLayout linearLayout, LinearLayout linearLayout2, TextTypeView textTypeView, TextTypeView textTypeView2, FrameLayout frameLayout, C27251a7 a7Var, C27477y7 y7Var, BogTextView bogTextView, LinearLayout linearLayout3, FrameLayout frameLayout2, C27272c8 c8Var, BogTextView bogTextView2) {
        this.f68522d = linearLayout;
        this.f68523e = linearLayout2;
        this.f68524f = textTypeView;
        this.f68525g = textTypeView2;
        this.f68526h = frameLayout;
        this.f68527i = a7Var;
        this.f68528j = y7Var;
        this.f68529k = bogTextView;
        this.f68530l = linearLayout3;
        this.f68531m = frameLayout2;
        this.f68532n = c8Var;
        this.f68533o = bogTextView2;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:18:0x0065, code lost:
        r0 = p366bk.C10322k.f28730Ex;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:8:0x002c, code lost:
        r0 = p366bk.C10322k.horizontal_error_layout;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static p90.C27277d3 m84408a(android.view.View r15) {
        /*
            int r0 = p366bk.C10322k.f28776Oc
            android.view.View r1 = p086g1.C6202b.m24689a(r15, r0)
            r4 = r1
            android.widget.LinearLayout r4 = (android.widget.LinearLayout) r4
            if (r4 == 0) goto L_0x0086
            int r0 = p366bk.C10322k.exchange_from_layout
            android.view.View r1 = p086g1.C6202b.m24689a(r15, r0)
            r5 = r1
            ge.bog.mobilebank.ui.views.widgets.TextTypeView r5 = (p341ge.bog.mobilebank.p975ui.views.widgets.TextTypeView) r5
            if (r5 == 0) goto L_0x0086
            int r0 = p366bk.C10322k.exchange_to_layout
            android.view.View r1 = p086g1.C6202b.m24689a(r15, r0)
            r6 = r1
            ge.bog.mobilebank.ui.views.widgets.TextTypeView r6 = (p341ge.bog.mobilebank.p975ui.views.widgets.TextTypeView) r6
            if (r6 == 0) goto L_0x0086
            int r0 = p366bk.C10322k.f28784Qe
            android.view.View r1 = p086g1.C6202b.m24689a(r15, r0)
            r7 = r1
            android.widget.FrameLayout r7 = (android.widget.FrameLayout) r7
            if (r7 == 0) goto L_0x0086
            int r0 = p366bk.C10322k.horizontal_error_layout
            android.view.View r1 = p086g1.C6202b.m24689a(r15, r0)
            if (r1 == 0) goto L_0x0086
            p90.a7 r8 = p90.C27251a7.m84303a(r1)
            int r0 = p366bk.C10322k.pay_group
            android.view.View r1 = p086g1.C6202b.m24689a(r15, r0)
            if (r1 == 0) goto L_0x0086
            p90.y7 r9 = p90.C27477y7.m85215a(r1)
            int r0 = p366bk.C10322k.plus_points_value
            android.view.View r1 = p086g1.C6202b.m24689a(r15, r0)
            r10 = r1
            ge.bog.mobilebank.ui.views.widgets.BogTextView r10 = (p341ge.bog.mobilebank.p975ui.views.widgets.BogTextView) r10
            if (r10 == 0) goto L_0x0086
            int r0 = p366bk.C10322k.plus_points_value_container
            android.view.View r1 = p086g1.C6202b.m24689a(r15, r0)
            r11 = r1
            android.widget.LinearLayout r11 = (android.widget.LinearLayout) r11
            if (r11 == 0) goto L_0x0086
            int r0 = p366bk.C10322k.f28752Iq
            android.view.View r1 = p086g1.C6202b.m24689a(r15, r0)
            r12 = r1
            android.widget.FrameLayout r12 = (android.widget.FrameLayout) r12
            if (r12 == 0) goto L_0x0086
            int r0 = p366bk.C10322k.f28730Ex
            android.view.View r1 = p086g1.C6202b.m24689a(r15, r0)
            if (r1 == 0) goto L_0x0086
            p90.c8 r13 = p90.C27272c8.m84388a(r1)
            int r0 = p366bk.C10322k.transfer_details_label
            android.view.View r1 = p086g1.C6202b.m24689a(r15, r0)
            r14 = r1
            ge.bog.mobilebank.ui.views.widgets.BogTextView r14 = (p341ge.bog.mobilebank.p975ui.views.widgets.BogTextView) r14
            if (r14 == 0) goto L_0x0086
            p90.d3 r0 = new p90.d3
            r3 = r15
            android.widget.LinearLayout r3 = (android.widget.LinearLayout) r3
            r2 = r0
            r2.<init>(r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14)
            return r0
        L_0x0086:
            android.content.res.Resources r15 = r15.getResources()
            java.lang.String r15 = r15.getResourceName(r0)
            java.lang.NullPointerException r0 = new java.lang.NullPointerException
            java.lang.String r1 = "Missing required view with ID: "
            java.lang.String r15 = r1.concat(r15)
            r0.<init>(r15)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: p90.C27277d3.m84408a(android.view.View):p90.d3");
    }

    /* renamed from: d */
    public static C27277d3 m84409d(LayoutInflater layoutInflater) {
        return m84410e(layoutInflater, (ViewGroup) null, false);
    }

    /* renamed from: e */
    public static C27277d3 m84410e(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(C10324m.exchange_express_activity, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return m84408a(inflate);
    }

    /* renamed from: c */
    public LinearLayout mo3946b() {
        return this.f68522d;
    }
}
