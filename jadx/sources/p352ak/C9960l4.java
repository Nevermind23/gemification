package p352ak;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.appcompat.widget.AppCompatTextView;
import com.airbnb.lottie.LottieAnimationView;
import p086g1.C6201a;
import p086g1.C6202b;
import p341ge.bog.designsystem.components.notificationbadges.BadgeRelativeLayout;
import p601sg.C17782g;
import p601sg.C17783h;

/* renamed from: ak.l4 */
public final class C9960l4 implements C6201a {

    /* renamed from: d */
    private final View f27242d;

    /* renamed from: e */
    public final BadgeRelativeLayout f27243e;

    /* renamed from: f */
    public final LottieAnimationView f27244f;

    /* renamed from: g */
    public final AppCompatTextView f27245g;

    /* renamed from: h */
    public final LinearLayout f27246h;

    private C9960l4(View view, BadgeRelativeLayout badgeRelativeLayout, LottieAnimationView lottieAnimationView, AppCompatTextView appCompatTextView, LinearLayout linearLayout) {
        this.f27242d = view;
        this.f27243e = badgeRelativeLayout;
        this.f27244f = lottieAnimationView;
        this.f27245g = appCompatTextView;
        this.f27246h = linearLayout;
    }

    /* renamed from: a */
    public static C9960l4 m36530a(View view) {
        int i = C17782g.badgeLayout;
        BadgeRelativeLayout badgeRelativeLayout = (BadgeRelativeLayout) C6202b.m24689a(view, i);
        if (badgeRelativeLayout != null) {
            i = C17782g.page_description_image;
            LottieAnimationView lottieAnimationView = (LottieAnimationView) C6202b.m24689a(view, i);
            if (lottieAnimationView != null) {
                i = C17782g.page_description_text;
                AppCompatTextView appCompatTextView = (AppCompatTextView) C6202b.m24689a(view, i);
                if (appCompatTextView != null) {
                    i = C17782g.page_descripton;
                    LinearLayout linearLayout = (LinearLayout) C6202b.m24689a(view, i);
                    if (linearLayout != null) {
                        return new C9960l4(view, badgeRelativeLayout, lottieAnimationView, appCompatTextView, linearLayout);
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    /* renamed from: c */
    public static C9960l4 m36531c(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        if (viewGroup != null) {
            layoutInflater.inflate(C17783h.view_page_description_horizontal, viewGroup);
            return m36530a(viewGroup);
        }
        throw new NullPointerException("parent");
    }

    /* renamed from: b */
    public View mo3946b() {
        return this.f27242d;
    }
}
