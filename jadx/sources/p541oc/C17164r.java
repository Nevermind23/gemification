package p541oc;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.identomat.subfragments.views.DocumentView;
import com.otaliastudios.cameraview.CameraView;
import p086g1.C6201a;
import p485kc.C16347e;
import p485kc.C16348f;

/* renamed from: oc.r */
public final class C17164r implements C6201a {

    /* renamed from: d */
    private final RelativeLayout f48141d;

    /* renamed from: e */
    public final ImageView f48142e;

    /* renamed from: f */
    public final TextView f48143f;

    /* renamed from: g */
    public final CameraView f48144g;

    /* renamed from: h */
    public final ImageView f48145h;

    /* renamed from: i */
    public final DocumentView f48146i;

    /* renamed from: j */
    public final RelativeLayout f48147j;

    /* renamed from: k */
    public final ImageView f48148k;

    /* renamed from: l */
    public final RelativeLayout f48149l;

    /* renamed from: m */
    public final TextView f48150m;

    /* renamed from: n */
    public final TextView f48151n;

    /* renamed from: o */
    public final TextView f48152o;

    private C17164r(RelativeLayout relativeLayout, ImageView imageView, TextView textView, CameraView cameraView, ImageView imageView2, DocumentView documentView, RelativeLayout relativeLayout2, ImageView imageView3, RelativeLayout relativeLayout3, TextView textView2, TextView textView3, TextView textView4) {
        this.f48141d = relativeLayout;
        this.f48142e = imageView;
        this.f48143f = textView;
        this.f48144g = cameraView;
        this.f48145h = imageView2;
        this.f48146i = documentView;
        this.f48147j = relativeLayout2;
        this.f48148k = imageView3;
        this.f48149l = relativeLayout3;
        this.f48150m = textView2;
        this.f48151n = textView3;
        this.f48152o = textView4;
    }

    /* renamed from: a */
    public static C17164r m60308a(View view) {
        int i = C16347e.f46191l;
        ImageView imageView = (ImageView) view.findViewById(i);
        if (imageView != null) {
            i = C16347e.back_button_title_view;
            TextView textView = (TextView) view.findViewById(i);
            if (textView != null) {
                i = C16347e.camera_view;
                CameraView cameraView = (CameraView) view.findViewById(i);
                if (cameraView != null) {
                    i = C16347e.captured_preview;
                    ImageView imageView2 = (ImageView) view.findViewById(i);
                    if (imageView2 != null) {
                        i = C16347e.document_view;
                        DocumentView documentView = (DocumentView) view.findViewById(i);
                        if (documentView != null) {
                            i = C16347e.document_view_holder;
                            RelativeLayout relativeLayout = (RelativeLayout) view.findViewById(i);
                            if (relativeLayout != null) {
                                i = C16347e.indicator_icon;
                                ImageView imageView3 = (ImageView) view.findViewById(i);
                                if (imageView3 != null) {
                                    i = C16347e.indicator_view;
                                    RelativeLayout relativeLayout2 = (RelativeLayout) view.findViewById(i);
                                    if (relativeLayout2 != null) {
                                        i = C16347e.progress_text_view;
                                        TextView textView2 = (TextView) view.findViewById(i);
                                        if (textView2 != null) {
                                            i = C16347e.size_text_view;
                                            TextView textView3 = (TextView) view.findViewById(i);
                                            if (textView3 != null) {
                                                i = C16347e.title_view;
                                                TextView textView4 = (TextView) view.findViewById(i);
                                                if (textView4 != null) {
                                                    return new C17164r((RelativeLayout) view, imageView, textView, cameraView, imageView2, documentView, relativeLayout, imageView3, relativeLayout2, textView2, textView3, textView4);
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
    public static C17164r m60309d(LayoutInflater layoutInflater) {
        return m60310e(layoutInflater, (ViewGroup) null, false);
    }

    /* renamed from: e */
    public static C17164r m60310e(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(C16348f.fragment_scan_document, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return m60308a(inflate);
    }

    /* renamed from: c */
    public RelativeLayout mo3946b() {
        return this.f48141d;
    }
}
