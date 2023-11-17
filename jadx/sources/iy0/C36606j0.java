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

/* renamed from: iy0.j0 */
public final class C36606j0 implements C6201a {

    /* renamed from: d */
    private final ConstraintLayout f88283d;

    /* renamed from: e */
    public final ImageView f88284e;

    /* renamed from: f */
    public final TextView f88285f;

    /* renamed from: g */
    public final TextView f88286g;

    private C36606j0(ConstraintLayout constraintLayout, ImageView imageView, TextView textView, TextView textView2) {
        this.f88283d = constraintLayout;
        this.f88284e = imageView;
        this.f88285f = textView;
        this.f88286g = textView2;
    }

    /* renamed from: a */
    public static C36606j0 m108554a(View view) {
        int i = C36271e.f87491J;
        ImageView imageView = (ImageView) C6202b.m24689a(view, i);
        if (imageView != null) {
            i = C36271e.f87508a0;
            TextView textView = (TextView) C6202b.m24689a(view, i);
            if (textView != null) {
                i = C36271e.deposit_name;
                TextView textView2 = (TextView) C6202b.m24689a(view, i);
                if (textView2 != null) {
                    return new C36606j0((ConstraintLayout) view, imageView, textView, textView2);
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    /* renamed from: d */
    public static C36606j0 m108555d(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(C36272f.item_account_linked_deposit, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return m108554a(inflate);
    }

    /* renamed from: c */
    public ConstraintLayout mo3946b() {
        return this.f88283d;
    }
}
