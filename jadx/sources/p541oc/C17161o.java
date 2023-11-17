package p541oc;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.identomat.subfragments.views.FaceView;
import com.identomat.subfragments.views.LoadingView;
import com.otaliastudios.cameraview.CameraView;
import p086g1.C6201a;
import p485kc.C16347e;
import p485kc.C16348f;

/* renamed from: oc.o */
public final class C17161o implements C6201a {

    /* renamed from: d */
    private final RelativeLayout f48113d;

    /* renamed from: e */
    public final ImageView f48114e;

    /* renamed from: f */
    public final TextView f48115f;

    /* renamed from: g */
    public final CameraView f48116g;

    /* renamed from: h */
    public final FaceView f48117h;

    /* renamed from: i */
    public final RelativeLayout f48118i;

    /* renamed from: j */
    public final ImageView f48119j;

    /* renamed from: k */
    public final RelativeLayout f48120k;

    /* renamed from: l */
    public final RelativeLayout f48121l;

    /* renamed from: m */
    public final TextView f48122m;

    /* renamed from: n */
    public final LinearLayout f48123n;

    /* renamed from: o */
    public final LoadingView f48124o;

    /* renamed from: p */
    public final TextView f48125p;

    /* renamed from: q */
    public final TextView f48126q;

    private C17161o(RelativeLayout relativeLayout, ImageView imageView, TextView textView, CameraView cameraView, FaceView faceView, RelativeLayout relativeLayout2, ImageView imageView2, RelativeLayout relativeLayout3, RelativeLayout relativeLayout4, TextView textView2, LinearLayout linearLayout, LoadingView loadingView, TextView textView3, TextView textView4) {
        this.f48113d = relativeLayout;
        this.f48114e = imageView;
        this.f48115f = textView;
        this.f48116g = cameraView;
        this.f48117h = faceView;
        this.f48118i = relativeLayout2;
        this.f48119j = imageView2;
        this.f48120k = relativeLayout3;
        this.f48121l = relativeLayout4;
        this.f48122m = textView2;
        this.f48123n = linearLayout;
        this.f48124o = loadingView;
        this.f48125p = textView3;
        this.f48126q = textView4;
    }

    /* renamed from: a */
    public static C17161o m60293a(View view) {
        View view2 = view;
        int i = C16347e.f46191l;
        ImageView imageView = (ImageView) view2.findViewById(i);
        if (imageView != null) {
            i = C16347e.back_button_title_view;
            TextView textView = (TextView) view2.findViewById(i);
            if (textView != null) {
                i = C16347e.camera_view;
                CameraView cameraView = (CameraView) view2.findViewById(i);
                if (cameraView != null) {
                    i = C16347e.face_view;
                    FaceView faceView = (FaceView) view2.findViewById(i);
                    if (faceView != null) {
                        i = C16347e.face_view_holder;
                        RelativeLayout relativeLayout = (RelativeLayout) view2.findViewById(i);
                        if (relativeLayout != null) {
                            i = C16347e.indicator_icon;
                            ImageView imageView2 = (ImageView) view2.findViewById(i);
                            if (imageView2 != null) {
                                i = C16347e.indicator_view;
                                RelativeLayout relativeLayout2 = (RelativeLayout) view2.findViewById(i);
                                if (relativeLayout2 != null) {
                                    i = C16347e.loading_panel;
                                    RelativeLayout relativeLayout3 = (RelativeLayout) view2.findViewById(i);
                                    if (relativeLayout3 != null) {
                                        i = C16347e.loading_text_view;
                                        TextView textView2 = (TextView) view2.findViewById(i);
                                        if (textView2 != null) {
                                            i = C16347e.f46193n0;
                                            LinearLayout linearLayout = (LinearLayout) view2.findViewById(i);
                                            if (linearLayout != null) {
                                                i = C16347e.loading_view_icon;
                                                LoadingView loadingView = (LoadingView) view2.findViewById(i);
                                                if (loadingView != null) {
                                                    i = C16347e.progress_text_view;
                                                    TextView textView3 = (TextView) view2.findViewById(i);
                                                    if (textView3 != null) {
                                                        i = C16347e.title_view;
                                                        TextView textView4 = (TextView) view2.findViewById(i);
                                                        if (textView4 != null) {
                                                            return new C17161o((RelativeLayout) view2, imageView, textView, cameraView, faceView, relativeLayout, imageView2, relativeLayout2, relativeLayout3, textView2, linearLayout, loadingView, textView3, textView4);
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
    public static C17161o m60294d(LayoutInflater layoutInflater) {
        return m60295e(layoutInflater, (ViewGroup) null, false);
    }

    /* renamed from: e */
    public static C17161o m60295e(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(C16348f.fragment_match_photo, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return m60293a(inflate);
    }

    /* renamed from: c */
    public RelativeLayout mo3946b() {
        return this.f48113d;
    }
}
