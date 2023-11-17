package p90;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import p086g1.C6201a;
import p341ge.bog.mobilebank.p975ui.views.widgets.BogButton;
import p341ge.bog.mobilebank.p975ui.views.widgets.BogTextView;
import p341ge.bog.mobilebank.p975ui.views.widgets.TextTypeView;
import p366bk.C10324m;

/* renamed from: p90.r1 */
public final class C27408r1 implements C6201a {

    /* renamed from: d */
    private final LinearLayout f69645d;

    /* renamed from: e */
    public final TextTypeView f69646e;

    /* renamed from: f */
    public final BogTextView f69647f;

    /* renamed from: g */
    public final BogButton f69648g;

    /* renamed from: h */
    public final ImageView f69649h;

    /* renamed from: i */
    public final C27272c8 f69650i;

    private C27408r1(LinearLayout linearLayout, TextTypeView textTypeView, BogTextView bogTextView, BogButton bogButton, ImageView imageView, C27272c8 c8Var) {
        this.f69645d = linearLayout;
        this.f69646e = textTypeView;
        this.f69647f = bogTextView;
        this.f69648g = bogButton;
        this.f69649h = imageView;
        this.f69650i = c8Var;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:8:0x002c, code lost:
        r0 = p366bk.C10322k.f28730Ex;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static p90.C27408r1 m84934a(android.view.View r9) {
        /*
            int r0 = p366bk.C10322k.amount_view
            android.view.View r1 = p086g1.C6202b.m24689a(r9, r0)
            r4 = r1
            ge.bog.mobilebank.ui.views.widgets.TextTypeView r4 = (p341ge.bog.mobilebank.p975ui.views.widgets.TextTypeView) r4
            if (r4 == 0) goto L_0x0042
            int r0 = p366bk.C10322k.merchant_name
            android.view.View r1 = p086g1.C6202b.m24689a(r9, r0)
            r5 = r1
            ge.bog.mobilebank.ui.views.widgets.BogTextView r5 = (p341ge.bog.mobilebank.p975ui.views.widgets.BogTextView) r5
            if (r5 == 0) goto L_0x0042
            int r0 = p366bk.C10322k.f28889ro
            android.view.View r1 = p086g1.C6202b.m24689a(r9, r0)
            r6 = r1
            ge.bog.mobilebank.ui.views.widgets.BogButton r6 = (p341ge.bog.mobilebank.p975ui.views.widgets.BogButton) r6
            if (r6 == 0) goto L_0x0042
            int r0 = p366bk.C10322k.qr_icon
            android.view.View r1 = p086g1.C6202b.m24689a(r9, r0)
            r7 = r1
            android.widget.ImageView r7 = (android.widget.ImageView) r7
            if (r7 == 0) goto L_0x0042
            int r0 = p366bk.C10322k.f28730Ex
            android.view.View r1 = p086g1.C6202b.m24689a(r9, r0)
            if (r1 == 0) goto L_0x0042
            p90.c8 r8 = p90.C27272c8.m84388a(r1)
            p90.r1 r0 = new p90.r1
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
        throw new UnsupportedOperationException("Method not decompiled: p90.C27408r1.m84934a(android.view.View):p90.r1");
    }

    /* renamed from: d */
    public static C27408r1 m84935d(LayoutInflater layoutInflater) {
        return m84936e(layoutInflater, (ViewGroup) null, false);
    }

    /* renamed from: e */
    public static C27408r1 m84936e(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(C10324m.activity_qr_pay, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return m84934a(inflate);
    }

    /* renamed from: c */
    public LinearLayout mo3946b() {
        return this.f69645d;
    }
}
