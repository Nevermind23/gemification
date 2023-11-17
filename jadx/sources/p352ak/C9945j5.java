package p352ak;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import p086g1.C6201a;
import p086g1.C6202b;
import p601sg.C17782g;
import p601sg.C17783h;

/* renamed from: ak.j5 */
public final class C9945j5 implements C6201a {

    /* renamed from: d */
    private final ConstraintLayout f27168d;

    /* renamed from: e */
    public final ConstraintLayout f27169e;

    /* renamed from: f */
    public final AppCompatTextView f27170f;

    /* renamed from: g */
    public final AppCompatTextView f27171g;

    private C9945j5(ConstraintLayout constraintLayout, ConstraintLayout constraintLayout2, AppCompatTextView appCompatTextView, AppCompatTextView appCompatTextView2) {
        this.f27168d = constraintLayout;
        this.f27169e = constraintLayout2;
        this.f27170f = appCompatTextView;
        this.f27171g = appCompatTextView2;
    }

    /* renamed from: a */
    public static C9945j5 m36475a(View view) {
        ConstraintLayout constraintLayout = (ConstraintLayout) view;
        int i = C17782g.double_text_badge_text;
        AppCompatTextView appCompatTextView = (AppCompatTextView) C6202b.m24689a(view, i);
        if (appCompatTextView != null) {
            i = C17782g.double_text_second;
            AppCompatTextView appCompatTextView2 = (AppCompatTextView) C6202b.m24689a(view, i);
            if (appCompatTextView2 != null) {
                return new C9945j5(constraintLayout, constraintLayout, appCompatTextView, appCompatTextView2);
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    /* renamed from: d */
    public static C9945j5 m36476d(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(C17783h.view_text_badge_double_text, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return m36475a(inflate);
    }

    /* renamed from: c */
    public ConstraintLayout mo3946b() {
        return this.f27168d;
    }
}
