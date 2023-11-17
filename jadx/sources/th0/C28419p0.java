package th0;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.airbnb.lottie.LottieAnimationView;
import oh0.C27010e;
import oh0.C27011f;
import p086g1.C6201a;
import p086g1.C6202b;
import p341ge.bog.designsystem.components.gyroanimation.GyroAnimationView;

/* renamed from: th0.p0 */
public final class C28419p0 implements C6201a {

    /* renamed from: d */
    private final ConstraintLayout f72179d;

    /* renamed from: e */
    public final FrameLayout f72180e;

    /* renamed from: f */
    public final LottieAnimationView f72181f;

    /* renamed from: g */
    public final GyroAnimationView f72182g;

    /* renamed from: h */
    public final AppCompatImageView f72183h;

    /* renamed from: i */
    public final ConstraintLayout f72184i;

    /* renamed from: j */
    public final TextView f72185j;

    private C28419p0(ConstraintLayout constraintLayout, FrameLayout frameLayout, LottieAnimationView lottieAnimationView, GyroAnimationView gyroAnimationView, AppCompatImageView appCompatImageView, ConstraintLayout constraintLayout2, TextView textView) {
        this.f72179d = constraintLayout;
        this.f72180e = frameLayout;
        this.f72181f = lottieAnimationView;
        this.f72182g = gyroAnimationView;
        this.f72183h = appCompatImageView;
        this.f72184i = constraintLayout2;
        this.f72185j = textView;
    }

    /* renamed from: a */
    public static C28419p0 m87197a(View view) {
        int i = C27010e.frame_container_gift_card;
        FrameLayout frameLayout = (FrameLayout) C6202b.m24689a(view, i);
        if (frameLayout != null) {
            i = C27010e.gift_card_animation_view;
            LottieAnimationView lottieAnimationView = (LottieAnimationView) C6202b.m24689a(view, i);
            if (lottieAnimationView != null) {
                i = C27010e.gift_card_gyro_animation_view;
                GyroAnimationView gyroAnimationView = (GyroAnimationView) C6202b.m24689a(view, i);
                if (gyroAnimationView != null) {
                    i = C27010e.gift_card_image_view;
                    AppCompatImageView appCompatImageView = (AppCompatImageView) C6202b.m24689a(view, i);
                    if (appCompatImageView != null) {
                        ConstraintLayout constraintLayout = (ConstraintLayout) view;
                        i = C27010e.tvAvailableAmount;
                        TextView textView = (TextView) C6202b.m24689a(view, i);
                        if (textView != null) {
                            return new C28419p0(constraintLayout, frameLayout, lottieAnimationView, gyroAnimationView, appCompatImageView, constraintLayout, textView);
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    /* renamed from: d */
    public static C28419p0 m87198d(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(C27011f.item_gift_cards_animations, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return m87197a(inflate);
    }

    /* renamed from: c */
    public ConstraintLayout mo3946b() {
        return this.f72179d;
    }
}
