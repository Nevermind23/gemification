package p352ak;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.appcompat.widget.AppCompatImageView;
import p086g1.C6201a;
import p086g1.C6202b;
import p341ge.bog.designsystem.components.layersandshadows.LayerView;
import p341ge.bog.designsystem.components.notificationbadges.BadgeRelativeLayout;
import p601sg.C17782g;
import p601sg.C17783h;

/* renamed from: ak.k1 */
public final class C9949k1 implements C6201a {

    /* renamed from: d */
    private final BadgeRelativeLayout f27187d;

    /* renamed from: e */
    public final AppCompatImageView f27188e;

    /* renamed from: f */
    public final LayerView f27189f;

    private C9949k1(BadgeRelativeLayout badgeRelativeLayout, AppCompatImageView appCompatImageView, LayerView layerView) {
        this.f27187d = badgeRelativeLayout;
        this.f27188e = appCompatImageView;
        this.f27189f = layerView;
    }

    /* renamed from: a */
    public static C9949k1 m36489a(View view) {
        int i = C17782g.button_icon_image;
        AppCompatImageView appCompatImageView = (AppCompatImageView) C6202b.m24689a(view, i);
        if (appCompatImageView != null) {
            i = C17782g.inner_content_layout;
            LayerView layerView = (LayerView) C6202b.m24689a(view, i);
            if (layerView != null) {
                return new C9949k1((BadgeRelativeLayout) view, appCompatImageView, layerView);
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    /* renamed from: d */
    public static C9949k1 m36490d(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(C17783h.view_button_icon_small, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return m36489a(inflate);
    }

    /* renamed from: c */
    public BadgeRelativeLayout mo3946b() {
        return this.f27187d;
    }
}
