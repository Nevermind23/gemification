package p352ak;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.constraintlayout.widget.Barrier;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.Guideline;
import com.airbnb.lottie.LottieAnimationView;
import p086g1.C6201a;
import p086g1.C6202b;
import p341ge.bog.designsystem.components.buttons.Button;
import p341ge.bog.designsystem.components.layersandshadows.LayerView;
import p341ge.bog.designsystem.components.notificationbadges.NotificationBadgeView;
import p341ge.bog.designsystem.components.statusbadge.StatusBadgeView;
import p601sg.C17782g;
import p601sg.C17783h;

/* renamed from: ak.t0 */
public final class C10016t0 implements C6201a {

    /* renamed from: A */
    public final Guideline f27550A;

    /* renamed from: B */
    public final Guideline f27551B;

    /* renamed from: d */
    private final LayerView f27552d;

    /* renamed from: e */
    public final AppCompatTextView f27553e;

    /* renamed from: f */
    public final LottieAnimationView f27554f;

    /* renamed from: g */
    public final AppCompatTextView f27555g;

    /* renamed from: h */
    public final AppCompatImageView f27556h;

    /* renamed from: i */
    public final LayerView f27557i;

    /* renamed from: j */
    public final LinearLayout f27558j;

    /* renamed from: k */
    public final AppCompatTextView f27559k;

    /* renamed from: l */
    public final Guideline f27560l;

    /* renamed from: m */
    public final Guideline f27561m;

    /* renamed from: n */
    public final Guideline f27562n;

    /* renamed from: o */
    public final Button f27563o;

    /* renamed from: p */
    public final AppCompatImageView f27564p;

    /* renamed from: q */
    public final ConstraintLayout f27565q;

    /* renamed from: r */
    public final Barrier f27566r;

    /* renamed from: s */
    public final Guideline f27567s;

    /* renamed from: t */
    public final Barrier f27568t;

    /* renamed from: u */
    public final Barrier f27569u;

    /* renamed from: v */
    public final Barrier f27570v;

    /* renamed from: w */
    public final AppCompatImageView f27571w;

    /* renamed from: x */
    public final NotificationBadgeView f27572x;

    /* renamed from: y */
    public final Guideline f27573y;

    /* renamed from: z */
    public final StatusBadgeView f27574z;

    private C10016t0(LayerView layerView, AppCompatTextView appCompatTextView, LottieAnimationView lottieAnimationView, AppCompatTextView appCompatTextView2, AppCompatImageView appCompatImageView, LayerView layerView2, LinearLayout linearLayout, AppCompatTextView appCompatTextView3, Guideline guideline, Guideline guideline2, Guideline guideline3, Button button, AppCompatImageView appCompatImageView2, ConstraintLayout constraintLayout, Barrier barrier, Guideline guideline4, Barrier barrier2, Barrier barrier3, Barrier barrier4, AppCompatImageView appCompatImageView3, NotificationBadgeView notificationBadgeView, Guideline guideline5, StatusBadgeView statusBadgeView, Guideline guideline6, Guideline guideline7) {
        this.f27552d = layerView;
        this.f27553e = appCompatTextView;
        this.f27554f = lottieAnimationView;
        this.f27555g = appCompatTextView2;
        this.f27556h = appCompatImageView;
        this.f27557i = layerView2;
        this.f27558j = linearLayout;
        this.f27559k = appCompatTextView3;
        this.f27560l = guideline;
        this.f27561m = guideline2;
        this.f27562n = guideline3;
        this.f27563o = button;
        this.f27564p = appCompatImageView2;
        this.f27565q = constraintLayout;
        this.f27566r = barrier;
        this.f27567s = guideline4;
        this.f27568t = barrier2;
        this.f27569u = barrier3;
        this.f27570v = barrier4;
        this.f27571w = appCompatImageView3;
        this.f27572x = notificationBadgeView;
        this.f27573y = guideline5;
        this.f27574z = statusBadgeView;
        this.f27550A = guideline6;
        this.f27551B = guideline7;
    }

