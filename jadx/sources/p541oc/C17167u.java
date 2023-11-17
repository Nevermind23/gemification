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

/* renamed from: oc.u */
public final class C17167u implements C6201a {

    /* renamed from: d */
    private final RelativeLayout f48165d;

    /* renamed from: e */
    public final RelativeLayout f48166e;

    /* renamed from: f */
    public final TextView f48167f;

    /* renamed from: g */
    public final RelativeLayout f48168g;

    /* renamed from: h */
    public final TextView f48169h;

    /* renamed from: i */
    public final ImageView f48170i;

    /* renamed from: j */
    public final LinearLayout f48171j;

    /* renamed from: k */
    public final ImageView f48172k;

    /* renamed from: l */
    public final TextView f48173l;

    private C17167u(RelativeLayout relativeLayout, RelativeLayout relativeLayout2, TextView textView, RelativeLayout relativeLayout3, TextView textView2, ImageView imageView, LinearLayout linearLayout, ImageView imageView2, TextView textView3) {
        this.f48165d = relativeLayout;
        this.f48166e = relativeLayout2;
        this.f48167f = textView;
        this.f48168g = relativeLayout3;
        this.f48169h = textView2;
        this.f48170i = imageView;
        this.f48171j = linearLayout;
        this.f48172k = imageView2;
        this.f48173l = textView3;
    }

    /* renamed from: a */
    public static C17167u m60323a(View view) {
        int i = C16347e.again_button;
        RelativeLayout relativeLayout = (RelativeLayout) view.findViewById(i);
        if (relativeLayout != null) {
            i = C16347e.again_button_text_view;
            TextView textView = (TextView) view.findViewById(i);
            if (textView != null) {
                i = C16347e.f46181B;
                RelativeLayout relativeLayout2 = (RelativeLayout) view.findViewById(i);
                if (relativeLayout2 != null) {
                    i = C16347e.continue_button_text_view;
                    TextView textView2 = (TextView) view.findViewById(i);
                    if (textView2 != null) {
                        i = C16347e.image_preview_view;
                        ImageView imageView = (ImageView) view.findViewById(i);
                        if (imageView != null) {
                            i = C16347e.main_panel;
                            LinearLayout linearLayout = (LinearLayout) view.findViewById(i);
                            if (linearLayout != null) {
                                i = C16347e.result_icon_view;
                                ImageView imageView2 = (ImageView) view.findViewById(i);
                                if (imageView2 != null) {
                                    i = C16347e.result_message_view;
                                    TextView textView3 = (TextView) view.findViewById(i);
                                    if (textView3 != null) {
                                        return new C17167u((RelativeLayout) view, relativeLayout, textView, relativeLayout2, textView2, imageView, linearLayout, imageView2, textView3);
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
    public static C17167u m60324d(LayoutInflater layoutInflater) {
        return m60325e(layoutInflater, (ViewGroup) null, false);
    }

    /* renamed from: e */
    public static C17167u m60325e(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(C16348f.fragment_upload_result, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return m60323a(inflate);
    }

    /* renamed from: c */
    public RelativeLayout mo3946b() {
        return this.f48165d;
    }
}
