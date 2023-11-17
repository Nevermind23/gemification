package p352ak;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.appcompat.widget.AppCompatImageView;
import p086g1.C6201a;
import p086g1.C6202b;
import p341ge.bog.designsystem.components.notificationbadges.BadgeRelativeLayout;
import p601sg.C17782g;
import p601sg.C17783h;

/* renamed from: ak.r2 */
public final class C10004r2 implements C6201a {

    /* renamed from: d */
    private final BadgeRelativeLayout f27460d;

    /* renamed from: e */
    public final BadgeRelativeLayout f27461e;

    /* renamed from: f */
    public final AppCompatImageView f27462f;

    private C10004r2(BadgeRelativeLayout badgeRelativeLayout, BadgeRelativeLayout badgeRelativeLayout2, AppCompatImageView appCompatImageView) {
        this.f27460d = badgeRelativeLayout;
        this.f27461e = badgeRelativeLayout2;
        this.f27462f = appCompatImageView;
    }

    /* renamed from: a */
    public static C10004r2 m36692a(View view) {
        BadgeRelativeLayout badgeRelativeLayout = (BadgeRelativeLayout) view;
        int i = C17782g.cardIcon;
        AppCompatImageView appCompatImageView = (AppCompatImageView) C6202b.m24689a(view, i);
        if (appCompatImageView != null) {
            return new C10004r2(badgeRelativeLayout, badgeRelativeLayout, appCompatImageView);
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    /* renamed from: d */
    public static C10004r2 m36693d(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(C17783h.view_credit_card_badge, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return m36692a(inflate);
    }

    /* renamed from: c */
    public BadgeRelativeLayout mo3946b() {
        return this.f27460d;
    }
}
