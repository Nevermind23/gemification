package p352ak;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ProgressBar;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.constraintlayout.widget.Barrier;
import p086g1.C6201a;
import p086g1.C6202b;
import p601sg.C17782g;
import p601sg.C17783h;

/* renamed from: ak.c5 */
public final class C9889c5 implements C6201a {

    /* renamed from: d */
    private final View f26862d;

    /* renamed from: e */
    public final Barrier f26863e;

    /* renamed from: f */
    public final ProgressBar f26864f;

    /* renamed from: g */
    public final AppCompatImageView f26865g;

    /* renamed from: h */
    public final AppCompatImageView f26866h;

    /* renamed from: i */
    public final AppCompatTextView f26867i;

    private C9889c5(View view, Barrier barrier, ProgressBar progressBar, AppCompatImageView appCompatImageView, AppCompatImageView appCompatImageView2, AppCompatTextView appCompatTextView) {
        this.f26862d = view;
        this.f26863e = barrier;
        this.f26864f = progressBar;
        this.f26865g = appCompatImageView;
        this.f26866h = appCompatImageView2;
        this.f26867i = appCompatTextView;
    }

    /* renamed from: a */
    public static C9889c5 m36271a(View view) {
        int i = C17782g.barrier_end;
        Barrier barrier = (Barrier) C6202b.m24689a(view, i);
        if (barrier != null) {
            i = C17782g.f49686G5;
            ProgressBar progressBar = (ProgressBar) C6202b.m24689a(view, i);
            if (progressBar != null) {
                i = C17782g.steps_icon_left;
                AppCompatImageView appCompatImageView = (AppCompatImageView) C6202b.m24689a(view, i);
                if (appCompatImageView != null) {
                    i = C17782g.steps_icon_right;
                    AppCompatImageView appCompatImageView2 = (AppCompatImageView) C6202b.m24689a(view, i);
                    if (appCompatImageView2 != null) {
                        i = C17782g.steps_title;
                        AppCompatTextView appCompatTextView = (AppCompatTextView) C6202b.m24689a(view, i);
                        if (appCompatTextView != null) {
                            return new C9889c5(view, barrier, progressBar, appCompatImageView, appCompatImageView2, appCompatTextView);
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    /* renamed from: c */
    public static C9889c5 m36272c(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        if (viewGroup != null) {
            layoutInflater.inflate(C17783h.view_small_steps, viewGroup);
            return m36271a(viewGroup);
        }
        throw new NullPointerException("parent");
    }

    /* renamed from: b */
    public View mo3946b() {
        return this.f26862d;
    }
}
