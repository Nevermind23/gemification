package c61;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ProgressBar;
import p086g1.C6201a;
import x51.C39793e;

/* renamed from: c61.c */
public final class C31278c implements C6201a {

    /* renamed from: d */
    private final ProgressBar f77667d;

    /* renamed from: e */
    public final ProgressBar f77668e;

    private C31278c(ProgressBar progressBar, ProgressBar progressBar2) {
        this.f77667d = progressBar;
        this.f77668e = progressBar2;
    }

    /* renamed from: a */
    public static C31278c m92902a(View view) {
        if (view != null) {
            ProgressBar progressBar = (ProgressBar) view;
            return new C31278c(progressBar, progressBar);
        }
        throw new NullPointerException("rootView");
    }

    /* renamed from: d */
    public static C31278c m92903d(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(C39793e.item_story_progress, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return m92902a(inflate);
    }

    /* renamed from: c */
    public ProgressBar mo3946b() {
        return this.f77667d;
    }
}
