package p352ak;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import p086g1.C6201a;
import p086g1.C6202b;
import p341ge.bog.designsystem.components.currencybadge.CurrencyBadgeView;
import p601sg.C17782g;
import p601sg.C17783h;

/* renamed from: ak.f4 */
public final class C9912f4 implements C6201a {

    /* renamed from: d */
    private final ConstraintLayout f26990d;

    /* renamed from: e */
    public final CurrencyBadgeView f26991e;

    /* renamed from: f */
    public final ConstraintLayout f26992f;

    /* renamed from: g */
    public final AppCompatImageView f26993g;

    /* renamed from: h */
    public final AppCompatImageView f26994h;

    /* renamed from: i */
    public final AppCompatTextView f26995i;

    /* renamed from: j */
    public final AppCompatTextView f26996j;

    private C9912f4(ConstraintLayout constraintLayout, CurrencyBadgeView currencyBadgeView, ConstraintLayout constraintLayout2, AppCompatImageView appCompatImageView, AppCompatImageView appCompatImageView2, AppCompatTextView appCompatTextView, AppCompatTextView appCompatTextView2) {
        this.f26990d = constraintLayout;
        this.f26991e = currencyBadgeView;
        this.f26992f = constraintLayout2;
        this.f26993g = appCompatImageView;
        this.f26994h = appCompatImageView2;
        this.f26995i = appCompatTextView;
        this.f26996j = appCompatTextView2;
    }

    /* renamed from: a */
    public static C9912f4 m36358a(View view) {
        int i = C17782g.f49747Z5;
        CurrencyBadgeView currencyBadgeView = (CurrencyBadgeView) C6202b.m24689a(view, i);
        if (currencyBadgeView != null) {
            ConstraintLayout constraintLayout = (ConstraintLayout) view;
            i = C17782g.normal_steps_end_icon;
            AppCompatImageView appCompatImageView = (AppCompatImageView) C6202b.m24689a(view, i);
            if (appCompatImageView != null) {
                i = C17782g.normal_steps_start_icon;
                AppCompatImageView appCompatImageView2 = (AppCompatImageView) C6202b.m24689a(view, i);
                if (appCompatImageView2 != null) {
                    i = C17782g.normal_steps_text;
                    AppCompatTextView appCompatTextView = (AppCompatTextView) C6202b.m24689a(view, i);
                    if (appCompatTextView != null) {
                        i = C17782g.normal_steps_title;
                        AppCompatTextView appCompatTextView2 = (AppCompatTextView) C6202b.m24689a(view, i);
                        if (appCompatTextView2 != null) {
                            return new C9912f4(constraintLayout, currencyBadgeView, constraintLayout, appCompatImageView, appCompatImageView2, appCompatTextView, appCompatTextView2);
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    /* renamed from: d */
    public static C9912f4 m36359d(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(C17783h.view_normal_steps, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return m36358a(inflate);
    }

    /* renamed from: c */
    public ConstraintLayout mo3946b() {
        return this.f26990d;
    }
}
