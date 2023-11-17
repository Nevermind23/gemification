package ev0;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import bv0.C31204d;
import bv0.C31205e;
import p086g1.C6201a;
import p086g1.C6202b;

/* renamed from: ev0.e0 */
public final class C31824e0 implements C6201a {

    /* renamed from: d */
    private final LinearLayout f78481d;

    /* renamed from: e */
    public final TextView f78482e;

    /* renamed from: f */
    public final ImageView f78483f;

    private C31824e0(LinearLayout linearLayout, TextView textView, ImageView imageView) {
        this.f78481d = linearLayout;
        this.f78482e = textView;
        this.f78483f = imageView;
    }

    /* renamed from: a */
    public static C31824e0 m94084a(View view) {
        int i = C31204d.f77529d;
        TextView textView = (TextView) C6202b.m24689a(view, i);
        if (textView != null) {
            i = C31204d.bank_logo;
            ImageView imageView = (ImageView) C6202b.m24689a(view, i);
            if (imageView != null) {
                return new C31824e0((LinearLayout) view, textView, imageView);
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    /* renamed from: d */
    public static C31824e0 m94085d(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(C31205e.item_total_amount, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return m94084a(inflate);
    }

    /* renamed from: c */
    public LinearLayout mo3946b() {
        return this.f78481d;
    }
}
