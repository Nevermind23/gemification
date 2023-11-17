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

/* renamed from: ak.m3 */
public final class C9967m3 implements C6201a {

    /* renamed from: d */
    private final BadgeRelativeLayout f27268d;

    /* renamed from: e */
    public final BadgeRelativeLayout f27269e;

    /* renamed from: f */
    public final LayerView f27270f;

    /* renamed from: g */
    public final AppCompatImageView f27271g;

    private C9967m3(BadgeRelativeLayout badgeRelativeLayout, BadgeRelativeLayout badgeRelativeLayout2, LayerView layerView, AppCompatImageView appCompatImageView) {
        this.f27268d = badgeRelativeLayout;
        this.f27269e = badgeRelativeLayout2;
        this.f27270f = layerView;
        this.f27271g = appCompatImageView;
    }

    /* renamed from: a */
    public static C9967m3 m36557a(View view) {
        BadgeRelativeLayout badgeRelativeLayout = (BadgeRelativeLayout) view;
        int i = C17782g.f49767j5;
        LayerView layerView = (LayerView) C6202b.m24689a(view, i);
        if (layerView != null) {
            i = C17782g.thumbnail;
            AppCompatImageView appCompatImageView = (AppCompatImageView) C6202b.m24689a(view, i);
            if (appCompatImageView != null) {
                return new C9967m3(badgeRelativeLayout, badgeRelativeLayout, layerView, appCompatImageView);
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    /* renamed from: d */
    public static C9967m3 m36558d(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(C17783h.view_image_selector, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return m36557a(inflate);
    }

    /* renamed from: c */
    public BadgeRelativeLayout mo3946b() {
        return this.f27268d;
    }
}
