package iy0;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import hy0.C36272f;
import p086g1.C6201a;
import p341ge.bog.designsystem.components.bannercard.BannerCard;

/* renamed from: iy0.f0 */
public final class C36594f0 implements C6201a {

    /* renamed from: d */
    private final BannerCard f88192d;

    private C36594f0(BannerCard bannerCard) {
        this.f88192d = bannerCard;
    }

    /* renamed from: a */
    public static C36594f0 m108502a(View view) {
        if (view != null) {
            return new C36594f0((BannerCard) view);
        }
        throw new NullPointerException("rootView");
    }

    /* renamed from: d */
    public static C36594f0 m108503d(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(C36272f.item_account_card_insurance_offer, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return m108502a(inflate);
    }

    /* renamed from: c */
    public BannerCard mo3946b() {
        return this.f88192d;
    }
}
