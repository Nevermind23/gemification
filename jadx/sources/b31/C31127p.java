package b31;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.airbnb.lottie.LottieAnimationView;
import p086g1.C6201a;
import p086g1.C6202b;
import x11.C39771d;
import x11.C39772e;

/* renamed from: b31.p */
public final class C31127p implements C6201a {

    /* renamed from: d */
    private final View f77359d;

    /* renamed from: e */
    public final LottieAnimationView f77360e;

    private C31127p(View view, LottieAnimationView lottieAnimationView) {
        this.f77359d = view;
        this.f77360e = lottieAnimationView;
    }

    /* renamed from: a */
    public static C31127p m92627a(View view) {
        int i = C39771d.lottie_animation_view;
        LottieAnimationView lottieAnimationView = (LottieAnimationView) C6202b.m24689a(view, i);
        if (lottieAnimationView != null) {
            return new C31127p(view, lottieAnimationView);
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    /* renamed from: c */
    public static C31127p m92628c(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        if (viewGroup != null) {
            layoutInflater.inflate(C39772e.progress_animation_view, viewGroup);
            return m92627a(viewGroup);
        }
        throw new NullPointerException("parent");
    }

    /* renamed from: b */
    public View mo3946b() {
        return this.f77359d;
    }
}
