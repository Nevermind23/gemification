package p91;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.constraintlayout.widget.ConstraintLayout;
import l91.C37116c;
import l91.C37117d;
import p086g1.C6201a;
import p086g1.C6202b;
import p341ge.bog.designsystem.components.notificationbadges.NotificationBadgeView;

/* renamed from: p91.c */
public final class C37932c implements C6201a {

    /* renamed from: d */
    private final ConstraintLayout f91059d;

    /* renamed from: e */
    public final AppCompatImageView f91060e;

    /* renamed from: f */
    public final FrameLayout f91061f;

    /* renamed from: g */
    public final NotificationBadgeView f91062g;

    private C37932c(ConstraintLayout constraintLayout, AppCompatImageView appCompatImageView, FrameLayout frameLayout, NotificationBadgeView notificationBadgeView) {
        this.f91059d = constraintLayout;
        this.f91060e = appCompatImageView;
        this.f91061f = frameLayout;
        this.f91062g = notificationBadgeView;
    }

    /* renamed from: a */
    public static C37932c m111483a(View view) {
        int i = C37116c.f89311b;
        AppCompatImageView appCompatImageView = (AppCompatImageView) C6202b.m24689a(view, i);
        if (appCompatImageView != null) {
            i = C37116c.item_container;
            FrameLayout frameLayout = (FrameLayout) C6202b.m24689a(view, i);
            if (frameLayout != null) {
                i = C37116c.f89318q;
                NotificationBadgeView notificationBadgeView = (NotificationBadgeView) C6202b.m24689a(view, i);
                if (notificationBadgeView != null) {
                    return new C37932c((ConstraintLayout) view, appCompatImageView, frameLayout, notificationBadgeView);
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    /* renamed from: d */
    public static C37932c m111484d(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(C37117d.item_prelogin_background, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return m111483a(inflate);
    }

    /* renamed from: c */
    public ConstraintLayout mo3946b() {
        return this.f91059d;
    }
}
