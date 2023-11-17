package p352ak;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.constraintlayout.widget.Barrier;
import androidx.constraintlayout.widget.ConstraintLayout;
import p086g1.C6201a;
import p086g1.C6202b;
import p601sg.C17782g;
import p601sg.C17783h;

/* renamed from: ak.k5 */
public final class C9953k5 implements C6201a {

    /* renamed from: d */
    private final ConstraintLayout f27210d;

    /* renamed from: e */
    public final ConstraintLayout f27211e;

    /* renamed from: f */
    public final Barrier f27212f;

    /* renamed from: g */
    public final AppCompatTextView f27213g;

    /* renamed from: h */
    public final AppCompatTextView f27214h;

    /* renamed from: i */
    public final AppCompatTextView f27215i;

    private C9953k5(ConstraintLayout constraintLayout, ConstraintLayout constraintLayout2, Barrier barrier, AppCompatTextView appCompatTextView, AppCompatTextView appCompatTextView2, AppCompatTextView appCompatTextView3) {
        this.f27210d = constraintLayout;
        this.f27211e = constraintLayout2;
        this.f27212f = barrier;
        this.f27213g = appCompatTextView;
        this.f27214h = appCompatTextView2;
        this.f27215i = appCompatTextView3;
    }

    /* renamed from: a */
    public static C9953k5 m36503a(View view) {
        ConstraintLayout constraintLayout = (ConstraintLayout) view;
        int i = C17782g.double_text_barrier;
        Barrier barrier = (Barrier) C6202b.m24689a(view, i);
        if (barrier != null) {
            i = C17782g.double_with_caption_second;
            AppCompatTextView appCompatTextView = (AppCompatTextView) C6202b.m24689a(view, i);
            if (appCompatTextView != null) {
                i = C17782g.double_with_caption_text;
                AppCompatTextView appCompatTextView2 = (AppCompatTextView) C6202b.m24689a(view, i);
                if (appCompatTextView2 != null) {
                    i = C17782g.double_with_caption_value;
                    AppCompatTextView appCompatTextView3 = (AppCompatTextView) C6202b.m24689a(view, i);
                    if (appCompatTextView3 != null) {
                        return new C9953k5(constraintLayout, constraintLayout, barrier, appCompatTextView, appCompatTextView2, appCompatTextView3);
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    /* renamed from: d */
    public static C9953k5 m36504d(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(C17783h.view_text_badge_double_with_caption, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return m36503a(inflate);
    }

    /* renamed from: c */
    public ConstraintLayout mo3946b() {
        return this.f27210d;
    }
}
