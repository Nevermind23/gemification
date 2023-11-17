package p352ak;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.ProgressBar;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.appcompat.widget.AppCompatTextView;
import p086g1.C6201a;
import p086g1.C6202b;
import p601sg.C17782g;
import p601sg.C17783h;

/* renamed from: ak.n4 */
public final class C9976n4 implements C6201a {

    /* renamed from: d */
    private final View f27314d;

    /* renamed from: e */
    public final LinearLayout f27315e;

    /* renamed from: f */
    public final ProgressBar f27316f;

    /* renamed from: g */
    public final AppCompatImageView f27317g;

    /* renamed from: h */
    public final AppCompatTextView f27318h;

    private C9976n4(View view, LinearLayout linearLayout, ProgressBar progressBar, AppCompatImageView appCompatImageView, AppCompatTextView appCompatTextView) {
        this.f27314d = view;
        this.f27315e = linearLayout;
        this.f27316f = progressBar;
        this.f27317g = appCompatImageView;
        this.f27318h = appCompatTextView;
    }

    /* renamed from: a */
    public static C9976n4 m36590a(View view) {
        int i = C17782g.passcode_progress;
        LinearLayout linearLayout = (LinearLayout) C6202b.m24689a(view, i);
        if (linearLayout != null) {
            i = C17782g.f49740W6;
            ProgressBar progressBar = (ProgressBar) C6202b.m24689a(view, i);
            if (progressBar != null) {
                i = C17782g.success;
                AppCompatImageView appCompatImageView = (AppCompatImageView) C6202b.m24689a(view, i);
                if (appCompatImageView != null) {
                    i = C17782g.f49751c9;
                    AppCompatTextView appCompatTextView = (AppCompatTextView) C6202b.m24689a(view, i);
                    if (appCompatTextView != null) {
                        return new C9976n4(view, linearLayout, progressBar, appCompatImageView, appCompatTextView);
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    /* renamed from: c */
    public static C9976n4 m36591c(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        if (viewGroup != null) {
            layoutInflater.inflate(C17783h.view_passcode, viewGroup);
            return m36590a(viewGroup);
        }
        throw new NullPointerException("parent");
    }

    /* renamed from: b */
    public View mo3946b() {
        return this.f27314d;
    }
}
