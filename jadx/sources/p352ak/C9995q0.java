package p352ak;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.cardview.widget.CardView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.Guideline;
import p086g1.C6201a;
import p086g1.C6202b;
import p341ge.bog.designsystem.components.multipledots.HideableAmountView;
import p341ge.bog.designsystem.components.statusbadge.StatusBadgeView;
import p601sg.C17782g;
import p601sg.C17783h;

/* renamed from: ak.q0 */
public final class C9995q0 implements C6201a {

    /* renamed from: d */
    private final View f27410d;

    /* renamed from: e */
    public final TextView f27411e;

    /* renamed from: f */
    public final AppCompatImageView f27412f;

    /* renamed from: g */
    public final CardView f27413g;

    /* renamed from: h */
    public final Guideline f27414h;

    /* renamed from: i */
    public final TextView f27415i;

    /* renamed from: j */
    public final StatusBadgeView f27416j;

    /* renamed from: k */
    public final ConstraintLayout f27417k;

    /* renamed from: l */
    public final HideableAmountView f27418l;

    private C9995q0(View view, TextView textView, AppCompatImageView appCompatImageView, CardView cardView, Guideline guideline, TextView textView2, StatusBadgeView statusBadgeView, ConstraintLayout constraintLayout, HideableAmountView hideableAmountView) {
        this.f27410d = view;
        this.f27411e = textView;
        this.f27412f = appCompatImageView;
        this.f27413g = cardView;
        this.f27414h = guideline;
        this.f27415i = textView2;
        this.f27416j = statusBadgeView;
        this.f27417k = constraintLayout;
        this.f27418l = hideableAmountView;
    }

    /* renamed from: a */
    public static C9995q0 m36659a(View view) {
        int i = C17782g.f49703L;
        TextView textView = (TextView) C6202b.m24689a(view, i);
        if (textView != null) {
            i = C17782g.end_icon_image;
            AppCompatImageView appCompatImageView = (AppCompatImageView) C6202b.m24689a(view, i);
            if (appCompatImageView != null) {
                i = C17782g.end_image_layout;
                CardView cardView = (CardView) C6202b.m24689a(view, i);
                if (cardView != null) {
                    i = C17782g.guide;
                    Guideline guideline = (Guideline) C6202b.m24689a(view, i);
                    if (guideline != null) {
                        i = C17782g.f49729T3;
                        TextView textView2 = (TextView) C6202b.m24689a(view, i);
                        if (textView2 != null) {
                            i = C17782g.status_badge_icon;
                            StatusBadgeView statusBadgeView = (StatusBadgeView) C6202b.m24689a(view, i);
                            if (statusBadgeView != null) {
                                i = C17782g.text_input_layout;
                                ConstraintLayout constraintLayout = (ConstraintLayout) C6202b.m24689a(view, i);
                                if (constraintLayout != null) {
                                    i = C17782g.total_amount_container;
                                    HideableAmountView hideableAmountView = (HideableAmountView) C6202b.m24689a(view, i);
                                    if (hideableAmountView != null) {
                                        return new C9995q0(view, textView, appCompatImageView, cardView, guideline, textView2, statusBadgeView, constraintLayout, hideableAmountView);
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
    public static C9995q0 m36660c(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        if (viewGroup != null) {
            layoutInflater.inflate(C17783h.view_account_picker, viewGroup);
            return m36659a(viewGroup);
        }
        throw new NullPointerException("parent");
    }

    /* renamed from: b */
    public View mo3946b() {
        return this.f27410d;
    }
}
