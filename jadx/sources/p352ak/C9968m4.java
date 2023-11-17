package p352ak;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.appcompat.widget.AppCompatTextView;
import com.airbnb.lottie.LottieAnimationView;
import p086g1.C6201a;
import p086g1.C6202b;
import p341ge.bog.designsystem.components.layersandshadows.LayerView;
import p601sg.C17782g;
import p601sg.C17783h;

/* renamed from: ak.m4 */
public final class C9968m4 implements C6201a {

    /* renamed from: d */
    private final View f27272d;

    /* renamed from: e */
    public final LayerView f27273e;

    /* renamed from: f */
    public final AppCompatImageView f27274f;

    /* renamed from: g */
    public final LottieAnimationView f27275g;

    /* renamed from: h */
    public final AppCompatTextView f27276h;

    private C9968m4(View view, LayerView layerView, AppCompatImageView appCompatImageView, LottieAnimationView lottieAnimationView, AppCompatTextView appCompatTextView) {
        this.f27272d = view;
        this.f27273e = layerView;
        this.f27274f = appCompatImageView;
        this.f27275g = lottieAnimationView;
        this.f27276h = appCompatTextView;
    }

    /* renamed from: a */
    public static C9968m4 m36561a(View view) {
        int i = C17782g.icon_background;
        LayerView layerView = (LayerView) C6202b.m24689a(view, i);
        if (layerView != null) {
            i = C17782g.page_state_image;
            AppCompatImageView appCompatImageView = (AppCompatImageView) C6202b.m24689a(view, i);
            if (appCompatImageView != null) {
                i = C17782g.page_state_lottie_image;
                LottieAnimationView lottieAnimationView = (LottieAnimationView) C6202b.m24689a(view, i);
                if (lottieAnimationView != null) {
                    i = C17782g.page_state_title;
                    AppCompatTextView appCompatTextView = (AppCompatTextView) C6202b.m24689a(view, i);
                    if (appCompatTextView != null) {
                        return new C9968m4(view, layerView, appCompatImageView, lottieAnimationView, appCompatTextView);
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    /* renamed from: c */
    public static C9968m4 m36562c(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        if (viewGroup != null) {
            layoutInflater.inflate(C17783h.view_page_state, viewGroup);
            return m36561a(viewGroup);
        }
        throw new NullPointerException("parent");
    }

    /* renamed from: b */
    public View mo3946b() {
        return this.f27272d;
    }
}
