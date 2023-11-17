package p90;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import p086g1.C6201a;
import p341ge.bog.mobilebank.p975ui.views.widgets.BogTextView;
import p341ge.bog.mobilebank.p975ui.views.widgets.BogViewPager;
import p366bk.C10324m;

/* renamed from: p90.a0 */
public final class C27244a0 implements C6201a {

    /* renamed from: d */
    private final LinearLayout f68262d;

    /* renamed from: e */
    public final BogTextView f68263e;

    /* renamed from: f */
    public final BogTextView f68264f;

    /* renamed from: g */
    public final C27272c8 f68265g;

    /* renamed from: h */
    public final BogViewPager f68266h;

    private C27244a0(LinearLayout linearLayout, BogTextView bogTextView, BogTextView bogTextView2, C27272c8 c8Var, BogViewPager bogViewPager) {
        this.f68262d = linearLayout;
        this.f68263e = bogTextView;
        this.f68264f = bogTextView2;
        this.f68265g = c8Var;
        this.f68266h = bogViewPager;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:4:0x0016, code lost:
        r0 = p366bk.C10322k.f28730Ex;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static p90.C27244a0 m84280a(android.view.View r8) {
        /*
            int r0 = p366bk.C10322k.tab_payments
            android.view.View r1 = p086g1.C6202b.m24689a(r8, r0)
            r4 = r1
            ge.bog.mobilebank.ui.views.widgets.BogTextView r4 = (p341ge.bog.mobilebank.p975ui.views.widgets.BogTextView) r4
            if (r4 == 0) goto L_0x0037
            int r0 = p366bk.C10322k.tab_transfers
            android.view.View r1 = p086g1.C6202b.m24689a(r8, r0)
            r5 = r1
            ge.bog.mobilebank.ui.views.widgets.BogTextView r5 = (p341ge.bog.mobilebank.p975ui.views.widgets.BogTextView) r5
            if (r5 == 0) goto L_0x0037
            int r0 = p366bk.C10322k.f28730Ex
            android.view.View r1 = p086g1.C6202b.m24689a(r8, r0)
            if (r1 == 0) goto L_0x0037
            p90.c8 r6 = p90.C27272c8.m84388a(r1)
            int r0 = p366bk.C10322k.f28818aB
            android.view.View r1 = p086g1.C6202b.m24689a(r8, r0)
            r7 = r1
            ge.bog.mobilebank.ui.views.widgets.BogViewPager r7 = (p341ge.bog.mobilebank.p975ui.views.widgets.BogViewPager) r7
            if (r7 == 0) goto L_0x0037
            p90.a0 r0 = new p90.a0
            r3 = r8
            android.widget.LinearLayout r3 = (android.widget.LinearLayout) r3
            r2 = r0
            r2.<init>(r3, r4, r5, r6, r7)
            return r0
        L_0x0037:
            android.content.res.Resources r8 = r8.getResources()
            java.lang.String r8 = r8.getResourceName(r0)
            java.lang.NullPointerException r0 = new java.lang.NullPointerException
            java.lang.String r1 = "Missing required view with ID: "
            java.lang.String r8 = r1.concat(r8)
            r0.<init>(r8)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: p90.C27244a0.m84280a(android.view.View):p90.a0");
    }

    /* renamed from: d */
    public static C27244a0 m84281d(LayoutInflater layoutInflater) {
        return m84282e(layoutInflater, (ViewGroup) null, false);
    }

    /* renamed from: e */
    public static C27244a0 m84282e(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(C10324m.activity_dd_sto_list, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return m84280a(inflate);
    }

    /* renamed from: c */
    public LinearLayout mo3946b() {
        return this.f68262d;
    }
}
