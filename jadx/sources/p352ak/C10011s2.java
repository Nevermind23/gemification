package p352ak;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import p086g1.C6201a;
import p086g1.C6202b;
import p341ge.bog.designsystem.components.buttons.Button;
import p341ge.bog.designsystem.components.creditcard.badge.CreditCardsBadgeView;
import p341ge.bog.designsystem.components.layersandshadows.LayerView;
import p341ge.bog.designsystem.components.multipledots.HideableAmountView;
import p341ge.bog.designsystem.components.notificationbadges.NotificationBadgeView;
import p601sg.C17782g;
import p601sg.C17783h;

/* renamed from: ak.s2 */
public final class C10011s2 implements C6201a {

    /* renamed from: d */
    private final View f27495d;

    /* renamed from: e */
    public final HideableAmountView f27496e;

    /* renamed from: f */
    public final ConstraintLayout f27497f;

    /* renamed from: g */
    public final NotificationBadgeView f27498g;

    /* renamed from: h */
    public final AppCompatTextView f27499h;

    /* renamed from: i */
    public final AppCompatImageView f27500i;

    /* renamed from: j */
    public final Button f27501j;

    /* renamed from: k */
    public final TextView f27502k;

    /* renamed from: l */
    public final AppCompatTextView f27503l;

    /* renamed from: m */
    public final LayerView f27504m;

    /* renamed from: n */
    public final FrameLayout f27505n;

    /* renamed from: o */
    public final AppCompatTextView f27506o;

    /* renamed from: p */
    public final CreditCardsBadgeView f27507p;

    /* renamed from: q */
    public final TextView f27508q;

    private C10011s2(View view, HideableAmountView hideableAmountView, ConstraintLayout constraintLayout, NotificationBadgeView notificationBadgeView, AppCompatTextView appCompatTextView, AppCompatImageView appCompatImageView, Button button, TextView textView, AppCompatTextView appCompatTextView2, LayerView layerView, FrameLayout frameLayout, AppCompatTextView appCompatTextView3, CreditCardsBadgeView creditCardsBadgeView, TextView textView2) {
        this.f27495d = view;
        this.f27496e = hideableAmountView;
        this.f27497f = constraintLayout;
        this.f27498g = notificationBadgeView;
        this.f27499h = appCompatTextView;
        this.f27500i = appCompatImageView;
        this.f27501j = button;
        this.f27502k = textView;
        this.f27503l = appCompatTextView2;
        this.f27504m = layerView;
        this.f27505n = frameLayout;
        this.f27506o = appCompatTextView3;
        this.f27507p = creditCardsBadgeView;
        this.f27508q = textView2;
    }

    /* renamed from: a */
    public static C10011s2 m36719a(View view) {
        View view2 = view;
        int i = C17782g.amount_text_hideable;
        HideableAmountView hideableAmountView = (HideableAmountView) C6202b.m24689a(view2, i);
        if (hideableAmountView != null) {
            i = C17782g.creditCardActionView;
            ConstraintLayout constraintLayout = (ConstraintLayout) C6202b.m24689a(view2, i);
            if (constraintLayout != null) {
                i = C17782g.credit_card_active_badge;
                NotificationBadgeView notificationBadgeView = (NotificationBadgeView) C6202b.m24689a(view2, i);
                if (notificationBadgeView != null) {
                    i = C17782g.credit_card_amount_text;
                    AppCompatTextView appCompatTextView = (AppCompatTextView) C6202b.m24689a(view2, i);
                    if (appCompatTextView != null) {
                        i = C17782g.credit_card_background_image;
                        AppCompatImageView appCompatImageView = (AppCompatImageView) C6202b.m24689a(view2, i);
                        if (appCompatImageView != null) {
                            i = C17782g.credit_card_chevron_image;
                            Button button = (Button) C6202b.m24689a(view2, i);
                            if (button != null) {
                                i = C17782g.credit_card_error_message;
                                TextView textView = (TextView) C6202b.m24689a(view2, i);
                                if (textView != null) {
                                    i = C17782g.credit_card_expire_date_text;
                                    AppCompatTextView appCompatTextView2 = (AppCompatTextView) C6202b.m24689a(view2, i);
                                    if (appCompatTextView2 != null) {
                                        i = C17782g.credit_card_layer_view;
                                        LayerView layerView = (LayerView) C6202b.m24689a(view2, i);
                                        if (layerView != null) {
                                            i = C17782g.credit_card_layout;
                                            FrameLayout frameLayout = (FrameLayout) C6202b.m24689a(view2, i);
                                            if (frameLayout != null) {
                                                i = C17782g.credit_card_title_text;
                                                AppCompatTextView appCompatTextView3 = (AppCompatTextView) C6202b.m24689a(view2, i);
                                                if (appCompatTextView3 != null) {
                                                    i = C17782g.credit_cards;
                                                    CreditCardsBadgeView creditCardsBadgeView = (CreditCardsBadgeView) C6202b.m24689a(view2, i);
                                                    if (creditCardsBadgeView != null) {
                                                        i = C17782g.empty_credit_card_text;
                                                        TextView textView2 = (TextView) C6202b.m24689a(view2, i);
                                                        if (textView2 != null) {
                                                            return new C10011s2(view, hideableAmountView, constraintLayout, notificationBadgeView, appCompatTextView, appCompatImageView, button, textView, appCompatTextView2, layerView, frameLayout, appCompatTextView3, creditCardsBadgeView, textView2);
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

    /* renamed from: c */
    public static C10011s2 m36720c(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        if (viewGroup != null) {
            layoutInflater.inflate(C17783h.view_credit_card, viewGroup);
            return m36719a(viewGroup);
        }
        throw new NullPointerException("parent");
    }

    /* renamed from: b */
    public View mo3946b() {
        return this.f27495d;
    }
}
