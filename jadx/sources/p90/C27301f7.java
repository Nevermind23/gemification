package p90;

import android.view.View;
import android.widget.LinearLayout;
import p086g1.C6201a;
import p086g1.C6202b;
import p341ge.bog.mobilebank.p975ui.views.widgets.BogTextView;
import p366bk.C10322k;

/* renamed from: p90.f7 */
public final class C27301f7 implements C6201a {

    /* renamed from: d */
    private final LinearLayout f68736d;

    /* renamed from: e */
    public final BogTextView f68737e;

    private C27301f7(LinearLayout linearLayout, BogTextView bogTextView) {
        this.f68736d = linearLayout;
        this.f68737e = bogTextView;
    }

    /* renamed from: a */
    public static C27301f7 m84509a(View view) {
        int i = C10322k.noDataText;
        BogTextView bogTextView = (BogTextView) C6202b.m24689a(view, i);
        if (bogTextView != null) {
            return new C27301f7((LinearLayout) view, bogTextView);
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    /* renamed from: c */
    public LinearLayout mo3946b() {
        return this.f68736d;
    }
}
