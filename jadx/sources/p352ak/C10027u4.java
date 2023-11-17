package p352ak;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import p086g1.C6201a;
import p086g1.C6202b;
import p341ge.bog.designsystem.components.notificationbadges.NotificationBadgeView;
import p601sg.C17782g;
import p601sg.C17783h;

/* renamed from: ak.u4 */
public final class C10027u4 implements C6201a {

    /* renamed from: d */
    private final ConstraintLayout f27621d;

    /* renamed from: e */
    public final AppCompatTextView f27622e;

    /* renamed from: f */
    public final NotificationBadgeView f27623f;

    /* renamed from: g */
    public final AppCompatImageView f27624g;

    /* renamed from: h */
    public final LinearLayout f27625h;

    /* renamed from: i */
    public final AppCompatTextView f27626i;

    private C10027u4(ConstraintLayout constraintLayout, AppCompatTextView appCompatTextView, NotificationBadgeView notificationBadgeView, AppCompatImageView appCompatImageView, LinearLayout linearLayout, AppCompatTextView appCompatTextView2) {
        this.f27621d = constraintLayout;
        this.f27622e = appCompatTextView;
        this.f27623f = notificationBadgeView;
        this.f27624g = appCompatImageView;
        this.f27625h = linearLayout;
        this.f27626i = appCompatTextView2;
    }

    /* renamed from: a */
    public static C10027u4 m36776a(View view) {
        int i = C17782g.f49676C;
        AppCompatTextView appCompatTextView = (AppCompatTextView) C6202b.m24689a(view, i);
        if (appCompatTextView != null) {
            i = C17782g.f49742X;
            NotificationBadgeView notificationBadgeView = (NotificationBadgeView) C6202b.m24689a(view, i);
            if (notificationBadgeView != null) {
                i = C17782g.f49787r4;
                AppCompatImageView appCompatImageView = (AppCompatImageView) C6202b.m24689a(view, i);
                if (appCompatImageView != null) {
                    i = C17782g.f49794t4;
                    LinearLayout linearLayout = (LinearLayout) C6202b.m24689a(view, i);
                    if (linearLayout != null) {
                        i = C17782g.f49745Y8;
                        AppCompatTextView appCompatTextView2 = (AppCompatTextView) C6202b.m24689a(view, i);
                        if (appCompatTextView2 != null) {
                            return new C10027u4((ConstraintLayout) view, appCompatTextView, notificationBadgeView, appCompatImageView, linearLayout, appCompatTextView2);
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    /* renamed from: d */
    public static C10027u4 m36777d(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(C17783h.view_product_group_square, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return m36776a(inflate);
    }

    /* renamed from: c */
    public ConstraintLayout mo3946b() {
        return this.f27621d;
    }
}
