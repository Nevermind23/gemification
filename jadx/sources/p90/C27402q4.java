package p90;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import p086g1.C6201a;
import p341ge.bog.designsystem.components.bannercard.BannerCard;
import p366bk.C10324m;

/* renamed from: p90.q4 */
public final class C27402q4 implements C6201a {

    /* renamed from: d */
    private final BannerCard f69607d;

    private C27402q4(BannerCard bannerCard) {
        this.f69607d = bannerCard;
    }

    /* renamed from: a */
    public static C27402q4 m84911a(View view) {
        if (view != null) {
            return new C27402q4((BannerCard) view);
        }
        throw new NullPointerException("rootView");
    }

    /* renamed from: d */
    public static C27402q4 m84912d(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(C10324m.home_junior_layout, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return m84911a(inflate);
    }

    /* renamed from: c */
    public BannerCard mo3946b() {
        return this.f69607d;
    }
}
