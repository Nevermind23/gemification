package sk0;

import android.view.View;
import android.widget.FrameLayout;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import ok0.C27029e;
import p086g1.C6201a;
import p086g1.C6202b;

/* renamed from: sk0.j */
public final class C28247j implements C6201a {

    /* renamed from: d */
    private final ConstraintLayout f71677d;

    /* renamed from: e */
    public final ConstraintLayout f71678e;

    /* renamed from: f */
    public final AppCompatImageView f71679f;

    /* renamed from: g */
    public final AppCompatImageView f71680g;

    /* renamed from: h */
    public final FrameLayout f71681h;

    /* renamed from: i */
    public final AppCompatTextView f71682i;

    private C28247j(ConstraintLayout constraintLayout, ConstraintLayout constraintLayout2, AppCompatImageView appCompatImageView, AppCompatImageView appCompatImageView2, FrameLayout frameLayout, AppCompatTextView appCompatTextView) {
        this.f71677d = constraintLayout;
        this.f71678e = constraintLayout2;
        this.f71679f = appCompatImageView;
        this.f71680g = appCompatImageView2;
        this.f71681h = frameLayout;
        this.f71682i = appCompatTextView;
    }

    /* renamed from: a */
    public static C28247j m86809a(View view) {
        ConstraintLayout constraintLayout = (ConstraintLayout) view;
        int i = C27029e.settings_arrow;
        AppCompatImageView appCompatImageView = (AppCompatImageView) C6202b.m24689a(view, i);
        if (appCompatImageView != null) {
            i = C27029e.settings_icon;
            AppCompatImageView appCompatImageView2 = (AppCompatImageView) C6202b.m24689a(view, i);
            if (appCompatImageView2 != null) {
                i = C27029e.settings_icon_layout;
                FrameLayout frameLayout = (FrameLayout) C6202b.m24689a(view, i);
                if (frameLayout != null) {
                    i = C27029e.settings_title;
                    AppCompatTextView appCompatTextView = (AppCompatTextView) C6202b.m24689a(view, i);
                    if (appCompatTextView != null) {
                        return new C28247j(constraintLayout, constraintLayout, appCompatImageView, appCompatImageView2, frameLayout, appCompatTextView);
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    /* renamed from: c */
    public ConstraintLayout mo3946b() {
        return this.f71677d;
    }
}
