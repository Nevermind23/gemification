package p90;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import p086g1.C6201a;
import p086g1.C6202b;
import p341ge.bog.designsystem.components.bannercard.BannerCard;
import p341ge.bog.designsystem.components.layersandshadows.LayerView;
import p366bk.C10322k;
import p366bk.C10324m;

/* renamed from: p90.y3 */
public final class C27473y3 implements C6201a {

    /* renamed from: d */
    private final LayerView f70262d;

    /* renamed from: e */
    public final BannerCard f70263e;

    private C27473y3(LayerView layerView, BannerCard bannerCard) {
        this.f70262d = layerView;
        this.f70263e = bannerCard;
    }

    /* renamed from: a */
    public static C27473y3 m85200a(View view) {
        int i = C10322k.bonus_banner;
        BannerCard bannerCard = (BannerCard) C6202b.m24689a(view, i);
        if (bannerCard != null) {
            return new C27473y3((LayerView) view, bannerCard);
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    /* renamed from: d */
    public static C27473y3 m85201d(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(C10324m.fragment_mr_catalog, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return m85200a(inflate);
    }

    /* renamed from: c */
    public LayerView mo3946b() {
        return this.f70262d;
    }
}
