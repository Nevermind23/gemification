package p90;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ScrollView;
import android.widget.TextView;
import p086g1.C6201a;
import p366bk.C10324m;

/* renamed from: p90.i7 */
public final class C27331i7 implements C6201a {

    /* renamed from: d */
    private final ScrollView f68994d;

    /* renamed from: e */
    public final LinearLayout f68995e;

    /* renamed from: f */
    public final View f68996f;

    /* renamed from: g */
    public final LinearLayout f68997g;

    /* renamed from: h */
    public final View f68998h;

    /* renamed from: i */
    public final ImageView f68999i;

    /* renamed from: j */
    public final TextView f69000j;

    private C27331i7(ScrollView scrollView, LinearLayout linearLayout, View view, LinearLayout linearLayout2, View view2, ImageView imageView, TextView textView) {
        this.f68994d = scrollView;
        this.f68995e = linearLayout;
        this.f68996f = view;
        this.f68997g = linearLayout2;
        this.f68998h = view2;
        this.f68999i = imageView;
        this.f69000j = textView;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:2:0x000b, code lost:
        r0 = p366bk.C10322k.bottomDivider;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:6:0x001e, code lost:
        r0 = p366bk.C10322k.f28734Fu;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static p90.C27331i7 m84633a(android.view.View r10) {
        /*
            int r0 = p366bk.C10322k.actionButtonContainer
            android.view.View r1 = p086g1.C6202b.m24689a(r10, r0)
            r4 = r1
            android.widget.LinearLayout r4 = (android.widget.LinearLayout) r4
            if (r4 == 0) goto L_0x0046
            int r0 = p366bk.C10322k.bottomDivider
            android.view.View r5 = p086g1.C6202b.m24689a(r10, r0)
            if (r5 == 0) goto L_0x0046
            int r0 = p366bk.C10322k.detailsContainer
            android.view.View r1 = p086g1.C6202b.m24689a(r10, r0)
            r6 = r1
            android.widget.LinearLayout r6 = (android.widget.LinearLayout) r6
            if (r6 == 0) goto L_0x0046
            int r0 = p366bk.C10322k.f28734Fu
            android.view.View r7 = p086g1.C6202b.m24689a(r10, r0)
            if (r7 == 0) goto L_0x0046
            int r0 = p366bk.C10322k.successIcon
            android.view.View r1 = p086g1.C6202b.m24689a(r10, r0)
            r8 = r1
            android.widget.ImageView r8 = (android.widget.ImageView) r8
            if (r8 == 0) goto L_0x0046
            int r0 = p366bk.C10322k.successTitle
            android.view.View r1 = p086g1.C6202b.m24689a(r10, r0)
            r9 = r1
            android.widget.TextView r9 = (android.widget.TextView) r9
            if (r9 == 0) goto L_0x0046
            p90.i7 r0 = new p90.i7
            r3 = r10
            android.widget.ScrollView r3 = (android.widget.ScrollView) r3
            r2 = r0
            r2.<init>(r3, r4, r5, r6, r7, r8, r9)
            return r0
        L_0x0046:
            android.content.res.Resources r10 = r10.getResources()
            java.lang.String r10 = r10.getResourceName(r0)
            java.lang.NullPointerException r0 = new java.lang.NullPointerException
            java.lang.String r1 = "Missing required view with ID: "
            java.lang.String r10 = r1.concat(r10)
            r0.<init>(r10)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: p90.C27331i7.m84633a(android.view.View):p90.i7");
    }

    /* renamed from: d */
    public static C27331i7 m84634d(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(C10324m.layout_success_screen, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return m84633a(inflate);
    }

    /* renamed from: c */
    public ScrollView mo3946b() {
        return this.f68994d;
    }
}
