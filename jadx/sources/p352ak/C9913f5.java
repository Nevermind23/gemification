package p352ak;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ProgressBar;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import p086g1.C6201a;
import p086g1.C6202b;
import p601sg.C17782g;
import p601sg.C17783h;

/* renamed from: ak.f5 */
public final class C9913f5 implements C6201a {

    /* renamed from: d */
    private final View f26997d;

    /* renamed from: e */
    public final AppCompatImageView f26998e;

    /* renamed from: f */
    public final ConstraintLayout f26999f;

    /* renamed from: g */
    public final AppCompatTextView f27000g;

    /* renamed from: h */
    public final ProgressBar f27001h;

    private C9913f5(View view, AppCompatImageView appCompatImageView, ConstraintLayout constraintLayout, AppCompatTextView appCompatTextView, ProgressBar progressBar) {
        this.f26997d = view;
        this.f26998e = appCompatImageView;
        this.f26999f = constraintLayout;
        this.f27000g = appCompatTextView;
        this.f27001h = progressBar;
    }

    /* renamed from: a */
    public static C9913f5 m36362a(View view) {
        int i = C17782g.status_badge;
        AppCompatImageView appCompatImageView = (AppCompatImageView) C6202b.m24689a(view, i);
        if (appCompatImageView != null) {
            i = C17782g.status_badge_container;
            ConstraintLayout constraintLayout = (ConstraintLayout) C6202b.m24689a(view, i);
            if (constraintLayout != null) {
                i = C17782g.status_badge_number;
                AppCompatTextView appCompatTextView = (AppCompatTextView) C6202b.m24689a(view, i);
                if (appCompatTextView != null) {
                    i = C17782g.status_badge_progressbar;
                    ProgressBar progressBar = (ProgressBar) C6202b.m24689a(view, i);
                    if (progressBar != null) {
                        return new C9913f5(view, appCompatImageView, constraintLayout, appCompatTextView, progressBar);
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    /* renamed from: c */
    public static C9913f5 m36363c(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        if (viewGroup != null) {
            layoutInflater.inflate(C17783h.view_status_badge, viewGroup);
            return m36362a(viewGroup);
        }
        throw new NullPointerException("parent");
    }

    /* renamed from: b */
    public View mo3946b() {
        return this.f26997d;
    }
}
