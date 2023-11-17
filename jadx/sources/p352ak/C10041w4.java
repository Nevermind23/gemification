package p352ak;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import p086g1.C6201a;
import p086g1.C6202b;
import p341ge.bog.designsystem.components.badgecontainer.BadgeContainer;
import p341ge.bog.designsystem.components.creditcard.badge.CreditCardsBadgeView;
import p341ge.bog.designsystem.components.multipledots.HideableAmountView;
import p601sg.C17782g;
import p601sg.C17783h;

/* renamed from: ak.w4 */
public final class C10041w4 implements C6201a {

    /* renamed from: d */
    private final ConstraintLayout f27698d;

    /* renamed from: e */
    public final AppCompatTextView f27699e;

    /* renamed from: f */
    public final HideableAmountView f27700f;

    /* renamed from: g */
    public final AppCompatTextView f27701g;

    /* renamed from: h */
    public final CreditCardsBadgeView f27702h;

    /* renamed from: i */
    public final BadgeContainer f27703i;

    /* renamed from: j */
    public final AppCompatImageView f27704j;

    private C10041w4(ConstraintLayout constraintLayout, AppCompatTextView appCompatTextView, HideableAmountView hideableAmountView, AppCompatTextView appCompatTextView2, CreditCardsBadgeView creditCardsBadgeView, BadgeContainer badgeContainer, AppCompatImageView appCompatImageView) {
        this.f27698d = constraintLayout;
        this.f27699e = appCompatTextView;
        this.f27700f = hideableAmountView;
        this.f27701g = appCompatTextView2;
        this.f27702h = creditCardsBadgeView;
        this.f27703i = badgeContainer;
        this.f27704j = appCompatImageView;
    }

    /* renamed from: a */
    public static C10041w4 m36828a(View view) {
        int i = C17782g.f49703L;
        AppCompatTextView appCompatTextView = (AppCompatTextView) C6202b.m24689a(view, i);
        if (appCompatTextView != null) {
            i = C17782g.amount_text_hideable;
            HideableAmountView hideableAmountView = (HideableAmountView) C6202b.m24689a(view, i);
            if (hideableAmountView != null) {
                i = C17782g.card_title_text;
                AppCompatTextView appCompatTextView2 = (AppCompatTextView) C6202b.m24689a(view, i);
                if (appCompatTextView2 != null) {
                    i = C17782g.credit_cards;
                    CreditCardsBadgeView creditCardsBadgeView = (CreditCardsBadgeView) C6202b.m24689a(view, i);
                    if (creditCardsBadgeView != null) {
                        i = C17782g.info_status_badges;
                        BadgeContainer badgeContainer = (BadgeContainer) C6202b.m24689a(view, i);
                        if (badgeContainer != null) {
                            i = C17782g.is_favourite_icon;
                            AppCompatImageView appCompatImageView = (AppCompatImageView) C6202b.m24689a(view, i);
                            if (appCompatImageView != null) {
                                return new C10041w4((ConstraintLayout) view, appCompatTextView, hideableAmountView, appCompatTextView2, creditCardsBadgeView, badgeContainer, appCompatImageView);
                            }
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    /* renamed from: d */
    public static C10041w4 m36829d(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(C17783h.view_product_inside_card, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return m36828a(inflate);
    }

    /* renamed from: c */
    public ConstraintLayout mo3946b() {
        return this.f27698d;
    }
}
