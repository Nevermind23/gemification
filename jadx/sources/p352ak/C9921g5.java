package p352ak;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import p086g1.C6201a;
import p086g1.C6202b;
import p341ge.bog.designsystem.components.statusbadge.StatusBadgeView;
import p601sg.C17782g;
import p601sg.C17783h;

/* renamed from: ak.g5 */
public final class C9921g5 implements C6201a {

    /* renamed from: d */
    private final View f27032d;

    /* renamed from: e */
    public final StatusBadgeView f27033e;

    /* renamed from: f */
    public final ConstraintLayout f27034f;

    /* renamed from: g */
    public final AppCompatImageView f27035g;

    /* renamed from: h */
    public final AppCompatTextView f27036h;

    private C9921g5(View view, StatusBadgeView statusBadgeView, ConstraintLayout constraintLayout, AppCompatImageView appCompatImageView, AppCompatTextView appCompatTextView) {
        this.f27032d = view;
        this.f27033e = statusBadgeView;
        this.f27034f = constraintLayout;
        this.f27035g = appCompatImageView;
        this.f27036h = appCompatTextView;
    }

    /* renamed from: a */
    public static C9921g5 m36391a(View view) {
        int i = C17782g.status_badge_icon;
        StatusBadgeView statusBadgeView = (StatusBadgeView) C6202b.m24689a(view, i);
        if (statusBadgeView != null) {
            i = C17782g.steps_container;
            ConstraintLayout constraintLayout = (ConstraintLayout) C6202b.m24689a(view, i);
            if (constraintLayout != null) {
                i = C17782g.steps_icon;
                AppCompatImageView appCompatImageView = (AppCompatImageView) C6202b.m24689a(view, i);
                if (appCompatImageView != null) {
                    i = C17782g.steps_text;
                    AppCompatTextView appCompatTextView = (AppCompatTextView) C6202b.m24689a(view, i);
                    if (appCompatTextView != null) {
                        return new C9921g5(view, statusBadgeView, constraintLayout, appCompatImageView, appCompatTextView);
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    /* renamed from: c */
    public static C9921g5 m36392c(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        if (viewGroup != null) {
            layoutInflater.inflate(C17783h.view_steps, viewGroup);
            return m36391a(viewGroup);
        }
        throw new NullPointerException("parent");
    }

    /* renamed from: b */
    public View mo3946b() {
        return this.f27032d;
    }
}
