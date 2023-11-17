package sp0;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import np0.C37440f;
import p086g1.C6201a;

/* renamed from: sp0.r */
public final class C38499r implements C6201a {

    /* renamed from: d */
    private final LinearLayout f92267d;

    /* renamed from: e */
    public final TextView f92268e;

    /* renamed from: f */
    public final TextView f92269f;

    /* renamed from: g */
    public final View f92270g;

    private C38499r(LinearLayout linearLayout, TextView textView, TextView textView2, View view) {
        this.f92267d = linearLayout;
        this.f92268e = textView;
        this.f92269f = textView2;
        this.f92270g = view;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:4:0x0014, code lost:
        r0 = np0.C37439e.f89978C;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static sp0.C38499r m113010a(android.view.View r4) {
        /*
            int r0 = np0.C37439e.detail_label
            android.view.View r1 = p086g1.C6202b.m24689a(r4, r0)
            android.widget.TextView r1 = (android.widget.TextView) r1
            if (r1 == 0) goto L_0x0024
            int r0 = np0.C37439e.detail_value
            android.view.View r2 = p086g1.C6202b.m24689a(r4, r0)
            android.widget.TextView r2 = (android.widget.TextView) r2
            if (r2 == 0) goto L_0x0024
            int r0 = np0.C37439e.f89978C
            android.view.View r3 = p086g1.C6202b.m24689a(r4, r0)
            if (r3 == 0) goto L_0x0024
            sp0.r r0 = new sp0.r
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
        throw new UnsupportedOperationException("Method not decompiled: sp0.C38499r.m113010a(android.view.View):sp0.r");
    }

    /* renamed from: d */
    public static C38499r m113011d(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(C37440f.item_activation_result_detail, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return m113010a(inflate);
    }

    /* renamed from: c */
    public LinearLayout mo3946b() {
        return this.f92267d;
    }
}
