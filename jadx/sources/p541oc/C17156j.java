package p541oc;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.identomat.subfragments.views.HoldDocumentView;
import com.otaliastudios.cameraview.CameraView;
import p086g1.C6201a;
import p485kc.C16347e;
import p485kc.C16348f;

/* renamed from: oc.j */
public final class C17156j implements C6201a {

    /* renamed from: d */
    private final RelativeLayout f48061d;

    /* renamed from: e */
    public final ImageView f48062e;

    /* renamed from: f */
    public final TextView f48063f;

    /* renamed from: g */
    public final CameraView f48064g;

    /* renamed from: h */
    public final HoldDocumentView f48065h;

    /* renamed from: i */
    public final RelativeLayout f48066i;

    /* renamed from: j */
    public final ImageView f48067j;

    /* renamed from: k */
    public final RelativeLayout f48068k;

    /* renamed from: l */
    public final TextView f48069l;

    private C17156j(RelativeLayout relativeLayout, ImageView imageView, TextView textView, CameraView cameraView, HoldDocumentView holdDocumentView, RelativeLayout relativeLayout2, ImageView imageView2, RelativeLayout relativeLayout3, TextView textView2) {
        this.f48061d = relativeLayout;
        this.f48062e = imageView;
        this.f48063f = textView;
        this.f48064g = cameraView;
        this.f48065h = holdDocumentView;
        this.f48066i = relativeLayout2;
        this.f48067j = imageView2;
        this.f48068k = relativeLayout3;
        this.f48069l = textView2;
    }

    /* renamed from: a */
    public static C17156j m60268a(View view) {
        int i = C16347e.f46191l;
        ImageView imageView = (ImageView) view.findViewById(i);
        if (imageView != null) {
            i = C16347e.back_button_title_view;
            TextView textView = (TextView) view.findViewById(i);
            if (textView != null) {
                i = C16347e.camera_view;
                CameraView cameraView = (CameraView) view.findViewById(i);
                if (cameraView != null) {
                    i = C16347e.face_view;
                    HoldDocumentView holdDocumentView = (HoldDocumentView) view.findViewById(i);
                    if (holdDocumentView != null) {
                        i = C16347e.face_view_holder;
                        RelativeLayout relativeLayout = (RelativeLayout) view.findViewById(i);
                        if (relativeLayout != null) {
                            i = C16347e.indicator_icon;
                            ImageView imageView2 = (ImageView) view.findViewById(i);
                            if (imageView2 != null) {
                                i = C16347e.indicator_view;
                                RelativeLayout relativeLayout2 = (RelativeLayout) view.findViewById(i);
                                if (relativeLayout2 != null) {
                                    i = C16347e.progress_text_view;
                                    TextView textView2 = (TextView) view.findViewById(i);
                                    if (textView2 != null) {
                                        return new C17156j((RelativeLayout) view, imageView, textView, cameraView, holdDocumentView, relativeLayout, imageView2, relativeLayout2, textView2);
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
    public static C17156j m60269d(LayoutInflater layoutInflater) {
        return m60270e(layoutInflater, (ViewGroup) null, false);
    }

    /* renamed from: e */
    public static C17156j m60270e(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(C16348f.fragment_hold_document, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return m60268a(inflate);
    }

    /* renamed from: c */
    public RelativeLayout mo3946b() {
        return this.f48061d;
    }
}
