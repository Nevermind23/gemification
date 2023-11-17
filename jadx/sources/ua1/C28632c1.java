package ua1;

import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import ba1.C10216u;
import p086g1.C6201a;
import p086g1.C6202b;

/* renamed from: ua1.c1 */
public final class C28632c1 implements C6201a {

    /* renamed from: d */
    private final LinearLayout f72692d;

    /* renamed from: e */
    public final ImageView f72693e;

    /* renamed from: f */
    public final ImageView f72694f;

    private C28632c1(LinearLayout linearLayout, ImageView imageView, ImageView imageView2) {
        this.f72692d = linearLayout;
        this.f72693e = imageView;
        this.f72694f = imageView2;
    }

    /* renamed from: a */
    public static C28632c1 m87625a(View view) {
        int i = C10216u.change_contact_info_button;
        ImageView imageView = (ImageView) C6202b.m24689a(view, i);
        if (imageView != null) {
            i = C10216u.ic_favorite;
            ImageView imageView2 = (ImageView) C6202b.m24689a(view, i);
            if (imageView2 != null) {
                return new C28632c1((LinearLayout) view, imageView, imageView2);
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    /* renamed from: c */
    public LinearLayout mo3946b() {
        return this.f72692d;
    }
}
