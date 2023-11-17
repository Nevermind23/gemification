package p352ak;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import p086g1.C6201a;
import p341ge.bog.designsystem.components.notificationbadgetext.NotificationBadgeTextView;
import p601sg.C17783h;

/* renamed from: ak.t */
public final class C10015t implements C6201a {

    /* renamed from: d */
    private final NotificationBadgeTextView f27548d;

    /* renamed from: e */
    public final NotificationBadgeTextView f27549e;

    private C10015t(NotificationBadgeTextView notificationBadgeTextView, NotificationBadgeTextView notificationBadgeTextView2) {
        this.f27548d = notificationBadgeTextView;
        this.f27549e = notificationBadgeTextView2;
    }

    /* renamed from: a */
    public static C10015t m36733a(View view) {
        if (view != null) {
            NotificationBadgeTextView notificationBadgeTextView = (NotificationBadgeTextView) view;
            return new C10015t(notificationBadgeTextView, notificationBadgeTextView);
        }
        throw new NullPointerException("rootView");
    }

    /* renamed from: d */
    public static C10015t m36734d(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(C17783h.item_thumbnail_badge_card_info, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return m36733a(inflate);
    }

    /* renamed from: c */
    public NotificationBadgeTextView mo3946b() {
        return this.f27548d;
    }
}
