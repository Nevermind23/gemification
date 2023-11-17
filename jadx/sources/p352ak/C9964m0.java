package p352ak;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.appcompat.widget.AppCompatTextView;
import p086g1.C6201a;
import p086g1.C6202b;
import p341ge.bog.designsystem.components.notificationbadges.NotificationBadgeView;
import p601sg.C17782g;
import p601sg.C17783h;

/* renamed from: ak.m0 */
public final class C9964m0 implements C6201a {

    /* renamed from: d */
    private final LinearLayout f27260d;

    /* renamed from: e */
    public final NotificationBadgeView f27261e;

    /* renamed from: f */
    public final AppCompatTextView f27262f;

    private C9964m0(LinearLayout linearLayout, NotificationBadgeView notificationBadgeView, AppCompatTextView appCompatTextView) {
        this.f27260d = linearLayout;
        this.f27261e = notificationBadgeView;
        this.f27262f = appCompatTextView;
    }

    /* renamed from: a */
    public static C9964m0 m36546a(View view) {
        int i = C17782g.badge_view;
        NotificationBadgeView notificationBadgeView = (NotificationBadgeView) C6202b.m24689a(view, i);
        if (notificationBadgeView != null) {
            i = C17782g.f49816z8;
            AppCompatTextView appCompatTextView = (AppCompatTextView) C6202b.m24689a(view, i);
            if (appCompatTextView != null) {
                return new C9964m0((LinearLayout) view, notificationBadgeView, appCompatTextView);
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    /* renamed from: d */
    public static C9964m0 m36547d(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(C17783h.notification_badge_text_view, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return m36546a(inflate);
    }

    /* renamed from: c */
    public LinearLayout mo3946b() {
        return this.f27260d;
    }
}
