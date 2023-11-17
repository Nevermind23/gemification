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

/* renamed from: p90.r5 */
public final class C27412r5 implements C6201a {

    /* renamed from: d */
    private final ConstraintLayout f69689d;

    /* renamed from: e */
    public final TextView f69690e;

    /* renamed from: f */
    public final TextView f69691f;

    /* renamed from: g */
    public final ImageView f69692g;

    private C27412r5(ConstraintLayout constraintLayout, TextView textView, TextView textView2, ImageView imageView) {
        this.f69689d = constraintLayout;
        this.f69690e = textView;
        this.f69691f = textView2;
        this.f69692g = imageView;
    }

    /* renamed from: a */
    public static C27412r5 m84954a(View view) {
        int i = C10322k.f28871n1;
        TextView textView = (TextView) C6202b.m24689a(view, i);
        if (textView != null) {
            i = C10322k.operation_description_text;
            TextView textView2 = (TextView) C6202b.m24689a(view, i);
            if (textView2 != null) {
                i = C10322k.operation_icon_image;
                ImageView imageView = (ImageView) C6202b.m24689a(view, i);
                if (imageView != null) {
                    return new C27412r5((ConstraintLayout) view, textView, textView2, imageView);
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    /* renamed from: d */
    public static C27412r5 m84955d(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(C10324m.item_money_request_details_bill_split_operation, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return m84954a(inflate);
    }

    /* renamed from: c */
    public ConstraintLayout mo3946b() {
        return this.f69689d;
    }
}
