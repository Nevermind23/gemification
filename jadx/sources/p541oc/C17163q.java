package p541oc;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import p086g1.C6201a;
import p485kc.C16347e;
import p485kc.C16348f;

/* renamed from: oc.q */
public final class C17163q implements C6201a {

    /* renamed from: d */
    private final RelativeLayout f48130d;

    /* renamed from: e */
    public final ImageView f48131e;

    /* renamed from: f */
    public final ImageView f48132f;

    /* renamed from: g */
    public final TextView f48133g;

    /* renamed from: h */
    public final RelativeLayout f48134h;

    /* renamed from: i */
    public final TextView f48135i;

    /* renamed from: j */
    public final LinearLayout f48136j;

    /* renamed from: k */
    public final TextView f48137k;

    /* renamed from: l */
    public final TextView f48138l;

    /* renamed from: m */
    public final RelativeLayout f48139m;

    /* renamed from: n */
    public final TextView f48140n;

    private C17163q(RelativeLayout relativeLayout, ImageView imageView, ImageView imageView2, TextView textView, RelativeLayout relativeLayout2, TextView textView2, LinearLayout linearLayout, TextView textView3, TextView textView4, RelativeLayout relativeLayout3, TextView textView5) {
        this.f48130d = relativeLayout;
        this.f48131e = imageView;
        this.f48132f = imageView2;
        this.f48133g = textView;
        this.f48134h = relativeLayout2;
        this.f48135i = textView2;
        this.f48136j = linearLayout;
        this.f48137k = textView3;
        this.f48138l = textView4;
        this.f48139m = relativeLayout3;
        this.f48140n = textView5;
    }

    /* renamed from: a */
    public static C17163q m60303a(View view) {
        int i = C16347e.again_image_view;
        ImageView imageView = (ImageView) view.findViewById(i);
        if (imageView != null) {
            i = C16347e.f46191l;
            ImageView imageView2 = (ImageView) view.findViewById(i);
            if (imageView2 != null) {
                i = C16347e.back_button_title_view;
                TextView textView = (TextView) view.findViewById(i);
                if (textView != null) {
                    i = C16347e.f46194s;
                    RelativeLayout relativeLayout = (RelativeLayout) view.findViewById(i);
                    if (relativeLayout != null) {
                        i = C16347e.cancel_button_text;
                        TextView textView2 = (TextView) view.findViewById(i);
                        if (textView2 != null) {
                            i = C16347e.main_panel;
                            LinearLayout linearLayout = (LinearLayout) view.findViewById(i);
                            if (linearLayout != null) {
                                i = C16347e.record_begin_title;
                                TextView textView3 = (TextView) view.findViewById(i);
                                if (textView3 != null) {
                                    i = C16347e.record_instructions;
                                    TextView textView4 = (TextView) view.findViewById(i);
                                    if (textView4 != null) {
                                        i = C16347e.f46185T0;
                                        RelativeLayout relativeLayout2 = (RelativeLayout) view.findViewById(i);
                                        if (relativeLayout2 != null) {
                                            i = C16347e.retry_button_text;
                                            TextView textView5 = (TextView) view.findViewById(i);
                                            if (textView5 != null) {
                                                return new C17163q((RelativeLayout) view, imageView, imageView2, textView, relativeLayout, textView2, linearLayout, textView3, textView4, relativeLayout2, textView5);
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    /* renamed from: d */
    public static C17163q m60304d(LayoutInflater layoutInflater) {
        return m60305e(layoutInflater, (ViewGroup) null, false);
    }

    /* renamed from: e */
    public static C17163q m60305e(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(C16348f.fragment_retry_identomat, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return m60303a(inflate);
    }

    /* renamed from: c */
    public RelativeLayout mo3946b() {
        return this.f48130d;
    }
}
