package p352ak;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import p086g1.C6201a;
import p086g1.C6202b;
import p341ge.bog.designsystem.components.notificationbadges.NotificationBadgeView;
import p601sg.C17782g;
import p601sg.C17783h;

/* renamed from: ak.p0 */
public final class C9988p0 implements C6201a {

    /* renamed from: d */
    private final ConstraintLayout f27380d;

    /* renamed from: e */
    public final AppCompatTextView f27381e;

    /* renamed from: f */
    public final LinearLayout f27382f;

    /* renamed from: g */
    public final NotificationBadgeView f27383g;

    /* renamed from: h */
    public final TextView f27384h;

    private C9988p0(ConstraintLayout constraintLayout, AppCompatTextView appCompatTextView, LinearLayout linearLayout, NotificationBadgeView notificationBadgeView, TextView textView) {
        this.f27380d = constraintLayout;
        this.f27381e = appCompatTextView;
        this.f27382f = linearLayout;
        this.f27383g = notificationBadgeView;
        this.f27384h = textView;
    }

    /* renamed from: a */
    public static C9988p0 m36632a(View view) {
        int i = C17782g.f49676C;
        AppCompatTextView appCompatTextView = (AppCompatTextView) C6202b.m24689a(view, i);
        if (appCompatTextView != null) {
            i = C17782g.amount_badges_layout;
            LinearLayout linearLayout = (LinearLayout) C6202b.m24689a(view, i);
            if (linearLayout != null) {
                i = C17782g.f49742X;
                NotificationBadgeView notificationBadgeView = (NotificationBadgeView) C6202b.m24689a(view, i);
                if (notificationBadgeView != null) {
                    i = C17782g.f49745Y8;
                    TextView textView = (TextView) C6202b.m24689a(view, i);
                    if (textView != null) {
                        return new C9988p0((ConstraintLayout) view, appCompatTextView, linearLayout, notificationBadgeView, textView);
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    /* renamed from: d */
    public static C9988p0 m36633d(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(C17783h.view_account_card_clear, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return m36632a(inflate);
    }

    /* renamed from: c */
    public ConstraintLayout mo3946b() {
        return this.f27380d;
    }
}
