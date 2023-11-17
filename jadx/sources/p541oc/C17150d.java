package p541oc;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.ProgressBar;
import android.widget.RelativeLayout;
import android.widget.TextView;
import org.webrtc.SurfaceViewRenderer;
import p086g1.C6201a;
import p485kc.C16347e;
import p485kc.C16348f;

/* renamed from: oc.d */
public final class C17150d implements C6201a {

    /* renamed from: d */
    private final RelativeLayout f47992d;

    /* renamed from: e */
    public final ImageView f47993e;

    /* renamed from: f */
    public final TextView f47994f;

    /* renamed from: g */
    public final RelativeLayout f47995g;

    /* renamed from: h */
    public final ImageButton f47996h;

    /* renamed from: i */
    public final SurfaceViewRenderer f47997i;

    /* renamed from: j */
    public final ProgressBar f47998j;

    private C17150d(RelativeLayout relativeLayout, ImageView imageView, TextView textView, RelativeLayout relativeLayout2, ImageButton imageButton, SurfaceViewRenderer surfaceViewRenderer, ProgressBar progressBar) {
        this.f47992d = relativeLayout;
        this.f47993e = imageView;
        this.f47994f = textView;
        this.f47995g = relativeLayout2;
        this.f47996h = imageButton;
        this.f47997i = surfaceViewRenderer;
        this.f47998j = progressBar;
    }

    /* renamed from: a */
    public static C17150d m60239a(View view) {
        int i = C16347e.f46191l;
        ImageView imageView = (ImageView) view.findViewById(i);
        if (imageView != null) {
            i = C16347e.back_button_title_view;
            TextView textView = (TextView) view.findViewById(i);
            if (textView != null) {
                i = C16347e.dark_view;
                RelativeLayout relativeLayout = (RelativeLayout) view.findViewById(i);
                if (relativeLayout != null) {
                    i = C16347e.end_call_view;
                    ImageButton imageButton = (ImageButton) view.findViewById(i);
                    if (imageButton != null) {
                        i = C16347e.local_renderer;
                        SurfaceViewRenderer surfaceViewRenderer = (SurfaceViewRenderer) view.findViewById(i);
                        if (surfaceViewRenderer != null) {
                            i = C16347e.f46182F0;
                            ProgressBar progressBar = (ProgressBar) view.findViewById(i);
                            if (progressBar != null) {
                                return new C17150d((RelativeLayout) view, imageView, textView, relativeLayout, imageButton, surfaceViewRenderer, progressBar);
                            }
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    /* renamed from: d */
    public static C17150d m60240d(LayoutInflater layoutInflater) {
        return m60241e(layoutInflater, (ViewGroup) null, false);
    }

    /* renamed from: e */
    public static C17150d m60241e(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(C16348f.fragment_call_identomat, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return m60239a(inflate);
    }

    /* renamed from: c */
    public RelativeLayout mo3946b() {
        return this.f47992d;
    }
}
