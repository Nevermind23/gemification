package p352ak;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import p086g1.C6201a;
import p086g1.C6202b;
import p341ge.bog.designsystem.components.badgecontainer.BadgeContainer;
import p601sg.C17782g;
import p601sg.C17783h;

/* renamed from: ak.n2 */
public final class C9974n2 implements C6201a {

    /* renamed from: d */
    private final ConstraintLayout f27305d;

    /* renamed from: e */
    public final AppCompatTextView f27306e;

    /* renamed from: f */
    public final BadgeContainer f27307f;

    /* renamed from: g */
    public final AppCompatTextView f27308g;

    private C9974n2(ConstraintLayout constraintLayout, AppCompatTextView appCompatTextView, BadgeContainer badgeContainer, AppCompatTextView appCompatTextView2) {
        this.f27305d = constraintLayout;
        this.f27306e = appCompatTextView;
        this.f27307f = badgeContainer;
        this.f27308g = appCompatTextView2;
    }

    /* renamed from: a */
    public static C9974n2 m36583a(View view) {
        int i = C17782g.f49676C;
        AppCompatTextView appCompatTextView = (AppCompatTextView) C6202b.m24689a(view, i);
        if (appCompatTextView != null) {
            i = C17782g.badgeContainer;
            BadgeContainer badgeContainer = (BadgeContainer) C6202b.m24689a(view, i);
            if (badgeContainer != null) {
                i = C17782g.f49745Y8;
                AppCompatTextView appCompatTextView2 = (AppCompatTextView) C6202b.m24689a(view, i);
                if (appCompatTextView2 != null) {
                    return new C9974n2((ConstraintLayout) view, appCompatTextView, badgeContainer, appCompatTextView2);
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    /* renamed from: d */
    public static C9974n2 m36584d(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(C17783h.view_clear_product_header, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return m36583a(inflate);
    }

    /* renamed from: c */
    public ConstraintLayout mo3946b() {
        return this.f27305d;
    }
}
