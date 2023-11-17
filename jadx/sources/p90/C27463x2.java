package p90;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import p086g1.C6201a;
import p086g1.C6202b;
import p341ge.bog.mobilebank.p975ui.views.widgets.BogTextView;
import p366bk.C10322k;
import p366bk.C10324m;

/* renamed from: p90.x2 */
public final class C27463x2 implements C6201a {

    /* renamed from: d */
    private final LinearLayout f70200d;

    /* renamed from: e */
    public final View f70201e;

    /* renamed from: f */
    public final BogTextView f70202f;

    /* renamed from: g */
    public final BogTextView f70203g;

    private C27463x2(LinearLayout linearLayout, View view, BogTextView bogTextView, BogTextView bogTextView2) {
        this.f70200d = linearLayout;
        this.f70201e = view;
        this.f70202f = bogTextView;
        this.f70203g = bogTextView2;
    }

    /* renamed from: a */
    public static C27463x2 m85159a(View view) {
        int i = C10322k.f28850jc;
        View a = C6202b.m24689a(view, i);
        if (a != null) {
            i = C10322k.first_line_tv;
            BogTextView bogTextView = (BogTextView) C6202b.m24689a(view, i);
            if (bogTextView != null) {
                i = C10322k.second_line_tv;
                BogTextView bogTextView2 = (BogTextView) C6202b.m24689a(view, i);
                if (bogTextView2 != null) {
                    return new C27463x2((LinearLayout) view, a, bogTextView, bogTextView2);
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    /* renamed from: d */
    public static C27463x2 m85160d(LayoutInflater layoutInflater) {
        return m85161e(layoutInflater, (ViewGroup) null, false);
    }

    /* renamed from: e */
    public static C27463x2 m85161e(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(C10324m.dialog_credit_card_choose, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return m85159a(inflate);
    }

    /* renamed from: c */
    public LinearLayout mo3946b() {
        return this.f70200d;
    }
}
