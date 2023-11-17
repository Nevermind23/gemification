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

/* renamed from: ak.q5 */
public final class C10000q5 implements C6201a {

    /* renamed from: d */
    private final ConstraintLayout f27435d;

    /* renamed from: e */
    public final AppCompatTextView f27436e;

    /* renamed from: f */
    public final AppCompatTextView f27437f;

    private C10000q5(ConstraintLayout constraintLayout, AppCompatTextView appCompatTextView, AppCompatTextView appCompatTextView2) {
        this.f27435d = constraintLayout;
        this.f27436e = appCompatTextView;
        this.f27437f = appCompatTextView2;
    }

    /* renamed from: a */
    public static C10000q5 m36677a(View view) {
        int i = C17782g.text_with_caption_text;
        AppCompatTextView appCompatTextView = (AppCompatTextView) C6202b.m24689a(view, i);
        if (appCompatTextView != null) {
            i = C17782g.text_with_caption_value;
            AppCompatTextView appCompatTextView2 = (AppCompatTextView) C6202b.m24689a(view, i);
            if (appCompatTextView2 != null) {
                return new C10000q5((ConstraintLayout) view, appCompatTextView, appCompatTextView2);
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    /* renamed from: d */
    public static C10000q5 m36678d(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(C17783h.view_text_badge_with_caption_left, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return m36677a(inflate);
    }

    /* renamed from: c */
    public ConstraintLayout mo3946b() {
        return this.f27435d;
    }
}
