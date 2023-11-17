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

/* renamed from: ak.p5 */
public final class C9993p5 implements C6201a {

    /* renamed from: d */
    private final ConstraintLayout f27404d;

    /* renamed from: e */
    public final ConstraintLayout f27405e;

    /* renamed from: f */
    public final AppCompatTextView f27406f;

    /* renamed from: g */
    public final AppCompatTextView f27407g;

    private C9993p5(ConstraintLayout constraintLayout, ConstraintLayout constraintLayout2, AppCompatTextView appCompatTextView, AppCompatTextView appCompatTextView2) {
        this.f27404d = constraintLayout;
        this.f27405e = constraintLayout2;
        this.f27406f = appCompatTextView;
        this.f27407g = appCompatTextView2;
    }

    /* renamed from: a */
    public static C9993p5 m36651a(View view) {
        ConstraintLayout constraintLayout = (ConstraintLayout) view;
        int i = C17782g.text_with_caption_text;
        AppCompatTextView appCompatTextView = (AppCompatTextView) C6202b.m24689a(view, i);
        if (appCompatTextView != null) {
            i = C17782g.text_with_caption_value;
            AppCompatTextView appCompatTextView2 = (AppCompatTextView) C6202b.m24689a(view, i);
            if (appCompatTextView2 != null) {
                return new C9993p5(constraintLayout, constraintLayout, appCompatTextView, appCompatTextView2);
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    /* renamed from: d */
    public static C9993p5 m36652d(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(C17783h.view_text_badge_with_caption, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return m36651a(inflate);
    }

    /* renamed from: c */
    public ConstraintLayout mo3946b() {
        return this.f27404d;
    }
}
