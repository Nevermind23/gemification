package p493kk;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import p086g1.C6201a;
import p086g1.C6202b;
import p341ge.bog.designsystem.components.buttons.Button;
import p341ge.bog.designsystem.components.notificationbadges.NotificationBadgeView;
import p341ge.bog.designsystem.components.pagedescription.PageDescriptionView;
import p451hk.C15526d;
import p451hk.C15527e;

/* renamed from: kk.k */
public final class C16457k implements C6201a {

    /* renamed from: d */
    private final ConstraintLayout f46520d;

    /* renamed from: e */
    public final Button f46521e;

    /* renamed from: f */
    public final TextView f46522f;

    /* renamed from: g */
    public final NotificationBadgeView f46523g;

    /* renamed from: h */
    public final TextView f46524h;

    /* renamed from: i */
    public final NotificationBadgeView f46525i;

    /* renamed from: j */
    public final Button f46526j;

    /* renamed from: k */
    public final PageDescriptionView f46527k;

    private C16457k(ConstraintLayout constraintLayout, Button button, TextView textView, NotificationBadgeView notificationBadgeView, TextView textView2, NotificationBadgeView notificationBadgeView2, Button button2, PageDescriptionView pageDescriptionView) {
        this.f46520d = constraintLayout;
        this.f46521e = button;
        this.f46522f = textView;
        this.f46523g = notificationBadgeView;
        this.f46524h = textView2;
        this.f46525i = notificationBadgeView2;
        this.f46526j = button2;
        this.f46527k = pageDescriptionView;
    }

    /* renamed from: a */
    public static C16457k m58632a(View view) {
        int i = C15526d.f44068e0;
        Button button = (Button) C6202b.m24689a(view, i);
        if (button != null) {
            i = C15526d.f44087y0;
            TextView textView = (TextView) C6202b.m24689a(view, i);
            if (textView != null) {
                i = C15526d.f44088z0;
                NotificationBadgeView notificationBadgeView = (NotificationBadgeView) C6202b.m24689a(view, i);
                if (notificationBadgeView != null) {
                    i = C15526d.f44047A0;
                    TextView textView2 = (TextView) C6202b.m24689a(view, i);
                    if (textView2 != null) {
                        i = C15526d.f44050B0;
                        NotificationBadgeView notificationBadgeView2 = (NotificationBadgeView) C6202b.m24689a(view, i);
                        if (notificationBadgeView2 != null) {
                            i = C15526d.f44064Z0;
                            Button button2 = (Button) C6202b.m24689a(view, i);
                            if (button2 != null) {
                                i = C15526d.f44078n1;
                                PageDescriptionView pageDescriptionView = (PageDescriptionView) C6202b.m24689a(view, i);
                                if (pageDescriptionView != null) {
                                    return new C16457k((ConstraintLayout) view, button, textView, notificationBadgeView, textView2, notificationBadgeView2, button2, pageDescriptionView);
                                }
                            }
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    /* renamed from: d */
    public static C16457k m58633d(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(C15527e.fragment_insurance_info, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return m58632a(inflate);
    }

    /* renamed from: c */
    public ConstraintLayout mo3946b() {
        return this.f46520d;
    }
}
