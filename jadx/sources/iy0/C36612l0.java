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

/* renamed from: iy0.l0 */
public final class C36612l0 implements C6201a {

    /* renamed from: d */
    private final ConstraintLayout f88318d;

    /* renamed from: e */
    public final ImageView f88319e;

    /* renamed from: f */
    public final TextView f88320f;

    /* renamed from: g */
    public final TextView f88321g;

    private C36612l0(ConstraintLayout constraintLayout, ImageView imageView, TextView textView, TextView textView2) {
        this.f88318d = constraintLayout;
        this.f88319e = imageView;
        this.f88320f = textView;
        this.f88321g = textView2;
    }

    /* renamed from: a */
    public static C36612l0 m108580a(View view) {
        int i = C36271e.f87491J;
        ImageView imageView = (ImageView) C6202b.m24689a(view, i);
        if (imageView != null) {
            i = C36271e.f87529k1;
            TextView textView = (TextView) C6202b.m24689a(view, i);
            if (textView != null) {
                i = C36271e.f87532l1;
                TextView textView2 = (TextView) C6202b.m24689a(view, i);
                if (textView2 != null) {
                    return new C36612l0((ConstraintLayout) view, imageView, textView, textView2);
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    /* renamed from: d */
    public static C36612l0 m108581d(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(C36272f.item_account_linked_loan, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return m108580a(inflate);
    }

    /* renamed from: c */
    public ConstraintLayout mo3946b() {
        return this.f88318d;
    }
}
