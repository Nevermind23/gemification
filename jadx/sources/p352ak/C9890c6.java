package p352ak;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import p086g1.C6201a;
import p086g1.C6202b;
import p341ge.bog.designsystem.components.progressbar.ProgressBarView;
import p601sg.C17782g;
import p601sg.C17783h;

/* renamed from: ak.c6 */
public final class C9890c6 implements C6201a {

    /* renamed from: d */
    private final ConstraintLayout f26868d;

    /* renamed from: e */
    public final AppCompatTextView f26869e;

    /* renamed from: f */
    public final AppCompatTextView f26870f;

    /* renamed from: g */
    public final ProgressBarView f26871g;

    /* renamed from: h */
    public final AppCompatTextView f26872h;

    /* renamed from: i */
    public final AppCompatTextView f26873i;

    /* renamed from: j */
    public final AppCompatTextView f26874j;

    private C9890c6(ConstraintLayout constraintLayout, AppCompatTextView appCompatTextView, AppCompatTextView appCompatTextView2, ProgressBarView progressBarView, AppCompatTextView appCompatTextView3, AppCompatTextView appCompatTextView4, AppCompatTextView appCompatTextView5) {
        this.f26868d = constraintLayout;
        this.f26869e = appCompatTextView;
        this.f26870f = appCompatTextView2;
        this.f26871g = progressBarView;
        this.f26872h = appCompatTextView3;
        this.f26873i = appCompatTextView4;
        this.f26874j = appCompatTextView5;
    }

    /* renamed from: a */
    public static C9890c6 m36274a(View view) {
        int i = C17782g.current_progress_text;
        AppCompatTextView appCompatTextView = (AppCompatTextView) C6202b.m24689a(view, i);
        if (appCompatTextView != null) {
            i = C17782g.left_bottom_text;
            AppCompatTextView appCompatTextView2 = (AppCompatTextView) C6202b.m24689a(view, i);
            if (appCompatTextView2 != null) {
                i = C17782g.f49722R6;
                ProgressBarView progressBarView = (ProgressBarView) C6202b.m24689a(view, i);
                if (progressBarView != null) {
                    i = C17782g.progress_limit_text;
                    AppCompatTextView appCompatTextView3 = (AppCompatTextView) C6202b.m24689a(view, i);
                    if (appCompatTextView3 != null) {
                        i = C17782g.progress_text;
                        AppCompatTextView appCompatTextView4 = (AppCompatTextView) C6202b.m24689a(view, i);
                        if (appCompatTextView4 != null) {
                            i = C17782g.right_bottom_text;
                            AppCompatTextView appCompatTextView5 = (AppCompatTextView) C6202b.m24689a(view, i);
                            if (appCompatTextView5 != null) {
                                return new C9890c6((ConstraintLayout) view, appCompatTextView, appCompatTextView2, progressBarView, appCompatTextView3, appCompatTextView4, appCompatTextView5);
                            }
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    /* renamed from: d */
    public static C9890c6 m36275d(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(C17783h.view_text_progressbar, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return m36274a(inflate);
    }

    /* renamed from: c */
    public ConstraintLayout mo3946b() {
        return this.f26868d;
    }
}
