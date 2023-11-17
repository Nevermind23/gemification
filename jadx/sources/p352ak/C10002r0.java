package p352ak;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.cardview.widget.CardView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.Guideline;
import androidx.recyclerview.widget.RecyclerView;
import p086g1.C6201a;
import p086g1.C6202b;
import p341ge.bog.designsystem.components.badgecontainer.BadgeContainer;
import p341ge.bog.designsystem.components.buttons.Button;
import p341ge.bog.designsystem.components.common.CropImageView;
import p341ge.bog.designsystem.components.layersandshadows.LayerView;
import p341ge.bog.designsystem.components.multipledots.HideableAmountView;
import p341ge.bog.designsystem.components.notificationbadges.NotificationBadgeView;
import p601sg.C17782g;
import p601sg.C17783h;

/* renamed from: ak.r0 */
public final class C10002r0 implements C6201a {

    /* renamed from: d */
    private final FrameLayout f27441d;

    /* renamed from: e */
    public final AppCompatImageView f27442e;

    /* renamed from: f */
    public final LinearLayout f27443f;

    /* renamed from: g */
    public final ConstraintLayout f27444g;

    /* renamed from: h */
    public final AppCompatImageView f27445h;

    /* renamed from: i */
    public final AppCompatTextView f27446i;

    /* renamed from: j */
    public final AppCompatTextView f27447j;

    /* renamed from: k */
    public final NotificationBadgeView f27448k;

    /* renamed from: l */
    public final TextView f27449l;

    /* renamed from: m */
    public final BadgeContainer f27450m;

    /* renamed from: n */
    public final RecyclerView f27451n;

    /* renamed from: o */
    public final Button f27452o;

    /* renamed from: p */
    public final CropImageView f27453p;

    /* renamed from: q */
    public final Guideline f27454q;

    /* renamed from: r */
    public final CardView f27455r;

    /* renamed from: s */
    public final LayerView f27456s;

    /* renamed from: t */
    public final HideableAmountView f27457t;

    private C10002r0(FrameLayout frameLayout, AppCompatImageView appCompatImageView, LinearLayout linearLayout, ConstraintLayout constraintLayout, AppCompatImageView appCompatImageView2, AppCompatTextView appCompatTextView, AppCompatTextView appCompatTextView2, NotificationBadgeView notificationBadgeView, TextView textView, BadgeContainer badgeContainer, RecyclerView recyclerView, Button button, CropImageView cropImageView, Guideline guideline, CardView cardView, LayerView layerView, HideableAmountView hideableAmountView) {
        this.f27441d = frameLayout;
        this.f27442e = appCompatImageView;
        this.f27443f = linearLayout;
        this.f27444g = constraintLayout;
        this.f27445h = appCompatImageView2;
        this.f27446i = appCompatTextView;
        this.f27447j = appCompatTextView2;
        this.f27448k = notificationBadgeView;
        this.f27449l = textView;
        this.f27450m = badgeContainer;
        this.f27451n = recyclerView;
        this.f27452o = button;
        this.f27453p = cropImageView;
        this.f27454q = guideline;
        this.f27455r = cardView;
        this.f27456s = layerView;
        this.f27457t = hideableAmountView;
    }

    /* renamed from: a */
    public static C10002r0 m36684a(View view) {
        View view2 = view;
        int i = C17782g.account_background_image;
        AppCompatImageView appCompatImageView = (AppCompatImageView) C6202b.m24689a(view2, i);
        if (appCompatImageView != null) {
            i = C17782g.account_selector_currencies_container;
            LinearLayout linearLayout = (LinearLayout) C6202b.m24689a(view2, i);
            if (linearLayout != null) {
                i = C17782g.account_selector_header_layout;
                ConstraintLayout constraintLayout = (ConstraintLayout) C6202b.m24689a(view2, i);
                if (constraintLayout != null) {
                    i = C17782g.account_selector_primary_star_icon;
                    AppCompatImageView appCompatImageView2 = (AppCompatImageView) C6202b.m24689a(view2, i);
                    if (appCompatImageView2 != null) {
                        i = C17782g.account_title_text;
                        AppCompatTextView appCompatTextView = (AppCompatTextView) C6202b.m24689a(view2, i);
                        if (appCompatTextView != null) {
                            i = C17782g.account_total_amount_text;
                            AppCompatTextView appCompatTextView2 = (AppCompatTextView) C6202b.m24689a(view2, i);
                            if (appCompatTextView2 != null) {
                                i = C17782g.active_badge;
                                NotificationBadgeView notificationBadgeView = (NotificationBadgeView) C6202b.m24689a(view2, i);
                                if (notificationBadgeView != null) {
                                    i = C17782g.choose_currency_text;
                                    TextView textView = (TextView) C6202b.m24689a(view2, i);
                                    if (textView != null) {
                                        i = C17782g.currencies_info_container;
                                        BadgeContainer badgeContainer = (BadgeContainer) C6202b.m24689a(view2, i);
                                        if (badgeContainer != null) {
                                            i = C17782g.f49774n2;
                                            RecyclerView recyclerView = (RecyclerView) C6202b.m24689a(view2, i);
                                            if (recyclerView != null) {
                                                i = C17782g.expand_chevron_image;
                                                Button button = (Button) C6202b.m24689a(view2, i);
                                                if (button != null) {
                                                    i = C17782g.full_background_image;
                                                    CropImageView cropImageView = (CropImageView) C6202b.m24689a(view2, i);
                                                    if (cropImageView != null) {
                                                        i = C17782g.guide;
                                                        Guideline guideline = (Guideline) C6202b.m24689a(view2, i);
                                                        if (guideline != null) {
                                                            i = C17782g.f49803v4;
                                                            CardView cardView = (CardView) C6202b.m24689a(view2, i);
                                                            if (cardView != null) {
                                                                i = C17782g.f49767j5;
                                                                LayerView layerView = (LayerView) C6202b.m24689a(view2, i);
                                                                if (layerView != null) {
                                                                    i = C17782g.total_amount_container;
                                                                    HideableAmountView hideableAmountView = (HideableAmountView) C6202b.m24689a(view2, i);
                                                                    if (hideableAmountView != null) {
                                                                        return new C10002r0((FrameLayout) view2, appCompatImageView, linearLayout, constraintLayout, appCompatImageView2, appCompatTextView, appCompatTextView2, notificationBadgeView, textView, badgeContainer, recyclerView, button, cropImageView, guideline, cardView, layerView, hideableAmountView);
                                                                    }
                                                                }
                                                            }
                                                        }
                                                    }
                                                }
                                            }
                                        }
                                    }
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
    public static C10002r0 m36685d(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(C17783h.view_account_selector_item, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return m36684a(inflate);
    }

    /* renamed from: c */
    public FrameLayout mo3946b() {
        return this.f27441d;
    }
}
