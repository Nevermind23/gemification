package iy0;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import hy0.C36271e;
import hy0.C36272f;
import p086g1.C6201a;
import p086g1.C6202b;

/* renamed from: iy0.u1 */
public final class C36640u1 implements C6201a {

    /* renamed from: d */
    private final LinearLayout f88436d;

    /* renamed from: e */
    public final TextView f88437e;

    /* renamed from: f */
    public final TextView f88438f;

    private C36640u1(LinearLayout linearLayout, TextView textView, TextView textView2) {
        this.f88436d = linearLayout;
        this.f88437e = textView;
        this.f88438f = textView2;
    }

    /* renamed from: a */
    public static C36640u1 m108695a(View view) {
        int i = C36271e.f87527k;
        TextView textView = (TextView) C6202b.m24689a(view, i);
        if (textView != null) {
            i = C36271e.total_amount_title;
            TextView textView2 = (TextView) C6202b.m24689a(view, i);
            if (textView2 != null) {
                return new C36640u1((LinearLayout) view, textView, textView2);
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    /* renamed from: d */
    public static C36640u1 m108696d(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(C36272f.item_product_total_amount, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return m108695a(inflate);
    }

    /* renamed from: c */
    public LinearLayout mo3946b() {
        return this.f88436d;
    }
}
