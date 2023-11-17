package p90;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import p086g1.C6201a;
import p341ge.bog.mobilebank.p975ui.views.widgets.BogTextView;
import p341ge.bog.mobilebank.p975ui.views.widgets.BogViewPager;
import p366bk.C10324m;

/* renamed from: p90.x0 */
public final class C27461x0 implements C6201a {

    /* renamed from: d */
    private final LinearLayout f70190d;

    /* renamed from: e */
    public final LinearLayout f70191e;

    /* renamed from: f */
    public final BogTextView f70192f;

    /* renamed from: g */
    public final BogViewPager f70193g;

    /* renamed from: h */
    public final BogTextView f70194h;

    /* renamed from: i */
    public final C27272c8 f70195i;

    private C27461x0(LinearLayout linearLayout, LinearLayout linearLayout2, BogTextView bogTextView, BogViewPager bogViewPager, BogTextView bogTextView2, C27272c8 c8Var) {
        this.f70190d = linearLayout;
        this.f70191e = linearLayout2;
        this.f70192f = bogTextView;
        this.f70193g = bogViewPager;
        this.f70194h = bogTextView2;
        this.f70195i = c8Var;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:8:0x002c, code lost:
        r0 = p366bk.C10322k.f28730Ex;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static p90.C27461x0 m85149a(android.view.View r9) {
        /*
            int r0 = p366bk.C10322k.f28820b0
            android.view.View r1 = p086g1.C6202b.m24689a(r9, r0)
            r4 = r1
            android.widget.LinearLayout r4 = (android.widget.LinearLayout) r4
            if (r4 == 0) goto L_0x0042
            int r0 = p366bk.C10322k.message_tab
            android.view.View r1 = p086g1.C6202b.m24689a(r9, r0)
            r5 = r1
            ge.bog.mobilebank.ui.views.widgets.BogTextView r5 = (p341ge.bog.mobilebank.p975ui.views.widgets.BogTextView) r5
            if (r5 == 0) goto L_0x0042
            int r0 = p366bk.C10322k.notifications_viewpager
            android.view.View r1 = p086g1.C6202b.m24689a(r9, r0)
            r6 = r1
            ge.bog.mobilebank.ui.views.widgets.BogViewPager r6 = (p341ge.bog.mobilebank.p975ui.views.widgets.BogViewPager) r6
            if (r6 == 0) goto L_0x0042
            int r0 = p366bk.C10322k.push_tab
            android.view.View r1 = p086g1.C6202b.m24689a(r9, r0)
            r7 = r1
            ge.bog.mobilebank.ui.views.widgets.BogTextView r7 = (p341ge.bog.mobilebank.p975ui.views.widgets.BogTextView) r7
            if (r7 == 0) goto L_0x0042
            int r0 = p366bk.C10322k.f28730Ex
            android.view.View r1 = p086g1.C6202b.m24689a(r9, r0)
            if (r1 == 0) goto L_0x0042
            p90.c8 r8 = p90.C27272c8.m84388a(r1)
            p90.x0 r0 = new p90.x0
            r3 = r9
            android.widget.LinearLayout r3 = (android.widget.LinearLayout) r3
            r2 = r0
            r2.<init>(r3, r4, r5, r6, r7, r8)
            return r0
        L_0x0042:
            android.content.res.Resources r9 = r9.getResources()
            java.lang.String r9 = r9.getResourceName(r0)
            java.lang.NullPointerException r0 = new java.lang.NullPointerException
            java.lang.String r1 = "Missing required view with ID: "
            java.lang.String r9 = r1.concat(r9)
            r0.<init>(r9)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: p90.C27461x0.m85149a(android.view.View):p90.x0");
    }

    /* renamed from: d */
    public static C27461x0 m85150d(LayoutInflater layoutInflater) {
        return m85151e(layoutInflater, (ViewGroup) null, false);
    }

    /* renamed from: e */
    public static C27461x0 m85151e(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(C10324m.activity_notification_list, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return m85149a(inflate);
    }

    /* renamed from: c */
    public LinearLayout mo3946b() {
        return this.f70190d;
    }
}
