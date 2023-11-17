package p541oc;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.Guideline;
import p086g1.C6201a;
import p485kc.C16347e;
import p485kc.C16348f;

/* renamed from: oc.g */
public final class C17153g implements C6201a {

    /* renamed from: d */
    private final ConstraintLayout f48015d;

    /* renamed from: e */
    public final Guideline f48016e;

    /* renamed from: f */
    public final TextView f48017f;

    /* renamed from: g */
    public final FrameLayout f48018g;

    /* renamed from: h */
    public final ImageView f48019h;

    /* renamed from: i */
    public final ImageView f48020i;

    /* renamed from: j */
    public final ImageView f48021j;

    /* renamed from: k */
    public final TextView f48022k;

    /* renamed from: l */
    public final RelativeLayout f48023l;

    /* renamed from: m */
    public final TextView f48024m;

    /* renamed from: n */
    public final Guideline f48025n;

    /* renamed from: o */
    public final TextView f48026o;

    /* renamed from: p */
    public final TextView f48027p;

    /* renamed from: q */
    public final TextView f48028q;

    /* renamed from: r */
    public final LinearLayout f48029r;

    private C17153g(ConstraintLayout constraintLayout, Guideline guideline, TextView textView, FrameLayout frameLayout, ImageView imageView, ImageView imageView2, ImageView imageView3, TextView textView2, RelativeLayout relativeLayout, TextView textView3, Guideline guideline2, TextView textView4, TextView textView5, TextView textView6, LinearLayout linearLayout) {
        this.f48015d = constraintLayout;
        this.f48016e = guideline;
        this.f48017f = textView;
        this.f48018g = frameLayout;
        this.f48019h = imageView;
        this.f48020i = imageView2;
        this.f48021j = imageView3;
        this.f48022k = textView2;
        this.f48023l = relativeLayout;
        this.f48024m = textView3;
        this.f48025n = guideline2;
        this.f48026o = textView4;
        this.f48027p = textView5;
        this.f48028q = textView6;
        this.f48029r = linearLayout;
    }

    /* renamed from: a */
    public static C17153g m60253a(View view) {
        View view2 = view;
        int i = C16347e.bottom_guide;
        Guideline guideline = (Guideline) view2.findViewById(i);
        if (guideline != null) {
            i = C16347e.instruction_text_view;
            TextView textView = (TextView) view2.findViewById(i);
            if (textView != null) {
                i = C16347e.instruction_view;
                FrameLayout frameLayout = (FrameLayout) view2.findViewById(i);
                if (frameLayout != null) {
                    i = C16347e.iv_face_arrow;
                    ImageView imageView = (ImageView) view2.findViewById(i);
                    if (imageView != null) {
                        i = C16347e.iv_face_neutral;
                        ImageView imageView2 = (ImageView) view2.findViewById(i);
                        if (imageView2 != null) {
                            i = C16347e.iv_face_smile;
                            ImageView imageView3 = (ImageView) view2.findViewById(i);
                            if (imageView3 != null) {
                                i = C16347e.ready_text_view;
                                TextView textView2 = (TextView) view2.findViewById(i);
                                if (textView2 != null) {
                                    i = C16347e.start_button;
                                    RelativeLayout relativeLayout = (RelativeLayout) view2.findViewById(i);
                                    if (relativeLayout != null) {
                                        i = C16347e.title_text_view;
                                        TextView textView3 = (TextView) view2.findViewById(i);
                                        if (textView3 != null) {
                                            i = C16347e.top_guide;
                                            Guideline guideline2 = (Guideline) view2.findViewById(i);
                                            if (guideline2 != null) {
                                                i = C16347e.tvInstructions1;
                                                TextView textView4 = (TextView) view2.findViewById(i);
                                                if (textView4 != null) {
                                                    i = C16347e.tvInstructions2;
                                                    TextView textView5 = (TextView) view2.findViewById(i);
                                                    if (textView5 != null) {
                                                        i = C16347e.tvInstructionsTitle;
                                                        TextView textView6 = (TextView) view2.findViewById(i);
                                                        if (textView6 != null) {
                                                            i = C16347e.view_instructions_text;
                                                            LinearLayout linearLayout = (LinearLayout) view2.findViewById(i);
                                                            if (linearLayout != null) {
                                                                return new C17153g((ConstraintLayout) view2, guideline, textView, frameLayout, imageView, imageView2, imageView3, textView2, relativeLayout, textView3, guideline2, textView4, textView5, textView6, linearLayout);
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
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    /* renamed from: d */
    public static C17153g m60254d(LayoutInflater layoutInflater) {
        return m60255e(layoutInflater, (ViewGroup) null, false);
    }

    /* renamed from: e */
    public static C17153g m60255e(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(C16348f.fragment_cascading_start_panel, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return m60253a(inflate);
    }

    /* renamed from: c */
    public ConstraintLayout mo3946b() {
        return this.f48015d;
    }
}
