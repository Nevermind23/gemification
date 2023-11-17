package p352ak;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.appcompat.widget.AppCompatTextView;
import com.airbnb.lottie.LottieAnimationView;
import p086g1.C6201a;
import p086g1.C6202b;
import p341ge.bog.designsystem.components.buttons.Button;
import p341ge.bog.designsystem.components.notificationbadges.BadgeRelativeLayout;
import p601sg.C17782g;
import p601sg.C17783h;

/* renamed from: ak.k4 */
public final class C9952k4 implements C6201a {

    /* renamed from: d */
    private final View f27203d;

    /* renamed from: e */
    public final BadgeRelativeLayout f27204e;

    /* renamed from: f */
    public final LinearLayout f27205f;

    /* renamed from: g */
    public final AppCompatTextView f27206g;

    /* renamed from: h */
    public final Button f27207h;

    /* renamed from: i */
    public final LottieAnimationView f27208i;

    /* renamed from: j */
    public final AppCompatTextView f27209j;

    private C9952k4(View view, BadgeRelativeLayout badgeRelativeLayout, LinearLayout linearLayout, AppCompatTextView appCompatTextView, Button button, LottieAnimationView lottieAnimationView, AppCompatTextView appCompatTextView2) {
        this.f27203d = view;
        this.f27204e = badgeRelativeLayout;
        this.f27205f = linearLayout;
        this.f27206g = appCompatTextView;
        this.f27207h = button;
        this.f27208i = lottieAnimationView;
        this.f27209j = appCompatTextView2;
    }

    /* renamed from: a */
    public static C9952k4 m36500a(View view) {
        int i = C17782g.badgeLayout;
        BadgeRelativeLayout badgeRelativeLayout = (BadgeRelativeLayout) C6202b.m24689a(view, i);
        if (badgeRelativeLayout != null) {
            i = C17782g.f49789r6;
            LinearLayout linearLayout = (LinearLayout) C6202b.m24689a(view, i);
            if (linearLayout != null) {
                i = C17782g.page_description_base_text;
                AppCompatTextView appCompatTextView = (AppCompatTextView) C6202b.m24689a(view, i);
                if (appCompatTextView != null) {
                    i = C17782g.page_description_button;
                    Button button = (Button) C6202b.m24689a(view, i);
                    if (button != null) {
                        i = C17782g.page_description_image;
                        LottieAnimationView lottieAnimationView = (LottieAnimationView) C6202b.m24689a(view, i);
                        if (lottieAnimationView != null) {
                            i = C17782g.page_description_title_text;
                            AppCompatTextView appCompatTextView2 = (AppCompatTextView) C6202b.m24689a(view, i);
                            if (appCompatTextView2 != null) {
                                return new C9952k4(view, badgeRelativeLayout, linearLayout, appCompatTextView, button, lottieAnimationView, appCompatTextView2);
                            }
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    /* renamed from: c */
    public static C9952k4 m36501c(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        if (viewGroup != null) {
            layoutInflater.inflate(C17783h.view_page_description, viewGroup);
            return m36500a(viewGroup);
        }
        throw new NullPointerException("parent");
    }

    /* renamed from: b */
    public View mo3946b() {
        return this.f27203d;
    }
}
