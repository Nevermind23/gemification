package sp0;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import np0.C37440f;
import p086g1.C6201a;

/* renamed from: sp0.s */
public final class C38500s implements C6201a {

    /* renamed from: d */
    private final LinearLayout f92271d;

    /* renamed from: e */
    public final TextView f92272e;

    /* renamed from: f */
    public final TextView f92273f;

    /* renamed from: g */
    public final View f92274g;

    /* renamed from: h */
    public final ImageView f92275h;

    /* renamed from: i */
    public final LinearLayout f92276i;

    /* renamed from: j */
    public final LinearLayout f92277j;

    /* renamed from: k */
    public final TextView f92278k;

    /* renamed from: l */
    public final TextView f92279l;

    /* renamed from: m */
    public final TextView f92280m;

    private C38500s(LinearLayout linearLayout, TextView textView, TextView textView2, View view, ImageView imageView, LinearLayout linearLayout2, LinearLayout linearLayout3, TextView textView3, TextView textView4, TextView textView5) {
        this.f92271d = linearLayout;
        this.f92272e = textView;
        this.f92273f = textView2;
        this.f92274g = view;
        this.f92275h = imageView;
        this.f92276i = linearLayout2;
        this.f92277j = linearLayout3;
        this.f92278k = textView3;
        this.f92279l = textView4;
        this.f92280m = textView5;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:4:0x0016, code lost:
        r0 = np0.C37439e.f89978C;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static sp0.C38500s m113014a(android.view.View r13) {
        /*
            int r0 = np0.C37439e.desc_tv
            android.view.View r1 = p086g1.C6202b.m24689a(r13, r0)
            r4 = r1
            android.widget.TextView r4 = (android.widget.TextView) r4
            if (r4 == 0) goto L_0x006a
            int r0 = np0.C37439e.desc_tv_reverse
            android.view.View r1 = p086g1.C6202b.m24689a(r13, r0)
            r5 = r1
            android.widget.TextView r5 = (android.widget.TextView) r5
            if (r5 == 0) goto L_0x006a
            int r0 = np0.C37439e.f89978C
            android.view.View r6 = p086g1.C6202b.m24689a(r13, r0)
            if (r6 == 0) goto L_0x006a
            int r0 = np0.C37439e.f89991Q
            android.view.View r1 = p086g1.C6202b.m24689a(r13, r0)
            r7 = r1
            android.widget.ImageView r7 = (android.widget.ImageView) r7
            if (r7 == 0) goto L_0x006a
            int r0 = np0.C37439e.reverse_text_group
            android.view.View r1 = p086g1.C6202b.m24689a(r13, r0)
            r8 = r1
            android.widget.LinearLayout r8 = (android.widget.LinearLayout) r8
            if (r8 == 0) goto L_0x006a
            int r0 = np0.C37439e.f89993W0
            android.view.View r1 = p086g1.C6202b.m24689a(r13, r0)
            r9 = r1
            android.widget.LinearLayout r9 = (android.widget.LinearLayout) r9
            if (r9 == 0) goto L_0x006a
            int r0 = np0.C37439e.f89994X0
            android.view.View r1 = p086g1.C6202b.m24689a(r13, r0)
            r10 = r1
            android.widget.TextView r10 = (android.widget.TextView) r10
            if (r10 == 0) goto L_0x006a
            int r0 = np0.C37439e.title_tv_reverse
            android.view.View r1 = p086g1.C6202b.m24689a(r13, r0)
            r11 = r1
            android.widget.TextView r11 = (android.widget.TextView) r11
            if (r11 == 0) goto L_0x006a
            int r0 = np0.C37439e.f89998a1
            android.view.View r1 = p086g1.C6202b.m24689a(r13, r0)
            r12 = r1
            android.widget.TextView r12 = (android.widget.TextView) r12
            if (r12 == 0) goto L_0x006a
            sp0.s r0 = new sp0.s
            r3 = r13
            android.widget.LinearLayout r3 = (android.widget.LinearLayout) r3
            r2 = r0
            r2.<init>(r3, r4, r5, r6, r7, r8, r9, r10, r11, r12)
            return r0
        L_0x006a:
            android.content.res.Resources r13 = r13.getResources()
            java.lang.String r13 = r13.getResourceName(r0)
            java.lang.NullPointerException r0 = new java.lang.NullPointerException
            java.lang.String r1 = "Missing required view with ID: "
            java.lang.String r13 = r1.concat(r13)
            r0.<init>(r13)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: sp0.C38500s.m113014a(android.view.View):sp0.s");
    }

    /* renamed from: d */
    public static C38500s m113015d(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(C37440f.item_detail, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return m113014a(inflate);
    }

    /* renamed from: c */
    public LinearLayout mo3946b() {
        return this.f92271d;
    }
}
