package p541oc;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ProgressBar;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.fragment.app.FragmentContainerView;
import com.identomat.subfragments.views.FaceView;
import com.identomat.subfragments.views.LoadingView;
import com.otaliastudios.cameraview.CameraView;
import p086g1.C6201a;
import p485kc.C16347e;
import p485kc.C16348f;

/* renamed from: oc.m */
public final class C17159m implements C6201a {

    /* renamed from: d */
    private final RelativeLayout f48082d;

    /* renamed from: e */
    public final ImageView f48083e;

    /* renamed from: f */
    public final TextView f48084f;

    /* renamed from: g */
    public final CameraView f48085g;

    /* renamed from: h */
    public final FaceView f48086h;

    /* renamed from: i */
    public final RelativeLayout f48087i;

    /* renamed from: j */
    public final ImageView f48088j;

    /* renamed from: k */
    public final RelativeLayout f48089k;

    /* renamed from: l */
    public final FragmentContainerView f48090l;

    /* renamed from: m */
    public final RelativeLayout f48091m;

    /* renamed from: n */
    public final ImageView f48092n;

    /* renamed from: o */
    public final TextView f48093o;

    /* renamed from: p */
    public final FragmentContainerView f48094p;

    /* renamed from: q */
    public final RelativeLayout f48095q;

    /* renamed from: r */
    public final TextView f48096r;

    /* renamed from: s */
    public final LinearLayout f48097s;

    /* renamed from: t */
    public final LoadingView f48098t;

    /* renamed from: u */
    public final TextView f48099u;

    /* renamed from: v */
    public final TextView f48100v;

    /* renamed from: w */
    public final ProgressBar f48101w;

    private C17159m(RelativeLayout relativeLayout, ImageView imageView, TextView textView, CameraView cameraView, FaceView faceView, RelativeLayout relativeLayout2, ImageView imageView2, RelativeLayout relativeLayout3, FragmentContainerView fragmentContainerView, RelativeLayout relativeLayout4, ImageView imageView3, TextView textView2, FragmentContainerView fragmentContainerView2, RelativeLayout relativeLayout5, TextView textView3, LinearLayout linearLayout, LoadingView loadingView, TextView textView4, TextView textView5, ProgressBar progressBar) {
        this.f48082d = relativeLayout;
        this.f48083e = imageView;
        this.f48084f = textView;
        this.f48085g = cameraView;
        this.f48086h = faceView;
        this.f48087i = relativeLayout2;
        this.f48088j = imageView2;
        this.f48089k = relativeLayout3;
        this.f48090l = fragmentContainerView;
        this.f48091m = relativeLayout4;
        this.f48092n = imageView3;
        this.f48093o = textView2;
        this.f48094p = fragmentContainerView2;
        this.f48095q = relativeLayout5;
        this.f48096r = textView3;
        this.f48097s = linearLayout;
        this.f48098t = loadingView;
        this.f48099u = textView4;
        this.f48100v = textView5;
        this.f48101w = progressBar;
    }

    /* renamed from: a */
    public static C17159m m60283a(View view) {
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
                                    i = C16347e.liveness_info_container;
                                    FragmentContainerView fragmentContainerView = (FragmentContainerView) view2.findViewById(i);
                                    if (fragmentContainerView != null) {
                                        i = C16347e.liveness_instructions_2;
                                        RelativeLayout relativeLayout3 = (RelativeLayout) view2.findViewById(i);
                                        if (relativeLayout3 != null) {
                                            i = C16347e.liveness_instructions_2_image_view;
                                            ImageView imageView3 = (ImageView) view2.findViewById(i);
                                            if (imageView3 != null) {
                                                i = C16347e.liveness_instructions_2_text_view;
                                                TextView textView2 = (TextView) view2.findViewById(i);
                                                if (textView2 != null) {
                                                    i = C16347e.liveness_instructions_container;
                                                    FragmentContainerView fragmentContainerView2 = (FragmentContainerView) view2.findViewById(i);
                                                    if (fragmentContainerView2 != null) {
                                                        i = C16347e.loading_panel;
                                                        RelativeLayout relativeLayout4 = (RelativeLayout) view2.findViewById(i);
                                                        if (relativeLayout4 != null) {
                                                            i = C16347e.loading_text_view;
                                                            TextView textView3 = (TextView) view2.findViewById(i);
                                                            if (textView3 != null) {
                                                                i = C16347e.f46193n0;
                                                                LinearLayout linearLayout = (LinearLayout) view2.findViewById(i);
                                                                if (linearLayout != null) {
                                                                    i = C16347e.loading_view_icon;
                                                                    LoadingView loadingView = (LoadingView) view2.findViewById(i);
                                                                    if (loadingView != null) {
                                                                        i = C16347e.progress_text_view;
                                                                        TextView textView4 = (TextView) view2.findViewById(i);
                                                                        if (textView4 != null) {
                                                                            i = C16347e.title_view;
                                                                            TextView textView5 = (TextView) view2.findViewById(i);
                                                                            if (textView5 != null) {
                                                                                i = C16347e.video_progress;
                                                                                ProgressBar progressBar = (ProgressBar) view2.findViewById(i);
                                                                                if (progressBar != null) {
                                                                                    return new C17159m((RelativeLayout) view2, imageView, textView, cameraView, faceView, relativeLayout, imageView2, relativeLayout2, fragmentContainerView, relativeLayout3, imageView3, textView2, fragmentContainerView2, relativeLayout4, textView3, linearLayout, loadingView, textView4, textView5, progressBar);
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
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    /* renamed from: d */
    public static C17159m m60284d(LayoutInflater layoutInflater) {
        return m60285e(layoutInflater, (ViewGroup) null, false);
    }

    /* renamed from: e */
    public static C17159m m60285e(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(C16348f.fragment_liveness, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return m60283a(inflate);
    }

    /* renamed from: c */
    public RelativeLayout mo3946b() {
        return this.f48082d;
    }
}
