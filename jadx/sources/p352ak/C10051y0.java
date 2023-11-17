package p352ak;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import p086g1.C6201a;
import p086g1.C6202b;
import p341ge.bog.designsystem.components.layersandshadows.LayerView;
import p341ge.bog.designsystem.components.thumbnailiconbadge.ThumbnailIconBadgeView;
import p341ge.bog.designsystem.components.verifiedbadge.VerifiedBadgeView;
import p601sg.C17782g;
import p601sg.C17783h;

/* renamed from: ak.y0 */
public final class C10051y0 implements C6201a {

    /* renamed from: d */
    private final ConstraintLayout f27763d;

    /* renamed from: e */
    public final ThumbnailIconBadgeView f27764e;

    /* renamed from: f */
    public final AppCompatTextView f27765f;

    /* renamed from: g */
    public final AppCompatImageView f27766g;

    /* renamed from: h */
    public final LayerView f27767h;

    /* renamed from: i */
    public final VerifiedBadgeView f27768i;

    private C10051y0(ConstraintLayout constraintLayout, ThumbnailIconBadgeView thumbnailIconBadgeView, AppCompatTextView appCompatTextView, AppCompatImageView appCompatImageView, LayerView layerView, VerifiedBadgeView verifiedBadgeView) {
        this.f27763d = constraintLayout;
        this.f27764e = thumbnailIconBadgeView;
        this.f27765f = appCompatTextView;
        this.f27766g = appCompatImageView;
        this.f27767h = layerView;
        this.f27768i = verifiedBadgeView;
    }

    /* renamed from: a */
    public static C10051y0 m36865a(View view) {
        int i = C17782g.badge_view;
        ThumbnailIconBadgeView thumbnailIconBadgeView = (ThumbnailIconBadgeView) C6202b.m24689a(view, i);
        if (thumbnailIconBadgeView != null) {
            i = C17782g.f49709N0;
            AppCompatTextView appCompatTextView = (AppCompatTextView) C6202b.m24689a(view, i);
            if (appCompatTextView != null) {
                i = C17782g.logo;
                AppCompatImageView appCompatImageView = (AppCompatImageView) C6202b.m24689a(view, i);
                if (appCompatImageView != null) {
                    i = C17782g.logo_container;
                    LayerView layerView = (LayerView) C6202b.m24689a(view, i);
                    if (layerView != null) {
                        i = C17782g.verification_badge;
                        VerifiedBadgeView verifiedBadgeView = (VerifiedBadgeView) C6202b.m24689a(view, i);
                        if (verifiedBadgeView != null) {
                            return new C10051y0((ConstraintLayout) view, thumbnailIconBadgeView, appCompatTextView, appCompatImageView, layerView, verifiedBadgeView);
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    /* renamed from: d */
    public static C10051y0 m36866d(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(C17783h.view_button_action_badge_thumbnail, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return m36865a(inflate);
    }

    /* renamed from: c */
    public ConstraintLayout mo3946b() {
        return this.f27763d;
    }
}
