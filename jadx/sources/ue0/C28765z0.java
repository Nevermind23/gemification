package ue0;

import android.view.View;
import android.widget.FrameLayout;
import androidx.appcompat.widget.AppCompatTextView;
import ie0.C25187g;
import p086g1.C6201a;
import p086g1.C6202b;

/* renamed from: ue0.z0 */
public final class C28765z0 implements C6201a {

    /* renamed from: d */
    private final FrameLayout f73551d;

    /* renamed from: e */
    public final AppCompatTextView f73552e;

    /* renamed from: f */
    public final AppCompatTextView f73553f;

    private C28765z0(FrameLayout frameLayout, AppCompatTextView appCompatTextView, AppCompatTextView appCompatTextView2) {
        this.f73551d = frameLayout;
        this.f73552e = appCompatTextView;
        this.f73553f = appCompatTextView2;
    }

    /* renamed from: a */
    public static C28765z0 m88195a(View view) {
        int i = C25187g.dateView;
        AppCompatTextView appCompatTextView = (AppCompatTextView) C6202b.m24689a(view, i);
        if (appCompatTextView != null) {
            i = C25187g.priceView;
            AppCompatTextView appCompatTextView2 = (AppCompatTextView) C6202b.m24689a(view, i);
            if (appCompatTextView2 != null) {
                return new C28765z0((FrameLayout) view, appCompatTextView, appCompatTextView2);
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    /* renamed from: c */
    public FrameLayout mo3946b() {
        return this.f73551d;
    }
}
