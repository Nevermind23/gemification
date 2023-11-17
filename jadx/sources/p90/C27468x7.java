package p90;

import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import p086g1.C6201a;
import p086g1.C6202b;
import p341ge.bog.mobilebank.p975ui.views.widgets.BogTextView;
import p366bk.C10322k;

/* renamed from: p90.x7 */
public final class C27468x7 implements C6201a {

    /* renamed from: d */
    private final LinearLayout f70238d;

    /* renamed from: e */
    public final ImageView f70239e;

    /* renamed from: f */
    public final BogTextView f70240f;

    private C27468x7(LinearLayout linearLayout, ImageView imageView, BogTextView bogTextView) {
        this.f70238d = linearLayout;
        this.f70239e = imageView;
        this.f70240f = bogTextView;
    }

    /* renamed from: a */
    public static C27468x7 m85179a(View view) {
        int i = C10322k.payment_details_header_image;
        ImageView imageView = (ImageView) C6202b.m24689a(view, i);
        if (imageView != null) {
            i = C10322k.payment_details_header_tv;
            BogTextView bogTextView = (BogTextView) C6202b.m24689a(view, i);
            if (bogTextView != null) {
                return new C27468x7((LinearLayout) view, imageView, bogTextView);
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    /* renamed from: c */
    public LinearLayout mo3946b() {
        return this.f70238d;
    }
}
