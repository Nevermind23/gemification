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
import androidx.constraintlayout.widget.Group;
import com.identomat.subfragments.views.LoadingView;
import com.otaliastudios.cameraview.CameraView;
import p086g1.C6201a;
import p485kc.C16347e;
import p485kc.C16348f;

/* renamed from: oc.b */
public final class C17148b implements C6201a {

    /* renamed from: d */
    private final ConstraintLayout f47966d;

    /* renamed from: e */
    public final Group f47967e;

    /* renamed from: f */
    public final ImageView f47968f;

    /* renamed from: g */
    public final TextView f47969g;

    /* renamed from: h */
    public final RelativeLayout f47970h;

    /* renamed from: i */
    public final CameraView f47971i;

    /* renamed from: j */
    public final FrameLayout f47972j;

    /* renamed from: k */
    public final ImageView f47973k;

    /* renamed from: l */
    public final LinearLayout f47974l;

    /* renamed from: m */
    public final RelativeLayout f47975m;

    /* renamed from: n */
    public final TextView f47976n;

    /* renamed from: o */
    public final LinearLayout f47977o;

    /* renamed from: p */
    public final LoadingView f47978p;

    /* renamed from: q */
    public final TextView f47979q;

    /* renamed from: r */
    public final TextView f47980r;

    private C17148b(ConstraintLayout constraintLayout, Group group, ImageView imageView, TextView textView, RelativeLayout relativeLayout, CameraView cameraView, FrameLayout frameLayout, ImageView imageView2, LinearLayout linearLayout, RelativeLayout relativeLayout2, TextView textView2, LinearLayout linearLayout2, LoadingView loadingView, TextView textView3, TextView textView4) {
        this.f47966d = constraintLayout;
        this.f47967e = group;
        this.f47968f = imageView;
        this.f47969g = textView;
        this.f47970h = relativeLayout;
        this.f47971i = cameraView;
        this.f47972j = frameLayout;
        this.f47973k = imageView2;
        this.f47974l = linearLayout;
        this.f47975m = relativeLayout2;
        this.f47976n = textView2;
        this.f47977o = linearLayout2;
        this.f47978p = loadingView;
        this.f47979q = textView3;
        this.f47980r = textView4;
    }

    /* renamed from: a */
    public static C17148b m60229a(View view) {
        View view2 = view;
        int i = C16347e.all_toggle_group;
        Group group = (Group) view2.findViewById(i);
        if (group != null) {
            i = C16347e.f46191l;
            ImageView imageView = (ImageView) view2.findViewById(i);
            if (imageView != null) {
                i = C16347e.back_button_title_view;
                TextView textView = (TextView) view2.findViewById(i);
                if (textView != null) {
                    i = C16347e.camera_background;
                    RelativeLayout relativeLayout = (RelativeLayout) view2.findViewById(i);
                    if (relativeLayout != null) {
                        i = C16347e.camera_view;
                        CameraView cameraView = (CameraView) view2.findViewById(i);
                        if (cameraView != null) {
                            i = C16347e.cascading_start_fragment;
                            FrameLayout frameLayout = (FrameLayout) view2.findViewById(i);
                            if (frameLayout != null) {
                                i = C16347e.face_frame;
                                ImageView imageView2 = (ImageView) view2.findViewById(i);
                                if (imageView2 != null) {
                                    i = C16347e.f46189e0;
                                    LinearLayout linearLayout = (LinearLayout) view2.findViewById(i);
                                    if (linearLayout != null) {
                                        i = C16347e.loading_panel;
                                        RelativeLayout relativeLayout2 = (RelativeLayout) view2.findViewById(i);
                                        if (relativeLayout2 != null) {
                                            i = C16347e.loading_text_view;
                                            TextView textView2 = (TextView) view2.findViewById(i);
                                            if (textView2 != null) {
                                                i = C16347e.f46193n0;
                                                LinearLayout linearLayout2 = (LinearLayout) view2.findViewById(i);
                                                if (linearLayout2 != null) {
                                                    i = C16347e.loading_view_icon;
                                                    LoadingView loadingView = (LoadingView) view2.findViewById(i);
                                                    if (loadingView != null) {
                                                        i = C16347e.message_title;
                                                        TextView textView3 = (TextView) view2.findViewById(i);
                                                        if (textView3 != null) {
                                                            i = C16347e.message_view;
                                                            TextView textView4 = (TextView) view2.findViewById(i);
                                                            if (textView4 != null) {
                                                                return new C17148b((ConstraintLayout) view2, group, imageView, textView, relativeLayout, cameraView, frameLayout, imageView2, linearLayout, relativeLayout2, textView2, linearLayout2, loadingView, textView3, textView4);
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
    public static C17148b m60230d(LayoutInflater layoutInflater) {
        return m60231e(layoutInflater, (ViewGroup) null, false);
    }

    /* renamed from: e */
    public static C17148b m60231e(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(C16348f.cascading_fragment, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return m60229a(inflate);
    }

    /* renamed from: c */
    public ConstraintLayout mo3946b() {
        return this.f47966d;
    }
}
