package p352ak;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.constraintlayout.widget.Barrier;
import androidx.constraintlayout.widget.ConstraintLayout;
import p086g1.C6201a;
import p086g1.C6202b;
import p341ge.bog.designsystem.components.notificationbadges.NotificationBadgeView;
import p601sg.C17782g;
import p601sg.C17783h;

/* renamed from: ak.f3 */
public final class C9911f3 implements C6201a {

    /* renamed from: d */
    private final View f26981d;

    /* renamed from: e */
    public final Barrier f26982e;

    /* renamed from: f */
    public final AppCompatTextView f26983f;

    /* renamed from: g */
    public final FrameLayout f26984g;

    /* renamed from: h */
    public final LinearLayout f26985h;

    /* renamed from: i */
    public final ConstraintLayout f26986i;

    /* renamed from: j */
    public final NotificationBadgeView f26987j;

    /* renamed from: k */
    public final LinearLayout f26988k;

    /* renamed from: l */
    public final AppCompatTextView f26989l;

    private C9911f3(View view, Barrier barrier, AppCompatTextView appCompatTextView, FrameLayout frameLayout, LinearLayout linearLayout, ConstraintLayout constraintLayout, NotificationBadgeView notificationBadgeView, LinearLayout linearLayout2, AppCompatTextView appCompatTextView2) {
        this.f26981d = view;
        this.f26982e = barrier;
        this.f26983f = appCompatTextView;
        this.f26984g = frameLayout;
        this.f26985h = linearLayout;
        this.f26986i = constraintLayout;
        this.f26987j = notificationBadgeView;
        this.f26988k = linearLayout2;
        this.f26989l = appCompatTextView2;
    }

    /* renamed from: a */
    public static C9911f3 m36355a(View view) {
        int i = C17782g.f49760g0;
        Barrier barrier = (Barrier) C6202b.m24689a(view, i);
        if (barrier != null) {
            i = C17782g.f49682E2;
            AppCompatTextView appCompatTextView = (AppCompatTextView) C6202b.m24689a(view, i);
            if (appCompatTextView != null) {
                i = C17782g.left_view_container;
                FrameLayout frameLayout = (FrameLayout) C6202b.m24689a(view, i);
                if (frameLayout != null) {
                    i = C17782g.f49705L5;
                    LinearLayout linearLayout = (LinearLayout) C6202b.m24689a(view, i);
                    if (linearLayout != null) {
                        i = C17782g.middle_view_container;
                        ConstraintLayout constraintLayout = (ConstraintLayout) C6202b.m24689a(view, i);
                        if (constraintLayout != null) {
                            i = C17782g.f49763h6;
                            NotificationBadgeView notificationBadgeView = (NotificationBadgeView) C6202b.m24689a(view, i);
                            if (notificationBadgeView != null) {
                                i = C17782g.right_view_container;
                                LinearLayout linearLayout2 = (LinearLayout) C6202b.m24689a(view, i);
                                if (linearLayout2 != null) {
                                    i = C17782g.f49751c9;
                                    AppCompatTextView appCompatTextView2 = (AppCompatTextView) C6202b.m24689a(view, i);
                                    if (appCompatTextView2 != null) {
                                        return new C9911f3(view, barrier, appCompatTextView, frameLayout, linearLayout, constraintLayout, notificationBadgeView, linearLayout2, appCompatTextView2);
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    /* renamed from: c */
    public static C9911f3 m36356c(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        if (viewGroup != null) {
            layoutInflater.inflate(C17783h.view_empty_widget, viewGroup);
            return m36355a(viewGroup);
        }
        throw new NullPointerException("parent");
    }

    /* renamed from: b */
    public View mo3946b() {
        return this.f26981d;
    }
}
