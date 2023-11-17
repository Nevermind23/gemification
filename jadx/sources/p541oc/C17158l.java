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

/* renamed from: oc.l */
public final class C17158l implements C6201a {

    /* renamed from: d */
    private final RelativeLayout f48073d;

    /* renamed from: e */
    public final ImageView f48074e;

    /* renamed from: f */
    public final LinearLayout f48075f;

    /* renamed from: g */
    public final TextView f48076g;

    /* renamed from: h */
    public final TextView f48077h;

    /* renamed from: i */
    public final TextView f48078i;

    /* renamed from: j */
    public final TextView f48079j;

    /* renamed from: k */
    public final RelativeLayout f48080k;

    /* renamed from: l */
    public final TextView f48081l;

    private C17158l(RelativeLayout relativeLayout, ImageView imageView, LinearLayout linearLayout, TextView textView, TextView textView2, TextView textView3, TextView textView4, RelativeLayout relativeLayout2, TextView textView5) {
        this.f48073d = relativeLayout;
        this.f48074e = imageView;
        this.f48075f = linearLayout;
        this.f48076g = textView;
        this.f48077h = textView2;
        this.f48078i = textView3;
        this.f48079j = textView4;
        this.f48080k = relativeLayout2;
        this.f48081l = textView5;
    }

    /* renamed from: a */
    public static C17158l m60278a(View view) {
        int i = C16347e.again_image_view;
        ImageView imageView = (ImageView) view.findViewById(i);
        if (imageView != null) {
            i = C16347e.main_panel;
            LinearLayout linearLayout = (LinearLayout) view.findViewById(i);
            if (linearLayout != null) {
                i = C16347e.record_begin_section_1;
                TextView textView = (TextView) view.findViewById(i);
                if (textView != null) {
                    i = C16347e.record_begin_section_2;
                    TextView textView2 = (TextView) view.findViewById(i);
                    if (textView2 != null) {
                        i = C16347e.record_begin_title;
                        TextView textView3 = (TextView) view.findViewById(i);
                        if (textView3 != null) {
                            i = C16347e.record_instructions;
                            TextView textView4 = (TextView) view.findViewById(i);
                            if (textView4 != null) {
                                i = C16347e.f46185T0;
                                RelativeLayout relativeLayout = (RelativeLayout) view.findViewById(i);
                                if (relativeLayout != null) {
                                    i = C16347e.retry_button_text;
                                    TextView textView5 = (TextView) view.findViewById(i);
                                    if (textView5 != null) {
                                        return new C17158l((RelativeLayout) view, imageView, linearLayout, textView, textView2, textView3, textView4, relativeLayout, textView5);
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
    public static C17158l m60279d(LayoutInflater layoutInflater) {
        return m60280e(layoutInflater, (ViewGroup) null, false);
    }

    /* renamed from: e */
    public static C17158l m60280e(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(C16348f.fragment_liveness_again, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return m60278a(inflate);
    }

    /* renamed from: c */
    public RelativeLayout mo3946b() {
        return this.f48073d;
    }
}
