package androidx.core.widget;

import android.content.Context;
import android.view.animation.Interpolator;
import android.widget.OverScroller;

/* renamed from: androidx.core.widget.n */
public final class C1313n {

    /* renamed from: a */
    OverScroller f3872a;

    C1313n(Context context, Interpolator interpolator) {
        OverScroller overScroller;
        if (interpolator != null) {
            overScroller = new OverScroller(context, interpolator);
        } else {
            overScroller = new OverScroller(context);
        }
        this.f3872a = overScroller;
    }

    /* renamed from: c */
    public static C1313n m4550c(Context context, Interpolator interpolator) {
        return new C1313n(context, interpolator);
    }

    /* renamed from: a */
    public void mo3867a() {
        this.f3872a.abortAnimation();
    }

    /* renamed from: b */
    public boolean mo3868b() {
        return this.f3872a.computeScrollOffset();
    }

    /* renamed from: d */
    public int mo3869d() {
        return this.f3872a.getCurrX();
    }

    /* renamed from: e */
    public int mo3870e() {
        return this.f3872a.getCurrY();
    }

    /* renamed from: f */
    public int mo3871f() {
        return this.f3872a.getFinalX();
    }

    /* renamed from: g */
    public int mo3872g() {
        return this.f3872a.getFinalY();
    }

    /* renamed from: h */
    public boolean mo3873h() {
        return this.f3872a.isFinished();
    }

    /* renamed from: i */
    public void mo3874i(int i, int i2, int i3, int i4, int i5) {
        this.f3872a.startScroll(i, i2, i3, i4, i5);
    }
}
