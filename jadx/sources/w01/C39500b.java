package w01;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.airbnb.lottie.LottieAnimationView;
import p086g1.C6201a;
import p086g1.C6202b;
import u01.C39000a;
import u01.C39001b;

/* renamed from: w01.b */
public final class C39500b implements C6201a {

    /* renamed from: d */
    private final FrameLayout f93951d;

    /* renamed from: e */
    public final LottieAnimationView f93952e;

    private C39500b(FrameLayout frameLayout, LottieAnimationView lottieAnimationView) {
        this.f93951d = frameLayout;
        this.f93952e = lottieAnimationView;
    }

    /* renamed from: a */
    public static C39500b m114824a(View view) {
        int i = C39000a.lottie_anim;
        LottieAnimationView lottieAnimationView = (LottieAnimationView) C6202b.m24689a(view, i);
        if (lottieAnimationView != null) {
            return new C39500b((FrameLayout) view, lottieAnimationView);
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    /* renamed from: d */
    public static C39500b m114825d(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(C39001b.item_image_slider, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return m114824a(inflate);
    }

    /* renamed from: c */
    public FrameLayout mo3946b() {
        return this.f93951d;
    }
}
