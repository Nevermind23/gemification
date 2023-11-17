package p352ak;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.appcompat.widget.AppCompatTextView;
import p086g1.C6201a;
import p086g1.C6202b;
import p341ge.bog.designsystem.components.currencybadge.CurrencyBadgeView;
import p341ge.bog.designsystem.components.layersandshadows.LayerView;
import p341ge.bog.designsystem.components.multipledots.HideableAmountView;
import p341ge.bog.designsystem.components.notificationbadges.NotificationBadgeView;
import p601sg.C17782g;
import p601sg.C17783h;

/* renamed from: ak.j2 */
public final class C9942j2 implements C6201a {

    /* renamed from: d */
    private final View f27136d;

    /* renamed from: e */
    public final AppCompatTextView f27137e;

    /* renamed from: f */
    public final HideableAmountView f27138f;

    /* renamed from: g */
    public final NotificationBadgeView f27139g;

    /* renamed from: h */
    public final LayerView f27140h;

    /* renamed from: i */
    public final AppCompatImageView f27141i;

    /* renamed from: j */
    public final CurrencyBadgeView f27142j;

    /* renamed from: k */
    public final AppCompatTextView f27143k;

    private C9942j2(View view, AppCompatTextView appCompatTextView, HideableAmountView hideableAmountView, NotificationBadgeView notificationBadgeView, LayerView layerView, AppCompatImageView appCompatImageView, CurrencyBadgeView currencyBadgeView, AppCompatTextView appCompatTextView2) {
        this.f27136d = view;
        this.f27137e = appCompatTextView;
        this.f27138f = hideableAmountView;
        this.f27139g = notificationBadgeView;
        this.f27140h = layerView;
        this.f27141i = appCompatImageView;
        this.f27142j = currencyBadgeView;
        this.f27143k = appCompatTextView2;
    }

    /* renamed from: a */
    public static C9942j2 m36465a(View view) {
        int i = C17782g.chip_thumbnail_amount_text;
        AppCompatTextView appCompatTextView = (AppCompatTextView) C6202b.m24689a(view, i);
        if (appCompatTextView != null) {
            i = C17782g.chip_thumbnail_amount_text_hideable;
            HideableAmountView hideableAmountView = (HideableAmountView) C6202b.m24689a(view, i);
            if (hideableAmountView != null) {
                i = C17782g.chip_thumbnail_badge_view;
                NotificationBadgeView notificationBadgeView = (NotificationBadgeView) C6202b.m24689a(view, i);
                if (notificationBadgeView != null) {
                    i = C17782g.chip_thumbnail_circle_layer;
                    LayerView layerView = (LayerView) C6202b.m24689a(view, i);
                    if (layerView != null) {
                        i = C17782g.chip_thumbnail_icon_image;
                        AppCompatImageView appCompatImageView = (AppCompatImageView) C6202b.m24689a(view, i);
                        if (appCompatImageView != null) {
                            i = C17782g.chip_thumbnail_icon_text;
                            CurrencyBadgeView currencyBadgeView = (CurrencyBadgeView) C6202b.m24689a(view, i);
                            if (currencyBadgeView != null) {
                                i = C17782g.chip_thumbnail_title_text;
                                AppCompatTextView appCompatTextView2 = (AppCompatTextView) C6202b.m24689a(view, i);
                                if (appCompatTextView2 != null) {
                                    return new C9942j2(view, appCompatTextView, hideableAmountView, notificationBadgeView, layerView, appCompatImageView, currencyBadgeView, appCompatTextView2);
                                }
                            }
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    /* renamed from: c */
    public static C9942j2 m36466c(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        if (viewGroup != null) {
            layoutInflater.inflate(C17783h.view_chip_chumbnail, viewGroup);
            return m36465a(viewGroup);
        }
        throw new NullPointerException("parent");
    }

    /* renamed from: b */
    public View mo3946b() {
        return this.f27136d;
    }
}
