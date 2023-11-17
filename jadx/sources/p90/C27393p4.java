package p90;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import p086g1.C6201a;
import p341ge.bog.designsystem.components.bannercard.BannerCard;
import p366bk.C10324m;

/* renamed from: p90.p4 */
public final class C27393p4 implements C6201a {

    /* renamed from: d */
    private final BannerCard f69532d;

    /* renamed from: e */
    public final BannerCard f69533e;

    private C27393p4(BannerCard bannerCard, BannerCard bannerCard2) {
        this.f69532d = bannerCard;
        this.f69533e = bannerCard2;
    }

    /* renamed from: a */
    public static C27393p4 m84876a(View view) {
        if (view != null) {
            BannerCard bannerCard = (BannerCard) view;
            return new C27393p4(bannerCard, bannerCard);
        }
        throw new NullPointerException("rootView");
    }

    /* renamed from: d */
    public static C27393p4 m84877d(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(C10324m.f28918I4, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return m84876a(inflate);
    }

    /* renamed from: c */
    public BannerCard mo3946b() {
        return this.f69532d;
    }
}
