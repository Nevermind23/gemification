package h80;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import p086g1.C6201a;
import p086g1.C6202b;
import p341ge.bog.designsystem.components.notificationbadges.NotificationBadgeView;
import u70.C28606b;
import u70.C28607c;

/* renamed from: h80.o */
public final class C24908o implements C6201a {

    /* renamed from: d */
    private final LinearLayout f64037d;

    /* renamed from: e */
    public final NotificationBadgeView f64038e;

    /* renamed from: f */
    public final TextView f64039f;

    private C24908o(LinearLayout linearLayout, NotificationBadgeView notificationBadgeView, TextView textView) {
        this.f64037d = linearLayout;
        this.f64038e = notificationBadgeView;
        this.f64039f = textView;
    }

    /* renamed from: a */
    public static C24908o m79617a(View view) {
        int i = C28606b.f72598h;
        NotificationBadgeView notificationBadgeView = (NotificationBadgeView) C6202b.m24689a(view, i);
        if (notificationBadgeView != null) {
            i = C28606b.f72590W;
            TextView textView = (TextView) C6202b.m24689a(view, i);
            if (textView != null) {
                return new C24908o((LinearLayout) view, notificationBadgeView, textView);
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    /* renamed from: d */
    public static C24908o m79618d(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(C28607c.client_limit_info_item, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return m79617a(inflate);
    }

    /* renamed from: c */
    public LinearLayout mo3946b() {
        return this.f64037d;
    }
}
