package xb0;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import p086g1.C6201a;
import p341ge.bog.designsystem.components.bannercard.BannerCard;
import rb0.C27986e;

/* renamed from: xb0.o */
public final class C29727o implements C6201a {

    /* renamed from: d */
    private final BannerCard f75127d;

    /* renamed from: e */
    public final BannerCard f75128e;

    private C29727o(BannerCard bannerCard, BannerCard bannerCard2) {
        this.f75127d = bannerCard;
        this.f75128e = bannerCard2;
    }

    /* renamed from: a */
    public static C29727o m90273a(View view) {
        if (view != null) {
            BannerCard bannerCard = (BannerCard) view;
            return new C29727o(bannerCard, bannerCard);
        }
        throw new NullPointerException("rootView");
    }

    /* renamed from: d */
    public static C29727o m90274d(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(C27986e.item_deposit_banner, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return m90273a(inflate);
    }

    /* renamed from: c */
    public BannerCard mo3946b() {
        return this.f75127d;
    }
}
