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

/* renamed from: iy0.b0 */
public final class C36582b0 implements C6201a {

    /* renamed from: d */
    private final FrameLayout f88155d;

    /* renamed from: e */
    public final BannerCard f88156e;

    private C36582b0(FrameLayout frameLayout, BannerCard bannerCard) {
        this.f88155d = frameLayout;
        this.f88156e = bannerCard;
    }

    /* renamed from: a */
    public static C36582b0 m108453a(View view) {
        int i = C36271e.limitsBanner;
        BannerCard bannerCard = (BannerCard) C6202b.m24689a(view, i);
        if (bannerCard != null) {
            return new C36582b0((FrameLayout) view, bannerCard);
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    /* renamed from: d */
    public static C36582b0 m108454d(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(C36272f.grid_item_show_client_limit_banner, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return m108453a(inflate);
    }

    /* renamed from: c */
    public FrameLayout mo3946b() {
        return this.f88155d;
    }
}
