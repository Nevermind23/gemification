package th0;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import oh0.C27011f;
import p086g1.C6201a;
import p341ge.bog.designsystem.components.bannercard.BannerCard;

/* renamed from: th0.r0 */
public final class C28423r0 implements C6201a {

    /* renamed from: d */
    private final BannerCard f72197d;

    /* renamed from: e */
    public final BannerCard f72198e;

    private C28423r0(BannerCard bannerCard, BannerCard bannerCard2) {
        this.f72197d = bannerCard;
        this.f72198e = bannerCard2;
    }

    /* renamed from: a */
    public static C28423r0 m87213a(View view) {
        if (view != null) {
            BannerCard bannerCard = (BannerCard) view;
            return new C28423r0(bannerCard, bannerCard);
        }
        throw new NullPointerException("rootView");
    }

    /* renamed from: d */
    public static C28423r0 m87214d(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(C27011f.item_googlepay_banner, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return m87213a(inflate);
    }

    /* renamed from: c */
    public BannerCard mo3946b() {
        return this.f72197d;
    }
}
