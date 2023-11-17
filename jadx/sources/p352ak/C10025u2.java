package p352ak;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.Placeholder;
import p086g1.C6201a;
import p086g1.C6202b;
import p341ge.bog.designsystem.components.layersandshadows.LayerView;
import p341ge.bog.designsystem.components.notificationbadges.NotificationBadgeView;
import p601sg.C17782g;
import p601sg.C17783h;

/* renamed from: ak.u2 */
public final class C10025u2 implements C6201a {

    /* renamed from: d */
    private final ConstraintLayout f27610d;

    /* renamed from: e */
    public final AppCompatTextView f27611e;

    /* renamed from: f */
    public final AppCompatTextView f27612f;

    /* renamed from: g */
    public final AppCompatImageView f27613g;

    /* renamed from: h */
    public final Placeholder f27614h;

    /* renamed from: i */
    public final LayerView f27615i;

    /* renamed from: j */
    public final NotificationBadgeView f27616j;

    /* renamed from: k */
    public final AppCompatTextView f27617k;

    private C10025u2(ConstraintLayout constraintLayout, AppCompatTextView appCompatTextView, AppCompatTextView appCompatTextView2, AppCompatImageView appCompatImageView, Placeholder placeholder, LayerView layerView, NotificationBadgeView notificationBadgeView, AppCompatTextView appCompatTextView3) {
        this.f27610d = constraintLayout;
        this.f27611e = appCompatTextView;
        this.f27612f = appCompatTextView2;
        this.f27613g = appCompatImageView;
        this.f27614h = placeholder;
        this.f27615i = layerView;
        this.f27616j = notificationBadgeView;
        this.f27617k = appCompatTextView3;
    }

    /* renamed from: a */
    public static C10025u2 m36769a(View view) {
        int i = C17782g.card_name_text;
        AppCompatTextView appCompatTextView = (AppCompatTextView) C6202b.m24689a(view, i);
        if (appCompatTextView != null) {
            i = C17782g.card_title_text;
            AppCompatTextView appCompatTextView2 = (AppCompatTextView) C6202b.m24689a(view, i);
            if (appCompatTextView2 != null) {
                i = C17782g.credit_card_image;
                AppCompatImageView appCompatImageView = (AppCompatImageView) C6202b.m24689a(view, i);
                if (appCompatImageView != null) {
                    i = C17782g.credit_card_image_badge_placeholder;
                    Placeholder placeholder = (Placeholder) C6202b.m24689a(view, i);
                    if (placeholder != null) {
                        i = C17782g.credit_card_image_layout;
                        LayerView layerView = (LayerView) C6202b.m24689a(view, i);
                        if (layerView != null) {
                            i = C17782g.digital_image_badge;
                            NotificationBadgeView notificationBadgeView = (NotificationBadgeView) C6202b.m24689a(view, i);
                            if (notificationBadgeView != null) {
                                i = C17782g.f49716O4;
                                AppCompatTextView appCompatTextView3 = (AppCompatTextView) C6202b.m24689a(view, i);
                                if (appCompatTextView3 != null) {
                                    return new C10025u2((ConstraintLayout) view, appCompatTextView, appCompatTextView2, appCompatImageView, placeholder, layerView, notificationBadgeView, appCompatTextView3);
                                }
                            }
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    /* renamed from: d */
    public static C10025u2 m36770d(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(C17783h.view_credit_card_widget_banner, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return m36769a(inflate);
    }

    /* renamed from: c */
    public ConstraintLayout mo3946b() {
        return this.f27610d;
    }
}
