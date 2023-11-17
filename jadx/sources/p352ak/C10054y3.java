package p352ak;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import p086g1.C6201a;
import p086g1.C6202b;
import p601sg.C17782g;
import p601sg.C17783h;

/* renamed from: ak.y3 */
public final class C10054y3 implements C6201a {

    /* renamed from: d */
    private final ConstraintLayout f27774d;

    /* renamed from: e */
    public final TextView f27775e;

    /* renamed from: f */
    public final ImageView f27776f;

    /* renamed from: g */
    public final TextView f27777g;

    /* renamed from: h */
    public final TextView f27778h;

    private C10054y3(ConstraintLayout constraintLayout, TextView textView, ImageView imageView, TextView textView2, TextView textView3) {
        this.f27774d = constraintLayout;
        this.f27775e = textView;
        this.f27776f = imageView;
        this.f27777g = textView2;
        this.f27778h = textView3;
    }

    /* renamed from: a */
    public static C10054y3 m36877a(View view) {
        int i = C17782g.f49677C2;
        TextView textView = (TextView) C6202b.m24689a(view, i);
        if (textView != null) {
            i = C17782g.logo;
            ImageView imageView = (ImageView) C6202b.m24689a(view, i);
            if (imageView != null) {
                i = C17782g.f49816z8;
                TextView textView2 = (TextView) C6202b.m24689a(view, i);
                if (textView2 != null) {
                    i = C17782g.f49745Y8;
                    TextView textView3 = (TextView) C6202b.m24689a(view, i);
                    if (textView3 != null) {
                        return new C10054y3((ConstraintLayout) view, textView, imageView, textView2, textView3);
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    /* renamed from: d */
    public static C10054y3 m36878d(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(C17783h.view_loyalty_card, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return m36877a(inflate);
    }

    /* renamed from: c */
    public ConstraintLayout mo3946b() {
        return this.f27774d;
    }
}
