package p352ak;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import p086g1.C6201a;
import p086g1.C6202b;
import p601sg.C17782g;
import p601sg.C17783h;

/* renamed from: ak.l5 */
public final class C9961l5 implements C6201a {

    /* renamed from: d */
    private final ConstraintLayout f27247d;

    /* renamed from: e */
    public final ConstraintLayout f27248e;

    /* renamed from: f */
    public final AppCompatImageView f27249f;

    /* renamed from: g */
    public final AppCompatTextView f27250g;

    private C9961l5(ConstraintLayout constraintLayout, ConstraintLayout constraintLayout2, AppCompatImageView appCompatImageView, AppCompatTextView appCompatTextView) {
        this.f27247d = constraintLayout;
        this.f27248e = constraintLayout2;
        this.f27249f = appCompatImageView;
        this.f27250g = appCompatTextView;
    }

    /* renamed from: a */
    public static C9961l5 m36533a(View view) {
        ConstraintLayout constraintLayout = (ConstraintLayout) view;
        int i = C17782g.f49766j4;
        AppCompatImageView appCompatImageView = (AppCompatImageView) C6202b.m24689a(view, i);
        if (appCompatImageView != null) {
            i = C17782g.icon_text;
            AppCompatTextView appCompatTextView = (AppCompatTextView) C6202b.m24689a(view, i);
            if (appCompatTextView != null) {
                return new C9961l5(constraintLayout, constraintLayout, appCompatImageView, appCompatTextView);
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    /* renamed from: d */
    public static C9961l5 m36534d(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(C17783h.view_text_badge_icon, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return m36533a(inflate);
    }

    /* renamed from: c */
    public ConstraintLayout mo3946b() {
        return this.f27247d;
    }
}
