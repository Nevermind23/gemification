package xn0;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import p086g1.C6201a;
import p086g1.C6202b;
import p341ge.bog.designsystem.components.dynamicthumbnailcard.DynamicThumbnailCardView;
import sn0.C17901e;
import sn0.C17902f;

/* renamed from: xn0.t */
public final class C18862t implements C6201a {

    /* renamed from: d */
    private final FrameLayout f52777d;

    /* renamed from: e */
    public final DynamicThumbnailCardView f52778e;

    private C18862t(FrameLayout frameLayout, DynamicThumbnailCardView dynamicThumbnailCardView) {
        this.f52777d = frameLayout;
        this.f52778e = dynamicThumbnailCardView;
    }

    /* renamed from: a */
    public static C18862t m63818a(View view) {
        int i = C17901e.bnpl_card;
        DynamicThumbnailCardView dynamicThumbnailCardView = (DynamicThumbnailCardView) C6202b.m24689a(view, i);
        if (dynamicThumbnailCardView != null) {
            return new C18862t((FrameLayout) view, dynamicThumbnailCardView);
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    /* renamed from: d */
    public static C18862t m63819d(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(C17902f.section_home_bnpl, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return m63818a(inflate);
    }

    /* renamed from: c */
    public FrameLayout mo3946b() {
        return this.f52777d;
    }
}
