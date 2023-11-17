package iy0;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import hy0.C36272f;
import p086g1.C6201a;
import p341ge.bog.designsystem.components.bannercard.BannerCard;

/* renamed from: iy0.a1 */
public final class C36580a1 implements C6201a {

    /* renamed from: d */
    private final BannerCard f88141d;

    private C36580a1(BannerCard bannerCard) {
        this.f88141d = bannerCard;
    }

    /* renamed from: a */
    public static C36580a1 m108445a(View view) {
        if (view != null) {
            return new C36580a1((BannerCard) view);
        }
        throw new NullPointerException("rootView");
    }

    /* renamed from: d */
    public static C36580a1 m108446d(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(C36272f.item_activate_child_mbank_offer, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return m108445a(inflate);
    }

    /* renamed from: c */
    public BannerCard mo3946b() {
        return this.f88141d;
    }
}
