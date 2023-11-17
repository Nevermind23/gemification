package iy0;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import hy0.C36271e;
import hy0.C36272f;
import p086g1.C6201a;
import p086g1.C6202b;

/* renamed from: iy0.w1 */
public final class C36646w1 implements C6201a {

    /* renamed from: d */
    private final ConstraintLayout f88450d;

    /* renamed from: e */
    public final TextView f88451e;

    /* renamed from: f */
    public final TextView f88452f;

    private C36646w1(ConstraintLayout constraintLayout, TextView textView, TextView textView2) {
        this.f88450d = constraintLayout;
        this.f88451e = textView;
        this.f88452f = textView2;
    }

    /* renamed from: a */
    public static C36646w1 m108719a(View view) {
        int i = C36271e.item_label;
        TextView textView = (TextView) C6202b.m24689a(view, i);
        if (textView != null) {
            i = C36271e.item_value;
            TextView textView2 = (TextView) C6202b.m24689a(view, i);
            if (textView2 != null) {
                return new C36646w1((ConstraintLayout) view, textView, textView2);
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    /* renamed from: d */
    public static C36646w1 m108720d(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(C36272f.item_view_accordion_expanded, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return m108719a(inflate);
    }

    /* renamed from: c */
    public ConstraintLayout mo3946b() {
        return this.f88450d;
    }
}
