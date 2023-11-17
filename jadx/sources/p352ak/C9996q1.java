package p352ak;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ProgressBar;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.appcompat.widget.AppCompatTextView;
import p086g1.C6201a;
import p086g1.C6202b;
import p601sg.C17782g;
import p601sg.C17783h;

/* renamed from: ak.q1 */
public final class C9996q1 implements C6201a {

    /* renamed from: d */
    private final FrameLayout f27419d;

    /* renamed from: e */
    public final AppCompatImageView f27420e;

    /* renamed from: f */
    public final ProgressBar f27421f;

    /* renamed from: g */
    public final AppCompatTextView f27422g;

    private C9996q1(FrameLayout frameLayout, AppCompatImageView appCompatImageView, ProgressBar progressBar, AppCompatTextView appCompatTextView) {
        this.f27419d = frameLayout;
        this.f27420e = appCompatImageView;
        this.f27421f = progressBar;
        this.f27422g = appCompatTextView;
    }

    /* renamed from: a */
    public static C9996q1 m36662a(View view) {
        int i = C17782g.iconView;
        AppCompatImageView appCompatImageView = (AppCompatImageView) C6202b.m24689a(view, i);
        if (appCompatImageView != null) {
            i = C17782g.f49686G5;
            ProgressBar progressBar = (ProgressBar) C6202b.m24689a(view, i);
            if (progressBar != null) {
                i = C17782g.f49681D8;
                AppCompatTextView appCompatTextView = (AppCompatTextView) C6202b.m24689a(view, i);
                if (appCompatTextView != null) {
                    return new C9996q1((FrameLayout) view, appCompatImageView, progressBar, appCompatTextView);
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    /* renamed from: d */
    public static C9996q1 m36663d(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(C17783h.view_button_secondary, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return m36662a(inflate);
    }

    /* renamed from: c */
    public FrameLayout mo3946b() {
        return this.f27419d;
    }
}
