package p352ak;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.appcompat.widget.AppCompatTextView;
import p086g1.C6201a;
import p086g1.C6202b;
import p341ge.bog.designsystem.components.notificationbadges.NotificationBadgeView;
import p601sg.C17782g;
import p601sg.C17783h;

/* renamed from: ak.t1 */
public final class C10017t1 implements C6201a {

    /* renamed from: d */
    private final LinearLayout f27575d;

    /* renamed from: e */
    public final NotificationBadgeView f27576e;

    /* renamed from: f */
    public final AppCompatImageView f27577f;

    /* renamed from: g */
    public final AppCompatTextView f27578g;

    private C10017t1(LinearLayout linearLayout, NotificationBadgeView notificationBadgeView, AppCompatImageView appCompatImageView, AppCompatTextView appCompatTextView) {
        this.f27575d = linearLayout;
        this.f27576e = notificationBadgeView;
        this.f27577f = appCompatImageView;
        this.f27578g = appCompatTextView;
    }

    /* renamed from: a */
    public static C10017t1 m36741a(View view) {
        int i = C17782g.badge_view;
        NotificationBadgeView notificationBadgeView = (NotificationBadgeView) C6202b.m24689a(view, i);
        if (notificationBadgeView != null) {
            i = C17782g.f49783q4;
            AppCompatImageView appCompatImageView = (AppCompatImageView) C6202b.m24689a(view, i);
            if (appCompatImageView != null) {
                i = C17782g.f49701K8;
                AppCompatTextView appCompatTextView = (AppCompatTextView) C6202b.m24689a(view, i);
                if (appCompatTextView != null) {
                    return new C10017t1((LinearLayout) view, notificationBadgeView, appCompatImageView, appCompatTextView);
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    /* renamed from: d */
    public static C10017t1 m36742d(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(C17783h.view_button_small_icon, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return m36741a(inflate);
    }

    /* renamed from: c */
    public LinearLayout mo3946b() {
        return this.f27575d;
    }
}
