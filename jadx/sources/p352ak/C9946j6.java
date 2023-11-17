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

/* renamed from: ak.j6 */
public final class C9946j6 implements C6201a {

    /* renamed from: d */
    private final View f27172d;

    /* renamed from: e */
    public final BadgeRelativeLayout f27173e;

    /* renamed from: f */
    public final LayerView f27174f;

    /* renamed from: g */
    public final AppCompatImageView f27175g;

    /* renamed from: h */
    public final AppCompatImageView f27176h;

    private C9946j6(View view, BadgeRelativeLayout badgeRelativeLayout, LayerView layerView, AppCompatImageView appCompatImageView, AppCompatImageView appCompatImageView2) {
        this.f27172d = view;
        this.f27173e = badgeRelativeLayout;
        this.f27174f = layerView;
        this.f27175g = appCompatImageView;
        this.f27176h = appCompatImageView2;
    }

    /* renamed from: a */
    public static C9946j6 m36479a(View view) {
        int i = C17782g.badgeLayout;
        BadgeRelativeLayout badgeRelativeLayout = (BadgeRelativeLayout) C6202b.m24689a(view, i);
        if (badgeRelativeLayout != null) {
            i = C17782g.f49767j5;
            LayerView layerView = (LayerView) C6202b.m24689a(view, i);
            if (layerView != null) {
                i = C17782g.thumbnail;
                AppCompatImageView appCompatImageView = (AppCompatImageView) C6202b.m24689a(view, i);
                if (appCompatImageView != null) {
                    i = C17782g.thumbnail_chevron_image;
                    AppCompatImageView appCompatImageView2 = (AppCompatImageView) C6202b.m24689a(view, i);
                    if (appCompatImageView2 != null) {
                        return new C9946j6(view, badgeRelativeLayout, layerView, appCompatImageView, appCompatImageView2);
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    /* renamed from: c */
    public static C9946j6 m36480c(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        if (viewGroup != null) {
            layoutInflater.inflate(C17783h.view_thumbnail_picker_icon, viewGroup);
            return m36479a(viewGroup);
        }
        throw new NullPointerException("parent");
    }

    /* renamed from: b */
    public View mo3946b() {
        return this.f27172d;
    }
}
