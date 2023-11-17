package p352ak;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import p086g1.C6201a;
import p601sg.C17783h;

/* renamed from: ak.t2 */
public final class C10018t2 implements C6201a {

    /* renamed from: d */
    private final View f27579d;

    /* renamed from: e */
    public final TextView f27580e;

    /* renamed from: f */
    public final View f27581f;

    /* renamed from: g */
    public final View f27582g;

    private C10018t2(View view, TextView textView, View view2, View view3) {
        this.f27579d = view;
        this.f27580e = textView;
        this.f27581f = view2;
        this.f27582g = view3;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:2:0x000a, code lost:
        r0 = p601sg.C17782g.f49799u7;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:4:0x0012, code lost:
        r0 = p601sg.C17782g.f49712N8;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static p352ak.C10018t2 m36745a(android.view.View r4) {
        /*
            int r0 = p601sg.C17782g.badges_num_text
            android.view.View r1 = p086g1.C6202b.m24689a(r4, r0)
            android.widget.TextView r1 = (android.widget.TextView) r1
            if (r1 == 0) goto L_0x0020
            int r0 = p601sg.C17782g.f49799u7
            android.view.View r2 = p086g1.C6202b.m24689a(r4, r0)
            if (r2 == 0) goto L_0x0020
            int r0 = p601sg.C17782g.f49712N8
            android.view.View r3 = p086g1.C6202b.m24689a(r4, r0)
            if (r3 == 0) goto L_0x0020
            ak.t2 r0 = new ak.t2
            r0.<init>(r4, r1, r2, r3)
            return r0
        L_0x0020:
            android.content.res.Resources r4 = r4.getResources()
            java.lang.String r4 = r4.getResourceName(r0)
            java.lang.NullPointerException r0 = new java.lang.NullPointerException
            java.lang.String r1 = "Missing required view with ID: "
            java.lang.String r4 = r1.concat(r4)
            r0.<init>(r4)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: p352ak.C10018t2.m36745a(android.view.View):ak.t2");
    }

    /* renamed from: c */
    public static C10018t2 m36746c(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        if (viewGroup != null) {
            layoutInflater.inflate(C17783h.view_credit_card_count_badge, viewGroup);
            return m36745a(viewGroup);
        }
        throw new NullPointerException("parent");
    }

    /* renamed from: b */
    public View mo3946b() {
        return this.f27579d;
    }
}
