package p90;

import android.view.View;
import android.widget.LinearLayout;
import android.widget.ScrollView;
import p086g1.C6201a;
import p086g1.C6202b;
import p366bk.C10322k;

/* renamed from: p90.m7 */
public final class C27369m7 implements C6201a {

    /* renamed from: d */
    private final ScrollView f69308d;

    /* renamed from: e */
    public final LinearLayout f69309e;

    private C27369m7(ScrollView scrollView, LinearLayout linearLayout) {
        this.f69308d = scrollView;
        this.f69309e = linearLayout;
    }

    /* renamed from: a */
    public static C27369m7 m84785a(View view) {
        int i = C10322k.loading_list;
        LinearLayout linearLayout = (LinearLayout) C6202b.m24689a(view, i);
        if (linearLayout != null) {
            return new C27369m7((ScrollView) view, linearLayout);
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    /* renamed from: c */
    public ScrollView mo3946b() {
        return this.f69308d;
    }
}
