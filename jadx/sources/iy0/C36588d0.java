package iy0;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import hy0.C36271e;
import hy0.C36272f;
import p086g1.C6201a;
import p086g1.C6202b;
import p341ge.bog.designsystem.components.bannercard.BannerCard;

/* renamed from: iy0.d0 */
public final class C36588d0 implements C6201a {

    /* renamed from: d */
    private final FrameLayout f88173d;

    /* renamed from: e */
    public final BannerCard f88174e;

    private C36588d0(FrameLayout frameLayout, BannerCard bannerCard) {
        this.f88173d = frameLayout;
        this.f88174e = bannerCard;
    }

    /* renamed from: a */
    public static C36588d0 m108478a(View view) {
        int i = C36271e.pension_banner;
        BannerCard bannerCard = (BannerCard) C6202b.m24689a(view, i);
        if (bannerCard != null) {
            return new C36588d0((FrameLayout) view, bannerCard);
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    /* renamed from: d */
    public static C36588d0 m108479d(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(C36272f.grid_item_show_pension_sum_banner, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return m108478a(inflate);
    }

    /* renamed from: c */
    public FrameLayout mo3946b() {
        return this.f88173d;
    }
}
