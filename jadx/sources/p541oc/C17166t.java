package p541oc;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.fragment.app.FragmentContainerView;
import com.identomat.subfragments.views.LoadingView;
import p086g1.C6201a;
import p485kc.C16347e;
import p485kc.C16348f;

/* renamed from: oc.t */
public final class C17166t implements C6201a {

    /* renamed from: d */
    private final RelativeLayout f48156d;

    /* renamed from: e */
    public final ImageView f48157e;

    /* renamed from: f */
    public final TextView f48158f;

    /* renamed from: g */
    public final FragmentContainerView f48159g;

    /* renamed from: h */
    public final RelativeLayout f48160h;

    /* renamed from: i */
    public final TextView f48161i;

    /* renamed from: j */
    public final LinearLayout f48162j;

    /* renamed from: k */
    public final LoadingView f48163k;

    /* renamed from: l */
    public final ImageView f48164l;

    private C17166t(RelativeLayout relativeLayout, ImageView imageView, TextView textView, FragmentContainerView fragmentContainerView, RelativeLayout relativeLayout2, TextView textView2, LinearLayout linearLayout, LoadingView loadingView, ImageView imageView2) {
        this.f48156d = relativeLayout;
        this.f48157e = imageView;
        this.f48158f = textView;
        this.f48159g = fragmentContainerView;
        this.f48160h = relativeLayout2;
        this.f48161i = textView2;
        this.f48162j = linearLayout;
        this.f48163k = loadingView;
        this.f48164l = imageView2;
    }

    /* renamed from: a */
    public static C17166t m60318a(View view) {
        int i = C16347e.f46191l;
        ImageView imageView = (ImageView) view.findViewById(i);
        if (imageView != null) {
            i = C16347e.back_button_title_view;
            TextView textView = (TextView) view.findViewById(i);
            if (textView != null) {
                i = C16347e.f46183Q;
                FragmentContainerView fragmentContainerView = (FragmentContainerView) view.findViewById(i);
                if (fragmentContainerView != null) {
                    i = C16347e.loading_panel;
                    RelativeLayout relativeLayout = (RelativeLayout) view.findViewById(i);
                    if (relativeLayout != null) {
                        i = C16347e.loading_text_view;
                        TextView textView2 = (TextView) view.findViewById(i);
                        if (textView2 != null) {
                            i = C16347e.f46193n0;
                            LinearLayout linearLayout = (LinearLayout) view.findViewById(i);
                            if (linearLayout != null) {
                                i = C16347e.loading_view_icon;
                                LoadingView loadingView = (LoadingView) view.findViewById(i);
                                if (loadingView != null) {
                                    i = C16347e.upload_preview;
                                    ImageView imageView2 = (ImageView) view.findViewById(i);
                                    if (imageView2 != null) {
                                        return new C17166t((RelativeLayout) view, imageView, textView, fragmentContainerView, relativeLayout, textView2, linearLayout, loadingView, imageView2);
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
    public static C17166t m60319d(LayoutInflater layoutInflater) {
        return m60320e(layoutInflater, (ViewGroup) null, false);
    }

    /* renamed from: e */
    public static C17166t m60320e(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(C16348f.fragment_upload_document_identomat, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return m60318a(inflate);
    }

    /* renamed from: c */
    public RelativeLayout mo3946b() {
        return this.f48156d;
    }
}
