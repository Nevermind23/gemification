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

/* renamed from: ak.f1 */
public final class C9909f1 implements C6201a {

    /* renamed from: d */
    private final ConstraintLayout f26973d;

    /* renamed from: e */
    public final AppCompatTextView f26974e;

    /* renamed from: f */
    public final AppCompatTextView f26975f;

    /* renamed from: g */
    public final AppCompatImageView f26976g;

    private C9909f1(ConstraintLayout constraintLayout, AppCompatTextView appCompatTextView, AppCompatTextView appCompatTextView2, AppCompatImageView appCompatImageView) {
        this.f26973d = constraintLayout;
        this.f26974e = appCompatTextView;
        this.f26975f = appCompatTextView2;
        this.f26976g = appCompatImageView;
    }

    /* renamed from: a */
    public static C9909f1 m36347a(View view) {
        int i = C17782g.f49703L;
        AppCompatTextView appCompatTextView = (AppCompatTextView) C6202b.m24689a(view, i);
        if (appCompatTextView != null) {
            i = C17782g.f49709N0;
            AppCompatTextView appCompatTextView2 = (AppCompatTextView) C6202b.m24689a(view, i);
            if (appCompatTextView2 != null) {
                i = C17782g.logo;
                AppCompatImageView appCompatImageView = (AppCompatImageView) C6202b.m24689a(view, i);
                if (appCompatImageView != null) {
                    return new C9909f1((ConstraintLayout) view, appCompatTextView, appCompatTextView2, appCompatImageView);
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    /* renamed from: d */
    public static C9909f1 m36348d(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(C17783h.view_button_close_action_thumbnail, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return m36347a(inflate);
    }

    /* renamed from: c */
    public ConstraintLayout mo3946b() {
        return this.f26973d;
    }
}
