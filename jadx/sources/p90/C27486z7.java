package p90;

import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import p086g1.C6201a;
import p086g1.C6202b;
import p366bk.C10322k;

/* renamed from: p90.z7 */
public final class C27486z7 implements C6201a {

    /* renamed from: d */
    private final LinearLayout f70363d;

    /* renamed from: e */
    public final ImageView f70364e;

    private C27486z7(LinearLayout linearLayout, ImageView imageView) {
        this.f70363d = linearLayout;
        this.f70364e = imageView;
    }

    /* renamed from: a */
    public static C27486z7 m85250a(View view) {
        int i = C10322k.retry_button_refresh_img;
        ImageView imageView = (ImageView) C6202b.m24689a(view, i);
        if (imageView != null) {
            return new C27486z7((LinearLayout) view, imageView);
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    /* renamed from: c */
    public LinearLayout mo3946b() {
        return this.f70363d;
    }
}
