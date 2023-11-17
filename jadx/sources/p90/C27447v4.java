package p90;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import p086g1.C6201a;
import p086g1.C6202b;
import p366bk.C10322k;
import p366bk.C10324m;

/* renamed from: p90.v4 */
public final class C27447v4 implements C6201a {

    /* renamed from: d */
    private final ConstraintLayout f70086d;

    /* renamed from: e */
    public final TextView f70087e;

    /* renamed from: f */
    public final ImageView f70088f;

    private C27447v4(ConstraintLayout constraintLayout, TextView textView, ImageView imageView) {
        this.f70086d = constraintLayout;
        this.f70087e = textView;
        this.f70088f = imageView;
    }

    /* renamed from: a */
    public static C27447v4 m85097a(View view) {
        int i = C10322k.operation_description_text;
        TextView textView = (TextView) C6202b.m24689a(view, i);
        if (textView != null) {
            i = C10322k.operation_icon_image;
            ImageView imageView = (ImageView) C6202b.m24689a(view, i);
            if (imageView != null) {
                return new C27447v4((ConstraintLayout) view, textView, imageView);
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    /* renamed from: d */
    public static C27447v4 m85098d(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(C10324m.item_bill_split_operation_add_cash, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return m85097a(inflate);
    }

    /* renamed from: c */
    public ConstraintLayout mo3946b() {
        return this.f70086d;
    }
}
