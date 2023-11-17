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

/* renamed from: ak.r5 */
public final class C10007r5 implements C6201a {

    /* renamed from: d */
    private final LinearLayout f27483d;

    /* renamed from: e */
    public final TextView f27484e;

    /* renamed from: f */
    public final LinearLayout f27485f;

    /* renamed from: g */
    public final ImageView f27486g;

    /* renamed from: h */
    public final TextView f27487h;

    private C10007r5(LinearLayout linearLayout, TextView textView, LinearLayout linearLayout2, ImageView imageView, TextView textView2) {
        this.f27483d = linearLayout;
        this.f27484e = textView;
        this.f27485f = linearLayout2;
        this.f27486g = imageView;
        this.f27487h = textView2;
    }

    /* renamed from: a */
    public static C10007r5 m36703a(View view) {
        int i = C17782g.f49703L;
        TextView textView = (TextView) C6202b.m24689a(view, i);
        if (textView != null) {
            LinearLayout linearLayout = (LinearLayout) view;
            i = C17782g.f49766j4;
            ImageView imageView = (ImageView) C6202b.m24689a(view, i);
            if (imageView != null) {
                i = C17782g.f49751c9;
                TextView textView2 = (TextView) C6202b.m24689a(view, i);
                if (textView2 != null) {
                    return new C10007r5(linearLayout, textView, linearLayout, imageView, textView2);
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    /* renamed from: d */
    public static C10007r5 m36704d(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(C17783h.view_text_group, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return m36703a(inflate);
    }

    /* renamed from: c */
    public LinearLayout mo3946b() {
        return this.f27483d;
    }
}
