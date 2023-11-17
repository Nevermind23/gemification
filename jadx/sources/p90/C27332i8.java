package p90;

import android.view.View;
import android.widget.ImageView;
import p086g1.C6201a;

/* renamed from: p90.i8 */
public final class C27332i8 implements C6201a {

    /* renamed from: d */
    private final ImageView f69001d;

    /* renamed from: e */
    public final ImageView f69002e;

    private C27332i8(ImageView imageView, ImageView imageView2) {
        this.f69001d = imageView;
        this.f69002e = imageView2;
    }

    /* renamed from: a */
    public static C27332i8 m84637a(View view) {
        if (view != null) {
            ImageView imageView = (ImageView) view;
            return new C27332i8(imageView, imageView);
        }
        throw new NullPointerException("rootView");
    }

    /* renamed from: c */
    public ImageView mo3946b() {
        return this.f69001d;
    }
}
