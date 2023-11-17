package p90;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import p086g1.C6201a;
import p341ge.bog.mobilebank.cleanarch.gamification.views.GamificationBanner;
import p366bk.C10324m;

/* renamed from: p90.o4 */
public final class C27384o4 implements C6201a {

    /* renamed from: d */
    private final GamificationBanner f69463d;

    private C27384o4(GamificationBanner gamificationBanner) {
        this.f69463d = gamificationBanner;
    }

    /* renamed from: a */
    public static C27384o4 m84840a(View view) {
        if (view != null) {
            return new C27384o4((GamificationBanner) view);
        }
        throw new NullPointerException("rootView");
    }

    /* renamed from: d */
    public static C27384o4 m84841d(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(C10324m.home_gamification_banner_layout, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return m84840a(inflate);
    }

    /* renamed from: c */
    public GamificationBanner mo3946b() {
        return this.f69463d;
    }
}
