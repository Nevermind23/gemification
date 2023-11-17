package sk0;

import android.view.View;
import android.widget.FrameLayout;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import ok0.C27029e;
import p086g1.C6201a;
import p086g1.C6202b;

/* renamed from: sk0.i */
public final class C28246i implements C6201a {

    /* renamed from: d */
    private final ConstraintLayout f71672d;

    /* renamed from: e */
    public final ConstraintLayout f71673e;

    /* renamed from: f */
    public final AppCompatImageView f71674f;

    /* renamed from: g */
    public final FrameLayout f71675g;

    /* renamed from: h */
    public final AppCompatTextView f71676h;

    private C28246i(ConstraintLayout constraintLayout, ConstraintLayout constraintLayout2, AppCompatImageView appCompatImageView, FrameLayout frameLayout, AppCompatTextView appCompatTextView) {
        this.f71672d = constraintLayout;
        this.f71673e = constraintLayout2;
        this.f71674f = appCompatImageView;
        this.f71675g = frameLayout;
        this.f71676h = appCompatTextView;
    }

    /* renamed from: a */
    public static C28246i m86806a(View view) {
        ConstraintLayout constraintLayout = (ConstraintLayout) view;
        int i = C27029e.logout_icon;
        AppCompatImageView appCompatImageView = (AppCompatImageView) C6202b.m24689a(view, i);
        if (appCompatImageView != null) {
            i = C27029e.logout_icon_layout;
            FrameLayout frameLayout = (FrameLayout) C6202b.m24689a(view, i);
            if (frameLayout != null) {
                i = C27029e.logout_title;
                AppCompatTextView appCompatTextView = (AppCompatTextView) C6202b.m24689a(view, i);
                if (appCompatTextView != null) {
                    return new C28246i(constraintLayout, constraintLayout, appCompatImageView, frameLayout, appCompatTextView);
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    /* renamed from: c */
    public ConstraintLayout mo3946b() {
        return this.f71672d;
    }
}
