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

/* renamed from: oc.e */
public final class C17151e implements C6201a {

    /* renamed from: d */
    private final RelativeLayout f47999d;

    /* renamed from: e */
    public final ImageView f48000e;

    /* renamed from: f */
    public final ImageView f48001f;

    /* renamed from: g */
    public final TextView f48002g;

    /* renamed from: h */
    public final RelativeLayout f48003h;

    /* renamed from: i */
    public final TextView f48004i;

    /* renamed from: j */
    public final LinearLayout f48005j;

    /* renamed from: k */
    public final TextView f48006k;

    /* renamed from: l */
    public final TextView f48007l;

    /* renamed from: m */
    public final RelativeLayout f48008m;

    /* renamed from: n */
    public final TextView f48009n;

    private C17151e(RelativeLayout relativeLayout, ImageView imageView, ImageView imageView2, TextView textView, RelativeLayout relativeLayout2, TextView textView2, LinearLayout linearLayout, TextView textView3, TextView textView4, RelativeLayout relativeLayout3, TextView textView5) {
        this.f47999d = relativeLayout;
        this.f48000e = imageView;
        this.f48001f = imageView2;
        this.f48002g = textView;
        this.f48003h = relativeLayout2;
        this.f48004i = textView2;
        this.f48005j = linearLayout;
        this.f48006k = textView3;
        this.f48007l = textView4;
        this.f48008m = relativeLayout3;
        this.f48009n = textView5;
    }

    /* renamed from: a */
    public static C17151e m60244a(View view) {
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
                                                return new C17151e((RelativeLayout) view, imageView, imageView2, textView, relativeLayout, textView2, linearLayout, textView3, textView4, relativeLayout2, textView5);
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
    public static C17151e m60245d(LayoutInflater layoutInflater) {
        return m60246e(layoutInflater, (ViewGroup) null, false);
    }

    /* renamed from: e */
    public static C17151e m60246e(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(C16348f.fragment_camera_deny, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return m60244a(inflate);
    }

    /* renamed from: c */
    public RelativeLayout mo3946b() {
        return this.f47999d;
    }
}
