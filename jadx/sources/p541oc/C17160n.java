package p541oc;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import p086g1.C6201a;
import p485kc.C16347e;
import p485kc.C16348f;

/* renamed from: oc.n */
public final class C17160n implements C6201a {

    /* renamed from: d */
    private final RelativeLayout f48102d;

    /* renamed from: e */
    public final RelativeLayout f48103e;

    /* renamed from: f */
    public final ImageView f48104f;

    /* renamed from: g */
    public final ImageView f48105g;

    /* renamed from: h */
    public final TextView f48106h;

    /* renamed from: i */
    public final TextView f48107i;

    /* renamed from: j */
    public final TextView f48108j;

    /* renamed from: k */
    public final TextView f48109k;

    /* renamed from: l */
    public final TextView f48110l;

    /* renamed from: m */
    public final TextView f48111m;

    /* renamed from: n */
    public final ImageView f48112n;

    private C17160n(RelativeLayout relativeLayout, RelativeLayout relativeLayout2, ImageView imageView, ImageView imageView2, TextView textView, TextView textView2, TextView textView3, TextView textView4, TextView textView5, TextView textView6, ImageView imageView3) {
        this.f48102d = relativeLayout;
        this.f48103e = relativeLayout2;
        this.f48104f = imageView;
        this.f48105g = imageView2;
        this.f48106h = textView;
        this.f48107i = textView2;
        this.f48108j = textView3;
        this.f48109k = textView4;
        this.f48110l = textView5;
        this.f48111m = textView6;
        this.f48112n = imageView3;
    }

    /* renamed from: a */
    public static C17160n m60288a(View view) {
        int i = C16347e.f46188e;
        RelativeLayout relativeLayout = (RelativeLayout) view.findViewById(i);
        if (relativeLayout != null) {
            i = C16347e.neutral_face_icon_view;
            ImageView imageView = (ImageView) view.findViewById(i);
            if (imageView != null) {
                i = C16347e.neutral_face_icon_view_2;
                ImageView imageView2 = (ImageView) view.findViewById(i);
                if (imageView2 != null) {
                    i = C16347e.ready_button;
                    TextView textView = (TextView) view.findViewById(i);
                    if (textView != null) {
                        i = C16347e.record_begin_section_1;
                        TextView textView2 = (TextView) view.findViewById(i);
                        if (textView2 != null) {
                            i = C16347e.record_begin_section_2;
                            TextView textView3 = (TextView) view.findViewById(i);
                            if (textView3 != null) {
                                i = C16347e.record_begin_section_3;
                                TextView textView4 = (TextView) view.findViewById(i);
                                if (textView4 != null) {
                                    i = C16347e.record_begin_title;
                                    TextView textView5 = (TextView) view.findViewById(i);
                                    if (textView5 != null) {
                                        i = C16347e.record_instructions;
                                        TextView textView6 = (TextView) view.findViewById(i);
                                        if (textView6 != null) {
                                            i = C16347e.smile_face_icon_view;
                                            ImageView imageView3 = (ImageView) view.findViewById(i);
                                            if (imageView3 != null) {
                                                return new C17160n((RelativeLayout) view, relativeLayout, imageView, imageView2, textView, textView2, textView3, textView4, textView5, textView6, imageView3);
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
    public static C17160n m60289d(LayoutInflater layoutInflater) {
        return m60290e(layoutInflater, (ViewGroup) null, false);
    }

    /* renamed from: e */
    public static C17160n m60290e(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(C16348f.fragment_liveness_info, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return m60288a(inflate);
    }

    /* renamed from: c */
    public RelativeLayout mo3946b() {
        return this.f48102d;
    }
}
