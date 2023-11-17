package pu0;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ProgressBar;
import ku0.C36993c;
import ku0.C36994d;
import p086g1.C6201a;
import p086g1.C6202b;

/* renamed from: pu0.a */
public final class C38020a implements C6201a {

    /* renamed from: d */
    private final FrameLayout f91358d;

    /* renamed from: e */
    public final ProgressBar f91359e;

    private C38020a(FrameLayout frameLayout, ProgressBar progressBar) {
        this.f91358d = frameLayout;
        this.f91359e = progressBar;
    }

    /* renamed from: a */
    public static C38020a m111789a(View view) {
        int i = C36993c.f89143a;
        ProgressBar progressBar = (ProgressBar) C6202b.m24689a(view, i);
        if (progressBar != null) {
            return new C38020a((FrameLayout) view, progressBar);
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    /* renamed from: d */
    public static C38020a m111790d(LayoutInflater layoutInflater) {
        return m111791e(layoutInflater, (ViewGroup) null, false);
    }

    /* renamed from: e */
    public static C38020a m111791e(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(C36994d.activity_nbo_navigator, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return m111789a(inflate);
    }

    /* renamed from: c */
    public FrameLayout mo3946b() {
        return this.f91358d;
    }
}
