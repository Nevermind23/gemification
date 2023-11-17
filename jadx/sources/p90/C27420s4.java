package p90;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import p086g1.C6201a;
import p086g1.C6202b;
import p366bk.C10322k;
import p366bk.C10324m;

/* renamed from: p90.s4 */
public final class C27420s4 implements C6201a {

    /* renamed from: d */
    private final LinearLayout f69791d;

    /* renamed from: e */
    public final TextView f69792e;

    /* renamed from: f */
    public final TextView f69793f;

    private C27420s4(LinearLayout linearLayout, TextView textView, TextView textView2) {
        this.f69791d = linearLayout;
        this.f69792e = textView;
        this.f69793f = textView2;
    }

    /* renamed from: a */
    public static C27420s4 m84990a(View view) {
        int i = C10322k.f28894tj;
        TextView textView = (TextView) C6202b.m24689a(view, i);
        if (textView != null) {
            i = C10322k.f28852jt;
            TextView textView2 = (TextView) C6202b.m24689a(view, i);
            if (textView2 != null) {
                return new C27420s4((LinearLayout) view, textView, textView2);
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    /* renamed from: d */
    public static C27420s4 m84991d(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(C10324m.installment_accordion_item, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return m84990a(inflate);
    }

    /* renamed from: c */
    public LinearLayout mo3946b() {
        return this.f69791d;
    }
}
