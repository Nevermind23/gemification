package th0;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import oh0.C27011f;
import p086g1.C6201a;
import p341ge.bog.designsystem.components.bannercard.BannerCard;

/* renamed from: th0.c0 */
public final class C28393c0 implements C6201a {

    /* renamed from: d */
    private final BannerCard f71991d;

    /* renamed from: e */
    public final BannerCard f71992e;

    private C28393c0(BannerCard bannerCard, BannerCard bannerCard2) {
        this.f71991d = bannerCard;
        this.f71992e = bannerCard2;
    }

    /* renamed from: a */
    public static C28393c0 m87092a(View view) {
        if (view != null) {
            BannerCard bannerCard = (BannerCard) view;
            return new C28393c0(bannerCard, bannerCard);
        }
        throw new NullPointerException("rootView");
    }

    /* renamed from: d */
    public static C28393c0 m87093d(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(C27011f.item_gift_card_details_banner, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return m87092a(inflate);
    }

    /* renamed from: c */
    public BannerCard mo3946b() {
        return this.f71991d;
    }
}
