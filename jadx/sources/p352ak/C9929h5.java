package p352ak;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.appcompat.widget.AppCompatTextView;
import com.airbnb.lottie.LottieAnimationView;
import p086g1.C6201a;
import p086g1.C6202b;
import p341ge.bog.designsystem.components.layersandshadows.LayerView;
import p601sg.C17782g;
import p601sg.C17783h;

/* renamed from: ak.h5 */
public final class C9929h5 implements C6201a {

    /* renamed from: d */
    private final FrameLayout f27076d;

    /* renamed from: e */
    public final LayerView f27077e;

    /* renamed from: f */
    public final AppCompatImageView f27078f;

    /* renamed from: g */
    public final AppCompatImageView f27079g;

    /* renamed from: h */
    public final AppCompatTextView f27080h;

    /* renamed from: i */
    public final LottieAnimationView f27081i;

    private C9929h5(FrameLayout frameLayout, LayerView layerView, AppCompatImageView appCompatImageView, AppCompatImageView appCompatImageView2, AppCompatTextView appCompatTextView, LottieAnimationView lottieAnimationView) {
        this.f27076d = frameLayout;
        this.f27077e = layerView;
        this.f27078f = appCompatImageView;
        this.f27079g = appCompatImageView2;
        this.f27080h = appCompatTextView;
        this.f27081i = lottieAnimationView;
    }

    /* renamed from: a */
    public static C9929h5 m36420a(View view) {
        int i = C17782g.f49748a0;
        LayerView layerView = (LayerView) C6202b.m24689a(view, i);
        if (layerView != null) {
            i = C17782g.badge_icon;
            AppCompatImageView appCompatImageView = (AppCompatImageView) C6202b.m24689a(view, i);
            if (appCompatImageView != null) {
                i = C17782g.gradient;
                AppCompatImageView appCompatImageView2 = (AppCompatImageView) C6202b.m24689a(view, i);
                if (appCompatImageView2 != null) {
                    i = C17782g.story_title;
                    AppCompatTextView appCompatTextView = (AppCompatTextView) C6202b.m24689a(view, i);
                    if (appCompatTextView != null) {
                        i = C17782g.thumbnail;
                        LottieAnimationView lottieAnimationView = (LottieAnimationView) C6202b.m24689a(view, i);
                        if (lottieAnimationView != null) {
                            return new C9929h5((FrameLayout) view, layerView, appCompatImageView, appCompatImageView2, appCompatTextView, lottieAnimationView);
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    /* renamed from: d */
    public static C9929h5 m36421d(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(C17783h.view_story_thumbnail, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return m36420a(inflate);
    }

    /* renamed from: c */
    public FrameLayout mo3946b() {
        return this.f27076d;
    }
}
