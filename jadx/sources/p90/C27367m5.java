package p90;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import p086g1.C6201a;
import p366bk.C10324m;

/* renamed from: p90.m5 */
public final class C27367m5 implements C6201a {

    /* renamed from: d */
    private final LinearLayout f69303d;

    /* renamed from: e */
    public final TextView f69304e;

    /* renamed from: f */
    public final TextView f69305f;

    /* renamed from: g */
    public final View f69306g;

    private C27367m5(LinearLayout linearLayout, TextView textView, TextView textView2, View view) {
        this.f69303d = linearLayout;
        this.f69304e = textView;
        this.f69305f = textView2;
        this.f69306g = view;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:4:0x0014, code lost:
        r0 = p366bk.C10322k.f28850jc;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static p90.C27367m5 m84777a(android.view.View r4) {
        /*
            int r0 = p366bk.C10322k.benef_desc_tv
            android.view.View r1 = p086g1.C6202b.m24689a(r4, r0)
            android.widget.TextView r1 = (android.widget.TextView) r1
            if (r1 == 0) goto L_0x0024
            int r0 = p366bk.C10322k.benef_title_tv
            android.view.View r2 = p086g1.C6202b.m24689a(r4, r0)
            android.widget.TextView r2 = (android.widget.TextView) r2
            if (r2 == 0) goto L_0x0024
            int r0 = p366bk.C10322k.f28850jc
            android.view.View r3 = p086g1.C6202b.m24689a(r4, r0)
            if (r3 == 0) goto L_0x0024
            p90.m5 r0 = new p90.m5
            android.widget.LinearLayout r4 = (android.widget.LinearLayout) r4
            r0.<init>(r4, r1, r2, r3)
            return r0
        L_0x0024:
            android.content.res.Resources r4 = r4.getResources()
            java.lang.String r4 = r4.getResourceName(r0)
            java.lang.NullPointerException r0 = new java.lang.NullPointerException
            java.lang.String r1 = "Missing required view with ID: "
            java.lang.String r4 = r1.concat(r4)
            r0.<init>(r4)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: p90.C27367m5.m84777a(android.view.View):p90.m5");
    }

    /* renamed from: d */
    public static C27367m5 m84778d(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(C10324m.item_credit_offer_application_benefit_detail, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return m84777a(inflate);
    }

    /* renamed from: c */
    public LinearLayout mo3946b() {
        return this.f69303d;
    }
}
