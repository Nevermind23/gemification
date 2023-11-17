package p352ak;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import p086g1.C6201a;
import p086g1.C6202b;
import p601sg.C17782g;
import p601sg.C17783h;

/* renamed from: ak.b3 */
public final class C9879b3 implements C6201a {

    /* renamed from: d */
    private final View f26808d;

    /* renamed from: e */
    public final ImageView f26809e;

    /* renamed from: f */
    public final TextView f26810f;

    private C9879b3(View view, ImageView imageView, TextView textView) {
        this.f26808d = view;
        this.f26809e = imageView;
        this.f26810f = textView;
    }

    /* renamed from: a */
    public static C9879b3 m36236a(View view) {
        int i = C17782g.f49766j4;
        ImageView imageView = (ImageView) C6202b.m24689a(view, i);
        if (imageView != null) {
            i = C17782g.f49751c9;
            TextView textView = (TextView) C6202b.m24689a(view, i);
            if (textView != null) {
                return new C9879b3(view, imageView, textView);
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    /* renamed from: c */
    public static C9879b3 m36237c(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        if (viewGroup != null) {
            layoutInflater.inflate(C17783h.view_deposit_feature, viewGroup);
            return m36236a(viewGroup);
        }
        throw new NullPointerException("parent");
    }

    /* renamed from: b */
    public View mo3946b() {
        return this.f26808d;
    }
}
