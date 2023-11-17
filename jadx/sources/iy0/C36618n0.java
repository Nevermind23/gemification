package iy0;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import hy0.C36271e;
import hy0.C36272f;
import p086g1.C6201a;
import p086g1.C6202b;

/* renamed from: iy0.n0 */
public final class C36618n0 implements C6201a {

    /* renamed from: d */
    private final ConstraintLayout f88335d;

    /* renamed from: e */
    public final TextView f88336e;

    /* renamed from: f */
    public final ImageView f88337f;

    /* renamed from: g */
    public final TextView f88338g;

    private C36618n0(ConstraintLayout constraintLayout, TextView textView, ImageView imageView, TextView textView2) {
        this.f88335d = constraintLayout;
        this.f88336e = textView;
        this.f88337f = imageView;
        this.f88338g = textView2;
    }

    /* renamed from: a */
    public static C36618n0 m108606a(View view) {
        int i = C36271e.f87527k;
        TextView textView = (TextView) C6202b.m24689a(view, i);
        if (textView != null) {
            i = C36271e.f87491J;
            ImageView imageView = (ImageView) C6202b.m24689a(view, i);
            if (imageView != null) {
                i = C36271e.f87547t1;
                TextView textView2 = (TextView) C6202b.m24689a(view, i);
                if (textView2 != null) {
                    return new C36618n0((ConstraintLayout) view, textView, imageView, textView2);
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    /* renamed from: d */
    public static C36618n0 m108607d(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(C36272f.item_account_linked_money_box, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return m108606a(inflate);
    }

    /* renamed from: c */
    public ConstraintLayout mo3946b() {
        return this.f88335d;
    }
}
