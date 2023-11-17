package iy0;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.recyclerview.widget.RecyclerView;
import hy0.C36272f;
import p086g1.C6201a;
import p341ge.bog.designsystem.components.bannercard.BannerCard;
import p341ge.bog.designsystem.components.loading.LoadingView;
import p90.C27364m2;

/* renamed from: iy0.t */
public final class C36635t implements C6201a {

    /* renamed from: d */
    private final FrameLayout f88425d;

    /* renamed from: e */
    public final LoadingView f88426e;

    /* renamed from: f */
    public final C27364m2 f88427f;

    /* renamed from: g */
    public final BannerCard f88428g;

    /* renamed from: h */
    public final RecyclerView f88429h;

    private C36635t(FrameLayout frameLayout, LoadingView loadingView, C27364m2 m2Var, BannerCard bannerCard, RecyclerView recyclerView) {
        this.f88425d = frameLayout;
        this.f88426e = loadingView;
        this.f88427f = m2Var;
        this.f88428g = bannerCard;
        this.f88429h = recyclerView;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:2:0x000b, code lost:
        r0 = hy0.C36271e.full_progress_barrr;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static iy0.C36635t m108675a(android.view.View r8) {
        /*
            int r0 = hy0.C36271e.banner_loader
            android.view.View r1 = p086g1.C6202b.m24689a(r8, r0)
            r4 = r1
            ge.bog.designsystem.components.loading.LoadingView r4 = (p341ge.bog.designsystem.components.loading.LoadingView) r4
            if (r4 == 0) goto L_0x0037
            int r0 = hy0.C36271e.full_progress_barrr
            android.view.View r1 = p086g1.C6202b.m24689a(r8, r0)
            if (r1 == 0) goto L_0x0037
            p90.m2 r5 = p90.C27364m2.m84766a(r1)
            int r0 = hy0.C36271e.insurance_banner
            android.view.View r1 = p086g1.C6202b.m24689a(r8, r0)
            r6 = r1
            ge.bog.designsystem.components.bannercard.BannerCard r6 = (p341ge.bog.designsystem.components.bannercard.BannerCard) r6
            if (r6 == 0) goto L_0x0037
            int r0 = hy0.C36271e.manage_cards_recycler_view
            android.view.View r1 = p086g1.C6202b.m24689a(r8, r0)
            r7 = r1
            androidx.recyclerview.widget.RecyclerView r7 = (androidx.recyclerview.widget.RecyclerView) r7
            if (r7 == 0) goto L_0x0037
            iy0.t r0 = new iy0.t
            r3 = r8
            android.widget.FrameLayout r3 = (android.widget.FrameLayout) r3
            r2 = r0
            r2.<init>(r3, r4, r5, r6, r7)
            return r0
        L_0x0037:
            android.content.res.Resources r8 = r8.getResources()
            java.lang.String r8 = r8.getResourceName(r0)
            java.lang.NullPointerException r0 = new java.lang.NullPointerException
            java.lang.String r1 = "Missing required view with ID: "
            java.lang.String r8 = r1.concat(r8)
            r0.<init>(r8)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: iy0.C36635t.m108675a(android.view.View):iy0.t");
    }

    /* renamed from: d */
    public static C36635t m108676d(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(C36272f.fragment_manage_cards, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return m108675a(inflate);
    }

    /* renamed from: c */
    public FrameLayout mo3946b() {
        return this.f88425d;
    }
}
