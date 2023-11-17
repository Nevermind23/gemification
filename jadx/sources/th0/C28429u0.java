package th0;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.airbnb.lottie.LottieAnimationView;
import oh0.C27010e;
import oh0.C27011f;
import p086g1.C6201a;
import p086g1.C6202b;
import p341ge.bog.designsystem.components.gyroanimation.GyroAnimationView;

/* renamed from: th0.u0 */
public final class C28429u0 implements C6201a {

    /* renamed from: d */
    private final ConstraintLayout f72216d;

    /* renamed from: e */
    public final TextView f72217e;

    /* renamed from: f */
    public final LottieAnimationView f72218f;

    /* renamed from: g */
    public final GyroAnimationView f72219g;

    /* renamed from: h */
    public final ImageView f72220h;

    private C28429u0(ConstraintLayout constraintLayout, TextView textView, LottieAnimationView lottieAnimationView, GyroAnimationView gyroAnimationView, ImageView imageView) {
        this.f72216d = constraintLayout;
        this.f72217e = textView;
        this.f72218f = lottieAnimationView;
        this.f72219g = gyroAnimationView;
        this.f72220h = imageView;
    }

    /* renamed from: a */
    public static C28429u0 m87238a(View view) {
        int i = C27010e.f67828l;
        TextView textView = (TextView) C6202b.m24689a(view, i);
        if (textView != null) {
            i = C27010e.gift_card_animation_view;
            LottieAnimationView lottieAnimationView = (LottieAnimationView) C6202b.m24689a(view, i);
            if (lottieAnimationView != null) {
                i = C27010e.gift_card_gyro_animation_view;
                GyroAnimationView gyroAnimationView = (GyroAnimationView) C6202b.m24689a(view, i);
                if (gyroAnimationView != null) {
                    i = C27010e.merchant_logo;
                    ImageView imageView = (ImageView) C6202b.m24689a(view, i);
                    if (imageView != null) {
                        return new C28429u0((ConstraintLayout) view, textView, lottieAnimationView, gyroAnimationView, imageView);
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    /* renamed from: d */
    public static C28429u0 m87239d(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(C27011f.item_received_gift_card, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return m87238a(inflate);
    }

    /* renamed from: c */
    public ConstraintLayout mo3946b() {
        return this.f72216d;
    }
}
