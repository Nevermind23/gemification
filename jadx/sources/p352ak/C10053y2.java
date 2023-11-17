package p352ak;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import p086g1.C6201a;
import p086g1.C6202b;
import p601sg.C17782g;
import p601sg.C17783h;

/* renamed from: ak.y2 */
public final class C10053y2 implements C6201a {

    /* renamed from: d */
    private final LinearLayout f27771d;

    /* renamed from: e */
    public final TextView f27772e;

    /* renamed from: f */
    public final ImageView f27773f;

    private C10053y2(LinearLayout linearLayout, TextView textView, ImageView imageView) {
        this.f27771d = linearLayout;
        this.f27772e = textView;
        this.f27773f = imageView;
    }

    /* renamed from: a */
    public static C10053y2 m36873a(View view) {
        int i = C17782g.f49797u3;
        TextView textView = (TextView) C6202b.m24689a(view, i);
        if (textView != null) {
            i = C17782g.f49744Y3;
            ImageView imageView = (ImageView) C6202b.m24689a(view, i);
            if (imageView != null) {
                return new C10053y2((LinearLayout) view, textView, imageView);
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    /* renamed from: d */
    public static C10053y2 m36874d(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(C17783h.view_date_filter, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return m36873a(inflate);
    }

    /* renamed from: c */
    public LinearLayout mo3946b() {
        return this.f27771d;
    }
}
