package p352ak;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import p086g1.C6201a;
import p086g1.C6202b;
import p341ge.bog.designsystem.components.buttons.Button;
import p341ge.bog.designsystem.components.notificationbadges.BadgeRelativeLayout;
import p601sg.C17782g;
import p601sg.C17783h;

/* renamed from: ak.m6 */
public final class C9970m6 implements C6201a {

    /* renamed from: d */
    private final BadgeRelativeLayout f27279d;

    /* renamed from: e */
    public final Button f27280e;

    private C9970m6(BadgeRelativeLayout badgeRelativeLayout, Button button) {
        this.f27279d = badgeRelativeLayout;
        this.f27280e = button;
    }

    /* renamed from: a */
    public static C9970m6 m36568a(View view) {
        int i = C17782g.f49759g;
        Button button = (Button) C6202b.m24689a(view, i);
        if (button != null) {
            return new C9970m6((BadgeRelativeLayout) view, button);
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    /* renamed from: d */
    public static C9970m6 m36569d(LayoutInflater layoutInflater) {
        return m36570e(layoutInflater, (ViewGroup) null, false);
    }

    /* renamed from: e */
    public static C9970m6 m36570e(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(C17783h.view_toolbar_action_button, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return m36568a(inflate);
    }

    /* renamed from: c */
    public BadgeRelativeLayout mo3946b() {
        return this.f27279d;
    }
}