    /* renamed from: a */
    public static C10016t0 m36737a(View view) {
        View view2 = view;
        int i = C17782g.action_card_bot_text;
        AppCompatTextView appCompatTextView = (AppCompatTextView) C6202b.m24689a(view2, i);
        if (appCompatTextView != null) {
            i = C17782g.action_card_icon;
            LottieAnimationView lottieAnimationView = (LottieAnimationView) C6202b.m24689a(view2, i);
            if (lottieAnimationView != null) {
                i = C17782g.action_card_mid_text;
                AppCompatTextView appCompatTextView2 = (AppCompatTextView) C6202b.m24689a(view2, i);
                if (appCompatTextView2 != null) {
                    i = C17782g.action_card_oval_icon;
                    AppCompatImageView appCompatImageView = (AppCompatImageView) C6202b.m24689a(view2, i);
                    if (appCompatImageView != null) {
                        i = C17782g.action_card_oval_icon_container;
                        LayerView layerView = (LayerView) C6202b.m24689a(view2, i);
                        if (layerView != null) {
                            i = C17782g.action_card_texts;
                            LinearLayout linearLayout = (LinearLayout) C6202b.m24689a(view2, i);
                            if (linearLayout != null) {
                                i = C17782g.action_card_top_text;
                                AppCompatTextView appCompatTextView3 = (AppCompatTextView) C6202b.m24689a(view2, i);
                                if (appCompatTextView3 != null) {
                                    i = C17782g.f49786r0;
                                    Guideline guideline = (Guideline) C6202b.m24689a(view2, i);
                                    if (guideline != null) {
                                        i = C17782g.bottom_guideline_vertical_mode;
                                        Guideline guideline2 = (Guideline) C6202b.m24689a(view2, i);
                                        if (guideline2 != null) {
                                            i = C17782g.bottom_guideline_with_button;
                                            Guideline guideline3 = (Guideline) C6202b.m24689a(view2, i);
                                            if (guideline3 != null) {
                                                i = C17782g.f49680D0;
                                                Button button = (Button) C6202b.m24689a(view2, i);
                                                if (button != null) {
                                                    i = C17782g.chevron_icon;
                                                    AppCompatImageView appCompatImageView2 = (AppCompatImageView) C6202b.m24689a(view2, i);
                                                    if (appCompatImageView2 != null) {
                                                        i = C17782g.f49734V1;
                                                        ConstraintLayout constraintLayout = (ConstraintLayout) C6202b.m24689a(view2, i);
                                                        if (constraintLayout != null) {
                                                            i = C17782g.end_elements_barrier;
                                                            Barrier barrier = (Barrier) C6202b.m24689a(view2, i);
                                                            if (barrier != null) {
                                                                i = C17782g.f49757f3;
                                                                Guideline guideline4 = (Guideline) C6202b.m24689a(view2, i);
                                                                if (guideline4 != null) {
                                                                    i = C17782g.icon_barrier_bottom;
                                                                    Barrier barrier2 = (Barrier) C6202b.m24689a(view2, i);
                                                                    if (barrier2 != null) {
                                                                        i = C17782g.icon_barrier_horizontal;
                                                                        Barrier barrier3 = (Barrier) C6202b.m24689a(view2, i);
                                                                        if (barrier3 != null) {
                                                                            i = C17782g.icon_barrier_top;
                                                                            Barrier barrier4 = (Barrier) C6202b.m24689a(view2, i);
                                                                            if (barrier4 != null) {
                                                                                i = C17782g.f49747Z5;
                                                                                AppCompatImageView appCompatImageView3 = (AppCompatImageView) C6202b.m24689a(view2, i);
                                                                                if (appCompatImageView3 != null) {
                                                                                    i = C17782g.f49763h6;
                                                                                    NotificationBadgeView notificationBadgeView = (NotificationBadgeView) C6202b.m24689a(view2, i);
                                                                                    if (notificationBadgeView != null) {
                                                                                        i = C17782g.f49723R7;
                                                                                        Guideline guideline5 = (Guideline) C6202b.m24689a(view2, i);
                                                                                        if (guideline5 != null) {
                                                                                            i = C17782g.status_badge;
                                                                                            StatusBadgeView statusBadgeView = (StatusBadgeView) C6202b.m24689a(view2, i);
                                                                                            if (statusBadgeView != null) {
                                                                                                i = C17782g.f49785q9;
                                                                                                Guideline guideline6 = (Guideline) C6202b.m24689a(view2, i);
                                                                                                if (guideline6 != null) {
                                                                                                    i = C17782g.top_guideline_vertical_mode;
                                                                                                    Guideline guideline7 = (Guideline) C6202b.m24689a(view2, i);
                                                                                                    if (guideline7 != null) {
                                                                                                        return new C10016t0((LayerView) view2, appCompatTextView, lottieAnimationView, appCompatTextView2, appCompatImageView, layerView, linearLayout, appCompatTextView3, guideline, guideline2, guideline3, button, appCompatImageView2, constraintLayout, barrier, guideline4, barrier2, barrier3, barrier4, appCompatImageView3, notificationBadgeView, guideline5, statusBadgeView, guideline6, guideline7);
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
    public static C10016t0 m36738d(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(C17783h.view_acton_card, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return m36737a(inflate);
    }

    /* renamed from: c */
    public LayerView mo3946b() {
        return this.f27552d;
    }
}
