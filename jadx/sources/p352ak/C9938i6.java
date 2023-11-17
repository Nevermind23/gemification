package p352ak;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.appcompat.widget.AppCompatImageView;
import p086g1.C6201a;
import p086g1.C6202b;
import p341ge.bog.designsystem.components.notificationbadges.BadgeRelativeLayout;
import p601sg.C17782g;
import p601sg.C17783h;

/* renamed from: ak.i6 */
public final class C9938i6 implements C6201a {

    /* renamed from: d */
    private final View f27124d;

    /* renamed from: e */
    public final BadgeRelativeLayout f27125e;

    /* renamed from: f */
    public final AppCompatImageView f27126f;

    /* renamed from: g */
    public final FrameLayout f27127g;

    private C9938i6(View view, BadgeRelativeLayout badgeRelativeLayout, AppCompatImageView appCompatImageView, FrameLayout frameLayout) {
        this.f27124d = view;
        this.f27125e = badgeRelativeLayout;
        this.f27126f = appCompatImageView;
        this.f27127g = frameLayout;
    }

    /* renamed from: a */
    public static C9938i6 m36451a(View view) {
        int i = C17782g.badgeLayout;
        BadgeRelativeLayout badgeRelativeLayout = (BadgeRelativeLayout) C6202b.m24689a(view, i);
        if (badgeRelativeLayout != null) {
            i = C17782g.thumbnail_chevron_image;
            AppCompatImageView appCompatImageView = (AppCompatImageView) C6202b.m24689a(view, i);
            if (appCompatImageView != null) {
                i = C17782g.thumbnails;
                FrameLayout frameLayout = (FrameLayout) C6202b.m24689a(view, i);
                if (frameLayout != null) {
                    return new C9938i6(view, badgeRelativeLayout, appCompatImageView, frameLayout);
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    /* renamed from: c */
    public static C9938i6 m36452c(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        if (viewGroup != null) {
            layoutInflater.inflate(C17783h.view_thumbnail_picker, viewGroup);
            return m36451a(viewGroup);
        }
        throw new NullPointerException("parent");
    }

    /* renamed from: b */
    public View mo3946b() {
        return this.f27124d;
    }
}
