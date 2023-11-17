package p90;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import p086g1.C6201a;
import p341ge.bog.mobilebank.p975ui.views.widgets.BogTextView;
import p341ge.bog.mobilebank.p975ui.views.widgets.SpecialAlignedTitleValueView;
import p366bk.C10324m;

/* renamed from: p90.e0 */
public final class C27284e0 implements C6201a {

    /* renamed from: d */
    private final LinearLayout f68574d;

    /* renamed from: e */
    public final SpecialAlignedTitleValueView f68575e;

    /* renamed from: f */
    public final SpecialAlignedTitleValueView f68576f;

    /* renamed from: g */
    public final ImageView f68577g;

    /* renamed from: h */
    public final BogTextView f68578h;

    /* renamed from: i */
    public final C27272c8 f68579i;

    /* renamed from: j */
    public final SpecialAlignedTitleValueView f68580j;

    private C27284e0(LinearLayout linearLayout, SpecialAlignedTitleValueView specialAlignedTitleValueView, SpecialAlignedTitleValueView specialAlignedTitleValueView2, ImageView imageView, BogTextView bogTextView, C27272c8 c8Var, SpecialAlignedTitleValueView specialAlignedTitleValueView3) {
        this.f68574d = linearLayout;
        this.f68575e = specialAlignedTitleValueView;
        this.f68576f = specialAlignedTitleValueView2;
        this.f68577g = imageView;
        this.f68578h = bogTextView;
        this.f68579i = c8Var;
        this.f68580j = specialAlignedTitleValueView3;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:8:0x002c, code lost:
        r0 = p366bk.C10322k.f28730Ex;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static p90.C27284e0 m84435a(android.view.View r10) {
        /*
            int r0 = p366bk.C10322k.express_exchange_from
            android.view.View r1 = p086g1.C6202b.m24689a(r10, r0)
            r4 = r1
            ge.bog.mobilebank.ui.views.widgets.SpecialAlignedTitleValueView r4 = (p341ge.bog.mobilebank.p975ui.views.widgets.SpecialAlignedTitleValueView) r4
            if (r4 == 0) goto L_0x004d
            int r0 = p366bk.C10322k.express_exchange_to
            android.view.View r1 = p086g1.C6202b.m24689a(r10, r0)
            r5 = r1
            ge.bog.mobilebank.ui.views.widgets.SpecialAlignedTitleValueView r5 = (p341ge.bog.mobilebank.p975ui.views.widgets.SpecialAlignedTitleValueView) r5
            if (r5 == 0) goto L_0x004d
            int r0 = p366bk.C10322k.payment_result_image
            android.view.View r1 = p086g1.C6202b.m24689a(r10, r0)
            r6 = r1
            android.widget.ImageView r6 = (android.widget.ImageView) r6
            if (r6 == 0) goto L_0x004d
            int r0 = p366bk.C10322k.successful_result_tv
            android.view.View r1 = p086g1.C6202b.m24689a(r10, r0)
            r7 = r1
            ge.bog.mobilebank.ui.views.widgets.BogTextView r7 = (p341ge.bog.mobilebank.p975ui.views.widgets.BogTextView) r7
            if (r7 == 0) goto L_0x004d
            int r0 = p366bk.C10322k.f28730Ex
            android.view.View r1 = p086g1.C6202b.m24689a(r10, r0)
            if (r1 == 0) goto L_0x004d
            p90.c8 r8 = p90.C27272c8.m84388a(r1)
            int r0 = p366bk.C10322k.transferred_point_amount
            android.view.View r1 = p086g1.C6202b.m24689a(r10, r0)
            r9 = r1
            ge.bog.mobilebank.ui.views.widgets.SpecialAlignedTitleValueView r9 = (p341ge.bog.mobilebank.p975ui.views.widgets.SpecialAlignedTitleValueView) r9
            if (r9 == 0) goto L_0x004d
            p90.e0 r0 = new p90.e0
            r3 = r10
            android.widget.LinearLayout r3 = (android.widget.LinearLayout) r3
            r2 = r0
            r2.<init>(r3, r4, r5, r6, r7, r8, r9)
            return r0
        L_0x004d:
            android.content.res.Resources r10 = r10.getResources()
            java.lang.String r10 = r10.getResourceName(r0)
            java.lang.NullPointerException r0 = new java.lang.NullPointerException
            java.lang.String r1 = "Missing required view with ID: "
            java.lang.String r10 = r1.concat(r10)
            r0.<init>(r10)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: p90.C27284e0.m84435a(android.view.View):p90.e0");
    }

    /* renamed from: d */
    public static C27284e0 m84436d(LayoutInflater layoutInflater) {
        return m84437e(layoutInflater, (ViewGroup) null, false);
    }

    /* renamed from: e */
    public static C27284e0 m84437e(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(C10324m.activity_express_exchange_result, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return m84435a(inflate);
    }

    /* renamed from: c */
    public LinearLayout mo3946b() {
        return this.f68574d;
    }
}
