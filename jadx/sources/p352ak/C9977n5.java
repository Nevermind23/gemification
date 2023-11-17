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

/* renamed from: ak.n5 */
public final class C9977n5 implements C6201a {

    /* renamed from: d */
    private final ConstraintLayout f27319d;

    /* renamed from: e */
    public final AppCompatTextView f27320e;

    private C9977n5(ConstraintLayout constraintLayout, AppCompatTextView appCompatTextView) {
        this.f27319d = constraintLayout;
        this.f27320e = appCompatTextView;
    }

    /* renamed from: a */
    public static C9977n5 m36593a(View view) {
        int i = C17782g.text_badge_text;
        AppCompatTextView appCompatTextView = (AppCompatTextView) C6202b.m24689a(view, i);
        if (appCompatTextView != null) {
            return new C9977n5((ConstraintLayout) view, appCompatTextView);
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    /* renamed from: d */
    public static C9977n5 m36594d(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(C17783h.view_text_badge_single_line_medium, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return m36593a(inflate);
    }

    /* renamed from: c */
    public ConstraintLayout mo3946b() {
        return this.f27319d;
    }
}
