package th0;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewpager2.widget.ViewPager2;
import oh0.C27010e;
import oh0.C27011f;
import p086g1.C6201a;
import p086g1.C6202b;
import p341ge.bog.designsystem.components.buttons.Button;

/* renamed from: th0.q */
public final class C28420q implements C6201a {

    /* renamed from: d */
    private final ConstraintLayout f72186d;

    /* renamed from: e */
    public final Button f72187e;

    /* renamed from: f */
    public final LinearLayout f72188f;

    /* renamed from: g */
    public final ViewPager2 f72189g;

    /* renamed from: h */
    public final FrameLayout f72190h;

    private C28420q(ConstraintLayout constraintLayout, Button button, LinearLayout linearLayout, ViewPager2 viewPager2, FrameLayout frameLayout) {
        this.f72186d = constraintLayout;
        this.f72187e = button;
        this.f72188f = linearLayout;
        this.f72189g = viewPager2;
        this.f72190h = frameLayout;
    }

    /* renamed from: a */
    public static C28420q m87201a(View view) {
        int i = C27010e.button_next;
        Button button = (Button) C6202b.m24689a(view, i);
        if (button != null) {
            i = C27010e.gift_card_intro_bottom_container;
            LinearLayout linearLayout = (LinearLayout) C6202b.m24689a(view, i);
            if (linearLayout != null) {
                i = C27010e.gift_card_intro_slider_container;
                ViewPager2 viewPager2 = (ViewPager2) C6202b.m24689a(view, i);
                if (viewPager2 != null) {
                    i = C27010e.gift_card_scrolling_indicator;
                    FrameLayout frameLayout = (FrameLayout) C6202b.m24689a(view, i);
                    if (frameLayout != null) {
                        return new C28420q((ConstraintLayout) view, button, linearLayout, viewPager2, frameLayout);
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    /* renamed from: d */
    public static C28420q m87202d(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(C27011f.fragment_gift_cards_terms_and_conditions, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return m87201a(inflate);
    }

    /* renamed from: c */
    public ConstraintLayout mo3946b() {
        return this.f72186d;
    }
}
