package p90;

import android.view.View;
import android.widget.LinearLayout;
import android.widget.ScrollView;
import p086g1.C6201a;
import p086g1.C6202b;
import p341ge.bog.mobilebank.p975ui.views.widgets.BogTextView;
import p366bk.C10322k;

/* renamed from: p90.n7 */
public final class C27378n7 implements C6201a {

    /* renamed from: d */
    private final ScrollView f69396d;

    /* renamed from: e */
    public final C27387o7 f69397e;

    /* renamed from: f */
    public final LinearLayout f69398f;

    /* renamed from: g */
    public final BogTextView f69399g;

    /* renamed from: h */
    public final BogTextView f69400h;

    private C27378n7(ScrollView scrollView, C27387o7 o7Var, LinearLayout linearLayout, BogTextView bogTextView, BogTextView bogTextView2) {
        this.f69396d = scrollView;
        this.f69397e = o7Var;
        this.f69398f = linearLayout;
        this.f69399g = bogTextView;
        this.f69400h = bogTextView2;
    }

    /* renamed from: a */
    public static C27378n7 m84818a(View view) {
        int i = C10322k.f28892sb;
        View a = C6202b.m24689a(view, i);
        if (a != null) {
            C27387o7 a2 = C27387o7.m84852a(a);
            i = C10322k.full_day_container;
            LinearLayout linearLayout = (LinearLayout) C6202b.m24689a(view, i);
            if (linearLayout != null) {
                i = C10322k.item_address;
                BogTextView bogTextView = (BogTextView) C6202b.m24689a(view, i);
                if (bogTextView != null) {
                    i = C10322k.item_availability;
                    BogTextView bogTextView2 = (BogTextView) C6202b.m24689a(view, i);
                    if (bogTextView2 != null) {
                        return new C27378n7((ScrollView) view, a2, linearLayout, bogTextView, bogTextView2);
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    /* renamed from: c */
    public ScrollView mo3946b() {
        return this.f69396d;
    }
}
