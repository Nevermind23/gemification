package p352ak;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import p086g1.C6201a;
import p341ge.bog.designsystem.components.notificationbadgetext.NotificationBadgeTextView;
import p601sg.C17783h;

/* renamed from: ak.q */
public final class C9994q implements C6201a {

    /* renamed from: d */
    private final NotificationBadgeTextView f27408d;

    /* renamed from: e */
    public final NotificationBadgeTextView f27409e;

    private C9994q(NotificationBadgeTextView notificationBadgeTextView, NotificationBadgeTextView notificationBadgeTextView2) {
        this.f27408d = notificationBadgeTextView;
        this.f27409e = notificationBadgeTextView2;
    }

    /* renamed from: a */
    public static C9994q m36655a(View view) {
        if (view != null) {
            NotificationBadgeTextView notificationBadgeTextView = (NotificationBadgeTextView) view;
            return new C9994q(notificationBadgeTextView, notificationBadgeTextView);
        }
        throw new NullPointerException("rootView");
    }

    /* renamed from: d */
    public static C9994q m36656d(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(C17783h.item_statistics_widget, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return m36655a(inflate);
    }

    /* renamed from: c */
    public NotificationBadgeTextView mo3946b() {
        return this.f27408d;
    }
}
