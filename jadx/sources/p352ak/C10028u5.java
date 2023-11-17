package p352ak;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.airbnb.lottie.LottieAnimationView;
import p086g1.C6201a;
import p086g1.C6202b;
import p601sg.C17782g;
import p601sg.C17783h;

/* renamed from: ak.u5 */
public final class C10028u5 implements C6201a {

    /* renamed from: d */
    private final LinearLayout f27627d;

    /* renamed from: e */
    public final LottieAnimationView f27628e;

    /* renamed from: f */
    public final TextView f27629f;

    private C10028u5(LinearLayout linearLayout, LottieAnimationView lottieAnimationView, TextView textView) {
        this.f27627d = linearLayout;
        this.f27628e = lottieAnimationView;
        this.f27629f = textView;
    }

    /* renamed from: a */
    public static C10028u5 m36780a(View view) {
        int i = C17782g.f49808w4;
        LottieAnimationView lottieAnimationView = (LottieAnimationView) C6202b.m24689a(view, i);
        if (lottieAnimationView != null) {
            i = C17782g.f49701K8;
            TextView textView = (TextView) C6202b.m24689a(view, i);
            if (textView != null) {
                return new C10028u5((LinearLayout) view, lottieAnimationView, textView);
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    /* renamed from: d */
    public static C10028u5 m36781d(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(C17783h.view_text_image_card_extra_small, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return m36780a(inflate);
    }

    /* renamed from: c */
    public LinearLayout mo3946b() {
        return this.f27627d;
    }
}
