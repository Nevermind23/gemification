package p352ak;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ProgressBar;
import androidx.appcompat.widget.AppCompatTextView;
import p086g1.C6201a;
import p086g1.C6202b;
import p601sg.C17782g;
import p601sg.C17783h;

/* renamed from: ak.p1 */
public final class C9989p1 implements C6201a {

    /* renamed from: d */
    private final FrameLayout f27385d;

    /* renamed from: e */
    public final ProgressBar f27386e;

    /* renamed from: f */
    public final AppCompatTextView f27387f;

    private C9989p1(FrameLayout frameLayout, ProgressBar progressBar, AppCompatTextView appCompatTextView) {
        this.f27385d = frameLayout;
        this.f27386e = progressBar;
        this.f27387f = appCompatTextView;
    }

    /* renamed from: a */
    public static C9989p1 m36636a(View view) {
        int i = C17782g.f49686G5;
        ProgressBar progressBar = (ProgressBar) C6202b.m24689a(view, i);
        if (progressBar != null) {
            i = C17782g.f49681D8;
            AppCompatTextView appCompatTextView = (AppCompatTextView) C6202b.m24689a(view, i);
            if (appCompatTextView != null) {
                return new C9989p1((FrameLayout) view, progressBar, appCompatTextView);
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    /* renamed from: d */
    public static C9989p1 m36637d(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(C17783h.view_button_primary, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return m36636a(inflate);
    }

    /* renamed from: c */
    public FrameLayout mo3946b() {
        return this.f27385d;
    }
}
