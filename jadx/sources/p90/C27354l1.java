package p90;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import androidx.core.widget.NestedScrollView;
import p086g1.C6201a;
import p341ge.bog.mobilebank.p975ui.views.widgets.BogTextView;
import p366bk.C10324m;

/* renamed from: p90.l1 */
public final class C27354l1 implements C6201a {

    /* renamed from: d */
    private final LinearLayout f69200d;

    /* renamed from: e */
    public final View f69201e;

    /* renamed from: f */
    public final NestedScrollView f69202f;

    /* renamed from: g */
    public final BogTextView f69203g;

    /* renamed from: h */
    public final ImageView f69204h;

    /* renamed from: i */
    public final BogTextView f69205i;

    /* renamed from: j */
    public final BogTextView f69206j;

    /* renamed from: k */
    public final BogTextView f69207k;

    /* renamed from: l */
    public final BogTextView f69208l;

    /* renamed from: m */
    public final LinearLayout f69209m;

    /* renamed from: n */
    public final C27272c8 f69210n;

    /* renamed from: o */
    public final LinearLayout f69211o;

    private C27354l1(LinearLayout linearLayout, View view, NestedScrollView nestedScrollView, BogTextView bogTextView, ImageView imageView, BogTextView bogTextView2, BogTextView bogTextView3, BogTextView bogTextView4, BogTextView bogTextView5, LinearLayout linearLayout2, C27272c8 c8Var, LinearLayout linearLayout3) {
        this.f69200d = linearLayout;
        this.f69201e = view;
        this.f69202f = nestedScrollView;
        this.f69203g = bogTextView;
        this.f69204h = imageView;
        this.f69205i = bogTextView2;
        this.f69206j = bogTextView3;
        this.f69207k = bogTextView4;
        this.f69208l = bogTextView5;
        this.f69209m = linearLayout2;
        this.f69210n = c8Var;
        this.f69211o = linearLayout3;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:18:0x0060, code lost:
        r0 = p366bk.C10322k.f28730Ex;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static p90.C27354l1 m84723a(android.view.View r14) {
        /*
            int r0 = p366bk.C10322k.buttons_divider
            android.view.View r3 = p086g1.C6202b.m24689a(r14, r0)
            if (r3 == 0) goto L_0x0081
            int r0 = p366bk.C10322k.f28809Yg
            android.view.View r1 = p086g1.C6202b.m24689a(r14, r0)
            r4 = r1
            androidx.core.widget.NestedScrollView r4 = (androidx.core.widget.NestedScrollView) r4
            if (r4 == 0) goto L_0x0081
            int r0 = p366bk.C10322k.f28814Zg
            android.view.View r1 = p086g1.C6202b.m24689a(r14, r0)
            r5 = r1
            ge.bog.mobilebank.ui.views.widgets.BogTextView r5 = (p341ge.bog.mobilebank.p975ui.views.widgets.BogTextView) r5
            if (r5 == 0) goto L_0x0081
            int r0 = p366bk.C10322k.payment_result_image
            android.view.View r1 = p086g1.C6202b.m24689a(r14, r0)
            r6 = r1
            android.widget.ImageView r6 = (android.widget.ImageView) r6
            if (r6 == 0) goto L_0x0081
            int r0 = p366bk.C10322k.person_name
            android.view.View r1 = p086g1.C6202b.m24689a(r14, r0)
            r7 = r1
            ge.bog.mobilebank.ui.views.widgets.BogTextView r7 = (p341ge.bog.mobilebank.p975ui.views.widgets.BogTextView) r7
            if (r7 == 0) goto L_0x0081
            int r0 = p366bk.C10322k.f28900up
            android.view.View r1 = p086g1.C6202b.m24689a(r14, r0)
            r8 = r1
            ge.bog.mobilebank.ui.views.widgets.BogTextView r8 = (p341ge.bog.mobilebank.p975ui.views.widgets.BogTextView) r8
            if (r8 == 0) goto L_0x0081
            int r0 = p366bk.C10322k.points_sum
            android.view.View r1 = p086g1.C6202b.m24689a(r14, r0)
            r9 = r1
            ge.bog.mobilebank.ui.views.widgets.BogTextView r9 = (p341ge.bog.mobilebank.p975ui.views.widgets.BogTextView) r9
            if (r9 == 0) goto L_0x0081
            int r0 = p366bk.C10322k.result_status_tv
            android.view.View r1 = p086g1.C6202b.m24689a(r14, r0)
            r10 = r1
            ge.bog.mobilebank.ui.views.widgets.BogTextView r10 = (p341ge.bog.mobilebank.p975ui.views.widgets.BogTextView) r10
            if (r10 == 0) goto L_0x0081
            int r0 = p366bk.C10322k.selected_products_container
            android.view.View r1 = p086g1.C6202b.m24689a(r14, r0)
            r11 = r1
            android.widget.LinearLayout r11 = (android.widget.LinearLayout) r11
            if (r11 == 0) goto L_0x0081
            int r0 = p366bk.C10322k.f28730Ex
            android.view.View r1 = p086g1.C6202b.m24689a(r14, r0)
            if (r1 == 0) goto L_0x0081
            p90.c8 r12 = p90.C27272c8.m84388a(r1)
            int r0 = p366bk.C10322k.total_points_container
            android.view.View r1 = p086g1.C6202b.m24689a(r14, r0)
            r13 = r1
            android.widget.LinearLayout r13 = (android.widget.LinearLayout) r13
            if (r13 == 0) goto L_0x0081
            p90.l1 r0 = new p90.l1
            r2 = r14
            android.widget.LinearLayout r2 = (android.widget.LinearLayout) r2
            r1 = r0
            r1.<init>(r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13)
            return r0
        L_0x0081:
            android.content.res.Resources r14 = r14.getResources()
            java.lang.String r14 = r14.getResourceName(r0)
            java.lang.NullPointerException r0 = new java.lang.NullPointerException
            java.lang.String r1 = "Missing required view with ID: "
            java.lang.String r14 = r1.concat(r14)
            r0.<init>(r14)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: p90.C27354l1.m84723a(android.view.View):p90.l1");
    }

    /* renamed from: d */
    public static C27354l1 m84724d(LayoutInflater layoutInflater) {
        return m84725e(layoutInflater, (ViewGroup) null, false);
    }

    /* renamed from: e */
    public static C27354l1 m84725e(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(C10324m.activity_plus_invitation_result, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return m84723a(inflate);
    }

    /* renamed from: c */
    public LinearLayout mo3946b() {
        return this.f69200d;
    }
}
