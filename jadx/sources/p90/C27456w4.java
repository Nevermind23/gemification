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

/* renamed from: p90.w4 */
public final class C27456w4 implements C6201a {

    /* renamed from: d */
    private final ConstraintLayout f70171d;

    /* renamed from: e */
    public final TextView f70172e;

    /* renamed from: f */
    public final TextView f70173f;

    /* renamed from: g */
    public final ImageView f70174g;

    /* renamed from: h */
    public final ImageView f70175h;

    private C27456w4(ConstraintLayout constraintLayout, TextView textView, TextView textView2, ImageView imageView, ImageView imageView2) {
        this.f70171d = constraintLayout;
        this.f70172e = textView;
        this.f70173f = textView2;
        this.f70174g = imageView;
        this.f70175h = imageView2;
    }

    /* renamed from: a */
    public static C27456w4 m85131a(View view) {
        int i = C10322k.f28916zn;
        TextView textView = (TextView) C6202b.m24689a(view, i);
        if (textView != null) {
            i = C10322k.operation_description_text;
            TextView textView2 = (TextView) C6202b.m24689a(view, i);
            if (textView2 != null) {
                i = C10322k.operation_icon_image;
                ImageView imageView = (ImageView) C6202b.m24689a(view, i);
                if (imageView != null) {
                    i = C10322k.x_badge_image;
                    ImageView imageView2 = (ImageView) C6202b.m24689a(view, i);
                    if (imageView2 != null) {
                        return new C27456w4((ConstraintLayout) view, textView, textView2, imageView, imageView2);
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    /* renamed from: d */
    public static C27456w4 m85132d(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(C10324m.item_bill_split_operation_horizontal, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return m85131a(inflate);
    }

    /* renamed from: c */
    public ConstraintLayout mo3946b() {
        return this.f70171d;
    }
}
